package org.apache.commons.compress.compressors.deflate64;

/* JADX INFO: loaded from: classes2.dex */
class HuffmanDecoder implements java.io.Closeable {
    private static final int[] CODE_LENGTHS_ORDER = null;
    private static final int[] DISTANCE_TABLE = null;
    private static final int[] FIXED_DISTANCE = null;
    private static final int[] FIXED_LITERALS = null;
    private static final short[] RUN_LENGTH_TABLE = null;
    private boolean finalBlock;
    private final java.io.InputStream in;
    private final org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecodingMemory memory;
    private org.apache.commons.compress.utils.BitInputStream reader;
    private org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState state;

    /* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class BinaryTreeNode {
        private final int bits;
        org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode leftNode;
        int literal;
        org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode rightNode;

        private BinaryTreeNode(int r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.literal = r0
                r1.bits = r2
                return
        }

        /* synthetic */ BinaryTreeNode(int r1, org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        void leaf(int r1) {
                r0 = this;
                r0.literal = r1
                r1 = 0
                r0.leftNode = r1
                r0.rightNode = r1
                return
        }

        org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode left() {
                r2 = this;
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r0 = r2.leftNode
                if (r0 != 0) goto L14
                int r0 = r2.literal
                r1 = -1
                if (r0 != r1) goto L14
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode
                int r1 = r2.bits
                int r1 = r1 + 1
                r0.<init>(r1)
                r2.leftNode = r0
            L14:
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r0 = r2.leftNode
                return r0
        }

        org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode right() {
                r2 = this;
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r0 = r2.rightNode
                if (r0 != 0) goto L14
                int r0 = r2.literal
                r1 = -1
                if (r0 != r1) goto L14
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode
                int r1 = r2.bits
                int r1 = r1 + 1
                r0.<init>(r1)
                r2.rightNode = r0
            L14:
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r0 = r2.rightNode
                return r0
        }
    }

    private static abstract class DecoderState {
        private DecoderState() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ DecoderState(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        abstract int available() throws java.io.IOException;

        abstract boolean hasData();

        abstract int read(byte[] r1, int r2, int r3) throws java.io.IOException;

        abstract org.apache.commons.compress.compressors.deflate64.HuffmanState state();
    }

    private static final class DecodingMemory {
        private final int mask;
        private final byte[] memory;
        private int wHead;
        private boolean wrappedAround;

        private DecodingMemory() {
                r1 = this;
                r0 = 16
                r1.<init>(r0)
                return
        }

        private DecodingMemory(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                int r2 = r0 << r2
                byte[] r2 = new byte[r2]
                r1.memory = r2
                int r2 = r2.length
                int r2 = r2 - r0
                r1.mask = r2
                return
        }

        /* synthetic */ DecodingMemory(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private int incCounter(int r3) {
                r2 = this;
                int r0 = r3 + 1
                int r1 = r2.mask
                r0 = r0 & r1
                boolean r1 = r2.wrappedAround
                if (r1 != 0) goto Le
                if (r0 >= r3) goto Le
                r3 = 1
                r2.wrappedAround = r3
            Le:
                return r0
        }

        byte add(byte r3) {
                r2 = this;
                byte[] r0 = r2.memory
                int r1 = r2.wHead
                r0[r1] = r3
                int r0 = r2.incCounter(r1)
                r2.wHead = r0
                return r3
        }

        void add(byte[] r3, int r4, int r5) {
                r2 = this;
                r0 = r4
            L1:
                int r1 = r4 + r5
                if (r0 >= r1) goto Ld
                r1 = r3[r0]
                r2.add(r1)
                int r0 = r0 + 1
                goto L1
            Ld:
                return
        }

        void recordToBuffer(int r4, int r5, byte[] r6) {
                r3 = this;
                byte[] r0 = r3.memory
                int r0 = r0.length
                if (r4 > r0) goto L3d
                int r0 = r3.wHead
                int r1 = r0 - r4
                int r2 = r3.mask
                r1 = r1 & r2
                boolean r2 = r3.wrappedAround
                if (r2 != 0) goto L28
                if (r1 >= r0) goto L13
                goto L28
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "Attempt to read beyond memory: dist="
                r6.<init>(r0)
                java.lang.StringBuilder r4 = r6.append(r4)
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
            L28:
                r4 = 0
            L29:
                if (r4 >= r5) goto L3c
                byte[] r0 = r3.memory
                r0 = r0[r1]
                byte r0 = r3.add(r0)
                r6[r4] = r0
                int r4 = r4 + 1
                int r1 = r3.incCounter(r1)
                goto L29
            L3c:
                return
            L3d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "Illegal distance parameter: "
                r6.<init>(r0)
                java.lang.StringBuilder r4 = r6.append(r4)
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
        }
    }

