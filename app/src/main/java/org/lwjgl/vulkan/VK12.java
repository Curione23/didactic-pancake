package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK12.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK12.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK12.class */
public class VK12 extends org.lwjgl.vulkan.VK11 {
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES = 49;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES = 50;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES = 51;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES = 52;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO = 1000147000;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 4;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2 = 1000109000;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2 = 1000109001;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2 = 1000109002;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2 = 1000109003;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 = 1000109004;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO = 1000109005;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_END_INFO = 1000109006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES = 1000177000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES = 1000196000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES = 1000180000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES = 1000082000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES = 1000197000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO = 1000161000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES = 1000161001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES = 1000161002;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO = 1000161003;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT = 1000161004;
    public static final int VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT = 2;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT = 2;
    public static final int VK_ERROR_FRAGMENTATION = -1000161000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES = 1000199000;
    public static final int VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE = 1000199001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES = 1000221000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO = 1000246000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES = 1000130000;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO = 1000130001;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 65536;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES = 1000211000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES = 1000108000;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO = 1000108001;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO = 1000108002;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO = 1000108003;
    public static final int VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT = 1;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES = 1000253000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES = 1000175000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES = 1000241000;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT = 1000241001;
    public static final int VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT = 1000241002;
    public static final int VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL = 1000241000;
    public static final int VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL = 1000241001;
    public static final int VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL = 1000241002;
    public static final int VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL = 1000241003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES = 1000261000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES = 1000207000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES = 1000207001;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO = 1000207002;
    public static final int VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO = 1000207003;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO = 1000207004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO = 1000207005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES = 1000257000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO = 1000244001;
    public static final int VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO = 1000257002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO = 1000257003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO = 1000257004;
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT = 131072;
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 16;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT = 2;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 4;
    public static final int VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS = -1000257000;
    public static final int VK_DRIVER_ID_AMD_PROPRIETARY = 1;
    public static final int VK_DRIVER_ID_AMD_OPEN_SOURCE = 2;
    public static final int VK_DRIVER_ID_MESA_RADV = 3;
    public static final int VK_DRIVER_ID_NVIDIA_PROPRIETARY = 4;
    public static final int VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS = 5;
    public static final int VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA = 6;
    public static final int VK_DRIVER_ID_IMAGINATION_PROPRIETARY = 7;
    public static final int VK_DRIVER_ID_QUALCOMM_PROPRIETARY = 8;
    public static final int VK_DRIVER_ID_ARM_PROPRIETARY = 9;
    public static final int VK_DRIVER_ID_GOOGLE_SWIFTSHADER = 10;
    public static final int VK_DRIVER_ID_GGP_PROPRIETARY = 11;
    public static final int VK_DRIVER_ID_BROADCOM_PROPRIETARY = 12;
    public static final int VK_DRIVER_ID_MESA_LLVMPIPE = 13;
    public static final int VK_DRIVER_ID_MOLTENVK = 14;
    public static final int VK_DRIVER_ID_COREAVI_PROPRIETARY = 15;
    public static final int VK_DRIVER_ID_JUICE_PROPRIETARY = 16;
    public static final int VK_DRIVER_ID_VERISILICON_PROPRIETARY = 17;
    public static final int VK_DRIVER_ID_MESA_TURNIP = 18;
    public static final int VK_DRIVER_ID_MESA_V3DV = 19;
    public static final int VK_DRIVER_ID_MESA_PANVK = 20;
    public static final int VK_DRIVER_ID_SAMSUNG_PROPRIETARY = 21;
    public static final int VK_DRIVER_ID_MESA_VENUS = 22;
    public static final int VK_DRIVER_ID_MESA_DOZEN = 23;
    public static final int VK_DRIVER_ID_MESA_NVK = 24;
    public static final int VK_DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA = 25;
    public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY = 0;
    public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL = 1;
    public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE = 2;
    public static final int VK_RESOLVE_MODE_NONE = 0;
    public static final int VK_RESOLVE_MODE_SAMPLE_ZERO_BIT = 1;
    public static final int VK_RESOLVE_MODE_AVERAGE_BIT = 2;
    public static final int VK_RESOLVE_MODE_MIN_BIT = 4;
    public static final int VK_RESOLVE_MODE_MAX_BIT = 8;
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT = 1;
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT = 2;
    public static final int VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT = 4;
    public static final int VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT = 8;
    public static final int VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE = 0;
    public static final int VK_SAMPLER_REDUCTION_MODE_MIN = 1;
    public static final int VK_SAMPLER_REDUCTION_MODE_MAX = 2;
    public static final int VK_SEMAPHORE_TYPE_BINARY = 0;
    public static final int VK_SEMAPHORE_TYPE_TIMELINE = 1;
    public static final int VK_SEMAPHORE_WAIT_ANY_BIT = 1;
    public static final int VK_API_VERSION_1_2 = 0;

