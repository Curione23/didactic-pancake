package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintSweepGradient.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintSweepGradient.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintSweepGradient.class */
public class FT_PaintSweepGradient extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_PaintSweepGradient> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int COLORLINE = 0;
    public static final int CENTER = 0;
    public static final int START_ANGLE = 0;
    public static final int END_ANGLE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintSweepGradient$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintSweepGradient$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintSweepGradient$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_PaintSweepGradient, org.lwjgl.util.freetype.FT_PaintSweepGradient.Buffer> {
        private static final org.lwjgl.util.freetype.FT_PaintSweepGradient ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_PaintSweepGradient.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_PaintSweepGradient.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_PaintSweepGradient getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_PaintSweepGradient r0 = org.lwjgl.util.freetype.FT_PaintSweepGradient.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.util.freetype.FT_ColorLine colorline() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_ColorLine r0 = org.lwjgl.util.freetype.FT_PaintSweepGradient.ncolorline(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Vector center() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_PaintSweepGradient.ncenter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long start_angle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_PaintSweepGradient.nstart_angle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long end_angle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_PaintSweepGradient.nend_angle(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_PaintSweepGradient r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_PaintSweepGradient$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_PaintSweepGradient r0 = org.lwjgl.util.freetype.FT_PaintSweepGradient.create(r0)
                org.lwjgl.util.freetype.FT_PaintSweepGradient.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_PaintSweepGradient(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_PaintSweepGradient create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_PaintSweepGradient r0 = new org.lwjgl.util.freetype.FT_PaintSweepGradient
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_PaintSweepGradient(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_PaintSweepGradient.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_PaintSweepGradient.SIZEOF
            return r0
    }

    public org.lwjgl.util.freetype.FT_ColorLine colorline() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_ColorLine r0 = ncolorline(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Vector center() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Vector r0 = ncenter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long start_angle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstart_angle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long end_angle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nend_angle(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintSweepGradient create(long r6) {
            org.lwjgl.util.freetype.FT_PaintSweepGradient r0 = new org.lwjgl.util.freetype.FT_PaintSweepGradient
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_PaintSweepGradient createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_PaintSweepGradient r0 = new org.lwjgl.util.freetype.FT_PaintSweepGradient
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintSweepGradient.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_PaintSweepGradient$Buffer r0 = new org.lwjgl.util.freetype.FT_PaintSweepGradient$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_PaintSweepGradient.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_PaintSweepGradient$Buffer r0 = new org.lwjgl.util.freetype.FT_PaintSweepGradient$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_ColorLine ncolorline(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_PaintSweepGradient.COLORLINE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_ColorLine r0 = org.lwjgl.util.freetype.FT_ColorLine.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Vector ncenter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_PaintSweepGradient.CENTER
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_Vector.create(r0)
            return r0
    }

    public static long nstart_angle(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_PaintSweepGradient.START_ANGLE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nend_angle(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_PaintSweepGradient.END_ANGLE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_PaintSweepGradient r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_ColorLine.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_ColorLine.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Vector.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Vector.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_PaintSweepGradient.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_PaintSweepGradient.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_PaintSweepGradient.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_PaintSweepGradient.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_PaintSweepGradient.COLORLINE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_PaintSweepGradient.CENTER = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_PaintSweepGradient.START_ANGLE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_PaintSweepGradient.END_ANGLE = r0
            return
    }
}
