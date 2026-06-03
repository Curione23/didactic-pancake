package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRVideoDecodeQueue.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRVideoDecodeQueue.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRVideoDecodeQueue.class */
public class KHRVideoDecodeQueue {
    public static final int VK_KHR_VIDEO_DECODE_QUEUE_SPEC_VERSION = 7;
    public static final java.lang.String VK_KHR_VIDEO_DECODE_QUEUE_EXTENSION_NAME = "VK_KHR_video_decode_queue";
    public static final int VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR = 1000024000;
    public static final int VK_STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR = 1000024001;
    public static final int VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR = 1000024002;
    public static final int VK_QUEUE_VIDEO_DECODE_BIT_KHR = 32;
    public static final long VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR = 67108864;
    public static final long VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR = 34359738368L;
    public static final long VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR = 68719476736L;
    public static final int VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 8192;
    public static final int VK_BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR = 16384;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR = 1024;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 2048;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR = 4096;
    public static final int VK_FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR = 33554432;
    public static final int VK_FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR = 67108864;
    public static final int VK_IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR = 1000024000;
    public static final int VK_IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR = 1000024001;
    public static final int VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR = 1000024002;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR = 33554432;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR = 67108864;
    public static final int VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR = 1;
    public static final int VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR = 2;
    public static final int VK_VIDEO_DECODE_USAGE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR = 1;
    public static final int VK_VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR = 2;
    public static final int VK_VIDEO_DECODE_USAGE_STREAMING_BIT_KHR = 4;

    protected KHRVideoDecodeQueue() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdDecodeVideoKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDecodeVideoKHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdDecodeVideoKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkVideoDecodeInfoKHR const *") org.lwjgl.vulkan.VkVideoDecodeInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdDecodeVideoKHR(r0, r1)
            return
    }
}
