package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRExternalMemoryWin32.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRExternalMemoryWin32.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRExternalMemoryWin32.class */
public class KHRExternalMemoryWin32 {
    public static final int VK_KHR_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_KHR_external_memory_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR = 1000073002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR = 1000073003;

    protected KHRExternalMemoryWin32() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetMemoryWin32HandleKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetMemoryWin32HandleKHR
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
    public static int vkGetMemoryWin32HandleKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkMemoryGetWin32HandleInfoKHR const *") org.lwjgl.vulkan.VkMemoryGetWin32HandleInfoKHR r7, @org.lwjgl.system.NativeType("HANDLE *") org.lwjgl.PointerBuffer r8) {
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
            int r0 = nvkGetMemoryWin32HandleKHR(r0, r1, r2)
            return r0
    }

    public static int nvkGetMemoryWin32HandlePropertiesKHR(org.lwjgl.vulkan.VkDevice r10, int r11, long r12, long r14) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetMemoryWin32HandlePropertiesKHR
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1a:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetMemoryWin32HandlePropertiesKHR(org.lwjgl.vulkan.VkDevice r7, @org.lwjgl.system.NativeType("VkExternalMemoryHandleTypeFlagBits") int r8, @org.lwjgl.system.NativeType("HANDLE") long r9, @org.lwjgl.system.NativeType("VkMemoryWin32HandlePropertiesKHR *") org.lwjgl.vulkan.VkMemoryWin32HandlePropertiesKHR r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            long r3 = r3.address()
            int r0 = nvkGetMemoryWin32HandlePropertiesKHR(r0, r1, r2, r3)
            return r0
    }
}
