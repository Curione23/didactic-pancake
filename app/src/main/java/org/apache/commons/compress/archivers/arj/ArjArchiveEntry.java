package org.apache.commons.compress.archivers.arj;

/* JADX INFO: loaded from: classes2.dex */
public class ArjArchiveEntry implements org.apache.commons.compress.archivers.ArchiveEntry {
    private final org.apache.commons.compress.archivers.arj.LocalFileHeader localFileHeader;

    public static class HostOs {
        public static final int AMIGA = 3;
        public static final int APPLE_GS = 6;
        public static final int ATARI_ST = 7;
        public static final int DOS = 0;
        public static final int MAC_OS = 4;
        public static final int NEXT = 8;
        public static final int OS_2 = 5;
        public static final int PRIMOS = 1;
        public static final int UNIX = 2;
        public static final int VAX_VMS = 9;
        public static final int WIN32 = 11;
        public static final int WIN95 = 10;

        public HostOs() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ArjArchiveEntry() {
            r1 = this;
            r1.<init>()
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = new org.apache.commons.compress.archivers.arj.LocalFileHeader
            r0.<init>()
            r1.localFileHeader = r0
            return
    }

    ArjArchiveEntry(org.apache.commons.compress.archivers.arj.LocalFileHeader r1) {
            r0 = this;
            r0.<init>()
            r0.localFileHeader = r1
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
            org.apache.commons.compress.archivers.arj.ArjArchiveEntry r3 = (org.apache.commons.compress.archivers.arj.ArjArchiveEntry) r3
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r2.localFileHeader
            org.apache.commons.compress.archivers.arj.LocalFileHeader r3 = r3.localFileHeader
            boolean r3 = r0.equals(r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public int getHostOs() {
            r1 = this;
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r1.localFileHeader
            int r0 = r0.hostOS
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public java.util.Date getLastModifiedDate() {
            r4 = this;
            boolean r0 = r4.isHostOsUnix()
            if (r0 == 0) goto Lf
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r4.localFileHeader
            int r0 = r0.dateTimeModified
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            goto L1e
        Lf:
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r4.localFileHeader
            int r0 = r0.dateTimeModified
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime(r0)
        L1e:
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            return r2
    }

    int getMethod() {
            r1 = this;
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r1.localFileHeader
            int r0 = r0.method
            return r0
    }

    public int getMode() {
            r1 = this;
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r1.localFileHeader
            int r0 = r0.fileAccessMode
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public java.lang.String getName() {
            r3 = this;
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r3.localFileHeader
            int r0 = r0.arjFlags
            r0 = r0 & 16
            if (r0 == 0) goto L15
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r3.localFileHeader
            java.lang.String r0 = r0.name
            java.lang.String r1 = "/"
            java.lang.String r2 = java.io.File.separator
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
        L15:
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r3.localFileHeader
            java.lang.String r0 = r0.name
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public long getSize() {
            r2 = this;
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r2.localFileHeader
            long r0 = r0.originalSize
            return r0
    }

    public int getUnixMode() {
            r1 = this;
            boolean r0 = r1.isHostOsUnix()
            if (r0 == 0) goto Lb
            int r0 = r1.getMode()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            int r0 = r0.hashCode()
        Lc:
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public boolean isDirectory() {
            r2 = this;
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r2.localFileHeader
            int r0 = r0.fileType
            r1 = 3
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean isHostOsUnix() {
            r2 = this;
            int r0 = r2.getHostOs()
            r1 = 2
            if (r0 == r1) goto L12
            int r0 = r2.getHostOs()
            r1 = 8
            if (r0 != r1) goto L10
            goto L12
        L10:
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            return r0
    }
}
