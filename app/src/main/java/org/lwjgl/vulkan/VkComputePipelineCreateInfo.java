package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkComputePipelineCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkComputePipelineCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkComputePipelineCreateInfo.class */
public class VkComputePipelineCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkComputePipelineCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int STAGE = 0;
    public static final int LAYOUT = 0;
    public static final int BASEPIPELINEHANDLE = 0;
    public static final int BASEPIPELINEINDEX = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkComputePipelineCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkComputePipelineCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkComputePipelineCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkComputePipelineCreateInfo, org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkComputePipelineCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkComputePipelineCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.nflags(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo stage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.nstage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineLayout")
        public long layout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.nlayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipeline")
        public long basePipelineHandle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.nbasePipelineHandle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int basePipelineIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.nbasePipelineIndex(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkComputePipelineCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 29
                org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkComputePipelineCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineCompilerControlCreateInfoAMD r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineCompilerControlCreateInfoAMD r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSubpassShadingPipelineCreateInfoHUAWEI r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSubpassShadingPipelineCreateInfoHUAWEI r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkPipelineCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkComputePipelineCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer stage(org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkComputePipelineCreateInfo.nstage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer stage(java.util.function.Consumer<org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo r1 = r1.stage()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkComputePipelineCreateInfo.nlayout(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer basePipelineHandle(@org.lwjgl.system.NativeType("VkPipeline") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkComputePipelineCreateInfo.nbasePipelineHandle(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer basePipelineIndex(@org.lwjgl.system.NativeType("int32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkComputePipelineCreateInfo.nbasePipelineIndex(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.create(r0)
                org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkComputePipelineCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkComputePipelineCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkComputePipelineCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkPipelineCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo stage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo r0 = nstage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPipelineLayout")
    public long layout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nlayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPipeline")
    public long basePipelineHandle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nbasePipelineHandle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int basePipelineIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbasePipelineIndex(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 29
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineCompilerControlCreateInfoAMD r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineCompilerControlCreateInfoAMD r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo pNext(org.lwjgl.vulkan.VkSubpassShadingPipelineCreateInfoHUAWEI r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSubpassShadingPipelineCreateInfoHUAWEI r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo flags(@org.lwjgl.system.NativeType("VkPipelineCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo stage(org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo stage(java.util.function.Consumer<org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo r1 = r1.stage()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nlayout(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo basePipelineHandle(@org.lwjgl.system.NativeType("VkPipeline") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nbasePipelineHandle(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo basePipelineIndex(@org.lwjgl.system.NativeType("int32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbasePipelineIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo set(int r5, long r6, int r8, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo r9, long r10, long r12, int r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.stage(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.layout(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.basePipelineHandle(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.basePipelineIndex(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkComputePipelineCreateInfo set(org.lwjgl.vulkan.VkComputePipelineCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo malloc() {
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo calloc() {
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkComputePipelineCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkComputePipelineCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo nstage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.STAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo r0 = org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.create(r0)
            return r0
    }

    public static long nlayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.LAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nbasePipelineHandle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.BASEPIPELINEHANDLE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nbasePipelineIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.BASEPIPELINEINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstage(long r7, org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.STAGE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nlayout(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.LAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nbasePipelineHandle(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.BASEPIPELINEHANDLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nbasePipelineIndex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.BASEPIPELINEINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.STAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.validate(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkComputePipelineCreateInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkComputePipelineCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.SIZEOF
            int r4 = org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkComputePipelineCreateInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkComputePipelineCreateInfo.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkComputePipelineCreateInfo.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkComputePipelineCreateInfo.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkComputePipelineCreateInfo.STAGE = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkComputePipelineCreateInfo.LAYOUT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkComputePipelineCreateInfo.BASEPIPELINEHANDLE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkComputePipelineCreateInfo.BASEPIPELINEINDEX = r0
            return
    }
}
