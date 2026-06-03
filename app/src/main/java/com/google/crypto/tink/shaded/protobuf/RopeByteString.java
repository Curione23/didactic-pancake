package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class RopeByteString extends com.google.crypto.tink.shaded.protobuf.ByteString {
    static final int[] minLengthByDepth = null;
    private static final long serialVersionUID = 1;
    private final com.google.crypto.tink.shaded.protobuf.ByteString left;
    private final int leftLength;
    private final com.google.crypto.tink.shaded.protobuf.ByteString right;
    private final int totalLength;
    private final int treeDepth;


    private static class Balancer {
        private final java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> prefixesStack;

        private Balancer() {
                r1 = this;
                r1.<init>()
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r1.prefixesStack = r0
                return
        }

        /* synthetic */ Balancer(com.google.crypto.tink.shaded.protobuf.RopeByteString.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.crypto.tink.shaded.protobuf.ByteString access$100(com.google.crypto.tink.shaded.protobuf.RopeByteString.Balancer r0, com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.balance(r1, r2)
                return r0
        }

        private com.google.crypto.tink.shaded.protobuf.ByteString balance(com.google.crypto.tink.shaded.protobuf.ByteString r3, com.google.crypto.tink.shaded.protobuf.ByteString r4) {
                r2 = this;
                r2.doBalance(r3)
                r2.doBalance(r4)
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r3 = r2.prefixesStack
                java.lang.Object r3 = r3.pop()
                com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            Le:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r4 = r2.prefixesStack
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L26
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r4 = r2.prefixesStack
                java.lang.Object r4 = r4.pop()
                com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
                com.google.crypto.tink.shaded.protobuf.RopeByteString r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
                r1 = 0
                r0.<init>(r4, r3, r1)
                r3 = r0
                goto Le
            L26:
                return r3
        }

        private void doBalance(com.google.crypto.tink.shaded.protobuf.ByteString r4) {
                r3 = this;
                boolean r0 = r4.isBalanced()
                if (r0 == 0) goto La
                r3.insert(r4)
                goto L1e
            La:
                boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.RopeByteString
                if (r0 == 0) goto L1f
                com.google.crypto.tink.shaded.protobuf.RopeByteString r4 = (com.google.crypto.tink.shaded.protobuf.RopeByteString) r4
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.RopeByteString.access$400(r4)
                r3.doBalance(r0)
                com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.RopeByteString.access$500(r4)
                r3.doBalance(r4)
            L1e:
                return
            L1f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Has a new type of ByteString been created? Found "
                r1.<init>(r2)
                java.lang.Class r4 = r4.getClass()
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        private int getDepthBinForLength(int r2) {
                r1 = this;
                int[] r0 = com.google.crypto.tink.shaded.protobuf.RopeByteString.minLengthByDepth
                int r2 = java.util.Arrays.binarySearch(r0, r2)
                if (r2 >= 0) goto Ld
                int r2 = r2 + 1
                int r2 = -r2
                int r2 = r2 + (-1)
            Ld:
                return r2
        }

        private void insert(com.google.crypto.tink.shaded.protobuf.ByteString r6) {
                r5 = this;
                int r0 = r6.size()
                int r0 = r5.getDepthBinForLength(r0)
                int r1 = r0 + 1
                int r1 = com.google.crypto.tink.shaded.protobuf.RopeByteString.minLength(r1)
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r2 = r5.prefixesStack
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L96
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r2 = r5.prefixesStack
                java.lang.Object r2 = r2.peek()
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
                int r2 = r2.size()
                if (r2 < r1) goto L26
                goto L96
            L26:
                int r0 = com.google.crypto.tink.shaded.protobuf.RopeByteString.minLength(r0)
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r1 = r5.prefixesStack
                java.lang.Object r1 = r1.pop()
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            L32:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r2 = r5.prefixesStack
                boolean r2 = r2.isEmpty()
                r3 = 0
                if (r2 != 0) goto L58
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r2 = r5.prefixesStack
                java.lang.Object r2 = r2.peek()
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
                int r2 = r2.size()
                if (r2 >= r0) goto L58
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r2 = r5.prefixesStack
                java.lang.Object r2 = r2.pop()
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
                com.google.crypto.tink.shaded.protobuf.RopeByteString r4 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
                r4.<init>(r2, r1, r3)
                r1 = r4
                goto L32
            L58:
                com.google.crypto.tink.shaded.protobuf.RopeByteString r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
                r0.<init>(r1, r6, r3)
            L5d:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r6 = r5.prefixesStack
                boolean r6 = r6.isEmpty()
                if (r6 != 0) goto L90
                int r6 = r0.size()
                int r6 = r5.getDepthBinForLength(r6)
                int r6 = r6 + 1
                int r6 = com.google.crypto.tink.shaded.protobuf.RopeByteString.minLength(r6)
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r1 = r5.prefixesStack
                java.lang.Object r1 = r1.peek()
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
                int r1 = r1.size()
                if (r1 >= r6) goto L90
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r6 = r5.prefixesStack
                java.lang.Object r6 = r6.pop()
                com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
                com.google.crypto.tink.shaded.protobuf.RopeByteString r1 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
                r1.<init>(r6, r0, r3)
                r0 = r1
                goto L5d
            L90:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r6 = r5.prefixesStack
                r6.push(r0)
                goto L9b
            L96:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.ByteString> r0 = r5.prefixesStack
                r0.push(r6)
            L9b:
                return
        }
    }

    private static final class PieceIterator implements java.util.Iterator<com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString> {
        private final java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.RopeByteString> breadCrumbs;
        private com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString next;

        private PieceIterator(com.google.crypto.tink.shaded.protobuf.ByteString r3) {
                r2 = this;
                r2.<init>()
                boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.RopeByteString
                if (r0 == 0) goto L22
                com.google.crypto.tink.shaded.protobuf.RopeByteString r3 = (com.google.crypto.tink.shaded.protobuf.RopeByteString) r3
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                int r1 = r3.getTreeDepth()
                r0.<init>(r1)
                r2.breadCrumbs = r0
                r0.push(r3)
                com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.RopeByteString.access$400(r3)
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r3 = r2.getLeafByLeft(r3)
                r2.next = r3
                goto L29
            L22:
                r0 = 0
                r2.breadCrumbs = r0
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r3
                r2.next = r3
            L29:
                return
        }

        /* synthetic */ PieceIterator(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.RopeByteString.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString getLeafByLeft(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
            L0:
                boolean r0 = r2 instanceof com.google.crypto.tink.shaded.protobuf.RopeByteString
                if (r0 == 0) goto L10
                com.google.crypto.tink.shaded.protobuf.RopeByteString r2 = (com.google.crypto.tink.shaded.protobuf.RopeByteString) r2
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.RopeByteString> r0 = r1.breadCrumbs
                r0.push(r2)
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.RopeByteString.access$400(r2)
                goto L0
            L10:
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r2
                return r2
        }

        private com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString getNextNonEmptyLeaf() {
                r2 = this;
            L0:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.RopeByteString> r0 = r2.breadCrumbs
                if (r0 == 0) goto L22
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lb
                goto L22
            Lb:
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.RopeByteString> r0 = r2.breadCrumbs
                java.lang.Object r0 = r0.pop()
                com.google.crypto.tink.shaded.protobuf.RopeByteString r0 = (com.google.crypto.tink.shaded.protobuf.RopeByteString) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.RopeByteString.access$500(r0)
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r2.getLeafByLeft(r0)
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L0
                return r0
            L22:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r1.next
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString next() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r2.next
                if (r0 == 0) goto Lb
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r1 = r2.getNextNonEmptyLeaf()
                r2.next = r1
                return r0
            Lb:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString next() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    private class RopeInputStream extends java.io.InputStream {
        private com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private com.google.crypto.tink.shaded.protobuf.RopeByteString.PieceIterator pieceIterator;
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.RopeByteString this$0;

        public RopeInputStream(com.google.crypto.tink.shaded.protobuf.RopeByteString r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.initialize()
                return
        }

        private void advanceIfCurrentPieceFullyRead() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r2.currentPiece
                if (r0 == 0) goto L2e
                int r0 = r2.currentPieceIndex
                int r1 = r2.currentPieceSize
                if (r0 != r1) goto L2e
                int r0 = r2.currentPieceOffsetInRope
                int r0 = r0 + r1
                r2.currentPieceOffsetInRope = r0
                r0 = 0
                r2.currentPieceIndex = r0
                com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r1 = r2.pieceIterator
                boolean r1 = r1.hasNext()
                if (r1 == 0) goto L29
                com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r0 = r2.pieceIterator
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r0.next()
                r2.currentPiece = r0
                int r0 = r0.size()
                r2.currentPieceSize = r0
                goto L2e
            L29:
                r1 = 0
                r2.currentPiece = r1
                r2.currentPieceSize = r0
            L2e:
                return
        }

        private int availableInternal() {
                r2 = this;
                int r0 = r2.currentPieceOffsetInRope
                int r1 = r2.currentPieceIndex
                int r0 = r0 + r1
                com.google.crypto.tink.shaded.protobuf.RopeByteString r1 = r2.this$0
                int r1 = r1.size()
                int r1 = r1 - r0
                return r1
        }

        private void initialize() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator
                com.google.crypto.tink.shaded.protobuf.RopeByteString r1 = r3.this$0
                r2 = 0
                r0.<init>(r1, r2)
                r3.pieceIterator = r0
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r0.next()
                r3.currentPiece = r0
                int r0 = r0.size()
                r3.currentPieceSize = r0
                r0 = 0
                r3.currentPieceIndex = r0
                r3.currentPieceOffsetInRope = r0
                return
        }

        private int readSkipInternal(byte[] r5, int r6, int r7) {
                r4 = this;
                r0 = r7
            L1:
                if (r0 <= 0) goto L25
                r4.advanceIfCurrentPieceFullyRead()
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r1 = r4.currentPiece
                if (r1 != 0) goto Lb
                goto L25
            Lb:
                int r1 = r4.currentPieceSize
                int r2 = r4.currentPieceIndex
                int r1 = r1 - r2
                int r1 = java.lang.Math.min(r1, r0)
                if (r5 == 0) goto L1e
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r2 = r4.currentPiece
                int r3 = r4.currentPieceIndex
                r2.copyTo(r5, r3, r6, r1)
                int r6 = r6 + r1
            L1e:
                int r2 = r4.currentPieceIndex
                int r2 = r2 + r1
                r4.currentPieceIndex = r2
                int r0 = r0 - r1
                goto L1
            L25:
                int r7 = r7 - r0
                return r7
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
                r1 = this;
                int r0 = r1.availableInternal()
                return r0
        }

        @Override // java.io.InputStream
        public void mark(int r2) {
                r1 = this;
                int r2 = r1.currentPieceOffsetInRope
                int r0 = r1.currentPieceIndex
                int r2 = r2 + r0
                r1.mark = r2
                return
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r3 = this;
                r3.advanceIfCurrentPieceFullyRead()
                com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r0 = r3.currentPiece
                if (r0 != 0) goto L9
                r0 = -1
                return r0
            L9:
                int r1 = r3.currentPieceIndex
                int r2 = r1 + 1
                r3.currentPieceIndex = r2
                byte r0 = r0.byteAt(r1)
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) {
                r1 = this;
                r2.getClass()
                if (r3 < 0) goto L1b
                if (r4 < 0) goto L1b
                int r0 = r2.length
                int r0 = r0 - r3
                if (r4 > r0) goto L1b
                int r2 = r1.readSkipInternal(r2, r3, r4)
                if (r2 != 0) goto L1a
                if (r4 > 0) goto L19
                int r3 = r1.availableInternal()
                if (r3 != 0) goto L1a
            L19:
                r2 = -1
            L1a:
                return r2
            L1b:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                r2.<init>()
                throw r2
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
                r3 = this;
                monitor-enter(r3)
                r3.initialize()     // Catch: java.lang.Throwable -> Ld
                int r0 = r3.mark     // Catch: java.lang.Throwable -> Ld
                r1 = 0
                r2 = 0
                r3.readSkipInternal(r1, r2, r0)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r3)
                return
            Ld:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }

        @Override // java.io.InputStream
        public long skip(long r4) {
                r3 = this;
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 < 0) goto L17
                r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto Le
                r4 = r0
            Le:
                r0 = 0
                int r4 = (int) r4
                r5 = 0
                int r4 = r3.readSkipInternal(r5, r0, r4)
                long r4 = (long) r4
                return r4
            L17:
                java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
                r4.<init>()
                throw r4
        }
    }

    static {
            r0 = 47
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, 2147483647} // fill-array
            com.google.crypto.tink.shaded.protobuf.RopeByteString.minLengthByDepth = r0
            return
    }

    private RopeByteString(com.google.crypto.tink.shaded.protobuf.ByteString r3, com.google.crypto.tink.shaded.protobuf.ByteString r4) {
            r2 = this;
            r2.<init>()
            r2.left = r3
            r2.right = r4
            int r0 = r3.size()
            r2.leftLength = r0
            int r1 = r4.size()
            int r0 = r0 + r1
            r2.totalLength = r0
            int r3 = r3.getTreeDepth()
            int r4 = r4.getTreeDepth()
            int r3 = java.lang.Math.max(r3, r4)
            int r3 = r3 + 1
            r2.treeDepth = r3
            return
    }

    /* synthetic */ RopeByteString(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.RopeByteString.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.ByteString access$400(com.google.crypto.tink.shaded.protobuf.RopeByteString r0) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.left
            return r0
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.ByteString access$500(com.google.crypto.tink.shaded.protobuf.RopeByteString r0) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.right
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.ByteString concatenate(com.google.crypto.tink.shaded.protobuf.ByteString r5, com.google.crypto.tink.shaded.protobuf.ByteString r6) {
            int r0 = r6.size()
            if (r0 != 0) goto L7
            return r5
        L7:
            int r0 = r5.size()
            if (r0 != 0) goto Le
            return r6
        Le:
            int r0 = r5.size()
            int r1 = r6.size()
            int r0 = r0 + r1
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L20
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = concatenateBytes(r5, r6)
            return r5
        L20:
            boolean r2 = r5 instanceof com.google.crypto.tink.shaded.protobuf.RopeByteString
            if (r2 == 0) goto L69
            r2 = r5
            com.google.crypto.tink.shaded.protobuf.RopeByteString r2 = (com.google.crypto.tink.shaded.protobuf.RopeByteString) r2
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r2.right
            int r3 = r3.size()
            int r4 = r6.size()
            int r3 = r3 + r4
            if (r3 >= r1) goto L42
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r2.right
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = concatenateBytes(r5, r6)
            com.google.crypto.tink.shaded.protobuf.RopeByteString r6 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            r6.<init>(r0, r5)
            return r6
        L42:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r2.left
            int r1 = r1.getTreeDepth()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r2.right
            int r3 = r3.getTreeDepth()
            if (r1 <= r3) goto L69
            int r1 = r2.getTreeDepth()
            int r3 = r6.getTreeDepth()
            if (r1 <= r3) goto L69
            com.google.crypto.tink.shaded.protobuf.RopeByteString r5 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.right
            r5.<init>(r0, r6)
            com.google.crypto.tink.shaded.protobuf.RopeByteString r6 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            r6.<init>(r0, r5)
            return r6
        L69:
            int r1 = r5.getTreeDepth()
            int r2 = r6.getTreeDepth()
            int r1 = java.lang.Math.max(r1, r2)
            int r1 = r1 + 1
            int r1 = minLength(r1)
            if (r0 < r1) goto L83
            com.google.crypto.tink.shaded.protobuf.RopeByteString r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            r0.<init>(r5, r6)
            return r0
        L83:
            com.google.crypto.tink.shaded.protobuf.RopeByteString$Balancer r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$Balancer
            r1 = 0
            r0.<init>(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = com.google.crypto.tink.shaded.protobuf.RopeByteString.Balancer.access$100(r0, r5, r6)
            return r5
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString concatenateBytes(com.google.crypto.tink.shaded.protobuf.ByteString r4, com.google.crypto.tink.shaded.protobuf.ByteString r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            int r2 = r0 + r1
            byte[] r2 = new byte[r2]
            r3 = 0
            r4.copyTo(r2, r3, r3, r0)
            r5.copyTo(r2, r3, r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r2)
            return r4
    }

    private boolean equalsFragments(com.google.crypto.tink.shaded.protobuf.ByteString r12) {
            r11 = this;
            com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator
            r1 = 0
            r0.<init>(r11, r1)
            java.lang.Object r2 = r0.next()
            com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r2
            com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r3 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator
            r3.<init>(r12, r1)
            java.lang.Object r12 = r3.next()
            com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r12 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r12
            r1 = 0
            r4 = r1
            r5 = r4
            r6 = r5
        L1b:
            int r7 = r2.size()
            int r7 = r7 - r4
            int r8 = r12.size()
            int r8 = r8 - r5
            int r9 = java.lang.Math.min(r7, r8)
            if (r4 != 0) goto L30
            boolean r10 = r2.equalsRange(r12, r5, r9)
            goto L34
        L30:
            boolean r10 = r12.equalsRange(r2, r4, r9)
        L34:
            if (r10 != 0) goto L37
            return r1
        L37:
            int r6 = r6 + r9
            int r10 = r11.totalLength
            if (r6 < r10) goto L46
            if (r6 != r10) goto L40
            r12 = 1
            return r12
        L40:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L46:
            if (r9 != r7) goto L50
            java.lang.Object r2 = r0.next()
            com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r2
            r4 = r1
            goto L51
        L50:
            int r4 = r4 + r9
        L51:
            if (r9 != r8) goto L5b
            java.lang.Object r12 = r3.next()
            com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r12 = (com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString) r12
            r5 = r1
            goto L1b
        L5b:
            int r5 = r5 + r9
            goto L1b
    }

    static int minLength(int r2) {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.RopeByteString.minLengthByDepth
            int r1 = r0.length
            if (r2 < r1) goto L9
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
        L9:
            r2 = r0[r2]
            return r2
    }

    static com.google.crypto.tink.shaded.protobuf.RopeByteString newInstanceForTest(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            com.google.crypto.tink.shaded.protobuf.RopeByteString r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            r0.<init>(r1, r2)
            return r0
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "RopeByteStream instances are not to be serialized directly"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public java.nio.ByteBuffer asReadOnlyByteBuffer() {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator r1 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$PieceIterator
            r2 = 0
            r1.<init>(r3, r2)
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            com.google.crypto.tink.shaded.protobuf.ByteString$LeafByteString r2 = r1.next()
            java.nio.ByteBuffer r2 = r2.asReadOnlyByteBuffer()
            r0.add(r2)
            goto Lb
        L1d:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public byte byteAt(int r2) {
            r1 = this;
            int r0 = r1.totalLength
            checkIndex(r2, r0)
            byte r2 = r1.internalByteAt(r2)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void copyTo(java.nio.ByteBuffer r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.left
            r0.copyTo(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.right
            r0.copyTo(r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected void copyToInternal(byte[] r3, int r4, int r5, int r6) {
            r2 = this;
            int r0 = r4 + r6
            int r1 = r2.leftLength
            if (r0 > r1) goto Lc
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            r0.copyToInternal(r3, r4, r5, r6)
            goto L23
        Lc:
            if (r4 < r1) goto L15
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.right
            int r4 = r4 - r1
            r0.copyToInternal(r3, r4, r5, r6)
            goto L23
        L15:
            int r1 = r1 - r4
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            r0.copyToInternal(r3, r4, r5, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r2.right
            int r5 = r5 + r1
            int r6 = r6 - r1
            r0 = 0
            r4.copyToInternal(r3, r0, r5, r6)
        L23:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = (com.google.crypto.tink.shaded.protobuf.ByteString) r5
            int r1 = r4.totalLength
            int r3 = r5.size()
            if (r1 == r3) goto L15
            return r2
        L15:
            int r1 = r4.totalLength
            if (r1 != 0) goto L1a
            return r0
        L1a:
            int r0 = r4.peekCachedHashCode()
            int r1 = r5.peekCachedHashCode()
            if (r0 == 0) goto L29
            if (r1 == 0) goto L29
            if (r0 == r1) goto L29
            return r2
        L29:
            boolean r5 = r4.equalsFragments(r5)
            return r5
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected int getTreeDepth() {
            r1 = this;
            int r0 = r1.treeDepth
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    byte internalByteAt(int r3) {
            r2 = this;
            int r0 = r2.leftLength
            if (r3 >= r0) goto Lb
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            byte r3 = r0.internalByteAt(r3)
            return r3
        Lb:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r2.right
            int r3 = r3 - r0
            byte r3 = r1.internalByteAt(r3)
            return r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected boolean isBalanced() {
            r2 = this;
            int r0 = r2.totalLength
            int r1 = r2.treeDepth
            int r1 = minLength(r1)
            if (r0 < r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean isValidUtf8() {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.left
            int r1 = r4.leftLength
            r2 = 0
            int r0 = r0.partialIsValidUtf8(r2, r2, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.right
            int r3 = r1.size()
            int r0 = r1.partialIsValidUtf8(r0, r2, r3)
            if (r0 != 0) goto L16
            r2 = 1
        L16:
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
    public java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.RopeByteString$1 r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator2() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString$ByteIterator r0 = r1.iterator()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public com.google.crypto.tink.shaded.protobuf.CodedInputStream newCodedInput() {
            r2 = this;
            java.util.List r0 = r2.asReadOnlyByteBufferList()
            r1 = 1
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r0, r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public java.io.InputStream newInput() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.RopeByteString$RopeInputStream r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString$RopeInputStream
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected int partialHash(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r2.leftLength
            if (r0 > r1) goto Ld
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            int r3 = r0.partialHash(r3, r4, r5)
            return r3
        Ld:
            if (r4 < r1) goto L17
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.right
            int r4 = r4 - r1
            int r3 = r0.partialHash(r3, r4, r5)
            return r3
        L17:
            int r1 = r1 - r4
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            int r3 = r0.partialHash(r3, r4, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r2.right
            r0 = 0
            int r5 = r5 - r1
            int r3 = r4.partialHash(r3, r0, r5)
            return r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected int partialIsValidUtf8(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r2.leftLength
            if (r0 > r1) goto Ld
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            int r3 = r0.partialIsValidUtf8(r3, r4, r5)
            return r3
        Ld:
            if (r4 < r1) goto L17
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.right
            int r4 = r4 - r1
            int r3 = r0.partialIsValidUtf8(r3, r4, r5)
            return r3
        L17:
            int r1 = r1 - r4
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            int r3 = r0.partialIsValidUtf8(r3, r4, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r2.right
            r0 = 0
            int r5 = r5 - r1
            int r3 = r4.partialIsValidUtf8(r3, r0, r5)
            return r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int size() {
            r1 = this;
            int r0 = r1.totalLength
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public com.google.crypto.tink.shaded.protobuf.ByteString substring(int r3, int r4) {
            r2 = this;
            int r0 = r2.totalLength
            int r0 = checkRange(r3, r4, r0)
            if (r0 != 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            return r3
        Lb:
            int r1 = r2.totalLength
            if (r0 != r1) goto L10
            return r2
        L10:
            int r0 = r2.leftLength
            if (r4 > r0) goto L1b
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.substring(r3, r4)
            return r3
        L1b:
            if (r3 < r0) goto L26
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r2.right
            int r3 = r3 - r0
            int r4 = r4 - r0
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r1.substring(r3, r4)
            return r3
        L26:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.substring(r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.right
            int r1 = r2.leftLength
            int r4 = r4 - r1
            r1 = 0
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r0.substring(r1, r4)
            com.google.crypto.tink.shaded.protobuf.RopeByteString r0 = new com.google.crypto.tink.shaded.protobuf.RopeByteString
            r0.<init>(r3, r4)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    protected java.lang.String toStringInternal(java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r2.toByteArray()
            r0.<init>(r1, r3)
            return r0
    }

    java.lang.Object writeReplace() {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    void writeTo(com.google.crypto.tink.shaded.protobuf.ByteOutput r2) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.left
            r0.writeTo(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.right
            r0.writeTo(r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeTo(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.left
            r0.writeTo(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.right
            r0.writeTo(r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    void writeToInternal(java.io.OutputStream r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r2.leftLength
            if (r0 > r1) goto Lc
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            r0.writeToInternal(r3, r4, r5)
            goto L22
        Lc:
            if (r4 < r1) goto L15
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.right
            int r4 = r4 - r1
            r0.writeToInternal(r3, r4, r5)
            goto L22
        L15:
            int r1 = r1 - r4
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.left
            r0.writeToInternal(r3, r4, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r2.right
            r0 = 0
            int r5 = r5 - r1
            r4.writeToInternal(r3, r0, r5)
        L22:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    void writeToReverse(com.google.crypto.tink.shaded.protobuf.ByteOutput r2) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.right
            r0.writeToReverse(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.left
            r0.writeToReverse(r2)
            return
    }
}
