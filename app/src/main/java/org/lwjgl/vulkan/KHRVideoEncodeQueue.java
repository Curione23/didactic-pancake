package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRVideoEncodeQueue.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRVideoEncodeQueue.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRVideoEncodeQueue.class */
public class KHRVideoEncodeQueue {
    public static final int VK_KHR_VIDEO_ENCODE_QUEUE_SPEC_VERSION = 10;
    public static final java.lang.String VK_KHR_VIDEO_ENCODE_QUEUE_EXTENSION_NAME = "VK_KHR_video_encode_queue";
    public static final long VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR = 134217728;
    public static final long VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR = 137438953472L;
    public static final long VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR = 274877906944L;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR = 1000299000;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR = 1000299001;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR = 1000299002;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR = 1000299003;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR = 1000299004;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR = 1000299005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR = 1000299006;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR = 1000299007;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR = 1000299008;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR = 1000299009;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR = 1000299010;
    public static final int VK_QUEUE_VIDEO_ENCODE_BIT_KHR = 64;
    public static final int VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR = 2;
    public static final int VK_VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR = 4;
    public static final int VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 32768;
    public static final int VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 65536;
    public static final int VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 8192;
    public static final int VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 16384;
    public static final int VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR = 32768;
    public static final int VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR = 134217728;
    public static final int VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR = 268435456;
    public static final int VK_VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR = 2;
    public static final int VK_IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR = 1000299000;
    public static final int VK_IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR = 1000299001;
    public static final int VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR = 1000299002;
    public static final int VK_QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR = 1000299000;
    public static final int VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR = -1000299000;
    public static final int VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR = -1000299000;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR = 134217728;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR = 268435456;
    public static final int VK_VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR = 1;
    public static final int VK_VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR = 2;
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR = 1;
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR = 2;
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR = 4;
    public static final int VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR = 1;
    public static final int VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR = 2;
    public static final int VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR = 4;
    public static final int VK_VIDEO_ENCODE_USAGE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_ENCODE_USAGE_TRANSCODING_BIT_KHR = 1;
    public static final int VK_VIDEO_ENCODE_USAGE_STREAMING_BIT_KHR = 2;
    public static final int VK_VIDEO_ENCODE_USAGE_RECORDING_BIT_KHR = 4;
    public static final int VK_VIDEO_ENCODE_USAGE_CONFERENCING_BIT_KHR = 8;
    public static final int VK_VIDEO_ENCODE_CONTENT_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR = 1;
    public static final int VK_VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR = 2;
    public static final int VK_VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR = 4;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR = 1;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR = 2;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR = 3;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR = 4;

    protected KHRVideoEncodeQueue() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR const *") org.lwjgl.vulkan.VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR r7, @org.lwjgl.system.NativeType("VkVideoEncodeQualityLevelPropertiesKHR *") org.lwjgl.vulkan.VkVideoEncodeQualityLevelPropertiesKHR r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            int r0 = nvkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(r0, r1, r2)
            return r0
    }

    public static int nvkGetEncodedVideoSessionParametersKHR(org.lwjgl.vulkan.VkDevice r13, long r14, long r16, long r18, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetEncodedVideoSessionParametersKHR
            r22 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r22
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            r3 = r18
            r4 = r20
            r5 = r22
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetEncodedVideoSessionParametersKHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkVideoEncodeSessionParametersGetInfoKHR const *") org.lwjgl.vulkan.VkVideoEncodeSessionParametersGetInfoKHR r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVideoEncodeSessionParametersFeedbackInfoKHR *") org.lwjgl.vulkan.VkVideoEncodeSessionParametersFeedbackInfoKHR r12, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r13
            r2 = r13
            int r2 = r2.position()
            long r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L18:
            r0 = r10
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nvkGetEncodedVideoSessionParametersKHR(r0, r1, r2, r3, r4)
            return r0
    }

    public static void nvkCmdEncodeVideoKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEncodeVideoKHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkVideoEncodeInfoKHR.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdEncodeVideoKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkVideoEncodeInfoKHR const *") org.lwjgl.vulkan.VkVideoEncodeInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdEncodeVideoKHR(r0, r1)
            return
    }
}
