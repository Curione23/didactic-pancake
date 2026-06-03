package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRBufferDeviceAddress.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRBufferDeviceAddress.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRBufferDeviceAddress.class */
public class KHRBufferDeviceAddress {
    public static final int VK_KHR_BUFFER_DEVICE_ADDRESS_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_KHR_buffer_device_address";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR = 1000257000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_KHR = 1000244001;
    public static final int VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR = 1000257002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR = 1000257003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR = 1000257004;
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR = 131072;
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 16;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR = 2;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 4;
    public static final int VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR = -1000257000;

    protected KHRBufferDeviceAddress() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nvkGetBufferDeviceAddressKHR(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetBufferDeviceAddressKHR
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
    public static long vkGetBufferDeviceAddressKHR(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkBufferDeviceAddressInfo const *") org.lwjgl.vulkan.VkBufferDeviceAddressInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            long r0 = nvkGetBufferDeviceAddressKHR(r0, r1)
            return r0
    }

    public static long nvkGetBufferOpaqueCaptureAddressKHR(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetBufferOpaqueCaptureAddressKHR
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

    @org.lwjgl.system.NativeType("uint64_t")
    public static long vkGetBufferOpaqueCaptureAddressKHR(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkBufferDeviceAddressInfo const *") org.lwjgl.vulkan.VkBufferDeviceAddressInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            long r0 = nvkGetBufferOpaqueCaptureAddressKHR(r0, r1)
            return r0
    }

    public static long nvkGetDeviceMemoryOpaqueCaptureAddressKHR(org.lwjgl.vulkan.VkDevice r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceMemoryOpaqueCaptureAddressKHR
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

    @org.lwjgl.system.NativeType("uint64_t")
    public static long vkGetDeviceMemoryOpaqueCaptureAddressKHR(org.lwjgl.vulkan.VkDevice r4, @org.lwjgl.system.NativeType("VkDeviceMemoryOpaqueCaptureAddressInfo const *") org.lwjgl.vulkan.VkDeviceMemoryOpaqueCaptureAddressInfo r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            long r0 = nvkGetDeviceMemoryOpaqueCaptureAddressKHR(r0, r1)
            return r0
    }
}
