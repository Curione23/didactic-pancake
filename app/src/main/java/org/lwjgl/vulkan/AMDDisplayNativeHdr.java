package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDDisplayNativeHdr.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDDisplayNativeHdr.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDDisplayNativeHdr.class */
public class AMDDisplayNativeHdr {
    public static final int VK_AMD_DISPLAY_NATIVE_HDR_SPEC_VERSION = 1;
    public static final java.lang.String VK_AMD_DISPLAY_NATIVE_HDR_EXTENSION_NAME = "VK_AMD_display_native_hdr";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD = 1000213000;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD = 1000213001;
    public static final int VK_COLOR_SPACE_DISPLAY_NATIVE_AMD = 1000213000;

    protected AMDDisplayNativeHdr() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkSetLocalDimmingAMD(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r9, @org.lwjgl.system.NativeType("VkBool32") boolean r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSetLocalDimmingAMD
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
            if (r2 == 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            r3 = r12
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3)
            return
    }
}
