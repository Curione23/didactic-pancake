package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDepthClampControl.class */
public class EXTDepthClampControl {
    public static final int VK_EXT_DEPTH_CLAMP_CONTROL_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_DEPTH_CLAMP_CONTROL_EXTENSION_NAME = "VK_EXT_depth_clamp_control";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT = 1000582000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT = 1000582001;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT = 1000582000;

    protected EXTDepthClampControl() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdSetDepthClampRangeEXT(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthClampRangeEXT
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

    public static void vkCmdSetDepthClampRangeEXT(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkDepthClampModeEXT") int r6, @org.lwjgl.system.NativeType("VkDepthClampRangeEXT const *") org.lwjgl.vulkan.VkDepthClampRangeEXT r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkCmdSetDepthClampRangeEXT(r0, r1, r2)
            return
    }
}
