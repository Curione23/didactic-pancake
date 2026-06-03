package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRPresentWait.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRPresentWait.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRPresentWait.class */
public class KHRPresentWait {
    public static final int VK_KHR_PRESENT_WAIT_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_PRESENT_WAIT_EXTENSION_NAME = "VK_KHR_present_wait";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR = 1000248000;

    protected KHRPresentWait() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWaitForPresentKHR(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r12, @org.lwjgl.system.NativeType("uint64_t") long r14, @org.lwjgl.system.NativeType("uint64_t") long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWaitForPresentKHR
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
            int r0 = org.lwjgl.system.JNI.callPJJJI(r0, r1, r2, r3, r4)
            return r0
    }
}
