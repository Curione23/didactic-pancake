package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRPushDescriptor.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRPushDescriptor.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRPushDescriptor.class */
public class KHRPushDescriptor {
    public static final int VK_KHR_PUSH_DESCRIPTOR_SPEC_VERSION = 2;
    public static final java.lang.String VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME = "VK_KHR_push_descriptor";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR = 1000080000;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR = 1;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = 1;

    protected KHRPushDescriptor() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdPushDescriptorSetKHR(org.lwjgl.vulkan.VkCommandBuffer r12, int r13, long r14, int r16, int r17, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushDescriptorSetKHR
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r20
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdPushDescriptorSetKHR(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkPipelineBindPoint") int r10, @org.lwjgl.system.NativeType("VkPipelineLayout") long r11, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("VkWriteDescriptorSet const *") org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r14) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            int r4 = r4.remaining()
            r5 = r14
            long r5 = r5.address()
            nvkCmdPushDescriptorSetKHR(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdPushDescriptorSetWithTemplateKHR(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplate") long r13, @org.lwjgl.system.NativeType("VkPipelineLayout") long r15, @org.lwjgl.system.NativeType("uint32_t") int r17, @org.lwjgl.system.NativeType("void const *") long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushDescriptorSetWithTemplateKHR
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r20
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5)
            return
    }
}
