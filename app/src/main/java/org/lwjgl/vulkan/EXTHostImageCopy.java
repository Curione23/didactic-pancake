package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTHostImageCopy.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTHostImageCopy.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTHostImageCopy.class */
public class EXTHostImageCopy {
    public static final int VK_EXT_HOST_IMAGE_COPY_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_HOST_IMAGE_COPY_EXTENSION_NAME = "VK_EXT_host_image_copy";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT = 1000270000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT = 1000270001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT = 1000270002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT = 1000270003;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT = 1000270004;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT = 1000270005;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT = 1000270006;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO_EXT = 1000270007;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT = 1000270008;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT = 1000270009;
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT = 4194304;
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT = 70368744177664L;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_EXT = 1;

    protected EXTHostImageCopy() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCopyMemoryToImageEXT(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyMemoryToImageEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyMemoryToImageInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCopyMemoryToImageEXT(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkCopyMemoryToImageInfoEXT const *") org.lwjgl.vulkan.VkCopyMemoryToImageInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkCopyMemoryToImageEXT(r0, r1)
            return r0
    }

    public static int nvkCopyImageToMemoryEXT(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyImageToMemoryEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCopyImageToMemoryEXT(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkCopyImageToMemoryInfoEXT const *") org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkCopyImageToMemoryEXT(r0, r1)
            return r0
    }

    public static int nvkCopyImageToImageEXT(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyImageToImageEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCopyImageToImageEXT(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkCopyImageToImageInfoEXT const *") org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkCopyImageToImageEXT(r0, r1)
            return r0
    }

    public static int nvkTransitionImageLayoutEXT(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkTransitionImageLayoutEXT
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
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkTransitionImageLayoutEXT(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkHostImageLayoutTransitionInfoEXT const *") org.lwjgl.vulkan.VkHostImageLayoutTransitionInfoEXT.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkTransitionImageLayoutEXT(r0, r1, r2)
            return r0
    }

    public static void nvkGetImageSubresourceLayout2EXT(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageSubresourceLayout2EXT
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
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetImageSubresourceLayout2EXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkImage") long r9, @org.lwjgl.system.NativeType("VkImageSubresource2KHR const *") org.lwjgl.vulkan.VkImageSubresource2KHR r11, @org.lwjgl.system.NativeType("VkSubresourceLayout2KHR *") org.lwjgl.vulkan.VkSubresourceLayout2KHR r12) {
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = r3.address()
            nvkGetImageSubresourceLayout2EXT(r0, r1, r2, r3)
            return
    }
}
