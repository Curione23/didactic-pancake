package org.apache.commons.compress.compressors.lz77support;

/* JADX INFO: loaded from: classes2.dex */
public class LZ77Compressor {
    private static final int HASH_MASK = 32767;
    private static final int HASH_SIZE = 32768;
    private static final int H_SHIFT = 5;
    private static final int NO_MATCH = -1;
    static final int NUMBER_OF_BYTES_IN_HASH = 3;
    private static final org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block THE_EOD = null;
    private int blockStart;
    private final org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Callback callback;
    private int currentPosition;
    private final int[] head;
    private boolean initialized;
    private int insertHash;
    private int lookahead;
    private int matchStart;
    private int missedInserts;
    private final org.apache.commons.compress.compressors.lz77support.Parameters params;
    private final int[] prev;
    private final int wMask;
    private final byte[] window;

    public static final class BackReference extends org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block {
        private final int length;
        private final int offset;

        public BackReference(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.offset = r1
                r0.length = r2
                return
        }

        public int getLength() {
                r1 = this;
                int r0 = r1.length
                return r0
        }

        public int getOffset() {
                r1 = this;
                int r0 = r1.offset
                return r0
        }

        @Override // org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block
        public org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType getType() {
                r1 = this;
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r0 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "BackReference with offset "
                r0.<init>(r1)
                int r1 = r2.offset
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " and length "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.length
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static abstract class Block {

        public enum BlockType extends java.lang.Enum<org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType> {
            private static final /* synthetic */ org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType[] $VALUES = null;
            public static final org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType BACK_REFERENCE = null;
            public static final org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType EOD = null;
            public static final org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType LITERAL = null;

            private static /* synthetic */ org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType[] $values() {
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r0 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r2 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.EOD
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType[] r0 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType[]{r0, r1, r2}
                    return r0
            }

            static {
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r0 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType
                    java.lang.String r1 = "LITERAL"
                    r2 = 0
                    r0.<init>(r1, r2)
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL = r0
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r0 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType
                    java.lang.String r1 = "BACK_REFERENCE"
                    r2 = 1
                    r0.<init>(r1, r2)
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE = r0
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r0 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType
                    java.lang.String r1 = "EOD"
                    r2 = 2
                    r0.<init>(r1, r2)
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.EOD = r0
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType[] r0 = $values()
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.$VALUES = r0
                    return
            }

            BlockType(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType valueOf(java.lang.String r1) {
                    java.lang.Class<org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType> r0 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = (org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType) r1
                    return r1
            }

            public static org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType[] values() {
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType[] r0 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.$VALUES
                    java.lang.Object r0 = r0.clone()
                    org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType[] r0 = (org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType[]) r0
                    return r0
            }
        }

        public Block() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType getType();
    }

    public interface Callback {
        void accept(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block r1) throws java.io.IOException;
    }

    public static final class EOD extends org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block {
        public EOD() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block
        public org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType getType() {
                r1 = this;
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r0 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.EOD
                return r0
        }
    }

    public static final class LiteralBlock extends org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block {
        private final byte[] data;
        private final int length;
        private final int offset;

        public LiteralBlock(byte[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.data = r1
                r0.offset = r2
                r0.length = r3
                return
        }

        public byte[] getData() {
                r1 = this;
                byte[] r0 = r1.data
                return r0
        }

        public int getLength() {
                r1 = this;
                int r0 = r1.length
                return r0
        }

        public int getOffset() {
                r1 = this;
                int r0 = r1.offset
                return r0
        }

        @Override // org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block
        public org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType getType() {
                r1 = this;
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r0 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "LiteralBlock starting at "
                r0.<init>(r1)
                int r1 = r2.offset
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " with length "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.length
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$EOD r0 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor$EOD
            r0.<init>()
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor.THE_EOD = r0
            return
    }

    public LZ77Compressor(org.apache.commons.compress.compressors.lz77support.Parameters r3, org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Callback r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.matchStart = r0
            java.lang.String r1 = "params"
            java.util.Objects.requireNonNull(r3, r1)
            java.lang.String r1 = "callback"
            java.util.Objects.requireNonNull(r4, r1)
            r2.params = r3
            r2.callback = r4
            int r3 = r3.getWindowSize()
            int r4 = r3 * 2
            byte[] r4 = new byte[r4]
            r2.window = r4
            int r4 = r3 + (-1)
            r2.wMask = r4
            r4 = 32768(0x8000, float:4.5918E-41)
            int[] r4 = new int[r4]
            int[] r4 = org.apache.commons.lang3.ArrayFill.fill(r4, r0)
            r2.head = r4
            int[] r3 = new int[r3]
            r2.prev = r3
            return
    }

    private void catchUpMissedInserts() {
            r3 = this;
        L0:
            int r0 = r3.missedInserts
            if (r0 <= 0) goto Lf
            int r1 = r3.currentPosition
            int r2 = r0 + (-1)
            r3.missedInserts = r2
            int r1 = r1 - r0
            r3.insertString(r1)
            goto L0
        Lf:
            return
    }

    private void compress() throws java.io.IOException {
            r7 = this;
            org.apache.commons.compress.compressors.lz77support.Parameters r0 = r7.params
            int r0 = r0.getMinBackReferenceLength()
            org.apache.commons.compress.compressors.lz77support.Parameters r1 = r7.params
            boolean r1 = r1.getLazyMatching()
            org.apache.commons.compress.compressors.lz77support.Parameters r2 = r7.params
            int r2 = r2.getLazyMatchingThreshold()
        L12:
            int r3 = r7.lookahead
            if (r3 < r0) goto L7f
            r7.catchUpMissedInserts()
            int r3 = r7.currentPosition
            int r3 = r7.insertString(r3)
            r4 = -1
            if (r3 == r4) goto L3f
            int r5 = r7.currentPosition
            int r5 = r3 - r5
            org.apache.commons.compress.compressors.lz77support.Parameters r6 = r7.params
            int r6 = r6.getMaxOffset()
            if (r5 > r6) goto L3f
            int r3 = r7.longestMatch(r3)
            if (r1 == 0) goto L40
            if (r3 > r2) goto L40
            int r5 = r7.lookahead
            if (r5 <= r0) goto L40
            int r3 = r7.longestMatchForNextPosition(r3)
            goto L40
        L3f:
            r3 = 0
        L40:
            if (r3 < r0) goto L60
            int r5 = r7.blockStart
            int r6 = r7.currentPosition
            if (r5 == r6) goto L4d
            r7.flushLiteralBlock()
            r7.blockStart = r4
        L4d:
            r7.flushBackReference(r3)
            r7.insertStringsInMatch(r3)
            int r4 = r7.lookahead
            int r4 = r4 - r3
            r7.lookahead = r4
            int r4 = r7.currentPosition
            int r4 = r4 + r3
            r7.currentPosition = r4
            r7.blockStart = r4
            goto L12
        L60:
            int r3 = r7.lookahead
            int r3 = r3 + (-1)
            r7.lookahead = r3
            int r3 = r7.currentPosition
            int r3 = r3 + 1
            r7.currentPosition = r3
            int r4 = r7.blockStart
            int r3 = r3 - r4
            org.apache.commons.compress.compressors.lz77support.Parameters r4 = r7.params
            int r4 = r4.getMaxLiteralLength()
            if (r3 < r4) goto L12
            r7.flushLiteralBlock()
            int r3 = r7.currentPosition
            r7.blockStart = r3
            goto L12
        L7f:
            return
    }

    private void doCompress(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.window
            int r0 = r0.length
            int r1 = r3.currentPosition
            int r0 = r0 - r1
            int r1 = r3.lookahead
            int r0 = r0 - r1
            if (r6 <= r0) goto Le
            r3.slide()
        Le:
            byte[] r0 = r3.window
            int r1 = r3.currentPosition
            int r2 = r3.lookahead
            int r1 = r1 + r2
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            int r4 = r3.lookahead
            int r4 = r4 + r6
            r3.lookahead = r4
            boolean r5 = r3.initialized
            if (r5 != 0) goto L2c
            org.apache.commons.compress.compressors.lz77support.Parameters r5 = r3.params
            int r5 = r5.getMinBackReferenceLength()
            if (r4 < r5) goto L2c
            r3.initialize()
        L2c:
            boolean r4 = r3.initialized
            if (r4 == 0) goto L33
            r3.compress()
        L33:
            return
    }

    private void flushBackReference(int r5) throws java.io.IOException {
            r4 = this;
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Callback r0 = r4.callback
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$BackReference r1 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor$BackReference
            int r2 = r4.currentPosition
            int r3 = r4.matchStart
            int r2 = r2 - r3
            r1.<init>(r2, r5)
            r0.accept(r1)
            return
    }

    private void flushLiteralBlock() throws java.io.IOException {
            r5 = this;
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Callback r0 = r5.callback
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$LiteralBlock r1 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor$LiteralBlock
            byte[] r2 = r5.window
            int r3 = r5.blockStart
            int r4 = r5.currentPosition
            int r4 = r4 - r3
            r1.<init>(r2, r3, r4)
            r0.accept(r1)
            return
    }

    private void initialize() {
            r3 = this;
            r0 = 0
        L1:
            r1 = 2
            if (r0 >= r1) goto L13
            int r1 = r3.insertHash
            byte[] r2 = r3.window
            r2 = r2[r0]
            int r1 = r3.nextHash(r1, r2)
            r3.insertHash = r1
            int r0 = r0 + 1
            goto L1
        L13:
            r0 = 1
            r3.initialized = r0
            return
    }

    private int insertString(int r6) {
            r5 = this;
            int r0 = r5.insertHash
            byte[] r1 = r5.window
            int r2 = r6 + 2
            r1 = r1[r2]
            int r0 = r5.nextHash(r0, r1)
            r5.insertHash = r0
            int[] r1 = r5.head
            r2 = r1[r0]
            int[] r3 = r5.prev
            int r4 = r5.wMask
            r4 = r4 & r6
            r3[r4] = r2
            r1[r0] = r6
            return r2
    }

    private void insertStringsInMatch(int r5) {
            r4 = this;
            int r0 = r5 + (-1)
            int r1 = r4.lookahead
            int r1 = r1 + (-3)
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 1
            r2 = r1
        Lc:
            if (r2 > r0) goto L17
            int r3 = r4.currentPosition
            int r3 = r3 + r2
            r4.insertString(r3)
            int r2 = r2 + 1
            goto Lc
        L17:
            int r5 = r5 - r0
            int r5 = r5 - r1
            r4.missedInserts = r5
            return
    }

    private int longestMatch(int r13) {
            r12 = this;
            org.apache.commons.compress.compressors.lz77support.Parameters r0 = r12.params
            int r0 = r0.getMinBackReferenceLength()
            int r0 = r0 + (-1)
            org.apache.commons.compress.compressors.lz77support.Parameters r1 = r12.params
            int r1 = r1.getMaxBackReferenceLength()
            int r2 = r12.lookahead
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r12.currentPosition
            org.apache.commons.compress.compressors.lz77support.Parameters r3 = r12.params
            int r3 = r3.getMaxOffset()
            int r2 = r2 - r3
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            org.apache.commons.compress.compressors.lz77support.Parameters r4 = r12.params
            int r4 = r4.getNiceBackReferenceLength()
            int r4 = java.lang.Math.min(r1, r4)
            org.apache.commons.compress.compressors.lz77support.Parameters r5 = r12.params
            int r5 = r5.getMaxCandidates()
            r6 = r3
        L33:
            if (r6 >= r5) goto L60
            if (r13 < r2) goto L60
            r7 = r3
            r8 = r7
        L39:
            if (r7 >= r1) goto L4e
            byte[] r9 = r12.window
            int r10 = r13 + r7
            r10 = r9[r10]
            int r11 = r12.currentPosition
            int r11 = r11 + r7
            r9 = r9[r11]
            if (r10 == r9) goto L49
            goto L4e
        L49:
            int r8 = r8 + 1
            int r7 = r7 + 1
            goto L39
        L4e:
            if (r8 <= r0) goto L56
            r12.matchStart = r13
            r0 = r8
            if (r8 < r4) goto L56
            goto L60
        L56:
            int[] r7 = r12.prev
            int r8 = r12.wMask
            r13 = r13 & r8
            r13 = r7[r13]
            int r6 = r6 + 1
            goto L33
        L60:
            return r0
    }

    private int longestMatchForNextPosition(int r7) {
            r6 = this;
            int r0 = r6.matchStart
            int r1 = r6.insertHash
            int r2 = r6.lookahead
            int r2 = r2 + (-1)
            r6.lookahead = r2
            int r2 = r6.currentPosition
            int r2 = r2 + 1
            r6.currentPosition = r2
            int r2 = r6.insertString(r2)
            int[] r3 = r6.prev
            int r4 = r6.currentPosition
            int r5 = r6.wMask
            r4 = r4 & r5
            r3 = r3[r4]
            int r2 = r6.longestMatch(r2)
            if (r2 > r7) goto L3a
            r6.matchStart = r0
            int[] r0 = r6.head
            int r2 = r6.insertHash
            r0[r2] = r3
            r6.insertHash = r1
            int r0 = r6.currentPosition
            int r0 = r0 + (-1)
            r6.currentPosition = r0
            int r0 = r6.lookahead
            int r0 = r0 + 1
            r6.lookahead = r0
            goto L3b
        L3a:
            r7 = r2
        L3b:
            return r7
    }

    private int nextHash(int r1, byte r2) {
            r0 = this;
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 5
            r1 = r1 ^ r2
            r1 = r1 & 32767(0x7fff, float:4.5916E-41)
            return r1
    }

    private void slide() throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.compressors.lz77support.Parameters r0 = r6.params
            int r0 = r0.getWindowSize()
            int r1 = r6.blockStart
            int r2 = r6.currentPosition
            if (r1 == r2) goto L15
            if (r1 >= r0) goto L15
            r6.flushLiteralBlock()
            int r1 = r6.currentPosition
            r6.blockStart = r1
        L15:
            byte[] r1 = r6.window
            r2 = 0
            java.lang.System.arraycopy(r1, r0, r1, r2, r0)
            int r1 = r6.currentPosition
            int r1 = r1 - r0
            r6.currentPosition = r1
            int r1 = r6.matchStart
            int r1 = r1 - r0
            r6.matchStart = r1
            int r1 = r6.blockStart
            int r1 = r1 - r0
            r6.blockStart = r1
            r1 = r2
        L2b:
            r3 = 32768(0x8000, float:4.5918E-41)
            r4 = -1
            if (r1 >= r3) goto L3e
            int[] r3 = r6.head
            r5 = r3[r1]
            if (r5 < r0) goto L39
            int r4 = r5 - r0
        L39:
            r3[r1] = r4
            int r1 = r1 + 1
            goto L2b
        L3e:
            if (r2 >= r0) goto L4e
            int[] r1 = r6.prev
            r3 = r1[r2]
            if (r3 < r0) goto L48
            int r3 = r3 - r0
            goto L49
        L48:
            r3 = r4
        L49:
            r1[r2] = r3
            int r2 = r2 + 1
            goto L3e
        L4e:
            return
    }

    public void compress(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.compress(r3, r0, r1)
            return
    }

    public void compress(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.lz77support.Parameters r0 = r1.params
            int r0 = r0.getWindowSize()
        L6:
            if (r4 <= r0) goto Le
            r1.doCompress(r2, r3, r0)
            int r3 = r3 + r0
            int r4 = r4 - r0
            goto L6
        Le:
            if (r4 <= 0) goto L13
            r1.doCompress(r2, r3, r4)
        L13:
            return
    }

    public void finish() throws java.io.IOException {
            r2 = this;
            int r0 = r2.blockStart
            int r1 = r2.currentPosition
            if (r0 != r1) goto La
            int r0 = r2.lookahead
            if (r0 <= 0) goto L12
        La:
            int r0 = r2.lookahead
            int r1 = r1 + r0
            r2.currentPosition = r1
            r2.flushLiteralBlock()
        L12:
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Callback r0 = r2.callback
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block r1 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.THE_EOD
            r0.accept(r1)
            return
    }

    public void prefill(byte[] r5) {
            r4 = this;
            int r0 = r4.currentPosition
            if (r0 != 0) goto L36
            int r0 = r4.lookahead
            if (r0 != 0) goto L36
            org.apache.commons.compress.compressors.lz77support.Parameters r0 = r4.params
            int r0 = r0.getWindowSize()
            int r1 = r5.length
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r5.length
            int r1 = r1 - r0
            byte[] r2 = r4.window
            r3 = 0
            java.lang.System.arraycopy(r5, r1, r2, r3, r0)
            r5 = 3
            if (r0 < r5) goto L2f
            r4.initialize()
            int r5 = r0 + (-2)
        L23:
            if (r3 >= r5) goto L2b
            r4.insertString(r3)
            int r3 = r3 + 1
            goto L23
        L2b:
            r5 = 2
            r4.missedInserts = r5
            goto L31
        L2f:
            r4.missedInserts = r0
        L31:
            r4.currentPosition = r0
            r4.blockStart = r0
            return
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "The compressor has already started to accept data, can't prefill anymore"
            r5.<init>(r0)
            throw r5
    }
}
