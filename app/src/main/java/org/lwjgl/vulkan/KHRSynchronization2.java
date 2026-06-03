package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSynchronization2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSynchronization2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRSynchronization2.class */
public class KHRSynchronization2 {
    public static final int VK_KHR_SYNCHRONIZATION_2_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_SYNCHRONIZATION_2_EXTENSION_NAME = "VK_KHR_synchronization2";
    public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR = 1000314000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2_KHR = 1000314001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2_KHR = 1000314002;
    public static final int VK_STRUCTURE_TYPE_DEPENDENCY_INFO_KHR = 1000314003;
    public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO_2_KHR = 1000314004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR = 1000314005;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR = 1000314006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES_KHR = 1000314007;
    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT_KHR = 1;
    public static final int VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR = 1000314000;
    public static final int VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR = 1000314001;
    public static final int VK_PIPELINE_STAGE_NONE_KHR = 0;
    public static final int VK_ACCESS_NONE_KHR = 0;
    public static final long VK_PIPELINE_STAGE_2_NONE_KHR = 0;
    public static final long VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR = 1;
    public static final long VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR = 2;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR = 4;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR = 8;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR = 16;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR = 32;
    public static final long VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR = 64;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR = 128;
    public static final long VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR = 256;
    public static final long VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR = 512;
    public static final long VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR = 1024;
    public static final long VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR = 2048;
    public static final long VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR = 4096;
    public static final long VK_PIPELINE_STAGE_2_TRANSFER_BIT_KHR = 4096;
    public static final long VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR = 8192;
    public static final long VK_PIPELINE_STAGE_2_HOST_BIT_KHR = 16384;
    public static final long VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR = 32768;
    public static final long VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR = 65536;
    public static final long VK_PIPELINE_STAGE_2_COPY_BIT_KHR = 4294967296L;
    public static final long VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR = 8589934592L;
    public static final long VK_PIPELINE_STAGE_2_BLIT_BIT_KHR = 17179869184L;
    public static final long VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR = 34359738368L;
    public static final long VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR = 68719476736L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR = 137438953472L;
    public static final long VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR = 274877906944L;
    public static final long VK_ACCESS_2_NONE_KHR = 0;
    public static final long VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR = 1;
    public static final long VK_ACCESS_2_INDEX_READ_BIT_KHR = 2;
    public static final long VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR = 4;
    public static final long VK_ACCESS_2_UNIFORM_READ_BIT_KHR = 8;
    public static final long VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR = 16;
    public static final long VK_ACCESS_2_SHADER_READ_BIT_KHR = 32;
    public static final long VK_ACCESS_2_SHADER_WRITE_BIT_KHR = 64;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR = 128;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR = 256;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR = 512;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR = 1024;
    public static final long VK_ACCESS_2_TRANSFER_READ_BIT_KHR = 2048;
    public static final long VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR = 4096;
    public static final long VK_ACCESS_2_HOST_READ_BIT_KHR = 8192;
    public static final long VK_ACCESS_2_HOST_WRITE_BIT_KHR = 16384;
    public static final long VK_ACCESS_2_MEMORY_READ_BIT_KHR = 32768;
    public static final long VK_ACCESS_2_MEMORY_WRITE_BIT_KHR = 65536;
    public static final long VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR = 4294967296L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR = 8589934592L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR = 17179869184L;
    public static final int VK_SUBMIT_PROTECTED_BIT_KHR = 1;
    public static final long VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT = 16777216;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT = 33554432;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT = 67108864;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 134217728;
    public static final long VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 262144;
    public static final long VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT = 1048576;
    public static final long VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV = 131072;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV = 131072;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV = 262144;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 4194304;
    public static final long VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 8388608;
    public static final long VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV = 4194304;
    public static final long VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV = 8388608;
    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 33554432;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR = 2097152;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 4194304;
    public static final long VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR = 2097152;
    public static final long VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV = 2097152;
    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV = 33554432;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV = 2097152;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV = 4194304;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT = 8388608;
    public static final long VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT = 16777216;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT = 524288;
    public static final long VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV = 524288;
    public static final long VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV = 1048576;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV = 1000314008;
    public static final int VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV = 1000314009;
    public static final long VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT = 524288;
    public static final long VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT = 1048576;

