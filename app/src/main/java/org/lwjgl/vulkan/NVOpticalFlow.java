package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVOpticalFlow.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVOpticalFlow.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVOpticalFlow.class */
public class NVOpticalFlow {
    public static final int VK_NV_OPTICAL_FLOW_SPEC_VERSION = 1;
    public static final java.lang.String VK_NV_OPTICAL_FLOW_EXTENSION_NAME = "VK_NV_optical_flow";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV = 1000464000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV = 1000464001;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV = 1000464002;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV = 1000464003;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV = 1000464004;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV = 1000464005;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV = 1000464010;
    public static final int VK_FORMAT_R16G16_S10_5_NV = 1000464000;
    public static final int VK_OBJECT_TYPE_OPTICAL_FLOW_SESSION_NV = 1000464000;
    public static final int VK_QUEUE_OPTICAL_FLOW_BIT_NV = 256;
    public static final long VK_PIPELINE_STAGE_2_OPTICAL_FLOW_BIT_NV = 536870912;
    public static final long VK_ACCESS_2_OPTICAL_FLOW_READ_BIT_NV = 4398046511104L;
    public static final long VK_ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV = 8796093022208L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV = 1099511627776L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV = 2199023255552L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV = 4398046511104L;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV = 1;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV = 2;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV = 4;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV = 8;
    public static final int VK_OPTICAL_FLOW_USAGE_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV = 1;
    public static final int VK_OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV = 2;
    public static final int VK_OPTICAL_FLOW_USAGE_HINT_BIT_NV = 4;
    public static final int VK_OPTICAL_FLOW_USAGE_COST_BIT_NV = 8;
    public static final int VK_OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV = 16;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV = 1;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV = 2;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV = 3;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_INPUT_NV = 1;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_REFERENCE_NV = 2;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV = 3;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_FLOW_VECTOR_NV = 4;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_FLOW_VECTOR_NV = 5;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV = 6;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV = 7;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV = 8;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV = 1;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV = 2;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV = 4;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV = 8;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV = 16;
    public static final int VK_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV = 1;

    protected NVOpticalFlow() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPhysicalDeviceOpticalFlowImageFormatsNV(org.lwjgl.vulkan.VkPhysicalDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceOpticalFlowImageFormatsNV
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
    public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("VkOpticalFlowImageFormatInfoNV const *") org.lwjgl.vulkan.VkOpticalFlowImageFormatInfoNV r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkOpticalFlowImageFormatPropertiesNV *") org.lwjgl.vulkan.VkOpticalFlowImageFormatPropertiesNV.Buffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = r10
            r2 = r10
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvkGetPhysicalDeviceOpticalFlowImageFormatsNV(r0, r1, r2, r3)
            return r0
    }

    public static int nvkCreateOpticalFlowSessionNV(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateOpticalFlowSessionNV
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
    public static int vkCreateOpticalFlowSessionNV(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkOpticalFlowSessionCreateInfoNV const *") org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkOpticalFlowSessionNV *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateOpticalFlowSessionNV(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyOpticalFlowSessionNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyOpticalFlowSessionNV
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

    public static void vkDestroyOpticalFlowSessionNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkOpticalFlowSessionNV") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyOpticalFlowSessionNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkBindOpticalFlowSessionImageNV(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkOpticalFlowSessionNV") long r12, @org.lwjgl.system.NativeType("VkOpticalFlowSessionBindingPointNV") int r14, @org.lwjgl.system.NativeType("VkImageView") long r15, @org.lwjgl.system.NativeType("VkImageLayout") int r17) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBindOpticalFlowSessionImageNV
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
            r3 = r15
            r4 = r17
            r5 = r18
            int r0 = org.lwjgl.system.JNI.callPJJI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void nvkCmdOpticalFlowExecuteNV(org.lwjgl.vulkan.VkCommandBuffer r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdOpticalFlowExecuteNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkOpticalFlowExecuteInfoNV.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkCmdOpticalFlowExecuteNV(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkOpticalFlowSessionNV") long r7, @org.lwjgl.system.NativeType("VkOpticalFlowExecuteInfoNV const *") org.lwjgl.vulkan.VkOpticalFlowExecuteInfoNV r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            nvkCmdOpticalFlowExecuteNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(org.lwjgl.vulkan.VkPhysicalDevice r10, @org.lwjgl.system.NativeType("VkOpticalFlowImageFormatInfoNV const *") org.lwjgl.vulkan.VkOpticalFlowImageFormatInfoNV r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkOpticalFlowImageFormatPropertiesNV *") org.lwjgl.vulkan.VkOpticalFlowImageFormatPropertiesNV.Buffer r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceOpticalFlowImageFormatsNV
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L21:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateOpticalFlowSessionNV(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkOpticalFlowSessionCreateInfoNV const *") org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkOpticalFlowSessionNV *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreateOpticalFlowSessionNV
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
