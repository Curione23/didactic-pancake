package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/CallbackI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/CallbackI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/CallbackI.class */
public interface CallbackI extends org.lwjgl.system.Pointer {
    org.lwjgl.system.libffi.FFICIF getCallInterface();

    @Override // org.lwjgl.system.Pointer
    default long address() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r0 = r0.getCallInterface()
            r1 = r3
            long r0 = org.lwjgl.system.Callback.create(r0, r1)
            return r0
    }

    void callback(long r1, long r3);
}
