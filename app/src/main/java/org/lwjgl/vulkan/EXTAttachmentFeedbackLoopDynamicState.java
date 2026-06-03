package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTAttachmentFeedbackLoopDynamicState.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTAttachmentFeedbackLoopDynamicState.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/EXTAttachmentFeedbackLoopDynamicState.class */
public class EXTAttachmentFeedbackLoopDynamicState {
    public static final int VK_EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_SPEC_VERSION = 1;
    public static final java.lang.String VK_EXT_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_attachment_feedback_loop_dynamic_state";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT = 1000524000;
    public static final int VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT = 1000524000;

    protected EXTAttachmentFeedbackLoopDynamicState() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdSetAttachmentFeedbackLoopEnableEXT(org.lwjgl.vulkan.VkCommandBuffer r6, @org.lwjgl.system.NativeType("VkImageAspectFlags") int r7) {
            r0 = r6
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdSetAttachmentFeedbackLoopEnableEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }
}
