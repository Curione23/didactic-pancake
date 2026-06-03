package org.apache.commons.compress.compressors.lz4;

/* JADX INFO: loaded from: classes2.dex */
public class BlockLZ4CompressorInputStream extends org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream {
    static final int BACK_REFERENCE_SIZE_MASK = 15;
    static final int LITERAL_SIZE_MASK = 240;
    static final int SIZE_BITS = 4;
    static final int WINDOW_SIZE = 65536;
    private int nextBackReferenceSize;
    private org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State state;

    /* JADX INFO: renamed from: org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$compress$compressors$lz4$BlockLZ4CompressorInputStream$State = null;

        static {
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State[] r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz4$BlockLZ4CompressorInputStream$State = r0
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r1 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.EOF     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz4$BlockLZ4CompressorInputStream$State     // Catch: java.lang.NoSuchFieldError -> L1d
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r1 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.NO_BLOCK     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz4$BlockLZ4CompressorInputStream$State     // Catch: java.lang.NoSuchFieldError -> L28
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r1 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.IN_LITERAL     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz4$BlockLZ4CompressorInputStream$State     // Catch: java.lang.NoSuchFieldError -> L33
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r1 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.LOOKING_FOR_BACK_REFERENCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz4$BlockLZ4CompressorInputStream$State     // Catch: java.lang.NoSuchFieldError -> L3e
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r1 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.IN_BACK_REFERENCE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    private enum State extends java.lang.Enum<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State> {
        private static final /* synthetic */ org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State[] $VALUES = null;
        public static final org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State EOF = null;
        public static final org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State IN_BACK_REFERENCE = null;
        public static final org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State IN_LITERAL = null;
        public static final org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State LOOKING_FOR_BACK_REFERENCE = null;
        public static final org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State NO_BLOCK = null;

        private static /* synthetic */ org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State[] $values() {
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.NO_BLOCK
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r1 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.IN_LITERAL
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r2 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.LOOKING_FOR_BACK_REFERENCE
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r3 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.IN_BACK_REFERENCE
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r4 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.EOF
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State[] r0 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State[]{r0, r1, r2, r3, r4}
                return r0
        }

        static {
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r0 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State
                java.lang.String r1 = "NO_BLOCK"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.NO_BLOCK = r0
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r0 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State
                java.lang.String r1 = "IN_LITERAL"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.IN_LITERAL = r0
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r0 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State
                java.lang.String r1 = "LOOKING_FOR_BACK_REFERENCE"
                r2 = 2
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.LOOKING_FOR_BACK_REFERENCE = r0
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r0 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State
                java.lang.String r1 = "IN_BACK_REFERENCE"
                r2 = 3
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.IN_BACK_REFERENCE = r0
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r0 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State
                java.lang.String r1 = "EOF"
                r2 = 4
                r0.<init>(r1, r2)
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.EOF = r0
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State[] r0 = $values()
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State> r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r1 = (org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State) r1
                return r1
        }

        public static org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State[] values() {
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State[] r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State[] r0 = (org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State[]) r0
                return r0
        }
    }

    public BlockLZ4CompressorInputStream(java.io.InputStream r2) {
            r1 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            r1.<init>(r2, r0)
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r2 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.NO_BLOCK
            r1.state = r2
            return
    }

    private boolean initializeBackReference() throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.utils.ByteUtils$ByteSupplier r0 = r6.supplier     // Catch: java.io.IOException -> L37
            r1 = 2
            long r0 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r0, r1)     // Catch: java.io.IOException -> L37
            int r0 = (int) r0
            int r1 = r6.nextBackReferenceSize
            long r2 = (long) r1
            r4 = 15
            if (r1 != r4) goto L14
            long r4 = r6.readSizeBytes()
            long r2 = r2 + r4
        L14:
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 < 0) goto L2f
            r4 = 4
            long r2 = r2 + r4
            r6.startBackReference(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L26
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.IN_BACK_REFERENCE
            r6.state = r0
            r0 = 1
            return r0
        L26:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Illegal block with bad offset found"
            r1.<init>(r2, r0)
            throw r1
        L2f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Illegal block with a negative match length found"
            r0.<init>(r1)
            throw r0
        L37:
            r0 = move-exception
            int r1 = r6.nextBackReferenceSize
            if (r1 != 0) goto L3e
            r0 = 0
            return r0
        L3e:
            throw r0
    }

    private long readSizeBytes() throws java.io.IOException {
            r5 = this;
            r0 = 0
        L2:
            int r2 = r5.readOneByte()
            r3 = -1
            if (r2 == r3) goto L10
            long r3 = (long) r2
            long r0 = r0 + r3
            r3 = 255(0xff, float:3.57E-43)
            if (r2 == r3) goto L2
            return r0
        L10:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Premature end of stream while parsing length"
            r0.<init>(r1)
            throw r0
    }

    private void readSizes() throws java.io.IOException {
            r4 = this;
            int r0 = r4.readOneByte()
            r1 = -1
            if (r0 == r1) goto L31
            r1 = r0 & 15
            r4.nextBackReferenceSize = r1
            r0 = r0 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >> 4
            long r0 = (long) r0
            r2 = 15
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L1b
            long r2 = r4.readSizeBytes()
            long r0 = r0 + r2
        L1b:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L29
            r4.startLiteral(r0)
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.IN_LITERAL
            r4.state = r0
            return
        L29:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Illegal block with a negative literal size found"
            r0.<init>(r1)
            throw r0
        L31:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Premature end of stream while looking for next block"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            if (r6 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int[] r0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$compressors$lz4$BlockLZ4CompressorInputStream$State
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r1 = r3.state
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = -1
            if (r0 == r1) goto L70
            r1 = 2
            if (r0 == r1) goto L57
            r1 = 3
            if (r0 == r1) goto L5a
            r1 = 4
            if (r0 == r1) goto L36
            r1 = 5
            if (r0 != r1) goto L1f
            goto L41
        L1f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unknown stream state "
            r5.<init>(r6)
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r6 = r3.state
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L36:
            boolean r0 = r3.initializeBackReference()
            if (r0 != 0) goto L41
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r4 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.EOF
            r3.state = r4
            return r2
        L41:
            int r0 = r3.readBackReference(r4, r5, r6)
            boolean r1 = r3.hasMoreDataInBlock()
            if (r1 != 0) goto L4f
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r1 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.NO_BLOCK
            r3.state = r1
        L4f:
            if (r0 <= 0) goto L52
            goto L56
        L52:
            int r0 = r3.read(r4, r5, r6)
        L56:
            return r0
        L57:
            r3.readSizes()
        L5a:
            int r0 = r3.readLiteral(r4, r5, r6)
            boolean r1 = r3.hasMoreDataInBlock()
            if (r1 != 0) goto L68
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$State r1 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream.State.LOOKING_FOR_BACK_REFERENCE
            r3.state = r1
        L68:
            if (r0 <= 0) goto L6b
            goto L6f
        L6b:
            int r0 = r3.read(r4, r5, r6)
        L6f:
            return r0
        L70:
            return r2
    }
}
