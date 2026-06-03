package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTTransformFeedback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTTransformFeedback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTTransformFeedback.class */
public class EXTTransformFeedback {
    public static final int VK_EXT_TRANSFORM_FEEDBACK_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME = "VK_EXT_transform_feedback";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT = 1000028000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT = 1000028001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT = 1000028002;
    public static final int VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT = 1000028004;
    public static final int VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT = 2048;
    public static final int VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 4096;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT = 33554432;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT = 67108864;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 134217728;
    public static final int VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT = 16777216;

    protected EXTTransformFeedback() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdBindTransformFeedbackBuffersEXT(org.lwjgl.vulkan.VkCommandBuffer r13, int r14, int r15, long r16, long r18, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindTransformFeedbackBuffersEXT
            r22 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r22
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r18
            r5 = r20
            r6 = r22
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdBindTransformFeedbackBuffersEXT(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("uint32_t") int r11, @org.lwjgl.system.NativeType("VkBuffer const *") java.nio.LongBuffer r12, @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r13
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r10
            r1 = r11
            r2 = r12
            int r2 = r2.remaining()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r14
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            nvkCmdBindTransformFeedbackBuffersEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkCmdBeginTransformFeedbackEXT(org.lwjgl.vulkan.VkCommandBuffer r11, int r12, int r13, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginTransformFeedbackEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r16
            r5 = r18
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdBeginTransformFeedbackEXT(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBuffer const *") java.nio.LongBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r11
            r1 = r10
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Le:
            r0 = r8
            r1 = r9
            r2 = r10
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nvkCmdBeginTransformFeedbackEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void nvkCmdEndTransformFeedbackEXT(org.lwjgl.vulkan.VkCommandBuffer r11, int r12, int r13, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndTransformFeedbackEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r16
            r5 = r18
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdEndTransformFeedbackEXT(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBuffer const *") java.nio.LongBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r11
            r1 = r10
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Le:
            r0 = r8
            r1 = r9
            r2 = r10
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nvkCmdEndTransformFeedbackEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdBeginQueryIndexedEXT(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("VkQueryPool") long r11, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("VkQueryControlFlags") int r14, @org.lwjgl.system.NativeType("uint32_t") int r15) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginQueryIndexedEXT
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
            r4 = r15
            r5 = r16
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdEndQueryIndexedEXT(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("VkQueryPool") long r10, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndQueryIndexedEXT
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
            r3 = r13
            r4 = r14
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdDrawIndirectByteCountEXT(org.lwjgl.vulkan.VkCommandBuffer r13, @org.lwjgl.system.NativeType("uint32_t") int r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("VkBuffer") long r16, @org.lwjgl.system.NativeType("VkDeviceSize") long r18, @org.lwjgl.system.NativeType("uint32_t") int r20, @org.lwjgl.system.NativeType("uint32_t") int r21) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawIndirectByteCountEXT
            r22 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r22
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkCmdBindTransformFeedbackBuffersEXT(org.lwjgl.vulkan.VkCommandBuffer r10, @org.lwjgl.system.NativeType("uint32_t") int r11, @org.lwjgl.system.NativeType("VkBuffer const *") long[] r12, @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBindTransformFeedbackBuffersEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = r12
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r12
            int r1 = r1.length
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L22:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            int r2 = r2.length
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdBeginTransformFeedbackEXT(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBuffer const *") long[] r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdBeginTransformFeedbackEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r11
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1d:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            int r2 = org.lwjgl.system.Checks.lengthSafe(r2)
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdEndTransformFeedbackEXT(org.lwjgl.vulkan.VkCommandBuffer r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBuffer const *") long[] r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") long[] r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdEndTransformFeedbackEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r11
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1d:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            int r2 = org.lwjgl.system.Checks.lengthSafe(r2)
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }
}
