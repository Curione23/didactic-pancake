package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/KHRDebug.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/KHRDebug.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/KHRDebug.class */
public class KHRDebug {
    public static final int GL_DEBUG_OUTPUT = 37600;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS = 33346;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 2;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH = 37187;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES = 37188;
    public static final int GL_DEBUG_LOGGED_MESSAGES = 37189;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 33347;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH = 33388;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH = 33389;
    public static final int GL_MAX_LABEL_LENGTH = 33512;
    public static final int GL_DEBUG_CALLBACK_FUNCTION = 33348;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM = 33349;
    public static final int GL_DEBUG_SOURCE_API = 33350;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM = 33351;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = 33352;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY = 33353;
    public static final int GL_DEBUG_SOURCE_APPLICATION = 33354;
    public static final int GL_DEBUG_SOURCE_OTHER = 33355;
    public static final int GL_DEBUG_TYPE_ERROR = 33356;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 33357;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = 33358;
    public static final int GL_DEBUG_TYPE_PORTABILITY = 33359;
    public static final int GL_DEBUG_TYPE_PERFORMANCE = 33360;
    public static final int GL_DEBUG_TYPE_OTHER = 33361;
    public static final int GL_DEBUG_TYPE_MARKER = 33384;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP = 33385;
    public static final int GL_DEBUG_TYPE_POP_GROUP = 33386;
    public static final int GL_DEBUG_SEVERITY_HIGH = 37190;
    public static final int GL_DEBUG_SEVERITY_MEDIUM = 37191;
    public static final int GL_DEBUG_SEVERITY_LOW = 37192;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION = 33387;
    public static final int GL_BUFFER = 33504;
    public static final int GL_SHADER = 33505;
    public static final int GL_PROGRAM = 33506;
    public static final int GL_QUERY = 33507;
    public static final int GL_PROGRAM_PIPELINE = 33508;
    public static final int GL_SAMPLER = 33510;
    public static final int GL_DISPLAY_LIST = 33511;

    protected KHRDebug() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglDebugMessageControl(int r8, int r9, int r10, int r11, long r12, boolean r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            org.lwjgl.opengl.GL43C.nglDebugMessageControl(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDebugMessageControl(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glDebugMessageControl(r0, r1, r2, r3, r4)
            return
    }

    public static void glDebugMessageControl(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint const *") int r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glDebugMessageControl(r0, r1, r2, r3, r4)
            return
    }

    public static void nglDebugMessageInsert(int r8, int r9, int r10, int r11, int r12, long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.opengl.GL43C.nglDebugMessageInsert(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDebugMessageInsert(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glDebugMessageInsert(r0, r1, r2, r3, r4)
            return
    }

    public static void glDebugMessageInsert(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glDebugMessageInsert(r0, r1, r2, r3, r4)
            return
    }

    public static void nglDebugMessageCallback(long r5, long r7) {
            r0 = r5
            r1 = r7
            org.lwjgl.opengl.GL43C.nglDebugMessageCallback(r0, r1)
            return
    }

    public static void glDebugMessageCallback(@javax.annotation.Nullable @org.lwjgl.system.NativeType("GLDEBUGPROC") org.lwjgl.opengl.GLDebugMessageCallbackI r4, @org.lwjgl.system.NativeType("void const *") long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL43C.glDebugMessageCallback(r0, r1)
            return
    }

    public static int nglGetDebugMessageLog(int r15, int r16, long r17, long r19, long r21, long r23, long r25, long r27) {
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            r6 = r25
            r7 = r27
            int r0 = org.lwjgl.opengl.GL43C.nglGetDebugMessageLog(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetDebugMessageLog(@org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            int r0 = org.lwjgl.opengl.GL43C.glGetDebugMessageLog(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void nglPushDebugGroup(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL43C.nglPushDebugGroup(r0, r1, r2, r3)
            return
    }

    public static void glPushDebugGroup(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glPushDebugGroup(r0, r1, r2)
            return
    }

    public static void glPushDebugGroup(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glPushDebugGroup(r0, r1, r2)
            return
    }

    public static void glPopDebugGroup() {
            org.lwjgl.opengl.GL43C.glPopDebugGroup()
            return
    }

    public static void nglObjectLabel(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL43C.nglObjectLabel(r0, r1, r2, r3)
            return
    }

    public static void glObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glObjectLabel(r0, r1, r2)
            return
    }

    public static void glObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glObjectLabel(r0, r1, r2)
            return
    }

    public static void nglGetObjectLabel(int r8, int r9, int r10, long r11, long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            org.lwjgl.opengl.GL43C.nglGetObjectLabel(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glGetObjectLabel(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.String r0 = org.lwjgl.opengl.GL43C.glGetObjectLabel(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5) {
            r0 = r4
            r1 = r5
            r2 = 33512(0x82e8, float:4.696E-41)
            int r2 = org.lwjgl.opengl.GL11.glGetInteger(r2)
            java.lang.String r0 = glGetObjectLabel(r0, r1, r2)
            return r0
    }

    public static void nglObjectPtrLabel(long r6, int r8, long r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.opengl.GL43C.nglObjectPtrLabel(r0, r1, r2)
            return
    }

    public static void glObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r4, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r6
            org.lwjgl.opengl.GL43C.glObjectPtrLabel(r0, r1)
            return
    }

    public static void glObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r4, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r6
            org.lwjgl.opengl.GL43C.glObjectPtrLabel(r0, r1)
            return
    }

    public static void nglGetObjectPtrLabel(long r8, int r10, long r11, long r13) {
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            org.lwjgl.opengl.GL43C.nglGetObjectPtrLabel(r0, r1, r2, r3)
            return
    }

    public static void glGetObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            org.lwjgl.opengl.GL43C.glGetObjectPtrLabel(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r4, @org.lwjgl.system.NativeType("GLsizei") int r6) {
            r0 = r4
            r1 = r6
            java.lang.String r0 = org.lwjgl.opengl.GL43C.glGetObjectPtrLabel(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r4) {
            r0 = r4
            r1 = 33512(0x82e8, float:4.696E-41)
            int r1 = org.lwjgl.opengl.GL11.glGetInteger(r1)
            java.lang.String r0 = glGetObjectPtrLabel(r0, r1)
            return r0
    }

    public static void glDebugMessageControl(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r9, @org.lwjgl.system.NativeType("GLboolean") boolean r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glDebugMessageControl(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetDebugMessageLog(@org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") int[] r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint *") int[] r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLenum *") int[] r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            int r0 = org.lwjgl.opengl.GL43C.glGetDebugMessageLog(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void glGetObjectLabel(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glGetObjectLabel(r0, r1, r2, r3)
            return
    }

    public static void glGetObjectPtrLabel(@org.lwjgl.system.NativeType("void *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r7, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            org.lwjgl.opengl.GL43C.glGetObjectPtrLabel(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
