package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDeviceFault.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDeviceFault.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTDeviceFault.class */
public class EXTDeviceFault {
    public static final int VK_EXT_DEVICE_FAULT_SPEC_VERSION = 2;
    public static final java.lang.String VK_EXT_DEVICE_FAULT_EXTENSION_NAME = "VK_EXT_device_fault";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT = 1000341000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT = 1000341001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT = 1000341002;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_NONE_EXT = 0;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_READ_INVALID_EXT = 1;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_WRITE_INVALID_EXT = 2;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_EXECUTE_INVALID_EXT = 3;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_UNKNOWN_EXT = 4;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_INVALID_EXT = 5;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_FAULT_EXT = 6;
    public static final int VK_DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT = 1;

    protected EXTDeviceFault() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetDeviceFaultInfoEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceFaultInfoEXT
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
    public static int vkGetDeviceFaultInfoEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeviceFaultCountsEXT *") org.lwjgl.vulkan.VkDeviceFaultCountsEXT r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceFaultInfoEXT *") org.lwjgl.vulkan.VkDeviceFaultInfoEXT r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nvkGetDeviceFaultInfoEXT(r0, r1, r2)
            return r0
    }
}
