package org.apache.commons.compress.compressors.snappy;

/* JADX INFO: loaded from: classes2.dex */
public class SnappyCompressorInputStream extends org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream {
    public static final int DEFAULT_BLOCK_SIZE = 32768;
    private static final int TAG_MASK = 3;
    private boolean endReached;
    private final int size;
    private org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State state;
    private int uncompressedBytesRemaining;

    /* JADX INFO: renamed from: org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$compress$compressors$snappy$SnappyCompressorInputStream$State = null;

        static {
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State[] r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$snappy$SnappyCompressorInputStream$State = r0
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r1 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.NO_BLOCK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$snappy$SnappyCompressorInputStream$State     // Catch: java.lang.NoSuchFieldError -> L1d
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r1 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.IN_LITERAL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$snappy$SnappyCompressorInputStream$State     // Catch: java.lang.NoSuchFieldError -> L28
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r1 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.IN_BACK_REFERENCE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    private enum State extends java.lang.Enum<org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State> {
        private static final /* synthetic */ org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State[] $VALUES = null;
        public static final org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State IN_BACK_REFERENCE = null;
        public static final org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State IN_LITERAL = null;
        public static final org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State NO_BLOCK = null;

        private static /* synthetic */ org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State[] $values() {
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.NO_BLOCK
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r1 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.IN_LITERAL
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r2 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.IN_BACK_REFERENCE
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State[] r0 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State[]{r0, r1, r2}
                return r0
        }

        static {
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r0 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State
                java.lang.String r1 = "NO_BLOCK"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.NO_BLOCK = r0
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r0 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State
                java.lang.String r1 = "IN_LITERAL"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.IN_LITERAL = r0
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r0 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State
                java.lang.String r1 = "IN_BACK_REFERENCE"
                r2 = 2
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.IN_BACK_REFERENCE = r0
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State[] r0 = $values()
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State> r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r1 = (org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State) r1
                return r1
        }

