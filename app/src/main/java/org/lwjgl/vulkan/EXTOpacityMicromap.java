package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTOpacityMicromap.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTOpacityMicromap.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTOpacityMicromap.class */
public class EXTOpacityMicromap {
    public static final int VK_EXT_OPACITY_MICROMAP_SPEC_VERSION = 2;
    public static final java.lang.String VK_EXT_OPACITY_MICROMAP_EXTENSION_NAME = "VK_EXT_opacity_micromap";
    public static final int VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT = 1000396000;
    public static final int VK_STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT = 1000396001;
    public static final int VK_STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT = 1000396002;
    public static final int VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT = 1000396003;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT = 1000396004;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT = 1000396005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT = 1000396006;
    public static final int VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT = 1000396007;
    public static final int VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT = 1000396008;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT = 1000396009;
    public static final long VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT = 1073741824;
    public static final long VK_ACCESS_2_MICROMAP_READ_BIT_EXT = 17592186044416L;
    public static final long VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT = 35184372088832L;
    public static final int VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT = 1000396000;
    public static final int VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT = 1000396001;
    public static final int VK_OBJECT_TYPE_MICROMAP_EXT = 1000396000;
    public static final int VK_BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 8388608;
    public static final int VK_BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT = 16777216;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT = 16777216;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT = 16;
    public static final int VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT = 32;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT = 64;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT = 128;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT = 256;
    public static final int VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT = 0;
    public static final int VK_BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT = 1;
    public static final int VK_BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT = 2;
    public static final int VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT = 4;
    public static final int VK_BUILD_MICROMAP_MODE_BUILD_EXT = 0;
    public static final int VK_MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT = 1;
    public static final int VK_COPY_MICROMAP_MODE_CLONE_EXT = 0;
    public static final int VK_COPY_MICROMAP_MODE_SERIALIZE_EXT = 1;
    public static final int VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT = 2;
    public static final int VK_COPY_MICROMAP_MODE_COMPACT_EXT = 3;
    public static final int VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT = 1;
    public static final int VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT = 2;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT = -1;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT = -2;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT = -3;
    public static final int VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT = -4;

    protected EXTOpacityMicromap() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateMicromapEXT(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateMicromapEXT
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
    public static int vkCreateMicromapEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkMicromapCreateInfoEXT const *") org.lwjgl.vulkan.VkMicromapCreateInfoEXT r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkMicromapEXT *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateMicromapEXT(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyMicromapEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyMicromapEXT
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

    public static void vkDestroyMicromapEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkMicromapEXT") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyMicromapEXT(r0, r1, r2)
            return
    }

    public static void nvkCmdBuildMicromapsEXT(org.lwjgl.vulkan.VkCommandBuffer r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBuildMicromapsEXT
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

    public static void vkCmdBuildMicromapsEXT(org.lwjgl.vulkan.VkCommandBuffer r5, @org.lwjgl.system.NativeType("VkMicromapBuildInfoEXT const *") org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            nvkCmdBuildMicromapsEXT(r0, r1, r2)
            return
    }

    public static int nvkBuildMicromapsEXT(org.lwjgl.vulkan.VkDevice r10, long r11, int r13, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBuildMicromapsEXT
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
    public static int vkBuildMicromapsEXT(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r8, @org.lwjgl.system.NativeType("VkMicromapBuildInfoEXT const *") org.lwjgl.vulkan.VkMicromapBuildInfoEXT.Buffer r10) {
            r0 = r7
            r1 = r8
            r2 = r10
            int r2 = r2.remaining()
            r3 = r10
            long r3 = r3.address()
            int r0 = nvkBuildMicromapsEXT(r0, r1, r2, r3)
            return r0
    }

    public static int nvkCopyMicromapEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyMicromapEXT
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
    public static int vkCopyMicromapEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r7, @org.lwjgl.system.NativeType("VkCopyMicromapInfoEXT const *") org.lwjgl.vulkan.VkCopyMicromapInfoEXT r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkCopyMicromapEXT(r0, r1, r2)
            return r0
    }

    public static int nvkCopyMicromapToMemoryEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyMicromapToMemoryEXT
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
    public static int vkCopyMicromapToMemoryEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r7, @org.lwjgl.system.NativeType("VkCopyMicromapToMemoryInfoEXT const *") org.lwjgl.vulkan.VkCopyMicromapToMemoryInfoEXT r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkCopyMicromapToMemoryEXT(r0, r1, r2)
            return r0
    }

    public static int nvkCopyMemoryToMicromapEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCopyMemoryToMicromapEXT
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
    public static int vkCopyMemoryToMicromapEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeferredOperationKHR") long r7, @org.lwjgl.system.NativeType("VkCopyMemoryToMicromapInfoEXT const *") org.lwjgl.vulkan.VkCopyMemoryToMicromapInfoEXT r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkCopyMemoryToMicromapEXT(r0, r1, r2)
            return r0
    }

    public static int nvkWriteMicromapsPropertiesEXT(org.lwjgl.vulkan.VkDevice r15, int r16, long r17, int r19, long r20, long r22, long r24) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWriteMicromapsPropertiesEXT
            r26 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r26
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r20
            r5 = r22
            r6 = r24
            r7 = r26
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWriteMicromapsPropertiesEXT(org.lwjgl.vulkan.VkDevice r12, @org.lwjgl.system.NativeType("VkMicromapEXT const *") java.nio.LongBuffer r13, @org.lwjgl.system.NativeType("VkQueryType") int r14, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r15, @org.lwjgl.system.NativeType("size_t") long r16) {
            r0 = r12
            r1 = r13
            int r1 = r1.remaining()
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            r4 = r15
            int r4 = r4.remaining()
            long r4 = (long) r4
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r16
            int r0 = nvkWriteMicromapsPropertiesEXT(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void nvkCmdCopyMicromapEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyMicromapEXT
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

    public static void vkCmdCopyMicromapEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyMicromapInfoEXT const *") org.lwjgl.vulkan.VkCopyMicromapInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyMicromapEXT(r0, r1)
            return
    }

    public static void nvkCmdCopyMicromapToMemoryEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyMicromapToMemoryEXT
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

    public static void vkCmdCopyMicromapToMemoryEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyMicromapToMemoryInfoEXT const *") org.lwjgl.vulkan.VkCopyMicromapToMemoryInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyMicromapToMemoryEXT(r0, r1)
            return
    }

    public static void nvkCmdCopyMemoryToMicromapEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdCopyMemoryToMicromapEXT
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

    public static void vkCmdCopyMemoryToMicromapEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkCopyMemoryToMicromapInfoEXT const *") org.lwjgl.vulkan.VkCopyMemoryToMicromapInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdCopyMemoryToMicromapEXT(r0, r1)
            return
    }

    public static void nvkCmdWriteMicromapsPropertiesEXT(org.lwjgl.vulkan.VkCommandBuffer r12, int r13, long r14, int r16, long r17, int r19) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWriteMicromapsPropertiesEXT
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r19
            r6 = r20
            org.lwjgl.system.JNI.callPPJV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdWriteMicromapsPropertiesEXT(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkMicromapEXT const *") java.nio.LongBuffer r10, @org.lwjgl.system.NativeType("VkQueryType") int r11, @org.lwjgl.system.NativeType("VkQueryPool") long r12, @org.lwjgl.system.NativeType("uint32_t") int r14) {
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = r12
            r5 = r14
            nvkCmdWriteMicromapsPropertiesEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkGetDeviceMicromapCompatibilityEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceMicromapCompatibilityEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkMicromapVersionInfoEXT.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDeviceMicromapCompatibilityEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkMicromapVersionInfoEXT const *") org.lwjgl.vulkan.VkMicromapVersionInfoEXT r7, @org.lwjgl.system.NativeType("VkAccelerationStructureCompatibilityKHR *") java.nio.IntBuffer r8) {
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
            nvkGetDeviceMicromapCompatibilityEXT(r0, r1, r2)
            return
    }

    public static void nvkGetMicromapBuildSizesEXT(org.lwjgl.vulkan.VkDevice r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetMicromapBuildSizesEXT
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetMicromapBuildSizesEXT(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkAccelerationStructureBuildTypeKHR") int r8, @org.lwjgl.system.NativeType("VkMicromapBuildInfoEXT const *") org.lwjgl.vulkan.VkMicromapBuildInfoEXT r9, @org.lwjgl.system.NativeType("VkMicromapBuildSizesInfoEXT *") org.lwjgl.vulkan.VkMicromapBuildSizesInfoEXT r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = r2.address()
            r3 = r10
            long r3 = r3.address()
            nvkGetMicromapBuildSizesEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateMicromapEXT(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkMicromapCreateInfoEXT const *") org.lwjgl.vulkan.VkMicromapCreateInfoEXT r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkMicromapEXT *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateMicromapEXT
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

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWriteMicromapsPropertiesEXT(org.lwjgl.vulkan.VkDevice r14, @org.lwjgl.system.NativeType("VkMicromapEXT const *") long[] r15, @org.lwjgl.system.NativeType("VkQueryType") int r16, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r17, @org.lwjgl.system.NativeType("size_t") long r18) {
            r0 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWriteMicromapsPropertiesEXT
            r20 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r20
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            int r1 = r1.length
            r2 = r15
            r3 = r16
            r4 = r17
            int r4 = r4.remaining()
            long r4 = (long) r4
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r18
            r7 = r20
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static void vkCmdWriteMicromapsPropertiesEXT(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkMicromapEXT const *") long[] r12, @org.lwjgl.system.NativeType("VkQueryType") int r13, @org.lwjgl.system.NativeType("VkQueryPool") long r14, @org.lwjgl.system.NativeType("uint32_t") int r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdWriteMicromapsPropertiesEXT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            int r1 = r1.length
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r16
            r6 = r17
            org.lwjgl.system.JNI.callPPJV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkGetDeviceMicromapCompatibilityEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkMicromapVersionInfoEXT const *") org.lwjgl.vulkan.VkMicromapVersionInfoEXT r9, @org.lwjgl.system.NativeType("VkAccelerationStructureCompatibilityKHR *") int[] r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceMicromapCompatibilityEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            long r0 = r0.address()
            org.lwjgl.vulkan.VkMicromapVersionInfoEXT.validate(r0)
        L1f:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            r3 = r11
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }
}
