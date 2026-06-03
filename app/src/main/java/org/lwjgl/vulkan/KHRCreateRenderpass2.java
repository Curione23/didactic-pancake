package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRCreateRenderpass2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRCreateRenderpass2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRCreateRenderpass2.class */
public class KHRCreateRenderpass2 {
    public static final int VK_KHR_CREATE_RENDERPASS_2_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_CREATE_RENDERPASS_2_EXTENSION_NAME = "VK_KHR_create_renderpass2";
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2_KHR = 1000109000;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR = 1000109001;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR = 1000109002;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR = 1000109003;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR = 1000109004;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR = 1000109005;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_END_INFO_KHR = 1000109006;

    protected KHRCreateRenderpass2() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateRenderPass2KHR(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateRenderPass2KHR
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.validate(r0)
        L19:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateRenderPass2KHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkRenderPassCreateInfo2 const *") org.lwjgl.vulkan.VkRenderPassCreateInfo2 r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkRenderPass *") java.nio.LongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkCreateRenderPass2KHR(r0, r1, r2, r3)
            return r0
    }

    public static void nvkCmdBeginRenderPass2KHR(org.lwjgl.vulkan.VkCommandBuffer r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginRenderPass2KHR
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdBeginRenderPass2KHR(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkRenderPassBeginInfo const *") org.lwjgl.vulkan.VkRenderPassBeginInfo r7, @org.lwjgl.system.NativeType("VkSubpassBeginInfo const *") org.lwjgl.vulkan.VkSubpassBeginInfo r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkCmdBeginRenderPass2KHR(r0, r1, r2)
            return
    }

    public static void nvkCmdNextSubpass2KHR(org.lwjgl.vulkan.VkCommandBuffer r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdNextSubpass2KHR
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdNextSubpass2KHR(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkSubpassBeginInfo const *") org.lwjgl.vulkan.VkSubpassBeginInfo r7, @org.lwjgl.system.NativeType("VkSubpassEndInfo const *") org.lwjgl.vulkan.VkSubpassEndInfo r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkCmdNextSubpass2KHR(r0, r1, r2)
            return
    }

    public static void nvkCmdEndRenderPass2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndRenderPass2KHR
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

    public static void vkCmdEndRenderPass2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkSubpassEndInfo const *") org.lwjgl.vulkan.VkSubpassEndInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdEndRenderPass2KHR(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateRenderPass2KHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkRenderPassCreateInfo2 const *") org.lwjgl.vulkan.VkRenderPassCreateInfo2 r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkRenderPass *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateRenderPass2KHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.validate(r0)
        L21:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r13
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }
}
