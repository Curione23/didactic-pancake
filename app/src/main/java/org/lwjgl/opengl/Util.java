package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Util.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Util.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Util.class */
public final class Util {
    private Util() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void checkGLError() throws org.lwjgl.opengl.OpenGLException {
            int r0 = org.lwjgl.opengl.GL30.glGetError()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L11
            org.lwjgl.opengl.OpenGLException r0 = new org.lwjgl.opengl.OpenGLException
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            throw r0
        L11:
            return
    }

    public static java.lang.String translateGLErrorString(int r2) {
            r0 = r2
            switch(r0) {
                case 0: goto L54;
                case 1280: goto L57;
                case 1281: goto L5a;
                case 1282: goto L5d;
                case 1283: goto L60;
                case 1284: goto L63;
                case 1285: goto L66;
                case 1286: goto L6c;
                case 32817: goto L69;
                default: goto L6f;
            }
        L54:
            java.lang.String r0 = "No error"
            return r0
        L57:
            java.lang.String r0 = "Invalid enum"
            return r0
        L5a:
            java.lang.String r0 = "Invalid value"
            return r0
        L5d:
            java.lang.String r0 = "Invalid operation"
            return r0
        L60:
            java.lang.String r0 = "Stack overflow"
            return r0
        L63:
            java.lang.String r0 = "Stack underflow"
            return r0
        L66:
            java.lang.String r0 = "Out of memory"
            return r0
        L69:
            java.lang.String r0 = "Table too large"
            return r0
        L6c:
            java.lang.String r0 = "Invalid framebuffer operation"
            return r0
        L6f:
            r0 = 0
            return r0
    }
}
