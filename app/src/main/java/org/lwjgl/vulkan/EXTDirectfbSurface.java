package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDirectfbSurface.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDirectfbSurface.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDirectfbSurface.class */
public class EXTDirectfbSurface {
    public static final int VK_EXT_DIRECTFB_SURFACE_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_DIRECTFB_SURFACE_EXTENSION_NAME = "VK_EXT_directfb_surface";
    public static final int VK_STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT = 1000346000;

    protected EXTDirectfbSurface() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkCreateDirectFBSurfaceEXT(org.lwjgl.vulkan.VkInstance r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDirectFBSurfaceEXT
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
    public static int vkCreateDirectFBSurfaceEXT(org.lwjgl.vulkan.VkInstance r8, @org.lwjgl.system.NativeType("VkDirectFBSurfaceCreateInfoEXT const *") org.lwjgl.vulkan.VkDirectFBSurfaceCreateInfoEXT r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r10, @org.lwjgl.system.NativeType("VkSurfaceKHR *") java.nio.LongBuffer r11) {
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
            int r0 = nvkCreateDirectFBSurfaceEXT(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public static boolean vkGetPhysicalDeviceDirectFBPresentationSupportEXT(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("IDirectFB *") long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceDirectFBPresentationSupportEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1a:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkCreateDirectFBSurfaceEXT(org.lwjgl.vulkan.VkInstance r10, @org.lwjgl.system.NativeType("VkDirectFBSurfaceCreateInfoEXT const *") org.lwjgl.vulkan.VkDirectFBSurfaceCreateInfoEXT r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r12, @org.lwjgl.system.NativeType("VkSurfaceKHR *") long[] r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkCreateDirectFBSurfaceEXT
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
}
