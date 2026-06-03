package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDXShaderEnqueue.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDXShaderEnqueue.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDXShaderEnqueue.class */
public class AMDXShaderEnqueue {
    public static final int VK_AMDX_SHADER_ENQUEUE_SPEC_VERSION = 1;
    public static final java.lang.String VK_AMDX_SHADER_ENQUEUE_EXTENSION_NAME = "VK_AMDX_shader_enqueue";
    public static final int VK_SHADER_INDEX_UNUSED_AMDX = -1;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX = 1000134000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX = 1000134001;
    public static final int VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX = 1000134002;
    public static final int VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX = 1000134003;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX = 1000134004;
    public static final int VK_BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX = 33554432;
    public static final int VK_PIPELINE_BIND_POINT_EXECUTION_GRAPH_AMDX = 1000134000;
    public static final long VK_BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX = 33554432;

    protected AMDXShaderEnqueue() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateExecutionGraphPipelinesAMDX(org.lwjgl.vulkan.VkDevice r14, long r15, int r17, long r18, long r20, long r22) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateExecutionGraphPipelinesAMDX
            r24 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r24
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = r17
            int r2 = org.lwjgl.vulkan.VkExecutionGraphPipelineCreateInfoAMDX.SIZEOF
            int r3 = org.lwjgl.vulkan.VkExecutionGraphPipelineCreateInfoAMDX::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L23:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r22
            r6 = r24
            int r0 = org.lwjgl.system.JNI.callPJPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateExecutionGraphPipelinesAMDX(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkPipelineCache") long r12, @org.lwjgl.system.NativeType("VkExecutionGraphPipelineCreateInfoAMDX const *") org.lwjgl.vulkan.VkExecutionGraphPipelineCreateInfoAMDX.Buffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r15, @org.lwjgl.system.NativeType("VkPipeline *") java.nio.LongBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r16
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r11
            r1 = r12
            r2 = r14
            int r2 = r2.remaining()
            r3 = r14
            long r3 = r3.address()
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nvkCreateExecutionGraphPipelinesAMDX(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nvkGetExecutionGraphPipelineScratchSizeAMDX(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetExecutionGraphPipelineScratchSizeAMDX
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetExecutionGraphPipelineScratchSizeAMDX(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPipeline") long r7, @org.lwjgl.system.NativeType("VkExecutionGraphPipelineScratchSizeAMDX *") org.lwjgl.vulkan.VkExecutionGraphPipelineScratchSizeAMDX r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkGetExecutionGraphPipelineScratchSizeAMDX(r0, r1, r2)
            return r0
    }

    public static int nvkGetExecutionGraphPipelineNodeIndexAMDX(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetExecutionGraphPipelineNodeIndexAMDX
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetExecutionGraphPipelineNodeIndexAMDX(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkPipeline") long r9, @org.lwjgl.system.NativeType("VkPipelineShaderStageNodeCreateInfoAMDX const *") org.lwjgl.vulkan.VkPipelineShaderStageNodeCreateInfoAMDX r11, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkGetExecutionGraphPipelineNodeIndexAMDX(r0, r1, r2, r3)
            return r0
    }

    public static void vkCmdInitializeGraphScratchMemoryAMDX(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkDeviceAddress") long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdInitializeGraphScratchMemoryAMDX
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPJV(r0, r1, r2)
            return
    }

    public static void nvkCmdDispatchGraphAMDX(org.lwjgl.vulkan.VkCommandBuffer r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDispatchGraphAMDX
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdDispatchGraphAMDX(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkDeviceAddress") long r7, @org.lwjgl.system.NativeType("VkDispatchGraphCountInfoAMDX const *") org.lwjgl.vulkan.VkDispatchGraphCountInfoAMDX r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            nvkCmdDispatchGraphAMDX(r0, r1, r2)
            return
    }

    public static void nvkCmdDispatchGraphIndirectAMDX(org.lwjgl.vulkan.VkCommandBuffer r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDispatchGraphIndirectAMDX
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdDispatchGraphIndirectAMDX(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkDeviceAddress") long r7, @org.lwjgl.system.NativeType("VkDispatchGraphCountInfoAMDX const *") org.lwjgl.vulkan.VkDispatchGraphCountInfoAMDX r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            nvkCmdDispatchGraphIndirectAMDX(r0, r1, r2)
            return
    }

    public static void vkCmdDispatchGraphIndirectCountAMDX(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkDeviceAddress") long r10, @org.lwjgl.system.NativeType("VkDeviceAddress") long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDispatchGraphIndirectCountAMDX
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateExecutionGraphPipelinesAMDX(org.lwjgl.vulkan.VkDevice r13, @org.lwjgl.system.NativeType("VkPipelineCache") long r14, @org.lwjgl.system.NativeType("VkExecutionGraphPipelineCreateInfoAMDX const *") org.lwjgl.vulkan.VkExecutionGraphPipelineCreateInfoAMDX.Buffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r17, @org.lwjgl.system.NativeType("VkPipeline *") long[] r18) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateExecutionGraphPipelinesAMDX
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L31
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = r16
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            long r0 = r0.address()
            r1 = r16
            int r1 = r1.remaining()
            int r2 = org.lwjgl.vulkan.VkExecutionGraphPipelineCreateInfoAMDX.SIZEOF
            int r3 = org.lwjgl.vulkan.VkExecutionGraphPipelineCreateInfoAMDX::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L31:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            int r2 = r2.remaining()
            r3 = r16
            long r3 = r3.address()
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r18
            r6 = r19
            int r0 = org.lwjgl.system.JNI.callPJPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetExecutionGraphPipelineNodeIndexAMDX(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkPipeline") long r11, @org.lwjgl.system.NativeType("VkPipelineShaderStageNodeCreateInfoAMDX const *") org.lwjgl.vulkan.VkPipelineShaderStageNodeCreateInfoAMDX r13, @org.lwjgl.system.NativeType("uint32_t *") int[] r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetExecutionGraphPipelineNodeIndexAMDX
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            long r2 = r2.address()
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }
}
