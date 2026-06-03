package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL15.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL15.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL15.class */
public class GL15 extends org.lwjgl.opengl.GL14 {
    public static final int GL_FOG_COORD_SRC = 33872;
    public static final int GL_FOG_COORD = 33873;
    public static final int GL_CURRENT_FOG_COORD = 33875;
    public static final int GL_FOG_COORD_ARRAY_TYPE = 33876;
    public static final int GL_FOG_COORD_ARRAY_STRIDE = 33877;
    public static final int GL_FOG_COORD_ARRAY_POINTER = 33878;
    public static final int GL_FOG_COORD_ARRAY = 33879;
    public static final int GL_FOG_COORD_ARRAY_BUFFER_BINDING = 34973;
    public static final int GL_SRC0_RGB = 34176;
    public static final int GL_SRC1_RGB = 34177;
    public static final int GL_SRC2_RGB = 34178;
    public static final int GL_SRC0_ALPHA = 34184;
    public static final int GL_SRC1_ALPHA = 34185;
    public static final int GL_SRC2_ALPHA = 34186;
    public static final int GL_ARRAY_BUFFER = 34962;
    public static final int GL_ELEMENT_ARRAY_BUFFER = 34963;
    public static final int GL_ARRAY_BUFFER_BINDING = 34964;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 34965;
    public static final int GL_VERTEX_ARRAY_BUFFER_BINDING = 34966;
    public static final int GL_NORMAL_ARRAY_BUFFER_BINDING = 34967;
    public static final int GL_COLOR_ARRAY_BUFFER_BINDING = 34968;
    public static final int GL_INDEX_ARRAY_BUFFER_BINDING = 34969;
    public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING = 34970;
    public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING = 34971;
    public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING = 34972;
    public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING = 34973;
    public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING = 34974;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 34975;
    public static final int GL_STREAM_DRAW = 35040;
    public static final int GL_STREAM_READ = 35041;
    public static final int GL_STREAM_COPY = 35042;
    public static final int GL_STATIC_DRAW = 35044;
    public static final int GL_STATIC_READ = 35045;
    public static final int GL_STATIC_COPY = 35046;
    public static final int GL_DYNAMIC_DRAW = 35048;
    public static final int GL_DYNAMIC_READ = 35049;
    public static final int GL_DYNAMIC_COPY = 35050;
    public static final int GL_READ_ONLY = 35000;
    public static final int GL_WRITE_ONLY = 35001;
    public static final int GL_READ_WRITE = 35002;
    public static final int GL_BUFFER_SIZE = 34660;
    public static final int GL_BUFFER_USAGE = 34661;
    public static final int GL_BUFFER_ACCESS = 35003;
    public static final int GL_BUFFER_MAPPED = 35004;
    public static final int GL_BUFFER_MAP_POINTER = 35005;
    public static final int GL_SAMPLES_PASSED = 35092;
    public static final int GL_QUERY_COUNTER_BITS = 34916;
    public static final int GL_CURRENT_QUERY = 34917;
    public static final int GL_QUERY_RESULT = 34918;
    public static final int GL_QUERY_RESULT_AVAILABLE = 34919;

    protected GL15() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glBindBuffer(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL15C.glBindBuffer(r0, r1)
            return
    }

