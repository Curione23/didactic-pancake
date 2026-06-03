package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Multi_Master.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Multi_Master.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Multi_Master.class */
public class FT_Multi_Master extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Multi_Master> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int NUM_AXIS = 0;
    public static final int NUM_DESIGNS = 0;
    public static final int AXIS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Multi_Master$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Multi_Master$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Multi_Master$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Multi_Master, org.lwjgl.util.freetype.FT_Multi_Master.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Multi_Master ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Multi_Master.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Multi_Master getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Multi_Master r0 = org.lwjgl.util.freetype.FT_Multi_Master.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int num_axis() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Multi_Master.nnum_axis(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int num_designs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Multi_Master.nnum_designs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_MM_Axis[T1_MAX_MM_AXIS]")
        public org.lwjgl.util.freetype.FT_MM_Axis.Buffer axis() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_MM_Axis$Buffer r0 = org.lwjgl.util.freetype.FT_Multi_Master.naxis(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_MM_Axis axis(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_MM_Axis r0 = org.lwjgl.util.freetype.FT_Multi_Master.naxis(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Multi_Master r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Multi_Master$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Multi_Master r0 = org.lwjgl.util.freetype.FT_Multi_Master.create(r0)
                org.lwjgl.util.freetype.FT_Multi_Master.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Multi_Master(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Multi_Master create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Multi_Master r0 = new org.lwjgl.util.freetype.FT_Multi_Master
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Multi_Master(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int num_axis() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_axis(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int num_designs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_designs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_MM_Axis[T1_MAX_MM_AXIS]")
    public org.lwjgl.util.freetype.FT_MM_Axis.Buffer axis() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_MM_Axis$Buffer r0 = naxis(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_MM_Axis axis(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.util.freetype.FT_MM_Axis r0 = naxis(r0, r1)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Multi_Master malloc() {
            org.lwjgl.util.freetype.FT_Multi_Master r0 = new org.lwjgl.util.freetype.FT_Multi_Master
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Multi_Master calloc() {
            org.lwjgl.util.freetype.FT_Multi_Master r0 = new org.lwjgl.util.freetype.FT_Multi_Master
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Multi_Master create() {
            int r0 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Multi_Master r0 = new org.lwjgl.util.freetype.FT_Multi_Master
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Multi_Master create(long r6) {
            org.lwjgl.util.freetype.FT_Multi_Master r0 = new org.lwjgl.util.freetype.FT_Multi_Master
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Multi_Master createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Multi_Master r0 = new org.lwjgl.util.freetype.FT_Multi_Master
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Multi_Master.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Multi_Master$Buffer r0 = new org.lwjgl.util.freetype.FT_Multi_Master$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Multi_Master.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Multi_Master$Buffer r0 = new org.lwjgl.util.freetype.FT_Multi_Master$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Multi_Master.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Multi_Master$Buffer r0 = new org.lwjgl.util.freetype.FT_Multi_Master$Buffer
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

    public static org.lwjgl.util.freetype.FT_Multi_Master.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Multi_Master$Buffer r0 = new org.lwjgl.util.freetype.FT_Multi_Master$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Multi_Master.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Multi_Master$Buffer r0 = new org.lwjgl.util.freetype.FT_Multi_Master$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Multi_Master malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Multi_Master r0 = new org.lwjgl.util.freetype.FT_Multi_Master
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Multi_Master.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Multi_Master calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Multi_Master r0 = new org.lwjgl.util.freetype.FT_Multi_Master
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Multi_Master.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Multi_Master.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Multi_Master$Buffer r0 = new org.lwjgl.util.freetype.FT_Multi_Master$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Multi_Master.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Multi_Master.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Multi_Master$Buffer r0 = new org.lwjgl.util.freetype.FT_Multi_Master$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Multi_Master.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nnum_axis(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Multi_Master.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Multi_Master.NUM_AXIS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nnum_designs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Multi_Master.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Multi_Master.NUM_DESIGNS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_MM_Axis.Buffer naxis(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Multi_Master.AXIS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            org.lwjgl.util.freetype.FT_MM_Axis$Buffer r0 = org.lwjgl.util.freetype.FT_MM_Axis.create(r0, r1)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_MM_Axis naxis(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.util.freetype.FT_Multi_Master.AXIS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 4
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.util.freetype.FT_MM_Axis.SIZEOF
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_MM_Axis r0 = org.lwjgl.util.freetype.FT_MM_Axis.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_Multi_Master r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.util.freetype.FT_MM_Axis.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_MM_Axis.ALIGNOF
            r5 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4, r5)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r7 = r0
            r0 = r7
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Multi_Master.SIZEOF = r0
            r0 = r7
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Multi_Master.ALIGNOF = r0
            r0 = r7
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Multi_Master.NUM_AXIS = r0
            r0 = r7
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Multi_Master.NUM_DESIGNS = r0
            r0 = r7
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Multi_Master.AXIS = r0
            return
    }
}
