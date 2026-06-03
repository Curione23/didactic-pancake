package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWWindowCloseCallback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWWindowCloseCallback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWWindowCloseCallback.class */
public abstract class GLFWWindowCloseCallback extends org.lwjgl.system.Callback implements org.lwjgl.glfw.GLFWWindowCloseCallbackI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWWindowCloseCallback$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWWindowCloseCallback$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWWindowCloseCallback$Container.class */
    private static final class Container extends org.lwjgl.glfw.GLFWWindowCloseCallback {
        private final org.lwjgl.glfw.GLFWWindowCloseCallbackI delegate;

        Container(long r5, org.lwjgl.glfw.GLFWWindowCloseCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.glfw.GLFWWindowCloseCallbackI
        public void invoke(long r5) {
                r4 = this;
                r0 = r4
                org.lwjgl.glfw.GLFWWindowCloseCallbackI r0 = r0.delegate
                r1 = r5
                r0.invoke(r1)
                return
        }
    }

    public static org.lwjgl.glfw.GLFWWindowCloseCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.glfw.GLFWWindowCloseCallbackI r0 = (org.lwjgl.glfw.GLFWWindowCloseCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWWindowCloseCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.glfw.GLFWWindowCloseCallback r0 = (org.lwjgl.glfw.GLFWWindowCloseCallback) r0
            goto L1f
        L16:
            org.lwjgl.glfw.GLFWWindowCloseCallback$Container r0 = new org.lwjgl.glfw.GLFWWindowCloseCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.glfw.GLFWWindowCloseCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.glfw.GLFWWindowCloseCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.glfw.GLFWWindowCloseCallback create(org.lwjgl.glfw.GLFWWindowCloseCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWWindowCloseCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.glfw.GLFWWindowCloseCallback r0 = (org.lwjgl.glfw.GLFWWindowCloseCallback) r0
            goto L1c
        Le:
            org.lwjgl.glfw.GLFWWindowCloseCallback$Container r0 = new org.lwjgl.glfw.GLFWWindowCloseCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected GLFWWindowCloseCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.glfw.GLFWWindowCloseCallback.CIF
            r0.<init>(r1)
            return
    }

    GLFWWindowCloseCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }

    public org.lwjgl.glfw.GLFWWindowCloseCallback set(long r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            org.lwjgl.glfw.GLFWWindowCloseCallback r0 = org.lwjgl.glfw.GLFW.glfwSetWindowCloseCallback(r0, r1)
            r0 = r4
            return r0
    }
}
