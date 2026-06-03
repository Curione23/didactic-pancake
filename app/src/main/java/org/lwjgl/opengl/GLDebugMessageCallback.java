package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageCallback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageCallback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageCallback.class */
public abstract class GLDebugMessageCallback extends org.lwjgl.system.Callback implements org.lwjgl.opengl.GLDebugMessageCallbackI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageCallback$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageCallback$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageCallback$Container.class */
    private static final class Container extends org.lwjgl.opengl.GLDebugMessageCallback {
        private final org.lwjgl.opengl.GLDebugMessageCallbackI delegate;

        Container(long r5, org.lwjgl.opengl.GLDebugMessageCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.opengl.GLDebugMessageCallbackI
        public void invoke(int r12, int r13, int r14, int r15, int r16, long r17, long r19) {
                r11 = this;
                r0 = r11
                org.lwjgl.opengl.GLDebugMessageCallbackI r0 = r0.delegate
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r19
                r0.invoke(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    public static org.lwjgl.opengl.GLDebugMessageCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.opengl.GLDebugMessageCallbackI r0 = (org.lwjgl.opengl.GLDebugMessageCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.opengl.GLDebugMessageCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.opengl.GLDebugMessageCallback r0 = (org.lwjgl.opengl.GLDebugMessageCallback) r0
            goto L1f
        L16:
            org.lwjgl.opengl.GLDebugMessageCallback$Container r0 = new org.lwjgl.opengl.GLDebugMessageCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.opengl.GLDebugMessageCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.opengl.GLDebugMessageCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.opengl.GLDebugMessageCallback create(org.lwjgl.opengl.GLDebugMessageCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.opengl.GLDebugMessageCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.opengl.GLDebugMessageCallback r0 = (org.lwjgl.opengl.GLDebugMessageCallback) r0
            goto L1c
        Le:
            org.lwjgl.opengl.GLDebugMessageCallback$Container r0 = new org.lwjgl.opengl.GLDebugMessageCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected GLDebugMessageCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.opengl.GLDebugMessageCallback.CIF
            r0.<init>(r1)
            return
    }

    GLDebugMessageCallback(long r5) {
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
