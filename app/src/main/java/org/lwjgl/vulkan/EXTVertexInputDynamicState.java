package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTVertexInputDynamicState.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTVertexInputDynamicState.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTVertexInputDynamicState.class */
public class EXTVertexInputDynamicState {
    public static final int VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_SPEC_VERSION = 2;
    public static final java.lang.String VK_EXT_VERTEX_INPUT_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_vertex_input_dynamic_state";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_INPUT_DYNAMIC_STATE_FEATURES_EXT = 1000352000;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT = 1000352001;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT = 1000352002;
    public static final int VK_DYNAMIC_STATE_VERTEX_INPUT_EXT = 1000352000;

    protected EXTVertexInputDynamicState() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkCmdSetVertexInputEXT(org.lwjgl.vulkan.VkCommandBuffer r11, int r12, long r13, int r15, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetVertexInputEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r18
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void vkCmdSetVertexInputEXT(org.lwjgl.vulkan.VkCommandBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVertexInputBindingDescription2EXT const *") org.lwjgl.vulkan.VkVertexInputBindingDescription2EXT.Buffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVertexInputAttributeDescription2EXT const *") org.lwjgl.vulkan.VkVertexInputAttributeDescription2EXT.Buffer r10) {
            r0 = r8
            r1 = r9
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r10
            int r3 = org.lwjgl.system.Checks.remainingSafe(r3)
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nvkCmdSetVertexInputEXT(r0, r1, r2, r3, r4)
            return
    }
}
