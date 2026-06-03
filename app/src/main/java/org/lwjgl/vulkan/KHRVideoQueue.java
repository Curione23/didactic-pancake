package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRVideoQueue.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRVideoQueue.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRVideoQueue.class */
public class KHRVideoQueue {
    public static final int VK_KHR_VIDEO_QUEUE_SPEC_VERSION = 8;
    public static final java.lang.String VK_KHR_VIDEO_QUEUE_EXTENSION_NAME = "VK_KHR_video_queue";
    public static final int VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR = 1000023000;
    public static final int VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR = 1000023001;
    public static final int VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR = 1000023002;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR = 1000023003;
    public static final int VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR = 1000023004;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR = 1000023005;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR = 1000023006;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR = 1000023007;
    public static final int VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR = 1000023008;
    public static final int VK_STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR = 1000023009;
    public static final int VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR = 1000023010;
    public static final int VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR = 1000023011;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR = 1000023012;
    public static final int VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR = 1000023013;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR = 1000023014;
    public static final int VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR = 1000023015;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR = 1000023016;
    public static final int VK_OBJECT_TYPE_VIDEO_SESSION_KHR = 1000023000;
    public static final int VK_OBJECT_TYPE_VIDEO_SESSION_PARAMETERS_KHR = 1000023001;
    public static final int VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR = 1000023000;
    public static final int VK_QUERY_RESULT_WITH_STATUS_BIT_KHR = 16;
    public static final int VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR = -1000023000;
    public static final int VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR = -1000023001;
    public static final int VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR = -1000023002;
    public static final int VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR = -1000023003;
    public static final int VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR = -1000023004;
    public static final int VK_ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR = -1000023005;
    public static final int VK_VIDEO_CODEC_OPERATION_NONE_KHR = 0;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR = 0;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR = 1;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR = 2;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR = 4;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR = 8;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR = 0;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR = 1;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR = 4;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR = 16;
    public static final int VK_VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR = 1;
    public static final int VK_VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR = 2;
    public static final int VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR = 1;
    public static final int VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR = 1;
    public static final int VK_QUERY_RESULT_STATUS_ERROR_KHR = -1;
    public static final int VK_QUERY_RESULT_STATUS_NOT_READY_KHR = 0;
    public static final int VK_QUERY_RESULT_STATUS_COMPLETE_KHR = 1;

