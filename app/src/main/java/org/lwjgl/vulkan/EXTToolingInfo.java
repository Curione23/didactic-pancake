package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTToolingInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTToolingInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTToolingInfo.class */
public class EXTToolingInfo {
    public static final int VK_EXT_TOOLING_INFO_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_TOOLING_INFO_EXTENSION_NAME = "VK_EXT_tooling_info";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT = 1000245000;
    public static final int VK_TOOL_PURPOSE_VALIDATION_BIT_EXT = 1;
    public static final int VK_TOOL_PURPOSE_PROFILING_BIT_EXT = 2;
    public static final int VK_TOOL_PURPOSE_TRACING_BIT_EXT = 4;
    public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT = 8;
    public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT = 16;
    public static final int VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT = 32;
    public static final int VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT = 64;

    protected EXTToolingInfo() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPhysicalDeviceToolPropertiesEXT(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceToolPropertiesEXT
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
    public static int vkGetPhysicalDeviceToolPropertiesEXT(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPhysicalDeviceToolProperties *") org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.Buffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = r7
            r2 = r7
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nvkGetPhysicalDeviceToolPropertiesEXT(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolPropertiesEXT(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPhysicalDeviceToolProperties *") org.lwjgl.vulkan.VkPhysicalDeviceToolProperties.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceToolPropertiesEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1f:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }
}
