package org.tukaani.xz.lzma;

/* JADX INFO: loaded from: classes2.dex */
public final class LZMADecoder extends org.tukaani.xz.lzma.LZMACoder {
    private final org.tukaani.xz.lzma.LZMADecoder.LiteralDecoder literalDecoder;
    private final org.tukaani.xz.lz.LZDecoder lz;
    private final org.tukaani.xz.lzma.LZMADecoder.LengthDecoder matchLenDecoder;
    private final org.tukaani.xz.rangecoder.RangeDecoder rc;
    private final org.tukaani.xz.lzma.LZMADecoder.LengthDecoder repLenDecoder;

    /* JADX INFO: renamed from: org.tukaani.xz.lzma.LZMADecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private class LengthDecoder extends org.tukaani.xz.lzma.LZMACoder.LengthCoder {
        final /* synthetic */ org.tukaani.xz.lzma.LZMADecoder this$0;

        private LengthDecoder(org.tukaani.xz.lzma.LZMADecoder r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ LengthDecoder(org.tukaani.xz.lzma.LZMADecoder r1, org.tukaani.xz.lzma.LZMADecoder.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        int decode(int r4) throws java.io.IOException {
                r3 = this;
                org.tukaani.xz.lzma.LZMADecoder r0 = r3.this$0
                org.tukaani.xz.rangecoder.RangeDecoder r0 = org.tukaani.xz.lzma.LZMADecoder.access$300(r0)
                short[] r1 = r3.choice
                r2 = 0
                int r0 = r0.decodeBit(r1, r2)
                if (r0 != 0) goto L20
                org.tukaani.xz.lzma.LZMADecoder r0 = r3.this$0
                org.tukaani.xz.rangecoder.RangeDecoder r0 = org.tukaani.xz.lzma.LZMADecoder.access$300(r0)
                short[][] r1 = r3.low
                r4 = r1[r4]
                int r4 = r0.decodeBitTree(r4)
                int r4 = r4 + 2
                return r4
            L20:
                org.tukaani.xz.lzma.LZMADecoder r0 = r3.this$0
                org.tukaani.xz.rangecoder.RangeDecoder r0 = org.tukaani.xz.lzma.LZMADecoder.access$300(r0)
                short[] r1 = r3.choice
                r2 = 1
                int r0 = r0.decodeBit(r1, r2)
                if (r0 != 0) goto L40
                org.tukaani.xz.lzma.LZMADecoder r0 = r3.this$0
                org.tukaani.xz.rangecoder.RangeDecoder r0 = org.tukaani.xz.lzma.LZMADecoder.access$300(r0)
                short[][] r1 = r3.mid
                r4 = r1[r4]
                int r4 = r0.decodeBitTree(r4)
                int r4 = r4 + 10
                return r4
            L40:
                org.tukaani.xz.lzma.LZMADecoder r4 = r3.this$0
                org.tukaani.xz.rangecoder.RangeDecoder r4 = org.tukaani.xz.lzma.LZMADecoder.access$300(r4)
                short[] r0 = r3.high
                int r4 = r4.decodeBitTree(r0)
                int r4 = r4 + 18
                return r4
        }
    }

    private class LiteralDecoder extends org.tukaani.xz.lzma.LZMACoder.LiteralCoder {
        private final org.tukaani.xz.lzma.LZMADecoder.LiteralDecoder.LiteralSubdecoder[] subdecoders;
        final /* synthetic */ org.tukaani.xz.lzma.LZMADecoder this$0;

        private class LiteralSubdecoder extends org.tukaani.xz.lzma.LZMACoder.LiteralCoder.LiteralSubcoder {
            final /* synthetic */ org.tukaani.xz.lzma.LZMADecoder.LiteralDecoder this$1;

            private LiteralSubdecoder(org.tukaani.xz.lzma.LZMADecoder.LiteralDecoder r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r1)
                    return
            }

            /* synthetic */ LiteralSubdecoder(org.tukaani.xz.lzma.LZMADecoder.LiteralDecoder r1, org.tukaani.xz.lzma.LZMADecoder.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            void decode() throws java.io.IOException {
                    r10 = this;
                    org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder r0 = r10.this$1
                    org.tukaani.xz.lzma.LZMADecoder r0 = r0.this$0
                    org.tukaani.xz.lzma.State r0 = r0.state
                    boolean r0 = r0.isLiteral()
                    r1 = 256(0x100, float:3.59E-43)
                    r2 = 1
                    if (r0 == 0) goto L23
                Lf:
                    int r0 = r2 << 1
                    org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder r3 = r10.this$1
                    org.tukaani.xz.lzma.LZMADecoder r3 = r3.this$0
                    org.tukaani.xz.rangecoder.RangeDecoder r3 = org.tukaani.xz.lzma.LZMADecoder.access$300(r3)
                    short[] r4 = r10.probs
                    int r2 = r3.decodeBit(r4, r2)
                    r2 = r2 | r0
                    if (r2 < r1) goto Lf
                    goto L58
                L23:
                    org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder r0 = r10.this$1
                    org.tukaani.xz.lzma.LZMADecoder r0 = r0.this$0
                    org.tukaani.xz.lz.LZDecoder r0 = org.tukaani.xz.lzma.LZMADecoder.access$200(r0)
                    org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder r3 = r10.this$1
                    org.tukaani.xz.lzma.LZMADecoder r3 = r3.this$0
                    int[] r3 = r3.reps
                    r4 = 0
                    r3 = r3[r4]
                    int r0 = r0.getByte(r3)
                    r3 = r1
                    r5 = r2
                L3a:
                    int r0 = r0 << r2
                    r6 = r0 & r3
                    org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder r7 = r10.this$1
                    org.tukaani.xz.lzma.LZMADecoder r7 = r7.this$0
                    org.tukaani.xz.rangecoder.RangeDecoder r7 = org.tukaani.xz.lzma.LZMADecoder.access$300(r7)
                    short[] r8 = r10.probs
                    int r9 = r3 + r6
                    int r9 = r9 + r5
                    int r7 = r7.decodeBit(r8, r9)
                    int r5 = r5 << r2
                    r5 = r5 | r7
                    int r7 = 0 - r7
                    int r6 = ~r6
                    r6 = r6 ^ r7
                    r3 = r3 & r6
                    if (r5 < r1) goto L3a
                    r2 = r5
                L58:
                    org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder r0 = r10.this$1
                    org.tukaani.xz.lzma.LZMADecoder r0 = r0.this$0
                    org.tukaani.xz.lz.LZDecoder r0 = org.tukaani.xz.lzma.LZMADecoder.access$200(r0)
                    byte r1 = (byte) r2
                    r0.putByte(r1)
                    org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder r0 = r10.this$1
                    org.tukaani.xz.lzma.LZMADecoder r0 = r0.this$0
                    org.tukaani.xz.lzma.State r0 = r0.state
                    r0.updateLiteral()
                    return
            }
        }

        LiteralDecoder(org.tukaani.xz.lzma.LZMADecoder r2, int r3, int r4) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2, r3, r4)
                r2 = 1
                int r3 = r3 + r4
                int r2 = r2 << r3
                org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder$LiteralSubdecoder[] r2 = new org.tukaani.xz.lzma.LZMADecoder.LiteralDecoder.LiteralSubdecoder[r2]
                r1.subdecoders = r2
                r2 = 0
            Ld:
                org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder$LiteralSubdecoder[] r3 = r1.subdecoders
                int r4 = r3.length
                if (r2 >= r4) goto L1d
                org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder$LiteralSubdecoder r4 = new org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder$LiteralSubdecoder
                r0 = 0
                r4.<init>(r1, r0)
                r3[r2] = r4
                int r2 = r2 + 1
                goto Ld
            L1d:
                return
        }

