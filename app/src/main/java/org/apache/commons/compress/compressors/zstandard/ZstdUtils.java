package org.apache.commons.compress.compressors.zstandard;

/* JADX INFO: loaded from: classes2.dex */
public class ZstdUtils {
    private static final byte[] SKIPPABLE_FRAME_MAGIC = null;
    private static final byte[] ZSTANDARD_FRAME_MAGIC = null;
    private static volatile org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability cachedZstdAvailability;

    enum CachedAvailability extends java.lang.Enum<org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability> {
        private static final /* synthetic */ org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability[] $VALUES = null;
        public static final org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability CACHED_AVAILABLE = null;
        public static final org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability CACHED_UNAVAILABLE = null;
        public static final org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability DONT_CACHE = null;

        private static /* synthetic */ org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability[] $values() {
                org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r0 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.DONT_CACHE
                org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.CACHED_AVAILABLE
                org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r2 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.CACHED_UNAVAILABLE
                org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability[] r0 = new org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability[]{r0, r1, r2}
                return r0
        }

        static {
                org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r0 = new org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability
                java.lang.String r1 = "DONT_CACHE"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.DONT_CACHE = r0
                org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r0 = new org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability
                java.lang.String r1 = "CACHED_AVAILABLE"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.CACHED_AVAILABLE = r0
                org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r0 = new org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability
                java.lang.String r1 = "CACHED_UNAVAILABLE"
                r2 = 2
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.CACHED_UNAVAILABLE = r0
                org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability[] r0 = $values()
                org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.$VALUES = r0
                return
        }

        CachedAvailability(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability> r0 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r1 = (org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability) r1
                return r1
        }

        public static org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability[] values() {
                org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability[] r0 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability[] r0 = (org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability[]) r0
                return r0
        }
    }

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x001e: FILL_ARRAY_DATA , data: [40, -75, 47, -3} // fill-array
            org.apache.commons.compress.compressors.zstandard.ZstdUtils.ZSTANDARD_FRAME_MAGIC = r0
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [42, 77, 24} // fill-array
            org.apache.commons.compress.compressors.zstandard.ZstdUtils.SKIPPABLE_FRAME_MAGIC = r0
            org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r0 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.DONT_CACHE
            org.apache.commons.compress.compressors.zstandard.ZstdUtils.cachedZstdAvailability = r0
            boolean r0 = org.apache.commons.compress.utils.OsgiUtils.isRunningInOsgiEnvironment()
            r0 = r0 ^ 1
            setCacheZstdAvailablity(r0)
            return
    }

    private ZstdUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability getCachedZstdAvailability() {
            org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r0 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.cachedZstdAvailability
            return r0
    }

    private static boolean internalIsZstdCompressionAvailable() {
            java.lang.String r0 = "com.github.luben.zstd.ZstdInputStream"
            java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static boolean isZstdCompressionAvailable() {
            org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r0 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.cachedZstdAvailability
            org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.DONT_CACHE
            if (r0 == r1) goto Le
            org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.CACHED_AVAILABLE
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
        Le:
            boolean r0 = internalIsZstdCompressionAvailable()
            return r0
    }

    public static boolean matches(byte[] r5, int r6) {
            byte[] r0 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.ZSTANDARD_FRAME_MAGIC
            int r0 = r0.length
            r1 = 0
            if (r6 >= r0) goto L7
            return r1
        L7:
            r6 = r1
        L8:
            byte[] r0 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.ZSTANDARD_FRAME_MAGIC
            int r2 = r0.length
            r3 = 1
            if (r6 >= r2) goto L32
            r2 = r5[r6]
            r0 = r0[r6]
            if (r2 == r0) goto L2f
            r6 = r5[r1]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            r0 = 80
            if (r0 != r6) goto L2e
            r6 = r1
        L1d:
            byte[] r0 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.SKIPPABLE_FRAME_MAGIC
            int r2 = r0.length
            if (r6 >= r2) goto L2d
            int r2 = r6 + 1
            r4 = r5[r2]
            r6 = r0[r6]
            if (r4 == r6) goto L2b
            return r1
        L2b:
            r6 = r2
            goto L1d
        L2d:
            return r3
        L2e:
            return r1
        L2f:
            int r6 = r6 + 1
            goto L8
        L32:
            return r3
    }

    public static void setCacheZstdAvailablity(boolean r1) {
            if (r1 != 0) goto L7
            org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.DONT_CACHE
            org.apache.commons.compress.compressors.zstandard.ZstdUtils.cachedZstdAvailability = r1
            goto L1a
        L7:
            org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.cachedZstdAvailability
            org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r0 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.DONT_CACHE
            if (r1 != r0) goto L1a
            boolean r1 = internalIsZstdCompressionAvailable()
            if (r1 == 0) goto L16
            org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.CACHED_AVAILABLE
            goto L18
        L16:
            org.apache.commons.compress.compressors.zstandard.ZstdUtils$CachedAvailability r1 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.CachedAvailability.CACHED_UNAVAILABLE
        L18:
            org.apache.commons.compress.compressors.zstandard.ZstdUtils.cachedZstdAvailability = r1
        L1a:
            return
    }
}
