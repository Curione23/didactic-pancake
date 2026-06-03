package org.lwjgl.util.vma;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationInfo.class */
public class VmaAllocationInfo extends org.lwjgl.system.Struct<org.lwjgl.util.vma.VmaAllocationInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int MEMORYTYPE = 0;
    public static final int DEVICEMEMORY = 0;
    public static final int OFFSET = 0;
    public static final int SIZE = 0;
    public static final int PMAPPEDDATA = 0;
    public static final int PUSERDATA = 0;
    public static final int PNAME = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.vma.VmaAllocationInfo, org.lwjgl.util.vma.VmaAllocationInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.vma.VmaAllocationInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
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
        protected org.lwjgl.util.vma.VmaAllocationInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.vma.VmaAllocationInfo getElementFactory() {
                r2 = this;
                org.lwjgl.util.vma.VmaAllocationInfo r0 = org.lwjgl.util.vma.VmaAllocationInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int memoryType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.vma.VmaAllocationInfo.nmemoryType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceMemory")
        public long deviceMemory() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaAllocationInfo.ndeviceMemory(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaAllocationInfo.noffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaAllocationInfo.nsize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pMappedData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaAllocationInfo.npMappedData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pUserData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaAllocationInfo.npUserData(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer pName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.vma.VmaAllocationInfo.npName(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String pNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.vma.VmaAllocationInfo.npNameString(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaAllocationInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.vma.VmaAllocationInfo r0 = org.lwjgl.util.vma.VmaAllocationInfo.create(r0)
                org.lwjgl.util.vma.VmaAllocationInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VmaAllocationInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.vma.VmaAllocationInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.vma.VmaAllocationInfo r0 = new org.lwjgl.util.vma.VmaAllocationInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VmaAllocationInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int memoryType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmemoryType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceMemory")
    public long deviceMemory() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndeviceMemory(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = noffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long pMappedData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npMappedData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long pUserData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npUserData(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer pName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npName(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String pNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = npNameString(r0)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationInfo malloc() {
            org.lwjgl.util.vma.VmaAllocationInfo r0 = new org.lwjgl.util.vma.VmaAllocationInfo
            r1 = r0
            int r2 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationInfo calloc() {
            org.lwjgl.util.vma.VmaAllocationInfo r0 = new org.lwjgl.util.vma.VmaAllocationInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationInfo create() {
            int r0 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.vma.VmaAllocationInfo r0 = new org.lwjgl.util.vma.VmaAllocationInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationInfo create(long r6) {
            org.lwjgl.util.vma.VmaAllocationInfo r0 = new org.lwjgl.util.vma.VmaAllocationInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaAllocationInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaAllocationInfo r0 = new org.lwjgl.util.vma.VmaAllocationInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationInfo.Buffer malloc(int r6) {
            org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationInfo.Buffer calloc(int r7) {
            org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationInfo$Buffer
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

    public static org.lwjgl.util.vma.VmaAllocationInfo.Buffer create(long r6, int r8) {
            org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaAllocationInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaAllocationInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaAllocationInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaAllocationInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaAllocationInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.vma.VmaAllocationInfo r0 = new org.lwjgl.util.vma.VmaAllocationInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.ALIGNOF
            int r4 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.vma.VmaAllocationInfo r0 = new org.lwjgl.util.vma.VmaAllocationInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaAllocationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nmemoryType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.MEMORYTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndeviceMemory(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.DEVICEMEMORY
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long noffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nsize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long npMappedData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocationInfo.PMAPPEDDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long npUserData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocationInfo.PUSERDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer npName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocationInfo.PNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String npNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocationInfo.PNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.vma.VmaAllocationInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.vma.VmaAllocationInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.vma.VmaAllocationInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.vma.VmaAllocationInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationInfo.MEMORYTYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationInfo.DEVICEMEMORY = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationInfo.OFFSET = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationInfo.SIZE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationInfo.PMAPPEDDATA = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationInfo.PUSERDATA = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationInfo.PNAME = r0
            return
    }
}
