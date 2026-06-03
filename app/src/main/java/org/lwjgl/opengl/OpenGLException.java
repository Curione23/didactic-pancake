package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/OpenGLException.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/OpenGLException.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/OpenGLException.class */
public class OpenGLException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 1;

    public OpenGLException(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r1 = createErrorMessage(r1)
            r0.<init>(r1)
            return
    }

    private static java.lang.String createErrorMessage(int r3) {
            r0 = r3
            java.lang.String r0 = org.lwjgl.opengl.Util.translateGLErrorString(r0)
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " ("
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public OpenGLException() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public OpenGLException(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public OpenGLException(java.lang.String r5, java.lang.Throwable r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public OpenGLException(java.lang.Throwable r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }
}
