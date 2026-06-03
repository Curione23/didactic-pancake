package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_COLR_Paint.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_COLR_Paint.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_COLR_Paint.class */
public class FT_COLR_Paint extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_COLR_Paint> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FORMAT = 0;
    public static final int U = 0;
    public static final int U_COLR_LAYERS = 0;
    public static final int U_GLYPH = 0;
    public static final int U_SOLID = 0;
    public static final int U_LINEAR_GRADIENT = 0;
    public static final int U_RADIAL_GRADIENT = 0;
    public static final int U_SWEEP_GRADIENT = 0;
    public static final int U_TRANSFORM = 0;
    public static final int U_TRANSLATE = 0;
    public static final int U_SCALE = 0;
    public static final int U_ROTATE = 0;
    public static final int U_SKEW = 0;
    public static final int U_COMPOSITE = 0;
    public static final int U_COLR_GLYPH = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_COLR_Paint$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_COLR_Paint$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_COLR_Paint$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_COLR_Paint, org.lwjgl.util.freetype.FT_COLR_Paint.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_COLR_Paint ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_COLR_Paint.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_COLR_Paint getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_COLR_Paint r0 = org.lwjgl.util.freetype.FT_COLR_Paint.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_PaintFormat")
        public int format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nformat(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintColrLayers u_colr_layers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintColrLayers r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_colr_layers(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintGlyph u_glyph() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintGlyph r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_glyph(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintSolid u_solid() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintSolid r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_solid(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintLinearGradient u_linear_gradient() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintLinearGradient r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_linear_gradient(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintRadialGradient u_radial_gradient() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintRadialGradient r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_radial_gradient(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintSweepGradient u_sweep_gradient() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintSweepGradient r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_sweep_gradient(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintTransform u_transform() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintTransform r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_transform(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintTranslate u_translate() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintTranslate r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_translate(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintScale u_scale() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintScale r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_scale(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintRotate u_rotate() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintRotate r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_rotate(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintSkew u_skew() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintSkew r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_skew(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintComposite u_composite() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintComposite r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_composite(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_PaintColrGlyph u_colr_glyph() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_PaintColrGlyph r0 = org.lwjgl.util.freetype.FT_COLR_Paint.nu_colr_glyph(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_COLR_Paint r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_COLR_Paint$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_COLR_Paint r0 = org.lwjgl.util.freetype.FT_COLR_Paint.create(r0)
                org.lwjgl.util.freetype.FT_COLR_Paint.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_COLR_Paint(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_COLR_Paint create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_COLR_Paint r0 = new org.lwjgl.util.freetype.FT_COLR_Paint
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_COLR_Paint(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_PaintFormat")
    public int format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nformat(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintColrLayers u_colr_layers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintColrLayers r0 = nu_colr_layers(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintGlyph u_glyph() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintGlyph r0 = nu_glyph(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintSolid u_solid() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintSolid r0 = nu_solid(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintLinearGradient u_linear_gradient() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintLinearGradient r0 = nu_linear_gradient(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintRadialGradient u_radial_gradient() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintRadialGradient r0 = nu_radial_gradient(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintSweepGradient u_sweep_gradient() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintSweepGradient r0 = nu_sweep_gradient(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintTransform u_transform() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintTransform r0 = nu_transform(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintTranslate u_translate() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintTranslate r0 = nu_translate(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintScale u_scale() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintScale r0 = nu_scale(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintRotate u_rotate() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintRotate r0 = nu_rotate(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintSkew u_skew() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintSkew r0 = nu_skew(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintComposite u_composite() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintComposite r0 = nu_composite(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_PaintColrGlyph u_colr_glyph() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_PaintColrGlyph r0 = nu_colr_glyph(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_COLR_Paint malloc() {
            org.lwjgl.util.freetype.FT_COLR_Paint r0 = new org.lwjgl.util.freetype.FT_COLR_Paint
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_COLR_Paint calloc() {
            org.lwjgl.util.freetype.FT_COLR_Paint r0 = new org.lwjgl.util.freetype.FT_COLR_Paint
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_COLR_Paint create() {
            int r0 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_COLR_Paint r0 = new org.lwjgl.util.freetype.FT_COLR_Paint
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_COLR_Paint create(long r6) {
            org.lwjgl.util.freetype.FT_COLR_Paint r0 = new org.lwjgl.util.freetype.FT_COLR_Paint
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_COLR_Paint createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_COLR_Paint r0 = new org.lwjgl.util.freetype.FT_COLR_Paint
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_COLR_Paint.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_COLR_Paint$Buffer r0 = new org.lwjgl.util.freetype.FT_COLR_Paint$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_COLR_Paint.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_COLR_Paint$Buffer r0 = new org.lwjgl.util.freetype.FT_COLR_Paint$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_COLR_Paint.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_COLR_Paint$Buffer r0 = new org.lwjgl.util.freetype.FT_COLR_Paint$Buffer
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

    public static org.lwjgl.util.freetype.FT_COLR_Paint.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_COLR_Paint$Buffer r0 = new org.lwjgl.util.freetype.FT_COLR_Paint$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_COLR_Paint.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_COLR_Paint$Buffer r0 = new org.lwjgl.util.freetype.FT_COLR_Paint$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_COLR_Paint malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_COLR_Paint r0 = new org.lwjgl.util.freetype.FT_COLR_Paint
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_COLR_Paint.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_COLR_Paint calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_COLR_Paint r0 = new org.lwjgl.util.freetype.FT_COLR_Paint
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_COLR_Paint.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_COLR_Paint.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_COLR_Paint$Buffer r0 = new org.lwjgl.util.freetype.FT_COLR_Paint$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_COLR_Paint.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_COLR_Paint.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_COLR_Paint$Buffer r0 = new org.lwjgl.util.freetype.FT_COLR_Paint$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_COLR_Paint.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nformat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_COLR_Paint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_COLR_Paint.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintColrLayers nu_colr_layers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_COLR_LAYERS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintColrLayers r0 = org.lwjgl.util.freetype.FT_PaintColrLayers.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintGlyph nu_glyph(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_GLYPH
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintGlyph r0 = org.lwjgl.util.freetype.FT_PaintGlyph.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintSolid nu_solid(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_SOLID
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintSolid r0 = org.lwjgl.util.freetype.FT_PaintSolid.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintLinearGradient nu_linear_gradient(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_LINEAR_GRADIENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintLinearGradient r0 = org.lwjgl.util.freetype.FT_PaintLinearGradient.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintRadialGradient nu_radial_gradient(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_RADIAL_GRADIENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintRadialGradient r0 = org.lwjgl.util.freetype.FT_PaintRadialGradient.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintSweepGradient nu_sweep_gradient(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_SWEEP_GRADIENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintSweepGradient r0 = org.lwjgl.util.freetype.FT_PaintSweepGradient.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintTransform nu_transform(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_TRANSFORM
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintTransform r0 = org.lwjgl.util.freetype.FT_PaintTransform.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintTranslate nu_translate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_TRANSLATE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintTranslate r0 = org.lwjgl.util.freetype.FT_PaintTranslate.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintScale nu_scale(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_SCALE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintScale r0 = org.lwjgl.util.freetype.FT_PaintScale.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintRotate nu_rotate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_ROTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintRotate r0 = org.lwjgl.util.freetype.FT_PaintRotate.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintSkew nu_skew(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_SKEW
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintSkew r0 = org.lwjgl.util.freetype.FT_PaintSkew.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintComposite nu_composite(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_COMPOSITE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintComposite r0 = org.lwjgl.util.freetype.FT_PaintComposite.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintColrGlyph nu_colr_glyph(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_COLR_Paint.U_COLR_GLYPH
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_PaintColrGlyph r0 = org.lwjgl.util.freetype.FT_PaintColrGlyph.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_COLR_Paint r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 13
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            int r6 = org.lwjgl.util.freetype.FT_PaintColrLayers.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintColrLayers.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            int r6 = org.lwjgl.util.freetype.FT_PaintGlyph.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintGlyph.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            int r6 = org.lwjgl.util.freetype.FT_PaintSolid.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintSolid.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 3
            int r6 = org.lwjgl.util.freetype.FT_PaintLinearGradient.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintLinearGradient.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 4
            int r6 = org.lwjgl.util.freetype.FT_PaintRadialGradient.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintRadialGradient.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 5
            int r6 = org.lwjgl.util.freetype.FT_PaintSweepGradient.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintSweepGradient.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 6
            int r6 = org.lwjgl.util.freetype.FT_PaintTransform.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintTransform.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 7
            int r6 = org.lwjgl.util.freetype.FT_PaintTranslate.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintTranslate.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 8
            int r6 = org.lwjgl.util.freetype.FT_PaintScale.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintScale.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 9
            int r6 = org.lwjgl.util.freetype.FT_PaintRotate.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintRotate.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 10
            int r6 = org.lwjgl.util.freetype.FT_PaintSkew.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintSkew.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 11
            int r6 = org.lwjgl.util.freetype.FT_PaintComposite.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintComposite.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 12
            int r6 = org.lwjgl.util.freetype.FT_PaintColrGlyph.SIZEOF
            int r7 = org.lwjgl.util.freetype.FT_PaintColrGlyph.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r9 = r0
            r0 = r9
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_COLR_Paint.SIZEOF = r0
            r0 = r9
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_COLR_Paint.ALIGNOF = r0
            r0 = r9
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.FORMAT = r0
            r0 = r9
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U = r0
            r0 = r9
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_COLR_LAYERS = r0
            r0 = r9
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_GLYPH = r0
            r0 = r9
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_SOLID = r0
            r0 = r9
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_LINEAR_GRADIENT = r0
            r0 = r9
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_RADIAL_GRADIENT = r0
            r0 = r9
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_SWEEP_GRADIENT = r0
            r0 = r9
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_TRANSFORM = r0
            r0 = r9
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_TRANSLATE = r0
            r0 = r9
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_SCALE = r0
            r0 = r9
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_ROTATE = r0
            r0 = r9
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_SKEW = r0
            r0 = r9
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_COMPOSITE = r0
            r0 = r9
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_COLR_Paint.U_COLR_GLYPH = r0
            return
    }
}
