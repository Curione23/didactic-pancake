package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_DebugHook_FuncI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_DebugHook_FuncI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_DebugHook_FuncI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("FT_DebugHook_Func")
public interface FT_DebugHook_FuncI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.libffi.FFICIF CIF = null;

    @Override // org.lwjgl.system.CallbackI
    default org.lwjgl.system.libffi.FFICIF getCallInterface() {
            r2 = this;
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.util.freetype.FT_DebugHook_FuncI.CIF
            return r0
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long r5, long r7) {
            r4 = this;
            r0 = r4
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            int r0 = r0.invoke(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            org.lwjgl.system.APIUtil.apiClosureRet(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("FT_Error")
    int invoke(@org.lwjgl.system.NativeType("void *") long r1);

    static {
            int r0 = org.lwjgl.system.libffi.LibFFI.FFI_DEFAULT_ABI
            org.lwjgl.system.libffi.FFIType r1 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r2 = 1
            org.lwjgl.system.libffi.FFIType[] r2 = new org.lwjgl.system.libffi.FFIType[r2]
            r3 = r2
            r4 = 0
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.APIUtil.apiCreateCIF(r0, r1, r2)
            org.lwjgl.util.freetype.FT_DebugHook_FuncI.CIF = r0
            return
    }
}
