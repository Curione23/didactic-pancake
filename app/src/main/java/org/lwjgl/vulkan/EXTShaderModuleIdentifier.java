package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTShaderModuleIdentifier.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTShaderModuleIdentifier.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTShaderModuleIdentifier.class */
public class EXTShaderModuleIdentifier {
    public static final int VK_EXT_SHADER_MODULE_IDENTIFIER_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_SHADER_MODULE_IDENTIFIER_EXTENSION_NAME = "VK_EXT_shader_module_identifier";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT = 1000462000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT = 1000462001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT = 1000462002;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT = 1000462003;
    public static final int VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT = 32;

    protected EXTShaderModuleIdentifier() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetShaderModuleIdentifierEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetShaderModuleIdentifierEXT
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

    public static void vkGetShaderModuleIdentifierEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkShaderModule") long r7, @org.lwjgl.system.NativeType("VkShaderModuleIdentifierEXT *") org.lwjgl.vulkan.VkShaderModuleIdentifierEXT r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = r2.address()
            nvkGetShaderModuleIdentifierEXT(r0, r1, r2)
            return
    }

    public static void nvkGetShaderModuleCreateInfoIdentifierEXT(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetShaderModuleCreateInfoIdentifierEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkShaderModuleCreateInfo.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetShaderModuleCreateInfoIdentifierEXT(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkShaderModuleCreateInfo const *") org.lwjgl.vulkan.VkShaderModuleCreateInfo r7, @org.lwjgl.system.NativeType("VkShaderModuleIdentifierEXT *") org.lwjgl.vulkan.VkShaderModuleIdentifierEXT r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetShaderModuleCreateInfoIdentifierEXT(r0, r1, r2)
            return
    }
}
