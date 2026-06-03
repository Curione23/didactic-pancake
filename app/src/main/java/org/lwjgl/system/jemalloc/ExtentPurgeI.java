package org.lwjgl.system.jemalloc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentPurgeI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentPurgeI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentPurgeI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("extent_purge_t")
public interface ExtentPurgeI extends org.lwjgl.system.CallbackI.Z {
    public static final java.lang.String SIGNATURE = "(pppppi)B";

    default java.lang.String getSignature() {
            r2 = this;
            java.lang.String r0 = "(pppppi)B"
            return r0
    }

    default boolean callback(long r15) {
            r14 = this;
            r0 = r14
            r1 = r15
            long r1 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r1)
            r2 = r15
            long r2 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r2)
            r3 = r15
            long r3 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r3)
            r4 = r15
            long r4 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r4)
            r5 = r15
            long r5 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r5)
            r6 = r15
            int r6 = org.lwjgl.system.dyncall.DynCallback.dcbArgInt(r6)
            boolean r0 = r0.invoke(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    boolean invoke(@org.lwjgl.system.NativeType("extent_hooks_t *") long r1, @org.lwjgl.system.NativeType("void *") long r3, @org.lwjgl.system.NativeType("size_t") long r5, @org.lwjgl.system.NativeType("size_t") long r7, @org.lwjgl.system.NativeType("size_t") long r9, @org.lwjgl.system.NativeType("unsigned int") int r11);
}
