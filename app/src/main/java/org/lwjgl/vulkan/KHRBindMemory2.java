package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRBindMemory2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRBindMemory2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRBindMemory2.class */
public class KHRBindMemory2 {
    public static final int VK_KHR_BIND_MEMORY_2_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_BIND_MEMORY_2_EXTENSION_NAME = "VK_KHR_bind_memory2";
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR = 1000157000;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR = 1000157001;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT_KHR = 1024;

    protected KHRBindMemory2() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkBindBufferMemory2KHR(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBindBufferMemory2KHR
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkBindBufferMemory2KHR(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkBindBufferMemoryInfo const *") org.lwjgl.vulkan.VkBindBufferMemoryInfo.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkBindBufferMemory2KHR(r0, r1, r2)
            return r0
    }

    public static int nvkBindImageMemory2KHR(org.lwjgl.vulkan.VkDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkBindImageMemory2KHR
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkBindImageMemory2KHR(org.lwjgl.vulkan.VkDevice r5, @org.lwjgl.system.NativeType("VkBindImageMemoryInfo const *") org.lwjgl.vulkan.VkBindImageMemoryInfo.Buffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = r2.address()
            int r0 = nvkBindImageMemory2KHR(r0, r1, r2)
            return r0
    }
}
