package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
final class Curve25519 {
    static final byte[][] BANNED_PUBLIC_KEYS = null;

    static {
            r0 = 32
            byte[] r1 = new byte[r0]
            r1 = {x002c: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            byte[] r2 = new byte[r0]
            r2 = {x0040: FILL_ARRAY_DATA , data: [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            byte[] r3 = new byte[r0]
            r3 = {x0054: FILL_ARRAY_DATA , data: [-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0} // fill-array
            byte[] r4 = new byte[r0]
            r4 = {x0068: FILL_ARRAY_DATA , data: [95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87} // fill-array
            byte[] r5 = new byte[r0]
            r5 = {x007c: FILL_ARRAY_DATA , data: [-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127} // fill-array
            byte[] r6 = new byte[r0]
            r6 = {x0090: FILL_ARRAY_DATA , data: [-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127} // fill-array
            byte[] r7 = new byte[r0]
            r7 = {x00a4: FILL_ARRAY_DATA , data: [-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127} // fill-array
            byte[][] r0 = new byte[][]{r1, r2, r3, r4, r5, r6, r7}
            com.google.crypto.tink.subtle.Curve25519.BANNED_PUBLIC_KEYS = r0
            return
    }

    private Curve25519() {
            r0 = this;
            r0.<init>()
            return
    }

    static void copyConditional(long[] r6, long[] r7, int r8) {
            int r8 = -r8
            r0 = 0
        L2:
            r1 = 10
            if (r0 >= r1) goto L16
            r1 = r6[r0]
            int r3 = (int) r1
            r4 = r7[r0]
            int r4 = (int) r4
            r3 = r3 ^ r4
            r3 = r3 & r8
            int r1 = (int) r1
            r1 = r1 ^ r3
            long r1 = (long) r1
            r6[r0] = r1
            int r0 = r0 + 1
            goto L2
        L16:
            return
    }

    static void curveMult(long[] r24, byte[] r25, byte[] r26) throws java.security.InvalidKeyException {
            r0 = r24
            byte[] r1 = validatePubKeyAndClearMsb(r26)
            long[] r1 = com.google.crypto.tink.subtle.Field25519.expand(r1)
            r2 = 19
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r11 = 0
            r5 = 1
            r4[r11] = r5
            long[] r7 = new long[r2]
            r7[r11] = r5
            long[] r8 = new long[r2]
            long[] r9 = new long[r2]
            long[] r10 = new long[r2]
            r10[r11] = r5
            long[] r12 = new long[r2]
            long[] r2 = new long[r2]
            r2[r11] = r5
            r13 = 10
            java.lang.System.arraycopy(r1, r11, r3, r11, r13)
            r14 = r11
        L2d:
            r5 = 32
            if (r14 >= r5) goto La7
            int r5 = 31 - r14
            r5 = r25[r5]
            r15 = r5 & 255(0xff, float:3.57E-43)
            r6 = r9
            r5 = r12
            r12 = r2
            r9 = r4
            r4 = r10
            r10 = r3
            r3 = r11
            r23 = r8
            r8 = r7
            r7 = r23
        L43:
            r2 = 8
            if (r3 >= r2) goto L8b
            int r2 = 7 - r3
            int r2 = r15 >> r2
            r2 = r2 & 1
            swapConditional(r8, r10, r2)
            swapConditional(r7, r9, r2)
            r11 = r2
            r2 = r5
            r16 = r3
            r3 = r12
            r17 = r4
            r4 = r6
            r13 = r5
            r5 = r17
            r18 = r15
            r15 = r6
            r6 = r8
            r19 = r7
            r20 = r8
            r8 = r10
            r21 = r9
            r22 = r10
            r10 = r1
            monty(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            swapConditional(r13, r15, r11)
            r10 = r17
            swapConditional(r12, r10, r11)
            int r3 = r16 + 1
            r9 = r10
            r7 = r12
            r8 = r13
            r10 = r15
            r15 = r18
            r12 = r19
            r5 = r20
            r4 = r21
            r6 = r22
            r11 = 0
            r13 = 10
            goto L43
        L8b:
            r13 = r5
            r15 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r10 = r4
            int r14 = r14 + 1
            r2 = r12
            r12 = r13
            r9 = r15
            r8 = r19
            r7 = r20
            r4 = r21
            r3 = r22
            r11 = 0
            r13 = 10
            goto L2d
        La7:
            r2 = r13
            long[] r2 = new long[r2]
            com.google.crypto.tink.subtle.Field25519.inverse(r2, r8)
            com.google.crypto.tink.subtle.Field25519.mult(r0, r7, r2)
            boolean r0 = isCollinear(r1, r0, r3, r4)
            if (r0 == 0) goto Lb7
            return
        Lb7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Arithmetic error in curve multiplication with the public key: "
            r1.<init>(r2)
            java.lang.String r2 = com.google.crypto.tink.subtle.Hex.encode(r26)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static boolean isCollinear(long[] r8, long[] r9, long[] r10, long[] r11) {
            r0 = 10
            long[] r1 = new long[r0]
            long[] r2 = new long[r0]
            r3 = 11
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            long[] r3 = new long[r3]
            com.google.crypto.tink.subtle.Field25519.mult(r1, r8, r9)
            com.google.crypto.tink.subtle.Field25519.sum(r2, r8, r9)
            long[] r8 = new long[r0]
            r9 = 0
            r6 = 486662(0x76d06, double:2.40443E-318)
            r8[r9] = r6
            com.google.crypto.tink.subtle.Field25519.sum(r5, r2, r8)
            com.google.crypto.tink.subtle.Field25519.mult(r5, r5, r11)
            com.google.crypto.tink.subtle.Field25519.sum(r5, r10)
            com.google.crypto.tink.subtle.Field25519.mult(r5, r5, r1)
            com.google.crypto.tink.subtle.Field25519.mult(r5, r5, r10)
            r8 = 4
            com.google.crypto.tink.subtle.Field25519.scalarProduct(r4, r5, r8)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r4)
            com.google.crypto.tink.subtle.Field25519.mult(r5, r1, r11)
            com.google.crypto.tink.subtle.Field25519.sub(r5, r5, r11)
            com.google.crypto.tink.subtle.Field25519.mult(r3, r2, r10)
            com.google.crypto.tink.subtle.Field25519.sum(r5, r5, r3)
            com.google.crypto.tink.subtle.Field25519.square(r5, r5)
            byte[] r8 = com.google.crypto.tink.subtle.Field25519.contract(r4)
            byte[] r9 = com.google.crypto.tink.subtle.Field25519.contract(r5)
            boolean r8 = com.google.crypto.tink.subtle.Bytes.equal(r8, r9)
            return r8
    }

    private static void monty(long[] r13, long[] r14, long[] r15, long[] r16, long[] r17, long[] r18, long[] r19, long[] r20, long[] r21) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = 10
            long[] r5 = java.util.Arrays.copyOf(r0, r4)
            r6 = 19
            long[] r7 = new long[r6]
            long[] r8 = new long[r6]
            long[] r9 = new long[r6]
            long[] r10 = new long[r6]
            long[] r11 = new long[r6]
            long[] r12 = new long[r6]
            long[] r6 = new long[r6]
            com.google.crypto.tink.subtle.Field25519.sum(r17, r18)
            com.google.crypto.tink.subtle.Field25519.sub(r1, r5)
            long[] r5 = java.util.Arrays.copyOf(r2, r4)
            com.google.crypto.tink.subtle.Field25519.sum(r19, r20)
            com.google.crypto.tink.subtle.Field25519.sub(r3, r5)
            com.google.crypto.tink.subtle.Field25519.product(r10, r2, r1)
            com.google.crypto.tink.subtle.Field25519.product(r11, r0, r3)
            com.google.crypto.tink.subtle.Field25519.reduceSizeByModularReduction(r10)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r10)
            com.google.crypto.tink.subtle.Field25519.reduceSizeByModularReduction(r11)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r11)
            r2 = 0
            java.lang.System.arraycopy(r10, r2, r5, r2, r4)
            com.google.crypto.tink.subtle.Field25519.sum(r10, r11)
            com.google.crypto.tink.subtle.Field25519.sub(r11, r5)
            com.google.crypto.tink.subtle.Field25519.square(r6, r10)
            com.google.crypto.tink.subtle.Field25519.square(r12, r11)
            r3 = r21
            com.google.crypto.tink.subtle.Field25519.product(r11, r12, r3)
            com.google.crypto.tink.subtle.Field25519.reduceSizeByModularReduction(r11)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r11)
            r3 = r15
            java.lang.System.arraycopy(r6, r2, r15, r2, r4)
            r3 = r16
            java.lang.System.arraycopy(r11, r2, r3, r2, r4)
            com.google.crypto.tink.subtle.Field25519.square(r8, r0)
            com.google.crypto.tink.subtle.Field25519.square(r9, r1)
            r0 = r13
            com.google.crypto.tink.subtle.Field25519.product(r13, r8, r9)
            com.google.crypto.tink.subtle.Field25519.reduceSizeByModularReduction(r13)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r13)
            com.google.crypto.tink.subtle.Field25519.sub(r9, r8)
            r0 = 18
            r1 = 0
            java.util.Arrays.fill(r7, r4, r0, r1)
            r0 = 121665(0x1db41, double:6.01105E-319)
            com.google.crypto.tink.subtle.Field25519.scalarProduct(r7, r9, r0)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r7)
            com.google.crypto.tink.subtle.Field25519.sum(r7, r8)
            r0 = r14
            com.google.crypto.tink.subtle.Field25519.product(r14, r9, r7)
            com.google.crypto.tink.subtle.Field25519.reduceSizeByModularReduction(r14)
            com.google.crypto.tink.subtle.Field25519.reduceCoefficients(r14)
            return
    }

    static void swapConditional(long[] r6, long[] r7, int r8) {
            int r8 = -r8
            r0 = 0
        L2:
            r1 = 10
            if (r0 >= r1) goto L1d
            r1 = r6[r0]
            int r3 = (int) r1
            r4 = r7[r0]
            int r4 = (int) r4
            r3 = r3 ^ r4
            r3 = r3 & r8
            int r1 = (int) r1
            r1 = r1 ^ r3
            long r1 = (long) r1
            r6[r0] = r1
            r1 = r7[r0]
            int r1 = (int) r1
            r1 = r1 ^ r3
            long r1 = (long) r1
            r7[r0] = r1
            int r0 = r0 + 1
            goto L2
        L1d:
            return
    }

    private static byte[] validatePubKeyAndClearMsb(byte[] r4) throws java.security.InvalidKeyException {
            int r0 = r4.length
            r1 = 32
            if (r0 != r1) goto L40
            int r0 = r4.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r0)
            r0 = 31
            r1 = r4[r0]
            r1 = r1 & 127(0x7f, float:1.78E-43)
            byte r1 = (byte) r1
            r4[r0] = r1
            r0 = 0
        L14:
            byte[][] r1 = com.google.crypto.tink.subtle.Curve25519.BANNED_PUBLIC_KEYS
            int r2 = r1.length
            if (r0 >= r2) goto L3f
            r2 = r1[r0]
            boolean r2 = com.google.crypto.tink.subtle.Bytes.equal(r2, r4)
            if (r2 != 0) goto L24
            int r0 = r0 + 1
            goto L14
        L24:
            java.security.InvalidKeyException r4 = new java.security.InvalidKeyException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Banned public key: "
            r2.<init>(r3)
            r0 = r1[r0]
            java.lang.String r0 = com.google.crypto.tink.subtle.Hex.encode(r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L3f:
            return r4
        L40:
            java.security.InvalidKeyException r4 = new java.security.InvalidKeyException
            java.lang.String r0 = "Public key length is not 32-byte"
            r4.<init>(r0)
            throw r4
    }
}
