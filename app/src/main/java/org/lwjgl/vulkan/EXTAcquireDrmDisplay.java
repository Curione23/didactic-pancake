package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTAcquireDrmDisplay.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTAcquireDrmDisplay.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTAcquireDrmDisplay.class */
public class EXTAcquireDrmDisplay {
    public static final int VK_EXT_ACQUIRE_DRM_DISPLAY_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_ACQUIRE_DRM_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_drm_display";

    protected EXTAcquireDrmDisplay() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkAcquireDrmDisplayEXT(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("int32_t") int r9, @org.lwjgl.system.NativeType("VkDisplayKHR") long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkAcquireDrmDisplayEXT
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
            int r0 = org.lwjgl.system.JNI.callPJI(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetDrmDisplayEXT(org.lwjgl.vulkan.VkPhysicalDevice r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetDrmDisplayEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDrmDisplayEXT(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("int32_t") int r7, @org.lwjgl.system.NativeType("uint32_t") int r8, @org.lwjgl.system.NativeType("VkDisplayKHR *") java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkGetDrmDisplayEXT(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDrmDisplayEXT(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("int32_t") int r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("VkDisplayKHR *") long[] r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetDrmDisplayEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4)
            return r0
    }
}
