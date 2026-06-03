package org.tukaani.xz.lz;

/* JADX INFO: loaded from: classes2.dex */
final class HC4 extends org.tukaani.xz.lz.LZEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int[] chain;
    private int cyclicPos;
    private final int cyclicSize;
    private final int depthLimit;
    private final org.tukaani.xz.lz.Hash234 hash;
    private int lzPos;
    private final org.tukaani.xz.lz.Matches matches;

    static {
            return
    }

    HC4(int r8, int r9, int r10, int r11, int r12, int r13, org.tukaani.xz.ArrayCache r14) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9 = -1
            r7.cyclicPos = r9
            org.tukaani.xz.lz.Hash234 r9 = new org.tukaani.xz.lz.Hash234
            r9.<init>(r8, r14)
            r7.hash = r9
            int r8 = r8 + 1
            r7.cyclicSize = r8
            r9 = 0
            int[] r9 = r14.getIntArray(r8, r9)
            r7.chain = r9
            r7.lzPos = r8
            org.tukaani.xz.lz.Matches r8 = new org.tukaani.xz.lz.Matches
            int r9 = r11 + (-1)
            r8.<init>(r9)
            r7.matches = r8
            if (r13 <= 0) goto L2d
            goto L31
        L2d:
            int r11 = r11 / 4
            int r13 = r11 + 4
        L31:
            r7.depthLimit = r13
            return
    }

    static int getMemoryUsage(int r1) {
            int r0 = org.tukaani.xz.lz.Hash234.getMemoryUsage(r1)
            int r1 = r1 / 256
            int r0 = r0 + r1
            int r0 = r0 + 10
            return r0
    }

    private int movePos() {
            r4 = this;
            r0 = 4
            int r0 = r4.movePos(r0, r0)
            if (r0 == 0) goto L33
            int r1 = r4.lzPos
            int r1 = r1 + 1
            r4.lzPos = r1
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L26
            int r1 = r4.cyclicSize
            int r2 = r2 - r1
            org.tukaani.xz.lz.Hash234 r1 = r4.hash
            r1.normalize(r2)
            int[] r1 = r4.chain
            int r3 = r4.cyclicSize
            normalize(r1, r3, r2)
            int r1 = r4.lzPos
            int r1 = r1 - r2
            r4.lzPos = r1
        L26:
            int r1 = r4.cyclicPos
            int r1 = r1 + 1
            r4.cyclicPos = r1
            int r2 = r4.cyclicSize
            if (r1 != r2) goto L33
            r1 = 0
            r4.cyclicPos = r1
        L33:
            return r0
    }

    @Override // org.tukaani.xz.lz.LZEncoder
    public org.tukaani.xz.lz.Matches getMatches() {
            r13 = this;
            org.tukaani.xz.lz.Matches r0 = r13.matches
            r1 = 0
            r0.count = r1
            int r0 = r13.matchLenMax
            int r2 = r13.niceLen
            int r3 = r13.movePos()
            if (r3 >= r0) goto L18
            if (r3 != 0) goto L14
            org.tukaani.xz.lz.Matches r0 = r13.matches
            return r0
        L14:
            r0 = r3
            if (r2 <= r3) goto L18
            r2 = r0
        L18:
            org.tukaani.xz.lz.Hash234 r3 = r13.hash
            byte[] r4 = r13.buf
            int r5 = r13.readPos
            r3.calcHashes(r4, r5)
            int r3 = r13.lzPos
            org.tukaani.xz.lz.Hash234 r4 = r13.hash
            int r4 = r4.getHash2Pos()
            int r3 = r3 - r4
            int r4 = r13.lzPos
            org.tukaani.xz.lz.Hash234 r5 = r13.hash
            int r5 = r5.getHash3Pos()
            int r4 = r4 - r5
            org.tukaani.xz.lz.Hash234 r5 = r13.hash
            int r5 = r5.getHash4Pos()
            org.tukaani.xz.lz.Hash234 r6 = r13.hash
            int r7 = r13.lzPos
            r6.updateTables(r7)
            int[] r6 = r13.chain
            int r7 = r13.cyclicPos
            r6[r7] = r5
            int r6 = r13.cyclicSize
            r7 = 1
            if (r3 >= r6) goto L6e
            byte[] r6 = r13.buf
            int r8 = r13.readPos
            int r8 = r8 - r3
            r6 = r6[r8]
            byte[] r8 = r13.buf
            int r9 = r13.readPos
            r8 = r8[r9]
            if (r6 != r8) goto L6e
            org.tukaani.xz.lz.Matches r6 = r13.matches
            int[] r6 = r6.len
            r8 = 2
            r6[r1] = r8
            org.tukaani.xz.lz.Matches r6 = r13.matches
            int[] r6 = r6.dist
            int r9 = r3 + (-1)
            r6[r1] = r9
            org.tukaani.xz.lz.Matches r6 = r13.matches
            r6.count = r7
            goto L6f
        L6e:
            r8 = r1
        L6f:
            r6 = 3
            if (r3 == r4) goto L97
            int r9 = r13.cyclicSize
            if (r4 >= r9) goto L97
            byte[] r9 = r13.buf
            int r10 = r13.readPos
            int r10 = r10 - r4
            r9 = r9[r10]
            byte[] r10 = r13.buf
            int r11 = r13.readPos
            r10 = r10[r11]
            if (r9 != r10) goto L97
            org.tukaani.xz.lz.Matches r3 = r13.matches
            int[] r3 = r3.dist
            org.tukaani.xz.lz.Matches r8 = r13.matches
            int r9 = r8.count
            int r10 = r9 + 1
            r8.count = r10
            int r8 = r4 + (-1)
            r3[r9] = r8
            r3 = r4
            r8 = r6
        L97:
            org.tukaani.xz.lz.Matches r4 = r13.matches
            int r4 = r4.count
            if (r4 <= 0) goto Lb5
            byte[] r4 = r13.buf
            int r9 = r13.readPos
            int r8 = org.tukaani.xz.lz.MatchLength.getLen(r4, r9, r3, r8, r0)
            org.tukaani.xz.lz.Matches r3 = r13.matches
            int[] r3 = r3.len
            org.tukaani.xz.lz.Matches r4 = r13.matches
            int r4 = r4.count
            int r4 = r4 - r7
            r3[r4] = r8
            if (r8 < r2) goto Lb5
            org.tukaani.xz.lz.Matches r0 = r13.matches
            return r0
        Lb5:
            if (r8 >= r6) goto Lb8
            goto Lb9
        Lb8:
            r6 = r8
        Lb9:
            int r3 = r13.depthLimit
        Lbb:
            int r4 = r13.lzPos
            int r4 = r4 - r5
            int r5 = r3 + (-1)
            if (r3 == 0) goto L125
            int r3 = r13.cyclicSize
            if (r4 < r3) goto Lc7
            goto L125
        Lc7:
            int[] r8 = r13.chain
            int r9 = r13.cyclicPos
            int r10 = r9 - r4
            if (r4 <= r9) goto Ld0
            goto Ld1
        Ld0:
            r3 = r1
        Ld1:
            int r10 = r10 + r3
            r3 = r8[r10]
            byte[] r8 = r13.buf
            int r9 = r13.readPos
            int r9 = r9 + r6
            int r9 = r9 - r4
            r8 = r8[r9]
            byte[] r9 = r13.buf
            int r10 = r13.readPos
            int r10 = r10 + r6
            r9 = r9[r10]
            if (r8 != r9) goto L121
            byte[] r8 = r13.buf
            int r9 = r13.readPos
            int r9 = r9 - r4
            r8 = r8[r9]
            byte[] r9 = r13.buf
            int r10 = r13.readPos
            r9 = r9[r10]
            if (r8 != r9) goto L121
            byte[] r8 = r13.buf
            int r9 = r13.readPos
            int r8 = org.tukaani.xz.lz.MatchLength.getLen(r8, r9, r4, r7, r0)
            if (r8 <= r6) goto L121
            org.tukaani.xz.lz.Matches r6 = r13.matches
            int[] r6 = r6.len
            org.tukaani.xz.lz.Matches r9 = r13.matches
            int r9 = r9.count
            r6[r9] = r8
            org.tukaani.xz.lz.Matches r6 = r13.matches
            int[] r6 = r6.dist
            org.tukaani.xz.lz.Matches r9 = r13.matches
            int r9 = r9.count
            int r4 = r4 + (-1)
            r6[r9] = r4
            org.tukaani.xz.lz.Matches r4 = r13.matches
            int r6 = r4.count
            int r6 = r6 + r7
            r4.count = r6
            if (r8 < r2) goto L120
            org.tukaani.xz.lz.Matches r0 = r13.matches
            return r0
        L120:
            r6 = r8
        L121:
            r12 = r5
            r5 = r3
            r3 = r12
            goto Lbb
        L125:
            org.tukaani.xz.lz.Matches r0 = r13.matches
            return r0
    }

    @Override // org.tukaani.xz.lz.LZEncoder
    public void putArraysToCache(org.tukaani.xz.ArrayCache r2) {
            r1 = this;
            int[] r0 = r1.chain
            r2.putArray(r0)
            org.tukaani.xz.lz.Hash234 r0 = r1.hash
            r0.putArraysToCache(r2)
            super.putArraysToCache(r2)
            return
    }

    @Override // org.tukaani.xz.lz.LZEncoder
    public void skip(int r4) {
            r3 = this;
        L0:
            int r0 = r4 + (-1)
            if (r4 <= 0) goto L28
            int r4 = r3.movePos()
            if (r4 == 0) goto L26
            org.tukaani.xz.lz.Hash234 r4 = r3.hash
            byte[] r1 = r3.buf
            int r2 = r3.readPos
            r4.calcHashes(r1, r2)
            int[] r4 = r3.chain
            int r1 = r3.cyclicPos
            org.tukaani.xz.lz.Hash234 r2 = r3.hash
            int r2 = r2.getHash4Pos()
            r4[r1] = r2
            org.tukaani.xz.lz.Hash234 r4 = r3.hash
            int r1 = r3.lzPos
            r4.updateTables(r1)
        L26:
            r4 = r0
            goto L0
        L28:
            return
    }
}
