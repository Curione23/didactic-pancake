package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWErrorCallback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWErrorCallback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWErrorCallback.class */
public abstract class GLFWErrorCallback extends org.lwjgl.system.Callback implements org.lwjgl.glfw.GLFWErrorCallbackI {



    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWErrorCallback$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWErrorCallback$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWErrorCallback$Container.class */
    private static final class Container extends org.lwjgl.glfw.GLFWErrorCallback {
        private final org.lwjgl.glfw.GLFWErrorCallbackI delegate;

        Container(long r5, org.lwjgl.glfw.GLFWErrorCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.glfw.GLFWErrorCallbackI
        public void invoke(int r6, long r7) {
                r5 = this;
                r0 = r5
                org.lwjgl.glfw.GLFWErrorCallbackI r0 = r0.delegate
                r1 = r6
                r2 = r7
                r0.invoke(r1, r2)
                return
        }
    }

    public static org.lwjgl.glfw.GLFWErrorCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.glfw.GLFWErrorCallbackI r0 = (org.lwjgl.glfw.GLFWErrorCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWErrorCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.glfw.GLFWErrorCallback r0 = (org.lwjgl.glfw.GLFWErrorCallback) r0
            goto L1f
        L16:
            org.lwjgl.glfw.GLFWErrorCallback$Container r0 = new org.lwjgl.glfw.GLFWErrorCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.glfw.GLFWErrorCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.glfw.GLFWErrorCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.glfw.GLFWErrorCallback create(org.lwjgl.glfw.GLFWErrorCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWErrorCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.glfw.GLFWErrorCallback r0 = (org.lwjgl.glfw.GLFWErrorCallback) r0
            goto L1c
        Le:
            org.lwjgl.glfw.GLFWErrorCallback$Container r0 = new org.lwjgl.glfw.GLFWErrorCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected GLFWErrorCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.glfw.GLFWErrorCallback.CIF
            r0.<init>(r1)
            return
    }

    GLFWErrorCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }

    public static java.lang.String getDescription(long r3) {
            r0 = r3
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static org.lwjgl.glfw.GLFWErrorCallback createPrint() {
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            org.lwjgl.glfw.GLFWErrorCallback r0 = createPrint(r0)
            return r0
    }

    public static org.lwjgl.glfw.GLFWErrorCallback createPrint(java.io.PrintStream r4) {
            org.lwjgl.glfw.GLFWErrorCallback$1 r0 = new org.lwjgl.glfw.GLFWErrorCallback$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    public static org.lwjgl.glfw.GLFWErrorCallback createThrow() {
            org.lwjgl.glfw.GLFWErrorCallback$2 r0 = new org.lwjgl.glfw.GLFWErrorCallback$2
            r1 = r0
            r1.<init>()
            return r0
    }

    public org.lwjgl.glfw.GLFWErrorCallback set() {
            r2 = this;
            r0 = r2
            org.lwjgl.glfw.GLFWErrorCallback r0 = org.lwjgl.glfw.GLFW.glfwSetErrorCallback(r0)
            r0 = r2
            return r0
    }
}
