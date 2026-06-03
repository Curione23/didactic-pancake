package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDisplayControl.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDisplayControl.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDisplayControl.class */
public class EXTDisplayControl {
    public static final int VK_EXT_DISPLAY_CONTROL_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME = "VK_EXT_display_control";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT = 1000091000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT = 1000091001;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT = 1000091002;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT = 1000091003;
    public static final int VK_DISPLAY_POWER_STATE_OFF_EXT = 0;
    public static final int VK_DISPLAY_POWER_STATE_SUSPEND_EXT = 1;
    public static final int VK_DISPLAY_POWER_STATE_ON_EXT = 2;
    public static final int VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = 0;
    public static final int VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = 0;

    protected EXTDisplayControl() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkDisplayPowerControlEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDisplayPowerControlEXT
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
    public static int vkDisplayPowerControlEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDisplayKHR") long r7, @org.lwjgl.system.NativeType("VkDisplayPowerInfoEXT const *") org.lwjgl.vulkan.VkDisplayPowerInfoEXT r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkDisplayPowerControlEXT(r0, r1, r2)
            return r0
    }

    public static int nvkRegisterDeviceEventEXT(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkRegisterDeviceEventEXT
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
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkRegisterDeviceEventEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDeviceEventInfoEXT const *") org.lwjgl.vulkan.VkDeviceEventInfoEXT r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkFence *") java.nio.LongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkRegisterDeviceEventEXT(r0, r1, r2, r3)
            return r0
    }

    public static int nvkRegisterDisplayEventEXT(org.lwjgl.vulkan.VkDevice r13, long r14, long r16, long r18, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkRegisterDisplayEventEXT
            r22 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r22
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            r3 = r18
            r4 = r20
            r5 = r22
            int r0 = org.lwjgl.system.JNI.callPJPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkRegisterDisplayEventEXT(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkDisplayKHR") long r11, @org.lwjgl.system.NativeType("VkDisplayEventInfoEXT const *") org.lwjgl.vulkan.VkDisplayEventInfoEXT r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r14, @org.lwjgl.system.NativeType("VkFence *") java.nio.LongBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r10
            r1 = r11
            r2 = r13
            long r2 = r2.address()
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nvkRegisterDisplayEventEXT(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nvkGetSwapchainCounterEXT(org.lwjgl.vulkan.VkDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSwapchainCounterEXT
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetSwapchainCounterEXT(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r8, @org.lwjgl.system.NativeType("VkSurfaceCounterFlagBitsEXT") int r10, @org.lwjgl.system.NativeType("uint64_t *") java.nio.LongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkGetSwapchainCounterEXT(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkRegisterDeviceEventEXT(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkDeviceEventInfoEXT const *") org.lwjgl.vulkan.VkDeviceEventInfoEXT r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkFence *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkRegisterDeviceEventEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r13
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkRegisterDisplayEventEXT(org.lwjgl.vulkan.VkDevice r12, @org.lwjgl.system.NativeType("VkDisplayKHR") long r13, @org.lwjgl.system.NativeType("VkDisplayEventInfoEXT const *") org.lwjgl.vulkan.VkDisplayEventInfoEXT r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r16, @org.lwjgl.system.NativeType("VkFence *") long[] r17) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkRegisterDisplayEventEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            long r2 = r2.address()
            r3 = r16
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r17
            r5 = r18
            int r0 = org.lwjgl.system.JNI.callPJPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetSwapchainCounterEXT(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r10, @org.lwjgl.system.NativeType("VkSurfaceCounterFlagBitsEXT") int r12, @org.lwjgl.system.NativeType("uint64_t *") long[] r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSwapchainCounterEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3, r4)
            return r0
    }
}
