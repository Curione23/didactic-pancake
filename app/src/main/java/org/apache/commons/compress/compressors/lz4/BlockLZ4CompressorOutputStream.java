package org.apache.commons.compress.compressors.lz4;

/* JADX INFO: loaded from: classes2.dex */
public class BlockLZ4CompressorOutputStream extends org.apache.commons.compress.compressors.CompressorOutputStream<java.io.OutputStream> {
    private static final int MIN_BACK_REFERENCE_LENGTH = 4;
    private static final int MIN_OFFSET_OF_LAST_BACK_REFERENCE = 12;
    private final org.apache.commons.compress.compressors.lz77support.LZ77Compressor compressor;
    private final java.util.Deque<byte[]> expandedBlocks;
    private boolean finished;
    private final byte[] oneByte;
    private final java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair> pairs;

    /* JADX INFO: renamed from: org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$compress$compressors$lz77support$LZ77Compressor$Block$BlockType = null;

        static {
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType[] r0 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz77support$LZ77Compressor$Block$BlockType = r0
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz77support$LZ77Compressor$Block$BlockType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz77support$LZ77Compressor$Block$BlockType     // Catch: java.lang.NoSuchFieldError -> L28
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.EOD     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static final class Pair {
        private int brLength;
        private int brOffset;
        private int literalLength;
        private final java.util.Deque<byte[]> literals;
        private boolean written;

        Pair() {
                r1 = this;
                r1.<init>()
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r1.literals = r0
                return
        }

        static /* synthetic */ boolean access$000(org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair r0) {
                boolean r0 = r0.hasBeenWritten()
                return r0
        }

        static /* synthetic */ void access$100(org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair r0, byte[] r1) {
                r0.prependLiteral(r1)
                return
        }

        static /* synthetic */ int access$200(org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair r0) {
                int r0 = r0.backReferenceLength()
                return r0
        }

        static /* synthetic */ org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair access$300(org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair r0, int r1) {
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r0 = r0.splitWithNewBackReferenceLengthOf(r1)
                return r0
        }

        static /* synthetic */ void access$400(org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair r0, org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair r1) {
                r0.prependTo(r1)
                return
        }

        private int backReferenceLength() {
                r1 = this;
                int r0 = r1.brLength
                return r0
        }

        private boolean hasBeenWritten() {
                r1 = this;
                boolean r0 = r1.written
                return r0
        }

        private static int lengths(int r3, int r4) {
                r0 = 15
                int r3 = java.lang.Math.min(r3, r0)
                r1 = 4
                if (r4 >= r1) goto Lb
                r0 = 0
                goto L11
            Lb:
                r2 = 19
                if (r4 >= r2) goto L11
                int r0 = r4 + (-4)
            L11:
                int r3 = r3 << r1
                r3 = r3 | r0
                return r3
        }

        private int literalLength() {
                r3 = this;
                int r0 = r3.literalLength
                if (r0 == 0) goto L5
                return r0
            L5:
                java.util.Deque<byte[]> r0 = r3.literals
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            Lc:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L1b
                java.lang.Object r2 = r0.next()
                byte[] r2 = (byte[]) r2
                int r2 = r2.length
                int r1 = r1 + r2
                goto Lc
            L1b:
                r3.literalLength = r1
                return r1
        }

        private void prependLiteral(byte[] r2) {
                r1 = this;
                java.util.Deque<byte[]> r0 = r1.literals
                r0.addFirst(r2)
                int r0 = r1.literalLength
                int r2 = r2.length
                int r0 = r0 + r2
                r1.literalLength = r0
                return
        }

        private void prependTo(org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair r3) {
                r2 = this;
                java.util.Deque<byte[]> r0 = r2.literals
                java.util.Iterator r0 = r0.descendingIterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                byte[] r1 = (byte[]) r1
                r3.prependLiteral(r1)
                goto L6
            L16:
                return
        }

        private org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair splitWithNewBackReferenceLengthOf(int r4) {
                r3 = this;
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r0 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair
                r0.<init>()
                java.util.Deque<byte[]> r1 = r0.literals
                java.util.Deque<byte[]> r2 = r3.literals
                r1.addAll(r2)
                int r1 = r3.brOffset
                r0.brOffset = r1
                r0.brLength = r4
                return r0
        }

        private static void writeLength(int r1, java.io.OutputStream r2) throws java.io.IOException {
            L0:
                r0 = 255(0xff, float:3.57E-43)
                if (r1 < r0) goto La
                r2.write(r0)
                int r1 = r1 + (-255)
                goto L0
            La:
                r2.write(r1)
                return
        }

