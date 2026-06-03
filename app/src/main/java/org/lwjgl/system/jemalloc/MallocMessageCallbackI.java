package org.lwjgl.system.jemalloc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/MallocMessageCallbackI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/MallocMessageCallbackI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/MallocMessageCallbackI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("void (*) (void *, char const *)")
public interface MallocMessageCallbackI extends org.lwjgl.system.CallbackI.V {
    public static final java.lang.String SIGNATURE = "(pp)v";

    default java.lang.String getSignature() {
            r2 = this;
            java.lang.String r0 = "(pp)v"
            return r0
    }

    default void callback(long r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r1)
            r2 = r7
            long r2 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r2)
            r0.invoke(r1, r2)
            return
    }

    void invoke(@org.lwjgl.system.NativeType("void *") long r1, @org.lwjgl.system.NativeType("char const *") long r3);
}
