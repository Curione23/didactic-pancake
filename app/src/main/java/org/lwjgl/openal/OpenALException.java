package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/OpenALException.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/OpenALException.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/OpenALException.class */
public class OpenALException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 1;

    public OpenALException() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public OpenALException(int r5) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "OpenAL error: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.String r2 = org.lwjgl.openal.AL10.alGetString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ("
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ")"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return
    }

    public OpenALException(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public OpenALException(java.lang.String r5, java.lang.Throwable r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public OpenALException(java.lang.Throwable r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }
}
