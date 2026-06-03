package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/SVG_Lib_Preset_Slot_FuncI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/SVG_Lib_Preset_Slot_FuncI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/SVG_Lib_Preset_Slot_FuncI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("SVG_Lib_Preset_Slot_Func")
public interface SVG_Lib_Preset_Slot_FuncI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.libffi.FFICIF CIF = null;

    @Override // org.lwjgl.system.CallbackI
    default org.lwjgl.system.libffi.FFICIF getCallInterface() {
            r2 = this;
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_FuncI.CIF
            return r0
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long r10, long r12) {
            r9 = this;
            r0 = r9
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            r2 = r12
            int r3 = org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_FuncI.POINTER_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            byte r2 = org.lwjgl.system.MemoryUtil.memGetByte(r2)
            if (r2 == 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            r3 = r12
            r4 = 2
            int r5 = org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_FuncI.POINTER_SIZE
            int r4 = r4 * r5
            long r4 = (long) r4
            long r3 = r3 + r4
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            int r0 = r0.invoke(r1, r2, r3)
            r14 = r0
            r0 = r10
            r1 = r14
            org.lwjgl.system.APIUtil.apiClosureRet(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("FT_Error")
    int invoke(@org.lwjgl.system.NativeType("FT_GlyphSlot") long r1, @org.lwjgl.system.NativeType("FT_Bool") boolean r3, @org.lwjgl.system.NativeType("FT_Pointer *") long r4);

    static {
            int r0 = org.lwjgl.system.libffi.LibFFI.FFI_DEFAULT_ABI
            org.lwjgl.system.libffi.FFIType r1 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r2 = 3
            org.lwjgl.system.libffi.FFIType[] r2 = new org.lwjgl.system.libffi.FFIType[r2]
            r3 = r2
            r4 = 0
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 1
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint8
            r3[r4] = r5
            r3 = r2
            r4 = 2
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.APIUtil.apiCreateCIF(r0, r1, r2)
            org.lwjgl.util.freetype.SVG_Lib_Preset_Slot_FuncI.CIF = r0
            return
    }
}
