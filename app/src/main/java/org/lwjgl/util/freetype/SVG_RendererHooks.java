package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/SVG_RendererHooks.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/SVG_RendererHooks.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/SVG_RendererHooks.class */
public class SVG_RendererHooks extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.SVG_RendererHooks> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int INIT_SVG = 0;
    public static final int FREE_SVG = 0;
    public static final int RENDER_SVG = 0;
    public static final int PRESET_SLOT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/SVG_RendererHooks$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/SVG_RendererHooks$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/SVG_RendererHooks$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.SVG_RendererHooks, org.lwjgl.util.freetype.SVG_RendererHooks.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.SVG_RendererHooks ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
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
        protected org.lwjgl.util.freetype.SVG_RendererHooks.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.SVG_RendererHooks getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.SVG_RendererHooks r0 = org.lwjgl.util.freetype.SVG_RendererHooks.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.util.freetype.SVG_Lib_Init_Func init_svg() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.SVG_Lib_Init_Func r0 = org.lwjgl.util.freetype.SVG_RendererHooks.ninit_svg(r0)
                return r0
        }

        public org.lwjgl.util.freetype.SVG_Lib_Free_Func free_svg() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.SVG_Lib_Free_Func r0 = org.lwjgl.util.freetype.SVG_RendererHooks.nfree_svg(r0)
                return r0
        }

        public org.lwjgl.util.freetype.SVG_Lib_Render_Func render_svg() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.SVG_Lib_Render_Func r0 = org.lwjgl.util.freetype.SVG_RendererHooks.nrender_svg(r0)
                return r0
        }

        public org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_Func preset_slot() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_Func r0 = org.lwjgl.util.freetype.SVG_RendererHooks.npreset_slot(r0)
                return r0
        }

        public org.lwjgl.util.freetype.SVG_RendererHooks.Buffer init_svg(@org.lwjgl.system.NativeType("SVG_Lib_Init_Func") org.lwjgl.util.freetype.SVG_Lib_Init_FuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.SVG_RendererHooks.ninit_svg(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.SVG_RendererHooks.Buffer free_svg(@org.lwjgl.system.NativeType("SVG_Lib_Free_Func") org.lwjgl.util.freetype.SVG_Lib_Free_FuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.SVG_RendererHooks.nfree_svg(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.SVG_RendererHooks.Buffer render_svg(@org.lwjgl.system.NativeType("SVG_Lib_Render_Func") org.lwjgl.util.freetype.SVG_Lib_Render_FuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.SVG_RendererHooks.nrender_svg(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.SVG_RendererHooks.Buffer preset_slot(@org.lwjgl.system.NativeType("SVG_Lib_Preset_Slot_Func") org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_FuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.SVG_RendererHooks.npreset_slot(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.SVG_RendererHooks r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.SVG_RendererHooks$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.SVG_RendererHooks r0 = org.lwjgl.util.freetype.SVG_RendererHooks.create(r0)
                org.lwjgl.util.freetype.SVG_RendererHooks.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SVG_RendererHooks(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.SVG_RendererHooks create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = new org.lwjgl.util.freetype.SVG_RendererHooks
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SVG_RendererHooks(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            return r0
    }

    public org.lwjgl.util.freetype.SVG_Lib_Init_Func init_svg() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.SVG_Lib_Init_Func r0 = ninit_svg(r0)
            return r0
    }

    public org.lwjgl.util.freetype.SVG_Lib_Free_Func free_svg() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.SVG_Lib_Free_Func r0 = nfree_svg(r0)
            return r0
    }

    public org.lwjgl.util.freetype.SVG_Lib_Render_Func render_svg() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.SVG_Lib_Render_Func r0 = nrender_svg(r0)
            return r0
    }

    public org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_Func preset_slot() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_Func r0 = npreset_slot(r0)
            return r0
    }

    public org.lwjgl.util.freetype.SVG_RendererHooks init_svg(@org.lwjgl.system.NativeType("SVG_Lib_Init_Func") org.lwjgl.util.freetype.SVG_Lib_Init_FuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninit_svg(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.SVG_RendererHooks free_svg(@org.lwjgl.system.NativeType("SVG_Lib_Free_Func") org.lwjgl.util.freetype.SVG_Lib_Free_FuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfree_svg(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.SVG_RendererHooks render_svg(@org.lwjgl.system.NativeType("SVG_Lib_Render_Func") org.lwjgl.util.freetype.SVG_Lib_Render_FuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrender_svg(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.SVG_RendererHooks preset_slot(@org.lwjgl.system.NativeType("SVG_Lib_Preset_Slot_Func") org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_FuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npreset_slot(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.SVG_RendererHooks set(org.lwjgl.util.freetype.SVG_Lib_Init_FuncI r4, org.lwjgl.util.freetype.SVG_Lib_Free_FuncI r5, org.lwjgl.util.freetype.SVG_Lib_Render_FuncI r6, org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_FuncI r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = r0.init_svg(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = r0.free_svg(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = r0.render_svg(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = r0.preset_slot(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.freetype.SVG_RendererHooks set(org.lwjgl.util.freetype.SVG_RendererHooks r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_RendererHooks malloc() {
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = new org.lwjgl.util.freetype.SVG_RendererHooks
            r1 = r0
            int r2 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_RendererHooks calloc() {
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = new org.lwjgl.util.freetype.SVG_RendererHooks
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_RendererHooks create() {
            int r0 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = new org.lwjgl.util.freetype.SVG_RendererHooks
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_RendererHooks create(long r6) {
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = new org.lwjgl.util.freetype.SVG_RendererHooks
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.SVG_RendererHooks createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = new org.lwjgl.util.freetype.SVG_RendererHooks
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_RendererHooks.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.SVG_RendererHooks$Buffer r0 = new org.lwjgl.util.freetype.SVG_RendererHooks$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_RendererHooks.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.SVG_RendererHooks$Buffer r0 = new org.lwjgl.util.freetype.SVG_RendererHooks$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_RendererHooks.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.SVG_RendererHooks$Buffer r0 = new org.lwjgl.util.freetype.SVG_RendererHooks$Buffer
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

    public static org.lwjgl.util.freetype.SVG_RendererHooks.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.SVG_RendererHooks$Buffer r0 = new org.lwjgl.util.freetype.SVG_RendererHooks$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.SVG_RendererHooks.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.SVG_RendererHooks$Buffer r0 = new org.lwjgl.util.freetype.SVG_RendererHooks$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_RendererHooks malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = new org.lwjgl.util.freetype.SVG_RendererHooks
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.ALIGNOF
            int r4 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_RendererHooks calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = new org.lwjgl.util.freetype.SVG_RendererHooks
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_RendererHooks.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.SVG_RendererHooks$Buffer r0 = new org.lwjgl.util.freetype.SVG_RendererHooks$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_RendererHooks.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.SVG_RendererHooks$Buffer r0 = new org.lwjgl.util.freetype.SVG_RendererHooks$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_Lib_Init_Func ninit_svg(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.INIT_SVG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.SVG_Lib_Init_Func r0 = org.lwjgl.util.freetype.SVG_Lib_Init_Func.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_Lib_Free_Func nfree_svg(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.FREE_SVG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.SVG_Lib_Free_Func r0 = org.lwjgl.util.freetype.SVG_Lib_Free_Func.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_Lib_Render_Func nrender_svg(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.RENDER_SVG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.SVG_Lib_Render_Func r0 = org.lwjgl.util.freetype.SVG_Lib_Render_Func.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_Func npreset_slot(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.PRESET_SLOT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_Func r0 = org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_Func.create(r0)
            return r0
    }

    public static void ninit_svg(long r5, org.lwjgl.util.freetype.SVG_Lib_Init_FuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.INIT_SVG
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nfree_svg(long r5, org.lwjgl.util.freetype.SVG_Lib_Free_FuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.FREE_SVG
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nrender_svg(long r5, org.lwjgl.util.freetype.SVG_Lib_Render_FuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.RENDER_SVG
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npreset_slot(long r5, org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_FuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.PRESET_SLOT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.INIT_SVG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.FREE_SVG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.RENDER_SVG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.freetype.SVG_RendererHooks.PRESET_SLOT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.SVG_RendererHooks r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.SVG_RendererHooks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.SVG_RendererHooks.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.SVG_RendererHooks.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.SVG_RendererHooks.INIT_SVG = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.SVG_RendererHooks.FREE_SVG = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.SVG_RendererHooks.RENDER_SVG = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.SVG_RendererHooks.PRESET_SLOT = r0
            return
    }
}
