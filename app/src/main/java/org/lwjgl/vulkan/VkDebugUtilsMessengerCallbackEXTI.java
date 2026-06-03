package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackEXTI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackEXTI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackEXTI.class */
@java.lang.FunctionalInterface
@org.lwjgl.system.NativeType("PFN_vkDebugUtilsMessengerCallbackEXT")
public interface VkDebugUtilsMessengerCallbackEXTI extends org.lwjgl.system.CallbackI {
    public static final org.lwjgl.system.libffi.FFICIF CIF = null;

    @Override // org.lwjgl.system.CallbackI
    default org.lwjgl.system.libffi.FFICIF getCallInterface() {
            r2 = this;
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackEXTI.CIF
            return r0
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long r11, long r13) {
            r10 = this;
            r0 = r10
            r1 = r13
            long r1 = org.lwjgl.system.MemoryUtil.memGetAddress(r1)
            int r1 = org.lwjgl.system.MemoryUtil.memGetInt(r1)
            r2 = r13
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackEXTI.POINTER_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r2 = org.lwjgl.system.MemoryUtil.memGetAddress(r2)
            int r2 = org.lwjgl.system.MemoryUtil.memGetInt(r2)
            r3 = r13
            r4 = 2
            int r5 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackEXTI.POINTER_SIZE
            int r4 = r4 * r5
            long r4 = (long) r4
            long r3 = r3 + r4
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            long r3 = org.lwjgl.system.MemoryUtil.memGetAddress(r3)
            r4 = r13
            r5 = 3
            int r6 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackEXTI.POINTER_SIZE
            int r5 = r5 * r6
            long r5 = (long) r5
            long r4 = r4 + r5
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            long r4 = org.lwjgl.system.MemoryUtil.memGetAddress(r4)
            int r0 = r0.invoke(r1, r2, r3, r4)
            r15 = r0
            r0 = r11
            r1 = r15
            org.lwjgl.system.APIUtil.apiClosureRet(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("VkBool32")
    int invoke(@org.lwjgl.system.NativeType("VkDebugUtilsMessageSeverityFlagBitsEXT") int r1, @org.lwjgl.system.NativeType("VkDebugUtilsMessageTypeFlagsEXT") int r2, @org.lwjgl.system.NativeType("VkDebugUtilsMessengerCallbackDataEXT const *") long r3, @org.lwjgl.system.NativeType("void *") long r5);

    static {
            int r0 = org.lwjgl.system.APIUtil.apiStdcall()
            org.lwjgl.system.libffi.FFIType r1 = org.lwjgl.system.libffi.LibFFI.ffi_type_uint32
            r2 = 4
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
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            r3 = r2
            r4 = 3
            org.lwjgl.system.libffi.FFIType r5 = org.lwjgl.system.libffi.LibFFI.ffi_type_pointer
            r3[r4] = r5
            org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.APIUtil.apiCreateCIF(r0, r1, r2)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackEXTI.CIF = r0
            return
    }
}
