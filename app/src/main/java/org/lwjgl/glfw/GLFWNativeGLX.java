package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeGLX.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeGLX.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeGLX.class */
public class GLFWNativeGLX {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeGLX$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeGLX$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWNativeGLX$Functions.class */
    public static final class Functions {
        public static final long GetGLXContext = 0;
        public static final long GetGLXWindow = 0;
        public static final long GetGLXFBConfig = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetGLXContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeGLX.Functions.GetGLXContext = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetGLXWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeGLX.Functions.GetGLXWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
                java.lang.String r1 = "glfwGetGLXFBConfig"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFWNativeGLX.Functions.GetGLXFBConfig = r0
                return
        }
    }

    protected GLFWNativeGLX() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("GLXContext")
    public static long glfwGetGLXContext(@org.lwjgl.system.NativeType("GLFWwindow *") long r5) {
            long r0 = org.lwjgl.glfw.GLFWNativeGLX.Functions.GetGLXContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXWindow")
    public static long glfwGetGLXWindow(@org.lwjgl.system.NativeType("GLFWwindow *") long r5) {
            long r0 = org.lwjgl.glfw.GLFWNativeGLX.Functions.GetGLXWindow
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXWindow")
    public static long glfwGetGLXFBConfig(@org.lwjgl.system.NativeType("GLFWwindow *") long r5) {
            long r0 = org.lwjgl.glfw.GLFWNativeGLX.Functions.GetGLXFBConfig
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    public static void setPath(org.lwjgl.system.FunctionProvider r2) {
            r0 = r2
            boolean r0 = r0 instanceof org.lwjgl.system.SharedLibrary
            if (r0 != 0) goto Ld
            java.lang.String r0 = "GLFW OpenGL path override not set: Function provider is not a shared library."
            org.lwjgl.system.APIUtil.apiLog(r0)
            return
        Ld:
            r0 = r2
            org.lwjgl.system.SharedLibrary r0 = (org.lwjgl.system.SharedLibrary) r0
            java.lang.String r0 = r0.getPath()
            r3 = r0
            r0 = r3
            if (r0 != 0) goto L21
            java.lang.String r0 = "GLFW OpenGL path override not set: Could not resolve the shared library path."
            org.lwjgl.system.APIUtil.apiLog(r0)
            return
        L21:
            r0 = r3
            setPath(r0)
            return
    }

    public static void setPath(@javax.annotation.Nullable java.lang.String r5) {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.getLibrary()
            java.lang.String r1 = "_glfw_opengl_library"
            long r0 = r0.getFunctionAddress(r1)
            r6 = r0
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L17
            java.lang.String r0 = "GLFW OpenGL path override not set: Could not resolve override symbol."
            org.lwjgl.system.APIUtil.apiLog(r0)
            return
        L17:
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r8 = r0
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L26
            r0 = r8
            org.lwjgl.system.MemoryUtil.nmemFree(r0)
        L26:
            r0 = r6
            r1 = r5
            if (r1 != 0) goto L2f
            r1 = 0
            goto L36
        L2f:
            r1 = r5
            java.nio.ByteBuffer r1 = org.lwjgl.system.MemoryUtil.memUTF8(r1)
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
        L36:
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }
}
