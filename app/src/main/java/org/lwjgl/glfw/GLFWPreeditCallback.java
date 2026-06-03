package org.lwjgl.glfw;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWPreeditCallback.class */
public abstract class GLFWPreeditCallback extends org.lwjgl.system.Callback implements org.lwjgl.glfw.GLFWPreeditCallbackI {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWPreeditCallback$Container.class */
    private static final class Container extends org.lwjgl.glfw.GLFWPreeditCallback {
        private final org.lwjgl.glfw.GLFWPreeditCallbackI delegate;

        Container(long r5, org.lwjgl.glfw.GLFWPreeditCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.glfw.GLFWPreeditCallbackI
        public void invoke(long r13, int r15, long r16, int r18, long r19, int r21, int r22) {
                r12 = this;
                r0 = r12
                org.lwjgl.glfw.GLFWPreeditCallbackI r0 = r0.delegate
                r1 = r13
                r2 = r15
                r3 = r16
                r4 = r18
                r5 = r19
                r6 = r21
                r7 = r22
                r0.invoke(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    public static org.lwjgl.glfw.GLFWPreeditCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.glfw.GLFWPreeditCallbackI r0 = (org.lwjgl.glfw.GLFWPreeditCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWPreeditCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.glfw.GLFWPreeditCallback r0 = (org.lwjgl.glfw.GLFWPreeditCallback) r0
            goto L1f
        L16:
            org.lwjgl.glfw.GLFWPreeditCallback$Container r0 = new org.lwjgl.glfw.GLFWPreeditCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    public static org.lwjgl.glfw.GLFWPreeditCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.glfw.GLFWPreeditCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.glfw.GLFWPreeditCallback create(org.lwjgl.glfw.GLFWPreeditCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWPreeditCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.glfw.GLFWPreeditCallback r0 = (org.lwjgl.glfw.GLFWPreeditCallback) r0
            goto L1c
        Le:
            org.lwjgl.glfw.GLFWPreeditCallback$Container r0 = new org.lwjgl.glfw.GLFWPreeditCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected GLFWPreeditCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.Callback$Descriptor r1 = org.lwjgl.glfw.GLFWPreeditCallback.DESCRIPTOR
            r0.<init>(r1)
            return
    }

    GLFWPreeditCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }

    public org.lwjgl.glfw.GLFWPreeditCallback set(long r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            org.lwjgl.glfw.GLFWPreeditCallback r0 = org.lwjgl.glfw.GLFW.glfwSetPreeditCallback(r0, r1)
            r0 = r4
            return r0
    }
}
