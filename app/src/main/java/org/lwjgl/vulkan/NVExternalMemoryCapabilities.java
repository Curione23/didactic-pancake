package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVExternalMemoryCapabilities.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVExternalMemoryCapabilities.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVExternalMemoryCapabilities.class */
public class NVExternalMemoryCapabilities {
    public static final int VK_NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = 1;
    public static final java.lang.String VK_NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = "VK_NV_external_memory_capabilities";
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV = 1;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV = 2;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV = 4;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV = 8;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV = 1;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV = 2;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV = 4;

    protected NVExternalMemoryCapabilities() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPhysicalDeviceExternalImageFormatPropertiesNV(org.lwjgl.vulkan.VkPhysicalDevice r13, int r14, int r15, int r16, int r17, int r18, int r19, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceExternalImageFormatPropertiesNV
            r22 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r22
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r22
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceExternalImageFormatPropertiesNV(org.lwjgl.vulkan.VkPhysicalDevice r10, @org.lwjgl.system.NativeType("VkFormat") int r11, @org.lwjgl.system.NativeType("VkImageType") int r12, @org.lwjgl.system.NativeType("VkImageTiling") int r13, @org.lwjgl.system.NativeType("VkImageUsageFlags") int r14, @org.lwjgl.system.NativeType("VkImageCreateFlags") int r15, @org.lwjgl.system.NativeType("VkExternalMemoryHandleTypeFlagsNV") int r16, @org.lwjgl.system.NativeType("VkExternalImageFormatPropertiesNV *") org.lwjgl.vulkan.VkExternalImageFormatPropertiesNV r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = r7.address()
            int r0 = nvkGetPhysicalDeviceExternalImageFormatPropertiesNV(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }
}
