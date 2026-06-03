package org.lwjgl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/PointerBuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/PointerBuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/PointerBuffer.class */
public class PointerBuffer extends org.lwjgl.system.CustomBuffer<org.lwjgl.PointerBuffer> implements java.lang.Comparable<org.lwjgl.PointerBuffer> {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/PointerBuffer$PointerBufferR.class */
    private static final class PointerBufferR extends org.lwjgl.PointerBuffer {
        PointerBufferR(java.nio.ByteBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }

        @Override // org.lwjgl.PointerBuffer
        public boolean isReadOnly() {
                r2 = this;
                r0 = 1
                return r0
        }

        protected org.lwjgl.PointerBuffer newInstance(java.nio.ByteBuffer r5) {
                r4 = this;
                org.lwjgl.PointerBuffer$PointerBufferR r0 = new org.lwjgl.PointerBuffer$PointerBufferR
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                return r0
        }

        @Override // org.lwjgl.PointerBuffer
        public org.lwjgl.PointerBuffer asReadOnlyBuffer() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.CustomBuffer r0 = r0.duplicate()
                org.lwjgl.PointerBuffer r0 = (org.lwjgl.PointerBuffer) r0
                return r0
        }

        @Override // org.lwjgl.PointerBuffer
        public org.lwjgl.PointerBuffer put(long r4) {
                r3 = this;
                java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // org.lwjgl.PointerBuffer
        public org.lwjgl.PointerBuffer put(int r4, long r5) {
                r3 = this;
                java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
                r1 = r0
                r1.<init>()
                throw r0
        }

        public org.lwjgl.PointerBuffer put(org.lwjgl.PointerBuffer r4) {
                r3 = this;
                java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // org.lwjgl.PointerBuffer
        public org.lwjgl.PointerBuffer put(long[] r4, int r5, int r6) {
                r3 = this;
                java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        public org.lwjgl.PointerBuffer compact() {
                r3 = this;
                java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
                r1 = r0
                r1.<init>()
                throw r0
        }

        @Override // org.lwjgl.PointerBuffer, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(org.lwjgl.PointerBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.PointerBuffer r1 = (org.lwjgl.PointerBuffer) r1
                int r0 = super.compareTo2(r1)
                return r0
        }

        @Override // org.lwjgl.PointerBuffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.PointerBuffer r0 = super.self()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        public /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer compact() {
                r2 = this;
                r0 = r2
                org.lwjgl.PointerBuffer r0 = r0.compact()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        public /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer put(org.lwjgl.system.CustomBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.PointerBuffer r1 = (org.lwjgl.PointerBuffer) r1
                org.lwjgl.PointerBuffer r0 = r0.put(r1)
                return r0
        }
    }

    public PointerBuffer(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.PointerBuffer r1 = allocateDirect(r1)
            r0.<init>(r1)
            return
    }

    public PointerBuffer(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.PointerBuffer r1 = create(r1)
            r0.<init>(r1)
            return
    }

    protected PointerBuffer(org.lwjgl.PointerBuffer r10) {
            r9 = this;
            r0 = r9
            r1 = r10
            long r1 = r1.address0()
            r2 = r10
            java.nio.ByteBuffer r2 = r2.container
            r3 = r10
            int r3 = r3.mark
            r4 = r10
            int r4 = r4.position
            r5 = r10
            int r5 = r5.limit
            r6 = r10
            int r6 = r6.capacity
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public java.nio.ByteBuffer getBuffer() {
            r2 = this;
            r0 = r2
            java.nio.ByteBuffer r0 = r0.container
            return r0
    }

    public static boolean is64Bit() {
            int r0 = org.lwjgl.PointerBuffer.POINTER_SIZE
            r1 = 8
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static int getPointerSize() {
            int r0 = org.lwjgl.PointerBuffer.POINTER_SIZE
            return r0
    }

    public final int positionByte() {
            r3 = this;
            r0 = r3
            int r0 = r0.position()
            int r1 = getPointerSize()
            int r0 = r0 * r1
            return r0
    }

    public final int remainingByte() {
            r3 = this;
            r0 = r3
            int r0 = r0.remaining()
            int r1 = getPointerSize()
            int r0 = r0 * r1
            return r0
    }

    public org.lwjgl.PointerBuffer asReadOnlyBuffer() {
            r4 = this;
            org.lwjgl.PointerBuffer$PointerBufferR r0 = new org.lwjgl.PointerBuffer$PointerBufferR
            r1 = r0
            r2 = r4
            java.nio.ByteBuffer r2 = r2.container
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.position()
            org.lwjgl.system.CustomBuffer r0 = r0.position(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.limit()
            org.lwjgl.system.CustomBuffer r0 = r0.limit(r1)
            r0 = r5
            return r0
    }

    public boolean isReadOnly() {
            r2 = this;
            r0 = 0
            return r0
    }

    protected PointerBuffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public static org.lwjgl.PointerBuffer allocateDirect(int r10) {
            r0 = r10
            int r1 = org.lwjgl.PointerBuffer.POINTER_SHIFT
            int r0 = org.lwjgl.BufferUtils.getAllocationSize(r0, r1)
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r11 = r0
            org.lwjgl.PointerBuffer r0 = new org.lwjgl.PointerBuffer
            r1 = r0
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = -1
            r5 = 0
            r6 = r10
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static org.lwjgl.PointerBuffer create(long r10, int r12) {
            org.lwjgl.PointerBuffer r0 = new org.lwjgl.PointerBuffer
            r1 = r0
            r2 = r10
            r3 = 0
            r4 = -1
            r5 = 0
            r6 = r12
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static org.lwjgl.PointerBuffer create(java.nio.ByteBuffer r10) {
            r0 = r10
            int r0 = r0.remaining()
            int r1 = org.lwjgl.PointerBuffer.POINTER_SHIFT
            int r0 = r0 >> r1
            r11 = r0
            org.lwjgl.PointerBuffer r0 = new org.lwjgl.PointerBuffer
            r1 = r0
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            r4 = -1
            r5 = 0
            r6 = r11
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // org.lwjgl.system.CustomBuffer
    protected org.lwjgl.PointerBuffer self() {
            r2 = this;
            r0 = r2
            return r0
    }

    @Override // org.lwjgl.system.CustomBuffer
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.PointerBuffer.POINTER_SIZE
            return r0
    }

    public long get() {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r7
            int r1 = r1.nextGetIndex()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            int r2 = org.lwjgl.PointerBuffer.POINTER_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long get(java.nio.ByteBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            int r1 = org.lwjgl.PointerBuffer.POINTER_SIZE
            if (r0 >= r1) goto L12
            java.nio.BufferUnderflowException r0 = new java.nio.BufferUnderflowException
            r1 = r0
            r1.<init>()
            throw r0
        L12:
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L29
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)     // Catch: java.lang.Throwable -> L29
            r5 = r0
            r0 = r4
            r1 = r4
            int r1 = r1.position()
            int r2 = org.lwjgl.PointerBuffer.POINTER_SIZE
            int r1 = r1 + r2
            java.nio.Buffer r0 = r0.position(r1)
            r0 = r5
            return r0
        L29:
            r7 = move-exception
            r0 = r4
            r1 = r4
            int r1 = r1.position()
            int r2 = org.lwjgl.PointerBuffer.POINTER_SIZE
            int r1 = r1 + r2
            java.nio.Buffer r0 = r0.position(r1)
            r0 = r7
            throw r0
    }

    public org.lwjgl.PointerBuffer put(long r8) {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r7
            int r1 = r1.nextPutIndex()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            int r2 = org.lwjgl.PointerBuffer.POINTER_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r8
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            return r0
    }

    public static void put(java.nio.ByteBuffer r5, long r6) {
            r0 = r5
            int r0 = r0.remaining()
            int r1 = org.lwjgl.PointerBuffer.POINTER_SIZE
            if (r0 >= r1) goto L12
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L12:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L2a
            r1 = r6
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> L2a
            r0 = r5
            r1 = r5
            int r1 = r1.position()
            int r2 = org.lwjgl.PointerBuffer.POINTER_SIZE
            int r1 = r1 + r2
            java.nio.Buffer r0 = r0.position(r1)
            goto L3a
        L2a:
            r8 = move-exception
            r0 = r5
            r1 = r5
            int r1 = r1.position()
            int r2 = org.lwjgl.PointerBuffer.POINTER_SIZE
            int r1 = r1 + r2
            java.nio.Buffer r0 = r0.position(r1)
            r0 = r8
            throw r0
        L3a:
            return
    }

    public long get(int r8) {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r8
            r2 = r7
            int r2 = r2.limit
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.PointerBuffer.POINTER_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long get(java.nio.ByteBuffer r5, int r6) {
            r0 = r6
            int r1 = org.lwjgl.PointerBuffer.POINTER_SIZE
            r2 = r5
            int r2 = r2.limit()
            int r0 = org.lwjgl.system.CheckIntrinsics.checkFromIndexSize(r0, r1, r2)
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress0(r0)
            r1 = r6
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public org.lwjgl.PointerBuffer put(int r8, long r9) {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r8
            r2 = r7
            int r2 = r2.limit
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.PointerBuffer.POINTER_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r9
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            return r0
    }

    public static void put(java.nio.ByteBuffer r5, int r6, long r7) {
            r0 = r6
            int r1 = org.lwjgl.PointerBuffer.POINTER_SIZE
            r2 = r5
            int r2 = r2.limit()
            int r0 = org.lwjgl.system.CheckIntrinsics.checkFromIndexSize(r0, r1, r2)
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress0(r0)
            r1 = r6
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public org.lwjgl.PointerBuffer put(org.lwjgl.system.Pointer r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.PointerBuffer put(int r6, org.lwjgl.system.Pointer r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = r2.address()
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.PointerBuffer put(java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.PointerBuffer put(java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.PointerBuffer put(java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.PointerBuffer put(java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.PointerBuffer put(java.nio.FloatBuffer r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.PointerBuffer put(java.nio.DoubleBuffer r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.PointerBuffer putAddressOf(org.lwjgl.system.CustomBuffer<?> r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.PointerBuffer put(int r6, java.nio.ByteBuffer r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.PointerBuffer put(int r6, java.nio.ShortBuffer r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.PointerBuffer put(int r6, java.nio.IntBuffer r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.PointerBuffer put(int r6, java.nio.LongBuffer r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.PointerBuffer put(int r6, java.nio.FloatBuffer r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.PointerBuffer put(int r6, java.nio.DoubleBuffer r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.PointerBuffer putAddressOf(int r6, org.lwjgl.system.CustomBuffer<?> r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r0 = r5
            return r0
    }

    public java.nio.ByteBuffer getByteBuffer(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.get()
            r1 = r5
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public java.nio.ShortBuffer getShortBuffer(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.get()
            r1 = r5
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public java.nio.IntBuffer getIntBuffer(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.get()
            r1 = r5
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public java.nio.LongBuffer getLongBuffer(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.get()
            r1 = r5
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public java.nio.FloatBuffer getFloatBuffer(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.get()
            r1 = r5
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public java.nio.DoubleBuffer getDoubleBuffer(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.get()
            r1 = r5
            java.nio.DoubleBuffer r0 = org.lwjgl.system.MemoryUtil.memDoubleBuffer(r0, r1)
            return r0
    }

    public org.lwjgl.PointerBuffer getPointerBuffer(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.get()
            r1 = r5
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBuffer(r0, r1)
            return r0
    }

    public java.lang.String getStringASCII() {
            r3 = this;
            r0 = r3
            long r0 = r0.get()
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0)
            return r0
    }

    public java.lang.String getStringUTF8() {
            r3 = this;
            r0 = r3
            long r0 = r0.get()
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public java.lang.String getStringUTF16() {
            r3 = this;
            r0 = r3
            long r0 = r0.get()
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF16(r0)
            return r0
    }

    public java.nio.ByteBuffer getByteBuffer(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r0 = r0.get(r1)
            r1 = r6
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public java.nio.ShortBuffer getShortBuffer(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r0 = r0.get(r1)
            r1 = r6
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public java.nio.IntBuffer getIntBuffer(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r0 = r0.get(r1)
            r1 = r6
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public java.nio.LongBuffer getLongBuffer(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r0 = r0.get(r1)
            r1 = r6
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public java.nio.FloatBuffer getFloatBuffer(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r0 = r0.get(r1)
            r1 = r6
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public java.nio.DoubleBuffer getDoubleBuffer(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r0 = r0.get(r1)
            r1 = r6
            java.nio.DoubleBuffer r0 = org.lwjgl.system.MemoryUtil.memDoubleBuffer(r0, r1)
            return r0
    }

    public org.lwjgl.PointerBuffer getPointerBuffer(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            long r0 = r0.get(r1)
            r1 = r6
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBuffer(r0, r1)
            return r0
    }

    public java.lang.String getStringASCII(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            long r0 = r0.get(r1)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0)
            return r0
    }

    public java.lang.String getStringUTF8(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            long r0 = r0.get(r1)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public java.lang.String getStringUTF16(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            long r0 = r0.get(r1)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF16(r0)
            return r0
    }

    public org.lwjgl.PointerBuffer get(long[] r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = r6
            int r3 = r3.length
            org.lwjgl.PointerBuffer r0 = r0.get(r1, r2, r3)
            return r0
    }

    public org.lwjgl.PointerBuffer get(long[] r6, int r7, int r8) {
            r5 = this;
            boolean r0 = org.lwjgl.PointerBuffer.BITS64
            if (r0 == 0) goto L26
            r0 = r5
            long r0 = r0.address()
            r1 = r5
            int r1 = r1.remaining()
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            r1 = r6
            r2 = r7
            r3 = r8
            java.nio.LongBuffer r0 = r0.get(r1, r2, r3)
            r0 = r5
            r1 = r5
            int r1 = r1.position()
            r2 = r8
            int r1 = r1 + r2
            org.lwjgl.system.CustomBuffer r0 = r0.position(r1)
            goto L2d
        L26:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.get32(r1, r2, r3)
        L2d:
            r0 = r5
            return r0
    }

    private void get32(long[] r6, int r7, int r8) {
            r5 = this;
            r0 = r7
            r1 = r8
            r2 = r6
            int r2 = r2.length
            int r0 = org.lwjgl.system.CheckIntrinsics.checkFromIndexSize(r0, r1, r2)
            r0 = r5
            int r0 = r0.remaining()
            r1 = r8
            if (r0 >= r1) goto L18
            java.nio.BufferUnderflowException r0 = new java.nio.BufferUnderflowException
            r1 = r0
            r1.<init>()
            throw r0
        L18:
            r0 = r7
            r9 = r0
            r0 = r7
            r1 = r8
            int r0 = r0 + r1
            r10 = r0
        L20:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L35
            r0 = r6
            r1 = r9
            r2 = r5
            long r2 = r2.get()
            r0[r1] = r2
            int r9 = r9 + 1
            goto L20
        L35:
            return
    }

    public org.lwjgl.PointerBuffer put(long[] r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = r6
            int r3 = r3.length
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2, r3)
            return r0
    }

    public org.lwjgl.PointerBuffer put(long[] r6, int r7, int r8) {
            r5 = this;
            boolean r0 = org.lwjgl.PointerBuffer.BITS64
            if (r0 == 0) goto L26
            r0 = r5
            long r0 = r0.address()
            r1 = r5
            int r1 = r1.remaining()
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            r1 = r6
            r2 = r7
            r3 = r8
            java.nio.LongBuffer r0 = r0.put(r1, r2, r3)
            r0 = r5
            r1 = r5
            int r1 = r1.position()
            r2 = r8
            int r1 = r1 + r2
            org.lwjgl.system.CustomBuffer r0 = r0.position(r1)
            goto L2d
        L26:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.put32(r1, r2, r3)
        L2d:
            r0 = r5
            return r0
    }

    private void put32(long[] r5, int r6, int r7) {
            r4 = this;
            r0 = r6
            r1 = r7
            r2 = r5
            int r2 = r2.length
            int r0 = org.lwjgl.system.CheckIntrinsics.checkFromIndexSize(r0, r1, r2)
            r0 = r4
            int r0 = r0.remaining()
            r1 = r7
            if (r0 >= r1) goto L18
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L18:
            r0 = r6
            r1 = r7
            int r0 = r0 + r1
            r8 = r0
            r0 = r6
            r9 = r0
        L20:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L36
            r0 = r4
            r1 = r5
            r2 = r9
            r1 = r1[r2]
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            int r9 = r9 + 1
            goto L20
        L36:
            return
    }

    @Override // org.lwjgl.system.Pointer.Default
    public int hashCode() {
            r4 = this;
            r0 = 1
            r5 = r0
            r0 = r4
            int r0 = r0.position()
            r6 = r0
            r0 = r4
            int r0 = r0.limit()
            r1 = 1
            int r0 = r0 - r1
            r7 = r0
        Le:
            r0 = r7
            r1 = r6
            if (r0 < r1) goto L25
            r0 = 31
            r1 = r5
            int r0 = r0 * r1
            r1 = r4
            r2 = r7
            long r1 = r1.get(r2)
            int r1 = (int) r1
            int r0 = r0 + r1
            r5 = r0
            int r7 = r7 + (-1)
            goto Le
        L25:
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.system.Pointer.Default
    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.PointerBuffer
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r6
            org.lwjgl.PointerBuffer r0 = (org.lwjgl.PointerBuffer) r0
            r7 = r0
            r0 = r5
            int r0 = r0.remaining()
            r1 = r7
            int r1 = r1.remaining()
            if (r0 == r1) goto L1b
            r0 = 0
            return r0
        L1b:
            r0 = r5
            int r0 = r0.position()
            r8 = r0
            r0 = r5
            int r0 = r0.limit()
            r1 = 1
            int r0 = r0 - r1
            r9 = r0
            r0 = r7
            int r0 = r0.limit()
            r1 = 1
            int r0 = r0 - r1
            r10 = r0
        L30:
            r0 = r9
            r1 = r8
            if (r0 < r1) goto L59
            r0 = r5
            r1 = r9
            long r0 = r0.get(r1)
            r11 = r0
            r0 = r7
            r1 = r10
            long r0 = r0.get(r1)
            r13 = r0
            r0 = r11
            r1 = r13
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L50
            r0 = 0
            return r0
        L50:
            int r9 = r9 + (-1)
            int r10 = r10 + (-1)
            goto L30
        L59:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.lwjgl.PointerBuffer r6) {
            r5 = this;
            r0 = r5
            int r0 = r0.position()
            r1 = r5
            int r1 = r1.remaining()
            r2 = r6
            int r2 = r2.remaining()
            int r1 = java.lang.Math.min(r1, r2)
            int r0 = r0 + r1
            r7 = r0
            r0 = r5
            int r0 = r0.position()
            r8 = r0
            r0 = r6
            int r0 = r0.position()
            r9 = r0
        L1c:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L50
            r0 = r5
            r1 = r8
            long r0 = r0.get(r1)
            r10 = r0
            r0 = r6
            r1 = r9
            long r0 = r0.get(r1)
            r12 = r0
            r0 = r10
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            goto L47
        L3b:
            r0 = r10
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L45
            r0 = -1
            return r0
        L45:
            r0 = 1
            return r0
        L47:
            int r8 = r8 + 1
            int r9 = r9 + 1
            goto L1c
        L50:
            r0 = r5
            int r0 = r0.remaining()
            r1 = r6
            int r1 = r1.remaining()
            int r0 = r0 - r1
            return r0
    }

    @Override // org.lwjgl.system.CustomBuffer
    protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
            r2 = this;
            r0 = r2
            org.lwjgl.PointerBuffer r0 = r0.self()
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.lwjgl.PointerBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.PointerBuffer r1 = (org.lwjgl.PointerBuffer) r1
            int r0 = r0.compareTo2(r1)
            return r0
    }
}
