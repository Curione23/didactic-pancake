package org.apache.commons.compress.archivers.ar;

/* JADX INFO: loaded from: classes2.dex */
public class ArArchiveEntry implements org.apache.commons.compress.archivers.ArchiveEntry {
    private static final int DEFAULT_MODE = 33188;
    public static final java.lang.String HEADER = "!<arch>\n";
    public static final java.lang.String TRAILER = "`\n";
    private final int groupId;
    private final long lastModified;
    private final long length;
    private final int mode;
    private final java.lang.String name;
    private final int userId;

    public ArArchiveEntry(java.io.File r12, java.lang.String r13) {
            r11 = this;
            boolean r0 = r12.isFile()
            if (r0 == 0) goto Lb
            long r0 = r12.length()
            goto Ld
        Lb:
            r0 = 0
        Ld:
            r4 = r0
            long r0 = r12.lastModified()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r9 = r0 / r2
            r6 = 0
            r7 = 0
            r8 = 33188(0x81a4, float:4.6506E-41)
            r2 = r11
            r3 = r13
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return
    }

    public ArArchiveEntry(java.lang.String r14, long r15) {
            r13 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r11 = r0 / r2
            r8 = 0
            r9 = 0
            r10 = 33188(0x81a4, float:4.6506E-41)
            r4 = r13
            r5 = r14
            r6 = r15
            r4.<init>(r5, r6, r8, r9, r10, r11)
            return
    }

    public ArArchiveEntry(java.lang.String r3, long r4, int r6, int r7, int r8, long r9) {
            r2 = this;
            r2.<init>()
            r2.name = r3
            r0 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 < 0) goto L16
            r2.length = r4
            r2.userId = r6
            r2.groupId = r7
            r2.mode = r8
            r2.lastModified = r9
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "length must not be negative"
            r3.<init>(r4)
            throw r3
    }

    public ArArchiveEntry(java.nio.file.Path r12, java.lang.String r13, java.nio.file.LinkOption... r14) throws java.io.IOException {
            r11 = this;
            boolean r0 = java.nio.file.Files.isRegularFile(r12, r14)
            if (r0 == 0) goto Lb
            long r0 = java.nio.file.Files.size(r12)
            goto Ld
        Lb:
            r0 = 0
        Ld:
            r4 = r0
            java.nio.file.attribute.FileTime r12 = java.nio.file.Files.getLastModifiedTime(r12, r14)
            long r0 = r12.toMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r9 = r0 / r2
            r6 = 0
            r7 = 0
            r8 = 33188(0x81a4, float:4.6506E-41)
            r2 = r11
            r3 = r13
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L1c
        L11:
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r3 = (org.apache.commons.compress.archivers.ar.ArArchiveEntry) r3
            java.lang.String r0 = r2.name
            java.lang.String r3 = r3.name
            boolean r3 = java.util.Objects.equals(r0, r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public int getGroupId() {
            r1 = this;
            int r0 = r1.groupId
            return r0
    }

    public long getLastModified() {
            r2 = this;
            long r0 = r2.lastModified
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public java.util.Date getLastModifiedDate() {
            r5 = this;
            java.util.Date r0 = new java.util.Date
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r5.getLastModified()
            long r3 = r3 * r1
            r0.<init>(r3)
            return r0
    }

    public long getLength() {
            r2 = this;
            long r0 = r2.length
            return r0
    }

    public int getMode() {
            r1 = this;
            int r0 = r1.mode
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public long getSize() {
            r2 = this;
            long r0 = r2.getLength()
            return r0
    }

    public int getUserId() {
            r1 = this;
            int r0 = r1.userId
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.name
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public boolean isDirectory() {
            r1 = this;
            r0 = 0
            return r0
    }
}
