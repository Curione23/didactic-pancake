package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyProperties.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyProperties.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyProperties.class */
public class VkQueueFamilyProperties extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkQueueFamilyProperties> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int QUEUEFLAGS = 0;
    public static final int QUEUECOUNT = 0;
    public static final int TIMESTAMPVALIDBITS = 0;
    public static final int MINIMAGETRANSFERGRANULARITY = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyProperties$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyProperties$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyProperties$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkQueueFamilyProperties, org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkQueueFamilyProperties ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
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
        protected org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkQueueFamilyProperties getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkQueueFamilyProperties r0 = org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkQueueFlags")
        public int queueFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkQueueFamilyProperties.nqueueFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int queueCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkQueueFamilyProperties.nqueueCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int timestampValidBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkQueueFamilyProperties.ntimestampValidBits(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent3D minImageTransferGranularity() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkQueueFamilyProperties.nminImageTransferGranularity(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkQueueFamilyProperties r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkQueueFamilyProperties r0 = org.lwjgl.vulkan.VkQueueFamilyProperties.create(r0)
                org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkQueueFamilyProperties(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkQueueFamilyProperties create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkQueueFamilyProperties(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkQueueFlags")
    public int queueFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nqueueFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int queueCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nqueueCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int timestampValidBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntimestampValidBits(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent3D minImageTransferGranularity() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent3D r0 = nminImageTransferGranularity(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyProperties malloc() {
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyProperties calloc() {
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyProperties create() {
            int r0 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyProperties create(long r6) {
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkQueueFamilyProperties createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer
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

    public static org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueueFamilyProperties mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueueFamilyProperties callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueueFamilyProperties mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueueFamilyProperties callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyProperties malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyProperties calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyProperties.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyProperties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nqueueFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueueFamilyProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.QUEUEFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nqueueCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueueFamilyProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.QUEUECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntimestampValidBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueueFamilyProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueueFamilyProperties.TIMESTAMPVALIDBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent3D nminImageTransferGranularity(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkQueueFamilyProperties.MINIMAGETRANSFERGRANULARITY
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkExtent3D.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkQueueFamilyProperties r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkExtent3D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent3D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkQueueFamilyProperties.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkQueueFamilyProperties.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkQueueFamilyProperties.QUEUEFLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkQueueFamilyProperties.QUEUECOUNT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkQueueFamilyProperties.TIMESTAMPVALIDBITS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkQueueFamilyProperties.MINIMAGETRANSFERGRANULARITY = r0
            return
    }
}
