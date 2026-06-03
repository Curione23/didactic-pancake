package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWReallocateCallback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWReallocateCallback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWReallocateCallback.class */
public abstract class GLFWReallocateCallback extends org.lwjgl.system.Callback implements org.lwjgl.glfw.GLFWReallocateCallbackI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWReallocateCallback$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWReallocateCallback$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWReallocateCallback$Container.class */
    private static final class Container extends org.lwjgl.glfw.GLFWReallocateCallback {
        private final org.lwjgl.glfw.GLFWReallocateCallbackI delegate;

        Container(long r5, org.lwjgl.glfw.GLFWReallocateCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.glfw.GLFWReallocateCallbackI
        public long invoke(long r9, long r11, long r13) {
                r8 = this;
                r0 = r8
                org.lwjgl.glfw.GLFWReallocateCallbackI r0 = r0.delegate
                r1 = r9
                r2 = r11
                r3 = r13
                long r0 = r0.invoke(r1, r2, r3)
                return r0
        }
    }

    public static org.lwjgl.glfw.GLFWReallocateCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.glfw.GLFWReallocateCallbackI r0 = (org.lwjgl.glfw.GLFWReallocateCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWReallocateCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.glfw.GLFWReallocateCallback r0 = (org.lwjgl.glfw.GLFWReallocateCallback) r0
            goto L1f
        L16:
            org.lwjgl.glfw.GLFWReallocateCallback$Container r0 = new org.lwjgl.glfw.GLFWReallocateCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.glfw.GLFWReallocateCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.glfw.GLFWReallocateCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.glfw.GLFWReallocateCallback create(org.lwjgl.glfw.GLFWReallocateCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.glfw.GLFWReallocateCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.glfw.GLFWReallocateCallback r0 = (org.lwjgl.glfw.GLFWReallocateCallback) r0
            goto L1c
        Le:
            org.lwjgl.glfw.GLFWReallocateCallback$Container r0 = new org.lwjgl.glfw.GLFWReallocateCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected GLFWReallocateCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.glfw.GLFWReallocateCallback.CIF
            r0.<init>(r1)
            return
    }

    GLFWReallocateCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
