package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDescriptorBuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDescriptorBuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDescriptorBuffer.class */
public class EXTDescriptorBuffer {
    public static final int VK_EXT_DESCRIPTOR_BUFFER_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_DESCRIPTOR_BUFFER_EXTENSION_NAME = "VK_EXT_descriptor_buffer";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT = 1000316000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT = 1000316001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT = 1000316002;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT = 1000316003;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT = 1000316004;
    public static final int VK_STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316005;
    public static final int VK_STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316007;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316008;
    public static final int VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT = 1000316010;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT = 1000316011;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT = 1000316012;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT = 16;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT = 32;
    public static final int VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT = 2097152;
    public static final int VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT = 4194304;
    public static final int VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 67108864;
    public static final int VK_BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 32;
    public static final int VK_IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 65536;
    public static final int VK_IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 4;
    public static final int VK_SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 8;
    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 8;
    public static final long VK_ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT = 2199023255552L;
    public static final int VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT = 536870912;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316009;

    protected EXTDescriptorBuffer() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetDescriptorSetLayoutSizeEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDescriptorSetLayoutSizeEXT
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

    public static void vkGetDescriptorSetLayoutSizeEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDescriptorSetLayout") long r7, @org.lwjgl.system.NativeType("VkDeviceSize *") java.nio.LongBuffer r9) {
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
            nvkGetDescriptorSetLayoutSizeEXT(r0, r1, r2)
            return
    }

    public static void nvkGetDescriptorSetLayoutBindingOffsetEXT(org.lwjgl.vulkan.VkDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDescriptorSetLayoutBindingOffsetEXT
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
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkDescriptorSetLayout") long r8, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("VkDeviceSize *") java.nio.LongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nvkGetDescriptorSetLayoutBindingOffsetEXT(r0, r1, r2, r3)
            return
    }

    public static void nvkGetDescriptorEXT(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDescriptorEXT
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
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetDescriptorEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDescriptorGetInfoEXT const *") org.lwjgl.vulkan.VkDescriptorGetInfoEXT r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r10) {
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nvkGetDescriptorEXT(r0, r1, r2, r3)
            return
    }

    public static void nvkCmdBindDescriptorBuffersEXT(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindDescriptorBuffersEXT
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdBindDescriptorBuffersEXT(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkDescriptorBufferBindingInfoEXT const *") org.lwjgl.vulkan.VkDescriptorBufferBindingInfoEXT.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            nvkCmdBindDescriptorBuffersEXT(r0, r1, r2)
            return
    }

    public static void nvkCmdSetDescriptorBufferOffsetsEXT(org.lwjgl.vulkan.VkCommandBuffer r14, int r15, long r16, int r18, int r19, long r20, long r22) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDescriptorBufferOffsetsEXT
            r24 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r24
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r22
            r7 = r24
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkCmdSetDescriptorBufferOffsetsEXT(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkPipelineBindPoint") int r12, @org.lwjgl.system.NativeType("VkPipelineLayout") long r13, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r17
            r1 = r16
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            int r4 = r4.remaining()
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r17
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nvkCmdSetDescriptorBufferOffsetsEXT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkPipelineBindPoint") int r10, @org.lwjgl.system.NativeType("VkPipelineLayout") long r11, @org.lwjgl.system.NativeType("uint32_t") int r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindDescriptorBufferEmbeddedSamplersEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3, r4)
            return
    }

    public static int nvkGetBufferOpaqueCaptureDescriptorDataEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetBufferOpaqueCaptureDescriptorDataEXT
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
    public static int vkGetBufferOpaqueCaptureDescriptorDataEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkBufferCaptureDescriptorDataInfoEXT const *") org.lwjgl.vulkan.VkBufferCaptureDescriptorDataInfoEXT r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
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
            int r0 = nvkGetBufferOpaqueCaptureDescriptorDataEXT(r0, r1, r2)
            return r0
    }

    public static int nvkGetImageOpaqueCaptureDescriptorDataEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageOpaqueCaptureDescriptorDataEXT
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
    public static int vkGetImageOpaqueCaptureDescriptorDataEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkImageCaptureDescriptorDataInfoEXT const *") org.lwjgl.vulkan.VkImageCaptureDescriptorDataInfoEXT r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
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
            int r0 = nvkGetImageOpaqueCaptureDescriptorDataEXT(r0, r1, r2)
            return r0
    }

    public static int nvkGetImageViewOpaqueCaptureDescriptorDataEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetImageViewOpaqueCaptureDescriptorDataEXT
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
    public static int vkGetImageViewOpaqueCaptureDescriptorDataEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkImageViewCaptureDescriptorDataInfoEXT const *") org.lwjgl.vulkan.VkImageViewCaptureDescriptorDataInfoEXT r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
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
            int r0 = nvkGetImageViewOpaqueCaptureDescriptorDataEXT(r0, r1, r2)
            return r0
    }

    public static int nvkGetSamplerOpaqueCaptureDescriptorDataEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSamplerOpaqueCaptureDescriptorDataEXT
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
    public static int vkGetSamplerOpaqueCaptureDescriptorDataEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSamplerCaptureDescriptorDataInfoEXT const *") org.lwjgl.vulkan.VkSamplerCaptureDescriptorDataInfoEXT r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
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
            int r0 = nvkGetSamplerOpaqueCaptureDescriptorDataEXT(r0, r1, r2)
            return r0
    }

    public static int nvkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT
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
    public static int vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkAccelerationStructureCaptureDescriptorDataInfoEXT const *") org.lwjgl.vulkan.VkAccelerationStructureCaptureDescriptorDataInfoEXT r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
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
            int r0 = nvkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(r0, r1, r2)
            return r0
    }

    public static void vkGetDescriptorSetLayoutSizeEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDescriptorSetLayout") long r9, @org.lwjgl.system.NativeType("VkDeviceSize *") long[] r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDescriptorSetLayoutSizeEXT
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
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkDescriptorSetLayout") long r10, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("VkDeviceSize *") long[] r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDescriptorSetLayoutBindingOffsetEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdSetDescriptorBufferOffsetsEXT(org.lwjgl.vulkan.VkCommandBuffer r12, @org.lwjgl.system.NativeType("VkPipelineBindPoint") int r13, @org.lwjgl.system.NativeType("VkPipelineLayout") long r14, @org.lwjgl.system.NativeType("uint32_t") int r16, @org.lwjgl.system.NativeType("uint32_t const *") int[] r17, @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetDescriptorBufferOffsetsEXT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = r17
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L1d:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            int r4 = r4.length
            r5 = r17
            r6 = r18
            r7 = r19
            org.lwjgl.system.JNI.callPJPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
