package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGLUFramebufferBGFX.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGLUFramebufferBGFX.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGLUFramebufferBGFX.class */
@org.lwjgl.system.NativeType("struct NVGLUframebuffer")
public class NVGLUFramebufferBGFX extends org.lwjgl.system.Struct<org.lwjgl.nanovg.NVGLUFramebufferBGFX> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int CTX = 0;
    public static final int HANDLE = 0;
    public static final int IMAGE = 0;
    public static final int VIEWID = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGLUFramebufferBGFX$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGLUFramebufferBGFX$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NVGLUFramebufferBGFX$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.NVGLUFramebufferBGFX, org.lwjgl.nanovg.NVGLUFramebufferBGFX.Buffer> {
        private static final org.lwjgl.nanovg.NVGLUFramebufferBGFX ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.SIZEOF
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
        protected org.lwjgl.nanovg.NVGLUFramebufferBGFX.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.NVGLUFramebufferBGFX getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.NVGLUFramebufferBGFX r0 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcontext *")
        public long ctx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.nctx(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bgfx_frame_buffer_handle_t")
        public short handle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.nhandle(r0)
                return r0
        }

        public int image() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.nimage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bgfx_view_id_t")
        public short viewId() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.nviewId(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NVGLUFramebufferBGFX r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NVGLUFramebufferBGFX$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.NVGLUFramebufferBGFX r0 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.create(r0)
                org.lwjgl.nanovg.NVGLUFramebufferBGFX.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected NVGLUFramebufferBGFX(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.NVGLUFramebufferBGFX create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.NVGLUFramebufferBGFX r0 = new org.lwjgl.nanovg.NVGLUFramebufferBGFX
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public NVGLUFramebufferBGFX(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcontext *")
    public long ctx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nctx(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bgfx_frame_buffer_handle_t")
    public short handle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nhandle(r0)
            return r0
    }

    public int image() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bgfx_view_id_t")
    public short viewId() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nviewId(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGLUFramebufferBGFX create(long r6) {
            org.lwjgl.nanovg.NVGLUFramebufferBGFX r0 = new org.lwjgl.nanovg.NVGLUFramebufferBGFX
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NVGLUFramebufferBGFX createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NVGLUFramebufferBGFX r0 = new org.lwjgl.nanovg.NVGLUFramebufferBGFX
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.NVGLUFramebufferBGFX.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.NVGLUFramebufferBGFX$Buffer r0 = new org.lwjgl.nanovg.NVGLUFramebufferBGFX$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NVGLUFramebufferBGFX.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NVGLUFramebufferBGFX$Buffer r0 = new org.lwjgl.nanovg.NVGLUFramebufferBGFX$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static long nctx(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.CTX
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static short nhandle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.HANDLE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int nimage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.IMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short nviewId(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.VIEWID
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.nanovg.NVGLUFramebufferBGFX r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.nanovg.NVGLUFramebufferBGFX.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.NVGLUFramebufferBGFX.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGLUFramebufferBGFX.CTX = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGLUFramebufferBGFX.HANDLE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGLUFramebufferBGFX.IMAGE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NVGLUFramebufferBGFX.VIEWID = r0
            return
    }
}
