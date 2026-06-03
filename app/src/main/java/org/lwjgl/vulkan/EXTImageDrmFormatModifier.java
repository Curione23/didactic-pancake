package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTImageDrmFormatModifier.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTImageDrmFormatModifier.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTImageDrmFormatModifier.class */
public class EXTImageDrmFormatModifier {
    public static final int VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_SPEC_VERSION = 2;
    public static final java.lang.String VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_EXTENSION_NAME = "VK_EXT_image_drm_format_modifier";
    public static final int VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT = -1000158000;
    public static final int VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT = 1000158000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT = 1000158002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT = 1000158003;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT = 1000158004;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT = 1000158005;
    public static final int VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT = 1000158000;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT = 128;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT = 256;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT = 512;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT = 1024;
    public static final int VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT = 1000158006;

    protected EXTImageDrmFormatModifier() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetImageDrmFormatModifierPropertiesEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageDrmFormatModifierPropertiesEXT
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
    public static int vkGetImageDrmFormatModifierPropertiesEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkImage") long r7, @org.lwjgl.system.NativeType("VkImageDrmFormatModifierPropertiesEXT *") org.lwjgl.vulkan.VkImageDrmFormatModifierPropertiesEXT r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkGetImageDrmFormatModifierPropertiesEXT(r0, r1, r2)
            return r0
    }
}
