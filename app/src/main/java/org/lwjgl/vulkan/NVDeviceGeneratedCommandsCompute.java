package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVDeviceGeneratedCommandsCompute.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVDeviceGeneratedCommandsCompute.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVDeviceGeneratedCommandsCompute.class */
public class NVDeviceGeneratedCommandsCompute {
    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_SPEC_VERSION = 2;
    public static final java.lang.String VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_EXTENSION_NAME = "VK_NV_device_generated_commands_compute";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV = 1000428000;
    public static final int VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV = 1000428001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV = 1000428002;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV = 1000428003;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV = 1000428004;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_BIT_NV = 128;

    protected NVDeviceGeneratedCommandsCompute() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetPipelineIndirectMemoryRequirementsNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPipelineIndirectMemoryRequirementsNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkComputePipelineCreateInfo.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetPipelineIndirectMemoryRequirementsNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkComputePipelineCreateInfo const *") org.lwjgl.vulkan.VkComputePipelineCreateInfo r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetPipelineIndirectMemoryRequirementsNV(r0, r1, r2)
            return
    }

    public static void vkCmdUpdatePipelineIndirectBufferNV(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("VkPipelineBindPoint") int r9, @org.lwjgl.system.NativeType("VkPipeline") long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdUpdatePipelineIndirectBufferNV
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
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3)
            return
    }

    public static long nvkGetPipelineIndirectDeviceAddressNV(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPipelineIndirectDeviceAddressNV
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
            long r0 = org.lwjgl.system.JNI.callPPJ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public static long vkGetPipelineIndirectDeviceAddressNV(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkPipelineIndirectDeviceAddressInfoNV const *") org.lwjgl.vulkan.VkPipelineIndirectDeviceAddressInfoNV r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            long r0 = nvkGetPipelineIndirectDeviceAddressNV(r0, r1)
            return r0
    }
}
