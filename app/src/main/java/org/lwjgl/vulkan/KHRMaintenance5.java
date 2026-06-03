package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance5.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance5.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance5.class */
public class KHRMaintenance5 {
    public static final int VK_KHR_MAINTENANCE_5_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_MAINTENANCE_5_EXTENSION_NAME = "VK_KHR_maintenance5";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES_KHR = 1000470000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR = 1000470001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_AREA_INFO_KHR = 1000470003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR = 1000470004;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR = 1000338002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR = 1000338003;
    public static final int VK_FORMAT_A1B5G5R5_UNORM_PACK16_KHR = 1000470000;
    public static final int VK_FORMAT_A8_UNORM_KHR = 1000470001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO_KHR = 1000470005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO_KHR = 1000470006;
    public static final long VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = 8;
    public static final long VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR = 16;
    public static final long VK_PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV = 32;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR = 64;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR = 128;
    public static final long VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR = 256;
    public static final long VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR = 512;
    public static final long VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT = 1024;
    public static final long VK_PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT = 8388608;
    public static final long VK_PIPELINE_CREATE_2_LIBRARY_BIT_KHR = 2048;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR = 4096;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR = 8192;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR = 16384;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR = 32768;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR = 65536;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR = 131072;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR = 524288;
    public static final long VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV = 262144;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV = 1048576;
    public static final long VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 2097152;
    public static final long VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 4194304;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT = 16777216;
    public static final long VK_PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 33554432;
    public static final long VK_PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 67108864;
    public static final long VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT = 134217728;
    public static final long VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT = 1073741824;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV = 268435456;
    public static final long VK_PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT = 536870912;
    public static final long VK_BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 512;
    public static final long VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR = 1024;
    public static final long VK_BUFFER_USAGE_2_RAY_TRACING_BIT_NV = 1024;
    public static final long VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT = 2048;
    public static final long VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 4096;
    public static final long VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR = 8192;
    public static final long VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR = 16384;
    public static final long VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR = 32768;
    public static final long VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR = 65536;
    public static final long VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR = 131072;
    public static final long VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 524288;
    public static final long VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR = 1048576;
    public static final long VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT = 2097152;
    public static final long VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT = 4194304;
    public static final long VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 67108864;
    public static final long VK_BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 8388608;
    public static final long VK_BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT = 16777216;
    public static final long VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR = 1;
    public static final long VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR = 2;
    public static final long VK_PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR = 4;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR = 1;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR = 2;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR = 4;
    public static final long VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR = 8;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR = 16;
    public static final long VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR = 32;
    public static final long VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR = 64;
    public static final long VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR = 128;
    public static final long VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR = 256;

    protected KHRMaintenance5() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdBindIndexBuffer2KHR(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkBuffer") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("VkDeviceSize") long r17, @org.lwjgl.system.NativeType("VkIndexType") int r19) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindIndexBuffer2KHR
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            r5 = r20
            org.lwjgl.system.JNI.callPJJJV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkGetRenderingAreaGranularityKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetRenderingAreaGranularityKHR
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

    public static void vkGetRenderingAreaGranularityKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkRenderingAreaInfoKHR const *") org.lwjgl.vulkan.VkRenderingAreaInfoKHR r7, @org.lwjgl.system.NativeType("VkExtent2D *") org.lwjgl.vulkan.VkExtent2D r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetRenderingAreaGranularityKHR(r0, r1, r2)
            return
    }

    public static void nvkGetDeviceImageSubresourceLayoutKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceImageSubresourceLayoutKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkDeviceImageSubresourceInfoKHR.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDeviceImageSubresourceLayoutKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeviceImageSubresourceInfoKHR const *") org.lwjgl.vulkan.VkDeviceImageSubresourceInfoKHR r7, @org.lwjgl.system.NativeType("VkSubresourceLayout2KHR *") org.lwjgl.vulkan.VkSubresourceLayout2KHR r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetDeviceImageSubresourceLayoutKHR(r0, r1, r2)
            return
    }

    public static void nvkGetImageSubresourceLayout2KHR(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageSubresourceLayout2KHR
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
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetImageSubresourceLayout2KHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkImage") long r9, @org.lwjgl.system.NativeType("VkImageSubresource2KHR const *") org.lwjgl.vulkan.VkImageSubresource2KHR r11, @org.lwjgl.system.NativeType("VkSubresourceLayout2KHR *") org.lwjgl.vulkan.VkSubresourceLayout2KHR r12) {
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = r3.address()
            nvkGetImageSubresourceLayout2KHR(r0, r1, r2, r3)
            return
    }
}
