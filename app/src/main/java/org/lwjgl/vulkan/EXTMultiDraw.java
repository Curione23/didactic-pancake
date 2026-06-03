package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTMultiDraw.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTMultiDraw.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTMultiDraw.class */
public class EXTMultiDraw {
    public static final int VK_EXT_MULTI_DRAW_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_MULTI_DRAW_EXTENSION_NAME = "VK_EXT_multi_draw";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT = 1000392000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_PROPERTIES_EXT = 1000392001;

    protected EXTMultiDraw() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdDrawMultiEXT(org.lwjgl.vulkan.VkCommandBuffer r11, int r12, long r13, int r15, int r16, int r17) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawMultiEXT
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
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdDrawMultiEXT(org.lwjgl.vulkan.VkCommandBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMultiDrawInfoEXT const *") org.lwjgl.vulkan.VkMultiDrawInfoEXT.Buffer r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("uint32_t") int r11, @org.lwjgl.system.NativeType("uint32_t") int r12) {
            r0 = r8
            r1 = r9
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r10
            r4 = r11
            r5 = r12
            nvkCmdDrawMultiEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvkCmdDrawMultiIndexedEXT(org.lwjgl.vulkan.VkCommandBuffer r13, int r14, long r15, int r17, int r18, int r19, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawMultiIndexedEXT
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
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r22
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void vkCmdDrawMultiIndexedEXT(org.lwjgl.vulkan.VkCommandBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMultiDrawIndexedInfoEXT const *") org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer r11, @org.lwjgl.system.NativeType("uint32_t") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("uint32_t") int r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int32_t const *") java.nio.IntBuffer r15) {
            r0 = r10
            r1 = r11
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            nvkCmdDrawMultiIndexedEXT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void vkCmdDrawMultiIndexedEXT(org.lwjgl.vulkan.VkCommandBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMultiDrawIndexedInfoEXT const *") org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer r13, @org.lwjgl.system.NativeType("uint32_t") int r14, @org.lwjgl.system.NativeType("uint32_t") int r15, @org.lwjgl.system.NativeType("uint32_t") int r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int32_t const *") int[] r17) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawMultiIndexedEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r12
            long r0 = r0.address()
            r1 = r13
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
