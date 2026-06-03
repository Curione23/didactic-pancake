package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBFramebufferObject.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBFramebufferObject.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBFramebufferObject.class */
public class ARBFramebufferObject {
    public static final int GL_FRAMEBUFFER = 36160;
    public static final int GL_READ_FRAMEBUFFER = 36008;
    public static final int GL_DRAW_FRAMEBUFFER = 36009;
    public static final int GL_RENDERBUFFER = 36161;
    public static final int GL_STENCIL_INDEX1 = 36166;
    public static final int GL_STENCIL_INDEX4 = 36167;
    public static final int GL_STENCIL_INDEX8 = 36168;
    public static final int GL_STENCIL_INDEX16 = 36169;
    public static final int GL_RENDERBUFFER_WIDTH = 36162;
    public static final int GL_RENDERBUFFER_HEIGHT = 36163;
    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 36164;
    public static final int GL_RENDERBUFFER_RED_SIZE = 36176;
    public static final int GL_RENDERBUFFER_GREEN_SIZE = 36177;
    public static final int GL_RENDERBUFFER_BLUE_SIZE = 36178;
    public static final int GL_RENDERBUFFER_ALPHA_SIZE = 36179;
    public static final int GL_RENDERBUFFER_DEPTH_SIZE = 36180;
    public static final int GL_RENDERBUFFER_STENCIL_SIZE = 36181;
    public static final int GL_RENDERBUFFER_SAMPLES = 36011;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 36048;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 36049;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 36050;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 36051;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 36052;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 33296;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 33297;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 33298;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 33299;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 33300;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 33301;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 33302;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 33303;
    public static final int GL_UNSIGNED_NORMALIZED = 35863;
    public static final int GL_FRAMEBUFFER_DEFAULT = 33304;
    public static final int GL_INDEX = 33314;
    public static final int GL_COLOR_ATTACHMENT0 = 36064;
    public static final int GL_COLOR_ATTACHMENT1 = 36065;
    public static final int GL_COLOR_ATTACHMENT2 = 36066;
    public static final int GL_COLOR_ATTACHMENT3 = 36067;
    public static final int GL_COLOR_ATTACHMENT4 = 36068;
    public static final int GL_COLOR_ATTACHMENT5 = 36069;
    public static final int GL_COLOR_ATTACHMENT6 = 36070;
    public static final int GL_COLOR_ATTACHMENT7 = 36071;
    public static final int GL_COLOR_ATTACHMENT8 = 36072;
    public static final int GL_COLOR_ATTACHMENT9 = 36073;
    public static final int GL_COLOR_ATTACHMENT10 = 36074;
    public static final int GL_COLOR_ATTACHMENT11 = 36075;
    public static final int GL_COLOR_ATTACHMENT12 = 36076;
    public static final int GL_COLOR_ATTACHMENT13 = 36077;
    public static final int GL_COLOR_ATTACHMENT14 = 36078;
    public static final int GL_COLOR_ATTACHMENT15 = 36079;
    public static final int GL_DEPTH_ATTACHMENT = 36096;
    public static final int GL_STENCIL_ATTACHMENT = 36128;
    public static final int GL_DEPTH_STENCIL_ATTACHMENT = 33306;
    public static final int GL_MAX_SAMPLES = 36183;
    public static final int GL_FRAMEBUFFER_COMPLETE = 36053;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 36059;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 36060;
    public static final int GL_FRAMEBUFFER_UNSUPPORTED = 36061;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 36182;
    public static final int GL_FRAMEBUFFER_UNDEFINED = 33305;
    public static final int GL_FRAMEBUFFER_BINDING = 36006;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING = 36006;
    public static final int GL_READ_FRAMEBUFFER_BINDING = 36010;
    public static final int GL_RENDERBUFFER_BINDING = 36007;
    public static final int GL_MAX_COLOR_ATTACHMENTS = 36063;
    public static final int GL_MAX_RENDERBUFFER_SIZE = 34024;
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 1286;
    public static final int GL_DEPTH_STENCIL = 34041;
    public static final int GL_UNSIGNED_INT_24_8 = 34042;
    public static final int GL_DEPTH24_STENCIL8 = 35056;
    public static final int GL_TEXTURE_STENCIL_SIZE = 35057;

    protected ARBFramebufferObject() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsRenderbuffer(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL30C.glIsRenderbuffer(r0)
            return r0
    }

    public static void glBindRenderbuffer(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL30C.glBindRenderbuffer(r0, r1)
            return
    }

