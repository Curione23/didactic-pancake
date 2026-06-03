package org.tukaani.xz.lzma;

/* JADX INFO: loaded from: classes2.dex */
final class LZMAEncoderNormal extends org.tukaani.xz.lzma.LZMAEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int EXTRA_SIZE_AFTER = 4096;
    private static final int EXTRA_SIZE_BEFORE = 4096;
    private static final int OPTS = 4096;
    private org.tukaani.xz.lz.Matches matches;
    private final org.tukaani.xz.lzma.State nextState;
    private int optCur;
    private int optEnd;
    private final org.tukaani.xz.lzma.Optimum[] opts;
    private final int[] repLens;

    static {
            return
    }

    LZMAEncoderNormal(org.tukaani.xz.rangecoder.RangeEncoder r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, org.tukaani.xz.ArrayCache r20) {
            r10 = this;
            r8 = r10
            r9 = 4096(0x1000, float:5.74E-42)
            r0 = r16
            int r1 = java.lang.Math.max(r0, r9)
            r2 = 4096(0x1000, float:5.74E-42)
            r4 = 273(0x111, float:3.83E-43)
            r0 = r15
            r3 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            org.tukaani.xz.lz.LZEncoder r2 = org.tukaani.xz.lz.LZEncoder.getInstance(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = r10
            r1 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            org.tukaani.xz.lzma.Optimum[] r0 = new org.tukaani.xz.lzma.Optimum[r9]
            r8.opts = r0
            r0 = 0
            r8.optCur = r0
            r8.optEnd = r0
            r1 = 4
            int[] r1 = new int[r1]
            r8.repLens = r1
            org.tukaani.xz.lzma.State r1 = new org.tukaani.xz.lzma.State
            r1.<init>()
            r8.nextState = r1
        L3a:
            if (r0 >= r9) goto L48
            org.tukaani.xz.lzma.Optimum[] r1 = r8.opts
            org.tukaani.xz.lzma.Optimum r2 = new org.tukaani.xz.lzma.Optimum
            r2.<init>()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L3a
        L48:
            return
    }

    private void calc1BytePrices(int r12, int r13, int r14, int r15) {
            r11 = this;
            org.tukaani.xz.lz.LZEncoder r0 = r11.lz
            r1 = 0
            int r0 = r0.getByte(r1)
            org.tukaani.xz.lz.LZEncoder r2 = r11.lz
            org.tukaani.xz.lzma.Optimum[] r3 = r11.opts
            int r4 = r11.optCur
            r3 = r3[r4]
            int[] r3 = r3.reps
            r3 = r3[r1]
            r8 = 1
            int r3 = r3 + r8
            int r9 = r2.getByte(r3)
            org.tukaani.xz.lzma.Optimum[] r2 = r11.opts
            int r3 = r11.optCur
            r2 = r2[r3]
            int r10 = r2.price
            org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r2 = r11.literalEncoder
            org.tukaani.xz.lz.LZEncoder r3 = r11.lz
            int r5 = r3.getByte(r8)
            org.tukaani.xz.lzma.Optimum[] r3 = r11.opts
            int r4 = r11.optCur
            r3 = r3[r4]
            org.tukaani.xz.lzma.State r7 = r3.state
            r3 = r0
            r4 = r9
            r6 = r12
            int r2 = r2.getPrice(r3, r4, r5, r6, r7)
            int r10 = r10 + r2
            org.tukaani.xz.lzma.Optimum[] r2 = r11.opts
            int r3 = r11.optCur
            int r3 = r3 + r8
            r2 = r2[r3]
            int r2 = r2.price
            if (r10 >= r2) goto L52
            org.tukaani.xz.lzma.Optimum[] r2 = r11.opts
            int r3 = r11.optCur
            int r4 = r3 + 1
            r2 = r2[r4]
            r4 = -1
            r2.set1(r10, r3, r4)
            r2 = r8
            goto L53
        L52:
            r2 = r1
        L53:
            if (r9 != r0) goto L8e
            org.tukaani.xz.lzma.Optimum[] r3 = r11.opts
            int r4 = r11.optCur
            int r4 = r4 + r8
            r3 = r3[r4]
            int r3 = r3.optPrev
            int r4 = r11.optCur
            if (r3 == r4) goto L6b
            org.tukaani.xz.lzma.Optimum[] r3 = r11.opts
            int r4 = r4 + r8
            r3 = r3[r4]
            int r3 = r3.backPrev
            if (r3 == 0) goto L8e
        L6b:
            org.tukaani.xz.lzma.Optimum[] r3 = r11.opts
            int r4 = r11.optCur
            r3 = r3[r4]
            org.tukaani.xz.lzma.State r3 = r3.state
            int r13 = r11.getShortRepPrice(r15, r3, r13)
            org.tukaani.xz.lzma.Optimum[] r15 = r11.opts
            int r3 = r11.optCur
            int r3 = r3 + r8
            r15 = r15[r3]
            int r15 = r15.price
            if (r13 > r15) goto L8e
            org.tukaani.xz.lzma.Optimum[] r15 = r11.opts
            int r2 = r11.optCur
            int r3 = r2 + 1
            r15 = r15[r3]
            r15.set1(r13, r2, r1)
            r2 = r8
        L8e:
            if (r2 != 0) goto Lf0
            if (r9 == r0) goto Lf0
            r13 = 2
            if (r14 <= r13) goto Lf0
            int r15 = r11.niceLen
            int r14 = r14 - r8
            int r14 = java.lang.Math.min(r15, r14)
            org.tukaani.xz.lz.LZEncoder r15 = r11.lz
            org.tukaani.xz.lzma.Optimum[] r0 = r11.opts
            int r2 = r11.optCur
            r0 = r0[r2]
            int[] r0 = r0.reps
            r0 = r0[r1]
            int r14 = r15.getMatchLen(r8, r0, r14)
            if (r14 < r13) goto Lf0
            org.tukaani.xz.lzma.State r13 = r11.nextState
            org.tukaani.xz.lzma.Optimum[] r15 = r11.opts
            int r0 = r11.optCur
            r15 = r15[r0]
            org.tukaani.xz.lzma.State r15 = r15.state
            r13.set(r15)
            org.tukaani.xz.lzma.State r13 = r11.nextState
            r13.updateLiteral()
            int r12 = r12 + r8
            int r13 = r11.posMask
            r12 = r12 & r13
            org.tukaani.xz.lzma.State r13 = r11.nextState
            int r12 = r11.getLongRepAndLenPrice(r1, r14, r13, r12)
            int r10 = r10 + r12
            int r12 = r11.optCur
            int r12 = r12 + r8
            int r12 = r12 + r14
        Lcf:
            int r13 = r11.optEnd
            if (r13 >= r12) goto Ldf
            org.tukaani.xz.lzma.Optimum[] r14 = r11.opts
            int r13 = r13 + 1
            r11.optEnd = r13
            r13 = r14[r13]
            r13.reset()
            goto Lcf
        Ldf:
            org.tukaani.xz.lzma.Optimum[] r13 = r11.opts
            r13 = r13[r12]
            int r13 = r13.price
            if (r10 >= r13) goto Lf0
            org.tukaani.xz.lzma.Optimum[] r13 = r11.opts
            r12 = r13[r12]
            int r13 = r11.optCur
            r12.set2(r10, r13, r1)
        Lf0:
            return
    }

    private int calcLongRepPrices(int r23, int r24, int r25, int r26) {
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r25
            int r3 = r0.niceLen
            int r3 = java.lang.Math.min(r2, r3)
            r4 = 2
            r5 = 0
            r6 = r4
            r12 = r5
        L10:
            r7 = 4
            if (r12 >= r7) goto L10e
            org.tukaani.xz.lz.LZEncoder r7 = r0.lz
            org.tukaani.xz.lzma.Optimum[] r8 = r0.opts
            int r9 = r0.optCur
            r8 = r8[r9]
            int[] r8 = r8.reps
            r8 = r8[r12]
            int r10 = r7.getMatchLen(r8, r3)
            if (r10 >= r4) goto L29
            r13 = r26
            goto L10a
        L29:
            int r7 = r0.optEnd
            int r8 = r0.optCur
            int r9 = r8 + r10
            if (r7 >= r9) goto L3d
            org.tukaani.xz.lzma.Optimum[] r8 = r0.opts
            int r7 = r7 + 1
            r0.optEnd = r7
            r7 = r8[r7]
            r7.reset()
            goto L29
        L3d:
            org.tukaani.xz.lzma.Optimum[] r7 = r0.opts
            r7 = r7[r8]
            org.tukaani.xz.lzma.State r7 = r7.state
            r13 = r26
            int r7 = r0.getLongRepPrice(r13, r12, r7, r1)
            r8 = r10
        L4a:
            if (r8 < r4) goto L6c
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r9 = r0.repLenEncoder
            int r9 = r9.getPrice(r8, r1)
            int r9 = r9 + r7
            org.tukaani.xz.lzma.Optimum[] r11 = r0.opts
            int r14 = r0.optCur
            int r14 = r14 + r8
            r11 = r11[r14]
            int r11 = r11.price
            if (r9 >= r11) goto L69
            org.tukaani.xz.lzma.Optimum[] r11 = r0.opts
            int r14 = r0.optCur
            int r15 = r14 + r8
            r11 = r11[r15]
            r11.set1(r9, r14, r12)
        L69:
            int r8 = r8 + (-1)
            goto L4a
        L6c:
            if (r12 != 0) goto L70
            int r6 = r10 + 1
        L70:
            r14 = r6
            int r6 = r2 - r10
            r8 = 1
            int r6 = r6 - r8
            if (r6 >= r4) goto L79
            goto L109
        L79:
            int r9 = r0.niceLen
            if (r6 <= r9) goto L7f
            int r6 = r0.niceLen
        L7f:
            org.tukaani.xz.lz.LZEncoder r9 = r0.lz
            int r11 = r10 + 1
            org.tukaani.xz.lzma.Optimum[] r15 = r0.opts
            int r8 = r0.optCur
            r8 = r15[r8]
            int[] r8 = r8.reps
            r8 = r8[r12]
            int r6 = r9.getMatchLen(r11, r8, r6)
            if (r6 < r4) goto L109
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r8 = r0.repLenEncoder
            int r8 = r8.getPrice(r10, r1)
            int r7 = r7 + r8
            org.tukaani.xz.lzma.State r8 = r0.nextState
            org.tukaani.xz.lzma.Optimum[] r9 = r0.opts
            int r11 = r0.optCur
            r9 = r9[r11]
            org.tukaani.xz.lzma.State r9 = r9.state
            r8.set(r9)
            org.tukaani.xz.lzma.State r8 = r0.nextState
            r8.updateLongRep()
            org.tukaani.xz.lz.LZEncoder r8 = r0.lz
            int r17 = r8.getByte(r10, r5)
            org.tukaani.xz.lz.LZEncoder r8 = r0.lz
            int r18 = r8.getByte(r5)
            org.tukaani.xz.lz.LZEncoder r8 = r0.lz
            r9 = 1
            int r19 = r8.getByte(r10, r9)
            org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r8 = r0.literalEncoder
            int r9 = r23 + r10
            org.tukaani.xz.lzma.State r11 = r0.nextState
            r16 = r8
            r20 = r9
            r21 = r11
            int r8 = r16.getPrice(r17, r18, r19, r20, r21)
            int r7 = r7 + r8
            org.tukaani.xz.lzma.State r8 = r0.nextState
            r8.updateLiteral()
            r8 = 1
            int r9 = r9 + r8
            int r11 = r0.posMask
            r9 = r9 & r11
            org.tukaani.xz.lzma.State r11 = r0.nextState
            int r9 = r0.getLongRepAndLenPrice(r5, r6, r11, r9)
            int r7 = r7 + r9
            int r9 = r0.optCur
            int r9 = r9 + r10
            int r9 = r9 + r8
            int r9 = r9 + r6
        Le6:
            int r6 = r0.optEnd
            if (r6 >= r9) goto Lf6
            org.tukaani.xz.lzma.Optimum[] r8 = r0.opts
            int r6 = r6 + 1
            r0.optEnd = r6
            r6 = r8[r6]
            r6.reset()
            goto Le6
        Lf6:
            org.tukaani.xz.lzma.Optimum[] r6 = r0.opts
            r6 = r6[r9]
            int r6 = r6.price
            if (r7 >= r6) goto L109
            org.tukaani.xz.lzma.Optimum[] r6 = r0.opts
            r6 = r6[r9]
            int r8 = r0.optCur
            r11 = 0
            r9 = r12
            r6.set3(r7, r8, r9, r10, r11)
        L109:
            r6 = r14
        L10a:
            int r12 = r12 + 1
            goto L10
        L10e:
            return r6
    }

    private void calcNormalMatchPrices(int r21, int r22, int r23, int r24, int r25) {
            r20 = this;
            r0 = r20
            r1 = r23
            r2 = r25
            org.tukaani.xz.lz.Matches r3 = r0.matches
            int[] r3 = r3.len
            org.tukaani.xz.lz.Matches r4 = r0.matches
            int r4 = r4.count
            r5 = 1
            int r4 = r4 - r5
            r3 = r3[r4]
            r4 = 0
            if (r3 <= r1) goto L3b
            org.tukaani.xz.lz.Matches r3 = r0.matches
            r3.count = r4
        L19:
            org.tukaani.xz.lz.Matches r3 = r0.matches
            int[] r3 = r3.len
            org.tukaani.xz.lz.Matches r6 = r0.matches
            int r6 = r6.count
            r3 = r3[r6]
            if (r3 >= r1) goto L2d
            org.tukaani.xz.lz.Matches r3 = r0.matches
            int r6 = r3.count
            int r6 = r6 + r5
            r3.count = r6
            goto L19
        L2d:
            org.tukaani.xz.lz.Matches r3 = r0.matches
            int[] r3 = r3.len
            org.tukaani.xz.lz.Matches r6 = r0.matches
            int r7 = r6.count
            int r8 = r7 + 1
            r6.count = r8
            r3[r7] = r1
        L3b:
            org.tukaani.xz.lz.Matches r3 = r0.matches
            int[] r3 = r3.len
            org.tukaani.xz.lz.Matches r6 = r0.matches
            int r6 = r6.count
            int r6 = r6 - r5
            r3 = r3[r6]
            if (r3 >= r2) goto L49
            return
        L49:
            int r3 = r0.optEnd
            int r6 = r0.optCur
            org.tukaani.xz.lz.Matches r7 = r0.matches
            int[] r7 = r7.len
            org.tukaani.xz.lz.Matches r8 = r0.matches
            int r8 = r8.count
            int r8 = r8 - r5
            r7 = r7[r8]
            int r6 = r6 + r7
            if (r3 >= r6) goto L68
            org.tukaani.xz.lzma.Optimum[] r3 = r0.opts
            int r6 = r0.optEnd
            int r6 = r6 + r5
            r0.optEnd = r6
            r3 = r3[r6]
            r3.reset()
            goto L49
        L68:
            org.tukaani.xz.lzma.Optimum[] r3 = r0.opts
            int r6 = r0.optCur
            r3 = r3[r6]
            org.tukaani.xz.lzma.State r3 = r3.state
            r6 = r24
            int r3 = r0.getNormalMatchPrice(r6, r3)
            r6 = r4
        L77:
            org.tukaani.xz.lz.Matches r7 = r0.matches
            int[] r7 = r7.len
            r7 = r7[r6]
            if (r2 <= r7) goto L82
            int r6 = r6 + 1
            goto L77
        L82:
            org.tukaani.xz.lz.Matches r7 = r0.matches
            int[] r7 = r7.dist
            r7 = r7[r6]
            r13 = r22
            int r8 = r0.getMatchAndLenPrice(r3, r7, r2, r13)
            org.tukaani.xz.lzma.Optimum[] r9 = r0.opts
            int r10 = r0.optCur
            int r10 = r10 + r2
            r9 = r9[r10]
            int r9 = r9.price
            if (r8 >= r9) goto La6
            org.tukaani.xz.lzma.Optimum[] r9 = r0.opts
            int r10 = r0.optCur
            int r11 = r10 + r2
            r9 = r9[r11]
            int r11 = r7 + 4
            r9.set1(r8, r10, r11)
        La6:
            org.tukaani.xz.lz.Matches r9 = r0.matches
            int[] r9 = r9.len
            r9 = r9[r6]
            if (r2 == r9) goto Lb0
            goto L13f
        Lb0:
            int r9 = r1 - r2
            int r9 = r9 - r5
            r10 = 2
            if (r9 < r10) goto L136
            int r11 = r0.niceLen
            if (r9 <= r11) goto Lbc
            int r9 = r0.niceLen
        Lbc:
            org.tukaani.xz.lz.LZEncoder r11 = r0.lz
            int r12 = r2 + 1
            int r9 = r11.getMatchLen(r12, r7, r9)
            if (r9 < r10) goto L136
            org.tukaani.xz.lzma.State r10 = r0.nextState
            org.tukaani.xz.lzma.Optimum[] r11 = r0.opts
            int r12 = r0.optCur
            r11 = r11[r12]
            org.tukaani.xz.lzma.State r11 = r11.state
            r10.set(r11)
            org.tukaani.xz.lzma.State r10 = r0.nextState
            r10.updateMatch()
            org.tukaani.xz.lz.LZEncoder r10 = r0.lz
            int r15 = r10.getByte(r2, r4)
            org.tukaani.xz.lz.LZEncoder r10 = r0.lz
            int r16 = r10.getByte(r4)
            org.tukaani.xz.lz.LZEncoder r10 = r0.lz
            int r17 = r10.getByte(r2, r5)
            org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r14 = r0.literalEncoder
            int r10 = r21 + r2
            org.tukaani.xz.lzma.State r11 = r0.nextState
            r18 = r10
            r19 = r11
            int r11 = r14.getPrice(r15, r16, r17, r18, r19)
            int r8 = r8 + r11
            org.tukaani.xz.lzma.State r11 = r0.nextState
            r11.updateLiteral()
            int r10 = r10 + r5
            int r11 = r0.posMask
            r10 = r10 & r11
            org.tukaani.xz.lzma.State r11 = r0.nextState
            int r10 = r0.getLongRepAndLenPrice(r4, r9, r11, r10)
            int r8 = r8 + r10
            int r10 = r0.optCur
            int r10 = r10 + r2
            int r10 = r10 + r5
            int r10 = r10 + r9
        L10e:
            int r9 = r0.optEnd
            if (r9 >= r10) goto L11e
            org.tukaani.xz.lzma.Optimum[] r11 = r0.opts
            int r9 = r9 + 1
            r0.optEnd = r9
            r9 = r11[r9]
            r9.reset()
            goto L10e
        L11e:
            org.tukaani.xz.lzma.Optimum[] r9 = r0.opts
            r9 = r9[r10]
            int r9 = r9.price
            if (r8 >= r9) goto L136
            org.tukaani.xz.lzma.Optimum[] r9 = r0.opts
            r9 = r9[r10]
            int r10 = r0.optCur
            int r11 = r7 + 4
            r12 = 0
            r7 = r9
            r9 = r10
            r10 = r11
            r11 = r2
            r7.set3(r8, r9, r10, r11, r12)
        L136:
            int r6 = r6 + 1
            org.tukaani.xz.lz.Matches r7 = r0.matches
            int r7 = r7.count
            if (r6 != r7) goto L13f
            return
        L13f:
            int r2 = r2 + 1
            goto L82
    }

    private int convertOpts() {
            r4 = this;
            int r0 = r4.optCur
            r4.optEnd = r0
            org.tukaani.xz.lzma.Optimum[] r1 = r4.opts
            r0 = r1[r0]
            int r0 = r0.optPrev
        La:
            org.tukaani.xz.lzma.Optimum[] r1 = r4.opts
            int r2 = r4.optCur
            r1 = r1[r2]
            boolean r2 = r1.prev1IsLiteral
            if (r2 == 0) goto L3f
            org.tukaani.xz.lzma.Optimum[] r2 = r4.opts
            r2 = r2[r0]
            int r3 = r4.optCur
            r2.optPrev = r3
            org.tukaani.xz.lzma.Optimum[] r2 = r4.opts
            r2 = r2[r0]
            r3 = -1
            r2.backPrev = r3
            int r2 = r0 + (-1)
            r4.optCur = r0
            boolean r3 = r1.hasPrev2
            if (r3 == 0) goto L3e
            org.tukaani.xz.lzma.Optimum[] r3 = r4.opts
            r3 = r3[r2]
            r3.optPrev = r0
            org.tukaani.xz.lzma.Optimum[] r0 = r4.opts
            r0 = r0[r2]
            int r3 = r1.backPrev2
            r0.backPrev = r3
            r4.optCur = r2
            int r0 = r1.optPrev2
            goto L3f
        L3e:
            r0 = r2
        L3f:
            org.tukaani.xz.lzma.Optimum[] r1 = r4.opts
            r1 = r1[r0]
            int r1 = r1.optPrev
            org.tukaani.xz.lzma.Optimum[] r2 = r4.opts
            r2 = r2[r0]
            int r3 = r4.optCur
            r2.optPrev = r3
            r4.optCur = r0
            if (r0 > 0) goto L65
            org.tukaani.xz.lzma.Optimum[] r0 = r4.opts
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.optPrev
            r4.optCur = r0
            org.tukaani.xz.lzma.Optimum[] r1 = r4.opts
            r0 = r1[r0]
            int r0 = r0.backPrev
            r4.back = r0
            int r0 = r4.optCur
            return r0
        L65:
            r0 = r1
            goto La
    }

    static int getMemoryUsage(int r2, int r3, int r4) {
            r0 = 4096(0x1000, float:5.74E-42)
            int r3 = java.lang.Math.max(r3, r0)
            r1 = 273(0x111, float:3.83E-43)
            int r2 = org.tukaani.xz.lz.LZEncoder.getMemoryUsage(r2, r3, r0, r1, r4)
            int r2 = r2 + 256
            return r2
    }

    private void updateOptStateAndReps() {
            r7 = this;
            org.tukaani.xz.lzma.Optimum[] r0 = r7.opts
            int r1 = r7.optCur
            r0 = r0[r1]
            int r0 = r0.optPrev
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r2 = r7.optCur
            r1 = r1[r2]
            boolean r1 = r1.prev1IsLiteral
            r2 = 4
            if (r1 == 0) goto L75
            int r0 = r0 + (-1)
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            boolean r1 = r1.hasPrev2
            if (r1 == 0) goto L58
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            org.tukaani.xz.lzma.State r1 = r1.state
            org.tukaani.xz.lzma.Optimum[] r3 = r7.opts
            int r4 = r7.optCur
            r4 = r3[r4]
            int r4 = r4.optPrev2
            r3 = r3[r4]
            org.tukaani.xz.lzma.State r3 = r3.state
            r1.set(r3)
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            int r1 = r1.backPrev2
            if (r1 >= r2) goto L4c
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            org.tukaani.xz.lzma.State r1 = r1.state
            r1.updateLongRep()
            goto L69
        L4c:
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            org.tukaani.xz.lzma.State r1 = r1.state
            r1.updateMatch()
            goto L69
        L58:
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            org.tukaani.xz.lzma.State r1 = r1.state
            org.tukaani.xz.lzma.Optimum[] r3 = r7.opts
            r3 = r3[r0]
            org.tukaani.xz.lzma.State r3 = r3.state
            r1.set(r3)
        L69:
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            org.tukaani.xz.lzma.State r1 = r1.state
            r1.updateLiteral()
            goto L86
        L75:
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            org.tukaani.xz.lzma.State r1 = r1.state
            org.tukaani.xz.lzma.Optimum[] r3 = r7.opts
            r3 = r3[r0]
            org.tukaani.xz.lzma.State r3 = r3.state
            r1.set(r3)
        L86:
            int r1 = r7.optCur
            int r3 = r1 + (-1)
            r4 = 0
            if (r0 != r3) goto Lbf
            org.tukaani.xz.lzma.Optimum[] r3 = r7.opts
            r1 = r3[r1]
            int r1 = r1.backPrev
            if (r1 != 0) goto La1
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            org.tukaani.xz.lzma.State r1 = r1.state
            r1.updateShortRep()
            goto Lac
        La1:
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            org.tukaani.xz.lzma.State r1 = r1.state
            r1.updateLiteral()
        Lac:
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            r0 = r1[r0]
            int[] r0 = r0.reps
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            int[] r1 = r1.reps
            java.lang.System.arraycopy(r0, r4, r1, r4, r2)
            goto L170
        Lbf:
            org.tukaani.xz.lzma.Optimum[] r3 = r7.opts
            r1 = r3[r1]
            boolean r1 = r1.prev1IsLiteral
            if (r1 == 0) goto Led
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            boolean r1 = r1.hasPrev2
            if (r1 == 0) goto Led
            org.tukaani.xz.lzma.Optimum[] r0 = r7.opts
            int r1 = r7.optCur
            r0 = r0[r1]
            int r0 = r0.optPrev2
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            int r1 = r1.backPrev2
            org.tukaani.xz.lzma.Optimum[] r3 = r7.opts
            int r5 = r7.optCur
            r3 = r3[r5]
            org.tukaani.xz.lzma.State r3 = r3.state
            r3.updateLongRep()
            goto L10e
        Led:
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r3 = r7.optCur
            r1 = r1[r3]
            int r1 = r1.backPrev
            if (r1 >= r2) goto L103
            org.tukaani.xz.lzma.Optimum[] r3 = r7.opts
            int r5 = r7.optCur
            r3 = r3[r5]
            org.tukaani.xz.lzma.State r3 = r3.state
            r3.updateLongRep()
            goto L10e
        L103:
            org.tukaani.xz.lzma.Optimum[] r3 = r7.opts
            int r5 = r7.optCur
            r3 = r3[r5]
            org.tukaani.xz.lzma.State r3 = r3.state
            r3.updateMatch()
        L10e:
            r3 = 1
            if (r1 >= r2) goto L153
            org.tukaani.xz.lzma.Optimum[] r5 = r7.opts
            int r6 = r7.optCur
            r5 = r5[r6]
            int[] r5 = r5.reps
            org.tukaani.xz.lzma.Optimum[] r6 = r7.opts
            r6 = r6[r0]
            int[] r6 = r6.reps
            r6 = r6[r1]
            r5[r4] = r6
        L123:
            if (r3 > r1) goto L13c
            org.tukaani.xz.lzma.Optimum[] r4 = r7.opts
            int r5 = r7.optCur
            r4 = r4[r5]
            int[] r4 = r4.reps
            org.tukaani.xz.lzma.Optimum[] r5 = r7.opts
            r5 = r5[r0]
            int[] r5 = r5.reps
            int r6 = r3 + (-1)
            r5 = r5[r6]
            r4[r3] = r5
            int r3 = r3 + 1
            goto L123
        L13c:
            if (r3 >= r2) goto L170
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r4 = r7.optCur
            r1 = r1[r4]
            int[] r1 = r1.reps
            org.tukaani.xz.lzma.Optimum[] r4 = r7.opts
            r4 = r4[r0]
            int[] r4 = r4.reps
            r4 = r4[r3]
            r1[r3] = r4
            int r3 = r3 + 1
            goto L13c
        L153:
            org.tukaani.xz.lzma.Optimum[] r5 = r7.opts
            int r6 = r7.optCur
            r5 = r5[r6]
            int[] r5 = r5.reps
            int r1 = r1 - r2
            r5[r4] = r1
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            r0 = r1[r0]
            int[] r0 = r0.reps
            org.tukaani.xz.lzma.Optimum[] r1 = r7.opts
            int r2 = r7.optCur
            r1 = r1[r2]
            int[] r1 = r1.reps
            r2 = 3
            java.lang.System.arraycopy(r0, r4, r1, r3, r2)
        L170:
            return
    }

    @Override // org.tukaani.xz.lzma.LZMAEncoder
    int getNextSymbol() {
            r18 = this;
            r6 = r18
            int r0 = r6.optCur
            int r1 = r6.optEnd
            if (r0 >= r1) goto L22
            org.tukaani.xz.lzma.Optimum[] r1 = r6.opts
            r0 = r1[r0]
            int r0 = r0.optPrev
            int r1 = r6.optCur
            int r0 = r0 - r1
            org.tukaani.xz.lzma.Optimum[] r2 = r6.opts
            r1 = r2[r1]
            int r1 = r1.optPrev
            r6.optCur = r1
            org.tukaani.xz.lzma.Optimum[] r2 = r6.opts
            r1 = r2[r1]
            int r1 = r1.backPrev
            r6.back = r1
            return r0
        L22:
            r0 = 0
            r6.optCur = r0
            r6.optEnd = r0
            r7 = -1
            r6.back = r7
            int r1 = r6.readAhead
            if (r1 != r7) goto L34
            org.tukaani.xz.lz.Matches r1 = r18.getMatches()
            r6.matches = r1
        L34:
            org.tukaani.xz.lz.LZEncoder r1 = r6.lz
            int r1 = r1.getAvail()
            r2 = 273(0x111, float:3.83E-43)
            int r1 = java.lang.Math.min(r1, r2)
            r8 = 2
            r9 = 1
            if (r1 >= r8) goto L45
            return r9
        L45:
            r2 = r0
            r3 = r2
        L47:
            r4 = 4
            if (r2 >= r4) goto L69
            int[] r4 = r6.repLens
            org.tukaani.xz.lz.LZEncoder r5 = r6.lz
            int[] r10 = r6.reps
            r10 = r10[r2]
            int r5 = r5.getMatchLen(r10, r1)
            r4[r2] = r5
            int[] r4 = r6.repLens
            r5 = r4[r2]
            if (r5 >= r8) goto L61
            r4[r2] = r0
            goto L66
        L61:
            r4 = r4[r3]
            if (r5 <= r4) goto L66
            r3 = r2
        L66:
            int r2 = r2 + 1
            goto L47
        L69:
            int[] r1 = r6.repLens
            r1 = r1[r3]
            int r2 = r6.niceLen
            if (r1 < r2) goto L80
            r6.back = r3
            int[] r0 = r6.repLens
            r0 = r0[r3]
            int r0 = r0 - r9
            r6.skip(r0)
            int[] r0 = r6.repLens
            r0 = r0[r3]
            return r0
        L80:
            org.tukaani.xz.lz.Matches r1 = r6.matches
            int r1 = r1.count
            if (r1 <= 0) goto La9
            org.tukaani.xz.lz.Matches r1 = r6.matches
            int[] r1 = r1.len
            org.tukaani.xz.lz.Matches r2 = r6.matches
            int r2 = r2.count
            int r2 = r2 - r9
            r1 = r1[r2]
            org.tukaani.xz.lz.Matches r2 = r6.matches
            int[] r2 = r2.dist
            org.tukaani.xz.lz.Matches r5 = r6.matches
            int r5 = r5.count
            int r5 = r5 - r9
            r2 = r2[r5]
            int r5 = r6.niceLen
            if (r1 < r5) goto Laa
            int r2 = r2 + r4
            r6.back = r2
            int r0 = r1 + (-1)
            r6.skip(r0)
            return r1
        La9:
            r1 = r0
        Laa:
            org.tukaani.xz.lz.LZEncoder r2 = r6.lz
            int r2 = r2.getByte(r0)
            org.tukaani.xz.lz.LZEncoder r5 = r6.lz
            int[] r10 = r6.reps
            r10 = r10[r0]
            int r10 = r10 + r9
            int r5 = r5.getByte(r10)
            if (r1 >= r8) goto Lc6
            if (r2 == r5) goto Lc6
            int[] r10 = r6.repLens
            r10 = r10[r3]
            if (r10 >= r8) goto Lc6
            return r9
        Lc6:
            org.tukaani.xz.lz.LZEncoder r10 = r6.lz
            int r16 = r10.getPos()
            int r10 = r6.posMask
            r15 = r16 & r10
            org.tukaani.xz.lz.LZEncoder r10 = r6.lz
            int r13 = r10.getByte(r9)
            org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r10 = r6.literalEncoder
            org.tukaani.xz.lzma.State r14 = r6.state
            r11 = r2
            r12 = r5
            r17 = r14
            r14 = r16
            r4 = r15
            r15 = r17
            int r10 = r10.getPrice(r11, r12, r13, r14, r15)
            org.tukaani.xz.lzma.Optimum[] r11 = r6.opts
            r11 = r11[r9]
            r11.set1(r10, r0, r7)
            org.tukaani.xz.lzma.State r10 = r6.state
            int r10 = r6.getAnyMatchPrice(r10, r4)
            org.tukaani.xz.lzma.State r11 = r6.state
            int r11 = r6.getAnyRepPrice(r10, r11)
            if (r5 != r2) goto L111
            org.tukaani.xz.lzma.State r2 = r6.state
            int r2 = r6.getShortRepPrice(r11, r2, r4)
            org.tukaani.xz.lzma.Optimum[] r5 = r6.opts
            r5 = r5[r9]
            int r5 = r5.price
            if (r2 >= r5) goto L111
            org.tukaani.xz.lzma.Optimum[] r5 = r6.opts
            r5 = r5[r9]
            r5.set1(r2, r0, r0)
        L111:
            int[] r2 = r6.repLens
            r2 = r2[r3]
            int r2 = java.lang.Math.max(r1, r2)
            r6.optEnd = r2
            if (r2 >= r8) goto L126
            org.tukaani.xz.lzma.Optimum[] r0 = r6.opts
            r0 = r0[r9]
            int r0 = r0.backPrev
            r6.back = r0
            return r9
        L126:
            r18.updatePrices()
            org.tukaani.xz.lzma.Optimum[] r2 = r6.opts
            r2 = r2[r0]
            org.tukaani.xz.lzma.State r2 = r2.state
            org.tukaani.xz.lzma.State r3 = r6.state
            r2.set(r3)
            int[] r2 = r6.reps
            org.tukaani.xz.lzma.Optimum[] r3 = r6.opts
            r3 = r3[r0]
            int[] r3 = r3.reps
            r5 = 4
            java.lang.System.arraycopy(r2, r0, r3, r0, r5)
            int r2 = r6.optEnd
        L142:
            if (r2 < r8) goto L14e
            org.tukaani.xz.lzma.Optimum[] r3 = r6.opts
            r3 = r3[r2]
            r3.reset()
            int r2 = r2 + (-1)
            goto L142
        L14e:
            r2 = r0
        L14f:
            if (r2 >= r5) goto L17b
            int[] r3 = r6.repLens
            r3 = r3[r2]
            if (r3 >= r8) goto L158
            goto L178
        L158:
            org.tukaani.xz.lzma.State r12 = r6.state
            int r12 = r6.getLongRepPrice(r11, r2, r12, r4)
        L15e:
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r13 = r6.repLenEncoder
            int r13 = r13.getPrice(r3, r4)
            int r13 = r13 + r12
            org.tukaani.xz.lzma.Optimum[] r14 = r6.opts
            r14 = r14[r3]
            int r14 = r14.price
            if (r13 >= r14) goto L174
            org.tukaani.xz.lzma.Optimum[] r14 = r6.opts
            r14 = r14[r3]
            r14.set1(r13, r0, r2)
        L174:
            int r3 = r3 + (-1)
            if (r3 >= r8) goto L15e
        L178:
            int r2 = r2 + 1
            goto L14f
        L17b:
            int[] r2 = r6.repLens
            r2 = r2[r0]
            int r2 = r2 + r9
            int r2 = java.lang.Math.max(r2, r8)
            if (r2 > r1) goto L1c7
            org.tukaani.xz.lzma.State r1 = r6.state
            int r1 = r6.getNormalMatchPrice(r10, r1)
            r3 = r0
        L18d:
            org.tukaani.xz.lz.Matches r5 = r6.matches
            int[] r5 = r5.len
            r5 = r5[r3]
            if (r2 <= r5) goto L198
            int r3 = r3 + 1
            goto L18d
        L198:
            org.tukaani.xz.lz.Matches r5 = r6.matches
            int[] r5 = r5.dist
            r5 = r5[r3]
            int r10 = r6.getMatchAndLenPrice(r1, r5, r2, r4)
            org.tukaani.xz.lzma.Optimum[] r11 = r6.opts
            r11 = r11[r2]
            int r11 = r11.price
            if (r10 >= r11) goto L1b3
            org.tukaani.xz.lzma.Optimum[] r11 = r6.opts
            r11 = r11[r2]
            int r5 = r5 + 4
            r11.set1(r10, r0, r5)
        L1b3:
            org.tukaani.xz.lz.Matches r5 = r6.matches
            int[] r5 = r5.len
            r5 = r5[r3]
            if (r2 != r5) goto L1c4
            int r3 = r3 + 1
            org.tukaani.xz.lz.Matches r5 = r6.matches
            int r5 = r5.count
            if (r3 != r5) goto L1c4
            goto L1c7
        L1c4:
            int r2 = r2 + 1
            goto L198
        L1c7:
            org.tukaani.xz.lz.LZEncoder r0 = r6.lz
            int r0 = r0.getAvail()
            r1 = 4095(0xfff, float:5.738E-42)
            int r0 = java.lang.Math.min(r0, r1)
        L1d3:
            int r1 = r6.optCur
            int r1 = r1 + r9
            r6.optCur = r1
            int r2 = r6.optEnd
            if (r1 >= r2) goto L23d
            org.tukaani.xz.lz.Matches r1 = r18.getMatches()
            r6.matches = r1
            int r1 = r1.count
            if (r1 <= 0) goto L1f6
            org.tukaani.xz.lz.Matches r1 = r6.matches
            int[] r1 = r1.len
            org.tukaani.xz.lz.Matches r2 = r6.matches
            int r2 = r2.count
            int r2 = r2 - r9
            r1 = r1[r2]
            int r2 = r6.niceLen
            if (r1 < r2) goto L1f6
            goto L23d
        L1f6:
            int r10 = r0 + (-1)
            int r11 = r16 + 1
            int r0 = r6.posMask
            r2 = r11 & r0
            r18.updateOptStateAndReps()
            org.tukaani.xz.lzma.Optimum[] r0 = r6.opts
            int r1 = r6.optCur
            r0 = r0[r1]
            int r0 = r0.price
            org.tukaani.xz.lzma.Optimum[] r1 = r6.opts
            int r3 = r6.optCur
            r1 = r1[r3]
            org.tukaani.xz.lzma.State r1 = r1.state
            int r1 = r6.getAnyMatchPrice(r1, r2)
            int r4 = r0 + r1
            org.tukaani.xz.lzma.Optimum[] r0 = r6.opts
            int r1 = r6.optCur
            r0 = r0[r1]
            org.tukaani.xz.lzma.State r0 = r0.state
            int r0 = r6.getAnyRepPrice(r4, r0)
            r6.calc1BytePrices(r11, r2, r10, r0)
            if (r10 < r8) goto L239
            int r5 = r6.calcLongRepPrices(r11, r2, r10, r0)
            org.tukaani.xz.lz.Matches r0 = r6.matches
            int r0 = r0.count
            if (r0 <= 0) goto L239
            r0 = r18
            r1 = r11
            r3 = r10
            r0.calcNormalMatchPrices(r1, r2, r3, r4, r5)
        L239:
            r0 = r10
            r16 = r11
            goto L1d3
        L23d:
            int r0 = r18.convertOpts()
            return r0
    }

    @Override // org.tukaani.xz.lzma.LZMAEncoder, org.tukaani.xz.lzma.LZMACoder
    public void reset() {
            r1 = this;
            r0 = 0
            r1.optCur = r0
            r1.optEnd = r0
            super.reset()
            return
    }
}
