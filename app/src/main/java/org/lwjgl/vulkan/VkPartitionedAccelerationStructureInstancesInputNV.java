package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureInstancesInputNV.class */
public class VkPartitionedAccelerationStructureInstancesInputNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int INSTANCECOUNT = 0;
    public static final int MAXINSTANCEPERPARTITIONCOUNT = 0;
    public static final int PARTITIONCOUNT = 0;
    public static final int MAXINSTANCEINGLOBALPARTITIONCOUNT = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureInstancesInputNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV, org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer
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
        protected org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int instanceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.ninstanceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxInstancePerPartitionCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstancePerPartitionCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int partitionCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.npartitionCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxInstanceInGlobalPartitionCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstanceInGlobalPartitionCount(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000570003(0x3ba37c93, float:0.0049892156)
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer pNext(org.lwjgl.vulkan.VkPartitionedAccelerationStructureFlagsNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureFlagsNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer flags(@org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer instanceCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.ninstanceCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer maxInstancePerPartitionCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstancePerPartitionCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer partitionCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.npartitionCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer maxInstanceInGlobalPartitionCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstanceInGlobalPartitionCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m5119create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.create(r0)
                org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPartitionedAccelerationStructureInstancesInputNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPartitionedAccelerationStructureInstancesInputNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
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

    @org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int instanceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninstanceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxInstancePerPartitionCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxInstancePerPartitionCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int partitionCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npartitionCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxInstanceInGlobalPartitionCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxInstanceInGlobalPartitionCount(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000570003(0x3ba37c93, float:0.0049892156)
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV pNext(org.lwjgl.vulkan.VkPartitionedAccelerationStructureFlagsNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureFlagsNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV flags(@org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV instanceCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninstanceCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV maxInstancePerPartitionCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxInstancePerPartitionCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV partitionCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npartitionCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV maxInstanceInGlobalPartitionCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxInstanceInGlobalPartitionCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV set(int r5, long r6, int r8, int r9, int r10, int r11, int r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = r0.instanceCount(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = r0.maxInstancePerPartitionCount(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = r0.partitionCount(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = r0.maxInstanceInGlobalPartitionCount(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV set(org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV malloc() {
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV calloc() {
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV create() {
            int r0 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV create(long r6) {
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer
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

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer r0 = new org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ninstanceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.INSTANCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxInstancePerPartitionCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.MAXINSTANCEPERPARTITIONCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npartitionCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.PARTITIONCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxInstanceInGlobalPartitionCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.MAXINSTANCEINGLOBALPARTITIONCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ninstanceCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.INSTANCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmaxInstancePerPartitionCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.MAXINSTANCEPERPARTITIONCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npartitionCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.PARTITIONCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmaxInstanceInGlobalPartitionCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.MAXINSTANCEINGLOBALPARTITIONCOUNT
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
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.INSTANCECOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.MAXINSTANCEPERPARTITIONCOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.PARTITIONCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPartitionedAccelerationStructureInstancesInputNV.MAXINSTANCEINGLOBALPARTITIONCOUNT = r0
            return
    }
}
