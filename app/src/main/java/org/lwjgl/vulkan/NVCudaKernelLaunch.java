package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVCudaKernelLaunch.class */
public class NVCudaKernelLaunch {
    public static final int VK_NV_CUDA_KERNEL_LAUNCH_SPEC_VERSION = 2;
    public static final java.lang.String VK_NV_CUDA_KERNEL_LAUNCH_EXTENSION_NAME = "VK_NV_cuda_kernel_launch";
    public static final int VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV = 1000307000;
    public static final int VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV = 1000307001;
    public static final int VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV = 1000307002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV = 1000307003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV = 1000307004;
    public static final int VK_OBJECT_TYPE_CUDA_MODULE_NV = 1000307000;
    public static final int VK_OBJECT_TYPE_CUDA_FUNCTION_NV = 1000307001;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_MODULE_NV_EXT = 1000307000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_FUNCTION_NV_EXT = 1000307001;

    protected NVCudaKernelLaunch() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateCudaModuleNV(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateCudaModuleNV
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkCudaModuleCreateInfoNV.validate(r0)
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
    public static int vkCreateCudaModuleNV(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkCudaModuleCreateInfoNV const *") org.lwjgl.vulkan.VkCudaModuleCreateInfoNV r9, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkCudaModuleNV *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateCudaModuleNV(r0, r1, r2, r3)
            return r0
    }

    public static int nvkGetCudaModuleCacheNV(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetCudaModuleCacheNV
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
    public static int vkGetCudaModuleCacheNV(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkCudaModuleNV") long r9, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r11, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r11
            r2 = r11
            int r2 = r2.position()
            long r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L18:
            r0 = r8
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetCudaModuleCacheNV(r0, r1, r2, r3)
            return r0
    }

    public static int nvkCreateCudaFunctionNV(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateCudaFunctionNV
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkCudaFunctionCreateInfoNV.validate(r0)
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
    public static int vkCreateCudaFunctionNV(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkCudaFunctionCreateInfoNV const *") org.lwjgl.vulkan.VkCudaFunctionCreateInfoNV r9, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkCudaFunctionNV *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateCudaFunctionNV(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyCudaModuleNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyCudaModuleNV
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

    public static void vkDestroyCudaModuleNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkCudaModuleNV") long r7, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyCudaModuleNV(r0, r1, r2)
            return
    }

    public static void nvkDestroyCudaFunctionNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyCudaFunctionNV
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

    public static void vkDestroyCudaFunctionNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkCudaFunctionNV") long r7, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyCudaFunctionNV(r0, r1, r2)
            return
    }

    public static void nvkCmdCudaLaunchKernelNV(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCudaLaunchKernelNV
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

    public static void vkCmdCudaLaunchKernelNV(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCudaLaunchInfoNV const *") org.lwjgl.vulkan.VkCudaLaunchInfoNV r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCudaLaunchKernelNV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateCudaModuleNV(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkCudaModuleCreateInfoNV const *") org.lwjgl.vulkan.VkCudaModuleCreateInfoNV r11, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkCudaModuleNV *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateCudaModuleNV
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
            org.lwjgl.vulkan.VkCudaModuleCreateInfoNV.validate(r0)
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
    public static int vkCreateCudaFunctionNV(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkCudaFunctionCreateInfoNV const *") org.lwjgl.vulkan.VkCudaFunctionCreateInfoNV r11, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkCudaFunctionNV *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateCudaFunctionNV
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
            org.lwjgl.vulkan.VkCudaFunctionCreateInfoNV.validate(r0)
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
}
