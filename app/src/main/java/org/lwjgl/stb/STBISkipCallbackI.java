package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBISkipCallbackI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBISkipCallbackI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBISkipCallbackI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("void (*) (void *, int)")
public interface STBISkipCallbackI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.libffi.FFICIF CIF = null;

    @Override // org.lwjgl.system.CallbackI
    default org.lwjgl.system.libffi.FFICIF getCallInterface() {
            r2 = this;
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.stb.STBISkipCallbackI.CIF
            return r0
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long r9, long r11) {
            r8 = this;
            r0 = r8
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            r2 = r11
            int r3 = org.lwjgl.stb.STBISkipCallbackI.POINTER_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            int r2 = org.lwjgl.system.MemoryUtil.memGetInt(r2)
            r0.invoke(r1, r2)
            return
    }

    void invoke(@org.lwjgl.system.NativeType("void *") long r1, int r3);

    static {
            int r0 = org.lwjgl.system.libffi.LibFFI.FFI_DEFAULT_ABI
            org.lwjgl.system.libffi.FFIType r1 = org.lwjgl.system.libffi.LibFFI.ffi_type_void
            r2 = 2
            org.lwjgl.system.libffi.FFIType[] r2 = new org.lwjgl.system.libffi.FFIType[r2]
            r3 = r2
            r4 = 0
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 1
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r3[r4] = r5
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.APIUtil.apiCreateCIF(r0, r1, r2)
            org.lwjgl.stb.STBISkipCallbackI.CIF = r0
            return
    }
}
