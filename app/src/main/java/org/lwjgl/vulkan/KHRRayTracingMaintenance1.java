package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRRayTracingMaintenance1.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRRayTracingMaintenance1.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRRayTracingMaintenance1.class */
public class KHRRayTracingMaintenance1 {
    public static final int VK_KHR_RAY_TRACING_MAINTENANCE_1_SPEC_VERSION = 1;
    public static final java.lang.String VK_KHR_RAY_TRACING_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_ray_tracing_maintenance1";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR = 1000386000;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_BOTTOM_LEVEL_POINTERS_KHR = 1000386000;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SIZE_KHR = 1000386001;
    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_COPY_BIT_KHR = 268435456;
    public static final long VK_ACCESS_2_SHADER_BINDING_TABLE_READ_BIT_KHR = 1099511627776L;

    protected KHRRayTracingMaintenance1() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void vkCmdTraceRaysIndirect2KHR(org.lwjgl.vulkan.VkCommandBuffer r7, @org.lwjgl.system.NativeType("VkDeviceAddress") long r8) {
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkCmdTraceRaysIndirect2KHR
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            org.lwjgl.system.JNI.callPJV(r0, r1, r2)
            return
    }
}
