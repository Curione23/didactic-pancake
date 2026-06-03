package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeEGL.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeEGL.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeEGL.class */
public class GLFWNativeEGL {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeEGL$Functions.class */
    public static final class Functions {
        public static final long GetEGLDisplay = 0;
        public static final long GetEGLContext = 0;
        public static final long GetEGLSurface = 0;
        public static final long GetEGLConfig = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetEGLDisplay"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeEGL.Functions.GetEGLDisplay = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetEGLContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeEGL.Functions.GetEGLContext = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetEGLSurface"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeEGL.Functions.GetEGLSurface = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetEGLConfig"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeEGL.Functions.GetEGLConfig = r0
                return
        }
    }

    public GLFWNativeEGL() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @org.lwjgl.system.NativeType("EGLDisplay")
    public static long glfwGetEGLDisplay() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented yet!"
            r1.<init>(r2)
            throw r0
    }

    @org.lwjgl.system.NativeType("EGLContext")
    public static long glfwGetEGLContext(@org.lwjgl.system.NativeType("GLFWwindow *") long r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented yet!"
            r1.<init>(r2)
            throw r0
    }

    @org.lwjgl.system.NativeType("EGLSurface")
    public static long glfwGetEGLSurface(@org.lwjgl.system.NativeType("GLFWwindow *") long r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented yet!"
            r1.<init>(r2)
            throw r0
    }

    @org.lwjgl.system.NativeType("EGLConfig")
    public static long glfwGetEGLConfig(@org.lwjgl.system.NativeType("GLFWwindow *") long r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented yet!"
            r1.<init>(r2)
            throw r0
    }
}
