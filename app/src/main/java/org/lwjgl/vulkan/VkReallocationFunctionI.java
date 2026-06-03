package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkReallocationFunctionI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkReallocationFunctionI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkReallocationFunctionI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("PFN_vkReallocationFunction")
public interface VkReallocationFunctionI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.libffi.FFICIF CIF = null;

    @Override // org.lwjgl.system.CallbackI
    default org.lwjgl.system.libffi.FFICIF getCallInterface() {
            r2 = this;
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.vulkan.VkReallocationFunctionI.CIF
            return r0
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long r15, long r17) {
            r14 = this;
            r0 = r14
            r1 = r17
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            r2 = r17
            int r3 = org.lwjgl.vulkan.VkReallocationFunctionI.POINTER_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            r3 = r17
            r4 = 2
            int r5 = org.lwjgl.vulkan.VkReallocationFunctionI.POINTER_SIZE
            int r4 = r4 * r5
            long r4 = (long) r4
            long r3 = r3 + r4
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            r4 = r17
            r5 = 3
            int r6 = org.lwjgl.vulkan.VkReallocationFunctionI.POINTER_SIZE
            int r5 = r5 * r6
            long r5 = (long) r5
            long r4 = r4 + r5
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            r5 = r17
            r6 = 4
            int r7 = org.lwjgl.vulkan.VkReallocationFunctionI.POINTER_SIZE
            int r6 = r6 * r7
            long r6 = (long) r6
            long r5 = r5 + r6
            long r5 = org.lwjgl.system.MemoryUtil.memGetAddress(r5)
            int r5 = org.lwjgl.system.MemoryUtil.memGetInt(r5)
            long r0 = r0.invoke(r1, r2, r3, r4, r5)
            r19 = r0
            r0 = r15
            r1 = r19
            org.lwjgl.system.APIUtil.apiClosureRetP(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void *")
    long invoke(@org.lwjgl.system.NativeType("void *") long r1, @org.lwjgl.system.NativeType("void *") long r3, @org.lwjgl.system.NativeType("size_t") long r5, @org.lwjgl.system.NativeType("size_t") long r7, @org.lwjgl.system.NativeType("VkSystemAllocationScope") int r9);

    static {
            int r0 = org.lwjgl.system.APIUtil.apiStdcall()
            org.lwjgl.system.libffi.FFIType r1 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r2 = 5
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
            r3 = r2
            r4 = 4
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint32
            r3[r4] = r5
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.APIUtil.apiCreateCIF(r0, r1, r2)
            org.lwjgl.vulkan.VkReallocationFunctionI.CIF = r0
            return
    }
}
