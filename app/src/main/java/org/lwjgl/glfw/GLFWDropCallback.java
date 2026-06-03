package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWDropCallback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWDropCallback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWDropCallback.class */
public abstract class GLFWDropCallback extends org.lwjgl.system.Callback implements org.lwjgl.glfw.GLFWDropCallbackI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWDropCallback$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWDropCallback$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWDropCallback$Container.class */
    private static final class Container extends org.lwjgl.glfw.GLFWDropCallback {
        private final org.lwjgl.glfw.GLFWDropCallbackI delegate;

        Container(long r5, org.lwjgl.glfw.GLFWDropCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.glfw.GLFWDropCallbackI
        public void invoke(long r8, int r10, long r11) {
                r7 = this;
                r0 = r7
                org.lwjgl.glfw.GLFWDropCallbackI r0 = r0.delegate
                r1 = r8
                r2 = r10
                r3 = r11
                r0.invoke(r1, r2, r3)
                return
        }
    }

    public static org.lwjgl.glfw.GLFWDropCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.glfw.GLFWDropCallbackI r0 = (org.lwjgl.glfw.GLFWDropCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWDropCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.glfw.GLFWDropCallback r0 = (org.lwjgl.glfw.GLFWDropCallback) r0
            goto L1f
        L16:
            org.lwjgl.glfw.GLFWDropCallback$Container r0 = new org.lwjgl.glfw.GLFWDropCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.glfw.GLFWDropCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.glfw.GLFWDropCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.glfw.GLFWDropCallback create(org.lwjgl.glfw.GLFWDropCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWDropCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.glfw.GLFWDropCallback r0 = (org.lwjgl.glfw.GLFWDropCallback) r0
            goto L1c
        Le:
            org.lwjgl.glfw.GLFWDropCallback$Container r0 = new org.lwjgl.glfw.GLFWDropCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected GLFWDropCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.glfw.GLFWDropCallback.CIF
            r0.<init>(r1)
            return
    }

    GLFWDropCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }

    public static java.lang.String getName(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.Pointer.POINTER_SIZE
            r2 = r7
            int r1 = r1 * r2
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public org.lwjgl.glfw.GLFWDropCallback set(long r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            org.lwjgl.glfw.GLFWDropCallback r0 = org.lwjgl.glfw.GLFW.glfwSetDropCallback(r0, r1)
            r0 = r4
            return r0
    }
}
