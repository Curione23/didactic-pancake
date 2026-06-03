package org.apache.commons.compress.compressors.xz;

/* JADX INFO: loaded from: classes2.dex */
public class XZUtils {
    private static final byte[] HEADER_MAGIC = null;
    private static volatile org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability cachedXZAvailability;
    private static final org.apache.commons.compress.compressors.FileNameUtil fileNameUtil = null;

    enum CachedAvailability extends java.lang.Enum<org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability> {
        private static final /* synthetic */ org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability[] $VALUES = null;
        public static final org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability CACHED_AVAILABLE = null;
        public static final org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability CACHED_UNAVAILABLE = null;
        public static final org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability DONT_CACHE = null;

        private static /* synthetic */ org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability[] $values() {
                org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r0 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.DONT_CACHE
                org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.CACHED_AVAILABLE
                org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r2 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.CACHED_UNAVAILABLE
                org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability[] r0 = new org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability[]{r0, r1, r2}
                return r0
        }

        static {
                org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r0 = new org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability
                java.lang.String r1 = "DONT_CACHE"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.DONT_CACHE = r0
                org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r0 = new org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability
                java.lang.String r1 = "CACHED_AVAILABLE"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.CACHED_AVAILABLE = r0
                org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r0 = new org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability
                java.lang.String r1 = "CACHED_UNAVAILABLE"
                r2 = 2
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.CACHED_UNAVAILABLE = r0
                org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability[] r0 = $values()
                org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.$VALUES = r0
                return
        }

        CachedAvailability(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability> r0 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r1 = (org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability) r1
                return r1
        }

        public static org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability[] values() {
                org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability[] r0 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability[] r0 = (org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability[]) r0
                return r0
        }
    }

    static {
            r0 = 6
            byte[] r0 = new byte[r0]
            r0 = {x0036: FILL_ARRAY_DATA , data: [-3, 55, 122, 88, 90, 0} // fill-array
            org.apache.commons.compress.compressors.xz.XZUtils.HEADER_MAGIC = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = ".txz"
            java.lang.String r2 = ".tar"
            r0.put(r1, r2)
            java.lang.String r1 = ".xz"
            java.lang.String r2 = ""
            r0.put(r1, r2)
            java.lang.String r3 = "-xz"
            r0.put(r3, r2)
            org.apache.commons.compress.compressors.FileNameUtil r2 = new org.apache.commons.compress.compressors.FileNameUtil
            r2.<init>(r0, r1)
            org.apache.commons.compress.compressors.xz.XZUtils.fileNameUtil = r2
            org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r0 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.DONT_CACHE
            org.apache.commons.compress.compressors.xz.XZUtils.cachedXZAvailability = r0
            boolean r0 = org.apache.commons.compress.utils.OsgiUtils.isRunningInOsgiEnvironment()
            r0 = r0 ^ 1
            setCacheXZAvailablity(r0)
            return
    }

    private XZUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability getCachedXZAvailability() {
            org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r0 = org.apache.commons.compress.compressors.xz.XZUtils.cachedXZAvailability
            return r0
    }

    public static java.lang.String getCompressedFileName(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.xz.XZUtils.fileNameUtil
            java.lang.String r1 = r0.getCompressedFileName(r1)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String getCompressedFilename(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.xz.XZUtils.fileNameUtil
            java.lang.String r1 = r0.getCompressedFileName(r1)
            return r1
    }

    public static java.lang.String getUncompressedFileName(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.xz.XZUtils.fileNameUtil
            java.lang.String r1 = r0.getUncompressedFileName(r1)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String getUncompressedFilename(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.xz.XZUtils.fileNameUtil
            java.lang.String r1 = r0.getUncompressedFileName(r1)
            return r1
    }

    private static boolean internalIsXZCompressionAvailable() {
            r0 = 0
            r1 = 0
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(r0, r1)     // Catch: java.lang.NoClassDefFoundError -> L7
            r0 = 1
            return r0
        L7:
            return r1
    }

    public static boolean isCompressedFileName(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.xz.XZUtils.fileNameUtil
            boolean r1 = r0.isCompressedFileName(r1)
            return r1
    }

    @java.lang.Deprecated
    public static boolean isCompressedFilename(java.lang.String r1) {
            org.apache.commons.compress.compressors.FileNameUtil r0 = org.apache.commons.compress.compressors.xz.XZUtils.fileNameUtil
            boolean r1 = r0.isCompressedFileName(r1)
            return r1
    }

    public static boolean isXZCompressionAvailable() {
            org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r0 = org.apache.commons.compress.compressors.xz.XZUtils.cachedXZAvailability
            org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.DONT_CACHE
            if (r0 == r1) goto Le
            org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.CACHED_AVAILABLE
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
        Le:
            boolean r0 = internalIsXZCompressionAvailable()
            return r0
    }

    public static boolean matches(byte[] r3, int r4) {
            byte[] r0 = org.apache.commons.compress.compressors.xz.XZUtils.HEADER_MAGIC
            int r0 = r0.length
            r1 = 0
            if (r4 >= r0) goto L7
            return r1
        L7:
            r4 = r1
        L8:
            byte[] r0 = org.apache.commons.compress.compressors.xz.XZUtils.HEADER_MAGIC
            int r2 = r0.length
            if (r4 >= r2) goto L17
            r2 = r3[r4]
            r0 = r0[r4]
            if (r2 == r0) goto L14
            return r1
        L14:
            int r4 = r4 + 1
            goto L8
        L17:
            r3 = 1
            return r3
    }

    public static void setCacheXZAvailablity(boolean r1) {
            if (r1 != 0) goto L7
            org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.DONT_CACHE
            org.apache.commons.compress.compressors.xz.XZUtils.cachedXZAvailability = r1
            goto L1a
        L7:
            org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.xz.XZUtils.cachedXZAvailability
            org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r0 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.DONT_CACHE
            if (r1 != r0) goto L1a
            boolean r1 = internalIsXZCompressionAvailable()
            if (r1 == 0) goto L16
            org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.CACHED_AVAILABLE
            goto L18
        L16:
            org.apache.commons.compress.compressors.xz.XZUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.xz.XZUtils.CachedAvailability.CACHED_UNAVAILABLE
        L18:
            org.apache.commons.compress.compressors.xz.XZUtils.cachedXZAvailability = r1
        L1a:
            return
    }
}
