package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance3.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance3.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance3.class */
public class KHRMaintenance3 {
    public static final int VK_KHR_MAINTENANCE_3_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_MAINTENANCE_3_EXTENSION_NAME = "VK_KHR_maintenance3";
    public static final int VK_KHR_MAINTENANCE3_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_MAINTENANCE3_EXTENSION_NAME = "VK_KHR_maintenance3";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR = 1000168000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR = 1000168001;

    protected KHRMaintenance3() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetDescriptorSetLayoutSupportKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDescriptorSetLayoutSupportKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDescriptorSetLayoutSupportKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDescriptorSetLayoutCreateInfo const *") org.lwjgl.vulkan.VkDescriptorSetLayoutCreateInfo r7, @org.lwjgl.system.NativeType("VkDescriptorSetLayoutSupport *") org.lwjgl.vulkan.VkDescriptorSetLayoutSupport r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetDescriptorSetLayoutSupportKHR(r0, r1, r2)
            return
    }
}
