package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
abstract class BinaryWriter extends com.google.crypto.tink.shaded.protobuf.ByteOutput implements com.google.crypto.tink.shaded.protobuf.Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final com.google.crypto.tink.shaded.protobuf.BufferAllocator alloc;
    final java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.BinaryWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L60
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L78
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L84
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L90
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La8
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb4
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lcc
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                return
        }
    }

    private static final class SafeDirectWriter extends com.google.crypto.tink.shaded.protobuf.BinaryWriter {
        private java.nio.ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        SafeDirectWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                r1.nextBuffer()
                return
        }

        private int bytesWrittenToCurrentBuffer() {
                r2 = this;
                int r0 = r2.limitMinusOne
                int r1 = r2.pos
                int r0 = r0 - r1
                return r0
        }

        private void nextBuffer() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newDirectBuffer()
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r1 = r0.newDirectBuffer(r1)
                r0.nextBuffer(r1)
                return
        }

        private void nextBuffer(com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r3) {
                r2 = this;
                boolean r0 = r3.hasNioBuffer()
                if (r0 == 0) goto L43
                java.nio.ByteBuffer r0 = r3.nioBuffer()
                boolean r1 = r0.isDirect()
                if (r1 == 0) goto L3b
                r2.finishCurrentBuffer()
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r1 = r2.buffers
                r1.addFirst(r3)
                r2.buffer = r0
                int r3 = r0.capacity()
                r0.limit(r3)
                java.nio.ByteBuffer r3 = r2.buffer
                r0 = 0
                r3.position(r0)
                java.nio.ByteBuffer r3 = r2.buffer
                java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
                r3.order(r0)
                java.nio.ByteBuffer r3 = r2.buffer
                int r3 = r3.limit()
                int r3 = r3 + (-1)
                r2.limitMinusOne = r3
                r2.pos = r3
                return
            L3b:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.String r0 = "Allocator returned non-direct buffer"
                r3.<init>(r0)
                throw r3
            L43:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.String r0 = "Allocated buffer does not have NIO buffer"
                r3.<init>(r0)
                throw r3
        }

        private int spaceLeft() {
                r1 = this;
                int r0 = r1.pos
                int r0 = r0 + 1
                return r0
        }

        private void writeVarint32FiveBytes(int r5) {
                r4 = this;
                java.nio.ByteBuffer r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                int r2 = r5 >>> 28
                byte r2 = (byte) r2
                r0.put(r1, r2)
                int r0 = r4.pos
                int r1 = r0 + (-4)
                r4.pos = r1
                java.nio.ByteBuffer r1 = r4.buffer
                int r0 = r0 + (-3)
                int r2 = r5 >>> 21
                r2 = r2 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                int r2 = r2 << 24
                int r3 = r5 >>> 14
                r3 = r3 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                int r3 = r5 >>> 7
                r3 = r3 & 127(0x7f, float:1.78E-43)
                r3 = r3 | 128(0x80, float:1.8E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                r5 = r5 | r2
                r1.putInt(r0, r5)
                return
        }

        private void writeVarint32FourBytes(int r6) {
                r5 = this;
                int r0 = r5.pos
                int r1 = r0 + (-4)
                r5.pos = r1
                java.nio.ByteBuffer r1 = r5.buffer
                int r0 = r0 + (-3)
                r2 = 266338304(0xfe00000, float:2.2088105E-29)
                r2 = r2 & r6
                int r2 = r2 << 3
                r3 = 2080768(0x1fc000, float:2.915777E-39)
                r3 = r3 & r6
                r4 = 2097152(0x200000, float:2.938736E-39)
                r3 = r3 | r4
                int r3 = r3 << 2
                r2 = r2 | r3
                r3 = r6 & 16256(0x3f80, float:2.278E-41)
                r3 = r3 | 16384(0x4000, float:2.2959E-41)
                int r3 = r3 << 1
                r2 = r2 | r3
                r6 = r6 & 127(0x7f, float:1.78E-43)
                r6 = r6 | 128(0x80, float:1.8E-43)
                r6 = r6 | r2
                r1.putInt(r0, r6)
                return
        }

        private void writeVarint32OneByte(int r4) {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                byte r4 = (byte) r4
                r0.put(r1, r4)
                return
        }

        private void writeVarint32ThreeBytes(int r5) {
                r4 = this;
                int r0 = r4.pos
                int r0 = r0 + (-3)
                r4.pos = r0
                java.nio.ByteBuffer r1 = r4.buffer
                r2 = 2080768(0x1fc000, float:2.915777E-39)
                r2 = r2 & r5
                int r2 = r2 << 10
                r3 = r5 & 16256(0x3f80, float:2.278E-41)
                r3 = r3 | 16384(0x4000, float:2.2959E-41)
                int r3 = r3 << 9
                r2 = r2 | r3
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                int r5 = r5 << 8
                r5 = r5 | r2
                r1.putInt(r0, r5)
                return
        }

        private void writeVarint32TwoBytes(int r4) {
                r3 = this;
                int r0 = r3.pos
                int r1 = r0 + (-2)
                r3.pos = r1
                java.nio.ByteBuffer r1 = r3.buffer
                int r0 = r0 + (-1)
                r2 = r4 & 16256(0x3f80, float:2.278E-41)
                int r2 = r2 << 1
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                r4 = r4 | r2
                short r4 = (short) r4
                r1.putShort(r0, r4)
                return
        }

        private void writeVarint64EightBytes(long r9) {
                r8 = this;
                int r0 = r8.pos
                int r1 = r0 + (-8)
                r8.pos = r1
                java.nio.ByteBuffer r1 = r8.buffer
                r2 = 7
                int r0 = r0 - r2
                r3 = 71494644084506624(0xfe000000000000, double:6.835426893334123E-304)
                long r3 = r3 & r9
                long r2 = r3 << r2
                r4 = 558551906910208(0x1fc0000000000, double:2.759613086234517E-309)
                long r4 = r4 & r9
                r6 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
                long r4 = r4 | r6
                r6 = 6
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 4363686772736(0x3f800000000, double:2.1559477236207E-311)
                long r4 = r4 & r9
                r6 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r4 = r4 | r6
                r6 = 5
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 34091302912(0x7f0000000, double:1.6843341591E-313)
                long r4 = r4 & r9
                r6 = 34359738368(0x800000000, double:1.69759663277E-313)
                long r4 = r4 | r6
                r6 = 4
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 266338304(0xfe00000, double:1.31588606E-315)
                long r4 = r4 & r9
                r6 = 268435456(0x10000000, double:1.32624737E-315)
                long r4 = r4 | r6
                r6 = 3
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 2080768(0x1fc000, double:1.028036E-317)
                long r4 = r4 & r9
                r6 = 2097152(0x200000, double:1.036131E-317)
                long r4 = r4 | r6
                r6 = 2
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 16256(0x3f80, double:8.0315E-320)
                long r4 = r4 & r9
                r6 = 16384(0x4000, double:8.095E-320)
                long r4 = r4 | r6
                r6 = 1
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 127(0x7f, double:6.27E-322)
                long r9 = r9 & r4
                r4 = 128(0x80, double:6.3E-322)
                long r9 = r9 | r4
                long r9 = r9 | r2
                r1.putLong(r0, r9)
                return
        }

        private void writeVarint64EightBytesWithSign(long r9) {
                r8 = this;
                int r0 = r8.pos
                int r1 = r0 + (-8)
                r8.pos = r1
                java.nio.ByteBuffer r1 = r8.buffer
                r2 = 7
                int r0 = r0 - r2
                r3 = 71494644084506624(0xfe000000000000, double:6.835426893334123E-304)
                long r3 = r3 & r9
                r5 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
                long r3 = r3 | r5
                long r2 = r3 << r2
                r4 = 558551906910208(0x1fc0000000000, double:2.759613086234517E-309)
                long r4 = r4 & r9
                r6 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
                long r4 = r4 | r6
                r6 = 6
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 4363686772736(0x3f800000000, double:2.1559477236207E-311)
                long r4 = r4 & r9
                r6 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r4 = r4 | r6
                r6 = 5
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 34091302912(0x7f0000000, double:1.6843341591E-313)
                long r4 = r4 & r9
                r6 = 34359738368(0x800000000, double:1.69759663277E-313)
                long r4 = r4 | r6
                r6 = 4
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 266338304(0xfe00000, double:1.31588606E-315)
                long r4 = r4 & r9
                r6 = 268435456(0x10000000, double:1.32624737E-315)
                long r4 = r4 | r6
                r6 = 3
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 2080768(0x1fc000, double:1.028036E-317)
                long r4 = r4 & r9
                r6 = 2097152(0x200000, double:1.036131E-317)
                long r4 = r4 | r6
                r6 = 2
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 16256(0x3f80, double:8.0315E-320)
                long r4 = r4 & r9
                r6 = 16384(0x4000, double:8.095E-320)
                long r4 = r4 | r6
                r6 = 1
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 127(0x7f, double:6.27E-322)
                long r9 = r9 & r4
                r4 = 128(0x80, double:6.3E-322)
                long r9 = r9 | r4
                long r9 = r9 | r2
                r1.putLong(r0, r9)
                return
        }

        private void writeVarint64FiveBytes(long r9) {
                r8 = this;
                int r0 = r8.pos
                int r1 = r0 + (-5)
                r8.pos = r1
                java.nio.ByteBuffer r1 = r8.buffer
                int r0 = r0 + (-7)
                r2 = 34091302912(0x7f0000000, double:1.6843341591E-313)
                long r2 = r2 & r9
                r4 = 28
                long r2 = r2 << r4
                r4 = 266338304(0xfe00000, double:1.31588606E-315)
                long r4 = r4 & r9
                r6 = 268435456(0x10000000, double:1.32624737E-315)
                long r4 = r4 | r6
                r6 = 27
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 2080768(0x1fc000, double:1.028036E-317)
                long r4 = r4 & r9
                r6 = 2097152(0x200000, double:1.036131E-317)
                long r4 = r4 | r6
                r6 = 26
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 16256(0x3f80, double:8.0315E-320)
                long r4 = r4 & r9
                r6 = 16384(0x4000, double:8.095E-320)
                long r4 = r4 | r6
                r6 = 25
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 127(0x7f, double:6.27E-322)
                long r9 = r9 & r4
                r4 = 128(0x80, double:6.3E-322)
                long r9 = r9 | r4
                r4 = 24
                long r9 = r9 << r4
                long r9 = r9 | r2
                r1.putLong(r0, r9)
                return
        }

        private void writeVarint64FourBytes(long r1) {
                r0 = this;
                int r1 = (int) r1
                r0.writeVarint32FourBytes(r1)
                return
        }

        private void writeVarint64NineBytes(long r5) {
                r4 = this;
                java.nio.ByteBuffer r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                r2 = 56
                long r2 = r5 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0.put(r1, r2)
                r0 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
                long r5 = r5 & r0
                r4.writeVarint64EightBytesWithSign(r5)
                return
        }

        private void writeVarint64OneByte(long r1) {
                r0 = this;
                int r1 = (int) r1
                r0.writeVarint32OneByte(r1)
                return
        }

        private void writeVarint64SevenBytes(long r9) {
                r8 = this;
                int r0 = r8.pos
                int r0 = r0 + (-7)
                r8.pos = r0
                java.nio.ByteBuffer r1 = r8.buffer
                r2 = 558551906910208(0x1fc0000000000, double:2.759613086234517E-309)
                long r2 = r2 & r9
                r4 = 14
                long r2 = r2 << r4
                r4 = 4363686772736(0x3f800000000, double:2.1559477236207E-311)
                long r4 = r4 & r9
                r6 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r4 = r4 | r6
                r6 = 13
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 34091302912(0x7f0000000, double:1.6843341591E-313)
                long r4 = r4 & r9
                r6 = 34359738368(0x800000000, double:1.69759663277E-313)
                long r4 = r4 | r6
                r6 = 12
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 266338304(0xfe00000, double:1.31588606E-315)
                long r4 = r4 & r9
                r6 = 268435456(0x10000000, double:1.32624737E-315)
                long r4 = r4 | r6
                r6 = 11
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 2080768(0x1fc000, double:1.028036E-317)
                long r4 = r4 & r9
                r6 = 2097152(0x200000, double:1.036131E-317)
                long r4 = r4 | r6
                r6 = 10
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 16256(0x3f80, double:8.0315E-320)
                long r4 = r4 & r9
                r6 = 16384(0x4000, double:8.095E-320)
                long r4 = r4 | r6
                r6 = 9
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 127(0x7f, double:6.27E-322)
                long r9 = r9 & r4
                r4 = 128(0x80, double:6.3E-322)
                long r9 = r9 | r4
                r4 = 8
                long r9 = r9 << r4
                long r9 = r9 | r2
                r1.putLong(r0, r9)
                return
        }

        private void writeVarint64SixBytes(long r9) {
                r8 = this;
                int r0 = r8.pos
                int r1 = r0 + (-6)
                r8.pos = r1
                java.nio.ByteBuffer r1 = r8.buffer
                int r0 = r0 + (-7)
                r2 = 4363686772736(0x3f800000000, double:2.1559477236207E-311)
                long r2 = r2 & r9
                r4 = 21
                long r2 = r2 << r4
                r4 = 34091302912(0x7f0000000, double:1.6843341591E-313)
                long r4 = r4 & r9
                r6 = 34359738368(0x800000000, double:1.69759663277E-313)
                long r4 = r4 | r6
                r6 = 20
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 266338304(0xfe00000, double:1.31588606E-315)
                long r4 = r4 & r9
                r6 = 268435456(0x10000000, double:1.32624737E-315)
                long r4 = r4 | r6
                r6 = 19
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 2080768(0x1fc000, double:1.028036E-317)
                long r4 = r4 & r9
                r6 = 2097152(0x200000, double:1.036131E-317)
                long r4 = r4 | r6
                r6 = 18
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 16256(0x3f80, double:8.0315E-320)
                long r4 = r4 & r9
                r6 = 16384(0x4000, double:8.095E-320)
                long r4 = r4 | r6
                r6 = 17
                long r4 = r4 << r6
                long r2 = r2 | r4
                r4 = 127(0x7f, double:6.27E-322)
                long r9 = r9 & r4
                r4 = 128(0x80, double:6.3E-322)
                long r9 = r9 | r4
                r4 = 16
                long r9 = r9 << r4
                long r9 = r9 | r2
                r1.putLong(r0, r9)
                return
        }

        private void writeVarint64TenBytes(long r7) {
                r6 = this;
                java.nio.ByteBuffer r0 = r6.buffer
                int r1 = r6.pos
                int r2 = r1 + (-1)
                r6.pos = r2
                r2 = 63
                long r2 = r7 >>> r2
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0.put(r1, r2)
                java.nio.ByteBuffer r0 = r6.buffer
                int r1 = r6.pos
                int r2 = r1 + (-1)
                r6.pos = r2
                r2 = 56
                long r2 = r7 >>> r2
                r4 = 127(0x7f, double:6.27E-322)
                long r2 = r2 & r4
                r4 = 128(0x80, double:6.3E-322)
                long r2 = r2 | r4
                int r2 = (int) r2
                byte r2 = (byte) r2
                r0.put(r1, r2)
                r0 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
                long r7 = r7 & r0
                r6.writeVarint64EightBytesWithSign(r7)
                return
        }

        private void writeVarint64ThreeBytes(long r1) {
                r0 = this;
                int r1 = (int) r1
                r0.writeVarint32ThreeBytes(r1)
                return
        }

        private void writeVarint64TwoBytes(long r1) {
                r0 = this;
                int r1 = (int) r1
                r0.writeVarint32TwoBytes(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.buffer
                if (r0 == 0) goto L1e
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                r2.totalDoneBytes = r0
                java.nio.ByteBuffer r0 = r2.buffer
                int r1 = r2.pos
                int r1 = r1 + 1
                r0.position(r1)
                r0 = 0
                r2.buffer = r0
                r0 = 0
                r2.pos = r0
                r2.limitMinusOne = r0
            L1e:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
                r2 = this;
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int r2) {
                r1 = this;
                int r0 = r1.spaceLeft()
                if (r0 >= r2) goto L9
                r1.nextBuffer(r2)
            L9:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r4) {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                r0.put(r1, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r3) {
                r2 = this;
                int r0 = r3.remaining()
                int r1 = r2.spaceLeft()
                if (r1 >= r0) goto Ld
                r2.nextBuffer(r0)
            Ld:
                int r1 = r2.pos
                int r1 = r1 - r0
                r2.pos = r1
                java.nio.ByteBuffer r0 = r2.buffer
                int r1 = r1 + 1
                r0.position(r1)
                java.nio.ByteBuffer r0 = r2.buffer
                r0.put(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r3, int r4, int r5) {
                r2 = this;
                int r0 = r2.spaceLeft()
                if (r0 >= r5) goto L9
                r2.nextBuffer(r5)
            L9:
                int r0 = r2.pos
                int r0 = r0 - r5
                r2.pos = r0
                java.nio.ByteBuffer r1 = r2.buffer
                int r0 = r0 + 1
                r1.position(r0)
                java.nio.ByteBuffer r0 = r2.buffer
                r0.put(r3, r4, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int r2, boolean r3) {
                r1 = this;
                r0 = 6
                r1.requireSpace(r0)
                byte r3 = (byte) r3
                r1.write(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean r1) {
                r0 = this;
                byte r1 = (byte) r1
                r0.write(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
                r1 = this;
                r3.writeToReverse(r1)     // Catch: java.io.IOException -> L14
                r0 = 10
                r1.requireSpace(r0)
                int r3 = r3.size()
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
            L14:
                r2 = move-exception
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                r3.<init>(r2)
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeEndGroup(int r2) {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int r3) {
                r2 = this;
                int r0 = r2.pos
                int r1 = r0 + (-4)
                r2.pos = r1
                java.nio.ByteBuffer r1 = r2.buffer
                int r0 = r0 + (-3)
                r1.putInt(r0, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int r2, int r3) {
                r1 = this;
                r0 = 9
                r1.requireSpace(r0)
                r1.writeFixed32(r3)
                r3 = 5
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int r2, long r3) {
                r1 = this;
                r0 = 13
                r1.requireSpace(r0)
                r1.writeFixed64(r3)
                r3 = 1
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long r3) {
                r2 = this;
                int r0 = r2.pos
                int r1 = r0 + (-8)
                r2.pos = r1
                java.nio.ByteBuffer r1 = r2.buffer
                int r0 = r0 + (-7)
                r1.putLong(r0, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeGroup(int r2, java.lang.Object r3) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r0.writeTo(r3, r1)
                r3 = 3
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                r4.writeTo(r3, r1)
                r3 = 3
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int r3) {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeVarint32(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeVarint64(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int r2, int r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeInt32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r3) {
                r2 = this;
                int r0 = r3.remaining()
                int r1 = r2.spaceLeft()
                if (r1 >= r0) goto L1c
                int r1 = r2.totalDoneBytes
                int r1 = r1 + r0
                r2.totalDoneBytes = r1
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r2.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r3 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r3)
                r0.addFirst(r3)
                r2.nextBuffer()
                return
            L1c:
                int r1 = r2.pos
                int r1 = r1 - r0
                r2.pos = r1
                java.nio.ByteBuffer r0 = r2.buffer
                int r1 = r1 + 1
                r0.position(r1)
                java.nio.ByteBuffer r0 = r2.buffer
                r0.put(r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r3, int r4, int r5) {
                r2 = this;
                int r0 = r2.spaceLeft()
                if (r0 >= r5) goto L18
                int r0 = r2.totalDoneBytes
                int r0 = r0 + r5
                r2.totalDoneBytes = r0
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r2.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r3 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r3, r4, r5)
                r0.addFirst(r3)
                r2.nextBuffer()
                return
            L18:
                int r0 = r2.pos
                int r0 = r0 - r5
                r2.pos = r0
                java.nio.ByteBuffer r1 = r2.buffer
                int r0 = r0 + 1
                r1.position(r0)
                java.nio.ByteBuffer r0 = r2.buffer
                r0.put(r3, r4, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r3, java.lang.Object r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.getTotalBytesWritten()
                com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r1.writeTo(r4, r2)
                int r4 = r2.getTotalBytesWritten()
                int r4 = r4 - r0
                r0 = 10
                r2.requireSpace(r0)
                r2.writeVarint32(r4)
                r4 = 2
                r2.writeTag(r3, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                int r0 = r1.getTotalBytesWritten()
                r4.writeTo(r3, r1)
                int r3 = r1.getTotalBytesWritten()
                int r3 = r3 - r0
                r4 = 10
                r1.requireSpace(r4)
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int r1) {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag32(r1)
                r0.writeVarint32(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeSInt32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeSInt64(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long r1) {
                r0 = this;
                long r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag64(r1)
                r0.writeVarint64(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeStartGroup(int r2) {
                r1 = this;
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int r2, java.lang.String r3) {
                r1 = this;
                int r0 = r1.getTotalBytesWritten()
                r1.writeString(r3)
                int r3 = r1.getTotalBytesWritten()
                int r3 = r3 - r0
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeString(java.lang.String r9) {
                r8 = this;
                int r0 = r9.length()
                r8.requireSpace(r0)
                int r0 = r9.length()
                r1 = 1
                int r0 = r0 - r1
                int r2 = r8.pos
                int r2 = r2 - r0
                r8.pos = r2
            L12:
                r2 = 128(0x80, float:1.8E-43)
                if (r0 < 0) goto L28
                char r3 = r9.charAt(r0)
                if (r3 >= r2) goto L28
                java.nio.ByteBuffer r2 = r8.buffer
                int r4 = r8.pos
                int r4 = r4 + r0
                byte r3 = (byte) r3
                r2.put(r4, r3)
                int r0 = r0 + (-1)
                goto L12
            L28:
                r3 = -1
                if (r0 != r3) goto L31
                int r9 = r8.pos
                int r9 = r9 - r1
                r8.pos = r9
                return
            L31:
                int r4 = r8.pos
                int r4 = r4 + r0
                r8.pos = r4
            L36:
                if (r0 < 0) goto L11d
                char r4 = r9.charAt(r0)
                if (r4 >= r2) goto L4e
                int r5 = r8.pos
                if (r5 < 0) goto L4e
                java.nio.ByteBuffer r6 = r8.buffer
                int r7 = r5 + (-1)
                r8.pos = r7
                byte r4 = (byte) r4
                r6.put(r5, r4)
                goto L11a
            L4e:
                r5 = 2048(0x800, float:2.87E-42)
                if (r4 >= r5) goto L75
                int r5 = r8.pos
                if (r5 <= 0) goto L75
                java.nio.ByteBuffer r6 = r8.buffer
                int r7 = r5 + (-1)
                r8.pos = r7
                r7 = r4 & 63
                r7 = r7 | r2
                byte r7 = (byte) r7
                r6.put(r5, r7)
                java.nio.ByteBuffer r5 = r8.buffer
                int r6 = r8.pos
                int r7 = r6 + (-1)
                r8.pos = r7
                int r4 = r4 >>> 6
                r4 = r4 | 960(0x3c0, float:1.345E-42)
                byte r4 = (byte) r4
                r5.put(r6, r4)
                goto L11a
            L75:
                r5 = 55296(0xd800, float:7.7486E-41)
                if (r4 < r5) goto L7f
                r5 = 57343(0xdfff, float:8.0355E-41)
                if (r5 >= r4) goto Lb2
            L7f:
                int r5 = r8.pos
                if (r5 <= r1) goto Lb2
                java.nio.ByteBuffer r6 = r8.buffer
                int r7 = r5 + (-1)
                r8.pos = r7
                r7 = r4 & 63
                r7 = r7 | r2
                byte r7 = (byte) r7
                r6.put(r5, r7)
                java.nio.ByteBuffer r5 = r8.buffer
                int r6 = r8.pos
                int r7 = r6 + (-1)
                r8.pos = r7
                int r7 = r4 >>> 6
                r7 = r7 & 63
                r7 = r7 | r2
                byte r7 = (byte) r7
                r5.put(r6, r7)
                java.nio.ByteBuffer r5 = r8.buffer
                int r6 = r8.pos
                int r7 = r6 + (-1)
                r8.pos = r7
                int r4 = r4 >>> 12
                r4 = r4 | 480(0x1e0, float:6.73E-43)
                byte r4 = (byte) r4
                r5.put(r6, r4)
                goto L11a
            Lb2:
                int r5 = r8.pos
                r6 = 2
                if (r5 <= r6) goto L115
                if (r0 == 0) goto L10d
                int r5 = r0 + (-1)
                char r5 = r9.charAt(r5)
                boolean r6 = java.lang.Character.isSurrogatePair(r5, r4)
                if (r6 == 0) goto L10d
                int r0 = r0 + (-1)
                int r4 = java.lang.Character.toCodePoint(r5, r4)
                java.nio.ByteBuffer r5 = r8.buffer
                int r6 = r8.pos
                int r7 = r6 + (-1)
                r8.pos = r7
                r7 = r4 & 63
                r7 = r7 | r2
                byte r7 = (byte) r7
                r5.put(r6, r7)
                java.nio.ByteBuffer r5 = r8.buffer
                int r6 = r8.pos
                int r7 = r6 + (-1)
                r8.pos = r7
                int r7 = r4 >>> 6
                r7 = r7 & 63
                r7 = r7 | r2
                byte r7 = (byte) r7
                r5.put(r6, r7)
                java.nio.ByteBuffer r5 = r8.buffer
                int r6 = r8.pos
                int r7 = r6 + (-1)
                r8.pos = r7
                int r7 = r4 >>> 12
                r7 = r7 & 63
                r7 = r7 | r2
                byte r7 = (byte) r7
                r5.put(r6, r7)
                java.nio.ByteBuffer r5 = r8.buffer
                int r6 = r8.pos
                int r7 = r6 + (-1)
                r8.pos = r7
                int r4 = r4 >>> 18
                r4 = r4 | 240(0xf0, float:3.36E-43)
                byte r4 = (byte) r4
                r5.put(r6, r4)
                goto L11a
            L10d:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r9 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r1 = r0 + (-1)
                r9.<init>(r1, r0)
                throw r9
            L115:
                r8.requireSpace(r0)
                int r0 = r0 + 1
            L11a:
                int r0 = r0 + r3
                goto L36
            L11d:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int r1, int r2) {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
                r0.writeVarint32(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeVarint64(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int r2) {
                r1 = this;
                r0 = r2 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L8
                r1.writeVarint32OneByte(r2)
                goto L25
            L8:
                r0 = r2 & (-16384(0xffffffffffffc000, float:NaN))
                if (r0 != 0) goto L10
                r1.writeVarint32TwoBytes(r2)
                goto L25
            L10:
                r0 = -2097152(0xffffffffffe00000, float:NaN)
                r0 = r0 & r2
                if (r0 != 0) goto L19
                r1.writeVarint32ThreeBytes(r2)
                goto L25
            L19:
                r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
                r0 = r0 & r2
                if (r0 != 0) goto L22
                r1.writeVarint32FourBytes(r2)
                goto L25
            L22:
                r1.writeVarint32FiveBytes(r2)
            L25:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long r2) {
                r1 = this;
                byte r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.access$200(r2)
                switch(r0) {
                    case 1: goto L2c;
                    case 2: goto L28;
                    case 3: goto L24;
                    case 4: goto L20;
                    case 5: goto L1c;
                    case 6: goto L18;
                    case 7: goto L14;
                    case 8: goto L10;
                    case 9: goto Lc;
                    case 10: goto L8;
                    default: goto L7;
                }
            L7:
                goto L2f
            L8:
                r1.writeVarint64TenBytes(r2)
                goto L2f
            Lc:
                r1.writeVarint64NineBytes(r2)
                goto L2f
            L10:
                r1.writeVarint64EightBytes(r2)
                goto L2f
            L14:
                r1.writeVarint64SevenBytes(r2)
                goto L2f
            L18:
                r1.writeVarint64SixBytes(r2)
                goto L2f
            L1c:
                r1.writeVarint64FiveBytes(r2)
                goto L2f
            L20:
                r1.writeVarint64FourBytes(r2)
                goto L2f
            L24:
                r1.writeVarint64ThreeBytes(r2)
                goto L2f
            L28:
                r1.writeVarint64TwoBytes(r2)
                goto L2f
            L2c:
                r1.writeVarint64OneByte(r2)
            L2f:
                return
        }
    }

    private static final class SafeHeapWriter extends com.google.crypto.tink.shaded.protobuf.BinaryWriter {
        private com.google.crypto.tink.shaded.protobuf.AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        SafeHeapWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                r1.nextBuffer()
                return
        }

        private void nextBuffer() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newHeapBuffer()
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r1 = r0.newHeapBuffer(r1)
                r0.nextBuffer(r1)
                return
        }

        private void nextBuffer(com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r3) {
                r2 = this;
                boolean r0 = r3.hasArray()
                if (r0 == 0) goto L35
                r2.finishCurrentBuffer()
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r2.buffers
                r0.addFirst(r3)
                r2.allocatedBuffer = r3
                byte[] r0 = r3.array()
                r2.buffer = r0
                int r0 = r3.arrayOffset()
                int r1 = r3.limit()
                int r1 = r1 + r0
                r2.limit = r1
                int r3 = r3.position()
                int r0 = r0 + r3
                r2.offset = r0
                int r0 = r0 + (-1)
                r2.offsetMinusOne = r0
                int r3 = r2.limit
                int r3 = r3 + (-1)
                r2.limitMinusOne = r3
                r2.pos = r3
                return
            L35:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.String r0 = "Allocator returned non-heap buffer"
                r3.<init>(r0)
                throw r3
        }

        private void writeVarint32FiveBytes(int r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                int r1 = r5.pos
                int r2 = r1 + (-1)
                r5.pos = r2
                int r3 = r6 >>> 28
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r5.pos = r3
                int r4 = r6 >>> 21
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-3)
                r5.pos = r2
                int r4 = r6 >>> 14
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-4)
                r5.pos = r3
                int r4 = r6 >>> 7
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                r0[r2] = r4
                int r1 = r1 + (-5)
                r5.pos = r1
                r6 = r6 & 127(0x7f, float:1.78E-43)
                r6 = r6 | 128(0x80, float:1.8E-43)
                byte r6 = (byte) r6
                r0[r3] = r6
                return
        }

        private void writeVarint32FourBytes(int r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                int r1 = r5.pos
                int r2 = r1 + (-1)
                r5.pos = r2
                int r3 = r6 >>> 21
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r5.pos = r3
                int r4 = r6 >>> 14
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-3)
                r5.pos = r2
                int r4 = r6 >>> 7
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                r0[r3] = r4
                int r1 = r1 + (-4)
                r5.pos = r1
                r6 = r6 & 127(0x7f, float:1.78E-43)
                r6 = r6 | 128(0x80, float:1.8E-43)
                byte r6 = (byte) r6
                r0[r2] = r6
                return
        }

        private void writeVarint32OneByte(int r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                byte r4 = (byte) r4
                r0[r1] = r4
                return
        }

        private void writeVarint32ThreeBytes(int r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                int r1 = r5.pos
                int r2 = r1 + (-1)
                r5.pos = r2
                int r3 = r6 >>> 14
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r5.pos = r3
                int r4 = r6 >>> 7
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                r0[r2] = r4
                int r1 = r1 + (-3)
                r5.pos = r1
                r6 = r6 & 127(0x7f, float:1.78E-43)
                r6 = r6 | 128(0x80, float:1.8E-43)
                byte r6 = (byte) r6
                r0[r3] = r6
                return
        }

        private void writeVarint32TwoBytes(int r5) {
                r4 = this;
                byte[] r0 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + (-1)
                r4.pos = r2
                int r3 = r5 >>> 7
                byte r3 = (byte) r3
                r0[r1] = r3
                int r1 = r1 + (-2)
                r4.pos = r1
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                r0[r2] = r5
                return
        }

        private void writeVarint64EightBytes(long r11) {
                r10 = this;
                byte[] r0 = r10.buffer
                int r1 = r10.pos
                int r2 = r1 + (-1)
                r10.pos = r2
                r3 = 49
                long r3 = r11 >>> r3
                int r3 = (int) r3
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r10.pos = r3
                r4 = 42
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-3)
                r10.pos = r2
                r4 = 35
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-4)
                r10.pos = r3
                r4 = 28
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-5)
                r10.pos = r2
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-6)
                r10.pos = r3
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-7)
                r10.pos = r2
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r1 = r1 + (-8)
                r10.pos = r1
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                r0[r2] = r11
                return
        }

        private void writeVarint64FiveBytes(long r11) {
                r10 = this;
                byte[] r0 = r10.buffer
                int r1 = r10.pos
                int r2 = r1 + (-1)
                r10.pos = r2
                r3 = 28
                long r3 = r11 >>> r3
                int r3 = (int) r3
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r10.pos = r3
                r4 = 21
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-3)
                r10.pos = r2
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-4)
                r10.pos = r3
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r1 = r1 + (-5)
                r10.pos = r1
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                r0[r3] = r11
                return
        }

        private void writeVarint64FourBytes(long r11) {
                r10 = this;
                byte[] r0 = r10.buffer
                int r1 = r10.pos
                int r2 = r1 + (-1)
                r10.pos = r2
                r3 = 21
                long r3 = r11 >>> r3
                int r3 = (int) r3
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r10.pos = r3
                r4 = 14
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-3)
                r10.pos = r2
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r1 = r1 + (-4)
                r10.pos = r1
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                r0[r2] = r11
                return
        }

        private void writeVarint64NineBytes(long r11) {
                r10 = this;
                byte[] r0 = r10.buffer
                int r1 = r10.pos
                int r2 = r1 + (-1)
                r10.pos = r2
                r3 = 56
                long r3 = r11 >>> r3
                int r3 = (int) r3
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r10.pos = r3
                r4 = 49
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-3)
                r10.pos = r2
                r4 = 42
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-4)
                r10.pos = r3
                r4 = 35
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-5)
                r10.pos = r2
                r4 = 28
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-6)
                r10.pos = r3
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-7)
                r10.pos = r2
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-8)
                r10.pos = r3
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r1 = r1 + (-9)
                r10.pos = r1
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                r0[r3] = r11
                return
        }

        private void writeVarint64OneByte(long r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r1] = r4
                return
        }

        private void writeVarint64SevenBytes(long r13) {
                r12 = this;
                byte[] r0 = r12.buffer
                int r1 = r12.pos
                int r2 = r1 + (-1)
                r12.pos = r2
                r3 = 42
                long r3 = r13 >>> r3
                int r3 = (int) r3
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r12.pos = r3
                r4 = 35
                long r4 = r13 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-3)
                r12.pos = r2
                r4 = 28
                long r4 = r13 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-4)
                r12.pos = r3
                r4 = 21
                long r4 = r13 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-5)
                r12.pos = r2
                r4 = 14
                long r4 = r13 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-6)
                r12.pos = r3
                r4 = 7
                long r10 = r13 >>> r4
                long r10 = r10 & r6
                long r10 = r10 | r8
                int r5 = (int) r10
                byte r5 = (byte) r5
                r0[r2] = r5
                int r1 = r1 - r4
                r12.pos = r1
                long r13 = r13 & r6
                long r13 = r13 | r8
                int r13 = (int) r13
                byte r13 = (byte) r13
                r0[r3] = r13
                return
        }

        private void writeVarint64SixBytes(long r11) {
                r10 = this;
                byte[] r0 = r10.buffer
                int r1 = r10.pos
                int r2 = r1 + (-1)
                r10.pos = r2
                r3 = 35
                long r3 = r11 >>> r3
                int r3 = (int) r3
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r10.pos = r3
                r4 = 28
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-3)
                r10.pos = r2
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-4)
                r10.pos = r3
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-5)
                r10.pos = r2
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r1 = r1 + (-6)
                r10.pos = r1
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                r0[r2] = r11
                return
        }

        private void writeVarint64TenBytes(long r11) {
                r10 = this;
                byte[] r0 = r10.buffer
                int r1 = r10.pos
                int r2 = r1 + (-1)
                r10.pos = r2
                r3 = 63
                long r3 = r11 >>> r3
                int r3 = (int) r3
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r10.pos = r3
                r4 = 56
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-3)
                r10.pos = r2
                r4 = 49
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-4)
                r10.pos = r3
                r4 = 42
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-5)
                r10.pos = r2
                r4 = 35
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-6)
                r10.pos = r3
                r4 = 28
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-7)
                r10.pos = r2
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-8)
                r10.pos = r3
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-9)
                r10.pos = r2
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r3] = r4
                int r1 = r1 + (-10)
                r10.pos = r1
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                r0[r2] = r11
                return
        }

        private void writeVarint64ThreeBytes(long r11) {
                r10 = this;
                byte[] r0 = r10.buffer
                int r1 = r10.pos
                int r2 = r1 + (-1)
                r10.pos = r2
                int r3 = (int) r11
                int r3 = r3 >>> 14
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r10.pos = r3
                r4 = 7
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                r0[r2] = r4
                int r1 = r1 + (-3)
                r10.pos = r1
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                r0[r3] = r11
                return
        }

        private void writeVarint64TwoBytes(long r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                int r1 = r5.pos
                int r2 = r1 + (-1)
                r5.pos = r2
                r3 = 7
                long r3 = r6 >>> r3
                int r3 = (int) r3
                byte r3 = (byte) r3
                r0[r1] = r3
                int r1 = r1 + (-2)
                r5.pos = r1
                int r6 = (int) r6
                r6 = r6 & 127(0x7f, float:1.78E-43)
                r6 = r6 | 128(0x80, float:1.8E-43)
                byte r6 = (byte) r6
                r0[r2] = r6
                return
        }

        int bytesWrittenToCurrentBuffer() {
                r2 = this;
                int r0 = r2.limitMinusOne
                int r1 = r2.pos
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r3.allocatedBuffer
                if (r0 == 0) goto L23
                int r0 = r3.totalDoneBytes
                int r1 = r3.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                r3.totalDoneBytes = r0
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r3.allocatedBuffer
                int r1 = r3.pos
                int r2 = r0.arrayOffset()
                int r1 = r1 - r2
                int r1 = r1 + 1
                r0.position(r1)
                r0 = 0
                r3.allocatedBuffer = r0
                r0 = 0
                r3.pos = r0
                r3.limitMinusOne = r0
            L23:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
                r2 = this;
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int r2) {
                r1 = this;
                int r0 = r1.spaceLeft()
                if (r0 >= r2) goto L9
                r1.nextBuffer(r2)
            L9:
                return
        }

        int spaceLeft() {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.offsetMinusOne
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                r0[r1] = r4
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r4) {
                r3 = this;
                int r0 = r4.remaining()
                int r1 = r3.spaceLeft()
                if (r1 >= r0) goto Ld
                r3.nextBuffer(r0)
            Ld:
                int r1 = r3.pos
                int r1 = r1 - r0
                r3.pos = r1
                byte[] r2 = r3.buffer
                int r1 = r1 + 1
                r4.get(r2, r1, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r3, int r4, int r5) {
                r2 = this;
                int r0 = r2.spaceLeft()
                if (r0 >= r5) goto L9
                r2.nextBuffer(r5)
            L9:
                int r0 = r2.pos
                int r0 = r0 - r5
                r2.pos = r0
                byte[] r1 = r2.buffer
                int r0 = r0 + 1
                java.lang.System.arraycopy(r3, r4, r1, r0, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int r2, boolean r3) throws java.io.IOException {
                r1 = this;
                r0 = 6
                r1.requireSpace(r0)
                byte r3 = (byte) r3
                r1.write(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean r1) {
                r0 = this;
                byte r1 = (byte) r1
                r0.write(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.io.IOException {
                r1 = this;
                r3.writeToReverse(r1)     // Catch: java.io.IOException -> L14
                r0 = 10
                r1.requireSpace(r0)
                int r3 = r3.size()
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
            L14:
                r2 = move-exception
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                r3.<init>(r2)
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeEndGroup(int r2) {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                int r1 = r5.pos
                int r2 = r1 + (-1)
                r5.pos = r2
                int r3 = r6 >> 24
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r5.pos = r3
                int r4 = r6 >> 16
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-3)
                r5.pos = r2
                int r4 = r6 >> 8
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0[r3] = r4
                int r1 = r1 + (-4)
                r5.pos = r1
                r6 = r6 & 255(0xff, float:3.57E-43)
                byte r6 = (byte) r6
                r0[r2] = r6
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 9
                r1.requireSpace(r0)
                r1.writeFixed32(r3)
                r3 = 5
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 13
                r1.requireSpace(r0)
                r1.writeFixed64(r3)
                r3 = 1
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                int r1 = r7.pos
                int r2 = r1 + (-1)
                r7.pos = r2
                r3 = 56
                long r3 = r8 >> r3
                int r3 = (int) r3
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r0[r1] = r3
                int r3 = r1 + (-2)
                r7.pos = r3
                r4 = 48
                long r4 = r8 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-3)
                r7.pos = r2
                r4 = 40
                long r4 = r8 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-4)
                r7.pos = r3
                r4 = 32
                long r4 = r8 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-5)
                r7.pos = r2
                r4 = 24
                long r4 = r8 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0[r3] = r4
                int r3 = r1 + (-6)
                r7.pos = r3
                r4 = 16
                long r4 = r8 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r0[r2] = r4
                int r2 = r1 + (-7)
                r7.pos = r2
                r4 = 8
                long r5 = r8 >> r4
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                r0[r3] = r5
                int r1 = r1 - r4
                r7.pos = r1
                int r8 = (int) r8
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r0[r2] = r8
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeGroup(int r2, java.lang.Object r3) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r0.writeTo(r3, r1)
                r3 = 3
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                r4.writeTo(r3, r1)
                r3 = 3
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int r3) {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeVarint32(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeVarint64(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeInt32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r4) {
                r3 = this;
                int r0 = r4.remaining()
                int r1 = r3.spaceLeft()
                if (r1 >= r0) goto L1b
                int r1 = r3.totalDoneBytes
                int r1 = r1 + r0
                r3.totalDoneBytes = r1
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r1 = r3.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r2 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r4)
                r1.addFirst(r2)
                r3.nextBuffer()
            L1b:
                int r1 = r3.pos
                int r1 = r1 - r0
                r3.pos = r1
                byte[] r2 = r3.buffer
                int r1 = r1 + 1
                r4.get(r2, r1, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r3, int r4, int r5) {
                r2 = this;
                int r0 = r2.spaceLeft()
                if (r0 >= r5) goto L18
                int r0 = r2.totalDoneBytes
                int r0 = r0 + r5
                r2.totalDoneBytes = r0
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r2.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r3 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r3, r4, r5)
                r0.addFirst(r3)
                r2.nextBuffer()
                return
            L18:
                int r0 = r2.pos
                int r0 = r0 - r5
                r2.pos = r0
                byte[] r1 = r2.buffer
                int r0 = r0 + 1
                java.lang.System.arraycopy(r3, r4, r1, r0, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r3, java.lang.Object r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.getTotalBytesWritten()
                com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r1.writeTo(r4, r2)
                int r4 = r2.getTotalBytesWritten()
                int r4 = r4 - r0
                r0 = 10
                r2.requireSpace(r0)
                r2.writeVarint32(r4)
                r4 = 2
                r2.writeTag(r3, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                int r0 = r1.getTotalBytesWritten()
                r4.writeTo(r3, r1)
                int r3 = r1.getTotalBytesWritten()
                int r3 = r3 - r0
                r4 = 10
                r1.requireSpace(r4)
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int r1) {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag32(r1)
                r0.writeVarint32(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeSInt32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeSInt64(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long r1) {
                r0 = this;
                long r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag64(r1)
                r0.writeVarint64(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeStartGroup(int r2) {
                r1 = this;
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int r2, java.lang.String r3) throws java.io.IOException {
                r1 = this;
                int r0 = r1.getTotalBytesWritten()
                r1.writeString(r3)
                int r3 = r1.getTotalBytesWritten()
                int r3 = r3 - r0
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeString(java.lang.String r10) {
                r9 = this;
                int r0 = r10.length()
                r9.requireSpace(r0)
                int r0 = r10.length()
                int r0 = r0 + (-1)
                int r1 = r9.pos
                int r1 = r1 - r0
                r9.pos = r1
            L12:
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < 0) goto L27
                char r2 = r10.charAt(r0)
                if (r2 >= r1) goto L27
                byte[] r1 = r9.buffer
                int r3 = r9.pos
                int r3 = r3 + r0
                byte r2 = (byte) r2
                r1[r3] = r2
                int r0 = r0 + (-1)
                goto L12
            L27:
                r2 = -1
                if (r0 != r2) goto L31
                int r10 = r9.pos
                int r10 = r10 + (-1)
                r9.pos = r10
                return
            L31:
                int r3 = r9.pos
                int r3 = r3 + r0
                r9.pos = r3
            L36:
                if (r0 < 0) goto L106
                char r3 = r10.charAt(r0)
                if (r3 >= r1) goto L4f
                int r4 = r9.pos
                int r5 = r9.offsetMinusOne
                if (r4 <= r5) goto L4f
                byte[] r5 = r9.buffer
                int r6 = r4 + (-1)
                r9.pos = r6
                byte r3 = (byte) r3
                r5[r4] = r3
                goto L103
            L4f:
                r4 = 2048(0x800, float:2.87E-42)
                if (r3 >= r4) goto L72
                int r4 = r9.pos
                int r5 = r9.offset
                if (r4 <= r5) goto L72
                byte[] r5 = r9.buffer
                int r6 = r4 + (-1)
                r9.pos = r6
                r7 = r3 & 63
                r7 = r7 | r1
                byte r7 = (byte) r7
                r5[r4] = r7
                int r4 = r4 + (-2)
                r9.pos = r4
                int r3 = r3 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                r5[r6] = r3
                goto L103
            L72:
                r4 = 55296(0xd800, float:7.7486E-41)
                if (r3 < r4) goto L7c
                r4 = 57343(0xdfff, float:8.0355E-41)
                if (r4 >= r3) goto La8
            L7c:
                int r4 = r9.pos
                int r5 = r9.offset
                int r5 = r5 + 1
                if (r4 <= r5) goto La8
                byte[] r5 = r9.buffer
                int r6 = r4 + (-1)
                r9.pos = r6
                r7 = r3 & 63
                r7 = r7 | r1
                byte r7 = (byte) r7
                r5[r4] = r7
                int r7 = r4 + (-2)
                r9.pos = r7
                int r8 = r3 >>> 6
                r8 = r8 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                r5[r6] = r8
                int r4 = r4 + (-3)
                r9.pos = r4
                int r3 = r3 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                r5[r7] = r3
                goto L103
            La8:
                int r4 = r9.pos
                int r5 = r9.offset
                int r5 = r5 + 2
                if (r4 <= r5) goto Lfe
                if (r0 == 0) goto Lf6
                int r4 = r0 + (-1)
                char r4 = r10.charAt(r4)
                boolean r5 = java.lang.Character.isSurrogatePair(r4, r3)
                if (r5 == 0) goto Lf6
                int r0 = r0 + (-1)
                int r3 = java.lang.Character.toCodePoint(r4, r3)
                byte[] r4 = r9.buffer
                int r5 = r9.pos
                int r6 = r5 + (-1)
                r9.pos = r6
                r7 = r3 & 63
                r7 = r7 | r1
                byte r7 = (byte) r7
                r4[r5] = r7
                int r7 = r5 + (-2)
                r9.pos = r7
                int r8 = r3 >>> 6
                r8 = r8 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                r4[r6] = r8
                int r6 = r5 + (-3)
                r9.pos = r6
                int r8 = r3 >>> 12
                r8 = r8 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                r4[r7] = r8
                int r5 = r5 + (-4)
                r9.pos = r5
                int r3 = r3 >>> 18
                r3 = r3 | 240(0xf0, float:3.36E-43)
                byte r3 = (byte) r3
                r4[r6] = r3
                goto L103
            Lf6:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r10 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r1 = r0 + (-1)
                r10.<init>(r1, r0)
                throw r10
            Lfe:
                r9.requireSpace(r0)
                int r0 = r0 + 1
            L103:
                int r0 = r0 + r2
                goto L36
            L106:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int r1, int r2) {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
                r0.writeVarint32(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeVarint64(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int r2) {
                r1 = this;
                r0 = r2 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L8
                r1.writeVarint32OneByte(r2)
                goto L25
            L8:
                r0 = r2 & (-16384(0xffffffffffffc000, float:NaN))
                if (r0 != 0) goto L10
                r1.writeVarint32TwoBytes(r2)
                goto L25
            L10:
                r0 = -2097152(0xffffffffffe00000, float:NaN)
                r0 = r0 & r2
                if (r0 != 0) goto L19
                r1.writeVarint32ThreeBytes(r2)
                goto L25
            L19:
                r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
                r0 = r0 & r2
                if (r0 != 0) goto L22
                r1.writeVarint32FourBytes(r2)
                goto L25
            L22:
                r1.writeVarint32FiveBytes(r2)
            L25:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long r2) {
                r1 = this;
                byte r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.access$200(r2)
                switch(r0) {
                    case 1: goto L2c;
                    case 2: goto L28;
                    case 3: goto L24;
                    case 4: goto L20;
                    case 5: goto L1c;
                    case 6: goto L18;
                    case 7: goto L14;
                    case 8: goto L10;
                    case 9: goto Lc;
                    case 10: goto L8;
                    default: goto L7;
                }
            L7:
                goto L2f
            L8:
                r1.writeVarint64TenBytes(r2)
                goto L2f
            Lc:
                r1.writeVarint64NineBytes(r2)
                goto L2f
            L10:
                r1.writeVarint64EightBytes(r2)
                goto L2f
            L14:
                r1.writeVarint64SevenBytes(r2)
                goto L2f
            L18:
                r1.writeVarint64SixBytes(r2)
                goto L2f
            L1c:
                r1.writeVarint64FiveBytes(r2)
                goto L2f
            L20:
                r1.writeVarint64FourBytes(r2)
                goto L2f
            L24:
                r1.writeVarint64ThreeBytes(r2)
                goto L2f
            L28:
                r1.writeVarint64TwoBytes(r2)
                goto L2f
            L2c:
                r1.writeVarint64OneByte(r2)
            L2f:
                return
        }
    }

    private static final class UnsafeDirectWriter extends com.google.crypto.tink.shaded.protobuf.BinaryWriter {
        private java.nio.ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        UnsafeDirectWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                r1.nextBuffer()
                return
        }

        static /* synthetic */ boolean access$000() {
                boolean r0 = isSupported()
                return r0
        }

        private int bufferPos() {
                r4 = this;
                long r0 = r4.pos
                long r2 = r4.bufferOffset
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        private int bytesWrittenToCurrentBuffer() {
                r4 = this;
                long r0 = r4.limitMinusOne
                long r2 = r4.pos
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        private static boolean isSupported() {
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations()
                return r0
        }

        private void nextBuffer() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newDirectBuffer()
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r1 = r0.newDirectBuffer(r1)
                r0.nextBuffer(r1)
                return
        }

        private void nextBuffer(com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r5) {
                r4 = this;
                boolean r0 = r5.hasNioBuffer()
                if (r0 == 0) goto L46
                java.nio.ByteBuffer r0 = r5.nioBuffer()
                boolean r1 = r0.isDirect()
                if (r1 == 0) goto L3e
                r4.finishCurrentBuffer()
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r1 = r4.buffers
                r1.addFirst(r5)
                r4.buffer = r0
                int r5 = r0.capacity()
                r0.limit(r5)
                java.nio.ByteBuffer r5 = r4.buffer
                r0 = 0
                r5.position(r0)
                java.nio.ByteBuffer r5 = r4.buffer
                long r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r5)
                r4.bufferOffset = r0
                java.nio.ByteBuffer r5 = r4.buffer
                int r5 = r5.limit()
                int r5 = r5 + (-1)
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.limitMinusOne = r0
                r4.pos = r0
                return
            L3e:
                java.lang.RuntimeException r5 = new java.lang.RuntimeException
                java.lang.String r0 = "Allocator returned non-direct buffer"
                r5.<init>(r0)
                throw r5
            L46:
                java.lang.RuntimeException r5 = new java.lang.RuntimeException
                java.lang.String r0 = "Allocated buffer does not have NIO buffer"
                r5.<init>(r0)
                throw r5
        }

        private int spaceLeft() {
                r1 = this;
                int r0 = r1.bufferPos()
                int r0 = r0 + 1
                return r0
        }

        private void writeVarint32FiveBytes(int r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 28
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 21
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 14
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 7
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                r7 = r7 & 127(0x7f, float:1.78E-43)
                r7 = r7 | 128(0x80, float:1.8E-43)
                byte r7 = (byte) r7
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r7)
                return
        }

        private void writeVarint32FourBytes(int r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 21
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 14
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 7
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                r7 = r7 & 127(0x7f, float:1.78E-43)
                r7 = r7 | 128(0x80, float:1.8E-43)
                byte r7 = (byte) r7
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r7)
                return
        }

        private void writeVarint32OneByte(int r5) {
                r4 = this;
                long r0 = r4.pos
                r2 = 1
                long r2 = r0 - r2
                r4.pos = r2
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r5)
                return
        }

        private void writeVarint32ThreeBytes(int r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 14
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 7
                r4 = r4 & 127(0x7f, float:1.78E-43)
                r4 = r4 | 128(0x80, float:1.8E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                r7 = r7 & 127(0x7f, float:1.78E-43)
                r7 = r7 | 128(0x80, float:1.8E-43)
                byte r7 = (byte) r7
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r7)
                return
        }

        private void writeVarint32TwoBytes(int r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >>> 7
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                r7 = r7 & 127(0x7f, float:1.78E-43)
                r7 = r7 | 128(0x80, float:1.8E-43)
                byte r7 = (byte) r7
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r7)
                return
        }

        private void writeVarint64EightBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 49
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 42
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 35
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r11)
                return
        }

        private void writeVarint64FiveBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r11)
                return
        }

        private void writeVarint64FourBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r11)
                return
        }

        private void writeVarint64NineBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 56
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 49
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 42
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 35
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r11)
                return
        }

        private void writeVarint64OneByte(long r5) {
                r4 = this;
                long r0 = r4.pos
                r2 = 1
                long r2 = r0 - r2
                r4.pos = r2
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r5)
                return
        }

        private void writeVarint64SevenBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 42
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 35
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r11)
                return
        }

        private void writeVarint64SixBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 35
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r11)
                return
        }

        private void writeVarint64TenBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 63
                long r4 = r11 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 56
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 49
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 42
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 35
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 28
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 21
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 14
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                long r4 = r4 & r6
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r11)
                return
        }

        private void writeVarint64ThreeBytes(long r11) {
                r10 = this;
                long r0 = r10.pos
                r2 = 1
                long r4 = r0 - r2
                r10.pos = r4
                int r4 = (int) r11
                int r4 = r4 >>> 14
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r4 = r0 - r2
                r10.pos = r4
                r4 = 7
                long r4 = r11 >>> r4
                r6 = 127(0x7f, double:6.27E-322)
                long r4 = r4 & r6
                r8 = 128(0x80, double:6.3E-322)
                long r4 = r4 | r8
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r10.pos
                long r2 = r0 - r2
                r10.pos = r2
                long r11 = r11 & r6
                long r11 = r11 | r8
                int r11 = (int) r11
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r11)
                return
        }

        private void writeVarint64TwoBytes(long r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 7
                long r4 = r7 >>> r4
                int r4 = (int) r4
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                int r7 = (int) r7
                r7 = r7 & 127(0x7f, float:1.78E-43)
                r7 = r7 | 128(0x80, float:1.8E-43)
                byte r7 = (byte) r7
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r7)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.buffer
                if (r0 == 0) goto L21
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                r2.totalDoneBytes = r0
                java.nio.ByteBuffer r0 = r2.buffer
                int r1 = r2.bufferPos()
                int r1 = r1 + 1
                r0.position(r1)
                r0 = 0
                r2.buffer = r0
                r0 = 0
                r2.pos = r0
                r2.limitMinusOne = r0
            L21:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
                r2 = this;
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int r2) {
                r1 = this;
                int r0 = r1.spaceLeft()
                if (r0 >= r2) goto L9
                r1.nextBuffer(r2)
            L9:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r5) {
                r4 = this;
                long r0 = r4.pos
                r2 = 1
                long r2 = r0 - r2
                r4.pos = r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r6) {
                r5 = this;
                int r0 = r6.remaining()
                int r1 = r5.spaceLeft()
                if (r1 >= r0) goto Ld
                r5.nextBuffer(r0)
            Ld:
                long r1 = r5.pos
                long r3 = (long) r0
                long r1 = r1 - r3
                r5.pos = r1
                java.nio.ByteBuffer r0 = r5.buffer
                int r1 = r5.bufferPos()
                int r1 = r1 + 1
                r0.position(r1)
                java.nio.ByteBuffer r0 = r5.buffer
                r0.put(r6)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r5, int r6, int r7) {
                r4 = this;
                int r0 = r4.spaceLeft()
                if (r0 >= r7) goto L9
                r4.nextBuffer(r7)
            L9:
                long r0 = r4.pos
                long r2 = (long) r7
                long r0 = r0 - r2
                r4.pos = r0
                java.nio.ByteBuffer r0 = r4.buffer
                int r1 = r4.bufferPos()
                int r1 = r1 + 1
                r0.position(r1)
                java.nio.ByteBuffer r0 = r4.buffer
                r0.put(r5, r6, r7)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int r2, boolean r3) {
                r1 = this;
                r0 = 6
                r1.requireSpace(r0)
                byte r3 = (byte) r3
                r1.write(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean r1) {
                r0 = this;
                byte r1 = (byte) r1
                r0.write(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
                r1 = this;
                r3.writeToReverse(r1)     // Catch: java.io.IOException -> L14
                r0 = 10
                r1.requireSpace(r0)
                int r3 = r3.size()
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
            L14:
                r2 = move-exception
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                r3.<init>(r2)
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeEndGroup(int r2) {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >> 24
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >> 16
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                int r4 = r7 >> 8
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                r7 = r7 & 255(0xff, float:3.57E-43)
                byte r7 = (byte) r7
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r7)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int r2, int r3) {
                r1 = this;
                r0 = 9
                r1.requireSpace(r0)
                r1.writeFixed32(r3)
                r3 = 5
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int r2, long r3) {
                r1 = this;
                r0 = 13
                r1.requireSpace(r0)
                r1.writeFixed64(r3)
                r3 = 1
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long r7) {
                r6 = this;
                long r0 = r6.pos
                r2 = 1
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 56
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 48
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 40
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 32
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 24
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 16
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r4 = r0 - r2
                r6.pos = r4
                r4 = 8
                long r4 = r7 >> r4
                int r4 = (int) r4
                r4 = r4 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r4)
                long r0 = r6.pos
                long r2 = r0 - r2
                r6.pos = r2
                int r7 = (int) r7
                r7 = r7 & 255(0xff, float:3.57E-43)
                byte r7 = (byte) r7
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r7)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r0.writeTo(r3, r1)
                r3 = 3
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                r4.writeTo(r3, r1)
                r3 = 3
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int r3) {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeVarint32(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeVarint64(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int r2, int r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeInt32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r6) {
                r5 = this;
                int r0 = r6.remaining()
                int r1 = r5.spaceLeft()
                if (r1 >= r0) goto L1c
                int r1 = r5.totalDoneBytes
                int r1 = r1 + r0
                r5.totalDoneBytes = r1
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r5.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r6 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r6)
                r0.addFirst(r6)
                r5.nextBuffer()
                return
            L1c:
                long r1 = r5.pos
                long r3 = (long) r0
                long r1 = r1 - r3
                r5.pos = r1
                java.nio.ByteBuffer r0 = r5.buffer
                int r1 = r5.bufferPos()
                int r1 = r1 + 1
                r0.position(r1)
                java.nio.ByteBuffer r0 = r5.buffer
                r0.put(r6)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r5, int r6, int r7) {
                r4 = this;
                int r0 = r4.spaceLeft()
                if (r0 >= r7) goto L18
                int r0 = r4.totalDoneBytes
                int r0 = r0 + r7
                r4.totalDoneBytes = r0
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r4.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r5 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r5, r6, r7)
                r0.addFirst(r5)
                r4.nextBuffer()
                return
            L18:
                long r0 = r4.pos
                long r2 = (long) r7
                long r0 = r0 - r2
                r4.pos = r0
                java.nio.ByteBuffer r0 = r4.buffer
                int r1 = r4.bufferPos()
                int r1 = r1 + 1
                r0.position(r1)
                java.nio.ByteBuffer r0 = r4.buffer
                r0.put(r5, r6, r7)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r3, java.lang.Object r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.getTotalBytesWritten()
                com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r1.writeTo(r4, r2)
                int r4 = r2.getTotalBytesWritten()
                int r4 = r4 - r0
                r0 = 10
                r2.requireSpace(r0)
                r2.writeVarint32(r4)
                r4 = 2
                r2.writeTag(r3, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                int r0 = r1.getTotalBytesWritten()
                r4.writeTo(r3, r1)
                int r3 = r1.getTotalBytesWritten()
                int r3 = r3 - r0
                r4 = 10
                r1.requireSpace(r4)
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int r1) {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag32(r1)
                r0.writeVarint32(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeSInt32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeSInt64(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long r1) {
                r0 = this;
                long r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag64(r1)
                r0.writeVarint64(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @java.lang.Deprecated
        public void writeStartGroup(int r2) {
                r1 = this;
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int r2, java.lang.String r3) {
                r1 = this;
                int r0 = r1.getTotalBytesWritten()
                r1.writeString(r3)
                int r3 = r1.getTotalBytesWritten()
                int r3 = r3 - r0
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeString(java.lang.String r13) {
                r12 = this;
                int r0 = r13.length()
                r12.requireSpace(r0)
                int r0 = r13.length()
                int r0 = r0 + (-1)
            Ld:
                r1 = 128(0x80, float:1.8E-43)
                r2 = 1
                if (r0 < 0) goto L26
                char r4 = r13.charAt(r0)
                if (r4 >= r1) goto L26
                long r5 = r12.pos
                long r1 = r5 - r2
                r12.pos = r1
                byte r1 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r5, r1)
                int r0 = r0 + (-1)
                goto Ld
            L26:
                r4 = -1
                if (r0 != r4) goto L2a
                return
            L2a:
                if (r0 < 0) goto L110
                char r5 = r13.charAt(r0)
                if (r5 >= r1) goto L44
                long r6 = r12.pos
                long r8 = r12.bufferOffset
                int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r8 < 0) goto L44
                long r8 = r6 - r2
                r12.pos = r8
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r5)
                goto L10d
            L44:
                r6 = 2048(0x800, float:2.87E-42)
                if (r5 >= r6) goto L6b
                long r6 = r12.pos
                long r8 = r12.bufferOffset
                int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r8 <= 0) goto L6b
                long r8 = r6 - r2
                r12.pos = r8
                r8 = r5 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                int r5 = r5 >>> 6
                r5 = r5 | 960(0x3c0, float:1.345E-42)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r5)
                goto L10d
            L6b:
                r6 = 55296(0xd800, float:7.7486E-41)
                if (r5 < r6) goto L75
                r6 = 57343(0xdfff, float:8.0355E-41)
                if (r6 >= r5) goto La7
            L75:
                long r6 = r12.pos
                long r8 = r12.bufferOffset
                long r8 = r8 + r2
                int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r8 <= 0) goto La7
                long r8 = r6 - r2
                r12.pos = r8
                r8 = r5 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                int r8 = r5 >>> 6
                r8 = r8 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                int r5 = r5 >>> 12
                r5 = r5 | 480(0x1e0, float:6.73E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r5)
                goto L10d
            La7:
                long r6 = r12.pos
                long r8 = r12.bufferOffset
                r10 = 2
                long r8 = r8 + r10
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 <= 0) goto L108
                if (r0 == 0) goto L100
                int r6 = r0 + (-1)
                char r6 = r13.charAt(r6)
                boolean r7 = java.lang.Character.isSurrogatePair(r6, r5)
                if (r7 == 0) goto L100
                int r0 = r0 + (-1)
                int r5 = java.lang.Character.toCodePoint(r6, r5)
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                r8 = r5 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                int r8 = r5 >>> 6
                r8 = r8 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                int r8 = r5 >>> 12
                r8 = r8 & 63
                r8 = r8 | r1
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r8)
                long r6 = r12.pos
                long r8 = r6 - r2
                r12.pos = r8
                int r5 = r5 >>> 18
                r5 = r5 | 240(0xf0, float:3.36E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r5)
                goto L10d
            L100:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r13 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r1 = r0 + (-1)
                r13.<init>(r1, r0)
                throw r13
            L108:
                r12.requireSpace(r0)
                int r0 = r0 + 1
            L10d:
                int r0 = r0 + r4
                goto L2a
            L110:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int r1, int r2) {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
                r0.writeVarint32(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeVarint64(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int r2) {
                r1 = this;
                r0 = r2 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L8
                r1.writeVarint32OneByte(r2)
                goto L25
            L8:
                r0 = r2 & (-16384(0xffffffffffffc000, float:NaN))
                if (r0 != 0) goto L10
                r1.writeVarint32TwoBytes(r2)
                goto L25
            L10:
                r0 = -2097152(0xffffffffffe00000, float:NaN)
                r0 = r0 & r2
                if (r0 != 0) goto L19
                r1.writeVarint32ThreeBytes(r2)
                goto L25
            L19:
                r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
                r0 = r0 & r2
                if (r0 != 0) goto L22
                r1.writeVarint32FourBytes(r2)
                goto L25
            L22:
                r1.writeVarint32FiveBytes(r2)
            L25:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long r2) {
                r1 = this;
                byte r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.access$200(r2)
                switch(r0) {
                    case 1: goto L2c;
                    case 2: goto L28;
                    case 3: goto L24;
                    case 4: goto L20;
                    case 5: goto L1c;
                    case 6: goto L18;
                    case 7: goto L14;
                    case 8: goto L10;
                    case 9: goto Lc;
                    case 10: goto L8;
                    default: goto L7;
                }
            L7:
                goto L2f
            L8:
                r1.writeVarint64TenBytes(r2)
                goto L2f
            Lc:
                r1.writeVarint64NineBytes(r2)
                goto L2f
            L10:
                r1.writeVarint64EightBytes(r2)
                goto L2f
            L14:
                r1.writeVarint64SevenBytes(r2)
                goto L2f
            L18:
                r1.writeVarint64SixBytes(r2)
                goto L2f
            L1c:
                r1.writeVarint64FiveBytes(r2)
                goto L2f
            L20:
                r1.writeVarint64FourBytes(r2)
                goto L2f
            L24:
                r1.writeVarint64ThreeBytes(r2)
                goto L2f
            L28:
                r1.writeVarint64TwoBytes(r2)
                goto L2f
            L2c:
                r1.writeVarint64OneByte(r2)
            L2f:
                return
        }
    }

    private static final class UnsafeHeapWriter extends com.google.crypto.tink.shaded.protobuf.BinaryWriter {
        private com.google.crypto.tink.shaded.protobuf.AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        UnsafeHeapWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                r1.nextBuffer()
                return
        }

        private int arrayPos() {
                r2 = this;
                long r0 = r2.pos
                int r0 = (int) r0
                return r0
        }

        static boolean isSupported() {
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeArrayOperations()
                return r0
        }

        private void nextBuffer() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r1.newHeapBuffer()
                r1.nextBuffer(r0)
                return
        }

        private void nextBuffer(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r1 = r0.newHeapBuffer(r1)
                r0.nextBuffer(r1)
                return
        }

        private void nextBuffer(com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r5) {
                r4 = this;
                boolean r0 = r5.hasArray()
                if (r0 == 0) goto L38
                r4.finishCurrentBuffer()
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r4.buffers
                r0.addFirst(r5)
                r4.allocatedBuffer = r5
                byte[] r0 = r5.array()
                r4.buffer = r0
                int r0 = r5.arrayOffset()
                long r0 = (long) r0
                int r2 = r5.limit()
                long r2 = (long) r2
                long r2 = r2 + r0
                r4.limit = r2
                int r5 = r5.position()
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.offset = r0
                r2 = 1
                long r0 = r0 - r2
                r4.offsetMinusOne = r0
                long r0 = r4.limit
                long r0 = r0 - r2
                r4.limitMinusOne = r0
                r4.pos = r0
                return
            L38:
                java.lang.RuntimeException r5 = new java.lang.RuntimeException
                java.lang.String r0 = "Allocator returned non-heap buffer"
                r5.<init>(r0)
                throw r5
        }

        private void writeVarint32FiveBytes(int r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 28
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 21
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 14
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 7
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                r8 = r8 & 127(0x7f, float:1.78E-43)
                r8 = r8 | 128(0x80, float:1.8E-43)
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r8)
                return
        }

        private void writeVarint32FourBytes(int r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 21
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 14
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 7
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                r8 = r8 & 127(0x7f, float:1.78E-43)
                r8 = r8 | 128(0x80, float:1.8E-43)
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r8)
                return
        }

        private void writeVarint32OneByte(int r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                long r1 = r5.pos
                r3 = 1
                long r3 = r1 - r3
                r5.pos = r3
                byte r6 = (byte) r6
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r6)
                return
        }

        private void writeVarint32ThreeBytes(int r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 14
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 7
                r5 = r5 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.8E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                r8 = r8 & 127(0x7f, float:1.78E-43)
                r8 = r8 | 128(0x80, float:1.8E-43)
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r8)
                return
        }

        private void writeVarint32TwoBytes(int r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >>> 7
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                r8 = r8 & 127(0x7f, float:1.78E-43)
                r8 = r8 | 128(0x80, float:1.8E-43)
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r8)
                return
        }

        private void writeVarint64EightBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 49
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 42
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 35
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r12 = r12 & r7
                long r12 = r12 | r9
                int r12 = (int) r12
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r12)
                return
        }

        private void writeVarint64FiveBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r12 = r12 & r7
                long r12 = r12 | r9
                int r12 = (int) r12
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r12)
                return
        }

        private void writeVarint64FourBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r12 = r12 & r7
                long r12 = r12 | r9
                int r12 = (int) r12
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r12)
                return
        }

        private void writeVarint64NineBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 56
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 49
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 42
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 35
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r12 = r12 & r7
                long r12 = r12 | r9
                int r12 = (int) r12
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r12)
                return
        }

        private void writeVarint64OneByte(long r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                long r1 = r5.pos
                r3 = 1
                long r3 = r1 - r3
                r5.pos = r3
                int r6 = (int) r6
                byte r6 = (byte) r6
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r6)
                return
        }

        private void writeVarint64SevenBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 42
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 35
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r12 = r12 & r7
                long r12 = r12 | r9
                int r12 = (int) r12
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r12)
                return
        }

        private void writeVarint64SixBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 35
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r12 = r12 & r7
                long r12 = r12 | r9
                int r12 = (int) r12
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r12)
                return
        }

        private void writeVarint64TenBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 63
                long r5 = r12 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 56
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 49
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 42
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 35
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 28
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 21
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 14
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                long r5 = r5 & r7
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r12 = r12 & r7
                long r12 = r12 | r9
                int r12 = (int) r12
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r12)
                return
        }

        private void writeVarint64ThreeBytes(long r12) {
                r11 = this;
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                r3 = 1
                long r5 = r1 - r3
                r11.pos = r5
                int r5 = (int) r12
                int r5 = r5 >>> 14
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r5 = r1 - r3
                r11.pos = r5
                r5 = 7
                long r5 = r12 >>> r5
                r7 = 127(0x7f, double:6.27E-322)
                long r5 = r5 & r7
                r9 = 128(0x80, double:6.3E-322)
                long r5 = r5 | r9
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r11.buffer
                long r1 = r11.pos
                long r3 = r1 - r3
                r11.pos = r3
                long r12 = r12 & r7
                long r12 = r12 | r9
                int r12 = (int) r12
                byte r12 = (byte) r12
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r12)
                return
        }

        private void writeVarint64TwoBytes(long r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 7
                long r5 = r8 >>> r5
                int r5 = (int) r5
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                int r8 = (int) r8
                r8 = r8 & 127(0x7f, float:1.78E-43)
                r8 = r8 | 128(0x80, float:1.8E-43)
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r8)
                return
        }

        int bytesWrittenToCurrentBuffer() {
                r4 = this;
                long r0 = r4.limitMinusOne
                long r2 = r4.pos
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void finishCurrentBuffer() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r3.allocatedBuffer
                if (r0 == 0) goto L28
                int r0 = r3.totalDoneBytes
                int r1 = r3.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                r3.totalDoneBytes = r0
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r3.allocatedBuffer
                int r1 = r3.arrayPos()
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r2 = r3.allocatedBuffer
                int r2 = r2.arrayOffset()
                int r1 = r1 - r2
                int r1 = r1 + 1
                r0.position(r1)
                r0 = 0
                r3.allocatedBuffer = r0
                r0 = 0
                r3.pos = r0
                r3.limitMinusOne = r0
            L28:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
                r2 = this;
                int r0 = r2.totalDoneBytes
                int r1 = r2.bytesWrittenToCurrentBuffer()
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void requireSpace(int r2) {
                r1 = this;
                int r0 = r1.spaceLeft()
                if (r0 >= r2) goto L9
                r1.nextBuffer(r2)
            L9:
                return
        }

        int spaceLeft() {
                r4 = this;
                long r0 = r4.pos
                long r2 = r4.offsetMinusOne
                long r0 = r0 - r2
                int r0 = (int) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte r6) {
                r5 = this;
                byte[] r0 = r5.buffer
                long r1 = r5.pos
                r3 = 1
                long r3 = r1 - r3
                r5.pos = r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r6)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer r6) {
                r5 = this;
                int r0 = r6.remaining()
                r5.requireSpace(r0)
                long r1 = r5.pos
                long r3 = (long) r0
                long r1 = r1 - r3
                r5.pos = r1
                byte[] r1 = r5.buffer
                int r2 = r5.arrayPos()
                int r2 = r2 + 1
                r6.get(r1, r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] r5, int r6, int r7) {
                r4 = this;
                if (r6 < 0) goto L1c
                int r0 = r6 + r7
                int r1 = r5.length
                if (r0 > r1) goto L1c
                r4.requireSpace(r7)
                long r0 = r4.pos
                long r2 = (long) r7
                long r0 = r0 - r2
                r4.pos = r0
                byte[] r0 = r4.buffer
                int r1 = r4.arrayPos()
                int r1 = r1 + 1
                java.lang.System.arraycopy(r5, r6, r0, r1, r7)
                return
            L1c:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                int r5 = r5.length
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7}
                java.lang.String r6 = "value.length=%d, offset=%d, length=%d"
                java.lang.String r5 = java.lang.String.format(r6, r5)
                r0.<init>(r5)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int r2, boolean r3) {
                r1 = this;
                r0 = 6
                r1.requireSpace(r0)
                byte r3 = (byte) r3
                r1.write(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeBool(boolean r1) {
                r0 = this;
                byte r1 = (byte) r1
                r0.write(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
                r1 = this;
                r3.writeToReverse(r1)     // Catch: java.io.IOException -> L14
                r0 = 10
                r1.requireSpace(r0)
                int r3 = r3.size()
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
            L14:
                r2 = move-exception
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                r3.<init>(r2)
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeEndGroup(int r2) {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed32(int r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >> 24
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >> 16
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                int r5 = r8 >> 8
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r8)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int r2, int r3) {
                r1 = this;
                r0 = 9
                r1.requireSpace(r0)
                r1.writeFixed32(r3)
                r3 = 5
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int r2, long r3) {
                r1 = this;
                r0 = 13
                r1.requireSpace(r0)
                r1.writeFixed64(r3)
                r3 = 1
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeFixed64(long r8) {
                r7 = this;
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                r3 = 1
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 56
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 48
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 40
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 32
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 24
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 16
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r5 = r1 - r3
                r7.pos = r5
                r5 = 8
                long r5 = r8 >> r5
                int r5 = (int) r5
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                byte[] r0 = r7.buffer
                long r1 = r7.pos
                long r3 = r1 - r3
                r7.pos = r3
                int r8 = (int) r8
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r0, r1, r8)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r0.writeTo(r3, r1)
                r3 = 3
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.writeTag(r2, r0)
                r4.writeTo(r3, r1)
                r3 = 3
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeInt32(int r3) {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeVarint32(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeVarint64(r0)
            La:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int r2, int r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeInt32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer r6) {
                r5 = this;
                int r0 = r6.remaining()
                int r1 = r5.spaceLeft()
                if (r1 >= r0) goto L1b
                int r1 = r5.totalDoneBytes
                int r1 = r1 + r0
                r5.totalDoneBytes = r1
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r1 = r5.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r2 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r6)
                r1.addFirst(r2)
                r5.nextBuffer()
            L1b:
                long r1 = r5.pos
                long r3 = (long) r0
                long r1 = r1 - r3
                r5.pos = r1
                byte[] r1 = r5.buffer
                int r2 = r5.arrayPos()
                int r2 = r2 + 1
                r6.get(r1, r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] r5, int r6, int r7) {
                r4 = this;
                if (r6 < 0) goto L31
                int r0 = r6 + r7
                int r1 = r5.length
                if (r0 > r1) goto L31
                int r0 = r4.spaceLeft()
                if (r0 >= r7) goto L1f
                int r0 = r4.totalDoneBytes
                int r0 = r0 + r7
                r4.totalDoneBytes = r0
                java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r4.buffers
                com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r5 = com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.wrap(r5, r6, r7)
                r0.addFirst(r5)
                r4.nextBuffer()
                return
            L1f:
                long r0 = r4.pos
                long r2 = (long) r7
                long r0 = r0 - r2
                r4.pos = r0
                byte[] r0 = r4.buffer
                int r1 = r4.arrayPos()
                int r1 = r1 + 1
                java.lang.System.arraycopy(r5, r6, r0, r1, r7)
                return
            L31:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                int r5 = r5.length
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7}
                java.lang.String r6 = "value.length=%d, offset=%d, length=%d"
                java.lang.String r5 = java.lang.String.format(r6, r5)
                r0.<init>(r5)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r3, java.lang.Object r4) throws java.io.IOException {
                r2 = this;
                int r0 = r2.getTotalBytesWritten()
                com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                r1.writeTo(r4, r2)
                int r4 = r2.getTotalBytesWritten()
                int r4 = r4 - r0
                r0 = 10
                r2.requireSpace(r0)
                r2.writeVarint32(r4)
                r4 = 2
                r2.writeTag(r3, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                int r0 = r1.getTotalBytesWritten()
                r4.writeTo(r3, r1)
                int r3 = r1.getTotalBytesWritten()
                int r3 = r3 - r0
                r4 = 10
                r1.requireSpace(r4)
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt32(int r1) {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag32(r1)
                r0.writeVarint32(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeSInt32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeSInt64(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeSInt64(long r1) {
                r0 = this;
                long r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.encodeZigZag64(r1)
                r0.writeVarint64(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeStartGroup(int r2) {
                r1 = this;
                r0 = 3
                r1.writeTag(r2, r0)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int r2, java.lang.String r3) {
                r1 = this;
                int r0 = r1.getTotalBytesWritten()
                r1.writeString(r3)
                int r3 = r1.getTotalBytesWritten()
                int r3 = r3 - r0
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r3 = 2
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeString(java.lang.String r13) {
                r12 = this;
                int r0 = r13.length()
                r12.requireSpace(r0)
                int r0 = r13.length()
                int r0 = r0 + (-1)
            Ld:
                r1 = 128(0x80, float:1.8E-43)
                r2 = 1
                if (r0 < 0) goto L28
                char r4 = r13.charAt(r0)
                if (r4 >= r1) goto L28
                byte[] r1 = r12.buffer
                long r5 = r12.pos
                long r2 = r5 - r2
                r12.pos = r2
                byte r2 = (byte) r4
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r5, r2)
                int r0 = r0 + (-1)
                goto Ld
            L28:
                r4 = -1
                if (r0 != r4) goto L2c
                return
            L2c:
                if (r0 < 0) goto L126
                char r5 = r13.charAt(r0)
                if (r5 >= r1) goto L48
                long r6 = r12.pos
                long r8 = r12.offsetMinusOne
                int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r8 <= 0) goto L48
                byte[] r8 = r12.buffer
                long r9 = r6 - r2
                r12.pos = r9
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r6, r5)
                goto L123
            L48:
                r6 = 2048(0x800, float:2.87E-42)
                if (r5 >= r6) goto L73
                long r6 = r12.pos
                long r8 = r12.offset
                int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r8 <= 0) goto L73
                byte[] r8 = r12.buffer
                long r9 = r6 - r2
                r12.pos = r9
                r9 = r5 & 63
                r9 = r9 | r1
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r6, r9)
                byte[] r6 = r12.buffer
                long r7 = r12.pos
                long r9 = r7 - r2
                r12.pos = r9
                int r5 = r5 >>> 6
                r5 = r5 | 960(0x3c0, float:1.345E-42)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r5)
                goto L123
            L73:
                r6 = 55296(0xd800, float:7.7486E-41)
                if (r5 < r6) goto L7d
                r6 = 57343(0xdfff, float:8.0355E-41)
                if (r6 >= r5) goto Lb5
            L7d:
                long r6 = r12.pos
                long r8 = r12.offset
                long r8 = r8 + r2
                int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r8 <= 0) goto Lb5
                byte[] r8 = r12.buffer
                long r9 = r6 - r2
                r12.pos = r9
                r9 = r5 & 63
                r9 = r9 | r1
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r8, r6, r9)
                byte[] r6 = r12.buffer
                long r7 = r12.pos
                long r9 = r7 - r2
                r12.pos = r9
                int r9 = r5 >>> 6
                r9 = r9 & 63
                r9 = r9 | r1
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r9)
                byte[] r6 = r12.buffer
                long r7 = r12.pos
                long r9 = r7 - r2
                r12.pos = r9
                int r5 = r5 >>> 12
                r5 = r5 | 480(0x1e0, float:6.73E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r5)
                goto L123
            Lb5:
                long r6 = r12.pos
                long r8 = r12.offset
                r10 = 2
                long r8 = r8 + r10
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 <= 0) goto L11e
                if (r0 == 0) goto L116
                int r6 = r0 + (-1)
                char r6 = r13.charAt(r6)
                boolean r7 = java.lang.Character.isSurrogatePair(r6, r5)
                if (r7 == 0) goto L116
                int r0 = r0 + (-1)
                int r5 = java.lang.Character.toCodePoint(r6, r5)
                byte[] r6 = r12.buffer
                long r7 = r12.pos
                long r9 = r7 - r2
                r12.pos = r9
                r9 = r5 & 63
                r9 = r9 | r1
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r9)
                byte[] r6 = r12.buffer
                long r7 = r12.pos
                long r9 = r7 - r2
                r12.pos = r9
                int r9 = r5 >>> 6
                r9 = r9 & 63
                r9 = r9 | r1
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r9)
                byte[] r6 = r12.buffer
                long r7 = r12.pos
                long r9 = r7 - r2
                r12.pos = r9
                int r9 = r5 >>> 12
                r9 = r9 & 63
                r9 = r9 | r1
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r9)
                byte[] r6 = r12.buffer
                long r7 = r12.pos
                long r9 = r7 - r2
                r12.pos = r9
                int r5 = r5 >>> 18
                r5 = r5 | 240(0xf0, float:3.36E-43)
                byte r5 = (byte) r5
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r6, r7, r5)
                goto L123
            L116:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r13 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r1 = r0 + (-1)
                r13.<init>(r1, r0)
                throw r13
            L11e:
                r12.requireSpace(r0)
                int r0 = r0 + 1
            L123:
                int r0 = r0 + r4
                goto L2c
            L126:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeTag(int r1, int r2) {
                r0 = this;
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r2)
                r0.writeVarint32(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int r2, int r3) {
                r1 = this;
                r0 = 10
                r1.requireSpace(r0)
                r1.writeVarint32(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int r2, long r3) {
                r1 = this;
                r0 = 15
                r1.requireSpace(r0)
                r1.writeVarint64(r3)
                r3 = 0
                r1.writeTag(r2, r3)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint32(int r2) {
                r1 = this;
                r0 = r2 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L8
                r1.writeVarint32OneByte(r2)
                goto L25
            L8:
                r0 = r2 & (-16384(0xffffffffffffc000, float:NaN))
                if (r0 != 0) goto L10
                r1.writeVarint32TwoBytes(r2)
                goto L25
            L10:
                r0 = -2097152(0xffffffffffe00000, float:NaN)
                r0 = r0 & r2
                if (r0 != 0) goto L19
                r1.writeVarint32ThreeBytes(r2)
                goto L25
            L19:
                r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
                r0 = r0 & r2
                if (r0 != 0) goto L22
                r1.writeVarint32FourBytes(r2)
                goto L25
            L22:
                r1.writeVarint32FiveBytes(r2)
            L25:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        void writeVarint64(long r2) {
                r1 = this;
                byte r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.access$200(r2)
                switch(r0) {
                    case 1: goto L2c;
                    case 2: goto L28;
                    case 3: goto L24;
                    case 4: goto L20;
                    case 5: goto L1c;
                    case 6: goto L18;
                    case 7: goto L14;
                    case 8: goto L10;
                    case 9: goto Lc;
                    case 10: goto L8;
                    default: goto L7;
                }
            L7:
                goto L2f
            L8:
                r1.writeVarint64TenBytes(r2)
                goto L2f
            Lc:
                r1.writeVarint64NineBytes(r2)
                goto L2f
            L10:
                r1.writeVarint64EightBytes(r2)
                goto L2f
            L14:
                r1.writeVarint64SevenBytes(r2)
                goto L2f
            L18:
                r1.writeVarint64SixBytes(r2)
                goto L2f
            L1c:
                r1.writeVarint64FiveBytes(r2)
                goto L2f
            L20:
                r1.writeVarint64FourBytes(r2)
                goto L2f
            L24:
                r1.writeVarint64ThreeBytes(r2)
                goto L2f
            L28:
                r1.writeVarint64TwoBytes(r2)
                goto L2f
            L2c:
                r1.writeVarint64OneByte(r2)
            L2f:
                return
        }
    }

    private BinaryWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r3, int r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r2.buffers = r0
            if (r4 <= 0) goto L1a
            java.lang.String r0 = "alloc"
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            com.google.crypto.tink.shaded.protobuf.BufferAllocator r3 = (com.google.crypto.tink.shaded.protobuf.BufferAllocator) r3
            r2.alloc = r3
            r2.chunkSize = r4
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "chunkSize must be > 0"
            r3.<init>(r4)
            throw r3
    }

    /* synthetic */ BinaryWriter(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2, com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ byte access$200(long r0) {
            byte r0 = computeUInt64SizeNoTag(r0)
            return r0
    }

    private static byte computeUInt64SizeNoTag(long r6) {
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
            if (r0 == 0) goto L22
            r0 = 6
            byte r0 = (byte) r0
            r1 = 28
            long r6 = r6 >>> r1
            goto L23
        L22:
            r0 = 2
        L23:
            r4 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L31
            int r0 = r0 + 2
            byte r0 = (byte) r0
            r1 = 14
            long r6 = r6 >>> r1
        L31:
            r4 = -16384(0xffffffffffffc000, double:NaN)
            long r6 = r6 & r4
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L3b
            int r0 = r0 + 1
            byte r0 = (byte) r0
        L3b:
            return r0
    }

    static boolean isUnsafeDirectSupported() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.UnsafeDirectWriter.access$000()
            return r0
    }

    static boolean isUnsafeHeapSupported() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.UnsafeHeapWriter.isSupported()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.BinaryWriter newDirectInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r1 = newDirectInstance(r1, r0)
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.BinaryWriter newDirectInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2) {
            boolean r0 = isUnsafeDirectSupported()
            if (r0 == 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r1 = newUnsafeDirectInstance(r1, r2)
            goto Lf
        Lb:
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r1 = newSafeDirectInstance(r1, r2)
        Lf:
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.BinaryWriter newHeapInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r1 = newHeapInstance(r1, r0)
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.BinaryWriter newHeapInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2) {
            boolean r0 = isUnsafeHeapSupported()
            if (r0 == 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r1 = newUnsafeHeapInstance(r1, r2)
            goto Lf
        Lb:
            com.google.crypto.tink.shaded.protobuf.BinaryWriter r1 = newSafeHeapInstance(r1, r2)
        Lf:
            return r1
    }

    static com.google.crypto.tink.shaded.protobuf.BinaryWriter newSafeDirectInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2) {
            com.google.crypto.tink.shaded.protobuf.BinaryWriter$SafeDirectWriter r0 = new com.google.crypto.tink.shaded.protobuf.BinaryWriter$SafeDirectWriter
            r0.<init>(r1, r2)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.BinaryWriter newSafeHeapInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2) {
            com.google.crypto.tink.shaded.protobuf.BinaryWriter$SafeHeapWriter r0 = new com.google.crypto.tink.shaded.protobuf.BinaryWriter$SafeHeapWriter
            r0.<init>(r1, r2)
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.BinaryWriter newUnsafeDirectInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2) {
            boolean r0 = isUnsafeDirectSupported()
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.BinaryWriter$UnsafeDirectWriter r0 = new com.google.crypto.tink.shaded.protobuf.BinaryWriter$UnsafeDirectWriter
            r0.<init>(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Unsafe operations not supported"
            r1.<init>(r2)
            throw r1
    }

    static com.google.crypto.tink.shaded.protobuf.BinaryWriter newUnsafeHeapInstance(com.google.crypto.tink.shaded.protobuf.BufferAllocator r1, int r2) {
            boolean r0 = isUnsafeHeapSupported()
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.BinaryWriter$UnsafeHeapWriter r0 = new com.google.crypto.tink.shaded.protobuf.BinaryWriter$UnsafeHeapWriter
            r0.<init>(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Unsafe operations not supported"
            r1.<init>(r2)
            throw r1
    }

    private final void writeBoolList_Internal(int r3, com.google.crypto.tink.shaded.protobuf.BooleanArrayList r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L2e
            int r5 = r4.size()
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L15:
            if (r0 < 0) goto L21
            boolean r1 = r4.getBoolean(r0)
            r2.writeBool(r1)
            int r0 = r0 + (-1)
            goto L15
        L21:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L40
        L2e:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L34:
            if (r5 < 0) goto L40
            boolean r0 = r4.getBoolean(r5)
            r2.writeBool(r3, r0)
            int r5 = r5 + (-1)
            goto L34
        L40:
            return
    }

    private final void writeBoolList_Internal(int r3, java.util.List<java.lang.Boolean> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L34
            int r5 = r4.size()
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L15:
            if (r0 < 0) goto L27
            java.lang.Object r1 = r4.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2.writeBool(r1)
            int r0 = r0 + (-1)
            goto L15
        L27:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L4c
        L34:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L3a:
            if (r5 < 0) goto L4c
            java.lang.Object r0 = r4.get(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.writeBool(r3, r0)
            int r5 = r5 + (-1)
            goto L3a
        L4c:
            return
    }

    private final void writeDoubleList_Internal(int r4, com.google.crypto.tink.shaded.protobuf.DoubleArrayList r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L34
            int r6 = r5.size()
            int r6 = r6 * 8
            int r6 = r6 + 10
            r3.requireSpace(r6)
            int r6 = r3.getTotalBytesWritten()
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L27
            double r1 = r5.getDouble(r0)
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r3.writeFixed64(r1)
            int r0 = r0 + (-1)
            goto L17
        L27:
            int r5 = r3.getTotalBytesWritten()
            int r5 = r5 - r6
            r3.writeVarint32(r5)
            r5 = 2
            r3.writeTag(r4, r5)
            goto L46
        L34:
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L3a:
            if (r6 < 0) goto L46
            double r0 = r5.getDouble(r6)
            r3.writeDouble(r4, r0)
            int r6 = r6 + (-1)
            goto L3a
        L46:
            return
    }

    private final void writeDoubleList_Internal(int r4, java.util.List<java.lang.Double> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L3a
            int r6 = r5.size()
            int r6 = r6 * 8
            int r6 = r6 + 10
            r3.requireSpace(r6)
            int r6 = r3.getTotalBytesWritten()
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L2d
            java.lang.Object r1 = r5.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r3.writeFixed64(r1)
            int r0 = r0 + (-1)
            goto L17
        L2d:
            int r5 = r3.getTotalBytesWritten()
            int r5 = r5 - r6
            r3.writeVarint32(r5)
            r5 = 2
            r3.writeTag(r4, r5)
            goto L52
        L3a:
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L40:
            if (r6 < 0) goto L52
            java.lang.Object r0 = r5.get(r6)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r3.writeDouble(r4, r0)
            int r6 = r6 + (-1)
            goto L40
        L52:
            return
    }

    private final void writeFixed32List_Internal(int r3, com.google.crypto.tink.shaded.protobuf.IntArrayList r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L30
            int r5 = r4.size()
            int r5 = r5 * 4
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L23
            int r1 = r4.getInt(r0)
            r2.writeFixed32(r1)
            int r0 = r0 + (-1)
            goto L17
        L23:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L42
        L30:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L36:
            if (r5 < 0) goto L42
            int r0 = r4.getInt(r5)
            r2.writeFixed32(r3, r0)
            int r5 = r5 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeFixed32List_Internal(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L36
            int r5 = r4.size()
            int r5 = r5 * 4
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L29
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.writeFixed32(r1)
            int r0 = r0 + (-1)
            goto L17
        L29:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L4e
        L36:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L3c:
            if (r5 < 0) goto L4e
            java.lang.Object r0 = r4.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.writeFixed32(r3, r0)
            int r5 = r5 + (-1)
            goto L3c
        L4e:
            return
    }

    private final void writeFixed64List_Internal(int r4, com.google.crypto.tink.shaded.protobuf.LongArrayList r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L30
            int r6 = r5.size()
            int r6 = r6 * 8
            int r6 = r6 + 10
            r3.requireSpace(r6)
            int r6 = r3.getTotalBytesWritten()
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L23
            long r1 = r5.getLong(r0)
            r3.writeFixed64(r1)
            int r0 = r0 + (-1)
            goto L17
        L23:
            int r5 = r3.getTotalBytesWritten()
            int r5 = r5 - r6
            r3.writeVarint32(r5)
            r5 = 2
            r3.writeTag(r4, r5)
            goto L42
        L30:
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L36:
            if (r6 < 0) goto L42
            long r0 = r5.getLong(r6)
            r3.writeFixed64(r4, r0)
            int r6 = r6 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeFixed64List_Internal(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L36
            int r6 = r5.size()
            int r6 = r6 * 8
            int r6 = r6 + 10
            r3.requireSpace(r6)
            int r6 = r3.getTotalBytesWritten()
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L29
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3.writeFixed64(r1)
            int r0 = r0 + (-1)
            goto L17
        L29:
            int r5 = r3.getTotalBytesWritten()
            int r5 = r5 - r6
            r3.writeVarint32(r5)
            r5 = 2
            r3.writeTag(r4, r5)
            goto L4e
        L36:
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L3c:
            if (r6 < 0) goto L4e
            java.lang.Object r0 = r5.get(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3.writeFixed64(r4, r0)
            int r6 = r6 + (-1)
            goto L3c
        L4e:
            return
    }

    private final void writeFloatList_Internal(int r3, com.google.crypto.tink.shaded.protobuf.FloatArrayList r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L34
            int r5 = r4.size()
            int r5 = r5 * 4
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L27
            float r1 = r4.getFloat(r0)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r2.writeFixed32(r1)
            int r0 = r0 + (-1)
            goto L17
        L27:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L46
        L34:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L3a:
            if (r5 < 0) goto L46
            float r0 = r4.getFloat(r5)
            r2.writeFloat(r3, r0)
            int r5 = r5 + (-1)
            goto L3a
        L46:
            return
    }

    private final void writeFloatList_Internal(int r3, java.util.List<java.lang.Float> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L3a
            int r5 = r4.size()
            int r5 = r5 * 4
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L2d
            java.lang.Object r1 = r4.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r2.writeFixed32(r1)
            int r0 = r0 + (-1)
            goto L17
        L2d:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L52
        L3a:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L40:
            if (r5 < 0) goto L52
            java.lang.Object r0 = r4.get(r5)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r2.writeFloat(r3, r0)
            int r5 = r5 + (-1)
            goto L40
        L52:
            return
    }

    private final void writeInt32List_Internal(int r3, com.google.crypto.tink.shaded.protobuf.IntArrayList r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L30
            int r5 = r4.size()
            int r5 = r5 * 10
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L23
            int r1 = r4.getInt(r0)
            r2.writeInt32(r1)
            int r0 = r0 + (-1)
            goto L17
        L23:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L42
        L30:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L36:
            if (r5 < 0) goto L42
            int r0 = r4.getInt(r5)
            r2.writeInt32(r3, r0)
            int r5 = r5 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeInt32List_Internal(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L36
            int r5 = r4.size()
            int r5 = r5 * 10
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L29
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.writeInt32(r1)
            int r0 = r0 + (-1)
            goto L17
        L29:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L4e
        L36:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L3c:
            if (r5 < 0) goto L4e
            java.lang.Object r0 = r4.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.writeInt32(r3, r0)
            int r5 = r5 + (-1)
            goto L3c
        L4e:
            return
    }

    private void writeLazyString(int r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto La
            java.lang.String r3 = (java.lang.String) r3
            r1.writeString(r2, r3)
            goto Lf
        La:
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            r1.writeBytes(r2, r3)
        Lf:
            return
    }

    static final void writeMapEntryField(com.google.crypto.tink.shaded.protobuf.Writer r2, int r3, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r4, java.lang.Object r5) throws java.io.IOException {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r1 = r4.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Ld3;
                case 2: goto Lc9;
                case 3: goto Lbf;
                case 4: goto Lb5;
                case 5: goto Lab;
                case 6: goto La1;
                case 7: goto L97;
                case 8: goto L8d;
                case 9: goto L83;
                case 10: goto L7d;
                case 11: goto L73;
                case 12: goto L68;
                case 13: goto L5d;
                case 14: goto L52;
                case 15: goto L4d;
                case 16: goto L46;
                case 17: goto L20;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unsupported map value type for: "
            r3.<init>(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L20:
            boolean r4 = r5 instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            if (r4 == 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r5 = (com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) r5
            int r4 = r5.getNumber()
            r2.writeEnum(r3, r4)
            goto Ldc
        L2f:
            boolean r4 = r5 instanceof java.lang.Integer
            if (r4 == 0) goto L3e
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = r5.intValue()
            r2.writeEnum(r3, r4)
            goto Ldc
        L3e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unexpected type for enum in map."
            r2.<init>(r3)
            throw r2
        L46:
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = (com.google.crypto.tink.shaded.protobuf.ByteString) r5
            r2.writeBytes(r3, r5)
            goto Ldc
        L4d:
            r2.writeMessage(r3, r5)
            goto Ldc
        L52:
            java.lang.Double r5 = (java.lang.Double) r5
            double r4 = r5.doubleValue()
            r2.writeDouble(r3, r4)
            goto Ldc
        L5d:
            java.lang.Float r5 = (java.lang.Float) r5
            float r4 = r5.floatValue()
            r2.writeFloat(r3, r4)
            goto Ldc
        L68:
            java.lang.Long r5 = (java.lang.Long) r5
            long r4 = r5.longValue()
            r2.writeUInt64(r3, r4)
            goto Ldc
        L73:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = r5.intValue()
            r2.writeUInt32(r3, r4)
            goto Ldc
        L7d:
            java.lang.String r5 = (java.lang.String) r5
            r2.writeString(r3, r5)
            goto Ldc
        L83:
            java.lang.Long r5 = (java.lang.Long) r5
            long r4 = r5.longValue()
            r2.writeSInt64(r3, r4)
            goto Ldc
        L8d:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = r5.intValue()
            r2.writeSInt32(r3, r4)
            goto Ldc
        L97:
            java.lang.Long r5 = (java.lang.Long) r5
            long r4 = r5.longValue()
            r2.writeSFixed64(r3, r4)
            goto Ldc
        La1:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = r5.intValue()
            r2.writeSFixed32(r3, r4)
            goto Ldc
        Lab:
            java.lang.Long r5 = (java.lang.Long) r5
            long r4 = r5.longValue()
            r2.writeInt64(r3, r4)
            goto Ldc
        Lb5:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = r5.intValue()
            r2.writeInt32(r3, r4)
            goto Ldc
        Lbf:
            java.lang.Long r5 = (java.lang.Long) r5
            long r4 = r5.longValue()
            r2.writeFixed64(r3, r4)
            goto Ldc
        Lc9:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = r5.intValue()
            r2.writeFixed32(r3, r4)
            goto Ldc
        Ld3:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r2.writeBool(r3, r4)
        Ldc:
            return
    }

    private final void writeSInt32List_Internal(int r3, com.google.crypto.tink.shaded.protobuf.IntArrayList r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L30
            int r5 = r4.size()
            int r5 = r5 * 5
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L23
            int r1 = r4.getInt(r0)
            r2.writeSInt32(r1)
            int r0 = r0 + (-1)
            goto L17
        L23:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L42
        L30:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L36:
            if (r5 < 0) goto L42
            int r0 = r4.getInt(r5)
            r2.writeSInt32(r3, r0)
            int r5 = r5 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeSInt32List_Internal(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L36
            int r5 = r4.size()
            int r5 = r5 * 5
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L29
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.writeSInt32(r1)
            int r0 = r0 + (-1)
            goto L17
        L29:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L4e
        L36:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L3c:
            if (r5 < 0) goto L4e
            java.lang.Object r0 = r4.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.writeSInt32(r3, r0)
            int r5 = r5 + (-1)
            goto L3c
        L4e:
            return
    }

    private final void writeSInt64List_Internal(int r4, com.google.crypto.tink.shaded.protobuf.LongArrayList r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L30
            int r6 = r5.size()
            int r6 = r6 * 10
            int r6 = r6 + 10
            r3.requireSpace(r6)
            int r6 = r3.getTotalBytesWritten()
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L23
            long r1 = r5.getLong(r0)
            r3.writeSInt64(r1)
            int r0 = r0 + (-1)
            goto L17
        L23:
            int r5 = r3.getTotalBytesWritten()
            int r5 = r5 - r6
            r3.writeVarint32(r5)
            r5 = 2
            r3.writeTag(r4, r5)
            goto L42
        L30:
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L36:
            if (r6 < 0) goto L42
            long r0 = r5.getLong(r6)
            r3.writeSInt64(r4, r0)
            int r6 = r6 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeSInt64List_Internal(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L36
            int r6 = r5.size()
            int r6 = r6 * 10
            int r6 = r6 + 10
            r3.requireSpace(r6)
            int r6 = r3.getTotalBytesWritten()
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L29
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3.writeSInt64(r1)
            int r0 = r0 + (-1)
            goto L17
        L29:
            int r5 = r3.getTotalBytesWritten()
            int r5 = r5 - r6
            r3.writeVarint32(r5)
            r5 = 2
            r3.writeTag(r4, r5)
            goto L4e
        L36:
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L3c:
            if (r6 < 0) goto L4e
            java.lang.Object r0 = r5.get(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3.writeSInt64(r4, r0)
            int r6 = r6 + (-1)
            goto L3c
        L4e:
            return
    }

    private final void writeUInt32List_Internal(int r3, com.google.crypto.tink.shaded.protobuf.IntArrayList r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L30
            int r5 = r4.size()
            int r5 = r5 * 5
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L23
            int r1 = r4.getInt(r0)
            r2.writeVarint32(r1)
            int r0 = r0 + (-1)
            goto L17
        L23:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L42
        L30:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L36:
            if (r5 < 0) goto L42
            int r0 = r4.getInt(r5)
            r2.writeUInt32(r3, r0)
            int r5 = r5 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeUInt32List_Internal(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L36
            int r5 = r4.size()
            int r5 = r5 * 5
            int r5 = r5 + 10
            r2.requireSpace(r5)
            int r5 = r2.getTotalBytesWritten()
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L29
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.writeVarint32(r1)
            int r0 = r0 + (-1)
            goto L17
        L29:
            int r4 = r2.getTotalBytesWritten()
            int r4 = r4 - r5
            r2.writeVarint32(r4)
            r4 = 2
            r2.writeTag(r3, r4)
            goto L4e
        L36:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L3c:
            if (r5 < 0) goto L4e
            java.lang.Object r0 = r4.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.writeUInt32(r3, r0)
            int r5 = r5 + (-1)
            goto L3c
        L4e:
            return
    }

    private final void writeUInt64List_Internal(int r4, com.google.crypto.tink.shaded.protobuf.LongArrayList r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L30
            int r6 = r5.size()
            int r6 = r6 * 10
            int r6 = r6 + 10
            r3.requireSpace(r6)
            int r6 = r3.getTotalBytesWritten()
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L23
            long r1 = r5.getLong(r0)
            r3.writeVarint64(r1)
            int r0 = r0 + (-1)
            goto L17
        L23:
            int r5 = r3.getTotalBytesWritten()
            int r5 = r5 - r6
            r3.writeVarint32(r5)
            r5 = 2
            r3.writeTag(r4, r5)
            goto L42
        L30:
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L36:
            if (r6 < 0) goto L42
            long r0 = r5.getLong(r6)
            r3.writeUInt64(r4, r0)
            int r6 = r6 + (-1)
            goto L36
        L42:
            return
    }

    private final void writeUInt64List_Internal(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            if (r6 == 0) goto L36
            int r6 = r5.size()
            int r6 = r6 * 10
            int r6 = r6 + 10
            r3.requireSpace(r6)
            int r6 = r3.getTotalBytesWritten()
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L17:
            if (r0 < 0) goto L29
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3.writeVarint64(r1)
            int r0 = r0 + (-1)
            goto L17
        L29:
            int r5 = r3.getTotalBytesWritten()
            int r5 = r5 - r6
            r3.writeVarint32(r5)
            r5 = 2
            r3.writeTag(r4, r5)
            goto L4e
        L36:
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L3c:
            if (r6 < 0) goto L4e
            java.lang.Object r0 = r5.get(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3.writeUInt64(r4, r0)
            int r6 = r6 + (-1)
            goto L3c
        L4e:
            return
    }

    public final java.util.Queue<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> complete() {
            r1 = this;
            r1.finishCurrentBuffer()
            java.util.ArrayDeque<com.google.crypto.tink.shaded.protobuf.AllocatedBuffer> r0 = r1.buffers
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder fieldOrder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r0 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.DESCENDING
            return r0
    }

    abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    final com.google.crypto.tink.shaded.protobuf.AllocatedBuffer newDirectBuffer() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.BufferAllocator r0 = r2.alloc
            int r1 = r2.chunkSize
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r0.allocateDirectBuffer(r1)
            return r0
    }

    final com.google.crypto.tink.shaded.protobuf.AllocatedBuffer newDirectBuffer(int r3) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.BufferAllocator r0 = r2.alloc
            int r1 = r2.chunkSize
            int r3 = java.lang.Math.max(r3, r1)
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r3 = r0.allocateDirectBuffer(r3)
            return r3
    }

    final com.google.crypto.tink.shaded.protobuf.AllocatedBuffer newHeapBuffer() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.BufferAllocator r0 = r2.alloc
            int r1 = r2.chunkSize
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r0 = r0.allocateHeapBuffer(r1)
            return r0
    }

    final com.google.crypto.tink.shaded.protobuf.AllocatedBuffer newHeapBuffer(int r3) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.BufferAllocator r0 = r2.alloc
            int r1 = r2.chunkSize
            int r3 = java.lang.Math.max(r3, r1)
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r3 = r0.allocateHeapBuffer(r3)
            return r3
    }

    abstract void requireSpace(int r1);

    abstract void writeBool(boolean r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBoolList(int r2, java.util.List<java.lang.Boolean> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.BooleanArrayList
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.BooleanArrayList r3 = (com.google.crypto.tink.shaded.protobuf.BooleanArrayList) r3
            r1.writeBoolList_Internal(r2, r3, r4)
            goto Ld
        La:
            r1.writeBoolList_Internal(r2, r3, r4)
        Ld:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBytesList(int r3, java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> r4) throws java.io.IOException {
            r2 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L14
            java.lang.Object r1 = r4.get(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            r2.writeBytes(r3, r1)
            int r0 = r0 + (-1)
            goto L6
        L14:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeDouble(int r1, double r2) throws java.io.IOException {
            r0 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r0.writeFixed64(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeDoubleList(int r2, java.util.List<java.lang.Double> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.DoubleArrayList
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.DoubleArrayList r3 = (com.google.crypto.tink.shaded.protobuf.DoubleArrayList) r3
            r1.writeDoubleList_Internal(r2, r3, r4)
            goto Ld
        La:
            r1.writeDoubleList_Internal(r2, r3, r4)
        Ld:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeEnum(int r1, int r2) throws java.io.IOException {
            r0 = this;
            r0.writeInt32(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeEnumList(int r1, java.util.List<java.lang.Integer> r2, boolean r3) throws java.io.IOException {
            r0 = this;
            r0.writeInt32List(r1, r2, r3)
            return
    }

    abstract void writeFixed32(int r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed32List(int r2, java.util.List<java.lang.Integer> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.IntArrayList r3 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r3
            r1.writeFixed32List_Internal(r2, r3, r4)
            goto Ld
        La:
            r1.writeFixed32List_Internal(r2, r3, r4)
        Ld:
            return
    }

    abstract void writeFixed64(long r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed64List(int r2, java.util.List<java.lang.Long> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.LongArrayList r3 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r3
            r1.writeFixed64List_Internal(r2, r3, r4)
            goto Ld
        La:
            r1.writeFixed64List_Internal(r2, r3, r4)
        Ld:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFloat(int r1, float r2) throws java.io.IOException {
            r0 = this;
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r0.writeFixed32(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFloatList(int r2, java.util.List<java.lang.Float> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.FloatArrayList
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r3 = (com.google.crypto.tink.shaded.protobuf.FloatArrayList) r3
            r1.writeFloatList_Internal(r2, r3, r4)
            goto Ld
        La:
            r1.writeFloatList_Internal(r2, r3, r4)
        Ld:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public final void writeGroupList(int r3, java.util.List<?> r4) throws java.io.IOException {
            r2 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            java.lang.Object r1 = r4.get(r0)
            r2.writeGroup(r3, r1)
            int r0 = r0 + (-1)
            goto L6
        L12:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public final void writeGroupList(int r3, java.util.List<?> r4, com.google.crypto.tink.shaded.protobuf.Schema r5) throws java.io.IOException {
            r2 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            java.lang.Object r1 = r4.get(r0)
            r2.writeGroup(r3, r1, r5)
            int r0 = r0 + (-1)
            goto L6
        L12:
            return
    }

    abstract void writeInt32(int r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt32List(int r2, java.util.List<java.lang.Integer> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.IntArrayList r3 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r3
            r1.writeInt32List_Internal(r2, r3, r4)
            goto Ld
        La:
            r1.writeInt32List_Internal(r2, r3, r4)
        Ld:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt64(int r1, long r2) throws java.io.IOException {
            r0 = this;
            r0.writeUInt64(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) throws java.io.IOException {
            r0 = this;
            r0.writeUInt64List(r1, r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public <K, V> void writeMap(int r6, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r7, java.util.Map<K, V> r8) throws java.io.IOException {
            r5 = this;
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            int r1 = r5.getTotalBytesWritten()
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r2 = r7.valueType
            java.lang.Object r3 = r0.getValue()
            r4 = 2
            writeMapEntryField(r5, r4, r2, r3)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r2 = r7.keyType
            java.lang.Object r0 = r0.getKey()
            r3 = 1
            writeMapEntryField(r5, r3, r2, r0)
            int r0 = r5.getTotalBytesWritten()
            int r0 = r0 - r1
            r5.writeVarint32(r0)
            r5.writeTag(r6, r4)
            goto L8
        L38:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageList(int r3, java.util.List<?> r4) throws java.io.IOException {
            r2 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            java.lang.Object r1 = r4.get(r0)
            r2.writeMessage(r3, r1)
            int r0 = r0 + (-1)
            goto L6
        L12:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageList(int r3, java.util.List<?> r4, com.google.crypto.tink.shaded.protobuf.Schema r5) throws java.io.IOException {
            r2 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            java.lang.Object r1 = r4.get(r0)
            r2.writeMessage(r3, r1, r5)
            int r0 = r0 + (-1)
            goto L6
        L12:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageSetItem(int r4, java.lang.Object r5) throws java.io.IOException {
            r3 = this;
            r0 = 4
            r1 = 1
            r3.writeTag(r1, r0)
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            r2 = 3
            if (r0 == 0) goto L10
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = (com.google.crypto.tink.shaded.protobuf.ByteString) r5
            r3.writeBytes(r2, r5)
            goto L13
        L10:
            r3.writeMessage(r2, r5)
        L13:
            r5 = 2
            r3.writeUInt32(r5, r4)
            r3.writeTag(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed32(int r1, int r2) throws java.io.IOException {
            r0 = this;
            r0.writeFixed32(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) throws java.io.IOException {
            r0 = this;
            r0.writeFixed32List(r1, r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed64(int r1, long r2) throws java.io.IOException {
            r0 = this;
            r0.writeFixed64(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) throws java.io.IOException {
            r0 = this;
            r0.writeFixed64List(r1, r2, r3)
            return
    }

    abstract void writeSInt32(int r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt32List(int r2, java.util.List<java.lang.Integer> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.IntArrayList r3 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r3
            r1.writeSInt32List_Internal(r2, r3, r4)
            goto Ld
        La:
            r1.writeSInt32List_Internal(r2, r3, r4)
        Ld:
            return
    }

    abstract void writeSInt64(long r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt64List(int r2, java.util.List<java.lang.Long> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.LongArrayList r3 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r3
            r1.writeSInt64List_Internal(r2, r3, r4)
            goto Ld
        La:
            r1.writeSInt64List_Internal(r2, r3, r4)
        Ld:
            return
    }

    abstract void writeString(java.lang.String r1);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeStringList(int r3, java.util.List<java.lang.String> r4) throws java.io.IOException {
            r2 = this;
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
            if (r0 == 0) goto L19
            r0 = r4
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r0
            int r4 = r4.size()
            int r4 = r4 + (-1)
        Ld:
            if (r4 < 0) goto L2d
            java.lang.Object r1 = r0.getRaw(r4)
            r2.writeLazyString(r3, r1)
            int r4 = r4 + (-1)
            goto Ld
        L19:
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L1f:
            if (r0 < 0) goto L2d
            java.lang.Object r1 = r4.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2.writeString(r3, r1)
            int r0 = r0 + (-1)
            goto L1f
        L2d:
            return
    }

    abstract void writeTag(int r1, int r2);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt32List(int r2, java.util.List<java.lang.Integer> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.IntArrayList r3 = (com.google.crypto.tink.shaded.protobuf.IntArrayList) r3
            r1.writeUInt32List_Internal(r2, r3, r4)
            goto Ld
        La:
            r1.writeUInt32List_Internal(r2, r3, r4)
        Ld:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt64List(int r2, java.util.List<java.lang.Long> r3, boolean r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.LongArrayList r3 = (com.google.crypto.tink.shaded.protobuf.LongArrayList) r3
            r1.writeUInt64List_Internal(r2, r3, r4)
            goto Ld
        La:
            r1.writeUInt64List_Internal(r2, r3, r4)
        Ld:
            return
    }

    abstract void writeVarint32(int r1);

    abstract void writeVarint64(long r1);
}