    protected KHRSynchronization2() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdSetEvent2KHR(org.lwjgl.vulkan.VkCommandBuffer r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetEvent2KHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkDependencyInfo.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdSetEvent2KHR(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkEvent") long r7, @org.lwjgl.system.NativeType("VkDependencyInfo const *") org.lwjgl.vulkan.VkDependencyInfo r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            nvkCmdSetEvent2KHR(r0, r1, r2)
            return
    }

    public static void vkCmdResetEvent2KHR(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkEvent") long r10, @org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdResetEvent2KHR
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
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdWaitEvents2KHR(org.lwjgl.vulkan.VkCommandBuffer r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWaitEvents2KHR
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r11
            int r2 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            void r3 = org.lwjgl.vulkan.VkDependencyInfo::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L23:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdWaitEvents2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkEvent const *") java.nio.LongBuffer r8, @org.lwjgl.system.NativeType("VkDependencyInfo const *") org.lwjgl.vulkan.VkDependencyInfo.Buffer r9) {
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
            nvkCmdWaitEvents2KHR(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdPipelineBarrier2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPipelineBarrier2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDependencyInfo.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdPipelineBarrier2KHR(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkDependencyInfo const *") org.lwjgl.vulkan.VkDependencyInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdPipelineBarrier2KHR(r0, r1)
            return
    }

    public static void vkCmdWriteTimestamp2KHR(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r11, @org.lwjgl.system.NativeType("VkQueryPool") long r13, @org.lwjgl.system.NativeType("uint32_t") int r15) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWriteTimestamp2KHR
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
            r3 = r15
            r4 = r16
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3, r4)
            return
    }

    public static int nvkQueueSubmit2KHR(org.lwjgl.vulkan.VkQueue r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkQueueSubmit2KHR
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L28
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L28
            r0 = r12
            r1 = r11
            int r2 = org.lwjgl.vulkan.VkSubmitInfo2.SIZEOF
            int r3 = org.lwjgl.vulkan.VkSubmitInfo2::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L28:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPPJI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkQueueSubmit2KHR(org.lwjgl.vulkan.VkQueue r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSubmitInfo2 const *") org.lwjgl.vulkan.VkSubmitInfo2.Buffer r8, @org.lwjgl.system.NativeType("VkFence") long r9) {
            r0 = r7
            r1 = r8
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r9
            int r0 = nvkQueueSubmit2KHR(r0, r1, r2, r3)
            return r0
    }

    public static void vkCmdWriteBufferMarker2AMD(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r13, @org.lwjgl.system.NativeType("VkBuffer") long r15, @org.lwjgl.system.NativeType("VkDeviceSize") long r17, @org.lwjgl.system.NativeType("uint32_t") int r19) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWriteBufferMarker2AMD
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

    public static void nvkGetQueueCheckpointData2NV(org.lwjgl.vulkan.VkQueue r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetQueueCheckpointData2NV
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

    public static void vkGetQueueCheckpointData2NV(org.lwjgl.vulkan.VkQueue r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkCheckpointData2NV *") org.lwjgl.vulkan.VkCheckpointData2NV.Buffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = r7
            r2 = r7
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkGetQueueCheckpointData2NV(r0, r1, r2)
            return
    }

    public static void vkCmdWaitEvents2KHR(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkEvent const *") long[] r10, @org.lwjgl.system.NativeType("VkDependencyInfo const *") org.lwjgl.vulkan.VkDependencyInfo.Buffer r11) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWaitEvents2KHR
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2a
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = r10
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            long r0 = r0.address()
            r1 = r10
            int r1 = r1.length
            int r2 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            void r3 = org.lwjgl.vulkan.VkDependencyInfo::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L2a:
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

    public static void vkGetQueueCheckpointData2NV(org.lwjgl.vulkan.VkQueue r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkCheckpointData2NV *") org.lwjgl.vulkan.VkCheckpointData2NV.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetQueueCheckpointData2NV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1f:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }
}
