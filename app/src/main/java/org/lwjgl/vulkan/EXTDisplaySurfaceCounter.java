package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDisplaySurfaceCounter.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDisplaySurfaceCounter.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDisplaySurfaceCounter.class */
public class EXTDisplaySurfaceCounter {
    public static final int VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME = "VK_EXT_display_surface_counter";
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT = 1000090000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT = 1000090000;
    public static final int VK_SURFACE_COUNTER_VBLANK_BIT_EXT = 1;
    public static final int VK_SURFACE_COUNTER_VBLANK_EXT = 1;

    protected EXTDisplaySurfaceCounter() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPhysicalDeviceSurfaceCapabilities2EXT(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSurfaceCapabilities2EXT
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
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceCapabilities2EXT(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r7, @org.lwjgl.system.NativeType("VkSurfaceCapabilities2EXT *") org.lwjgl.vulkan.VkSurfaceCapabilities2EXT r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkGetPhysicalDeviceSurfaceCapabilities2EXT(r0, r1, r2)
            return r0
    }
}
