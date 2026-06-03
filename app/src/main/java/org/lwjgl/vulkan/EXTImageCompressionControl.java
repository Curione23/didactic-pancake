package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTImageCompressionControl.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTImageCompressionControl.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTImageCompressionControl.class */
public class EXTImageCompressionControl {
    public static final int VK_EXT_IMAGE_COMPRESSION_CONTROL_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_IMAGE_COMPRESSION_CONTROL_EXTENSION_NAME = "VK_EXT_image_compression_control";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT = 1000338000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT = 1000338001;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT = 1000338002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_EXT = 1000338003;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT = 1000338004;
    public static final int VK_ERROR_COMPRESSION_EXHAUSTED_EXT = -1000338000;
    public static final int VK_IMAGE_COMPRESSION_DEFAULT_EXT = 0;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT = 1;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT = 2;
    public static final int VK_IMAGE_COMPRESSION_DISABLED_EXT = 4;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT = 0;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT = 1;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT = 2;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT = 4;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT = 8;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT = 16;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT = 32;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT = 64;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT = 128;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT = 256;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT = 512;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT = 1024;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT = 2048;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT = 4096;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT = 8192;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT = 16384;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT = 32768;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT = 65536;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT = 131072;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT = 262144;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT = 524288;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT = 1048576;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT = 2097152;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT = 4194304;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT = 8388608;

    protected EXTImageCompressionControl() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
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
