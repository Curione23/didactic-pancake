package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDebugReport.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDebugReport.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDebugReport.class */
public class EXTDebugReport {
    public static final int VK_EXT_DEBUG_REPORT_SPEC_VERSION = 10;
    public static final java.lang.String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";
    public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = 1000011000;
    public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT = 1000011000;
    public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;
    public static final int VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT = 1000011000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT = 1000156000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT = 1000085000;
    public static final int VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 1;
    public static final int VK_DEBUG_REPORT_WARNING_BIT_EXT = 2;
    public static final int VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 4;
    public static final int VK_DEBUG_REPORT_ERROR_BIT_EXT = 8;
    public static final int VK_DEBUG_REPORT_DEBUG_BIT_EXT = 16;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = 0;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = 1;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = 2;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = 3;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = 4;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = 5;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = 6;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = 7;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = 8;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = 9;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = 10;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = 11;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = 12;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = 13;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = 14;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = 15;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = 16;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = 17;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = 18;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = 19;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = 20;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = 21;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = 22;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = 23;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = 24;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = 25;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = 26;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = 27;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT = 28;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = 28;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT = 29;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT = 30;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT = 33;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT = 33;

    protected EXTDebugReport() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateDebugReportCallbackEXT(org.lwjgl.vulkan.VkInstance r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDebugReportCallbackEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkDebugReportCallbackCreateInfoEXT.validate(r0)
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
    public static int vkCreateDebugReportCallbackEXT(org.lwjgl.vulkan.VkInstance r8, @org.lwjgl.system.NativeType("VkDebugReportCallbackCreateInfoEXT const *") org.lwjgl.vulkan.VkDebugReportCallbackCreateInfoEXT r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkDebugReportCallbackEXT *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateDebugReportCallbackEXT(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyDebugReportCallbackEXT(org.lwjgl.vulkan.VkInstance r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyDebugReportCallbackEXT
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

    public static void vkDestroyDebugReportCallbackEXT(org.lwjgl.vulkan.VkInstance r6, @org.lwjgl.system.NativeType("VkDebugReportCallbackEXT") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyDebugReportCallbackEXT(r0, r1, r2)
            return
    }

    public static void nvkDebugReportMessageEXT(org.lwjgl.vulkan.VkInstance r16, int r17, int r18, long r19, long r21, int r23, long r24, long r26) {
            r0 = r16
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkDebugReportMessageEXT
            r28 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r28
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r16
            long r0 = r0.address()
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            r5 = r23
            r6 = r24
            r7 = r26
            r8 = r28
            org.lwjgl.system.JNI.callPJPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void vkDebugReportMessageEXT(org.lwjgl.vulkan.VkInstance r13, @org.lwjgl.system.NativeType("VkDebugReportFlagsEXT") int r14, @org.lwjgl.system.NativeType("VkDebugReportObjectTypeEXT") int r15, @org.lwjgl.system.NativeType("uint64_t") long r16, @org.lwjgl.system.NativeType("size_t") long r18, @org.lwjgl.system.NativeType("int32_t") int r20, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r21, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r22) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r21
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r22
            org.lwjgl.system.Checks.checkNT1(r0)
        L10:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r18
            r5 = r20
            r6 = r21
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r22
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            nvkDebugReportMessageEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkDebugReportMessageEXT(org.lwjgl.vulkan.VkInstance r13, @org.lwjgl.system.NativeType("VkDebugReportFlagsEXT") int r14, @org.lwjgl.system.NativeType("VkDebugReportObjectTypeEXT") int r15, @org.lwjgl.system.NativeType("uint64_t") long r16, @org.lwjgl.system.NativeType("size_t") long r18, @org.lwjgl.system.NativeType("int32_t") int r20, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r21, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r22) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r23 = r0
            r0 = r23
            int r0 = r0.getPointer()
            r24 = r0
            r0 = r23
            r1 = r21
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L45
            r0 = r23
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L45
            r25 = r0
            r0 = r23
            r1 = r22
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L45
            r0 = r23
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L45
            r27 = r0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r18
            r5 = r20
            r6 = r25
            r7 = r27
            nvkDebugReportMessageEXT(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L45
            r0 = r23
            r1 = r24
            r0.setPointer(r1)
            goto L51
        L45:
            r29 = move-exception
            r0 = r23
            r1 = r24
            r0.setPointer(r1)
            r0 = r29
            throw r0
        L51:
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateDebugReportCallbackEXT(org.lwjgl.vulkan.VkInstance r10, @org.lwjgl.system.NativeType("VkDebugReportCallbackCreateInfoEXT const *") org.lwjgl.vulkan.VkDebugReportCallbackCreateInfoEXT r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkDebugReportCallbackEXT *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDebugReportCallbackEXT
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
            org.lwjgl.vulkan.VkDebugReportCallbackCreateInfoEXT.validate(r0)
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
