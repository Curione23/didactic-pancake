package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceTensorPropertiesARM.class */
public class VkPhysicalDeviceTensorPropertiesARM extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int MAXTENSORDIMENSIONCOUNT = 0;
    public static final int MAXTENSORELEMENTS = 0;
    public static final int MAXPERDIMENSIONTENSORELEMENTS = 0;
    public static final int MAXTENSORSTRIDE = 0;
    public static final int MAXTENSORSIZE = 0;
    public static final int MAXTENSORSHADERACCESSARRAYLENGTH = 0;
    public static final int MAXTENSORSHADERACCESSSIZE = 0;
    public static final int MAXDESCRIPTORSETSTORAGETENSORS = 0;
    public static final int MAXPERSTAGEDESCRIPTORSETSTORAGETENSORS = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGETENSORS = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGETENSORS = 0;
    public static final int SHADERSTORAGETENSORARRAYNONUNIFORMINDEXINGNATIVE = 0;
    public static final int SHADERTENSORSUPPORTEDSTAGES = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceTensorPropertiesARM$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM, org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTensorDimensionCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nmaxTensorDimensionCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long maxTensorElements() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nmaxTensorElements(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long maxPerDimensionTensorElements() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nmaxPerDimensionTensorElements(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int64_t")
        public long maxTensorStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nmaxTensorStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long maxTensorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nmaxTensorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTensorShaderAccessArrayLength() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nmaxTensorShaderAccessArrayLength(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTensorShaderAccessSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nmaxTensorShaderAccessSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetStorageTensors() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nmaxDescriptorSetStorageTensors(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorSetStorageTensors() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nmaxPerStageDescriptorSetStorageTensors(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageTensors() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nmaxDescriptorSetUpdateAfterBindStorageTensors(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageTensors() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nmaxPerStageDescriptorUpdateAfterBindStorageTensors(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderStorageTensorArrayNonUniformIndexingNative() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nshaderStorageTensorArrayNonUniformIndexingNative(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderStageFlags")
        public int shaderTensorSupportedStages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nshaderTensorSupportedStages(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000460004(0x3ba1cee4, float:0.0049379934)
                org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m6104create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceTensorPropertiesARM(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceTensorPropertiesARM(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxTensorDimensionCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxTensorDimensionCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long maxTensorElements() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxTensorElements(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long maxPerDimensionTensorElements() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxPerDimensionTensorElements(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int64_t")
    public long maxTensorStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxTensorStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long maxTensorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxTensorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxTensorShaderAccessArrayLength() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxTensorShaderAccessArrayLength(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxTensorShaderAccessSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxTensorShaderAccessSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetStorageTensors() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetStorageTensors(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorSetStorageTensors() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorSetStorageTensors(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageTensors() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindStorageTensors(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageTensors() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindStorageTensors(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderStorageTensorArrayNonUniformIndexingNative() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderStorageTensorArrayNonUniformIndexingNative(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderStageFlags")
    public int shaderTensorSupportedStages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderTensorSupportedStages(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000460004(0x3ba1cee4, float:0.0049379934)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM set(org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nmaxTensorDimensionCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORDIMENSIONCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long nmaxTensorElements(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORELEMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nmaxPerDimensionTensorElements(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXPERDIMENSIONTENSORELEMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nmaxTensorStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nmaxTensorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nmaxTensorShaderAccessArrayLength(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSHADERACCESSARRAYLENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxTensorShaderAccessSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSHADERACCESSSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxDescriptorSetStorageTensors(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXDESCRIPTORSETSTORAGETENSORS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxPerStageDescriptorSetStorageTensors(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXPERSTAGEDESCRIPTORSETSTORAGETENSORS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageTensors(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGETENSORS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindStorageTensors(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGETENSORS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nshaderStorageTensorArrayNonUniformIndexingNative(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SHADERSTORAGETENSORARRAYNONUNIFORMINDEXINGNATIVE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nshaderTensorSupportedStages(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SHADERTENSORSUPPORTEDSTAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 8
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
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORDIMENSIONCOUNT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORELEMENTS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXPERDIMENSIONTENSORELEMENTS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSTRIDE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSIZE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSHADERACCESSARRAYLENGTH = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSHADERACCESSSIZE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXDESCRIPTORSETSTORAGETENSORS = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXPERSTAGEDESCRIPTORSETSTORAGETENSORS = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGETENSORS = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGETENSORS = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SHADERSTORAGETENSORARRAYNONUNIFORMINDEXINGNATIVE = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceTensorPropertiesARM.SHADERTENSORSUPPORTEDSTAGES = r0
            return
    }
}
