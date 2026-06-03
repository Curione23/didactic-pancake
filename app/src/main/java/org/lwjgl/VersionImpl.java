package org.lwjgl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/VersionImpl.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/VersionImpl.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/VersionImpl.class */
final class VersionImpl {
    VersionImpl() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static java.lang.String find() {
            java.lang.Class<org.lwjgl.Version> r0 = org.lwjgl.Version.class
            java.lang.Package r0 = r0.getPackage()
            r3 = r0
            r0 = r3
            java.lang.String r0 = r0.getSpecificationVersion()
            r4 = r0
            r0 = r3
            java.lang.String r0 = r0.getImplementationVersion()
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L1e
            r0 = r5
            if (r0 == 0) goto L1e
            r0 = r4
            r1 = r5
            java.lang.String r0 = org.lwjgl.Version.createImplementation(r0, r1)
            return r0
        L1e:
            java.lang.String r0 = org.lwjgl.Version.findImplementationFromManifest()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L28
            r0 = r6
            return r0
        L28:
            java.lang.String r0 = "-snapshot"
            return r0
    }
}