    protected VK12() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdDrawIndirectCount(org.lwjgl.vulkan.VkCommandBuffer r15, @org.lwjgl.system.NativeType("VkBuffer") long r16, @org.lwjgl.system.NativeType("VkDeviceSize") long r18, @org.lwjgl.system.NativeType("VkBuffer") long r20, @org.lwjgl.system.NativeType("VkDeviceSize") long r22, @org.lwjgl.system.NativeType("uint32_t") int r24, @org.lwjgl.system.NativeType("uint32_t") int r25) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawIndirectCount
            r26 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r26
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r22
            r5 = r24
            r6 = r25
            r7 = r26
            org.lwjgl.system.JNI.callPJJJJV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkCmdDrawIndexedIndirectCount(org.lwjgl.vulkan.VkCommandBuffer r15, @org.lwjgl.system.NativeType("VkBuffer") long r16, @org.lwjgl.system.NativeType("VkDeviceSize") long r18, @org.lwjgl.system.NativeType("VkBuffer") long r20, @org.lwjgl.system.NativeType("VkDeviceSize") long r22, @org.lwjgl.system.NativeType("uint32_t") int r24, @org.lwjgl.system.NativeType("uint32_t") int r25) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawIndexedIndirectCount
            r26 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r26
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r22
            r5 = r24
            r6 = r25
            r7 = r26
            org.lwjgl.system.JNI.callPJJJJV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static int nvkCreateRenderPass2(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateRenderPass2
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
    public static int vkCreateRenderPass2(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkRenderPassCreateInfo2 const *") org.lwjgl.vulkan.VkRenderPassCreateInfo2 r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkRenderPass *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateRenderPass2(r0, r1, r2, r3)
            return r0
    }

    public static void nvkCmdBeginRenderPass2(org.lwjgl.vulkan.VkCommandBuffer r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginRenderPass2
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

    public static void vkCmdBeginRenderPass2(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkRenderPassBeginInfo const *") org.lwjgl.vulkan.VkRenderPassBeginInfo r7, @org.lwjgl.system.NativeType("VkSubpassBeginInfo const *") org.lwjgl.vulkan.VkSubpassBeginInfo r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkCmdBeginRenderPass2(r0, r1, r2)
            return
    }

    public static void nvkCmdNextSubpass2(org.lwjgl.vulkan.VkCommandBuffer r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdNextSubpass2
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

    public static void vkCmdNextSubpass2(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkSubpassBeginInfo const *") org.lwjgl.vulkan.VkSubpassBeginInfo r7, @org.lwjgl.system.NativeType("VkSubpassEndInfo const *") org.lwjgl.vulkan.VkSubpassEndInfo r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkCmdNextSubpass2(r0, r1, r2)
            return
    }

    public static void nvkCmdEndRenderPass2(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndRenderPass2
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

    public static void vkCmdEndRenderPass2(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkSubpassEndInfo const *") org.lwjgl.vulkan.VkSubpassEndInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdEndRenderPass2(r0, r1)
            return
    }

    public static void vkResetQueryPool(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkQueryPool") long r10, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkResetQueryPool
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
            r3 = r13
            r4 = r14
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3, r4)
            return
    }

    public static int nvkGetSemaphoreCounterValue(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSemaphoreCounterValue
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
    public static int vkGetSemaphoreCounterValue(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSemaphore") long r7, @org.lwjgl.system.NativeType("uint64_t *") java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvkGetSemaphoreCounterValue(r0, r1, r2)
            return r0
    }

    public static int nvkWaitSemaphores(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWaitSemaphores
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkSemaphoreWaitInfo.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            int r0 = org.lwjgl.system.JNI.callPPJI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWaitSemaphores(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSemaphoreWaitInfo const *") org.lwjgl.vulkan.VkSemaphoreWaitInfo r7, @org.lwjgl.system.NativeType("uint64_t") long r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            int r0 = nvkWaitSemaphores(r0, r1, r2)
            return r0
    }

    public static int nvkSignalSemaphore(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSignalSemaphore
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
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkSignalSemaphore(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkSemaphoreSignalInfo const *") org.lwjgl.vulkan.VkSemaphoreSignalInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkSignalSemaphore(r0, r1)
            return r0
    }

    public static long nvkGetBufferDeviceAddress(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetBufferDeviceAddress
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
            long r0 = org.lwjgl.system.JNI.callPPJ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public static long vkGetBufferDeviceAddress(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkBufferDeviceAddressInfo const *") org.lwjgl.vulkan.VkBufferDeviceAddressInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            long r0 = nvkGetBufferDeviceAddress(r0, r1)
            return r0
    }

    public static long nvkGetBufferOpaqueCaptureAddress(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetBufferOpaqueCaptureAddress
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
            long r0 = org.lwjgl.system.JNI.callPPJ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public static long vkGetBufferOpaqueCaptureAddress(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkBufferDeviceAddressInfo const *") org.lwjgl.vulkan.VkBufferDeviceAddressInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            long r0 = nvkGetBufferOpaqueCaptureAddress(r0, r1)
            return r0
    }

    public static long nvkGetDeviceMemoryOpaqueCaptureAddress(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceMemoryOpaqueCaptureAddress
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
            long r0 = org.lwjgl.system.JNI.callPPJ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public static long vkGetDeviceMemoryOpaqueCaptureAddress(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkDeviceMemoryOpaqueCaptureAddressInfo const *") org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            long r0 = nvkGetDeviceMemoryOpaqueCaptureAddress(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateRenderPass2(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkRenderPassCreateInfo2 const *") org.lwjgl.vulkan.VkRenderPassCreateInfo2 r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkRenderPass *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateRenderPass2
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

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetSemaphoreCounterValue(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSemaphore") long r9, @org.lwjgl.system.NativeType("uint64_t *") long[] r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSemaphoreCounterValue
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3)
            return r0
    }

    static {
            r0 = 0
            r1 = 1
            r2 = 2
            r3 = 0
            int r0 = VK_MAKE_API_VERSION(r0, r1, r2, r3)
            org.lwjgl.vulkan.VK12.VK_API_VERSION_1_2 = r0
            return
    }
}
