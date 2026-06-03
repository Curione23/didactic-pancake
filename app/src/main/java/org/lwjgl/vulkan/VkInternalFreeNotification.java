package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInternalFreeNotification.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInternalFreeNotification.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInternalFreeNotification.class */
public abstract class VkInternalFreeNotification extends org.lwjgl.system.Callback implements org.lwjgl.vulkan.VkInternalFreeNotificationI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInternalFreeNotification$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInternalFreeNotification$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInternalFreeNotification$Container.class */
    private static final class Container extends org.lwjgl.vulkan.VkInternalFreeNotification {
        private final org.lwjgl.vulkan.VkInternalFreeNotificationI delegate;

        Container(long r5, org.lwjgl.vulkan.VkInternalFreeNotificationI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.vulkan.VkInternalFreeNotificationI
        public void invoke(long r9, long r11, int r13, int r14) {
                r8 = this;
                r0 = r8
                org.lwjgl.vulkan.VkInternalFreeNotificationI r0 = r0.delegate
                r1 = r9
                r2 = r11
                r3 = r13
                r4 = r14
                r0.invoke(r1, r2, r3, r4)
                return
        }
    }

    public static org.lwjgl.vulkan.VkInternalFreeNotification create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.vulkan.VkInternalFreeNotificationI r0 = (org.lwjgl.vulkan.VkInternalFreeNotificationI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.vulkan.VkInternalFreeNotification
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.vulkan.VkInternalFreeNotification r0 = (org.lwjgl.vulkan.VkInternalFreeNotification) r0
            goto L1f
        L16:
            org.lwjgl.vulkan.VkInternalFreeNotification$Container r0 = new org.lwjgl.vulkan.VkInternalFreeNotification$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkInternalFreeNotification createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.vulkan.VkInternalFreeNotification r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.vulkan.VkInternalFreeNotification create(org.lwjgl.vulkan.VkInternalFreeNotificationI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.vulkan.VkInternalFreeNotification
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.vulkan.VkInternalFreeNotification r0 = (org.lwjgl.vulkan.VkInternalFreeNotification) r0
            goto L1c
        Le:
            org.lwjgl.vulkan.VkInternalFreeNotification$Container r0 = new org.lwjgl.vulkan.VkInternalFreeNotification$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected VkInternalFreeNotification() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.vulkan.VkInternalFreeNotification.CIF
            r0.<init>(r1)
            return
    }

    VkInternalFreeNotification(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
