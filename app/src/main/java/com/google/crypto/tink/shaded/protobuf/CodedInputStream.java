package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader wrapper;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.CodedInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class ArrayDecoder extends com.google.crypto.tink.shaded.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private ArrayDecoder(byte[] r2, int r3, int r4, boolean r5) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.currentLimit = r0
                r1.buffer = r2
                int r4 = r4 + r3
                r1.limit = r4
                r1.pos = r3
                r1.startPos = r3
                r1.immutable = r5
                return
        }

        /* synthetic */ ArrayDecoder(byte[] r1, int r2, int r3, boolean r4, com.google.crypto.tink.shaded.protobuf.CodedInputStream.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        private void recomputeBufferSizeAfterLimit() {
                r3 = this;
                int r0 = r3.limit
                int r1 = r3.bufferSizeAfterLimit
                int r0 = r0 + r1
                r3.limit = r0
                int r1 = r3.startPos
                int r1 = r0 - r1
                int r2 = r3.currentLimit
                if (r1 <= r2) goto L16
                int r1 = r1 - r2
                r3.bufferSizeAfterLimit = r1
                int r0 = r0 - r1
                r3.limit = r0
                goto L19
            L16:
                r0 = 0
                r3.bufferSizeAfterLimit = r0
            L19:
                return
        }

        private void skipRawVarint() throws java.io.IOException {
                r2 = this;
                int r0 = r2.limit
                int r1 = r2.pos
                int r0 = r0 - r1
                r1 = 10
                if (r0 < r1) goto Ld
                r2.skipRawVarintFastPath()
                goto L10
            Ld:
                r2.skipRawVarintSlowPath()
            L10:
                return
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
                r4 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto L15
                byte[] r1 = r4.buffer
                int r2 = r4.pos
                int r3 = r2 + 1
                r4.pos = r3
                r1 = r1[r2]
                if (r1 < 0) goto L12
                return
            L12:
                int r0 = r0 + 1
                goto L1
            L15:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readRawByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                int r0 = r1.lastTag
                if (r0 != r2) goto L5
                return
            L5:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean r1) {
                r0 = this;
                r0.enableAliasing = r1
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
                r2 = this;
                int r0 = r2.currentLimit
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L9
                r0 = -1
                return r0
            L9:
                int r1 = r2.getTotalBytesRead()
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
                r1 = this;
                int r0 = r1.lastTag
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.startPos
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.limit
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int r1) {
                r0 = this;
                r0.currentLimit = r1
                r0.recomputeBufferSizeAfterLimit()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                if (r2 < 0) goto L1d
                int r0 = r1.getTotalBytesRead()
                int r2 = r2 + r0
                if (r2 < 0) goto L18
                int r0 = r1.currentLimit
                if (r2 > r0) goto L13
                r1.currentLimit = r2
                r1.recomputeBufferSizeAfterLimit()
                return r0
            L13:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r2
            L18:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
                throw r2
            L1d:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
                r4 = this;
                long r0 = r4.readRawVarint64()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                byte[] r0 = r1.readRawBytes(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
                r4 = this;
                int r0 = r4.readRawVarint32()
                if (r0 <= 0) goto L32
                int r1 = r4.limit
                int r2 = r4.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L32
                boolean r1 = r4.immutable
                if (r1 != 0) goto L20
                boolean r1 = r4.enableAliasing
                if (r1 == 0) goto L20
                byte[] r1 = r4.buffer
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1, r2, r0)
                java.nio.ByteBuffer r1 = r1.slice()
                goto L2c
            L20:
                byte[] r1 = r4.buffer
                int r3 = r2 + r0
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            L2c:
                int r2 = r4.pos
                int r2 = r2 + r0
                r4.pos = r2
                return r1
            L32:
                if (r0 != 0) goto L37
                java.nio.ByteBuffer r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER
                return r0
            L37:
                if (r0 >= 0) goto L3e
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L3e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                if (r0 <= 0) goto L28
                int r1 = r3.limit
                int r2 = r3.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L28
                boolean r1 = r3.immutable
                if (r1 == 0) goto L1c
                boolean r1 = r3.enableAliasing
                if (r1 == 0) goto L1c
                byte[] r1 = r3.buffer
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r1, r2, r0)
                goto L22
            L1c:
                byte[] r1 = r3.buffer
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1, r2, r0)
            L22:
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.pos = r2
                return r1
            L28:
                if (r0 != 0) goto L2d
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                return r0
            L2d:
                byte[] r0 = r3.readRawBytes(r0)
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readGroup(int r2, com.google.crypto.tink.shaded.protobuf.Parser<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                java.lang.Object r3 = r3.parsePartialFrom(r1, r4)
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
                r4 = 4
                int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r4)
                r1.checkLastTagWas(r2)
                int r2 = r1.recursionDepth
                int r2 = r2 + (-1)
                r1.recursionDepth = r2
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                r3.mergeFrom(r1, r4)
                r3 = 4
                int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r3)
                r1.checkLastTagWas(r2)
                int r2 = r1.recursionDepth
                int r2 = r2 + (-1)
                r1.recursionDepth = r2
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readMessage(com.google.crypto.tink.shaded.protobuf.Parser<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.readRawVarint32()
                r2.checkRecursionLimit()
                int r0 = r2.pushLimit(r0)
                int r1 = r2.recursionDepth
                int r1 = r1 + 1
                r2.recursionDepth = r1
                java.lang.Object r3 = r3.parsePartialFrom(r2, r4)
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
                r4 = 0
                r2.checkLastTagWas(r4)
                int r4 = r2.recursionDepth
                int r4 = r4 + (-1)
                r2.recursionDepth = r4
                int r4 = r2.getBytesUntilLimit()
                if (r4 != 0) goto L2b
                r2.popLimit(r0)
                return r3
            L2b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.readRawVarint32()
                r2.checkRecursionLimit()
                int r0 = r2.pushLimit(r0)
                int r1 = r2.recursionDepth
                int r1 = r1 + 1
                r2.recursionDepth = r1
                r3.mergeFrom(r2, r4)
                r3 = 0
                r2.checkLastTagWas(r3)
                int r3 = r2.recursionDepth
                int r3 = r3 + (-1)
                r2.recursionDepth = r3
                int r3 = r2.getBytesUntilLimit()
                if (r3 != 0) goto L28
                r2.popLimit(r0)
                return
            L28:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
                r3 = this;
                int r0 = r3.pos
                int r1 = r3.limit
                if (r0 == r1) goto Lf
                byte[] r1 = r3.buffer
                int r2 = r0 + 1
                r3.pos = r2
                r0 = r1[r0]
                return r0
            Lf:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 <= 0) goto L13
                int r0 = r2.limit
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 > r0) goto L13
                int r3 = r3 + r1
                r2.pos = r3
                byte[] r0 = r2.buffer
                byte[] r3 = java.util.Arrays.copyOfRange(r0, r1, r3)
                return r3
            L13:
                if (r3 > 0) goto L1f
                if (r3 != 0) goto L1a
                byte[] r3 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
                return r3
            L1a:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r3
            L1f:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
                r4 = this;
                int r0 = r4.pos
                int r1 = r4.limit
                int r1 = r1 - r0
                r2 = 4
                if (r1 < r2) goto L2e
                byte[] r1 = r4.buffer
                int r2 = r0 + 4
                r4.pos = r2
                r2 = r1[r0]
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r3 = r0 + 1
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                int r3 = r0 + 2
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                int r0 = r0 + 3
                r0 = r1[r0]
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r0 = r0 << 24
                r0 = r0 | r2
                return r0
            L2e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
                r9 = this;
                int r0 = r9.pos
                int r1 = r9.limit
                int r1 = r1 - r0
                r2 = 8
                if (r1 < r2) goto L5b
                byte[] r1 = r9.buffer
                int r3 = r0 + 8
                r9.pos = r3
                r3 = r1[r0]
                long r3 = (long) r3
                r5 = 255(0xff, double:1.26E-321)
                long r3 = r3 & r5
                int r7 = r0 + 1
                r7 = r1[r7]
                long r7 = (long) r7
                long r7 = r7 & r5
                long r7 = r7 << r2
                long r2 = r3 | r7
                int r4 = r0 + 2
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 16
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 3
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 24
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 4
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 32
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 5
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 40
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 6
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 48
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r0 = r0 + 7
                r0 = r1[r0]
                long r0 = (long) r0
                long r0 = r0 & r5
                r4 = 56
                long r0 = r0 << r4
                long r0 = r0 | r2
                return r0
            L5b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawVarint32() throws java.io.IOException {
                r7 = this;
                int r0 = r7.pos
                int r1 = r7.limit
                if (r1 != r0) goto L7
                goto L6b
            L7:
                byte[] r2 = r7.buffer
                int r3 = r0 + 1
                r4 = r2[r0]
                if (r4 < 0) goto L12
                r7.pos = r3
                return r4
            L12:
                int r1 = r1 - r3
                r5 = 9
                if (r1 >= r5) goto L18
                goto L6b
            L18:
                int r1 = r0 + 2
                r3 = r2[r3]
                int r3 = r3 << 7
                r3 = r3 ^ r4
                if (r3 >= 0) goto L24
                r0 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L79
            L24:
                int r4 = r0 + 3
                r1 = r2[r1]
                int r1 = r1 << 14
                r1 = r1 ^ r3
                if (r1 < 0) goto L31
                r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r4
                goto L79
            L31:
                int r3 = r0 + 4
                r4 = r2[r4]
                int r4 = r4 << 21
                r1 = r1 ^ r4
                if (r1 >= 0) goto L40
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
            L3e:
                r1 = r3
                goto L79
            L40:
                int r4 = r0 + 5
                r3 = r2[r3]
                int r5 = r3 << 28
                r1 = r1 ^ r5
                r5 = 266354560(0xfe03f80, float:2.2112565E-29)
                r1 = r1 ^ r5
                if (r3 >= 0) goto L77
                int r3 = r0 + 6
                r4 = r2[r4]
                if (r4 >= 0) goto L75
                int r4 = r0 + 7
                r3 = r2[r3]
                if (r3 >= 0) goto L77
                int r3 = r0 + 8
                r4 = r2[r4]
                if (r4 >= 0) goto L75
                int r4 = r0 + 9
                r3 = r2[r3]
                if (r3 >= 0) goto L77
                int r0 = r0 + 10
                r2 = r2[r4]
                if (r2 >= 0) goto L71
            L6b:
                long r0 = r7.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L71:
                r6 = r1
                r1 = r0
                r0 = r6
                goto L79
            L75:
                r0 = r1
                goto L3e
            L77:
                r0 = r1
                goto L2f
            L79:
                r7.pos = r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
                r12 = this;
                int r0 = r12.pos
                int r1 = r12.limit
                if (r1 != r0) goto L8
                goto Lba
            L8:
                byte[] r2 = r12.buffer
                int r3 = r0 + 1
                r4 = r2[r0]
                if (r4 < 0) goto L14
                r12.pos = r3
                long r0 = (long) r4
                return r0
            L14:
                int r1 = r1 - r3
                r5 = 9
                if (r1 >= r5) goto L1b
                goto Lba
            L1b:
                int r1 = r0 + 2
                r3 = r2[r3]
                int r3 = r3 << 7
                r3 = r3 ^ r4
                if (r3 >= 0) goto L29
                r0 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                long r2 = (long) r0
                goto Lc1
            L29:
                int r4 = r0 + 3
                r1 = r2[r1]
                int r1 = r1 << 14
                r1 = r1 ^ r3
                if (r1 < 0) goto L38
                r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
                long r2 = (long) r0
                r1 = r4
                goto Lc1
            L38:
                int r3 = r0 + 4
                r4 = r2[r4]
                int r4 = r4 << 21
                r1 = r1 ^ r4
                if (r1 >= 0) goto L4b
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                long r0 = (long) r0
                r10 = r0
                r1 = r3
                r2 = r10
                goto Lc1
            L4b:
                long r4 = (long) r1
                int r1 = r0 + 5
                r3 = r2[r3]
                long r6 = (long) r3
                r3 = 28
                long r6 = r6 << r3
                long r3 = r4 ^ r6
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L62
                r5 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5f:
                long r2 = r3 ^ r5
                goto Lc1
            L62:
                int r7 = r0 + 6
                r1 = r2[r1]
                long r8 = (long) r1
                r1 = 35
                long r8 = r8 << r1
                long r3 = r3 ^ r8
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L78
                r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L74:
                long r2 = r3 ^ r0
                r1 = r7
                goto Lc1
            L78:
                int r1 = r0 + 7
                r7 = r2[r7]
                long r7 = (long) r7
                r9 = 42
                long r7 = r7 << r9
                long r3 = r3 ^ r7
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L8b
                r5 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5f
            L8b:
                int r7 = r0 + 8
                r1 = r2[r1]
                long r8 = (long) r1
                r1 = 49
                long r8 = r8 << r1
                long r3 = r3 ^ r8
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L9e
                r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L74
            L9e:
                int r1 = r0 + 9
                r7 = r2[r7]
                long r7 = (long) r7
                r9 = 56
                long r7 = r7 << r9
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 >= 0) goto Lc0
                int r0 = r0 + 10
                r1 = r2[r1]
                long r1 = (long) r1
                int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbf
            Lba:
                long r0 = r12.readRawVarint64SlowPath()
                return r0
            Lbf:
                r1 = r0
            Lc0:
                r2 = r3
            Lc1:
                r12.pos = r1
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readRawByte()
                r4 = r3 & 127(0x7f, float:1.78E-43)
                long r4 = (long) r4
                long r4 = r4 << r2
                long r0 = r0 | r4
                r3 = r3 & 128(0x80, float:1.8E-43)
                if (r3 != 0) goto L15
                return r0
            L15:
                int r2 = r2 + 7
                goto L3
            L18:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                int r0 = decodeZigZag32(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                long r0 = decodeZigZag64(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
                r5 = this;
                int r0 = r5.readRawVarint32()
                if (r0 <= 0) goto L1e
                int r1 = r5.limit
                int r2 = r5.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L1e
                java.lang.String r1 = new java.lang.String
                byte[] r2 = r5.buffer
                int r3 = r5.pos
                java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r2, r3, r0, r4)
                int r2 = r5.pos
                int r2 = r2 + r0
                r5.pos = r2
                return r1
            L1e:
                if (r0 != 0) goto L23
                java.lang.String r0 = ""
                return r0
            L23:
                if (r0 >= 0) goto L2a
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L2a:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                if (r0 <= 0) goto L19
                int r1 = r3.limit
                int r2 = r3.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L19
                byte[] r1 = r3.buffer
                java.lang.String r1 = com.google.crypto.tink.shaded.protobuf.Utf8.decodeUtf8(r1, r2, r0)
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.pos = r2
                return r1
            L19:
                if (r0 != 0) goto L1e
                java.lang.String r0 = ""
                return r0
            L1e:
                if (r0 > 0) goto L25
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L25:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.isAtEnd()
                if (r0 == 0) goto La
                r0 = 0
                r1.lastTag = r0
                return r0
            La:
                int r0 = r1.readRawVarint32()
                r1.lastTag = r0
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
                if (r0 == 0) goto L19
                int r0 = r1.lastTag
                return r0
            L19:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                r1.readGroup(r2, r3, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
                r1 = this;
                int r0 = r1.pos
                r1.startPos = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                if (r0 == 0) goto L3d
                if (r0 == r1) goto L37
                r2 = 2
                if (r0 == r2) goto L2f
                r2 = 3
                r3 = 4
                if (r0 == r2) goto L20
                if (r0 == r3) goto L1e
                r5 = 5
                if (r0 != r5) goto L19
                r4.skipRawBytes(r3)
                return r1
            L19:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L1e:
                r5 = 0
                return r5
            L20:
                r4.skipMessage()
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r5, r3)
                r4.checkLastTagWas(r5)
                return r1
            L2f:
                int r5 = r4.readRawVarint32()
                r4.skipRawBytes(r5)
                return r1
            L37:
                r5 = 8
                r4.skipRawBytes(r5)
                return r1
            L3d:
                r4.skipRawVarint()
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                if (r0 == 0) goto L52
                if (r0 == r1) goto L47
                r2 = 2
                if (r0 == r2) goto L3c
                r2 = 3
                r3 = 4
                if (r0 == r2) goto L27
                if (r0 == r3) goto L25
                r2 = 5
                if (r0 != r2) goto L20
                int r0 = r4.readRawLittleEndian32()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed32NoTag(r0)
                return r1
            L20:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L25:
                r5 = 0
                return r5
            L27:
                r6.writeUInt32NoTag(r5)
                r4.skipMessage(r6)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r5, r3)
                r4.checkLastTagWas(r5)
                r6.writeUInt32NoTag(r5)
                return r1
            L3c:
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.readBytes()
                r6.writeUInt32NoTag(r5)
                r6.writeBytesNoTag(r0)
                return r1
            L47:
                long r2 = r4.readRawLittleEndian64()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed64NoTag(r2)
                return r1
            L52:
                long r2 = r4.readInt64()
                r6.writeUInt32NoTag(r5)
                r6.writeUInt64NoTag(r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
                r1 = this;
            L0:
                int r0 = r1.readTag()
                if (r0 == 0) goto Lc
                boolean r0 = r1.skipField(r0)
                if (r0 != 0) goto L0
            Lc:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2) throws java.io.IOException {
                r1 = this;
            L0:
                int r0 = r1.readTag()
                if (r0 == 0) goto Lc
                boolean r0 = r1.skipField(r0, r2)
                if (r0 != 0) goto L0
            Lc:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto Ld
                int r0 = r2.limit
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 > r0) goto Ld
                int r1 = r1 + r3
                r2.pos = r1
                return
            Ld:
                if (r3 >= 0) goto L14
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r3
            L14:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }
    }

    private static final class IterableDirectByteBufferDecoder extends com.google.crypto.tink.shaded.protobuf.CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private java.nio.ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final java.lang.Iterable<java.nio.ByteBuffer> input;
        private final java.util.Iterator<java.nio.ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private IterableDirectByteBufferDecoder(java.lang.Iterable<java.nio.ByteBuffer> r2, int r3, boolean r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.currentLimit = r0
                r1.totalBufferSize = r3
                r1.input = r2
                java.util.Iterator r2 = r2.iterator()
                r1.iterator = r2
                r1.immutable = r4
                r2 = 0
                r1.totalBytesRead = r2
                r1.startOffset = r2
                if (r3 != 0) goto L2b
                java.nio.ByteBuffer r2 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER
                r1.currentByteBuffer = r2
                r2 = 0
                r1.currentByteBufferPos = r2
                r1.currentByteBufferStartPos = r2
                r1.currentByteBufferLimit = r2
                r1.currentAddress = r2
                goto L2e
            L2b:
                r1.tryGetNextByteBuffer()
            L2e:
                return
        }

        /* synthetic */ IterableDirectByteBufferDecoder(java.lang.Iterable r1, int r2, boolean r3, com.google.crypto.tink.shaded.protobuf.CodedInputStream.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private long currentRemaining() {
                r4 = this;
                long r0 = r4.currentByteBufferLimit
                long r2 = r4.currentByteBufferPos
                long r0 = r0 - r2
                return r0
        }

        private void getNextByteBuffer() throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                java.util.Iterator<java.nio.ByteBuffer> r0 = r1.iterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lc
                r1.tryGetNextByteBuffer()
                return
            Lc:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        private void readRawBytesTo(byte[] r12, int r13, int r14) throws java.io.IOException {
                r11 = this;
                if (r14 < 0) goto L35
                int r0 = r11.remaining()
                if (r14 > r0) goto L35
                r0 = r14
            L9:
                if (r0 <= 0) goto L34
                long r1 = r11.currentRemaining()
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L18
                r11.getNextByteBuffer()
            L18:
                long r1 = r11.currentRemaining()
                int r1 = (int) r1
                int r1 = java.lang.Math.min(r0, r1)
                long r2 = r11.currentByteBufferPos
                int r4 = r14 - r0
                int r4 = r4 + r13
                long r5 = (long) r4
                long r9 = (long) r1
                r4 = r12
                r7 = r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r2, r4, r5, r7)
                int r0 = r0 - r1
                long r1 = r11.currentByteBufferPos
                long r1 = r1 + r9
                r11.currentByteBufferPos = r1
                goto L9
            L34:
                return
            L35:
                if (r14 > 0) goto L3f
                if (r14 != 0) goto L3a
                return
            L3a:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r12 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r12
            L3f:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r12 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r12
        }

        private void recomputeBufferSizeAfterLimit() {
                r3 = this;
                int r0 = r3.totalBufferSize
                int r1 = r3.bufferSizeAfterCurrentLimit
                int r0 = r0 + r1
                r3.totalBufferSize = r0
                int r1 = r3.startOffset
                int r1 = r0 - r1
                int r2 = r3.currentLimit
                if (r1 <= r2) goto L16
                int r1 = r1 - r2
                r3.bufferSizeAfterCurrentLimit = r1
                int r0 = r0 - r1
                r3.totalBufferSize = r0
                goto L19
            L16:
                r0 = 0
                r3.bufferSizeAfterCurrentLimit = r0
            L19:
                return
        }

        private int remaining() {
                r4 = this;
                int r0 = r4.totalBufferSize
                int r1 = r4.totalBytesRead
                int r0 = r0 - r1
                long r0 = (long) r0
                long r2 = r4.currentByteBufferPos
                long r0 = r0 - r2
                long r2 = r4.currentByteBufferStartPos
                long r0 = r0 + r2
                int r0 = (int) r0
                return r0
        }

        private void skipRawVarint() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readRawByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private java.nio.ByteBuffer slice(int r4, int r5) throws java.io.IOException {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.currentByteBuffer
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.currentByteBuffer
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.currentByteBuffer
                r2.position(r4)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalArgumentException -> L23
                r2.limit(r5)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalArgumentException -> L23
                java.nio.ByteBuffer r4 = r3.currentByteBuffer     // Catch: java.lang.Throwable -> L21 java.lang.IllegalArgumentException -> L23
                java.nio.ByteBuffer r4 = r4.slice()     // Catch: java.lang.Throwable -> L21 java.lang.IllegalArgumentException -> L23
                r2.position(r0)
                r2.limit(r1)
                return r4
            L21:
                r4 = move-exception
                goto L28
            L23:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()     // Catch: java.lang.Throwable -> L21
                throw r4     // Catch: java.lang.Throwable -> L21
            L28:
                r2.position(r0)
                r2.limit(r1)
                throw r4
        }

        private void tryGetNextByteBuffer() {
                r6 = this;
                java.util.Iterator<java.nio.ByteBuffer> r0 = r6.iterator
                java.lang.Object r0 = r0.next()
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
                r6.currentByteBuffer = r0
                int r1 = r6.totalBytesRead
                long r2 = r6.currentByteBufferPos
                long r4 = r6.currentByteBufferStartPos
                long r2 = r2 - r4
                int r2 = (int) r2
                int r1 = r1 + r2
                r6.totalBytesRead = r1
                int r0 = r0.position()
                long r0 = (long) r0
                r6.currentByteBufferPos = r0
                r6.currentByteBufferStartPos = r0
                java.nio.ByteBuffer r0 = r6.currentByteBuffer
                int r0 = r0.limit()
                long r0 = (long) r0
                r6.currentByteBufferLimit = r0
                java.nio.ByteBuffer r0 = r6.currentByteBuffer
                long r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r0)
                r6.currentAddress = r0
                long r2 = r6.currentByteBufferPos
                long r2 = r2 + r0
                r6.currentByteBufferPos = r2
                long r2 = r6.currentByteBufferStartPos
                long r2 = r2 + r0
                r6.currentByteBufferStartPos = r2
                long r2 = r6.currentByteBufferLimit
                long r2 = r2 + r0
                r6.currentByteBufferLimit = r2
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                int r0 = r1.lastTag
                if (r0 != r2) goto L5
                return
            L5:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean r1) {
                r0 = this;
                r0.enableAliasing = r1
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
                r2 = this;
                int r0 = r2.currentLimit
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L9
                r0 = -1
                return r0
            L9:
                int r1 = r2.getTotalBytesRead()
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
                r1 = this;
                int r0 = r1.lastTag
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
                r4 = this;
                int r0 = r4.totalBytesRead
                int r1 = r4.startOffset
                int r0 = r0 - r1
                long r0 = (long) r0
                long r2 = r4.currentByteBufferPos
                long r0 = r0 + r2
                long r2 = r4.currentByteBufferStartPos
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
                r4 = this;
                int r0 = r4.totalBytesRead
                long r0 = (long) r0
                long r2 = r4.currentByteBufferPos
                long r0 = r0 + r2
                long r2 = r4.currentByteBufferStartPos
                long r0 = r0 - r2
                int r2 = r4.totalBufferSize
                long r2 = (long) r2
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int r1) {
                r0 = this;
                r0.currentLimit = r1
                r0.recomputeBufferSizeAfterLimit()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                if (r2 < 0) goto L16
                int r0 = r1.getTotalBytesRead()
                int r2 = r2 + r0
                int r0 = r1.currentLimit
                if (r2 > r0) goto L11
                r1.currentLimit = r2
                r1.recomputeBufferSizeAfterLimit()
                return r0
            L11:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r2
            L16:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
                r4 = this;
                long r0 = r4.readRawVarint64()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                byte[] r0 = r1.readRawBytes(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
                r10 = this;
                int r0 = r10.readRawVarint32()
                if (r0 <= 0) goto L3e
                long r8 = (long) r0
                long r1 = r10.currentRemaining()
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r1 > 0) goto L3e
                boolean r1 = r10.immutable
                if (r1 != 0) goto L29
                boolean r1 = r10.enableAliasing
                if (r1 == 0) goto L29
                long r0 = r10.currentByteBufferPos
                long r0 = r0 + r8
                r10.currentByteBufferPos = r0
                long r2 = r10.currentAddress
                long r4 = r0 - r2
                long r4 = r4 - r8
                int r4 = (int) r4
                long r0 = r0 - r2
                int r0 = (int) r0
                java.nio.ByteBuffer r0 = r10.slice(r4, r0)
                return r0
            L29:
                byte[] r0 = new byte[r0]
                long r1 = r10.currentByteBufferPos
                r4 = 0
                r3 = r0
                r6 = r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r1, r3, r4, r6)
                long r1 = r10.currentByteBufferPos
                long r1 = r1 + r8
                r10.currentByteBufferPos = r1
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                return r0
            L3e:
                if (r0 <= 0) goto L51
                int r1 = r10.remaining()
                if (r0 > r1) goto L51
                byte[] r1 = new byte[r0]
                r2 = 0
                r10.readRawBytesTo(r1, r2, r0)
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)
                return r0
            L51:
                if (r0 != 0) goto L56
                java.nio.ByteBuffer r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER
                return r0
            L56:
                if (r0 >= 0) goto L5d
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L5d:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
                r10 = this;
                int r0 = r10.readRawVarint32()
                if (r0 <= 0) goto L40
                long r8 = (long) r0
                long r1 = r10.currentByteBufferLimit
                long r3 = r10.currentByteBufferPos
                long r1 = r1 - r3
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r1 > 0) goto L40
                boolean r1 = r10.immutable
                if (r1 == 0) goto L2b
                boolean r1 = r10.enableAliasing
                if (r1 == 0) goto L2b
                long r1 = r10.currentAddress
                long r3 = r3 - r1
                int r1 = (int) r3
                int r0 = r0 + r1
                java.nio.ByteBuffer r0 = r10.slice(r1, r0)
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r0)
                long r1 = r10.currentByteBufferPos
                long r1 = r1 + r8
                r10.currentByteBufferPos = r1
                return r0
            L2b:
                byte[] r0 = new byte[r0]
                r5 = 0
                r1 = r3
                r3 = r0
                r4 = r5
                r6 = r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r1, r3, r4, r6)
                long r1 = r10.currentByteBufferPos
                long r1 = r1 + r8
                r10.currentByteBufferPos = r1
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r0)
                return r0
            L40:
                if (r0 <= 0) goto L98
                int r1 = r10.remaining()
                if (r0 > r1) goto L98
                boolean r1 = r10.immutable
                if (r1 == 0) goto L8d
                boolean r1 = r10.enableAliasing
                if (r1 == 0) goto L8d
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L55:
                if (r0 <= 0) goto L88
                long r2 = r10.currentRemaining()
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto L64
                r10.getNextByteBuffer()
            L64:
                long r2 = r10.currentRemaining()
                int r2 = (int) r2
                int r2 = java.lang.Math.min(r0, r2)
                long r3 = r10.currentByteBufferPos
                long r5 = r10.currentAddress
                long r3 = r3 - r5
                int r3 = (int) r3
                int r4 = r3 + r2
                java.nio.ByteBuffer r3 = r10.slice(r3, r4)
                com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r3)
                r1.add(r3)
                int r0 = r0 - r2
                long r3 = r10.currentByteBufferPos
                long r5 = (long) r2
                long r3 = r3 + r5
                r10.currentByteBufferPos = r3
                goto L55
            L88:
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
                return r0
            L8d:
                byte[] r1 = new byte[r0]
                r2 = 0
                r10.readRawBytesTo(r1, r2, r0)
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r1)
                return r0
            L98:
                if (r0 != 0) goto L9d
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                return r0
            L9d:
                if (r0 >= 0) goto La4
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            La4:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readGroup(int r2, com.google.crypto.tink.shaded.protobuf.Parser<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                java.lang.Object r3 = r3.parsePartialFrom(r1, r4)
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
                r4 = 4
                int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r4)
                r1.checkLastTagWas(r2)
                int r2 = r1.recursionDepth
                int r2 = r2 + (-1)
                r1.recursionDepth = r2
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                r3.mergeFrom(r1, r4)
                r3 = 4
                int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r3)
                r1.checkLastTagWas(r2)
                int r2 = r1.recursionDepth
                int r2 = r2 + (-1)
                r1.recursionDepth = r2
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readMessage(com.google.crypto.tink.shaded.protobuf.Parser<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.readRawVarint32()
                r2.checkRecursionLimit()
                int r0 = r2.pushLimit(r0)
                int r1 = r2.recursionDepth
                int r1 = r1 + 1
                r2.recursionDepth = r1
                java.lang.Object r3 = r3.parsePartialFrom(r2, r4)
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
                r4 = 0
                r2.checkLastTagWas(r4)
                int r4 = r2.recursionDepth
                int r4 = r4 + (-1)
                r2.recursionDepth = r4
                int r4 = r2.getBytesUntilLimit()
                if (r4 != 0) goto L2b
                r2.popLimit(r0)
                return r3
            L2b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.readRawVarint32()
                r2.checkRecursionLimit()
                int r0 = r2.pushLimit(r0)
                int r1 = r2.recursionDepth
                int r1 = r1 + 1
                r2.recursionDepth = r1
                r3.mergeFrom(r2, r4)
                r3 = 0
                r2.checkLastTagWas(r3)
                int r3 = r2.recursionDepth
                int r3 = r3 + (-1)
                r2.recursionDepth = r3
                int r3 = r2.getBytesUntilLimit()
                if (r3 != 0) goto L28
                r2.popLimit(r0)
                return
            L28:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
                r4 = this;
                long r0 = r4.currentRemaining()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Ld
                r4.getNextByteBuffer()
            Ld:
                long r0 = r4.currentByteBufferPos
                r2 = 1
                long r2 = r2 + r0
                r4.currentByteBufferPos = r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int r10) throws java.io.IOException {
                r9 = this;
                if (r10 < 0) goto L1c
                long r7 = (long) r10
                long r0 = r9.currentRemaining()
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r0 > 0) goto L1c
                byte[] r10 = new byte[r10]
                long r0 = r9.currentByteBufferPos
                r3 = 0
                r2 = r10
                r5 = r7
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r0, r2, r3, r5)
                long r0 = r9.currentByteBufferPos
                long r0 = r0 + r7
                r9.currentByteBufferPos = r0
                return r10
            L1c:
                if (r10 < 0) goto L2b
                int r0 = r9.remaining()
                if (r10 > r0) goto L2b
                byte[] r0 = new byte[r10]
                r1 = 0
                r9.readRawBytesTo(r0, r1, r10)
                return r0
            L2b:
                if (r10 > 0) goto L37
                if (r10 != 0) goto L32
                byte[] r10 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
                return r10
            L32:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r10 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r10
            L37:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r10 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r10
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
                r5 = this;
                long r0 = r5.currentRemaining()
                r2 = 4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L3a
                long r0 = r5.currentByteBufferPos
                long r2 = r2 + r0
                r5.currentByteBufferPos = r2
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                r2 = r2 & 255(0xff, float:3.57E-43)
                r3 = 1
                long r3 = r3 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                r3 = 2
                long r3 = r3 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                r3 = 3
                long r0 = r0 + r3
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r0 = r0 << 24
                r0 = r0 | r2
                return r0
            L3a:
                byte r0 = r5.readRawByte()
                r0 = r0 & 255(0xff, float:3.57E-43)
                byte r1 = r5.readRawByte()
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 8
                r0 = r0 | r1
                byte r1 = r5.readRawByte()
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 16
                r0 = r0 | r1
                byte r1 = r5.readRawByte()
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 24
                r0 = r0 | r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
                r17 = this;
                r0 = r17
                long r1 = r17.currentRemaining()
                r3 = 8
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 56
                r7 = 32
                r8 = 24
                r9 = 16
                r10 = 8
                r11 = 255(0xff, double:1.26E-321)
                if (r1 < 0) goto L76
                long r13 = r0.currentByteBufferPos
                long r3 = r3 + r13
                r0.currentByteBufferPos = r3
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r13)
                long r3 = (long) r1
                long r3 = r3 & r11
                r15 = 1
                long r15 = r15 + r13
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r15)
                long r5 = (long) r1
                long r5 = r5 & r11
                long r5 = r5 << r10
                long r3 = r3 | r5
                r5 = 2
                long r5 = r5 + r13
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                long r5 = (long) r1
                long r5 = r5 & r11
                long r5 = r5 << r9
                long r3 = r3 | r5
                r5 = 3
                long r5 = r5 + r13
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                long r5 = (long) r1
                long r5 = r5 & r11
                long r5 = r5 << r8
                long r3 = r3 | r5
                r5 = 4
                long r5 = r5 + r13
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                long r5 = (long) r1
                long r5 = r5 & r11
                long r5 = r5 << r7
                long r3 = r3 | r5
                r5 = 5
                long r5 = r5 + r13
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                long r5 = (long) r1
                long r5 = r5 & r11
                r1 = 40
                long r5 = r5 << r1
                long r3 = r3 | r5
                r5 = 6
                long r5 = r5 + r13
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                long r5 = (long) r1
                long r5 = r5 & r11
                r1 = 48
                long r5 = r5 << r1
                long r3 = r3 | r5
                r5 = 7
                long r13 = r13 + r5
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r13)
            L70:
                long r5 = (long) r1
                long r5 = r5 & r11
                long r1 = r5 << r2
                long r1 = r1 | r3
                return r1
            L76:
                byte r1 = r17.readRawByte()
                long r3 = (long) r1
                long r3 = r3 & r11
                byte r1 = r17.readRawByte()
                long r5 = (long) r1
                long r5 = r5 & r11
                long r5 = r5 << r10
                long r3 = r3 | r5
                byte r1 = r17.readRawByte()
                long r5 = (long) r1
                long r5 = r5 & r11
                long r5 = r5 << r9
                long r3 = r3 | r5
                byte r1 = r17.readRawByte()
                long r5 = (long) r1
                long r5 = r5 & r11
                long r5 = r5 << r8
                long r3 = r3 | r5
                byte r1 = r17.readRawByte()
                long r5 = (long) r1
                long r5 = r5 & r11
                long r5 = r5 << r7
                long r3 = r3 | r5
                byte r1 = r17.readRawByte()
                long r5 = (long) r1
                long r5 = r5 & r11
                r1 = 40
                long r5 = r5 << r1
                long r3 = r3 | r5
                byte r1 = r17.readRawByte()
                long r5 = (long) r1
                long r5 = r5 & r11
                r1 = 48
                long r5 = r5 << r1
                long r3 = r3 | r5
                byte r1 = r17.readRawByte()
                goto L70
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawVarint32() throws java.io.IOException {
                r11 = this;
                long r0 = r11.currentByteBufferPos
                long r2 = r11.currentByteBufferLimit
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L94
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                if (r6 < 0) goto L1a
                long r0 = r11.currentByteBufferPos
                long r0 = r0 + r2
                r11.currentByteBufferPos = r0
                return r6
            L1a:
                long r2 = r11.currentByteBufferLimit
                long r7 = r11.currentByteBufferPos
                long r2 = r2 - r7
                r7 = 10
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 >= 0) goto L27
                goto L94
            L27:
                r2 = 2
                long r2 = r2 + r0
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                int r4 = r4 << 7
                r4 = r4 ^ r6
                if (r4 >= 0) goto L37
                r0 = r4 ^ (-128(0xffffffffffffff80, float:NaN))
                goto La2
            L37:
                r5 = 3
                long r5 = r5 + r0
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                int r2 = r2 << 14
                r2 = r2 ^ r4
                if (r2 < 0) goto L47
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L45:
                r2 = r5
                goto La2
            L47:
                r3 = 4
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                int r5 = r5 << 21
                r2 = r2 ^ r5
                if (r2 >= 0) goto L59
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
            L57:
                r2 = r3
                goto La2
            L59:
                r5 = 5
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                int r4 = r3 << 28
                r2 = r2 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r4
                if (r3 >= 0) goto La0
                r3 = 6
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L9e
                r5 = 7
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto La0
                r3 = 8
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L9e
                r5 = 9
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto La0
                long r0 = r0 + r7
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                if (r3 >= 0) goto L9a
            L94:
                long r0 = r11.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L9a:
                r9 = r0
                r0 = r2
                r2 = r9
                goto La2
            L9e:
                r0 = r2
                goto L57
            La0:
                r0 = r2
                goto L45
            La2:
                r11.currentByteBufferPos = r2
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
                r15 = this;
                long r0 = r15.currentByteBufferPos
                long r2 = r15.currentByteBufferLimit
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto Ldd
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                if (r6 < 0) goto L1b
                long r0 = r15.currentByteBufferPos
                long r0 = r0 + r2
                r15.currentByteBufferPos = r0
                long r0 = (long) r6
                return r0
            L1b:
                long r2 = r15.currentByteBufferLimit
                long r7 = r15.currentByteBufferPos
                long r2 = r2 - r7
                r7 = 10
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 >= 0) goto L28
                goto Ldd
            L28:
                r2 = 2
                long r2 = r2 + r0
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                int r4 = r4 << 7
                r4 = r4 ^ r6
                if (r4 >= 0) goto L39
                r0 = r4 ^ (-128(0xffffffffffffff80, float:NaN))
                long r0 = (long) r0
                goto Le8
            L39:
                r5 = 3
                long r5 = r5 + r0
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                int r2 = r2 << 14
                r2 = r2 ^ r4
                if (r2 < 0) goto L4b
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r2 = r5
                goto Le8
            L4b:
                r3 = 4
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                int r5 = r5 << 21
                r2 = r2 ^ r5
                if (r2 >= 0) goto L5f
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                long r0 = (long) r0
                r2 = r3
                goto Le8
            L5f:
                long r5 = (long) r2
                r9 = 5
                long r9 = r9 + r0
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                long r2 = (long) r2
                r4 = 28
                long r2 = r2 << r4
                long r2 = r2 ^ r5
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L79
                r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            L75:
                long r0 = r0 ^ r2
            L76:
                r2 = r9
                goto Le8
            L79:
                r11 = 6
                long r11 = r11 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r9)
                long r9 = (long) r6
                r6 = 35
                long r9 = r9 << r6
                long r2 = r2 ^ r9
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto L91
                r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L8e:
                long r0 = r0 ^ r2
                r2 = r11
                goto Le8
            L91:
                r9 = 7
                long r9 = r9 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                long r11 = (long) r6
                r6 = 42
                long r11 = r11 << r6
                long r2 = r2 ^ r11
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto La7
                r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L75
            La7:
                r11 = 8
                long r11 = r11 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r9)
                long r9 = (long) r6
                r6 = 49
                long r9 = r9 << r6
                long r2 = r2 ^ r9
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto Lbd
                r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L8e
            Lbd:
                r9 = 9
                long r9 = r9 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                long r11 = (long) r6
                r6 = 56
                long r11 = r11 << r6
                long r2 = r2 ^ r11
                r11 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r2 = r2 ^ r11
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto Le6
                long r0 = r0 + r7
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r9)
                long r6 = (long) r6
                int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r4 >= 0) goto Le2
            Ldd:
                long r0 = r15.readRawVarint64SlowPath()
                return r0
            Le2:
                r13 = r0
                r0 = r2
                r2 = r13
                goto Le8
            Le6:
                r0 = r2
                goto L76
            Le8:
                r15.currentByteBufferPos = r2
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readRawByte()
                r4 = r3 & 127(0x7f, float:1.78E-43)
                long r4 = (long) r4
                long r4 = r4 << r2
                long r0 = r0 | r4
                r3 = r3 & 128(0x80, float:1.8E-43)
                if (r3 != 0) goto L15
                return r0
            L15:
                int r2 = r2 + 7
                goto L3
            L18:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                int r0 = decodeZigZag32(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                long r0 = decodeZigZag64(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
                r10 = this;
                int r0 = r10.readRawVarint32()
                if (r0 <= 0) goto L28
                long r8 = (long) r0
                long r1 = r10.currentByteBufferLimit
                long r3 = r10.currentByteBufferPos
                long r1 = r1 - r3
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r1 > 0) goto L28
                byte[] r0 = new byte[r0]
                r5 = 0
                r1 = r3
                r3 = r0
                r4 = r5
                r6 = r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r1, r3, r4, r6)
                java.lang.String r1 = new java.lang.String
                java.nio.charset.Charset r2 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r0, r2)
                long r2 = r10.currentByteBufferPos
                long r2 = r2 + r8
                r10.currentByteBufferPos = r2
                return r1
            L28:
                if (r0 <= 0) goto L3e
                int r1 = r10.remaining()
                if (r0 > r1) goto L3e
                byte[] r1 = new byte[r0]
                r2 = 0
                r10.readRawBytesTo(r1, r2, r0)
                java.lang.String r0 = new java.lang.String
                java.nio.charset.Charset r2 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r0.<init>(r1, r2)
                return r0
            L3e:
                if (r0 != 0) goto L43
                java.lang.String r0 = ""
                return r0
            L43:
                if (r0 >= 0) goto L4a
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L4a:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
                r7 = this;
                int r0 = r7.readRawVarint32()
                if (r0 <= 0) goto L20
                long r1 = (long) r0
                long r3 = r7.currentByteBufferLimit
                long r5 = r7.currentByteBufferPos
                long r3 = r3 - r5
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L20
                long r3 = r7.currentByteBufferStartPos
                long r5 = r5 - r3
                int r3 = (int) r5
                java.nio.ByteBuffer r4 = r7.currentByteBuffer
                java.lang.String r0 = com.google.crypto.tink.shaded.protobuf.Utf8.decodeUtf8(r4, r3, r0)
                long r3 = r7.currentByteBufferPos
                long r3 = r3 + r1
                r7.currentByteBufferPos = r3
                return r0
            L20:
                if (r0 < 0) goto L33
                int r1 = r7.remaining()
                if (r0 > r1) goto L33
                byte[] r1 = new byte[r0]
                r2 = 0
                r7.readRawBytesTo(r1, r2, r0)
                java.lang.String r0 = com.google.crypto.tink.shaded.protobuf.Utf8.decodeUtf8(r1, r2, r0)
                return r0
            L33:
                if (r0 != 0) goto L38
                java.lang.String r0 = ""
                return r0
            L38:
                if (r0 > 0) goto L3f
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L3f:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.isAtEnd()
                if (r0 == 0) goto La
                r0 = 0
                r1.lastTag = r0
                return r0
            La:
                int r0 = r1.readRawVarint32()
                r1.lastTag = r0
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
                if (r0 == 0) goto L19
                int r0 = r1.lastTag
                return r0
            L19:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                r1.readGroup(r2, r3, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
                r4 = this;
                int r0 = r4.totalBytesRead
                long r0 = (long) r0
                long r2 = r4.currentByteBufferPos
                long r0 = r0 + r2
                long r2 = r4.currentByteBufferStartPos
                long r0 = r0 - r2
                int r0 = (int) r0
                r4.startOffset = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                if (r0 == 0) goto L3d
                if (r0 == r1) goto L37
                r2 = 2
                if (r0 == r2) goto L2f
                r2 = 3
                r3 = 4
                if (r0 == r2) goto L20
                if (r0 == r3) goto L1e
                r5 = 5
                if (r0 != r5) goto L19
                r4.skipRawBytes(r3)
                return r1
            L19:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L1e:
                r5 = 0
                return r5
            L20:
                r4.skipMessage()
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r5, r3)
                r4.checkLastTagWas(r5)
                return r1
            L2f:
                int r5 = r4.readRawVarint32()
                r4.skipRawBytes(r5)
                return r1
            L37:
                r5 = 8
                r4.skipRawBytes(r5)
                return r1
            L3d:
                r4.skipRawVarint()
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                if (r0 == 0) goto L52
                if (r0 == r1) goto L47
                r2 = 2
                if (r0 == r2) goto L3c
                r2 = 3
                r3 = 4
                if (r0 == r2) goto L27
                if (r0 == r3) goto L25
                r2 = 5
                if (r0 != r2) goto L20
                int r0 = r4.readRawLittleEndian32()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed32NoTag(r0)
                return r1
            L20:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L25:
                r5 = 0
                return r5
            L27:
                r6.writeUInt32NoTag(r5)
                r4.skipMessage(r6)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r5, r3)
                r4.checkLastTagWas(r5)
                r6.writeUInt32NoTag(r5)
                return r1
            L3c:
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.readBytes()
                r6.writeUInt32NoTag(r5)
                r6.writeBytesNoTag(r0)
                return r1
            L47:
                long r2 = r4.readRawLittleEndian64()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed64NoTag(r2)
                return r1
            L52:
                long r2 = r4.readInt64()
                r6.writeUInt32NoTag(r5)
                r6.writeUInt64NoTag(r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
                r1 = this;
            L0:
                int r0 = r1.readTag()
                if (r0 == 0) goto Lc
                boolean r0 = r1.skipField(r0)
                if (r0 != 0) goto L0
            Lc:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2) throws java.io.IOException {
                r1 = this;
            L0:
                int r0 = r1.readTag()
                if (r0 == 0) goto Lc
                boolean r0 = r1.skipField(r0, r2)
                if (r0 != 0) goto L0
            Lc:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int r7) throws java.io.IOException {
                r6 = this;
                if (r7 < 0) goto L34
                long r0 = (long) r7
                int r2 = r6.totalBufferSize
                int r3 = r6.totalBytesRead
                int r2 = r2 - r3
                long r2 = (long) r2
                long r4 = r6.currentByteBufferPos
                long r2 = r2 - r4
                long r4 = r6.currentByteBufferStartPos
                long r2 = r2 + r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 > 0) goto L34
            L13:
                if (r7 <= 0) goto L33
                long r0 = r6.currentRemaining()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L22
                r6.getNextByteBuffer()
            L22:
                long r0 = r6.currentRemaining()
                int r0 = (int) r0
                int r0 = java.lang.Math.min(r7, r0)
                int r7 = r7 - r0
                long r1 = r6.currentByteBufferPos
                long r3 = (long) r0
                long r1 = r1 + r3
                r6.currentByteBufferPos = r1
                goto L13
            L33:
                return
            L34:
                if (r7 >= 0) goto L3b
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r7
            L3b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r7
        }
    }

    private static final class StreamDecoder extends com.google.crypto.tink.shaded.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final java.io.InputStream input;
        private int lastTag;
        private int pos;
        private com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback;
        private int totalBytesRetired;

        private interface RefillCallback {
            void onRefill();
        }

        private class SkippedDataSink implements com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.RefillCallback {
            private java.io.ByteArrayOutputStream byteArrayStream;
            private int lastPos;
            final /* synthetic */ com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder this$0;

            private SkippedDataSink(com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    int r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$500(r1)
                    r0.lastPos = r1
                    return
            }

            java.nio.ByteBuffer getSkippedData() {
                    r4 = this;
                    java.io.ByteArrayOutputStream r0 = r4.byteArrayStream
                    if (r0 != 0) goto L1a
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r0 = r4.this$0
                    byte[] r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$600(r0)
                    int r1 = r4.lastPos
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r2 = r4.this$0
                    int r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$500(r2)
                    int r3 = r4.lastPos
                    int r2 = r2 - r3
                    java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r1, r2)
                    return r0
                L1a:
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r1 = r4.this$0
                    byte[] r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$600(r1)
                    int r2 = r4.lastPos
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r3 = r4.this$0
                    int r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$500(r3)
                    r0.write(r1, r2, r3)
                    java.io.ByteArrayOutputStream r0 = r4.byteArrayStream
                    byte[] r0 = r0.toByteArray()
                    java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                    return r0
            }

            @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                    r5 = this;
                    java.io.ByteArrayOutputStream r0 = r5.byteArrayStream
                    if (r0 != 0) goto Lb
                    java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                    r0.<init>()
                    r5.byteArrayStream = r0
                Lb:
                    java.io.ByteArrayOutputStream r0 = r5.byteArrayStream
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r1 = r5.this$0
                    byte[] r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$600(r1)
                    int r2 = r5.lastPos
                    com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r3 = r5.this$0
                    int r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.access$500(r3)
                    int r4 = r5.lastPos
                    int r3 = r3 - r4
                    r0.write(r1, r2, r3)
                    r0 = 0
                    r5.lastPos = r0
                    return
            }
        }

        private StreamDecoder(java.io.InputStream r3, int r4) {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r1 = 2147483647(0x7fffffff, float:NaN)
                r2.currentLimit = r1
                r2.refillCallback = r0
                java.lang.String r0 = "input"
                com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
                r2.input = r3
                byte[] r3 = new byte[r4]
                r2.buffer = r3
                r3 = 0
                r2.bufferSize = r3
                r2.pos = r3
                r2.totalBytesRetired = r3
                return
        }

        /* synthetic */ StreamDecoder(java.io.InputStream r1, int r2, com.google.crypto.tink.shaded.protobuf.CodedInputStream.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ int access$500(com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder r0) {
                int r0 = r0.pos
                return r0
        }

        static /* synthetic */ byte[] access$600(com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder r0) {
                byte[] r0 = r0.buffer
                return r0
        }

        private static int available(java.io.InputStream r0) throws java.io.IOException {
                int r0 = r0.available()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L5
                return r0
            L5:
                r0 = move-exception
                r0.setThrownFromInputStream()
                throw r0
        }

        private static int read(java.io.InputStream r0, byte[] r1, int r2, int r3) throws java.io.IOException {
                int r0 = r0.read(r1, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L5
                return r0
            L5:
                r0 = move-exception
                r0.setThrownFromInputStream()
                throw r0
        }

        private com.google.crypto.tink.shaded.protobuf.ByteString readBytesSlowPath(int r6) throws java.io.IOException {
                r5 = this;
                byte[] r0 = r5.readRawBytesSlowPathOneChunk(r6)
                if (r0 == 0) goto Lb
                com.google.crypto.tink.shaded.protobuf.ByteString r6 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
                return r6
            Lb:
                int r0 = r5.pos
                int r1 = r5.bufferSize
                int r2 = r1 - r0
                int r3 = r5.totalBytesRetired
                int r3 = r3 + r1
                r5.totalBytesRetired = r3
                r1 = 0
                r5.pos = r1
                r5.bufferSize = r1
                int r3 = r6 - r2
                java.util.List r3 = r5.readRawBytesSlowPathRemainingChunks(r3)
                byte[] r6 = new byte[r6]
                byte[] r4 = r5.buffer
                java.lang.System.arraycopy(r4, r0, r6, r1, r2)
                java.util.Iterator r0 = r3.iterator()
            L2c:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L3f
                java.lang.Object r3 = r0.next()
                byte[] r3 = (byte[]) r3
                int r4 = r3.length
                java.lang.System.arraycopy(r3, r1, r6, r2, r4)
                int r3 = r3.length
                int r2 = r2 + r3
                goto L2c
            L3f:
                com.google.crypto.tink.shaded.protobuf.ByteString r6 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r6)
                return r6
        }

        private byte[] readRawBytesSlowPath(int r5, boolean r6) throws java.io.IOException {
                r4 = this;
                byte[] r0 = r4.readRawBytesSlowPathOneChunk(r5)
                if (r0 == 0) goto L10
                if (r6 == 0) goto Lf
                java.lang.Object r5 = r0.clone()
                r0 = r5
                byte[] r0 = (byte[]) r0
            Lf:
                return r0
            L10:
                int r6 = r4.pos
                int r0 = r4.bufferSize
                int r1 = r0 - r6
                int r2 = r4.totalBytesRetired
                int r2 = r2 + r0
                r4.totalBytesRetired = r2
                r0 = 0
                r4.pos = r0
                r4.bufferSize = r0
                int r2 = r5 - r1
                java.util.List r2 = r4.readRawBytesSlowPathRemainingChunks(r2)
                byte[] r5 = new byte[r5]
                byte[] r3 = r4.buffer
                java.lang.System.arraycopy(r3, r6, r5, r0, r1)
                java.util.Iterator r6 = r2.iterator()
            L31:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L44
                java.lang.Object r2 = r6.next()
                byte[] r2 = (byte[]) r2
                int r3 = r2.length
                java.lang.System.arraycopy(r2, r0, r5, r1, r3)
                int r2 = r2.length
                int r1 = r1 + r2
                goto L31
            L44:
                return r5
        }

        private byte[] readRawBytesSlowPathOneChunk(int r6) throws java.io.IOException {
                r5 = this;
                if (r6 != 0) goto L5
                byte[] r6 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
                return r6
            L5:
                if (r6 < 0) goto L6f
                int r0 = r5.totalBytesRetired
                int r1 = r5.pos
                int r0 = r0 + r1
                int r0 = r0 + r6
                int r1 = r5.sizeLimit
                int r1 = r0 - r1
                if (r1 > 0) goto L6a
                int r1 = r5.currentLimit
                if (r0 > r1) goto L5c
                int r0 = r5.bufferSize
                int r1 = r5.pos
                int r0 = r0 - r1
                int r1 = r6 - r0
                r2 = 4096(0x1000, float:5.74E-42)
                if (r1 < r2) goto L2d
                java.io.InputStream r2 = r5.input
                int r2 = available(r2)
                if (r1 > r2) goto L2b
                goto L2d
            L2b:
                r6 = 0
                return r6
            L2d:
                byte[] r1 = new byte[r6]
                byte[] r2 = r5.buffer
                int r3 = r5.pos
                r4 = 0
                java.lang.System.arraycopy(r2, r3, r1, r4, r0)
                int r2 = r5.totalBytesRetired
                int r3 = r5.bufferSize
                int r2 = r2 + r3
                r5.totalBytesRetired = r2
                r5.pos = r4
                r5.bufferSize = r4
            L42:
                if (r0 >= r6) goto L5b
                java.io.InputStream r2 = r5.input
                int r3 = r6 - r0
                int r2 = read(r2, r1, r0, r3)
                r3 = -1
                if (r2 == r3) goto L56
                int r3 = r5.totalBytesRetired
                int r3 = r3 + r2
                r5.totalBytesRetired = r3
                int r0 = r0 + r2
                goto L42
            L56:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r6 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r6
            L5b:
                return r1
            L5c:
                int r6 = r5.totalBytesRetired
                int r1 = r1 - r6
                int r6 = r5.pos
                int r1 = r1 - r6
                r5.skipRawBytes(r1)
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r6 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r6
            L6a:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r6 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.sizeLimitExceeded()
                throw r6
            L6f:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r6 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r6
        }

        private java.util.List<byte[]> readRawBytesSlowPathRemainingChunks(int r7) throws java.io.IOException {
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L5:
                if (r7 <= 0) goto L2e
                r1 = 4096(0x1000, float:5.74E-42)
                int r1 = java.lang.Math.min(r7, r1)
                byte[] r2 = new byte[r1]
                r3 = 0
            L10:
                if (r3 >= r1) goto L29
                java.io.InputStream r4 = r6.input
                int r5 = r1 - r3
                int r4 = r4.read(r2, r3, r5)
                r5 = -1
                if (r4 == r5) goto L24
                int r5 = r6.totalBytesRetired
                int r5 = r5 + r4
                r6.totalBytesRetired = r5
                int r3 = r3 + r4
                goto L10
            L24:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r7
            L29:
                int r7 = r7 - r1
                r0.add(r2)
                goto L5
            L2e:
                return r0
        }

        private void recomputeBufferSizeAfterLimit() {
                r3 = this;
                int r0 = r3.bufferSize
                int r1 = r3.bufferSizeAfterLimit
                int r0 = r0 + r1
                r3.bufferSize = r0
                int r1 = r3.totalBytesRetired
                int r1 = r1 + r0
                int r2 = r3.currentLimit
                if (r1 <= r2) goto L15
                int r1 = r1 - r2
                r3.bufferSizeAfterLimit = r1
                int r0 = r0 - r1
                r3.bufferSize = r0
                goto L18
            L15:
                r0 = 0
                r3.bufferSizeAfterLimit = r0
            L18:
                return
        }

        private void refillBuffer(int r3) throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.tryRefillBuffer(r3)
                if (r0 != 0) goto L1a
                int r0 = r2.sizeLimit
                int r1 = r2.totalBytesRetired
                int r0 = r0 - r1
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 <= r0) goto L15
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.sizeLimitExceeded()
                throw r3
            L15:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
            L1a:
                return
        }

        private static long skip(java.io.InputStream r0, long r1) throws java.io.IOException {
                long r0 = r0.skip(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L5
                return r0
            L5:
                r0 = move-exception
                r0.setThrownFromInputStream()
                throw r0
        }

        private void skipRawBytesSlowPath(int r9) throws java.io.IOException {
                r8 = this;
                if (r9 < 0) goto L9b
                int r0 = r8.totalBytesRetired
                int r1 = r8.pos
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.currentLimit
                if (r2 > r3) goto L91
                com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder$RefillCallback r2 = r8.refillCallback
                r3 = 0
                if (r2 != 0) goto L73
                int r0 = r0 + r1
                r8.totalBytesRetired = r0
                int r0 = r8.bufferSize
                int r0 = r0 - r1
                r8.bufferSize = r3
                r8.pos = r3
                r3 = r0
            L1d:
                if (r3 >= r9) goto L6b
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.input     // Catch: java.lang.Throwable -> L61
                long r4 = (long) r0     // Catch: java.lang.Throwable -> L61
                long r0 = skip(r1, r4)     // Catch: java.lang.Throwable -> L61
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L38
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 > 0) goto L38
                if (r2 != 0) goto L35
                goto L6b
            L35:
                int r0 = (int) r0     // Catch: java.lang.Throwable -> L61
                int r3 = r3 + r0
                goto L1d
            L38:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L61
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
                r2.<init>()     // Catch: java.lang.Throwable -> L61
                java.io.InputStream r4 = r8.input     // Catch: java.lang.Throwable -> L61
                java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L61
                java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L61
                java.lang.String r4 = "#skip returned invalid result: "
                java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L61
                java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L61
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L61
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L61
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L61
                throw r9     // Catch: java.lang.Throwable -> L61
            L61:
                r9 = move-exception
                int r0 = r8.totalBytesRetired
                int r0 = r0 + r3
                r8.totalBytesRetired = r0
                r8.recomputeBufferSizeAfterLimit()
                throw r9
            L6b:
                int r0 = r8.totalBytesRetired
                int r0 = r0 + r3
                r8.totalBytesRetired = r0
                r8.recomputeBufferSizeAfterLimit()
            L73:
                if (r3 >= r9) goto L90
                int r0 = r8.bufferSize
                int r1 = r8.pos
                int r1 = r0 - r1
                r8.pos = r0
                r0 = 1
                r8.refillBuffer(r0)
            L81:
                int r2 = r9 - r1
                int r3 = r8.bufferSize
                if (r2 <= r3) goto L8e
                int r1 = r1 + r3
                r8.pos = r3
                r8.refillBuffer(r0)
                goto L81
            L8e:
                r8.pos = r2
            L90:
                return
            L91:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.skipRawBytes(r3)
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r9 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r9
            L9b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r9 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r9
        }

        private void skipRawVarint() throws java.io.IOException {
                r2 = this;
                int r0 = r2.bufferSize
                int r1 = r2.pos
                int r0 = r0 - r1
                r1 = 10
                if (r0 < r1) goto Ld
                r2.skipRawVarintFastPath()
                goto L10
            Ld:
                r2.skipRawVarintSlowPath()
            L10:
                return
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
                r4 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto L15
                byte[] r1 = r4.buffer
                int r2 = r4.pos
                int r3 = r2 + 1
                r4.pos = r3
                r1 = r1[r2]
                if (r1 < 0) goto L12
                return
            L12:
                int r0 = r0 + 1
                goto L1
            L15:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readRawByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private boolean tryRefillBuffer(int r8) throws java.io.IOException {
                r7 = this;
                int r0 = r7.pos
                int r0 = r0 + r8
                int r1 = r7.bufferSize
                if (r0 <= r1) goto L9c
                int r0 = r7.sizeLimit
                int r1 = r7.totalBytesRetired
                int r0 = r0 - r1
                int r2 = r7.pos
                int r0 = r0 - r2
                r3 = 0
                if (r8 <= r0) goto L13
                return r3
            L13:
                int r1 = r1 + r2
                int r1 = r1 + r8
                int r0 = r7.currentLimit
                if (r1 <= r0) goto L1a
                return r3
            L1a:
                com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder$RefillCallback r0 = r7.refillCallback
                if (r0 == 0) goto L21
                r0.onRefill()
            L21:
                int r0 = r7.pos
                if (r0 <= 0) goto L3b
                int r1 = r7.bufferSize
                if (r1 <= r0) goto L2f
                byte[] r2 = r7.buffer
                int r1 = r1 - r0
                java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            L2f:
                int r1 = r7.totalBytesRetired
                int r1 = r1 + r0
                r7.totalBytesRetired = r1
                int r1 = r7.bufferSize
                int r1 = r1 - r0
                r7.bufferSize = r1
                r7.pos = r3
            L3b:
                java.io.InputStream r0 = r7.input
                byte[] r1 = r7.buffer
                int r2 = r7.bufferSize
                int r4 = r1.length
                int r4 = r4 - r2
                int r5 = r7.sizeLimit
                int r6 = r7.totalBytesRetired
                int r5 = r5 - r6
                int r6 = r7.bufferSize
                int r5 = r5 - r6
                int r4 = java.lang.Math.min(r4, r5)
                int r0 = read(r0, r1, r2, r4)
                if (r0 == 0) goto L73
                r1 = -1
                if (r0 < r1) goto L73
                byte[] r1 = r7.buffer
                int r1 = r1.length
                if (r0 > r1) goto L73
                if (r0 <= 0) goto L72
                int r1 = r7.bufferSize
                int r1 = r1 + r0
                r7.bufferSize = r1
                r7.recomputeBufferSizeAfterLimit()
                int r0 = r7.bufferSize
                if (r0 < r8) goto L6d
                r8 = 1
                goto L71
            L6d:
                boolean r8 = r7.tryRefillBuffer(r8)
            L71:
                return r8
            L72:
                return r3
            L73:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.io.InputStream r2 = r7.input
                java.lang.Class r2 = r2.getClass()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "#read(byte[]) returned invalid result: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L9c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "refillBuffer() called when "
                r1.<init>(r2)
                java.lang.StringBuilder r8 = r1.append(r8)
                java.lang.String r1 = " bytes were already available in buffer"
                java.lang.StringBuilder r8 = r8.append(r1)
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                int r0 = r1.lastTag
                if (r0 != r2) goto L5
                return
            L5:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean r1) {
                r0 = this;
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
                r3 = this;
                int r0 = r3.currentLimit
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L9
                r0 = -1
                return r0
            L9:
                int r1 = r3.totalBytesRetired
                int r2 = r3.pos
                int r1 = r1 + r2
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
                r1 = this;
                int r0 = r1.lastTag
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
                r2 = this;
                int r0 = r2.totalBytesRetired
                int r1 = r2.pos
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.bufferSize
                if (r0 != r1) goto Le
                r0 = 1
                boolean r1 = r2.tryRefillBuffer(r0)
                if (r1 != 0) goto Le
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int r1) {
                r0 = this;
                r0.currentLimit = r1
                r0.recomputeBufferSizeAfterLimit()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r2 = this;
                if (r3 < 0) goto L17
                int r0 = r2.totalBytesRetired
                int r1 = r2.pos
                int r0 = r0 + r1
                int r3 = r3 + r0
                int r0 = r2.currentLimit
                if (r3 > r0) goto L12
                r2.currentLimit = r3
                r2.recomputeBufferSizeAfterLimit()
                return r0
            L12:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
            L17:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
                r4 = this;
                long r0 = r4.readRawVarint64()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
                r4 = this;
                int r0 = r4.readRawVarint32()
                int r1 = r4.bufferSize
                int r2 = r4.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L1b
                if (r0 <= 0) goto L1b
                byte[] r1 = r4.buffer
                int r3 = r2 + r0
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
                int r2 = r4.pos
                int r2 = r2 + r0
                r4.pos = r2
                return r1
            L1b:
                r1 = 0
                byte[] r0 = r4.readRawBytesSlowPath(r0, r1)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
                r4 = this;
                int r0 = r4.readRawVarint32()
                int r1 = r4.bufferSize
                int r2 = r4.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L1f
                if (r0 <= 0) goto L1f
                byte[] r1 = r4.buffer
                int r3 = r2 + r0
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
                int r2 = r4.pos
                int r2 = r2 + r0
                r4.pos = r2
                return r1
            L1f:
                if (r0 != 0) goto L24
                java.nio.ByteBuffer r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER
                return r0
            L24:
                r1 = 1
                byte[] r0 = r4.readRawBytesSlowPath(r0, r1)
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                int r1 = r3.bufferSize
                int r2 = r3.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L19
                if (r0 <= 0) goto L19
                byte[] r1 = r3.buffer
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1, r2, r0)
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.pos = r2
                return r1
            L19:
                if (r0 != 0) goto L1e
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                return r0
            L1e:
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.readBytesSlowPath(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readGroup(int r2, com.google.crypto.tink.shaded.protobuf.Parser<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                java.lang.Object r3 = r3.parsePartialFrom(r1, r4)
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
                r4 = 4
                int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r4)
                r1.checkLastTagWas(r2)
                int r2 = r1.recursionDepth
                int r2 = r2 + (-1)
                r1.recursionDepth = r2
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                r3.mergeFrom(r1, r4)
                r3 = 4
                int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r3)
                r1.checkLastTagWas(r2)
                int r2 = r1.recursionDepth
                int r2 = r2 + (-1)
                r1.recursionDepth = r2
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readMessage(com.google.crypto.tink.shaded.protobuf.Parser<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.readRawVarint32()
                r2.checkRecursionLimit()
                int r0 = r2.pushLimit(r0)
                int r1 = r2.recursionDepth
                int r1 = r1 + 1
                r2.recursionDepth = r1
                java.lang.Object r3 = r3.parsePartialFrom(r2, r4)
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
                r4 = 0
                r2.checkLastTagWas(r4)
                int r4 = r2.recursionDepth
                int r4 = r4 + (-1)
                r2.recursionDepth = r4
                int r4 = r2.getBytesUntilLimit()
                if (r4 != 0) goto L2b
                r2.popLimit(r0)
                return r3
            L2b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.readRawVarint32()
                r2.checkRecursionLimit()
                int r0 = r2.pushLimit(r0)
                int r1 = r2.recursionDepth
                int r1 = r1 + 1
                r2.recursionDepth = r1
                r3.mergeFrom(r2, r4)
                r3 = 0
                r2.checkLastTagWas(r3)
                int r3 = r2.recursionDepth
                int r3 = r3 + (-1)
                r2.recursionDepth = r3
                int r3 = r2.getBytesUntilLimit()
                if (r3 != 0) goto L28
                r2.popLimit(r0)
                return
            L28:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
                r3 = this;
                int r0 = r3.pos
                int r1 = r3.bufferSize
                if (r0 != r1) goto La
                r0 = 1
                r3.refillBuffer(r0)
            La:
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + 1
                r3.pos = r2
                r0 = r0[r1]
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.bufferSize
                int r1 = r1 - r0
                if (r3 > r1) goto L13
                if (r3 <= 0) goto L13
                int r3 = r3 + r0
                r2.pos = r3
                byte[] r1 = r2.buffer
                byte[] r3 = java.util.Arrays.copyOfRange(r1, r0, r3)
                return r3
            L13:
                r0 = 0
                byte[] r3 = r2.readRawBytesSlowPath(r3, r0)
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
                r4 = this;
                int r0 = r4.pos
                int r1 = r4.bufferSize
                int r1 = r1 - r0
                r2 = 4
                if (r1 >= r2) goto Ld
                r4.refillBuffer(r2)
                int r0 = r4.pos
            Ld:
                byte[] r1 = r4.buffer
                int r2 = r0 + 4
                r4.pos = r2
                r2 = r1[r0]
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r3 = r0 + 1
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                int r3 = r0 + 2
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                int r0 = r0 + 3
                r0 = r1[r0]
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r0 = r0 << 24
                r0 = r0 | r2
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
                r9 = this;
                int r0 = r9.pos
                int r1 = r9.bufferSize
                int r1 = r1 - r0
                r2 = 8
                if (r1 >= r2) goto Le
                r9.refillBuffer(r2)
                int r0 = r9.pos
            Le:
                byte[] r1 = r9.buffer
                int r3 = r0 + 8
                r9.pos = r3
                r3 = r1[r0]
                long r3 = (long) r3
                r5 = 255(0xff, double:1.26E-321)
                long r3 = r3 & r5
                int r7 = r0 + 1
                r7 = r1[r7]
                long r7 = (long) r7
                long r7 = r7 & r5
                long r7 = r7 << r2
                long r2 = r3 | r7
                int r4 = r0 + 2
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 16
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 3
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 24
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 4
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 32
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 5
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 40
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 6
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 48
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r0 = r0 + 7
                r0 = r1[r0]
                long r0 = (long) r0
                long r0 = r0 & r5
                r4 = 56
                long r0 = r0 << r4
                long r0 = r0 | r2
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawVarint32() throws java.io.IOException {
                r7 = this;
                int r0 = r7.pos
                int r1 = r7.bufferSize
                if (r1 != r0) goto L7
                goto L6b
            L7:
                byte[] r2 = r7.buffer
                int r3 = r0 + 1
                r4 = r2[r0]
                if (r4 < 0) goto L12
                r7.pos = r3
                return r4
            L12:
                int r1 = r1 - r3
                r5 = 9
                if (r1 >= r5) goto L18
                goto L6b
            L18:
                int r1 = r0 + 2
                r3 = r2[r3]
                int r3 = r3 << 7
                r3 = r3 ^ r4
                if (r3 >= 0) goto L24
                r0 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L79
            L24:
                int r4 = r0 + 3
                r1 = r2[r1]
                int r1 = r1 << 14
                r1 = r1 ^ r3
                if (r1 < 0) goto L31
                r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r4
                goto L79
            L31:
                int r3 = r0 + 4
                r4 = r2[r4]
                int r4 = r4 << 21
                r1 = r1 ^ r4
                if (r1 >= 0) goto L40
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
            L3e:
                r1 = r3
                goto L79
            L40:
                int r4 = r0 + 5
                r3 = r2[r3]
                int r5 = r3 << 28
                r1 = r1 ^ r5
                r5 = 266354560(0xfe03f80, float:2.2112565E-29)
                r1 = r1 ^ r5
                if (r3 >= 0) goto L77
                int r3 = r0 + 6
                r4 = r2[r4]
                if (r4 >= 0) goto L75
                int r4 = r0 + 7
                r3 = r2[r3]
                if (r3 >= 0) goto L77
                int r3 = r0 + 8
                r4 = r2[r4]
                if (r4 >= 0) goto L75
                int r4 = r0 + 9
                r3 = r2[r3]
                if (r3 >= 0) goto L77
                int r0 = r0 + 10
                r2 = r2[r4]
                if (r2 >= 0) goto L71
            L6b:
                long r0 = r7.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L71:
                r6 = r1
                r1 = r0
                r0 = r6
                goto L79
            L75:
                r0 = r1
                goto L3e
            L77:
                r0 = r1
                goto L2f
            L79:
                r7.pos = r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
                r12 = this;
                int r0 = r12.pos
                int r1 = r12.bufferSize
                if (r1 != r0) goto L8
                goto Lba
            L8:
                byte[] r2 = r12.buffer
                int r3 = r0 + 1
                r4 = r2[r0]
                if (r4 < 0) goto L14
                r12.pos = r3
                long r0 = (long) r4
                return r0
            L14:
                int r1 = r1 - r3
                r5 = 9
                if (r1 >= r5) goto L1b
                goto Lba
            L1b:
                int r1 = r0 + 2
                r3 = r2[r3]
                int r3 = r3 << 7
                r3 = r3 ^ r4
                if (r3 >= 0) goto L29
                r0 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                long r2 = (long) r0
                goto Lc1
            L29:
                int r4 = r0 + 3
                r1 = r2[r1]
                int r1 = r1 << 14
                r1 = r1 ^ r3
                if (r1 < 0) goto L38
                r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
                long r2 = (long) r0
                r1 = r4
                goto Lc1
            L38:
                int r3 = r0 + 4
                r4 = r2[r4]
                int r4 = r4 << 21
                r1 = r1 ^ r4
                if (r1 >= 0) goto L4b
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                long r0 = (long) r0
                r10 = r0
                r1 = r3
                r2 = r10
                goto Lc1
            L4b:
                long r4 = (long) r1
                int r1 = r0 + 5
                r3 = r2[r3]
                long r6 = (long) r3
                r3 = 28
                long r6 = r6 << r3
                long r3 = r4 ^ r6
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L62
                r5 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5f:
                long r2 = r3 ^ r5
                goto Lc1
            L62:
                int r7 = r0 + 6
                r1 = r2[r1]
                long r8 = (long) r1
                r1 = 35
                long r8 = r8 << r1
                long r3 = r3 ^ r8
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L78
                r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L74:
                long r2 = r3 ^ r0
                r1 = r7
                goto Lc1
            L78:
                int r1 = r0 + 7
                r7 = r2[r7]
                long r7 = (long) r7
                r9 = 42
                long r7 = r7 << r9
                long r3 = r3 ^ r7
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L8b
                r5 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5f
            L8b:
                int r7 = r0 + 8
                r1 = r2[r1]
                long r8 = (long) r1
                r1 = 49
                long r8 = r8 << r1
                long r3 = r3 ^ r8
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L9e
                r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L74
            L9e:
                int r1 = r0 + 9
                r7 = r2[r7]
                long r7 = (long) r7
                r9 = 56
                long r7 = r7 << r9
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 >= 0) goto Lc0
                int r0 = r0 + 10
                r1 = r2[r1]
                long r1 = (long) r1
                int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbf
            Lba:
                long r0 = r12.readRawVarint64SlowPath()
                return r0
            Lbf:
                r1 = r0
            Lc0:
                r2 = r3
            Lc1:
                r12.pos = r1
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readRawByte()
                r4 = r3 & 127(0x7f, float:1.78E-43)
                long r4 = (long) r4
                long r4 = r4 << r2
                long r0 = r0 | r4
                r3 = r3 & 128(0x80, float:1.8E-43)
                if (r3 != 0) goto L15
                return r0
            L15:
                int r2 = r2 + 7
                goto L3
            L18:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                int r0 = decodeZigZag32(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                long r0 = decodeZigZag64(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
                r5 = this;
                int r0 = r5.readRawVarint32()
                if (r0 <= 0) goto L1e
                int r1 = r5.bufferSize
                int r2 = r5.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L1e
                java.lang.String r1 = new java.lang.String
                byte[] r2 = r5.buffer
                int r3 = r5.pos
                java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r2, r3, r0, r4)
                int r2 = r5.pos
                int r2 = r2 + r0
                r5.pos = r2
                return r1
            L1e:
                if (r0 != 0) goto L23
                java.lang.String r0 = ""
                return r0
            L23:
                int r1 = r5.bufferSize
                if (r0 > r1) goto L3b
                r5.refillBuffer(r0)
                java.lang.String r1 = new java.lang.String
                byte[] r2 = r5.buffer
                int r3 = r5.pos
                java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r2, r3, r0, r4)
                int r2 = r5.pos
                int r2 = r2 + r0
                r5.pos = r2
                return r1
            L3b:
                java.lang.String r1 = new java.lang.String
                r2 = 0
                byte[] r0 = r5.readRawBytesSlowPath(r0, r2)
                java.nio.charset.Charset r2 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r1.<init>(r0, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
                r4 = this;
                int r0 = r4.readRawVarint32()
                int r1 = r4.pos
                int r2 = r4.bufferSize
                int r3 = r2 - r1
                if (r0 > r3) goto L15
                if (r0 <= 0) goto L15
                byte[] r2 = r4.buffer
                int r3 = r1 + r0
                r4.pos = r3
                goto L29
            L15:
                if (r0 != 0) goto L1a
                java.lang.String r0 = ""
                return r0
            L1a:
                r1 = 0
                if (r0 > r2) goto L25
                r4.refillBuffer(r0)
                byte[] r2 = r4.buffer
                r4.pos = r0
                goto L29
            L25:
                byte[] r2 = r4.readRawBytesSlowPath(r0, r1)
            L29:
                java.lang.String r0 = com.google.crypto.tink.shaded.protobuf.Utf8.decodeUtf8(r2, r1, r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.isAtEnd()
                if (r0 == 0) goto La
                r0 = 0
                r1.lastTag = r0
                return r0
            La:
                int r0 = r1.readRawVarint32()
                r1.lastTag = r0
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
                if (r0 == 0) goto L19
                int r0 = r1.lastTag
                return r0
            L19:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                r1.readGroup(r2, r3, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
                r1 = this;
                int r0 = r1.pos
                int r0 = -r0
                r1.totalBytesRetired = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                if (r0 == 0) goto L3d
                if (r0 == r1) goto L37
                r2 = 2
                if (r0 == r2) goto L2f
                r2 = 3
                r3 = 4
                if (r0 == r2) goto L20
                if (r0 == r3) goto L1e
                r5 = 5
                if (r0 != r5) goto L19
                r4.skipRawBytes(r3)
                return r1
            L19:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L1e:
                r5 = 0
                return r5
            L20:
                r4.skipMessage()
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r5, r3)
                r4.checkLastTagWas(r5)
                return r1
            L2f:
                int r5 = r4.readRawVarint32()
                r4.skipRawBytes(r5)
                return r1
            L37:
                r5 = 8
                r4.skipRawBytes(r5)
                return r1
            L3d:
                r4.skipRawVarint()
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                if (r0 == 0) goto L52
                if (r0 == r1) goto L47
                r2 = 2
                if (r0 == r2) goto L3c
                r2 = 3
                r3 = 4
                if (r0 == r2) goto L27
                if (r0 == r3) goto L25
                r2 = 5
                if (r0 != r2) goto L20
                int r0 = r4.readRawLittleEndian32()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed32NoTag(r0)
                return r1
            L20:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L25:
                r5 = 0
                return r5
            L27:
                r6.writeUInt32NoTag(r5)
                r4.skipMessage(r6)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r5, r3)
                r4.checkLastTagWas(r5)
                r6.writeUInt32NoTag(r5)
                return r1
            L3c:
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.readBytes()
                r6.writeUInt32NoTag(r5)
                r6.writeBytesNoTag(r0)
                return r1
            L47:
                long r2 = r4.readRawLittleEndian64()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed64NoTag(r2)
                return r1
            L52:
                long r2 = r4.readInt64()
                r6.writeUInt32NoTag(r5)
                r6.writeUInt64NoTag(r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
                r1 = this;
            L0:
                int r0 = r1.readTag()
                if (r0 == 0) goto Lc
                boolean r0 = r1.skipField(r0)
                if (r0 != 0) goto L0
            Lc:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2) throws java.io.IOException {
                r1 = this;
            L0:
                int r0 = r1.readTag()
                if (r0 == 0) goto Lc
                boolean r0 = r1.skipField(r0, r2)
                if (r0 != 0) goto L0
            Lc:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.bufferSize
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 > r0) goto Ld
                if (r3 < 0) goto Ld
                int r1 = r1 + r3
                r2.pos = r1
                goto L10
            Ld:
                r2.skipRawBytesSlowPath(r3)
            L10:
                return
        }
    }

    private static final class UnsafeDirectNioDecoder extends com.google.crypto.tink.shaded.protobuf.CodedInputStream {
        private final long address;
        private final java.nio.ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        private UnsafeDirectNioDecoder(java.nio.ByteBuffer r5, boolean r6) {
                r4 = this;
                r0 = 0
                r4.<init>(r0)
                r0 = 2147483647(0x7fffffff, float:NaN)
                r4.currentLimit = r0
                r4.buffer = r5
                long r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r5)
                r4.address = r0
                int r2 = r5.limit()
                long r2 = (long) r2
                long r2 = r2 + r0
                r4.limit = r2
                int r5 = r5.position()
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.pos = r0
                r4.startPos = r0
                r4.immutable = r6
                return
        }

        /* synthetic */ UnsafeDirectNioDecoder(java.nio.ByteBuffer r1, boolean r2, com.google.crypto.tink.shaded.protobuf.CodedInputStream.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private int bufferPos(long r3) {
                r2 = this;
                long r0 = r2.address
                long r3 = r3 - r0
                int r3 = (int) r3
                return r3
        }

        static boolean isSupported() {
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations()
                return r0
        }

        private void recomputeBufferSizeAfterLimit() {
                r4 = this;
                long r0 = r4.limit
                int r2 = r4.bufferSizeAfterLimit
                long r2 = (long) r2
                long r0 = r0 + r2
                r4.limit = r0
                long r2 = r4.startPos
                long r2 = r0 - r2
                int r2 = (int) r2
                int r3 = r4.currentLimit
                if (r2 <= r3) goto L19
                int r2 = r2 - r3
                r4.bufferSizeAfterLimit = r2
                long r2 = (long) r2
                long r0 = r0 - r2
                r4.limit = r0
                goto L1c
            L19:
                r0 = 0
                r4.bufferSizeAfterLimit = r0
            L1c:
                return
        }

        private int remaining() {
                r4 = this;
                long r0 = r4.limit
                long r2 = r4.pos
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        private void skipRawVarint() throws java.io.IOException {
                r2 = this;
                int r0 = r2.remaining()
                r1 = 10
                if (r0 < r1) goto Lc
                r2.skipRawVarintFastPath()
                goto Lf
            Lc:
                r2.skipRawVarintSlowPath()
            Lf:
                return
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
                r5 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto L16
                long r1 = r5.pos
                r3 = 1
                long r3 = r3 + r1
                r5.pos = r3
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r1)
                if (r1 < 0) goto L13
                return
            L13:
                int r0 = r0 + 1
                goto L1
            L16:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readRawByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private java.nio.ByteBuffer slice(long r4, long r6) throws java.io.IOException {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.buffer
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.buffer
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.buffer
                int r4 = r3.bufferPos(r4)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                r2.position(r4)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                int r4 = r3.bufferPos(r6)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                r2.limit(r4)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                java.nio.ByteBuffer r4 = r3.buffer     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                java.nio.ByteBuffer r4 = r4.slice()     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L2b
                r2.position(r0)
                r2.limit(r1)
                return r4
            L29:
                r4 = move-exception
                goto L34
            L2b:
                r4 = move-exception
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()     // Catch: java.lang.Throwable -> L29
                r5.initCause(r4)     // Catch: java.lang.Throwable -> L29
                throw r5     // Catch: java.lang.Throwable -> L29
            L34:
                r2.position(r0)
                r2.limit(r1)
                throw r4
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                int r0 = r1.lastTag
                if (r0 != r2) goto L5
                return
            L5:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean r1) {
                r0 = this;
                r0.enableAliasing = r1
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
                r2 = this;
                int r0 = r2.currentLimit
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L9
                r0 = -1
                return r0
            L9:
                int r1 = r2.getTotalBytesRead()
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
                r1 = this;
                int r0 = r1.lastTag
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
                r4 = this;
                long r0 = r4.pos
                long r2 = r4.startPos
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
                r4 = this;
                long r0 = r4.pos
                long r2 = r4.limit
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int r1) {
                r0 = this;
                r0.currentLimit = r1
                r0.recomputeBufferSizeAfterLimit()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                if (r2 < 0) goto L16
                int r0 = r1.getTotalBytesRead()
                int r2 = r2 + r0
                int r0 = r1.currentLimit
                if (r2 > r0) goto L11
                r1.currentLimit = r2
                r1.recomputeBufferSizeAfterLimit()
                return r0
            L11:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r2
            L16:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
                r4 = this;
                long r0 = r4.readRawVarint64()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                byte[] r0 = r1.readRawBytes(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
                r12 = this;
                int r0 = r12.readRawVarint32()
                if (r0 <= 0) goto L39
                int r1 = r12.remaining()
                if (r0 > r1) goto L39
                boolean r1 = r12.immutable
                if (r1 != 0) goto L23
                boolean r1 = r12.enableAliasing
                if (r1 == 0) goto L23
                long r1 = r12.pos
                long r3 = (long) r0
                long r5 = r1 + r3
                java.nio.ByteBuffer r0 = r12.slice(r1, r5)
                long r1 = r12.pos
                long r1 = r1 + r3
                r12.pos = r1
                return r0
            L23:
                byte[] r1 = new byte[r0]
                long r3 = r12.pos
                long r10 = (long) r0
                r6 = 0
                r5 = r1
                r8 = r10
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r3, r5, r6, r8)
                long r2 = r12.pos
                long r2 = r2 + r10
                r12.pos = r2
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)
                return r0
            L39:
                if (r0 != 0) goto L3e
                java.nio.ByteBuffer r0 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER
                return r0
            L3e:
                if (r0 >= 0) goto L45
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L45:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
                r11 = this;
                int r0 = r11.readRawVarint32()
                if (r0 <= 0) goto L3d
                int r1 = r11.remaining()
                if (r0 > r1) goto L3d
                boolean r1 = r11.immutable
                if (r1 == 0) goto L27
                boolean r1 = r11.enableAliasing
                if (r1 == 0) goto L27
                long r1 = r11.pos
                long r3 = (long) r0
                long r5 = r1 + r3
                java.nio.ByteBuffer r0 = r11.slice(r1, r5)
                long r1 = r11.pos
                long r1 = r1 + r3
                r11.pos = r1
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r0)
                return r0
            L27:
                byte[] r8 = new byte[r0]
                long r1 = r11.pos
                long r9 = (long) r0
                r4 = 0
                r3 = r8
                r6 = r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r1, r3, r4, r6)
                long r0 = r11.pos
                long r0 = r0 + r9
                r11.pos = r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(r8)
                return r0
            L3d:
                if (r0 != 0) goto L42
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                return r0
            L42:
                if (r0 >= 0) goto L49
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L49:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readGroup(int r2, com.google.crypto.tink.shaded.protobuf.Parser<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                java.lang.Object r3 = r3.parsePartialFrom(r1, r4)
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
                r4 = 4
                int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r4)
                r1.checkLastTagWas(r2)
                int r2 = r1.recursionDepth
                int r2 = r2 + (-1)
                r1.recursionDepth = r2
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                r1.checkRecursionLimit()
                int r0 = r1.recursionDepth
                int r0 = r0 + 1
                r1.recursionDepth = r0
                r3.mergeFrom(r1, r4)
                r3 = 4
                int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r3)
                r1.checkLastTagWas(r2)
                int r2 = r1.recursionDepth
                int r2 = r2 + (-1)
                r1.recursionDepth = r2
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readMessage(com.google.crypto.tink.shaded.protobuf.Parser<T> r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.readRawVarint32()
                r2.checkRecursionLimit()
                int r0 = r2.pushLimit(r0)
                int r1 = r2.recursionDepth
                int r1 = r1 + 1
                r2.recursionDepth = r1
                java.lang.Object r3 = r3.parsePartialFrom(r2, r4)
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
                r4 = 0
                r2.checkLastTagWas(r4)
                int r4 = r2.recursionDepth
                int r4 = r4 + (-1)
                r2.recursionDepth = r4
                int r4 = r2.getBytesUntilLimit()
                if (r4 != 0) goto L2b
                r2.popLimit(r0)
                return r3
            L2b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.readRawVarint32()
                r2.checkRecursionLimit()
                int r0 = r2.pushLimit(r0)
                int r1 = r2.recursionDepth
                int r1 = r1 + 1
                r2.recursionDepth = r1
                r3.mergeFrom(r2, r4)
                r3 = 0
                r2.checkLastTagWas(r3)
                int r3 = r2.recursionDepth
                int r3 = r3 + (-1)
                r2.recursionDepth = r3
                int r3 = r2.getBytesUntilLimit()
                if (r3 != 0) goto L28
                r2.popLimit(r0)
                return
            L28:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
                r4 = this;
                long r0 = r4.pos
                long r2 = r4.limit
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L12
                r2 = 1
                long r2 = r2 + r0
                r4.pos = r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                return r0
            L12:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int r8) throws java.io.IOException {
                r7 = this;
                if (r8 < 0) goto L1c
                int r0 = r7.remaining()
                if (r8 > r0) goto L1c
                byte[] r0 = new byte[r8]
                long r1 = r7.pos
                long r3 = (long) r8
                long r5 = r1 + r3
                java.nio.ByteBuffer r8 = r7.slice(r1, r5)
                r8.get(r0)
                long r1 = r7.pos
                long r1 = r1 + r3
                r7.pos = r1
                return r0
            L1c:
                if (r8 > 0) goto L28
                if (r8 != 0) goto L23
                byte[] r8 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
                return r8
            L23:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r8
            L28:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r8
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
                r6 = this;
                long r0 = r6.pos
                long r2 = r6.limit
                long r2 = r2 - r0
                r4 = 4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L39
                long r4 = r4 + r0
                r6.pos = r4
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                r2 = r2 & 255(0xff, float:3.57E-43)
                r3 = 1
                long r3 = r3 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                r3 = 2
                long r3 = r3 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                r3 = 3
                long r0 = r0 + r3
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r0 = r0 << 24
                r0 = r0 | r2
                return r0
            L39:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
                r9 = this;
                long r0 = r9.pos
                long r2 = r9.limit
                long r2 = r2 - r0
                r4 = 8
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L72
                long r4 = r4 + r0
                r9.pos = r4
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                long r2 = (long) r2
                r4 = 255(0xff, double:1.26E-321)
                long r2 = r2 & r4
                r6 = 1
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 8
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 2
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 16
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 3
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 24
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 4
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 32
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 5
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 40
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 6
                long r6 = r6 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 48
                long r6 = r6 << r8
                long r2 = r2 | r6
                r6 = 7
                long r0 = r0 + r6
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                long r0 = (long) r0
                long r0 = r0 & r4
                r4 = 56
                long r0 = r0 << r4
                long r0 = r0 | r2
                return r0
            L72:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawVarint32() throws java.io.IOException {
                r9 = this;
                long r0 = r9.pos
                long r2 = r9.limit
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                if (r4 < 0) goto L16
                r9.pos = r2
                return r4
            L16:
                long r5 = r9.limit
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.pos = r5
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
                r13 = this;
                long r0 = r13.pos
                long r2 = r13.limit
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto Ld5
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                if (r4 < 0) goto L17
                r13.pos = r2
                long r0 = (long) r4
                return r0
            L17:
                long r5 = r13.limit
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L22
                goto Ld5
            L22:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L33
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            L30:
                long r0 = (long) r0
                goto Ldf
            L33:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L45
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r5 = r3
                goto Ldf
            L45:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L56
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L30
            L56:
                long r2 = (long) r2
                r9 = 5
                long r9 = r9 + r0
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                long r4 = (long) r4
                r6 = 28
                long r4 = r4 << r6
                long r2 = r2 ^ r4
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L70
                r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            L6c:
                long r0 = r0 ^ r2
                r5 = r9
                goto Ldf
            L70:
                r11 = 6
                long r11 = r11 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r9)
                long r9 = (long) r6
                r6 = 35
                long r9 = r9 << r6
                long r2 = r2 ^ r9
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto L88
                r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L85:
                long r0 = r0 ^ r2
                r5 = r11
                goto Ldf
            L88:
                r9 = 7
                long r9 = r9 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                long r11 = (long) r6
                r6 = 42
                long r11 = r11 << r6
                long r2 = r2 ^ r11
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L9e
                r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L6c
            L9e:
                r11 = 8
                long r11 = r11 + r0
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r9)
                long r9 = (long) r6
                r6 = 49
                long r9 = r9 << r6
                long r2 = r2 ^ r9
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto Lb4
                r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L85
            Lb4:
                long r6 = r0 + r7
                byte r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                long r8 = (long) r8
                r10 = 56
                long r8 = r8 << r10
                long r2 = r2 ^ r8
                r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r2 = r2 ^ r8
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 >= 0) goto Ldd
                r8 = 10
                long r0 = r0 + r8
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r6 = (long) r6
                int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r4 >= 0) goto Lda
            Ld5:
                long r0 = r13.readRawVarint64SlowPath()
                return r0
            Lda:
                r5 = r0
                r0 = r2
                goto Ldf
            Ldd:
                r0 = r2
                r5 = r6
            Ldf:
                r13.pos = r5
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readRawByte()
                r4 = r3 & 127(0x7f, float:1.78E-43)
                long r4 = (long) r4
                long r4 = r4 << r2
                long r0 = r0 | r4
                r3 = r3 & 128(0x80, float:1.8E-43)
                if (r3 != 0) goto L15
                return r0
            L15:
                int r2 = r2 + 7
                goto L3
            L18:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                int r0 = decodeZigZag32(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                long r0 = decodeZigZag64(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
                r11 = this;
                int r0 = r11.readRawVarint32()
                if (r0 <= 0) goto L25
                int r1 = r11.remaining()
                if (r0 > r1) goto L25
                byte[] r1 = new byte[r0]
                long r2 = r11.pos
                long r9 = (long) r0
                r5 = 0
                r4 = r1
                r7 = r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r2, r4, r5, r7)
                java.lang.String r0 = new java.lang.String
                java.nio.charset.Charset r2 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r0.<init>(r1, r2)
                long r1 = r11.pos
                long r1 = r1 + r9
                r11.pos = r1
                return r0
            L25:
                if (r0 != 0) goto L2a
                java.lang.String r0 = ""
                return r0
            L2a:
                if (r0 >= 0) goto L31
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L31:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
                r6 = this;
                int r0 = r6.readRawVarint32()
                if (r0 <= 0) goto L1f
                int r1 = r6.remaining()
                if (r0 > r1) goto L1f
                long r1 = r6.pos
                int r1 = r6.bufferPos(r1)
                java.nio.ByteBuffer r2 = r6.buffer
                java.lang.String r1 = com.google.crypto.tink.shaded.protobuf.Utf8.decodeUtf8(r2, r1, r0)
                long r2 = r6.pos
                long r4 = (long) r0
                long r2 = r2 + r4
                r6.pos = r2
                return r1
            L1f:
                if (r0 != 0) goto L24
                java.lang.String r0 = ""
                return r0
            L24:
                if (r0 > 0) goto L2b
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L2b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.isAtEnd()
                if (r0 == 0) goto La
                r0 = 0
                r1.lastTag = r0
                return r0
            La:
                int r0 = r1.readRawVarint32()
                r1.lastTag = r0
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
                if (r0 == 0) goto L19
                int r0 = r1.lastTag
                return r0
            L19:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidTag()
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                r1.readGroup(r2, r3, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
                r2 = this;
                long r0 = r2.pos
                r2.startPos = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                if (r0 == 0) goto L3d
                if (r0 == r1) goto L37
                r2 = 2
                if (r0 == r2) goto L2f
                r2 = 3
                r3 = 4
                if (r0 == r2) goto L20
                if (r0 == r3) goto L1e
                r5 = 5
                if (r0 != r5) goto L19
                r4.skipRawBytes(r3)
                return r1
            L19:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L1e:
                r5 = 0
                return r5
            L20:
                r4.skipMessage()
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r5, r3)
                r4.checkLastTagWas(r5)
                return r1
            L2f:
                int r5 = r4.readRawVarint32()
                r4.skipRawBytes(r5)
                return r1
            L37:
                r5 = 8
                r4.skipRawBytes(r5)
                return r1
            L3d:
                r4.skipRawVarint()
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int r5, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                if (r0 == 0) goto L52
                if (r0 == r1) goto L47
                r2 = 2
                if (r0 == r2) goto L3c
                r2 = 3
                r3 = 4
                if (r0 == r2) goto L27
                if (r0 == r3) goto L25
                r2 = 5
                if (r0 != r2) goto L20
                int r0 = r4.readRawLittleEndian32()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed32NoTag(r0)
                return r1
            L20:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L25:
                r5 = 0
                return r5
            L27:
                r6.writeUInt32NoTag(r5)
                r4.skipMessage(r6)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r5)
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r5, r3)
                r4.checkLastTagWas(r5)
                r6.writeUInt32NoTag(r5)
                return r1
            L3c:
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.readBytes()
                r6.writeUInt32NoTag(r5)
                r6.writeBytesNoTag(r0)
                return r1
            L47:
                long r2 = r4.readRawLittleEndian64()
                r6.writeUInt32NoTag(r5)
                r6.writeFixed64NoTag(r2)
                return r1
            L52:
                long r2 = r4.readInt64()
                r6.writeUInt32NoTag(r5)
                r6.writeUInt64NoTag(r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws java.io.IOException {
                r1 = this;
            L0:
                int r0 = r1.readTag()
                if (r0 == 0) goto Lc
                boolean r0 = r1.skipField(r0)
                if (r0 != 0) goto L0
            Lc:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2) throws java.io.IOException {
                r1 = this;
            L0:
                int r0 = r1.readTag()
                if (r0 == 0) goto Lc
                boolean r0 = r1.skipField(r0, r2)
                if (r0 != 0) goto L0
            Lc:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int r5) throws java.io.IOException {
                r4 = this;
                if (r5 < 0) goto Lf
                int r0 = r4.remaining()
                if (r5 > r0) goto Lf
                long r0 = r4.pos
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.pos = r0
                return
            Lf:
                if (r5 >= 0) goto L16
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r5
            L16:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r5
        }
    }

    static {
            return
    }

    private CodedInputStream() {
            r1 = this;
            r1.<init>()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.defaultRecursionLimit
            r1.recursionLimit = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.sizeLimit = r0
            r0 = 0
            r1.shouldDiscardUnknownFields = r0
            return
    }

    /* synthetic */ CodedInputStream(com.google.crypto.tink.shaded.protobuf.CodedInputStream.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static int decodeZigZag32(int r1) {
            int r0 = r1 >>> 1
            r1 = r1 & 1
            int r1 = -r1
            r1 = r1 ^ r0
            return r1
    }

    public static long decodeZigZag64(long r4) {
            r0 = 1
            long r0 = r4 >>> r0
            r2 = 1
            long r4 = r4 & r2
            long r4 = -r4
            long r4 = r4 ^ r0
            return r4
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.io.InputStream r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = newInstance(r1, r0)
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.io.InputStream r2, int r3) {
            if (r3 <= 0) goto L12
            if (r2 != 0) goto Lb
            byte[] r2 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_ARRAY
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = newInstance(r2)
            return r2
        Lb:
            com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "bufferSize must be > 0"
            r2.<init>(r3)
            throw r2
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> r1) {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()
            if (r0 != 0) goto L10
            com.google.crypto.tink.shaded.protobuf.IterableByteBufferInputStream r0 = new com.google.crypto.tink.shaded.protobuf.IterableByteBufferInputStream
            r0.<init>(r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = newInstance(r0)
            return r1
        L10:
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = newInstance(r1, r0)
            return r1
    }

    static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> r5, boolean r6) {
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
            r2 = r1
        L6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r0.next()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r4 = r3.remaining()
            int r2 = r2 + r4
            boolean r4 = r3.hasArray()
            if (r4 == 0) goto L20
            r1 = r1 | 1
            goto L6
        L20:
            boolean r3 = r3.isDirect()
            if (r3 == 0) goto L29
            r1 = r1 | 2
            goto L6
        L29:
            r1 = r1 | 4
            goto L6
        L2c:
            r0 = 2
            if (r1 != r0) goto L36
            com.google.crypto.tink.shaded.protobuf.CodedInputStream$IterableDirectByteBufferDecoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedInputStream$IterableDirectByteBufferDecoder
            r1 = 0
            r0.<init>(r5, r2, r6, r1)
            return r0
        L36:
            com.google.crypto.tink.shaded.protobuf.IterableByteBufferInputStream r6 = new com.google.crypto.tink.shaded.protobuf.IterableByteBufferInputStream
            r6.<init>(r5)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r5 = newInstance(r6)
            return r5
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer r1) {
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = newInstance(r1, r0)
            return r1
    }

    static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer r3, boolean r4) {
            boolean r0 = r3.hasArray()
            if (r0 == 0) goto L1c
            byte[] r0 = r3.array()
            int r1 = r3.arrayOffset()
            int r2 = r3.position()
            int r1 = r1 + r2
            int r3 = r3.remaining()
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = newInstance(r0, r1, r3, r4)
            return r3
        L1c:
            boolean r0 = r3.isDirect()
            if (r0 == 0) goto L2f
            boolean r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()
            if (r0 == 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.CodedInputStream$UnsafeDirectNioDecoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedInputStream$UnsafeDirectNioDecoder
            r1 = 0
            r0.<init>(r3, r4, r1)
            return r0
        L2f:
            int r4 = r3.remaining()
            byte[] r0 = new byte[r4]
            java.nio.ByteBuffer r3 = r3.duplicate()
            r3.get(r0)
            r3 = 0
            r1 = 1
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = newInstance(r0, r3, r4, r1)
            return r3
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = newInstance(r2, r0, r1)
            return r2
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(byte[] r1, int r2, int r3) {
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = newInstance(r1, r2, r3, r0)
            return r1
    }

    static com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance(byte[] r7, int r8, int r9, boolean r10) {
            com.google.crypto.tink.shaded.protobuf.CodedInputStream$ArrayDecoder r6 = new com.google.crypto.tink.shaded.protobuf.CodedInputStream$ArrayDecoder
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.pushLimit(r9)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lf
            return r6
        Lf:
            r7 = move-exception
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r7)
            throw r8
    }

    public static int readRawVarint32(int r3, java.io.InputStream r4) throws java.io.IOException {
            r0 = r3 & 128(0x80, float:1.8E-43)
            if (r0 != 0) goto L5
            return r3
        L5:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            r0 = 7
        L8:
            r1 = 32
            r2 = -1
            if (r0 >= r1) goto L24
            int r1 = r4.read()
            if (r1 == r2) goto L1f
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r2 = r2 << r0
            r3 = r3 | r2
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 != 0) goto L1c
            return r3
        L1c:
            int r0 = r0 + 7
            goto L8
        L1f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r3
        L24:
            r1 = 64
            if (r0 >= r1) goto L3b
            int r1 = r4.read()
            if (r1 == r2) goto L36
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 != 0) goto L33
            return r3
        L33:
            int r0 = r0 + 7
            goto L24
        L36:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r3
        L3b:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint()
            throw r3
    }

    static int readRawVarint32(java.io.InputStream r2) throws java.io.IOException {
            int r0 = r2.read()
            r1 = -1
            if (r0 == r1) goto Lc
            int r2 = readRawVarint32(r0, r2)
            return r2
        Lc:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
    }

    public abstract void checkLastTagWas(int r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    public void checkRecursionLimit() throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r2 = this;
            int r0 = r2.recursionDepth
            int r1 = r2.recursionLimit
            if (r0 >= r1) goto L7
            return
        L7:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.recursionLimitExceeded()
            throw r0
    }

    final void discardUnknownFields() {
            r1 = this;
            r0 = 1
            r1.shouldDiscardUnknownFields = r0
            return
    }

    public abstract void enableAliasing(boolean r1);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws java.io.IOException;

    public abstract void popLimit(int r1);

    public abstract int pushLimit(int r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    public abstract boolean readBool() throws java.io.IOException;

    public abstract byte[] readByteArray() throws java.io.IOException;

    public abstract java.nio.ByteBuffer readByteBuffer() throws java.io.IOException;

    public abstract com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException;

    public abstract double readDouble() throws java.io.IOException;

    public abstract int readEnum() throws java.io.IOException;

    public abstract int readFixed32() throws java.io.IOException;

    public abstract long readFixed64() throws java.io.IOException;

    public abstract float readFloat() throws java.io.IOException;

    public abstract <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readGroup(int r1, com.google.crypto.tink.shaded.protobuf.Parser<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    public abstract void readGroup(int r1, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    public abstract int readInt32() throws java.io.IOException;

    public abstract long readInt64() throws java.io.IOException;

    public abstract <T extends com.google.crypto.tink.shaded.protobuf.MessageLite> T readMessage(com.google.crypto.tink.shaded.protobuf.Parser<T> r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

    public abstract void readMessage(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

    public abstract byte readRawByte() throws java.io.IOException;

    public abstract byte[] readRawBytes(int r1) throws java.io.IOException;

    public abstract int readRawLittleEndian32() throws java.io.IOException;

    public abstract long readRawLittleEndian64() throws java.io.IOException;

    public abstract int readRawVarint32() throws java.io.IOException;

    public abstract long readRawVarint64() throws java.io.IOException;

    abstract long readRawVarint64SlowPath() throws java.io.IOException;

    public abstract int readSFixed32() throws java.io.IOException;

    public abstract long readSFixed64() throws java.io.IOException;

    public abstract int readSInt32() throws java.io.IOException;

    public abstract long readSInt64() throws java.io.IOException;

    public abstract java.lang.String readString() throws java.io.IOException;

    public abstract java.lang.String readStringRequireUtf8() throws java.io.IOException;

    public abstract int readTag() throws java.io.IOException;

    public abstract int readUInt32() throws java.io.IOException;

    public abstract long readUInt64() throws java.io.IOException;

    @java.lang.Deprecated
    public abstract void readUnknownGroup(int r1, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r2) throws java.io.IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int r4) {
            r3 = this;
            if (r4 < 0) goto L7
            int r0 = r3.recursionLimit
            r3.recursionLimit = r4
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Recursion limit cannot be negative: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public final int setSizeLimit(int r4) {
            r3 = this;
            if (r4 < 0) goto L7
            int r0 = r3.sizeLimit
            r3.sizeLimit = r4
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Size limit cannot be negative: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    final boolean shouldDiscardUnknownFields() {
            r1 = this;
            boolean r0 = r1.shouldDiscardUnknownFields
            return r0
    }

    public abstract boolean skipField(int r1) throws java.io.IOException;

    @java.lang.Deprecated
    public abstract boolean skipField(int r1, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2) throws java.io.IOException;

    public abstract void skipMessage() throws java.io.IOException;

    public abstract void skipMessage(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1) throws java.io.IOException;

    public abstract void skipRawBytes(int r1) throws java.io.IOException;

    final void unsetDiscardUnknownFields() {
            r1 = this;
            r0 = 0
            r1.shouldDiscardUnknownFields = r0
            return
    }
}
