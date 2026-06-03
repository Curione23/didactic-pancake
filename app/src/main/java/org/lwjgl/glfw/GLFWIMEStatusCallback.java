package org.lwjgl.glfw;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWIMEStatusCallback.class */
public abstract class GLFWIMEStatusCallback extends org.lwjgl.system.Callback implements org.lwjgl.glfw.GLFWIMEStatusCallbackI {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWIMEStatusCallback$Container.class */
    private static final class Container extends org.lwjgl.glfw.GLFWIMEStatusCallback {
        private final org.lwjgl.glfw.GLFWIMEStatusCallbackI delegate;

        Container(long r5, org.lwjgl.glfw.GLFWIMEStatusCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.glfw.GLFWIMEStatusCallbackI
        public void invoke(long r5) {
                r4 = this;
                r0 = r4
                org.lwjgl.glfw.GLFWIMEStatusCallbackI r0 = r0.delegate
                r1 = r5
                r0.invoke(r1)
                return
        }
    }

    public static org.lwjgl.glfw.GLFWIMEStatusCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.glfw.GLFWIMEStatusCallbackI r0 = (org.lwjgl.glfw.GLFWIMEStatusCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWIMEStatusCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.glfw.GLFWIMEStatusCallback r0 = (org.lwjgl.glfw.GLFWIMEStatusCallback) r0
            goto L1f
        L16:
            org.lwjgl.glfw.GLFWIMEStatusCallback$Container r0 = new org.lwjgl.glfw.GLFWIMEStatusCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    public static org.lwjgl.glfw.GLFWIMEStatusCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.glfw.GLFWIMEStatusCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.glfw.GLFWIMEStatusCallback create(org.lwjgl.glfw.GLFWIMEStatusCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWIMEStatusCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.glfw.GLFWIMEStatusCallback r0 = (org.lwjgl.glfw.GLFWIMEStatusCallback) r0
            goto L1c
        Le:
            org.lwjgl.glfw.GLFWIMEStatusCallback$Container r0 = new org.lwjgl.glfw.GLFWIMEStatusCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected GLFWIMEStatusCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.Callback$Descriptor r1 = org.lwjgl.glfw.GLFWIMEStatusCallback.DESCRIPTOR
            r0.<init>(r1)
            return
    }

    GLFWIMEStatusCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }

    public org.lwjgl.glfw.GLFWIMEStatusCallback set(long r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            org.lwjgl.glfw.GLFWIMEStatusCallback r0 = org.lwjgl.glfw.GLFW.glfwSetIMEStatusCallback(r0, r1)
            r0 = r4
            return r0
    }
}
