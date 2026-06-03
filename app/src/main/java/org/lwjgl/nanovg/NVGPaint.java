package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGPaint.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGPaint.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGPaint.class */
@org.lwjgl.system.NativeType("struct NVGpaint")
public class NVGPaint extends org.lwjgl.system.Struct<org.lwjgl.nanovg.NVGPaint> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int XFORM = 0;
    public static final int EXTENT = 0;
    public static final int RADIUS = 0;
    public static final int FEATHER = 0;
    public static final int INNERCOLOR = 0;
    public static final int OUTERCOLOR = 0;
    public static final int IMAGE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGPaint$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGPaint$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGPaint$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.NVGPaint, org.lwjgl.nanovg.NVGPaint.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.nanovg.NVGPaint ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.NVGPaint.SIZEOF
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
        protected org.lwjgl.nanovg.NVGPaint.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.NVGPaint getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.NVGPaint r0 = org.lwjgl.nanovg.NVGPaint.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("float[6]")
        public java.nio.FloatBuffer xform() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.nanovg.NVGPaint.nxform(r0)
                return r0
        }

        public float xform(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.nanovg.NVGPaint.nxform(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("float[2]")
        public java.nio.FloatBuffer extent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.nanovg.NVGPaint.nextent(r0)
                return r0
        }

        public float extent(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.nanovg.NVGPaint.nextent(r0, r1)
                return r0
        }

        public float radius() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NVGPaint.nradius(r0)
                return r0
        }

        public float feather() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NVGPaint.nfeather(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor innerColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGPaint.ninnerColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor outerColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGPaint.nouterColor(r0)
                return r0
        }

        public int image() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.nanovg.NVGPaint.nimage(r0)
                return r0
        }

        public org.lwjgl.nanovg.NVGPaint.Buffer xform(@org.lwjgl.system.NativeType("float[6]") java.nio.FloatBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGPaint.nxform(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.NVGPaint.Buffer xform(int r6, float r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.nanovg.NVGPaint.nxform(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.nanovg.NVGPaint.Buffer extent(@org.lwjgl.system.NativeType("float[2]") java.nio.FloatBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGPaint.nextent(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.NVGPaint.Buffer extent(int r6, float r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.nanovg.NVGPaint.nextent(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.nanovg.NVGPaint.Buffer radius(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGPaint.nradius(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.NVGPaint.Buffer feather(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGPaint.nfeather(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.NVGPaint.Buffer innerColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGPaint.ninnerColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.NVGPaint.Buffer innerColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.innerColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.NVGPaint.Buffer outerColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGPaint.nouterColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.NVGPaint.Buffer outerColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.outerColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.NVGPaint.Buffer image(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NVGPaint.nimage(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NVGPaint r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NVGPaint$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.NVGPaint r0 = org.lwjgl.nanovg.NVGPaint.create(r0)
                org.lwjgl.nanovg.NVGPaint.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected NVGPaint(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.NVGPaint create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.NVGPaint r0 = new org.lwjgl.nanovg.NVGPaint
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public NVGPaint(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("float[6]")
    public java.nio.FloatBuffer xform() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.FloatBuffer r0 = nxform(r0)
            return r0
    }

    public float xform(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = nxform(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("float[2]")
    public java.nio.FloatBuffer extent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.FloatBuffer r0 = nextent(r0)
            return r0
    }

    public float extent(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = nextent(r0, r1)
            return r0
    }

    public float radius() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nradius(r0)
            return r0
    }

    public float feather() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nfeather(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor innerColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = ninnerColor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor outerColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = nouterColor(r0)
            return r0
    }

    public int image() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimage(r0)
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint xform(@org.lwjgl.system.NativeType("float[6]") java.nio.FloatBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nxform(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint xform(int r6, float r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nxform(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint extent(@org.lwjgl.system.NativeType("float[2]") java.nio.FloatBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nextent(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint extent(int r6, float r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nextent(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint radius(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nradius(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint feather(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfeather(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint innerColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninnerColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint innerColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.innerColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint outerColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nouterColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint outerColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.outerColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint image(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint set(java.nio.FloatBuffer r4, java.nio.FloatBuffer r5, float r6, float r7, org.lwjgl.nanovg.NVGColor r8, org.lwjgl.nanovg.NVGColor r9, int r10) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.NVGPaint r0 = r0.xform(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.nanovg.NVGPaint r0 = r0.extent(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.nanovg.NVGPaint r0 = r0.radius(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.nanovg.NVGPaint r0 = r0.feather(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.nanovg.NVGPaint r0 = r0.innerColor(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.nanovg.NVGPaint r0 = r0.outerColor(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.nanovg.NVGPaint r0 = r0.image(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.NVGPaint set(org.lwjgl.nanovg.NVGPaint r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.nanovg.NVGPaint malloc() {
            org.lwjgl.nanovg.NVGPaint r0 = new org.lwjgl.nanovg.NVGPaint
            r1 = r0
            int r2 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGPaint calloc() {
            org.lwjgl.nanovg.NVGPaint r0 = new org.lwjgl.nanovg.NVGPaint
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGPaint create() {
            int r0 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.nanovg.NVGPaint r0 = new org.lwjgl.nanovg.NVGPaint
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGPaint create(long r6) {
            org.lwjgl.nanovg.NVGPaint r0 = new org.lwjgl.nanovg.NVGPaint
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NVGPaint createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NVGPaint r0 = new org.lwjgl.nanovg.NVGPaint
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.NVGPaint.Buffer malloc(int r6) {
            org.lwjgl.nanovg.NVGPaint$Buffer r0 = new org.lwjgl.nanovg.NVGPaint$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGPaint.Buffer calloc(int r7) {
            org.lwjgl.nanovg.NVGPaint$Buffer r0 = new org.lwjgl.nanovg.NVGPaint$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGPaint.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.nanovg.NVGPaint$Buffer r0 = new org.lwjgl.nanovg.NVGPaint$Buffer
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

    public static org.lwjgl.nanovg.NVGPaint.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.NVGPaint$Buffer r0 = new org.lwjgl.nanovg.NVGPaint$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NVGPaint.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NVGPaint$Buffer r0 = new org.lwjgl.nanovg.NVGPaint$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGPaint mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.NVGPaint r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGPaint callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.NVGPaint r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGPaint mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.NVGPaint r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGPaint callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.NVGPaint r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGPaint.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.NVGPaint$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGPaint.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.NVGPaint$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGPaint.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.NVGPaint$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.NVGPaint.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.NVGPaint$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.nanovg.NVGPaint malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.nanovg.NVGPaint r0 = new org.lwjgl.nanovg.NVGPaint
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.NVGPaint.ALIGNOF
            int r4 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGPaint calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.nanovg.NVGPaint r0 = new org.lwjgl.nanovg.NVGPaint
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGPaint.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGPaint.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.NVGPaint$Buffer r0 = new org.lwjgl.nanovg.NVGPaint$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.NVGPaint.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGPaint.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.NVGPaint$Buffer r0 = new org.lwjgl.nanovg.NVGPaint$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.NVGPaint.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.NVGPaint.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.FloatBuffer nxform(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NVGPaint.XFORM
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 6
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float nxform(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGPaint.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.NVGPaint.XFORM
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

    public static java.nio.FloatBuffer nextent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NVGPaint.EXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float nextent(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGPaint.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.NVGPaint.EXTENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nradius(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGPaint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGPaint.RADIUS
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nfeather(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGPaint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGPaint.FEATHER
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor ninnerColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NVGPaint.INNERCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor nouterColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NVGPaint.OUTERCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static int nimage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGPaint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGPaint.IMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nxform(long r7, java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 6
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.nanovg.NVGPaint.XFORM
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nxform(long r9, int r11, float r12) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGPaint.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.NVGPaint.XFORM
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

    public static void nextent(long r7, java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.nanovg.NVGPaint.EXTENT
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nextent(long r9, int r11, float r12) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGPaint.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.NVGPaint.EXTENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nradius(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGPaint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGPaint.RADIUS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nfeather(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGPaint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGPaint.FEATHER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void ninnerColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.NVGPaint.INNERCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nouterColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.NVGPaint.OUTERCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nimage(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGPaint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGPaint.IMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.nanovg.NVGPaint r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            r4 = 6
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            int r4 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            int r4 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.nanovg.NVGPaint.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.NVGPaint.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGPaint.XFORM = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGPaint.EXTENT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGPaint.RADIUS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGPaint.FEATHER = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGPaint.INNERCOLOR = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGPaint.OUTERCOLOR = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGPaint.IMAGE = r0
            return
    }
}
