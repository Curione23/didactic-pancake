package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Registry.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Registry.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Registry.class */
public class Registry extends org.lwjgl.util.glu.Util {
    private static final java.lang.String versionString = "1.3";
    private static final java.lang.String extensionString = "GLU_EXT_nurbs_tessellator GLU_EXT_object_space_tess ";

    public Registry() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String gluGetString(int r3) {
            r0 = r3
            r1 = 100800(0x189c0, float:1.41251E-40)
            if (r0 != r1) goto L9
            java.lang.String r0 = "1.3"
            return r0
        L9:
            r0 = r3
            r1 = 100801(0x189c1, float:1.41252E-40)
            if (r0 != r1) goto L12
            java.lang.String r0 = "GLU_EXT_nurbs_tessellator GLU_EXT_object_space_tess "
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static boolean gluCheckExtension(java.lang.String r3, java.lang.String r4) {
            r0 = r4
            if (r0 == 0) goto L8
            r0 = r3
            if (r0 != 0) goto La
        L8:
            r0 = 0
            return r0
        La:
            r0 = r4
            r1 = r3
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 == r1) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }
}