        void decode() throws java.io.IOException {
                r2 = this;
                org.tukaani.xz.lzma.LZMADecoder r0 = r2.this$0
                org.tukaani.xz.lz.LZDecoder r0 = org.tukaani.xz.lzma.LZMADecoder.access$200(r0)
                r1 = 0
                int r0 = r0.getByte(r1)
                org.tukaani.xz.lzma.LZMADecoder r1 = r2.this$0
                org.tukaani.xz.lz.LZDecoder r1 = org.tukaani.xz.lzma.LZMADecoder.access$200(r1)
                int r1 = r1.getPos()
                int r0 = r2.getSubcoderIndex(r0, r1)
                org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder$LiteralSubdecoder[] r1 = r2.subdecoders
                r0 = r1[r0]
                r0.decode()
                return
        }

        void reset() {
                r3 = this;
                r0 = 0
            L1:
                org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder$LiteralSubdecoder[] r1 = r3.subdecoders
                int r2 = r1.length
                if (r0 >= r2) goto Le
                r1 = r1[r0]
                r1.reset()
                int r0 = r0 + 1
                goto L1
            Le:
                return
        }
    }

    public LZMADecoder(org.tukaani.xz.lz.LZDecoder r2, org.tukaani.xz.rangecoder.RangeDecoder r3, int r4, int r5, int r6) {
            r1 = this;
            r1.<init>(r6)
            org.tukaani.xz.lzma.LZMADecoder$LengthDecoder r6 = new org.tukaani.xz.lzma.LZMADecoder$LengthDecoder
            r0 = 0
            r6.<init>(r1, r0)
            r1.matchLenDecoder = r6
            org.tukaani.xz.lzma.LZMADecoder$LengthDecoder r6 = new org.tukaani.xz.lzma.LZMADecoder$LengthDecoder
            r6.<init>(r1, r0)
            r1.repLenDecoder = r6
            r1.lz = r2
            r1.rc = r3
            org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder r2 = new org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder
            r2.<init>(r1, r4, r5)
            r1.literalDecoder = r2
            r1.reset()
            return
    }

    static /* synthetic */ org.tukaani.xz.lz.LZDecoder access$200(org.tukaani.xz.lzma.LZMADecoder r0) {
            org.tukaani.xz.lz.LZDecoder r0 = r0.lz
            return r0
    }

    static /* synthetic */ org.tukaani.xz.rangecoder.RangeDecoder access$300(org.tukaani.xz.lzma.LZMADecoder r0) {
            org.tukaani.xz.rangecoder.RangeDecoder r0 = r0.rc
            return r0
    }

    private int decodeMatch(int r9) throws java.io.IOException {
            r8 = this;
            org.tukaani.xz.lzma.State r0 = r8.state
            r0.updateMatch()
            int[] r0 = r8.reps
            int[] r1 = r8.reps
            r2 = 2
            r1 = r1[r2]
            r3 = 3
            r0[r3] = r1
            int[] r0 = r8.reps
            int[] r1 = r8.reps
            r3 = 1
            r1 = r1[r3]
            r0[r2] = r1
            int[] r0 = r8.reps
            int[] r1 = r8.reps
            r4 = 0
            r1 = r1[r4]
            r0[r3] = r1
            org.tukaani.xz.lzma.LZMADecoder$LengthDecoder r0 = r8.matchLenDecoder
            int r9 = r0.decode(r9)
            org.tukaani.xz.rangecoder.RangeDecoder r0 = r8.rc
            short[][] r1 = r8.distSlots
            int r3 = getDistState(r9)
            r1 = r1[r3]
            int r0 = r0.decodeBitTree(r1)
            r1 = 4
            if (r0 >= r1) goto L3d
            int[] r1 = r8.reps
            r1[r4] = r0
            goto L80
        L3d:
            int r3 = r0 >> 1
            int r5 = r3 + (-1)
            int[] r6 = r8.reps
            r7 = r0 & 1
            r2 = r2 | r7
            int r2 = r2 << r5
            r6[r4] = r2
            r2 = 14
            if (r0 >= r2) goto L60
            int[] r2 = r8.reps
            r3 = r2[r4]
            org.tukaani.xz.rangecoder.RangeDecoder r5 = r8.rc
            short[][] r6 = r8.distSpecial
            int r0 = r0 - r1
            r0 = r6[r0]
            int r0 = r5.decodeReverseBitTree(r0)
            r0 = r0 | r3
            r2[r4] = r0
            goto L80
        L60:
            int[] r0 = r8.reps
            r2 = r0[r4]
            org.tukaani.xz.rangecoder.RangeDecoder r5 = r8.rc
            int r3 = r3 + (-5)
            int r3 = r5.decodeDirectBits(r3)
            int r1 = r3 << 4
            r1 = r1 | r2
            r0[r4] = r1
            int[] r0 = r8.reps
            r1 = r0[r4]
            org.tukaani.xz.rangecoder.RangeDecoder r2 = r8.rc
            short[] r3 = r8.distAlign
            int r2 = r2.decodeReverseBitTree(r3)
            r1 = r1 | r2
            r0[r4] = r1
        L80:
            return r9
    }

    private int decodeRepMatch(int r7) throws java.io.IOException {
            r6 = this;
            org.tukaani.xz.rangecoder.RangeDecoder r0 = r6.rc
            short[] r1 = r6.isRep0
            org.tukaani.xz.lzma.State r2 = r6.state
            int r2 = r2.get()
            int r0 = r0.decodeBit(r1, r2)
            r1 = 1
            if (r0 != 0) goto L29
            org.tukaani.xz.rangecoder.RangeDecoder r0 = r6.rc
            short[][] r2 = r6.isRep0Long
            org.tukaani.xz.lzma.State r3 = r6.state
            int r3 = r3.get()
            r2 = r2[r3]
            int r0 = r0.decodeBit(r2, r7)
            if (r0 != 0) goto L76
            org.tukaani.xz.lzma.State r7 = r6.state
            r7.updateShortRep()
            return r1
        L29:
            org.tukaani.xz.rangecoder.RangeDecoder r0 = r6.rc
            short[] r2 = r6.isRep1
            org.tukaani.xz.lzma.State r3 = r6.state
            int r3 = r3.get()
            int r0 = r0.decodeBit(r2, r3)
            if (r0 != 0) goto L3e
            int[] r0 = r6.reps
            r0 = r0[r1]
            goto L69
        L3e:
            org.tukaani.xz.rangecoder.RangeDecoder r0 = r6.rc
            short[] r2 = r6.isRep2
            org.tukaani.xz.lzma.State r3 = r6.state
            int r3 = r3.get()
            int r0 = r0.decodeBit(r2, r3)
            r2 = 2
            if (r0 != 0) goto L54
            int[] r0 = r6.reps
            r0 = r0[r2]
            goto L61
        L54:
            int[] r0 = r6.reps
            r3 = 3
            r0 = r0[r3]
            int[] r4 = r6.reps
            int[] r5 = r6.reps
            r5 = r5[r2]
            r4[r3] = r5
        L61:
            int[] r3 = r6.reps
            int[] r4 = r6.reps
            r4 = r4[r1]
            r3[r2] = r4
        L69:
            int[] r2 = r6.reps
            int[] r3 = r6.reps
            r4 = 0
            r3 = r3[r4]
            r2[r1] = r3
            int[] r1 = r6.reps
            r1[r4] = r0
        L76:
            org.tukaani.xz.lzma.State r0 = r6.state
            r0.updateLongRep()
            org.tukaani.xz.lzma.LZMADecoder$LengthDecoder r0 = r6.repLenDecoder
            int r7 = r0.decode(r7)
            return r7
    }

    public void decode() throws java.io.IOException {
            r4 = this;
            org.tukaani.xz.lz.LZDecoder r0 = r4.lz
            r0.repeatPending()
        L5:
            org.tukaani.xz.lz.LZDecoder r0 = r4.lz
            boolean r0 = r0.hasSpace()
            if (r0 == 0) goto L52
            org.tukaani.xz.lz.LZDecoder r0 = r4.lz
            int r0 = r0.getPos()
            int r1 = r4.posMask
            r0 = r0 & r1
            org.tukaani.xz.rangecoder.RangeDecoder r1 = r4.rc
            short[][] r2 = r4.isMatch
            org.tukaani.xz.lzma.State r3 = r4.state
            int r3 = r3.get()
            r2 = r2[r3]
            int r1 = r1.decodeBit(r2, r0)
            if (r1 != 0) goto L2e
            org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder r0 = r4.literalDecoder
            r0.decode()
            goto L5
        L2e:
            org.tukaani.xz.rangecoder.RangeDecoder r1 = r4.rc
            short[] r2 = r4.isRep
            org.tukaani.xz.lzma.State r3 = r4.state
            int r3 = r3.get()
            int r1 = r1.decodeBit(r2, r3)
            if (r1 != 0) goto L43
            int r0 = r4.decodeMatch(r0)
            goto L47
        L43:
            int r0 = r4.decodeRepMatch(r0)
        L47:
            org.tukaani.xz.lz.LZDecoder r1 = r4.lz
            int[] r2 = r4.reps
            r3 = 0
            r2 = r2[r3]
            r1.repeat(r2, r0)
            goto L5
        L52:
            org.tukaani.xz.rangecoder.RangeDecoder r0 = r4.rc
            r0.normalize()
            return
    }

    public boolean endMarkerDetected() {
            r3 = this;
            int[] r0 = r3.reps
            r1 = 0
            r0 = r0[r1]
            r2 = -1
            if (r0 != r2) goto L9
            r1 = 1
        L9:
            return r1
    }

    @Override // org.tukaani.xz.lzma.LZMACoder
    public void reset() {
            r1 = this;
            super.reset()
            org.tukaani.xz.lzma.LZMADecoder$LiteralDecoder r0 = r1.literalDecoder
            r0.reset()
            org.tukaani.xz.lzma.LZMADecoder$LengthDecoder r0 = r1.matchLenDecoder
            r0.reset()
            org.tukaani.xz.lzma.LZMADecoder$LengthDecoder r0 = r1.repLenDecoder
            r0.reset()
            return
    }
}
