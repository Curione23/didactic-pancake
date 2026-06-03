package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.class */
public class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int MAXINDIRECTPIPELINECOUNT = 0;
    public static final int MAXINDIRECTSHADEROBJECTCOUNT = 0;
    public static final int MAXINDIRECTSEQUENCECOUNT = 0;
    public static final int MAXINDIRECTCOMMANDSTOKENCOUNT = 0;
    public static final int MAXINDIRECTCOMMANDSTOKENOFFSET = 0;
    public static final int MAXINDIRECTCOMMANDSINDIRECTSTRIDE = 0;
    public static final int SUPPORTEDINDIRECTCOMMANDSINPUTMODES = 0;
    public static final int SUPPORTEDINDIRECTCOMMANDSSHADERSTAGES = 0;
    public static final int SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESPIPELINEBINDING = 0;
    public static final int SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESSHADERBINDING = 0;
    public static final int DEVICEGENERATEDCOMMANDSTRANSFORMFEEDBACK = 0;
    public static final int DEVICEGENERATEDCOMMANDSMULTIDRAWINDIRECTCOUNT = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT, org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxIndirectPipelineCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectPipelineCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxIndirectShaderObjectCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectShaderObjectCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxIndirectSequenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectSequenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxIndirectCommandsTokenCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectCommandsTokenCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxIndirectCommandsTokenOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectCommandsTokenOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxIndirectCommandsIndirectStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectCommandsIndirectStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndirectCommandsInputModeFlagsEXT")
        public int supportedIndirectCommandsInputModes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsInputModes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderStageFlags")
        public int supportedIndirectCommandsShaderStages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsShaderStages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderStageFlags")
        public int supportedIndirectCommandsShaderStagesPipelineBinding() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsShaderStagesPipelineBinding(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderStageFlags")
        public int supportedIndirectCommandsShaderStagesShaderBinding() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsShaderStagesShaderBinding(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean deviceGeneratedCommandsTransformFeedback() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.ndeviceGeneratedCommandsTransformFeedback(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean deviceGeneratedCommandsMultiDrawIndirectCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.ndeviceGeneratedCommandsMultiDrawIndirectCount(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000572001(0x3ba38461, float:0.004990146)
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m5372create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
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
    public int maxIndirectPipelineCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxIndirectPipelineCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxIndirectShaderObjectCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxIndirectShaderObjectCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxIndirectSequenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxIndirectSequenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxIndirectCommandsTokenCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxIndirectCommandsTokenCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxIndirectCommandsTokenOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxIndirectCommandsTokenOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxIndirectCommandsIndirectStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxIndirectCommandsIndirectStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkIndirectCommandsInputModeFlagsEXT")
    public int supportedIndirectCommandsInputModes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsupportedIndirectCommandsInputModes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderStageFlags")
    public int supportedIndirectCommandsShaderStages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsupportedIndirectCommandsShaderStages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderStageFlags")
    public int supportedIndirectCommandsShaderStagesPipelineBinding() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsupportedIndirectCommandsShaderStagesPipelineBinding(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderStageFlags")
    public int supportedIndirectCommandsShaderStagesShaderBinding() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsupportedIndirectCommandsShaderStagesShaderBinding(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean deviceGeneratedCommandsTransformFeedback() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndeviceGeneratedCommandsTransformFeedback(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean deviceGeneratedCommandsMultiDrawIndirectCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndeviceGeneratedCommandsMultiDrawIndirectCount(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000572001(0x3ba38461, float:0.004990146)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT set(org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nmaxIndirectPipelineCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTPIPELINECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxIndirectShaderObjectCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTSHADEROBJECTCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxIndirectSequenceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTSEQUENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxIndirectCommandsTokenCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTCOMMANDSTOKENCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxIndirectCommandsTokenOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTCOMMANDSTOKENOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxIndirectCommandsIndirectStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTCOMMANDSINDIRECTSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsupportedIndirectCommandsInputModes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSINPUTMODES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsupportedIndirectCommandsShaderStages(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSSHADERSTAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsupportedIndirectCommandsShaderStagesPipelineBinding(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESPIPELINEBINDING
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsupportedIndirectCommandsShaderStagesShaderBinding(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESSHADERBINDING
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndeviceGeneratedCommandsTransformFeedback(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.DEVICEGENERATEDCOMMANDSTRANSFORMFEEDBACK
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndeviceGeneratedCommandsMultiDrawIndirectCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.DEVICEGENERATEDCOMMANDSMULTIDRAWINDIRECTCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.PNEXT
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
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 14
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTPIPELINECOUNT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTSHADEROBJECTCOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTSEQUENCECOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTCOMMANDSTOKENCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTCOMMANDSTOKENOFFSET = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTCOMMANDSINDIRECTSTRIDE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSINPUTMODES = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSSHADERSTAGES = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESPIPELINEBINDING = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESSHADERBINDING = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.DEVICEGENERATEDCOMMANDSTRANSFORMFEEDBACK = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.DEVICEGENERATEDCOMMANDSMULTIDRAWINDIRECTCOUNT = r0
            return
    }
}
