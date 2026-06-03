package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGShape.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGShape.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGShape.class */
@org.lwjgl.system.NativeType("struct NSVGshape")
public class NSVGShape extends org.lwjgl.system.Struct<org.lwjgl.nanovg.NSVGShape> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ID = 0;
    public static final int FILL = 0;
    public static final int STROKE = 0;
    public static final int OPACITY = 0;
    public static final int STROKEWIDTH = 0;
    public static final int STROKEDASHOFFSET = 0;
    public static final int STROKEDASHARRAY = 0;
    public static final int STROKEDASHCOUNT = 0;
    public static final int STROKELINEJOIN = 0;
    public static final int STROKELINECAP = 0;
    public static final int MITERLIMIT = 0;
    public static final int FILLRULE = 0;
    public static final int FLAGS = 0;
    public static final int BOUNDS = 0;
    public static final int FILLGRADIENT = 0;
    public static final int STROKEGRADIENT = 0;
    public static final int XFORM = 0;
    public static final int PATHS = 0;
    public static final int NEXT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGShape$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGShape$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGShape$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.NSVGShape, org.lwjgl.nanovg.NSVGShape.Buffer> {
        private static final org.lwjgl.nanovg.NSVGShape ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.NSVGShape.SIZEOF
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
        protected org.lwjgl.nanovg.NSVGShape.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.NSVGShape getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.NSVGShape r0 = org.lwjgl.nanovg.NSVGShape.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("char[64]")
        public java.nio.ByteBuffer id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.nanovg.NSVGShape.nid(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[64]")
        public java.lang.String idString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.nanovg.NSVGShape.nidString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NSVGpaint")
        public org.lwjgl.nanovg.NSVGPaint fill() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NSVGPaint r0 = org.lwjgl.nanovg.NSVGShape.nfill(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NSVGpaint")
        public org.lwjgl.nanovg.NSVGPaint stroke() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NSVGPaint r0 = org.lwjgl.nanovg.NSVGShape.nstroke(r0)
                return r0
        }

        public float opacity() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NSVGShape.nopacity(r0)
                return r0
        }

        public float strokeWidth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NSVGShape.nstrokeWidth(r0)
                return r0
        }

        public float strokeDashOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NSVGShape.nstrokeDashOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("float[8]")
        public java.nio.FloatBuffer strokeDashArray() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.nanovg.NSVGShape.nstrokeDashArray(r0)
                return r0
        }

        public float strokeDashArray(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.nanovg.NSVGShape.nstrokeDashArray(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("char")
        public byte strokeDashCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.nanovg.NSVGShape.nstrokeDashCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char")
        public byte strokeLineJoin() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.nanovg.NSVGShape.nstrokeLineJoin(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char")
        public byte strokeLineCap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.nanovg.NSVGShape.nstrokeLineCap(r0)
                return r0
        }

        public float miterLimit() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NSVGShape.nmiterLimit(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char")
        public byte fillRule() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.nanovg.NSVGShape.nfillRule(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned char")
        public byte flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.nanovg.NSVGShape.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("float[4]")
        public java.nio.FloatBuffer bounds() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.nanovg.NSVGShape.nbounds(r0)
                return r0
        }

        public float bounds(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.nanovg.NSVGShape.nbounds(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("char[64]")
        public java.nio.ByteBuffer fillGradient() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.nanovg.NSVGShape.nfillGradient(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[64]")
        public java.lang.String fillGradientString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.nanovg.NSVGShape.nfillGradientString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[64]")
        public java.nio.ByteBuffer strokeGradient() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.nanovg.NSVGShape.nstrokeGradient(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[64]")
        public java.lang.String strokeGradientString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.nanovg.NSVGShape.nstrokeGradientString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("float[6]")
        public java.nio.FloatBuffer xform() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.nanovg.NSVGShape.nxform(r0)
                return r0
        }

        public float xform(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.nanovg.NSVGShape.nxform(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("NSVGpath *")
        public org.lwjgl.nanovg.NSVGPath paths() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NSVGPath r0 = org.lwjgl.nanovg.NSVGShape.npaths(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NSVGshape *")
        public org.lwjgl.nanovg.NSVGShape next() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NSVGShape r0 = org.lwjgl.nanovg.NSVGShape.nnext(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NSVGShape r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NSVGShape$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.NSVGShape r0 = org.lwjgl.nanovg.NSVGShape.create(r0)
                org.lwjgl.nanovg.NSVGShape.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected NSVGShape(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.NSVGShape create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.NSVGShape r0 = new org.lwjgl.nanovg.NSVGShape
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public NSVGShape(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGShape.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.NSVGShape.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("char[64]")
    public java.nio.ByteBuffer id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nid(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[64]")
    public java.lang.String idString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nidString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NSVGpaint")
    public org.lwjgl.nanovg.NSVGPaint fill() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NSVGPaint r0 = nfill(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NSVGpaint")
    public org.lwjgl.nanovg.NSVGPaint stroke() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NSVGPaint r0 = nstroke(r0)
            return r0
    }

    public float opacity() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nopacity(r0)
            return r0
    }

    public float strokeWidth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nstrokeWidth(r0)
            return r0
    }

    public float strokeDashOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nstrokeDashOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("float[8]")
    public java.nio.FloatBuffer strokeDashArray() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.FloatBuffer r0 = nstrokeDashArray(r0)
            return r0
    }

    public float strokeDashArray(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = nstrokeDashArray(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("char")
    public byte strokeDashCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nstrokeDashCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char")
    public byte strokeLineJoin() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nstrokeLineJoin(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char")
    public byte strokeLineCap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nstrokeLineCap(r0)
            return r0
    }

    public float miterLimit() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nmiterLimit(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char")
    public byte fillRule() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nfillRule(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned char")
    public byte flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("float[4]")
    public java.nio.FloatBuffer bounds() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.FloatBuffer r0 = nbounds(r0)
            return r0
    }

    public float bounds(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = nbounds(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("char[64]")
    public java.nio.ByteBuffer fillGradient() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nfillGradient(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[64]")
    public java.lang.String fillGradientString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nfillGradientString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[64]")
    public java.nio.ByteBuffer strokeGradient() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nstrokeGradient(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[64]")
    public java.lang.String strokeGradientString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nstrokeGradientString(r0)
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

    @org.lwjgl.system.NativeType("NSVGpath *")
    public org.lwjgl.nanovg.NSVGPath paths() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NSVGPath r0 = npaths(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NSVGshape *")
    public org.lwjgl.nanovg.NSVGShape next() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NSVGShape r0 = nnext(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGShape create(long r6) {
            org.lwjgl.nanovg.NSVGShape r0 = new org.lwjgl.nanovg.NSVGShape
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NSVGShape createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NSVGShape r0 = new org.lwjgl.nanovg.NSVGShape
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.NSVGShape.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.NSVGShape$Buffer r0 = new org.lwjgl.nanovg.NSVGShape$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NSVGShape.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NSVGShape$Buffer r0 = new org.lwjgl.nanovg.NSVGShape$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static java.nio.ByteBuffer nid(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.ID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 64
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String nidString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.ID
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGPaint nfill(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.FILL
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NSVGPaint r0 = org.lwjgl.nanovg.NSVGPaint.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGPaint nstroke(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.STROKE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NSVGPaint r0 = org.lwjgl.nanovg.NSVGPaint.create(r0)
            return r0
    }

    public static float nopacity(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGShape.OPACITY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nstrokeWidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGShape.STROKEWIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nstrokeDashOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGShape.STROKEDASHOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static java.nio.FloatBuffer nstrokeDashArray(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.STROKEDASHARRAY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float nstrokeDashArray(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.NSVGShape.STROKEDASHARRAY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 8
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static byte nstrokeDashCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGShape.STROKEDASHCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nstrokeLineJoin(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGShape.STROKELINEJOIN
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nstrokeLineCap(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGShape.STROKELINECAP
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static float nmiterLimit(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGShape.MITERLIMIT
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static byte nfillRule(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGShape.FILLRULE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGShape.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.FloatBuffer nbounds(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.BOUNDS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float nbounds(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.NSVGShape.BOUNDS
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

    public static java.nio.ByteBuffer nfillGradient(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.FILLGRADIENT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 64
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String nfillGradientString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.FILLGRADIENT
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0)
            return r0
    }

    public static java.nio.ByteBuffer nstrokeGradient(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.STROKEGRADIENT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 64
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String nstrokeGradientString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.STROKEGRADIENT
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0)
            return r0
    }

    public static java.nio.FloatBuffer nxform(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.XFORM
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 6
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float nxform(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGShape.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.NSVGShape.XFORM
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

    public static org.lwjgl.nanovg.NSVGPath npaths(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.PATHS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.nanovg.NSVGPath r0 = org.lwjgl.nanovg.NSVGPath.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGShape nnext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGShape.NEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.nanovg.NSVGShape r0 = create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.nanovg.NSVGShape r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 19
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            r4 = 64
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.nanovg.NSVGPaint.SIZEOF
            int r4 = org.lwjgl.nanovg.NSVGPaint.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.nanovg.NSVGPaint.SIZEOF
            int r4 = org.lwjgl.nanovg.NSVGPaint.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            r4 = 8
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 1
            r4 = 64
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 1
            r4 = 64
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 4
            r4 = 6
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            int r3 = org.lwjgl.nanovg.NSVGShape.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            int r3 = org.lwjgl.nanovg.NSVGShape.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.nanovg.NSVGShape.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.NSVGShape.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.ID = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.FILL = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.STROKE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.OPACITY = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.STROKEWIDTH = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.STROKEDASHOFFSET = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.STROKEDASHARRAY = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.STROKEDASHCOUNT = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.STROKELINEJOIN = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.STROKELINECAP = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.MITERLIMIT = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.FILLRULE = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.FLAGS = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.BOUNDS = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.FILLGRADIENT = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.STROKEGRADIENT = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.XFORM = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.PATHS = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGShape.NEXT = r0
            return
    }
}