    private final class HuffmanCodes extends org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState {
        private final org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode distanceTree;
        private boolean endOfBlock;
        private final org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode lengthTree;
        private byte[] runBuffer;
        private int runBufferLength;
        private int runBufferPos;
        private final org.apache.commons.compress.compressors.deflate64.HuffmanState state;
        final /* synthetic */ org.apache.commons.compress.compressors.deflate64.HuffmanDecoder this$0;

        HuffmanCodes(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r1, org.apache.commons.compress.compressors.deflate64.HuffmanState r2, int[] r3, int[] r4) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                byte[] r1 = org.apache.commons.compress.utils.ByteUtils.EMPTY_BYTE_ARRAY
                r0.runBuffer = r1
                r0.state = r2
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r1 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$100(r3)
                r0.lengthTree = r1
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r1 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$100(r4)
                r0.distanceTree = r1
                return
        }

        private int copyFromRunBuffer(byte[] r3, int r4, int r5) {
                r2 = this;
                int r0 = r2.runBufferLength
                int r1 = r2.runBufferPos
                int r0 = r0 - r1
                if (r0 <= 0) goto L18
                int r5 = java.lang.Math.min(r5, r0)
                byte[] r0 = r2.runBuffer
                int r1 = r2.runBufferPos
                java.lang.System.arraycopy(r0, r1, r3, r4, r5)
                int r3 = r2.runBufferPos
                int r3 = r3 + r5
                r2.runBufferPos = r3
                goto L19
            L18:
                r5 = 0
            L19:
                return r5
        }

