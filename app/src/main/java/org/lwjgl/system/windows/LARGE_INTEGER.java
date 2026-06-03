package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/LARGE_INTEGER.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/LARGE_INTEGER.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/LARGE_INTEGER.class */
public class LARGE_INTEGER extends org.lwjgl.system.Struct<org.lwjgl.system.windows.LARGE_INTEGER> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int U = 0;
    public static final int U_LOWPART = 0;
    public static final int U_HIGHPART = 0;
    public static final int QUADPART = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/LARGE_INTEGER$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/LARGE_INTEGER$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/LARGE_INTEGER$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.windows.LARGE_INTEGER, org.lwjgl.system.windows.LARGE_INTEGER.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.windows.LARGE_INTEGER ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
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
        protected org.lwjgl.system.windows.LARGE_INTEGER.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.windows.LARGE_INTEGER getElementFactory() {
                r2 = this;
                org.lwjgl.system.windows.LARGE_INTEGER r0 = org.lwjgl.system.windows.LARGE_INTEGER.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int u_LowPart() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.LARGE_INTEGER.nu_LowPart(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("LONG")
        public int u_HighPart() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.LARGE_INTEGER.nu_HighPart(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("LONGLONG")
        public long QuadPart() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.LARGE_INTEGER.nQuadPart(r0)
                return r0
        }

        public org.lwjgl.system.windows.LARGE_INTEGER.Buffer u_LowPart(@org.lwjgl.system.NativeType("DWORD") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.LARGE_INTEGER.nu_LowPart(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.LARGE_INTEGER.Buffer u_HighPart(@org.lwjgl.system.NativeType("LONG") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.LARGE_INTEGER.nu_HighPart(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.LARGE_INTEGER.Buffer QuadPart(@org.lwjgl.system.NativeType("LONGLONG") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.windows.LARGE_INTEGER.nQuadPart(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.LARGE_INTEGER r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.LARGE_INTEGER$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.windows.LARGE_INTEGER r0 = org.lwjgl.system.windows.LARGE_INTEGER.create(r0)
                org.lwjgl.system.windows.LARGE_INTEGER.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected LARGE_INTEGER(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.windows.LARGE_INTEGER create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.windows.LARGE_INTEGER r0 = new org.lwjgl.system.windows.LARGE_INTEGER
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public LARGE_INTEGER(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int u_LowPart() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nu_LowPart(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("LONG")
    public int u_HighPart() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nu_HighPart(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("LONGLONG")
    public long QuadPart() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nQuadPart(r0)
            return r0
    }

    public org.lwjgl.system.windows.LARGE_INTEGER u_LowPart(@org.lwjgl.system.NativeType("DWORD") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nu_LowPart(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.LARGE_INTEGER u_HighPart(@org.lwjgl.system.NativeType("LONG") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nu_HighPart(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.LARGE_INTEGER QuadPart(@org.lwjgl.system.NativeType("LONGLONG") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nQuadPart(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.windows.LARGE_INTEGER set(org.lwjgl.system.windows.LARGE_INTEGER r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.windows.LARGE_INTEGER malloc() {
            org.lwjgl.system.windows.LARGE_INTEGER r0 = new org.lwjgl.system.windows.LARGE_INTEGER
            r1 = r0
            int r2 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.LARGE_INTEGER calloc() {
            org.lwjgl.system.windows.LARGE_INTEGER r0 = new org.lwjgl.system.windows.LARGE_INTEGER
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.LARGE_INTEGER create() {
            int r0 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.windows.LARGE_INTEGER r0 = new org.lwjgl.system.windows.LARGE_INTEGER
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.LARGE_INTEGER create(long r6) {
            org.lwjgl.system.windows.LARGE_INTEGER r0 = new org.lwjgl.system.windows.LARGE_INTEGER
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.LARGE_INTEGER createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.LARGE_INTEGER r0 = new org.lwjgl.system.windows.LARGE_INTEGER
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.LARGE_INTEGER.Buffer malloc(int r6) {
            org.lwjgl.system.windows.LARGE_INTEGER$Buffer r0 = new org.lwjgl.system.windows.LARGE_INTEGER$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.LARGE_INTEGER.Buffer calloc(int r7) {
            org.lwjgl.system.windows.LARGE_INTEGER$Buffer r0 = new org.lwjgl.system.windows.LARGE_INTEGER$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.LARGE_INTEGER.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.windows.LARGE_INTEGER$Buffer r0 = new org.lwjgl.system.windows.LARGE_INTEGER$Buffer
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

    public static org.lwjgl.system.windows.LARGE_INTEGER.Buffer create(long r6, int r8) {
            org.lwjgl.system.windows.LARGE_INTEGER$Buffer r0 = new org.lwjgl.system.windows.LARGE_INTEGER$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.LARGE_INTEGER.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.LARGE_INTEGER$Buffer r0 = new org.lwjgl.system.windows.LARGE_INTEGER$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.LARGE_INTEGER malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.windows.LARGE_INTEGER r0 = new org.lwjgl.system.windows.LARGE_INTEGER
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.ALIGNOF
            int r4 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.LARGE_INTEGER calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.windows.LARGE_INTEGER r0 = new org.lwjgl.system.windows.LARGE_INTEGER
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.LARGE_INTEGER.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.LARGE_INTEGER$Buffer r0 = new org.lwjgl.system.windows.LARGE_INTEGER$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.LARGE_INTEGER.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.LARGE_INTEGER$Buffer r0 = new org.lwjgl.system.windows.LARGE_INTEGER$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nu_LowPart(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.LARGE_INTEGER.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.U_LOWPART
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nu_HighPart(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.LARGE_INTEGER.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.U_HIGHPART
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nQuadPart(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.LARGE_INTEGER.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.QUADPART
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nu_LowPart(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.LARGE_INTEGER.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.U_LOWPART
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nu_HighPart(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.LARGE_INTEGER.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.U_HIGHPART
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nQuadPart(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.LARGE_INTEGER.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.LARGE_INTEGER.QUADPART
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.windows.LARGE_INTEGER r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __struct(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __union(r0)
            r8 = r0
            r0 = r8
            int r0 = r0.getSize()
            org.lwjgl.system.windows.LARGE_INTEGER.SIZEOF = r0
            r0 = r8
            int r0 = r0.getAlignment()
            org.lwjgl.system.windows.LARGE_INTEGER.ALIGNOF = r0
            r0 = r8
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.LARGE_INTEGER.U = r0
            r0 = r8
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.LARGE_INTEGER.U_LOWPART = r0
            r0 = r8
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.LARGE_INTEGER.U_HIGHPART = r0
            r0 = r8
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.LARGE_INTEGER.QUADPART = r0
            return
    }
}
