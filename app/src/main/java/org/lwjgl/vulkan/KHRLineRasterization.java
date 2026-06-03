package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRLineRasterization.class */
public class KHRLineRasterization {
    public static final int VK_KHR_LINE_RASTERIZATION_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_LINE_RASTERIZATION_EXTENSION_NAME = "VK_KHR_line_rasterization";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR = 1000259000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR = 1000259001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_KHR = 1000259002;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE_KHR = 1000259000;
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR = 0;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR = 1;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR = 2;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR = 3;

    protected KHRLineRasterization() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdSetLineStippleKHR(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("uint32_t") int r8, @org.lwjgl.system.NativeType("uint16_t") short r9) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetLineStippleKHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.system.JNI.callPCV(r0, r1, r2, r3)
            return
    }
}
