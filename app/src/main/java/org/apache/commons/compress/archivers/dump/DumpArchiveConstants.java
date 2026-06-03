package org.apache.commons.compress.archivers.dump;

/* JADX INFO: loaded from: classes2.dex */
public final class DumpArchiveConstants {
    public static final int CHECKSUM = 84446;
    public static final int FS_UFS2_MAGIC = 424935705;
    public static final int HIGH_DENSITY_NTREC = 32;
    public static final int LBLSIZE = 16;
    public static final int NAMELEN = 64;
    public static final int NFS_MAGIC = 60012;
    public static final int NTREC = 10;
    public static final int OFS_MAGIC = 60011;
    public static final int TP_SIZE = 1024;

    public enum COMPRESSION_TYPE extends java.lang.Enum<org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE> {
        private static final /* synthetic */ org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE[] $VALUES = null;
        public static final org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE BZLIB = null;
        public static final org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE LZO = null;
        public static final org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE UNKNOWN = null;
        public static final org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE ZLIB = null;
        final int code;

        private static /* synthetic */ org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE[] $values() {
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.UNKNOWN
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.ZLIB
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r2 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.BZLIB
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r3 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.LZO
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE[] r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE[]{r0, r1, r2, r3}
                return r0
        }

        static {
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE
                r1 = -1
                java.lang.String r2 = "UNKNOWN"
                r3 = 0
                r0.<init>(r2, r3, r1)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.UNKNOWN = r0
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE
                java.lang.String r1 = "ZLIB"
                r2 = 1
                r0.<init>(r1, r2, r3)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.ZLIB = r0
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE
                java.lang.String r1 = "BZLIB"
                r3 = 2
                r0.<init>(r1, r3, r2)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.BZLIB = r0
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE
                java.lang.String r1 = "LZO"
                r2 = 3
                r0.<init>(r1, r2, r3)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.LZO = r0
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE[] r0 = $values()
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.$VALUES = r0
                return
        }

        COMPRESSION_TYPE(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.code = r3
                return
        }

        public static org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE find(int r5) {
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.code
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r5 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.UNKNOWN
                return r5
        }

        public static org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE> r0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r1 = (org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE) r1
                return r1
        }

        public static org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE[] values() {
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE[] r0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE[] r0 = (org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE[]) r0
                return r0
        }
    }

    public enum SEGMENT_TYPE extends java.lang.Enum<org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE> {
        private static final /* synthetic */ org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE[] $VALUES = null;
        public static final org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE ADDR = null;
        public static final org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE BITS = null;
        public static final org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE CLRI = null;
        public static final org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE END = null;
        public static final org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE INODE = null;
        public static final org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE TAPE = null;
        final int code;

        private static /* synthetic */ org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE[] $values() {
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.INODE
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r2 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.BITS
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r3 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.ADDR
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r4 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.END
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r5 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.CLRI
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE[] r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE[]{r0, r1, r2, r3, r4, r5}
                return r0
        }

        static {
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE
                java.lang.String r1 = "TAPE"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE = r0
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE
                java.lang.String r1 = "INODE"
                r2 = 2
                r0.<init>(r1, r3, r2)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.INODE = r0
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE
                java.lang.String r1 = "BITS"
                r3 = 3
                r0.<init>(r1, r2, r3)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.BITS = r0
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE
                java.lang.String r1 = "ADDR"
                r2 = 4
                r0.<init>(r1, r3, r2)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.ADDR = r0
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE
                java.lang.String r1 = "END"
                r3 = 5
                r0.<init>(r1, r2, r3)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.END = r0
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r0 = new org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE
                java.lang.String r1 = "CLRI"
                r2 = 6
                r0.<init>(r1, r3, r2)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.CLRI = r0
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE[] r0 = $values()
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.$VALUES = r0
                return
        }

        SEGMENT_TYPE(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.code = r3
                return
        }

        public static org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE find(int r5) {
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.code
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                r5 = 0
                return r5
        }

        public static org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE> r0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r1 = (org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE) r1
                return r1
        }

        public static org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE[] values() {
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE[] r0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE[] r0 = (org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE[]) r0
                return r0
        }
    }

    private DumpArchiveConstants() {
            r0 = this;
            r0.<init>()
            return
    }
}
