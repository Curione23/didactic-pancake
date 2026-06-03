package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/Util.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/Util.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/Util.class */
public final class Util {
    private Util() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void checkALCError(org.lwjgl.openal.ALCdevice r6) {
            r0 = r6
            long r0 = r0.device
            int r0 = org.lwjgl.openal.ALC10.alcGetError(r0)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L1e
            org.lwjgl.openal.OpenALException r0 = new org.lwjgl.openal.OpenALException
            r1 = r0
            org.lwjgl.openal.ALCdevice r2 = org.lwjgl.openal.AL.getDevice()
            long r2 = r2.device
            r3 = r7
            java.lang.String r2 = org.lwjgl.openal.ALC10.alcGetString(r2, r3)
            r1.<init>(r2)
            throw r0
        L1e:
            return
    }

    public static void checkALError() {
            int r0 = org.lwjgl.openal.AL10.alGetError()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L11
            org.lwjgl.openal.OpenALException r0 = new org.lwjgl.openal.OpenALException
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            throw r0
        L11:
            return
    }

    public static void checkALCValidDevice(org.lwjgl.openal.ALCdevice r5) {
            r0 = r5
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L22
            org.lwjgl.openal.OpenALException r0 = new org.lwjgl.openal.OpenALException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid device: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L22:
            return
    }

    public static void checkALCValidContext(org.lwjgl.openal.ALCcontext r5) {
            r0 = r5
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L22
            org.lwjgl.openal.OpenALException r0 = new org.lwjgl.openal.OpenALException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid context: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L22:
            return
    }
}
