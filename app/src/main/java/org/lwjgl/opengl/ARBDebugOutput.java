package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDebugOutput.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDebugOutput.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDebugOutput.class */
public class ARBDebugOutput {
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_ARB = 33346;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_ARB = 37187;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_ARB = 37188;
    public static final int GL_DEBUG_LOGGED_MESSAGES_ARB = 37189;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB = 33347;
    public static final int GL_DEBUG_CALLBACK_FUNCTION_ARB = 33348;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM_ARB = 33349;
    public static final int GL_DEBUG_SOURCE_API_ARB = 33350;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB = 33351;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER_ARB = 33352;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY_ARB = 33353;
    public static final int GL_DEBUG_SOURCE_APPLICATION_ARB = 33354;
    public static final int GL_DEBUG_SOURCE_OTHER_ARB = 33355;
    public static final int GL_DEBUG_TYPE_ERROR_ARB = 33356;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB = 33357;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB = 33358;
    public static final int GL_DEBUG_TYPE_PORTABILITY_ARB = 33359;
    public static final int GL_DEBUG_TYPE_PERFORMANCE_ARB = 33360;
    public static final int GL_DEBUG_TYPE_OTHER_ARB = 33361;
    public static final int GL_DEBUG_SEVERITY_HIGH_ARB = 37190;
    public static final int GL_DEBUG_SEVERITY_MEDIUM_ARB = 37191;
    public static final int GL_DEBUG_SEVERITY_LOW_ARB = 37192;

    protected ARBDebugOutput() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglDebugMessageControlARB(int r0, int r1, int r2, int r3, long r4, boolean r6);

    public static void glDebugMessageControlARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLboolean") boolean r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = org.lwjgl.system.Checks.remainingSafe(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r12
            nglDebugMessageControlARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDebugMessageControlARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLuint const *") int r11, @org.lwjgl.system.NativeType("GLboolean") boolean r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r11
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L2c
            r15 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = 1
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L2c
            r5 = r12
            nglDebugMessageControlARB(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2c
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            goto L38
        L2c:
            r16 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r16
            throw r0
        L38:
            return
    }

    public static native void nglDebugMessageInsertARB(int r0, int r1, int r2, int r3, int r4, long r5);

    public static void glDebugMessageInsertARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r4 = r4.remaining()
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglDebugMessageInsertARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDebugMessageInsertARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r12
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L32
            r15 = r0
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L32
            r16 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r15
            r5 = r16
            nglDebugMessageInsertARB(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L32
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            goto L3e
        L32:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
        L3e:
            return
    }

    public static native void nglDebugMessageCallbackARB(long r0, long r2);

    public static void glDebugMessageCallbackARB(@javax.annotation.Nullable @org.lwjgl.system.NativeType("GLDEBUGPROCARB") org.lwjgl.opengl.GLDebugMessageARBCallbackI r5, @org.lwjgl.system.NativeType("void const *") long r6) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r6
            nglDebugMessageCallbackARB(r0, r1)
            return
    }

    public static native int nglGetDebugMessageLogARB(int r0, int r1, long r2, long r4, long r6, long r8, long r10, long r12);

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetDebugMessageLogARB(@org.lwjgl.system.NativeType("GLuint") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r16
            r1 = r15
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = r15
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r18
            r1 = r15
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r19
            r1 = r15
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r20
            r1 = r15
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L21:
            r0 = r15
            r1 = r21
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r16
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r17
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r21
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            int r0 = nglGetDebugMessageLogARB(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static void glDebugMessageControlARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r12, @org.lwjgl.system.NativeType("GLboolean") boolean r13) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDebugMessageControlARB
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            int r3 = org.lwjgl.system.Checks.lengthSafe(r3)
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetDebugMessageLogARB(@org.lwjgl.system.NativeType("GLuint") int r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") int[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") int[] r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint *") int[] r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") int[] r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r18) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetDebugMessageLogARB
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2f
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = r12
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r14
            r1 = r12
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = r12
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r16
            r1 = r12
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = r12
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L2f:
            r0 = r12
            r1 = r18
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            r8 = r19
            int r0 = org.lwjgl.system.JNI.callPPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
