package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageARBCallbackI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageARBCallbackI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLDebugMessageARBCallbackI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("GLDEBUGPROCARB")
public interface GLDebugMessageARBCallbackI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.libffi.FFICIF CIF = null;

    @Override // org.lwjgl.system.CallbackI
    default org.lwjgl.system.libffi.FFICIF getCallInterface() {
            r2 = this;
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.opengl.GLDebugMessageARBCallbackI.CIF
            return r0
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long r14, long r16) {
            r13 = this;
            r0 = r13
            r1 = r16
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            int r1 = org.lwjgl.system.MemoryUtil.memGetInt(r1)
            r2 = r16
            int r3 = org.lwjgl.opengl.GLDebugMessageARBCallbackI.POINTER_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            int r2 = org.lwjgl.system.MemoryUtil.memGetInt(r2)
            r3 = r16
            r4 = 2
            int r5 = org.lwjgl.opengl.GLDebugMessageARBCallbackI.POINTER_SIZE
            int r4 = r4 * r5
            long r4 = (long) r4
            long r3 = r3 + r4
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            int r3 = org.lwjgl.system.MemoryUtil.memGetInt(r3)
            r4 = r16
            r5 = 3
            int r6 = org.lwjgl.opengl.GLDebugMessageARBCallbackI.POINTER_SIZE
            int r5 = r5 * r6
            long r5 = (long) r5
            long r4 = r4 + r5
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            int r4 = org.lwjgl.system.MemoryUtil.memGetInt(r4)
            r5 = r16
            r6 = 4
            int r7 = org.lwjgl.opengl.GLDebugMessageARBCallbackI.POINTER_SIZE
            int r6 = r6 * r7
            long r6 = (long) r6
            long r5 = r5 + r6
            long r5 = org.lwjgl.system.MemoryUtil.memGetAddress(r5)
            int r5 = org.lwjgl.system.MemoryUtil.memGetInt(r5)
            r6 = r16
            r7 = 5
            int r8 = org.lwjgl.opengl.GLDebugMessageARBCallbackI.POINTER_SIZE
            int r7 = r7 * r8
            long r7 = (long) r7
            long r6 = r6 + r7
            long r6 = org.lwjgl.system.MemoryUtil.memGetAddress(r6)
            long r6 = org.lwjgl.system.MemoryUtil.memGetAddress(r6)
            r7 = r16
            r8 = 6
            int r9 = org.lwjgl.opengl.GLDebugMessageARBCallbackI.POINTER_SIZE
            int r8 = r8 * r9
            long r8 = (long) r8
            long r7 = r7 + r8
            long r7 = org.lwjgl.system.MemoryUtil.memGetAddress(r7)
            long r7 = org.lwjgl.system.MemoryUtil.memGetAddress(r7)
            r0.invoke(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    void invoke(@org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLchar const *") long r6, @org.lwjgl.system.NativeType("void const *") long r8);

    static {
            int r0 = org.lwjgl.system.APIUtil.apiStdcall()
            org.lwjgl.system.libffi.FFIType r1 = org.lwjgl.system.libffi.LibFFI.ffi_type_void
            r2 = 7
            org.lwjgl.system.libffi.FFIType[] r2 = new org.lwjgl.system.libffi.FFIType[r2]
            r3 = r2
            r4 = 0
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint32
            r3[r4] = r5
            r3 = r2
            r4 = 1
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint32
            r3[r4] = r5
            r3 = r2
            r4 = 2
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint32
            r3[r4] = r5
            r3 = r2
            r4 = 3
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint32
            r3[r4] = r5
            r3 = r2
            r4 = 4
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r3[r4] = r5
            r3 = r2
            r4 = 5
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 6
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.APIUtil.apiCreateCIF(r0, r1, r2)
            org.lwjgl.opengl.GLDebugMessageARBCallbackI.CIF = r0
            return
    }
}
