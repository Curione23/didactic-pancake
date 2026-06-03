package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeOSMesa.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeOSMesa.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeOSMesa.class */
public class GLFWNativeOSMesa {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeOSMesa$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeOSMesa$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeOSMesa$Functions.class */
    public static final class Functions {
        public static final long GetOSMesaColorBuffer = 0;
        public static final long GetOSMesaDepthBuffer = 0;
        public static final long GetOSMesaContext = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetOSMesaColorBuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeOSMesa.Functions.GetOSMesaColorBuffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetOSMesaDepthBuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeOSMesa.Functions.GetOSMesaDepthBuffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetOSMesaContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeOSMesa.Functions.GetOSMesaContext = r0
                return
        }
    }

    public GLFWNativeOSMesa() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean glfwGetOSMesaColorBuffer(@org.lwjgl.system.NativeType("GLFWwindow *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r9) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented yet!"
            r1.<init>(r2)
            throw r0
    }

    public static int glfwGetOSMesaDepthBuffer(@org.lwjgl.system.NativeType("GLFWwindow *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r9) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented yet!"
            r1.<init>(r2)
            throw r0
    }

    @org.lwjgl.system.NativeType("OSMesaContext")
    public static long glfwGetOSMesaContext(@org.lwjgl.system.NativeType("GLFWwindow *") long r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented yet!"
            r1.<init>(r2)
            throw r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean glfwGetOSMesaColorBuffer(@org.lwjgl.system.NativeType("GLFWwindow *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r9) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented yet!"
            r1.<init>(r2)
            throw r0
    }

    public static int glfwGetOSMesaDepthBuffer(@org.lwjgl.system.NativeType("GLFWwindow *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r9) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented yet!"
            r1.<init>(r2)
            throw r0
    }
}
