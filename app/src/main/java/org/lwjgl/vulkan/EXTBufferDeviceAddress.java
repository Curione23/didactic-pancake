package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTBufferDeviceAddress.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTBufferDeviceAddress.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTBufferDeviceAddress.class */
public class EXTBufferDeviceAddress {
    public static final int VK_EXT_BUFFER_DEVICE_ADDRESS_SPEC_VERSION = 2;
    public static final java.lang.String VK_EXT_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_EXT_buffer_device_address";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT = 1000244000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES_EXT = 1000244000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_EXT = 1000244001;
    public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT = 1000244002;
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT = 131072;
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT = 16;
    public static final int VK_ERROR_INVALID_DEVICE_ADDRESS_EXT = -1000257000;

    protected EXTBufferDeviceAddress() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nvkGetBufferDeviceAddressEXT(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetBufferDeviceAddressEXT
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
            long r0 = org.lwjgl.system.JNI.callPPJ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public static long vkGetBufferDeviceAddressEXT(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkBufferDeviceAddressInfo const *") org.lwjgl.vulkan.VkBufferDeviceAddressInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            long r0 = nvkGetBufferDeviceAddressEXT(r0, r1)
            return r0
    }
}
