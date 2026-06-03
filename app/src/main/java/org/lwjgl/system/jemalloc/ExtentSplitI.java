package org.lwjgl.system.jemalloc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentSplitI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentSplitI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentSplitI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("extent_split_t")
public interface ExtentSplitI extends org.lwjgl.system.CallbackI.Z {
    public static final java.lang.String SIGNATURE = "(pppppBi)B";

    default java.lang.String getSignature() {
            r2 = this;
            java.lang.String r0 = "(pppppBi)B"
            return r0
    }

    default boolean callback(long r16) {
            r15 = this;
            r0 = r15
            r1 = r16
            long r1 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r1)
            r2 = r16
            long r2 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r2)
            r3 = r16
            long r3 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r3)
            r4 = r16
            long r4 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r4)
            r5 = r16
            long r5 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r5)
            r6 = r16
            boolean r6 = org.lwjgl.system.dyncall.DynCallback.dcbArgBool(r6)
            r7 = r16
            int r7 = org.lwjgl.system.dyncall.DynCallback.dcbArgInt(r7)
            boolean r0 = r0.invoke(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    boolean invoke(@org.lwjgl.system.NativeType("extent_hooks_t *") long r1, @org.lwjgl.system.NativeType("void *") long r3, @org.lwjgl.system.NativeType("size_t") long r5, @org.lwjgl.system.NativeType("size_t") long r7, @org.lwjgl.system.NativeType("size_t") long r9, @org.lwjgl.system.NativeType("bool") boolean r11, @org.lwjgl.system.NativeType("unsigned int") int r12);
}
