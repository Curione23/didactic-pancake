package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoKHR.class */
public class VkRayTracingPipelineCreateInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int STAGECOUNT = 0;
    public static final int PSTAGES = 0;
    public static final int GROUPCOUNT = 0;
    public static final int PGROUPS = 0;
    public static final int MAXPIPELINERAYRECURSIONDEPTH = 0;
    public static final int PLIBRARYINFO = 0;
    public static final int PLIBRARYINTERFACE = 0;
    public static final int PDYNAMICSTATE = 0;
    public static final int LAYOUT = 0;
    public static final int BASEPIPELINEHANDLE = 0;
    public static final int BASEPIPELINEINDEX = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR, org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int stageCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nstageCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineShaderStageCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer pStages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo$Buffer r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npStages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int groupCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.ngroupCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkRayTracingShaderGroupCreateInfoKHR const *")
        public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer pGroups() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npGroups(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPipelineRayRecursionDepth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nmaxPipelineRayRecursionDepth(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineLibraryCreateInfoKHR const *")
        public org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR pLibraryInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npLibraryInfo(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *")
        public org.lwjgl.vulkan.VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkRayTracingPipelineInterfaceCreateInfoKHR r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npLibraryInterface(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineDynamicStateCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo pDynamicState() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npDynamicState(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineLayout")
        public long layout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nlayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipeline")
        public long basePipelineHandle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nbasePipelineHandle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int basePipelineIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nbasePipelineIndex(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000150015(0x3b9d13ff, float:0.0047936435)
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer flags(@org.lwjgl.system.NativeType("VkPipelineCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer pStages(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineShaderStageCreateInfo const *") org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npStages(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer pGroups(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRayTracingShaderGroupCreateInfoKHR const *") org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npGroups(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer maxPipelineRayRecursionDepth(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nmaxPipelineRayRecursionDepth(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer pLibraryInfo(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineLibraryCreateInfoKHR const *") org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npLibraryInfo(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer pLibraryInterface(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *") org.lwjgl.vulkan.VkRayTracingPipelineInterfaceCreateInfoKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npLibraryInterface(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer pDynamicState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineDynamicStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.npDynamicState(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nlayout(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer basePipelineHandle(@org.lwjgl.system.NativeType("VkPipeline") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nbasePipelineHandle(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer basePipelineIndex(@org.lwjgl.system.NativeType("int32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.nbasePipelineIndex(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.create(r0)
                org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkRayTracingPipelineCreateInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkRayTracingPipelineCreateInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int stageCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstageCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineShaderStageCreateInfo const *")
    public org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer pStages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo$Buffer r0 = npStages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int groupCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngroupCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkRayTracingShaderGroupCreateInfoKHR const *")
    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer pGroups() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = npGroups(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPipelineRayRecursionDepth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPipelineRayRecursionDepth(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineLibraryCreateInfoKHR const *")
    public org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR pLibraryInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR r0 = npLibraryInfo(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *")
    public org.lwjgl.vulkan.VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkRayTracingPipelineInterfaceCreateInfoKHR r0 = npLibraryInterface(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineDynamicStateCreateInfo const *")
    public org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo pDynamicState() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r0 = npDynamicState(r0)
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

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000150015(0x3b9d13ff, float:0.0047936435)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR pNext(org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR pNext(org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR flags(@org.lwjgl.system.NativeType("VkPipelineCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR pStages(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineShaderStageCreateInfo const *") org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStages(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR pGroups(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRayTracingShaderGroupCreateInfoKHR const *") org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npGroups(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR maxPipelineRayRecursionDepth(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxPipelineRayRecursionDepth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR pLibraryInfo(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineLibraryCreateInfoKHR const *") org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npLibraryInfo(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR pLibraryInterface(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *") org.lwjgl.vulkan.VkRayTracingPipelineInterfaceCreateInfoKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npLibraryInterface(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR pDynamicState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineDynamicStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDynamicState(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nlayout(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR basePipelineHandle(@org.lwjgl.system.NativeType("VkPipeline") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nbasePipelineHandle(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR basePipelineIndex(@org.lwjgl.system.NativeType("int32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbasePipelineIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR set(int r5, long r6, int r8, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer r9, @javax.annotation.Nullable org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer r10, int r11, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR r12, @javax.annotation.Nullable org.lwjgl.vulkan.VkRayTracingPipelineInterfaceCreateInfoKHR r13, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r14, long r15, long r17, int r19) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.pStages(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.pGroups(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.maxPipelineRayRecursionDepth(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.pLibraryInfo(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.pLibraryInterface(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.pDynamicState(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.layout(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.basePipelineHandle(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.basePipelineIndex(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR set(org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR malloc() {
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR calloc() {
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstageCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.STAGECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer npStages(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PSTAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nstageCount(r1)
            org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo$Buffer r0 = org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.createSafe(r0, r1)
            return r0
    }

    public static int ngroupCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.GROUPCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer npGroups(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PGROUPS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ngroupCount(r1)
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.createSafe(r0, r1)
            return r0
    }

    public static int nmaxPipelineRayRecursionDepth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.MAXPIPELINERAYRECURSIONDEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR npLibraryInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PLIBRARYINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR r0 = org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRayTracingPipelineInterfaceCreateInfoKHR npLibraryInterface(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PLIBRARYINTERFACE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkRayTracingPipelineInterfaceCreateInfoKHR r0 = org.lwjgl.vulkan.VkRayTracingPipelineInterfaceCreateInfoKHR.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo npDynamicState(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PDYNAMICSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.createSafe(r0)
            return r0
    }

    public static long nlayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.LAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nbasePipelineHandle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEHANDLE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nbasePipelineIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstageCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.STAGECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npStages(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PSTAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            nstageCount(r0, r1)
            return
    }

    public static void ngroupCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.GROUPCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npGroups(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PGROUPS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            ngroupCount(r0, r1)
            return
    }

    public static void nmaxPipelineRayRecursionDepth(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.MAXPIPELINERAYRECURSIONDEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npLibraryInfo(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PLIBRARYINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npLibraryInterface(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkRayTracingPipelineInterfaceCreateInfoKHR r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PLIBRARYINTERFACE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npDynamicState(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PDYNAMICSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nlayout(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.LAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nbasePipelineHandle(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEHANDLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nbasePipelineIndex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r6) {
            r0 = r6
            int r0 = nstageCount(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L25
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PSTAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r9 = r0
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r2 = org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.SIZEOF
            void r3 = org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo::validate
            validate(r0, r1, r2, r3)
        L25:
            r0 = r6
            int r0 = ngroupCount(r0)
            if (r0 == 0) goto L39
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PGROUPS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L39:
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PLIBRARYINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r9 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L4d
            r0 = r9
            org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR.validate(r0)
        L4d:
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PDYNAMICSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r11 = r0
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L64
            r0 = r11
            org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.validate(r0)
        L64:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 8
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
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.STAGECOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PSTAGES = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.GROUPCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PGROUPS = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.MAXPIPELINERAYRECURSIONDEPTH = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PLIBRARYINFO = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PLIBRARYINTERFACE = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.PDYNAMICSTATE = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.LAYOUT = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEHANDLE = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEINDEX = r0
            return
    }
}
