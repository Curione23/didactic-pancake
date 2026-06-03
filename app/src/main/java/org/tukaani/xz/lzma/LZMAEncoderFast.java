package org.tukaani.xz.lzma;

/* JADX INFO: loaded from: classes2.dex */
final class LZMAEncoderFast extends org.tukaani.xz.lzma.LZMAEncoder {
    private static final int EXTRA_SIZE_AFTER = 272;
    private static final int EXTRA_SIZE_BEFORE = 1;
    private org.tukaani.xz.lz.Matches matches;

    LZMAEncoderFast(org.tukaani.xz.rangecoder.RangeEncoder r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, org.tukaani.xz.ArrayCache r24) {
            r14 = this;
            r0 = 1
            r1 = r20
            int r2 = java.lang.Math.max(r1, r0)
            r3 = 272(0x110, float:3.81E-43)
            r5 = 273(0x111, float:3.83E-43)
            r1 = r19
            r4 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            org.tukaani.xz.lz.LZEncoder r8 = org.tukaani.xz.lz.LZEncoder.getInstance(r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r14
            r7 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0 = 0
            r1 = r14
            r1.matches = r0
            return
    }

    private boolean changePair(int r1, int r2) {
            r0 = this;
            int r2 = r2 >>> 7
            if (r1 >= r2) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    static int getMemoryUsage(int r2, int r3, int r4) {
            r0 = 1
            int r3 = java.lang.Math.max(r3, r0)
            r0 = 272(0x110, float:3.81E-43)
            r1 = 273(0x111, float:3.83E-43)
            int r2 = org.tukaani.xz.lz.LZEncoder.getMemoryUsage(r2, r3, r0, r1, r4)
            return r2
    }

    @Override // org.tukaani.xz.lzma.LZMAEncoder
    int getNextSymbol() {
            r11 = this;
            int r0 = r11.readAhead
            r1 = -1
            if (r0 != r1) goto Lb
            org.tukaani.xz.lz.Matches r0 = r11.getMatches()
            r11.matches = r0
        Lb:
            r11.back = r1
            org.tukaani.xz.lz.LZEncoder r0 = r11.lz
            int r0 = r0.getAvail()
            r1 = 273(0x111, float:3.83E-43)
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L1e
            return r2
        L1e:
            r3 = 0
            r4 = r3
            r5 = r4
            r6 = r5
        L22:
            r7 = 4
            if (r4 >= r7) goto L45
            org.tukaani.xz.lz.LZEncoder r7 = r11.lz
            int[] r8 = r11.reps
            r8 = r8[r4]
            int r7 = r7.getMatchLen(r8, r0)
            if (r7 >= r1) goto L32
            goto L42
        L32:
            int r8 = r11.niceLen
            if (r7 < r8) goto L3e
            r11.back = r4
            int r0 = r7 + (-1)
            r11.skip(r0)
            return r7
        L3e:
            if (r7 <= r5) goto L42
            r6 = r4
            r5 = r7
        L42:
            int r4 = r4 + 1
            goto L22
        L45:
            org.tukaani.xz.lz.Matches r4 = r11.matches
            int r4 = r4.count
            if (r4 <= 0) goto Lba
            org.tukaani.xz.lz.Matches r4 = r11.matches
            int[] r4 = r4.len
            org.tukaani.xz.lz.Matches r8 = r11.matches
            int r8 = r8.count
            int r8 = r8 - r2
            r4 = r4[r8]
            org.tukaani.xz.lz.Matches r8 = r11.matches
            int[] r8 = r8.dist
            org.tukaani.xz.lz.Matches r9 = r11.matches
            int r9 = r9.count
            int r9 = r9 - r2
            r8 = r8[r9]
            int r9 = r11.niceLen
            if (r4 < r9) goto L6e
            int r8 = r8 + r7
            r11.back = r8
            int r0 = r4 + (-1)
            r11.skip(r0)
            return r4
        L6e:
            org.tukaani.xz.lz.Matches r9 = r11.matches
            int r9 = r9.count
            if (r9 <= r2) goto Lb2
            org.tukaani.xz.lz.Matches r9 = r11.matches
            int[] r9 = r9.len
            org.tukaani.xz.lz.Matches r10 = r11.matches
            int r10 = r10.count
            int r10 = r10 - r1
            r9 = r9[r10]
            int r9 = r9 + r2
            if (r4 != r9) goto Lb2
            org.tukaani.xz.lz.Matches r9 = r11.matches
            int[] r9 = r9.dist
            org.tukaani.xz.lz.Matches r10 = r11.matches
            int r10 = r10.count
            int r10 = r10 - r1
            r9 = r9[r10]
            boolean r9 = r11.changePair(r9, r8)
            if (r9 != 0) goto L94
            goto Lb2
        L94:
            org.tukaani.xz.lz.Matches r4 = r11.matches
            int r8 = r4.count
            int r8 = r8 - r2
            r4.count = r8
            org.tukaani.xz.lz.Matches r4 = r11.matches
            int[] r4 = r4.len
            org.tukaani.xz.lz.Matches r8 = r11.matches
            int r8 = r8.count
            int r8 = r8 - r2
            r4 = r4[r8]
            org.tukaani.xz.lz.Matches r8 = r11.matches
            int[] r8 = r8.dist
            org.tukaani.xz.lz.Matches r9 = r11.matches
            int r9 = r9.count
            int r9 = r9 - r2
            r8 = r8[r9]
            goto L6e
        Lb2:
            if (r4 != r1) goto Lbc
            r9 = 128(0x80, float:1.8E-43)
            if (r8 < r9) goto Lbc
            r4 = r2
            goto Lbc
        Lba:
            r4 = r3
            r8 = r4
        Lbc:
            if (r5 < r1) goto Ldb
            int r9 = r5 + 1
            if (r9 >= r4) goto Ld3
            int r9 = r5 + 2
            if (r9 < r4) goto Lca
            r9 = 512(0x200, float:7.17E-43)
            if (r8 >= r9) goto Ld3
        Lca:
            int r9 = r5 + 3
            if (r9 < r4) goto Ldb
            r9 = 32768(0x8000, float:4.5918E-41)
            if (r8 < r9) goto Ldb
        Ld3:
            r11.back = r6
            int r0 = r5 + (-1)
            r11.skip(r0)
            return r5
        Ldb:
            if (r4 < r1) goto L13e
            if (r0 > r1) goto Le0
            goto L13e
        Le0:
            org.tukaani.xz.lz.Matches r0 = r11.getMatches()
            r11.matches = r0
            int r0 = r0.count
            if (r0 <= 0) goto L11d
            org.tukaani.xz.lz.Matches r0 = r11.matches
            int[] r0 = r0.len
            org.tukaani.xz.lz.Matches r5 = r11.matches
            int r5 = r5.count
            int r5 = r5 - r2
            r0 = r0[r5]
            org.tukaani.xz.lz.Matches r5 = r11.matches
            int[] r5 = r5.dist
            org.tukaani.xz.lz.Matches r6 = r11.matches
            int r6 = r6.count
            int r6 = r6 - r2
            r5 = r5[r6]
            if (r0 < r4) goto L104
            if (r5 < r8) goto L11c
        L104:
            int r6 = r4 + 1
            if (r0 != r6) goto L10e
            boolean r9 = r11.changePair(r8, r5)
            if (r9 == 0) goto L11c
        L10e:
            if (r0 > r6) goto L11c
            int r0 = r0 + r2
            if (r0 < r4) goto L11d
            r0 = 3
            if (r4 < r0) goto L11d
            boolean r0 = r11.changePair(r5, r8)
            if (r0 == 0) goto L11d
        L11c:
            return r2
        L11d:
            int r0 = r4 + (-1)
            int r0 = java.lang.Math.max(r0, r1)
        L123:
            if (r3 >= r7) goto L135
            org.tukaani.xz.lz.LZEncoder r1 = r11.lz
            int[] r5 = r11.reps
            r5 = r5[r3]
            int r1 = r1.getMatchLen(r5, r0)
            if (r1 != r0) goto L132
            return r2
        L132:
            int r3 = r3 + 1
            goto L123
        L135:
            int r8 = r8 + r7
            r11.back = r8
            int r0 = r4 + (-2)
            r11.skip(r0)
            return r4
        L13e:
            return r2
    }
}
