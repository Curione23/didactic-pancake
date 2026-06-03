package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWGamepadState.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWGamepadState.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWGamepadState.class */
@org.lwjgl.system.NativeType("struct GLFWgamepadstate")
public class GLFWGamepadState extends org.lwjgl.system.Struct<org.lwjgl.glfw.GLFWGamepadState> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BUTTONS = 0;
    public static final int AXES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWGamepadState$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWGamepadState$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWGamepadState$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.glfw.GLFWGamepadState, org.lwjgl.glfw.GLFWGamepadState.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.glfw.GLFWGamepadState ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
                int r2 = r2 / r3
                r0.<init>(r1, r2)
                return
        }

        public Buffer(long r10, int r12) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = 0
                r3 = -1
                r4 = 0
                r5 = r12
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        Buffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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

        @Override // org.lwjgl.system.CustomBuffer
        protected org.lwjgl.glfw.GLFWGamepadState.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.glfw.GLFWGamepadState getElementFactory() {
                r2 = this;
                org.lwjgl.glfw.GLFWGamepadState r0 = org.lwjgl.glfw.GLFWGamepadState.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned char[15]")
        public java.nio.ByteBuffer buttons() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.glfw.GLFWGamepadState.nbuttons(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned char")
        public byte buttons(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.glfw.GLFWGamepadState.nbuttons(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("float[6]")
        public java.nio.FloatBuffer axes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.glfw.GLFWGamepadState.naxes(r0)
                return r0
        }

        public float axes(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.glfw.GLFWGamepadState.naxes(r0, r1)
                return r0
        }

        public org.lwjgl.glfw.GLFWGamepadState.Buffer buttons(@org.lwjgl.system.NativeType("unsigned char[15]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.glfw.GLFWGamepadState.nbuttons(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.glfw.GLFWGamepadState.Buffer buttons(int r6, @org.lwjgl.system.NativeType("unsigned char") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.glfw.GLFWGamepadState.nbuttons(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.glfw.GLFWGamepadState.Buffer axes(@org.lwjgl.system.NativeType("float[6]") java.nio.FloatBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.glfw.GLFWGamepadState.naxes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.glfw.GLFWGamepadState.Buffer axes(int r6, float r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.glfw.GLFWGamepadState.naxes(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.glfw.GLFWGamepadState r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.glfw.GLFWGamepadState r0 = org.lwjgl.glfw.GLFWGamepadState.create(r0)
                org.lwjgl.glfw.GLFWGamepadState.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected GLFWGamepadState(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.glfw.GLFWGamepadState create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.glfw.GLFWGamepadState r0 = new org.lwjgl.glfw.GLFWGamepadState
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public GLFWGamepadState(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned char[15]")
    public java.nio.ByteBuffer buttons() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nbuttons(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned char")
    public byte buttons(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nbuttons(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("float[6]")
    public java.nio.FloatBuffer axes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.FloatBuffer r0 = naxes(r0)
            return r0
    }

    public float axes(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = naxes(r0, r1)
            return r0
    }

    public org.lwjgl.glfw.GLFWGamepadState buttons(@org.lwjgl.system.NativeType("unsigned char[15]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbuttons(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.glfw.GLFWGamepadState buttons(int r6, @org.lwjgl.system.NativeType("unsigned char") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nbuttons(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.glfw.GLFWGamepadState axes(@org.lwjgl.system.NativeType("float[6]") java.nio.FloatBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naxes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.glfw.GLFWGamepadState axes(int r6, float r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            naxes(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.glfw.GLFWGamepadState set(java.nio.ByteBuffer r4, java.nio.FloatBuffer r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.glfw.GLFWGamepadState r0 = r0.buttons(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.glfw.GLFWGamepadState r0 = r0.axes(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.glfw.GLFWGamepadState set(org.lwjgl.glfw.GLFWGamepadState r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.glfw.GLFWGamepadState malloc() {
            org.lwjgl.glfw.GLFWGamepadState r0 = new org.lwjgl.glfw.GLFWGamepadState
            r1 = r0
            int r2 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWGamepadState calloc() {
            org.lwjgl.glfw.GLFWGamepadState r0 = new org.lwjgl.glfw.GLFWGamepadState
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWGamepadState create() {
            int r0 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.glfw.GLFWGamepadState r0 = new org.lwjgl.glfw.GLFWGamepadState
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWGamepadState create(long r6) {
            org.lwjgl.glfw.GLFWGamepadState r0 = new org.lwjgl.glfw.GLFWGamepadState
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.glfw.GLFWGamepadState createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.glfw.GLFWGamepadState r0 = new org.lwjgl.glfw.GLFWGamepadState
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.glfw.GLFWGamepadState.Buffer malloc(int r6) {
            org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = new org.lwjgl.glfw.GLFWGamepadState$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWGamepadState.Buffer calloc(int r7) {
            org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = new org.lwjgl.glfw.GLFWGamepadState$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWGamepadState.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = new org.lwjgl.glfw.GLFWGamepadState$Buffer
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

    public static org.lwjgl.glfw.GLFWGamepadState.Buffer create(long r6, int r8) {
            org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = new org.lwjgl.glfw.GLFWGamepadState$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.glfw.GLFWGamepadState.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = new org.lwjgl.glfw.GLFWGamepadState$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWGamepadState mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.glfw.GLFWGamepadState r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWGamepadState callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.glfw.GLFWGamepadState r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWGamepadState mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.glfw.GLFWGamepadState r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWGamepadState callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.glfw.GLFWGamepadState r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWGamepadState.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWGamepadState.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWGamepadState.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWGamepadState.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.glfw.GLFWGamepadState malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.glfw.GLFWGamepadState r0 = new org.lwjgl.glfw.GLFWGamepadState
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.glfw.GLFWGamepadState.ALIGNOF
            int r4 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWGamepadState calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.glfw.GLFWGamepadState r0 = new org.lwjgl.glfw.GLFWGamepadState
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.glfw.GLFWGamepadState.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWGamepadState.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = new org.lwjgl.glfw.GLFWGamepadState$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.glfw.GLFWGamepadState.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWGamepadState.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.glfw.GLFWGamepadState$Buffer r0 = new org.lwjgl.glfw.GLFWGamepadState$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.glfw.GLFWGamepadState.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.glfw.GLFWGamepadState.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.ByteBuffer nbuttons(long r5) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWGamepadState.BUTTONS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 15
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nbuttons(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.glfw.GLFWGamepadState.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.glfw.GLFWGamepadState.BUTTONS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 15
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.FloatBuffer naxes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWGamepadState.AXES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 6
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float naxes(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.glfw.GLFWGamepadState.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.glfw.GLFWGamepadState.AXES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 6
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static void nbuttons(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 15
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.glfw.GLFWGamepadState.BUTTONS
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nbuttons(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.glfw.GLFWGamepadState.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.glfw.GLFWGamepadState.BUTTONS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 15
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void naxes(long r7, java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 6
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.glfw.GLFWGamepadState.AXES
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void naxes(long r9, int r11, float r12) {
            sun.misc.Unsafe r0 = org.lwjgl.glfw.GLFWGamepadState.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.glfw.GLFWGamepadState.AXES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 6
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putFloat(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.glfw.GLFWGamepadState r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            r4 = 15
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            r4 = 6
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.glfw.GLFWGamepadState.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.glfw.GLFWGamepadState.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.glfw.GLFWGamepadState.BUTTONS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.glfw.GLFWGamepadState.AXES = r0
            return
    }
}
