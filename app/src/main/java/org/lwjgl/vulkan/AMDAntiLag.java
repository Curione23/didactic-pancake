package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDAntiLag.class */
public class AMDAntiLag {
    public static final int VK_AMD_ANTI_LAG_SPEC_VERSION = 1;
    public static final java.lang.String VK_AMD_ANTI_LAG_EXTENSION_NAME = "VK_AMD_anti_lag";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD = 1000476000;
    public static final int VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD = 1000476001;
    public static final int VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD = 1000476002;
    public static final int VK_ANTI_LAG_MODE_DRIVER_CONTROL_AMD = 0;
    public static final int VK_ANTI_LAG_MODE_ON_AMD = 1;
    public static final int VK_ANTI_LAG_MODE_OFF_AMD = 2;
    public static final int VK_ANTI_LAG_STAGE_INPUT_AMD = 0;
    public static final int VK_ANTI_LAG_STAGE_PRESENT_AMD = 1;

    protected AMDAntiLag() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkAntiLagUpdateAMD(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkAntiLagUpdateAMD
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

    public static void vkAntiLagUpdateAMD(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkAntiLagDataAMD const *") org.lwjgl.vulkan.VkAntiLagDataAMD r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkAntiLagUpdateAMD(r0, r1)
            return
    }
}
