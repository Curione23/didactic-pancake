package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGImage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGImage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGImage.class */
@org.lwjgl.system.NativeType("struct NSVGimage")
public class NSVGImage extends org.lwjgl.system.Struct<org.lwjgl.nanovg.NSVGImage> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public static final int SHAPES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGImage$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGImage$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGImage$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.NSVGImage, org.lwjgl.nanovg.NSVGImage.Buffer> {
        private static final org.lwjgl.nanovg.NSVGImage ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.NSVGImage.SIZEOF
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
        protected org.lwjgl.nanovg.NSVGImage.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.NSVGImage getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.NSVGImage r0 = org.lwjgl.nanovg.NSVGImage.Buffer.ELEMENT_FACTORY
                return r0
        }

        public float width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NSVGImage.nwidth(r0)
                return r0
        }

        public float height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NSVGImage.nheight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NSVGshape *")
        public org.lwjgl.nanovg.NSVGShape shapes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NSVGShape r0 = org.lwjgl.nanovg.NSVGImage.nshapes(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NSVGImage r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NSVGImage$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.NSVGImage r0 = org.lwjgl.nanovg.NSVGImage.create(r0)
                org.lwjgl.nanovg.NSVGImage.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected NSVGImage(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.NSVGImage create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.NSVGImage r0 = new org.lwjgl.nanovg.NSVGImage
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public NSVGImage(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGImage.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.NSVGImage.SIZEOF
            return r0
    }

    public float width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nwidth(r0)
            return r0
    }

    public float height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nheight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NSVGshape *")
    public org.lwjgl.nanovg.NSVGShape shapes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NSVGShape r0 = nshapes(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGImage create(long r6) {
            org.lwjgl.nanovg.NSVGImage r0 = new org.lwjgl.nanovg.NSVGImage
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NSVGImage createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NSVGImage r0 = new org.lwjgl.nanovg.NSVGImage
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.NSVGImage.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.NSVGImage$Buffer r0 = new org.lwjgl.nanovg.NSVGImage$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NSVGImage.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NSVGImage$Buffer r0 = new org.lwjgl.nanovg.NSVGImage$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static float nwidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGImage.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGImage.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nheight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGImage.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGImage.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGShape nshapes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGImage.SHAPES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.nanovg.NSVGShape r0 = org.lwjgl.nanovg.NSVGShape.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.nanovg.NSVGImage r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.nanovg.NSVGImage.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.nanovg.NSVGImage.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.NSVGImage.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGImage.WIDTH = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGImage.HEIGHT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGImage.SHAPES = r0
            return
    }
}
