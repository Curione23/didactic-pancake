package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorBinaryHeaderVersionOneEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorBinaryHeaderVersionOneEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorBinaryHeaderVersionOneEXT.class */
public class VkDeviceFaultVendorBinaryHeaderVersionOneEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int HEADERSIZE = 0;
    public static final int HEADERVERSION = 0;
    public static final int VENDORID = 0;
    public static final int DEVICEID = 0;
    public static final int DRIVERVERSION = 0;
    public static final int PIPELINECACHEUUID = 0;
    public static final int APPLICATIONNAMEOFFSET = 0;
    public static final int APPLICATIONVERSION = 0;
    public static final int ENGINENAMEOFFSET = 0;
    public static final int ENGINEVERSION = 0;
    public static final int APIVERSION = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT, org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int headerSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nheaderSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceFaultVendorBinaryHeaderVersionEXT")
        public int headerVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nheaderVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vendorID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nvendorID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int deviceID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ndeviceID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int driverVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ndriverVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[VK_UUID_SIZE]")
        public java.nio.ByteBuffer pipelineCacheUUID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.npipelineCacheUUID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte pipelineCacheUUID(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.npipelineCacheUUID(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int applicationNameOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napplicationNameOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int applicationVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napplicationVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int engineNameOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nengineNameOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int engineVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nengineVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int apiVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napiVersion(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer headerSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nheaderSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer headerVersion(@org.lwjgl.system.NativeType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nheaderVersion(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer vendorID(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nvendorID(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer deviceID(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ndeviceID(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer driverVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ndriverVersion(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer pipelineCacheUUID(@org.lwjgl.system.NativeType("uint8_t[VK_UUID_SIZE]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.npipelineCacheUUID(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer pipelineCacheUUID(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.npipelineCacheUUID(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer applicationNameOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napplicationNameOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer applicationVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napplicationVersion(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer engineNameOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nengineNameOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer engineVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nengineVersion(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer apiVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napiVersion(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.create(r0)
                org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDeviceFaultVendorBinaryHeaderVersionOneEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int headerSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheaderSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceFaultVendorBinaryHeaderVersionEXT")
    public int headerVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheaderVersion(r0)
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int driverVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndriverVersion(r0)
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int applicationNameOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = napplicationNameOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int applicationVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = napplicationVersion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int engineNameOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nengineNameOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int engineVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nengineVersion(r0)
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

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheaderSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerVersion(@org.lwjgl.system.NativeType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheaderVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT vendorID(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvendorID(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT deviceID(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndeviceID(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT driverVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndriverVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT pipelineCacheUUID(@org.lwjgl.system.NativeType("uint8_t[VK_UUID_SIZE]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npipelineCacheUUID(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT pipelineCacheUUID(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            npipelineCacheUUID(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationNameOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            napplicationNameOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            napplicationVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineNameOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nengineNameOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nengineVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT apiVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            napiVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT set(int r4, int r5, int r6, int r7, int r8, java.nio.ByteBuffer r9, int r10, int r11, int r12, int r13, int r14) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.headerSize(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.headerVersion(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.vendorID(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.deviceID(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.driverVersion(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.pipelineCacheUUID(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.applicationNameOffset(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.applicationVersion(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.engineNameOffset(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.engineVersion(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.apiVersion(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT set(org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT malloc() {
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT calloc() {
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT create() {
            int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT create(long r6) {
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nheaderSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.HEADERSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nheaderVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.HEADERVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvendorID(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.VENDORID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndeviceID(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.DEVICEID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndriverVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.DRIVERVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer npipelineCacheUUID(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.PIPELINECACHEUUID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 16
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npipelineCacheUUID(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.PIPELINECACHEUUID
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

    public static int napplicationNameOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.APPLICATIONNAMEOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int napplicationVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.APPLICATIONVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nengineNameOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ENGINENAMEOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nengineVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ENGINEVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int napiVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.APIVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nheaderSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.HEADERSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nheaderVersion(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.HEADERVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvendorID(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.VENDORID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndeviceID(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.DEVICEID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndriverVersion(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.DRIVERVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npipelineCacheUUID(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 16
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.PIPELINECACHEUUID
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npipelineCacheUUID(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.PIPELINECACHEUUID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 16
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void napplicationNameOffset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.APPLICATIONNAMEOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void napplicationVersion(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.APPLICATIONVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nengineNameOffset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ENGINENAMEOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nengineVersion(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ENGINEVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void napiVersion(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.APIVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
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
            r4 = 16
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.HEADERSIZE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.HEADERVERSION = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.VENDORID = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.DEVICEID = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.DRIVERVERSION = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.PIPELINECACHEUUID = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.APPLICATIONNAMEOFFSET = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.APPLICATIONVERSION = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ENGINENAMEOFFSET = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ENGINEVERSION = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorBinaryHeaderVersionOneEXT.APIVERSION = r0
            return
    }
}
