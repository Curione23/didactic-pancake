package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTCustomResolve.class */
public class EXTCustomResolve {
    public static final int VK_EXT_CUSTOM_RESOLVE_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_CUSTOM_RESOLVE_EXTENSION_NAME = "VK_EXT_custom_resolve";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT = 1000628000;
    public static final int VK_STRUCTURE_TYPE_BEGIN_CUSTOM_RESOLVE_INFO_EXT = 1000628001;
    public static final int VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT = 1000628002;
    public static final int VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_EXT = 4;
    public static final int VK_SUBPASS_DESCRIPTION_CUSTOM_RESOLVE_BIT_EXT = 8;
    public static final int VK_RENDERING_FRAGMENT_REGION_BIT_EXT = 64;
    public static final int VK_RENDERING_CUSTOM_RESOLVE_BIT_EXT = 128;
    public static final int VK_RESOLVE_MODE_CUSTOM_BIT_EXT = 32;

    protected EXTCustomResolve() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdBeginCustomResolveEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginCustomResolveEXT
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

    public static void vkCmdBeginCustomResolveEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkBeginCustomResolveInfoEXT const *") org.lwjgl.vulkan.VkBeginCustomResolveInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            nvkCmdBeginCustomResolveEXT(r0, r1)
            return
    }
}
