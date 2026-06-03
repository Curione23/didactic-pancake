package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
final class Ed25519 {
    private static final com.google.crypto.tink.subtle.Ed25519.CachedXYT CACHED_NEUTRAL = null;
    static final byte[] GROUP_ORDER = null;
    private static final com.google.crypto.tink.subtle.Ed25519.PartialXYZT NEUTRAL = null;
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;

    static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        CachedXYT() {
                r3 = this;
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = new long[r0]
                long[] r0 = new long[r0]
                r3.<init>(r1, r2, r0)
                return
        }

        CachedXYT(com.google.crypto.tink.subtle.Ed25519.CachedXYT r3) {
                r2 = this;
                r2.<init>()
                long[] r0 = r3.yPlusX
                r1 = 10
                long[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.yPlusX = r0
                long[] r0 = r3.yMinusX
                long[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.yMinusX = r0
                long[] r3 = r3.t2d
                long[] r3 = java.util.Arrays.copyOf(r3, r1)
                r2.t2d = r3
                return
        }

        CachedXYT(long[] r1, long[] r2, long[] r3) {
                r0 = this;
                r0.<init>()
                r0.yPlusX = r1
                r0.yMinusX = r2
                r0.t2d = r3
                return
        }

        void copyConditional(com.google.crypto.tink.subtle.Ed25519.CachedXYT r3, int r4) {
                r2 = this;
                long[] r0 = r2.yPlusX
                long[] r1 = r3.yPlusX
                com.google.crypto.tink.subtle.Curve25519.copyConditional(r0, r1, r4)
                long[] r0 = r2.yMinusX
                long[] r1 = r3.yMinusX
                com.google.crypto.tink.subtle.Curve25519.copyConditional(r0, r1, r4)
                long[] r0 = r2.t2d
                long[] r3 = r3.t2d
                com.google.crypto.tink.subtle.Curve25519.copyConditional(r0, r3, r4)
                return
        }

        void multByZ(long[] r3, long[] r4) {
                r2 = this;
                r0 = 0
                r1 = 10
                java.lang.System.arraycopy(r4, r0, r3, r0, r1)
                return
        }
    }

    private static class CachedXYZT extends com.google.crypto.tink.subtle.Ed25519.CachedXYT {
        private final long[] z;

        CachedXYZT() {
                r4 = this;
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = new long[r0]
                long[] r3 = new long[r0]
                long[] r0 = new long[r0]
                r4.<init>(r1, r2, r3, r0)
                return
        }

        CachedXYZT(com.google.crypto.tink.subtle.Ed25519.XYZT r5) {
                r4 = this;
                r4.<init>()
                long[] r0 = r4.yPlusX
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r5.xyz
                long[] r1 = r1.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
                long[] r2 = r2.x
                com.google.crypto.tink.subtle.Field25519.sum(r0, r1, r2)
                long[] r0 = r4.yMinusX
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r5.xyz
                long[] r1 = r1.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
                long[] r2 = r2.x
                com.google.crypto.tink.subtle.Field25519.sub(r0, r1, r2)
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = r5.xyz
                long[] r0 = r0.z
                long[] r1 = r4.z
                r2 = 10
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r1, r3, r2)
                long[] r0 = r4.t2d
                long[] r5 = r5.t
                long[] r1 = com.google.crypto.tink.subtle.Ed25519Constants.D2
                com.google.crypto.tink.subtle.Field25519.mult(r0, r5, r1)
                return
        }

        CachedXYZT(long[] r1, long[] r2, long[] r3, long[] r4) {
                r0 = this;
                r0.<init>(r1, r2, r4)
                r0.z = r3
                return
        }

        @Override // com.google.crypto.tink.subtle.Ed25519.CachedXYT
        public void multByZ(long[] r2, long[] r3) {
                r1 = this;
                long[] r0 = r1.z
                com.google.crypto.tink.subtle.Field25519.mult(r2, r3, r0)
                return
        }
    }

    private static class PartialXYZT {
        final long[] t;
        final com.google.crypto.tink.subtle.Ed25519.XYZ xyz;

        PartialXYZT() {
                r2 = this;
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = new com.google.crypto.tink.subtle.Ed25519$XYZ
                r0.<init>()
                r1 = 10
                long[] r1 = new long[r1]
                r2.<init>(r0, r1)
                return
        }

        PartialXYZT(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r3) {
                r2 = this;
                r2.<init>()
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = new com.google.crypto.tink.subtle.Ed25519$XYZ
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r3.xyz
                r0.<init>(r1)
                r2.xyz = r0
                long[] r3 = r3.t
                r0 = 10
                long[] r3 = java.util.Arrays.copyOf(r3, r0)
                r2.t = r3
                return
        }

        PartialXYZT(com.google.crypto.tink.subtle.Ed25519.XYZ r1, long[] r2) {
                r0 = this;
                r0.<init>()
                r0.xyz = r1
                r0.t = r2
                return
        }
    }

    private static class XYZ {
        final long[] x;
        final long[] y;
        final long[] z;

        XYZ() {
                r3 = this;
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = new long[r0]
                long[] r0 = new long[r0]
                r3.<init>(r1, r2, r0)
                return
        }

        XYZ(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r1) {
                r0 = this;
                r0.<init>()
                fromPartialXYZT(r0, r1)
                return
        }

        XYZ(com.google.crypto.tink.subtle.Ed25519.XYZ r3) {
                r2 = this;
                r2.<init>()
                long[] r0 = r3.x
                r1 = 10
                long[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.x = r0
                long[] r0 = r3.y
                long[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.y = r0
                long[] r3 = r3.z
                long[] r3 = java.util.Arrays.copyOf(r3, r1)
                r2.z = r3
                return
        }

        XYZ(long[] r1, long[] r2, long[] r3) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r0.y = r2
                r0.z = r3
                return
        }

        static com.google.crypto.tink.subtle.Ed25519.XYZ fromPartialXYZT(com.google.crypto.tink.subtle.Ed25519.XYZ r3, com.google.crypto.tink.subtle.Ed25519.PartialXYZT r4) {
                long[] r0 = r3.x
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.x
                long[] r2 = r4.t
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                long[] r0 = r3.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
                long[] r2 = r2.z
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                long[] r0 = r3.z
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.z
                long[] r4 = r4.t
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r4)
                return r3
        }

        boolean isOnCurve() {
                r6 = this;
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = r6.x
                com.google.crypto.tink.subtle.Field25519.square(r1, r2)
                long[] r2 = new long[r0]
                long[] r3 = r6.y
                com.google.crypto.tink.subtle.Field25519.square(r2, r3)
                long[] r3 = new long[r0]
                long[] r4 = r6.z
                com.google.crypto.tink.subtle.Field25519.square(r3, r4)
                long[] r4 = new long[r0]
                com.google.crypto.tink.subtle.Field25519.square(r4, r3)
                long[] r5 = new long[r0]
                com.google.crypto.tink.subtle.Field25519.sub(r5, r2, r1)
                com.google.crypto.tink.subtle.Field25519.mult(r5, r5, r3)
                long[] r0 = new long[r0]
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                long[] r1 = com.google.crypto.tink.subtle.Ed25519Constants.D
                com.google.crypto.tink.subtle.Field25519.mult(r0, r0, r1)
                com.google.crypto.tink.subtle.Field25519.sum(r0, r4)
                com.google.crypto.tink.subtle.Field25519.reduce(r0, r0)
                byte[] r1 = com.google.crypto.tink.subtle.Field25519.contract(r5)
                byte[] r0 = com.google.crypto.tink.subtle.Field25519.contract(r0)
                boolean r0 = com.google.crypto.tink.subtle.Bytes.equal(r1, r0)
                return r0
        }

        byte[] toBytes() {
                r4 = this;
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = new long[r0]
                long[] r0 = new long[r0]
                long[] r3 = r4.z
                com.google.crypto.tink.subtle.Field25519.inverse(r1, r3)
                long[] r3 = r4.x
                com.google.crypto.tink.subtle.Field25519.mult(r2, r3, r1)
                long[] r3 = r4.y
                com.google.crypto.tink.subtle.Field25519.mult(r0, r3, r1)
                byte[] r0 = com.google.crypto.tink.subtle.Field25519.contract(r0)
                r1 = 31
                r3 = r0[r1]
                int r2 = com.google.crypto.tink.subtle.Ed25519.access$000(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r3
                byte r2 = (byte) r2
                r0[r1] = r2
                return r0
        }
    }

    private static class XYZT {
        final long[] t;
        final com.google.crypto.tink.subtle.Ed25519.XYZ xyz;

        XYZT() {
                r2 = this;
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = new com.google.crypto.tink.subtle.Ed25519$XYZ
                r0.<init>()
                r1 = 10
                long[] r1 = new long[r1]
                r2.<init>(r0, r1)
                return
        }

        XYZT(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r1) {
                r0 = this;
                r0.<init>()
                fromPartialXYZT(r0, r1)
                return
        }

        XYZT(com.google.crypto.tink.subtle.Ed25519.XYZ r1, long[] r2) {
                r0 = this;
                r0.<init>()
                r0.xyz = r1
                r0.t = r2
                return
        }

        static /* synthetic */ com.google.crypto.tink.subtle.Ed25519.XYZT access$400(com.google.crypto.tink.subtle.Ed25519.XYZT r0, com.google.crypto.tink.subtle.Ed25519.PartialXYZT r1) {
                com.google.crypto.tink.subtle.Ed25519$XYZT r0 = fromPartialXYZT(r0, r1)
                return r0
        }

        static /* synthetic */ com.google.crypto.tink.subtle.Ed25519.XYZT access$500(byte[] r0) throws java.security.GeneralSecurityException {
                com.google.crypto.tink.subtle.Ed25519$XYZT r0 = fromBytesNegateVarTime(r0)
                return r0
        }

