package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDrawIndirectCount.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDrawIndirectCount.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRDrawIndirectCount.class */
public class KHRDrawIndirectCount {
    public static final int VK_KHR_DRAW_INDIRECT_COUNT_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_DRAW_INDIRECT_COUNT_EXTENSION_NAME = "VK_KHR_draw_indirect_count";

    protected KHRDrawIndirectCount() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdDrawIndirectCountKHR(org.lwjgl.vulkan.VkCommandBuffer r15, @org.lwjgl.system.NativeType("VkBuffer") long r16, @org.lwjgl.system.NativeType("VkDeviceSize") long r18, @org.lwjgl.system.NativeType("VkBuffer") long r20, @org.lwjgl.system.NativeType("VkDeviceSize") long r22, @org.lwjgl.system.NativeType("uint32_t") int r24, @org.lwjgl.system.NativeType("uint32_t") int r25) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawIndirectCountKHR
            r26 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r26
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r22
            r5 = r24
            r6 = r25
            r7 = r26
            org.lwjgl.system.JNI.callPJJJJV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkCmdDrawIndexedIndirectCountKHR(org.lwjgl.vulkan.VkCommandBuffer r15, @org.lwjgl.system.NativeType("VkBuffer") long r16, @org.lwjgl.system.NativeType("VkDeviceSize") long r18, @org.lwjgl.system.NativeType("VkBuffer") long r20, @org.lwjgl.system.NativeType("VkDeviceSize") long r22, @org.lwjgl.system.NativeType("uint32_t") int r24, @org.lwjgl.system.NativeType("uint32_t") int r25) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawIndexedIndirectCountKHR
            r26 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r26
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r22
            r5 = r24
            r6 = r25
            r7 = r26
            org.lwjgl.system.JNI.callPJJJJV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
