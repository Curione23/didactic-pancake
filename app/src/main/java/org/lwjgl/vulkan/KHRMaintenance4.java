package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance4.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance4.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/KHRMaintenance4.class */
public class KHRMaintenance4 {
    public static final int VK_KHR_MAINTENANCE_4_SPEC_VERSION = 2;
    public static final java.lang.String VK_KHR_MAINTENANCE_4_EXTENSION_NAME = "VK_KHR_maintenance4";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR = 1000413000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES_KHR = 1000413001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS_KHR = 1000413002;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR = 1000413003;
    public static final int VK_IMAGE_ASPECT_NONE_KHR = 0;

    protected KHRMaintenance4() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nvkGetDeviceBufferMemoryRequirementsKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceBufferMemoryRequirementsKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDeviceBufferMemoryRequirementsKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeviceBufferMemoryRequirements const *") org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetDeviceBufferMemoryRequirementsKHR(r0, r1, r2)
            return
    }

    public static void nvkGetDeviceImageMemoryRequirementsKHR(org.lwjgl.vulkan.VkDevice r9, long r10, long r12) {
            r0 = r9
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceImageMemoryRequirementsKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.validate(r0)
        L19:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            r3 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void vkGetDeviceImageMemoryRequirementsKHR(org.lwjgl.vulkan.VkDevice r6, @org.lwjgl.system.NativeType("VkDeviceImageMemoryRequirements const *") org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r7, @org.lwjgl.system.NativeType("VkMemoryRequirements2 *") org.lwjgl.vulkan.VkMemoryRequirements2 r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = r2.address()
            nvkGetDeviceImageMemoryRequirementsKHR(r0, r1, r2)
            return
    }

    public static void nvkGetDeviceImageSparseMemoryRequirementsKHR(org.lwjgl.vulkan.VkDevice r11, long r12, long r14, long r16) {
            r0 = r11
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceImageSparseMemoryRequirementsKHR
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.validate(r0)
        L19:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void vkGetDeviceImageSparseMemoryRequirementsKHR(org.lwjgl.vulkan.VkDevice r8, @org.lwjgl.system.NativeType("VkDeviceImageMemoryRequirements const *") org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r9, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageMemoryRequirements2 *") org.lwjgl.vulkan.VkSparseImageMemoryRequirements2.Buffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = r10
            r2 = r10
            int r2 = r2.position()
            int r1 = r1.get(r2)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r8
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nvkGetDeviceImageSparseMemoryRequirementsKHR(r0, r1, r2, r3)
            return
    }

    public static void vkGetDeviceImageSparseMemoryRequirementsKHR(org.lwjgl.vulkan.VkDevice r10, @org.lwjgl.system.NativeType("VkDeviceImageMemoryRequirements const *") org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r11, @org.lwjgl.system.NativeType("uint32_t *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageMemoryRequirements2 *") org.lwjgl.vulkan.VkSparseImageMemoryRequirements2.Buffer r13) {
            r0 = r10
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            long r0 = r0.vkGetDeviceImageSparseMemoryRequirementsKHR
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L28
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r11
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.validate(r0)
        L28:
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4)
            return
    }
}
