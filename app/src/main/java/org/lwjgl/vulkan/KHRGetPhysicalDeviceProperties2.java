package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRGetPhysicalDeviceProperties2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRGetPhysicalDeviceProperties2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRGetPhysicalDeviceProperties2.class */
public class KHRGetPhysicalDeviceProperties2 {
    public static final int VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION = 2;
    public static final java.lang.String VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_physical_device_properties2";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR = 1000059000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR = 1000059001;
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR = 1000059002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR = 1000059003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR = 1000059004;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR = 1000059005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR = 1000059006;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR = 1000059007;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR = 1000059008;

    protected KHRGetPhysicalDeviceProperties2() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetPhysicalDeviceFeatures2KHR(org.lwjgl.vulkan.VkPhysicalDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceFeatures2KHR
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkGetPhysicalDeviceFeatures2KHR(org.lwjgl.vulkan.VkPhysicalDevice r4, @org.lwjgl.system.NativeType("VkPhysicalDeviceFeatures2 *") org.lwjgl.vulkan.VkPhysicalDeviceFeatures2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkGetPhysicalDeviceFeatures2KHR(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceProperties2KHR
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkGetPhysicalDeviceProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r4, @org.lwjgl.system.NativeType("VkPhysicalDeviceProperties2 *") org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkGetPhysicalDeviceProperties2KHR(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceFormatProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceFormatProperties2KHR
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetPhysicalDeviceFormatProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r5, @org.lwjgl.system.NativeType("VkFormat") int r6, @org.lwjgl.system.NativeType("VkFormatProperties2 *") org.lwjgl.vulkan.VkFormatProperties2 r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = r2.address()
            nvkGetPhysicalDeviceFormatProperties2KHR(r0, r1, r2)
            return
    }

    public static int nvkGetPhysicalDeviceImageFormatProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceImageFormatProperties2KHR
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
    public static int vkGetPhysicalDeviceImageFormatProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkPhysicalDeviceImageFormatInfo2 const *") org.lwjgl.vulkan.VkPhysicalDeviceImageFormatInfo2 r7, @org.lwjgl.system.NativeType("VkImageFormatProperties2 *") org.lwjgl.vulkan.VkImageFormatProperties2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            int r0 = nvkGetPhysicalDeviceImageFormatProperties2KHR(r0, r1, r2)
            return r0
    }

    public static void nvkGetPhysicalDeviceQueueFamilyProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceQueueFamilyProperties2KHR
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkQueueFamilyProperties2 *") org.lwjgl.vulkan.VkQueueFamilyProperties2.Buffer r8) {
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
            nvkGetPhysicalDeviceQueueFamilyProperties2KHR(r0, r1, r2)
            return
    }

    public static void nvkGetPhysicalDeviceMemoryProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceMemoryProperties2KHR
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkGetPhysicalDeviceMemoryProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r4, @org.lwjgl.system.NativeType("VkPhysicalDeviceMemoryProperties2 *") org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkGetPhysicalDeviceMemoryProperties2KHR(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceSparseImageFormatProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSparseImageFormatProperties2KHR
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
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2 r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageFormatProperties2 *") org.lwjgl.vulkan.VkSparseImageFormatProperties2.Buffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = r10
            r2 = r10
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nvkGetPhysicalDeviceSparseImageFormatProperties2KHR(r0, r1, r2, r3)
            return
    }

    public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkQueueFamilyProperties2 *") org.lwjgl.vulkan.VkQueueFamilyProperties2.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceQueueFamilyProperties2KHR
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(org.lwjgl.vulkan.VkPhysicalDevice r10, @org.lwjgl.system.NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") org.lwjgl.vulkan.VkPhysicalDeviceSparseImageFormatInfo2 r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageFormatProperties2 *") org.lwjgl.vulkan.VkSparseImageFormatProperties2.Buffer r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceSparseImageFormatProperties2KHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
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
        L21:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4)
            return
    }
}
