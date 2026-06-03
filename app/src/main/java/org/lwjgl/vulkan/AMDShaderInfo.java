package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDShaderInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDShaderInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/AMDShaderInfo.class */
public class AMDShaderInfo {
    public static final int VK_AMD_SHADER_INFO_SPEC_VERSION = 1;
    public static final java.lang.String VK_AMD_SHADER_INFO_EXTENSION_NAME = "VK_AMD_shader_info";
    public static final int VK_SHADER_INFO_TYPE_STATISTICS_AMD = 0;
    public static final int VK_SHADER_INFO_TYPE_BINARY_AMD = 1;
    public static final int VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD = 2;

    protected AMDShaderInfo() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetShaderInfoAMD(org.lwjgl.vulkan.VkDevice r13, long r14, int r16, int r17, long r18, long r20) {
            r0 = r13
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetShaderInfoAMD
            r22 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r22
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r13
            long r0 = r0.address()
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r20
            r6 = r22
            int r0 = org.lwjgl.system.JNI.callPJPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetShaderInfoAMD(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkPipeline") long r11, @org.lwjgl.system.NativeType("VkShaderStageFlagBits") int r13, @org.lwjgl.system.NativeType("VkShaderInfoTypeAMD") int r14, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = r15
            r2 = r15
            int r2 = r2.position()
            long r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1b:
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            int r0 = nvkGetShaderInfoAMD(r0, r1, r2, r3, r4, r5)
            return r0
    }
}
