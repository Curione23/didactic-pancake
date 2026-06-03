package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBCLEvent.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBCLEvent.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBCLEvent.class */
public class ARBCLEvent {
    public static final int GL_SYNC_CL_EVENT_ARB = 33344;
    public static final int GL_SYNC_CL_EVENT_COMPLETE_ARB = 33345;

    protected ARBCLEvent() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native long nglCreateSyncFromCLeventARB(long r0, long r2, int r4);

    @org.lwjgl.system.NativeType("GLsync")
    public static long glCreateSyncFromCLeventARB(@org.lwjgl.system.NativeType("cl_context") long r6, @org.lwjgl.system.NativeType("cl_event") long r8, @org.lwjgl.system.NativeType("GLbitfield") int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r6
            r1 = r8
            r2 = r10
            long r0 = nglCreateSyncFromCLeventARB(r0, r1, r2)
            return r0
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
