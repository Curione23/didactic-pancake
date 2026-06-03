package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Raster_Funcs.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Raster_Funcs.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Raster_Funcs.class */
public class FT_Raster_Funcs extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Raster_Funcs> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int GLYPH_FORMAT = 0;
    public static final int RASTER_NEW = 0;
    public static final int RASTER_RESET = 0;
    public static final int RASTER_SET_MODE = 0;
    public static final int RASTER_RENDER = 0;
    public static final int RASTER_DONE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Raster_Funcs$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Raster_Funcs$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Raster_Funcs$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Raster_Funcs, org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Raster_Funcs ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Raster_Funcs getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Raster_Funcs r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Glyph_Format")
        public int glyph_format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.nglyph_format(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Raster_NewFunc raster_new() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Raster_NewFunc r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.nraster_new(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Raster_ResetFunc raster_reset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Raster_ResetFunc r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.nraster_reset(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Raster_SetModeFunc raster_set_mode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Raster_SetModeFunc r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.nraster_set_mode(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Raster_RenderFunc raster_render() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Raster_RenderFunc r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.nraster_render(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Raster_DoneFunc raster_done() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Raster_DoneFunc r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.nraster_done(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer glyph_format(@org.lwjgl.system.NativeType("FT_Glyph_Format") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Raster_Funcs.nglyph_format(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer raster_new(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Raster_NewFunc") org.lwjgl.util.freetype.FT_Raster_NewFuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Raster_Funcs.nraster_new(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer raster_reset(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Raster_ResetFunc") org.lwjgl.util.freetype.FT_Raster_ResetFuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Raster_Funcs.nraster_reset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer raster_set_mode(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Raster_SetModeFunc") org.lwjgl.util.freetype.FT_Raster_SetModeFuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Raster_Funcs.nraster_set_mode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer raster_render(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Raster_RenderFunc") org.lwjgl.util.freetype.FT_Raster_RenderFuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Raster_Funcs.nraster_render(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer raster_done(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Raster_DoneFunc") org.lwjgl.util.freetype.FT_Raster_DoneFuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Raster_Funcs.nraster_done(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Raster_Funcs r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Raster_Funcs r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.create(r0)
                org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Raster_Funcs(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Raster_Funcs create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Raster_Funcs(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Glyph_Format")
    public int glyph_format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nglyph_format(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Raster_NewFunc raster_new() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Raster_NewFunc r0 = nraster_new(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Raster_ResetFunc raster_reset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Raster_ResetFunc r0 = nraster_reset(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Raster_SetModeFunc raster_set_mode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Raster_SetModeFunc r0 = nraster_set_mode(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Raster_RenderFunc raster_render() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Raster_RenderFunc r0 = nraster_render(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Raster_DoneFunc raster_done() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Raster_DoneFunc r0 = nraster_done(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Raster_Funcs glyph_format(@org.lwjgl.system.NativeType("FT_Glyph_Format") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nglyph_format(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Raster_Funcs raster_new(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Raster_NewFunc") org.lwjgl.util.freetype.FT_Raster_NewFuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nraster_new(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Raster_Funcs raster_reset(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Raster_ResetFunc") org.lwjgl.util.freetype.FT_Raster_ResetFuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nraster_reset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Raster_Funcs raster_set_mode(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Raster_SetModeFunc") org.lwjgl.util.freetype.FT_Raster_SetModeFuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nraster_set_mode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Raster_Funcs raster_render(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Raster_RenderFunc") org.lwjgl.util.freetype.FT_Raster_RenderFuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nraster_render(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Raster_Funcs raster_done(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Raster_DoneFunc") org.lwjgl.util.freetype.FT_Raster_DoneFuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nraster_done(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Raster_Funcs set(int r4, org.lwjgl.util.freetype.FT_Raster_NewFuncI r5, org.lwjgl.util.freetype.FT_Raster_ResetFuncI r6, org.lwjgl.util.freetype.FT_Raster_SetModeFuncI r7, org.lwjgl.util.freetype.FT_Raster_RenderFuncI r8, org.lwjgl.util.freetype.FT_Raster_DoneFuncI r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = r0.glyph_format(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = r0.raster_new(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = r0.raster_reset(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = r0.raster_set_mode(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = r0.raster_render(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = r0.raster_done(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.freetype.FT_Raster_Funcs set(org.lwjgl.util.freetype.FT_Raster_Funcs r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Raster_Funcs malloc() {
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Raster_Funcs calloc() {
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Raster_Funcs create() {
            int r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Raster_Funcs create(long r6) {
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Raster_Funcs createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer
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

    public static org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Raster_Funcs malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Raster_Funcs calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Raster_Funcs.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer r0 = new org.lwjgl.util.freetype.FT_Raster_Funcs$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nglyph_format(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.GLYPH_FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Raster_NewFunc nraster_new(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_NEW
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Raster_NewFunc r0 = org.lwjgl.util.freetype.FT_Raster_NewFunc.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Raster_ResetFunc nraster_reset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_RESET
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Raster_ResetFunc r0 = org.lwjgl.util.freetype.FT_Raster_ResetFunc.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Raster_SetModeFunc nraster_set_mode(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_SET_MODE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Raster_SetModeFunc r0 = org.lwjgl.util.freetype.FT_Raster_SetModeFunc.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Raster_RenderFunc nraster_render(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_RENDER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Raster_RenderFunc r0 = org.lwjgl.util.freetype.FT_Raster_RenderFunc.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Raster_DoneFunc nraster_done(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_DONE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Raster_DoneFunc r0 = org.lwjgl.util.freetype.FT_Raster_DoneFunc.createSafe(r0)
            return r0
    }

    public static void nglyph_format(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Raster_Funcs.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.GLYPH_FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nraster_new(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Raster_NewFuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_NEW
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nraster_reset(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Raster_ResetFuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_RESET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nraster_set_mode(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Raster_SetModeFuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_SET_MODE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nraster_render(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Raster_RenderFuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_RENDER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nraster_done(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Raster_DoneFuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_DONE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_Raster_Funcs r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.freetype.FT_Raster_Funcs.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Raster_Funcs.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Raster_Funcs.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Raster_Funcs.GLYPH_FORMAT = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_NEW = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_RESET = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_SET_MODE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_RENDER = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Raster_Funcs.RASTER_DONE = r0
            return
    }
}
