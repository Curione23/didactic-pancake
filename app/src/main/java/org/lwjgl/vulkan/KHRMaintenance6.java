package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance6.class */
public class KHRMaintenance6 {
    public static final int VK_KHR_MAINTENANCE_6_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_MAINTENANCE_6_EXTENSION_NAME = "VK_KHR_maintenance6";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR = 1000545000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR = 1000545001;
    public static final int VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR = 1000545002;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR = 1000545003;
    public static final int VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR = 1000545004;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR = 1000545005;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR = 1000545006;
    public static final int VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT = 1000545007;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT = 1000545008;

    protected KHRMaintenance6() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdBindDescriptorSets2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindDescriptorSets2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkBindDescriptorSetsInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdBindDescriptorSets2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkBindDescriptorSetsInfo const *") org.lwjgl.vulkan.VkBindDescriptorSetsInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBindDescriptorSets2KHR(r0, r1)
            return
    }

    public static void nvkCmdPushConstants2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushConstants2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkPushConstantsInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdPushConstants2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPushConstantsInfo const *") org.lwjgl.vulkan.VkPushConstantsInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdPushConstants2KHR(r0, r1)
            return
    }

    public static void nvkCmdPushDescriptorSet2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushDescriptorSet2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkPushDescriptorSetInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdPushDescriptorSet2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPushDescriptorSetInfo const *") org.lwjgl.vulkan.VkPushDescriptorSetInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdPushDescriptorSet2KHR(r0, r1)
            return
    }

    public static void nvkCmdPushDescriptorSetWithTemplate2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushDescriptorSetWithTemplate2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdPushDescriptorSetWithTemplate2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPushDescriptorSetWithTemplateInfo const *") org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdPushDescriptorSetWithTemplate2KHR(r0, r1)
            return
    }

    public static void nvkCmdSetDescriptorBufferOffsets2EXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDescriptorBufferOffsets2EXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkSetDescriptorBufferOffsetsInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetDescriptorBufferOffsets2EXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkSetDescriptorBufferOffsetsInfoEXT const *") org.lwjgl.vulkan.VkSetDescriptorBufferOffsetsInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdSetDescriptorBufferOffsets2EXT(r0, r1)
            return
    }

    public static void nvkCmdBindDescriptorBufferEmbeddedSamplers2EXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindDescriptorBufferEmbeddedSamplers2EXT
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkBindDescriptorBufferEmbeddedSamplersInfoEXT const *") org.lwjgl.vulkan.VkBindDescriptorBufferEmbeddedSamplersInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBindDescriptorBufferEmbeddedSamplers2EXT(r0, r1)
            return
    }
}
