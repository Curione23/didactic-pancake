package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVXImageViewHandle.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVXImageViewHandle.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVXImageViewHandle.class */
public class NVXImageViewHandle {
    public static final int VK_NVX_IMAGE_VIEW_HANDLE_SPEC_VERSION = 2;
    public static final java.lang.String VK_NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME = "VK_NVX_image_view_handle";
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX = 1000030000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX = 1000030001;

    protected NVXImageViewHandle() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetImageViewHandleNVX(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageViewHandleNVX
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
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public static int vkGetImageViewHandleNVX(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkImageViewHandleInfoNVX const *") org.lwjgl.vulkan.VkImageViewHandleInfoNVX r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkGetImageViewHandleNVX(r0, r1)
            return r0
    }

    public static int nvkGetImageViewAddressNVX(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageViewAddressNVX
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
    public static int vkGetImageViewAddressNVX(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkImageView") long r7, @org.lwjgl.system.NativeType("VkImageViewAddressPropertiesNVX *") org.lwjgl.vulkan.VkImageViewAddressPropertiesNVX r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkGetImageViewAddressNVX(r0, r1, r2)
            return r0
    }
}
