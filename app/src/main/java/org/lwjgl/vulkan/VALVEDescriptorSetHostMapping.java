package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VALVEDescriptorSetHostMapping.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VALVEDescriptorSetHostMapping.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VALVEDescriptorSetHostMapping.class */
public class VALVEDescriptorSetHostMapping {
    public static final int VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_SPEC_VERSION = 1;
    public static final java.lang.String VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_EXTENSION_NAME = "VK_VALVE_descriptor_set_host_mapping";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE = 1000420000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE = 1000420001;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE = 1000420002;

    protected VALVEDescriptorSetHostMapping() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetDescriptorSetLayoutHostMappingInfoVALVE(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDescriptorSetLayoutHostMappingInfoVALVE
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDescriptorSetLayoutHostMappingInfoVALVE(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDescriptorSetBindingReferenceVALVE const *") org.lwjgl.vulkan.VkDescriptorSetBindingReferenceVALVE r7, @org.lwjgl.system.NativeType("VkDescriptorSetLayoutHostMappingInfoVALVE *") org.lwjgl.vulkan.VkDescriptorSetLayoutHostMappingInfoVALVE r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetDescriptorSetLayoutHostMappingInfoVALVE(r0, r1, r2)
            return
    }

    public static void nvkGetDescriptorSetHostMappingVALVE(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDescriptorSetHostMappingVALVE
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
            org.lwjgl.system.JNI.callPJPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDescriptorSetHostMappingVALVE(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDescriptorSet") long r7, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvkGetDescriptorSetHostMappingVALVE(r0, r1, r2)
            return
    }
}
