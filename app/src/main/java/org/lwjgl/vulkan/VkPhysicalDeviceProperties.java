package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties.class */
public class VkPhysicalDeviceProperties extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceProperties> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int APIVERSION = 0;
    public static final int DRIVERVERSION = 0;
    public static final int VENDORID = 0;
    public static final int DEVICEID = 0;
    public static final int DEVICETYPE = 0;
    public static final int DEVICENAME = 0;
    public static final int PIPELINECACHEUUID = 0;
    public static final int LIMITS = 0;
    public static final int SPARSEPROPERTIES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceProperties, org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceProperties ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceProperties getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int apiVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.napiVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int driverVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.ndriverVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vendorID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.nvendorID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int deviceID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.ndeviceID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPhysicalDeviceType")
        public int deviceType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.ndeviceType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public java.nio.ByteBuffer deviceName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.ndeviceName(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public java.lang.String deviceNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.ndeviceNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[VK_UUID_SIZE]")
        public java.nio.ByteBuffer pipelineCacheUUID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.npipelineCacheUUID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte pipelineCacheUUID(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.npipelineCacheUUID(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceLimits limits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPhysicalDeviceLimits r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.nlimits(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties sparseProperties() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.nsparseProperties(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceProperties(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceProperties create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceProperties(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int apiVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = napiVersion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int driverVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndriverVersion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int vendorID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvendorID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int deviceID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndeviceID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPhysicalDeviceType")
    public int deviceType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndeviceType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public java.nio.ByteBuffer deviceName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndeviceName(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public java.lang.String deviceNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = ndeviceNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[VK_UUID_SIZE]")
    public java.nio.ByteBuffer pipelineCacheUUID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npipelineCacheUUID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte pipelineCacheUUID(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = npipelineCacheUUID(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceLimits limits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPhysicalDeviceLimits r0 = nlimits(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties sparseProperties() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties r0 = nsparseProperties(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int napiVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.APIVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndriverVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.DRIVERVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvendorID(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.VENDORID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndeviceID(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.DEVICEID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndeviceType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.DEVICETYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndeviceName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.DEVICENAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 256(0x100, float:3.59E-43)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String ndeviceNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.DEVICENAME
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static java.nio.ByteBuffer npipelineCacheUUID(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.PIPELINECACHEUUID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 16
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npipelineCacheUUID(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.PIPELINECACHEUUID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 16
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLimits nlimits(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.LIMITS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkPhysicalDeviceLimits r0 = org.lwjgl.vulkan.VkPhysicalDeviceLimits.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties nsparseProperties(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SPARSEPROPERTIES
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
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
            r3 = 1
            r4 = 256(0x100, float:3.59E-43)
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            r4 = 16
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceLimits.SIZEOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceLimits.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties.SIZEOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceSparseProperties.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties.APIVERSION = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties.DRIVERVERSION = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties.VENDORID = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties.DEVICEID = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties.DEVICETYPE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties.DEVICENAME = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties.PIPELINECACHEUUID = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties.LIMITS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties.SPARSEPROPERTIES = r0
            return
    }
}
