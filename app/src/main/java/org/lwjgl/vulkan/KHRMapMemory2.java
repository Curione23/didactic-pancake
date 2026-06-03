package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMapMemory2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMapMemory2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMapMemory2.class */
public class KHRMapMemory2 {
    public static final int VK_KHR_MAP_MEMORY_2_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_MAP_MEMORY_2_EXTENSION_NAME = "VK_KHR_map_memory2";
    public static final int VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR = 1000271000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR = 1000271001;

    protected KHRMapMemory2() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkMapMemory2KHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkMapMemory2KHR
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
    public static int vkMapMemory2KHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkMemoryMapInfoKHR const *") org.lwjgl.vulkan.VkMemoryMapInfoKHR r7, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvkMapMemory2KHR(r0, r1, r2)
            return r0
    }

    public static int nvkUnmapMemory2KHR(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkUnmapMemory2KHR
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
    public static int vkUnmapMemory2KHR(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkMemoryUnmapInfoKHR const *") org.lwjgl.vulkan.VkMemoryUnmapInfoKHR r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkUnmapMemory2KHR(r0, r1)
            return r0
    }
}
