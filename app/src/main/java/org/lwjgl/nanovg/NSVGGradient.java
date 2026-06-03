package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGGradient.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGGradient.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGGradient.class */
@org.lwjgl.system.NativeType("struct NSVGgradient")
public class NSVGGradient extends org.lwjgl.system.Struct<org.lwjgl.nanovg.NSVGGradient> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int XFORM = 0;
    public static final int SPREAD = 0;
    public static final int FX = 0;
    public static final int FY = 0;
    public static final int NSTOPS = 0;
    public static final int PSTOPS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGGradient$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGGradient$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGGradient$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.NSVGGradient, org.lwjgl.nanovg.NSVGGradient.Buffer> {
        private static final org.lwjgl.nanovg.NSVGGradient ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.NSVGGradient.SIZEOF
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
        protected org.lwjgl.nanovg.NSVGGradient.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.NSVGGradient getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.NSVGGradient r0 = org.lwjgl.nanovg.NSVGGradient.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("float[6]")
        public java.nio.FloatBuffer xform() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.nanovg.NSVGGradient.nxform(r0)
                return r0
        }

        public float xform(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.nanovg.NSVGGradient.nxform(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("char")
        public byte spread() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.nanovg.NSVGGradient.nspread(r0)
                return r0
        }

        public float fx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NSVGGradient.nfx(r0)
                return r0
        }

        public float fy() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.nanovg.NSVGGradient.nfy(r0)
                return r0
        }

        public int nstops() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.nanovg.NSVGGradient.nnstops(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NSVGgradientStop[1]")
        public org.lwjgl.nanovg.NSVGGradientStop.Buffer pstops() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NSVGGradientStop$Buffer r0 = org.lwjgl.nanovg.NSVGGradient.npstops(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NSVGgradientStop")
        public org.lwjgl.nanovg.NSVGGradientStop pstops(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.NSVGGradientStop r0 = org.lwjgl.nanovg.NSVGGradient.npstops(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NSVGGradient r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NSVGGradient$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.NSVGGradient r0 = org.lwjgl.nanovg.NSVGGradient.create(r0)
                org.lwjgl.nanovg.NSVGGradient.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected NSVGGradient(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.NSVGGradient create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.NSVGGradient r0 = new org.lwjgl.nanovg.NSVGGradient
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public NSVGGradient(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGGradient.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.NSVGGradient.SIZEOF
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

    @org.lwjgl.system.NativeType("char")
    public byte spread() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nspread(r0)
            return r0
    }

    public float fx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nfx(r0)
            return r0
    }

    public float fy() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nfy(r0)
            return r0
    }

    public int nstops() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnstops(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NSVGgradientStop[1]")
    public org.lwjgl.nanovg.NSVGGradientStop.Buffer pstops() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NSVGGradientStop$Buffer r0 = npstops(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NSVGgradientStop")
    public org.lwjgl.nanovg.NSVGGradientStop pstops(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.nanovg.NSVGGradientStop r0 = npstops(r0, r1)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGGradient create(long r6) {
            org.lwjgl.nanovg.NSVGGradient r0 = new org.lwjgl.nanovg.NSVGGradient
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NSVGGradient createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NSVGGradient r0 = new org.lwjgl.nanovg.NSVGGradient
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.NSVGGradient.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.NSVGGradient$Buffer r0 = new org.lwjgl.nanovg.NSVGGradient$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NSVGGradient.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NSVGGradient$Buffer r0 = new org.lwjgl.nanovg.NSVGGradient$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static java.nio.FloatBuffer nxform(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGGradient.XFORM
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 6
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float nxform(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGGradient.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.NSVGGradient.XFORM
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

    public static byte nspread(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGGradient.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGGradient.SPREAD
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static float nfx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGGradient.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGGradient.FX
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nfy(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGGradient.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGGradient.FY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static int nnstops(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGGradient.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGGradient.NSTOPS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGGradientStop.Buffer npstops(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGGradient.PSTOPS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r5
            int r1 = nnstops(r1)
            org.lwjgl.nanovg.NSVGGradientStop$Buffer r0 = org.lwjgl.nanovg.NSVGGradientStop.create(r0, r1)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGGradientStop npstops(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.nanovg.NSVGGradient.PSTOPS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = r7
            int r2 = nnstops(r2)
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.nanovg.NSVGGradientStop.SIZEOF
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            org.lwjgl.nanovg.NSVGGradientStop r0 = org.lwjgl.nanovg.NSVGGradientStop.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.nanovg.NSVGGradient r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            r4 = 6
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.nanovg.NSVGGradientStop.SIZEOF
            int r4 = org.lwjgl.nanovg.NSVGGradientStop.ALIGNOF
            r5 = 1
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4, r5)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r7 = r0
            r0 = r7
            int r0 = r0.getSize()
            org.lwjgl.nanovg.NSVGGradient.SIZEOF = r0
            r0 = r7
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.NSVGGradient.ALIGNOF = r0
            r0 = r7
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGGradient.XFORM = r0
            r0 = r7
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGGradient.SPREAD = r0
            r0 = r7
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGGradient.FX = r0
            r0 = r7
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGGradient.FY = r0
            r0 = r7
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGGradient.NSTOPS = r0
            r0 = r7
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGGradient.PSTOPS = r0
            return
    }
}
