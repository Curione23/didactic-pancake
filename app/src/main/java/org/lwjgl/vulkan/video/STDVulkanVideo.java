package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/STDVulkanVideo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/STDVulkanVideo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/STDVulkanVideo.class */
public class STDVulkanVideo {
    protected STDVulkanVideo() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public static int VK_MAKE_VIDEO_STD_VERSION(@org.lwjgl.system.NativeType("uint32_t") int r4, @org.lwjgl.system.NativeType("uint32_t") int r5, @org.lwjgl.system.NativeType("uint32_t") int r6) {
            r0 = r4
            r1 = 22
            int r0 = r0 << r1
            r1 = r5
            r2 = 12
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r6
            r0 = r0 | r1
            return r0
    }
}
