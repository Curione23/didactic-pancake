package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeWin32.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeWin32.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeWin32.class */
public class GLFWNativeWin32 {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeWin32$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeWin32$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeWin32$Functions.class */
    public static final class Functions {
        public static final long GetWin32Adapter = 0;
        public static final long GetWin32Monitor = 0;
        public static final long GetWin32Window = 0;
        public static final long AttachWin32Window = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetWin32Adapter"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeWin32.Functions.GetWin32Adapter = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetWin32Monitor"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeWin32.Functions.GetWin32Monitor = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetWin32Window"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeWin32.Functions.GetWin32Window = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwAttachWin32Window"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeWin32.Functions.AttachWin32Window = r0
                return
        }
    }

    public GLFWNativeWin32() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String glfwGetWin32Adapter(@org.lwjgl.system.NativeType("GLFWmonitor *") long r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String glfwGetWin32Monitor(@org.lwjgl.system.NativeType("GLFWmonitor *") long r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }

    @org.lwjgl.system.NativeType("HWND")
    public static long glfwGetWin32Window(@org.lwjgl.system.NativeType("GLFWwindow *") long r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }

    @org.lwjgl.system.NativeType("GLFWwindow *")
    public static long glfwAttachWin32Window(@org.lwjgl.system.NativeType("HWND") long r4, @org.lwjgl.system.NativeType("GLFWwindow *") long r6) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }
}
