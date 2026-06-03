package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/ARMDataGraph.class */
public class ARMDataGraph {
    public static final int VK_ARM_DATA_GRAPH_SPEC_VERSION = 1;
    public static final java.lang.String VK_ARM_DATA_GRAPH_EXTENSION_NAME = "VK_ARM_data_graph";
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM = 1000507000;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM = 1000507001;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM = 1000507002;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM = 1000507003;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM = 1000507004;
    public static final int VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM = 1000507005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM = 1000507006;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM = 1000507007;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM = 1000507008;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM = 1000507009;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM = 1000507010;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM = 1000507011;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENT_ARM = 1000507012;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM = 1000507013;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM = 1000507014;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_TENSOR_SEMI_STRUCTURED_SPARSITY_INFO_ARM = 1000507015;
    public static final int VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM = 1000507016;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM = 1000507017;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM = 1000507018;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM = 1000507019;
    public static final int VK_OBJECT_TYPE_DATA_GRAPH_PIPELINE_SESSION_ARM = 1000507000;
    public static final int VK_PIPELINE_BIND_POINT_DATA_GRAPH_ARM = 1000507000;
    public static final int VK_QUEUE_DATA_GRAPH_BIT_ARM = 1024;
    public static final long VK_PIPELINE_STAGE_2_DATA_GRAPH_BIT_ARM = 4398046511104L;
    public static final long VK_ACCESS_2_DATA_GRAPH_READ_BIT_ARM = 140737488355328L;
    public static final long VK_ACCESS_2_DATA_GRAPH_WRITE_BIT_ARM = 281474976710656L;
    public static final long VK_TENSOR_USAGE_DATA_GRAPH_BIT_ARM = 32;
    public static final long VK_FORMAT_FEATURE_2_TENSOR_DATA_GRAPH_BIT_ARM = 281474976710656L;
    public static final long VK_BUFFER_USAGE_2_DATA_GRAPH_FOREIGN_DESCRIPTOR_BIT_ARM = 536870912;
    public static final int VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM = 128;
    public static final int VK_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_TRANSIENT_ARM = 0;
    public static final int VK_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_TYPE_MEMORY_ARM = 0;
    public static final long VK_DATA_GRAPH_PIPELINE_SESSION_CREATE_PROTECTED_BIT_ARM = 1;
    public static final int VK_DATA_GRAPH_PIPELINE_PROPERTY_CREATION_LOG_ARM = 0;
    public static final int VK_DATA_GRAPH_PIPELINE_PROPERTY_IDENTIFIER_ARM = 1;
    public static final int VK_PHYSICAL_DEVICE_DATA_GRAPH_PROCESSING_ENGINE_TYPE_DEFAULT_ARM = 0;
    public static final int VK_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_TYPE_SPIRV_EXTENDED_INSTRUCTION_SET_ARM = 0;

