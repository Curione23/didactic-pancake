package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDeviceGeneratedCommands.class */
public class EXTDeviceGeneratedCommands {
    public static final int VK_EXT_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_EXT_device_generated_commands";
    public static final int VK_SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT = 128;
    public static final long VK_BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT = 2147483648L;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT = 1000572000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT = 1000572001;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT = 1000572002;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT = 1000572003;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT = 1000572004;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT = 1000572006;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT = 1000572007;
    public static final int VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT = 1000572008;
    public static final int VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT = 1000572009;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT = 1000572010;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT = 1000572011;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT = 1000572012;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT = 1000572013;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT = 1000572014;
    public static final int VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_EXT = 1000572000;
    public static final int VK_OBJECT_TYPE_INDIRECT_EXECUTION_SET_EXT = 1000572001;
    public static final long VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT = 274877906944L;
    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_EXT = 131072;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_EXT = 131072;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_EXT = 262144;
    public static final int VK_INDIRECT_COMMANDS_INPUT_MODE_VULKAN_INDEX_BUFFER_EXT = 1;
    public static final int VK_INDIRECT_COMMANDS_INPUT_MODE_DXGI_INDEX_BUFFER_EXT = 2;
    public static final int VK_INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT = 0;
    public static final int VK_INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT = 1;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT = 1;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT = 2;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT = 0;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT = 1;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT = 2;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT = 3;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT = 4;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT = 5;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT = 6;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT = 7;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_COUNT_EXT = 8;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT = 9;

    protected EXTDeviceGeneratedCommands() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetGeneratedCommandsMemoryRequirementsEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetGeneratedCommandsMemoryRequirementsEXT
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

    public static void vkGetGeneratedCommandsMemoryRequirementsEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkGeneratedCommandsMemoryRequirementsInfoEXT const *") org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetGeneratedCommandsMemoryRequirementsEXT(r0, r1, r2)
            return
    }

    public static void nvkCmdPreprocessGeneratedCommandsEXT(org.lwjgl.vulkan.VkCommandBuffer r9, long r10, org.lwjgl.vulkan.VkCommandBuffer r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPreprocessGeneratedCommandsEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            long r2 = r2.address()
            r3 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdPreprocessGeneratedCommandsEXT(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkGeneratedCommandsInfoEXT const *") org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r6, org.lwjgl.vulkan.VkCommandBuffer r7) {
            r0 = r5
            r1 = r6
            long r1 = r1.address()
            r2 = r7
            nvkCmdPreprocessGeneratedCommandsEXT(r0, r1, r2)
            return
    }

    public static void nvkCmdExecuteGeneratedCommandsEXT(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdExecuteGeneratedCommandsEXT
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdExecuteGeneratedCommandsEXT(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkBool32") boolean r6, @org.lwjgl.system.NativeType("VkGeneratedCommandsInfoEXT const *") org.lwjgl.vulkan.VkGeneratedCommandsInfoEXT r7) {
            r0 = r5
            r1 = r6
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            r2 = r7
            long r2 = r2.address()
            nvkCmdExecuteGeneratedCommandsEXT(r0, r1, r2)
            return
    }

    public static int nvkCreateIndirectCommandsLayoutEXT(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateIndirectCommandsLayoutEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkIndirectCommandsLayoutCreateInfoEXT.validate(r0)
        L19:
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
    public static int vkCreateIndirectCommandsLayoutEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutCreateInfoEXT const *") org.lwjgl.vulkan.VkIndirectCommandsLayoutCreateInfoEXT r9, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutEXT *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateIndirectCommandsLayoutEXT(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyIndirectCommandsLayoutEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyIndirectCommandsLayoutEXT
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

    public static void vkDestroyIndirectCommandsLayoutEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutEXT") long r7, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyIndirectCommandsLayoutEXT(r0, r1, r2)
            return
    }

    public static int nvkCreateIndirectExecutionSetEXT(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateIndirectExecutionSetEXT
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
    public static int vkCreateIndirectExecutionSetEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkIndirectExecutionSetCreateInfoEXT const *") org.lwjgl.vulkan.VkIndirectExecutionSetCreateInfoEXT r9, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateIndirectExecutionSetEXT(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyIndirectExecutionSetEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyIndirectExecutionSetEXT
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

    public static void vkDestroyIndirectExecutionSetEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT") long r7, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyIndirectExecutionSetEXT(r0, r1, r2)
            return
    }

    public static void nvkUpdateIndirectExecutionSetPipelineEXT(org.lwjgl.vulkan.VkDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkUpdateIndirectExecutionSetPipelineEXT
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
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkUpdateIndirectExecutionSetPipelineEXT(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT") long r8, @org.lwjgl.system.NativeType("VkWriteIndirectExecutionSetPipelineEXT const *") org.lwjgl.vulkan.VkWriteIndirectExecutionSetPipelineEXT.Buffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = r10
            long r3 = r3.address()
            nvkUpdateIndirectExecutionSetPipelineEXT(r0, r1, r2, r3)
            return
    }

    public static void nvkUpdateIndirectExecutionSetShaderEXT(org.lwjgl.vulkan.VkDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkUpdateIndirectExecutionSetShaderEXT
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
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkUpdateIndirectExecutionSetShaderEXT(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT") long r8, @org.lwjgl.system.NativeType("VkWriteIndirectExecutionSetShaderEXT const *") org.lwjgl.vulkan.VkWriteIndirectExecutionSetShaderEXT.Buffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = r10
            long r3 = r3.address()
            nvkUpdateIndirectExecutionSetShaderEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutEXT(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutCreateInfoEXT const *") org.lwjgl.vulkan.VkIndirectCommandsLayoutCreateInfoEXT r11, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutEXT *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateIndirectCommandsLayoutEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkIndirectCommandsLayoutCreateInfoEXT.validate(r0)
        L21:
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
    public static int vkCreateIndirectExecutionSetEXT(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkIndirectExecutionSetCreateInfoEXT const *") org.lwjgl.vulkan.VkIndirectExecutionSetCreateInfoEXT r11, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateIndirectExecutionSetEXT
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
}
