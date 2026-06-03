package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVExternalComputeQueue.class */
public class NVExternalComputeQueue {
    public static final int VK_NV_EXTERNAL_COMPUTE_QUEUE_SPEC_VERSION = 1;
    public static final java.lang.String VK_NV_EXTERNAL_COMPUTE_QUEUE_EXTENSION_NAME = "VK_NV_external_compute_queue";
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV = 1000556000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV = 1000556001;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DATA_PARAMS_NV = 1000556002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_COMPUTE_QUEUE_PROPERTIES_NV = 1000556003;
    public static final int VK_OBJECT_TYPE_EXTERNAL_COMPUTE_QUEUE_NV = 1000556000;

    protected NVExternalComputeQueue() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateExternalComputeQueueNV(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateExternalComputeQueueNV
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkExternalComputeQueueCreateInfoNV.validate(r0)
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
    public static int vkCreateExternalComputeQueueNV(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkExternalComputeQueueCreateInfoNV const *") org.lwjgl.vulkan.VkExternalComputeQueueCreateInfoNV r9, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkExternalComputeQueueNV *") org.lwjgl.PointerBuffer r11) {
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
            int r0 = nvkCreateExternalComputeQueueNV(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyExternalComputeQueueNV(org.lwjgl.vulkan.VkDevice r9, org.lwjgl.vulkan.VkExternalComputeQueueNV r10, long r11) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyExternalComputeQueueNV
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            long r1 = r1.address()
            r2 = r11
            r3 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkDestroyExternalComputeQueueNV(org.lwjgl.vulkan.VkDevice r5, org.lwjgl.vulkan.VkExternalComputeQueueNV r6, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyExternalComputeQueueNV(r0, r1, r2)
            return
    }

    public static void nvkGetExternalComputeQueueDataNV(org.lwjgl.vulkan.VkExternalComputeQueueNV r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetExternalComputeQueueDataNV
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

    public static void vkGetExternalComputeQueueDataNV(org.lwjgl.vulkan.VkExternalComputeQueueNV r6, @org.lwjgl.system.NativeType("VkExternalComputeQueueDataParamsNV *") org.lwjgl.vulkan.VkExternalComputeQueueDataParamsNV r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvkGetExternalComputeQueueDataNV(r0, r1, r2)
            return
    }
}
