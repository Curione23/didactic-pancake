package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWVulkan.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWVulkan.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWVulkan.class */
public final class GLFWVulkan {
    private GLFWVulkan() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void glfwInitVulkanLoader(@javax.annotation.Nullable org.lwjgl.PointerBuffer r1) {
            return
    }

    public static boolean glfwVulkanSupported() {
            r0 = 1
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const **")
    public static org.lwjgl.PointerBuffer glfwGetRequiredInstanceExtensions() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r3 = r0
            r0 = r3
            r1 = 2
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r4 = r0
            r0 = r4
            java.lang.String r1 = "VK_KHR_surface"
            java.nio.ByteBuffer r1 = org.lwjgl.system.MemoryUtil.memUTF8(r1)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            java.lang.String r1 = "VK_KHR_android_surface"
            java.nio.ByteBuffer r1 = org.lwjgl.system.MemoryUtil.memUTF8(r1)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            org.lwjgl.system.CustomBuffer r0 = r0.flip()
            r0 = r4
            return r0
    }

    public static int glfwCreateWindowSurface(org.lwjgl.vulkan.VkInstance r5, long r6, @javax.annotation.Nullable org.lwjgl.vulkan.VkAllocationCallbacks r8, java.nio.LongBuffer r9) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "GLFWVulkan: glfwCreateWindowSurface window=0x"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r9
            if (r0 == 0) goto L2a
            r0 = r9
            int r0 = r0.remaining()
            r1 = 1
            if (r0 >= r1) goto L35
        L2a:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "GLFWVulkan: invalid surface buffer"
            r0.println(r1)
            r0 = -3
            return r0
        L35:
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L46
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "GLFWVulkan: window is NULL"
            r0.println(r1)
            r0 = -3
            return r0
        L46:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r10 = r0
            r0 = r10
            org.lwjgl.vulkan.VkAndroidSurfaceCreateInfoKHR r0 = org.lwjgl.vulkan.VkAndroidSurfaceCreateInfoKHR.calloc(r0)     // Catch: java.lang.Throwable -> L99
            r1 = 1000008000(0x3b9ae940, float:0.0047275126)
            org.lwjgl.vulkan.VkAndroidSurfaceCreateInfoKHR r0 = r0.sType(r1)     // Catch: java.lang.Throwable -> L99
            r1 = 0
            org.lwjgl.vulkan.VkAndroidSurfaceCreateInfoKHR r0 = r0.pNext(r1)     // Catch: java.lang.Throwable -> L99
            r1 = 0
            org.lwjgl.vulkan.VkAndroidSurfaceCreateInfoKHR r0 = r0.flags(r1)     // Catch: java.lang.Throwable -> L99
            r1 = r6
            org.lwjgl.vulkan.VkAndroidSurfaceCreateInfoKHR r0 = r0.window(r1)     // Catch: java.lang.Throwable -> L99
            r11 = r0
            r0 = r5
            r1 = r11
            r2 = r8
            r3 = r9
            int r0 = org.lwjgl.vulkan.KHRAndroidSurface.vkCreateAndroidSurfaceKHR(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L99
            r12 = r0
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "GLFWVulkan: vkCreateAndroidSurfaceKHR result="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L99
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L99
            r0.println(r1)     // Catch: java.lang.Throwable -> L99
            r0 = r12
            r13 = r0
            r0 = r10
            if (r0 == 0) goto L96
            r0 = r10
            r0.close()
        L96:
            r0 = r13
            return r0
        L99:
            r11 = move-exception
            r0 = r10
            if (r0 == 0) goto Lb1
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> La8
            goto Lb1
        La8:
            r12 = move-exception
            r0 = r11
            r1 = r12
            r0.addSuppressed(r1)
        Lb1:
            r0 = r11
            throw r0
    }

    public static boolean glfwGetPhysicalDevicePresentationSupport(org.lwjgl.vulkan.VkInstance r2, org.lwjgl.vulkan.VkPhysicalDevice r3, int r4) {
            r0 = 1
            return r0
    }
}
