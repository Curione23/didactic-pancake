package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMicromapBuildInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMicromapBuildInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMicromapBuildInfoEXT.class */
public class VkMicromapBuildInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkMicromapBuildInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int TYPE = 0;
    public static final int FLAGS = 0;
    public static final int MODE = 0;
    public static final int DSTMICROMAP = 0;
    public static final int USAGECOUNTSCOUNT = 0;
    public static final int PUSAGECOUNTS = 0;
    public static final int PPUSAGECOUNTS = 0;
    public static final int DATA = 0;
    public static final int SCRATCHDATA = 0;
    public static final int TRIANGLEARRAY = 0;
    public static final int TRIANGLEARRAYSTRIDE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMicromapBuildInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMicromapBuildInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMicromapBuildInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkMicromapBuildInfoEXT, org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkMicromapBuildInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkMicromapBuildInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkMicromapTypeEXT")
        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ntype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBuildMicromapFlagsEXT")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBuildMicromapModeEXT")
        public int mode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nmode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkMicromapEXT")
        public long dstMicromap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ndstMicromap(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int usageCountsCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nusageCountsCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *")
        public org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer pUsageCounts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkMicromapUsageEXT$Buffer r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.npUsageCounts(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *")
        public org.lwjgl.PointerBuffer ppUsageCounts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nppUsageCounts(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR data() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ndata(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressKHR scratchData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nscratchData(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR triangleArray() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ntriangleArray(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long triangleArrayStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ntriangleArrayStride(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000396000(0x3ba0d4e0, float:0.004908189)
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer type(@org.lwjgl.system.NativeType("VkMicromapTypeEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ntype(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer flags(@org.lwjgl.system.NativeType("VkBuildMicromapFlagsEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer mode(@org.lwjgl.system.NativeType("VkBuildMicromapModeEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nmode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer dstMicromap(@org.lwjgl.system.NativeType("VkMicromapEXT") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ndstMicromap(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer usageCountsCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nusageCountsCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer pUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *") org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.npUsageCounts(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer ppUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nppUsageCounts(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer data(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ndata(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer data(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.data()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer scratchData(org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.nscratchData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer scratchData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r1 = r1.scratchData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer triangleArray(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ntriangleArray(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer triangleArray(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.triangleArray()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer triangleArrayStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ntriangleArrayStride(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.create(r0)
                org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkMicromapBuildInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkMicromapBuildInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkMicromapBuildInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkStructureType")
    public int sType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkMicromapTypeEXT")
    public int type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBuildMicromapFlagsEXT")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBuildMicromapModeEXT")
    public int mode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkMicromapEXT")
    public long dstMicromap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndstMicromap(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int usageCountsCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nusageCountsCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *")
    public org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer pUsageCounts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkMicromapUsageEXT$Buffer r0 = npUsageCounts(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *")
    public org.lwjgl.PointerBuffer ppUsageCounts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = nppUsageCounts(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR data() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = ndata(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressKHR scratchData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r0 = nscratchData(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR triangleArray() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = ntriangleArray(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long triangleArrayStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ntriangleArrayStride(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000396000(0x3ba0d4e0, float:0.004908189)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT type(@org.lwjgl.system.NativeType("VkMicromapTypeEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT flags(@org.lwjgl.system.NativeType("VkBuildMicromapFlagsEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT mode(@org.lwjgl.system.NativeType("VkBuildMicromapModeEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT dstMicromap(@org.lwjgl.system.NativeType("VkMicromapEXT") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstMicromap(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT usageCountsCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nusageCountsCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT pUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *") org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npUsageCounts(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT ppUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nppUsageCounts(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT data(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndata(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT data(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.data()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT scratchData(org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nscratchData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT scratchData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r1 = r1.scratchData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT triangleArray(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntriangleArray(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT triangleArray(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.triangleArray()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT triangleArrayStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ntriangleArrayStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT set(int r5, long r6, int r8, int r9, int r10, long r11, int r13, @javax.annotation.Nullable org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r14, @javax.annotation.Nullable org.lwjgl.PointerBuffer r15, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r16, org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r17, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r18, long r19) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.type(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.flags(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.mode(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.dstMicromap(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.usageCountsCount(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.pUsageCounts(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.ppUsageCounts(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.data(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.scratchData(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.triangleArray(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.triangleArrayStride(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMicromapBuildInfoEXT set(org.lwjgl.vulkan.VkMicromapBuildInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT malloc() {
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT calloc() {
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMicromapBuildInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.MODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndstMicromap(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.DSTMICROMAP
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nusageCountsCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.USAGECOUNTSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer npUsageCounts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.PUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nusageCountsCount(r1)
            org.lwjgl.vulkan.VkMicromapUsageEXT$Buffer r0 = org.lwjgl.vulkan.VkMicromapUsageEXT.createSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.PointerBuffer nppUsageCounts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.PPUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nusageCountsCount(r1)
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR ndata(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressKHR nscratchData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SCRATCHDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR ntriangleArray(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.TRIANGLEARRAY
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long ntriangleArrayStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.TRIANGLEARRAYSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ntype(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.MODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndstMicromap(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.DSTMICROMAP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nusageCountsCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.USAGECOUNTSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npUsageCounts(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.PUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nppUsageCounts(long r5, @javax.annotation.Nullable org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.PPUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndata(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.DATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nscratchData(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SCRATCHDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ntriangleArray(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.TRIANGLEARRAY
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ntriangleArrayStride(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.TRIANGLEARRAYSTRIDE
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
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 13
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.POINTER_SIZE
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkMicromapBuildInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.TYPE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.FLAGS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.MODE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.DSTMICROMAP = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.USAGECOUNTSCOUNT = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.PUSAGECOUNTS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.PPUSAGECOUNTS = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.DATA = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.SCRATCHDATA = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.TRIANGLEARRAY = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMicromapBuildInfoEXT.TRIANGLEARRAYSTRIDE = r0
            return
    }
}
