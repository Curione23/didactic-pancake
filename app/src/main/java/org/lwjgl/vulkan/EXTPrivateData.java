package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTPrivateData.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTPrivateData.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTPrivateData.class */
public class EXTPrivateData {
    public static final int VK_EXT_PRIVATE_DATA_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_PRIVATE_DATA_EXTENSION_NAME = "VK_EXT_private_data";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT = 1000295000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT = 1000295001;
    public static final int VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT = 1000295002;
    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT_EXT = 1000295000;

    protected EXTPrivateData() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreatePrivateDataSlotEXT(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreatePrivateDataSlotEXT
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
    public static int vkCreatePrivateDataSlotEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkPrivateDataSlotCreateInfo const *") org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkPrivateDataSlot *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreatePrivateDataSlotEXT(r0, r1, r2, r3)
            return r0
    }

    public static void nvkDestroyPrivateDataSlotEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDestroyPrivateDataSlotEXT
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

    public static void vkDestroyPrivateDataSlotEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPrivateDataSlot") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvkDestroyPrivateDataSlotEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkSetPrivateDataEXT(org.lwjgl.vulkan.VkDevice r12, @org.lwjgl.system.NativeType("VkObjectType") int r13, @org.lwjgl.system.NativeType("uint64_t") long r14, @org.lwjgl.system.NativeType("VkPrivateDataSlot") long r16, @org.lwjgl.system.NativeType("uint64_t") long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSetPrivateDataEXT
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
            int r0 = org.lwjgl.system.JNI.callPJJJI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void nvkGetPrivateDataEXT(org.lwjgl.vulkan.VkDevice r12, int r13, long r14, long r16, long r18) {
            r0 = r12
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPrivateDataEXT
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
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkGetPrivateDataEXT(org.lwjgl.vulkan.VkDevice r9, @org.lwjgl.system.NativeType("VkObjectType") int r10, @org.lwjgl.system.NativeType("uint64_t") long r11, @org.lwjgl.system.NativeType("VkPrivateDataSlot") long r13, @org.lwjgl.system.NativeType("uint64_t *") java.nio.LongBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nvkGetPrivateDataEXT(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreatePrivateDataSlotEXT(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkPrivateDataSlotCreateInfo const *") org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkPrivateDataSlot *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCreatePrivateDataSlotEXT
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

    public static void vkGetPrivateDataEXT(org.lwjgl.vulkan.VkDevice r11, @org.lwjgl.system.NativeType("VkObjectType") int r12, @org.lwjgl.system.NativeType("uint64_t") long r13, @org.lwjgl.system.NativeType("VkPrivateDataSlot") long r15, @org.lwjgl.system.NativeType("uint64_t *") long[] r17) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPrivateDataEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            org.lwjgl.system.JNI.callPJJPV(r0, r1, r2, r3, r4, r5)
            return
    }
}
