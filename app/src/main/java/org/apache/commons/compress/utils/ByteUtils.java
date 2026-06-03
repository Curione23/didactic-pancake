package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class ByteUtils {
    public static final byte[] EMPTY_BYTE_ARRAY = null;

    public interface ByteConsumer {
        void accept(int r1) throws java.io.IOException;
    }

    public interface ByteSupplier {
        int getAsByte() throws java.io.IOException;
    }

    @java.lang.Deprecated
    public static class InputStreamByteSupplier implements org.apache.commons.compress.utils.ByteUtils.ByteSupplier {
        private final java.io.InputStream is;

        public InputStreamByteSupplier(java.io.InputStream r1) {
                r0 = this;
                r0.<init>()
                r0.is = r1
                return
        }

        @Override // org.apache.commons.compress.utils.ByteUtils.ByteSupplier
        public int getAsByte() throws java.io.IOException {
                r1 = this;
                java.io.InputStream r0 = r1.is
                int r0 = r0.read()
                return r0
        }
    }

    public static class OutputStreamByteConsumer implements org.apache.commons.compress.utils.ByteUtils.ByteConsumer {
        private final java.io.OutputStream os;

        public OutputStreamByteConsumer(java.io.OutputStream r1) {
                r0 = this;
                r0.<init>()
                r0.os = r1
                return
        }

        @Override // org.apache.commons.compress.utils.ByteUtils.ByteConsumer
        public void accept(int r2) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.os
                r0.write(r2)
                return
        }
    }

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            org.apache.commons.compress.utils.ByteUtils.EMPTY_BYTE_ARRAY = r0
            return
    }

    private ByteUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void checkReadLength(int r1) {
            r0 = 8
            if (r1 > r0) goto L5
            return
        L5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't read more than eight bytes into a long value"
            r1.<init>(r0)
            throw r1
    }

    public static long fromLittleEndian(java.io.DataInput r6, int r7) throws java.io.IOException {
            checkReadLength(r7)
            r0 = 0
            r2 = 0
        L6:
            if (r2 >= r7) goto L14
            int r3 = r6.readUnsignedByte()
            long r3 = (long) r3
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L6
        L14:
            return r0
    }

    @java.lang.Deprecated
    public static long fromLittleEndian(java.io.InputStream r7, int r8) throws java.io.IOException {
            checkReadLength(r8)
            r0 = 0
            r2 = 0
        L6:
            if (r2 >= r8) goto L22
            int r3 = r7.read()
            long r3 = (long) r3
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L1a
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L6
        L1a:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Premature end of data"
            r7.<init>(r8)
            throw r7
        L22:
            return r0
    }

    public static long fromLittleEndian(org.apache.commons.compress.utils.ByteUtils.ByteSupplier r7, int r8) throws java.io.IOException {
            checkReadLength(r8)
            r0 = 0
            r2 = 0
        L6:
            if (r2 >= r8) goto L22
            int r3 = r7.getAsByte()
            long r3 = (long) r3
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L1a
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L6
        L1a:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Premature end of data"
            r7.<init>(r8)
            throw r7
        L22:
            return r0
    }

    public static long fromLittleEndian(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            long r0 = fromLittleEndian(r2, r0, r1)
            return r0
    }

    public static long fromLittleEndian(byte[] r7, int r8, int r9) {
            checkReadLength(r9)
            r0 = 0
            r2 = 0
        L6:
            if (r2 >= r9) goto L17
            int r3 = r8 + r2
            r3 = r7[r3]
            long r3 = (long) r3
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L6
        L17:
            return r0
    }

    @java.lang.Deprecated
    public static void toLittleEndian(java.io.DataOutput r3, long r4, int r6) throws java.io.IOException {
            r0 = 0
        L1:
            if (r0 >= r6) goto L10
            r1 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r4
            int r1 = (int) r1
            r3.write(r1)
            r1 = 8
            long r4 = r4 >> r1
            int r0 = r0 + 1
            goto L1
        L10:
            return
    }

    public static void toLittleEndian(java.io.OutputStream r3, long r4, int r6) throws java.io.IOException {
            r0 = 0
        L1:
            if (r0 >= r6) goto L10
            r1 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r4
            int r1 = (int) r1
            r3.write(r1)
            r1 = 8
            long r4 = r4 >> r1
            int r0 = r0 + 1
            goto L1
        L10:
            return
    }

    public static void toLittleEndian(org.apache.commons.compress.utils.ByteUtils.ByteConsumer r3, long r4, int r6) throws java.io.IOException {
            r0 = 0
        L1:
            if (r0 >= r6) goto L10
            r1 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r4
            int r1 = (int) r1
            r3.accept(r1)
            r1 = 8
            long r4 = r4 >> r1
            int r0 = r0 + 1
            goto L1
        L10:
            return
    }

    public static void toLittleEndian(byte[] r4, long r5, int r7, int r8) {
            r0 = 0
        L1:
            if (r0 >= r8) goto L12
            int r1 = r7 + r0
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r5
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4[r1] = r2
            r1 = 8
            long r5 = r5 >> r1
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }
}
