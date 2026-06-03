package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
final class Ed25519Constants {
    static final com.google.crypto.tink.subtle.Ed25519.CachedXYT[] B2 = null;
    static final com.google.crypto.tink.subtle.Ed25519.CachedXYT[][] B_TABLE = null;
    static final long[] D = null;
    static final long[] D2 = null;
    private static final java.math.BigInteger D2_BI = null;
    private static final java.math.BigInteger D_BI = null;
    private static final java.math.BigInteger P_BI = null;
    static final long[] SQRTM1 = null;
    private static final java.math.BigInteger SQRTM1_BI = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.Ed25519Constants$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class Point {
        private java.math.BigInteger x;
        private java.math.BigInteger y;

        private Point() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Point(com.google.crypto.tink.subtle.Ed25519Constants.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.math.BigInteger access$100(com.google.crypto.tink.subtle.Ed25519Constants.Point r0) {
                java.math.BigInteger r0 = r0.y
                return r0
        }

        static /* synthetic */ java.math.BigInteger access$102(com.google.crypto.tink.subtle.Ed25519Constants.Point r0, java.math.BigInteger r1) {
                r0.y = r1
                return r1
        }

        static /* synthetic */ java.math.BigInteger access$200(com.google.crypto.tink.subtle.Ed25519Constants.Point r0) {
                java.math.BigInteger r0 = r0.x
                return r0
        }

        static /* synthetic */ java.math.BigInteger access$202(com.google.crypto.tink.subtle.Ed25519Constants.Point r0, java.math.BigInteger r1) {
                r0.x = r1
                return r1
        }
    }

    static {
            r0 = 2
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
            r3 = 255(0xff, float:3.57E-43)
            java.math.BigInteger r2 = r2.pow(r3)
            r3 = 19
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r2 = r2.subtract(r3)
            com.google.crypto.tink.subtle.Ed25519Constants.P_BI = r2
            r3 = -121665(0xfffffffffffe24bf, double:NaN)
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            r4 = 121666(0x1db42, double:6.0111E-319)
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r4)
            java.math.BigInteger r4 = r4.modInverse(r2)
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r3 = r3.mod(r2)
            com.google.crypto.tink.subtle.Ed25519Constants.D_BI = r3
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r4 = r4.multiply(r3)
            java.math.BigInteger r4 = r4.mod(r2)
            com.google.crypto.tink.subtle.Ed25519Constants.D2_BI = r4
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r1 = java.math.BigInteger.ONE
            java.math.BigInteger r1 = r2.subtract(r1)
            r5 = 4
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r5)
            java.math.BigInteger r1 = r1.divide(r7)
            java.math.BigInteger r0 = r0.modPow(r1, r2)
            com.google.crypto.tink.subtle.Ed25519Constants.SQRTM1_BI = r0
            com.google.crypto.tink.subtle.Ed25519Constants$Point r1 = new com.google.crypto.tink.subtle.Ed25519Constants$Point
            r7 = 0
            r1.<init>(r7)
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r5)
            r6 = 5
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r6)
            java.math.BigInteger r6 = r6.modInverse(r2)
            java.math.BigInteger r5 = r5.multiply(r6)
            java.math.BigInteger r2 = r5.mod(r2)
            com.google.crypto.tink.subtle.Ed25519Constants.Point.access$102(r1, r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r1)
            java.math.BigInteger r2 = recoverX(r2)
            com.google.crypto.tink.subtle.Ed25519Constants.Point.access$202(r1, r2)
            byte[] r2 = toLittleEndian(r3)
            long[] r2 = com.google.crypto.tink.subtle.Field25519.expand(r2)
            com.google.crypto.tink.subtle.Ed25519Constants.D = r2
            byte[] r2 = toLittleEndian(r4)
            long[] r2 = com.google.crypto.tink.subtle.Field25519.expand(r2)
            com.google.crypto.tink.subtle.Ed25519Constants.D2 = r2
            byte[] r0 = toLittleEndian(r0)
            long[] r0 = com.google.crypto.tink.subtle.Field25519.expand(r0)
            com.google.crypto.tink.subtle.Ed25519Constants.SQRTM1 = r0
            r0 = 2
            int[] r0 = new int[r0]
            r2 = 1
            r3 = 8
            r0[r2] = r3
            r2 = 0
            r4 = 32
            r0[r2] = r4
            java.lang.Class<com.google.crypto.tink.subtle.Ed25519$CachedXYT> r5 = com.google.crypto.tink.subtle.Ed25519.CachedXYT.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r5, r0)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r0 = (com.google.crypto.tink.subtle.Ed25519.CachedXYT[][]) r0
            com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE = r0
            r5 = r1
            r0 = r2
        Lbd:
            if (r0 >= r4) goto Le1
            r6 = r2
            r7 = r5
        Lc1:
            if (r6 >= r3) goto Ld4
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[][] r8 = com.google.crypto.tink.subtle.Ed25519Constants.B_TABLE
            r8 = r8[r0]
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r9 = getCachedXYT(r7)
            r8[r6] = r9
            com.google.crypto.tink.subtle.Ed25519Constants$Point r7 = edwards(r7, r5)
            int r6 = r6 + 1
            goto Lc1
        Ld4:
            r6 = r2
        Ld5:
            if (r6 >= r3) goto Lde
            com.google.crypto.tink.subtle.Ed25519Constants$Point r5 = edwards(r5, r5)
            int r6 = r6 + 1
            goto Ld5
        Lde:
            int r0 = r0 + 1
            goto Lbd
        Le1:
            com.google.crypto.tink.subtle.Ed25519Constants$Point r0 = edwards(r1, r1)
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[] r4 = new com.google.crypto.tink.subtle.Ed25519.CachedXYT[r3]
            com.google.crypto.tink.subtle.Ed25519Constants.B2 = r4
        Le9:
            if (r2 >= r3) goto Lfa
            com.google.crypto.tink.subtle.Ed25519$CachedXYT[] r4 = com.google.crypto.tink.subtle.Ed25519Constants.B2
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r5 = getCachedXYT(r1)
            r4[r2] = r5
            com.google.crypto.tink.subtle.Ed25519Constants$Point r1 = edwards(r1, r0)
            int r2 = r2 + 1
            goto Le9
        Lfa:
            return
    }

    private Ed25519Constants() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.subtle.Ed25519Constants.Point edwards(com.google.crypto.tink.subtle.Ed25519Constants.Point r6, com.google.crypto.tink.subtle.Ed25519Constants.Point r7) {
            com.google.crypto.tink.subtle.Ed25519Constants$Point r0 = new com.google.crypto.tink.subtle.Ed25519Constants$Point
            r1 = 0
            r0.<init>(r1)
            java.math.BigInteger r1 = com.google.crypto.tink.subtle.Ed25519Constants.D_BI
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r6)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r7)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r6)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r7)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r1 = r1.multiply(r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r1 = r1.mod(r2)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r6)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r7)
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r7)
            java.math.BigInteger r5 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r6)
            java.math.BigInteger r4 = r4.multiply(r5)
            java.math.BigInteger r3 = r3.add(r4)
            java.math.BigInteger r4 = java.math.BigInteger.ONE
            java.math.BigInteger r4 = r4.add(r1)
            java.math.BigInteger r4 = r4.modInverse(r2)
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r3 = r3.mod(r2)
            com.google.crypto.tink.subtle.Ed25519Constants.Point.access$202(r0, r3)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r6)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r7)
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r6 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r6)
            java.math.BigInteger r7 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r7)
            java.math.BigInteger r6 = r6.multiply(r7)
            java.math.BigInteger r6 = r3.add(r6)
            java.math.BigInteger r7 = java.math.BigInteger.ONE
            java.math.BigInteger r7 = r7.subtract(r1)
            java.math.BigInteger r7 = r7.modInverse(r2)
            java.math.BigInteger r6 = r6.multiply(r7)
            java.math.BigInteger r6 = r6.mod(r2)
            com.google.crypto.tink.subtle.Ed25519Constants.Point.access$102(r0, r6)
            return r0
    }

    private static com.google.crypto.tink.subtle.Ed25519.CachedXYT getCachedXYT(com.google.crypto.tink.subtle.Ed25519Constants.Point r6) {
            com.google.crypto.tink.subtle.Ed25519$CachedXYT r0 = new com.google.crypto.tink.subtle.Ed25519$CachedXYT
            java.math.BigInteger r1 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r6)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r6)
            java.math.BigInteger r1 = r1.add(r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r1 = r1.mod(r2)
            byte[] r1 = toLittleEndian(r1)
            long[] r1 = com.google.crypto.tink.subtle.Field25519.expand(r1)
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r6)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r6)
            java.math.BigInteger r3 = r3.subtract(r4)
            java.math.BigInteger r3 = r3.mod(r2)
            byte[] r3 = toLittleEndian(r3)
            long[] r3 = com.google.crypto.tink.subtle.Field25519.expand(r3)
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.Ed25519Constants.D2_BI
            java.math.BigInteger r5 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$200(r6)
            java.math.BigInteger r4 = r4.multiply(r5)
            java.math.BigInteger r6 = com.google.crypto.tink.subtle.Ed25519Constants.Point.access$100(r6)
            java.math.BigInteger r6 = r4.multiply(r6)
            java.math.BigInteger r6 = r6.mod(r2)
            byte[] r6 = toLittleEndian(r6)
            long[] r6 = com.google.crypto.tink.subtle.Field25519.expand(r6)
            r0.<init>(r1, r3, r6)
            return r0
    }

    private static java.math.BigInteger recoverX(java.math.BigInteger r5) {
            r0 = 2
            java.math.BigInteger r1 = r5.pow(r0)
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            java.math.BigInteger r1 = r1.subtract(r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.D_BI
            java.math.BigInteger r5 = r5.pow(r0)
            java.math.BigInteger r5 = r2.multiply(r5)
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            java.math.BigInteger r5 = r5.add(r2)
            java.math.BigInteger r2 = com.google.crypto.tink.subtle.Ed25519Constants.P_BI
            java.math.BigInteger r5 = r5.modInverse(r2)
            java.math.BigInteger r5 = r1.multiply(r5)
            r3 = 3
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r1 = r2.add(r1)
            r3 = 8
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r1 = r1.divide(r3)
            java.math.BigInteger r1 = r5.modPow(r1, r2)
            java.math.BigInteger r0 = r1.pow(r0)
            java.math.BigInteger r5 = r0.subtract(r5)
            java.math.BigInteger r5 = r5.mod(r2)
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5b
            java.math.BigInteger r5 = com.google.crypto.tink.subtle.Ed25519Constants.SQRTM1_BI
            java.math.BigInteger r5 = r1.multiply(r5)
            java.math.BigInteger r1 = r5.mod(r2)
        L5b:
            r5 = 0
            boolean r5 = r1.testBit(r5)
            if (r5 == 0) goto L66
            java.math.BigInteger r1 = r2.subtract(r1)
        L66:
            return r1
    }

    private static byte[] toLittleEndian(java.math.BigInteger r4) {
            r0 = 32
            byte[] r1 = new byte[r0]
            byte[] r4 = r4.toByteArray()
            int r2 = r4.length
            int r0 = r0 - r2
            int r2 = r4.length
            r3 = 0
            java.lang.System.arraycopy(r4, r3, r1, r0, r2)
        Lf:
            r4 = 16
            if (r3 >= r4) goto L20
            r4 = r1[r3]
            int r0 = 31 - r3
            r2 = r1[r0]
            r1[r3] = r2
            r1[r0] = r4
            int r3 = r3 + 1
            goto Lf
        L20:
            return r1
    }
}
