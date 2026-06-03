package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVLowLatency2.class */
public class NVLowLatency2 {
    public static final int VK_NV_LOW_LATENCY_2_SPEC_VERSION = 2;
    public static final java.lang.String VK_NV_LOW_LATENCY_2_EXTENSION_NAME = "VK_NV_low_latency2";
    public static final int VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV = 1000505000;
    public static final int VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV = 1000505001;
    public static final int VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV = 1000505002;
    public static final int VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV = 1000505003;
    public static final int VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV = 1000505004;
    public static final int VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV = 1000505005;
    public static final int VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV = 1000505006;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV = 1000505007;
    public static final int VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV = 1000505008;
    public static final int VK_LATENCY_MARKER_SIMULATION_START_NV = 0;
    public static final int VK_LATENCY_MARKER_SIMULATION_END_NV = 1;
    public static final int VK_LATENCY_MARKER_RENDERSUBMIT_START_NV = 2;
    public static final int VK_LATENCY_MARKER_RENDERSUBMIT_END_NV = 3;
    public static final int VK_LATENCY_MARKER_PRESENT_START_NV = 4;
    public static final int VK_LATENCY_MARKER_PRESENT_END_NV = 5;
    public static final int VK_LATENCY_MARKER_INPUT_SAMPLE_NV = 6;
    public static final int VK_LATENCY_MARKER_TRIGGER_FLASH_NV = 7;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_START_NV = 8;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_END_NV = 9;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_START_NV = 10;
    public static final int VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_END_NV = 11;
    public static final int VK_OUT_OF_BAND_QUEUE_TYPE_RENDER_NV = 0;
    public static final int VK_OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV = 1;

    protected NVLowLatency2() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkSetLatencySleepModeNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSetLatencySleepModeNV
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
    public static int vkSetLatencySleepModeNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r7, @org.lwjgl.system.NativeType("VkLatencySleepModeInfoNV const *") org.lwjgl.vulkan.VkLatencySleepModeInfoNV r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkSetLatencySleepModeNV(r0, r1, r2)
            return r0
    }

    public static int nvkLatencySleepNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkLatencySleepNV
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
    public static int vkLatencySleepNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r7, @org.lwjgl.system.NativeType("VkLatencySleepInfoNV const *") org.lwjgl.vulkan.VkLatencySleepInfoNV r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            int r0 = nvkLatencySleepNV(r0, r1, r2)
            return r0
    }

    public static void nvkSetLatencyMarkerNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSetLatencyMarkerNV
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

    public static void vkSetLatencyMarkerNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r7, @org.lwjgl.system.NativeType("VkSetLatencyMarkerInfoNV const *") org.lwjgl.vulkan.VkSetLatencyMarkerInfoNV r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            nvkSetLatencyMarkerNV(r0, r1, r2)
            return
    }

    public static void nvkGetLatencyTimingsNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetLatencyTimingsNV
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

    public static void vkGetLatencyTimingsNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSwapchainKHR") long r7, @org.lwjgl.system.NativeType("VkGetLatencyMarkerInfoNV *") org.lwjgl.vulkan.VkGetLatencyMarkerInfoNV r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            nvkGetLatencyTimingsNV(r0, r1, r2)
            return
    }

    public static void nvkQueueNotifyOutOfBandNV(org.lwjgl.vulkan.VkQueue r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkQueueNotifyOutOfBandNV
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

    public static void vkQueueNotifyOutOfBandNV(org.lwjgl.vulkan.VkQueue r4, @org.lwjgl.system.NativeType("VkOutOfBandQueueTypeInfoNV const *") org.lwjgl.vulkan.VkOutOfBandQueueTypeInfoNV r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkQueueNotifyOutOfBandNV(r0, r1)
            return
    }
}
