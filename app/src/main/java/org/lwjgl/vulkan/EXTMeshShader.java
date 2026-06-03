package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTMeshShader.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTMeshShader.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTMeshShader.class */
public class EXTMeshShader {
    public static final int VK_EXT_MESH_SHADER_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_MESH_SHADER_EXTENSION_NAME = "VK_EXT_mesh_shader";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT = 1000328000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT = 1000328001;
    public static final int VK_SHADER_STAGE_TASK_BIT_EXT = 64;
    public static final int VK_SHADER_STAGE_MESH_BIT_EXT = 128;
    public static final int VK_PIPELINE_STAGE_TASK_SHADER_BIT_EXT = 524288;
    public static final int VK_PIPELINE_STAGE_MESH_SHADER_BIT_EXT = 1048576;
    public static final int VK_QUERY_TYPE_MESH_PRIMITIVES_GENERATED_EXT = 1000328000;
    public static final int VK_QUERY_PIPELINE_STATISTIC_TASK_SHADER_INVOCATIONS_BIT_EXT = 2048;
    public static final int VK_QUERY_PIPELINE_STATISTIC_MESH_SHADER_INVOCATIONS_BIT_EXT = 4096;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV = 1000328000;

    protected EXTMeshShader() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdDrawMeshTasksEXT(org.lwjgl.vulkan.VkCommandBuffer r8, @org.lwjgl.system.NativeType("uint32_t") int r9, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("uint32_t") int r11) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawMeshTasksEXT
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
            r3 = r11
            r4 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkCmdDrawMeshTasksIndirectEXT(org.lwjgl.vulkan.VkCommandBuffer r11, @org.lwjgl.system.NativeType("VkBuffer") long r12, @org.lwjgl.system.NativeType("VkDeviceSize") long r14, @org.lwjgl.system.NativeType("uint32_t") int r16, @org.lwjgl.system.NativeType("uint32_t") int r17) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawMeshTasksIndirectEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            org.lwjgl.system.JNI.callPJJV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdDrawMeshTasksIndirectCountEXT(org.lwjgl.vulkan.VkCommandBuffer r15, @org.lwjgl.system.NativeType("VkBuffer") long r16, @org.lwjgl.system.NativeType("VkDeviceSize") long r18, @org.lwjgl.system.NativeType("VkBuffer") long r20, @org.lwjgl.system.NativeType("VkDeviceSize") long r22, @org.lwjgl.system.NativeType("uint32_t") int r24, @org.lwjgl.system.NativeType("uint32_t") int r25) {
            r0 = r15
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdDrawMeshTasksIndirectCountEXT
            r26 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r26
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r15
            long r0 = r0.address()
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r22
            r5 = r24
            r6 = r25
            r7 = r26
            org.lwjgl.system.JNI.callPJJJJV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
