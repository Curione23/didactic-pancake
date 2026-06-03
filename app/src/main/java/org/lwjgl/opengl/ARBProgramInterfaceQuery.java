package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBProgramInterfaceQuery.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBProgramInterfaceQuery.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBProgramInterfaceQuery.class */
public class ARBProgramInterfaceQuery {
    public static final int GL_UNIFORM = 37601;
    public static final int GL_UNIFORM_BLOCK = 37602;
    public static final int GL_PROGRAM_INPUT = 37603;
    public static final int GL_PROGRAM_OUTPUT = 37604;
    public static final int GL_BUFFER_VARIABLE = 37605;
    public static final int GL_SHADER_STORAGE_BLOCK = 37606;
    public static final int GL_VERTEX_SUBROUTINE = 37608;
    public static final int GL_TESS_CONTROL_SUBROUTINE = 37609;
    public static final int GL_TESS_EVALUATION_SUBROUTINE = 37610;
    public static final int GL_GEOMETRY_SUBROUTINE = 37611;
    public static final int GL_FRAGMENT_SUBROUTINE = 37612;
    public static final int GL_COMPUTE_SUBROUTINE = 37613;
    public static final int GL_VERTEX_SUBROUTINE_UNIFORM = 37614;
    public static final int GL_TESS_CONTROL_SUBROUTINE_UNIFORM = 37615;
    public static final int GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 37616;
    public static final int GL_GEOMETRY_SUBROUTINE_UNIFORM = 37617;
    public static final int GL_FRAGMENT_SUBROUTINE_UNIFORM = 37618;
    public static final int GL_COMPUTE_SUBROUTINE_UNIFORM = 37619;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING = 37620;
    public static final int GL_ACTIVE_RESOURCES = 37621;
    public static final int GL_MAX_NAME_LENGTH = 37622;
    public static final int GL_MAX_NUM_ACTIVE_VARIABLES = 37623;
    public static final int GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 37624;
    public static final int GL_NAME_LENGTH = 37625;
    public static final int GL_TYPE = 37626;
    public static final int GL_ARRAY_SIZE = 37627;
    public static final int GL_OFFSET = 37628;
    public static final int GL_BLOCK_INDEX = 37629;
    public static final int GL_ARRAY_STRIDE = 37630;
    public static final int GL_MATRIX_STRIDE = 37631;
    public static final int GL_IS_ROW_MAJOR = 37632;
    public static final int GL_ATOMIC_COUNTER_BUFFER_INDEX = 37633;
    public static final int GL_BUFFER_BINDING = 37634;
    public static final int GL_BUFFER_DATA_SIZE = 37635;
    public static final int GL_NUM_ACTIVE_VARIABLES = 37636;
    public static final int GL_ACTIVE_VARIABLES = 37637;
    public static final int GL_REFERENCED_BY_VERTEX_SHADER = 37638;
    public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER = 37639;
    public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 37640;
    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER = 37641;
    public static final int GL_REFERENCED_BY_FRAGMENT_SHADER = 37642;
    public static final int GL_REFERENCED_BY_COMPUTE_SHADER = 37643;
    public static final int GL_TOP_LEVEL_ARRAY_SIZE = 37644;
    public static final int GL_TOP_LEVEL_ARRAY_STRIDE = 37645;
    public static final int GL_LOCATION = 37646;
    public static final int GL_LOCATION_INDEX = 37647;
    public static final int GL_IS_PER_PATCH = 37607;

    protected ARBProgramInterfaceQuery() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglGetProgramInterfaceiv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL43C.nglGetProgramInterfaceiv(r0, r1, r2, r3)
            return
    }

    public static void glGetProgramInterfaceiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glGetProgramInterfaceiv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetProgramInterfacei(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramInterfacei(r0, r1, r2)
            return r0
    }

    public static int nglGetProgramResourceIndex(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.opengl.GL43C.nglGetProgramResourceIndex(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetProgramResourceIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceIndex(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetProgramResourceIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceIndex(r0, r1, r2)
            return r0
    }

    public static void nglGetProgramResourceName(int r9, int r10, int r11, int r12, long r13, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r15
            org.lwjgl.opengl.GL43C.nglGetProgramResourceName(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetProgramResourceName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glGetProgramResourceName(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetProgramResourceName(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.lang.String r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceName(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetProgramResourceName(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r7
            r4 = r8
            r5 = 37622(0x92f6, float:5.272E-41)
            int r3 = glGetProgramInterfacei(r3, r4, r5)
            java.lang.String r0 = glGetProgramResourceName(r0, r1, r2, r3)
            return r0
    }

    public static void nglGetProgramResourceiv(int r12, int r13, int r14, int r15, long r16, int r18, long r19, long r21) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r18
            r6 = r19
            r7 = r21
            org.lwjgl.opengl.GL43C.nglGetProgramResourceiv(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glGetProgramResourceiv(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL43C.glGetProgramResourceiv(r0, r1, r2, r3, r4, r5)
            return
    }

    public static int nglGetProgramResourceLocation(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.opengl.GL43C.nglGetProgramResourceLocation(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetProgramResourceLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceLocation(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetProgramResourceLocation(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceLocation(r0, r1, r2)
            return r0
    }

    public static int nglGetProgramResourceLocationIndex(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.opengl.GL43C.nglGetProgramResourceLocationIndex(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceLocationIndex(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL43C.glGetProgramResourceLocationIndex(r0, r1, r2)
            return r0
    }

    public static void glGetProgramInterfaceiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL43C.glGetProgramInterfaceiv(r0, r1, r2, r3)
            return
    }

    public static void glGetProgramResourceName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glGetProgramResourceName(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetProgramResourceiv(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLenum const *") int[] r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r11, @org.lwjgl.system.NativeType("GLint *") int[] r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL43C.glGetProgramResourceiv(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
