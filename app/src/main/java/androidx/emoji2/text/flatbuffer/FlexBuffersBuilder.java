package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class FlexBuffersBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private static final int WIDTH_16 = 1;
    private static final int WIDTH_32 = 2;
    private static final int WIDTH_64 = 3;
    private static final int WIDTH_8 = 0;
    private final androidx.emoji2.text.flatbuffer.ReadWriteBuf bb;
    private boolean finished;
    private final int flags;
    private java.util.Comparator<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value> keyComparator;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> keyPool;
    private final java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value> stack;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> stringPool;


    private static class Value {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final double dValue;
        long iValue;
        int key;
        final int minBitWidth;
        final int type;

        static {
                java.lang.Class<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder> r0 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.class
                return
        }

        Value(int r1, int r2, int r3, double r4) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.type = r2
                r0.minBitWidth = r3
                r0.dValue = r4
                r1 = -9223372036854775808
                r0.iValue = r1
                return
        }

        Value(int r1, int r2, int r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.type = r2
                r0.minBitWidth = r3
                r0.iValue = r4
                r1 = 1
                r0.dValue = r1
                return
        }

        static /* synthetic */ int access$100(int r0, int r1) {
                int r0 = paddingBytes(r0, r1)
                return r0
        }

        static /* synthetic */ int access$200(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r0, int r1, int r2) {
                int r0 = r0.elemWidth(r1, r2)
                return r0
        }

        static /* synthetic */ byte access$300(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r0) {
                byte r0 = r0.storedPackedType()
                return r0
        }

        static /* synthetic */ byte access$400(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r0, int r1) {
                byte r0 = r0.storedPackedType(r1)
                return r0
        }

        static /* synthetic */ int access$500(int r0, int r1, long r2, int r4, int r5) {
                int r0 = elemWidth(r0, r1, r2, r4, r5)
                return r0
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value blob(int r7, int r8, int r9, int r10) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                long r4 = (long) r8
                r0 = r6
                r1 = r7
                r2 = r9
                r3 = r10
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value bool(int r7, boolean r8) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                if (r8 == 0) goto L7
                r0 = 1
                goto L9
            L7:
                r0 = 0
            L9:
                r4 = r0
                r2 = 26
                r3 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        private int elemWidth(int r7, int r8) {
                r6 = this;
                int r0 = r6.type
                int r1 = r6.minBitWidth
                long r2 = r6.iValue
                r4 = r7
                r5 = r8
                int r7 = elemWidth(r0, r1, r2, r4, r5)
                return r7
        }

        private static int elemWidth(int r4, int r5, long r6, int r8, int r9) {
                boolean r4 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypeInline(r4)
                if (r4 == 0) goto L7
                return r5
            L7:
                r4 = 1
            L8:
                r5 = 32
                if (r4 > r5) goto L28
                int r5 = paddingBytes(r8, r4)
                int r5 = r5 + r8
                int r0 = r9 * r4
                int r5 = r5 + r0
                long r0 = (long) r5
                long r0 = r0 - r6
                int r5 = (int) r0
                long r0 = (long) r5
                int r5 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.widthUInBits(r0)
                r0 = 1
                long r0 = r0 << r5
                long r2 = (long) r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L25
                return r5
            L25:
                int r4 = r4 * 2
                goto L8
            L28:
                r4 = 3
                return r4
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value float32(int r7, float r8) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 2
                double r4 = (double) r8
                r2 = 3
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value float64(int r7, double r8) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r2 = 3
                r3 = 3
                r0 = r6
                r1 = r7
                r4 = r8
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int16(int r7, int r8) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 1
                long r4 = (long) r8
                r2 = 1
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int32(int r7, int r8) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 2
                long r4 = (long) r8
                r2 = 1
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int64(int r7, long r8) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r2 = 1
                r3 = 3
                r0 = r6
                r1 = r7
                r4 = r8
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value int8(int r7, int r8) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 0
                long r4 = (long) r8
                r2 = 1
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        private static byte packedType(int r0, int r1) {
                int r1 = r1 << 2
                r0 = r0 | r1
                byte r0 = (byte) r0
                return r0
        }

        private static int paddingBytes(int r0, int r1) {
                int r0 = ~r0
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                r0 = r0 & r1
                return r0
        }

        private byte storedPackedType() {
                r1 = this;
                r0 = 0
                byte r0 = r1.storedPackedType(r0)
                return r0
        }

        private byte storedPackedType(int r2) {
                r1 = this;
                int r2 = r1.storedWidth(r2)
                int r0 = r1.type
                byte r2 = packedType(r2, r0)
                return r2
        }

        private int storedWidth(int r2) {
                r1 = this;
                int r0 = r1.type
                boolean r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypeInline(r0)
                if (r0 == 0) goto Lf
                int r0 = r1.minBitWidth
                int r2 = java.lang.Math.max(r0, r2)
                return r2
            Lf:
                int r2 = r1.minBitWidth
                return r2
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt16(int r7, int r8) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 1
                long r4 = (long) r8
                r2 = 2
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt32(int r7, int r8) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 2
                long r4 = (long) r8
                r2 = 2
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt64(int r7, long r8) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r2 = 2
                r3 = 3
                r0 = r6
                r1 = r7
                r4 = r8
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value uInt8(int r7, int r8) {
                androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
                r3 = 0
                long r4 = (long) r8
                r2 = 2
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }
    }

    static {
            return
    }

    public FlexBuffersBuilder() {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1.<init>(r0)
            return
    }

    public FlexBuffersBuilder(int r2) {
            r1 = this;
            androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf
            r0.<init>(r2)
            r2 = 1
            r1.<init>(r0, r2)
            return
    }

    public FlexBuffersBuilder(androidx.emoji2.text.flatbuffer.ReadWriteBuf r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.stack = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.keyPool = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.stringPool = r0
            r0 = 0
            r1.finished = r0
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$1 r0 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$1
            r0.<init>(r1)
            r1.keyComparator = r0
            r1.bb = r2
            r1.flags = r3
            return
    }

    public FlexBuffersBuilder(java.nio.ByteBuffer r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public FlexBuffersBuilder(java.nio.ByteBuffer r2, int r3) {
            r1 = this;
            androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf r0 = new androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf
            byte[] r2 = r2.array()
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    static /* synthetic */ androidx.emoji2.text.flatbuffer.ReadWriteBuf access$000(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder r0) {
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r0.bb
            return r0
    }

    private int align(int r4) {
            r3 = this;
            r0 = 1
            int r4 = r0 << r4
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r3.bb
            int r0 = r0.writePosition()
            int r0 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$100(r0, r4)
        Ld:
            int r1 = r0 + (-1)
            if (r0 == 0) goto L19
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r3.bb
            r2 = 0
            r0.put(r2)
            r0 = r1
            goto Ld
        L19:
            return r4
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value createKeyVector(int r14, int r15) {
            r13 = this;
            long r0 = (long) r15
            int r15 = widthUInBits(r0)
            r2 = 0
            int r15 = java.lang.Math.max(r2, r15)
            r6 = r15
            r15 = r14
        Lc:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r13.stack
            int r3 = r3.size()
            if (r15 >= r3) goto L33
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r13.stack
            java.lang.Object r3 = r3.get(r15)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r3
            int r3 = r3.key
            long r9 = (long) r3
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r13.bb
            int r11 = r3.writePosition()
            int r15 = r15 + 1
            r7 = 4
            r8 = 0
            r12 = r15
            int r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$500(r7, r8, r9, r11, r12)
            int r6 = java.lang.Math.max(r6, r3)
            goto Lc
        L33:
            int r15 = r13.align(r6)
            r13.writeInt(r0, r15)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r13.bb
            int r0 = r0.writePosition()
        L40:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r13.stack
            int r1 = r1.size()
            if (r14 >= r1) goto L63
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r13.stack
            java.lang.Object r1 = r1.get(r14)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r1 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r1
            int r1 = r1.key
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r13.stack
            java.lang.Object r1 = r1.get(r14)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r1 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r1
            int r1 = r1.key
            long r3 = (long) r1
            r13.writeOffset(r3, r15)
            int r14 = r14 + 1
            goto L40
        L63:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r14 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
            r15 = 4
            int r5 = androidx.emoji2.text.flatbuffer.FlexBuffers.toTypedVector(r15, r2)
            long r7 = (long) r0
            r4 = -1
            r3 = r14
            r3.<init>(r4, r5, r6, r7)
            return r14
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value createVector(int r16, int r17, int r18, boolean r19, boolean r20, androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r21) {
            r15 = this;
            r0 = r15
            r1 = r21
            r2 = r18
            long r3 = (long) r2
            int r5 = widthUInBits(r3)
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            if (r1 == 0) goto L21
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r7 = r0.bb
            int r7 = r7.writePosition()
            int r7 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$200(r1, r7, r6)
            int r5 = java.lang.Math.max(r5, r7)
            r7 = 3
            goto L22
        L21:
            r7 = 1
        L22:
            r8 = 4
            r12 = r5
            r5 = r17
        L26:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r9 = r0.stack
            int r9 = r9.size()
            if (r5 >= r9) goto L68
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r9 = r0.stack
            java.lang.Object r9 = r9.get(r5)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r9 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r9
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r10 = r0.bb
            int r10 = r10.writePosition()
            int r11 = r5 + r7
            int r9 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$200(r9, r10, r11)
            int r12 = java.lang.Math.max(r12, r9)
            r9 = r17
            if (r19 == 0) goto L65
            if (r5 != r9) goto L65
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r0.stack
            java.lang.Object r8 = r8.get(r5)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r8 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r8
            int r8 = r8.type
            boolean r10 = androidx.emoji2.text.flatbuffer.FlexBuffers.isTypedVectorElementType(r8)
            if (r10 == 0) goto L5d
            goto L65
        L5d:
            androidx.emoji2.text.flatbuffer.FlexBuffers$FlexBufferException r1 = new androidx.emoji2.text.flatbuffer.FlexBuffers$FlexBufferException
            java.lang.String r2 = "TypedVector does not support this element type"
            r1.<init>(r2)
            throw r1
        L65:
            int r5 = r5 + 1
            goto L26
        L68:
            r9 = r17
            int r5 = r15.align(r12)
            if (r1 == 0) goto L7d
            long r10 = r1.iValue
            r15.writeOffset(r10, r5)
            r10 = 1
            int r7 = r1.minBitWidth
            long r10 = r10 << r7
            r15.writeInt(r10, r5)
        L7d:
            if (r20 != 0) goto L82
            r15.writeInt(r3, r5)
        L82:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r0.bb
            int r3 = r3.writePosition()
            r4 = r9
        L89:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r7 = r0.stack
            int r7 = r7.size()
            if (r4 >= r7) goto L9f
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r7 = r0.stack
            java.lang.Object r7 = r7.get(r4)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r7 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r7
            r15.writeAny(r7, r5)
            int r4 = r4 + 1
            goto L89
        L9f:
            if (r19 != 0) goto Lbd
        La1:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r4 = r0.stack
            int r4 = r4.size()
            if (r9 >= r4) goto Lbd
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r0.bb
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r5 = r0.stack
            java.lang.Object r5 = r5.get(r9)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r5 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r5
            byte r5 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$400(r5, r12)
            r4.put(r5)
            int r9 = r9 + 1
            goto La1
        Lbd:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r4 = new androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value
            if (r1 == 0) goto Lc5
            r1 = 9
        Lc3:
            r11 = r1
            goto Ld3
        Lc5:
            if (r19 == 0) goto Ld0
            if (r20 == 0) goto Lca
            goto Lcb
        Lca:
            r2 = r6
        Lcb:
            int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.toTypedVector(r8, r2)
            goto Lc3
        Ld0:
            r1 = 10
            goto Lc3
        Ld3:
            long r13 = (long) r3
            r9 = r4
            r10 = r16
            r9.<init>(r10, r11, r12, r13)
            return r4
    }

    private int putKey(java.lang.String r6) {
            r5 = this;
            if (r6 != 0) goto L4
            r6 = -1
            return r6
        L4:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r5.bb
            int r0 = r0.writePosition()
            int r1 = r5.flags
            r1 = r1 & 1
            r2 = 0
            if (r1 == 0) goto L3b
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.keyPool
            java.lang.Object r1 = r1.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L36
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r6.getBytes(r1)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r5.bb
            int r4 = r1.length
            r3.put(r1, r2, r4)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r1 = r5.bb
            r1.put(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.keyPool
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r6, r2)
            goto L55
        L36:
            int r0 = r1.intValue()
            goto L55
        L3b:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r6.getBytes(r1)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r3 = r5.bb
            int r4 = r1.length
            r3.put(r1, r2, r4)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r1 = r5.bb
            r1.put(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.keyPool
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r6, r2)
        L55:
            return r0
    }

    private void putUInt(java.lang.String r3, long r4) {
            r2 = this;
            int r3 = r2.putKey(r3)
            int r0 = widthUInBits(r4)
            if (r0 != 0) goto L10
            int r4 = (int) r4
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt8(r3, r4)
            goto L26
        L10:
            r1 = 1
            if (r0 != r1) goto L19
            int r4 = (int) r4
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt16(r3, r4)
            goto L26
        L19:
            r1 = 2
            if (r0 != r1) goto L22
            int r4 = (int) r4
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt32(r3, r4)
            goto L26
        L22:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt64(r3, r4)
        L26:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r4 = r2.stack
            r4.add(r3)
            return
    }

    private void putUInt64(java.lang.String r2, long r3) {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r2 = r1.putKey(r2)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.uInt64(r2, r3)
            r0.add(r2)
            return
    }

    static int widthUInBits(long r3) {
            r0 = -1
            int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.byteToUnsignedInt(r0)
            long r1 = (long) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto Lc
            r3 = 0
            return r3
        Lc:
            int r1 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.shortToUnsignedInt(r0)
            long r1 = (long) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L17
            r3 = 1
            return r3
        L17:
            long r0 = androidx.emoji2.text.flatbuffer.FlexBuffers.Unsigned.intToUnsignedLong(r0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L21
            r3 = 2
            return r3
        L21:
            r3 = 3
            return r3
    }

    private void writeAny(androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value r3, int r4) {
            r2 = this;
            int r0 = r3.type
            if (r0 == 0) goto L1d
            r1 = 1
            if (r0 == r1) goto L1d
            r1 = 2
            if (r0 == r1) goto L1d
            r1 = 3
            if (r0 == r1) goto L17
            r1 = 26
            if (r0 == r1) goto L1d
            long r0 = r3.iValue
            r2.writeOffset(r0, r4)
            goto L22
        L17:
            double r0 = r3.dValue
            r2.writeDouble(r0, r4)
            goto L22
        L1d:
            long r0 = r3.iValue
            r2.writeInt(r0, r4)
        L22:
            return
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value writeBlob(int r6, byte[] r7, int r8, boolean r9) {
            r5 = this;
            int r0 = r7.length
            long r0 = (long) r0
            int r0 = widthUInBits(r0)
            int r1 = r5.align(r0)
            int r2 = r7.length
            long r2 = (long) r2
            r5.writeInt(r2, r1)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r1 = r5.bb
            int r1 = r1.writePosition()
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r5.bb
            int r3 = r7.length
            r4 = 0
            r2.put(r7, r4, r3)
            if (r9 == 0) goto L23
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r7 = r5.bb
            r7.put(r4)
        L23:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.blob(r6, r1, r8, r0)
            return r6
    }

    private void writeDouble(double r2, int r4) {
            r1 = this;
            r0 = 4
            if (r4 != r0) goto La
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            float r2 = (float) r2
            r4.putFloat(r2)
            goto L13
        La:
            r0 = 8
            if (r4 != r0) goto L13
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            r4.putDouble(r2)
        L13:
            return
    }

    private void writeInt(long r2, int r4) {
            r1 = this;
            r0 = 1
            if (r4 == r0) goto L23
            r0 = 2
            if (r4 == r0) goto L1b
            r0 = 4
            if (r4 == r0) goto L14
            r0 = 8
            if (r4 == r0) goto Le
            goto L2a
        Le:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            r4.putLong(r2)
            goto L2a
        L14:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            int r2 = (int) r2
            r4.putInt(r2)
            goto L2a
        L1b:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            int r2 = (int) r2
            short r2 = (short) r2
            r4.putShort(r2)
            goto L2a
        L23:
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r4 = r1.bb
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4.put(r2)
        L2a:
            return
    }

    private void writeOffset(long r3, int r5) {
            r2 = this;
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r2.bb
            int r0 = r0.writePosition()
            long r0 = (long) r0
            long r0 = r0 - r3
            int r3 = (int) r0
            long r3 = (long) r3
            r2.writeInt(r3, r5)
            return
    }

    private androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value writeString(int r3, java.lang.String r4) {
            r2 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r4.getBytes(r0)
            r0 = 5
            r1 = 1
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = r2.writeBlob(r3, r4, r0, r1)
            return r3
    }

    public int endMap(java.lang.String r8, int r9) {
            r7 = this;
            int r1 = r7.putKey(r8)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r7.stack
            int r0 = r8.size()
            java.util.List r8 = r8.subList(r9, r0)
            java.util.Comparator<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r7.keyComparator
            java.util.Collections.sort(r8, r0)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r7.stack
            int r8 = r8.size()
            int r8 = r8 - r9
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r6 = r7.createKeyVector(r9, r8)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r7.stack
            int r8 = r8.size()
            int r3 = r8 - r9
            r4 = 0
            r5 = 0
            r0 = r7
            r2 = r9
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r8 = r0.createVector(r1, r2, r3, r4, r5, r6)
        L2e:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r7.stack
            int r0 = r0.size()
            if (r0 <= r9) goto L42
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r7.stack
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            goto L2e
        L42:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r9 = r7.stack
            r9.add(r8)
            long r8 = r8.iValue
            int r8 = (int) r8
            return r8
    }

    public int endVector(java.lang.String r8, int r9, boolean r10, boolean r11) {
            r7 = this;
            int r1 = r7.putKey(r8)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r8 = r7.stack
            int r8 = r8.size()
            int r3 = r8 - r9
            r6 = 0
            r0 = r7
            r2 = r9
            r4 = r10
            r5 = r11
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r8 = r0.createVector(r1, r2, r3, r4, r5, r6)
        L15:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r10 = r7.stack
            int r10 = r10.size()
            if (r10 <= r9) goto L29
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r10 = r7.stack
            int r11 = r10.size()
            int r11 = r11 + (-1)
            r10.remove(r11)
            goto L15
        L29:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r9 = r7.stack
            r9.add(r8)
            long r8 = r8.iValue
            int r8 = (int) r8
            return r8
    }

    public java.nio.ByteBuffer finish() {
            r4 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r4.stack
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r0 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r0
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r4.bb
            int r2 = r2.writePosition()
            int r0 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$200(r0, r2, r1)
            int r0 = r4.align(r0)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r2 = r4.stack
            java.lang.Object r2 = r2.get(r1)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r2
            r4.writeAny(r2, r0)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r4.bb
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r3 = r4.stack
            java.lang.Object r3 = r3.get(r1)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = (androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value) r3
            byte r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.access$300(r3)
            r2.put(r3)
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r4.bb
            byte r0 = (byte) r0
            r2.put(r0)
            r0 = 1
            r4.finished = r0
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r4.bb
            byte[] r0 = r0.data()
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r2 = r4.bb
            int r2 = r2.writePosition()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r1, r2)
            return r0
    }

    public androidx.emoji2.text.flatbuffer.ReadWriteBuf getBuffer() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.ReadWriteBuf r0 = r1.bb
            return r0
    }

    public int putBlob(java.lang.String r3, byte[] r4) {
            r2 = this;
            int r3 = r2.putKey(r3)
            r0 = 25
            r1 = 0
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = r2.writeBlob(r3, r4, r0, r1)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r4 = r2.stack
            r4.add(r3)
            long r3 = r3.iValue
            int r3 = (int) r3
            return r3
    }

    public int putBlob(byte[] r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.putBlob(r0, r2)
            return r2
    }

    public void putBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r2 = r1.putKey(r2)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.bool(r2, r3)
            r0.add(r2)
            return
    }

    public void putBoolean(boolean r2) {
            r1 = this;
            r0 = 0
            r1.putBoolean(r0, r2)
            return
    }

    public void putFloat(double r2) {
            r1 = this;
            r0 = 0
            r1.putFloat(r0, r2)
            return
    }

    public void putFloat(float r2) {
            r1 = this;
            r0 = 0
            r1.putFloat(r0, r2)
            return
    }

    public void putFloat(java.lang.String r2, double r3) {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r2 = r1.putKey(r2)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.float64(r2, r3)
            r0.add(r2)
            return
    }

    public void putFloat(java.lang.String r2, float r3) {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r2 = r1.putKey(r2)
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r2 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.float32(r2, r3)
            r0.add(r2)
            return
    }

    public void putInt(int r2) {
            r1 = this;
            r0 = 0
            r1.putInt(r0, r2)
            return
    }

    public void putInt(long r2) {
            r1 = this;
            r0 = 0
            r1.putInt(r0, r2)
            return
    }

    public void putInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = (long) r4
            r2.putInt(r3, r0)
            return
    }

    public void putInt(java.lang.String r3, long r4) {
            r2 = this;
            int r3 = r2.putKey(r3)
            r0 = -128(0xffffffffffffff80, double:NaN)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L1b
            r0 = 127(0x7f, double:6.27E-322)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L1b
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r2.stack
            int r4 = (int) r4
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int8(r3, r4)
            r0.add(r3)
            goto L54
        L1b:
            r0 = -32768(0xffffffffffff8000, double:NaN)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L32
            r0 = 32767(0x7fff, double:1.6189E-319)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L32
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r2.stack
            int r4 = (int) r4
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int16(r3, r4)
            r0.add(r3)
            goto L54
        L32:
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L4b
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L4b
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r2.stack
            int r4 = (int) r4
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int32(r3, r4)
            r0.add(r3)
            goto L54
        L4b:
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r2.stack
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r3 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.int64(r3, r4)
            r0.add(r3)
        L54:
            return
    }

    public int putString(java.lang.String r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.putString(r0, r2)
            return r2
    }

    public int putString(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            int r5 = r4.putKey(r5)
            int r0 = r4.flags
            r0 = r0 & 2
            if (r0 == 0) goto L49
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.stringPool
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L2d
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r5 = r4.writeString(r5, r6)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.stringPool
            long r1 = r5.iValue
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r6, r1)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r6 = r4.stack
            r6.add(r5)
            long r5 = r5.iValue
            int r5 = (int) r5
            return r5
        L2d:
            int r6 = r6.length()
            long r1 = (long) r6
            int r6 = widthUInBits(r1)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r1 = r4.stack
            int r2 = r0.intValue()
            r3 = 5
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r5 = androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.Value.blob(r5, r2, r3, r6)
            r1.add(r5)
            int r5 = r0.intValue()
            return r5
        L49:
            androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value r5 = r4.writeString(r5, r6)
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r6 = r4.stack
            r6.add(r5)
            long r5 = r5.iValue
            int r5 = (int) r5
            return r5
    }

    public void putUInt(int r4) {
            r3 = this;
            r0 = 0
            long r1 = (long) r4
            r3.putUInt(r0, r1)
            return
    }

    public void putUInt(long r2) {
            r1 = this;
            r0 = 0
            r1.putUInt(r0, r2)
            return
    }

    public void putUInt64(java.math.BigInteger r4) {
            r3 = this;
            r0 = 0
            long r1 = r4.longValue()
            r3.putUInt64(r0, r1)
            return
    }

    public int startMap() {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r0 = r0.size()
            return r0
    }

    public int startVector() {
            r1 = this;
            java.util.ArrayList<androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$Value> r0 = r1.stack
            int r0 = r0.size()
            return r0
    }
}
