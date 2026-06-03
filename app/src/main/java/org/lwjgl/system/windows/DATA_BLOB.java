package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DATA_BLOB.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DATA_BLOB.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DATA_BLOB.class */
public class DATA_BLOB extends org.lwjgl.system.Struct<org.lwjgl.system.windows.DATA_BLOB> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int CBDATA = 0;
    public static final int PBDATA = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DATA_BLOB$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DATA_BLOB$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/DATA_BLOB$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.windows.DATA_BLOB, org.lwjgl.system.windows.DATA_BLOB.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.windows.DATA_BLOB ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
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
        protected org.lwjgl.system.windows.DATA_BLOB.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.windows.DATA_BLOB getElementFactory() {
                r2 = this;
                org.lwjgl.system.windows.DATA_BLOB r0 = org.lwjgl.system.windows.DATA_BLOB.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int cbData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.DATA_BLOB.ncbData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BYTE *")
        public java.nio.ByteBuffer pbData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.windows.DATA_BLOB.npbData(r0)
                return r0
        }

        public org.lwjgl.system.windows.DATA_BLOB.Buffer pbData(@org.lwjgl.system.NativeType("BYTE *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.DATA_BLOB.npbData(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.DATA_BLOB r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.DATA_BLOB$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.windows.DATA_BLOB r0 = org.lwjgl.system.windows.DATA_BLOB.create(r0)
                org.lwjgl.system.windows.DATA_BLOB.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected DATA_BLOB(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.windows.DATA_BLOB create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.windows.DATA_BLOB r0 = new org.lwjgl.system.windows.DATA_BLOB
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public DATA_BLOB(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int cbData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncbData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BYTE *")
    public java.nio.ByteBuffer pbData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npbData(r0)
            return r0
    }

    public org.lwjgl.system.windows.DATA_BLOB pbData(@org.lwjgl.system.NativeType("BYTE *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npbData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.DATA_BLOB set(org.lwjgl.system.windows.DATA_BLOB r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.windows.DATA_BLOB malloc() {
            org.lwjgl.system.windows.DATA_BLOB r0 = new org.lwjgl.system.windows.DATA_BLOB
            r1 = r0
            int r2 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DATA_BLOB calloc() {
            org.lwjgl.system.windows.DATA_BLOB r0 = new org.lwjgl.system.windows.DATA_BLOB
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DATA_BLOB create() {
            int r0 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.windows.DATA_BLOB r0 = new org.lwjgl.system.windows.DATA_BLOB
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DATA_BLOB create(long r6) {
            org.lwjgl.system.windows.DATA_BLOB r0 = new org.lwjgl.system.windows.DATA_BLOB
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.DATA_BLOB createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.DATA_BLOB r0 = new org.lwjgl.system.windows.DATA_BLOB
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.DATA_BLOB.Buffer malloc(int r6) {
            org.lwjgl.system.windows.DATA_BLOB$Buffer r0 = new org.lwjgl.system.windows.DATA_BLOB$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DATA_BLOB.Buffer calloc(int r7) {
            org.lwjgl.system.windows.DATA_BLOB$Buffer r0 = new org.lwjgl.system.windows.DATA_BLOB$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DATA_BLOB.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.windows.DATA_BLOB$Buffer r0 = new org.lwjgl.system.windows.DATA_BLOB$Buffer
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

    public static org.lwjgl.system.windows.DATA_BLOB.Buffer create(long r6, int r8) {
            org.lwjgl.system.windows.DATA_BLOB$Buffer r0 = new org.lwjgl.system.windows.DATA_BLOB$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.DATA_BLOB.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.DATA_BLOB$Buffer r0 = new org.lwjgl.system.windows.DATA_BLOB$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.DATA_BLOB malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.windows.DATA_BLOB r0 = new org.lwjgl.system.windows.DATA_BLOB
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.DATA_BLOB.ALIGNOF
            int r4 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DATA_BLOB calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.windows.DATA_BLOB r0 = new org.lwjgl.system.windows.DATA_BLOB
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DATA_BLOB.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DATA_BLOB.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.DATA_BLOB$Buffer r0 = new org.lwjgl.system.windows.DATA_BLOB$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.DATA_BLOB.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.DATA_BLOB.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.DATA_BLOB$Buffer r0 = new org.lwjgl.system.windows.DATA_BLOB$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.DATA_BLOB.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.DATA_BLOB.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ncbData(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DATA_BLOB.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DATA_BLOB.CBDATA
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer npbData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.DATA_BLOB.PBDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ncbData(r1)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static void ncbData(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.DATA_BLOB.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.DATA_BLOB.CBDATA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npbData(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.DATA_BLOB.PBDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            ncbData(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.DATA_BLOB.PBDATA
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
            org.lwjgl.system.windows.DATA_BLOB r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.system.windows.DATA_BLOB.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.windows.DATA_BLOB.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.windows.DATA_BLOB.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DATA_BLOB.CBDATA = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.DATA_BLOB.PBDATA = r0
            return
    }
}
