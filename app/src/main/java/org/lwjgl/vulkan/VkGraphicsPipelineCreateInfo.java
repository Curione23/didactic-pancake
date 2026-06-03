package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGraphicsPipelineCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGraphicsPipelineCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGraphicsPipelineCreateInfo.class */
public class VkGraphicsPipelineCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int STAGECOUNT = 0;
    public static final int PSTAGES = 0;
    public static final int PVERTEXINPUTSTATE = 0;
    public static final int PINPUTASSEMBLYSTATE = 0;
    public static final int PTESSELLATIONSTATE = 0;
    public static final int PVIEWPORTSTATE = 0;
    public static final int PRASTERIZATIONSTATE = 0;
    public static final int PMULTISAMPLESTATE = 0;
    public static final int PDEPTHSTENCILSTATE = 0;
    public static final int PCOLORBLENDSTATE = 0;
    public static final int PDYNAMICSTATE = 0;
    public static final int LAYOUT = 0;
    public static final int RENDERPASS = 0;
    public static final int SUBPASS = 0;
    public static final int BASEPIPELINEHANDLE = 0;
    public static final int BASEPIPELINEINDEX = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGraphicsPipelineCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGraphicsPipelineCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGraphicsPipelineCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo, org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int stageCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nstageCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineShaderStageCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer pStages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo$Buffer r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npStages(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineVertexInputStateCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo pVertexInputState() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npVertexInputState(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineInputAssemblyStateCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npInputAssemblyState(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineTessellationStateCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo pTessellationState() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npTessellationState(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineViewportStateCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo pViewportState() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npViewportState(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineRasterizationStateCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo pRasterizationState() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npRasterizationState(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineMultisampleStateCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo pMultisampleState() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npMultisampleState(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineDepthStencilStateCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo pDepthStencilState() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npDepthStencilState(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineColorBlendStateCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo pColorBlendState() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npColorBlendState(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineDynamicStateCreateInfo const *")
        public org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo pDynamicState() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npDynamicState(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineLayout")
        public long layout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nlayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkRenderPass")
        public long renderPass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nrenderPass(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int subpass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nsubpass(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipeline")
        public long basePipelineHandle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nbasePipelineHandle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int basePipelineIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nbasePipelineIndex(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 28
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkGraphicsPipelineLibraryCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkGraphicsPipelineLibraryCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkGraphicsPipelineShaderGroupsCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkGraphicsPipelineShaderGroupsCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineCompilerControlCreateInfoAMD r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineCompilerControlCreateInfoAMD r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineFragmentShadingRateStateCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateStateCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineRenderingCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRenderingCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineRenderingCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRenderingCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineRepresentativeFragmentTestStateCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRepresentativeFragmentTestStateCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkPipelineCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer stageCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nstageCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pStages(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineShaderStageCreateInfo const *") org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npStages(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pVertexInputState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineVertexInputStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npVertexInputState(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pInputAssemblyState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineInputAssemblyStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npInputAssemblyState(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pTessellationState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineTessellationStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npTessellationState(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pViewportState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineViewportStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npViewportState(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pRasterizationState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineRasterizationStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npRasterizationState(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pMultisampleState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineMultisampleStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npMultisampleState(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pDepthStencilState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineDepthStencilStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npDepthStencilState(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pColorBlendState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineColorBlendStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npColorBlendState(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer pDynamicState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineDynamicStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.npDynamicState(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nlayout(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer renderPass(@org.lwjgl.system.NativeType("VkRenderPass") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nrenderPass(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer subpass(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nsubpass(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer basePipelineHandle(@org.lwjgl.system.NativeType("VkPipeline") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nbasePipelineHandle(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer basePipelineIndex(@org.lwjgl.system.NativeType("int32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.nbasePipelineIndex(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.create(r0)
                org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkGraphicsPipelineCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkGraphicsPipelineCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
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

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineVertexInputStateCreateInfo const *")
    public org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo pVertexInputState() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo r0 = npVertexInputState(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineInputAssemblyStateCreateInfo const *")
    public org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo r0 = npInputAssemblyState(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineTessellationStateCreateInfo const *")
    public org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo pTessellationState() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo r0 = npTessellationState(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineViewportStateCreateInfo const *")
    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo pViewportState() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = npViewportState(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineRasterizationStateCreateInfo const *")
    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo pRasterizationState() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = npRasterizationState(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineMultisampleStateCreateInfo const *")
    public org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo pMultisampleState() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo r0 = npMultisampleState(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineDepthStencilStateCreateInfo const *")
    public org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo pDepthStencilState() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo r0 = npDepthStencilState(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineColorBlendStateCreateInfo const *")
    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo pColorBlendState() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = npColorBlendState(r0)
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

    @org.lwjgl.system.NativeType("VkRenderPass")
    public long renderPass() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nrenderPass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int subpass() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsubpass(r0)
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

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 28
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkGraphicsPipelineLibraryCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkGraphicsPipelineLibraryCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkGraphicsPipelineShaderGroupsCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkGraphicsPipelineShaderGroupsCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineCompilerControlCreateInfoAMD r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineCompilerControlCreateInfoAMD r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineCreationFeedbackCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineFragmentShadingRateStateCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateStateCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineLibraryCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineRenderingCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRenderingCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineRenderingCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRenderingCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineRepresentativeFragmentTestStateCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRepresentativeFragmentTestStateCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pNext(org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRobustnessCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo flags(@org.lwjgl.system.NativeType("VkPipelineCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo stageCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstageCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pStages(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineShaderStageCreateInfo const *") org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStages(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pVertexInputState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineVertexInputStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npVertexInputState(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pInputAssemblyState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineInputAssemblyStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npInputAssemblyState(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pTessellationState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineTessellationStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npTessellationState(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pViewportState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineViewportStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npViewportState(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pRasterizationState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineRasterizationStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npRasterizationState(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pMultisampleState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineMultisampleStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npMultisampleState(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pDepthStencilState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineDepthStencilStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDepthStencilState(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pColorBlendState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineColorBlendStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npColorBlendState(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo pDynamicState(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineDynamicStateCreateInfo const *") org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDynamicState(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nlayout(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo renderPass(@org.lwjgl.system.NativeType("VkRenderPass") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nrenderPass(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo subpass(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsubpass(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo basePipelineHandle(@org.lwjgl.system.NativeType("VkPipeline") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nbasePipelineHandle(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo basePipelineIndex(@org.lwjgl.system.NativeType("int32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbasePipelineIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo set(int r5, long r6, int r8, int r9, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer r10, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo r11, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo r12, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo r13, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r14, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r15, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo r16, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo r17, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r18, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r19, long r20, long r22, int r24, long r25, int r27) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.stageCount(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pStages(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pVertexInputState(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pInputAssemblyState(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pTessellationState(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pViewportState(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pRasterizationState(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pMultisampleState(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pDepthStencilState(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pColorBlendState(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.pDynamicState(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.layout(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.renderPass(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.subpass(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.basePipelineHandle(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.basePipelineIndex(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo set(org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo malloc() {
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo calloc() {
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstageCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.STAGECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer npStages(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PSTAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nstageCount(r1)
            org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo$Buffer r0 = org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.createSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo npVertexInputState(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo npInputAssemblyState(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo npTessellationState(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo npViewportState(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo npRasterizationState(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo npMultisampleState(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PMULTISAMPLESTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo npDepthStencilState(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PDEPTHSTENCILSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo npColorBlendState(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo npDynamicState(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PDYNAMICSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.createSafe(r0)
            return r0
    }

    public static long nlayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.LAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nrenderPass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.RENDERPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nsubpass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SUBPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nbasePipelineHandle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.BASEPIPELINEHANDLE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nbasePipelineIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.BASEPIPELINEINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstageCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.STAGECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npStages(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PSTAGES
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
            nstageCount(r0, r1)
        L19:
            return
    }

    public static void npVertexInputState(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npInputAssemblyState(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npTessellationState(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineTessellationStateCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npViewportState(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npRasterizationState(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npMultisampleState(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineMultisampleStateCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PMULTISAMPLESTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npDepthStencilState(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineDepthStencilStateCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PDEPTHSTENCILSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npColorBlendState(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npDynamicState(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PDYNAMICSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nlayout(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.LAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nrenderPass(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.RENDERPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nsubpass(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SUBPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbasePipelineHandle(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.BASEPIPELINEHANDLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nbasePipelineIndex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.BASEPIPELINEINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L14
            r0 = r7
            org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo.validate(r0)
        L14:
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PDYNAMICSTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r9 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L2b
            r0 = r9
            org.lwjgl.vulkan.VkPipelineDynamicStateCreateInfo.validate(r0)
        L2b:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 19
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.STAGECOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PSTAGES = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PVERTEXINPUTSTATE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PINPUTASSEMBLYSTATE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PTESSELLATIONSTATE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PVIEWPORTSTATE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PRASTERIZATIONSTATE = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PMULTISAMPLESTATE = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PDEPTHSTENCILSTATE = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PCOLORBLENDSTATE = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.PDYNAMICSTATE = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.LAYOUT = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.RENDERPASS = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.SUBPASS = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.BASEPIPELINEHANDLE = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGraphicsPipelineCreateInfo.BASEPIPELINEINDEX = r0
            return
    }
}
