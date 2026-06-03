package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderCreateInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderCreateInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderCreateInfoEXT.class */
public class VkShaderCreateInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkShaderCreateInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int STAGE = 0;
    public static final int NEXTSTAGE = 0;
    public static final int CODETYPE = 0;
    public static final int CODESIZE = 0;
    public static final int PCODE = 0;
    public static final int PNAME = 0;
    public static final int SETLAYOUTCOUNT = 0;
    public static final int PSETLAYOUTS = 0;
    public static final int PUSHCONSTANTRANGECOUNT = 0;
    public static final int PPUSHCONSTANTRANGES = 0;
    public static final int PSPECIALIZATIONINFO = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderCreateInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderCreateInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderCreateInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkShaderCreateInfoEXT, org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkShaderCreateInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkShaderCreateInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderCreateFlagsEXT")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderStageFlagBits")
        public int stage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.nstage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderStageFlags")
        public int nextStage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.nnextStage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderCodeTypeEXT")
        public int codeType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.ncodeType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long codeSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.ncodeSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public java.nio.ByteBuffer pCode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.npCode(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer pName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.npName(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String pNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.npNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int setLayoutCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.nsetLayoutCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDescriptorSetLayout const *")
        public java.nio.LongBuffer pSetLayouts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.npSetLayouts(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int pushConstantRangeCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.npushConstantRangeCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPushConstantRange const *")
        public org.lwjgl.vulkan.VkPushConstantRange.Buffer pPushConstantRanges() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPushConstantRange$Buffer r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.npPushConstantRanges(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkSpecializationInfo const *")
        public org.lwjgl.vulkan.VkSpecializationInfo pSpecializationInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkSpecializationInfo r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.npSpecializationInfo(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000482002(0x3ba224d2, float:0.004948237)
                org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer pNext(org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer pNext(org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer pNext(org.lwjgl.vulkan.VkShaderRequiredSubgroupSizeCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkShaderRequiredSubgroupSizeCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer flags(@org.lwjgl.system.NativeType("VkShaderCreateFlagsEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer stage(@org.lwjgl.system.NativeType("VkShaderStageFlagBits") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.nstage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer nextStage(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.nnextStage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer codeType(@org.lwjgl.system.NativeType("VkShaderCodeTypeEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.ncodeType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer pCode(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.npCode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer pName(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.npName(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer setLayoutCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.nsetLayoutCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer pSetLayouts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorSetLayout const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.npSetLayouts(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer pushConstantRangeCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.npushConstantRangeCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer pPushConstantRanges(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPushConstantRange const *") org.lwjgl.vulkan.VkPushConstantRange.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.npPushConstantRanges(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer pSpecializationInfo(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSpecializationInfo const *") org.lwjgl.vulkan.VkSpecializationInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.npSpecializationInfo(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.create(r0)
                org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkShaderCreateInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkShaderCreateInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkShaderCreateInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkShaderCreateFlagsEXT")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderStageFlagBits")
    public int stage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderStageFlags")
    public int nextStage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnextStage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderCodeTypeEXT")
    public int codeType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncodeType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long codeSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncodeSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const *")
    public java.nio.ByteBuffer pCode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npCode(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer pName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npName(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String pNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = npNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int setLayoutCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsetLayoutCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDescriptorSetLayout const *")
    public java.nio.LongBuffer pSetLayouts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npSetLayouts(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int pushConstantRangeCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npushConstantRangeCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPushConstantRange const *")
    public org.lwjgl.vulkan.VkPushConstantRange.Buffer pPushConstantRanges() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPushConstantRange$Buffer r0 = npPushConstantRanges(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkSpecializationInfo const *")
    public org.lwjgl.vulkan.VkSpecializationInfo pSpecializationInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkSpecializationInfo r0 = npSpecializationInfo(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000482002(0x3ba224d2, float:0.004948237)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT pNext(org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT pNext(org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT pNext(org.lwjgl.vulkan.VkShaderRequiredSubgroupSizeCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkShaderRequiredSubgroupSizeCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT flags(@org.lwjgl.system.NativeType("VkShaderCreateFlagsEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT stage(@org.lwjgl.system.NativeType("VkShaderStageFlagBits") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT nextStage(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnextStage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT codeType(@org.lwjgl.system.NativeType("VkShaderCodeTypeEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncodeType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT pCode(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npCode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT pName(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npName(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT setLayoutCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsetLayoutCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT pSetLayouts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorSetLayout const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSetLayouts(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT pushConstantRangeCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npushConstantRangeCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT pPushConstantRanges(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPushConstantRange const *") org.lwjgl.vulkan.VkPushConstantRange.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npPushConstantRanges(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT pSpecializationInfo(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSpecializationInfo const *") org.lwjgl.vulkan.VkSpecializationInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSpecializationInfo(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT set(int r5, long r6, int r8, int r9, int r10, int r11, java.nio.ByteBuffer r12, @javax.annotation.Nullable java.nio.ByteBuffer r13, int r14, @javax.annotation.Nullable java.nio.LongBuffer r15, int r16, @javax.annotation.Nullable org.lwjgl.vulkan.VkPushConstantRange.Buffer r17, @javax.annotation.Nullable org.lwjgl.vulkan.VkSpecializationInfo r18) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.stage(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.nextStage(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.codeType(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.pCode(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.pName(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.setLayoutCount(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.pSetLayouts(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.pushConstantRangeCount(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.pPushConstantRanges(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.pSpecializationInfo(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderCreateInfoEXT set(org.lwjgl.vulkan.VkShaderCreateInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT malloc() {
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT calloc() {
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderCreateInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.STAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nnextStage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.NEXTSTAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncodeType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.CODETYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ncodeSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.CODESIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static java.nio.ByteBuffer npCode(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PCODE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = ncodeSize(r1)
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer npName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String npNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static int nsetLayoutCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SETLAYOUTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npSetLayouts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PSETLAYOUTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nsetLayoutCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static int npushConstantRangeCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PUSHCONSTANTRANGECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPushConstantRange.Buffer npPushConstantRanges(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PPUSHCONSTANTRANGES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = npushConstantRangeCount(r1)
            org.lwjgl.vulkan.VkPushConstantRange$Buffer r0 = org.lwjgl.vulkan.VkPushConstantRange.createSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSpecializationInfo npSpecializationInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PSPECIALIZATIONINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkSpecializationInfo r0 = org.lwjgl.vulkan.VkSpecializationInfo.createSafe(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstage(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.STAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nnextStage(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.NEXTSTAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncodeType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.CODETYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncodeSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.CODESIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npCode(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PCODE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            long r1 = (long) r1
            ncodeSize(r0, r1)
            return
    }

    public static void npName(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsetLayoutCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SETLAYOUTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npSetLayouts(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PSETLAYOUTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nsetLayoutCount(r0, r1)
        L19:
            return
    }

    public static void npushConstantRangeCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PUSHCONSTANTRANGECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npPushConstantRanges(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPushConstantRange.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PPUSHCONSTANTRANGES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            npushConstantRangeCount(r0, r1)
        L19:
            return
    }

    public static void npSpecializationInfo(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkSpecializationInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PSPECIALIZATIONINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PCODE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.PSPECIALIZATIONINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L21
            r0 = r7
            org.lwjgl.vulkan.VkSpecializationInfo.validate(r0)
        L21:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkShaderCreateInfoEXT r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.STAGE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.NEXTSTAGE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.CODETYPE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.CODESIZE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.PCODE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.PNAME = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.SETLAYOUTCOUNT = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.PSETLAYOUTS = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.PUSHCONSTANTRANGECOUNT = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.PPUSHCONSTANTRANGES = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderCreateInfoEXT.PSPECIALIZATIONINFO = r0
            return
    }
}
