package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDescriptorHeap.class */
public class EXTDescriptorHeap {
    public static final int VK_EXT_DESCRIPTOR_HEAP_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_DESCRIPTOR_HEAP_EXTENSION_NAME = "VK_EXT_descriptor_heap";
    public static final int VK_BUFFER_USAGE_DESCRIPTOR_HEAP_BIT_EXT = 268435456;
    public static final long VK_BUFFER_USAGE_2_DESCRIPTOR_HEAP_BIT_EXT = 268435456;
    public static final long VK_PIPELINE_CREATE_2_DESCRIPTOR_HEAP_BIT_EXT = 68719476736L;
    public static final int VK_IMAGE_CREATE_DESCRIPTOR_HEAP_CAPTURE_REPLAY_BIT_EXT = 65536;
    public static final int VK_STRUCTURE_TYPE_TEXEL_BUFFER_DESCRIPTOR_INFO_EXT = 1000135000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_DESCRIPTOR_INFO_EXT = 1000135001;
    public static final int VK_STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT = 1000135002;
    public static final int VK_STRUCTURE_TYPE_BIND_HEAP_INFO_EXT = 1000135003;
    public static final int VK_STRUCTURE_TYPE_PUSH_DATA_INFO_EXT = 1000135004;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT = 1000135005;
    public static final int VK_STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT = 1000135006;
    public static final int VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT = 1000135007;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT = 1000135008;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT = 1000135009;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT = 1000135010;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT = 1000135011;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV = 1000135012;
    public static final int VK_STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT = 1000135013;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM = 1000135014;
    public static final long VK_ACCESS_2_SAMPLER_HEAP_READ_BIT_EXT = 144115188075855872L;
    public static final long VK_ACCESS_2_RESOURCE_HEAP_READ_BIT_EXT = 288230376151711744L;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_EXT = 1000135000;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_SEQUENCE_INDEX_EXT = 1000135001;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_NV = 1000135000;
    public static final int VK_SHADER_CREATE_DESCRIPTOR_HEAP_BIT_EXT = 1024;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_CONSTANT_OFFSET_EXT = 0;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_PUSH_INDEX_EXT = 1;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_INDIRECT_INDEX_EXT = 2;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_INDIRECT_INDEX_ARRAY_EXT = 3;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_RESOURCE_HEAP_DATA_EXT = 4;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_PUSH_DATA_EXT = 5;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_PUSH_ADDRESS_EXT = 6;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_INDIRECT_ADDRESS_EXT = 7;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_SHADER_RECORD_INDEX_EXT = 8;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_SHADER_RECORD_DATA_EXT = 9;
    public static final int VK_DESCRIPTOR_MAPPING_SOURCE_SHADER_RECORD_ADDRESS_EXT = 10;
    public static final int VK_SPIRV_RESOURCE_TYPE_SAMPLER_BIT_EXT = 1;
    public static final int VK_SPIRV_RESOURCE_TYPE_SAMPLED_IMAGE_BIT_EXT = 2;
    public static final int VK_SPIRV_RESOURCE_TYPE_READ_ONLY_IMAGE_BIT_EXT = 4;
    public static final int VK_SPIRV_RESOURCE_TYPE_READ_WRITE_IMAGE_BIT_EXT = 8;
    public static final int VK_SPIRV_RESOURCE_TYPE_COMBINED_SAMPLED_IMAGE_BIT_EXT = 16;
    public static final int VK_SPIRV_RESOURCE_TYPE_UNIFORM_BUFFER_BIT_EXT = 32;
    public static final int VK_SPIRV_RESOURCE_TYPE_READ_ONLY_STORAGE_BUFFER_BIT_EXT = 64;
    public static final int VK_SPIRV_RESOURCE_TYPE_READ_WRITE_STORAGE_BUFFER_BIT_EXT = 128;
    public static final int VK_SPIRV_RESOURCE_TYPE_ACCELERATION_STRUCTURE_BIT_EXT = 256;
    public static final int VK_SPIRV_RESOURCE_TYPE_TENSOR_BIT_ARM = 512;
    public static final int VK_SPIRV_RESOURCE_TYPE_ALL_EXT = Integer.MAX_VALUE;
    public static final long VK_TENSOR_CREATE_DESCRIPTOR_HEAP_CAPTURE_REPLAY_BIT_ARM = 8;

