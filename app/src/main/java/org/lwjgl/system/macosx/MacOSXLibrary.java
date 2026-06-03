package org.lwjgl.system.macosx;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/MacOSXLibrary.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/MacOSXLibrary.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/MacOSXLibrary.class */
public abstract class MacOSXLibrary extends org.lwjgl.system.SharedLibrary.Default {
    protected MacOSXLibrary(java.lang.String r6, long r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2)
            return
    }

    public static org.lwjgl.system.macosx.MacOSXLibrary getWithIdentifier(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Loading library: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = r3
            org.lwjgl.system.macosx.MacOSXLibraryBundle r0 = org.lwjgl.system.macosx.MacOSXLibraryBundle.getWithIdentifier(r0)
            r4 = r0
            java.lang.String r0 = "Success"
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            r0 = r4
            return r0
    }

    public static org.lwjgl.system.macosx.MacOSXLibrary create(java.lang.String r4) {
            r0 = r4
            java.lang.String r1 = ".framework"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L10
            r0 = r4
            org.lwjgl.system.macosx.MacOSXLibraryBundle r0 = org.lwjgl.system.macosx.MacOSXLibraryBundle.create(r0)
            goto L18
        L10:
            org.lwjgl.system.macosx.MacOSXLibraryDL r0 = new org.lwjgl.system.macosx.MacOSXLibraryDL
            r1 = r0
            r2 = r4
            r1.<init>(r2)
        L18:
            return r0
    }
}
