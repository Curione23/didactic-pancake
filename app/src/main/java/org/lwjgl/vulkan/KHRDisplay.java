package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDisplay.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDisplay.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDisplay.class */
public class KHRDisplay {
    public static final int VK_KHR_DISPLAY_SPEC_VERSION = 23;
    public static final java.lang.String VK_KHR_DISPLAY_EXTENSION_NAME = "VK_KHR_display";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR = 1000002000;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR = 1000002001;
    public static final int VK_OBJECT_TYPE_DISPLAY_KHR = 1000002000;
    public static final int VK_OBJECT_TYPE_DISPLAY_MODE_KHR = 1000002001;
    public static final int VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = 1;
    public static final int VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = 2;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = 4;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 8;

    protected KHRDisplay() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPhysicalDeviceDisplayPropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceDisplayPropertiesKHR
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
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDisplayPropertiesKHR *") org.lwjgl.vulkan.VkDisplayPropertiesKHR.Buffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = r7
            r2 = r7
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nvkGetPhysicalDeviceDisplayPropertiesKHR(r0, r1, r2)
            return r0
    }

    public static int nvkGetPhysicalDeviceDisplayPlanePropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceDisplayPlanePropertiesKHR
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
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDisplayPlanePropertiesKHR *") org.lwjgl.vulkan.VkDisplayPlanePropertiesKHR.Buffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = r7
            r2 = r7
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nvkGetPhysicalDeviceDisplayPlanePropertiesKHR(r0, r1, r2)
            return r0
    }

    public static int nvkGetDisplayPlaneSupportedDisplaysKHR(org.lwjgl.vulkan.VkPhysicalDevice r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetDisplayPlaneSupportedDisplaysKHR
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(org.lwjgl.vulkan.VkPhysicalDevice r7, @org.lwjgl.system.NativeType("uint32_t") int r8, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDisplayKHR *") java.nio.LongBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = r9
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetDisplayPlaneSupportedDisplaysKHR(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetDisplayModePropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetDisplayModePropertiesKHR
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
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDisplayModePropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("VkDisplayKHR") long r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDisplayModePropertiesKHR *") org.lwjgl.vulkan.VkDisplayModePropertiesKHR.Buffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L18:
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetDisplayModePropertiesKHR(r0, r1, r2, r3)
            return r0
    }

    public static int nvkCreateDisplayModeKHR(org.lwjgl.vulkan.VkPhysicalDevice r13, long r14, long r16, long r18, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDisplayModeKHR
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
    public static int vkCreateDisplayModeKHR(org.lwjgl.vulkan.VkPhysicalDevice r10, @org.lwjgl.system.NativeType("VkDisplayKHR") long r11, @org.lwjgl.system.NativeType("VkDisplayModeCreateInfoKHR const *") org.lwjgl.vulkan.VkDisplayModeCreateInfoKHR r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r14, @org.lwjgl.system.NativeType("VkDisplayModeKHR *") java.nio.LongBuffer r15) {
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
            int r0 = nvkCreateDisplayModeKHR(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nvkGetDisplayPlaneCapabilitiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetDisplayPlaneCapabilitiesKHR
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
    public static int vkGetDisplayPlaneCapabilitiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r7, @org.lwjgl.system.NativeType("VkDisplayModeKHR") long r8, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("VkDisplayPlaneCapabilitiesKHR *") org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r11) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            long r3 = r3.address()
            int r0 = nvkGetDisplayPlaneCapabilitiesKHR(r0, r1, r2, r3)
            return r0
    }

    public static int nvkCreateDisplayPlaneSurfaceKHR(org.lwjgl.vulkan.VkInstance r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDisplayPlaneSurfaceKHR
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
    public static int vkCreateDisplayPlaneSurfaceKHR(org.lwjgl.vulkan.VkInstance r8, @org.lwjgl.system.NativeType("VkDisplaySurfaceCreateInfoKHR const *") org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkSurfaceKHR *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateDisplayPlaneSurfaceKHR(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDisplayPropertiesKHR *") org.lwjgl.vulkan.VkDisplayPropertiesKHR.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceDisplayPropertiesKHR
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1f:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDisplayPlanePropertiesKHR *") org.lwjgl.vulkan.VkDisplayPlanePropertiesKHR.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceDisplayPlanePropertiesKHR
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1f:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("uint32_t *") int[] r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDisplayKHR *") long[] r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetDisplayPlaneSupportedDisplaysKHR
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = r10
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L21:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetDisplayModePropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r10, @org.lwjgl.system.NativeType("VkDisplayKHR") long r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDisplayModePropertiesKHR *") org.lwjgl.vulkan.VkDisplayModePropertiesKHR.Buffer r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetDisplayModePropertiesKHR
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r13
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L22:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateDisplayModeKHR(org.lwjgl.vulkan.VkPhysicalDevice r12, @org.lwjgl.system.NativeType("VkDisplayKHR") long r13, @org.lwjgl.system.NativeType("VkDisplayModeCreateInfoKHR const *") org.lwjgl.vulkan.VkDisplayModeCreateInfoKHR r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r16, @org.lwjgl.system.NativeType("VkDisplayModeKHR *") long[] r17) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDisplayModeKHR
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
    public static int vkCreateDisplayPlaneSurfaceKHR(org.lwjgl.vulkan.VkInstance r10, @org.lwjgl.system.NativeType("VkDisplaySurfaceCreateInfoKHR const *") org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkSurfaceKHR *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDisplayPlaneSurfaceKHR
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
}
