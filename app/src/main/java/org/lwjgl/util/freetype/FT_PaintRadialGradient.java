package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintRadialGradient.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintRadialGradient.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintRadialGradient.class */
public class FT_PaintRadialGradient extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_PaintRadialGradient> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int COLORLINE = 0;
    public static final int C0 = 0;
    public static final int R0 = 0;
    public static final int C1 = 0;
    public static final int R1 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintRadialGradient$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintRadialGradient$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_PaintRadialGradient$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_PaintRadialGradient, org.lwjgl.util.freetype.FT_PaintRadialGradient.Buffer> {
        private static final org.lwjgl.util.freetype.FT_PaintRadialGradient ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_PaintRadialGradient.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_PaintRadialGradient.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_PaintRadialGradient getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_PaintRadialGradient r0 = org.lwjgl.util.freetype.FT_PaintRadialGradient.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.util.freetype.FT_ColorLine colorline() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_ColorLine r0 = org.lwjgl.util.freetype.FT_PaintRadialGradient.ncolorline(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Vector c0() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_PaintRadialGradient.nc0(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long r0() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_PaintRadialGradient.nr0(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Vector c1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_PaintRadialGradient.nc1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long r1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_PaintRadialGradient.nr1(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_PaintRadialGradient r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_PaintRadialGradient$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_PaintRadialGradient r0 = org.lwjgl.util.freetype.FT_PaintRadialGradient.create(r0)
                org.lwjgl.util.freetype.FT_PaintRadialGradient.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_PaintRadialGradient(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_PaintRadialGradient create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_PaintRadialGradient r0 = new org.lwjgl.util.freetype.FT_PaintRadialGradient
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_PaintRadialGradient(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_PaintRadialGradient.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_PaintRadialGradient.SIZEOF
            return r0
    }

    public org.lwjgl.util.freetype.FT_ColorLine colorline() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_ColorLine r0 = ncolorline(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Vector c0() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Vector r0 = nc0(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long r0() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nr0(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Vector c1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Vector r0 = nc1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long r1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nr1(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintRadialGradient create(long r6) {
            org.lwjgl.util.freetype.FT_PaintRadialGradient r0 = new org.lwjgl.util.freetype.FT_PaintRadialGradient
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_PaintRadialGradient createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_PaintRadialGradient r0 = new org.lwjgl.util.freetype.FT_PaintRadialGradient
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_PaintRadialGradient.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_PaintRadialGradient$Buffer r0 = new org.lwjgl.util.freetype.FT_PaintRadialGradient$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_PaintRadialGradient.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_PaintRadialGradient$Buffer r0 = new org.lwjgl.util.freetype.FT_PaintRadialGradient$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_ColorLine ncolorline(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_PaintRadialGradient.COLORLINE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_ColorLine r0 = org.lwjgl.util.freetype.FT_ColorLine.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Vector nc0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_PaintRadialGradient.C0
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_Vector.create(r0)
            return r0
    }

    public static long nr0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_PaintRadialGradient.R0
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Vector nc1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_PaintRadialGradient.C1
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_Vector.create(r0)
            return r0
    }

    public static long nr1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_PaintRadialGradient.R1
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
            org.lwjgl.util.freetype.FT_PaintRadialGradient r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
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
            int r3 = org.lwjgl.util.freetype.FT_PaintRadialGradient.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_Vector.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Vector.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.FT_PaintRadialGradient.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_PaintRadialGradient.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_PaintRadialGradient.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_PaintRadialGradient.COLORLINE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_PaintRadialGradient.C0 = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_PaintRadialGradient.R0 = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_PaintRadialGradient.C1 = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_PaintRadialGradient.R1 = r0
            return
    }
}
