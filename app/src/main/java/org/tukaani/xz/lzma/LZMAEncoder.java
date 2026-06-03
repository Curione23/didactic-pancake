package org.tukaani.xz.lzma;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LZMAEncoder extends org.tukaani.xz.lzma.LZMACoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ALIGN_PRICE_UPDATE_INTERVAL = 16;
    private static final int DIST_PRICE_UPDATE_INTERVAL = 128;
    private static final int LZMA2_COMPRESSED_LIMIT = 65510;
    private static final int LZMA2_UNCOMPRESSED_LIMIT = 2096879;
    public static final int MODE_FAST = 1;
    public static final int MODE_NORMAL = 2;
    private int alignPriceCount;
    private final int[] alignPrices;
    int back;
    private int distPriceCount;
    private final int[][] distSlotPrices;
    private final int distSlotPricesSize;
    private final int[][] fullDistPrices;
    final org.tukaani.xz.lzma.LZMAEncoder.LiteralEncoder literalEncoder;
    final org.tukaani.xz.lz.LZEncoder lz;
    final org.tukaani.xz.lzma.LZMAEncoder.LengthEncoder matchLenEncoder;
    final int niceLen;
    private final org.tukaani.xz.rangecoder.RangeEncoder rc;
    int readAhead;
    final org.tukaani.xz.lzma.LZMAEncoder.LengthEncoder repLenEncoder;
    private int uncompressedSize;

    /* JADX INFO: renamed from: org.tukaani.xz.lzma.LZMAEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    class LengthEncoder extends org.tukaani.xz.lzma.LZMACoder.LengthCoder {
        private static final int PRICE_UPDATE_INTERVAL = 32;
        private final int[] counters;
        private final int[][] prices;
        final /* synthetic */ org.tukaani.xz.lzma.LZMAEncoder this$0;

        LengthEncoder(org.tukaani.xz.lzma.LZMAEncoder r2, int r3, int r4) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2)
                r2 = 1
                int r3 = r2 << r3
                int[] r0 = new int[r3]
                r1.counters = r0
                int r4 = r4 - r2
                r0 = 16
                int r4 = java.lang.Math.max(r4, r0)
                r0 = 2
                int[] r0 = new int[r0]
                r0[r2] = r4
                r2 = 0
                r0[r2] = r3
                java.lang.Class r2 = java.lang.Integer.TYPE
                java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r0)
                int[][] r2 = (int[][]) r2
                r1.prices = r2
                return
        }

        private void updatePrices(int r9) {
                r8 = this;
                short[] r0 = r8.choice
                r1 = 0
                short r0 = r0[r1]
                int r0 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r0, r1)
                r2 = r1
            La:
                r3 = 8
                if (r2 >= r3) goto L20
                int[][] r3 = r8.prices
                r3 = r3[r9]
                short[][] r4 = r8.low
                r4 = r4[r9]
                int r4 = org.tukaani.xz.rangecoder.RangeEncoder.getBitTreePrice(r4, r2)
                int r4 = r4 + r0
                r3[r2] = r4
                int r2 = r2 + 1
                goto La
            L20:
                short[] r0 = r8.choice
                short r0 = r0[r1]
                r3 = 1
                int r0 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r0, r3)
                short[] r4 = r8.choice
                short r4 = r4[r3]
                int r1 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r4, r1)
            L31:
                r4 = 16
                if (r2 >= r4) goto L4b
                int[][] r4 = r8.prices
                r4 = r4[r9]
                int r5 = r0 + r1
                short[][] r6 = r8.mid
                r6 = r6[r9]
                int r7 = r2 + (-8)
                int r6 = org.tukaani.xz.rangecoder.RangeEncoder.getBitTreePrice(r6, r7)
                int r5 = r5 + r6
                r4[r2] = r5
                int r2 = r2 + 1
                goto L31
            L4b:
                short[] r1 = r8.choice
                short r1 = r1[r3]
                int r1 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r1, r3)
            L53:
                int[][] r3 = r8.prices
                r3 = r3[r9]
                int r4 = r3.length
                if (r2 >= r4) goto L6a
                int r4 = r0 + r1
                short[] r5 = r8.high
                int r6 = r2 + (-16)
                int r5 = org.tukaani.xz.rangecoder.RangeEncoder.getBitTreePrice(r5, r6)
                int r4 = r4 + r5
                r3[r2] = r4
                int r2 = r2 + 1
                goto L53
            L6a:
                return
        }

        void encode(int r6, int r7) throws java.io.IOException {
                r5 = this;
                int r0 = r6 + (-2)
                r1 = 0
                r2 = 1
                r3 = 8
                if (r0 >= r3) goto L21
                org.tukaani.xz.lzma.LZMAEncoder r6 = r5.this$0
                org.tukaani.xz.rangecoder.RangeEncoder r6 = org.tukaani.xz.lzma.LZMAEncoder.access$100(r6)
                short[] r3 = r5.choice
                r6.encodeBit(r3, r1, r1)
                org.tukaani.xz.lzma.LZMAEncoder r6 = r5.this$0
                org.tukaani.xz.rangecoder.RangeEncoder r6 = org.tukaani.xz.lzma.LZMAEncoder.access$100(r6)
                short[][] r1 = r5.low
                r1 = r1[r7]
                r6.encodeBitTree(r1, r0)
                goto L61
            L21:
                org.tukaani.xz.lzma.LZMAEncoder r0 = r5.this$0
                org.tukaani.xz.rangecoder.RangeEncoder r0 = org.tukaani.xz.lzma.LZMAEncoder.access$100(r0)
                short[] r4 = r5.choice
                r0.encodeBit(r4, r1, r2)
                int r0 = r6 + (-10)
                if (r0 >= r3) goto L49
                org.tukaani.xz.lzma.LZMAEncoder r6 = r5.this$0
                org.tukaani.xz.rangecoder.RangeEncoder r6 = org.tukaani.xz.lzma.LZMAEncoder.access$100(r6)
                short[] r3 = r5.choice
                r6.encodeBit(r3, r2, r1)
                org.tukaani.xz.lzma.LZMAEncoder r6 = r5.this$0
                org.tukaani.xz.rangecoder.RangeEncoder r6 = org.tukaani.xz.lzma.LZMAEncoder.access$100(r6)
                short[][] r1 = r5.mid
                r1 = r1[r7]
                r6.encodeBitTree(r1, r0)
                goto L61
            L49:
                org.tukaani.xz.lzma.LZMAEncoder r0 = r5.this$0
                org.tukaani.xz.rangecoder.RangeEncoder r0 = org.tukaani.xz.lzma.LZMAEncoder.access$100(r0)
                short[] r1 = r5.choice
                r0.encodeBit(r1, r2, r2)
                org.tukaani.xz.lzma.LZMAEncoder r0 = r5.this$0
                org.tukaani.xz.rangecoder.RangeEncoder r0 = org.tukaani.xz.lzma.LZMAEncoder.access$100(r0)
                short[] r1 = r5.high
                int r6 = r6 + (-18)
                r0.encodeBitTree(r1, r6)
            L61:
                int[] r6 = r5.counters
                r0 = r6[r7]
                int r0 = r0 - r2
                r6[r7] = r0
                return
        }

        int getPrice(int r2, int r3) {
                r1 = this;
                int[][] r0 = r1.prices
                r3 = r0[r3]
                int r2 = r2 + (-2)
                r2 = r3[r2]
                return r2
        }

        @Override // org.tukaani.xz.lzma.LZMACoder.LengthCoder
        void reset() {
                r4 = this;
                super.reset()
                r0 = 0
                r1 = r0
            L5:
                int[] r2 = r4.counters
                int r3 = r2.length
                if (r1 >= r3) goto Lf
                r2[r1] = r0
                int r1 = r1 + 1
                goto L5
            Lf:
                return
        }

        void updatePrices() {
                r3 = this;
                r0 = 0
            L1:
                int[] r1 = r3.counters
                int r2 = r1.length
                if (r0 >= r2) goto L14
                r2 = r1[r0]
                if (r2 > 0) goto L11
                r2 = 32
                r1[r0] = r2
                r3.updatePrices(r0)
            L11:
                int r0 = r0 + 1
                goto L1
            L14:
                return
        }
    }

    class LiteralEncoder extends org.tukaani.xz.lzma.LZMACoder.LiteralCoder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final org.tukaani.xz.lzma.LZMAEncoder.LiteralEncoder.LiteralSubencoder[] subencoders;
        final /* synthetic */ org.tukaani.xz.lzma.LZMAEncoder this$0;

        private class LiteralSubencoder extends org.tukaani.xz.lzma.LZMACoder.LiteralCoder.LiteralSubcoder {
            final /* synthetic */ org.tukaani.xz.lzma.LZMAEncoder.LiteralEncoder this$1;

            private LiteralSubencoder(org.tukaani.xz.lzma.LZMAEncoder.LiteralEncoder r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r1)
                    return
            }

            /* synthetic */ LiteralSubencoder(org.tukaani.xz.lzma.LZMAEncoder.LiteralEncoder r1, org.tukaani.xz.lzma.LZMAEncoder.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            void encode() throws java.io.IOException {
                    r8 = this;
                    org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r0 = r8.this$1
                    org.tukaani.xz.lzma.LZMAEncoder r0 = r0.this$0
                    org.tukaani.xz.lz.LZEncoder r0 = r0.lz
                    org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r1 = r8.this$1
                    org.tukaani.xz.lzma.LZMAEncoder r1 = r1.this$0
                    int r1 = r1.readAhead
                    int r0 = r0.getByte(r1)
                    r1 = 256(0x100, float:3.59E-43)
                    r0 = r0 | r1
                    org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r2 = r8.this$1
                    org.tukaani.xz.lzma.LZMAEncoder r2 = r2.this$0
                    org.tukaani.xz.lzma.State r2 = r2.state
                    boolean r2 = r2.isLiteral()
                    r3 = 65536(0x10000, float:9.1835E-41)
                    if (r2 == 0) goto L39
                L21:
                    int r1 = r0 >>> 8
                    int r2 = r0 >>> 7
                    r2 = r2 & 1
                    org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r4 = r8.this$1
                    org.tukaani.xz.lzma.LZMAEncoder r4 = r4.this$0
                    org.tukaani.xz.rangecoder.RangeEncoder r4 = org.tukaani.xz.lzma.LZMAEncoder.access$100(r4)
                    short[] r5 = r8.probs
                    r4.encodeBit(r5, r1, r2)
                    int r0 = r0 << 1
                    if (r0 < r3) goto L21
                    goto L76
                L39:
                    org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r2 = r8.this$1
                    org.tukaani.xz.lzma.LZMAEncoder r2 = r2.this$0
                    org.tukaani.xz.lz.LZEncoder r2 = r2.lz
                    org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r4 = r8.this$1
                    org.tukaani.xz.lzma.LZMAEncoder r4 = r4.this$0
                    int[] r4 = r4.reps
                    r5 = 0
                    r4 = r4[r5]
                    int r4 = r4 + 1
                    org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r5 = r8.this$1
                    org.tukaani.xz.lzma.LZMAEncoder r5 = r5.this$0
                    int r5 = r5.readAhead
                    int r4 = r4 + r5
                    int r2 = r2.getByte(r4)
                L55:
                    int r2 = r2 << 1
                    r4 = r2 & r1
                    int r4 = r4 + r1
                    int r5 = r0 >>> 8
                    int r4 = r4 + r5
                    int r5 = r0 >>> 7
                    r5 = r5 & 1
                    org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r6 = r8.this$1
                    org.tukaani.xz.lzma.LZMAEncoder r6 = r6.this$0
                    org.tukaani.xz.rangecoder.RangeEncoder r6 = org.tukaani.xz.lzma.LZMAEncoder.access$100(r6)
                    short[] r7 = r8.probs
                    r6.encodeBit(r7, r4, r5)
                    int r0 = r0 << 1
                    r4 = r2 ^ r0
                    int r4 = ~r4
                    r1 = r1 & r4
                    if (r0 < r3) goto L55
                L76:
                    org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r0 = r8.this$1
                    org.tukaani.xz.lzma.LZMAEncoder r0 = r0.this$0
                    org.tukaani.xz.lzma.State r0 = r0.state
                    r0.updateLiteral()
                    return
            }

            int getMatchedPrice(int r6, int r7) {
                    r5 = this;
                    r0 = 256(0x100, float:3.59E-43)
                    r6 = r6 | r0
                    r1 = 0
                L4:
                    int r7 = r7 << 1
                    r2 = r7 & r0
                    int r2 = r2 + r0
                    int r3 = r6 >>> 8
                    int r2 = r2 + r3
                    int r3 = r6 >>> 7
                    r3 = r3 & 1
                    short[] r4 = r5.probs
                    short r2 = r4[r2]
                    int r2 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r2, r3)
                    int r1 = r1 + r2
                    int r6 = r6 << 1
                    r2 = r7 ^ r6
                    int r2 = ~r2
                    r0 = r0 & r2
                    r2 = 65536(0x10000, float:9.1835E-41)
                    if (r6 < r2) goto L4
                    return r1
            }

            int getNormalPrice(int r5) {
                    r4 = this;
                    r5 = r5 | 256(0x100, float:3.59E-43)
                    r0 = 0
                L3:
                    int r1 = r5 >>> 8
                    int r2 = r5 >>> 7
                    r2 = r2 & 1
                    short[] r3 = r4.probs
                    short r1 = r3[r1]
                    int r1 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r1, r2)
                    int r0 = r0 + r1
                    int r5 = r5 << 1
                    r1 = 65536(0x10000, float:9.1835E-41)
                    if (r5 < r1) goto L3
                    return r0
            }
        }

        static {
                java.lang.Class<org.tukaani.xz.lzma.LZMAEncoder> r0 = org.tukaani.xz.lzma.LZMAEncoder.class
                return
        }

        LiteralEncoder(org.tukaani.xz.lzma.LZMAEncoder r2, int r3, int r4) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2, r3, r4)
                r2 = 1
                int r3 = r3 + r4
                int r2 = r2 << r3
                org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder$LiteralSubencoder[] r2 = new org.tukaani.xz.lzma.LZMAEncoder.LiteralEncoder.LiteralSubencoder[r2]
                r1.subencoders = r2
                r2 = 0
            Ld:
                org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder$LiteralSubencoder[] r3 = r1.subencoders
                int r4 = r3.length
                if (r2 >= r4) goto L1d
                org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder$LiteralSubencoder r4 = new org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder$LiteralSubencoder
                r0 = 0
                r4.<init>(r1, r0)
                r3[r2] = r4
                int r2 = r2 + 1
                goto Ld
            L1d:
                return
        }

        void encode() throws java.io.IOException {
                r3 = this;
                org.tukaani.xz.lzma.LZMAEncoder r0 = r3.this$0
                org.tukaani.xz.lz.LZEncoder r0 = r0.lz
                org.tukaani.xz.lzma.LZMAEncoder r1 = r3.this$0
                int r1 = r1.readAhead
                int r1 = r1 + 1
                int r0 = r0.getByte(r1)
                org.tukaani.xz.lzma.LZMAEncoder r1 = r3.this$0
                org.tukaani.xz.lz.LZEncoder r1 = r1.lz
                int r1 = r1.getPos()
                org.tukaani.xz.lzma.LZMAEncoder r2 = r3.this$0
                int r2 = r2.readAhead
                int r1 = r1 - r2
                int r0 = r3.getSubcoderIndex(r0, r1)
                org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder$LiteralSubencoder[] r1 = r3.subencoders
                r0 = r1[r0]
                r0.encode()
                return
        }

        void encodeInit() throws java.io.IOException {
                r2 = this;
                org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder$LiteralSubencoder[] r0 = r2.subencoders
                r1 = 0
                r0 = r0[r1]
                r0.encode()
                return
        }

        int getPrice(int r3, int r4, int r5, int r6, org.tukaani.xz.lzma.State r7) {
                r2 = this;
                org.tukaani.xz.lzma.LZMAEncoder r0 = r2.this$0
                short[][] r0 = r0.isMatch
                int r1 = r7.get()
                r0 = r0[r1]
                org.tukaani.xz.lzma.LZMAEncoder r1 = r2.this$0
                int r1 = r1.posMask
                r1 = r1 & r6
                short r0 = r0[r1]
                r1 = 0
                int r0 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r0, r1)
                int r5 = r2.getSubcoderIndex(r5, r6)
                boolean r6 = r7.isLiteral()
                if (r6 == 0) goto L29
                org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder$LiteralSubencoder[] r4 = r2.subencoders
                r4 = r4[r5]
                int r3 = r4.getNormalPrice(r3)
                goto L31
            L29:
                org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder$LiteralSubencoder[] r6 = r2.subencoders
                r5 = r6[r5]
                int r3 = r5.getMatchedPrice(r3, r4)
            L31:
                int r0 = r0 + r3
                return r0
        }

        void reset() {
                r3 = this;
                r0 = 0
            L1:
                org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder$LiteralSubencoder[] r1 = r3.subencoders
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

    static {
            return
    }

    LZMAEncoder(org.tukaani.xz.rangecoder.RangeEncoder r7, org.tukaani.xz.lz.LZEncoder r8, int r9, int r10, int r11, int r12, int r13) {
            r6 = this;
            r6.<init>(r11)
            r0 = 0
            r6.distPriceCount = r0
            r6.alignPriceCount = r0
            r1 = 2
            int[] r2 = new int[r1]
            r3 = 1
            r4 = 128(0x80, float:1.8E-43)
            r2[r3] = r4
            r4 = 4
            r2[r0] = r4
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r5, r2)
            int[][] r2 = (int[][]) r2
            r6.fullDistPrices = r2
            r2 = 16
            int[] r2 = new int[r2]
            r6.alignPrices = r2
            r6.back = r0
            r2 = -1
            r6.readAhead = r2
            r6.uncompressedSize = r0
            r6.rc = r7
            r6.lz = r8
            r6.niceLen = r13
            org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r7 = new org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder
            r7.<init>(r6, r9, r10)
            r6.literalEncoder = r7
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r7 = new org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder
            r7.<init>(r6, r11, r13)
            r6.matchLenEncoder = r7
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r7 = new org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder
            r7.<init>(r6, r11, r13)
            r6.repLenEncoder = r7
            int r12 = r12 - r3
            int r7 = getDistSlot(r12)
            int r7 = r7 + r3
            r6.distSlotPricesSize = r7
            int[] r8 = new int[r1]
            r8[r3] = r7
            r8[r0] = r4
            java.lang.Class r7 = java.lang.Integer.TYPE
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r8)
            int[][] r7 = (int[][]) r7
            r6.distSlotPrices = r7
            r6.reset()
            return
    }

    static /* synthetic */ org.tukaani.xz.rangecoder.RangeEncoder access$100(org.tukaani.xz.lzma.LZMAEncoder r0) {
            org.tukaani.xz.rangecoder.RangeEncoder r0 = r0.rc
            return r0
    }

    private boolean encodeInit() throws java.io.IOException {
            r5 = this;
            org.tukaani.xz.lz.LZEncoder r0 = r5.lz
            r1 = 0
            boolean r0 = r0.hasEnoughData(r1)
            if (r0 != 0) goto La
            return r1
        La:
            r0 = 1
            r5.skip(r0)
            org.tukaani.xz.rangecoder.RangeEncoder r2 = r5.rc
            short[][] r3 = r5.isMatch
            org.tukaani.xz.lzma.State r4 = r5.state
            int r4 = r4.get()
            r3 = r3[r4]
            r2.encodeBit(r3, r1, r1)
            org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r1 = r5.literalEncoder
            r1.encodeInit()
            int r1 = r5.readAhead
            int r1 = r1 - r0
            r5.readAhead = r1
            int r1 = r5.uncompressedSize
            int r1 = r1 + r0
            r5.uncompressedSize = r1
            return r0
    }

    private void encodeMatch(int r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            org.tukaani.xz.lzma.State r0 = r5.state
            r0.updateMatch()
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r0 = r5.matchLenEncoder
            r0.encode(r7, r8)
            int r8 = getDistSlot(r6)
            org.tukaani.xz.rangecoder.RangeEncoder r0 = r5.rc
            short[][] r1 = r5.distSlots
            int r7 = getDistState(r7)
            r7 = r1[r7]
            r0.encodeBitTree(r7, r8)
            r7 = 2
            r0 = 1
            r1 = 4
            if (r8 < r1) goto L51
            int r2 = r8 >>> 1
            int r3 = r2 + (-1)
            r4 = r8 & 1
            r4 = r4 | r7
            int r3 = r4 << r3
            int r3 = r6 - r3
            r4 = 14
            if (r8 >= r4) goto L3a
            org.tukaani.xz.rangecoder.RangeEncoder r2 = r5.rc
            short[][] r4 = r5.distSpecial
            int r8 = r8 - r1
            r8 = r4[r8]
            r2.encodeReverseBitTree(r8, r3)
            goto L51
        L3a:
            org.tukaani.xz.rangecoder.RangeEncoder r8 = r5.rc
            int r1 = r3 >>> 4
            int r2 = r2 + (-5)
            r8.encodeDirectBits(r1, r2)
            org.tukaani.xz.rangecoder.RangeEncoder r8 = r5.rc
            short[] r1 = r5.distAlign
            r2 = r3 & 15
            r8.encodeReverseBitTree(r1, r2)
            int r8 = r5.alignPriceCount
            int r8 = r8 - r0
            r5.alignPriceCount = r8
        L51:
            int[] r8 = r5.reps
            int[] r1 = r5.reps
            r1 = r1[r7]
            r2 = 3
            r8[r2] = r1
            int[] r8 = r5.reps
            int[] r1 = r5.reps
            r1 = r1[r0]
            r8[r7] = r1
            int[] r7 = r5.reps
            int[] r8 = r5.reps
            r1 = 0
            r8 = r8[r1]
            r7[r0] = r8
            int[] r7 = r5.reps
            r7[r1] = r6
            int r6 = r5.distPriceCount
            int r6 = r6 - r0
            r5.distPriceCount = r6
            return
    }

    private void encodeRepMatch(int r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 != 0) goto L25
            org.tukaani.xz.rangecoder.RangeEncoder r8 = r7.rc
            short[] r2 = r7.isRep0
            org.tukaani.xz.lzma.State r3 = r7.state
            int r3 = r3.get()
            r8.encodeBit(r2, r3, r0)
            org.tukaani.xz.rangecoder.RangeEncoder r8 = r7.rc
            short[][] r2 = r7.isRep0Long
            org.tukaani.xz.lzma.State r3 = r7.state
            int r3 = r3.get()
            r2 = r2[r3]
            if (r9 != r1) goto L20
            goto L21
        L20:
            r0 = r1
        L21:
            r8.encodeBit(r2, r10, r0)
            goto L82
        L25:
            int[] r2 = r7.reps
            r2 = r2[r8]
            org.tukaani.xz.rangecoder.RangeEncoder r3 = r7.rc
            short[] r4 = r7.isRep0
            org.tukaani.xz.lzma.State r5 = r7.state
            int r5 = r5.get()
            r3.encodeBit(r4, r5, r1)
            if (r8 != r1) goto L46
            org.tukaani.xz.rangecoder.RangeEncoder r8 = r7.rc
            short[] r3 = r7.isRep1
            org.tukaani.xz.lzma.State r4 = r7.state
            int r4 = r4.get()
            r8.encodeBit(r3, r4, r0)
            goto L76
        L46:
            org.tukaani.xz.rangecoder.RangeEncoder r3 = r7.rc
            short[] r4 = r7.isRep1
            org.tukaani.xz.lzma.State r5 = r7.state
            int r5 = r5.get()
            r3.encodeBit(r4, r5, r1)
            org.tukaani.xz.rangecoder.RangeEncoder r3 = r7.rc
            short[] r4 = r7.isRep2
            org.tukaani.xz.lzma.State r5 = r7.state
            int r5 = r5.get()
            int r6 = r8 + (-2)
            r3.encodeBit(r4, r5, r6)
            r3 = 3
            r4 = 2
            if (r8 != r3) goto L6e
            int[] r8 = r7.reps
            int[] r5 = r7.reps
            r5 = r5[r4]
            r8[r3] = r5
        L6e:
            int[] r8 = r7.reps
            int[] r3 = r7.reps
            r3 = r3[r1]
            r8[r4] = r3
        L76:
            int[] r8 = r7.reps
            int[] r3 = r7.reps
            r3 = r3[r0]
            r8[r1] = r3
            int[] r8 = r7.reps
            r8[r0] = r2
        L82:
            if (r9 != r1) goto L8a
            org.tukaani.xz.lzma.State r8 = r7.state
            r8.updateShortRep()
            goto L94
        L8a:
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r8 = r7.repLenEncoder
            r8.encode(r9, r10)
            org.tukaani.xz.lzma.State r8 = r7.state
            r8.updateLongRep()
        L94:
            return
    }

    private boolean encodeSymbol() throws java.io.IOException {
            r8 = this;
            org.tukaani.xz.lz.LZEncoder r0 = r8.lz
            int r1 = r8.readAhead
            r2 = 1
            int r1 = r1 + r2
            boolean r0 = r0.hasEnoughData(r1)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            int r0 = r8.getNextSymbol()
            org.tukaani.xz.lz.LZEncoder r3 = r8.lz
            int r3 = r3.getPos()
            int r4 = r8.readAhead
            int r3 = r3 - r4
            int r4 = r8.posMask
            r3 = r3 & r4
            int r4 = r8.back
            r5 = -1
            if (r4 != r5) goto L38
            org.tukaani.xz.rangecoder.RangeEncoder r4 = r8.rc
            short[][] r5 = r8.isMatch
            org.tukaani.xz.lzma.State r6 = r8.state
            int r6 = r6.get()
            r5 = r5[r6]
            r4.encodeBit(r5, r3, r1)
            org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r1 = r8.literalEncoder
            r1.encode()
            goto L72
        L38:
            org.tukaani.xz.rangecoder.RangeEncoder r4 = r8.rc
            short[][] r5 = r8.isMatch
            org.tukaani.xz.lzma.State r6 = r8.state
            int r6 = r6.get()
            r5 = r5[r6]
            r4.encodeBit(r5, r3, r2)
            int r4 = r8.back
            r5 = 4
            if (r4 >= r5) goto L5f
            org.tukaani.xz.rangecoder.RangeEncoder r1 = r8.rc
            short[] r4 = r8.isRep
            org.tukaani.xz.lzma.State r5 = r8.state
            int r5 = r5.get()
            r1.encodeBit(r4, r5, r2)
            int r1 = r8.back
            r8.encodeRepMatch(r1, r0, r3)
            goto L72
        L5f:
            org.tukaani.xz.rangecoder.RangeEncoder r4 = r8.rc
            short[] r6 = r8.isRep
            org.tukaani.xz.lzma.State r7 = r8.state
            int r7 = r7.get()
            r4.encodeBit(r6, r7, r1)
            int r1 = r8.back
            int r1 = r1 - r5
            r8.encodeMatch(r1, r0, r3)
        L72:
            int r1 = r8.readAhead
            int r1 = r1 - r0
            r8.readAhead = r1
            int r1 = r8.uncompressedSize
            int r1 = r1 + r0
            r8.uncompressedSize = r1
            return r2
    }

    public static int getDistSlot(int r2) {
            r0 = 4
            if (r2 > r0) goto L6
            if (r2 < 0) goto L6
            return r2
        L6:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r1 = 31 - r0
            int r1 = r1 << 1
            int r0 = 30 - r0
            int r2 = r2 >>> r0
            r2 = r2 & 1
            int r1 = r1 + r2
            return r1
    }

    public static org.tukaani.xz.lzma.LZMAEncoder getInstance(org.tukaani.xz.rangecoder.RangeEncoder r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, org.tukaani.xz.ArrayCache r23) {
            r0 = r17
            r1 = 1
            if (r0 == r1) goto L26
            r1 = 2
            if (r0 != r1) goto L20
            org.tukaani.xz.lzma.LZMAEncoderNormal r0 = new org.tukaani.xz.lzma.LZMAEncoderNormal
            r2 = r0
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L26:
            org.tukaani.xz.lzma.LZMAEncoderFast r0 = new org.tukaani.xz.lzma.LZMAEncoderFast
            r1 = r0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public static int getMemoryUsage(int r1, int r2, int r3, int r4) {
            r0 = 1
            if (r1 == r0) goto L11
            r0 = 2
            if (r1 != r0) goto Lb
            int r1 = org.tukaani.xz.lzma.LZMAEncoderNormal.getMemoryUsage(r2, r3, r4)
            goto L15
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L11:
            int r1 = org.tukaani.xz.lzma.LZMAEncoderFast.getMemoryUsage(r2, r3, r4)
        L15:
            int r1 = r1 + 80
            return r1
    }

    private void updateAlignPrices() {
            r4 = this;
            r0 = 16
            r4.alignPriceCount = r0
            r1 = 0
        L5:
            if (r1 >= r0) goto L14
            int[] r2 = r4.alignPrices
            short[] r3 = r4.distAlign
            int r3 = org.tukaani.xz.rangecoder.RangeEncoder.getReverseBitTreePrice(r3, r1)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L5
        L14:
            return
    }

    private void updateDistPrices() {
            r13 = this;
            r0 = 128(0x80, float:1.8E-43)
            r13.distPriceCount = r0
            r0 = 0
            r1 = r0
        L6:
            r2 = 14
            r3 = 4
            if (r1 >= r3) goto L4e
            r4 = r0
        Lc:
            int r5 = r13.distSlotPricesSize
            if (r4 >= r5) goto L21
            int[][] r5 = r13.distSlotPrices
            r5 = r5[r1]
            short[][] r6 = r13.distSlots
            r6 = r6[r1]
            int r6 = org.tukaani.xz.rangecoder.RangeEncoder.getBitTreePrice(r6, r4)
            r5[r4] = r6
            int r4 = r4 + 1
            goto Lc
        L21:
            int r4 = r13.distSlotPricesSize
            if (r2 >= r4) goto L39
            int r4 = r2 >>> 1
            int r4 = r4 + (-5)
            int[][] r5 = r13.distSlotPrices
            r5 = r5[r1]
            r6 = r5[r2]
            int r4 = org.tukaani.xz.rangecoder.RangeEncoder.getDirectBitsPrice(r4)
            int r6 = r6 + r4
            r5[r2] = r6
            int r2 = r2 + 1
            goto L21
        L39:
            r2 = r0
        L3a:
            if (r2 >= r3) goto L4b
            int[][] r4 = r13.fullDistPrices
            r4 = r4[r1]
            int[][] r5 = r13.distSlotPrices
            r5 = r5[r1]
            r5 = r5[r2]
            r4[r2] = r5
            int r2 = r2 + 1
            goto L3a
        L4b:
            int r1 = r1 + 1
            goto L6
        L4e:
            r1 = r3
            r4 = r1
        L50:
            if (r1 >= r2) goto L8b
            int r5 = r1 >>> 1
            int r5 = r5 + (-1)
            r6 = r1 & 1
            r6 = r6 | 2
            int r5 = r6 << r5
            short[][] r6 = r13.distSpecial
            int r7 = r1 + (-4)
            r6 = r6[r7]
            int r6 = r6.length
            r8 = r0
        L64:
            if (r8 >= r6) goto L88
            int r9 = r4 - r5
            short[][] r10 = r13.distSpecial
            r10 = r10[r7]
            int r9 = org.tukaani.xz.rangecoder.RangeEncoder.getReverseBitTreePrice(r10, r9)
            r10 = r0
        L71:
            if (r10 >= r3) goto L83
            int[][] r11 = r13.fullDistPrices
            r11 = r11[r10]
            int[][] r12 = r13.distSlotPrices
            r12 = r12[r10]
            r12 = r12[r1]
            int r12 = r12 + r9
            r11[r4] = r12
            int r10 = r10 + 1
            goto L71
        L83:
            int r4 = r4 + 1
            int r8 = r8 + 1
            goto L64
        L88:
            int r1 = r1 + 1
            goto L50
        L8b:
            return
    }

    public void encodeForLZMA1() throws java.io.IOException {
            r1 = this;
            org.tukaani.xz.lz.LZEncoder r0 = r1.lz
            boolean r0 = r0.isStarted()
            if (r0 != 0) goto Lf
            boolean r0 = r1.encodeInit()
            if (r0 != 0) goto Lf
            return
        Lf:
            boolean r0 = r1.encodeSymbol()
            if (r0 == 0) goto L16
            goto Lf
        L16:
            return
    }

    public boolean encodeForLZMA2() {
            r3 = this;
            org.tukaani.xz.lz.LZEncoder r0 = r3.lz     // Catch: java.io.IOException -> L2b
            boolean r0 = r0.isStarted()     // Catch: java.io.IOException -> L2b
            r1 = 0
            if (r0 != 0) goto L10
            boolean r0 = r3.encodeInit()     // Catch: java.io.IOException -> L2b
            if (r0 != 0) goto L10
            return r1
        L10:
            int r0 = r3.uncompressedSize     // Catch: java.io.IOException -> L2b
            r2 = 2096879(0x1ffeef, float:2.938353E-39)
            if (r0 > r2) goto L29
            org.tukaani.xz.rangecoder.RangeEncoder r0 = r3.rc     // Catch: java.io.IOException -> L2b
            int r0 = r0.getPendingSize()     // Catch: java.io.IOException -> L2b
            r2 = 65510(0xffe6, float:9.1799E-41)
            if (r0 > r2) goto L29
            boolean r0 = r3.encodeSymbol()     // Catch: java.io.IOException -> L2b
            if (r0 != 0) goto L10
            return r1
        L29:
            r0 = 1
            return r0
        L2b:
            java.lang.Error r0 = new java.lang.Error
            r0.<init>()
            throw r0
    }

    public void encodeLZMA1EndMarker() throws java.io.IOException {
            r5 = this;
            org.tukaani.xz.lz.LZEncoder r0 = r5.lz
            int r0 = r0.getPos()
            int r1 = r5.readAhead
            int r0 = r0 - r1
            int r1 = r5.posMask
            r0 = r0 & r1
            org.tukaani.xz.rangecoder.RangeEncoder r1 = r5.rc
            short[][] r2 = r5.isMatch
            org.tukaani.xz.lzma.State r3 = r5.state
            int r3 = r3.get()
            r2 = r2[r3]
            r3 = 1
            r1.encodeBit(r2, r0, r3)
            org.tukaani.xz.rangecoder.RangeEncoder r1 = r5.rc
            short[] r2 = r5.isRep
            org.tukaani.xz.lzma.State r3 = r5.state
            int r3 = r3.get()
            r4 = 0
            r1.encodeBit(r2, r3, r4)
            r1 = -1
            r2 = 2
            r5.encodeMatch(r1, r2, r0)
            return
    }

    int getAnyMatchPrice(org.tukaani.xz.lzma.State r2, int r3) {
            r1 = this;
            short[][] r0 = r1.isMatch
            int r2 = r2.get()
            r2 = r0[r2]
            short r2 = r2[r3]
            r3 = 1
            int r2 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r2, r3)
            return r2
    }

    int getAnyRepPrice(int r2, org.tukaani.xz.lzma.State r3) {
            r1 = this;
            short[] r0 = r1.isRep
            int r3 = r3.get()
            short r3 = r0[r3]
            r0 = 1
            int r3 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r3, r0)
            int r2 = r2 + r3
            return r2
    }

    public org.tukaani.xz.lz.LZEncoder getLZEncoder() {
            r1 = this;
            org.tukaani.xz.lz.LZEncoder r0 = r1.lz
            return r0
    }

    int getLongRepAndLenPrice(int r2, int r3, org.tukaani.xz.lzma.State r4, int r5) {
            r1 = this;
            int r0 = r1.getAnyMatchPrice(r4, r5)
            int r0 = r1.getAnyRepPrice(r0, r4)
            int r2 = r1.getLongRepPrice(r0, r2, r4, r5)
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r4 = r1.repLenEncoder
            int r3 = r4.getPrice(r3, r5)
            int r2 = r2 + r3
            return r2
    }

    int getLongRepPrice(int r4, int r5, org.tukaani.xz.lzma.State r6, int r7) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L21
            short[] r5 = r3.isRep0
            int r2 = r6.get()
            short r5 = r5[r2]
            int r5 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r5, r0)
            short[][] r0 = r3.isRep0Long
            int r6 = r6.get()
            r6 = r0[r6]
            short r6 = r6[r7]
            int r6 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r6, r1)
            int r5 = r5 + r6
        L1f:
            int r4 = r4 + r5
            goto L59
        L21:
            short[] r7 = r3.isRep0
            int r2 = r6.get()
            short r7 = r7[r2]
            int r7 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r7, r1)
            int r4 = r4 + r7
            if (r5 != r1) goto L3d
            short[] r5 = r3.isRep1
            int r6 = r6.get()
            short r5 = r5[r6]
            int r5 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r5, r0)
            goto L1f
        L3d:
            short[] r7 = r3.isRep1
            int r0 = r6.get()
            short r7 = r7[r0]
            int r7 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r7, r1)
            short[] r0 = r3.isRep2
            int r6 = r6.get()
            short r6 = r0[r6]
            int r5 = r5 + (-2)
            int r5 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r6, r5)
            int r7 = r7 + r5
            int r4 = r4 + r7
        L59:
            return r4
    }

    int getMatchAndLenPrice(int r2, int r3, int r4, int r5) {
            r1 = this;
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r0 = r1.matchLenEncoder
            int r5 = r0.getPrice(r4, r5)
            int r2 = r2 + r5
            int r4 = getDistState(r4)
            r5 = 128(0x80, float:1.8E-43)
            if (r3 >= r5) goto L17
            int[][] r5 = r1.fullDistPrices
            r4 = r5[r4]
            r3 = r4[r3]
            int r2 = r2 + r3
            goto L29
        L17:
            int r5 = getDistSlot(r3)
            int[][] r0 = r1.distSlotPrices
            r4 = r0[r4]
            r4 = r4[r5]
            int[] r5 = r1.alignPrices
            r3 = r3 & 15
            r3 = r5[r3]
            int r4 = r4 + r3
            int r2 = r2 + r4
        L29:
            return r2
    }

    org.tukaani.xz.lz.Matches getMatches() {
            r1 = this;
            int r0 = r1.readAhead
            int r0 = r0 + 1
            r1.readAhead = r0
            org.tukaani.xz.lz.LZEncoder r0 = r1.lz
            org.tukaani.xz.lz.Matches r0 = r0.getMatches()
            return r0
    }

    abstract int getNextSymbol();

    int getNormalMatchPrice(int r2, org.tukaani.xz.lzma.State r3) {
            r1 = this;
            short[] r0 = r1.isRep
            int r3 = r3.get()
            short r3 = r0[r3]
            r0 = 0
            int r3 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r3, r0)
            int r2 = r2 + r3
            return r2
    }

    int getShortRepPrice(int r3, org.tukaani.xz.lzma.State r4, int r5) {
            r2 = this;
            short[] r0 = r2.isRep0
            int r1 = r4.get()
            short r0 = r0[r1]
            r1 = 0
            int r0 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r0, r1)
            int r3 = r3 + r0
            short[][] r0 = r2.isRep0Long
            int r4 = r4.get()
            r4 = r0[r4]
            short r4 = r4[r5]
            int r4 = org.tukaani.xz.rangecoder.RangeEncoder.getBitPrice(r4, r1)
            int r3 = r3 + r4
            return r3
    }

    public int getUncompressedSize() {
            r1 = this;
            int r0 = r1.uncompressedSize
            return r0
    }

    public void putArraysToCache(org.tukaani.xz.ArrayCache r2) {
            r1 = this;
            org.tukaani.xz.lz.LZEncoder r0 = r1.lz
            r0.putArraysToCache(r2)
            return
    }

    @Override // org.tukaani.xz.lzma.LZMACoder
    public void reset() {
            r2 = this;
            super.reset()
            org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder r0 = r2.literalEncoder
            r0.reset()
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r0 = r2.matchLenEncoder
            r0.reset()
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r0 = r2.repLenEncoder
            r0.reset()
            r0 = 0
            r2.distPriceCount = r0
            r2.alignPriceCount = r0
            int r0 = r2.uncompressedSize
            int r1 = r2.readAhead
            int r1 = r1 + 1
            int r0 = r0 + r1
            r2.uncompressedSize = r0
            r0 = -1
            r2.readAhead = r0
            return
    }

    public void resetUncompressedSize() {
            r1 = this;
            r0 = 0
            r1.uncompressedSize = r0
            return
    }

    void skip(int r2) {
            r1 = this;
            int r0 = r1.readAhead
            int r0 = r0 + r2
            r1.readAhead = r0
            org.tukaani.xz.lz.LZEncoder r0 = r1.lz
            r0.skip(r2)
            return
    }

    void updatePrices() {
            r1 = this;
            int r0 = r1.distPriceCount
            if (r0 > 0) goto L7
            r1.updateDistPrices()
        L7:
            int r0 = r1.alignPriceCount
            if (r0 > 0) goto Le
            r1.updateAlignPrices()
        Le:
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r0 = r1.matchLenEncoder
            r0.updatePrices()
            org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder r0 = r1.repLenEncoder
            r0.updatePrices()
            return
    }
}
