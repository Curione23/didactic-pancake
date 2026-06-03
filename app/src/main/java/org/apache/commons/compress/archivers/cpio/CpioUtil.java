package org.apache.commons.compress.archivers.cpio;

/* JADX INFO: loaded from: classes2.dex */
final class CpioUtil {
    static final java.lang.String DEFAULT_CHARSET_NAME = null;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            java.lang.String r0 = r0.name()
            org.apache.commons.compress.archivers.cpio.CpioUtil.DEFAULT_CHARSET_NAME = r0
            return
    }

    CpioUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static long byteArray2long(byte[] r4, boolean r5) {
            int r0 = r4.length
            int r0 = r0 % 2
            if (r0 != 0) goto L34
            int r0 = r4.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r0)
            r0 = 0
            if (r5 != 0) goto L1e
            r5 = r0
        Le:
            int r1 = r4.length
            if (r5 >= r1) goto L1e
            r1 = r4[r5]
            int r2 = r5 + 1
            r3 = r4[r2]
            r4[r5] = r3
            r4[r2] = r1
            int r5 = r5 + 2
            goto Le
        L1e:
            r5 = r4[r0]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r0 = (long) r5
            r5 = 1
        L24:
            int r2 = r4.length
            if (r5 >= r2) goto L33
            r2 = 8
            long r0 = r0 << r2
            r2 = r4[r5]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            long r0 = r0 | r2
            int r5 = r5 + 1
            goto L24
        L33:
            return r0
        L34:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    static long fileType(long r2) {
            r0 = 61440(0xf000, double:3.03554E-319)
            long r2 = r2 & r0
            return r2
    }

    static byte[] long2byteArray(long r4, int r6, boolean r7) {
            byte[] r0 = new byte[r6]
            int r1 = r6 % 2
            if (r1 != 0) goto L2d
            r1 = 2
            if (r6 < r1) goto L2d
            int r1 = r6 + (-1)
        Lb:
            if (r1 < 0) goto L1a
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            r2 = 8
            long r4 = r4 >> r2
            int r1 = r1 + (-1)
            goto Lb
        L1a:
            if (r7 != 0) goto L2c
            r4 = 0
        L1d:
            if (r4 >= r6) goto L2c
            r5 = r0[r4]
            int r7 = r4 + 1
            r1 = r0[r7]
            r0[r4] = r1
            r0[r7] = r5
            int r4 = r4 + 2
            goto L1d
        L2c:
            return r0
        L2d:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }
}
