package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class MetadataListReader {
    private static final int EMJI_TAG = 1164798569;
    private static final int EMJI_TAG_DEPRECATED = 1701669481;
    private static final int META_TABLE_NAME = 1835365473;

    private static class ByteBufferReader implements androidx.emoji2.text.MetadataListReader.OpenTypeReader {
        private final java.nio.ByteBuffer mByteBuffer;

        ByteBufferReader(java.nio.ByteBuffer r2) {
                r1 = this;
                r1.<init>()
                r1.mByteBuffer = r2
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r2.order(r0)
                return
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.mByteBuffer
                int r0 = r0.position()
                long r0 = (long) r0
                return r0
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.mByteBuffer
                int r0 = r0.getInt()
                return r0
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.mByteBuffer
                int r0 = r0.getInt()
                long r0 = androidx.emoji2.text.MetadataListReader.toUnsignedInt(r0)
                return r0
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.mByteBuffer
                short r0 = r0.getShort()
                int r0 = androidx.emoji2.text.MetadataListReader.toUnsignedShort(r0)
                return r0
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int r3) throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.mByteBuffer
                int r1 = r0.position()
                int r1 = r1 + r3
                r0.position(r1)
                return
        }
    }

    private static class InputStreamOpenTypeReader implements androidx.emoji2.text.MetadataListReader.OpenTypeReader {
        private final byte[] mByteArray;
        private final java.nio.ByteBuffer mByteBuffer;
        private final java.io.InputStream mInputStream;
        private long mPosition;

        InputStreamOpenTypeReader(java.io.InputStream r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mPosition = r0
                r2.mInputStream = r3
                r3 = 4
                byte[] r3 = new byte[r3]
                r2.mByteArray = r3
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
                r2.mByteBuffer = r3
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r3.order(r0)
                return
        }

        private void read(int r5) throws java.io.IOException {
                r4 = this;
                java.io.InputStream r0 = r4.mInputStream
                byte[] r1 = r4.mByteArray
                r2 = 0
                int r0 = r0.read(r1, r2, r5)
                if (r0 != r5) goto L12
                long r0 = r4.mPosition
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.mPosition = r0
                return
            L12:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r0 = "read failed"
                r5.<init>(r0)
                throw r5
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
                r2 = this;
                long r0 = r2.mPosition
                return r0
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.mByteBuffer
                r1 = 0
                r0.position(r1)
                r0 = 4
                r2.read(r0)
                java.nio.ByteBuffer r0 = r2.mByteBuffer
                int r0 = r0.getInt()
                return r0
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.mByteBuffer
                r1 = 0
                r0.position(r1)
                r0 = 4
                r2.read(r0)
                java.nio.ByteBuffer r0 = r2.mByteBuffer
                int r0 = r0.getInt()
                long r0 = androidx.emoji2.text.MetadataListReader.toUnsignedInt(r0)
                return r0
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.mByteBuffer
                r1 = 0
                r0.position(r1)
                r0 = 2
                r2.read(r0)
                java.nio.ByteBuffer r0 = r2.mByteBuffer
                short r0 = r0.getShort()
                int r0 = androidx.emoji2.text.MetadataListReader.toUnsignedShort(r0)
                return r0
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int r6) throws java.io.IOException {
                r5 = this;
            L0:
                if (r6 <= 0) goto L1d
                java.io.InputStream r0 = r5.mInputStream
                long r1 = (long) r6
                long r0 = r0.skip(r1)
                int r0 = (int) r0
                r1 = 1
                if (r0 < r1) goto L15
                int r6 = r6 - r0
                long r1 = r5.mPosition
                long r3 = (long) r0
                long r1 = r1 + r3
                r5.mPosition = r1
                goto L0
            L15:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r0 = "Skip didn't move at least 1 byte forward"
                r6.<init>(r0)
                throw r6
            L1d:
                return
        }
    }

    private static class OffsetInfo {
        private final long mLength;
        private final long mStartOffset;

        OffsetInfo(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.mStartOffset = r1
                r0.mLength = r3
                return
        }

        long getLength() {
                r2 = this;
                long r0 = r2.mLength
                return r0
        }

        long getStartOffset() {
                r2 = this;
                long r0 = r2.mStartOffset
                return r0
        }
    }

    private interface OpenTypeReader {
        public static final int UINT16_BYTE_COUNT = 2;
        public static final int UINT32_BYTE_COUNT = 4;

        long getPosition();

        int readTag() throws java.io.IOException;

        long readUnsignedInt() throws java.io.IOException;

        int readUnsignedShort() throws java.io.IOException;

        void skip(int r1) throws java.io.IOException;
    }

    private MetadataListReader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.emoji2.text.MetadataListReader.OffsetInfo findOffsetInfo(androidx.emoji2.text.MetadataListReader.OpenTypeReader r12) throws java.io.IOException {
            r0 = 4
            r12.skip(r0)
            int r1 = r12.readUnsignedShort()
            r2 = 100
            java.lang.String r3 = "Cannot read metadata."
            if (r1 > r2) goto L73
            r2 = 6
            r12.skip(r2)
            r2 = 0
            r4 = r2
        L14:
            r5 = -1
            if (r4 >= r1) goto L2f
            int r7 = r12.readTag()
            r12.skip(r0)
            long r8 = r12.readUnsignedInt()
            r12.skip(r0)
            r10 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r10 != r7) goto L2c
            goto L30
        L2c:
            int r4 = r4 + 1
            goto L14
        L2f:
            r8 = r5
        L30:
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L6d
            long r0 = r12.getPosition()
            long r0 = r8 - r0
            int r0 = (int) r0
            r12.skip(r0)
            r0 = 12
            r12.skip(r0)
            long r0 = r12.readUnsignedInt()
        L47:
            long r4 = (long) r2
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L6d
            int r4 = r12.readTag()
            long r5 = r12.readUnsignedInt()
            long r10 = r12.readUnsignedInt()
            r7 = 1164798569(0x456d6a69, float:3798.6506)
            if (r7 == r4) goto L66
            r7 = 1701669481(0x656d6a69, float:7.0072736E22)
            if (r7 != r4) goto L63
            goto L66
        L63:
            int r2 = r2 + 1
            goto L47
        L66:
            androidx.emoji2.text.MetadataListReader$OffsetInfo r12 = new androidx.emoji2.text.MetadataListReader$OffsetInfo
            long r5 = r5 + r8
            r12.<init>(r5, r10)
            return r12
        L6d:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r3)
            throw r12
        L73:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r3)
            throw r12
    }

    static androidx.emoji2.text.flatbuffer.MetadataList read(android.content.res.AssetManager r0, java.lang.String r1) throws java.io.IOException {
            java.io.InputStream r0 = r0.open(r1)
            androidx.emoji2.text.flatbuffer.MetadataList r1 = read(r0)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Ld
            r0.close()
        Ld:
            return r1
        Le:
            r1 = move-exception
            if (r0 == 0) goto L19
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r1.addSuppressed(r0)
        L19:
            throw r1
    }

    static androidx.emoji2.text.flatbuffer.MetadataList read(java.io.InputStream r6) throws java.io.IOException {
            androidx.emoji2.text.MetadataListReader$InputStreamOpenTypeReader r0 = new androidx.emoji2.text.MetadataListReader$InputStreamOpenTypeReader
            r0.<init>(r6)
            androidx.emoji2.text.MetadataListReader$OffsetInfo r1 = findOffsetInfo(r0)
            long r2 = r1.getStartOffset()
            long r4 = r0.getPosition()
            long r2 = r2 - r4
            int r2 = (int) r2
            r0.skip(r2)
            long r2 = r1.getLength()
            int r0 = (int) r2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            byte[] r2 = r0.array()
            int r6 = r6.read(r2)
            long r2 = (long) r6
            long r4 = r1.getLength()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L35
            androidx.emoji2.text.flatbuffer.MetadataList r6 = androidx.emoji2.text.flatbuffer.MetadataList.getRootAsMetadataList(r0)
            return r6
        L35:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Needed "
            r2.<init>(r3)
            long r3 = r1.getLength()
            java.lang.StringBuilder r1 = r2.append(r3)
            java.lang.String r2 = " bytes, got "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }

    static androidx.emoji2.text.flatbuffer.MetadataList read(java.nio.ByteBuffer r2) throws java.io.IOException {
            java.nio.ByteBuffer r2 = r2.duplicate()
            androidx.emoji2.text.MetadataListReader$ByteBufferReader r0 = new androidx.emoji2.text.MetadataListReader$ByteBufferReader
            r0.<init>(r2)
            androidx.emoji2.text.MetadataListReader$OffsetInfo r0 = findOffsetInfo(r0)
            long r0 = r0.getStartOffset()
            int r0 = (int) r0
            r2.position(r0)
            androidx.emoji2.text.flatbuffer.MetadataList r2 = androidx.emoji2.text.flatbuffer.MetadataList.getRootAsMetadataList(r2)
            return r2
    }

    static long toUnsignedInt(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    static int toUnsignedShort(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            return r1
    }
}
