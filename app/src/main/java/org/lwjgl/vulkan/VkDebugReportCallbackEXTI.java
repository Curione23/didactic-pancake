package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXTI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXTI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugReportCallbackEXTI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("PFN_vkDebugReportCallbackEXT")
public interface VkDebugReportCallbackEXTI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.libffi.FFICIF CIF = null;

    @Override // org.lwjgl.system.CallbackI
    default org.lwjgl.system.libffi.FFICIF getCallInterface() {
            r2 = this;
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.vulkan.VkDebugReportCallbackEXTI.CIF
            return r0
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long r18, long r20) {
            r17 = this;
            r0 = r17
            r1 = r20
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            int r1 = org.lwjgl.system.MemoryUtil.memGetInt(r1)
            r2 = r20
            int r3 = org.lwjgl.vulkan.VkDebugReportCallbackEXTI.POINTER_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            int r2 = org.lwjgl.system.MemoryUtil.memGetInt(r2)
            r3 = r20
            r4 = 2
            int r5 = org.lwjgl.vulkan.VkDebugReportCallbackEXTI.POINTER_SIZE
            int r4 = r4 * r5
            long r4 = (long) r4
            long r3 = r3 + r4
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            long r3 = org.lwjgl.system.MemoryUtil.memGetLong(r3)
            r4 = r20
            r5 = 3
            int r6 = org.lwjgl.vulkan.VkDebugReportCallbackEXTI.POINTER_SIZE
            int r5 = r5 * r6
            long r5 = (long) r5
            long r4 = r4 + r5
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            r5 = r20
            r6 = 4
            int r7 = org.lwjgl.vulkan.VkDebugReportCallbackEXTI.POINTER_SIZE
            int r6 = r6 * r7
            long r6 = (long) r6
            long r5 = r5 + r6
            long r5 = org.lwjgl.system.MemoryUtil.memGetAddress(r5)
            int r5 = org.lwjgl.system.MemoryUtil.memGetInt(r5)
            r6 = r20
            r7 = 5
            int r8 = org.lwjgl.vulkan.VkDebugReportCallbackEXTI.POINTER_SIZE
            int r7 = r7 * r8
            long r7 = (long) r7
            long r6 = r6 + r7
            long r6 = org.lwjgl.system.MemoryUtil.memGetAddress(r6)
            long r6 = org.lwjgl.system.MemoryUtil.memGetAddress(r6)
            r7 = r20
            r8 = 6
            int r9 = org.lwjgl.vulkan.VkDebugReportCallbackEXTI.POINTER_SIZE
            int r8 = r8 * r9
            long r8 = (long) r8
            long r7 = r7 + r8
            long r7 = org.lwjgl.system.MemoryUtil.memGetAddress(r7)
            long r7 = org.lwjgl.system.MemoryUtil.memGetAddress(r7)
            r8 = r20
            r9 = 7
            int r10 = org.lwjgl.vulkan.VkDebugReportCallbackEXTI.POINTER_SIZE
            int r9 = r9 * r10
            long r9 = (long) r9
            long r8 = r8 + r9
            long r8 = org.lwjgl.system.MemoryUtil.memGetAddress(r8)
            long r8 = org.lwjgl.system.MemoryUtil.memGetAddress(r8)
            int r0 = r0.invoke(r1, r2, r3, r4, r5, r6, r7, r8)
            r22 = r0
            r0 = r18
            r1 = r22
            org.lwjgl.system.APIUtil.apiClosureRet(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("VkBool32")
    int invoke(@org.lwjgl.system.NativeType("VkDebugReportFlagsEXT") int r1, @org.lwjgl.system.NativeType("VkDebugReportObjectTypeEXT") int r2, @org.lwjgl.system.NativeType("uint64_t") long r3, @org.lwjgl.system.NativeType("size_t") long r5, @org.lwjgl.system.NativeType("int32_t") int r7, @org.lwjgl.system.NativeType("char const *") long r8, @org.lwjgl.system.NativeType("char const *") long r10, @org.lwjgl.system.NativeType("void *") long r12);

    static {
            int r0 = org.lwjgl.system.APIUtil.apiStdcall()
            org.lwjgl.system.libffi.FFIType r1 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint32
            r2 = 8
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
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint64
            r3[r4] = r5
            r3 = r2
            r4 = 3
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
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
            r3 = r2
            r4 = 7
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.APIUtil.apiCreateCIF(r0, r1, r2)
            org.lwjgl.vulkan.VkDebugReportCallbackEXTI.CIF = r0
            return
    }
}