        byte[] addLiteral(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock r4) {
                r3 = this;
                byte[] r0 = r4.getData()
                int r1 = r4.getOffset()
                int r2 = r4.getOffset()
                int r4 = r4.getLength()
                int r2 = r2 + r4
                byte[] r4 = java.util.Arrays.copyOfRange(r0, r1, r2)
                java.util.Deque<byte[]> r0 = r3.literals
                r0.add(r4)
                int r0 = r3.literalLength
                int r1 = r4.length
                int r0 = r0 + r1
                r3.literalLength = r0
                return r4
        }

        boolean canBeWritten(int r2) {
                r1 = this;
                boolean r0 = r1.hasBackReference()
                if (r0 == 0) goto Lc
                r0 = 16
                if (r2 < r0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        boolean hasBackReference() {
                r1 = this;
                int r0 = r1.brOffset
                if (r0 <= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        int length() {
                r2 = this;
                int r0 = r2.literalLength()
                int r1 = r2.brLength
                int r0 = r0 + r1
                return r0
        }

        void setBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference r2) {
                r1 = this;
                boolean r0 = r1.hasBackReference()
                if (r0 != 0) goto L13
                int r0 = r2.getOffset()
                r1.brOffset = r0
                int r2 = r2.getLength()
                r1.brLength = r2
                return
            L13:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>()
                throw r2
        }

        void writeTo(java.io.OutputStream r5) throws java.io.IOException {
                r4 = this;
                int r0 = r4.literalLength()
                int r1 = r4.brLength
                int r1 = lengths(r0, r1)
                r5.write(r1)
                r1 = 15
                if (r0 < r1) goto L15
                int r0 = r0 - r1
                writeLength(r0, r5)
            L15:
                java.util.Deque<byte[]> r0 = r4.literals
                java.util.Iterator r0 = r0.iterator()
            L1b:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2b
                java.lang.Object r2 = r0.next()
                byte[] r2 = (byte[]) r2
                r5.write(r2)
                goto L1b
            L2b:
                boolean r0 = r4.hasBackReference()
                if (r0 == 0) goto L43
                int r0 = r4.brOffset
                long r2 = (long) r0
                r0 = 2
                org.apache.commons.compress.utils.ByteUtils.toLittleEndian(r5, r2, r0)
                int r0 = r4.brLength
                int r2 = r0 + (-4)
                if (r2 < r1) goto L43
                int r0 = r0 + (-19)
                writeLength(r0, r5)
            L43:
                r5 = 1
                r4.written = r5
                return
        }
    }

    public BlockLZ4CompressorOutputStream(java.io.OutputStream r2) {
            r1 = this;
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = createParameterBuilder()
            org.apache.commons.compress.compressors.lz77support.Parameters r0 = r0.build()
            r1.<init>(r2, r0)
            return
    }

    public BlockLZ4CompressorOutputStream(java.io.OutputStream r2, org.apache.commons.compress.compressors.lz77support.Parameters r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            byte[] r2 = new byte[r2]
            r1.oneByte = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r1.pairs = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r1.expandedBlocks = r2
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor r2 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r2.<init>(r3, r0)
            r1.compressor = r2
            return
    }

    private void addBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference r2) throws java.io.IOException {
            r1 = this;
            int r0 = r2.getLength()
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r0 = r1.writeBlocksAndReturnUnfinishedPair(r0)
            r0.setBackReference(r2)
            r1.recordBackReference(r2)
            r1.clearUnusedBlocksAndPairs()
            return
    }

    private void addLiteralBlock(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock r2) throws java.io.IOException {
            r1 = this;
            int r0 = r2.getLength()
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r0 = r1.writeBlocksAndReturnUnfinishedPair(r0)
            byte[] r2 = r0.addLiteral(r2)
            r1.recordLiteral(r2)
            r1.clearUnusedBlocksAndPairs()
            return
    }

    private void clearUnusedBlocks() {
            r4 = this;
            java.util.Deque<byte[]> r0 = r4.expandedBlocks
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1c
            java.lang.Object r3 = r0.next()
            byte[] r3 = (byte[]) r3
            int r1 = r1 + 1
            int r3 = r3.length
            int r2 = r2 + r3
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 < r3) goto L8
        L1c:
            java.util.Deque<byte[]> r0 = r4.expandedBlocks
            int r0 = r0.size()
        L22:
            if (r1 >= r0) goto L2c
            java.util.Deque<byte[]> r2 = r4.expandedBlocks
            r2.removeLast()
            int r1 = r1 + 1
            goto L22
        L2c:
            return
    }

    private void clearUnusedBlocksAndPairs() {
            r0 = this;
            r0.clearUnusedBlocks()
            r0.clearUnusedPairs()
            return
    }

