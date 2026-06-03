package org.lwjgl.glfw;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWPreeditCallbackI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("GLFWpreeditfun")
public interface GLFWPreeditCallbackI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.Callback.Descriptor DESCRIPTOR = null;

    default org.lwjgl.system.Callback.Descriptor getDescriptor() {
            r2 = this;
            org.lwjgl.system.Callback$Descriptor r0 = org.lwjgl.glfw.GLFWPreeditCallbackI.DESCRIPTOR
            return r0
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long r16, long r18) {
            r15 = this;
            r0 = r15
            r1 = r18
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            r2 = r18
            int r3 = org.lwjgl.glfw.GLFWPreeditCallbackI.POINTER_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            int r2 = org.lwjgl.system.MemoryUtil.memGetInt(r2)
            r3 = r18
            r4 = 2
            int r5 = org.lwjgl.glfw.GLFWPreeditCallbackI.POINTER_SIZE
            int r4 = r4 * r5
            long r4 = (long) r4
            long r3 = r3 + r4
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            r4 = r18
            r5 = 3
            int r6 = org.lwjgl.glfw.GLFWPreeditCallbackI.POINTER_SIZE
            int r5 = r5 * r6
            long r5 = (long) r5
            long r4 = r4 + r5
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            int r4 = org.lwjgl.system.MemoryUtil.memGetInt(r4)
            r5 = r18
            r6 = 4
            int r7 = org.lwjgl.glfw.GLFWPreeditCallbackI.POINTER_SIZE
            int r6 = r6 * r7
            long r6 = (long) r6
            long r5 = r5 + r6
            long r5 = org.lwjgl.system.MemoryUtil.memGetAddress(r5)
            long r5 = org.lwjgl.system.MemoryUtil.memGetAddress(r5)
            r6 = r18
            r7 = 5
            int r8 = org.lwjgl.glfw.GLFWPreeditCallbackI.POINTER_SIZE
            int r7 = r7 * r8
            long r7 = (long) r7
            long r6 = r6 + r7
            long r6 = org.lwjgl.system.MemoryUtil.memGetAddress(r6)
            int r6 = org.lwjgl.system.MemoryUtil.memGetInt(r6)
            r7 = r18
            r8 = 6
            int r9 = org.lwjgl.glfw.GLFWPreeditCallbackI.POINTER_SIZE
            int r8 = r8 * r9
            long r8 = (long) r8
            long r7 = r7 + r8
            long r7 = org.lwjgl.system.MemoryUtil.memGetAddress(r7)
            int r7 = org.lwjgl.system.MemoryUtil.memGetInt(r7)
            r0.invoke(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    void invoke(@org.lwjgl.system.NativeType("GLFWwindow *") long r1, int r3, @org.lwjgl.system.NativeType("unsigned int *") long r4, int r6, @org.lwjgl.system.NativeType("int *") long r7, int r9, int r10);

    static {
            org.lwjgl.system.Callback$Descriptor r0 = new org.lwjgl.system.Callback$Descriptor
            r1 = r0
            java.lang.invoke.MethodHandles$Lookup r2 = java.lang.invoke.MethodHandles.lookup()
            org.lwjgl.system.libffi.FFIType r3 = org.lwjgl.system.libffi.LibFFI.ffi_type_void
            r4 = 7
            org.lwjgl.system.libffi.FFIType[] r4 = new org.lwjgl.system.libffi.FFIType[r4]
            r5 = r4
            r6 = 0
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r5[r6] = r7
            r5 = r4
            r6 = 1
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r5[r6] = r7
            r5 = r4
            r6 = 2
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r5[r6] = r7
            r5 = r4
            r6 = 3
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r5[r6] = r7
            r5 = r4
            r6 = 4
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r5[r6] = r7
            r5 = r4
            r6 = 5
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r5[r6] = r7
            r5 = r4
            r6 = 6
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r5[r6] = r7
            org.lwjgl.system.libffi.FFICIF r3 = org.lwjgl.system.APIUtil.apiCreateCIF(r3, r4)
            r1.<init>(r2, r3)
            org.lwjgl.glfw.GLFWPreeditCallbackI.DESCRIPTOR = r0
            return
    }
}
