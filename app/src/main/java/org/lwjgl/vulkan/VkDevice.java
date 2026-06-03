package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDevice.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDevice.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDevice.class */
public class VkDevice extends org.lwjgl.vulkan.DispatchableHandleDevice {
    private final org.lwjgl.vulkan.VkPhysicalDevice physicalDevice;

    public VkDevice(long r8, org.lwjgl.vulkan.VkPhysicalDevice r10, org.lwjgl.vulkan.VkDeviceCreateInfo r11) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public VkDevice(long r10, org.lwjgl.vulkan.VkPhysicalDevice r12, org.lwjgl.vulkan.VkDeviceCreateInfo r13, int r14) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            org.lwjgl.vulkan.VKCapabilitiesDevice r2 = getDeviceCapabilities(r2, r3, r4, r5)
            r0.<init>(r1, r2)
            r0 = r9
            r1 = r12
            r0.physicalDevice = r1
            return
    }

    public org.lwjgl.vulkan.VkPhysicalDevice getPhysicalDevice() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDevice r0 = r0.physicalDevice
            return r0
    }

    private static org.lwjgl.vulkan.VKCapabilitiesDevice getDeviceCapabilities(long r8, org.lwjgl.vulkan.VkPhysicalDevice r10, org.lwjgl.vulkan.VkDeviceCreateInfo r11, int r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = r12
            if (r0 != 0) goto L32
            r0 = r15
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.calloc(r0)     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L6c
            r17 = r0
            r0 = r10
            r1 = r17
            org.lwjgl.vulkan.VK10.vkGetPhysicalDeviceProperties(r0, r1)     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L6c
            r0 = r17
            int r0 = r0.apiVersion()     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L6c
            r1 = r10
            org.lwjgl.vulkan.VkInstance r1 = r1.getInstance()     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L6c
            org.lwjgl.vulkan.VKCapabilitiesInstance r1 = r1.getCapabilities()     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L6c
            int r1 = r1.apiVersion     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L6c
            int r0 = java.lang.Math.min(r0, r1)     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L6c
            r1 = -4096(0xfffffffffffff000, float:NaN)
            r0 = r0 & r1
            r12 = r0
        L32:
            r0 = r10
            org.lwjgl.vulkan.VkInstance r0 = r0.getInstance()     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L6c
            java.lang.String r1 = "vkGetDeviceProcAddr"
            long r0 = org.lwjgl.vulkan.VK10.vkGetInstanceProcAddr(r0, r1)     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L6c
            r13 = r0
            r0 = r15
            if (r0 == 0) goto L94
            r0 = r16
            if (r0 == 0) goto L5b
            r0 = r15
            r0.close()     // Catch: java.lang.Throwable -> L4f
            goto L94
        L4f:
            r17 = move-exception
            r0 = r16
            r1 = r17
            r0.addSuppressed(r1)
            goto L94
        L5b:
            r0 = r15
            r0.close()
            goto L94
        L63:
            r17 = move-exception
            r0 = r17
            r16 = r0
            r0 = r17
            throw r0     // Catch: java.lang.Throwable -> L6c
        L6c:
            r18 = move-exception
            r0 = r15
            if (r0 == 0) goto L91
            r0 = r16
            if (r0 == 0) goto L8c
            r0 = r15
            r0.close()     // Catch: java.lang.Throwable -> L80
            goto L91
        L80:
            r19 = move-exception
            r0 = r16
            r1 = r19
            r0.addSuppressed(r1)
            goto L91
        L8c:
            r0 = r15
            r0.close()
        L91:
            r0 = r18
            throw r0
        L94:
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = new org.lwjgl.vulkan.VKCapabilitiesDevice
            r1 = r0
            r2 = r8
            r3 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r2 = (v2) -> { // org.lwjgl.system.FunctionProvider.getFunctionAddress(java.nio.ByteBuffer):long
                return lambda$getDeviceCapabilities$0(r2, r3, v2);
            }
            r3 = r10
            org.lwjgl.vulkan.VKCapabilitiesInstance r3 = r3.getCapabilities()
            r4 = r12
            r5 = r12
            r6 = r11
            org.lwjgl.PointerBuffer r6 = r6.ppEnabledExtensionNames()
            java.util.Set r5 = org.lwjgl.vulkan.VK.getEnabledExtensionSet(r5, r6)
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    @Override // org.lwjgl.vulkan.DispatchableHandleDevice
    public org.lwjgl.vulkan.VKCapabilitiesInstance getCapabilitiesInstance() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDevice r0 = r0.getPhysicalDevice()
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            return r0
    }

    @Override // org.lwjgl.vulkan.DispatchableHandleDevice
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VKCapabilitiesDevice getCapabilities() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = super.getCapabilities()
            return r0
    }

    private static /* synthetic */ long lambda$getDeviceCapabilities$0(long r7, long r9, java.nio.ByteBuffer r11) {
            r0 = r7
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2)
            r12 = r0
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            boolean r0 = org.lwjgl.system.Checks.DEBUG_FUNCTIONS
            if (r0 == 0) goto L20
            java.lang.String r0 = "VK device"
            r1 = r11
            org.lwjgl.system.APIUtil.apiLogMissing(r0, r1)
        L20:
            r0 = r12
            return r0
    }
}
