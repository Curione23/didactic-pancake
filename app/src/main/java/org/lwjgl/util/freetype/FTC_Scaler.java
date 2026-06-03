package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_Scaler.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_Scaler.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_Scaler.class */
@org.lwjgl.system.NativeType("struct FTC_ScalerRec")
public class FTC_Scaler extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FTC_Scaler> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FACE_ID = 0;
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public static final int PIXEL = 0;
    public static final int X_RES = 0;
    public static final int Y_RES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_Scaler$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_Scaler$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_Scaler$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FTC_Scaler, org.lwjgl.util.freetype.FTC_Scaler.Buffer> {
        private static final org.lwjgl.util.freetype.FTC_Scaler ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FTC_Scaler.SIZEOF
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
        protected org.lwjgl.util.freetype.FTC_Scaler.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FTC_Scaler getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FTC_Scaler r0 = org.lwjgl.util.freetype.FTC_Scaler.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FTC_FaceID")
        public long face_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FTC_Scaler.nface_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FTC_Scaler.nwidth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FTC_Scaler.nheight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int pixel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FTC_Scaler.npixel(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int x_res() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FTC_Scaler.nx_res(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int y_res() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FTC_Scaler.ny_res(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FTC_Scaler r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FTC_Scaler$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FTC_Scaler r0 = org.lwjgl.util.freetype.FTC_Scaler.create(r0)
                org.lwjgl.util.freetype.FTC_Scaler.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FTC_Scaler(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FTC_Scaler create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FTC_Scaler r0 = new org.lwjgl.util.freetype.FTC_Scaler
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FTC_Scaler(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_Scaler.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FTC_Scaler.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FTC_FaceID")
    public long face_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nface_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nwidth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int pixel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npixel(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int x_res() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nx_res(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int y_res() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ny_res(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FTC_Scaler create(long r6) {
            org.lwjgl.util.freetype.FTC_Scaler r0 = new org.lwjgl.util.freetype.FTC_Scaler
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FTC_Scaler createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FTC_Scaler r0 = new org.lwjgl.util.freetype.FTC_Scaler
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FTC_Scaler.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FTC_Scaler$Buffer r0 = new org.lwjgl.util.freetype.FTC_Scaler$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FTC_Scaler.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FTC_Scaler$Buffer r0 = new org.lwjgl.util.freetype.FTC_Scaler$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static long nface_id(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FTC_Scaler.FACE_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nwidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_Scaler.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_Scaler.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nheight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_Scaler.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_Scaler.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npixel(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_Scaler.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_Scaler.PIXEL
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nx_res(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_Scaler.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_Scaler.X_RES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ny_res(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_Scaler.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_Scaler.Y_RES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FTC_Scaler r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FTC_Scaler.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FTC_Scaler.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FTC_Scaler.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_Scaler.FACE_ID = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_Scaler.WIDTH = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_Scaler.HEIGHT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_Scaler.PIXEL = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_Scaler.X_RES = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_Scaler.Y_RES = r0
            return
    }
}
