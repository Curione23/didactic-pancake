package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRExternalFenceCapabilities.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRExternalFenceCapabilities.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRExternalFenceCapabilities.class */
public class KHRExternalFenceCapabilities {
    public static final int VK_KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_fence_capabilities";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR = 1000112000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR = 1000112001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR = 1000071004;
    public static final int VK_LUID_SIZE_KHR = 8;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR = 1;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR = 2;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = 4;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR = 8;
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR = 1;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR = 2;

    protected KHRExternalFenceCapabilities() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetPhysicalDeviceExternalFencePropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceExternalFencePropertiesKHR
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

    public static void vkGetPhysicalDeviceExternalFencePropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkPhysicalDeviceExternalFenceInfo const *") org.lwjgl.vulkan.VkPhysicalDeviceExternalFenceInfo r7, @org.lwjgl.system.NativeType("VkExternalFenceProperties *") org.lwjgl.vulkan.VkExternalFenceProperties r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetPhysicalDeviceExternalFencePropertiesKHR(r0, r1, r2)
            return
    }
}
