package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET = 0;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE = 0;
    private static final long BUFFER_ADDRESS_OFFSET = 0;
    private static final int BYTE_ARRAY_ALIGNMENT = 0;
    static final long BYTE_ARRAY_BASE_OFFSET = 0;
    private static final long DOUBLE_ARRAY_BASE_OFFSET = 0;
    private static final long DOUBLE_ARRAY_INDEX_SCALE = 0;
    private static final long FLOAT_ARRAY_BASE_OFFSET = 0;
    private static final long FLOAT_ARRAY_INDEX_SCALE = 0;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = false;
    private static final long INT_ARRAY_BASE_OFFSET = 0;
    private static final long INT_ARRAY_INDEX_SCALE = 0;
    private static final boolean IS_ANDROID_32 = false;
    private static final boolean IS_ANDROID_64 = false;
    static final boolean IS_BIG_ENDIAN = false;
    private static final long LONG_ARRAY_BASE_OFFSET = 0;
    private static final long LONG_ARRAY_INDEX_SCALE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor MEMORY_ACCESSOR = null;
    private static final java.lang.Class<?> MEMORY_CLASS = null;
    private static final long OBJECT_ARRAY_BASE_OFFSET = 0;
    private static final long OBJECT_ARRAY_INDEX_SCALE = 0;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final sun.misc.Unsafe UNSAFE = null;


    private static final class Android32MemoryAccessor extends com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor {
        private static final long SMALL_ADDRESS_MASK = -1;

        Android32MemoryAccessor(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static int smallAddress(long r0) {
                int r0 = (int) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long r1, byte[] r3, long r4, long r6) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] r1, long r2, long r4, long r6) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(java.lang.Object r2, long r3) {
                r1 = this;
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L9
                boolean r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$600(r2, r3)
                return r2
            L9:
                boolean r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$700(r2, r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(java.lang.Object r2, long r3) {
                r1 = this;
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L9
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$200(r2, r3)
                return r2
            L9:
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$300(r2, r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(java.lang.Object r1, long r2) {
                r0 = this;
                long r1 = r0.getLong(r1, r2)
                double r1 = java.lang.Double.longBitsToDouble(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(java.lang.Object r1, long r2) {
                r0 = this;
                int r1 = r0.getInt(r1, r2)
                float r1 = java.lang.Float.intBitsToFloat(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public java.lang.Object getStaticObject(java.lang.reflect.Field r2) {
                r1 = this;
                r0 = 0
                java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L6
                return r2
            L6:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(java.lang.Object r2, long r3, boolean r5) {
                r1 = this;
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$800(r2, r3, r5)
                goto Lb
            L8:
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$900(r2, r3, r5)
            Lb:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long r1, byte r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(java.lang.Object r2, long r3, byte r5) {
                r1 = this;
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$400(r2, r3, r5)
                goto Lb
            L8:
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$500(r2, r3, r5)
            Lb:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(java.lang.Object r7, long r8, double r10) {
                r6 = this;
                long r4 = java.lang.Double.doubleToLongBits(r10)
                r0 = r6
                r1 = r7
                r2 = r8
                r0.putLong(r1, r2, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(java.lang.Object r1, long r2, float r4) {
                r0 = this;
                int r4 = java.lang.Float.floatToIntBits(r4)
                r0.putInt(r1, r2, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long r1, int r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long r1, long r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    private static final class Android64MemoryAccessor extends com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor {
        Android64MemoryAccessor(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long r1, byte[] r3, long r4, long r6) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] r1, long r2, long r4, long r6) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(java.lang.Object r2, long r3) {
                r1 = this;
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L9
                boolean r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$600(r2, r3)
                return r2
            L9:
                boolean r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$700(r2, r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(java.lang.Object r2, long r3) {
                r1 = this;
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L9
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$200(r2, r3)
                return r2
            L9:
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$300(r2, r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(java.lang.Object r1, long r2) {
                r0 = this;
                long r1 = r0.getLong(r1, r2)
                double r1 = java.lang.Double.longBitsToDouble(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(java.lang.Object r1, long r2) {
                r0 = this;
                int r1 = r0.getInt(r1, r2)
                float r1 = java.lang.Float.intBitsToFloat(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public java.lang.Object getStaticObject(java.lang.reflect.Field r2) {
                r1 = this;
                r0 = 0
                java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L6
                return r2
            L6:
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(java.lang.Object r2, long r3, boolean r5) {
                r1 = this;
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$800(r2, r3, r5)
                goto Lb
            L8:
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$900(r2, r3, r5)
            Lb:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long r1, byte r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(java.lang.Object r2, long r3, byte r5) {
                r1 = this;
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L8
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$400(r2, r3, r5)
                goto Lb
            L8:
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$500(r2, r3, r5)
            Lb:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(java.lang.Object r7, long r8, double r10) {
                r6 = this;
                long r4 = java.lang.Double.doubleToLongBits(r10)
                r0 = r6
                r1 = r7
                r2 = r8
                r0.putLong(r1, r2, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(java.lang.Object r1, long r2, float r4) {
                r0 = this;
                int r4 = java.lang.Float.floatToIntBits(r4)
                r0.putInt(r1, r2, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long r1, int r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long r1, long r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    private static final class JvmMemoryAccessor extends com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor {
        JvmMemoryAccessor(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long r11, byte[] r13, long r14, long r16) {
                r10 = this;
                r0 = r10
                sun.misc.Unsafe r1 = r0.unsafe
                long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET
                long r6 = r2 + r14
                r2 = 0
                r3 = r11
                r5 = r13
                r8 = r16
                r1.copyMemory(r2, r3, r5, r6, r8)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] r11, long r12, long r14, long r16) {
                r10 = this;
                r0 = r10
                sun.misc.Unsafe r1 = r0.unsafe
                long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET
                long r3 = r2 + r12
                r5 = 0
                r2 = r11
                r6 = r14
                r8 = r16
                r1.copyMemory(r2, r3, r5, r6, r8)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                boolean r2 = r0.getBoolean(r2, r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long r2) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                byte r2 = r0.getByte(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                byte r2 = r0.getByte(r2, r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                double r2 = r0.getDouble(r2, r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                float r2 = r0.getFloat(r2, r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long r2) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                int r2 = r0.getInt(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long r2) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                long r2 = r0.getLong(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public java.lang.Object getStaticObject(java.lang.reflect.Field r4) {
                r3 = this;
                sun.misc.Unsafe r0 = r3.unsafe
                java.lang.Object r0 = r0.staticFieldBase(r4)
                sun.misc.Unsafe r1 = r3.unsafe
                long r1 = r1.staticFieldOffset(r4)
                java.lang.Object r4 = r3.getObject(r0, r1)
                return r4
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(java.lang.Object r2, long r3, boolean r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putBoolean(r2, r3, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long r2, byte r4) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putByte(r2, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(java.lang.Object r2, long r3, byte r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putByte(r2, r3, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(java.lang.Object r7, long r8, double r10) {
                r6 = this;
                sun.misc.Unsafe r0 = r6.unsafe
                r1 = r7
                r2 = r8
                r4 = r10
                r0.putDouble(r1, r2, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(java.lang.Object r2, long r3, float r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putFloat(r2, r3, r5)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long r2, int r4) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putInt(r2, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long r2, long r4) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putLong(r2, r4)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeArrayOperations() {
                r8 = this;
                boolean r0 = super.supportsUnsafeArrayOperations()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                sun.misc.Unsafe r0 = r8.unsafe     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L9a
                java.lang.String r2 = "getByte"
                r3 = 2
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L9a
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r4[r1] = r5     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9a
                r6 = 1
                r4[r6] = r5     // Catch: java.lang.Throwable -> L9a
                r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L9a
                java.lang.String r2 = "putByte"
                r4 = 3
                java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9a
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r5[r1] = r7     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9a
                r5[r6] = r7     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r7 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L9a
                r5[r3] = r7     // Catch: java.lang.Throwable -> L9a
                r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L9a
                java.lang.String r2 = "getBoolean"
                java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L9a
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r5[r1] = r7     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9a
                r5[r6] = r7     // Catch: java.lang.Throwable -> L9a
                r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L9a
                java.lang.String r2 = "putBoolean"
                java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9a
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r5[r1] = r7     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9a
                r5[r6] = r7     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L9a
                r5[r3] = r7     // Catch: java.lang.Throwable -> L9a
                r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L9a
                java.lang.String r2 = "getFloat"
                java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L9a
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r5[r1] = r7     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9a
                r5[r6] = r7     // Catch: java.lang.Throwable -> L9a
                r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L9a
                java.lang.String r2 = "putFloat"
                java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9a
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r5[r1] = r7     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9a
                r5[r6] = r7     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r7 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L9a
                r5[r3] = r7     // Catch: java.lang.Throwable -> L9a
                r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L9a
                java.lang.String r2 = "getDouble"
                java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L9a
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r5[r1] = r7     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9a
                r5[r6] = r7     // Catch: java.lang.Throwable -> L9a
                r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L9a
                java.lang.String r2 = "putDouble"
                java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9a
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r4[r1] = r5     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9a
                r4[r6] = r5     // Catch: java.lang.Throwable -> L9a
                java.lang.Class r5 = java.lang.Double.TYPE     // Catch: java.lang.Throwable -> L9a
                r4[r3] = r5     // Catch: java.lang.Throwable -> L9a
                r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L9a
                return r6
            L9a:
                r0 = move-exception
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$000(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
                r8 = this;
                java.lang.String r0 = "copyMemory"
                boolean r1 = super.supportsUnsafeByteBufferOperations()
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                sun.misc.Unsafe r1 = r8.unsafe     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L8e
                java.lang.String r3 = "getByte"
                r4 = 1
                java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r5[r2] = r6     // Catch: java.lang.Throwable -> L8e
                r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L8e
                java.lang.String r3 = "putByte"
                r5 = 2
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r2] = r7     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r4] = r7     // Catch: java.lang.Throwable -> L8e
                r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L8e
                java.lang.String r3 = "getInt"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r2] = r7     // Catch: java.lang.Throwable -> L8e
                r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L8e
                java.lang.String r3 = "putInt"
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r2] = r7     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r4] = r7     // Catch: java.lang.Throwable -> L8e
                r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L8e
                java.lang.String r3 = "getLong"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r2] = r7     // Catch: java.lang.Throwable -> L8e
                r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L8e
                java.lang.String r3 = "putLong"
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r2] = r7     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r4] = r7     // Catch: java.lang.Throwable -> L8e
                r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L8e
                r3 = 3
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r2] = r7     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r4] = r7     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r5] = r7     // Catch: java.lang.Throwable -> L8e
                r1.getMethod(r0, r6)     // Catch: java.lang.Throwable -> L8e
                r6 = 5
                java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L8e
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r2] = r7     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r4] = r7     // Catch: java.lang.Throwable -> L8e
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r5] = r7     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r6[r3] = r5     // Catch: java.lang.Throwable -> L8e
                java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L8e
                r5 = 4
                r6[r5] = r3     // Catch: java.lang.Throwable -> L8e
                r1.getMethod(r0, r6)     // Catch: java.lang.Throwable -> L8e
                return r4
            L8e:
                r0 = move-exception
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$000(r0)
                return r2
        }
    }

    private static abstract class MemoryAccessor {
        sun.misc.Unsafe unsafe;

        MemoryAccessor(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>()
                r0.unsafe = r1
                return
        }

        public final int arrayBaseOffset(java.lang.Class<?> r2) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                int r2 = r0.arrayBaseOffset(r2)
                return r2
        }

        public final int arrayIndexScale(java.lang.Class<?> r2) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                int r2 = r0.arrayIndexScale(r2)
                return r2
        }

        public abstract void copyMemory(long r1, byte[] r3, long r4, long r6);

        public abstract void copyMemory(byte[] r1, long r2, long r4, long r6);

        public abstract boolean getBoolean(java.lang.Object r1, long r2);

        public abstract byte getByte(long r1);

        public abstract byte getByte(java.lang.Object r1, long r2);

        public abstract double getDouble(java.lang.Object r1, long r2);

        public abstract float getFloat(java.lang.Object r1, long r2);

        public abstract int getInt(long r1);

        public final int getInt(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                int r2 = r0.getInt(r2, r3)
                return r2
        }

        public abstract long getLong(long r1);

        public final long getLong(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                long r2 = r0.getLong(r2, r3)
                return r2
        }

        public final java.lang.Object getObject(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                java.lang.Object r2 = r0.getObject(r2, r3)
                return r2
        }

        public abstract java.lang.Object getStaticObject(java.lang.reflect.Field r1);

        public final long objectFieldOffset(java.lang.reflect.Field r3) {
                r2 = this;
                sun.misc.Unsafe r0 = r2.unsafe
                long r0 = r0.objectFieldOffset(r3)
                return r0
        }

        public abstract void putBoolean(java.lang.Object r1, long r2, boolean r4);

        public abstract void putByte(long r1, byte r3);

        public abstract void putByte(java.lang.Object r1, long r2, byte r4);

        public abstract void putDouble(java.lang.Object r1, long r2, double r4);

        public abstract void putFloat(java.lang.Object r1, long r2, float r4);

        public abstract void putInt(long r1, int r3);

        public final void putInt(java.lang.Object r2, long r3, int r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putInt(r2, r3, r5)
                return
        }

        public abstract void putLong(long r1, long r3);

        public final void putLong(java.lang.Object r7, long r8, long r10) {
                r6 = this;
                sun.misc.Unsafe r0 = r6.unsafe
                r1 = r7
                r2 = r8
                r4 = r10
                r0.putLong(r1, r2, r4)
                return
        }

        public final void putObject(java.lang.Object r2, long r3, java.lang.Object r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putObject(r2, r3, r5)
                return
        }

        public boolean supportsUnsafeArrayOperations() {
                r8 = this;
                sun.misc.Unsafe r0 = r8.unsafe
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = "objectFieldOffset"
                r3 = 1
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L95
                java.lang.Class<java.lang.reflect.Field> r5 = java.lang.reflect.Field.class
                r4[r1] = r5     // Catch: java.lang.Throwable -> L95
                r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = "arrayBaseOffset"
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L95
                java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
                r4[r1] = r5     // Catch: java.lang.Throwable -> L95
                r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = "arrayIndexScale"
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L95
                java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
                r4[r1] = r5     // Catch: java.lang.Throwable -> L95
                r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = "getInt"
                r4 = 2
                java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L95
                java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                r5[r1] = r6     // Catch: java.lang.Throwable -> L95
                java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L95
                r5[r3] = r6     // Catch: java.lang.Throwable -> L95
                r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = "putInt"
                r5 = 3
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L95
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r1] = r7     // Catch: java.lang.Throwable -> L95
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L95
                r6[r3] = r7     // Catch: java.lang.Throwable -> L95
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L95
                r6[r4] = r7     // Catch: java.lang.Throwable -> L95
                r0.getMethod(r2, r6)     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = "getLong"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L95
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r1] = r7     // Catch: java.lang.Throwable -> L95
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L95
                r6[r3] = r7     // Catch: java.lang.Throwable -> L95
                r0.getMethod(r2, r6)     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = "putLong"
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L95
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r1] = r7     // Catch: java.lang.Throwable -> L95
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L95
                r6[r3] = r7     // Catch: java.lang.Throwable -> L95
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L95
                r6[r4] = r7     // Catch: java.lang.Throwable -> L95
                r0.getMethod(r2, r6)     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = "getObject"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L95
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r1] = r7     // Catch: java.lang.Throwable -> L95
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L95
                r6[r3] = r7     // Catch: java.lang.Throwable -> L95
                r0.getMethod(r2, r6)     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = "putObject"
                java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L95
                java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                r5[r1] = r6     // Catch: java.lang.Throwable -> L95
                java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L95
                r5[r3] = r6     // Catch: java.lang.Throwable -> L95
                java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                r5[r4] = r6     // Catch: java.lang.Throwable -> L95
                r0.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L95
                return r3
            L95:
                r0 = move-exception
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$000(r0)
                return r1
        }

        public boolean supportsUnsafeByteBufferOperations() {
                r6 = this;
                sun.misc.Unsafe r0 = r6.unsafe
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r2 = "objectFieldOffset"
                r3 = 1
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2e
                java.lang.Class<java.lang.reflect.Field> r5 = java.lang.reflect.Field.class
                r4[r1] = r5     // Catch: java.lang.Throwable -> L2e
                r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r2 = "getLong"
                r4 = 2
                java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L2e
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r4[r1] = r5     // Catch: java.lang.Throwable -> L2e
                java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L2e
                r4[r3] = r5     // Catch: java.lang.Throwable -> L2e
                r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L2e
                java.lang.reflect.Field r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$100()     // Catch: java.lang.Throwable -> L2e
                if (r0 != 0) goto L2d
                return r1
            L2d:
                return r3
            L2e:
                r0 = move-exception
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.access$000(r0)
                return r1
        }
    }

    static {
            sun.misc.Unsafe r0 = getUnsafe()
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.UNSAFE = r0
            java.lang.Class r0 = com.google.crypto.tink.shaded.protobuf.Android.getMemoryClass()
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_CLASS = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = determineAndroidSupportByAddressSize(r0)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_ANDROID_64 = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = determineAndroidSupportByAddressSize(r0)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_ANDROID_32 = r0
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = getMemoryAccessor()
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR = r0
            boolean r0 = supportsUnsafeByteBufferOperations()
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.HAS_UNSAFE_BYTEBUFFER_OPERATIONS = r0
            boolean r0 = supportsUnsafeArrayOperations()
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = arrayBaseOffset(r0)
            long r0 = (long) r0
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET = r0
            java.lang.Class<boolean[]> r2 = boolean[].class
            int r3 = arrayBaseOffset(r2)
            long r3 = (long) r3
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BOOLEAN_ARRAY_BASE_OFFSET = r3
            int r2 = arrayIndexScale(r2)
            long r2 = (long) r2
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BOOLEAN_ARRAY_INDEX_SCALE = r2
            java.lang.Class<int[]> r2 = int[].class
            int r3 = arrayBaseOffset(r2)
            long r3 = (long) r3
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.INT_ARRAY_BASE_OFFSET = r3
            int r2 = arrayIndexScale(r2)
            long r2 = (long) r2
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.INT_ARRAY_INDEX_SCALE = r2
            java.lang.Class<long[]> r2 = long[].class
            int r3 = arrayBaseOffset(r2)
            long r3 = (long) r3
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.LONG_ARRAY_BASE_OFFSET = r3
            int r2 = arrayIndexScale(r2)
            long r2 = (long) r2
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.LONG_ARRAY_INDEX_SCALE = r2
            java.lang.Class<float[]> r2 = float[].class
            int r3 = arrayBaseOffset(r2)
            long r3 = (long) r3
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.FLOAT_ARRAY_BASE_OFFSET = r3
            int r2 = arrayIndexScale(r2)
            long r2 = (long) r2
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.FLOAT_ARRAY_INDEX_SCALE = r2
            java.lang.Class<double[]> r2 = double[].class
            int r3 = arrayBaseOffset(r2)
            long r3 = (long) r3
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.DOUBLE_ARRAY_BASE_OFFSET = r3
            int r2 = arrayIndexScale(r2)
            long r2 = (long) r2
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.DOUBLE_ARRAY_INDEX_SCALE = r2
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            int r2 = arrayBaseOffset(r2)
            long r2 = (long) r2
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.OBJECT_ARRAY_BASE_OFFSET = r2
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            int r2 = arrayIndexScale(r2)
            long r2 = (long) r2
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.OBJECT_ARRAY_INDEX_SCALE = r2
            java.lang.reflect.Field r2 = bufferAddressField()
            long r2 = fieldOffset(r2)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BUFFER_ADDRESS_OFFSET = r2
            r2 = 7
            long r0 = r0 & r2
            int r0 = (int) r0
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BYTE_ARRAY_ALIGNMENT = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Lb3
            r0 = 1
            goto Lb4
        Lb3:
            r0 = 0
        Lb4:
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_BIG_ENDIAN = r0
            return
    }

    private UnsafeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(java.lang.Throwable r0) {
            logMissingMethod(r0)
            return
    }

    static /* synthetic */ java.lang.reflect.Field access$100() {
            java.lang.reflect.Field r0 = bufferAddressField()
            return r0
    }

    static /* synthetic */ byte access$200(java.lang.Object r0, long r1) {
            byte r0 = getByteBigEndian(r0, r1)
            return r0
    }

    static /* synthetic */ byte access$300(java.lang.Object r0, long r1) {
            byte r0 = getByteLittleEndian(r0, r1)
            return r0
    }

    static /* synthetic */ void access$400(java.lang.Object r0, long r1, byte r3) {
            putByteBigEndian(r0, r1, r3)
            return
    }

    static /* synthetic */ void access$500(java.lang.Object r0, long r1, byte r3) {
            putByteLittleEndian(r0, r1, r3)
            return
    }

    static /* synthetic */ boolean access$600(java.lang.Object r0, long r1) {
            boolean r0 = getBooleanBigEndian(r0, r1)
            return r0
    }

    static /* synthetic */ boolean access$700(java.lang.Object r0, long r1) {
            boolean r0 = getBooleanLittleEndian(r0, r1)
            return r0
    }

    static /* synthetic */ void access$800(java.lang.Object r0, long r1, boolean r3) {
            putBooleanBigEndian(r0, r1, r3)
            return
    }

    static /* synthetic */ void access$900(java.lang.Object r0, long r1, boolean r3) {
            putBooleanLittleEndian(r0, r1, r3)
            return
    }

    static long addressOffset(java.nio.ByteBuffer r3) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BUFFER_ADDRESS_OFFSET
            long r0 = r0.getLong(r3, r1)
            return r0
    }

    static <T> T allocateInstance(java.lang.Class<T> r1) {
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.UNSAFE     // Catch: java.lang.InstantiationException -> L7
            java.lang.Object r1 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    private static int arrayBaseOffset(java.lang.Class<?> r1) {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS
            if (r0 == 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            int r1 = r0.arrayBaseOffset(r1)
            goto Lc
        Lb:
            r1 = -1
        Lc:
            return r1
    }

    private static int arrayIndexScale(java.lang.Class<?> r1) {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS
            if (r0 == 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            int r1 = r0.arrayIndexScale(r1)
            goto Lc
        Lb:
            r1 = -1
        Lc:
            return r1
    }

    private static java.lang.reflect.Field bufferAddressField() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Android.isOnAndroidDevice()
            if (r0 == 0) goto L11
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r1 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = field(r0, r1)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r1 = "address"
            java.lang.reflect.Field r0 = field(r0, r1)
            if (r0 == 0) goto L24
            java.lang.Class r1 = r0.getType()
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 != r2) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }

    static void copyMemory(long r8, byte[] r10, long r11, long r13) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r1 = r8
            r3 = r10
            r4 = r11
            r6 = r13
            r0.copyMemory(r1, r3, r4, r6)
            return
    }

    static void copyMemory(byte[] r8, long r9, long r11, long r13) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r1 = r8
            r2 = r9
            r4 = r11
            r6 = r13
            r0.copyMemory(r1, r2, r4, r6)
            return
    }

    static void copyMemory(byte[] r0, long r1, byte[] r3, long r4, long r6) {
            int r1 = (int) r1
            int r2 = (int) r4
            int r4 = (int) r6
            java.lang.System.arraycopy(r0, r1, r3, r2, r4)
            return
    }

    static boolean determineAndroidSupportByAddressSize(java.lang.Class<?> r10) {
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r1 = com.google.crypto.tink.shaded.protobuf.Android.isOnAndroidDevice()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.Class<?> r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_CLASS     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "peekLong"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L89
            r5[r2] = r10     // Catch: java.lang.Throwable -> L89
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L89
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.Throwable -> L89
            r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "pokeLong"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L89
            r6[r2] = r10     // Catch: java.lang.Throwable -> L89
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L89
            r6[r7] = r8     // Catch: java.lang.Throwable -> L89
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L89
            r6[r4] = r8     // Catch: java.lang.Throwable -> L89
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "pokeInt"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L89
            r6[r2] = r10     // Catch: java.lang.Throwable -> L89
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L89
            r6[r7] = r8     // Catch: java.lang.Throwable -> L89
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L89
            r6[r4] = r8     // Catch: java.lang.Throwable -> L89
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "peekInt"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L89
            r6[r2] = r10     // Catch: java.lang.Throwable -> L89
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L89
            r6[r7] = r8     // Catch: java.lang.Throwable -> L89
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "pokeByte"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L89
            r6[r2] = r10     // Catch: java.lang.Throwable -> L89
            java.lang.Class r8 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L89
            r6[r7] = r8     // Catch: java.lang.Throwable -> L89
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "peekByte"
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L89
            r6[r2] = r10     // Catch: java.lang.Throwable -> L89
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "pokeByteArray"
            r6 = 4
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L89
            r8[r2] = r10     // Catch: java.lang.Throwable -> L89
            r8[r7] = r0     // Catch: java.lang.Throwable -> L89
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L89
            r8[r4] = r9     // Catch: java.lang.Throwable -> L89
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L89
            r8[r5] = r9     // Catch: java.lang.Throwable -> L89
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "peekByteArray"
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L89
            r6[r2] = r10     // Catch: java.lang.Throwable -> L89
            r6[r7] = r0     // Catch: java.lang.Throwable -> L89
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L89
            r6[r4] = r10     // Catch: java.lang.Throwable -> L89
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L89
            r6[r5] = r10     // Catch: java.lang.Throwable -> L89
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L89
            return r7
        L89:
            return r2
    }

    private static java.lang.reflect.Field field(java.lang.Class<?> r0, java.lang.String r1) {
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    private static long fieldOffset(java.lang.reflect.Field r2) {
            if (r2 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            if (r0 != 0) goto L7
            goto Lc
        L7:
            long r0 = r0.objectFieldOffset(r2)
            goto Le
        Lc:
            r0 = -1
        Le:
            return r0
    }

    private static int firstDifferingByteIndexNativeEndian(long r1, long r3) {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_BIG_ENDIAN
            if (r0 == 0) goto La
            long r1 = r1 ^ r3
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            goto Lf
        La:
            long r1 = r1 ^ r3
            int r1 = java.lang.Long.numberOfTrailingZeros(r1)
        Lf:
            int r1 = r1 >> 3
            return r1
    }

    static boolean getBoolean(java.lang.Object r1, long r2) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            boolean r1 = r0.getBoolean(r1, r2)
            return r1
    }

    static boolean getBoolean(boolean[] r5, long r6) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BOOLEAN_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BOOLEAN_ARRAY_INDEX_SCALE
            long r6 = r6 * r3
            long r1 = r1 + r6
            boolean r5 = r0.getBoolean(r5, r1)
            return r5
    }

    private static boolean getBooleanBigEndian(java.lang.Object r0, long r1) {
            byte r0 = getByteBigEndian(r0, r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static boolean getBooleanLittleEndian(java.lang.Object r0, long r1) {
            byte r0 = getByteLittleEndian(r0, r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static byte getByte(long r1) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            byte r1 = r0.getByte(r1)
            return r1
    }

    static byte getByte(java.lang.Object r1, long r2) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            byte r1 = r0.getByte(r1, r2)
            return r1
    }

    static byte getByte(byte[] r3, long r4) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET
            long r1 = r1 + r4
            byte r3 = r0.getByte(r3, r1)
            return r3
    }

    private static byte getByteBigEndian(java.lang.Object r2, long r3) {
            r0 = -4
            long r0 = r0 & r3
            int r2 = getInt(r2, r0)
            long r3 = ~r3
            r0 = 3
            long r3 = r3 & r0
            r0 = 3
            long r3 = r3 << r0
            int r3 = (int) r3
            int r2 = r2 >>> r3
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            return r2
    }

    private static byte getByteLittleEndian(java.lang.Object r2, long r3) {
            r0 = -4
            long r0 = r0 & r3
            int r2 = getInt(r2, r0)
            r0 = 3
            long r3 = r3 & r0
            r0 = 3
            long r3 = r3 << r0
            int r3 = (int) r3
            int r2 = r2 >>> r3
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            return r2
    }

    static double getDouble(java.lang.Object r1, long r2) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            double r1 = r0.getDouble(r1, r2)
            return r1
    }

    static double getDouble(double[] r5, long r6) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.DOUBLE_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.DOUBLE_ARRAY_INDEX_SCALE
            long r6 = r6 * r3
            long r1 = r1 + r6
            double r5 = r0.getDouble(r5, r1)
            return r5
    }

    static float getFloat(java.lang.Object r1, long r2) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            float r1 = r0.getFloat(r1, r2)
            return r1
    }

    static float getFloat(float[] r5, long r6) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.FLOAT_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.FLOAT_ARRAY_INDEX_SCALE
            long r6 = r6 * r3
            long r1 = r1 + r6
            float r5 = r0.getFloat(r5, r1)
            return r5
    }

    static int getInt(long r1) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            int r1 = r0.getInt(r1)
            return r1
    }

    static int getInt(java.lang.Object r1, long r2) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            int r1 = r0.getInt(r1, r2)
            return r1
    }

    static int getInt(int[] r5, long r6) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.INT_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.INT_ARRAY_INDEX_SCALE
            long r6 = r6 * r3
            long r1 = r1 + r6
            int r5 = r0.getInt(r5, r1)
            return r5
    }

    static long getLong(long r1) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = r0.getLong(r1)
            return r1
    }

    static long getLong(java.lang.Object r1, long r2) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = r0.getLong(r1, r2)
            return r1
    }

    static long getLong(long[] r5, long r6) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.LONG_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.LONG_ARRAY_INDEX_SCALE
            long r6 = r6 * r3
            long r1 = r1 + r6
            long r5 = r0.getLong(r5, r1)
            return r5
    }

    private static com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor getMemoryAccessor() {
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.UNSAFE
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = com.google.crypto.tink.shaded.protobuf.Android.isOnAndroidDevice()
            if (r2 == 0) goto L20
            boolean r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_ANDROID_64
            if (r2 == 0) goto L16
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$Android64MemoryAccessor r1 = new com.google.crypto.tink.shaded.protobuf.UnsafeUtil$Android64MemoryAccessor
            r1.<init>(r0)
            return r1
        L16:
            boolean r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_ANDROID_32
            if (r2 == 0) goto L1f
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$Android32MemoryAccessor r1 = new com.google.crypto.tink.shaded.protobuf.UnsafeUtil$Android32MemoryAccessor
            r1.<init>(r0)
        L1f:
            return r1
        L20:
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$JvmMemoryAccessor r1 = new com.google.crypto.tink.shaded.protobuf.UnsafeUtil$JvmMemoryAccessor
            r1.<init>(r0)
            return r1
    }

    static java.lang.Object getObject(java.lang.Object r1, long r2) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            java.lang.Object r1 = r0.getObject(r1, r2)
            return r1
    }

    static java.lang.Object getObject(java.lang.Object[] r5, long r6) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.OBJECT_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.OBJECT_ARRAY_INDEX_SCALE
            long r6 = r6 * r3
            long r1 = r1 + r6
            java.lang.Object r5 = r0.getObject(r5, r1)
            return r5
    }

    static java.lang.Object getStaticObject(java.lang.reflect.Field r1) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            java.lang.Object r1 = r0.getStaticObject(r1)
            return r1
    }

    static sun.misc.Unsafe getUnsafe() {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$1 r0 = new com.google.crypto.tink.shaded.protobuf.UnsafeUtil$1     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.Throwable -> Lc
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Throwable -> Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    static boolean hasUnsafeArrayOperations() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS
            return r0
    }

    static boolean hasUnsafeByteBufferOperations() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.HAS_UNSAFE_BYTEBUFFER_OPERATIONS
            return r0
    }

    static boolean isAndroid64() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.IS_ANDROID_64
            return r0
    }

    private static void logMissingMethod(java.lang.Throwable r4) {
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.UnsafeUtil> r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "platform method missing - proto runtime falling back to safer methods: "
            r2.<init>(r3)
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r4 = r4.toString()
            r0.log(r1, r4)
            return
    }

    static int mismatch(byte[] r10, int r11, byte[] r12, int r13, int r14) {
            if (r11 < 0) goto L67
            if (r13 < 0) goto L67
            if (r14 < 0) goto L67
            int r0 = r11 + r14
            int r1 = r10.length
            if (r0 > r1) goto L67
            int r0 = r13 + r14
            int r1 = r12.length
            if (r0 > r1) goto L67
            boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS
            r1 = 0
            if (r0 == 0) goto L55
            int r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BYTE_ARRAY_ALIGNMENT
            int r0 = r0 + r11
            r0 = r0 & 7
        L1a:
            if (r1 >= r14) goto L30
            r2 = r0 & 7
            if (r2 == 0) goto L30
            int r2 = r11 + r1
            r2 = r10[r2]
            int r3 = r13 + r1
            r3 = r12[r3]
            if (r2 == r3) goto L2b
            return r1
        L2b:
            int r1 = r1 + 1
            int r0 = r0 + 1
            goto L1a
        L30:
            int r0 = r14 - r1
            r0 = r0 & (-8)
            int r0 = r0 + r1
        L35:
            if (r1 >= r0) goto L55
            long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET
            long r4 = (long) r11
            long r4 = r4 + r2
            long r6 = (long) r1
            long r4 = r4 + r6
            long r4 = getLong(r10, r4)
            long r8 = (long) r13
            long r2 = r2 + r8
            long r2 = r2 + r6
            long r2 = getLong(r12, r2)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r10 = firstDifferingByteIndexNativeEndian(r4, r2)
            int r1 = r1 + r10
            return r1
        L52:
            int r1 = r1 + 8
            goto L35
        L55:
            if (r1 >= r14) goto L65
            int r0 = r11 + r1
            r0 = r10[r0]
            int r2 = r13 + r1
            r2 = r12[r2]
            if (r0 == r2) goto L62
            return r1
        L62:
            int r1 = r1 + 1
            goto L55
        L65:
            r10 = -1
            return r10
        L67:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
    }

    static long objectFieldOffset(java.lang.reflect.Field r2) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r0 = r0.objectFieldOffset(r2)
            return r0
    }

    static void putBoolean(java.lang.Object r1, long r2, boolean r4) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putBoolean(r1, r2, r4)
            return
    }

    static void putBoolean(boolean[] r5, long r6, boolean r8) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BOOLEAN_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BOOLEAN_ARRAY_INDEX_SCALE
            long r6 = r6 * r3
            long r1 = r1 + r6
            r0.putBoolean(r5, r1, r8)
            return
    }

    private static void putBooleanBigEndian(java.lang.Object r0, long r1, boolean r3) {
            byte r3 = (byte) r3
            putByteBigEndian(r0, r1, r3)
            return
    }

    private static void putBooleanLittleEndian(java.lang.Object r0, long r1, boolean r3) {
            byte r3 = (byte) r3
            putByteLittleEndian(r0, r1, r3)
            return
    }

    static void putByte(long r1, byte r3) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putByte(r1, r3)
            return
    }

    static void putByte(java.lang.Object r1, long r2, byte r4) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putByte(r1, r2, r4)
            return
    }

    static void putByte(byte[] r3, long r4, byte r6) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET
            long r1 = r1 + r4
            r0.putByte(r3, r1, r6)
            return
    }

    private static void putByteBigEndian(java.lang.Object r4, long r5, byte r7) {
            r0 = -4
            long r0 = r0 & r5
            int r2 = getInt(r4, r0)
            int r5 = (int) r5
            int r5 = ~r5
            r5 = r5 & 3
            int r5 = r5 << 3
            r6 = 255(0xff, float:3.57E-43)
            int r3 = r6 << r5
            int r3 = ~r3
            r2 = r2 & r3
            r6 = r6 & r7
            int r5 = r6 << r5
            r5 = r5 | r2
            putInt(r4, r0, r5)
            return
    }

    private static void putByteLittleEndian(java.lang.Object r4, long r5, byte r7) {
            r0 = -4
            long r0 = r0 & r5
            int r2 = getInt(r4, r0)
            int r5 = (int) r5
            r5 = r5 & 3
            int r5 = r5 << 3
            r6 = 255(0xff, float:3.57E-43)
            int r3 = r6 << r5
            int r3 = ~r3
            r2 = r2 & r3
            r6 = r6 & r7
            int r5 = r6 << r5
            r5 = r5 | r2
            putInt(r4, r0, r5)
            return
    }

    static void putDouble(java.lang.Object r6, long r7, double r9) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r1 = r6
            r2 = r7
            r4 = r9
            r0.putDouble(r1, r2, r4)
            return
    }

    static void putDouble(double[] r6, long r7, double r9) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.DOUBLE_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.DOUBLE_ARRAY_INDEX_SCALE
            long r7 = r7 * r3
            long r2 = r1 + r7
            r1 = r6
            r4 = r9
            r0.putDouble(r1, r2, r4)
            return
    }

    static void putFloat(java.lang.Object r1, long r2, float r4) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putFloat(r1, r2, r4)
            return
    }

    static void putFloat(float[] r5, long r6, float r8) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.FLOAT_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.FLOAT_ARRAY_INDEX_SCALE
            long r6 = r6 * r3
            long r1 = r1 + r6
            r0.putFloat(r5, r1, r8)
            return
    }

    static void putInt(long r1, int r3) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putInt(r1, r3)
            return
    }

    static void putInt(java.lang.Object r1, long r2, int r4) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putInt(r1, r2, r4)
            return
    }

    static void putInt(int[] r5, long r6, int r8) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.INT_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.INT_ARRAY_INDEX_SCALE
            long r6 = r6 * r3
            long r1 = r1 + r6
            r0.putInt(r5, r1, r8)
            return
    }

    static void putLong(long r1, long r3) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putLong(r1, r3)
            return
    }

    static void putLong(java.lang.Object r6, long r7, long r9) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r1 = r6
            r2 = r7
            r4 = r9
            r0.putLong(r1, r2, r4)
            return
    }

    static void putLong(long[] r6, long r7, long r9) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.LONG_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.LONG_ARRAY_INDEX_SCALE
            long r7 = r7 * r3
            long r2 = r1 + r7
            r1 = r6
            r4 = r9
            r0.putLong(r1, r2, r4)
            return
    }

    static void putObject(java.lang.Object r1, long r2, java.lang.Object r4) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putObject(r1, r2, r4)
            return
    }

    static void putObject(java.lang.Object[] r5, long r6, java.lang.Object r8) {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.OBJECT_ARRAY_BASE_OFFSET
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.OBJECT_ARRAY_INDEX_SCALE
            long r6 = r6 * r3
            long r1 = r1 + r6
            r0.putObject(r5, r1, r8)
            return
    }

    private static boolean supportsUnsafeArrayOperations() {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.supportsUnsafeArrayOperations()
            return r0
    }

    private static boolean supportsUnsafeByteBufferOperations() {
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.supportsUnsafeByteBufferOperations()
            return r0
    }
}
