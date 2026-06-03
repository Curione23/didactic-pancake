package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRTimelineSemaphore.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRTimelineSemaphore.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRTimelineSemaphore.class */
public class KHRTimelineSemaphore {
    public static final int VK_KHR_TIMELINE_SEMAPHORE_SPEC_VERSION = 2;
    public static final java.lang.String VK_KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME = "VK_KHR_timeline_semaphore";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR = 1000207000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR = 1000207001;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR = 1000207002;
    public static final int VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR = 1000207003;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR = 1000207004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO_KHR = 1000207005;
    public static final int VK_SEMAPHORE_TYPE_BINARY_KHR = 0;
    public static final int VK_SEMAPHORE_TYPE_TIMELINE_KHR = 1;
    public static final int VK_SEMAPHORE_WAIT_ANY_BIT_KHR = 1;

    protected KHRTimelineSemaphore() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetSemaphoreCounterValueKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSemaphoreCounterValueKHR
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
    public static int vkGetSemaphoreCounterValueKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSemaphore") long r7, @org.lwjgl.system.NativeType("uint64_t *") java.nio.LongBuffer r9) {
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
            int r0 = nvkGetSemaphoreCounterValueKHR(r0, r1, r2)
            return r0
    }

    public static int nvkWaitSemaphoresKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkWaitSemaphoresKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkSemaphoreWaitInfo.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            int r0 = org.lwjgl.system.JNI.callPPJI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkWaitSemaphoresKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkSemaphoreWaitInfo const *") org.lwjgl.vulkan.VkSemaphoreWaitInfo r7, @org.lwjgl.system.NativeType("uint64_t") long r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            int r0 = nvkWaitSemaphoresKHR(r0, r1, r2)
            return r0
    }

    public static int nvkSignalSemaphoreKHR(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSignalSemaphoreKHR
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
    public static int vkSignalSemaphoreKHR(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkSemaphoreSignalInfo const *") org.lwjgl.vulkan.VkSemaphoreSignalInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkSignalSemaphoreKHR(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetSemaphoreCounterValueKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkSemaphore") long r9, @org.lwjgl.system.NativeType("uint64_t *") long[] r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetSemaphoreCounterValueKHR
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
            int r0 = org.lwjgl.system.JNI.callPJPI(r0, r1, r2, r3)
            return r0
    }
}
