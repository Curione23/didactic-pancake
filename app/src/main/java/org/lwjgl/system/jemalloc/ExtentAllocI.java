package org.lwjgl.system.jemalloc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentAllocI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentAllocI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/ExtentAllocI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("extent_alloc_t")
public interface ExtentAllocI extends org.lwjgl.system.CallbackI.P {
    public static final java.lang.String SIGNATURE = "(ppppppi)p";

    default java.lang.String getSignature() {
            r2 = this;
            java.lang.String r0 = "(ppppppi)p"
            return r0
    }

    default long callback(long r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            long r1 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r1)
            r2 = r17
            long r2 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r2)
            r3 = r17
            long r3 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r3)
            r4 = r17
            long r4 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r4)
            r5 = r17
            long r5 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r5)
            r6 = r17
            long r6 = org.lwjgl.system.dyncall.DynCallback.dcbArgPointer(r6)
            r7 = r17
            int r7 = org.lwjgl.system.dyncall.DynCallback.dcbArgInt(r7)
            long r0 = r0.invoke(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    long invoke(@org.lwjgl.system.NativeType("extent_hooks_t *") long r1, @org.lwjgl.system.NativeType("void *") long r3, @org.lwjgl.system.NativeType("size_t") long r5, @org.lwjgl.system.NativeType("size_t") long r7, @org.lwjgl.system.NativeType("bool *") long r9, @org.lwjgl.system.NativeType("bool *") long r11, @org.lwjgl.system.NativeType("unsigned int") int r13);
}
