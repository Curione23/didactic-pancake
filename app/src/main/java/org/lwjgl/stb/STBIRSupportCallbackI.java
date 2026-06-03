package org.lwjgl.stb;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIRSupportCallbackI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("stbir__support_callback *")
public interface STBIRSupportCallbackI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.Callback.Descriptor DESCRIPTOR = null;

    default org.lwjgl.system.Callback.Descriptor getDescriptor() {
            r2 = this;
            org.lwjgl.system.Callback$Descriptor r0 = org.lwjgl.stb.STBIRSupportCallbackI.DESCRIPTOR
            return r0
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long r8, long r10) {
            r7 = this;
            r0 = r7
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            float r1 = org.lwjgl.system.MemoryUtil.memGetFloat(r1)
            r2 = r10
            int r3 = org.lwjgl.stb.STBIRSupportCallbackI.POINTER_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            float r0 = r0.invoke(r1, r2)
            r12 = r0
            r0 = r8
            r1 = r12
            org.lwjgl.system.APIUtil.apiClosureRet(r0, r1)
            return
    }

    float invoke(float r1, @org.lwjgl.system.NativeType("void *") long r2);

    static {
            org.lwjgl.system.Callback$Descriptor r0 = new org.lwjgl.system.Callback$Descriptor
            r1 = r0
            java.lang.invoke.MethodHandles$Lookup r2 = java.lang.invoke.MethodHandles.lookup()
            org.lwjgl.system.libffi.FFIType r3 = org.lwjgl.system.libffi.LibFFI.ffi_type_float
            r4 = 2
            org.lwjgl.system.libffi.FFIType[] r4 = new org.lwjgl.system.libffi.FFIType[r4]
            r5 = r4
            r6 = 0
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_float
            r5[r6] = r7
            r5 = r4
            r6 = 1
            org.lwjgl.system.libffi.FFIType r7 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r5[r6] = r7
            org.lwjgl.system.libffi.FFICIF r3 = org.lwjgl.system.APIUtil.apiCreateCIF(r3, r4)
            r1.<init>(r2, r3)
            org.lwjgl.stb.STBIRSupportCallbackI.DESCRIPTOR = r0
            return
    }
}
