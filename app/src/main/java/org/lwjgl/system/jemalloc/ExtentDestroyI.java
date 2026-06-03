package org.lwjgl.system.jemalloc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentDestroyI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentDestroyI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentDestroyI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("extent_destroy_t")
public interface ExtentDestroyI extends org.lwjgl.system.CallbackI.Z {
    public static final java.lang.String SIGNATURE = "(pppBi)B";

    default java.lang.String getSignature() {
            r2 = this;
            java.lang.String r0 = "(pppBi)B"
            return r0
    }

    default boolean callback(long r12) {
            r11 = this;
            r0 = r11
            r1 = r12
            long r1 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r1)
            r2 = r12
            long r2 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r2)
            r3 = r12
            long r3 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r3)
            r4 = r12
            boolean r4 = org.lwjgl.system.dyncall.DynCallback.dcbArgBool(r4)
            r5 = r12
            int r5 = org.lwjgl.system.dyncall.DynCallback.dcbArgInt(r5)
            boolean r0 = r0.invoke(r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    boolean invoke(@org.lwjgl.system.NativeType("extent_hooks_t *") long r1, @org.lwjgl.system.NativeType("void *") long r3, @org.lwjgl.system.NativeType("size_t") long r5, @org.lwjgl.system.NativeType("bool") boolean r7, @org.lwjgl.system.NativeType("unsigned int") int r8);
}
