package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline_CubicToFuncI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline_CubicToFuncI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline_CubicToFuncI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("FT_Outline_CubicToFunc")
public interface FT_Outline_CubicToFuncI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.libffi.FFICIF CIF = null;

    @Override // org.lwjgl.system.CallbackI
    default org.lwjgl.system.libffi.FFICIF getCallInterface() {
            r2 = this;
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.util.freetype.FT_Outline_CubicToFuncI.CIF
            return r0
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long r13, long r15) {
            r12 = this;
            r0 = r12
            r1 = r15
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            r2 = r15
            int r3 = org.lwjgl.util.freetype.FT_Outline_CubicToFuncI.POINTER_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            r3 = r15
            r4 = 2
            int r5 = org.lwjgl.util.freetype.FT_Outline_CubicToFuncI.POINTER_SIZE
            int r4 = r4 * r5
            long r4 = (long) r4
            long r3 = r3 + r4
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            r4 = r15
            r5 = 3
            int r6 = org.lwjgl.util.freetype.FT_Outline_CubicToFuncI.POINTER_SIZE
            int r5 = r5 * r6
            long r5 = (long) r5
            long r4 = r4 + r5
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            int r0 = r0.invoke(r1, r2, r3, r4)
            r17 = r0
            r0 = r13
            r1 = r17
            org.lwjgl.system.APIUtil.apiClosureRet(r0, r1)
            return
    }

    int invoke(@org.lwjgl.system.NativeType("FT_Vector const *") long r1, @org.lwjgl.system.NativeType("FT_Vector const *") long r3, @org.lwjgl.system.NativeType("FT_Vector const *") long r5, @org.lwjgl.system.NativeType("void *") long r7);

    static {
            int r0 = org.lwjgl.system.libffi.LibFFI.FFI_DEFAULT_ABI
            org.lwjgl.system.libffi.FFIType r1 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r2 = 4
            org.lwjgl.system.libffi.FFIType[] r2 = new org.lwjgl.system.libffi.FFIType[r2]
            r3 = r2
            r4 = 0
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 1
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 2
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 3
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.APIUtil.apiCreateCIF(r0, r1, r2)
            org.lwjgl.util.freetype.FT_Outline_CubicToFuncI.CIF = r0
            return
    }
}
