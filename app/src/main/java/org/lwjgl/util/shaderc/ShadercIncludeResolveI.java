package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/ShadercIncludeResolveI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("shaderc_include_resolve_fn")
public interface ShadercIncludeResolveI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.Callback.Descriptor DESCRIPTOR = null;

    default org.lwjgl.system.Callback.Descriptor getDescriptor() {
            r2 = this;
            org.lwjgl.system.Callback$Descriptor r0 = org.lwjgl.util.shaderc.ShadercIncludeResolveI.DESCRIPTOR
            return r0
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long r14, long r16) {
            r13 = this;
            r0 = r13
            r1 = r16
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            r2 = r16
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResolveI.POINTER_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            r3 = r16
            r4 = 2
            int r5 = org.lwjgl.util.shaderc.ShadercIncludeResolveI.POINTER_SIZE
            int r4 = r4 * r5
            long r4 = (long) r4
            long r3 = r3 + r4
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            int r3 = org.lwjgl.system.MemoryUtil.memGetInt(r3)
            r4 = r16
            r5 = 3
            int r6 = org.lwjgl.util.shaderc.ShadercIncludeResolveI.POINTER_SIZE
            int r5 = r5 * r6
            long r5 = (long) r5
            long r4 = r4 + r5
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            r5 = r16
            r6 = 4
            int r7 = org.lwjgl.util.shaderc.ShadercIncludeResolveI.POINTER_SIZE
            int r6 = r6 * r7
            long r6 = (long) r6
            long r5 = r5 + r6
            long r5 = org.lwjgl.system.MemoryUtil.memGetAddress(r5)
            long r5 = org.lwjgl.system.MemoryUtil.memGetAddress(r5)
            long r0 = r0.invoke(r1, r2, r3, r4, r5)
            r18 = r0
            r0 = r14
            r1 = r18
            org.lwjgl.system.APIUtil.apiClosureRetP(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("shaderc_include_result *")
    long invoke(@org.lwjgl.system.NativeType("void *") long r1, @org.lwjgl.system.NativeType("char const *") long r3, int r5, @org.lwjgl.system.NativeType("char const *") long r6, @org.lwjgl.system.NativeType("size_t") long r8);

    static {
            org.lwjgl.system.Callback$Descriptor r0 = new org.lwjgl.system.Callback$Descriptor
            r1 = r0
            java.lang.invoke.MethodHandles$Lookup r2 = java.lang.invoke.MethodHandles.lookup()
            org.lwjgl.system.libffi.FFIType r3 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r4 = 5
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
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_sint32
            r5[r6] = r7
            r5 = r4
            r6 = 3
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r5[r6] = r7
            r5 = r4
            r6 = 4
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r5[r6] = r7
            org.lwjgl.system.libffi.FFICIF r3 = org.lwjgl.system.APIUtil.apiCreateCIF(r3, r4)
            r1.<init>(r2, r3)
            org.lwjgl.util.shaderc.ShadercIncludeResolveI.DESCRIPTOR = r0
            return
    }
}
