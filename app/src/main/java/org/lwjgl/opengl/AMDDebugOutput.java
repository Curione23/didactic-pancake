package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDDebugOutput.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDDebugOutput.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDDebugOutput.class */
public class AMDDebugOutput {
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_AMD = 37187;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_AMD = 37188;
    public static final int GL_DEBUG_LOGGED_MESSAGES_AMD = 37189;
    public static final int GL_DEBUG_SEVERITY_HIGH_AMD = 37190;
    public static final int GL_DEBUG_SEVERITY_MEDIUM_AMD = 37191;
    public static final int GL_DEBUG_SEVERITY_LOW_AMD = 37192;
    public static final int GL_DEBUG_CATEGORY_API_ERROR_AMD = 37193;
    public static final int GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD = 37194;
    public static final int GL_DEBUG_CATEGORY_DEPRECATION_AMD = 37195;
    public static final int GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD = 37196;
    public static final int GL_DEBUG_CATEGORY_PERFORMANCE_AMD = 37197;
    public static final int GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD = 37198;
    public static final int GL_DEBUG_CATEGORY_APPLICATION_AMD = 37199;
    public static final int GL_DEBUG_CATEGORY_OTHER_AMD = 37200;

    protected AMDDebugOutput() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglDebugMessageEnableAMD(int r0, int r1, int r2, long r3, boolean r5);

    public static void glDebugMessageEnableAMD(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r10
            nglDebugMessageEnableAMD(r0, r1, r2, r3, r4)
            return
    }

    public static void glDebugMessageEnableAMD(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint const *") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r9
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L2a
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = 1
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2a
            r4 = r10
            nglDebugMessageEnableAMD(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L2a
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            goto L36
        L2a:
            r14 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r14
            throw r0
        L36:
            return
    }

    public static native void nglDebugMessageInsertAMD(int r0, int r1, int r2, int r3, long r4);

    public static void glDebugMessageInsertAMD(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglDebugMessageInsertAMD(r0, r1, r2, r3, r4)
            return
    }

    public static void glDebugMessageInsertAMD(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r10
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L30
            r13 = r0
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L30
            r14 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r14
            nglDebugMessageInsertAMD(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L30
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            goto L3c
        L30:
            r16 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r16
            throw r0
        L3c:
            return
    }

    public static native void nglDebugMessageCallbackAMD(long r0, long r2);

    public static void glDebugMessageCallbackAMD(@javax.annotation.Nullable @org.lwjgl.system.NativeType("GLDEBUGPROCAMD") org.lwjgl.opengl.GLDebugMessageAMDCallbackI r5, @org.lwjgl.system.NativeType("void *") long r6) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r6
            nglDebugMessageCallbackAMD(r0, r1)
            return
    }

    public static native int nglGetDebugMessageLogAMD(int r0, int r1, long r2, long r4, long r6, long r8, long r10);

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetDebugMessageLogAMD(@org.lwjgl.system.NativeType("GLuint") int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r14
            r1 = r13
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = r13
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r16
            r1 = r13
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = r13
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1b:
            r0 = r13
            r1 = r18
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r18
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            int r0 = nglGetDebugMessageLogAMD(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void glDebugMessageEnableAMD(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r10, @org.lwjgl.system.NativeType("GLboolean") boolean r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDebugMessageEnableAMD
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            int r2 = org.lwjgl.system.Checks.lengthSafe(r2)
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetDebugMessageLogAMD(@org.lwjgl.system.NativeType("GLuint") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") int[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint *") int[] r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetDebugMessageLogAMD
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L29
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r11
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r13
            r1 = r11
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r14
            r1 = r11
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = r11
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L29:
            r0 = r11
            r1 = r16
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r17
            int r0 = org.lwjgl.system.JNI.callPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
