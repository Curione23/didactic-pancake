package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTPageableDeviceLocalMemory.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTPageableDeviceLocalMemory.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTPageableDeviceLocalMemory.class */
public class EXTPageableDeviceLocalMemory {
    public static final int VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_EXTENSION_NAME = "VK_EXT_pageable_device_local_memory";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT = 1000412000;

    protected EXTPageableDeviceLocalMemory() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkSetDeviceMemoryPriorityEXT(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDeviceMemory") long r9, float r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkSetDeviceMemoryPriorityEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            org.lwjgl.system.JNI.callPJV(r0, r1, r2, r3)
            return
    }
}
