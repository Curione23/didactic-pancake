package org.tukaani.xz.lzma;

/* JADX INFO: loaded from: classes2.dex */
abstract class LZMACoder {
    static final int ALIGN_BITS = 4;
    static final int ALIGN_MASK = 15;
    static final int ALIGN_SIZE = 16;
    static final int DIST_MODEL_END = 14;
    static final int DIST_MODEL_START = 4;
    static final int DIST_SLOTS = 64;
    static final int DIST_STATES = 4;
    static final int FULL_DISTANCES = 128;
    static final int MATCH_LEN_MAX = 273;
    static final int MATCH_LEN_MIN = 2;
    static final int POS_STATES_MAX = 16;
    static final int REPS = 4;
    final short[] distAlign;
    final short[][] distSlots;
    final short[][] distSpecial;
    final short[][] isMatch;
    final short[] isRep;
    final short[] isRep0;
    final short[][] isRep0Long;
    final short[] isRep1;
    final short[] isRep2;
    final int posMask;
    final int[] reps;
    final org.tukaani.xz.lzma.State state;

    abstract class LengthCoder {
        static final int HIGH_SYMBOLS = 256;
        static final int LOW_SYMBOLS = 8;
        static final int MID_SYMBOLS = 8;
        final short[] choice;
        final short[] high;
        final short[][] low;
        final short[][] mid;
        final /* synthetic */ org.tukaani.xz.lzma.LZMACoder this$0;

        LengthCoder(org.tukaani.xz.lzma.LZMACoder r7) {
                r6 = this;
                r6.this$0 = r7
                r6.<init>()
                r7 = 2
                short[] r0 = new short[r7]
                r6.choice = r0
                int[] r0 = new int[r7]
                r1 = 1
                r2 = 8
                r0[r1] = r2
                r3 = 0
                r4 = 16
                r0[r3] = r4
                java.lang.Class r5 = java.lang.Short.TYPE
                java.lang.Object r0 = java.lang.reflect.Array.newInstance(r5, r0)
                short[][] r0 = (short[][]) r0
                r6.low = r0
                int[] r7 = new int[r7]
                r7[r1] = r2
                r7[r3] = r4
                java.lang.Class r0 = java.lang.Short.TYPE
                java.lang.Object r7 = java.lang.reflect.Array.newInstance(r0, r7)
                short[][] r7 = (short[][]) r7
                r6.mid = r7
                r7 = 256(0x100, float:3.59E-43)
                short[] r7 = new short[r7]
                r6.high = r7
                return
        }

        void reset() {
                r4 = this;
                short[] r0 = r4.choice
                org.tukaani.xz.rangecoder.RangeCoder.initProbs(r0)
                r0 = 0
                r1 = r0
            L7:
                short[][] r2 = r4.low
                int r3 = r2.length
                if (r1 >= r3) goto L14
                r2 = r2[r1]
                org.tukaani.xz.rangecoder.RangeCoder.initProbs(r2)
                int r1 = r1 + 1
                goto L7
            L14:
                short[][] r1 = r4.low
                int r1 = r1.length
                if (r0 >= r1) goto L23
                short[][] r1 = r4.mid
                r1 = r1[r0]
                org.tukaani.xz.rangecoder.RangeCoder.initProbs(r1)
                int r0 = r0 + 1
                goto L14
            L23:
                short[] r0 = r4.high
                org.tukaani.xz.rangecoder.RangeCoder.initProbs(r0)
                return
        }
    }

    abstract class LiteralCoder {
        private final int lc;
        private final int literalPosMask;
        final /* synthetic */ org.tukaani.xz.lzma.LZMACoder this$0;

        abstract class LiteralSubcoder {
            final short[] probs;
            final /* synthetic */ org.tukaani.xz.lzma.LZMACoder.LiteralCoder this$1;

            LiteralSubcoder(org.tukaani.xz.lzma.LZMACoder.LiteralCoder r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    r1 = 768(0x300, float:1.076E-42)
                    short[] r1 = new short[r1]
                    r0.probs = r1
                    return
            }

            void reset() {
                    r1 = this;
                    short[] r0 = r1.probs
                    org.tukaani.xz.rangecoder.RangeCoder.initProbs(r0)
                    return
            }
        }

        LiteralCoder(org.tukaani.xz.lzma.LZMACoder r1, int r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.lc = r2
                r1 = 1
                int r2 = r1 << r3
                int r2 = r2 - r1
                r0.literalPosMask = r2
                return
        }

