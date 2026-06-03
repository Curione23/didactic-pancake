package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVScissorExclusive.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVScissorExclusive.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVScissorExclusive.class */
public class NVScissorExclusive {
    public static final int VK_NV_SCISSOR_EXCLUSIVE_SPEC_VERSION = 2;
    public static final java.lang.String VK_NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME = "VK_NV_scissor_exclusive";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV = 1000205000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV = 1000205002;
    public static final int VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV = 1000205000;
    public static final int VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV = 1000205001;

    protected NVScissorExclusive() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdSetExclusiveScissorEnableNV(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetExclusiveScissorEnableNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetExclusiveScissorEnableNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkBool32 const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nvkCmdSetExclusiveScissorEnableNV(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdSetExclusiveScissorNV(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetExclusiveScissorNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetExclusiveScissorNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkRect2D const *") org.lwjgl.vulkan.VkRect2D.Buffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = r3.address()
            nvkCmdSetExclusiveScissorNV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetExclusiveScissorEnableNV(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("VkBool32 const *") int[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetExclusiveScissorEnableNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            int r2 = r2.length
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }
}
