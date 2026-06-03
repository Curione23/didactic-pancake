package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance1.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance1.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance1.class */
public class KHRMaintenance1 {
    public static final int VK_KHR_MAINTENANCE_1_SPEC_VERSION = 2;
    public static final java.lang.String VK_KHR_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_maintenance1";
    public static final int VK_KHR_MAINTENANCE1_SPEC_VERSION = 2;
    public static final java.lang.String VK_KHR_MAINTENANCE1_EXTENSION_NAME = "VK_KHR_maintenance1";
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY_KHR = -1000069000;
    public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR = 16384;
    public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR = 32768;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR = 32;

    protected KHRMaintenance1() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkTrimCommandPoolKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkCommandPool") long r9, @org.lwjgl.system.NativeType("VkCommandPoolTrimFlags") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkTrimCommandPoolKHR
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3)
            return
    }
}
