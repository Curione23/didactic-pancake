package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTPipelineProperties.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTPipelineProperties.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTPipelineProperties.class */
public class EXTPipelineProperties {
    public static final int VK_EXT_PIPELINE_PROPERTIES_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_PIPELINE_PROPERTIES_EXTENSION_NAME = "VK_EXT_pipeline_properties";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT = 1000372000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT = 1000372001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INFO_EXT = 1000372001;

    protected EXTPipelineProperties() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPipelinePropertiesEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetPipelinePropertiesEXT
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
    public static int vkGetPipelinePropertiesEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkPipelineInfoEXT const *") org.lwjgl.vulkan.VkPipelineInfoEXT r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBaseOutStructure *") org.lwjgl.vulkan.VkBaseOutStructure r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nvkGetPipelinePropertiesEXT(r0, r1, r2)
            return r0
    }
}
