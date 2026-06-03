package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/QCOMTileShading.class */
public class QCOMTileShading {
    public static final int VK_QCOM_TILE_SHADING_SPEC_VERSION = 2;
    public static final java.lang.String VK_QCOM_TILE_SHADING_EXTENSION_NAME = "VK_QCOM_tile_shading";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM = 1000309000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM = 1000309001;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM = 1000309002;
    public static final int VK_STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM = 1000309003;
    public static final int VK_STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM = 1000309004;
    public static final int VK_STRUCTURE_TYPE_DISPATCH_TILE_INFO_QCOM = 1000309005;
    public static final long VK_ACCESS_2_SHADER_TILE_ATTACHMENT_READ_BIT_QCOM = 2251799813685248L;
    public static final long VK_ACCESS_2_SHADER_TILE_ATTACHMENT_WRITE_BIT_QCOM = 4503599627370496L;
    public static final int VK_SUBPASS_DESCRIPTION_TILE_SHADING_APRON_BIT_QCOM = 256;
    public static final int VK_TILE_SHADING_RENDER_PASS_ENABLE_BIT_QCOM = 1;
    public static final int VK_TILE_SHADING_RENDER_PASS_PER_TILE_EXECUTION_BIT_QCOM = 2;

    protected QCOMTileShading() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdDispatchTileQCOM(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDispatchTileQCOM
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

    public static void vkCmdDispatchTileQCOM(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkDispatchTileInfoQCOM const *") org.lwjgl.vulkan.VkDispatchTileInfoQCOM r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdDispatchTileQCOM(r0, r1)
            return
    }

    public static void nvkCmdBeginPerTileExecutionQCOM(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginPerTileExecutionQCOM
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

    public static void vkCmdBeginPerTileExecutionQCOM(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPerTileBeginInfoQCOM const *") org.lwjgl.vulkan.VkPerTileBeginInfoQCOM r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBeginPerTileExecutionQCOM(r0, r1)
            return
    }

    public static void nvkCmdEndPerTileExecutionQCOM(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndPerTileExecutionQCOM
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

    public static void vkCmdEndPerTileExecutionQCOM(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPerTileEndInfoQCOM const *") org.lwjgl.vulkan.VkPerTileEndInfoQCOM r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdEndPerTileExecutionQCOM(r0, r1)
            return
    }
}
