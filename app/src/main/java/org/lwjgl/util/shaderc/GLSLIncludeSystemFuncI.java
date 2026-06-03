package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLIncludeSystemFuncI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("glsl_include_system_func")
public interface GLSLIncludeSystemFuncI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.Callback.Descriptor DESCRIPTOR = null;

    default org.lwjgl.system.Callback.Descriptor getDescriptor() {
            r2 = this;
            org.lwjgl.system.Callback$Descriptor r0 = org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI.DESCRIPTOR
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
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI.POINTER_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            r3 = r15
            r4 = 2
            int r5 = org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI.POINTER_SIZE
            int r4 = r4 * r5
            long r4 = (long) r4
            long r3 = r3 + r4
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            r4 = r15
            r5 = 3
            int r6 = org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI.POINTER_SIZE
            int r5 = r5 * r6
            long r5 = (long) r5
            long r4 = r4 + r5
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            long r0 = r0.invoke(r1, r2, r3, r4)
            r17 = r0
            r0 = r13
            r1 = r17
            org.lwjgl.system.APIUtil.apiClosureRetP(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("glsl_include_result_t *")
    long invoke(@org.lwjgl.system.NativeType("void *") long r1, @org.lwjgl.system.NativeType("char const *") long r3, @org.lwjgl.system.NativeType("char const *") long r5, @org.lwjgl.system.NativeType("size_t") long r7);

    static {
            org.lwjgl.system.Callback$Descriptor r0 = new org.lwjgl.system.Callback$Descriptor
            r1 = r0
            java.lang.invoke.MethodHandles$Lookup r2 = java.lang.invoke.MethodHandles.lookup()
            org.lwjgl.system.libffi.FFIType r3 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r4 = 4
            org.lwjgl.system.libffi.FFIType[] r4 = new org.lwjgl.system.libffi.FFIType[r4]
            r5 = r4
            r6 = 0
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r5[r6] = r7
            r5 = r4
            r6 = 1
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r5[r6] = r7
            r5 = r4
            r6 = 2
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r5[r6] = r7
            r5 = r4
            r6 = 3
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r5[r6] = r7
            org.lwjgl.system.libffi.FFICIF r3 = org.lwjgl.system.APIUtil.apiCreateCIF(r3, r4)
            r1.<init>(r2, r3)
            org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI.DESCRIPTOR = r0
            return
    }
}
