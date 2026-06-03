package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSharedPresentableImage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSharedPresentableImage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSharedPresentableImage.class */
public class KHRSharedPresentableImage {
    public static final int VK_KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME = "VK_KHR_shared_presentable_image";
    public static final int VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR = 1000111000;
    public static final int VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR = 1000111000;
    public static final int VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR = 1000111001;
    public static final int VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR = 1000111000;

    protected KHRSharedPresentableImage() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetSwapchainStatusKHR(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSwapchainStatusKHR
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
            int r0 = org.lwjgl.system.JNI.callPJI(r0, r1, r2)
            return r0
    }
}
