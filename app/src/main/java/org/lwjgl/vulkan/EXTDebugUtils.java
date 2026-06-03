package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDebugUtils.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDebugUtils.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDebugUtils.class */
public class EXTDebugUtils {
    public static final int VK_EXT_DEBUG_UTILS_SPEC_VERSION = 2;
    public static final java.lang.String VK_EXT_DEBUG_UTILS_EXTENSION_NAME = "VK_EXT_debug_utils";
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT = 1000128000;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT = 1000128001;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT = 1000128002;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT = 1000128003;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT = 1000128004;
    public static final int VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT = 1000128000;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 1;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT = 16;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 256;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT = 4096;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT = 1;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT = 2;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT = 4;

    protected EXTDebugUtils() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkSetDebugUtilsObjectNameEXT(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilitiesInstance()
            long r0 = r0.vkSetDebugUtilsObjectNameEXT
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
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkSetDebugUtilsObjectNameEXT(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkDebugUtilsObjectNameInfoEXT const *") org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkSetDebugUtilsObjectNameEXT(r0, r1)
            return r0
    }

    public static int nvkSetDebugUtilsObjectTagEXT(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilitiesInstance()
            long r0 = r0.vkSetDebugUtilsObjectTagEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDebugUtilsObjectTagInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkSetDebugUtilsObjectTagEXT(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkDebugUtilsObjectTagInfoEXT const *") org.lwjgl.vulkan.VkDebugUtilsObjectTagInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkSetDebugUtilsObjectTagEXT(r0, r1)
            return r0
    }

    public static void nvkQueueBeginDebugUtilsLabelEXT(org.lwjgl.vulkan.VkQueue r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilitiesInstance()
            long r0 = r0.vkQueueBeginDebugUtilsLabelEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDebugUtilsLabelEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkQueueBeginDebugUtilsLabelEXT(org.lwjgl.vulkan.VkQueue r4, @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *") org.lwjgl.vulkan.VkDebugUtilsLabelEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkQueueBeginDebugUtilsLabelEXT(r0, r1)
            return
    }

    public static void vkQueueEndDebugUtilsLabelEXT(org.lwjgl.vulkan.VkQueue r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilitiesInstance()
            long r0 = r0.vkQueueEndDebugUtilsLabelEXT
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void nvkQueueInsertDebugUtilsLabelEXT(org.lwjgl.vulkan.VkQueue r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilitiesInstance()
            long r0 = r0.vkQueueInsertDebugUtilsLabelEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDebugUtilsLabelEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkQueueInsertDebugUtilsLabelEXT(org.lwjgl.vulkan.VkQueue r4, @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *") org.lwjgl.vulkan.VkDebugUtilsLabelEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkQueueInsertDebugUtilsLabelEXT(r0, r1)
            return
    }

    public static void nvkCmdBeginDebugUtilsLabelEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilitiesInstance()
            long r0 = r0.vkCmdBeginDebugUtilsLabelEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDebugUtilsLabelEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdBeginDebugUtilsLabelEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *") org.lwjgl.vulkan.VkDebugUtilsLabelEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdBeginDebugUtilsLabelEXT(r0, r1)
            return
    }

    public static void vkCmdEndDebugUtilsLabelEXT(org.lwjgl.vulkan.VkCommandBuffer r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilitiesInstance()
            long r0 = r0.vkCmdEndDebugUtilsLabelEXT
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void nvkCmdInsertDebugUtilsLabelEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilitiesInstance()
            long r0 = r0.vkCmdInsertDebugUtilsLabelEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDebugUtilsLabelEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdInsertDebugUtilsLabelEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *") org.lwjgl.vulkan.VkDebugUtilsLabelEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdInsertDebugUtilsLabelEXT(r0, r1)
            return
    }

    public static int nvkCreateDebugUtilsMessengerEXT(org.lwjgl.vulkan.VkInstance r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDebugUtilsMessengerEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkDebugUtilsMessengerCreateInfoEXT.validate(r0)
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
    public static int vkCreateDebugUtilsMessengerEXT(org.lwjgl.vulkan.VkInstance r8, @org.lwjgl.system.NativeType("VkDebugUtilsMessengerCreateInfoEXT const *") org.lwjgl.vulkan.VkDebugUtilsMessengerCreateInfoEXT r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkDebugUtilsMessengerEXT *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateDebugUtilsMessengerEXT(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyDebugUtilsMessengerEXT(org.lwjgl.vulkan.VkInstance r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyDebugUtilsMessengerEXT
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

    public static void vkDestroyDebugUtilsMessengerEXT(org.lwjgl.vulkan.VkInstance r6, @org.lwjgl.system.NativeType("VkDebugUtilsMessengerEXT") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyDebugUtilsMessengerEXT(r0, r1, r2)
            return
    }

    public static void nvkSubmitDebugUtilsMessageEXT(org.lwjgl.vulkan.VkInstance r9, int r10, int r11, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkSubmitDebugUtilsMessageEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkSubmitDebugUtilsMessageEXT(org.lwjgl.vulkan.VkInstance r6, @org.lwjgl.system.NativeType("VkDebugUtilsMessageSeverityFlagBitsEXT") int r7, @org.lwjgl.system.NativeType("VkDebugUtilsMessageTypeFlagsEXT") int r8, @org.lwjgl.system.NativeType("VkDebugUtilsMessengerCallbackDataEXT const *") org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = r3.address()
            nvkSubmitDebugUtilsMessageEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateDebugUtilsMessengerEXT(org.lwjgl.vulkan.VkInstance r10, @org.lwjgl.system.NativeType("VkDebugUtilsMessengerCreateInfoEXT const *") org.lwjgl.vulkan.VkDebugUtilsMessengerCreateInfoEXT r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkDebugUtilsMessengerEXT *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDebugUtilsMessengerEXT
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
            org.lwjgl.vulkan.VkDebugUtilsMessengerCreateInfoEXT.validate(r0)
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
