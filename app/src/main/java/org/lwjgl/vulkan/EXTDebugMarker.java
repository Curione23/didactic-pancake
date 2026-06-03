package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDebugMarker.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDebugMarker.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDebugMarker.class */
public class EXTDebugMarker {
    public static final int VK_EXT_DEBUG_MARKER_SPEC_VERSION = 4;
    public static final java.lang.String VK_EXT_DEBUG_MARKER_EXTENSION_NAME = "VK_EXT_debug_marker";
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT = 1000022000;
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT = 1000022001;
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT = 1000022002;

    protected EXTDebugMarker() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkDebugMarkerSetObjectTagEXT(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDebugMarkerSetObjectTagEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDebugMarkerObjectTagInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkDebugMarkerSetObjectTagEXT(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkDebugMarkerObjectTagInfoEXT const *") org.lwjgl.vulkan.VkDebugMarkerObjectTagInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkDebugMarkerSetObjectTagEXT(r0, r1)
            return r0
    }

    public static int nvkDebugMarkerSetObjectNameEXT(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkDebugMarkerSetObjectNameEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDebugMarkerObjectNameInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkDebugMarkerSetObjectNameEXT(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkDebugMarkerObjectNameInfoEXT const *") org.lwjgl.vulkan.VkDebugMarkerObjectNameInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            int r0 = nvkDebugMarkerSetObjectNameEXT(r0, r1)
            return r0
    }

    public static void nvkCmdDebugMarkerBeginEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDebugMarkerBeginEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdDebugMarkerBeginEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkDebugMarkerMarkerInfoEXT const *") org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdDebugMarkerBeginEXT(r0, r1)
            return
    }

    public static void vkCmdDebugMarkerEndEXT(org.lwjgl.vulkan.VkCommandBuffer r5) {
            r0 = r5
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDebugMarkerEndEXT
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

    public static void nvkCmdDebugMarkerInsertEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDebugMarkerInsertEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdDebugMarkerInsertEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkDebugMarkerMarkerInfoEXT const *") org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdDebugMarkerInsertEXT(r0, r1)
            return
    }
}
