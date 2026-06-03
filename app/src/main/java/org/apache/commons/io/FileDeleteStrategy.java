package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class FileDeleteStrategy {
    public static final org.apache.commons.io.FileDeleteStrategy FORCE = null;
    public static final org.apache.commons.io.FileDeleteStrategy NORMAL = null;
    private final java.lang.String name;

    static class ForceFileDeleteStrategy extends org.apache.commons.io.FileDeleteStrategy {
        ForceFileDeleteStrategy() {
                r1 = this;
                java.lang.String r0 = "Force"
                r1.<init>(r0)
                return
        }

        @Override // org.apache.commons.io.FileDeleteStrategy
        protected boolean doDelete(java.io.File r1) throws java.io.IOException {
                r0 = this;
                org.apache.commons.io.FileUtils.forceDelete(r1)
                r1 = 1
                return r1
        }
    }

    static {
            org.apache.commons.io.FileDeleteStrategy r0 = new org.apache.commons.io.FileDeleteStrategy
            java.lang.String r1 = "Normal"
            r0.<init>(r1)
            org.apache.commons.io.FileDeleteStrategy.NORMAL = r0
            org.apache.commons.io.FileDeleteStrategy$ForceFileDeleteStrategy r0 = new org.apache.commons.io.FileDeleteStrategy$ForceFileDeleteStrategy
            r0.<init>()
            org.apache.commons.io.FileDeleteStrategy.FORCE = r0
            return
    }

    protected FileDeleteStrategy(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            return
    }

    public void delete(java.io.File r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4.exists()
            if (r0 == 0) goto L22
            boolean r0 = r3.doDelete(r4)
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Deletion failed: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L22:
            return
    }

    public boolean deleteQuietly(java.io.File r2) {
            r1 = this;
            if (r2 == 0) goto L10
            boolean r0 = r2.exists()
            if (r0 != 0) goto L9
            goto L10
        L9:
            boolean r2 = r1.doDelete(r2)     // Catch: java.io.IOException -> Le
            return r2
        Le:
            r2 = 0
            return r2
        L10:
            r2 = 1
            return r2
    }

    protected boolean doDelete(java.io.File r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.io.FileUtils.delete(r1)
            r1 = 1
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FileDeleteStrategy["
            r0.<init>(r1)
            java.lang.String r1 = r2.name
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
