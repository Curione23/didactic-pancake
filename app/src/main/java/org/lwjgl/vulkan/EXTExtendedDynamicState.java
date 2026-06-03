package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTExtendedDynamicState.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTExtendedDynamicState.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTExtendedDynamicState.class */
public class EXTExtendedDynamicState {
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_EXTENDED_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_extended_dynamic_state";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT = 1000267000;
    public static final int VK_DYNAMIC_STATE_CULL_MODE_EXT = 1000267000;
    public static final int VK_DYNAMIC_STATE_FRONT_FACE_EXT = 1000267001;
    public static final int VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT = 1000267002;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT = 1000267003;
    public static final int VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT = 1000267004;
    public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT = 1000267005;
    public static final int VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT = 1000267006;
    public static final int VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT = 1000267007;
    public static final int VK_DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT = 1000267008;
    public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT = 1000267009;
    public static final int VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT = 1000267010;
    public static final int VK_DYNAMIC_STATE_STENCIL_OP_EXT = 1000267011;

    protected EXTExtendedDynamicState() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdSetCullModeEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkCullModeFlags") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCullModeEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetFrontFaceEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkFrontFace") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetFrontFaceEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetPrimitiveTopologyEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkPrimitiveTopology") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetPrimitiveTopologyEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void nvkCmdSetViewportWithCountEXT(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetViewportWithCountEXT
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

    public static void vkCmdSetViewportWithCountEXT(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkViewport const *") org.lwjgl.vulkan.VkViewport.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            nvkCmdSetViewportWithCountEXT(r0, r1, r2)
            return
    }

    public static void nvkCmdSetScissorWithCountEXT(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetScissorWithCountEXT
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

    public static void vkCmdSetScissorWithCountEXT(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkRect2D const *") org.lwjgl.vulkan.VkRect2D.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            nvkCmdSetScissorWithCountEXT(r0, r1, r2)
            return
    }

    public static void nvkCmdBindVertexBuffers2EXT(org.lwjgl.vulkan.VkCommandBuffer r15, int r16, int r17, long r18, long r20, long r22, long r24) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindVertexBuffers2EXT
            r26 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r26
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r22
            r6 = r24
            r7 = r26
            org.lwjgl.system.JNI.callPPPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkCmdBindVertexBuffers2EXT(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("VkBuffer const *") java.nio.LongBuffer r14, @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L20
            r0 = r15
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L20:
            r0 = r12
            r1 = r13
            r2 = r14
            int r2 = r2.remaining()
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r17
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            nvkCmdBindVertexBuffers2EXT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdSetDepthTestEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthTestEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetDepthWriteEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthWriteEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetDepthCompareOpEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkCompareOp") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthCompareOpEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetDepthBoundsTestEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthBoundsTestEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetStencilTestEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetStencilTestEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetStencilOpEXT(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkStencilFaceFlags") int r11, @org.lwjgl.system.NativeType("VkStencilOp") int r12, @org.lwjgl.system.NativeType("VkStencilOp") int r13, @org.lwjgl.system.NativeType("VkStencilOp") int r14, @org.lwjgl.system.NativeType("VkCompareOp") int r15) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetStencilOpEXT
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdBindVertexBuffers2EXT(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("VkBuffer const *") long[] r13, @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindVertexBuffers2EXT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L29
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r13
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = r13
            int r1 = r1.length
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r16
            r1 = r13
            int r1 = r1.length
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L29:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            int r2 = r2.length
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPPPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
