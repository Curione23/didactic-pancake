package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDBufferMarker.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDBufferMarker.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDBufferMarker.class */
public class AMDBufferMarker {
    public static final int VK_AMD_BUFFER_MARKER_SPEC_VERSION = 1;
    public static final java.lang.String VK_AMD_BUFFER_MARKER_EXTENSION_NAME = "VK_AMD_buffer_marker";

    protected AMDBufferMarker() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdWriteBufferMarkerAMD(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkPipelineStageFlagBits") int r12, @org.lwjgl.system.NativeType("VkBuffer") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("uint32_t") int r17) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWriteBufferMarkerAMD
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
            r4 = r17
            r5 = r18
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3, r4, r5)
            return
    }
}