        private static com.google.crypto.tink.subtle.Ed25519.XYZT fromBytesNegateVarTime(byte[] r10) throws java.security.GeneralSecurityException {
                r0 = 10
                long[] r1 = new long[r0]
                long[] r2 = com.google.crypto.tink.subtle.Field25519.expand(r10)
                long[] r3 = new long[r0]
                r4 = 0
                r5 = 1
                r3[r4] = r5
                long[] r4 = new long[r0]
                long[] r5 = new long[r0]
                long[] r6 = new long[r0]
                long[] r7 = new long[r0]
                long[] r8 = new long[r0]
                com.google.crypto.tink.subtle.Field25519.square(r5, r2)
                long[] r9 = com.google.crypto.tink.subtle.Ed25519Constants.D
                com.google.crypto.tink.subtle.Field25519.mult(r6, r5, r9)
                com.google.crypto.tink.subtle.Field25519.sub(r5, r5, r3)
                com.google.crypto.tink.subtle.Field25519.sum(r6, r6, r3)
                long[] r0 = new long[r0]
                com.google.crypto.tink.subtle.Field25519.square(r0, r6)
                com.google.crypto.tink.subtle.Field25519.mult(r0, r0, r6)
                com.google.crypto.tink.subtle.Field25519.square(r1, r0)
                com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r6)
                com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r5)
                com.google.crypto.tink.subtle.Ed25519.access$100(r1, r1)
                com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r0)
                com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r5)
                com.google.crypto.tink.subtle.Field25519.square(r7, r1)
                com.google.crypto.tink.subtle.Field25519.mult(r7, r7, r6)
                com.google.crypto.tink.subtle.Field25519.sub(r8, r7, r5)
                boolean r0 = com.google.crypto.tink.subtle.Ed25519.access$200(r8)
                if (r0 == 0) goto L67
                com.google.crypto.tink.subtle.Field25519.sum(r8, r7, r5)
                boolean r0 = com.google.crypto.tink.subtle.Ed25519.access$200(r8)
                if (r0 != 0) goto L5f
                long[] r0 = com.google.crypto.tink.subtle.Ed25519Constants.SQRTM1
                com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r0)
                goto L67
            L5f:
                java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
                java.lang.String r0 = "Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19"
                r10.<init>(r0)
                throw r10
            L67:
                boolean r0 = com.google.crypto.tink.subtle.Ed25519.access$200(r1)
                r5 = 31
                if (r0 != 0) goto L80
                r0 = r10[r5]
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r0 = r0 >> 7
                if (r0 != 0) goto L78
                goto L80
            L78:
                java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
                java.lang.String r0 = "Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero"
                r10.<init>(r0)
                throw r10
            L80:
                int r0 = com.google.crypto.tink.subtle.Ed25519.access$000(r1)
                r10 = r10[r5]
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r10 = r10 >> 7
                if (r0 != r10) goto L8f
                com.google.crypto.tink.subtle.Ed25519.access$300(r1, r1)
            L8f:
                com.google.crypto.tink.subtle.Field25519.mult(r4, r1, r2)
                com.google.crypto.tink.subtle.Ed25519$XYZT r10 = new com.google.crypto.tink.subtle.Ed25519$XYZT
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = new com.google.crypto.tink.subtle.Ed25519$XYZ
                r0.<init>(r1, r2, r3)
                r10.<init>(r0, r4)
                return r10
        }

        private static com.google.crypto.tink.subtle.Ed25519.XYZT fromPartialXYZT(com.google.crypto.tink.subtle.Ed25519.XYZT r3, com.google.crypto.tink.subtle.Ed25519.PartialXYZT r4) {
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = r3.xyz
                long[] r0 = r0.x
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.x
                long[] r2 = r4.t
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = r3.xyz
                long[] r0 = r0.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.y
                com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
                long[] r2 = r2.z
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                com.google.crypto.tink.subtle.Ed25519$XYZ r0 = r3.xyz
                long[] r0 = r0.z
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.z
                long[] r2 = r4.t
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r2)
                long[] r0 = r3.t
                com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
                long[] r1 = r1.x
                com.google.crypto.tink.subtle.Ed25519$XYZ r4 = r4.xyz
                long[] r4 = r4.y
                com.google.crypto.tink.subtle.Field25519.mult(r0, r1, r4)
                return r3
        }
    }

    static {
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r0 = new com.google.crypto.tink.subtle.Ed25519$CachedXYT
            r1 = 10
            long[] r2 = new long[r1]
            r2 = {x0042: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            long[] r3 = new long[r1]
            r3 = {x006e: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            long[] r4 = new long[r1]
            r4 = {x009a: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r0.<init>(r2, r3, r4)
            com.google.crypto.tink.subtle.Ed25519.CACHED_NEUTRAL = r0
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r0 = new com.google.crypto.tink.subtle.Ed25519$PartialXYZT
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = new com.google.crypto.tink.subtle.Ed25519$XYZ
            long[] r3 = new long[r1]
            r3 = {x00c6: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            long[] r4 = new long[r1]
            r4 = {x00f2: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            long[] r5 = new long[r1]
            r5 = {x011e: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r2.<init>(r3, r4, r5)
            long[] r1 = new long[r1]
            r1 = {x014a: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r0.<init>(r2, r1)
            com.google.crypto.tink.subtle.Ed25519.NEUTRAL = r0
            r0 = 32
            byte[] r0 = new byte[r0]
            r0 = {x0176: FILL_ARRAY_DATA , data: [-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16} // fill-array
            com.google.crypto.tink.subtle.Ed25519.GROUP_ORDER = r0
            return
    }

    private Ed25519() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int access$000(long[] r0) {
            int r0 = getLsb(r0)
            return r0
    }

    static /* synthetic */ void access$100(long[] r0, long[] r1) {
            pow2252m3(r0, r1)
            return
    }

    static /* synthetic */ boolean access$200(long[] r0) {
            boolean r0 = isNonZeroVarTime(r0)
            return r0
    }

    static /* synthetic */ void access$300(long[] r0, long[] r1) {
            neg(r0, r1)
            return
    }

    private static void add(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r4, com.google.crypto.tink.subtle.Ed25519.XYZT r5, com.google.crypto.tink.subtle.Ed25519.CachedXYT r6) {
            r0 = 10
            long[] r0 = new long[r0]
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
            long[] r2 = r2.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r5.xyz
            long[] r3 = r3.x
            com.google.crypto.tink.subtle.Field25519.sum(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
            long[] r2 = r2.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r5.xyz
            long[] r3 = r3.x
            com.google.crypto.tink.subtle.Field25519.sub(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.y
            long[] r3 = r6.yMinusX
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.x
            long[] r3 = r6.yPlusX
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            long[] r1 = r4.t
            long[] r2 = r5.t
            long[] r3 = r6.t2d
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r5.xyz
            long[] r5 = r5.z
            r6.multByZ(r1, r5)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r6 = r4.xyz
            long[] r6 = r6.x
            com.google.crypto.tink.subtle.Field25519.sum(r0, r5, r6)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r6 = r4.xyz
            long[] r6 = r6.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Field25519.sub(r5, r6, r1)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r6 = r4.xyz
            long[] r6 = r6.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Field25519.sum(r5, r6, r1)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.z
            long[] r6 = r4.t
            com.google.crypto.tink.subtle.Field25519.sum(r5, r0, r6)
            long[] r5 = r4.t
            long[] r4 = r4.t
            com.google.crypto.tink.subtle.Field25519.sub(r5, r0, r4)
            return
    }

    private static com.google.crypto.tink.subtle.Ed25519.XYZ doubleScalarMultVarTime(byte[] r6, com.google.crypto.tink.subtle.Ed25519.XYZT r7, byte[] r8) {
            r0 = 8
            com.google.crypto.tink.subtle.Ed25519$CachedXYZT[] r1 = new com.google.crypto.tink.subtle.Ed25519.CachedXYZT[r0]
            com.google.crypto.tink.subtle.Ed25519$CachedXYZT r2 = new com.google.crypto.tink.subtle.Ed25519$CachedXYZT
            r2.<init>(r7)
            r3 = 0
            r1[r3] = r2
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r2 = new com.google.crypto.tink.subtle.Ed25519$PartialXYZT
            r2.<init>()
            doubleXYZT(r2, r7)
            com.google.crypto.tink.subtle.Ed25519$XYZT r7 = new com.google.crypto.tink.subtle.Ed25519$XYZT
            r7.<init>(r2)
            r3 = 1
        L1a:
            if (r3 >= r0) goto L32
            int r4 = r3 + (-1)
            r4 = r1[r4]
            add(r2, r7, r4)
            com.google.crypto.tink.subtle.Ed25519$CachedXYZT r4 = new com.google.crypto.tink.subtle.Ed25519$CachedXYZT
            com.google.crypto.tink.subtle.Ed25519$XYZT r5 = new com.google.crypto.tink.subtle.Ed25519$XYZT
            r5.<init>(r2)
            r4.<init>(r5)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L1a
        L32:
            byte[] r6 = slide(r6)
            byte[] r7 = slide(r8)
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r8 = new com.google.crypto.tink.subtle.Ed25519$PartialXYZT
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r0 = com.google.crypto.tink.subtle.Ed25519.NEUTRAL
            r8.<init>(r0)
            com.google.crypto.tink.subtle.Ed25519$XYZT r0 = new com.google.crypto.tink.subtle.Ed25519$XYZT
            r0.<init>()
            r2 = 255(0xff, float:3.57E-43)
        L48:
            if (r2 < 0) goto L56
            r3 = r6[r2]
            if (r3 != 0) goto L56
            r3 = r7[r2]
            if (r3 == 0) goto L53
            goto L56
        L53:
            int r2 = r2 + (-1)
            goto L48
        L56:
            if (r2 < 0) goto Lab
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = new com.google.crypto.tink.subtle.Ed25519$XYZ
            r3.<init>(r8)
            doubleXYZ(r8, r3)
            r3 = r6[r2]
            if (r3 <= 0) goto L72
            com.google.crypto.tink.subtle.Ed25519$XYZT r3 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r0, r8)
            r4 = r6[r2]
            int r4 = r4 / 2
            r4 = r1[r4]
            add(r8, r3, r4)
            goto L82
        L72:
            if (r3 >= 0) goto L82
            com.google.crypto.tink.subtle.Ed25519$XYZT r3 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r0, r8)
            r4 = r6[r2]
            int r4 = -r4
            int r4 = r4 / 2
            r4 = r1[r4]
            sub(r8, r3, r4)
        L82:
            r3 = r7[r2]
            if (r3 <= 0) goto L96
            com.google.crypto.tink.subtle.Ed25519$XYZT r3 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r0, r8)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[] r4 = com.google.crypto.tink.subtle.Ed25519Constants.B2
            r5 = r7[r2]
            int r5 = r5 / 2
            r4 = r4[r5]
            add(r8, r3, r4)
            goto La8
        L96:
            if (r3 >= 0) goto La8
            com.google.crypto.tink.subtle.Ed25519$XYZT r3 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r0, r8)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[] r4 = com.google.crypto.tink.subtle.Ed25519Constants.B2
            r5 = r7[r2]
            int r5 = -r5
            int r5 = r5 / 2
            r4 = r4[r5]
            sub(r8, r3, r4)
        La8:
            int r2 = r2 + (-1)
            goto L56
        Lab:
            com.google.crypto.tink.subtle.Ed25519$XYZ r6 = new com.google.crypto.tink.subtle.Ed25519$XYZ
            r6.<init>(r8)
            return r6
    }

    private static void doubleXYZ(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r4, com.google.crypto.tink.subtle.Ed25519.XYZ r5) {
            r0 = 10
            long[] r0 = new long[r0]
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            long[] r2 = r5.x
            com.google.crypto.tink.subtle.Field25519.square(r1, r2)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.z
            long[] r2 = r5.y
            com.google.crypto.tink.subtle.Field25519.square(r1, r2)
            long[] r1 = r4.t
            long[] r2 = r5.z
            com.google.crypto.tink.subtle.Field25519.square(r1, r2)
            long[] r1 = r4.t
            long[] r2 = r4.t
            long[] r3 = r4.t
            com.google.crypto.tink.subtle.Field25519.sum(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            long[] r2 = r5.x
            long[] r5 = r5.y
            com.google.crypto.tink.subtle.Field25519.sum(r1, r2, r5)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.y
            com.google.crypto.tink.subtle.Field25519.square(r0, r5)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.x
            com.google.crypto.tink.subtle.Field25519.sum(r5, r1, r2)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.x
            com.google.crypto.tink.subtle.Field25519.sub(r5, r1, r2)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Field25519.sub(r5, r0, r1)
            long[] r5 = r4.t
            long[] r0 = r4.t
            com.google.crypto.tink.subtle.Ed25519$XYZ r4 = r4.xyz
            long[] r4 = r4.z
            com.google.crypto.tink.subtle.Field25519.sub(r5, r0, r4)
            return
    }

    private static void doubleXYZT(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r0, com.google.crypto.tink.subtle.Ed25519.XYZT r1) {
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r1.xyz
            doubleXYZ(r0, r1)
            return
    }

    private static int eq(int r0, int r1) {
            r0 = r0 ^ r1
            int r0 = ~r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 4
            r0 = r0 & r1
            int r1 = r0 << 2
            r0 = r0 & r1
            int r1 = r0 << 1
            r0 = r0 & r1
            int r0 = r0 >> 7
            r0 = r0 & 1
            return r0
    }

    static byte[] getHashedScalar(byte[] r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r0 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            java.lang.String r1 = "SHA-512"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0
            r1 = 32
            r2 = 0
            r0.update(r3, r2, r1)
            byte[] r3 = r0.digest()
            r0 = r3[r2]
            r0 = r0 & 248(0xf8, float:3.48E-43)
            byte r0 = (byte) r0
            r3[r2] = r0
            r0 = 31
            r1 = r3[r0]
            r1 = r1 & 127(0x7f, float:1.78E-43)
            byte r1 = (byte) r1
            r3[r0] = r1
            r1 = r1 | 64
            byte r1 = (byte) r1
            r3[r0] = r1
            return r3
    }

    private static int getLsb(long[] r1) {
            byte[] r1 = com.google.crypto.tink.subtle.Field25519.contract(r1)
            r0 = 0
            r1 = r1[r0]
            r1 = r1 & 1
            return r1
    }

    private static boolean isNonZeroVarTime(long[] r5) {
            int r0 = r5.length
            r1 = 1
            int r0 = r0 + r1
            long[] r0 = new long[r0]
            int r2 = r5.length
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r0, r3, r2)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r0)
            byte[] r5 = com.google.crypto.tink.subtle.Field25519.contract(r0)
            int r0 = r5.length
            r2 = r3
        L13:
            if (r2 >= r0) goto L1d
            r4 = r5[r2]
            if (r4 == 0) goto L1a
            return r1
        L1a:
            int r2 = r2 + 1
            goto L13
        L1d:
            return r3
    }

    private static boolean isSmallerThanGroupOrder(byte[] r4) {
            r0 = 31
        L2:
            r1 = 0
            if (r0 < 0) goto L18
            r2 = r4[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r3 = com.google.crypto.tink.subtle.Ed25519.GROUP_ORDER
            r3 = r3[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r2 == r3) goto L15
            if (r2 >= r3) goto L14
            r1 = 1
        L14:
            return r1
        L15:
            int r0 = r0 + (-1)
            goto L2
        L18:
            return r1
    }

    private static long load3(byte[] r5, int r6) {
            r0 = r5[r6]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r2 = r6 + 1
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r4 = 8
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r6 = r6 + 2
            r5 = r5[r6]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r2 = 16
            long r5 = r5 << r2
            long r5 = r5 | r0
            return r5
    }

    private static long load4(byte[] r3, int r4) {
            long r0 = load3(r3, r4)
            int r4 = r4 + 3
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            r2 = 24
            long r3 = r3 << r2
            long r3 = r3 | r0
            return r3
    }

    private static void mulAdd(byte[] r82, byte[] r83, byte[] r84, byte[] r85) {
            r0 = r83
            r1 = r84
            r2 = r85
            r3 = 0
            long r4 = load3(r0, r3)
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            r8 = 2
            long r9 = load4(r0, r8)
            r11 = 5
            long r9 = r9 >> r11
            long r9 = r9 & r6
            long r12 = load3(r0, r11)
            long r12 = r12 >> r8
            long r12 = r12 & r6
            r14 = 7
            long r15 = load4(r0, r14)
            long r15 = r15 >> r14
            long r15 = r15 & r6
            r3 = 10
            long r17 = load4(r0, r3)
            r19 = 4
            long r17 = r17 >> r19
            long r17 = r17 & r6
            r3 = 13
            long r20 = load3(r0, r3)
            r22 = 1
            long r20 = r20 >> r22
            long r20 = r20 & r6
            r3 = 15
            long r23 = load4(r0, r3)
            r25 = 6
            long r23 = r23 >> r25
            long r23 = r23 & r6
            r3 = 18
            long r26 = load3(r0, r3)
            r28 = 3
            long r26 = r26 >> r28
            long r26 = r26 & r6
            r3 = 21
            long r29 = load3(r0, r3)
            long r29 = r29 & r6
            r3 = 23
            long r32 = load4(r0, r3)
            long r32 = r32 >> r11
            long r32 = r32 & r6
            r3 = 26
            long r34 = load3(r0, r3)
            long r34 = r34 >> r8
            long r34 = r34 & r6
            r3 = 28
            long r36 = load4(r0, r3)
            long r36 = r36 >> r14
            r0 = 0
            long r38 = load3(r1, r0)
            long r38 = r38 & r6
            long r40 = load4(r1, r8)
            long r40 = r40 >> r11
            long r40 = r40 & r6
            long r42 = load3(r1, r11)
            long r42 = r42 >> r8
            long r42 = r42 & r6
            long r44 = load4(r1, r14)
            long r44 = r44 >> r14
            long r44 = r44 & r6
            r0 = 10
            long r46 = load4(r1, r0)
            long r46 = r46 >> r19
            long r46 = r46 & r6
            r0 = 13
            long r48 = load3(r1, r0)
            long r48 = r48 >> r22
            long r48 = r48 & r6
            r0 = 15
            long r50 = load4(r1, r0)
            long r50 = r50 >> r25
            long r50 = r50 & r6
            r0 = 18
            long r52 = load3(r1, r0)
            long r52 = r52 >> r28
            long r52 = r52 & r6
            r0 = 21
            long r54 = load3(r1, r0)
            long r54 = r54 & r6
            r0 = 23
            long r56 = load4(r1, r0)
            long r56 = r56 >> r11
            long r56 = r56 & r6
            r0 = 26
            long r58 = load3(r1, r0)
            long r58 = r58 >> r8
            long r58 = r58 & r6
            r0 = 28
            long r0 = load4(r1, r0)
            long r0 = r0 >> r14
            r3 = 0
            long r60 = load3(r2, r3)
            long r60 = r60 & r6
            long r62 = load4(r2, r8)
            long r62 = r62 >> r11
            long r62 = r62 & r6
            long r64 = load3(r2, r11)
            long r64 = r64 >> r8
            long r64 = r64 & r6
            long r66 = load4(r2, r14)
            long r66 = r66 >> r14
            long r66 = r66 & r6
            r3 = 10
            long r68 = load4(r2, r3)
            long r68 = r68 >> r19
            long r68 = r68 & r6
            r3 = 13
            long r70 = load3(r2, r3)
            long r70 = r70 >> r22
            long r70 = r70 & r6
            r3 = 15
            long r72 = load4(r2, r3)
            long r72 = r72 >> r25
            long r72 = r72 & r6
            r3 = 18
            long r74 = load3(r2, r3)
            long r74 = r74 >> r28
            long r74 = r74 & r6
            r3 = 21
            long r76 = load3(r2, r3)
            long r76 = r76 & r6
            r3 = 23
            long r78 = load4(r2, r3)
            long r78 = r78 >> r11
            long r78 = r78 & r6
            r3 = 26
            long r80 = load3(r2, r3)
            long r80 = r80 >> r8
            long r6 = r80 & r6
            r3 = 28
            long r2 = load4(r2, r3)
            long r2 = r2 >> r14
            long r80 = r4 * r38
            long r60 = r60 + r80
            long r80 = r4 * r40
            long r62 = r62 + r80
            long r80 = r9 * r38
            long r62 = r62 + r80
            long r80 = r4 * r42
            long r64 = r64 + r80
            long r80 = r9 * r40
            long r64 = r64 + r80
            long r80 = r12 * r38
            long r64 = r64 + r80
            long r80 = r4 * r44
            long r66 = r66 + r80
            long r80 = r9 * r42
            long r66 = r66 + r80
            long r80 = r12 * r40
            long r66 = r66 + r80
            long r80 = r15 * r38
            long r66 = r66 + r80
            long r80 = r4 * r46
            long r68 = r68 + r80
            long r80 = r9 * r44
            long r68 = r68 + r80
            long r80 = r12 * r42
            long r68 = r68 + r80
            long r80 = r15 * r40
            long r68 = r68 + r80
            long r80 = r17 * r38
            long r68 = r68 + r80
            long r80 = r4 * r48
            long r70 = r70 + r80
            long r80 = r9 * r46
            long r70 = r70 + r80
            long r80 = r12 * r44
            long r70 = r70 + r80
            long r80 = r15 * r42
            long r70 = r70 + r80
            long r80 = r17 * r40
            long r70 = r70 + r80
            long r80 = r20 * r38
            long r70 = r70 + r80
            long r80 = r4 * r50
            long r72 = r72 + r80
            long r80 = r9 * r48
            long r72 = r72 + r80
            long r80 = r12 * r46
            long r72 = r72 + r80
            long r80 = r15 * r44
            long r72 = r72 + r80
            long r80 = r17 * r42
            long r72 = r72 + r80
            long r80 = r20 * r40
            long r72 = r72 + r80
            long r80 = r23 * r38
            long r72 = r72 + r80
            long r80 = r4 * r52
            long r74 = r74 + r80
            long r80 = r9 * r50
            long r74 = r74 + r80
            long r80 = r12 * r48
            long r74 = r74 + r80
            long r80 = r15 * r46
            long r74 = r74 + r80
            long r80 = r17 * r44
            long r74 = r74 + r80
            long r80 = r20 * r42
            long r74 = r74 + r80
            long r80 = r23 * r40
            long r74 = r74 + r80
            long r80 = r26 * r38
            long r74 = r74 + r80
            long r80 = r4 * r54
            long r76 = r76 + r80
            long r80 = r9 * r52
            long r76 = r76 + r80
            long r80 = r12 * r50
            long r76 = r76 + r80
            long r80 = r15 * r48
            long r76 = r76 + r80
            long r80 = r17 * r46
            long r76 = r76 + r80
            long r80 = r20 * r44
            long r76 = r76 + r80
            long r80 = r23 * r42
            long r76 = r76 + r80
            long r80 = r26 * r40
            long r76 = r76 + r80
            long r80 = r29 * r38
            long r76 = r76 + r80
            long r80 = r4 * r56
            long r78 = r78 + r80
            long r80 = r9 * r54
            long r78 = r78 + r80
            long r80 = r12 * r52
            long r78 = r78 + r80
            long r80 = r15 * r50
            long r78 = r78 + r80
            long r80 = r17 * r48
            long r78 = r78 + r80
            long r80 = r20 * r46
            long r78 = r78 + r80
            long r80 = r23 * r44
            long r78 = r78 + r80
            long r80 = r26 * r42
            long r78 = r78 + r80
            long r80 = r29 * r40
            long r78 = r78 + r80
            long r80 = r32 * r38
            long r78 = r78 + r80
            long r80 = r4 * r58
            long r6 = r6 + r80
            long r80 = r9 * r56
            long r6 = r6 + r80
            long r80 = r12 * r54
            long r6 = r6 + r80
            long r80 = r15 * r52
            long r6 = r6 + r80
            long r80 = r17 * r50
            long r6 = r6 + r80
            long r80 = r20 * r48
            long r6 = r6 + r80
            long r80 = r23 * r46
            long r6 = r6 + r80
            long r80 = r26 * r44
            long r6 = r6 + r80
            long r80 = r29 * r42
            long r6 = r6 + r80
            long r80 = r32 * r40
            long r6 = r6 + r80
            long r80 = r34 * r38
            long r6 = r6 + r80
            long r4 = r4 * r0
            long r2 = r2 + r4
            long r4 = r9 * r58
            long r2 = r2 + r4
            long r4 = r12 * r56
            long r2 = r2 + r4
            long r4 = r15 * r54
            long r2 = r2 + r4
            long r4 = r17 * r52
            long r2 = r2 + r4
            long r4 = r20 * r50
            long r2 = r2 + r4
            long r4 = r23 * r48
            long r2 = r2 + r4
            long r4 = r26 * r46
            long r2 = r2 + r4
            long r4 = r29 * r44
            long r2 = r2 + r4
            long r4 = r32 * r42
            long r2 = r2 + r4
            long r4 = r34 * r40
            long r2 = r2 + r4
            long r38 = r38 * r36
            long r2 = r2 + r38
            long r9 = r9 * r0
            long r4 = r12 * r58
            long r9 = r9 + r4
            long r4 = r15 * r56
            long r9 = r9 + r4
            long r4 = r17 * r54
            long r9 = r9 + r4
            long r4 = r20 * r52
            long r9 = r9 + r4
            long r4 = r23 * r50
            long r9 = r9 + r4
            long r4 = r26 * r48
            long r9 = r9 + r4
            long r4 = r29 * r46
            long r9 = r9 + r4
            long r4 = r32 * r44
            long r9 = r9 + r4
            long r4 = r34 * r42
            long r9 = r9 + r4
            long r40 = r40 * r36
            long r9 = r9 + r40
            long r12 = r12 * r0
            long r4 = r15 * r58
            long r12 = r12 + r4
            long r4 = r17 * r56
            long r12 = r12 + r4
            long r4 = r20 * r54
            long r12 = r12 + r4
            long r4 = r23 * r52
            long r12 = r12 + r4
            long r4 = r26 * r50
            long r12 = r12 + r4
            long r4 = r29 * r48
            long r12 = r12 + r4
            long r4 = r32 * r46
            long r12 = r12 + r4
            long r4 = r34 * r44
            long r12 = r12 + r4
            long r42 = r42 * r36
            long r12 = r12 + r42
            long r15 = r15 * r0
            long r4 = r17 * r58
            long r15 = r15 + r4
            long r4 = r20 * r56
            long r15 = r15 + r4
            long r4 = r23 * r54
            long r15 = r15 + r4
            long r4 = r26 * r52
            long r15 = r15 + r4
            long r4 = r29 * r50
            long r15 = r15 + r4
            long r4 = r32 * r48
            long r15 = r15 + r4
            long r4 = r34 * r46
            long r15 = r15 + r4
            long r44 = r44 * r36
            long r15 = r15 + r44
            long r17 = r17 * r0
            long r4 = r20 * r58
            long r17 = r17 + r4
            long r4 = r23 * r56
            long r17 = r17 + r4
            long r4 = r26 * r54
            long r17 = r17 + r4
            long r4 = r29 * r52
            long r17 = r17 + r4
            long r4 = r32 * r50
            long r17 = r17 + r4
            long r4 = r34 * r48
            long r17 = r17 + r4
            long r46 = r46 * r36
            long r17 = r17 + r46
            long r20 = r20 * r0
            long r4 = r23 * r58
            long r20 = r20 + r4
            long r4 = r26 * r56
            long r20 = r20 + r4
            long r4 = r29 * r54
            long r20 = r20 + r4
            long r4 = r32 * r52
            long r20 = r20 + r4
            long r4 = r34 * r50
            long r20 = r20 + r4
            long r48 = r48 * r36
            long r20 = r20 + r48
            long r23 = r23 * r0
            long r4 = r26 * r58
            long r23 = r23 + r4
            long r4 = r29 * r56
            long r23 = r23 + r4
            long r4 = r32 * r54
            long r23 = r23 + r4
            long r4 = r34 * r52
            long r23 = r23 + r4
            long r50 = r50 * r36
            long r23 = r23 + r50
            long r26 = r26 * r0
            long r4 = r29 * r58
            long r26 = r26 + r4
            long r4 = r32 * r56
            long r26 = r26 + r4
            long r4 = r34 * r54
            long r26 = r26 + r4
            long r52 = r52 * r36
            long r26 = r26 + r52
            long r29 = r29 * r0
            long r4 = r32 * r58
            long r29 = r29 + r4
            long r4 = r34 * r56
            long r29 = r29 + r4
            long r54 = r54 * r36
            long r29 = r29 + r54
            long r32 = r32 * r0
            long r4 = r34 * r58
            long r32 = r32 + r4
            long r56 = r56 * r36
            long r32 = r32 + r56
            long r34 = r34 * r0
            long r58 = r58 * r36
            long r34 = r34 + r58
            long r36 = r36 * r0
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r4 = r60 + r0
            r31 = 21
            long r4 = r4 >> r31
            long r62 = r62 + r4
            long r4 = r4 << r31
            long r60 = r60 - r4
            long r4 = r64 + r0
            long r4 = r4 >> r31
            long r66 = r66 + r4
            long r4 = r4 << r31
            long r64 = r64 - r4
            long r4 = r68 + r0
            long r4 = r4 >> r31
            long r70 = r70 + r4
            long r4 = r4 << r31
            long r68 = r68 - r4
            long r4 = r72 + r0
            long r4 = r4 >> r31
            long r74 = r74 + r4
            long r4 = r4 << r31
            long r72 = r72 - r4
            long r4 = r76 + r0
            long r4 = r4 >> r31
            long r78 = r78 + r4
            long r4 = r4 << r31
            long r76 = r76 - r4
            long r4 = r6 + r0
            long r4 = r4 >> r31
            long r2 = r2 + r4
            long r4 = r4 << r31
            long r6 = r6 - r4
            long r4 = r9 + r0
            long r4 = r4 >> r31
            long r12 = r12 + r4
            long r4 = r4 << r31
            long r9 = r9 - r4
            long r4 = r15 + r0
            long r4 = r4 >> r31
            long r17 = r17 + r4
            long r4 = r4 << r31
            long r15 = r15 - r4
            long r4 = r20 + r0
            long r4 = r4 >> r31
            long r23 = r23 + r4
            long r4 = r4 << r31
            long r20 = r20 - r4
            long r4 = r26 + r0
            long r4 = r4 >> r31
            long r29 = r29 + r4
            long r4 = r4 << r31
            long r26 = r26 - r4
            long r4 = r32 + r0
            long r4 = r4 >> r31
            long r34 = r34 + r4
            long r4 = r4 << r31
            long r32 = r32 - r4
            long r4 = r36 + r0
            long r4 = r4 >> r31
            long r38 = r4 << r31
            long r36 = r36 - r38
            long r38 = r62 + r0
            long r38 = r38 >> r31
            long r64 = r64 + r38
            long r38 = r38 << r31
            long r62 = r62 - r38
            long r38 = r66 + r0
            long r38 = r38 >> r31
            long r68 = r68 + r38
            long r38 = r38 << r31
            long r66 = r66 - r38
            long r38 = r70 + r0
            long r38 = r38 >> r31
            long r72 = r72 + r38
            long r38 = r38 << r31
            long r70 = r70 - r38
            long r38 = r74 + r0
            long r38 = r38 >> r31
            long r76 = r76 + r38
            long r38 = r38 << r31
            long r74 = r74 - r38
            long r38 = r78 + r0
            long r38 = r38 >> r31
            long r6 = r6 + r38
            long r38 = r38 << r31
            long r78 = r78 - r38
            long r38 = r2 + r0
            long r38 = r38 >> r31
            long r9 = r9 + r38
            long r38 = r38 << r31
            long r2 = r2 - r38
            long r38 = r12 + r0
            long r38 = r38 >> r31
            long r15 = r15 + r38
            long r38 = r38 << r31
            long r12 = r12 - r38
            long r38 = r17 + r0
            long r38 = r38 >> r31
            long r20 = r20 + r38
            long r38 = r38 << r31
            long r17 = r17 - r38
            long r38 = r23 + r0
            long r38 = r38 >> r31
            long r26 = r26 + r38
            long r38 = r38 << r31
            long r23 = r23 - r38
            long r38 = r29 + r0
            long r38 = r38 >> r31
            long r32 = r32 + r38
            long r38 = r38 << r31
            long r29 = r29 - r38
            long r38 = r34 + r0
            long r38 = r38 >> r31
            long r36 = r36 + r38
            long r38 = r38 << r31
            long r34 = r34 - r38
            r38 = 666643(0xa2c13, double:3.293654E-318)
            long r40 = r4 * r38
            long r2 = r2 + r40
            r40 = 470296(0x72d18, double:2.32357E-318)
            long r42 = r4 * r40
            long r9 = r9 + r42
            r42 = 654183(0x9fb67, double:3.232093E-318)
            long r44 = r4 * r42
            long r12 = r12 + r44
            r44 = 997805(0xf39ad, double:4.92981E-318)
            long r46 = r4 * r44
            long r15 = r15 - r46
            r46 = 136657(0x215d1, double:6.75175E-319)
            long r48 = r4 * r46
            long r17 = r17 + r48
            r48 = 683901(0xa6f7d, double:3.37892E-318)
            long r4 = r4 * r48
            long r20 = r20 - r4
            long r4 = r36 * r38
            long r6 = r6 + r4
            long r4 = r36 * r40
            long r2 = r2 + r4
            long r4 = r36 * r42
            long r9 = r9 + r4
            long r4 = r36 * r44
            long r12 = r12 - r4
            long r4 = r36 * r46
            long r15 = r15 + r4
            long r36 = r36 * r48
            long r17 = r17 - r36
            long r4 = r34 * r38
            long r78 = r78 + r4
            long r4 = r34 * r40
            long r6 = r6 + r4
            long r4 = r34 * r42
            long r2 = r2 + r4
            long r4 = r34 * r44
            long r9 = r9 - r4
            long r4 = r34 * r46
            long r12 = r12 + r4
            long r34 = r34 * r48
            long r15 = r15 - r34
            long r4 = r32 * r38
            long r76 = r76 + r4
            long r4 = r32 * r40
            long r78 = r78 + r4
            long r4 = r32 * r42
            long r6 = r6 + r4
            long r4 = r32 * r44
            long r2 = r2 - r4
            long r4 = r32 * r46
            long r9 = r9 + r4
            long r32 = r32 * r48
            long r12 = r12 - r32
            long r4 = r29 * r38
            long r74 = r74 + r4
            long r4 = r29 * r40
            long r76 = r76 + r4
            long r4 = r29 * r42
            long r78 = r78 + r4
            long r4 = r29 * r44
            long r6 = r6 - r4
            long r4 = r29 * r46
            long r2 = r2 + r4
            long r29 = r29 * r48
            long r9 = r9 - r29
            long r4 = r26 * r38
            long r72 = r72 + r4
            long r4 = r26 * r40
            long r74 = r74 + r4
            long r4 = r26 * r42
            long r76 = r76 + r4
            long r4 = r26 * r44
            long r78 = r78 - r4
            long r4 = r26 * r46
            long r6 = r6 + r4
            long r26 = r26 * r48
            long r2 = r2 - r26
            long r4 = r72 + r0
            r26 = 21
            long r4 = r4 >> r26
            long r74 = r74 + r4
            long r4 = r4 << r26
            long r72 = r72 - r4
            long r4 = r76 + r0
            long r4 = r4 >> r26
            long r78 = r78 + r4
            long r4 = r4 << r26
            long r76 = r76 - r4
            long r4 = r6 + r0
            long r4 = r4 >> r26
            long r2 = r2 + r4
            long r4 = r4 << r26
            long r6 = r6 - r4
            long r4 = r9 + r0
            long r4 = r4 >> r26
            long r12 = r12 + r4
            long r4 = r4 << r26
            long r9 = r9 - r4
            long r4 = r15 + r0
            long r4 = r4 >> r26
            long r17 = r17 + r4
            long r4 = r4 << r26
            long r15 = r15 - r4
            long r4 = r20 + r0
            long r4 = r4 >> r26
            long r23 = r23 + r4
            long r4 = r4 << r26
            long r20 = r20 - r4
            long r4 = r74 + r0
            long r4 = r4 >> r26
            long r76 = r76 + r4
            long r4 = r4 << r26
            long r74 = r74 - r4
            long r4 = r78 + r0
            long r4 = r4 >> r26
            long r6 = r6 + r4
            long r4 = r4 << r26
            long r78 = r78 - r4
            long r4 = r2 + r0
            long r4 = r4 >> r26
            long r9 = r9 + r4
            long r4 = r4 << r26
            long r2 = r2 - r4
            long r4 = r12 + r0
            long r4 = r4 >> r26
            long r15 = r15 + r4
            long r4 = r4 << r26
            long r12 = r12 - r4
            long r4 = r17 + r0
            long r4 = r4 >> r26
            long r20 = r20 + r4
            long r4 = r4 << r26
            long r17 = r17 - r4
            long r4 = r23 * r38
            long r70 = r70 + r4
            long r4 = r23 * r40
            long r72 = r72 + r4
            long r4 = r23 * r42
            long r74 = r74 + r4
            long r4 = r23 * r44
            long r76 = r76 - r4
            long r4 = r23 * r46
            long r78 = r78 + r4
            long r23 = r23 * r48
            long r6 = r6 - r23
            long r4 = r20 * r38
            long r68 = r68 + r4
            long r4 = r20 * r40
            long r70 = r70 + r4
            long r4 = r20 * r42
            long r72 = r72 + r4
            long r4 = r20 * r44
            long r74 = r74 - r4
            long r4 = r20 * r46
            long r76 = r76 + r4
            long r20 = r20 * r48
            long r78 = r78 - r20
            long r4 = r17 * r38
            long r66 = r66 + r4
            long r4 = r17 * r40
            long r68 = r68 + r4
            long r4 = r17 * r42
            long r70 = r70 + r4
            long r4 = r17 * r44
            long r72 = r72 - r4
            long r4 = r17 * r46
            long r74 = r74 + r4
            long r17 = r17 * r48
            long r76 = r76 - r17
            long r4 = r15 * r38
            long r64 = r64 + r4
            long r4 = r15 * r40
            long r66 = r66 + r4
            long r4 = r15 * r42
            long r68 = r68 + r4
            long r4 = r15 * r44
            long r70 = r70 - r4
            long r4 = r15 * r46
            long r72 = r72 + r4
            long r15 = r15 * r48
            long r74 = r74 - r15
            long r4 = r12 * r38
            long r62 = r62 + r4
            long r4 = r12 * r40
            long r64 = r64 + r4
            long r4 = r12 * r42
            long r66 = r66 + r4
            long r4 = r12 * r44
            long r68 = r68 - r4
            long r4 = r12 * r46
            long r70 = r70 + r4
            long r12 = r12 * r48
            long r72 = r72 - r12
            long r4 = r9 * r38
            long r60 = r60 + r4
            long r4 = r9 * r40
            long r62 = r62 + r4
            long r4 = r9 * r42
            long r64 = r64 + r4
            long r4 = r9 * r44
            long r66 = r66 - r4
            long r4 = r9 * r46
            long r68 = r68 + r4
            long r9 = r9 * r48
            long r70 = r70 - r9
            long r4 = r60 + r0
            r9 = 21
            long r4 = r4 >> r9
            long r62 = r62 + r4
            long r4 = r4 << r9
            long r60 = r60 - r4
            long r4 = r64 + r0
            long r4 = r4 >> r9
            long r66 = r66 + r4
            long r4 = r4 << r9
            long r64 = r64 - r4
            long r4 = r68 + r0
            long r4 = r4 >> r9
            long r70 = r70 + r4
            long r4 = r4 << r9
            long r68 = r68 - r4
            long r4 = r72 + r0
            long r4 = r4 >> r9
            long r74 = r74 + r4
            long r4 = r4 << r9
            long r72 = r72 - r4
            long r4 = r76 + r0
            long r4 = r4 >> r9
            long r78 = r78 + r4
            long r4 = r4 << r9
            long r76 = r76 - r4
            long r4 = r6 + r0
            long r4 = r4 >> r9
            long r2 = r2 + r4
            long r4 = r4 << r9
            long r6 = r6 - r4
            long r4 = r62 + r0
            long r4 = r4 >> r9
            long r64 = r64 + r4
            long r4 = r4 << r9
            long r62 = r62 - r4
            long r4 = r66 + r0
            long r4 = r4 >> r9
            long r68 = r68 + r4
            long r4 = r4 << r9
            long r66 = r66 - r4
            long r4 = r70 + r0
            long r4 = r4 >> r9
            long r72 = r72 + r4
            long r4 = r4 << r9
            long r70 = r70 - r4
            long r4 = r74 + r0
            long r4 = r4 >> r9
            long r76 = r76 + r4
            long r4 = r4 << r9
            long r74 = r74 - r4
            long r4 = r78 + r0
            long r4 = r4 >> r9
            long r6 = r6 + r4
            long r4 = r4 << r9
            long r78 = r78 - r4
            long r0 = r0 + r2
            long r0 = r0 >> r9
            long r4 = r0 << r9
            long r2 = r2 - r4
            long r4 = r0 * r38
            long r60 = r60 + r4
            long r4 = r0 * r40
            long r62 = r62 + r4
            long r4 = r0 * r42
            long r64 = r64 + r4
            long r4 = r0 * r44
            long r66 = r66 - r4
            long r4 = r0 * r46
            long r68 = r68 + r4
            long r0 = r0 * r48
            long r70 = r70 - r0
            r0 = 21
            long r4 = r60 >> r0
            long r62 = r62 + r4
            long r4 = r4 << r0
            long r60 = r60 - r4
            long r4 = r62 >> r0
            long r64 = r64 + r4
            long r4 = r4 << r0
            long r62 = r62 - r4
            long r4 = r64 >> r0
            long r66 = r66 + r4
            long r4 = r4 << r0
            long r64 = r64 - r4
            long r4 = r66 >> r0
            long r68 = r68 + r4
            long r4 = r4 << r0
            long r66 = r66 - r4
            long r4 = r68 >> r0
            long r70 = r70 + r4
            long r4 = r4 << r0
            long r68 = r68 - r4
            long r4 = r70 >> r0
            long r72 = r72 + r4
            long r4 = r4 << r0
            long r70 = r70 - r4
            long r4 = r72 >> r0
            long r74 = r74 + r4
            long r4 = r4 << r0
            long r72 = r72 - r4
            long r4 = r74 >> r0
            long r76 = r76 + r4
            long r4 = r4 << r0
            long r74 = r74 - r4
            long r4 = r76 >> r0
            long r78 = r78 + r4
            long r4 = r4 << r0
            long r76 = r76 - r4
            long r4 = r78 >> r0
            long r6 = r6 + r4
            long r4 = r4 << r0
            long r78 = r78 - r4
            long r4 = r6 >> r0
            long r2 = r2 + r4
            long r4 = r4 << r0
            long r6 = r6 - r4
            long r4 = r2 >> r0
            long r9 = r4 << r0
            long r2 = r2 - r9
            long r38 = r38 * r4
            long r60 = r60 + r38
            long r40 = r40 * r4
            long r62 = r62 + r40
            long r42 = r42 * r4
            long r64 = r64 + r42
            long r44 = r44 * r4
            long r66 = r66 - r44
            long r46 = r46 * r4
            long r68 = r68 + r46
            long r4 = r4 * r48
            long r70 = r70 - r4
            r0 = 21
            long r4 = r60 >> r0
            long r62 = r62 + r4
            long r4 = r4 << r0
            long r4 = r60 - r4
            long r9 = r62 >> r0
            long r64 = r64 + r9
            long r9 = r9 << r0
            long r62 = r62 - r9
            long r9 = r64 >> r0
            long r66 = r66 + r9
            long r9 = r9 << r0
            long r64 = r64 - r9
            long r9 = r66 >> r0
            long r68 = r68 + r9
            long r9 = r9 << r0
            long r66 = r66 - r9
            long r9 = r68 >> r0
            long r70 = r70 + r9
            long r9 = r9 << r0
            long r68 = r68 - r9
            long r9 = r70 >> r0
            long r72 = r72 + r9
            long r9 = r9 << r0
            long r70 = r70 - r9
            long r9 = r72 >> r0
            long r74 = r74 + r9
            long r9 = r9 << r0
            long r72 = r72 - r9
            long r9 = r74 >> r0
            long r76 = r76 + r9
            long r9 = r9 << r0
            long r74 = r74 - r9
            long r9 = r76 >> r0
            long r78 = r78 + r9
            long r9 = r9 << r0
            long r9 = r76 - r9
            long r12 = r78 >> r0
            long r6 = r6 + r12
            long r12 = r12 << r0
            long r78 = r78 - r12
            long r12 = r6 >> r0
            long r2 = r2 + r12
            long r12 = r12 << r0
            long r6 = r6 - r12
            int r0 = (int) r4
            byte r0 = (byte) r0
            r1 = 0
            r82[r1] = r0
            r0 = 8
            long r0 = r4 >> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r82[r22] = r0
            r0 = 16
            long r0 = r4 >> r0
            long r4 = r62 << r11
            long r0 = r0 | r4
            int r0 = (int) r0
            byte r0 = (byte) r0
            r82[r8] = r0
            long r0 = r62 >> r28
            int r0 = (int) r0
            byte r0 = (byte) r0
            r82[r28] = r0
            r0 = 11
            long r0 = r62 >> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r82[r19] = r0
            r0 = 19
            long r0 = r62 >> r0
            long r4 = r64 << r8
            long r0 = r0 | r4
            int r0 = (int) r0
            byte r0 = (byte) r0
            r82[r11] = r0
            long r0 = r64 >> r25
            int r0 = (int) r0
            byte r0 = (byte) r0
            r82[r25] = r0
            r0 = 14
            long r0 = r64 >> r0
            long r4 = r66 << r14
            long r0 = r0 | r4
            int r0 = (int) r0
            byte r0 = (byte) r0
            r82[r14] = r0
            long r0 = r66 >> r22
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 8
            r82[r1] = r0
            r0 = 9
            long r0 = r66 >> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 9
            r82[r1] = r0
            r0 = 17
            long r0 = r66 >> r0
            long r4 = r68 << r19
            long r0 = r0 | r4
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 10
            r82[r1] = r0
            long r0 = r68 >> r19
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 11
            r82[r1] = r0
            r0 = 12
            long r0 = r68 >> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 12
            r82[r1] = r0
            r0 = 20
            long r0 = r68 >> r0
            long r4 = r70 << r22
            long r0 = r0 | r4
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 13
            r82[r1] = r0
            long r0 = r70 >> r14
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 14
            r82[r1] = r0
            r0 = 15
            long r4 = r70 >> r0
            long r12 = r72 << r25
            long r4 = r4 | r12
            int r1 = (int) r4
            byte r1 = (byte) r1
            r82[r0] = r1
            long r0 = r72 >> r8
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 16
            r82[r1] = r0
            r0 = 10
            long r0 = r72 >> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 17
            r82[r1] = r0
            r0 = 18
            long r4 = r72 >> r0
            long r12 = r74 << r28
            long r4 = r4 | r12
            int r1 = (int) r4
            byte r1 = (byte) r1
            r82[r0] = r1
            long r0 = r74 >> r11
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 19
            r82[r1] = r0
            r0 = 13
            long r0 = r74 >> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 20
            r82[r1] = r0
            int r0 = (int) r9
            byte r0 = (byte) r0
            r1 = 21
            r82[r1] = r0
            r0 = 8
            long r0 = r9 >> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 22
            r82[r1] = r0
            r0 = 16
            long r0 = r9 >> r0
            long r4 = r78 << r11
            long r0 = r0 | r4
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 23
            r82[r1] = r0
            long r0 = r78 >> r28
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 24
            r82[r1] = r0
            r0 = 11
            long r0 = r78 >> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 25
            r82[r1] = r0
            r0 = 19
            long r0 = r78 >> r0
            long r4 = r6 << r8
            long r0 = r0 | r4
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 26
            r82[r1] = r0
            long r0 = r6 >> r25
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 27
            r82[r1] = r0
            r0 = 14
            long r0 = r6 >> r0
            long r4 = r2 << r14
            long r0 = r0 | r4
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 28
            r82[r1] = r0
            long r0 = r2 >> r22
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 29
            r82[r1] = r0
            r0 = 9
            long r0 = r2 >> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 30
            r82[r1] = r0
            r0 = 17
            long r0 = r2 >> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r1 = 31
            r82[r1] = r0
            return
    }

    private static void neg(long[] r3, long[] r4) {
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto Lc
            r1 = r4[r0]
            long r1 = -r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto L1
        Lc:
            return
    }

    private static void pow2252m3(long[] r7, long[] r8) {
            r0 = 10
            long[] r1 = new long[r0]
            long[] r2 = new long[r0]
            long[] r3 = new long[r0]
            com.google.crypto.tink.subtle.Field25519.square(r1, r8)
            com.google.crypto.tink.subtle.Field25519.square(r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            com.google.crypto.tink.subtle.Field25519.mult(r2, r8, r2)
            com.google.crypto.tink.subtle.Field25519.mult(r1, r1, r2)
            com.google.crypto.tink.subtle.Field25519.square(r1, r1)
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r2, r1)
            r4 = 1
            r5 = r4
        L22:
            r6 = 5
            if (r5 >= r6) goto L2b
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            int r5 = r5 + 1
            goto L22
        L2b:
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r2, r1)
            r5 = r4
        L32:
            if (r5 >= r0) goto L3a
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            int r5 = r5 + 1
            goto L32
        L3a:
            com.google.crypto.tink.subtle.Field25519.mult(r2, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r3, r2)
            r5 = r4
        L41:
            r6 = 20
            if (r5 >= r6) goto L4b
            com.google.crypto.tink.subtle.Field25519.square(r3, r3)
            int r5 = r5 + 1
            goto L41
        L4b:
            com.google.crypto.tink.subtle.Field25519.mult(r2, r3, r2)
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            r5 = r4
        L52:
            if (r5 >= r0) goto L5a
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            int r5 = r5 + 1
            goto L52
        L5a:
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r2, r1)
            r0 = r4
        L61:
            r5 = 50
            if (r0 >= r5) goto L6b
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            int r0 = r0 + 1
            goto L61
        L6b:
            com.google.crypto.tink.subtle.Field25519.mult(r2, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r3, r2)
            r0 = r4
        L72:
            r6 = 100
            if (r0 >= r6) goto L7c
            com.google.crypto.tink.subtle.Field25519.square(r3, r3)
            int r0 = r0 + 1
            goto L72
        L7c:
            com.google.crypto.tink.subtle.Field25519.mult(r2, r3, r2)
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
        L82:
            if (r4 >= r5) goto L8a
            com.google.crypto.tink.subtle.Field25519.square(r2, r2)
            int r4 = r4 + 1
            goto L82
        L8a:
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r1)
            com.google.crypto.tink.subtle.Field25519.square(r1, r1)
            com.google.crypto.tink.subtle.Field25519.square(r1, r1)
            com.google.crypto.tink.subtle.Field25519.mult(r7, r1, r8)
            return
    }

    private static void reduce(byte[] r69) {
            r0 = r69
            r1 = 0
            long r1 = load3(r0, r1)
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            r5 = 2
            long r6 = load4(r0, r5)
            r8 = 5
            long r6 = r6 >> r8
            long r6 = r6 & r3
            long r9 = load3(r0, r8)
            long r9 = r9 >> r5
            long r9 = r9 & r3
            r11 = 7
            long r12 = load4(r0, r11)
            long r12 = r12 >> r11
            long r12 = r12 & r3
            r14 = 10
            long r15 = load4(r0, r14)
            r17 = 4
            long r15 = r15 >> r17
            long r15 = r15 & r3
            r14 = 13
            long r18 = load3(r0, r14)
            r20 = 1
            long r18 = r18 >> r20
            long r18 = r18 & r3
            r14 = 15
            long r21 = load4(r0, r14)
            r23 = 6
            long r21 = r21 >> r23
            long r21 = r21 & r3
            r14 = 18
            long r24 = load3(r0, r14)
            r26 = 3
            long r24 = r24 >> r26
            long r24 = r24 & r3
            r14 = 21
            long r27 = load3(r0, r14)
            long r27 = r27 & r3
            r14 = 23
            long r29 = load4(r0, r14)
            long r29 = r29 >> r8
            long r29 = r29 & r3
            r14 = 26
            long r31 = load3(r0, r14)
            long r31 = r31 >> r5
            long r31 = r31 & r3
            r14 = 28
            long r33 = load4(r0, r14)
            long r33 = r33 >> r11
            long r33 = r33 & r3
            r14 = 31
            long r35 = load4(r0, r14)
            long r35 = r35 >> r17
            long r35 = r35 & r3
            r14 = 34
            long r37 = load3(r0, r14)
            long r37 = r37 >> r20
            long r37 = r37 & r3
            r14 = 36
            long r39 = load4(r0, r14)
            long r39 = r39 >> r23
            long r39 = r39 & r3
            r14 = 39
            long r41 = load3(r0, r14)
            long r41 = r41 >> r26
            long r41 = r41 & r3
            r14 = 42
            long r43 = load3(r0, r14)
            long r43 = r43 & r3
            r14 = 44
            long r45 = load4(r0, r14)
            long r45 = r45 >> r8
            long r45 = r45 & r3
            r14 = 47
            long r47 = load3(r0, r14)
            long r47 = r47 >> r5
            long r47 = r47 & r3
            r14 = 49
            long r49 = load4(r0, r14)
            long r49 = r49 >> r11
            long r49 = r49 & r3
            r14 = 52
            long r51 = load4(r0, r14)
            long r51 = r51 >> r17
            long r51 = r51 & r3
            r14 = 55
            long r53 = load3(r0, r14)
            long r53 = r53 >> r20
            long r53 = r53 & r3
            r14 = 57
            long r55 = load4(r0, r14)
            long r55 = r55 >> r23
            long r3 = r55 & r3
            r14 = 60
            long r55 = load4(r0, r14)
            long r55 = r55 >> r26
            r57 = 666643(0xa2c13, double:3.293654E-318)
            long r59 = r55 * r57
            long r33 = r33 + r59
            r59 = 470296(0x72d18, double:2.32357E-318)
            long r61 = r55 * r59
            long r35 = r35 + r61
            r61 = 654183(0x9fb67, double:3.232093E-318)
            long r63 = r55 * r61
            long r37 = r37 + r63
            r63 = 997805(0xf39ad, double:4.92981E-318)
            long r65 = r55 * r63
            long r39 = r39 - r65
            r65 = 136657(0x215d1, double:6.75175E-319)
            long r67 = r55 * r65
            long r41 = r41 + r67
            r67 = 683901(0xa6f7d, double:3.37892E-318)
            long r55 = r55 * r67
            long r43 = r43 - r55
            long r55 = r3 * r57
            long r31 = r31 + r55
            long r55 = r3 * r59
            long r33 = r33 + r55
            long r55 = r3 * r61
            long r35 = r35 + r55
            long r55 = r3 * r63
            long r37 = r37 - r55
            long r55 = r3 * r65
            long r39 = r39 + r55
            long r3 = r3 * r67
            long r41 = r41 - r3
            long r3 = r53 * r57
            long r29 = r29 + r3
            long r3 = r53 * r59
            long r31 = r31 + r3
            long r3 = r53 * r61
            long r33 = r33 + r3
            long r3 = r53 * r63
            long r35 = r35 - r3
            long r3 = r53 * r65
            long r37 = r37 + r3
            long r53 = r53 * r67
            long r39 = r39 - r53
            long r3 = r51 * r57
            long r27 = r27 + r3
            long r3 = r51 * r59
            long r29 = r29 + r3
            long r3 = r51 * r61
            long r31 = r31 + r3
            long r3 = r51 * r63
            long r33 = r33 - r3
            long r3 = r51 * r65
            long r35 = r35 + r3
            long r51 = r51 * r67
            long r37 = r37 - r51
            long r3 = r49 * r57
            long r24 = r24 + r3
            long r3 = r49 * r59
            long r27 = r27 + r3
            long r3 = r49 * r61
            long r29 = r29 + r3
            long r3 = r49 * r63
            long r31 = r31 - r3
            long r3 = r49 * r65
            long r33 = r33 + r3
            long r49 = r49 * r67
            long r35 = r35 - r49
            long r3 = r47 * r57
            long r21 = r21 + r3
            long r3 = r47 * r59
            long r24 = r24 + r3
            long r3 = r47 * r61
            long r27 = r27 + r3
            long r3 = r47 * r63
            long r29 = r29 - r3
            long r3 = r47 * r65
            long r31 = r31 + r3
            long r47 = r47 * r67
            long r33 = r33 - r47
            r3 = 1048576(0x100000, double:5.180654E-318)
            long r47 = r21 + r3
            r14 = 21
            long r47 = r47 >> r14
            long r24 = r24 + r47
            long r47 = r47 << r14
            long r21 = r21 - r47
            long r47 = r27 + r3
            long r47 = r47 >> r14
            long r29 = r29 + r47
            long r47 = r47 << r14
            long r27 = r27 - r47
            long r47 = r31 + r3
            long r47 = r47 >> r14
            long r33 = r33 + r47
            long r47 = r47 << r14
            long r31 = r31 - r47
            long r47 = r35 + r3
            long r47 = r47 >> r14
            long r37 = r37 + r47
            long r47 = r47 << r14
            long r35 = r35 - r47
            long r47 = r39 + r3
            long r47 = r47 >> r14
            long r41 = r41 + r47
            long r47 = r47 << r14
            long r39 = r39 - r47
            long r47 = r43 + r3
            long r47 = r47 >> r14
            long r45 = r45 + r47
            long r47 = r47 << r14
            long r43 = r43 - r47
            long r47 = r24 + r3
            long r47 = r47 >> r14
            long r27 = r27 + r47
            long r47 = r47 << r14
            long r24 = r24 - r47
            long r47 = r29 + r3
            long r47 = r47 >> r14
            long r31 = r31 + r47
            long r47 = r47 << r14
            long r29 = r29 - r47
            long r47 = r33 + r3
            long r47 = r47 >> r14
            long r35 = r35 + r47
            long r47 = r47 << r14
            long r33 = r33 - r47
            long r47 = r37 + r3
            long r47 = r47 >> r14
            long r39 = r39 + r47
            long r47 = r47 << r14
            long r37 = r37 - r47
            long r47 = r41 + r3
            long r47 = r47 >> r14
            long r43 = r43 + r47
            long r47 = r47 << r14
            long r41 = r41 - r47
            long r47 = r45 * r57
            long r18 = r18 + r47
            long r47 = r45 * r59
            long r21 = r21 + r47
            long r47 = r45 * r61
            long r24 = r24 + r47
            long r47 = r45 * r63
            long r27 = r27 - r47
            long r47 = r45 * r65
            long r29 = r29 + r47
            long r45 = r45 * r67
            long r31 = r31 - r45
            long r45 = r43 * r57
            long r15 = r15 + r45
            long r45 = r43 * r59
            long r18 = r18 + r45
            long r45 = r43 * r61
            long r21 = r21 + r45
            long r45 = r43 * r63
            long r24 = r24 - r45
            long r45 = r43 * r65
            long r27 = r27 + r45
            long r43 = r43 * r67
            long r29 = r29 - r43
            long r43 = r41 * r57
            long r12 = r12 + r43
            long r43 = r41 * r59
            long r15 = r15 + r43
            long r43 = r41 * r61
            long r18 = r18 + r43
            long r43 = r41 * r63
            long r21 = r21 - r43
            long r43 = r41 * r65
            long r24 = r24 + r43
            long r41 = r41 * r67
            long r27 = r27 - r41
            long r41 = r39 * r57
            long r9 = r9 + r41
            long r41 = r39 * r59
            long r12 = r12 + r41
            long r41 = r39 * r61
            long r15 = r15 + r41
            long r41 = r39 * r63
            long r18 = r18 - r41
            long r41 = r39 * r65
            long r21 = r21 + r41
            long r39 = r39 * r67
            long r24 = r24 - r39
            long r39 = r37 * r57
            long r6 = r6 + r39
            long r39 = r37 * r59
            long r9 = r9 + r39
            long r39 = r37 * r61
            long r12 = r12 + r39
            long r39 = r37 * r63
            long r15 = r15 - r39
            long r39 = r37 * r65
            long r18 = r18 + r39
            long r37 = r37 * r67
            long r21 = r21 - r37
            long r37 = r35 * r57
            long r1 = r1 + r37
            long r37 = r35 * r59
            long r6 = r6 + r37
            long r37 = r35 * r61
            long r9 = r9 + r37
            long r37 = r35 * r63
            long r12 = r12 - r37
            long r37 = r35 * r65
            long r15 = r15 + r37
            long r35 = r35 * r67
            long r18 = r18 - r35
            long r35 = r1 + r3
            r14 = 21
            long r35 = r35 >> r14
            long r6 = r6 + r35
            long r35 = r35 << r14
            long r1 = r1 - r35
            long r35 = r9 + r3
            long r35 = r35 >> r14
            long r12 = r12 + r35
            long r35 = r35 << r14
            long r9 = r9 - r35
            long r35 = r15 + r3
            long r35 = r35 >> r14
            long r18 = r18 + r35
            long r35 = r35 << r14
            long r15 = r15 - r35
            long r35 = r21 + r3
            long r35 = r35 >> r14
            long r24 = r24 + r35
            long r35 = r35 << r14
            long r21 = r21 - r35
            long r35 = r27 + r3
            long r35 = r35 >> r14
            long r29 = r29 + r35
            long r35 = r35 << r14
            long r27 = r27 - r35
            long r35 = r31 + r3
            long r35 = r35 >> r14
            long r33 = r33 + r35
            long r35 = r35 << r14
            long r31 = r31 - r35
            long r35 = r6 + r3
            long r35 = r35 >> r14
            long r9 = r9 + r35
            long r35 = r35 << r14
            long r6 = r6 - r35
            long r35 = r12 + r3
            long r35 = r35 >> r14
            long r15 = r15 + r35
            long r35 = r35 << r14
            long r12 = r12 - r35
            long r35 = r18 + r3
            long r35 = r35 >> r14
            long r21 = r21 + r35
            long r35 = r35 << r14
            long r18 = r18 - r35
            long r35 = r24 + r3
            long r35 = r35 >> r14
            long r27 = r27 + r35
            long r35 = r35 << r14
            long r24 = r24 - r35
            long r35 = r29 + r3
            long r35 = r35 >> r14
            long r31 = r31 + r35
            long r35 = r35 << r14
            long r29 = r29 - r35
            long r3 = r33 + r3
            long r3 = r3 >> r14
            long r35 = r3 << r14
            long r33 = r33 - r35
            long r35 = r3 * r57
            long r1 = r1 + r35
            long r35 = r3 * r59
            long r6 = r6 + r35
            long r35 = r3 * r61
            long r9 = r9 + r35
            long r35 = r3 * r63
            long r12 = r12 - r35
            long r35 = r3 * r65
            long r15 = r15 + r35
            long r3 = r3 * r67
            long r18 = r18 - r3
            r3 = 21
            long r35 = r1 >> r3
            long r6 = r6 + r35
            long r35 = r35 << r3
            long r1 = r1 - r35
            long r35 = r6 >> r3
            long r9 = r9 + r35
            long r35 = r35 << r3
            long r6 = r6 - r35
            long r35 = r9 >> r3
            long r12 = r12 + r35
            long r35 = r35 << r3
            long r9 = r9 - r35
            long r35 = r12 >> r3
            long r15 = r15 + r35
            long r35 = r35 << r3
            long r12 = r12 - r35
            long r35 = r15 >> r3
            long r18 = r18 + r35
            long r35 = r35 << r3
            long r15 = r15 - r35
            long r35 = r18 >> r3
            long r21 = r21 + r35
            long r35 = r35 << r3
            long r18 = r18 - r35
            long r35 = r21 >> r3
            long r24 = r24 + r35
            long r35 = r35 << r3
            long r21 = r21 - r35
            long r35 = r24 >> r3
            long r27 = r27 + r35
            long r35 = r35 << r3
            long r24 = r24 - r35
            long r35 = r27 >> r3
            long r29 = r29 + r35
            long r35 = r35 << r3
            long r27 = r27 - r35
            long r35 = r29 >> r3
            long r31 = r31 + r35
            long r35 = r35 << r3
            long r29 = r29 - r35
            long r35 = r31 >> r3
            long r33 = r33 + r35
            long r35 = r35 << r3
            long r31 = r31 - r35
            long r35 = r33 >> r3
            long r37 = r35 << r3
            long r33 = r33 - r37
            long r57 = r57 * r35
            long r1 = r1 + r57
            long r59 = r59 * r35
            long r6 = r6 + r59
            long r61 = r61 * r35
            long r9 = r9 + r61
            long r63 = r63 * r35
            long r12 = r12 - r63
            long r65 = r65 * r35
            long r15 = r15 + r65
            long r35 = r35 * r67
            long r18 = r18 - r35
            r3 = 21
            long r35 = r1 >> r3
            long r6 = r6 + r35
            long r35 = r35 << r3
            long r1 = r1 - r35
            long r35 = r6 >> r3
            long r9 = r9 + r35
            long r35 = r35 << r3
            long r6 = r6 - r35
            long r35 = r9 >> r3
            long r12 = r12 + r35
            long r35 = r35 << r3
            long r9 = r9 - r35
            long r35 = r12 >> r3
            long r15 = r15 + r35
            long r35 = r35 << r3
            long r12 = r12 - r35
            long r35 = r15 >> r3
            long r18 = r18 + r35
            long r35 = r35 << r3
            long r15 = r15 - r35
            long r35 = r18 >> r3
            long r21 = r21 + r35
            long r35 = r35 << r3
            long r18 = r18 - r35
            long r35 = r21 >> r3
            long r24 = r24 + r35
            long r35 = r35 << r3
            long r21 = r21 - r35
            long r35 = r24 >> r3
            long r27 = r27 + r35
            long r35 = r35 << r3
            long r24 = r24 - r35
            long r35 = r27 >> r3
            long r29 = r29 + r35
            long r35 = r35 << r3
            r37 = r12
            long r11 = r27 - r35
            long r13 = r29 >> r3
            long r31 = r31 + r13
            long r13 = r13 << r3
            long r29 = r29 - r13
            long r13 = r31 >> r3
            long r33 = r33 + r13
            long r13 = r13 << r3
            long r31 = r31 - r13
            int r3 = (int) r1
            byte r3 = (byte) r3
            r13 = 0
            r0[r13] = r3
            r3 = 8
            long r13 = r1 >> r3
            int r13 = (int) r13
            byte r13 = (byte) r13
            r0[r20] = r13
            r13 = 16
            long r1 = r1 >> r13
            long r27 = r6 << r8
            long r1 = r1 | r27
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0[r5] = r1
            long r1 = r6 >> r26
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0[r26] = r1
            r1 = 11
            long r1 = r6 >> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0[r17] = r1
            r1 = 19
            long r1 = r6 >> r1
            long r6 = r9 << r5
            long r1 = r1 | r6
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0[r8] = r1
            long r1 = r9 >> r23
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0[r23] = r1
            r1 = 14
            long r1 = r9 >> r1
            r4 = 7
            long r6 = r37 << r4
            long r1 = r1 | r6
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0[r4] = r1
            long r1 = r37 >> r20
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0[r3] = r1
            r1 = 9
            long r1 = r37 >> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 9
            r0[r2] = r1
            r1 = 17
            long r1 = r37 >> r1
            long r6 = r15 << r17
            long r1 = r1 | r6
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 10
            r0[r2] = r1
            long r1 = r15 >> r17
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 11
            r0[r2] = r1
            r1 = 12
            long r1 = r15 >> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 12
            r0[r2] = r1
            r1 = 20
            long r1 = r15 >> r1
            long r6 = r18 << r20
            long r1 = r1 | r6
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 13
            r0[r2] = r1
            r1 = 7
            long r6 = r18 >> r1
            int r1 = (int) r6
            byte r1 = (byte) r1
            r2 = 14
            r0[r2] = r1
            r1 = 15
            long r6 = r18 >> r1
            long r9 = r21 << r23
            long r6 = r6 | r9
            int r2 = (int) r6
            byte r2 = (byte) r2
            r0[r1] = r2
            long r1 = r21 >> r5
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0[r13] = r1
            r1 = 10
            long r1 = r21 >> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 17
            r0[r2] = r1
            r1 = 18
            long r6 = r21 >> r1
            long r9 = r24 << r26
            long r6 = r6 | r9
            int r2 = (int) r6
            byte r2 = (byte) r2
            r0[r1] = r2
            long r1 = r24 >> r8
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 19
            r0[r2] = r1
            r1 = 13
            long r1 = r24 >> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 20
            r0[r2] = r1
            int r1 = (int) r11
            byte r1 = (byte) r1
            r2 = 21
            r0[r2] = r1
            long r1 = r11 >> r3
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 22
            r0[r2] = r1
            long r1 = r11 >> r13
            long r6 = r29 << r8
            long r1 = r1 | r6
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 23
            r0[r2] = r1
            long r1 = r29 >> r26
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 24
            r0[r2] = r1
            r1 = 11
            long r1 = r29 >> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 25
            r0[r2] = r1
            r1 = 19
            long r1 = r29 >> r1
            long r5 = r31 << r5
            long r1 = r1 | r5
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 26
            r0[r2] = r1
            long r1 = r31 >> r23
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 27
            r0[r2] = r1
            r1 = 14
            long r1 = r31 >> r1
            r3 = 7
            long r3 = r33 << r3
            long r1 = r1 | r3
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 28
            r0[r2] = r1
            long r1 = r33 >> r20
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 29
            r0[r2] = r1
            r1 = 9
            long r1 = r33 >> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 30
            r0[r2] = r1
            r1 = 17
            long r1 = r33 >> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r2 = 31
            r0[r2] = r1
            return
    }

    private static com.google.crypto.tink.subtle.Ed25519.XYZ scalarMultWithBase(byte[] r8) {
            r0 = 64
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = r2
        L6:
            r4 = 32
            r5 = 1
            if (r3 >= r4) goto L23
            int r4 = r3 * 2
            r6 = r8[r3]
            r6 = r6 & 15
            byte r6 = (byte) r6
            r1[r4] = r6
            int r4 = r4 + r5
            r5 = r8[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 >> 4
            r5 = r5 & 15
            byte r5 = (byte) r5
            r1[r4] = r5
            int r3 = r3 + 1
            goto L6
        L23:
            r8 = r2
            r3 = r8
        L25:
            r4 = 63
            if (r8 >= r4) goto L3d
            r4 = r1[r8]
            int r4 = r4 + r3
            byte r3 = (byte) r4
            r1[r8] = r3
            int r4 = r3 + 8
            int r4 = r4 >> 4
            int r6 = r4 << 4
            int r3 = r3 - r6
            byte r3 = (byte) r3
            r1[r8] = r3
            int r8 = r8 + 1
            r3 = r4
            goto L25
        L3d:
            r8 = r1[r4]
            int r8 = r8 + r3
            byte r8 = (byte) r8
            r1[r4] = r8
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r8 = new com.google.crypto.tink.subtle.Ed25519$PartialXYZT
            com.google.crypto.tink.subtle.Ed25519$PartialXYZT r3 = com.google.crypto.tink.subtle.Ed25519.NEUTRAL
            r8.<init>(r3)
            com.google.crypto.tink.subtle.Ed25519$XYZT r3 = new com.google.crypto.tink.subtle.Ed25519$XYZT
            r3.<init>()
        L4f:
            if (r5 >= r0) goto L69
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r4 = new com.google.crypto.tink.subtle.Ed25519$CachedXYT
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r6 = com.google.crypto.tink.subtle.Ed25519.CACHED_NEUTRAL
            r4.<init>(r6)
            int r6 = r5 / 2
            r7 = r1[r5]
            select(r4, r6, r7)
            com.google.crypto.tink.subtle.Ed25519$XYZT r6 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r3, r8)
            add(r8, r6, r4)
            int r5 = r5 + 2
            goto L4f
        L69:
            com.google.crypto.tink.subtle.Ed25519$XYZ r4 = new com.google.crypto.tink.subtle.Ed25519$XYZ
            r4.<init>()
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = com.google.crypto.tink.subtle.Ed25519.XYZ.fromPartialXYZT(r4, r8)
            doubleXYZ(r8, r5)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = com.google.crypto.tink.subtle.Ed25519.XYZ.fromPartialXYZT(r4, r8)
            doubleXYZ(r8, r5)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = com.google.crypto.tink.subtle.Ed25519.XYZ.fromPartialXYZT(r4, r8)
            doubleXYZ(r8, r5)
            com.google.crypto.tink.subtle.Ed25519$XYZ r4 = com.google.crypto.tink.subtle.Ed25519.XYZ.fromPartialXYZT(r4, r8)
            doubleXYZ(r8, r4)
        L8a:
            if (r2 >= r0) goto La4
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r4 = new com.google.crypto.tink.subtle.Ed25519$CachedXYT
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r5 = com.google.crypto.tink.subtle.Ed25519.CACHED_NEUTRAL
            r4.<init>(r5)
            int r5 = r2 / 2
            r6 = r1[r2]
            select(r4, r5, r6)
            com.google.crypto.tink.subtle.Ed25519$XYZT r5 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$400(r3, r8)
            add(r8, r5, r4)
            int r2 = r2 + 2
            goto L8a
        La4:
            com.google.crypto.tink.subtle.Ed25519$XYZ r0 = new com.google.crypto.tink.subtle.Ed25519$XYZ
            r0.<init>(r8)
            boolean r8 = r0.isOnCurve()
            if (r8 == 0) goto Lb0
            return r0
        Lb0:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "arithmetic error in scalar multiplication"
            r8.<init>(r0)
            throw r8
    }

    static byte[] scalarMultWithBaseToBytes(byte[] r0) {
            com.google.crypto.tink.subtle.Ed25519$XYZ r0 = scalarMultWithBase(r0)
            byte[] r0 = r0.toBytes()
            return r0
    }

    private static void select(com.google.crypto.tink.subtle.Ed25519.CachedXYT r5, int r6, byte r7) {
            r0 = r7 & 255(0xff, float:3.57E-43)
            r1 = 7
            int r0 = r0 >> r1
            int r2 = -r0
            r2 = r2 & r7
            r3 = 1
            int r2 = r2 << r3
            int r7 = r7 - r2
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r2 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r2 = r2[r6]
            r4 = 0
            r2 = r2[r4]
            int r4 = eq(r7, r3)
            r5.copyConditional(r2, r4)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r2 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r2 = r2[r6]
            r2 = r2[r3]
            r3 = 2
            int r4 = eq(r7, r3)
            r5.copyConditional(r2, r4)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r2 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r2 = r2[r6]
            r2 = r2[r3]
            r3 = 3
            int r4 = eq(r7, r3)
            r5.copyConditional(r2, r4)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r2 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r2 = r2[r6]
            r2 = r2[r3]
            r3 = 4
            int r4 = eq(r7, r3)
            r5.copyConditional(r2, r4)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r2 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r2 = r2[r6]
            r2 = r2[r3]
            r3 = 5
            int r4 = eq(r7, r3)
            r5.copyConditional(r2, r4)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r2 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r2 = r2[r6]
            r2 = r2[r3]
            r3 = 6
            int r4 = eq(r7, r3)
            r5.copyConditional(r2, r4)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r2 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r2 = r2[r6]
            r2 = r2[r3]
            int r3 = eq(r7, r1)
            r5.copyConditional(r2, r3)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r2 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r6 = r2[r6]
            r6 = r6[r1]
            r1 = 8
            int r7 = eq(r7, r1)
            r5.copyConditional(r6, r7)
            long[] r6 = r5.yMinusX
            r7 = 10
            long[] r6 = java.util.Arrays.copyOf(r6, r7)
            long[] r1 = r5.yPlusX
            long[] r1 = java.util.Arrays.copyOf(r1, r7)
            long[] r2 = r5.t2d
            long[] r7 = java.util.Arrays.copyOf(r2, r7)
            neg(r7, r7)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r2 = new com.google.crypto.tink.subtle.Ed25519$CachedXYT
            r2.<init>(r6, r1, r7)
            r5.copyConditional(r2, r0)
            return
    }

    static byte[] sign(byte[] r5, byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            int r0 = r5.length
            r1 = 0
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r1, r0)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r0 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            java.lang.String r2 = "SHA-512"
            java.lang.Object r0 = r0.getInstance(r2)
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0
            r2 = 32
            r0.update(r7, r2, r2)
            r0.update(r5)
            byte[] r3 = r0.digest()
            reduce(r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r4 = scalarMultWithBase(r3)
            byte[] r4 = r4.toBytes()
            byte[] r1 = java.util.Arrays.copyOfRange(r4, r1, r2)
            r0.reset()
            r0.update(r1)
            r0.update(r6)
            r0.update(r5)
            byte[] r5 = r0.digest()
            reduce(r5)
            byte[] r6 = new byte[r2]
            mulAdd(r6, r5, r7, r3)
            byte[][] r5 = new byte[][]{r1, r6}
            byte[] r5 = com.google.crypto.tink.subtle.Bytes.concat(r5)
            return r5
    }

    private static byte[] slide(byte[] r10) {
            r0 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = r2
        L6:
            r4 = 1
            if (r3 >= r0) goto L19
            int r5 = r3 >> 3
            r5 = r10[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = r3 & 7
            int r5 = r5 >> r6
            r4 = r4 & r5
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        L19:
            r10 = r2
        L1a:
            if (r10 >= r0) goto L5e
            r3 = r1[r10]
            if (r3 == 0) goto L5b
            r3 = r4
        L21:
            r5 = 6
            if (r3 > r5) goto L5b
            int r5 = r10 + r3
            if (r5 >= r0) goto L5b
            r6 = r1[r5]
            if (r6 == 0) goto L58
            r7 = r1[r10]
            int r8 = r6 << r3
            int r8 = r8 + r7
            r9 = 15
            if (r8 > r9) goto L3d
            int r6 = r6 << r3
            int r7 = r7 + r6
            byte r6 = (byte) r7
            r1[r10] = r6
            r1[r5] = r2
            goto L58
        L3d:
            int r8 = r6 << r3
            int r8 = r7 - r8
            r9 = -15
            if (r8 < r9) goto L5b
            int r6 = r6 << r3
            int r7 = r7 - r6
            byte r6 = (byte) r7
            r1[r10] = r6
        L4a:
            if (r5 >= r0) goto L58
            r6 = r1[r5]
            if (r6 != 0) goto L53
            r1[r5] = r4
            goto L58
        L53:
            r1[r5] = r2
            int r5 = r5 + 1
            goto L4a
        L58:
            int r3 = r3 + 1
            goto L21
        L5b:
            int r10 = r10 + 1
            goto L1a
        L5e:
            return r1
    }

    private static void sub(com.google.crypto.tink.subtle.Ed25519.PartialXYZT r4, com.google.crypto.tink.subtle.Ed25519.XYZT r5, com.google.crypto.tink.subtle.Ed25519.CachedXYT r6) {
            r0 = 10
            long[] r0 = new long[r0]
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
            long[] r2 = r2.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r5.xyz
            long[] r3 = r3.x
            com.google.crypto.tink.subtle.Field25519.sum(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r5.xyz
            long[] r2 = r2.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r3 = r5.xyz
            long[] r3 = r3.x
            com.google.crypto.tink.subtle.Field25519.sub(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.y
            long[] r3 = r6.yPlusX
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r2 = r4.xyz
            long[] r2 = r2.x
            long[] r3 = r6.yMinusX
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            long[] r1 = r4.t
            long[] r2 = r5.t
            long[] r3 = r6.t2d
            com.google.crypto.tink.subtle.Field25519.mult(r1, r2, r3)
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r5.xyz
            long[] r5 = r5.z
            r6.multByZ(r1, r5)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r6 = r4.xyz
            long[] r6 = r6.x
            com.google.crypto.tink.subtle.Field25519.sum(r0, r5, r6)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.x
            com.google.crypto.tink.subtle.Ed25519$XYZ r6 = r4.xyz
            long[] r6 = r6.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Field25519.sub(r5, r6, r1)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.y
            com.google.crypto.tink.subtle.Ed25519$XYZ r6 = r4.xyz
            long[] r6 = r6.z
            com.google.crypto.tink.subtle.Ed25519$XYZ r1 = r4.xyz
            long[] r1 = r1.y
            com.google.crypto.tink.subtle.Field25519.sum(r5, r6, r1)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = r4.xyz
            long[] r5 = r5.z
            long[] r6 = r4.t
            com.google.crypto.tink.subtle.Field25519.sub(r5, r0, r6)
            long[] r5 = r4.t
            long[] r4 = r4.t
            com.google.crypto.tink.subtle.Field25519.sum(r5, r0, r4)
            return
    }

    static boolean verify(byte[] r5, byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            int r0 = r6.length
            r1 = 0
            r2 = 64
            if (r0 == r2) goto L7
            return r1
        L7:
            r0 = 32
            byte[] r2 = java.util.Arrays.copyOfRange(r6, r0, r2)
            boolean r3 = isSmallerThanGroupOrder(r2)
            if (r3 != 0) goto L14
            return r1
        L14:
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r3 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            java.lang.String r4 = "SHA-512"
            java.lang.Object r3 = r3.getInstance(r4)
            java.security.MessageDigest r3 = (java.security.MessageDigest) r3
            r3.update(r6, r1, r0)
            r3.update(r7)
            r3.update(r5)
            byte[] r5 = r3.digest()
            reduce(r5)
            com.google.crypto.tink.subtle.Ed25519$XYZT r7 = com.google.crypto.tink.subtle.Ed25519.XYZT.access$500(r7)
            com.google.crypto.tink.subtle.Ed25519$XYZ r5 = doubleScalarMultVarTime(r5, r7, r2)
            byte[] r5 = r5.toBytes()
            r7 = r1
        L3b:
            if (r7 >= r0) goto L47
            r2 = r5[r7]
            r3 = r6[r7]
            if (r2 == r3) goto L44
            return r1
        L44:
            int r7 = r7 + 1
            goto L3b
        L47:
            r5 = 1
            return r5
    }
}
