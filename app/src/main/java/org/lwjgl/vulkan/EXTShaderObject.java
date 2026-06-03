package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTShaderObject.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTShaderObject.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTShaderObject.class */
public class EXTShaderObject {
    public static final int VK_EXT_SHADER_OBJECT_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_SHADER_OBJECT_EXTENSION_NAME = "VK_EXT_shader_object";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT = 1000482000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT = 1000482001;
    public static final int VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT = 1000482002;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT = 1000352001;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT = 1000352002;
    public static final int VK_STRUCTURE_TYPE_SHADER_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT = 1000225001;
    public static final int VK_OBJECT_TYPE_SHADER_EXT = 1000482000;
    public static final int VK_ERROR_INCOMPATIBLE_SHADER_BINARY_EXT = 1000482000;
    public static final int VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT = 2;
    public static final int VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT = 4;
    public static final int VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT = 8;
    public static final int VK_SHADER_CREATE_DISPATCH_BASE_BIT_EXT = 16;
    public static final int VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT = 32;
    public static final int VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 64;
    public static final int VK_SHADER_CREATE_LINK_STAGE_BIT_EXT = 1;
    public static final int VK_SHADER_CODE_TYPE_BINARY_EXT = 0;
    public static final int VK_SHADER_CODE_TYPE_SPIRV_EXT = 1;

    protected EXTShaderObject() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateShadersEXT(org.lwjgl.vulkan.VkDevice r12, int r13, long r14, long r16, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateShadersEXT
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r13
            int r2 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L22:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r20
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateShadersEXT(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkShaderCreateInfoEXT const *") org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r11, @org.lwjgl.system.NativeType("VkShaderEXT *") java.nio.LongBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r12
            r1 = r10
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = r10
            long r2 = r2.address()
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nvkCreateShadersEXT(r0, r1, r2, r3, r4)
            return r0
    }

    public static void nvkDestroyShaderEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyShaderEXT
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
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyShaderEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkShaderEXT") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyShaderEXT(r0, r1, r2)
            return
    }

    public static int nvkGetShaderBinaryDataEXT(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetShaderBinaryDataEXT
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
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetShaderBinaryDataEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkShaderEXT") long r9, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            long r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L18:
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetShaderBinaryDataEXT(r0, r1, r2, r3)
            return r0
    }

