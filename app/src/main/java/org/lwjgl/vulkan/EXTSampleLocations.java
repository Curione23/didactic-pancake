package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTSampleLocations.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTSampleLocations.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTSampleLocations.class */
public class EXTSampleLocations {
    public static final int VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME = "VK_EXT_sample_locations";
    public static final int VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT = 4096;
    public static final int VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT = 1000143000;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT = 1000143001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT = 1000143002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT = 1000143003;
    public static final int VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT = 1000143004;
    public static final int VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT = 1000143000;

    protected EXTSampleLocations() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdSetSampleLocationsEXT(org.lwjgl.vulkan.VkCommandBuffer r7, long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetSampleLocationsEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.vulkan.VkSampleLocationsInfoEXT.validate(r0)
        L17:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void vkCmdSetSampleLocationsEXT(org.lwjgl.vulkan.VkCommandBuffer r4, @org.lwjgl.system.NativeType("VkSampleLocationsInfoEXT const *") org.lwjgl.vulkan.VkSampleLocationsInfoEXT r5) {
            r0 = r4
            r1 = r5
            long r1 = r1.address()
            nvkCmdSetSampleLocationsEXT(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceMultisamplePropertiesEXT(org.lwjgl.vulkan.VkPhysicalDevice r8, int r9, long r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceMultisamplePropertiesEXT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            r3 = r12
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetPhysicalDeviceMultisamplePropertiesEXT(org.lwjgl.vulkan.VkPhysicalDevice r5, @org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r6, @org.lwjgl.system.NativeType("VkMultisamplePropertiesEXT *") org.lwjgl.vulkan.VkMultisamplePropertiesEXT r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = r2.address()
            nvkGetPhysicalDeviceMultisamplePropertiesEXT(r0, r1, r2)
            return
    }
}