        final int getSubcoderIndex(int r3, int r4) {
                r2 = this;
                int r0 = r2.lc
                int r1 = 8 - r0
                int r3 = r3 >> r1
                int r1 = r2.literalPosMask
                r4 = r4 & r1
                int r4 = r4 << r0
                int r3 = r3 + r4
                return r3
        }
    }

    LZMACoder(int r17) {
            r16 = this;
            r0 = r16
            r16.<init>()
            r1 = 4
            int[] r2 = new int[r1]
            r0.reps = r2
            org.tukaani.xz.lzma.State r2 = new org.tukaani.xz.lzma.State
            r2.<init>()
            r0.state = r2
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 1
            r5 = 16
            r3[r4] = r5
            r6 = 0
            r7 = 12
            r3[r6] = r7
            java.lang.Class r8 = java.lang.Short.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r8, r3)
            short[][] r3 = (short[][]) r3
            r0.isMatch = r3
            short[] r3 = new short[r7]
            r0.isRep = r3
            short[] r3 = new short[r7]
            r0.isRep0 = r3
            short[] r3 = new short[r7]
            r0.isRep1 = r3
            short[] r3 = new short[r7]
            r0.isRep2 = r3
            int[] r3 = new int[r2]
            r3[r4] = r5
            r3[r6] = r7
            java.lang.Class r7 = java.lang.Short.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r7, r3)
            short[][] r3 = (short[][]) r3
            r0.isRep0Long = r3
            int[] r3 = new int[r2]
            r7 = 64
            r3[r4] = r7
            r3[r6] = r1
            java.lang.Class r6 = java.lang.Short.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r6, r3)
            short[][] r3 = (short[][]) r3
            r0.distSlots = r3
            short[] r6 = new short[r2]
            short[] r7 = new short[r2]
            short[] r8 = new short[r1]
            short[] r9 = new short[r1]
            r1 = 8
            short[] r10 = new short[r1]
            short[] r11 = new short[r1]
            short[] r12 = new short[r5]
            short[] r13 = new short[r5]
            r1 = 32
            short[] r14 = new short[r1]
            short[] r15 = new short[r1]
            short[][] r1 = new short[][]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            r0.distSpecial = r1
            short[] r1 = new short[r5]
            r0.distAlign = r1
            int r1 = r4 << r17
            int r1 = r1 - r4
            r0.posMask = r1
            return
    }

    static final int getDistState(int r1) {
            r0 = 6
            if (r1 >= r0) goto L6
            int r1 = r1 + (-2)
            goto L7
        L6:
            r1 = 3
        L7:
            return r1
    }

    void reset() {
            r4 = this;
            int[] r0 = r4.reps
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r2 = 2
            r0[r2] = r1
            r2 = 3
            r0[r2] = r1
            org.tukaani.xz.lzma.State r0 = r4.state
            r0.reset()
            r0 = r1
        L14:
            short[][] r2 = r4.isMatch
            int r3 = r2.length
            if (r0 >= r3) goto L21
            r2 = r2[r0]
            org.tukaani.xz.rangecoder.RangeCoder.initProbs(r2)
            int r0 = r0 + 1
            goto L14
        L21:
            short[] r0 = r4.isRep
            org.tukaani.xz.rangecoder.RangeCoder.initProbs(r0)
            short[] r0 = r4.isRep0
            org.tukaani.xz.rangecoder.RangeCoder.initProbs(r0)
            short[] r0 = r4.isRep1
            org.tukaani.xz.rangecoder.RangeCoder.initProbs(r0)
            short[] r0 = r4.isRep2
            org.tukaani.xz.rangecoder.RangeCoder.initProbs(r0)
            r0 = r1
        L36:
            short[][] r2 = r4.isRep0Long
            int r3 = r2.length
            if (r0 >= r3) goto L43
            r2 = r2[r0]
            org.tukaani.xz.rangecoder.RangeCoder.initProbs(r2)
            int r0 = r0 + 1
            goto L36
        L43:
            r0 = r1
        L44:
            short[][] r2 = r4.distSlots
            int r3 = r2.length
            if (r0 >= r3) goto L51
            r2 = r2[r0]
            org.tukaani.xz.rangecoder.RangeCoder.initProbs(r2)
            int r0 = r0 + 1
            goto L44
        L51:
            short[][] r0 = r4.distSpecial
            int r2 = r0.length
            if (r1 >= r2) goto L5e
            r0 = r0[r1]
            org.tukaani.xz.rangecoder.RangeCoder.initProbs(r0)
            int r1 = r1 + 1
            goto L51
        L5e:
            short[] r0 = r4.distAlign
            org.tukaani.xz.rangecoder.RangeCoder.initProbs(r0)
            return
    }
}