    public static void nvkCmdBindShadersEXT(org.lwjgl.vulkan.VkCommandBuffer r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindShadersEXT
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
            r3 = r14
            r4 = r16
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdBindShadersEXT(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkShaderStageFlagBits const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("VkShaderEXT const *") java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nvkCmdBindShadersEXT(r0, r1, r2, r3)
            return
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

    public static void nvkCmdSetVertexInputEXT(org.lwjgl.vulkan.VkCommandBuffer r11, int r12, long r13, int r15, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetVertexInputEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r18
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdSetVertexInputEXT(org.lwjgl.vulkan.VkCommandBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVertexInputBindingDescription2EXT const *") org.lwjgl.vulkan.VkVertexInputBindingDescription2EXT.Buffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVertexInputAttributeDescription2EXT const *") org.lwjgl.vulkan.VkVertexInputAttributeDescription2EXT.Buffer r10) {
            r0 = r8
            r1 = r9
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r10
            int r3 = org.lwjgl.system.Checks.remainingSafe(r3)
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nvkCmdSetVertexInputEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetPatchControlPointsEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetPatchControlPointsEXT
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

    public static void vkCmdSetRasterizerDiscardEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRasterizerDiscardEnableEXT
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

    public static void vkCmdSetDepthBiasEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthBiasEnableEXT
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

    public static void vkCmdSetLogicOpEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkLogicOp") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetLogicOpEXT
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

    public static void vkCmdSetPrimitiveRestartEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetPrimitiveRestartEnableEXT
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

    public static void vkCmdSetTessellationDomainOriginEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkTessellationDomainOrigin") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetTessellationDomainOriginEXT
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

    public static void vkCmdSetDepthClampEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthClampEnableEXT
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

    public static void vkCmdSetPolygonModeEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkPolygonMode") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetPolygonModeEXT
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

    public static void vkCmdSetRasterizationSamplesEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRasterizationSamplesEXT
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

    public static void nvkCmdSetSampleMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetSampleMaskEXT
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

    public static void vkCmdSetSampleMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r6, @org.lwjgl.system.NativeType("VkSampleMask const *") java.nio.IntBuffer r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvkCmdSetSampleMaskEXT(r0, r1, r2)
            return
    }

    public static void vkCmdSetAlphaToCoverageEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetAlphaToCoverageEnableEXT
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

    public static void vkCmdSetAlphaToOneEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetAlphaToOneEnableEXT
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

    public static void vkCmdSetLogicOpEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetLogicOpEnableEXT
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

    public static void nvkCmdSetColorBlendEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorBlendEnableEXT
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

    public static void vkCmdSetColorBlendEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkBool32 const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nvkCmdSetColorBlendEnableEXT(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdSetColorBlendEquationEXT(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorBlendEquationEXT
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

    public static void vkCmdSetColorBlendEquationEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkColorBlendEquationEXT const *") org.lwjgl.vulkan.VkColorBlendEquationEXT.Buffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = r3.address()
            nvkCmdSetColorBlendEquationEXT(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdSetColorWriteMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorWriteMaskEXT
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

    public static void vkCmdSetColorWriteMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkColorComponentFlags const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nvkCmdSetColorWriteMaskEXT(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetRasterizationStreamEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRasterizationStreamEXT
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

    public static void vkCmdSetConservativeRasterizationModeEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkConservativeRasterizationModeEXT") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetConservativeRasterizationModeEXT
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

    public static void vkCmdSetExtraPrimitiveOverestimationSizeEXT(org.lwjgl.vulkan.VkCommandBuffer r6, float r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetExtraPrimitiveOverestimationSizeEXT
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

    public static void vkCmdSetDepthClipEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthClipEnableEXT
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

    public static void vkCmdSetSampleLocationsEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetSampleLocationsEnableEXT
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

    public static void nvkCmdSetColorBlendAdvancedEXT(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorBlendAdvancedEXT
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

    public static void vkCmdSetColorBlendAdvancedEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkColorBlendAdvancedEXT const *") org.lwjgl.vulkan.VkColorBlendAdvancedEXT.Buffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = r3.address()
            nvkCmdSetColorBlendAdvancedEXT(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetProvokingVertexModeEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkProvokingVertexModeEXT") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetProvokingVertexModeEXT
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

    public static void vkCmdSetLineRasterizationModeEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkLineRasterizationModeEXT") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetLineRasterizationModeEXT
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

    public static void vkCmdSetLineStippleEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetLineStippleEnableEXT
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

    public static void vkCmdSetDepthClipNegativeOneToOneEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDepthClipNegativeOneToOneEXT
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

    public static void vkCmdSetViewportWScalingEnableNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetViewportWScalingEnableNV
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

    public static void nvkCmdSetViewportSwizzleNV(org.lwjgl.vulkan.VkCommandBuffer r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetViewportSwizzleNV
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

    public static void vkCmdSetViewportSwizzleNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7, @org.lwjgl.system.NativeType("VkViewportSwizzleNV const *") org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = r3.address()
            nvkCmdSetViewportSwizzleNV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetCoverageToColorEnableNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageToColorEnableNV
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

    public static void vkCmdSetCoverageToColorLocationNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageToColorLocationNV
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

    public static void vkCmdSetCoverageModulationModeNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkCoverageModulationModeNV") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageModulationModeNV
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

    public static void vkCmdSetCoverageModulationTableEnableNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageModulationTableEnableNV
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

    public static void nvkCmdSetCoverageModulationTableNV(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageModulationTableNV
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

    public static void vkCmdSetCoverageModulationTableNV(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvkCmdSetCoverageModulationTableNV(r0, r1, r2)
            return
    }

    public static void vkCmdSetShadingRateImageEnableNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetShadingRateImageEnableNV
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

    public static void vkCmdSetRepresentativeFragmentTestEnableNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkBool32") boolean r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetRepresentativeFragmentTestEnableNV
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

    public static void vkCmdSetCoverageReductionModeNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkCoverageReductionModeNV") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageReductionModeNV
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

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateShadersEXT(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkShaderCreateInfoEXT const *") org.lwjgl.vulkan.VkShaderCreateInfoEXT.Buffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r13, @org.lwjgl.system.NativeType("VkShaderEXT *") long[] r14) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateShadersEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L30
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            long r0 = r0.address()
            r1 = r12
            int r1 = r1.remaining()
            int r2 = org.lwjgl.vulkan.VkShaderCreateInfoEXT.SIZEOF
            int r3 = org.lwjgl.vulkan.VkShaderCreateInfoEXT::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L30:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            int r1 = r1.remaining()
            r2 = r12
            long r2 = r2.address()
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            r5 = r15
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void vkCmdBindShadersEXT(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("VkShaderStageFlagBits const *") int[] r9, @org.lwjgl.system.NativeType("VkShaderEXT const *") long[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindShadersEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r9
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            int r1 = r1.length
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
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

    public static void vkCmdSetSampleMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r8, @org.lwjgl.system.NativeType("VkSampleMask const *") int[] r9) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetSampleMaskEXT
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetColorBlendEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("VkBool32 const *") int[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorBlendEnableEXT
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

    public static void vkCmdSetColorWriteMaskEXT(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("VkColorComponentFlags const *") int[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetColorWriteMaskEXT
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

    public static void vkCmdSetCoverageModulationTableNV(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("float const *") float[] r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetCoverageModulationTableNV
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            int r1 = r1.length
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }
}
