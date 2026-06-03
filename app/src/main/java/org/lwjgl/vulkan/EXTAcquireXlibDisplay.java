package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTAcquireXlibDisplay.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTAcquireXlibDisplay.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTAcquireXlibDisplay.class */
public class EXTAcquireXlibDisplay {
    public static final int VK_EXT_ACQUIRE_XLIB_DISPLAY_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_xlib_display";

    protected EXTAcquireXlibDisplay() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkAcquireXlibDisplayEXT(org.lwjgl.vulkan.VkPhysicalDevice r9, @org.lwjgl.system.NativeType("Display *") long r10, @org.lwjgl.system.NativeType("VkDisplayKHR") long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkAcquireXlibDisplayEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1a:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            int r0 = org.lwjgl.system.JNI.callPPJI(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetRandROutputDisplayEXT(org.lwjgl.vulkan.VkPhysicalDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetRandROutputDisplayEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1a:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            int r0 = org.lwjgl.system.JNI.callPPNPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetRandROutputDisplayEXT(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("RROutput") long r11, @org.lwjgl.system.NativeType("VkDisplayKHR *") java.nio.LongBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkGetRandROutputDisplayEXT(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetRandROutputDisplayEXT(org.lwjgl.vulkan.VkPhysicalDevice r10, @org.lwjgl.system.NativeType("Display *") long r11, @org.lwjgl.system.NativeType("RROutput") long r13, @org.lwjgl.system.NativeType("VkDisplayKHR *") long[] r15) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetRandROutputDisplayEXT
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L20
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L20:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPPNPI(r0, r1, r2, r3, r4)
            return r0
    }
}
