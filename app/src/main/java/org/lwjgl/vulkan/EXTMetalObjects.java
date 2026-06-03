package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTMetalObjects.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTMetalObjects.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTMetalObjects.class */
public class EXTMetalObjects {
    public static final int VK_EXT_METAL_OBJECTS_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_METAL_OBJECTS_EXTENSION_NAME = "VK_EXT_metal_objects";
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT = 1000311000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT = 1000311001;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT = 1000311002;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT = 1000311003;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT = 1000311004;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT = 1000311005;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT = 1000311006;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT = 1000311007;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT = 1000311008;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT = 1000311009;
    public static final int VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT = 1000311010;
    public static final int VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT = 1000311011;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT = 1;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT = 2;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT = 4;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT = 8;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT = 16;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT = 32;

    protected EXTMetalObjects() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkExportMetalObjectsEXT(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkExportMetalObjectsEXT
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkExportMetalObjectsEXT(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkExportMetalObjectsInfoEXT *") org.lwjgl.vulkan.VkExportMetalObjectsInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkExportMetalObjectsEXT(r0, r1)
            return
    }
}
