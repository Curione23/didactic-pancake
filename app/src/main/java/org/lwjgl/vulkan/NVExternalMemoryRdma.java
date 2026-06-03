package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVExternalMemoryRdma.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVExternalMemoryRdma.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/NVExternalMemoryRdma.class */
public class NVExternalMemoryRdma {
    public static final int VK_NV_EXTERNAL_MEMORY_RDMA_SPEC_VERSION = 1;
    public static final java.lang.String VK_NV_EXTERNAL_MEMORY_RDMA_EXTENSION_NAME = "VK_NV_external_memory_rdma";
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV = 1000371000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV = 1000371001;
    public static final int VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV = 256;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV = 4096;

    protected NVExternalMemoryRdma() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetMemoryRemoteAddressNV(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetMemoryRemoteAddressNV
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
    public static int vkGetMemoryRemoteAddressNV(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkMemoryGetRemoteAddressInfoNV const *") org.lwjgl.vulkan.VkMemoryGetRemoteAddressInfoNV r7, @org.lwjgl.system.NativeType("VkRemoteAddressNV *") org.lwjgl.PointerBuffer r8) {
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
            int r0 = nvkGetMemoryRemoteAddressNV(r0, r1, r2)
            return r0
    }
}
