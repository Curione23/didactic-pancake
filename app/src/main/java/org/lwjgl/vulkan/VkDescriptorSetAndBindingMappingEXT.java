package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorSetAndBindingMappingEXT.class */
public class VkDescriptorSetAndBindingMappingEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int DESCRIPTORSET = 0;
    public static final int FIRSTBINDING = 0;
    public static final int BINDINGCOUNT = 0;
    public static final int RESOURCEMASK = 0;
    public static final int SOURCE = 0;
    public static final int SOURCEDATA = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorSetAndBindingMappingEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT, org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer
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
        protected org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int descriptorSet() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.ndescriptorSet(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int firstBinding() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nfirstBinding(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int bindingCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nbindingCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSpirvResourceTypeFlagsEXT")
        public int resourceMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nresourceMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDescriptorMappingSourceEXT")
        public int source() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nsource(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT sourceData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nsourceData(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000135005(0x3b9cd95d, float:0.004786654)
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer pNext(org.lwjgl.vulkan.VkPushConstantBankInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPushConstantBankInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer descriptorSet(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.ndescriptorSet(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer firstBinding(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nfirstBinding(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer bindingCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nbindingCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer resourceMask(@org.lwjgl.system.NativeType("VkSpirvResourceTypeFlagsEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nresourceMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer source(@org.lwjgl.system.NativeType("VkDescriptorMappingSourceEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nsource(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer sourceData(org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.nsourceData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer sourceData(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r1 = r1.sourceData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4405create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.create(r0)
                org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDescriptorSetAndBindingMappingEXT(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDescriptorSetAndBindingMappingEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int descriptorSet() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorSet(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int firstBinding() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfirstBinding(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int bindingCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbindingCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSpirvResourceTypeFlagsEXT")
    public int resourceMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nresourceMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDescriptorMappingSourceEXT")
    public int source() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsource(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT sourceData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = nsourceData(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000135005(0x3b9cd95d, float:0.004786654)
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT pNext(org.lwjgl.vulkan.VkPushConstantBankInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPushConstantBankInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT descriptorSet(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndescriptorSet(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT firstBinding(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfirstBinding(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT bindingCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbindingCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT resourceMask(@org.lwjgl.system.NativeType("VkSpirvResourceTypeFlagsEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresourceMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT source(@org.lwjgl.system.NativeType("VkDescriptorMappingSourceEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsource(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT sourceData(org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsourceData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT sourceData(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r1 = r1.sourceData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT set(int r5, long r6, int r8, int r9, int r10, int r11, int r12, org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.descriptorSet(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.firstBinding(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.bindingCount(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.resourceMask(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.source(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.sourceData(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT set(org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT malloc() {
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT calloc() {
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT create() {
            int r0 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT create(long r6) {
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ndescriptorSet(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.DESCRIPTORSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nfirstBinding(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.FIRSTBINDING
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbindingCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.BINDINGCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nresourceMask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.RESOURCEMASK
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsource(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT nsourceData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SOURCEDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.create(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndescriptorSet(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.DESCRIPTORSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nfirstBinding(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.FIRSTBINDING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nbindingCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.BINDINGCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nresourceMask(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.RESOURCEMASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsource(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsourceData(long r7, org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SOURCEDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.POINTER_SIZE
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
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.DESCRIPTORSET = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.FIRSTBINDING = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.BINDINGCOUNT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.RESOURCEMASK = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SOURCE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT.SOURCEDATA = r0
            return
    }
}
