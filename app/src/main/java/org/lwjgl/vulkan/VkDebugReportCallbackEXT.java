package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXT.class */
public abstract class VkDebugReportCallbackEXT extends org.lwjgl.system.Callback implements org.lwjgl.vulkan.VkDebugReportCallbackEXTI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXT$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXT$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXT$Container.class */
    private static final class Container extends org.lwjgl.vulkan.VkDebugReportCallbackEXT {
        private final org.lwjgl.vulkan.VkDebugReportCallbackEXTI delegate;

        Container(long r5, org.lwjgl.vulkan.VkDebugReportCallbackEXTI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.vulkan.VkDebugReportCallbackEXTI
        public int invoke(int r16, int r17, long r18, long r20, int r22, long r23, long r25, long r27) {
                r15 = this;
                r0 = r15
                org.lwjgl.vulkan.VkDebugReportCallbackEXTI r0 = r0.delegate
                r1 = r16
                r2 = r17
                r3 = r18
                r4 = r20
                r5 = r22
                r6 = r23
                r7 = r25
                r8 = r27
                int r0 = r0.invoke(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }
    }

    public static org.lwjgl.vulkan.VkDebugReportCallbackEXT create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.vulkan.VkDebugReportCallbackEXTI r0 = (org.lwjgl.vulkan.VkDebugReportCallbackEXTI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.vulkan.VkDebugReportCallbackEXT
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.vulkan.VkDebugReportCallbackEXT r0 = (org.lwjgl.vulkan.VkDebugReportCallbackEXT) r0
            goto L1f
        L16:
            org.lwjgl.vulkan.VkDebugReportCallbackEXT$Container r0 = new org.lwjgl.vulkan.VkDebugReportCallbackEXT$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDebugReportCallbackEXT createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.vulkan.VkDebugReportCallbackEXT r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugReportCallbackEXT create(org.lwjgl.vulkan.VkDebugReportCallbackEXTI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.vulkan.VkDebugReportCallbackEXT
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.vulkan.VkDebugReportCallbackEXT r0 = (org.lwjgl.vulkan.VkDebugReportCallbackEXT) r0
            goto L1c
        Le:
            org.lwjgl.vulkan.VkDebugReportCallbackEXT$Container r0 = new org.lwjgl.vulkan.VkDebugReportCallbackEXT$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected VkDebugReportCallbackEXT() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.vulkan.VkDebugReportCallbackEXT.CIF
            r0.<init>(r1)
            return
    }

    VkDebugReportCallbackEXT(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }

    public static java.lang.String getString(long r3) {
            r0 = r3
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }
}