    public static void nglDeleteBuffers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL15C.nglDeleteBuffers(r0, r1)
            return
    }

    public static void glDeleteBuffers(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL15C.glDeleteBuffers(r0)
            return
    }

    public static void glDeleteBuffers(@org.lwjgl.system.NativeType("GLuint const *") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL15C.glDeleteBuffers(r0)
            return
    }

    public static void nglGenBuffers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL15C.nglGenBuffers(r0, r1)
            return
    }

    public static void glGenBuffers(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL15C.glGenBuffers(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenBuffers() {
            int r0 = org.lwjgl.opengl.GL15C.glGenBuffers()
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsBuffer(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL15C.glIsBuffer(r0)
            return r0
    }

    public static void nglBufferData(int r7, long r8, long r10, int r12) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            org.lwjgl.opengl.GL15C.nglBufferData(r0, r1, r2, r3)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizeiptr") long r6, @org.lwjgl.system.NativeType("GLenum") int r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.LongBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void nglBufferSubData(int r8, long r9, long r11, long r13) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            org.lwjgl.opengl.GL15C.nglBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferSubData(r0, r1, r2)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferSubData(r0, r1, r2)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferSubData(r0, r1, r2)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.LongBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferSubData(r0, r1, r2)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferSubData(r0, r1, r2)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferSubData(r0, r1, r2)
            return
    }

    public static void nglGetBufferSubData(int r8, long r9, long r11, long r13) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            org.lwjgl.opengl.GL15C.nglGetBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glGetBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glGetBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glGetBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glGetBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glGetBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glGetBufferSubData(r0, r1, r2)
            return
    }

    public static long nglMapBuffer(int r3, int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL15C.nglMapBuffer(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapBuffer(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            java.nio.ByteBuffer r0 = org.lwjgl.opengl.GL15C.glMapBuffer(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapBuffer(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @javax.annotation.Nullable java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.nio.ByteBuffer r0 = org.lwjgl.opengl.GL15C.glMapBuffer(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapBuffer(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, long r8, @javax.annotation.Nullable java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            java.nio.ByteBuffer r0 = org.lwjgl.opengl.GL15C.glMapBuffer(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glUnmapBuffer(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL15C.glUnmapBuffer(r0)
            return r0
    }

    public static void nglGetBufferParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL15C.nglGetBufferParameteriv(r0, r1, r2)
            return
    }

    public static void glGetBufferParameteriv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glGetBufferParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetBufferParameteri(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL15C.glGetBufferParameteri(r0, r1)
            return r0
    }

    public static void nglGetBufferPointerv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL15C.nglGetBufferPointerv(r0, r1, r2)
            return
    }

    public static void glGetBufferPointerv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glGetBufferPointerv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetBufferPointer(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL15C.glGetBufferPointer(r0, r1)
            return r0
    }

    public static void nglGenQueries(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL15C.nglGenQueries(r0, r1)
            return
    }

    public static void glGenQueries(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL15C.glGenQueries(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenQueries() {
            int r0 = org.lwjgl.opengl.GL15C.glGenQueries()
            return r0
    }

    public static void nglDeleteQueries(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL15C.nglDeleteQueries(r0, r1)
            return
    }

    public static void glDeleteQueries(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL15C.glDeleteQueries(r0)
            return
    }

    public static void glDeleteQueries(@org.lwjgl.system.NativeType("GLuint const *") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL15C.glDeleteQueries(r0)
            return
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsQuery(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL15C.glIsQuery(r0)
            return r0
    }

    public static void glBeginQuery(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL15C.glBeginQuery(r0, r1)
            return
    }

    public static void glEndQuery(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL15C.glEndQuery(r0)
            return
    }

    public static void nglGetQueryiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL15C.nglGetQueryiv(r0, r1, r2)
            return
    }

    public static void glGetQueryiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glGetQueryiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetQueryi(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL15C.glGetQueryi(r0, r1)
            return r0
    }

    public static void nglGetQueryObjectiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL15C.nglGetQueryObjectiv(r0, r1, r2)
            return
    }

    public static void glGetQueryObjectiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glGetQueryObjectiv(r0, r1, r2)
            return
    }

    public static void glGetQueryObjectiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL15C.glGetQueryObjectiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetQueryObjecti(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL15C.glGetQueryObjecti(r0, r1)
            return r0
    }

    public static void nglGetQueryObjectuiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL15C.nglGetQueryObjectuiv(r0, r1, r2)
            return
    }

    public static void glGetQueryObjectuiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glGetQueryObjectuiv(r0, r1, r2)
            return
    }

    public static void glGetQueryObjectuiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL15C.glGetQueryObjectuiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetQueryObjectui(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL15C.glGetQueryObjectui(r0, r1)
            return r0
    }

    public static void glDeleteBuffers(@org.lwjgl.system.NativeType("GLuint const *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL15C.glDeleteBuffers(r0)
            return
    }

    public static void glGenBuffers(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL15C.glGenBuffers(r0)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") short[] r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") int[] r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") long[] r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") float[] r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") double[] r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glBufferData(r0, r1, r2)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") short[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferSubData(r0, r1, r2)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferSubData(r0, r1, r2)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") long[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferSubData(r0, r1, r2)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferSubData(r0, r1, r2)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") short[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glGetBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glGetBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") long[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glGetBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glGetBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL15C.glGetBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetBufferParameteriv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glGetBufferParameteriv(r0, r1, r2)
            return
    }

    public static void glGenQueries(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL15C.glGenQueries(r0)
            return
    }

    public static void glDeleteQueries(@org.lwjgl.system.NativeType("GLuint const *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL15C.glDeleteQueries(r0)
            return
    }

    public static void glGetQueryiv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glGetQueryiv(r0, r1, r2)
            return
    }

    public static void glGetQueryObjectiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glGetQueryObjectiv(r0, r1, r2)
            return
    }

    public static void glGetQueryObjectuiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL15C.glGetQueryObjectuiv(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
