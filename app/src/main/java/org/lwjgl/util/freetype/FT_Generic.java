package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Generic.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Generic.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Generic.class */
public class FT_Generic extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Generic> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int DATA = 0;
    public static final int FINALIZER = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Generic$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Generic$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Generic$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Generic, org.lwjgl.util.freetype.FT_Generic.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Generic ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Generic.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Generic getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Generic r0 = org.lwjgl.util.freetype.FT_Generic.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long data() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Generic.ndata(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Generic_Finalizer finalizer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Generic_Finalizer r0 = org.lwjgl.util.freetype.FT_Generic.nfinalizer(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Generic.Buffer data(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Generic.ndata(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Generic.Buffer finalizer(@org.lwjgl.system.NativeType("FT_Generic_Finalizer") org.lwjgl.util.freetype.FT_Generic_FinalizerI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Generic.nfinalizer(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Generic r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Generic$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Generic r0 = org.lwjgl.util.freetype.FT_Generic.create(r0)
                org.lwjgl.util.freetype.FT_Generic.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Generic(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Generic create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Generic r0 = new org.lwjgl.util.freetype.FT_Generic
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Generic(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long data() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndata(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Generic_Finalizer finalizer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Generic_Finalizer r0 = nfinalizer(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Generic data(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndata(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Generic finalizer(@org.lwjgl.system.NativeType("FT_Generic_Finalizer") org.lwjgl.util.freetype.FT_Generic_FinalizerI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfinalizer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Generic set(long r5, org.lwjgl.util.freetype.FT_Generic_FinalizerI r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.freetype.FT_Generic r0 = r0.data(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.freetype.FT_Generic r0 = r0.finalizer(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Generic set(org.lwjgl.util.freetype.FT_Generic r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic malloc() {
            org.lwjgl.util.freetype.FT_Generic r0 = new org.lwjgl.util.freetype.FT_Generic
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic calloc() {
            org.lwjgl.util.freetype.FT_Generic r0 = new org.lwjgl.util.freetype.FT_Generic
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic create() {
            int r0 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Generic r0 = new org.lwjgl.util.freetype.FT_Generic
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic create(long r6) {
            org.lwjgl.util.freetype.FT_Generic r0 = new org.lwjgl.util.freetype.FT_Generic
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Generic createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Generic r0 = new org.lwjgl.util.freetype.FT_Generic
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Generic$Buffer r0 = new org.lwjgl.util.freetype.FT_Generic$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Generic$Buffer r0 = new org.lwjgl.util.freetype.FT_Generic$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Generic$Buffer r0 = new org.lwjgl.util.freetype.FT_Generic$Buffer
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

    public static org.lwjgl.util.freetype.FT_Generic.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Generic$Buffer r0 = new org.lwjgl.util.freetype.FT_Generic$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Generic.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Generic$Buffer r0 = new org.lwjgl.util.freetype.FT_Generic$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Generic r0 = new org.lwjgl.util.freetype.FT_Generic
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Generic.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Generic r0 = new org.lwjgl.util.freetype.FT_Generic
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Generic.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Generic$Buffer r0 = new org.lwjgl.util.freetype.FT_Generic$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Generic.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Generic$Buffer r0 = new org.lwjgl.util.freetype.FT_Generic$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Generic.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long ndata(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Generic.DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic_Finalizer nfinalizer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Generic.FINALIZER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Generic_Finalizer r0 = org.lwjgl.util.freetype.FT_Generic_Finalizer.create(r0)
            return r0
    }

    public static void ndata(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Generic.DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nfinalizer(long r5, org.lwjgl.util.freetype.FT_Generic_FinalizerI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Generic.FINALIZER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Generic.FINALIZER
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
            org.lwjgl.util.freetype.FT_Generic r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_Generic.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Generic.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Generic.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Generic.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Generic.DATA = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Generic.FINALIZER = r0
            return
    }
}
