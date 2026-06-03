package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageARBCallback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageARBCallback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageARBCallback.class */
public abstract class GLDebugMessageARBCallback extends org.lwjgl.system.Callback implements org.lwjgl.opengl.GLDebugMessageARBCallbackI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageARBCallback$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageARBCallback$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageARBCallback$Container.class */
    private static final class Container extends org.lwjgl.opengl.GLDebugMessageARBCallback {
        private final org.lwjgl.opengl.GLDebugMessageARBCallbackI delegate;

        Container(long r5, org.lwjgl.opengl.GLDebugMessageARBCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.opengl.GLDebugMessageARBCallbackI
        public void invoke(int r12, int r13, int r14, int r15, int r16, long r17, long r19) {
                r11 = this;
                r0 = r11
                org.lwjgl.opengl.GLDebugMessageARBCallbackI r0 = r0.delegate
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

    public static org.lwjgl.opengl.GLDebugMessageARBCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.opengl.GLDebugMessageARBCallbackI r0 = (org.lwjgl.opengl.GLDebugMessageARBCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.opengl.GLDebugMessageARBCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.opengl.GLDebugMessageARBCallback r0 = (org.lwjgl.opengl.GLDebugMessageARBCallback) r0
            goto L1f
        L16:
            org.lwjgl.opengl.GLDebugMessageARBCallback$Container r0 = new org.lwjgl.opengl.GLDebugMessageARBCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.opengl.GLDebugMessageARBCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.opengl.GLDebugMessageARBCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.opengl.GLDebugMessageARBCallback create(org.lwjgl.opengl.GLDebugMessageARBCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.opengl.GLDebugMessageARBCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.opengl.GLDebugMessageARBCallback r0 = (org.lwjgl.opengl.GLDebugMessageARBCallback) r0
            goto L1c
        Le:
            org.lwjgl.opengl.GLDebugMessageARBCallback$Container r0 = new org.lwjgl.opengl.GLDebugMessageARBCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected GLDebugMessageARBCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.opengl.GLDebugMessageARBCallback.CIF
            r0.<init>(r1)
            return
    }

    GLDebugMessageARBCallback(long r5) {
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
