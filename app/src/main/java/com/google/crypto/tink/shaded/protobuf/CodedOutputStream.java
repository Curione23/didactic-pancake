package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedOutputStream extends com.google.crypto.tink.shaded.protobuf.ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;

    @java.lang.Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private static final java.util.logging.Logger logger = null;
    private boolean serializationDeterministic;
    com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter wrapper;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.CodedOutputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static abstract class AbstractBufferedEncoder extends com.google.crypto.tink.shaded.protobuf.CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        AbstractBufferedEncoder(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                if (r2 < 0) goto L14
                r0 = 20
                int r2 = java.lang.Math.max(r2, r0)
                byte[] r2 = new byte[r2]
                r1.buffer = r2
                int r2 = r2.length
                r1.limit = r2
                return
            L14:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "bufferSize must be >= 0"
                r2.<init>(r0)
                throw r2
        }

        final void buffer(byte r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.position
                int r2 = r1 + 1
                r3.position = r2
                r0[r1] = r4
                int r4 = r3.totalBytesWritten
                int r4 = r4 + 1
                r3.totalBytesWritten = r4
                return
        }

        final void bufferFixed32NoTag(int r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                int r1 = r5.position
                int r2 = r1 + 1
                r5.position = r2
                r3 = r6 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + 2
                r5.position = r3
                int r4 = r6 >> 8
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + 3
                r5.position = r2
                int r4 = r6 >> 16
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0[r3] = r4
                int r1 = r1 + 4
                r5.position = r1
                int r6 = r6 >> 24
                r6 = r6 & 255(0xff, float:3.57E-43)
                byte r6 = (byte) r6
                r0[r2] = r6
                int r6 = r5.totalBytesWritten
                int r6 = r6 + 4
                r5.totalBytesWritten = r6
                return
        }

        final void bufferFixed64NoTag(long r10) {
                r9 = this;
                byte[] r0 = r9.buffer
                int r1 = r9.position
                int r2 = r1 + 1
                r9.position = r2
                r3 = 255(0xff, double:1.26E-321)
                long r5 = r10 & r3
                int r5 = (int) r5
                byte r5 = (byte) r5
                r0[r1] = r5
                int r5 = r1 + 2
                r9.position = r5
                r6 = 8
                long r7 = r10 >> r6
                long r7 = r7 & r3
                int r7 = (int) r7
                byte r7 = (byte) r7
                r0[r2] = r7
                int r2 = r1 + 3
                r9.position = r2
                r7 = 16
                long r7 = r10 >> r7
                long r7 = r7 & r3
                int r7 = (int) r7
                byte r7 = (byte) r7
                r0[r5] = r7
                int r5 = r1 + 4
                r9.position = r5
                r7 = 24
                long r7 = r10 >> r7
                long r3 = r3 & r7
                int r3 = (int) r3
                byte r3 = (byte) r3
                r0[r2] = r3
                int r2 = r1 + 5
                r9.position = r2
                r3 = 32
                long r3 = r10 >> r3
                int r3 = (int) r3
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r0[r5] = r3
                int r3 = r1 + 6
                r9.position = r3
                r4 = 40
                long r4 = r10 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + 7
                r9.position = r2
                r4 = 48
                long r4 = r10 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0[r3] = r4
                int r1 = r1 + r6
                r9.position = r1
                r1 = 56
                long r10 = r10 >> r1
                int r10 = (int) r10
                r10 = r10 & 255(0xff, float:3.57E-43)
                byte r10 = (byte) r10
                r0[r2] = r10
                int r10 = r9.totalBytesWritten
                int r10 = r10 + r6
                r9.totalBytesWritten = r10
                return
        }

        final void bufferInt32NoTag(int r3) {
                r2 = this;
                if (r3 < 0) goto L6
                r2.bufferUInt32NoTag(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.bufferUInt64NoTag(r0)
            La:
                return
        }

        final void bufferTag(int r1, int r2) {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
                r0.bufferUInt32NoTag(r1)
                return
        }

        final void bufferUInt32NoTag(int r7) {
                r6 = this;
                boolean r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.access$100()
                if (r0 == 0) goto L39
                int r0 = r6.position
                long r0 = (long) r0
            L9:
                r2 = r7 & (-128(0xffffffffffffff80, float:NaN))
                if (r2 != 0) goto L25
                byte[] r2 = r6.buffer
                int r3 = r6.position
                int r4 = r3 + 1
                r6.position = r4
                long r3 = (long) r3
                byte r7 = (byte) r7
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r2, r3, r7)
                int r7 = r6.position
                long r2 = (long) r7
                long r2 = r2 - r0
                int r7 = (int) r2
                int r0 = r6.totalBytesWritten
                int r0 = r0 + r7
                r6.totalBytesWritten = r0
                return
            L25:
                byte[] r2 = r6.buffer
                int r3 = r6.position
                int r4 = r3 + 1
                r6.position = r4
                long r3 = (long) r3
                r5 = r7 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r2, r3, r5)
                int r7 = r7 >>> 7
                goto L9
            L39:
                r0 = r7 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L4f
                byte[] r0 = r6.buffer
                int r1 = r6.position
                int r2 = r1 + 1
                r6.position = r2
                byte r7 = (byte) r7
                r0[r1] = r7
                int r7 = r6.totalBytesWritten
                int r7 = r7 + 1
                r6.totalBytesWritten = r7
                return
            L4f:
                byte[] r0 = r6.buffer
                int r1 = r6.position
                int r2 = r1 + 1
                r6.position = r2
                r2 = r7 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                int r0 = r6.totalBytesWritten
                int r0 = r0 + 1
                r6.totalBytesWritten = r0
                int r7 = r7 >>> 7
                goto L39
        }

        final void bufferUInt64NoTag(long r12) {
                r11 = this;
                boolean r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.access$100()
                r1 = 7
                r2 = 0
                r4 = -128(0xffffffffffffff80, double:NaN)
                if (r0 == 0) goto L41
                int r0 = r11.position
                long r6 = (long) r0
            Le:
                long r8 = r12 & r4
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 != 0) goto L2d
                byte[] r0 = r11.buffer
                int r1 = r11.position
                int r2 = r1 + 1
                r11.position = r2
                long r1 = (long) r1
                int r12 = (int) r12
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r12)
                int r12 = r11.position
                long r12 = (long) r12
                long r12 = r12 - r6
                int r12 = (int) r12
                int r13 = r11.totalBytesWritten
                int r13 = r13 + r12
                r11.totalBytesWritten = r13
                return
            L2d:
                byte[] r0 = r11.buffer
                int r8 = r11.position
                int r9 = r8 + 1
                r11.position = r9
                long r8 = (long) r8
                int r10 = (int) r12
                r10 = r10 & 127(0x7f, float:1.78E-43)
                r10 = r10 | 128(0x80, float:1.8E-43)
                byte r10 = (byte) r10
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r8, r10)
                long r12 = r12 >>> r1
                goto Le
            L41:
                long r6 = r12 & r4
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 != 0) goto L5a
                byte[] r0 = r11.buffer
                int r1 = r11.position
                int r2 = r1 + 1
                r11.position = r2
                int r12 = (int) r12
                byte r12 = (byte) r12
                r0[r1] = r12
                int r12 = r11.totalBytesWritten
                int r12 = r12 + 1
                r11.totalBytesWritten = r12
                return
            L5a:
                byte[] r0 = r11.buffer
                int r6 = r11.position
                int r7 = r6 + 1
                r11.position = r7
                int r7 = (int) r12
                r7 = r7 & 127(0x7f, float:1.78E-43)
                r7 = r7 | 128(0x80, float:1.8E-43)
                byte r7 = (byte) r7
                r0[r6] = r7
                int r0 = r11.totalBytesWritten
                int r0 = r0 + 1
                r11.totalBytesWritten = r0
                long r12 = r12 >>> r1
                goto L41
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
                r1 = this;
                int r0 = r1.totalBytesWritten
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int spaceLeft() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer."
                r0.<init>(r1)
                throw r0
        }
    }

    private static class ArrayEncoder extends com.google.crypto.tink.shaded.protobuf.CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        ArrayEncoder(byte[] r4, int r5, int r6) {
                r3 = this;
                r0 = 0
                r3.<init>(r0)
                if (r4 == 0) goto L35
                r0 = r5 | r6
                int r1 = r4.length
                int r2 = r5 + r6
                int r1 = r1 - r2
                r0 = r0 | r1
                if (r0 < 0) goto L18
                r3.buffer = r4
                r3.offset = r5
                r3.position = r5
                r3.limit = r2
                return
            L18:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                int r4 = r4.length
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6}
                java.lang.String r5 = "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"
                java.lang.String r4 = java.lang.String.format(r5, r4)
                r0.<init>(r4)
                throw r0
            L35:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "buffer"
                r4.<init>(r5)
                throw r4
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
                r0 = this;
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
                r2 = this;
                int r0 = r2.position
                int r1 = r2.offset
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int spaceLeft() {
                r2 = this;
                int r0 = r2.limit
                int r1 = r2.position
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void write(byte r5) throws java.io.IOException {
                r4 = this;
                byte[] r0 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                int r1 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                return
            Lb:
                r5 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                int r1 = r4.position
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = r4.limit
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer r5) throws java.io.IOException {
                r4 = this;
                int r0 = r5.remaining()
                byte[] r1 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L11
                int r2 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> L11
                r5.get(r1, r2, r0)     // Catch: java.lang.IndexOutOfBoundsException -> L11
                int r5 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> L11
                int r5 = r5 + r0
                r4.position = r5     // Catch: java.lang.IndexOutOfBoundsException -> L11
                return
            L11:
                r5 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r1 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                int r2 = r4.position
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r4.limit
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r0 = new java.lang.Object[]{r2, r3, r0}
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r0 = java.lang.String.format(r2, r0)
                r1.<init>(r0, r5)
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void write(byte[] r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                byte[] r0 = r2.buffer     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r1 = r2.position     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                java.lang.System.arraycopy(r3, r4, r0, r1, r5)     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r3 = r2.position     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r3 = r3 + r5
                r2.position = r3     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                return
            Ld:
                r3 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r4 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                int r0 = r2.position
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                int r1 = r2.limit
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object[] r5 = new java.lang.Object[]{r0, r1, r5}
                java.lang.String r0 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r5 = java.lang.String.format(r0, r5)
                r4.<init>(r5, r3)
                throw r4
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeBool(int r2, boolean r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                byte r2 = (byte) r3
                r1.write(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteArray(int r3, byte[] r4) throws java.io.IOException {
                r2 = this;
                r0 = 0
                int r1 = r4.length
                r2.writeByteArray(r3, r4, r0, r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteArray(int r2, byte[] r3, int r4, int r5) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeByteArrayNoTag(r3, r4, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.writeUInt32NoTag(r3)
                r0.write(r1, r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteBuffer(int r2, java.nio.ByteBuffer r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                int r2 = r3.capacity()
                r1.writeUInt32NoTag(r2)
                r1.writeRawBytes(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeBytes(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeBytesNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeBytesNoTag(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.size()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.writeTag(r2, r0)
                r1.writeFixed32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int r6) throws java.io.IOException {
                r5 = this;
                byte[] r0 = r5.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r1 = r5.position     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r2 = r1 + 1
                r5.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r3 = r6 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r3 = r1 + 2
                r5.position = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r4 = r6 >> 8
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r2] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r2 = r1 + 3
                r5.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r4 = r6 >> 16
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r3] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r1 = r1 + 4
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r6 = r6 >> 24
                r6 = r6 & 255(0xff, float:3.57E-43)
                byte r6 = (byte) r6     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r2] = r6     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                return
            L2f:
                r6 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                int r1 = r5.position
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = r5.limit
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r6)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 1
                r1.writeTag(r2, r0)
                r1.writeFixed64NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long r8) throws java.io.IOException {
                r7 = this;
                byte[] r0 = r7.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                int r1 = r7.position     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                int r2 = r1 + 1
                r7.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                int r3 = (int) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                int r3 = r1 + 2
                r7.position = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r4 = 8
                long r5 = r8 >> r4
                int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                int r2 = r1 + 3
                r7.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r5 = 16
                long r5 = r8 >> r5
                int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                int r3 = r1 + 4
                r7.position = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r5 = 24
                long r5 = r8 >> r5
                int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                int r2 = r1 + 5
                r7.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r5 = 32
                long r5 = r8 >> r5
                int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                int r3 = r1 + 6
                r7.position = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r5 = 40
                long r5 = r8 >> r5
                int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                int r2 = r1 + 7
                r7.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r5 = 48
                long r5 = r8 >> r5
                int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                int r1 = r1 + r4
                r7.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r1 = 56
                long r8 = r8 >> r1
                int r8 = (int) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                r0[r2] = r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
                return
            L6f:
                r8 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r9 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                int r0 = r7.position
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                int r1 = r7.limit
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
                java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r9.<init>(r0, r8)
                throw r9
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeInt32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeUInt32NoTag(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeUInt64NoTag(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer r1) throws java.io.IOException {
                r0 = this;
                r0.write(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void writeLazy(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.write(r1, r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessage(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        final void writeMessage(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r2 = r3
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r2 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r2
                int r2 = r2.getSerializedSize(r4)
                r1.writeUInt32NoTag(r2)
                com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r2 = r1.wrapper
                r4.writeTo(r3, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.getSerializedSize()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        final void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r2, com.google.crypto.tink.shaded.protobuf.Schema r3) throws java.io.IOException {
                r1 = this;
                r0 = r2
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r0
                int r0 = r0.getSerializedSize(r3)
                r1.writeUInt32NoTag(r0)
                com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r0 = r1.wrapper
                r3.writeTo(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int r4, com.google.crypto.tink.shaded.protobuf.MessageLite r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeMessage(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeRawBytes(java.nio.ByteBuffer r3) throws java.io.IOException {
                r2 = this;
                boolean r0 = r3.hasArray()
                if (r0 == 0) goto L16
                byte[] r0 = r3.array()
                int r1 = r3.arrayOffset()
                int r3 = r3.capacity()
                r2.write(r0, r1, r3)
                goto L20
            L16:
                java.nio.ByteBuffer r3 = r3.duplicate()
                r3.clear()
                r2.write(r3)
            L20:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int r4, com.google.crypto.tink.shaded.protobuf.ByteString r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeBytes(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeString(int r2, java.lang.String r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeStringNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeStringNoTag(java.lang.String r6) throws java.io.IOException {
                r5 = this;
                int r0 = r5.position
                int r1 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r1 = r1 * 3
                int r1 = computeUInt32SizeNoTag(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r2 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r2 = computeUInt32SizeNoTag(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                if (r2 != r1) goto L2f
                int r1 = r0 + r2
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                byte[] r3 = r5.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r4 = r5.spaceLeft()     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r1 = com.google.crypto.tink.shaded.protobuf.Utf8.encode(r6, r3, r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                r5.position = r0     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r3 = r1 - r0
                int r3 = r3 - r2
                r5.writeUInt32NoTag(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                goto L52
            L2f:
                int r1 = com.google.crypto.tink.shaded.protobuf.Utf8.encodedLength(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                r5.writeUInt32NoTag(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                byte[] r1 = r5.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r2 = r5.position     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r3 = r5.spaceLeft()     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r1 = com.google.crypto.tink.shaded.protobuf.Utf8.encode(r6, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L4c
                goto L52
            L45:
                r6 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r6)
                throw r0
            L4c:
                r1 = move-exception
                r5.position = r0
                r5.inefficientWriteStringNoTag(r6, r1)
            L52:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeTag(int r1, int r2) throws java.io.IOException {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
                r0.writeUInt32NoTag(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeUInt32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int r5) throws java.io.IOException {
                r4 = this;
            L0:
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L10
                byte[] r0 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L22
                int r1 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> L22
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L22
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L22
                r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L22
                return
            L10:
                byte[] r0 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L22
                int r1 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> L22
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L22
                r2 = r5 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> L22
                r0[r1] = r2     // Catch: java.lang.IndexOutOfBoundsException -> L22
                int r5 = r5 >>> 7
                goto L0
            L22:
                r5 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                int r1 = r4.position
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = r4.limit
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeUInt64NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long r10) throws java.io.IOException {
                r9 = this;
                boolean r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.access$100()
                r1 = 7
                r2 = 0
                r4 = -128(0xffffffffffffff80, double:NaN)
                if (r0 == 0) goto L3c
                int r0 = r9.spaceLeft()
                r6 = 10
                if (r0 < r6) goto L3c
            L13:
                long r6 = r10 & r4
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 != 0) goto L28
                byte[] r0 = r9.buffer
                int r1 = r9.position
                int r2 = r1 + 1
                r9.position = r2
                long r1 = (long) r1
                int r10 = (int) r10
                byte r10 = (byte) r10
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r10)
                return
            L28:
                byte[] r0 = r9.buffer
                int r6 = r9.position
                int r7 = r6 + 1
                r9.position = r7
                long r6 = (long) r6
                int r8 = (int) r10
                r8 = r8 & 127(0x7f, float:1.78E-43)
                r8 = r8 | 128(0x80, float:1.8E-43)
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r6, r8)
                long r10 = r10 >>> r1
                goto L13
            L3c:
                long r6 = r10 & r4
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 != 0) goto L4f
                byte[] r0 = r9.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r1 = r9.position     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r2 = r1 + 1
                r9.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r10 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
                byte r10 = (byte) r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
                r0[r1] = r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
                return
            L4f:
                byte[] r0 = r9.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r6 = r9.position     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r7 = r6 + 1
                r9.position = r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r7 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
                r7 = r7 & 127(0x7f, float:1.78E-43)
                r7 = r7 | 128(0x80, float:1.8E-43)
                byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
                r0[r6] = r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
                long r10 = r10 >>> r1
                goto L3c
            L61:
                r10 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r11 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                int r0 = r9.position
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                int r1 = r9.limit
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
                java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r11.<init>(r0, r10)
                throw r11
        }
    }

    private static final class ByteOutputEncoder extends com.google.crypto.tink.shaded.protobuf.CodedOutputStream.AbstractBufferedEncoder {
        private final com.google.crypto.tink.shaded.protobuf.ByteOutput out;

        ByteOutputEncoder(com.google.crypto.tink.shaded.protobuf.ByteOutput r1, int r2) {
                r0 = this;
                r0.<init>(r2)
                if (r1 == 0) goto L8
                r0.out = r1
                return
            L8:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "out"
                r1.<init>(r2)
                throw r1
        }

        private void doFlush() throws java.io.IOException {
                r4 = this;
                com.google.crypto.tink.shaded.protobuf.ByteOutput r0 = r4.out
                byte[] r1 = r4.buffer
                int r2 = r4.position
                r3 = 0
                r0.write(r1, r3, r2)
                r4.position = r3
                return
        }

        private void flushIfNotAvailable(int r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.limit
                int r1 = r2.position
                int r0 = r0 - r1
                if (r0 >= r3) goto La
                r2.doFlush()
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() throws java.io.IOException {
                r1 = this;
                int r0 = r1.position
                if (r0 <= 0) goto L7
                r1.doFlush()
            L7:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.position
                int r1 = r2.limit
                if (r0 != r1) goto L9
                r2.doFlush()
            L9:
                r2.buffer(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r3) throws java.io.IOException {
                r2 = this;
                r2.flush()
                int r0 = r3.remaining()
                com.google.crypto.tink.shaded.protobuf.ByteOutput r1 = r2.out
                r1.write(r3)
                int r3 = r2.totalBytesWritten
                int r3 = r3 + r0
                r2.totalBytesWritten = r3
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                r1.flush()
                com.google.crypto.tink.shaded.protobuf.ByteOutput r0 = r1.out
                r0.write(r2, r3, r4)
                int r2 = r1.totalBytesWritten
                int r2 = r2 + r4
                r1.totalBytesWritten = r2
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int r2, boolean r3) throws java.io.IOException {
                r1 = this;
                r0 = 11
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                byte r2 = (byte) r3
                r1.buffer(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int r3, byte[] r4) throws java.io.IOException {
                r2 = this;
                r0 = 0
                int r1 = r4.length
                r2.writeByteArray(r3, r4, r0, r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int r2, byte[] r3, int r4, int r5) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeByteArrayNoTag(r3, r4, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.writeUInt32NoTag(r3)
                r0.write(r1, r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int r2, java.nio.ByteBuffer r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                int r2 = r3.capacity()
                r1.writeUInt32NoTag(r2)
                r1.writeRawBytes(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeBytesNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.size()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 14
                r1.flushIfNotAvailable(r0)
                r0 = 5
                r1.bufferTag(r2, r0)
                r1.bufferFixed32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int r2) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.flushIfNotAvailable(r0)
                r1.bufferFixed32NoTag(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 18
                r1.flushIfNotAvailable(r0)
                r0 = 1
                r1.bufferTag(r2, r0)
                r1.bufferFixed64NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long r2) throws java.io.IOException {
                r1 = this;
                r0 = 8
                r1.flushIfNotAvailable(r0)
                r1.bufferFixed64NoTag(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 20
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                r1.bufferInt32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeUInt32NoTag(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeUInt64NoTag(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r3) throws java.io.IOException {
                r2 = this;
                r2.flush()
                int r0 = r3.remaining()
                com.google.crypto.tink.shaded.protobuf.ByteOutput r1 = r2.out
                r1.writeLazy(r3)
                int r3 = r2.totalBytesWritten
                int r3 = r3 + r0
                r2.totalBytesWritten = r3
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                r1.flush()
                com.google.crypto.tink.shaded.protobuf.ByteOutput r0 = r1.out
                r0.writeLazy(r2, r3, r4)
                int r2 = r1.totalBytesWritten
                int r2 = r2 + r4
                r1.totalBytesWritten = r2
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        void writeMessage(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.getSerializedSize()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r2, com.google.crypto.tink.shaded.protobuf.Schema r3) throws java.io.IOException {
                r1 = this;
                r0 = r2
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r0
                int r0 = r0.getSerializedSize(r3)
                r1.writeUInt32NoTag(r0)
                com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r0 = r1.wrapper
                r3.writeTo(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int r4, com.google.crypto.tink.shaded.protobuf.MessageLite r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeMessage(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(java.nio.ByteBuffer r3) throws java.io.IOException {
                r2 = this;
                boolean r0 = r3.hasArray()
                if (r0 == 0) goto L16
                byte[] r0 = r3.array()
                int r1 = r3.arrayOffset()
                int r3 = r3.capacity()
                r2.write(r0, r1, r3)
                goto L20
            L16:
                java.nio.ByteBuffer r3 = r3.duplicate()
                r3.clear()
                r2.write(r3)
            L20:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int r4, com.google.crypto.tink.shaded.protobuf.ByteString r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeBytes(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int r2, java.lang.String r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeStringNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String r7) throws java.io.IOException {
                r6 = this;
                int r0 = r7.length()
                int r0 = r0 * 3
                int r1 = computeUInt32SizeNoTag(r0)
                int r2 = r1 + r0
                int r3 = r6.limit
                if (r2 <= r3) goto L1e
                byte[] r1 = new byte[r0]
                r2 = 0
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.encode(r7, r1, r2, r0)
                r6.writeUInt32NoTag(r7)
                r6.writeLazy(r1, r2, r7)
                return
            L1e:
                int r0 = r6.limit
                int r3 = r6.position
                int r0 = r0 - r3
                if (r2 <= r0) goto L28
                r6.doFlush()
            L28:
                int r0 = r6.position
                int r2 = r7.length()     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r2 = computeUInt32SizeNoTag(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                if (r2 != r1) goto L55
                int r1 = r0 + r2
                r6.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                byte[] r1 = r6.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r3 = r6.position     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r4 = r6.limit     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r5 = r6.position     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r4 = r4 - r5
                int r1 = com.google.crypto.tink.shaded.protobuf.Utf8.encode(r7, r1, r3, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                r6.position = r0     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r3 = r1 - r0
                int r3 = r3 - r2
                r6.bufferUInt32NoTag(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                r6.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r1 = r6.totalBytesWritten     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r1 = r1 + r3
                r6.totalBytesWritten = r1     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                goto L81
            L55:
                int r1 = com.google.crypto.tink.shaded.protobuf.Utf8.encodedLength(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                r6.bufferUInt32NoTag(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                byte[] r2 = r6.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r3 = r6.position     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r2 = com.google.crypto.tink.shaded.protobuf.Utf8.encode(r7, r2, r3, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                r6.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r2 = r6.totalBytesWritten     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                int r2 = r2 + r1
                r6.totalBytesWritten = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6c com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L73
                goto L81
            L6c:
                r7 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r7)
                throw r0
            L73:
                r1 = move-exception
                int r2 = r6.totalBytesWritten
                int r3 = r6.position
                int r3 = r3 - r0
                int r2 = r2 - r3
                r6.totalBytesWritten = r2
                r6.position = r0
                r6.inefficientWriteStringNoTag(r7, r1)
            L81:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int r1, int r2) throws java.io.IOException {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
                r0.writeUInt32NoTag(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 20
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                r1.bufferUInt32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int r2) throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.flushIfNotAvailable(r0)
                r1.bufferUInt32NoTag(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 20
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                r1.bufferUInt64NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long r2) throws java.io.IOException {
                r1 = this;
                r0 = 10
                r1.flushIfNotAvailable(r0)
                r1.bufferUInt64NoTag(r2)
                return
        }
    }

    private static final class HeapNioEncoder extends com.google.crypto.tink.shaded.protobuf.CodedOutputStream.ArrayEncoder {
        private final java.nio.ByteBuffer byteBuffer;
        private int initialPosition;

        HeapNioEncoder(java.nio.ByteBuffer r4) {
                r3 = this;
                byte[] r0 = r4.array()
                int r1 = r4.arrayOffset()
                int r2 = r4.position()
                int r1 = r1 + r2
                int r2 = r4.remaining()
                r3.<init>(r0, r1, r2)
                r3.byteBuffer = r4
                int r4 = r4.position()
                r3.initialPosition = r4
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream.ArrayEncoder, com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.byteBuffer
                int r1 = r3.initialPosition
                int r2 = r3.getTotalBytesWritten()
                int r1 = r1 + r2
                r0.position(r1)
                return
        }
    }

    public static class OutOfSpaceException extends java.io.IOException {
        private static final java.lang.String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
                r1 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
                r1.<init>(r0)
                return
        }

        OutOfSpaceException(java.lang.String r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                return
        }

        OutOfSpaceException(java.lang.String r3, java.lang.Throwable r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3, r4)
                return
        }

        OutOfSpaceException(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
                r1.<init>(r0, r2)
                return
        }
    }

    private static final class OutputStreamEncoder extends com.google.crypto.tink.shaded.protobuf.CodedOutputStream.AbstractBufferedEncoder {
        private final java.io.OutputStream out;

        OutputStreamEncoder(java.io.OutputStream r1, int r2) {
                r0 = this;
                r0.<init>(r2)
                if (r1 == 0) goto L8
                r0.out = r1
                return
            L8:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "out"
                r1.<init>(r2)
                throw r1
        }

        private void doFlush() throws java.io.IOException {
                r4 = this;
                java.io.OutputStream r0 = r4.out
                byte[] r1 = r4.buffer
                int r2 = r4.position
                r3 = 0
                r0.write(r1, r3, r2)
                r4.position = r3
                return
        }

        private void flushIfNotAvailable(int r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.limit
                int r1 = r2.position
                int r0 = r0 - r1
                if (r0 >= r3) goto La
                r2.doFlush()
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() throws java.io.IOException {
                r1 = this;
                int r0 = r1.position
                if (r0 <= 0) goto L7
                r1.doFlush()
            L7:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.position
                int r1 = r2.limit
                if (r0 != r1) goto L9
                r2.doFlush()
            L9:
                r2.buffer(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r6) throws java.io.IOException {
                r5 = this;
                int r0 = r6.remaining()
                int r1 = r5.limit
                int r2 = r5.position
                int r1 = r1 - r2
                if (r1 < r0) goto L1d
                byte[] r1 = r5.buffer
                int r2 = r5.position
                r6.get(r1, r2, r0)
                int r6 = r5.position
                int r6 = r6 + r0
                r5.position = r6
                int r6 = r5.totalBytesWritten
                int r6 = r6 + r0
                r5.totalBytesWritten = r6
                goto L62
            L1d:
                int r1 = r5.limit
                int r2 = r5.position
                int r1 = r1 - r2
                byte[] r2 = r5.buffer
                int r3 = r5.position
                r6.get(r2, r3, r1)
                int r0 = r0 - r1
                int r2 = r5.limit
                r5.position = r2
                int r2 = r5.totalBytesWritten
                int r2 = r2 + r1
                r5.totalBytesWritten = r2
                r5.doFlush()
            L36:
                int r1 = r5.limit
                r2 = 0
                if (r0 <= r1) goto L56
                byte[] r1 = r5.buffer
                int r3 = r5.limit
                r6.get(r1, r2, r3)
                java.io.OutputStream r1 = r5.out
                byte[] r3 = r5.buffer
                int r4 = r5.limit
                r1.write(r3, r2, r4)
                int r1 = r5.limit
                int r0 = r0 - r1
                int r1 = r5.totalBytesWritten
                int r2 = r5.limit
                int r1 = r1 + r2
                r5.totalBytesWritten = r1
                goto L36
            L56:
                byte[] r1 = r5.buffer
                r6.get(r1, r2, r0)
                r5.position = r0
                int r6 = r5.totalBytesWritten
                int r6 = r6 + r0
                r5.totalBytesWritten = r6
            L62:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r4, int r5, int r6) throws java.io.IOException {
                r3 = this;
                int r0 = r3.limit
                int r1 = r3.position
                int r0 = r0 - r1
                if (r0 < r6) goto L19
                byte[] r0 = r3.buffer
                int r1 = r3.position
                java.lang.System.arraycopy(r4, r5, r0, r1, r6)
                int r4 = r3.position
                int r4 = r4 + r6
                r3.position = r4
                int r4 = r3.totalBytesWritten
                int r4 = r4 + r6
                r3.totalBytesWritten = r4
                goto L4a
            L19:
                int r0 = r3.limit
                int r1 = r3.position
                int r0 = r0 - r1
                byte[] r1 = r3.buffer
                int r2 = r3.position
                java.lang.System.arraycopy(r4, r5, r1, r2, r0)
                int r5 = r5 + r0
                int r6 = r6 - r0
                int r1 = r3.limit
                r3.position = r1
                int r1 = r3.totalBytesWritten
                int r1 = r1 + r0
                r3.totalBytesWritten = r1
                r3.doFlush()
                int r0 = r3.limit
                if (r6 > r0) goto L40
                byte[] r0 = r3.buffer
                r1 = 0
                java.lang.System.arraycopy(r4, r5, r0, r1, r6)
                r3.position = r6
                goto L45
            L40:
                java.io.OutputStream r0 = r3.out
                r0.write(r4, r5, r6)
            L45:
                int r4 = r3.totalBytesWritten
                int r4 = r4 + r6
                r3.totalBytesWritten = r4
            L4a:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int r2, boolean r3) throws java.io.IOException {
                r1 = this;
                r0 = 11
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                byte r2 = (byte) r3
                r1.buffer(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int r3, byte[] r4) throws java.io.IOException {
                r2 = this;
                r0 = 0
                int r1 = r4.length
                r2.writeByteArray(r3, r4, r0, r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int r2, byte[] r3, int r4, int r5) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeByteArrayNoTag(r3, r4, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.writeUInt32NoTag(r3)
                r0.write(r1, r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int r2, java.nio.ByteBuffer r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                int r2 = r3.capacity()
                r1.writeUInt32NoTag(r2)
                r1.writeRawBytes(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeBytesNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.size()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 14
                r1.flushIfNotAvailable(r0)
                r0 = 5
                r1.bufferTag(r2, r0)
                r1.bufferFixed32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int r2) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.flushIfNotAvailable(r0)
                r1.bufferFixed32NoTag(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 18
                r1.flushIfNotAvailable(r0)
                r0 = 1
                r1.bufferTag(r2, r0)
                r1.bufferFixed64NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long r2) throws java.io.IOException {
                r1 = this;
                r0 = 8
                r1.flushIfNotAvailable(r0)
                r1.bufferFixed64NoTag(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 20
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                r1.bufferInt32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeUInt32NoTag(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeUInt64NoTag(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r1) throws java.io.IOException {
                r0 = this;
                r0.write(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.write(r1, r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        void writeMessage(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.getSerializedSize()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r2, com.google.crypto.tink.shaded.protobuf.Schema r3) throws java.io.IOException {
                r1 = this;
                r0 = r2
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r0
                int r0 = r0.getSerializedSize(r3)
                r1.writeUInt32NoTag(r0)
                com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r0 = r1.wrapper
                r3.writeTo(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int r4, com.google.crypto.tink.shaded.protobuf.MessageLite r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeMessage(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(java.nio.ByteBuffer r3) throws java.io.IOException {
                r2 = this;
                boolean r0 = r3.hasArray()
                if (r0 == 0) goto L16
                byte[] r0 = r3.array()
                int r1 = r3.arrayOffset()
                int r3 = r3.capacity()
                r2.write(r0, r1, r3)
                goto L20
            L16:
                java.nio.ByteBuffer r3 = r3.duplicate()
                r3.clear()
                r2.write(r3)
            L20:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int r4, com.google.crypto.tink.shaded.protobuf.ByteString r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeBytes(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int r2, java.lang.String r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeStringNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String r7) throws java.io.IOException {
                r6 = this;
                int r0 = r7.length()     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                int r0 = r0 * 3
                int r1 = computeUInt32SizeNoTag(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                int r2 = r1 + r0
                int r3 = r6.limit     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                if (r2 <= r3) goto L1e
                byte[] r1 = new byte[r0]     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                r2 = 0
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.encode(r7, r1, r2, r0)     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                r6.writeUInt32NoTag(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                r6.writeLazy(r1, r2, r0)     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                return
            L1e:
                int r0 = r6.limit     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                int r3 = r6.position     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                int r0 = r0 - r3
                if (r2 <= r0) goto L28
                r6.doFlush()     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
            L28:
                int r0 = r7.length()     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                int r0 = computeUInt32SizeNoTag(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                int r2 = r6.position     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                if (r0 != r1) goto L50
                int r1 = r2 + r0
                r6.position = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                byte[] r1 = r6.buffer     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                int r3 = r6.position     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                int r4 = r6.limit     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                int r5 = r6.position     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                int r4 = r4 - r5
                int r1 = com.google.crypto.tink.shaded.protobuf.Utf8.encode(r7, r1, r3, r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                r6.position = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                int r3 = r1 - r2
                int r3 = r3 - r0
                r6.bufferUInt32NoTag(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                r6.position = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                goto L61
            L50:
                int r3 = com.google.crypto.tink.shaded.protobuf.Utf8.encodedLength(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                r6.bufferUInt32NoTag(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                byte[] r0 = r6.buffer     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                int r1 = r6.position     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.encode(r7, r0, r1, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                r6.position = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
            L61:
                int r0 = r6.totalBytesWritten     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                int r0 = r0 + r3
                r6.totalBytesWritten = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L67 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L6e
                goto L7e
            L67:
                r0 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r1 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                r1.<init>(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                throw r1     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
            L6e:
                r0 = move-exception
                int r1 = r6.totalBytesWritten     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                int r3 = r6.position     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                int r3 = r3 - r2
                int r1 = r1 - r3
                r6.totalBytesWritten = r1     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                r6.position = r2     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
                throw r0     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L7a
            L7a:
                r0 = move-exception
                r6.inefficientWriteStringNoTag(r7, r0)
            L7e:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int r1, int r2) throws java.io.IOException {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
                r0.writeUInt32NoTag(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 20
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                r1.bufferUInt32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int r2) throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.flushIfNotAvailable(r0)
                r1.bufferUInt32NoTag(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 20
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                r1.bufferUInt64NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long r2) throws java.io.IOException {
                r1 = this;
                r0 = 10
                r1.flushIfNotAvailable(r0)
                r1.bufferUInt64NoTag(r2)
                return
        }
    }

    private static final class SafeDirectNioEncoder extends com.google.crypto.tink.shaded.protobuf.CodedOutputStream {
        private final java.nio.ByteBuffer buffer;
        private final int initialPosition;
        private final java.nio.ByteBuffer originalBuffer;

        SafeDirectNioEncoder(java.nio.ByteBuffer r3) {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r2.originalBuffer = r3
                java.nio.ByteBuffer r0 = r3.duplicate()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r0 = r0.order(r1)
                r2.buffer = r0
                int r3 = r3.position()
                r2.initialPosition = r3
                return
        }

        private void encode(java.lang.String r2) throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L6
                com.google.crypto.tink.shaded.protobuf.Utf8.encodeUtf8(r2, r0)     // Catch: java.lang.IndexOutOfBoundsException -> L6
                return
            L6:
                r2 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.originalBuffer
                java.nio.ByteBuffer r1 = r2.buffer
                int r1 = r1.position()
                r0.position(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.buffer
                int r0 = r0.position()
                int r1 = r2.initialPosition
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int spaceLeft() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buffer
                int r0 = r0.remaining()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r2) throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buffer     // Catch: java.nio.BufferOverflowException -> L6
                r0.put(r2)     // Catch: java.nio.BufferOverflowException -> L6
                return
            L6:
                r2 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r2) throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buffer     // Catch: java.nio.BufferOverflowException -> L6
                r0.put(r2)     // Catch: java.nio.BufferOverflowException -> L6
                return
            L6:
                r2 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buffer     // Catch: java.nio.BufferOverflowException -> L6 java.lang.IndexOutOfBoundsException -> Ld
                r0.put(r2, r3, r4)     // Catch: java.nio.BufferOverflowException -> L6 java.lang.IndexOutOfBoundsException -> Ld
                return
            L6:
                r2 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r3 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r3.<init>(r2)
                throw r3
            Ld:
                r2 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r3 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r3.<init>(r2)
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int r2, boolean r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                byte r2 = (byte) r3
                r1.write(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int r3, byte[] r4) throws java.io.IOException {
                r2 = this;
                r0 = 0
                int r1 = r4.length
                r2.writeByteArray(r3, r4, r0, r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int r2, byte[] r3, int r4, int r5) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeByteArrayNoTag(r3, r4, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.writeUInt32NoTag(r3)
                r0.write(r1, r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int r2, java.nio.ByteBuffer r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                int r2 = r3.capacity()
                r1.writeUInt32NoTag(r2)
                r1.writeRawBytes(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeBytesNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.size()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.writeTag(r2, r0)
                r1.writeFixed32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int r2) throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buffer     // Catch: java.nio.BufferOverflowException -> L6
                r0.putInt(r2)     // Catch: java.nio.BufferOverflowException -> L6
                return
            L6:
                r2 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 1
                r1.writeTag(r2, r0)
                r1.writeFixed64NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long r2) throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buffer     // Catch: java.nio.BufferOverflowException -> L6
                r0.putLong(r2)     // Catch: java.nio.BufferOverflowException -> L6
                return
            L6:
                r2 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r3 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r3.<init>(r2)
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeInt32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeUInt32NoTag(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeUInt64NoTag(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r1) throws java.io.IOException {
                r0 = this;
                r0.write(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.write(r1, r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        void writeMessage(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.getSerializedSize()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r2, com.google.crypto.tink.shaded.protobuf.Schema r3) throws java.io.IOException {
                r1 = this;
                r0 = r2
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r0
                int r0 = r0.getSerializedSize(r3)
                r1.writeUInt32NoTag(r0)
                com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r0 = r1.wrapper
                r3.writeTo(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int r4, com.google.crypto.tink.shaded.protobuf.MessageLite r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeMessage(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(java.nio.ByteBuffer r3) throws java.io.IOException {
                r2 = this;
                boolean r0 = r3.hasArray()
                if (r0 == 0) goto L16
                byte[] r0 = r3.array()
                int r1 = r3.arrayOffset()
                int r3 = r3.capacity()
                r2.write(r0, r1, r3)
                goto L20
            L16:
                java.nio.ByteBuffer r3 = r3.duplicate()
                r3.clear()
                r2.write(r3)
            L20:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int r4, com.google.crypto.tink.shaded.protobuf.ByteString r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeBytes(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int r2, java.lang.String r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeStringNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String r5) throws java.io.IOException {
                r4 = this;
                java.nio.ByteBuffer r0 = r4.buffer
                int r0 = r0.position()
                int r1 = r5.length()     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                int r1 = r1 * 3
                int r1 = computeUInt32SizeNoTag(r1)     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                int r2 = r5.length()     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                int r2 = computeUInt32SizeNoTag(r2)     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                if (r2 != r1) goto L3f
                java.nio.ByteBuffer r1 = r4.buffer     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                int r1 = r1.position()     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                int r1 = r1 + r2
                java.nio.ByteBuffer r2 = r4.buffer     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                r2.position(r1)     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                r4.encode(r5)     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                java.nio.ByteBuffer r2 = r4.buffer     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                int r2 = r2.position()     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                java.nio.ByteBuffer r3 = r4.buffer     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                r3.position(r0)     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                int r1 = r2 - r1
                r4.writeUInt32NoTag(r1)     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                java.nio.ByteBuffer r1 = r4.buffer     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                r1.position(r2)     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                goto L5a
            L3f:
                int r1 = com.google.crypto.tink.shaded.protobuf.Utf8.encodedLength(r5)     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                r4.writeUInt32NoTag(r1)     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                r4.encode(r5)     // Catch: java.lang.IllegalArgumentException -> L4a com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L51
                goto L5a
            L4a:
                r5 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r5)
                throw r0
            L51:
                r1 = move-exception
                java.nio.ByteBuffer r2 = r4.buffer
                r2.position(r0)
                r4.inefficientWriteStringNoTag(r5, r1)
            L5a:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int r1, int r2) throws java.io.IOException {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
                r0.writeUInt32NoTag(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeUInt32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int r3) throws java.io.IOException {
                r2 = this;
            L0:
                r0 = r3 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto Lb
                java.nio.ByteBuffer r0 = r2.buffer     // Catch: java.nio.BufferOverflowException -> L18
                byte r3 = (byte) r3     // Catch: java.nio.BufferOverflowException -> L18
                r0.put(r3)     // Catch: java.nio.BufferOverflowException -> L18
                return
            Lb:
                java.nio.ByteBuffer r0 = r2.buffer     // Catch: java.nio.BufferOverflowException -> L18
                r1 = r3 & 127(0x7f, float:1.78E-43)
                r1 = r1 | 128(0x80, float:1.8E-43)
                byte r1 = (byte) r1     // Catch: java.nio.BufferOverflowException -> L18
                r0.put(r1)     // Catch: java.nio.BufferOverflowException -> L18
                int r3 = r3 >>> 7
                goto L0
            L18:
                r3 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r3)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeUInt64NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long r5) throws java.io.IOException {
                r4 = this;
            L0:
                r0 = -128(0xffffffffffffff80, double:NaN)
                long r0 = r0 & r5
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L11
                java.nio.ByteBuffer r0 = r4.buffer     // Catch: java.nio.BufferOverflowException -> L1f
                int r5 = (int) r5     // Catch: java.nio.BufferOverflowException -> L1f
                byte r5 = (byte) r5     // Catch: java.nio.BufferOverflowException -> L1f
                r0.put(r5)     // Catch: java.nio.BufferOverflowException -> L1f
                return
            L11:
                java.nio.ByteBuffer r0 = r4.buffer     // Catch: java.nio.BufferOverflowException -> L1f
                int r1 = (int) r5     // Catch: java.nio.BufferOverflowException -> L1f
                r1 = r1 & 127(0x7f, float:1.78E-43)
                r1 = r1 | 128(0x80, float:1.8E-43)
                byte r1 = (byte) r1     // Catch: java.nio.BufferOverflowException -> L1f
                r0.put(r1)     // Catch: java.nio.BufferOverflowException -> L1f
                r0 = 7
                long r5 = r5 >>> r0
                goto L0
            L1f:
                r5 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r6 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r6.<init>(r5)
                throw r6
        }
    }

    private static final class UnsafeDirectNioEncoder extends com.google.crypto.tink.shaded.protobuf.CodedOutputStream {
        private final long address;
        private final java.nio.ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final java.nio.ByteBuffer originalBuffer;
        private long position;

        UnsafeDirectNioEncoder(java.nio.ByteBuffer r7) {
                r6 = this;
                r0 = 0
                r6.<init>(r0)
                r6.originalBuffer = r7
                java.nio.ByteBuffer r0 = r7.duplicate()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r0 = r0.order(r1)
                r6.buffer = r0
                long r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r7)
                r6.address = r0
                int r2 = r7.position()
                long r2 = (long) r2
                long r2 = r2 + r0
                r6.initialPosition = r2
                int r7 = r7.limit()
                long r4 = (long) r7
                long r0 = r0 + r4
                r6.limit = r0
                r4 = 10
                long r0 = r0 - r4
                r6.oneVarintLimit = r0
                r6.position = r2
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

        private void repositionBuffer(long r2) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buffer
                int r2 = r1.bufferPos(r2)
                r0.position(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.originalBuffer
                long r1 = r3.position
                int r1 = r3.bufferPos(r1)
                r0.position(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
                r4 = this;
                long r0 = r4.position
                long r2 = r4.initialPosition
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int spaceLeft() {
                r4 = this;
                long r0 = r4.limit
                long r2 = r4.position
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r5) throws java.io.IOException {
                r4 = this;
                long r0 = r4.position
                long r2 = r4.limit
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 >= 0) goto L11
                r2 = 1
                long r2 = r2 + r0
                r4.position = r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r5)
                return
            L11:
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r5 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                long r0 = r4.position
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                long r1 = r4.limit
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
                java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r5.<init>(r0)
                throw r5
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r6) throws java.io.IOException {
                r5 = this;
                int r0 = r6.remaining()     // Catch: java.nio.BufferOverflowException -> L15
                long r1 = r5.position     // Catch: java.nio.BufferOverflowException -> L15
                r5.repositionBuffer(r1)     // Catch: java.nio.BufferOverflowException -> L15
                java.nio.ByteBuffer r1 = r5.buffer     // Catch: java.nio.BufferOverflowException -> L15
                r1.put(r6)     // Catch: java.nio.BufferOverflowException -> L15
                long r1 = r5.position     // Catch: java.nio.BufferOverflowException -> L15
                long r3 = (long) r0     // Catch: java.nio.BufferOverflowException -> L15
                long r1 = r1 + r3
                r5.position = r1     // Catch: java.nio.BufferOverflowException -> L15
                return
            L15:
                r6 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r6)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r12, int r13, int r14) throws java.io.IOException {
                r11 = this;
                if (r12 == 0) goto L21
                if (r13 < 0) goto L21
                if (r14 < 0) goto L21
                int r0 = r12.length
                int r0 = r0 - r14
                if (r0 < r13) goto L21
                long r0 = r11.limit
                long r9 = (long) r14
                long r0 = r0 - r9
                long r5 = r11.position
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 >= 0) goto L15
                goto L21
            L15:
                long r3 = (long) r13
                r2 = r12
                r7 = r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.copyMemory(r2, r3, r5, r7)
                long r12 = r11.position
                long r12 = r12 + r9
                r11.position = r12
                return
            L21:
                if (r12 != 0) goto L2b
                java.lang.NullPointerException r12 = new java.lang.NullPointerException
                java.lang.String r13 = "value"
                r12.<init>(r13)
                throw r12
            L2b:
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r12 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                long r0 = r11.position
                java.lang.Long r13 = java.lang.Long.valueOf(r0)
                long r0 = r11.limit
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r13 = new java.lang.Object[]{r13, r0, r14}
                java.lang.String r14 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r13 = java.lang.String.format(r14, r13)
                r12.<init>(r13)
                throw r12
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int r2, boolean r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                byte r2 = (byte) r3
                r1.write(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int r3, byte[] r4) throws java.io.IOException {
                r2 = this;
                r0 = 0
                int r1 = r4.length
                r2.writeByteArray(r3, r4, r0, r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int r2, byte[] r3, int r4, int r5) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeByteArrayNoTag(r3, r4, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.writeUInt32NoTag(r3)
                r0.write(r1, r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int r2, java.nio.ByteBuffer r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                int r2 = r3.capacity()
                r1.writeUInt32NoTag(r2)
                r1.writeRawBytes(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeBytesNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.size()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.writeTag(r2, r0)
                r1.writeFixed32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int r5) throws java.io.IOException {
                r4 = this;
                java.nio.ByteBuffer r0 = r4.buffer
                long r1 = r4.position
                int r1 = r4.bufferPos(r1)
                r0.putInt(r1, r5)
                long r0 = r4.position
                r2 = 4
                long r0 = r0 + r2
                r4.position = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 1
                r1.writeTag(r2, r0)
                r1.writeFixed64NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long r4) throws java.io.IOException {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.buffer
                long r1 = r3.position
                int r1 = r3.bufferPos(r1)
                r0.putLong(r1, r4)
                long r4 = r3.position
                r0 = 8
                long r4 = r4 + r0
                r3.position = r4
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeInt32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeUInt32NoTag(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeUInt64NoTag(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r1) throws java.io.IOException {
                r0 = this;
                r0.write(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.write(r1, r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        void writeMessage(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.getSerializedSize()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r2, com.google.crypto.tink.shaded.protobuf.Schema r3) throws java.io.IOException {
                r1 = this;
                r0 = r2
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r0
                int r0 = r0.getSerializedSize(r3)
                r1.writeUInt32NoTag(r0)
                com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r0 = r1.wrapper
                r3.writeTo(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int r4, com.google.crypto.tink.shaded.protobuf.MessageLite r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeMessage(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(java.nio.ByteBuffer r3) throws java.io.IOException {
                r2 = this;
                boolean r0 = r3.hasArray()
                if (r0 == 0) goto L16
                byte[] r0 = r3.array()
                int r1 = r3.arrayOffset()
                int r3 = r3.capacity()
                r2.write(r0, r1, r3)
                goto L20
            L16:
                java.nio.ByteBuffer r3 = r3.duplicate()
                r3.clear()
                r2.write(r3)
            L20:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int r4, com.google.crypto.tink.shaded.protobuf.ByteString r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeBytes(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int r2, java.lang.String r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeStringNoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String r8) throws java.io.IOException {
                r7 = this;
                long r0 = r7.position
                int r2 = r8.length()     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                int r2 = r2 * 3
                int r2 = computeUInt32SizeNoTag(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                int r3 = r8.length()     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                int r3 = computeUInt32SizeNoTag(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                if (r3 != r2) goto L38
                long r4 = r7.position     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                int r2 = r7.bufferPos(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                int r2 = r2 + r3
                java.nio.ByteBuffer r3 = r7.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                r3.position(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                java.nio.ByteBuffer r3 = r7.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                com.google.crypto.tink.shaded.protobuf.Utf8.encodeUtf8(r8, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                java.nio.ByteBuffer r3 = r7.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                int r3 = r3.position()     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                int r3 = r3 - r2
                r7.writeUInt32NoTag(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                long r4 = r7.position     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                long r2 = (long) r3     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                long r4 = r4 + r2
                r7.position = r4     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                goto L67
            L38:
                int r2 = com.google.crypto.tink.shaded.protobuf.Utf8.encodedLength(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                r7.writeUInt32NoTag(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                long r3 = r7.position     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                r7.repositionBuffer(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                java.nio.ByteBuffer r3 = r7.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                com.google.crypto.tink.shaded.protobuf.Utf8.encodeUtf8(r8, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                long r3 = r7.position     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                long r5 = (long) r2     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                long r3 = r3 + r5
                r7.position = r3     // Catch: java.lang.IndexOutOfBoundsException -> L50 java.lang.IllegalArgumentException -> L57 com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5e
                goto L67
            L50:
                r8 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r8)
                throw r0
            L57:
                r8 = move-exception
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r8)
                throw r0
            L5e:
                r2 = move-exception
                r7.position = r0
                r7.repositionBuffer(r0)
                r7.inefficientWriteStringNoTag(r8, r2)
            L67:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int r1, int r2) throws java.io.IOException {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
                r0.writeUInt32NoTag(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeUInt32NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int r8) throws java.io.IOException {
                r7 = this;
                long r0 = r7.position
                long r2 = r7.oneVarintLimit
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r1 = 1
                if (r0 > 0) goto L29
            La:
                r0 = r8 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L18
                long r3 = r7.position
                long r1 = r1 + r3
                r7.position = r1
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r3, r8)
                return
            L18:
                long r3 = r7.position
                long r5 = r3 + r1
                r7.position = r5
                r0 = r8 & 127(0x7f, float:1.78E-43)
                r0 = r0 | 128(0x80, float:1.8E-43)
                byte r0 = (byte) r0
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r3, r0)
                int r8 = r8 >>> 7
                goto La
            L29:
                long r3 = r7.position
                long r5 = r7.limit
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L4c
                r0 = r8 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L3d
                long r1 = r1 + r3
                r7.position = r1
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r3, r8)
                return
            L3d:
                long r5 = r3 + r1
                r7.position = r5
                r0 = r8 & 127(0x7f, float:1.78E-43)
                r0 = r0 | 128(0x80, float:1.8E-43)
                byte r0 = (byte) r0
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r3, r0)
                int r8 = r8 >>> 7
                goto L29
            L4c:
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r8 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                long r0 = r7.position
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                long r1 = r7.limit
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
                java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r8.<init>(r0)
                throw r8
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeUInt64NoTag(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long r13) throws java.io.IOException {
                r12 = this;
                long r0 = r12.position
                long r2 = r12.oneVarintLimit
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r1 = 7
                r2 = 0
                r4 = -128(0xffffffffffffff80, double:NaN)
                r6 = 1
                if (r0 > 0) goto L31
            Lf:
                long r8 = r13 & r4
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 != 0) goto L20
                long r0 = r12.position
                long r6 = r6 + r0
                r12.position = r6
                int r13 = (int) r13
                byte r13 = (byte) r13
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r13)
                return
            L20:
                long r8 = r12.position
                long r10 = r8 + r6
                r12.position = r10
                int r0 = (int) r13
                r0 = r0 & 127(0x7f, float:1.78E-43)
                r0 = r0 | 128(0x80, float:1.8E-43)
                byte r0 = (byte) r0
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r0)
                long r13 = r13 >>> r1
                goto Lf
            L31:
                long r8 = r12.position
                long r10 = r12.limit
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 >= 0) goto L57
                long r10 = r13 & r4
                int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r0 != 0) goto L48
                long r6 = r6 + r8
                r12.position = r6
                int r13 = (int) r13
                byte r13 = (byte) r13
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r13)
                return
            L48:
                long r10 = r8 + r6
                r12.position = r10
                int r0 = (int) r13
                r0 = r0 & 127(0x7f, float:1.78E-43)
                r0 = r0 | 128(0x80, float:1.8E-43)
                byte r0 = (byte) r0
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r0)
                long r13 = r13 >>> r1
                goto L31
            L57:
                com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r13 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
                long r0 = r12.position
                java.lang.Long r14 = java.lang.Long.valueOf(r0)
                long r0 = r12.limit
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r1 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r14 = new java.lang.Object[]{r14, r0, r1}
                java.lang.String r0 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r14 = java.lang.String.format(r0, r14)
                r13.<init>(r14)
                throw r13
        }
    }

    static {
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.CodedOutputStream> r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream.logger = r0
            boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeArrayOperations()
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS = r0
            return
    }

    private CodedOutputStream() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ CodedOutputStream(com.google.crypto.tink.shaded.protobuf.CodedOutputStream.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean access$100() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS
            return r0
    }

    public static int computeBoolSize(int r0, boolean r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeBoolSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeBoolSizeNoTag(boolean r0) {
            r0 = 1
            return r0
    }

    public static int computeByteArraySize(int r0, byte[] r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeByteArraySizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeByteArraySizeNoTag(byte[] r0) {
            int r0 = r0.length
            int r0 = computeLengthDelimitedFieldSize(r0)
            return r0
    }

    public static int computeByteBufferSize(int r0, java.nio.ByteBuffer r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeByteBufferSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeByteBufferSizeNoTag(java.nio.ByteBuffer r0) {
            int r0 = r0.capacity()
            int r0 = computeLengthDelimitedFieldSize(r0)
            return r0
    }

    public static int computeBytesSize(int r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeBytesSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeBytesSizeNoTag(com.google.crypto.tink.shaded.protobuf.ByteString r0) {
            int r0 = r0.size()
            int r0 = computeLengthDelimitedFieldSize(r0)
            return r0
    }

    public static int computeDoubleSize(int r0, double r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeDoubleSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeDoubleSizeNoTag(double r0) {
            r0 = 8
            return r0
    }

    public static int computeEnumSize(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeEnumSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeEnumSizeNoTag(int r0) {
            int r0 = computeInt32SizeNoTag(r0)
            return r0
    }

    public static int computeFixed32Size(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeFixed32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeFixed32SizeNoTag(int r0) {
            r0 = 4
            return r0
    }

    public static int computeFixed64Size(int r0, long r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeFixed64SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeFixed64SizeNoTag(long r0) {
            r0 = 8
            return r0
    }

    public static int computeFloatSize(int r0, float r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeFloatSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeFloatSizeNoTag(float r0) {
            r0 = 4
            return r0
    }

    @java.lang.Deprecated
    public static int computeGroupSize(int r0, com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
            int r0 = computeTagSize(r0)
            int r0 = r0 * 2
            int r1 = r1.getSerializedSize()
            int r0 = r0 + r1
            return r0
    }

    @java.lang.Deprecated
    static int computeGroupSize(int r0, com.google.crypto.tink.shaded.protobuf.MessageLite r1, com.google.crypto.tink.shaded.protobuf.Schema r2) {
            int r0 = computeTagSize(r0)
            int r0 = r0 * 2
            int r1 = computeGroupSizeNoTag(r1, r2)
            int r0 = r0 + r1
            return r0
    }

    @java.lang.Deprecated
    public static int computeGroupSizeNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r0) {
            int r0 = r0.getSerializedSize()
            return r0
    }

    @java.lang.Deprecated
    static int computeGroupSizeNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r0, com.google.crypto.tink.shaded.protobuf.Schema r1) {
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r0
            int r0 = r0.getSerializedSize(r1)
            return r0
    }

    public static int computeInt32Size(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeInt32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeInt32SizeNoTag(int r0) {
            if (r0 < 0) goto L7
            int r0 = computeUInt32SizeNoTag(r0)
            return r0
        L7:
            r0 = 10
            return r0
    }

    public static int computeInt64Size(int r0, long r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeInt64SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeInt64SizeNoTag(long r0) {
            int r0 = computeUInt64SizeNoTag(r0)
            return r0
    }

    public static int computeLazyFieldMessageSetExtensionSize(int r2, com.google.crypto.tink.shaded.protobuf.LazyFieldLite r3) {
            r0 = 1
            int r0 = computeTagSize(r0)
            r1 = 2
            int r0 = r0 * r1
            int r2 = computeUInt32Size(r1, r2)
            int r0 = r0 + r2
            r2 = 3
            int r2 = computeLazyFieldSize(r2, r3)
            int r0 = r0 + r2
            return r0
    }

    public static int computeLazyFieldSize(int r0, com.google.crypto.tink.shaded.protobuf.LazyFieldLite r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeLazyFieldSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeLazyFieldSizeNoTag(com.google.crypto.tink.shaded.protobuf.LazyFieldLite r0) {
            int r0 = r0.getSerializedSize()
            int r0 = computeLengthDelimitedFieldSize(r0)
            return r0
    }

    static int computeLengthDelimitedFieldSize(int r1) {
            int r0 = computeUInt32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeMessageSetExtensionSize(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) {
            r0 = 1
            int r0 = computeTagSize(r0)
            r1 = 2
            int r0 = r0 * r1
            int r2 = computeUInt32Size(r1, r2)
            int r0 = r0 + r2
            r2 = 3
            int r2 = computeMessageSize(r2, r3)
            int r0 = r0 + r2
            return r0
    }

    public static int computeMessageSize(int r0, com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeMessageSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    static int computeMessageSize(int r0, com.google.crypto.tink.shaded.protobuf.MessageLite r1, com.google.crypto.tink.shaded.protobuf.Schema r2) {
            int r0 = computeTagSize(r0)
            int r1 = computeMessageSizeNoTag(r1, r2)
            int r0 = r0 + r1
            return r0
    }

    public static int computeMessageSizeNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r0) {
            int r0 = r0.getSerializedSize()
            int r0 = computeLengthDelimitedFieldSize(r0)
            return r0
    }

    static int computeMessageSizeNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r0, com.google.crypto.tink.shaded.protobuf.Schema r1) {
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r0
            int r0 = r0.getSerializedSize(r1)
            int r0 = computeLengthDelimitedFieldSize(r0)
            return r0
    }

    static int computePreferredBufferSize(int r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 <= r0) goto L5
            return r0
        L5:
            return r1
    }

    public static int computeRawMessageSetExtensionSize(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r0 = 1
            int r0 = computeTagSize(r0)
            r1 = 2
            int r0 = r0 * r1
            int r2 = computeUInt32Size(r1, r2)
            int r0 = r0 + r2
            r2 = 3
            int r2 = computeBytesSize(r2, r3)
            int r0 = r0 + r2
            return r0
    }

    @java.lang.Deprecated
    public static int computeRawVarint32Size(int r0) {
            int r0 = computeUInt32SizeNoTag(r0)
            return r0
    }

    @java.lang.Deprecated
    public static int computeRawVarint64Size(long r0) {
            int r0 = computeUInt64SizeNoTag(r0)
            return r0
    }

    public static int computeSFixed32Size(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeSFixed32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeSFixed32SizeNoTag(int r0) {
            r0 = 4
            return r0
    }

    public static int computeSFixed64Size(int r0, long r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeSFixed64SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeSFixed64SizeNoTag(long r0) {
            r0 = 8
            return r0
    }

    public static int computeSInt32Size(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeSInt32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeSInt32SizeNoTag(int r0) {
            int r0 = encodeZigZag32(r0)
            int r0 = computeUInt32SizeNoTag(r0)
            return r0
    }

    public static int computeSInt64Size(int r0, long r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeSInt64SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeSInt64SizeNoTag(long r0) {
            long r0 = encodeZigZag64(r0)
            int r0 = computeUInt64SizeNoTag(r0)
            return r0
    }

    public static int computeStringSize(int r0, java.lang.String r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeStringSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeStringSizeNoTag(java.lang.String r1) {
            int r1 = com.google.crypto.tink.shaded.protobuf.Utf8.encodedLength(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException -> L5
            goto Lc
        L5:
            java.nio.charset.Charset r0 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
        Lc:
            int r1 = computeLengthDelimitedFieldSize(r1)
            return r1
    }

    public static int computeTagSize(int r1) {
            r0 = 0
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r0)
            int r1 = computeUInt32SizeNoTag(r1)
            return r1
    }

    public static int computeUInt32Size(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeUInt32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeUInt32SizeNoTag(int r1) {
            r0 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r0 = r1 & (-16384(0xffffffffffffc000, float:NaN))
            if (r0 != 0) goto Lc
            r1 = 2
            return r1
        Lc:
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r0 & r1
            if (r0 != 0) goto L13
            r1 = 3
            return r1
        L13:
            r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r1 = r1 & r0
            if (r1 != 0) goto L1a
            r1 = 4
            return r1
        L1a:
            r1 = 5
            return r1
    }

    public static int computeUInt64Size(int r0, long r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeUInt64SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeUInt64SizeNoTag(long r6) {
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r6
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            r6 = 1
            return r6
        Lb:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L12
            r6 = 10
            return r6
        L12:
            r0 = -34359738368(0xfffffff800000000, double:NaN)
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L21
            r0 = 28
            long r6 = r6 >>> r0
            r0 = 6
            goto L22
        L21:
            r0 = 2
        L22:
            r4 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L2f
            int r0 = r0 + 2
            r1 = 14
            long r6 = r6 >>> r1
        L2f:
            r4 = -16384(0xffffffffffffc000, double:NaN)
            long r6 = r6 & r4
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L38
            int r0 = r0 + 1
        L38:
            return r0
    }

    public static int encodeZigZag32(int r1) {
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            return r1
    }

    public static long encodeZigZag64(long r3) {
            r0 = 1
            long r0 = r3 << r0
            r2 = 63
            long r3 = r3 >> r2
            long r3 = r3 ^ r0
            return r3
    }

    static com.google.crypto.tink.shaded.protobuf.CodedOutputStream newInstance(com.google.crypto.tink.shaded.protobuf.ByteOutput r1, int r2) {
            if (r2 < 0) goto L8
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream$ByteOutputEncoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$ByteOutputEncoder
            r0.<init>(r1, r2)
            return r0
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "bufferSize must be positive"
            r1.<init>(r2)
            throw r1
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedOutputStream newInstance(java.io.OutputStream r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = newInstance(r1, r0)
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedOutputStream newInstance(java.io.OutputStream r1, int r2) {
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutputStreamEncoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutputStreamEncoder
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedOutputStream newInstance(java.nio.ByteBuffer r1) {
            boolean r0 = r1.hasArray()
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream$HeapNioEncoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$HeapNioEncoder
            r0.<init>(r1)
            return r0
        Lc:
            boolean r0 = r1.isDirect()
            if (r0 == 0) goto L28
            boolean r0 = r1.isReadOnly()
            if (r0 != 0) goto L28
            boolean r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.UnsafeDirectNioEncoder.isSupported()
            if (r0 == 0) goto L23
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = newUnsafeInstance(r1)
            goto L27
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = newSafeInstance(r1)
        L27:
            return r1
        L28:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ByteBuffer is read-only"
            r1.<init>(r0)
            throw r1
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.shaded.protobuf.CodedOutputStream newInstance(java.nio.ByteBuffer r0, int r1) {
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = newInstance(r0)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedOutputStream newInstance(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = newInstance(r2, r0, r1)
            return r2
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedOutputStream newInstance(byte[] r1, int r2, int r3) {
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream$ArrayEncoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$ArrayEncoder
            r0.<init>(r1, r2, r3)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.CodedOutputStream newSafeInstance(java.nio.ByteBuffer r1) {
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream$SafeDirectNioEncoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$SafeDirectNioEncoder
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.CodedOutputStream newUnsafeInstance(java.nio.ByteBuffer r1) {
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream$UnsafeDirectNioEncoder r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$UnsafeDirectNioEncoder
            r0.<init>(r1)
            return r0
    }

    public final void checkNoSpaceLeft() {
            r2 = this;
            int r0 = r2.spaceLeft()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Did not write as much data as expected."
            r0.<init>(r1)
            throw r0
    }

    public abstract void flush() throws java.io.IOException;

    public abstract int getTotalBytesWritten();

    final void inefficientWriteStringNoTag(java.lang.String r4, com.google.crypto.tink.shaded.protobuf.Utf8.UnpairedSurrogateException r5) throws java.io.IOException {
            r3 = this;
            java.util.logging.Logger r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r2 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            r0.log(r1, r2, r5)
            java.nio.charset.Charset r5 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
            byte[] r4 = r4.getBytes(r5)
            int r5 = r4.length     // Catch: java.lang.IndexOutOfBoundsException -> L19
            r3.writeUInt32NoTag(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L19
            int r5 = r4.length     // Catch: java.lang.IndexOutOfBoundsException -> L19
            r0 = 0
            r3.writeLazy(r4, r0, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L19
            return
        L19:
            r4 = move-exception
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException r5 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException
            r5.<init>(r4)
            throw r5
    }

    boolean isSerializationDeterministic() {
            r1 = this;
            boolean r0 = r1.serializationDeterministic
            return r0
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
            r1 = this;
            r0 = 1
            r1.serializationDeterministic = r0
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void write(byte r1) throws java.io.IOException;

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void write(java.nio.ByteBuffer r1) throws java.io.IOException;

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void write(byte[] r1, int r2, int r3) throws java.io.IOException;

    public abstract void writeBool(int r1, boolean r2) throws java.io.IOException;

    public final void writeBoolNoTag(boolean r1) throws java.io.IOException {
            r0 = this;
            byte r1 = (byte) r1
            r0.write(r1)
            return
    }

    public abstract void writeByteArray(int r1, byte[] r2) throws java.io.IOException;

    public abstract void writeByteArray(int r1, byte[] r2, int r3, int r4) throws java.io.IOException;

    public final void writeByteArrayNoTag(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.writeByteArrayNoTag(r3, r0, r1)
            return
    }

    abstract void writeByteArrayNoTag(byte[] r1, int r2, int r3) throws java.io.IOException;

    public abstract void writeByteBuffer(int r1, java.nio.ByteBuffer r2) throws java.io.IOException;

    public abstract void writeBytes(int r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) throws java.io.IOException;

    public abstract void writeBytesNoTag(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws java.io.IOException;

    public final void writeDouble(int r1, double r2) throws java.io.IOException {
            r0 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r0.writeFixed64(r1, r2)
            return
    }

    public final void writeDoubleNoTag(double r1) throws java.io.IOException {
            r0 = this;
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r0.writeFixed64NoTag(r1)
            return
    }

    public final void writeEnum(int r1, int r2) throws java.io.IOException {
            r0 = this;
            r0.writeInt32(r1, r2)
            return
    }

    public final void writeEnumNoTag(int r1) throws java.io.IOException {
            r0 = this;
            r0.writeInt32NoTag(r1)
            return
    }

    public abstract void writeFixed32(int r1, int r2) throws java.io.IOException;

    public abstract void writeFixed32NoTag(int r1) throws java.io.IOException;

    public abstract void writeFixed64(int r1, long r2) throws java.io.IOException;

    public abstract void writeFixed64NoTag(long r1) throws java.io.IOException;

    public final void writeFloat(int r1, float r2) throws java.io.IOException {
            r0 = this;
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r0.writeFixed32(r1, r2)
            return
    }

    public final void writeFloatNoTag(float r1) throws java.io.IOException {
            r0 = this;
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r0.writeFixed32NoTag(r1)
            return
    }

    @java.lang.Deprecated
    public final void writeGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) throws java.io.IOException {
            r1 = this;
            r0 = 3
            r1.writeTag(r2, r0)
            r1.writeGroupNoTag(r3)
            r3 = 4
            r1.writeTag(r2, r3)
            return
    }

    @java.lang.Deprecated
    final void writeGroup(int r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
            r1 = this;
            r0 = 3
            r1.writeTag(r2, r0)
            r1.writeGroupNoTag(r3, r4)
            r3 = 4
            r1.writeTag(r2, r3)
            return
    }

    @java.lang.Deprecated
    public final void writeGroupNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.io.IOException {
            r0 = this;
            r1.writeTo(r0)
            return
    }

    @java.lang.Deprecated
    final void writeGroupNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r2, com.google.crypto.tink.shaded.protobuf.Schema r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r0 = r1.wrapper
            r3.writeTo(r2, r0)
            return
    }

    public abstract void writeInt32(int r1, int r2) throws java.io.IOException;

    public abstract void writeInt32NoTag(int r1) throws java.io.IOException;

    public final void writeInt64(int r1, long r2) throws java.io.IOException {
            r0 = this;
            r0.writeUInt64(r1, r2)
            return
    }

    public final void writeInt64NoTag(long r1) throws java.io.IOException {
            r0 = this;
            r0.writeUInt64NoTag(r1)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void writeLazy(java.nio.ByteBuffer r1) throws java.io.IOException;

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void writeLazy(byte[] r1, int r2, int r3) throws java.io.IOException;

    public abstract void writeMessage(int r1, com.google.crypto.tink.shaded.protobuf.MessageLite r2) throws java.io.IOException;

    abstract void writeMessage(int r1, com.google.crypto.tink.shaded.protobuf.MessageLite r2, com.google.crypto.tink.shaded.protobuf.Schema r3) throws java.io.IOException;

    public abstract void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.io.IOException;

    abstract void writeMessageNoTag(com.google.crypto.tink.shaded.protobuf.MessageLite r1, com.google.crypto.tink.shaded.protobuf.Schema r2) throws java.io.IOException;

    public abstract void writeMessageSetExtension(int r1, com.google.crypto.tink.shaded.protobuf.MessageLite r2) throws java.io.IOException;

    public final void writeRawByte(byte r1) throws java.io.IOException {
            r0 = this;
            r0.write(r1)
            return
    }

    public final void writeRawByte(int r1) throws java.io.IOException {
            r0 = this;
            byte r1 = (byte) r1
            r0.write(r1)
            return
    }

    public final void writeRawBytes(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws java.io.IOException {
            r0 = this;
            r1.writeTo(r0)
            return
    }

    public abstract void writeRawBytes(java.nio.ByteBuffer r1) throws java.io.IOException;

    public final void writeRawBytes(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    public final void writeRawBytes(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            r0.write(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public final void writeRawLittleEndian32(int r1) throws java.io.IOException {
            r0 = this;
            r0.writeFixed32NoTag(r1)
            return
    }

    @java.lang.Deprecated
    public final void writeRawLittleEndian64(long r1) throws java.io.IOException {
            r0 = this;
            r0.writeFixed64NoTag(r1)
            return
    }

    public abstract void writeRawMessageSetExtension(int r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) throws java.io.IOException;

    @java.lang.Deprecated
    public final void writeRawVarint32(int r1) throws java.io.IOException {
            r0 = this;
            r0.writeUInt32NoTag(r1)
            return
    }

    @java.lang.Deprecated
    public final void writeRawVarint64(long r1) throws java.io.IOException {
            r0 = this;
            r0.writeUInt64NoTag(r1)
            return
    }

    public final void writeSFixed32(int r1, int r2) throws java.io.IOException {
            r0 = this;
            r0.writeFixed32(r1, r2)
            return
    }

    public final void writeSFixed32NoTag(int r1) throws java.io.IOException {
            r0 = this;
            r0.writeFixed32NoTag(r1)
            return
    }

    public final void writeSFixed64(int r1, long r2) throws java.io.IOException {
            r0 = this;
            r0.writeFixed64(r1, r2)
            return
    }

    public final void writeSFixed64NoTag(long r1) throws java.io.IOException {
            r0 = this;
            r0.writeFixed64NoTag(r1)
            return
    }

    public final void writeSInt32(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r2 = encodeZigZag32(r2)
            r0.writeUInt32(r1, r2)
            return
    }

    public final void writeSInt32NoTag(int r1) throws java.io.IOException {
            r0 = this;
            int r1 = encodeZigZag32(r1)
            r0.writeUInt32NoTag(r1)
            return
    }

    public final void writeSInt64(int r1, long r2) throws java.io.IOException {
            r0 = this;
            long r2 = encodeZigZag64(r2)
            r0.writeUInt64(r1, r2)
            return
    }

    public final void writeSInt64NoTag(long r1) throws java.io.IOException {
            r0 = this;
            long r1 = encodeZigZag64(r1)
            r0.writeUInt64NoTag(r1)
            return
    }

    public abstract void writeString(int r1, java.lang.String r2) throws java.io.IOException;

    public abstract void writeStringNoTag(java.lang.String r1) throws java.io.IOException;

    public abstract void writeTag(int r1, int r2) throws java.io.IOException;

    public abstract void writeUInt32(int r1, int r2) throws java.io.IOException;

    public abstract void writeUInt32NoTag(int r1) throws java.io.IOException;

    public abstract void writeUInt64(int r1, long r2) throws java.io.IOException;

    public abstract void writeUInt64NoTag(long r1) throws java.io.IOException;
}
