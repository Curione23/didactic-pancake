package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureCommandsInfoNV.class */
public class VkClusterAccelerationStructureCommandsInfoNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int INPUT = 0;
    public static final int DSTIMPLICITDATA = 0;
    public static final int SCRATCHDATA = 0;
    public static final int DSTADDRESSESARRAY = 0;
    public static final int DSTSIZESARRAY = 0;
    public static final int SRCINFOSARRAY = 0;
    public static final int SRCINFOSCOUNT = 0;
    public static final int ADDRESSRESOLUTIONFLAGS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureCommandsInfoNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV, org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.npNext(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV input() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ninput(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long dstImplicitData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ndstImplicitData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long scratchData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.nscratchData(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR dstAddressesArray() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ndstAddressesArray(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR dstSizesArray() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ndstSizesArray(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR srcInfosArray() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosArray(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long srcInfosCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV")
        public int addressResolutionFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.naddressResolutionFlags(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000569006(0x3ba378ae, float:0.0049887514)
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer input(org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ninput(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer input(java.util.function.Consumer<org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r1 = r1.input()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer dstImplicitData(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ndstImplicitData(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer scratchData(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.nscratchData(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer dstAddressesArray(org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ndstAddressesArray(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer dstAddressesArray(java.util.function.Consumer<org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r1 = r1.dstAddressesArray()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer dstSizesArray(org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ndstSizesArray(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer dstSizesArray(java.util.function.Consumer<org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r1 = r1.dstSizesArray()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer srcInfosArray(org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosArray(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer srcInfosArray(java.util.function.Consumer<org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r1 = r1.srcInfosArray()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer srcInfosCount(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosCount(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer addressResolutionFlags(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.naddressResolutionFlags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4093create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.create(r0)
                org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkClusterAccelerationStructureCommandsInfoNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkClusterAccelerationStructureCommandsInfoNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
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

    @org.lwjgl.system.NativeType("void *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV input() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = ninput(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long dstImplicitData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndstImplicitData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long scratchData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nscratchData(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR dstAddressesArray() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r0 = ndstAddressesArray(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR dstSizesArray() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r0 = ndstSizesArray(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR srcInfosArray() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r0 = nsrcInfosArray(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long srcInfosCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcInfosCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV")
    public int addressResolutionFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = naddressResolutionFlags(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000569006(0x3ba378ae, float:0.0049887514)
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV input(org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninput(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV input(java.util.function.Consumer<org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r1 = r1.input()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV dstImplicitData(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstImplicitData(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV scratchData(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nscratchData(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray(org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstAddressesArray(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray(java.util.function.Consumer<org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r1 = r1.dstAddressesArray()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV dstSizesArray(org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstSizesArray(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV dstSizesArray(java.util.function.Consumer<org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r1 = r1.dstSizesArray()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV srcInfosArray(org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcInfosArray(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV srcInfosArray(java.util.function.Consumer<org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r1 = r1.srcInfosArray()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV srcInfosCount(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcInfosCount(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV addressResolutionFlags(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naddressResolutionFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV set(int r5, long r6, org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r8, long r9, long r11, org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r13, org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r14, org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r15, long r16, int r18) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.input(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.dstImplicitData(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.scratchData(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.dstAddressesArray(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.dstSizesArray(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.srcInfosArray(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.srcInfosCount(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.addressResolutionFlags(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV set(org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV malloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV calloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV create() {
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV create(long r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer
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

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV ninput(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.INPUT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.create(r0)
            return r0
    }

    public static long ndstImplicitData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.DSTIMPLICITDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nscratchData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SCRATCHDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR ndstAddressesArray(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.DSTADDRESSESARRAY
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r0 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR ndstSizesArray(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.DSTSIZESARRAY
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r0 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR nsrcInfosArray(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SRCINFOSARRAY
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r0 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.create(r0)
            return r0
    }

    public static long nsrcInfosCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SRCINFOSCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int naddressResolutionFlags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ADDRESSRESOLUTIONFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ninput(long r7, org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.INPUT
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndstImplicitData(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.DSTIMPLICITDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nscratchData(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SCRATCHDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void ndstAddressesArray(long r7, org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.DSTADDRESSESARRAY
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndstSizesArray(long r7, org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.DSTSIZESARRAY
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsrcInfosArray(long r7, org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SRCINFOSARRAY
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsrcInfosCount(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SRCINFOSCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void naddressResolutionFlags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ADDRESSRESOLUTIONFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            int r4 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkStridedDeviceAddressRegionKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.INPUT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.DSTIMPLICITDATA = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SCRATCHDATA = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.DSTADDRESSESARRAY = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.DSTSIZESARRAY = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SRCINFOSARRAY = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.SRCINFOSCOUNT = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureCommandsInfoNV.ADDRESSRESOLUTIONFLAGS = r0
            return
    }
}
