package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRPipelineBinary.class */
public class KHRPipelineBinary {
    public static final int VK_KHR_PIPELINE_BINARY_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_PIPELINE_BINARY_EXTENSION_NAME = "VK_KHR_pipeline_binary";
    public static final int VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR = 32;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR = 1000483000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR = 1000483001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR = 1000483002;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR = 1000483003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR = 1000483004;
    public static final int VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR = 1000483005;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR = 1000483006;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_INFO_KHR = 1000483007;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR = 1000483008;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR = 1000483009;
    public static final int VK_OBJECT_TYPE_PIPELINE_BINARY_KHR = 1000483000;
    public static final int VK_PIPELINE_BINARY_MISSING_KHR = 1000483000;
    public static final int VK_ERROR_NOT_ENOUGH_SPACE_KHR = -1000483000;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR = 2147483648L;

    protected KHRPipelineBinary() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreatePipelineBinariesKHR(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreatePipelineBinariesKHR
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkPipelineBinaryCreateInfoKHR.validate(r0)
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
    public static int vkCreatePipelineBinariesKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkPipelineBinaryCreateInfoKHR const *") org.lwjgl.vulkan.VkPipelineBinaryCreateInfoKHR r9, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkPipelineBinaryHandlesInfoKHR *") org.lwjgl.vulkan.VkPipelineBinaryHandlesInfoKHR r11) {
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            long r3 = r3.address()
            int r0 = nvkCreatePipelineBinariesKHR(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyPipelineBinaryKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyPipelineBinaryKHR
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

    public static void vkDestroyPipelineBinaryKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPipelineBinaryKHR") long r7, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyPipelineBinaryKHR(r0, r1, r2)
            return
    }

    public static int nvkGetPipelineKeyKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPipelineKeyKHR
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
    public static int vkGetPipelineKeyKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPipelineCreateInfoKHR const *") org.lwjgl.vulkan.VkPipelineCreateInfoKHR r7, @org.lwjgl.system.NativeType("VkPipelineBinaryKeyKHR *") org.lwjgl.vulkan.VkPipelineBinaryKeyKHR r8) {
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r8
            long r2 = r2.address()
            int r0 = nvkGetPipelineKeyKHR(r0, r1, r2)
            return r0
    }

    public static int nvkGetPipelineBinaryDataKHR(org.lwjgl.vulkan.VkDevice r13, long r14, long r16, long r18, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPipelineBinaryDataKHR
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
    public static int vkGetPipelineBinaryDataKHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkPipelineBinaryDataInfoKHR const *") org.lwjgl.vulkan.VkPipelineBinaryDataInfoKHR r11, @org.lwjgl.system.NativeType("VkPipelineBinaryKeyKHR *") org.lwjgl.vulkan.VkPipelineBinaryKeyKHR r12, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r13, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r14) {
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
            long r2 = r2.address()
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nvkGetPipelineBinaryDataKHR(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nvkReleaseCapturedPipelineDataKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkReleaseCapturedPipelineDataKHR
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
    public static int vkReleaseCapturedPipelineDataKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkReleaseCapturedPipelineDataInfoKHR const *") org.lwjgl.vulkan.VkReleaseCapturedPipelineDataInfoKHR r7, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nvkReleaseCapturedPipelineDataKHR(r0, r1, r2)
            return r0
    }
}
