package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/ARMTensors.class */
public class ARMTensors {
    public static final int VK_ARM_TENSORS_SPEC_VERSION = 1;
    public static final java.lang.String VK_ARM_TENSORS_EXTENSION_NAME = "VK_ARM_tensors";
    public static final int VK_STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM = 1000460000;
    public static final int VK_STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM = 1000460001;
    public static final int VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM = 1000460002;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM = 1000460003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM = 1000460004;
    public static final int VK_STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM = 1000460005;
    public static final int VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM = 1000460006;
    public static final int VK_STRUCTURE_TYPE_TENSOR_MEMORY_REQUIREMENTS_INFO_ARM = 1000460007;
    public static final int VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM = 1000460008;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM = 1000460009;
    public static final int VK_STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM = 1000460010;
    public static final int VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM = 1000460011;
    public static final int VK_STRUCTURE_TYPE_TENSOR_COPY_ARM = 1000460012;
    public static final int VK_STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM = 1000460013;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM = 1000460014;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM = 1000460015;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM = 1000460016;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_TENSOR_CREATE_INFO_ARM = 1000460017;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM = 1000460018;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM = 1000460019;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM = 1000460020;
    public static final int VK_STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM = 1000460021;
    public static final int VK_STRUCTURE_TYPE_TENSOR_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_ARM = 1000460022;
    public static final int VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM = 1000460023;
    public static final int VK_OBJECT_TYPE_TENSOR_ARM = 1000460000;
    public static final int VK_OBJECT_TYPE_TENSOR_VIEW_ARM = 1000460001;
    public static final int VK_DESCRIPTOR_TYPE_TENSOR_ARM = 1000460000;
    public static final long VK_FORMAT_FEATURE_2_TENSOR_SHADER_BIT_ARM = 549755813888L;
    public static final long VK_FORMAT_FEATURE_2_TENSOR_IMAGE_ALIASING_BIT_ARM = 8796093022208L;
    public static final int VK_IMAGE_USAGE_TENSOR_ALIASING_BIT_ARM = 8388608;
    public static final int VK_IMAGE_LAYOUT_TENSOR_ALIASING_ARM = 1000460000;
    public static final int VK_FORMAT_R8_BOOL_ARM = 1000460000;
    public static final long VK_TENSOR_CREATE_MUTABLE_FORMAT_BIT_ARM = 1;
    public static final long VK_TENSOR_CREATE_PROTECTED_BIT_ARM = 2;
    public static final long VK_TENSOR_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_ARM = 4;
    public static final long VK_TENSOR_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_ARM = 1;
    public static final long VK_TENSOR_USAGE_SHADER_BIT_ARM = 2;
    public static final long VK_TENSOR_USAGE_TRANSFER_SRC_BIT_ARM = 4;
    public static final long VK_TENSOR_USAGE_TRANSFER_DST_BIT_ARM = 8;
    public static final long VK_TENSOR_USAGE_IMAGE_ALIASING_BIT_ARM = 16;
    public static final int VK_TENSOR_TILING_OPTIMAL_ARM = 0;
    public static final int VK_TENSOR_TILING_LINEAR_ARM = 1;

    protected ARMTensors() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateTensorARM(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateTensorARM
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkTensorCreateInfoARM.validate(r0)
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
    public static int vkCreateTensorARM(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkTensorCreateInfoARM const *") org.lwjgl.vulkan.VkTensorCreateInfoARM r9, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkTensorARM *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateTensorARM(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyTensorARM(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyTensorARM
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

    public static void vkDestroyTensorARM(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkTensorARM") long r7, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyTensorARM(r0, r1, r2)
            return
    }

    public static int nvkCreateTensorViewARM(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateTensorViewARM
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
    public static int vkCreateTensorViewARM(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkTensorViewCreateInfoARM const *") org.lwjgl.vulkan.VkTensorViewCreateInfoARM r9, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkTensorViewARM *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateTensorViewARM(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyTensorViewARM(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyTensorViewARM
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

    public static void vkDestroyTensorViewARM(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkTensorViewARM") long r7, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyTensorViewARM(r0, r1, r2)
            return
    }

    public static void nvkGetTensorMemoryRequirementsARM(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetTensorMemoryRequirementsARM
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

    public static void vkGetTensorMemoryRequirementsARM(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkTensorMemoryRequirementsInfoARM const *") org.lwjgl.vulkan.VkTensorMemoryRequirementsInfoARM r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetTensorMemoryRequirementsARM(r0, r1, r2)
            return
    }

    public static int nvkBindTensorMemoryARM(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBindTensorMemoryARM
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkBindTensorMemoryARM(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkBindTensorMemoryInfoARM const *") org.lwjgl.vulkan.VkBindTensorMemoryInfoARM.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkBindTensorMemoryARM(r0, r1, r2)
            return r0
    }

    public static void nvkGetDeviceTensorMemoryRequirementsARM(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceTensorMemoryRequirementsARM
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkDeviceTensorMemoryRequirementsARM.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDeviceTensorMemoryRequirementsARM(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeviceTensorMemoryRequirementsARM const *") org.lwjgl.vulkan.VkDeviceTensorMemoryRequirementsARM r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetDeviceTensorMemoryRequirementsARM(r0, r1, r2)
            return
    }

    public static void nvkCmdCopyTensorARM(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyTensorARM
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkCopyTensorInfoARM.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdCopyTensorARM(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyTensorInfoARM const *") org.lwjgl.vulkan.VkCopyTensorInfoARM r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyTensorARM(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceExternalTensorPropertiesARM(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceExternalTensorPropertiesARM
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceExternalTensorInfoARM.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetPhysicalDeviceExternalTensorPropertiesARM(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkPhysicalDeviceExternalTensorInfoARM const *") org.lwjgl.vulkan.VkPhysicalDeviceExternalTensorInfoARM r7, @org.lwjgl.system.NativeType("VkExternalTensorPropertiesARM *") org.lwjgl.vulkan.VkExternalTensorPropertiesARM r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetPhysicalDeviceExternalTensorPropertiesARM(r0, r1, r2)
            return
    }

    public static int nvkGetTensorOpaqueCaptureDescriptorDataARM(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetTensorOpaqueCaptureDescriptorDataARM
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
    public static int vkGetTensorOpaqueCaptureDescriptorDataARM(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkTensorCaptureDescriptorDataInfoARM const *") org.lwjgl.vulkan.VkTensorCaptureDescriptorDataInfoARM r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
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
            int r0 = nvkGetTensorOpaqueCaptureDescriptorDataARM(r0, r1, r2)
            return r0
    }

    public static int nvkGetTensorViewOpaqueCaptureDescriptorDataARM(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetTensorViewOpaqueCaptureDescriptorDataARM
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
    public static int vkGetTensorViewOpaqueCaptureDescriptorDataARM(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkTensorViewCaptureDescriptorDataInfoARM const *") org.lwjgl.vulkan.VkTensorViewCaptureDescriptorDataInfoARM r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
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
            int r0 = nvkGetTensorViewOpaqueCaptureDescriptorDataARM(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateTensorARM(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkTensorCreateInfoARM const *") org.lwjgl.vulkan.VkTensorCreateInfoARM r11, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkTensorARM *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateTensorARM
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
            org.lwjgl.vulkan.VkTensorCreateInfoARM.validate(r0)
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
    public static int vkCreateTensorViewARM(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkTensorViewCreateInfoARM const *") org.lwjgl.vulkan.VkTensorViewCreateInfoARM r11, @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkTensorViewARM *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateTensorViewARM
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
