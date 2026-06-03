package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTHdrMetadata.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTHdrMetadata.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTHdrMetadata.class */
public class EXTHdrMetadata {
    public static final int VK_EXT_HDR_METADATA_SPEC_VERSION = 2;
    public static final java.lang.String VK_EXT_HDR_METADATA_EXTENSION_NAME = "VK_EXT_hdr_metadata";
    public static final int VK_STRUCTURE_TYPE_HDR_METADATA_EXT = 1000105000;

    protected EXTHdrMetadata() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkSetHdrMetadataEXT(org.lwjgl.vulkan.VkDevice r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSetHdrMetadataEXT
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

    public static void vkSetHdrMetadataEXT(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkSwapchainKHR const *") java.nio.LongBuffer r8, @org.lwjgl.system.NativeType("VkHdrMetadataEXT const *") org.lwjgl.vulkan.VkHdrMetadataEXT.Buffer r9) {
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
            long r3 = r3.address()
            nvkSetHdrMetadataEXT(r0, r1, r2, r3)
            return
    }

    public static void vkSetHdrMetadataEXT(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkSwapchainKHR const *") long[] r10, @org.lwjgl.system.NativeType("VkHdrMetadataEXT const *") org.lwjgl.vulkan.VkHdrMetadataEXT.Buffer r11) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSetHdrMetadataEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = r10
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            int r1 = r1.length
            r2 = r10
            r3 = r11
            long r3 = r3.address()
            r4 = r12
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }
}
