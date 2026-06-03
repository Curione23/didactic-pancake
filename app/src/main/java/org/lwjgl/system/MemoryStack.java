package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryStack.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryStack.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryStack.class */
public class MemoryStack extends org.lwjgl.system.Pointer.Default implements java.lang.AutoCloseable {
    private static final int DEFAULT_STACK_SIZE = 0;
    private static final int DEFAULT_STACK_FRAMES = 8;
    private static final java.lang.ThreadLocal<org.lwjgl.system.MemoryStack> TLS = null;

    @javax.annotation.Nullable
    private final java.nio.ByteBuffer container;
    private final int size;
    private int pointer;
    private int[] frames;
    protected int frameIndex;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryStack$DebugMemoryStack.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryStack$DebugMemoryStack.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryStack$DebugMemoryStack.class */
    private static class DebugMemoryStack extends org.lwjgl.system.MemoryStack {
        private java.lang.Object[] debugFrames;

        DebugMemoryStack(@javax.annotation.Nullable java.nio.ByteBuffer r7, long r8, int r10) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r10
                r0.<init>(r1, r2, r3)
                r0 = r6
                r1 = 8
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.debugFrames = r1
                return
        }

        @Override // org.lwjgl.system.MemoryStack
        public org.lwjgl.system.MemoryStack push() {
                r4 = this;
                r0 = r4
                int r0 = r0.frameIndex
                r1 = r4
                java.lang.Object[] r1 = r1.debugFrames
                int r1 = r1.length
                if (r0 != r1) goto L10
                r0 = r4
                r0.frameOverflow()
            L10:
                r0 = r4
                java.lang.Object[] r0 = r0.debugFrames
                r1 = r4
                int r1 = r1.frameIndex
                java.lang.Class<org.lwjgl.system.MemoryStack> r2 = org.lwjgl.system.MemoryStack.class
                java.lang.Object r2 = org.lwjgl.system.StackWalkUtil.stackWalkGetMethod(r2)
                r0[r1] = r2
                r0 = r4
                org.lwjgl.system.MemoryStack r0 = super.push()
                return r0
        }

        private void frameOverflow() {
                r5 = this;
                r0 = r5
                r1 = r5
                java.lang.Object[] r1 = r1.debugFrames
                r2 = r5
                java.lang.Object[] r2 = r2.debugFrames
                int r2 = r2.length
                r3 = 3
                int r2 = r2 * r3
                r3 = 2
                int r2 = r2 / r3
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                r0.debugFrames = r1
                return
        }

        @Override // org.lwjgl.system.MemoryStack
        public org.lwjgl.system.MemoryStack pop() {
                r4 = this;
                r0 = r4
                java.lang.Object[] r0 = r0.debugFrames
                r1 = r4
                int r1 = r1.frameIndex
                r2 = 1
                int r1 = r1 - r2
                r0 = r0[r1]
                r5 = r0
                java.lang.Class<org.lwjgl.system.MemoryStack> r0 = org.lwjgl.system.MemoryStack.class
                r1 = r5
                java.lang.Object r0 = org.lwjgl.system.StackWalkUtil.stackWalkCheckPop(r0, r1)
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L1c
                r0 = r5
                r1 = r6
                reportAsymmetricPop(r0, r1)
            L1c:
                r0 = r4
                java.lang.Object[] r0 = r0.debugFrames
                r1 = r4
                int r1 = r1.frameIndex
                r2 = 1
                int r1 = r1 - r2
                r2 = 0
                r0[r1] = r2
                r0 = r4
                org.lwjgl.system.MemoryStack r0 = super.pop()
                return r0
        }

        @Override // org.lwjgl.system.MemoryStack, java.lang.AutoCloseable
        public void close() {
                r4 = this;
                r0 = r4
                java.lang.Object[] r0 = r0.debugFrames
                r1 = r4
                int r1 = r1.frameIndex
                r2 = 1
                int r1 = r1 - r2
                r2 = 0
                r0[r1] = r2
                r0 = r4
                org.lwjgl.system.MemoryStack r0 = super.pop()
                return
        }