    protected KHRVideoQueue() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPhysicalDeviceVideoCapabilitiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceVideoCapabilitiesKHR
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
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoCapabilitiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkVideoProfileInfoKHR const *") org.lwjgl.vulkan.VkVideoProfileInfoKHR r7, @org.lwjgl.system.NativeType("VkVideoCapabilitiesKHR *") org.lwjgl.vulkan.VkVideoCapabilitiesKHR r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            int r0 = nvkGetPhysicalDeviceVideoCapabilitiesKHR(r0, r1, r2)
            return r0
    }

    public static int nvkGetPhysicalDeviceVideoFormatPropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceVideoFormatPropertiesKHR
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
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("VkPhysicalDeviceVideoFormatInfoKHR const *") org.lwjgl.vulkan.VkPhysicalDeviceVideoFormatInfoKHR r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVideoFormatPropertiesKHR *") org.lwjgl.vulkan.VkVideoFormatPropertiesKHR.Buffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = r10
            r2 = r10
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetPhysicalDeviceVideoFormatPropertiesKHR(r0, r1, r2, r3)
            return r0
    }

    public static int nvkCreateVideoSessionKHR(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateVideoSessionKHR
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.validate(r0)
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
    public static int vkCreateVideoSessionKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkVideoSessionCreateInfoKHR const *") org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkVideoSessionKHR *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateVideoSessionKHR(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyVideoSessionKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyVideoSessionKHR
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

    public static void vkDestroyVideoSessionKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkVideoSessionKHR") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyVideoSessionKHR(r0, r1, r2)
            return
    }

    public static int nvkGetVideoSessionMemoryRequirementsKHR(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetVideoSessionMemoryRequirementsKHR
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
    public static int vkGetVideoSessionMemoryRequirementsKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkVideoSessionKHR") long r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVideoSessionMemoryRequirementsKHR *") org.lwjgl.vulkan.VkVideoSessionMemoryRequirementsKHR.Buffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L18:
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetVideoSessionMemoryRequirementsKHR(r0, r1, r2, r3)
            return r0
    }

    public static int nvkBindVideoSessionMemoryKHR(org.lwjgl.vulkan.VkDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBindVideoSessionMemoryKHR
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkBindVideoSessionMemoryKHR(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkVideoSessionKHR") long r8, @org.lwjgl.system.NativeType("VkBindVideoSessionMemoryInfoKHR const *") org.lwjgl.vulkan.VkBindVideoSessionMemoryInfoKHR.Buffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = r10
            long r3 = r3.address()
            int r0 = nvkBindVideoSessionMemoryKHR(r0, r1, r2, r3)
            return r0
    }

    public static int nvkCreateVideoSessionParametersKHR(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateVideoSessionParametersKHR
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
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateVideoSessionParametersKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkVideoSessionParametersCreateInfoKHR const *") org.lwjgl.vulkan.VkVideoSessionParametersCreateInfoKHR r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkVideoSessionParametersKHR *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateVideoSessionParametersKHR(r0, r1, r2, r3)
            return r0
    }

    public static int nvkUpdateVideoSessionParametersKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkUpdateVideoSessionParametersKHR
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
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkUpdateVideoSessionParametersKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkVideoSessionParametersKHR") long r7, @org.lwjgl.system.NativeType("VkVideoSessionParametersUpdateInfoKHR const *") org.lwjgl.vulkan.VkVideoSessionParametersUpdateInfoKHR r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkUpdateVideoSessionParametersKHR(r0, r1, r2)
            return r0
    }

    public static void nvkDestroyVideoSessionParametersKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyVideoSessionParametersKHR
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

    public static void vkDestroyVideoSessionParametersKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkVideoSessionParametersKHR") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyVideoSessionParametersKHR(r0, r1, r2)
            return
    }

    public static void nvkCmdBeginVideoCodingKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginVideoCodingKHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkVideoBeginCodingInfoKHR.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdBeginVideoCodingKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkVideoBeginCodingInfoKHR const *") org.lwjgl.vulkan.VkVideoBeginCodingInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBeginVideoCodingKHR(r0, r1)
            return
    }

    public static void nvkCmdEndVideoCodingKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndVideoCodingKHR
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

    public static void vkCmdEndVideoCodingKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkVideoEndCodingInfoKHR const *") org.lwjgl.vulkan.VkVideoEndCodingInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdEndVideoCodingKHR(r0, r1)
            return
    }

    public static void nvkCmdControlVideoCodingKHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdControlVideoCodingKHR
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

    public static void vkCmdControlVideoCodingKHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkVideoCodingControlInfoKHR const *") org.lwjgl.vulkan.VkVideoCodingControlInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdControlVideoCodingKHR(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r10, @org.lwjgl.system.NativeType("VkPhysicalDeviceVideoFormatInfoKHR const *") org.lwjgl.vulkan.VkPhysicalDeviceVideoFormatInfoKHR r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVideoFormatPropertiesKHR *") org.lwjgl.vulkan.VkVideoFormatPropertiesKHR.Buffer r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceVideoFormatPropertiesKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L21:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateVideoSessionKHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkVideoSessionCreateInfoKHR const *") org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkVideoSessionKHR *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateVideoSessionKHR
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
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.validate(r0)
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

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetVideoSessionMemoryRequirementsKHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkVideoSessionKHR") long r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVideoSessionMemoryRequirementsKHR *") org.lwjgl.vulkan.VkVideoSessionMemoryRequirementsKHR.Buffer r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetVideoSessionMemoryRequirementsKHR
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r13
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L22:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateVideoSessionParametersKHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkVideoSessionParametersCreateInfoKHR const *") org.lwjgl.vulkan.VkVideoSessionParametersCreateInfoKHR r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkVideoSessionParametersKHR *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateVideoSessionParametersKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
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