    public static void nglDeleteRenderbuffers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL30C.nglDeleteRenderbuffers(r0, r1)
            return
    }

    public static void glDeleteRenderbuffers(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glDeleteRenderbuffers(r0)
            return
    }

    public static void glDeleteRenderbuffers(@org.lwjgl.system.NativeType("GLuint const *") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glDeleteRenderbuffers(r0)
            return
    }

    public static void nglGenRenderbuffers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL30C.nglGenRenderbuffers(r0, r1)
            return
    }

    public static void glGenRenderbuffers(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glGenRenderbuffers(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenRenderbuffers() {
            int r0 = org.lwjgl.opengl.GL30C.glGenRenderbuffers()
            return r0
    }

    public static void glRenderbufferStorage(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL30C.glRenderbufferStorage(r0, r1, r2, r3)
            return
    }

    public static void glRenderbufferStorageMultisample(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL30C.glRenderbufferStorageMultisample(r0, r1, r2, r3, r4)
            return
    }

    public static void nglGetRenderbufferParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL30C.nglGetRenderbufferParameteriv(r0, r1, r2)
            return
    }

    public static void glGetRenderbufferParameteriv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL30C.glGetRenderbufferParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetRenderbufferParameteri(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL30C.glGetRenderbufferParameteri(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsFramebuffer(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL30C.glIsFramebuffer(r0)
            return r0
    }

    public static void glBindFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL30C.glBindFramebuffer(r0, r1)
            return
    }

    public static void nglDeleteFramebuffers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL30C.nglDeleteFramebuffers(r0, r1)
            return
    }

    public static void glDeleteFramebuffers(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glDeleteFramebuffers(r0)
            return
    }

    public static void glDeleteFramebuffers(@org.lwjgl.system.NativeType("GLuint const *") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glDeleteFramebuffers(r0)
            return
    }

    public static void nglGenFramebuffers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL30C.nglGenFramebuffers(r0, r1)
            return
    }

    public static void glGenFramebuffers(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glGenFramebuffers(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenFramebuffers() {
            int r0 = org.lwjgl.opengl.GL30C.glGenFramebuffers()
            return r0
    }

    @org.lwjgl.system.NativeType("GLenum")
    public static int glCheckFramebufferStatus(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            int r0 = org.lwjgl.opengl.GL30C.glCheckFramebufferStatus(r0)
            return r0
    }

    public static void glFramebufferTexture1D(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL30C.glFramebufferTexture1D(r0, r1, r2, r3, r4)
            return
    }

    public static void glFramebufferTexture2D(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL30C.glFramebufferTexture2D(r0, r1, r2, r3, r4)
            return
    }

    public static void glFramebufferTexture3D(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL30C.glFramebufferTexture3D(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glFramebufferTextureLayer(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL30C.glFramebufferTextureLayer(r0, r1, r2, r3, r4)
            return
    }

    public static void glFramebufferRenderbuffer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL30C.glFramebufferRenderbuffer(r0, r1, r2, r3)
            return
    }

    public static void nglGetFramebufferAttachmentParameteriv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL30C.nglGetFramebufferAttachmentParameteriv(r0, r1, r2, r3)
            return
    }

    public static void glGetFramebufferAttachmentParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL30C.glGetFramebufferAttachmentParameteriv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetFramebufferAttachmentParameteri(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL30C.glGetFramebufferAttachmentParameteri(r0, r1, r2)
            return r0
    }

    public static void glBlitFramebuffer(@org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLbitfield") int r19, @org.lwjgl.system.NativeType("GLenum") int r20) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            org.lwjgl.opengl.GL30C.glBlitFramebuffer(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glGenerateMipmap(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glGenerateMipmap(r0)
            return
    }

    public static void glDeleteRenderbuffers(@org.lwjgl.system.NativeType("GLuint const *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glDeleteRenderbuffers(r0)
            return
    }

    public static void glGenRenderbuffers(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glGenRenderbuffers(r0)
            return
    }

    public static void glGetRenderbufferParameteriv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL30C.glGetRenderbufferParameteriv(r0, r1, r2)
            return
    }

    public static void glDeleteFramebuffers(@org.lwjgl.system.NativeType("GLuint const *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glDeleteFramebuffers(r0)
            return
    }

    public static void glGenFramebuffers(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL30C.glGenFramebuffers(r0)
            return
    }

    public static void glGetFramebufferAttachmentParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL30C.glGetFramebufferAttachmentParameteriv(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
