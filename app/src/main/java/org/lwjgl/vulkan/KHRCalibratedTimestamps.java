package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRCalibratedTimestamps.class */
public class KHRCalibratedTimestamps {
    public static final int VK_KHR_CALIBRATED_TIMESTAMPS_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_CALIBRATED_TIMESTAMPS_EXTENSION_NAME = "VK_KHR_calibrated_timestamps";
    public static final int VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR = 1000184000;

    protected KHRCalibratedTimestamps() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPhysicalDeviceCalibrateableTimeDomainsKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceCalibrateableTimeDomainsKHR
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
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsKHR(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("VkTimeDomainKHR *") java.nio.IntBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = r7
            r2 = r7
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nvkGetPhysicalDeviceCalibrateableTimeDomainsKHR(r0, r1, r2)
            return r0
    }

    public static int nvkGetCalibratedTimestampsKHR(org.lwjgl.vulkan.VkDevice r12, int r13, long r14, long r16, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetCalibratedTimestampsKHR
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
            r4 = r18
            r5 = r20
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetCalibratedTimestampsKHR(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkCalibratedTimestampInfoKHR const *") org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR.Buffer r10, @org.lwjgl.system.NativeType("uint64_t *") java.nio.LongBuffer r11, @org.lwjgl.system.NativeType("uint64_t *") java.nio.LongBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r11
            r1 = r10
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L13:
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = r10
            long r2 = r2.address()
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nvkGetCalibratedTimestampsKHR(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsKHR(org.lwjgl.vulkan.VkPhysicalDevice r7, @org.lwjgl.system.NativeType("uint32_t *") int[] r8, @org.lwjgl.system.NativeType("VkTimeDomainKHR *") int[] r9) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceCalibrateableTimeDomainsKHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = r8
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1f:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r9
            r3 = r10
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetCalibratedTimestampsKHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkCalibratedTimestampInfoKHR const *") org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR.Buffer r11, @org.lwjgl.system.NativeType("uint64_t *") long[] r12, @org.lwjgl.system.NativeType("uint64_t *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetCalibratedTimestampsKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r11
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L22:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            int r1 = r1.remaining()
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            r4 = r13
            r5 = r14
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }
}
