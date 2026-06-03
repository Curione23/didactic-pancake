package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRCopyCommands2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRCopyCommands2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRCopyCommands2.class */
public class KHRCopyCommands2 {
    public static final int VK_KHR_COPY_COMMANDS_2_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_COPY_COMMANDS_2_EXTENSION_NAME = "VK_KHR_copy_commands2";
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR = 1000337000;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR = 1000337001;
    public static final int VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR = 1000337002;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR = 1000337003;
    public static final int VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR = 1000337004;
    public static final int VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR = 1000337005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_COPY_2_KHR = 1000337006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_COPY_2_KHR = 1000337007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR = 1000337008;
    public static final int VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR = 1000337009;
    public static final int VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR = 1000337010;

    protected KHRCopyCommands2() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdCopyBuffer2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyBuffer2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyBufferInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyBuffer2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyBufferInfo2 const *") org.lwjgl.vulkan.VkCopyBufferInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyBuffer2KHR(r0, r1)
            return
    }

    public static void nvkCmdCopyImage2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyImage2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyImageInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyImage2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyImageInfo2 const *") org.lwjgl.vulkan.VkCopyImageInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyImage2KHR(r0, r1)
            return
    }

    public static void nvkCmdCopyBufferToImage2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyBufferToImage2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyBufferToImageInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyBufferToImage2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyBufferToImageInfo2 const *") org.lwjgl.vulkan.VkCopyBufferToImageInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyBufferToImage2KHR(r0, r1)
            return
    }

    public static void nvkCmdCopyImageToBuffer2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyImageToBuffer2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyImageToBuffer2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyImageToBufferInfo2 const *") org.lwjgl.vulkan.VkCopyImageToBufferInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyImageToBuffer2KHR(r0, r1)
            return
    }

    public static void nvkCmdBlitImage2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBlitImage2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkBlitImageInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdBlitImage2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkBlitImageInfo2 const *") org.lwjgl.vulkan.VkBlitImageInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBlitImage2KHR(r0, r1)
            return
    }

    public static void nvkCmdResolveImage2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdResolveImage2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkResolveImageInfo2.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdResolveImage2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkResolveImageInfo2 const *") org.lwjgl.vulkan.VkResolveImageInfo2 r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdResolveImage2KHR(r0, r1)
            return
    }
}