        public static org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State[] values() {
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State[] r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State[] r0 = (org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State[]) r0
                return r0
        }
    }

    public SnappyCompressorInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 32768(0x8000, float:4.5918E-41)
            r1.<init>(r2, r0)
            return
    }

    public SnappyCompressorInputStream(java.io.InputStream r1, int r2) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1, r2)
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r1 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.NO_BLOCK
            r0.state = r1
            long r1 = r0.readSize()
            int r1 = (int) r1
            r0.size = r1
            r0.uncompressedBytesRemaining = r1
            return
    }

    private void fill() throws java.io.IOException {
            r8 = this;
            int r0 = r8.uncompressedBytesRemaining
            r1 = 1
            if (r0 != 0) goto L8
            r8.endReached = r1
            return
        L8:
            int r0 = r8.readOneByte()
            r2 = -1
            if (r0 == r2) goto Lba
            r3 = r0 & 3
            if (r3 == 0) goto L9e
            r4 = 4
            java.lang.String r5 = "Illegal block with bad offset found"
            r6 = 3
            if (r3 == r1) goto L72
            java.lang.String r2 = "Illegal block with a negative match length found"
            r7 = 2
            if (r3 == r7) goto L4c
            if (r3 == r6) goto L22
            goto Lb1
        L22:
            int r0 = r0 >> r7
            int r0 = r0 + r1
            if (r0 < 0) goto L46
            int r1 = r8.uncompressedBytesRemaining
            int r1 = r1 - r0
            r8.uncompressedBytesRemaining = r1
            org.apache.commons.compress.utils.ByteUtils$ByteSupplier r1 = r8.supplier
            long r1 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r1, r4)
            int r1 = (int) r1
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            long r2 = (long) r0
            r8.startBackReference(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L3f
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.IN_BACK_REFERENCE
            r8.state = r0
            goto Lb1
        L3f:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r5, r0)
            throw r1
        L46:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        L4c:
            int r0 = r0 >> r7
            int r0 = r0 + r1
            if (r0 < 0) goto L6c
            int r1 = r8.uncompressedBytesRemaining
            int r1 = r1 - r0
            r8.uncompressedBytesRemaining = r1
            org.apache.commons.compress.utils.ByteUtils$ByteSupplier r1 = r8.supplier
            long r1 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r1, r7)
            int r1 = (int) r1
            long r2 = (long) r0
            r8.startBackReference(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L65
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.IN_BACK_REFERENCE
            r8.state = r0
            goto Lb1
        L65:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r5, r0)
            throw r1
        L6c:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        L72:
            int r1 = r0 >> 2
            r1 = r1 & 7
            int r1 = r1 + r4
            int r3 = r8.uncompressedBytesRemaining
            int r3 = r3 - r1
            r8.uncompressedBytesRemaining = r3
            r0 = r0 & 224(0xe0, float:3.14E-43)
            int r0 = r0 << r6
            int r3 = r8.readOneByte()
            if (r3 == r2) goto L96
            r0 = r0 | r3
            long r1 = (long) r1
            r8.startBackReference(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L8f
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.IN_BACK_REFERENCE
            r8.state = r0
            goto Lb1
        L8f:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r5, r0)
            throw r1
        L96:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Premature end of stream reading back-reference length"
            r0.<init>(r1)
            throw r0
        L9e:
            int r0 = r8.readLiteralLength(r0)
            if (r0 < 0) goto Lb2
            int r1 = r8.uncompressedBytesRemaining
            int r1 = r1 - r0
            r8.uncompressedBytesRemaining = r1
            long r0 = (long) r0
            r8.startLiteral(r0)
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.IN_LITERAL
            r8.state = r0
        Lb1:
            return
        Lb2:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Illegal block with a negative literal size found"
            r0.<init>(r1)
            throw r0
        Lba:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Premature end of stream reading block start"
            r0.<init>(r1)
            throw r0
    }

    private int readLiteralLength(int r3) throws java.io.IOException {
            r2 = this;
            r0 = 2
            int r3 = r3 >> r0
            switch(r3) {
                case 60: goto L1e;
                case 61: goto L16;
                case 62: goto Le;
                case 63: goto L6;
                default: goto L5;
            }
        L5:
            goto L2e
        L6:
            org.apache.commons.compress.utils.ByteUtils$ByteSupplier r3 = r2.supplier
            r0 = 4
            long r0 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r3, r0)
            goto L1c
        Le:
            org.apache.commons.compress.utils.ByteUtils$ByteSupplier r3 = r2.supplier
            r0 = 3
            long r0 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r3, r0)
            goto L1c
        L16:
            org.apache.commons.compress.utils.ByteUtils$ByteSupplier r3 = r2.supplier
            long r0 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r3, r0)
        L1c:
            int r3 = (int) r0
            goto L2e
        L1e:
            int r3 = r2.readOneByte()
            r0 = -1
            if (r3 == r0) goto L26
            goto L2e
        L26:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Premature end of stream reading literal length"
            r3.<init>(r0)
            throw r3
        L2e:
            int r3 = r3 + 1
            return r3
    }

    private long readSize() throws java.io.IOException {
            r8 = this;
            r0 = 0
            r1 = 0
        L3:
            int r3 = r8.readOneByte()
            r4 = -1
            if (r3 == r4) goto L1b
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0 + 1
            int r0 = r0 * 7
            int r0 = r4 << r0
            long r6 = (long) r0
            long r1 = r1 | r6
            r0 = r3 & 128(0x80, float:1.8E-43)
            if (r0 != 0) goto L19
            return r1
        L19:
            r0 = r5
            goto L3
        L1b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Premature end of stream reading size"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream
    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = r2.endReached
            if (r0 == 0) goto La
            r3 = -1
            return r3
        La:
            int[] r0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$snappy$SnappyCompressorInputStream$State
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r1 = r2.state
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L60
            r1 = 2
            if (r0 == r1) goto L4a
            r1 = 3
            if (r0 != r1) goto L33
            int r0 = r2.readBackReference(r3, r4, r5)
            boolean r1 = r2.hasMoreDataInBlock()
            if (r1 != 0) goto L2b
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r1 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.NO_BLOCK
            r2.state = r1
        L2b:
            if (r0 <= 0) goto L2e
            goto L32
        L2e:
            int r0 = r2.read(r3, r4, r5)
        L32:
            return r0
        L33:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unknown stream state "
            r4.<init>(r5)
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r5 = r2.state
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L4a:
            int r0 = r2.readLiteral(r3, r4, r5)
            boolean r1 = r2.hasMoreDataInBlock()
            if (r1 != 0) goto L58
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream$State r1 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.State.NO_BLOCK
            r2.state = r1
        L58:
            if (r0 <= 0) goto L5b
            goto L5f
        L5b:
            int r0 = r2.read(r3, r4, r5)
        L5f:
            return r0
        L60:
            r2.fill()
            int r3 = r2.read(r3, r4, r5)
            return r3
    }
}
