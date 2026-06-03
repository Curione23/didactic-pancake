package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRCooperativeMatrix.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRCooperativeMatrix.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRCooperativeMatrix.class */
public class KHRCooperativeMatrix {
    public static final int VK_KHR_COOPERATIVE_MATRIX_SPEC_VERSION = 2;
    public static final java.lang.String VK_KHR_COOPERATIVE_MATRIX_EXTENSION_NAME = "VK_KHR_cooperative_matrix";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR = 1000506000;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR = 1000506001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_KHR = 1000506002;
    public static final int VK_COMPONENT_TYPE_FLOAT16_KHR = 0;
    public static final int VK_COMPONENT_TYPE_FLOAT32_KHR = 1;
    public static final int VK_COMPONENT_TYPE_FLOAT64_KHR = 2;
    public static final int VK_COMPONENT_TYPE_SINT8_KHR = 3;
    public static final int VK_COMPONENT_TYPE_SINT16_KHR = 4;
    public static final int VK_COMPONENT_TYPE_SINT32_KHR = 5;
    public static final int VK_COMPONENT_TYPE_SINT64_KHR = 6;
    public static final int VK_COMPONENT_TYPE_UINT8_KHR = 7;
    public static final int VK_COMPONENT_TYPE_UINT16_KHR = 8;
    public static final int VK_COMPONENT_TYPE_UINT32_KHR = 9;
    public static final int VK_COMPONENT_TYPE_UINT64_KHR = 10;
    public static final int VK_SCOPE_DEVICE_KHR = 1;
    public static final int VK_SCOPE_WORKGROUP_KHR = 2;
    public static final int VK_SCOPE_SUBGROUP_KHR = 3;
    public static final int VK_SCOPE_QUEUE_FAMILY_KHR = 5;

    protected KHRCooperativeMatrix() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nvkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r6, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkCooperativeMatrixPropertiesKHR *") org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = r7
            r2 = r7
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nvkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(org.lwjgl.vulkan.VkPhysicalDevice r8, @org.lwjgl.system.NativeType("uint32_t *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkCooperativeMatrixPropertiesKHR *") org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer r10) {
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            long r0 = r0.vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1f:
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3)
            return r0
    }
}
