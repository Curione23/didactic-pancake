package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeneratedCommandsInfoEXT.class */
public class VkGeneratedCommandsInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int SHADERSTAGES = 0;
    public static final int INDIRECTEXECUTIONSET = 0;
    public static final int INDIRECTCOMMANDSLAYOUT = 0;
    public static final int INDIRECTADDRESS = 0;
    public static final int INDIRECTADDRESSSIZE = 0;
    public static final int PREPROCESSADDRESS = 0;
    public static final int PREPROCESSSIZE = 0;
    public static final int MAXSEQUENCECOUNT = 0;
    public static final int SEQUENCECOUNTADDRESS = 0;
    public static final int MAXDRAWCOUNT = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeneratedCommandsInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT, org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer
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
        protected org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderStageFlags")
        public int shaderStages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nshaderStages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT")
        public long indirectExecutionSet() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nindirectExecutionSet(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutEXT")
        public long indirectCommandsLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nindirectCommandsLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long indirectAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nindirectAddress(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long indirectAddressSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nindirectAddressSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long preprocessAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.npreprocessAddress(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long preprocessSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.npreprocessSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxSequenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nmaxSequenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long sequenceCountAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nsequenceCountAddress(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDrawCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nmaxDrawCount(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000572004(0x3ba38464, float:0.0049901474)
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer pNext(org.lwjgl.vulkan.VkGeneratedCommandsPipelineInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkGeneratedCommandsPipelineInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer pNext(org.lwjgl.vulkan.VkGeneratedCommandsShaderInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkGeneratedCommandsShaderInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer shaderStages(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nshaderStages(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer indirectExecutionSet(@org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nindirectExecutionSet(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer indirectCommandsLayout(@org.lwjgl.system.NativeType("VkIndirectCommandsLayoutEXT") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nindirectCommandsLayout(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer indirectAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nindirectAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer indirectAddressSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nindirectAddressSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer preprocessAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.npreprocessAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer preprocessSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.npreprocessSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer maxSequenceCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nmaxSequenceCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer sequenceCountAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nsequenceCountAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer maxDrawCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.nmaxDrawCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4722create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.create(r0)
                org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkGeneratedCommandsInfoEXT(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkGeneratedCommandsInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkShaderStageFlags")
    public int shaderStages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderStages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT")
    public long indirectExecutionSet() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nindirectExecutionSet(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutEXT")
    public long indirectCommandsLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nindirectCommandsLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long indirectAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nindirectAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long indirectAddressSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nindirectAddressSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long preprocessAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npreprocessAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long preprocessSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npreprocessSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxSequenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxSequenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long sequenceCountAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsequenceCountAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDrawCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDrawCount(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000572004(0x3ba38464, float:0.0049901474)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT pNext(org.lwjgl.vulkan.VkGeneratedCommandsPipelineInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkGeneratedCommandsPipelineInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT pNext(org.lwjgl.vulkan.VkGeneratedCommandsShaderInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkGeneratedCommandsShaderInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT shaderStages(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nshaderStages(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT indirectExecutionSet(@org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindirectExecutionSet(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT indirectCommandsLayout(@org.lwjgl.system.NativeType("VkIndirectCommandsLayoutEXT") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindirectCommandsLayout(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT indirectAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindirectAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT indirectAddressSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindirectAddressSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT preprocessAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npreprocessAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT preprocessSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npreprocessSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT maxSequenceCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxSequenceCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT sequenceCountAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsequenceCountAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT maxDrawCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxDrawCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT set(int r5, long r6, int r8, long r9, long r11, long r13, long r15, long r17, long r19, int r21, long r22, int r24) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.shaderStages(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.indirectExecutionSet(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.indirectCommandsLayout(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.indirectAddress(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.indirectAddressSize(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.preprocessAddress(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.preprocessSize(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.maxSequenceCount(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.sequenceCountAddress(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.maxDrawCount(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT set(org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT malloc() {
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT calloc() {
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nshaderStages(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SHADERSTAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long nindirectExecutionSet(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTEXECUTIONSET
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nindirectCommandsLayout(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTCOMMANDSLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nindirectAddress(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nindirectAddressSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTADDRESSSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long npreprocessAddress(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.PREPROCESSADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long npreprocessSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.PREPROCESSSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nmaxSequenceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.MAXSEQUENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long nsequenceCountAddress(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SEQUENCECOUNTADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nmaxDrawCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.MAXDRAWCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nshaderStages(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SHADERSTAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nindirectExecutionSet(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTEXECUTIONSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nindirectCommandsLayout(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTCOMMANDSLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nindirectAddress(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nindirectAddressSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTADDRESSSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void npreprocessAddress(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.PREPROCESSADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void npreprocessSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.PREPROCESSSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nmaxSequenceCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.MAXSEQUENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsequenceCountAddress(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SEQUENCECOUNTADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nmaxDrawCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.MAXDRAWCOUNT
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
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 12
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.POINTER_SIZE
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
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
            r1 = r0
            r2 = 10
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SHADERSTAGES = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTEXECUTIONSET = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTCOMMANDSLAYOUT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTADDRESS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.INDIRECTADDRESSSIZE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.PREPROCESSADDRESS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.PREPROCESSSIZE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.MAXSEQUENCECOUNT = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.SEQUENCECOUNTADDRESS = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT.MAXDRAWCOUNT = r0
            return
    }
}