    private void clearUnusedPairs() {
            r4 = this;
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r0 = r4.pairs
            java.util.Iterator r0 = r0.descendingIterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1f
            java.lang.Object r3 = r0.next()
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r3 = (org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair) r3
            int r1 = r1 + 1
            int r3 = r3.length()
            int r2 = r2 + r3
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 < r3) goto L8
        L1f:
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r0 = r4.pairs
            int r0 = r0.size()
        L25:
            if (r1 >= r0) goto L3e
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r2 = r4.pairs
            java.lang.Object r2 = r2.peekFirst()
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r2 = (org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair) r2
            boolean r2 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.access$000(r2)
            if (r2 != 0) goto L36
            goto L3e
        L36:
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r2 = r4.pairs
            r2.removeFirst()
            int r1 = r1 + 1
            goto L25
        L3e:
            return
    }

    public static org.apache.commons.compress.compressors.lz77support.Parameters.Builder createParameterBuilder() {
            r0 = 65536(0x10000, float:9.1835E-41)
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = org.apache.commons.compress.compressors.lz77support.Parameters.builder(r0)
            r1 = 4
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = r0.withMinBackReferenceLength(r1)
            r1 = 65535(0xffff, float:9.1834E-41)
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = r0.withMaxBackReferenceLength(r1)
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = r0.withMaxOffset(r1)
            org.apache.commons.compress.compressors.lz77support.Parameters$Builder r0 = r0.withMaxLiteralLength(r1)
            return r0
    }

    private byte[] expand(int r3, int r4) {
            r2 = this;
            byte[] r0 = new byte[r4]
            r1 = 1
            if (r3 != r1) goto L17
            java.util.Deque<byte[]> r3 = r2.expandedBlocks
            java.lang.Object r3 = r3.peekFirst()
            byte[] r3 = (byte[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            r3 = r3[r4]
            if (r3 == 0) goto L1a
            java.util.Arrays.fill(r0, r3)
            goto L1a
        L17:
            r2.expandFromList(r0, r3, r4)
        L1a:
            return r0
    }

    private void expandFromList(byte[] r8, int r9, int r10) {
            r7 = this;
            r0 = 0
            r1 = r9
            r2 = r0
        L3:
            if (r10 <= 0) goto L53
            if (r1 <= 0) goto L44
            java.util.Deque<byte[]> r3 = r7.expandedBlocks
            java.util.Iterator r3 = r3.iterator()
            r4 = r0
        Le:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L22
            java.lang.Object r5 = r3.next()
            byte[] r5 = (byte[]) r5
            int r6 = r5.length
            int r6 = r6 + r4
            if (r6 < r1) goto L1f
            goto L23
        L1f:
            int r5 = r5.length
            int r4 = r4 + r5
            goto Le
        L22:
            r5 = 0
        L23:
            if (r5 == 0) goto L2f
            int r3 = r5.length
            int r4 = r4 + r3
            int r4 = r4 - r1
            int r3 = r5.length
            int r3 = r3 - r4
            int r3 = java.lang.Math.min(r10, r3)
            goto L4c
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find a block containing offset "
            r10.<init>(r0)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L44:
            int r4 = -r1
            int r3 = r2 + r1
            int r3 = java.lang.Math.min(r10, r3)
            r5 = r8
        L4c:
            java.lang.System.arraycopy(r5, r4, r8, r2, r3)
            int r1 = r1 - r3
            int r10 = r10 - r3
            int r2 = r2 + r3
            goto L3
        L53:
            return
    }

    private void recordBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference r3) {
            r2 = this;
            java.util.Deque<byte[]> r0 = r2.expandedBlocks
            int r1 = r3.getOffset()
            int r3 = r3.getLength()
            byte[] r3 = r2.expand(r1, r3)
            r0.addFirst(r3)
            return
    }

    private void recordLiteral(byte[] r2) {
            r1 = this;
            java.util.Deque<byte[]> r0 = r1.expandedBlocks
            r0.addFirst(r2)
            return
    }

    private void rewriteLastPairs() {
            r8 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r2 = r8.pairs
            java.util.Iterator r2 = r2.descendingIterator()
            r3 = 0
            r4 = r3
        L12:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L38
            java.lang.Object r5 = r2.next()
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r5 = (org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair) r5
            boolean r6 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.access$000(r5)
            if (r6 == 0) goto L25
            goto L38
        L25:
            int r6 = r5.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r1.addFirst(r7)
            r0.addFirst(r5)
            int r4 = r4 + r6
            r5 = 12
            if (r4 < r5) goto L12
        L38:
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r2 = r8.pairs
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$$ExternalSyntheticLambda1 r4 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$$ExternalSyntheticLambda1
            r4.<init>(r2)
            r0.forEach(r4)
            int r2 = r0.size()
            r4 = 1
            r5 = r3
        L4b:
            if (r4 >= r2) goto L5b
            java.lang.Object r6 = r1.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L4b
        L5b:
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r1 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair
            r1.<init>()
            if (r5 <= 0) goto L69
            byte[] r2 = r8.expand(r5, r5)
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.access$100(r1, r2)
        L69:
            java.lang.Object r0 = r0.get(r3)
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r0 = (org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair) r0
            int r2 = 12 - r5
            boolean r4 = r0.hasBackReference()
            if (r4 == 0) goto L7b
            int r3 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.access$200(r0)
        L7b:
            boolean r4 = r0.hasBackReference()
            if (r4 == 0) goto L98
            int r4 = 16 - r5
            if (r3 < r4) goto L98
            int r5 = r5 + r2
            byte[] r4 = r8.expand(r5, r2)
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.access$100(r1, r4)
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r4 = r8.pairs
            int r3 = r3 - r2
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.access$300(r0, r3)
            r4.add(r0)
            goto La9
        L98:
            boolean r2 = r0.hasBackReference()
            if (r2 == 0) goto La6
            int r5 = r5 + r3
            byte[] r2 = r8.expand(r5, r3)
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.access$100(r1, r2)
        La6:
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.access$400(r0, r1)
        La9:
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r0 = r8.pairs
            r0.add(r1)
            return
    }

    private org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair writeBlocksAndReturnUnfinishedPair(int r2) throws java.io.IOException {
            r1 = this;
            r1.writeWritablePairs(r2)
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r2 = r1.pairs
            java.lang.Object r2 = r2.peekLast()
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r2 = (org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair) r2
            if (r2 == 0) goto L13
            boolean r0 = r2.hasBackReference()
            if (r0 == 0) goto L1d
        L13:
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r2 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair
            r2.<init>()
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r0 = r1.pairs
            r0.addLast(r2)
        L1d:
            return r2
    }

    private void writeFinalLiteralBlock() throws java.io.IOException {
            r3 = this;
            r3.rewriteLastPairs()
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r0 = r3.pairs
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r1 = (org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair) r1
            boolean r2 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.access$000(r1)
            if (r2 != 0) goto L9
            java.io.OutputStream r2 = r3.out
            r1.writeTo(r2)
            goto L9
        L21:
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r0 = r3.pairs
            r0.clear()
            return
    }

    private void writeWritablePairs(int r4) throws java.io.IOException {
            r3 = this;
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r0 = r3.pairs
            java.util.Iterator r0 = r0.descendingIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r1 = (org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair) r1
            boolean r2 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.access$000(r1)
            if (r2 == 0) goto L19
            goto L1f
        L19:
            int r1 = r1.length()
            int r4 = r4 + r1
            goto L6
        L1f:
            java.util.Deque<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair> r0 = r3.pairs
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair r1 = (org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair) r1
            boolean r2 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.access$000(r1)
            if (r2 == 0) goto L38
            goto L25
        L38:
            int r2 = r1.length()
            int r4 = r4 - r2
            boolean r2 = r1.canBeWritten(r4)
            if (r2 != 0) goto L44
            goto L4a
        L44:
            java.io.OutputStream r2 = r3.out
            r1.writeTo(r2)
            goto L25
        L4a:
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r2.finish()     // Catch: java.lang.Throwable -> L9
            java.io.OutputStream r0 = r2.out
            r0.close()
            return
        L9:
            r0 = move-exception
            java.io.OutputStream r1 = r2.out
            r1.close()
            throw r0
    }

    public void finish() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 != 0) goto Lc
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor r0 = r1.compressor
            r0.finish()
            r0 = 1
            r1.finished = r0
        Lc:
            return
    }

    /* JADX INFO: renamed from: lambda$new$0$org-apache-commons-compress-compressors-lz4-BlockLZ4CompressorOutputStream, reason: not valid java name */
    /* synthetic */ void m2548x9ebf33ca(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block r3) throws java.io.IOException {
            r2 = this;
            int[] r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz77support$LZ77Compressor$Block$BlockType
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = r3.getType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L20
            r1 = 2
            if (r0 == r1) goto L1a
            r3 = 3
            if (r0 == r3) goto L16
            goto L25
        L16:
            r2.writeFinalLiteralBlock()
            goto L25
        L1a:
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$BackReference r3 = (org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference) r3
            r2.addBackReference(r3)
            goto L25
        L20:
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor$LiteralBlock r3 = (org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock) r3
            r2.addLiteralBlock(r3)
        L25:
            return
    }

    public void prefill(byte[] r1, int r2, int r3) {
            r0 = this;
            if (r3 <= 0) goto Lf
            int r3 = r3 + r2
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor r2 = r0.compressor
            r2.prefill(r1)
            r0.recordLiteral(r1)
        Lf:
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.oneByte
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 0
            r0[r1] = r3
            r2.write(r0)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor r0 = r1.compressor
            r0.compress(r2, r3, r4)
            return
    }
}
