package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageAMDCallback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageAMDCallback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageAMDCallback.class */
public abstract class GLDebugMessageAMDCallback extends org.lwjgl.system.Callback implements org.lwjgl.opengl.GLDebugMessageAMDCallbackI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageAMDCallback$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageAMDCallback$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageAMDCallback$Container.class */
    private static final class Container extends org.lwjgl.opengl.GLDebugMessageAMDCallback {
        private final org.lwjgl.opengl.GLDebugMessageAMDCallbackI delegate;

        Container(long r5, org.lwjgl.opengl.GLDebugMessageAMDCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.opengl.GLDebugMessageAMDCallbackI
        public void invoke(int r11, int r12, int r13, int r14, long r15, long r17) {
                r10 = this;
                r0 = r10
                org.lwjgl.opengl.GLDebugMessageAMDCallbackI r0 = r0.delegate
                r1 = r11
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r17
                r0.invoke(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    public static org.lwjgl.opengl.GLDebugMessageAMDCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.opengl.GLDebugMessageAMDCallbackI r0 = (org.lwjgl.opengl.GLDebugMessageAMDCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.opengl.GLDebugMessageAMDCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.opengl.GLDebugMessageAMDCallback r0 = (org.lwjgl.opengl.GLDebugMessageAMDCallback) r0
            goto L1f
        L16:
            org.lwjgl.opengl.GLDebugMessageAMDCallback$Container r0 = new org.lwjgl.opengl.GLDebugMessageAMDCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.opengl.GLDebugMessageAMDCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.opengl.GLDebugMessageAMDCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.opengl.GLDebugMessageAMDCallback create(org.lwjgl.opengl.GLDebugMessageAMDCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.opengl.GLDebugMessageAMDCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.opengl.GLDebugMessageAMDCallback r0 = (org.lwjgl.opengl.GLDebugMessageAMDCallback) r0
            goto L1c
        Le:
            org.lwjgl.opengl.GLDebugMessageAMDCallback$Container r0 = new org.lwjgl.opengl.GLDebugMessageAMDCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected GLDebugMessageAMDCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.opengl.GLDebugMessageAMDCallback.CIF
            r0.<init>(r1)
            return
    }

    GLDebugMessageAMDCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }

    public static java.lang.String getMessage(int r4, long r5) {
            r0 = r5
            r1 = r4
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }
}