    protected ARMDataGraph() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateDataGraphPipelinesARM(org.lwjgl.vulkan.VkDevice r16, long r17, long r19, int r21, long r22, long r24, long r26) {
            r0 = r16
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDataGraphPipelinesARM
            r28 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r28
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r22
            r1 = r21
            int r2 = org.lwjgl.vulkan.VkDataGraphPipelineCreateInfoARM.SIZEOF
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelineCreateInfoARM::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L24:
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r19
            r3 = r21
            r4 = r22
            r5 = r24
            r6 = r26
            r7 = r28
            int r0 = org.lwjgl.system.JNI.callPJJPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateDataGraphPipelinesARM(org.lwjgl.vulkan.VkDevice r13, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r14, @org.lwjgl.system.NativeType("VkPipelineCache") long r16, @org.lwjgl.system.NativeType("VkDataGraphPipelineCreateInfoARM const *") org.lwjgl.vulkan.VkDataGraphPipelineCreateInfoARM.Buffer r18, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r19, @org.lwjgl.system.NativeType("VkPipeline *") java.nio.LongBuffer r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r20
            r1 = r18
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r13
            r1 = r14
            r2 = r16
            r3 = r18
            int r3 = r3.remaining()
            r4 = r18
            long r4 = r4.address()
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            int r0 = nvkCreateDataGraphPipelinesARM(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static int nvkCreateDataGraphPipelineSessionARM(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDataGraphPipelineSessionARM
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
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateDataGraphPipelineSessionARM(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDataGraphPipelineSessionCreateInfoARM const *") org.lwjgl.vulkan.VkDataGraphPipelineSessionCreateInfoARM r9, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkDataGraphPipelineSessionARM *") java.nio.LongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkCreateDataGraphPipelineSessionARM(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetDataGraphPipelineSessionBindPointRequirementsARM(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDataGraphPipelineSessionBindPointRequirementsARM
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
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDataGraphPipelineSessionBindPointRequirementsARM(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDataGraphPipelineSessionBindPointRequirementsInfoARM const *") org.lwjgl.vulkan.VkDataGraphPipelineSessionBindPointRequirementsInfoARM r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("VkDataGraphPipelineSessionBindPointRequirementARM *") org.lwjgl.vulkan.VkDataGraphPipelineSessionBindPointRequirementARM.Buffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = r10
            r2 = r10
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetDataGraphPipelineSessionBindPointRequirementsARM(r0, r1, r2, r3)
            return r0
    }

    public static void nvkGetDataGraphPipelineSessionMemoryRequirementsARM(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDataGraphPipelineSessionMemoryRequirementsARM
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDataGraphPipelineSessionMemoryRequirementsARM(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDataGraphPipelineSessionMemoryRequirementsInfoARM const *") org.lwjgl.vulkan.VkDataGraphPipelineSessionMemoryRequirementsInfoARM r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetDataGraphPipelineSessionMemoryRequirementsARM(r0, r1, r2)
            return
    }

    public static int nvkBindDataGraphPipelineSessionMemoryARM(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBindDataGraphPipelineSessionMemoryARM
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkBindDataGraphPipelineSessionMemoryARM(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkBindDataGraphPipelineSessionMemoryInfoARM const *") org.lwjgl.vulkan.VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkBindDataGraphPipelineSessionMemoryARM(r0, r1, r2)
            return r0
    }

    public static void nvkDestroyDataGraphPipelineSessionARM(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyDataGraphPipelineSessionARM
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

    public static void vkDestroyDataGraphPipelineSessionARM(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDataGraphPipelineSessionARM") long r7, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyDataGraphPipelineSessionARM(r0, r1, r2)
            return
    }

    public static void nvkCmdDispatchDataGraphARM(org.lwjgl.vulkan.VkCommandBuffer r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDispatchDataGraphARM
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

    public static void vkCmdDispatchDataGraphARM(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkDataGraphPipelineSessionARM") long r7, @org.lwjgl.system.NativeType("VkDataGraphPipelineDispatchInfoARM const *") org.lwjgl.vulkan.VkDataGraphPipelineDispatchInfoARM r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkCmdDispatchDataGraphARM(r0, r1, r2)
            return
    }

    public static int nvkGetDataGraphPipelineAvailablePropertiesARM(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDataGraphPipelineAvailablePropertiesARM
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
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDataGraphPipelineAvailablePropertiesARM(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDataGraphPipelineInfoARM const *") org.lwjgl.vulkan.VkDataGraphPipelineInfoARM r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("VkDataGraphPipelinePropertyARM *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = r10
            r2 = r10
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetDataGraphPipelineAvailablePropertiesARM(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetDataGraphPipelinePropertiesARM(org.lwjgl.vulkan.VkDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDataGraphPipelinePropertiesARM
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDataGraphPipelinePropertiesARM(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkDataGraphPipelineInfoARM const *") org.lwjgl.vulkan.VkDataGraphPipelineInfoARM r8, @org.lwjgl.system.NativeType("VkDataGraphPipelinePropertyQueryResultARM *") org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer r9) {
            r0 = r7
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            int r2 = r2.remaining()
            r3 = r9
            long r3 = r3.address()
            int r0 = nvkGetDataGraphPipelinePropertiesARM(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(org.lwjgl.vulkan.VkPhysicalDevice r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(org.lwjgl.vulkan.VkPhysicalDevice r7, @org.lwjgl.system.NativeType("uint32_t") int r8, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("VkQueueFamilyDataGraphPropertiesARM *") org.lwjgl.vulkan.VkQueueFamilyDataGraphPropertiesARM.Buffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = r9
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(r0, r1, r2, r3)
            return r0
    }

    public static void nvkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM const *") org.lwjgl.vulkan.VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM r7, @org.lwjgl.system.NativeType("VkQueueFamilyDataGraphProcessingEnginePropertiesARM *") org.lwjgl.vulkan.VkQueueFamilyDataGraphProcessingEnginePropertiesARM r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateDataGraphPipelinesARM(org.lwjgl.vulkan.VkDevice r15, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r16, @org.lwjgl.system.NativeType("VkPipelineCache") long r18, @org.lwjgl.system.NativeType("VkDataGraphPipelineCreateInfoARM const *") org.lwjgl.vulkan.VkDataGraphPipelineCreateInfoARM.Buffer r20, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r21, @org.lwjgl.system.NativeType("VkPipeline *") long[] r22) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDataGraphPipelinesARM
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L34
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r22
            r1 = r20
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r20
            long r0 = r0.address()
            r1 = r20
            int r1 = r1.remaining()
            int r2 = org.lwjgl.vulkan.VkDataGraphPipelineCreateInfoARM.SIZEOF
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelineCreateInfoARM::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L34:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r18
            r3 = r20
            int r3 = r3.remaining()
            r4 = r20
            long r4 = r4.address()
            r5 = r21
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r22
            r7 = r23
            int r0 = org.lwjgl.system.JNI.callPJJPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateDataGraphPipelineSessionARM(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkDataGraphPipelineSessionCreateInfoARM const *") org.lwjgl.vulkan.VkDataGraphPipelineSessionCreateInfoARM r11, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkDataGraphPipelineSessionARM *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDataGraphPipelineSessionARM
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r13
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDataGraphPipelineSessionBindPointRequirementsARM(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkDataGraphPipelineSessionBindPointRequirementsInfoARM const *") org.lwjgl.vulkan.VkDataGraphPipelineSessionBindPointRequirementsInfoARM r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @org.lwjgl.system.NativeType("VkDataGraphPipelineSessionBindPointRequirementARM *") org.lwjgl.vulkan.VkDataGraphPipelineSessionBindPointRequirementARM.Buffer r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDataGraphPipelineSessionBindPointRequirementsARM
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L21:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDataGraphPipelineAvailablePropertiesARM(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkDataGraphPipelineInfoARM const *") org.lwjgl.vulkan.VkDataGraphPipelineInfoARM r10, @org.lwjgl.system.NativeType("uint32_t *") int[] r11, @org.lwjgl.system.NativeType("VkDataGraphPipelinePropertyARM *") int[] r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDataGraphPipelineAvailablePropertiesARM
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r11
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L21:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            long r1 = r1.address()
            r2 = r11
            r3 = r12
            r4 = r13
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(org.lwjgl.vulkan.VkPhysicalDevice r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("uint32_t *") int[] r11, @org.lwjgl.system.NativeType("VkQueueFamilyDataGraphPropertiesARM *") org.lwjgl.vulkan.VkQueueFamilyDataGraphPropertiesARM.Buffer r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r11
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L21:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r13
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }
}
