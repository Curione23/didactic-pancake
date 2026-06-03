package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeX11.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeX11.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeX11.class */
public class GLFWNativeX11 {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeX11$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeX11$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeX11$Functions.class */
    public static final class Functions {
        public static final long GetX11Display = 0;
        public static final long GetX11Adapter = 0;
        public static final long GetX11Monitor = 0;
        public static final long GetX11Window = 0;
        public static final long SetX11SelectionString = 0;
        public static final long GetX11SelectionString = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetX11Display"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeX11.Functions.GetX11Display = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetX11Adapter"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeX11.Functions.GetX11Adapter = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetX11Monitor"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeX11.Functions.GetX11Monitor = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetX11Window"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeX11.Functions.GetX11Window = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwSetX11SelectionString"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeX11.Functions.SetX11SelectionString = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetX11SelectionString"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeX11.Functions.GetX11SelectionString = r0
                return
        }
    }

    public GLFWNativeX11() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @org.lwjgl.system.NativeType("Display *")
    public static long glfwGetX11Display() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }

    @org.lwjgl.system.NativeType("RRCrtc")
    public static long glfwGetX11Adapter(@org.lwjgl.system.NativeType("GLFWmonitor *") long r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }

    @org.lwjgl.system.NativeType("RROutput")
    public static long glfwGetX11Monitor(@org.lwjgl.system.NativeType("GLFWmonitor *") long r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }

    @org.lwjgl.system.NativeType("Window")
    public static long glfwGetX11Window(@org.lwjgl.system.NativeType("GLFWwindow *") long r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }

    public static void glfwSetX11SelectionString(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }

    public static void glfwSetX11SelectionString(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String glfwGetX11SelectionString() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }
}
