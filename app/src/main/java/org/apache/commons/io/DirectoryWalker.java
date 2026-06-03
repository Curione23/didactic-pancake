package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class DirectoryWalker<T> {
    private final int depthLimit;
    private final java.io.FileFilter filter;

    public static class CancelException extends java.io.IOException {
        private static final long serialVersionUID = 1347339620135041008L;
        private final int depth;
        private final java.io.File file;

        public CancelException(java.io.File r2, int r3) {
                r1 = this;
                java.lang.String r0 = "Operation Cancelled"
                r1.<init>(r0, r2, r3)
                return
        }

        public CancelException(java.lang.String r1, java.io.File r2, int r3) {
                r0 = this;
                r0.<init>(r1)
                r0.file = r2
                r0.depth = r3
                return
        }

        public int getDepth() {
                r1 = this;
                int r0 = r1.depth
                return r0
        }

        public java.io.File getFile() {
                r1 = this;
                java.io.File r0 = r1.file
                return r0
        }
    }

    protected DirectoryWalker() {
            r2 = this;
            r0 = 0
            r1 = -1
            r2.<init>(r0, r1)
            return
    }

    protected DirectoryWalker(java.io.FileFilter r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.filter = r1
            r0.depthLimit = r2
            return
    }

    protected DirectoryWalker(org.apache.commons.io.filefilter.IOFileFilter r1, org.apache.commons.io.filefilter.IOFileFilter r2, int r3) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            r1 = 0
            r0.filter = r1
            goto L23
        Lb:
            if (r1 == 0) goto Le
            goto L10
        Le:
            org.apache.commons.io.filefilter.IOFileFilter r1 = org.apache.commons.io.filefilter.TrueFileFilter.TRUE
        L10:
            if (r2 == 0) goto L13
            goto L15
        L13:
            org.apache.commons.io.filefilter.IOFileFilter r2 = org.apache.commons.io.filefilter.TrueFileFilter.TRUE
        L15:
            org.apache.commons.io.filefilter.IOFileFilter r1 = org.apache.commons.io.filefilter.FileFilterUtils.makeDirectoryOnly(r1)
            org.apache.commons.io.filefilter.IOFileFilter r2 = org.apache.commons.io.filefilter.FileFilterUtils.makeFileOnly(r2)
            org.apache.commons.io.filefilter.IOFileFilter r1 = r1.or(r2)
            r0.filter = r1
        L23:
            r0.depthLimit = r3
            return
    }

    private void walk(java.io.File r7, int r8, java.util.Collection<T> r9) throws java.io.IOException {
            r6 = this;
            r6.checkIfCancelled(r7, r8, r9)
            boolean r0 = r6.handleDirectory(r7, r8, r9)
            if (r0 == 0) goto L4d
            r6.handleDirectoryStart(r7, r8, r9)
            int r0 = r8 + 1
            int r1 = r6.depthLimit
            if (r1 < 0) goto L14
            if (r0 > r1) goto L4a
        L14:
            r6.checkIfCancelled(r7, r8, r9)
            java.io.FileFilter r1 = r6.filter
            if (r1 != 0) goto L20
            java.io.File[] r1 = r7.listFiles()
            goto L24
        L20:
            java.io.File[] r1 = r7.listFiles(r1)
        L24:
            java.io.File[] r1 = r6.filterDirectoryContents(r7, r8, r1)
            if (r1 != 0) goto L2e
            r6.handleRestricted(r7, r0, r9)
            goto L4a
        L2e:
            int r2 = r1.length
            r3 = 0
        L30:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L3e
            r6.walk(r4, r0, r9)
            goto L47
        L3e:
            r6.checkIfCancelled(r4, r0, r9)
            r6.handleFile(r4, r0, r9)
            r6.checkIfCancelled(r4, r0, r9)
        L47:
            int r3 = r3 + 1
            goto L30
        L4a:
            r6.handleDirectoryEnd(r7, r8, r9)
        L4d:
            r6.checkIfCancelled(r7, r8, r9)
            return
    }

    protected final void checkIfCancelled(java.io.File r1, int r2, java.util.Collection<T> r3) throws java.io.IOException {
            r0 = this;
            boolean r3 = r0.handleIsCancelled(r1, r2, r3)
            if (r3 != 0) goto L7
            return
        L7:
            org.apache.commons.io.DirectoryWalker$CancelException r3 = new org.apache.commons.io.DirectoryWalker$CancelException
            r3.<init>(r1, r2)
            throw r3
    }

    protected java.io.File[] filterDirectoryContents(java.io.File r1, int r2, java.io.File... r3) throws java.io.IOException {
            r0 = this;
            return r3
    }

    protected void handleCancelled(java.io.File r1, java.util.Collection<T> r2, org.apache.commons.io.DirectoryWalker.CancelException r3) throws java.io.IOException {
            r0 = this;
            throw r3
    }

    protected boolean handleDirectory(java.io.File r1, int r2, java.util.Collection<T> r3) throws java.io.IOException {
            r0 = this;
            r1 = 1
            return r1
    }

    protected void handleDirectoryEnd(java.io.File r1, int r2, java.util.Collection<T> r3) throws java.io.IOException {
            r0 = this;
            return
    }

    protected void handleDirectoryStart(java.io.File r1, int r2, java.util.Collection<T> r3) throws java.io.IOException {
            r0 = this;
            return
    }

    protected void handleEnd(java.util.Collection<T> r1) throws java.io.IOException {
            r0 = this;
            return
    }

    protected void handleFile(java.io.File r1, int r2, java.util.Collection<T> r3) throws java.io.IOException {
            r0 = this;
            return
    }

    protected boolean handleIsCancelled(java.io.File r1, int r2, java.util.Collection<T> r3) throws java.io.IOException {
            r0 = this;
            r1 = 0
            return r1
    }

    protected void handleRestricted(java.io.File r1, int r2, java.util.Collection<T> r3) throws java.io.IOException {
            r0 = this;
            return
    }

    protected void handleStart(java.io.File r1, java.util.Collection<T> r2) throws java.io.IOException {
            r0 = this;
            return
    }

    protected final void walk(java.io.File r2, java.util.Collection<T> r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "startDirectory"
            java.util.Objects.requireNonNull(r2, r0)
            r1.handleStart(r2, r3)     // Catch: org.apache.commons.io.DirectoryWalker.CancelException -> L10
            r0 = 0
            r1.walk(r2, r0, r3)     // Catch: org.apache.commons.io.DirectoryWalker.CancelException -> L10
            r1.handleEnd(r3)     // Catch: org.apache.commons.io.DirectoryWalker.CancelException -> L10
            goto L14
        L10:
            r0 = move-exception
            r1.handleCancelled(r2, r3, r0)
        L14:
            return
    }
}
