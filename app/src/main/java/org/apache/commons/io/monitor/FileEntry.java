package org.apache.commons.io.monitor;

/* JADX INFO: loaded from: classes2.dex */
public class FileEntry implements java.io.Serializable {
    static final org.apache.commons.io.monitor.FileEntry[] EMPTY_FILE_ENTRY_ARRAY = null;
    private static final long serialVersionUID = -2505664948818681153L;
    private org.apache.commons.io.monitor.FileEntry[] children;
    private boolean directory;
    private boolean exists;
    private final java.io.File file;
    private org.apache.commons.io.monitor.SerializableFileTime lastModified;
    private long length;
    private java.lang.String name;
    private final org.apache.commons.io.monitor.FileEntry parent;

    static {
            r0 = 0
            org.apache.commons.io.monitor.FileEntry[] r0 = new org.apache.commons.io.monitor.FileEntry[r0]
            org.apache.commons.io.monitor.FileEntry.EMPTY_FILE_ENTRY_ARRAY = r0
            return
    }

    public FileEntry(java.io.File r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public FileEntry(org.apache.commons.io.monitor.FileEntry r2, java.io.File r3) {
            r1 = this;
            r1.<init>()
            org.apache.commons.io.monitor.SerializableFileTime r0 = org.apache.commons.io.monitor.SerializableFileTime.EPOCH
            r1.lastModified = r0
            java.lang.String r0 = "file"
            java.lang.Object r0 = java.util.Objects.requireNonNull(r3, r0)
            java.io.File r0 = (java.io.File) r0
            r1.file = r0
            r1.parent = r2
            java.lang.String r2 = r3.getName()
            r1.name = r2
            return
    }

    public org.apache.commons.io.monitor.FileEntry[] getChildren() {
            r1 = this;
            org.apache.commons.io.monitor.FileEntry[] r0 = r1.children
            if (r0 == 0) goto L5
            goto L7
        L5:
            org.apache.commons.io.monitor.FileEntry[] r0 = org.apache.commons.io.monitor.FileEntry.EMPTY_FILE_ENTRY_ARRAY
        L7:
            return r0
    }

    public java.io.File getFile() {
            r1 = this;
            java.io.File r0 = r1.file
            return r0
    }

    public long getLastModified() {
            r2 = this;
            org.apache.commons.io.monitor.SerializableFileTime r0 = r2.lastModified
            long r0 = r0.toMillis()
            return r0
    }

    public java.nio.file.attribute.FileTime getLastModifiedFileTime() {
            r1 = this;
            org.apache.commons.io.monitor.SerializableFileTime r0 = r1.lastModified
            java.nio.file.attribute.FileTime r0 = r0.unwrap()
            return r0
    }

    public long getLength() {
            r2 = this;
            long r0 = r2.length
            return r0
    }

    public int getLevel() {
            r1 = this;
            org.apache.commons.io.monitor.FileEntry r0 = r1.parent
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r0 = r0.getLevel()
            int r0 = r0 + 1
        Lc:
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public org.apache.commons.io.monitor.FileEntry getParent() {
            r1 = this;
            org.apache.commons.io.monitor.FileEntry r0 = r1.parent
            return r0
    }

    public boolean isDirectory() {
            r1 = this;
            boolean r0 = r1.directory
            return r0
    }

    public boolean isExists() {
            r1 = this;
            boolean r0 = r1.exists
            return r0
    }

    public org.apache.commons.io.monitor.FileEntry newChildInstance(java.io.File r2) {
            r1 = this;
            org.apache.commons.io.monitor.FileEntry r0 = new org.apache.commons.io.monitor.FileEntry
            r0.<init>(r1, r2)
            return r0
    }

    public boolean refresh(java.io.File r11) {
            r10 = this;
            boolean r0 = r10.exists
            org.apache.commons.io.monitor.SerializableFileTime r1 = r10.lastModified
            boolean r2 = r10.directory
            long r3 = r10.length
            java.lang.String r5 = r11.getName()
            r10.name = r5
            java.nio.file.Path r5 = r11.toPath()
            r6 = 0
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r6]
            boolean r5 = java.nio.file.Files.exists(r5, r7)
            r10.exists = r5
            r7 = 1
            if (r5 == 0) goto L26
            boolean r5 = r11.isDirectory()
            if (r5 == 0) goto L26
            r5 = r7
            goto L27
        L26:
            r5 = r6
        L27:
            r10.directory = r5
            boolean r5 = r10.exists     // Catch: java.io.IOException -> L38
            if (r5 == 0) goto L32
            java.nio.file.attribute.FileTime r5 = org.apache.commons.io.FileUtils.lastModifiedFileTime(r11)     // Catch: java.io.IOException -> L38
            goto L34
        L32:
            java.nio.file.attribute.FileTime r5 = org.apache.commons.io.file.attribute.FileTimes.EPOCH     // Catch: java.io.IOException -> L38
        L34:
            r10.setLastModified(r5)     // Catch: java.io.IOException -> L38
            goto L3d
        L38:
            org.apache.commons.io.monitor.SerializableFileTime r5 = org.apache.commons.io.monitor.SerializableFileTime.EPOCH
            r10.setLastModified(r5)
        L3d:
            boolean r5 = r10.exists
            if (r5 == 0) goto L4a
            boolean r5 = r10.directory
            if (r5 != 0) goto L4a
            long r8 = r11.length()
            goto L4c
        L4a:
            r8 = 0
        L4c:
            r10.length = r8
            boolean r11 = r10.exists
            if (r11 != r0) goto L64
            org.apache.commons.io.monitor.SerializableFileTime r11 = r10.lastModified
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L64
            boolean r11 = r10.directory
            if (r11 != r2) goto L64
            long r0 = r10.length
            int r11 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r11 == 0) goto L65
        L64:
            r6 = r7
        L65:
            return r6
    }

    public void setChildren(org.apache.commons.io.monitor.FileEntry... r1) {
            r0 = this;
            r0.children = r1
            return
    }

    public void setDirectory(boolean r1) {
            r0 = this;
            r0.directory = r1
            return
    }

    public void setExists(boolean r1) {
            r0 = this;
            r0.exists = r1
            return
    }

    public void setLastModified(long r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = java.nio.file.attribute.FileTime.fromMillis(r1)
            r0.setLastModified(r1)
            return
    }

    public void setLastModified(java.nio.file.attribute.FileTime r2) {
            r1 = this;
            org.apache.commons.io.monitor.SerializableFileTime r0 = new org.apache.commons.io.monitor.SerializableFileTime
            r0.<init>(r2)
            r1.setLastModified(r0)
            return
    }

    void setLastModified(org.apache.commons.io.monitor.SerializableFileTime r1) {
            r0 = this;
            r0.lastModified = r1
            return
    }

    public void setLength(long r1) {
            r0 = this;
            r0.length = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }
}