        private static void reportAsymmetricPop(java.lang.Object r7, java.lang.Object r8) {
                java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
                java.lang.String r1 = "[LWJGL] Asymmetric pop detected:\n\tPUSHED: %s\n\tPOPPED: %s\n\tTHREAD: %s\n"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r7
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r8
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                r3[r4] = r5
                java.io.PrintStream r0 = r0.format(r1, r2)
                return
        }
    }

    protected MemoryStack(@javax.annotation.Nullable java.nio.ByteBuffer r5, long r6, int r8) {
            r4 = this;
            r0 = r4
            r1 = r6
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.container = r1
            r0 = r4
            r1 = r8
            r0.size = r1
            r0 = r4
            r1 = r8
            r0.pointer = r1
            r0 = r4
            r1 = 8
            int[] r1 = new int[r1]
            r0.frames = r1
            return
    }

    public static org.lwjgl.system.MemoryStack create() {
            int r0 = org.lwjgl.system.MemoryStack.DEFAULT_STACK_SIZE
            org.lwjgl.system.MemoryStack r0 = create(r0)
            return r0
    }

    public static org.lwjgl.system.MemoryStack create(int r2) {
            r0 = r2
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            org.lwjgl.system.MemoryStack r0 = create(r0)
            return r0
    }

    public static org.lwjgl.system.MemoryStack create(java.nio.ByteBuffer r7) {
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r8 = r0
            r0 = r7
            int r0 = r0.remaining()
            r10 = r0
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_STACK
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2a
            org.lwjgl.system.MemoryStack$DebugMemoryStack r0 = new org.lwjgl.system.MemoryStack$DebugMemoryStack
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r10
            r1.<init>(r2, r3, r4)
            goto L34
        L2a:
            org.lwjgl.system.MemoryStack r0 = new org.lwjgl.system.MemoryStack
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r10
            r1.<init>(r2, r3, r4)
        L34:
            return r0
    }

    public static org.lwjgl.system.MemoryStack ncreate(long r7, int r9) {
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_STACK
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L20
            org.lwjgl.system.MemoryStack$DebugMemoryStack r0 = new org.lwjgl.system.MemoryStack$DebugMemoryStack
            r1 = r0
            r2 = 0
            r3 = r7
            r4 = r9
            r1.<init>(r2, r3, r4)
            goto L2a
        L20:
            org.lwjgl.system.MemoryStack r0 = new org.lwjgl.system.MemoryStack
            r1 = r0
            r2 = 0
            r3 = r7
            r4 = r9
            r1.<init>(r2, r3, r4)
        L2a:
            return r0
    }

    public org.lwjgl.system.MemoryStack push() {
            r6 = this;
            r0 = r6
            int r0 = r0.frameIndex
            r1 = r6
            int[] r1 = r1.frames
            int r1 = r1.length
            if (r0 != r1) goto L10
            r0 = r6
            r0.frameOverflow()
        L10:
            r0 = r6
            int[] r0 = r0.frames
            r1 = r6
            r2 = r1
            int r2 = r2.frameIndex
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.frameIndex = r3
            r2 = r6
            int r2 = r2.pointer
            r0[r1] = r2
            r0 = r6
            return r0
    }

    private void frameOverflow() {
            r5 = this;
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "[WARNING] Out of frame stack space ("
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            int[] r1 = r1.frames
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ") in thread: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLog(r0)
        L2b:
            r0 = r5
            r1 = r5
            int[] r1 = r1.frames
            r2 = r5
            int[] r2 = r2.frames
            int r2 = r2.length
            r3 = 3
            int r2 = r2 * r3
            r3 = 2
            int r2 = r2 / r3
            int[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.frames = r1
            return
    }

    public org.lwjgl.system.MemoryStack pop() {
            r6 = this;
            r0 = r6
            r1 = r6
            int[] r1 = r1.frames
            r2 = r6
            r3 = r2
            int r3 = r3.frameIndex
            r4 = 1
            int r3 = r3 - r4
            r4 = r3; r3 = r2; r2 = r4; 
            r3.frameIndex = r4
            r1 = r1[r2]
            r0.pointer = r1
            r0 = r6
            return r0
    }

    @Override // java.lang.AutoCloseable
    public void close() {
            r2 = this;
            r0 = r2
            org.lwjgl.system.MemoryStack r0 = r0.pop()
            return
    }

    public long getAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address
            return r0
    }

    public int getSize() {
            r2 = this;
            r0 = r2
            int r0 = r0.size
            return r0
    }

    public int getFrameIndex() {
            r2 = this;
            r0 = r2
            int r0 = r0.frameIndex
            return r0
    }

    public long getPointerAddress() {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r7
            int r1 = r1.pointer
            long r1 = (long) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            long r0 = r0 + r1
            return r0
    }

    public int getPointer() {
            r2 = this;
            r0 = r2
            int r0 = r0.pointer
            return r0
    }

    public void setPointer(int r4) {
            r3 = this;
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = r4
            r0.checkPointer(r1)
        Lb:
            r0 = r3
            r1 = r4
            r0.pointer = r1
            return
    }

    private void checkPointer(int r5) {
            r4 = this;
            r0 = r5
            if (r0 < 0) goto Lc
            r0 = r4
            int r0 = r0.size
            r1 = r5
            if (r0 >= r1) goto L16
        Lc:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.String r2 = "Invalid stack pointer"
            r1.<init>(r2)
            throw r0
        L16:
            return
    }

    private static void checkAlignment(int r4) {
            r0 = r4
            int r0 = java.lang.Integer.bitCount(r0)
            r1 = 1
            if (r0 == r1) goto L12
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Alignment must be a power-of-two value."
            r1.<init>(r2)
            throw r0
        L12:
            return
    }

    public long nmalloc(int r5) {
            r4 = this;
            r0 = r4
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r2 = r5
            long r0 = r0.nmalloc(r1, r2)
            return r0
    }

    public long nmalloc(int r8, int r9) {
            r7 = this;
            r0 = r7
            long r0 = r0.address
            r1 = r7
            int r1 = r1.pointer
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            long r1 = (long) r1
            long r0 = r0 - r1
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = -1
            long r1 = r1 ^ r2
            long r0 = r0 & r1
            r10 = r0
            r0 = r7
            r1 = r10
            r2 = r7
            long r2 = r2.address
            long r1 = r1 - r2
            int r1 = (int) r1
            r0.pointer = r1
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L3b
            r0 = r7
            int r0 = r0.pointer
            if (r0 >= 0) goto L3b
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r1 = r0
            java.lang.String r2 = "Out of stack space."
            r1.<init>(r2)
            throw r0
        L3b:
            r0 = r10
            return r0
    }

    public long ncalloc(int r7, int r8, int r9) {
            r6 = this;
            r0 = r8
            r1 = r9
            int r0 = r0 * r1
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = r10
            long r0 = r0.nmalloc(r1, r2)
            r11 = r0
            r0 = r11
            r1 = 0
            r2 = r10
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memSet(r0, r1, r2)
            r0 = r11
            return r0
    }

    public java.nio.ByteBuffer malloc(int r6, int r7) {
            r5 = this;
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto La
            r0 = r6
            checkAlignment(r0)
        La:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r5
            r2 = r6
            r3 = r7
            long r1 = r1.nmalloc(r2, r3)
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public java.nio.ByteBuffer calloc(int r7, int r8) {
            r6 = this;
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto La
            r0 = r7
            checkAlignment(r0)
        La:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = 1
            long r1 = r1.ncalloc(r2, r3, r4)
            r2 = r8
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public java.nio.ByteBuffer malloc(int r6) {
            r5 = this;
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r5
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r3 = r6
            long r1 = r1.nmalloc(r2, r3)
            r2 = r6
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public java.nio.ByteBuffer calloc(int r7) {
            r6 = this;
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r3 = r7
            r4 = 1
            long r1 = r1.ncalloc(r2, r3, r4)
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public long nbyte(byte r5) {
            r4 = this;
            r0 = r4
            r1 = 1
            r2 = 1
            long r0 = r0.nmalloc(r1, r2)
            r6 = r0
            r0 = r6
            r1 = r5
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            r0 = r6
            return r0
    }

    public java.nio.ByteBuffer bytes(byte r5) {
            r4 = this;
            r0 = r4
            r1 = 1
            r2 = 1
            java.nio.ByteBuffer r0 = r0.malloc(r1, r2)
            r1 = 0
            r2 = r5
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.ByteBuffer bytes(byte r5, byte r6) {
            r4 = this;
            r0 = r4
            r1 = 1
            r2 = 2
            java.nio.ByteBuffer r0 = r0.malloc(r1, r2)
            r1 = 0
            r2 = r5
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.ByteBuffer bytes(byte r5, byte r6, byte r7) {
            r4 = this;
            r0 = r4
            r1 = 1
            r2 = 3
            java.nio.ByteBuffer r0 = r0.malloc(r1, r2)
            r1 = 0
            r2 = r5
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r7
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.ByteBuffer bytes(byte r5, byte r6, byte r7, byte r8) {
            r4 = this;
            r0 = r4
            r1 = 1
            r2 = 4
            java.nio.ByteBuffer r0 = r0.malloc(r1, r2)
            r1 = 0
            r2 = r5
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r7
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            r1 = 3
            r2 = r8
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.ByteBuffer bytes(byte... r5) {
            r4 = this;
            r0 = r4
            r1 = 1
            r2 = r5
            int r2 = r2.length
            java.nio.ByteBuffer r0 = r0.malloc(r1, r2)
            r1 = r5
            java.nio.ByteBuffer r0 = r0.put(r1)
            r6 = r0
            r0 = r6
            java.nio.Buffer r0 = r0.flip()
            r0 = r6
            return r0
    }

    public java.nio.ShortBuffer mallocShort(int r7) {
            r6 = this;
            java.lang.Class<? extends java.nio.ShortBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_SHORT
            r1 = r6
            r2 = 2
            r3 = r7
            r4 = 1
            int r3 = r3 << r4
            long r1 = r1.nmalloc(r2, r3)
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.ShortBuffer r0 = (java.nio.ShortBuffer) r0
            return r0
    }

    public java.nio.ShortBuffer callocShort(int r7) {
            r6 = this;
            r0 = r7
            r1 = 2
            int r0 = r0 * r1
            r8 = r0
            r0 = r6
            r1 = 2
            r2 = r8
            long r0 = r0.nmalloc(r1, r2)
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r8
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memSet(r0, r1, r2)
            java.lang.Class<? extends java.nio.ShortBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_SHORT
            r1 = r9
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.ShortBuffer r0 = (java.nio.ShortBuffer) r0
            return r0
    }

    public long nshort(short r5) {
            r4 = this;
            r0 = r4
            r1 = 2
            r2 = 2
            long r0 = r0.nmalloc(r1, r2)
            r6 = r0
            r0 = r6
            r1 = r5
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            r0 = r6
            return r0
    }

    public java.nio.ShortBuffer shorts(short r5) {
            r4 = this;
            r0 = r4
            r1 = 1
            java.nio.ShortBuffer r0 = r0.mallocShort(r1)
            r1 = 0
            r2 = r5
            java.nio.ShortBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.ShortBuffer shorts(short r5, short r6) {
            r4 = this;
            r0 = r4
            r1 = 2
            java.nio.ShortBuffer r0 = r0.mallocShort(r1)
            r1 = 0
            r2 = r5
            java.nio.ShortBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.ShortBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.ShortBuffer shorts(short r5, short r6, short r7) {
            r4 = this;
            r0 = r4
            r1 = 3
            java.nio.ShortBuffer r0 = r0.mallocShort(r1)
            r1 = 0
            r2 = r5
            java.nio.ShortBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.ShortBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r7
            java.nio.ShortBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.ShortBuffer shorts(short r5, short r6, short r7, short r8) {
            r4 = this;
            r0 = r4
            r1 = 4
            java.nio.ShortBuffer r0 = r0.mallocShort(r1)
            r1 = 0
            r2 = r5
            java.nio.ShortBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.ShortBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r7
            java.nio.ShortBuffer r0 = r0.put(r1, r2)
            r1 = 3
            r2 = r8
            java.nio.ShortBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.ShortBuffer shorts(short... r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.length
            java.nio.ShortBuffer r0 = r0.mallocShort(r1)
            r1 = r4
            java.nio.ShortBuffer r0 = r0.put(r1)
            r5 = r0
            r0 = r5
            java.nio.Buffer r0 = r0.flip()
            r0 = r5
            return r0
    }

    public java.nio.IntBuffer mallocInt(int r7) {
            r6 = this;
            java.lang.Class<? extends java.nio.IntBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_INT
            r1 = r6
            r2 = 4
            r3 = r7
            r4 = 2
            int r3 = r3 << r4
            long r1 = r1.nmalloc(r2, r3)
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.IntBuffer r0 = (java.nio.IntBuffer) r0
            return r0
    }

    public java.nio.IntBuffer callocInt(int r7) {
            r6 = this;
            r0 = r7
            r1 = 4
            int r0 = r0 * r1
            r8 = r0
            r0 = r6
            r1 = 4
            r2 = r8
            long r0 = r0.nmalloc(r1, r2)
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r8
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memSet(r0, r1, r2)
            java.lang.Class<? extends java.nio.IntBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_INT
            r1 = r9
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.IntBuffer r0 = (java.nio.IntBuffer) r0
            return r0
    }

    public long nint(int r5) {
            r4 = this;
            r0 = r4
            r1 = 4
            r2 = 4
            long r0 = r0.nmalloc(r1, r2)
            r6 = r0
            r0 = r6
            r1 = r5
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            r0 = r6
            return r0
    }

    public java.nio.IntBuffer ints(int r5) {
            r4 = this;
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = r0.mallocInt(r1)
            r1 = 0
            r2 = r5
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.IntBuffer ints(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = 2
            java.nio.IntBuffer r0 = r0.mallocInt(r1)
            r1 = 0
            r2 = r5
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.IntBuffer ints(int r5, int r6, int r7) {
            r4 = this;
            r0 = r4
            r1 = 3
            java.nio.IntBuffer r0 = r0.mallocInt(r1)
            r1 = 0
            r2 = r5
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r7
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.IntBuffer ints(int r5, int r6, int r7, int r8) {
            r4 = this;
            r0 = r4
            r1 = 4
            java.nio.IntBuffer r0 = r0.mallocInt(r1)
            r1 = 0
            r2 = r5
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r7
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            r1 = 3
            r2 = r8
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.IntBuffer ints(int... r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.length
            java.nio.IntBuffer r0 = r0.mallocInt(r1)
            r1 = r4
            java.nio.IntBuffer r0 = r0.put(r1)
            r5 = r0
            r0 = r5
            java.nio.Buffer r0 = r0.flip()
            r0 = r5
            return r0
    }

    public java.nio.LongBuffer mallocLong(int r7) {
            r6 = this;
            java.lang.Class<? extends java.nio.LongBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_LONG
            r1 = r6
            r2 = 8
            r3 = r7
            r4 = 3
            int r3 = r3 << r4
            long r1 = r1.nmalloc(r2, r3)
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.LongBuffer r0 = (java.nio.LongBuffer) r0
            return r0
    }

    public java.nio.LongBuffer callocLong(int r7) {
            r6 = this;
            r0 = r7
            r1 = 8
            int r0 = r0 * r1
            r8 = r0
            r0 = r6
            r1 = 8
            r2 = r8
            long r0 = r0.nmalloc(r1, r2)
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r8
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memSet(r0, r1, r2)
            java.lang.Class<? extends java.nio.LongBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_LONG
            r1 = r9
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.LongBuffer r0 = (java.nio.LongBuffer) r0
            return r0
    }

    public long nlong(long r6) {
            r5 = this;
            r0 = r5
            r1 = 8
            r2 = 8
            long r0 = r0.nmalloc(r1, r2)
            r8 = r0
            r0 = r8
            r1 = r6
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            r0 = r8
            return r0
    }

    public java.nio.LongBuffer longs(long r6) {
            r5 = this;
            r0 = r5
            r1 = 1
            java.nio.LongBuffer r0 = r0.mallocLong(r1)
            r1 = 0
            r2 = r6
            java.nio.LongBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.LongBuffer longs(long r6, long r8) {
            r5 = this;
            r0 = r5
            r1 = 2
            java.nio.LongBuffer r0 = r0.mallocLong(r1)
            r1 = 0
            r2 = r6
            java.nio.LongBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            java.nio.LongBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.LongBuffer longs(long r6, long r8, long r10) {
            r5 = this;
            r0 = r5
            r1 = 3
            java.nio.LongBuffer r0 = r0.mallocLong(r1)
            r1 = 0
            r2 = r6
            java.nio.LongBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            java.nio.LongBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r10
            java.nio.LongBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.LongBuffer longs(long r6, long r8, long r10, long r12) {
            r5 = this;
            r0 = r5
            r1 = 4
            java.nio.LongBuffer r0 = r0.mallocLong(r1)
            r1 = 0
            r2 = r6
            java.nio.LongBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            java.nio.LongBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r10
            java.nio.LongBuffer r0 = r0.put(r1, r2)
            r1 = 3
            r2 = r12
            java.nio.LongBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.LongBuffer longs(long... r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.length
            java.nio.LongBuffer r0 = r0.mallocLong(r1)
            r1 = r4
            java.nio.LongBuffer r0 = r0.put(r1)
            r5 = r0
            r0 = r5
            java.nio.Buffer r0 = r0.flip()
            r0 = r5
            return r0
    }

    public org.lwjgl.CLongBuffer mallocCLong(int r6) {
            r5 = this;
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.CLONG_SIZE
            r2 = r6
            int r3 = org.lwjgl.system.MemoryStack.CLONG_SHIFT
            int r2 = r2 << r3
            long r0 = r0.nmalloc(r1, r2)
            r1 = r6
            org.lwjgl.CLongBuffer r0 = org.lwjgl.CLongBuffer.create(r0, r1)
            return r0
    }

    public org.lwjgl.CLongBuffer callocCLong(int r7) {
            r6 = this;
            r0 = r7
            int r1 = org.lwjgl.system.MemoryStack.CLONG_SIZE
            int r0 = r0 * r1
            r8 = r0
            r0 = r6
            int r1 = org.lwjgl.system.MemoryStack.CLONG_SIZE
            r2 = r8
            long r0 = r0.nmalloc(r1, r2)
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r8
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memSet(r0, r1, r2)
            r0 = r9
            r1 = r7
            org.lwjgl.CLongBuffer r0 = org.lwjgl.CLongBuffer.create(r0, r1)
            return r0
    }

    public long nclong(long r6) {
            r5 = this;
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.CLONG_SIZE
            int r2 = org.lwjgl.system.MemoryStack.CLONG_SIZE
            long r0 = r0.nmalloc(r1, r2)
            r8 = r0
            r0 = r8
            r1 = r6
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            r0 = r8
            return r0
    }

    public org.lwjgl.CLongBuffer clongs(long r6) {
            r5 = this;
            r0 = r5
            r1 = 1
            org.lwjgl.CLongBuffer r0 = r0.mallocCLong(r1)
            r1 = 0
            r2 = r6
            org.lwjgl.CLongBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.CLongBuffer clongs(long r6, long r8) {
            r5 = this;
            r0 = r5
            r1 = 2
            org.lwjgl.CLongBuffer r0 = r0.mallocCLong(r1)
            r1 = 0
            r2 = r6
            org.lwjgl.CLongBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            org.lwjgl.CLongBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.CLongBuffer clongs(long r6, long r8, long r10) {
            r5 = this;
            r0 = r5
            r1 = 3
            org.lwjgl.CLongBuffer r0 = r0.mallocCLong(r1)
            r1 = 0
            r2 = r6
            org.lwjgl.CLongBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            org.lwjgl.CLongBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r10
            org.lwjgl.CLongBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.CLongBuffer clongs(long r6, long r8, long r10, long r12) {
            r5 = this;
            r0 = r5
            r1 = 4
            org.lwjgl.CLongBuffer r0 = r0.mallocCLong(r1)
            r1 = 0
            r2 = r6
            org.lwjgl.CLongBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            org.lwjgl.CLongBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r10
            org.lwjgl.CLongBuffer r0 = r0.put(r1, r2)
            r1 = 3
            r2 = r12
            org.lwjgl.CLongBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.CLongBuffer clongs(long... r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.length
            org.lwjgl.CLongBuffer r0 = r0.mallocCLong(r1)
            r1 = r4
            org.lwjgl.CLongBuffer r0 = r0.put(r1)
            r5 = r0
            r0 = r5
            org.lwjgl.system.CustomBuffer r0 = r0.flip()
            r0 = r5
            return r0
    }

    public java.nio.FloatBuffer mallocFloat(int r7) {
            r6 = this;
            java.lang.Class<? extends java.nio.FloatBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_FLOAT
            r1 = r6
            r2 = 4
            r3 = r7
            r4 = 2
            int r3 = r3 << r4
            long r1 = r1.nmalloc(r2, r3)
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0
            return r0
    }

    public java.nio.FloatBuffer callocFloat(int r7) {
            r6 = this;
            r0 = r7
            r1 = 4
            int r0 = r0 * r1
            r8 = r0
            r0 = r6
            r1 = 4
            r2 = r8
            long r0 = r0.nmalloc(r1, r2)
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r8
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memSet(r0, r1, r2)
            java.lang.Class<? extends java.nio.FloatBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_FLOAT
            r1 = r9
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0
            return r0
    }

    public long nfloat(float r5) {
            r4 = this;
            r0 = r4
            r1 = 4
            r2 = 4
            long r0 = r0.nmalloc(r1, r2)
            r6 = r0
            r0 = r6
            r1 = r5
            org.lwjgl.system.MemoryUtil.memPutFloat(r0, r1)
            r0 = r6
            return r0
    }

    public java.nio.FloatBuffer floats(float r5) {
            r4 = this;
            r0 = r4
            r1 = 1
            java.nio.FloatBuffer r0 = r0.mallocFloat(r1)
            r1 = 0
            r2 = r5
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.FloatBuffer floats(float r5, float r6) {
            r4 = this;
            r0 = r4
            r1 = 2
            java.nio.FloatBuffer r0 = r0.mallocFloat(r1)
            r1 = 0
            r2 = r5
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.FloatBuffer floats(float r5, float r6, float r7) {
            r4 = this;
            r0 = r4
            r1 = 3
            java.nio.FloatBuffer r0 = r0.mallocFloat(r1)
            r1 = 0
            r2 = r5
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r7
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.FloatBuffer floats(float r5, float r6, float r7, float r8) {
            r4 = this;
            r0 = r4
            r1 = 4
            java.nio.FloatBuffer r0 = r0.mallocFloat(r1)
            r1 = 0
            r2 = r5
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r7
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r1 = 3
            r2 = r8
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.FloatBuffer floats(float... r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.length
            java.nio.FloatBuffer r0 = r0.mallocFloat(r1)
            r1 = r4
            java.nio.FloatBuffer r0 = r0.put(r1)
            r5 = r0
            r0 = r5
            java.nio.Buffer r0 = r0.flip()
            r0 = r5
            return r0
    }

    public java.nio.DoubleBuffer mallocDouble(int r7) {
            r6 = this;
            java.lang.Class<? extends java.nio.DoubleBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_DOUBLE
            r1 = r6
            r2 = 8
            r3 = r7
            r4 = 3
            int r3 = r3 << r4
            long r1 = r1.nmalloc(r2, r3)
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.DoubleBuffer r0 = (java.nio.DoubleBuffer) r0
            return r0
    }

    public java.nio.DoubleBuffer callocDouble(int r7) {
            r6 = this;
            r0 = r7
            r1 = 8
            int r0 = r0 * r1
            r8 = r0
            r0 = r6
            r1 = 8
            r2 = r8
            long r0 = r0.nmalloc(r1, r2)
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r8
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memSet(r0, r1, r2)
            java.lang.Class<? extends java.nio.DoubleBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_DOUBLE
            r1 = r9
            r2 = r7
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.DoubleBuffer r0 = (java.nio.DoubleBuffer) r0
            return r0
    }

    public long ndouble(double r6) {
            r5 = this;
            r0 = r5
            r1 = 8
            r2 = 8
            long r0 = r0.nmalloc(r1, r2)
            r8 = r0
            r0 = r8
            r1 = r6
            org.lwjgl.system.MemoryUtil.memPutDouble(r0, r1)
            r0 = r8
            return r0
    }

    public java.nio.DoubleBuffer doubles(double r6) {
            r5 = this;
            r0 = r5
            r1 = 1
            java.nio.DoubleBuffer r0 = r0.mallocDouble(r1)
            r1 = 0
            r2 = r6
            java.nio.DoubleBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.DoubleBuffer doubles(double r6, double r8) {
            r5 = this;
            r0 = r5
            r1 = 2
            java.nio.DoubleBuffer r0 = r0.mallocDouble(r1)
            r1 = 0
            r2 = r6
            java.nio.DoubleBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            java.nio.DoubleBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.DoubleBuffer doubles(double r6, double r8, double r10) {
            r5 = this;
            r0 = r5
            r1 = 3
            java.nio.DoubleBuffer r0 = r0.mallocDouble(r1)
            r1 = 0
            r2 = r6
            java.nio.DoubleBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            java.nio.DoubleBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r10
            java.nio.DoubleBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.DoubleBuffer doubles(double r6, double r8, double r10, double r12) {
            r5 = this;
            r0 = r5
            r1 = 4
            java.nio.DoubleBuffer r0 = r0.mallocDouble(r1)
            r1 = 0
            r2 = r6
            java.nio.DoubleBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            java.nio.DoubleBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r10
            java.nio.DoubleBuffer r0 = r0.put(r1, r2)
            r1 = 3
            r2 = r12
            java.nio.DoubleBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public java.nio.DoubleBuffer doubles(double... r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.length
            java.nio.DoubleBuffer r0 = r0.mallocDouble(r1)
            r1 = r4
            java.nio.DoubleBuffer r0 = r0.put(r1)
            r5 = r0
            r0 = r5
            java.nio.Buffer r0 = r0.flip()
            r0 = r5
            return r0
    }

    public org.lwjgl.PointerBuffer mallocPointer(int r6) {
            r5 = this;
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r2 = r6
            int r3 = org.lwjgl.system.MemoryStack.POINTER_SHIFT
            int r2 = r2 << r3
            long r0 = r0.nmalloc(r1, r2)
            r1 = r6
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.create(r0, r1)
            return r0
    }

    public org.lwjgl.PointerBuffer callocPointer(int r7) {
            r6 = this;
            r0 = r7
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            int r0 = r0 * r1
            r8 = r0
            r0 = r6
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r2 = r8
            long r0 = r0.nmalloc(r1, r2)
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r8
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memSet(r0, r1, r2)
            r0 = r9
            r1 = r7
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.create(r0, r1)
            return r0
    }

    public long npointer(long r6) {
            r5 = this;
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            long r0 = r0.nmalloc(r1, r2)
            r8 = r0
            r0 = r8
            r1 = r6
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r8
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(long r6) {
            r5 = this;
            r0 = r5
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r6
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(long r6, long r8) {
            r5 = this;
            r0 = r5
            r1 = 2
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r6
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(long r6, long r8, long r10) {
            r5 = this;
            r0 = r5
            r1 = 3
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r6
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r10
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(long r6, long r8, long r10, long r12) {
            r5 = this;
            r0 = r5
            r1 = 4
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r6
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r8
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r10
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 3
            r2 = r12
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(long... r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = r4
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r5 = r0
            r0 = r5
            org.lwjgl.system.CustomBuffer r0 = r0.flip()
            r0 = r5
            return r0
    }

    public long npointer(org.lwjgl.system.Pointer r6) {
            r5 = this;
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            long r0 = r0.nmalloc(r1, r2)
            r7 = r0
            r0 = r7
            r1 = r6
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(org.lwjgl.system.Pointer r5) {
            r4 = this;
            r0 = r4
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r5
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(org.lwjgl.system.Pointer r5, org.lwjgl.system.Pointer r6) {
            r4 = this;
            r0 = r4
            r1 = 2
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r5
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(org.lwjgl.system.Pointer r5, org.lwjgl.system.Pointer r6, org.lwjgl.system.Pointer r7) {
            r4 = this;
            r0 = r4
            r1 = 3
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r5
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r7
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(org.lwjgl.system.Pointer r5, org.lwjgl.system.Pointer r6, org.lwjgl.system.Pointer r7, org.lwjgl.system.Pointer r8) {
            r4 = this;
            r0 = r4
            r1 = 4
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r5
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r6
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r7
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 3
            r2 = r8
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(org.lwjgl.system.Pointer... r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r7 = r0
            r0 = 0
            r8 = r0
        L9:
            r0 = r8
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L1e
            r0 = r7
            r1 = r8
            r2 = r6
            r3 = r8
            r2 = r2[r3]
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            int r8 = r8 + 1
            goto L9
        L1e:
            r0 = r7
            return r0
    }

    public long npointer(java.nio.Buffer r6) {
            r5 = this;
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            int r2 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            long r0 = r0.nmalloc(r1, r2)
            r7 = r0
            r0 = r7
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(java.nio.Buffer r6) {
            r5 = this;
            r0 = r5
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(java.nio.Buffer r6, java.nio.Buffer r7) {
            r5 = this;
            r0 = r5
            r1 = 2
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(java.nio.Buffer r6, java.nio.Buffer r7, java.nio.Buffer r8) {
            r5 = this;
            r0 = r5
            r1 = 3
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(java.nio.Buffer r6, java.nio.Buffer r7, java.nio.Buffer r8, java.nio.Buffer r9) {
            r5 = this;
            r0 = r5
            r1 = 4
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r1 = 0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 1
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            r1 = 3
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            return r0
    }

    public org.lwjgl.PointerBuffer pointers(java.nio.Buffer... r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r7 = r0
            r0 = 0
            r8 = r0
        L9:
            r0 = r8
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L21
            r0 = r7
            r1 = r8
            r2 = r6
            r3 = r8
            r2 = r2[r3]
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            int r8 = r8 + 1
            goto L9
        L21:
            r0 = r7
            return r0
    }

    public org.lwjgl.PointerBuffer pointersOfElements(org.lwjgl.system.CustomBuffer<?> r10) {
            r9 = this;
            r0 = r10
            int r0 = r0.remaining()
            r11 = r0
            r0 = r10
            long r0 = r0.address()
            r12 = r0
            r0 = r10
            int r0 = r0.sizeof()
            long r0 = (long) r0
            r14 = r0
            r0 = r9
            r1 = r11
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r16 = r0
            r0 = 0
            r17 = r0
        L1b:
            r0 = r17
            r1 = r11
            if (r0 >= r1) goto L37
            r0 = r16
            r1 = r17
            r2 = r12
            r3 = r14
            r4 = r17
            long r4 = (long) r4
            long r3 = r3 * r4
            long r2 = r2 + r3
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            int r17 = r17 + 1
            goto L1b
        L37:
            r0 = r16
            return r0
    }

    public java.nio.ByteBuffer ASCII(java.lang.CharSequence r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            java.nio.ByteBuffer r0 = r0.ASCII(r1, r2)
            return r0
    }

    public java.nio.ByteBuffer ASCII(java.lang.CharSequence r6, boolean r7) {
            r5 = this;
            r0 = r6
            r1 = r7
            int r0 = org.lwjgl.system.MemoryUtil.memLengthASCII(r0, r1)
            r8 = r0
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r2 = r8
            long r0 = r0.nmalloc(r1, r2)
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            int r0 = org.lwjgl.system.MemoryUtil.encodeASCIIUnsafe(r0, r1, r2)
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r9
            r2 = r8
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public int nASCII(java.lang.CharSequence r6, boolean r7) {
            r5 = this;
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r2 = r6
            r3 = r7
            int r2 = org.lwjgl.system.MemoryUtil.memLengthASCII(r2, r3)
            long r0 = r0.nmalloc(r1, r2)
            r8 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            int r0 = org.lwjgl.system.MemoryUtil.encodeASCIIUnsafe(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public java.nio.ByteBuffer ASCIISafe(@javax.annotation.Nullable java.lang.CharSequence r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            java.nio.ByteBuffer r0 = r0.ASCIISafe(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public java.nio.ByteBuffer ASCIISafe(@javax.annotation.Nullable java.lang.CharSequence r5, boolean r6) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            r0 = r4
            r1 = r5
            r2 = r6
            java.nio.ByteBuffer r0 = r0.ASCII(r1, r2)
        Le:
            return r0
    }

    public int nASCIISafe(@javax.annotation.Nullable java.lang.CharSequence r5, boolean r6) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = r0.nASCII(r1, r2)
        Le:
            return r0
    }

    public java.nio.ByteBuffer UTF8(java.lang.CharSequence r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            java.nio.ByteBuffer r0 = r0.UTF8(r1, r2)
            return r0
    }

    public java.nio.ByteBuffer UTF8(java.lang.CharSequence r6, boolean r7) {
            r5 = this;
            r0 = r6
            r1 = r7
            int r0 = org.lwjgl.system.MemoryUtil.memLengthUTF8(r0, r1)
            r8 = r0
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r2 = r8
            long r0 = r0.nmalloc(r1, r2)
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            int r0 = org.lwjgl.system.MemoryUtil.encodeUTF8Unsafe(r0, r1, r2)
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r9
            r2 = r8
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public int nUTF8(java.lang.CharSequence r6, boolean r7) {
            r5 = this;
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r2 = r6
            r3 = r7
            int r2 = org.lwjgl.system.MemoryUtil.memLengthUTF8(r2, r3)
            long r0 = r0.nmalloc(r1, r2)
            r8 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            int r0 = org.lwjgl.system.MemoryUtil.encodeUTF8Unsafe(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public java.nio.ByteBuffer UTF8Safe(@javax.annotation.Nullable java.lang.CharSequence r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            java.nio.ByteBuffer r0 = r0.UTF8Safe(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public java.nio.ByteBuffer UTF8Safe(@javax.annotation.Nullable java.lang.CharSequence r5, boolean r6) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            r0 = r4
            r1 = r5
            r2 = r6
            java.nio.ByteBuffer r0 = r0.UTF8(r1, r2)
        Le:
            return r0
    }

    public int nUTF8Safe(@javax.annotation.Nullable java.lang.CharSequence r5, boolean r6) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = r0.nUTF8(r1, r2)
        Le:
            return r0
    }

    public java.nio.ByteBuffer UTF16(java.lang.CharSequence r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            java.nio.ByteBuffer r0 = r0.UTF16(r1, r2)
            return r0
    }

    public java.nio.ByteBuffer UTF16(java.lang.CharSequence r6, boolean r7) {
            r5 = this;
            r0 = r6
            r1 = r7
            int r0 = org.lwjgl.system.MemoryUtil.memLengthUTF16(r0, r1)
            r8 = r0
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r2 = r8
            long r0 = r0.nmalloc(r1, r2)
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            int r0 = org.lwjgl.system.MemoryUtil.encodeUTF16Unsafe(r0, r1, r2)
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r9
            r2 = r8
            java.nio.Buffer r0 = org.lwjgl.system.MemoryUtil.wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public int nUTF16(java.lang.CharSequence r6, boolean r7) {
            r5 = this;
            r0 = r5
            int r1 = org.lwjgl.system.MemoryStack.POINTER_SIZE
            r2 = r6
            r3 = r7
            int r2 = org.lwjgl.system.MemoryUtil.memLengthUTF16(r2, r3)
            long r0 = r0.nmalloc(r1, r2)
            r8 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            int r0 = org.lwjgl.system.MemoryUtil.encodeUTF16Unsafe(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public java.nio.ByteBuffer UTF16Safe(@javax.annotation.Nullable java.lang.CharSequence r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            java.nio.ByteBuffer r0 = r0.UTF16Safe(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public java.nio.ByteBuffer UTF16Safe(@javax.annotation.Nullable java.lang.CharSequence r5, boolean r6) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            r0 = r4
            r1 = r5
            r2 = r6
            java.nio.ByteBuffer r0 = r0.UTF16(r1, r2)
        Le:
            return r0
    }

    public int nUTF16Safe(@javax.annotation.Nullable java.lang.CharSequence r5, boolean r6) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = r0.nUTF16(r1, r2)
        Le:
            return r0
    }

    public static org.lwjgl.system.MemoryStack stackGet() {
            java.lang.ThreadLocal<org.lwjgl.system.MemoryStack> r0 = org.lwjgl.system.MemoryStack.TLS
            java.lang.Object r0 = r0.get()
            org.lwjgl.system.MemoryStack r0 = (org.lwjgl.system.MemoryStack) r0
            return r0
    }

    public static org.lwjgl.system.MemoryStack stackPush() {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            org.lwjgl.system.MemoryStack r0 = r0.push()
            return r0
    }

    public static org.lwjgl.system.MemoryStack stackPop() {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            org.lwjgl.system.MemoryStack r0 = r0.pop()
            return r0
    }

    public static long nstackMalloc(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            long r0 = r0.nmalloc(r1)
            return r0
    }

    public static long nstackMalloc(int r4, int r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            long r0 = r0.nmalloc(r1, r2)
            return r0
    }

    public static long nstackCalloc(int r5, int r6, int r7) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r5
            r2 = r6
            r3 = r7
            long r0 = r0.ncalloc(r1, r2, r3)
            return r0
    }

    public static java.nio.ByteBuffer stackMalloc(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ByteBuffer r0 = r0.malloc(r1)
            return r0
    }

    public static java.nio.ByteBuffer stackCalloc(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ByteBuffer r0 = r0.calloc(r1)
            return r0
    }

    public static java.nio.ByteBuffer stackBytes(byte r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ByteBuffer r0 = r0.bytes(r1)
            return r0
    }

    public static java.nio.ByteBuffer stackBytes(byte r4, byte r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            java.nio.ByteBuffer r0 = r0.bytes(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer stackBytes(byte r5, byte r6, byte r7) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r5
            r2 = r6
            r3 = r7
            java.nio.ByteBuffer r0 = r0.bytes(r1, r2, r3)
            return r0
    }

    public static java.nio.ByteBuffer stackBytes(byte r6, byte r7, byte r8, byte r9) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            java.nio.ByteBuffer r0 = r0.bytes(r1, r2, r3, r4)
            return r0
    }

    public static java.nio.ByteBuffer stackBytes(byte... r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ByteBuffer r0 = r0.bytes(r1)
            return r0
    }

    public static java.nio.ShortBuffer stackMallocShort(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ShortBuffer r0 = r0.mallocShort(r1)
            return r0
    }

    public static java.nio.ShortBuffer stackCallocShort(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ShortBuffer r0 = r0.callocShort(r1)
            return r0
    }

    public static java.nio.ShortBuffer stackShorts(short r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ShortBuffer r0 = r0.shorts(r1)
            return r0
    }

    public static java.nio.ShortBuffer stackShorts(short r4, short r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            java.nio.ShortBuffer r0 = r0.shorts(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer stackShorts(short r5, short r6, short r7) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r5
            r2 = r6
            r3 = r7
            java.nio.ShortBuffer r0 = r0.shorts(r1, r2, r3)
            return r0
    }

    public static java.nio.ShortBuffer stackShorts(short r6, short r7, short r8, short r9) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            java.nio.ShortBuffer r0 = r0.shorts(r1, r2, r3, r4)
            return r0
    }

    public static java.nio.ShortBuffer stackShorts(short... r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ShortBuffer r0 = r0.shorts(r1)
            return r0
    }

    public static java.nio.IntBuffer stackMallocInt(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.IntBuffer r0 = r0.mallocInt(r1)
            return r0
    }

    public static java.nio.IntBuffer stackCallocInt(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            return r0
    }

    public static java.nio.IntBuffer stackInts(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.IntBuffer r0 = r0.ints(r1)
            return r0
    }

    public static java.nio.IntBuffer stackInts(int r4, int r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            java.nio.IntBuffer r0 = r0.ints(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer stackInts(int r5, int r6, int r7) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r5
            r2 = r6
            r3 = r7
            java.nio.IntBuffer r0 = r0.ints(r1, r2, r3)
            return r0
    }

    public static java.nio.IntBuffer stackInts(int r6, int r7, int r8, int r9) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            java.nio.IntBuffer r0 = r0.ints(r1, r2, r3, r4)
            return r0
    }

    public static java.nio.IntBuffer stackInts(int... r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.IntBuffer r0 = r0.ints(r1)
            return r0
    }

    public static java.nio.LongBuffer stackMallocLong(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.LongBuffer r0 = r0.mallocLong(r1)
            return r0
    }

    public static java.nio.LongBuffer stackCallocLong(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.LongBuffer r0 = r0.callocLong(r1)
            return r0
    }

    public static java.nio.LongBuffer stackLongs(long r4) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            java.nio.LongBuffer r0 = r0.longs(r1)
            return r0
    }

    public static java.nio.LongBuffer stackLongs(long r6, long r8) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r6
            r2 = r8
            java.nio.LongBuffer r0 = r0.longs(r1, r2)
            return r0
    }

    public static java.nio.LongBuffer stackLongs(long r8, long r10, long r12) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r8
            r2 = r10
            r3 = r12
            java.nio.LongBuffer r0 = r0.longs(r1, r2, r3)
            return r0
    }

    public static java.nio.LongBuffer stackLongs(long r10, long r12, long r14, long r16) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r10
            r2 = r12
            r3 = r14
            r4 = r16
            java.nio.LongBuffer r0 = r0.longs(r1, r2, r3, r4)
            return r0
    }

    public static java.nio.LongBuffer stackLongs(long... r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.LongBuffer r0 = r0.longs(r1)
            return r0
    }

    public static org.lwjgl.CLongBuffer stackMallocCLong(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            org.lwjgl.CLongBuffer r0 = r0.mallocCLong(r1)
            return r0
    }

    public static org.lwjgl.CLongBuffer stackCallocCLong(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            org.lwjgl.CLongBuffer r0 = r0.callocCLong(r1)
            return r0
    }

    public static org.lwjgl.CLongBuffer stackCLongs(long r4) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            org.lwjgl.CLongBuffer r0 = r0.clongs(r1)
            return r0
    }

    public static org.lwjgl.CLongBuffer stackCLongs(long r6, long r8) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r6
            r2 = r8
            org.lwjgl.CLongBuffer r0 = r0.clongs(r1, r2)
            return r0
    }

    public static org.lwjgl.CLongBuffer stackCLongs(long r8, long r10, long r12) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r8
            r2 = r10
            r3 = r12
            org.lwjgl.CLongBuffer r0 = r0.clongs(r1, r2, r3)
            return r0
    }

    public static org.lwjgl.CLongBuffer stackCLongs(long r10, long r12, long r14, long r16) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r10
            r2 = r12
            r3 = r14
            r4 = r16
            org.lwjgl.CLongBuffer r0 = r0.clongs(r1, r2, r3, r4)
            return r0
    }

    public static org.lwjgl.CLongBuffer stackCLongs(long... r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            org.lwjgl.CLongBuffer r0 = r0.clongs(r1)
            return r0
    }

    public static java.nio.FloatBuffer stackMallocFloat(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.FloatBuffer r0 = r0.mallocFloat(r1)
            return r0
    }

    public static java.nio.FloatBuffer stackCallocFloat(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)
            return r0
    }

    public static java.nio.FloatBuffer stackFloats(float r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.FloatBuffer r0 = r0.floats(r1)
            return r0
    }

    public static java.nio.FloatBuffer stackFloats(float r4, float r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            java.nio.FloatBuffer r0 = r0.floats(r1, r2)
            return r0
    }

    public static java.nio.FloatBuffer stackFloats(float r5, float r6, float r7) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r5
            r2 = r6
            r3 = r7
            java.nio.FloatBuffer r0 = r0.floats(r1, r2, r3)
            return r0
    }

    public static java.nio.FloatBuffer stackFloats(float r6, float r7, float r8, float r9) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            java.nio.FloatBuffer r0 = r0.floats(r1, r2, r3, r4)
            return r0
    }

    public static java.nio.FloatBuffer stackFloats(float... r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.FloatBuffer r0 = r0.floats(r1)
            return r0
    }

    public static java.nio.DoubleBuffer stackMallocDouble(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.DoubleBuffer r0 = r0.mallocDouble(r1)
            return r0
    }

    public static java.nio.DoubleBuffer stackCallocDouble(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.DoubleBuffer r0 = r0.callocDouble(r1)
            return r0
    }

    public static java.nio.DoubleBuffer stackDoubles(double r4) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            java.nio.DoubleBuffer r0 = r0.doubles(r1)
            return r0
    }

    public static java.nio.DoubleBuffer stackDoubles(double r6, double r8) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r6
            r2 = r8
            java.nio.DoubleBuffer r0 = r0.doubles(r1, r2)
            return r0
    }

    public static java.nio.DoubleBuffer stackDoubles(double r8, double r10, double r12) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r8
            r2 = r10
            r3 = r12
            java.nio.DoubleBuffer r0 = r0.doubles(r1, r2, r3)
            return r0
    }

    public static java.nio.DoubleBuffer stackDoubles(double r10, double r12, double r14, double r16) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r10
            r2 = r12
            r3 = r14
            r4 = r16
            java.nio.DoubleBuffer r0 = r0.doubles(r1, r2, r3, r4)
            return r0
    }

    public static java.nio.DoubleBuffer stackDoubles(double... r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.DoubleBuffer r0 = r0.doubles(r1)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackMallocPointer(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackCallocPointer(int r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            org.lwjgl.PointerBuffer r0 = r0.callocPointer(r1)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackPointers(long r4) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackPointers(long r6, long r8) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r6
            r2 = r8
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1, r2)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackPointers(long r8, long r10, long r12) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r8
            r2 = r10
            r3 = r12
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1, r2, r3)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackPointers(long r10, long r12, long r14, long r16) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r10
            r2 = r12
            r3 = r14
            r4 = r16
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1, r2, r3, r4)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackPointers(long... r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackPointers(org.lwjgl.system.Pointer r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackPointers(org.lwjgl.system.Pointer r4, org.lwjgl.system.Pointer r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1, r2)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackPointers(org.lwjgl.system.Pointer r5, org.lwjgl.system.Pointer r6, org.lwjgl.system.Pointer r7) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r5
            r2 = r6
            r3 = r7
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1, r2, r3)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackPointers(org.lwjgl.system.Pointer r6, org.lwjgl.system.Pointer r7, org.lwjgl.system.Pointer r8, org.lwjgl.system.Pointer r9) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1, r2, r3, r4)
            return r0
    }

    public static org.lwjgl.PointerBuffer stackPointers(org.lwjgl.system.Pointer... r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            org.lwjgl.PointerBuffer r0 = r0.pointers(r1)
            return r0
    }

    public static java.nio.ByteBuffer stackASCII(java.lang.CharSequence r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ByteBuffer r0 = r0.ASCII(r1)
            return r0
    }

    public static java.nio.ByteBuffer stackASCII(java.lang.CharSequence r4, boolean r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            java.nio.ByteBuffer r0 = r0.ASCII(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer stackUTF8(java.lang.CharSequence r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ByteBuffer r0 = r0.UTF8(r1)
            return r0
    }

    public static java.nio.ByteBuffer stackUTF8(java.lang.CharSequence r4, boolean r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            java.nio.ByteBuffer r0 = r0.UTF8(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer stackUTF16(java.lang.CharSequence r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ByteBuffer r0 = r0.UTF16(r1)
            return r0
    }

    public static java.nio.ByteBuffer stackUTF16(java.lang.CharSequence r4, boolean r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            java.nio.ByteBuffer r0 = r0.UTF16(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer stackASCIISafe(@javax.annotation.Nullable java.lang.CharSequence r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ByteBuffer r0 = r0.ASCIISafe(r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer stackASCIISafe(@javax.annotation.Nullable java.lang.CharSequence r4, boolean r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            java.nio.ByteBuffer r0 = r0.ASCIISafe(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer stackUTF8Safe(@javax.annotation.Nullable java.lang.CharSequence r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ByteBuffer r0 = r0.UTF8Safe(r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer stackUTF8Safe(@javax.annotation.Nullable java.lang.CharSequence r4, boolean r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            java.nio.ByteBuffer r0 = r0.UTF8Safe(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer stackUTF16Safe(@javax.annotation.Nullable java.lang.CharSequence r3) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r3
            java.nio.ByteBuffer r0 = r0.UTF16Safe(r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer stackUTF16Safe(@javax.annotation.Nullable java.lang.CharSequence r4, boolean r5) {
            org.lwjgl.system.MemoryStack r0 = stackGet()
            r1 = r4
            r2 = r5
            java.nio.ByteBuffer r0 = r0.UTF16Safe(r1, r2)
            return r0
    }

    static {
            org.lwjgl.system.Configuration<java.lang.Integer> r0 = org.lwjgl.system.Configuration.STACK_SIZE
            r1 = 64
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = r0 * r1
            org.lwjgl.system.MemoryStack.DEFAULT_STACK_SIZE = r0
            void r0 = org.lwjgl.system.MemoryStack::create
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            org.lwjgl.system.MemoryStack.TLS = r0
            int r0 = org.lwjgl.system.MemoryStack.DEFAULT_STACK_SIZE
            if (r0 >= 0) goto L33
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Invalid stack size."
            r1.<init>(r2)
            throw r0
        L33:
            return
    }
}
