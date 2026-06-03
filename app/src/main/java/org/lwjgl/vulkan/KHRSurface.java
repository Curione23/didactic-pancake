package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSurface.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSurface.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSurface.class */
public class KHRSurface {
    public static final int VK_KHR_SURFACE_SPEC_VERSION = 25;
    public static final java.lang.String VK_KHR_SURFACE_EXTENSION_NAME = "VK_KHR_surface";
    public static final int VK_ERROR_SURFACE_LOST_KHR = -1000000000;
    public static final int VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001;
    public static final int VK_OBJECT_TYPE_SURFACE_KHR = 1000000000;
    public static final int VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = 1;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = 2;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = 4;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = 8;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = 16;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = 32;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 64;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 128;
    public static final int VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = 256;
    public static final int VK_PRESENT_MODE_IMMEDIATE_KHR = 0;
    public static final int VK_PRESENT_MODE_MAILBOX_KHR = 1;
    public static final int VK_PRESENT_MODE_FIFO_KHR = 2;
    public static final int VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3;
    public static final int VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = 0;
    public static final int VK_COLORSPACE_SRGB_NONLINEAR_KHR = 0;
    public static final int VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = 1;
    public static final int VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = 2;
    public static final int VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 4;
    public static final int VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = 8;

    protected KHRSurface() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkDestroySurfaceKHR(org.lwjgl.vulkan.VkInstance r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkDestroySurfaceKHR
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
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroySurfaceKHR(org.lwjgl.vulkan.VkInstance r6, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroySurfaceKHR(r0, r1, r2)
            return
    }

    public static int nvkGetPhysicalDeviceSurfaceSupportKHR(org.lwjgl.vulkan.VkPhysicalDevice r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSurfaceSupportKHR
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
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceSupportKHR(org.lwjgl.vulkan.VkPhysicalDevice r7, @org.lwjgl.system.NativeType("uint32_t") int r8, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r9, @org.lwjgl.system.NativeType("VkBool32 *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkGetPhysicalDeviceSurfaceSupportKHR(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSurfaceCapabilitiesKHR
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
    public static int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r7, @org.lwjgl.system.NativeType("VkSurfaceCapabilitiesKHR *") org.lwjgl.vulkan.VkSurfaceCapabilitiesKHR r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(r0, r1, r2)
            return r0
    }

    public static int nvkGetPhysicalDeviceSurfaceFormatsKHR(org.lwjgl.vulkan.VkPhysicalDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSurfaceFormatsKHR
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
    public static int vkGetPhysicalDeviceSurfaceFormatsKHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSurfaceFormatKHR *") org.lwjgl.vulkan.VkSurfaceFormatKHR.Buffer r12) {
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
            int r0 = nvkGetPhysicalDeviceSurfaceFormatsKHR(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetPhysicalDeviceSurfacePresentModesKHR(org.lwjgl.vulkan.VkPhysicalDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSurfacePresentModesKHR
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
    public static int vkGetPhysicalDeviceSurfacePresentModesKHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPresentModeKHR *") java.nio.IntBuffer r12) {
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
            int r0 = nvkGetPhysicalDeviceSurfacePresentModesKHR(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceSupportKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r11, @org.lwjgl.system.NativeType("VkBool32 *") int[] r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSurfaceSupportKHR
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
            r2 = r11
            r3 = r13
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceFormatsKHR(org.lwjgl.vulkan.VkPhysicalDevice r10, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSurfaceFormatKHR *") org.lwjgl.vulkan.VkSurfaceFormatKHR.Buffer r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSurfaceFormatsKHR
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
    public static int vkGetPhysicalDeviceSurfacePresentModesKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, @org.lwjgl.system.NativeType("VkSurfaceKHR") long r10, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPresentModeKHR *") int[] r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSurfacePresentModesKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L22:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }
}