        private int decodeNext(byte[] r7, int r8, int r9) throws java.io.IOException {
                r6 = this;
                boolean r0 = r6.endOfBlock
                if (r0 == 0) goto L6
                r7 = -1
                return r7
            L6:
                int r0 = r6.copyFromRunBuffer(r7, r8, r9)
            La:
                if (r0 >= r9) goto L8c
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r1 = r6.this$0
                org.apache.commons.compress.utils.BitInputStream r1 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$200(r1)
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r2 = r6.lengthTree
                int r1 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$300(r1, r2)
                r2 = 256(0x100, float:3.59E-43)
                if (r1 >= r2) goto L2e
                int r2 = r0 + 1
                int r0 = r0 + r8
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r3 = r6.this$0
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$DecodingMemory r3 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$400(r3)
                byte r1 = (byte) r1
                byte r1 = r3.add(r1)
                r7[r0] = r1
                r0 = r2
                goto La
            L2e:
                if (r1 <= r2) goto L89
                short[] r2 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$500()
                int r1 = r1 + (-257)
                short r1 = r2[r1]
                int r2 = r1 >>> 5
                r1 = r1 & 31
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r3 = r6.this$0
                long r3 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$600(r3, r1)
                int r1 = org.apache.commons.compress.utils.ExactMath.add(r2, r3)
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r2 = r6.this$0
                org.apache.commons.compress.utils.BitInputStream r2 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$200(r2)
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r3 = r6.distanceTree
                int r2 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$300(r2, r3)
                int[] r3 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$700()
                r2 = r3[r2]
                int r3 = r2 >>> 4
                r2 = r2 & 15
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r4 = r6.this$0
                long r4 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$600(r4, r2)
                int r2 = org.apache.commons.compress.utils.ExactMath.add(r3, r4)
                byte[] r3 = r6.runBuffer
                int r3 = r3.length
                if (r3 >= r1) goto L6f
                byte[] r3 = new byte[r1]
                r6.runBuffer = r3
            L6f:
                r6.runBufferLength = r1
                r3 = 0
                r6.runBufferPos = r3
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r3 = r6.this$0
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$DecodingMemory r3 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$400(r3)
                byte[] r4 = r6.runBuffer
                r3.recordToBuffer(r2, r1, r4)
                int r1 = r8 + r0
                int r2 = r9 - r0
                int r1 = r6.copyFromRunBuffer(r7, r1, r2)
                int r0 = r0 + r1
                goto La
            L89:
                r7 = 1
                r6.endOfBlock = r7
            L8c:
                return r0
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        int available() {
                r2 = this;
                int r0 = r2.runBufferLength
                int r1 = r2.runBufferPos
                int r0 = r0 - r1
                return r0
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        boolean hasData() {
                r1 = this;
                boolean r0 = r1.endOfBlock
                r0 = r0 ^ 1
                return r0
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        int read(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                if (r3 != 0) goto L4
                r1 = 0
                return r1
            L4:
                int r1 = r0.decodeNext(r1, r2, r3)
                return r1
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        org.apache.commons.compress.compressors.deflate64.HuffmanState state() {
                r1 = this;
                boolean r0 = r1.endOfBlock
                if (r0 == 0) goto L7
                org.apache.commons.compress.compressors.deflate64.HuffmanState r0 = org.apache.commons.compress.compressors.deflate64.HuffmanState.INITIAL
                goto L9
            L7:
                org.apache.commons.compress.compressors.deflate64.HuffmanState r0 = r1.state
            L9:
                return r0
        }
    }

    private static final class InitialState extends org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState {
        private InitialState() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ InitialState(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        int available() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        boolean hasData() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        int read(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                if (r3 != 0) goto L4
                r1 = 0
                return r1
            L4:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Cannot read in this state"
                r1.<init>(r2)
                throw r1
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        org.apache.commons.compress.compressors.deflate64.HuffmanState state() {
                r1 = this;
                org.apache.commons.compress.compressors.deflate64.HuffmanState r0 = org.apache.commons.compress.compressors.deflate64.HuffmanState.INITIAL
                return r0
        }
    }

    private final class UncompressedState extends org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState {
        private final long blockLength;
        private long read;
        final /* synthetic */ org.apache.commons.compress.compressors.deflate64.HuffmanDecoder this$0;

        private UncompressedState(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r1, long r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                r0.blockLength = r2
                return
        }

        /* synthetic */ UncompressedState(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r1, long r2, org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        int available() throws java.io.IOException {
                r6 = this;
                long r0 = r6.blockLength
                long r2 = r6.read
                long r0 = r0 - r2
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r2 = r6.this$0
                org.apache.commons.compress.utils.BitInputStream r2 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$200(r2)
                long r2 = r2.bitsAvailable()
                r4 = 8
                long r2 = r2 / r4
                long r0 = java.lang.Math.min(r0, r2)
                int r0 = (int) r0
                return r0
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        boolean hasData() {
                r4 = this;
                long r0 = r4.read
                long r2 = r4.blockLength
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 >= 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        int read(byte[] r7, int r8, int r9) throws java.io.IOException {
                r6 = this;
                r0 = 0
                if (r9 != 0) goto L4
                return r0
            L4:
                long r1 = r6.blockLength
                long r3 = r6.read
                long r1 = r1 - r3
                long r3 = (long) r9
                long r1 = java.lang.Math.min(r1, r3)
                int r9 = (int) r1
            Lf:
                if (r0 >= r9) goto L61
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r1 = r6.this$0
                org.apache.commons.compress.utils.BitInputStream r1 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$200(r1)
                int r1 = r1.bitsCached()
                if (r1 <= 0) goto L37
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r1 = r6.this$0
                r2 = 8
                long r1 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$600(r1, r2)
                int r1 = (int) r1
                byte r1 = (byte) r1
                int r2 = r8 + r0
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r3 = r6.this$0
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$DecodingMemory r3 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$400(r3)
                byte r1 = r3.add(r1)
                r7[r2] = r1
                r1 = 1
                goto L51
            L37:
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r1 = r6.this$0
                java.io.InputStream r1 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$800(r1)
                int r2 = r8 + r0
                int r3 = r9 - r0
                int r1 = r1.read(r7, r2, r3)
                r3 = -1
                if (r1 == r3) goto L59
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r3 = r6.this$0
                org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$DecodingMemory r3 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.access$400(r3)
                r3.add(r7, r2, r1)
            L51:
                long r2 = r6.read
                long r4 = (long) r1
                long r2 = r2 + r4
                r6.read = r2
                int r0 = r0 + r1
                goto Lf
            L59:
                java.io.EOFException r7 = new java.io.EOFException
                java.lang.String r8 = "Truncated Deflate64 Stream"
                r7.<init>(r8)
                throw r7
            L61:
                return r9
        }

        @Override // org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecoderState
        org.apache.commons.compress.compressors.deflate64.HuffmanState state() {
                r4 = this;
                long r0 = r4.read
                long r2 = r4.blockLength
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 >= 0) goto Lb
                org.apache.commons.compress.compressors.deflate64.HuffmanState r0 = org.apache.commons.compress.compressors.deflate64.HuffmanState.STORED
                goto Ld
            Lb:
                org.apache.commons.compress.compressors.deflate64.HuffmanState r0 = org.apache.commons.compress.compressors.deflate64.HuffmanState.INITIAL
            Ld:
                return r0
        }
    }

    static {
            r0 = 29
            short[] r0 = new short[r0]
            r0 = {x0044: FILL_ARRAY_DATA , data: [96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112} // fill-array
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.RUN_LENGTH_TABLE = r0
            r0 = 32
            int[] r1 = new int[r0]
            r1 = {x0066: FILL_ARRAY_DATA , data: [16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462} // fill-array
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DISTANCE_TABLE = r1
            r1 = 19
            int[] r1 = new int[r1]
            r1 = {x00aa: FILL_ARRAY_DATA , data: [16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15} // fill-array
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.CODE_LENGTHS_ORDER = r1
            r1 = 288(0x120, float:4.04E-43)
            int[] r2 = new int[r1]
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.FIXED_LITERALS = r2
            r3 = 0
            r4 = 144(0x90, float:2.02E-43)
            r5 = 8
            java.util.Arrays.fill(r2, r3, r4, r5)
            r3 = 256(0x100, float:3.59E-43)
            r6 = 9
            java.util.Arrays.fill(r2, r4, r3, r6)
            r4 = 280(0x118, float:3.92E-43)
            r6 = 7
            java.util.Arrays.fill(r2, r3, r4, r6)
            java.util.Arrays.fill(r2, r4, r1, r5)
            int[] r0 = new int[r0]
            r1 = 5
            int[] r0 = org.apache.commons.lang3.ArrayFill.fill(r0, r1)
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.FIXED_DISTANCE = r0
            return
    }

    HuffmanDecoder(java.io.InputStream r4) {
            r3 = this;
            r3.<init>()
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$DecodingMemory r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$DecodingMemory
            r1 = 0
            r0.<init>(r1)
            r3.memory = r0
            org.apache.commons.compress.utils.BitInputStream r0 = new org.apache.commons.compress.utils.BitInputStream
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.<init>(r4, r2)
            r3.reader = r0
            r3.in = r4
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$InitialState r4 = new org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$InitialState
            r4.<init>(r1)
            r3.state = r4
            return
    }

    static /* synthetic */ org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode access$100(int[] r0) {
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r0 = buildTree(r0)
            return r0
    }

    static /* synthetic */ org.apache.commons.compress.utils.BitInputStream access$200(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r0) {
            org.apache.commons.compress.utils.BitInputStream r0 = r0.reader
            return r0
    }

    static /* synthetic */ int access$300(org.apache.commons.compress.utils.BitInputStream r0, org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode r1) throws java.io.IOException {
            int r0 = nextSymbol(r0, r1)
            return r0
    }

    static /* synthetic */ org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DecodingMemory access$400(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r0) {
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$DecodingMemory r0 = r0.memory
            return r0
    }

    static /* synthetic */ short[] access$500() {
            short[] r0 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.RUN_LENGTH_TABLE
            return r0
    }

    static /* synthetic */ long access$600(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r0, int r1) throws java.io.IOException {
            long r0 = r0.readBits(r1)
            return r0
    }

    static /* synthetic */ int[] access$700() {
            int[] r0 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.DISTANCE_TABLE
            return r0
    }

    static /* synthetic */ java.io.InputStream access$800(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r0) {
            java.io.InputStream r0 = r0.in
            return r0
    }

    private static org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode buildTree(int[] r8) {
            int[] r0 = getCodes(r8)
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r1 = new org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode
            r2 = 0
            r3 = 0
            r1.<init>(r3, r2)
        Lb:
            int r2 = r8.length
            if (r3 >= r2) goto L40
            r2 = r8[r3]
            if (r2 == 0) goto L3d
            int r2 = r2 + (-1)
            r4 = r0[r2]
            r6 = r1
            r5 = r2
        L18:
            r7 = 1
            if (r5 < 0) goto L35
            int r7 = r7 << r5
            r7 = r7 & r4
            if (r7 != 0) goto L24
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r6 = r6.left()
            goto L28
        L24:
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r6 = r6.right()
        L28:
            if (r6 == 0) goto L2d
            int r5 = r5 + (-1)
            goto L18
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "node doesn't exist in Huffman tree"
            r8.<init>(r0)
            throw r8
        L35:
            r6.leaf(r3)
            r4 = r0[r2]
            int r4 = r4 + r7
            r0[r2] = r4
        L3d:
            int r3 = r3 + 1
            goto Lb
        L40:
            return r1
    }

    private static int[] getCodes(int[] r7) {
            r0 = 65
            int[] r0 = new int[r0]
            int r1 = r7.length
            r2 = 0
            r3 = r2
            r4 = r3
        L8:
            if (r3 >= r1) goto L3a
            r5 = r7[r3]
            if (r5 < 0) goto L1f
            r6 = 64
            if (r5 > r6) goto L1f
            int r4 = java.lang.Math.max(r4, r5)
            r6 = r0[r5]
            int r6 = r6 + 1
            r0[r5] = r6
            int r3 = r3 + 1
            goto L8
        L1f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid code "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = " in literal table"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L3a:
            int r7 = r4 + 1
            int[] r0 = java.util.Arrays.copyOf(r0, r7)
            int[] r7 = new int[r7]
            r1 = r2
        L43:
            if (r2 > r4) goto L4f
            r3 = r0[r2]
            int r1 = r1 + r3
            int r1 = r1 << 1
            r7[r2] = r1
            int r2 = r2 + 1
            goto L43
        L4f:
            return r7
    }

    private static int nextSymbol(org.apache.commons.compress.utils.BitInputStream r4, org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.BinaryTreeNode r5) throws java.io.IOException {
        L0:
            r0 = -1
            if (r5 == 0) goto L18
            int r1 = r5.literal
            if (r1 != r0) goto L18
            r0 = 1
            long r0 = readBits(r4, r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L15
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r5 = r5.leftNode
            goto L0
        L15:
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r5 = r5.rightNode
            goto L0
        L18:
            if (r5 == 0) goto L1c
            int r0 = r5.literal
        L1c:
            return r0
    }

    private static void populateDynamicTables(org.apache.commons.compress.utils.BitInputStream r11, int[] r12, int[] r13) throws java.io.IOException {
            r0 = 4
            long r0 = readBits(r11, r0)
            r2 = 4
            long r0 = r0 + r2
            int r0 = (int) r0
            r1 = 19
            int[] r1 = new int[r1]
            r2 = 0
            r3 = r2
        Lf:
            r4 = 3
            if (r3 >= r0) goto L20
            int[] r5 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.CODE_LENGTHS_ORDER
            r5 = r5[r3]
            long r6 = readBits(r11, r4)
            int r4 = (int) r6
            r1[r5] = r4
            int r3 = r3 + 1
            goto Lf
        L20:
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$BinaryTreeNode r0 = buildTree(r1)
            int r1 = r12.length
            int r3 = r13.length
            int r1 = r1 + r3
            int[] r3 = new int[r1]
            r5 = -1
            r6 = r2
            r7 = r6
        L2c:
            if (r6 >= r1) goto L65
            if (r7 <= 0) goto L38
            int r8 = r6 + 1
            r3[r6] = r5
            int r7 = r7 + (-1)
            r6 = r8
            goto L2c
        L38:
            int r8 = nextSymbol(r11, r0)
            r9 = 16
            if (r8 >= r9) goto L47
            int r5 = r6 + 1
            r3[r6] = r8
            r6 = r5
            r5 = r8
            goto L2c
        L47:
            r9 = 3
            switch(r8) {
                case 16: goto L5d;
                case 17: goto L55;
                case 18: goto L4d;
                default: goto L4c;
            }
        L4c:
            goto L2c
        L4d:
            r5 = 7
            long r7 = readBits(r11, r5)
            r9 = 11
            goto L59
        L55:
            long r7 = readBits(r11, r4)
        L59:
            long r7 = r7 + r9
            int r7 = (int) r7
            r5 = r2
            goto L2c
        L5d:
            r7 = 2
            long r7 = readBits(r11, r7)
            long r7 = r7 + r9
            int r7 = (int) r7
            goto L2c
        L65:
            int r11 = r12.length
            java.lang.System.arraycopy(r3, r2, r12, r2, r11)
            int r11 = r12.length
            int r12 = r13.length
            java.lang.System.arraycopy(r3, r11, r13, r2, r12)
            return
    }

    private long readBits(int r3) throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r2.reader
            long r0 = readBits(r0, r3)
            return r0
    }

    private static long readBits(org.apache.commons.compress.utils.BitInputStream r2, int r3) throws java.io.IOException {
            long r2 = r2.readBits(r3)
            r0 = -1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            return r2
        Lb:
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.String r3 = "Truncated Deflate64 Stream"
            r2.<init>(r3)
            throw r2
    }

    private int[][] readDynamicTables() throws java.io.IOException {
            r6 = this;
            r0 = 5
            long r1 = r6.readBits(r0)
            r3 = 257(0x101, double:1.27E-321)
            long r1 = r1 + r3
            int r1 = (int) r1
            int[] r1 = new int[r1]
            long r2 = r6.readBits(r0)
            r4 = 1
            long r2 = r2 + r4
            int r0 = (int) r2
            int[] r0 = new int[r0]
            int[][] r0 = new int[][]{r1, r0}
            org.apache.commons.compress.utils.BitInputStream r1 = r6.reader
            r2 = 0
            r2 = r0[r2]
            r3 = 1
            r3 = r0[r3]
            populateDynamicTables(r1, r2, r3)
            return r0
    }

    private void switchToUncompressedState() throws java.io.IOException {
            r9 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r9.reader
            r0.alignWithByteBoundary()
            r0 = 16
            long r1 = r9.readBits(r0)
            long r3 = r9.readBits(r0)
            r5 = 65535(0xffff, double:3.23786E-319)
            long r7 = r1 ^ r5
            long r5 = r5 & r7
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L22
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$UncompressedState r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$UncompressedState
            r3 = 0
            r0.<init>(r9, r1, r3)
            r9.state = r0
            return
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Illegal LEN / NLEN values"
            r0.<init>(r1)
            throw r0
    }

    int available() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$DecoderState r0 = r1.state
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$InitialState r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$InitialState
            r1 = 0
            r0.<init>(r1)
            r2.state = r0
            r2.reader = r1
            return
    }

    public int decode(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.decode(r3, r0, r1)
            return r3
    }

    public int decode(byte[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
        L0:
            boolean r0 = r5.finalBlock
            if (r0 == 0) goto Lf
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$DecoderState r0 = r5.state
            boolean r0 = r0.hasData()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r6 = -1
            return r6
        Lf:
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$DecoderState r0 = r5.state
            org.apache.commons.compress.compressors.deflate64.HuffmanState r0 = r0.state()
            org.apache.commons.compress.compressors.deflate64.HuffmanState r1 = org.apache.commons.compress.compressors.deflate64.HuffmanState.INITIAL
            if (r0 != r1) goto L6f
            r0 = 1
            long r1 = r5.readBits(r0)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 != 0) goto L27
            r1 = r0
            goto L28
        L27:
            r1 = r2
        L28:
            r5.finalBlock = r1
            r1 = 2
            long r3 = r5.readBits(r1)
            int r3 = (int) r3
            if (r3 == 0) goto L6b
            if (r3 == r0) goto L5d
            if (r3 != r1) goto L48
            int[][] r1 = r5.readDynamicTables()
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$HuffmanCodes r3 = new org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$HuffmanCodes
            org.apache.commons.compress.compressors.deflate64.HuffmanState r4 = org.apache.commons.compress.compressors.deflate64.HuffmanState.DYNAMIC_CODES
            r2 = r1[r2]
            r0 = r1[r0]
            r3.<init>(r5, r4, r2, r0)
            r5.state = r3
            goto L0
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unsupported compression: "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L5d:
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$HuffmanCodes r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$HuffmanCodes
            org.apache.commons.compress.compressors.deflate64.HuffmanState r1 = org.apache.commons.compress.compressors.deflate64.HuffmanState.FIXED_CODES
            int[] r2 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.FIXED_LITERALS
            int[] r3 = org.apache.commons.compress.compressors.deflate64.HuffmanDecoder.FIXED_DISTANCE
            r0.<init>(r5, r1, r2, r3)
            r5.state = r0
            goto L0
        L6b:
            r5.switchToUncompressedState()
            goto L0
        L6f:
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder$DecoderState r0 = r5.state
            int r0 = r0.read(r6, r7, r8)
            if (r0 == 0) goto L0
            return r0
    }

    long getBytesRead() {
            r2 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r2.reader
            long r0 = r0.getBytesRead()
            return r0
    }
}
