package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGColor.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGColor.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGColor.class */
@org.lwjgl.system.NativeType("struct NVGcolor")
public class NVGColor extends org.lwjgl.system.Struct<org.lwjgl.nanovg.NVGColor> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int RGBA = 0;
    public static final int R = 0;
    public static final int G = 0;
    public static final int B = 0;
    public static final int A = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGColor$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGColor$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGColor$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.NVGColor, org.lwjgl.nanovg.NVGColor.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.nanovg.NVGColor ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
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
        protected org.lwjgl.nanovg.NVGColor.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.NVGColor getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("float[4]")
        public java.nio.FloatBuffer rgba() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.nanovg.NVGColor.nrgba(r0)
                return r0
        }

        public float rgba(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.nanovg.NVGColor.nrgba(r0, r1)
                return r0
        }

        public float r() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NVGColor.nr(r0)
                return r0
        }

        public float g() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NVGColor.ng(r0)
                return r0
        }

        public float b() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NVGColor.nb(r0)
                return r0
        }

        public float a() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NVGColor.na(r0)
                return r0
        }

        public org.lwjgl.nanovg.NVGColor.Buffer rgba(@org.lwjgl.system.NativeType("float[4]") java.nio.FloatBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGColor.nrgba(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.NVGColor.Buffer rgba(int r6, float r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.nanovg.NVGColor.nrgba(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.nanovg.NVGColor.Buffer r(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGColor.nr(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.NVGColor.Buffer g(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGColor.ng(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.NVGColor.Buffer b(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGColor.nb(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.NVGColor.Buffer a(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGColor.na(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NVGColor r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NVGColor$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
                org.lwjgl.nanovg.NVGColor.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected NVGColor(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.NVGColor create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.NVGColor r0 = new org.lwjgl.nanovg.NVGColor
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public NVGColor(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.NVGColor.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("float[4]")
    public java.nio.FloatBuffer rgba() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.FloatBuffer r0 = nrgba(r0)
            return r0
    }

    public float rgba(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = nrgba(r0, r1)
            return r0
    }

    public float r() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nr(r0)
            return r0
    }

    public float g() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = ng(r0)
            return r0
    }

    public float b() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nb(r0)
            return r0
    }

    public float a() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = na(r0)
            return r0
    }

    public org.lwjgl.nanovg.NVGColor rgba(@org.lwjgl.system.NativeType("float[4]") java.nio.FloatBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrgba(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGColor rgba(int r6, float r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nrgba(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.nanovg.NVGColor r(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nr(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGColor g(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ng(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGColor b(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nb(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGColor a(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            na(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGColor set(org.lwjgl.nanovg.NVGColor r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor malloc() {
            org.lwjgl.nanovg.NVGColor r0 = new org.lwjgl.nanovg.NVGColor
            r1 = r0
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor calloc() {
            org.lwjgl.nanovg.NVGColor r0 = new org.lwjgl.nanovg.NVGColor
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor create() {
            int r0 = org.lwjgl.nanovg.NVGColor.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.nanovg.NVGColor r0 = new org.lwjgl.nanovg.NVGColor
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor create(long r6) {
            org.lwjgl.nanovg.NVGColor r0 = new org.lwjgl.nanovg.NVGColor
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NVGColor createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NVGColor r0 = new org.lwjgl.nanovg.NVGColor
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor.Buffer malloc(int r6) {
            org.lwjgl.nanovg.NVGColor$Buffer r0 = new org.lwjgl.nanovg.NVGColor$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor.Buffer calloc(int r7) {
            org.lwjgl.nanovg.NVGColor$Buffer r0 = new org.lwjgl.nanovg.NVGColor$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.nanovg.NVGColor.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.nanovg.NVGColor$Buffer r0 = new org.lwjgl.nanovg.NVGColor$Buffer
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

    public static org.lwjgl.nanovg.NVGColor.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.NVGColor$Buffer r0 = new org.lwjgl.nanovg.NVGColor$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NVGColor.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NVGColor$Buffer r0 = new org.lwjgl.nanovg.NVGColor$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGColor mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.NVGColor r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGColor callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.NVGColor r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGColor mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.NVGColor r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGColor callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.NVGColor r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGColor.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.NVGColor$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGColor.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.NVGColor$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGColor.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.NVGColor$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGColor.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.NVGColor$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.nanovg.NVGColor r0 = new org.lwjgl.nanovg.NVGColor
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            int r4 = org.lwjgl.nanovg.NVGColor.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.nanovg.NVGColor r0 = new org.lwjgl.nanovg.NVGColor
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.nanovg.NVGColor.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.NVGColor$Buffer r0 = new org.lwjgl.nanovg.NVGColor$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.NVGColor.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.NVGColor$Buffer r0 = new org.lwjgl.nanovg.NVGColor$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.NVGColor.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.FloatBuffer nrgba(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NVGColor.RGBA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float nrgba(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGColor.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.NVGColor.RGBA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nr(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGColor.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGColor.R
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float ng(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGColor.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGColor.G
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nb(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGColor.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGColor.B
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float na(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGColor.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGColor.A
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static void nrgba(long r7, java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.nanovg.NVGColor.RGBA
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nrgba(long r9, int r11, float r12) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGColor.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.NVGColor.RGBA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nr(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGColor.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGColor.R
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void ng(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGColor.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGColor.G
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nb(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGColor.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGColor.B
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void na(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGColor.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGColor.A
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.nanovg.NVGColor r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 1
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 4
            r7 = 4
            org.lwjgl.system.Struct$Member r6 = __array(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 4
            org.lwjgl.system.Struct$Member[] r6 = new org.lwjgl.system.Struct.Member[r6]
            r7 = r6
            r8 = 0
            r9 = 4
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 1
            r9 = 4
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 2
            r9 = 4
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 3
            r9 = 4
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            org.lwjgl.system.Struct$Layout r6 = __struct(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r11 = r0
            r0 = r11
            int r0 = r0.getSize()
            org.lwjgl.nanovg.NVGColor.SIZEOF = r0
            r0 = r11
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.NVGColor.ALIGNOF = r0
            r0 = r11
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGColor.RGBA = r0
            r0 = r11
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGColor.R = r0
            r0 = r11
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGColor.G = r0
            r0 = r11
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGColor.B = r0
            r0 = r11
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGColor.A = r0
            return
    }
}
