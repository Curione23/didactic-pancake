package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public enum RandomAccessFileMode extends java.lang.Enum<org.apache.commons.io.RandomAccessFileMode> {
    private static final /* synthetic */ org.apache.commons.io.RandomAccessFileMode[] $VALUES = null;
    public static final org.apache.commons.io.RandomAccessFileMode READ_ONLY = null;
    public static final org.apache.commons.io.RandomAccessFileMode READ_WRITE = null;
    public static final org.apache.commons.io.RandomAccessFileMode READ_WRITE_SYNC_ALL = null;
    public static final org.apache.commons.io.RandomAccessFileMode READ_WRITE_SYNC_CONTENT = null;
    private final java.lang.String mode;

    private static /* synthetic */ org.apache.commons.io.RandomAccessFileMode[] $values() {
            org.apache.commons.io.RandomAccessFileMode r0 = org.apache.commons.io.RandomAccessFileMode.READ_ONLY
            org.apache.commons.io.RandomAccessFileMode r1 = org.apache.commons.io.RandomAccessFileMode.READ_WRITE
            org.apache.commons.io.RandomAccessFileMode r2 = org.apache.commons.io.RandomAccessFileMode.READ_WRITE_SYNC_ALL
            org.apache.commons.io.RandomAccessFileMode r3 = org.apache.commons.io.RandomAccessFileMode.READ_WRITE_SYNC_CONTENT
            org.apache.commons.io.RandomAccessFileMode[] r0 = new org.apache.commons.io.RandomAccessFileMode[]{r0, r1, r2, r3}
            return r0
    }

    static {
            org.apache.commons.io.RandomAccessFileMode r0 = new org.apache.commons.io.RandomAccessFileMode
            r1 = 0
            java.lang.String r2 = "r"
            java.lang.String r3 = "READ_ONLY"
            r0.<init>(r3, r1, r2)
            org.apache.commons.io.RandomAccessFileMode.READ_ONLY = r0
            org.apache.commons.io.RandomAccessFileMode r0 = new org.apache.commons.io.RandomAccessFileMode
            r1 = 1
            java.lang.String r2 = "rw"
            java.lang.String r3 = "READ_WRITE"
            r0.<init>(r3, r1, r2)
            org.apache.commons.io.RandomAccessFileMode.READ_WRITE = r0
            org.apache.commons.io.RandomAccessFileMode r0 = new org.apache.commons.io.RandomAccessFileMode
            r1 = 2
            java.lang.String r2 = "rws"
            java.lang.String r3 = "READ_WRITE_SYNC_ALL"
            r0.<init>(r3, r1, r2)
            org.apache.commons.io.RandomAccessFileMode.READ_WRITE_SYNC_ALL = r0
            org.apache.commons.io.RandomAccessFileMode r0 = new org.apache.commons.io.RandomAccessFileMode
            r1 = 3
            java.lang.String r2 = "rwd"
            java.lang.String r3 = "READ_WRITE_SYNC_CONTENT"
            r0.<init>(r3, r1, r2)
            org.apache.commons.io.RandomAccessFileMode.READ_WRITE_SYNC_CONTENT = r0
            org.apache.commons.io.RandomAccessFileMode[] r0 = $values()
            org.apache.commons.io.RandomAccessFileMode.$VALUES = r0
            return
    }

    RandomAccessFileMode(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mode = r3
            return
    }

    public static org.apache.commons.io.RandomAccessFileMode valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.io.RandomAccessFileMode> r0 = org.apache.commons.io.RandomAccessFileMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.io.RandomAccessFileMode r1 = (org.apache.commons.io.RandomAccessFileMode) r1
            return r1
    }

    public static org.apache.commons.io.RandomAccessFileMode[] values() {
            org.apache.commons.io.RandomAccessFileMode[] r0 = org.apache.commons.io.RandomAccessFileMode.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.io.RandomAccessFileMode[] r0 = (org.apache.commons.io.RandomAccessFileMode[]) r0
            return r0
    }

    public java.io.RandomAccessFile create(java.io.File r3) throws java.io.FileNotFoundException {
            r2 = this;
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = r2.mode
            r0.<init>(r3, r1)
            return r0
    }

    public java.io.RandomAccessFile create(java.lang.String r3) throws java.io.FileNotFoundException {
            r2 = this;
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = r2.mode
            r0.<init>(r3, r1)
            return r0
    }

    public java.io.RandomAccessFile create(java.nio.file.Path r2) throws java.io.FileNotFoundException {
            r1 = this;
            java.io.File r2 = r2.toFile()
            java.lang.String r0 = "file"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.io.File r2 = (java.io.File) r2
            java.io.RandomAccessFile r2 = r1.create(r2)
            return r2
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mode
            return r0
    }
}