    protected EXTDescriptorHeap() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkWriteSamplerDescriptorsEXT(org.lwjgl.vulkan.VkDevice r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWriteSamplerDescriptorsEXT
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r11
            int r2 = org.lwjgl.vulkan.VkHostAddressRangeEXT.SIZEOF
            int r3 = org.lwjgl.vulkan.VkHostAddressRangeEXT::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L23:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWriteSamplerDescriptorsEXT(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkSamplerCreateInfo const *") org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer r8, @org.lwjgl.system.NativeType("VkHostAddressRangeEXT const *") org.lwjgl.vulkan.VkHostAddressRangeEXT.Buffer r9) {
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
            long r2 = r2.address()
            r3 = r9
            long r3 = r3.address()
            int r0 = nvkWriteSamplerDescriptorsEXT(r0, r1, r2, r3)
            return r0
    }

    public static int nvkWriteResourceDescriptorsEXT(org.lwjgl.vulkan.VkDevice r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWriteResourceDescriptorsEXT
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r11
            int r2 = org.lwjgl.vulkan.VkHostAddressRangeEXT.SIZEOF
            int r3 = org.lwjgl.vulkan.VkHostAddressRangeEXT::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L23:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWriteResourceDescriptorsEXT(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkResourceDescriptorInfoEXT const *") org.lwjgl.vulkan.VkResourceDescriptorInfoEXT.Buffer r8, @org.lwjgl.system.NativeType("VkHostAddressRangeEXT const *") org.lwjgl.vulkan.VkHostAddressRangeEXT.Buffer r9) {
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
            long r2 = r2.address()
            r3 = r9
            long r3 = r3.address()
            int r0 = nvkWriteResourceDescriptorsEXT(r0, r1, r2, r3)
            return r0
    }

    public static void nvkCmdBindSamplerHeapEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindSamplerHeapEXT
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

    public static void vkCmdBindSamplerHeapEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkBindHeapInfoEXT const *") org.lwjgl.vulkan.VkBindHeapInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBindSamplerHeapEXT(r0, r1)
            return
    }

    public static void nvkCmdBindResourceHeapEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindResourceHeapEXT
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

    public static void vkCmdBindResourceHeapEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkBindHeapInfoEXT const *") org.lwjgl.vulkan.VkBindHeapInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBindResourceHeapEXT(r0, r1)
            return
    }

    public static void nvkCmdPushDataEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdPushDataEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkPushDataInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdPushDataEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkPushDataInfoEXT const *") org.lwjgl.vulkan.VkPushDataInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdPushDataEXT(r0, r1)
            return
    }

    public static int nvkGetImageOpaqueCaptureDataEXT(org.lwjgl.vulkan.VkDevice r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageOpaqueCaptureDataEXT
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetImageOpaqueCaptureDataEXT(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkImage const *") java.nio.LongBuffer r8, @org.lwjgl.system.NativeType("VkHostAddressRangeEXT *") org.lwjgl.vulkan.VkHostAddressRangeEXT.Buffer r9) {
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
            int r0 = nvkGetImageOpaqueCaptureDataEXT(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public static long vkGetPhysicalDeviceDescriptorSizeEXT(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("VkDescriptorType") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceDescriptorSizeEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r0 = org.lwjgl.system.JNI.callPJ(r0, r1, r2)
            return r0
    }

    public static int nvkRegisterCustomBorderColorEXT(org.lwjgl.vulkan.VkDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkRegisterCustomBorderColorEXT
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
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkRegisterCustomBorderColorEXT(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkSamplerCustomBorderColorCreateInfoEXT const *") org.lwjgl.vulkan.VkSamplerCustomBorderColorCreateInfoEXT r8, @org.lwjgl.system.NativeType("VkBool32") boolean r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            if (r2 == 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvkRegisterCustomBorderColorEXT(r0, r1, r2, r3)
            return r0
    }

    public static void vkUnregisterCustomBorderColorEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkUnregisterCustomBorderColorEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static int nvkGetTensorOpaqueCaptureDataARM(org.lwjgl.vulkan.VkDevice r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetTensorOpaqueCaptureDataARM
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetTensorOpaqueCaptureDataARM(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkTensorARM const *") java.nio.LongBuffer r8, @org.lwjgl.system.NativeType("VkHostAddressRangeEXT *") org.lwjgl.vulkan.VkHostAddressRangeEXT.Buffer r9) {
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
            int r0 = nvkGetTensorOpaqueCaptureDataARM(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetImageOpaqueCaptureDataEXT(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkImage const *") long[] r10, @org.lwjgl.system.NativeType("VkHostAddressRangeEXT *") org.lwjgl.vulkan.VkHostAddressRangeEXT.Buffer r11) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageOpaqueCaptureDataEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = r10
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            int r1 = r1.length
            r2 = r10
            r3 = r11
            long r3 = r3.address()
            r4 = r12
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkRegisterCustomBorderColorEXT(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkSamplerCustomBorderColorCreateInfoEXT const *") org.lwjgl.vulkan.VkSamplerCustomBorderColorCreateInfoEXT r10, @org.lwjgl.system.NativeType("VkBool32") boolean r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkRegisterCustomBorderColorEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            long r1 = r1.address()
            r2 = r11
            if (r2 == 0) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            r3 = r12
            r4 = r13
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetTensorOpaqueCaptureDataARM(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkTensorARM const *") long[] r10, @org.lwjgl.system.NativeType("VkHostAddressRangeEXT *") org.lwjgl.vulkan.VkHostAddressRangeEXT.Buffer r11) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetTensorOpaqueCaptureDataARM
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = r10
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            int r1 = r1.length
            r2 = r10
            r3 = r11
            long r3 = r3.address()
            r4 = r12
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }
}
