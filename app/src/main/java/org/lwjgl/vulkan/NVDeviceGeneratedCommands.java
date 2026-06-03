package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVDeviceGeneratedCommands.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVDeviceGeneratedCommands.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVDeviceGeneratedCommands.class */
public class NVDeviceGeneratedCommands {
    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 3;
    public static final java.lang.String VK_NV_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_NV_device_generated_commands";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV = 1000277000;
    public static final int VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV = 1000277001;
    public static final int VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV = 1000277002;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV = 1000277003;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV = 1000277004;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV = 1000277005;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV = 1000277006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV = 1000277007;
    public static final int VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV = 262144;
    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV = 131072;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV = 131072;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV = 262144;
    public static final int VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NV = 1000277000;
    public static final int VK_INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV = 1;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV = 0;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV = 1;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV = 2;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV = 3;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV = 4;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV = 5;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV = 6;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV = 7;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV = 1;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV = 2;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NV = 4;

    protected NVDeviceGeneratedCommands() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetGeneratedCommandsMemoryRequirementsNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetGeneratedCommandsMemoryRequirementsNV
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

    public static void vkGetGeneratedCommandsMemoryRequirementsNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkGeneratedCommandsMemoryRequirementsInfoNV const *") org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoNV r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetGeneratedCommandsMemoryRequirementsNV(r0, r1, r2)
            return
    }

    public static void nvkCmdPreprocessGeneratedCommandsNV(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPreprocessGeneratedCommandsNV
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkGeneratedCommandsInfoNV.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdPreprocessGeneratedCommandsNV(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkGeneratedCommandsInfoNV const *") org.lwjgl.vulkan.VkGeneratedCommandsInfoNV r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdPreprocessGeneratedCommandsNV(r0, r1)
            return
    }

    public static void nvkCmdExecuteGeneratedCommandsNV(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdExecuteGeneratedCommandsNV
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkGeneratedCommandsInfoNV.validate(r0)
        L19:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdExecuteGeneratedCommandsNV(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkBool32") boolean r6, @org.lwjgl.system.NativeType("VkGeneratedCommandsInfoNV const *") org.lwjgl.vulkan.VkGeneratedCommandsInfoNV r7) {
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
            nvkCmdExecuteGeneratedCommandsNV(r0, r1, r2)
            return
    }

    public static void vkCmdBindPipelineShaderGroupNV(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkPipelineBindPoint") int r10, @org.lwjgl.system.NativeType("VkPipeline") long r11, @org.lwjgl.system.NativeType("uint32_t") int r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindPipelineShaderGroupNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3, r4)
            return
    }

    public static int nvkCreateIndirectCommandsLayoutNV(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateIndirectCommandsLayoutNV
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkIndirectCommandsLayoutCreateInfoNV.validate(r0)
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
    public static int vkCreateIndirectCommandsLayoutNV(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutCreateInfoNV const *") org.lwjgl.vulkan.VkIndirectCommandsLayoutCreateInfoNV r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutNV *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateIndirectCommandsLayoutNV(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyIndirectCommandsLayoutNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyIndirectCommandsLayoutNV
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

    public static void vkDestroyIndirectCommandsLayoutNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutNV") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyIndirectCommandsLayoutNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutNV(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutCreateInfoNV const *") org.lwjgl.vulkan.VkIndirectCommandsLayoutCreateInfoNV r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutNV *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateIndirectCommandsLayoutNV
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
            org.lwjgl.vulkan.VkIndirectCommandsLayoutCreateInfoNV.validate(r0)
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
}
