package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL15C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL15C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL15C.class */
public class GL15C extends org.lwjgl.opengl.GL14C {
    public static final int GL_SRC1_ALPHA = 34185;
    public static final int GL_ARRAY_BUFFER = 34962;
    public static final int GL_ELEMENT_ARRAY_BUFFER = 34963;
    public static final int GL_ARRAY_BUFFER_BINDING = 34964;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 34965;
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

    protected GL15C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glBindBuffer(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void nglDeleteBuffers(int r0, long r1);

    public static void glDeleteBuffers(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglDeleteBuffers(r0, r1)
            return
    }

    public static void glDeleteBuffers(@org.lwjgl.system.NativeType("GLuint const *") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L1f
            r7 = r0
            r0 = 1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L1f
            nglDeleteBuffers(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            goto L29
        L1f:
            r8 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            throw r0
        L29:
            return
    }

    public static native void nglGenBuffers(int r0, long r1);

    public static void glGenBuffers(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGenBuffers(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenBuffers() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r4 = r0
            r0 = r4
            int r0 = r0.getPointer()
            r5 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L24
            r6 = r0
            r0 = 1
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L24
            nglGenBuffers(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L24
            r7 = r0
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r7
            return r0
        L24:
            r8 = move-exception
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r8
            throw r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsBuffer(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglBufferData(int r0, long r1, long r3, int r5);

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizeiptr") long r8, @org.lwjgl.system.NativeType("GLenum") int r10) {
            r0 = r7
            r1 = r8
            r2 = 0
            r3 = r10
            nglBufferData(r0, r1, r2, r3)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = (long) r1
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferData(r0, r1, r2, r3)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 1
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferData(r0, r1, r2, r3)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferData(r0, r1, r2, r3)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.LongBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferData(r0, r1, r2, r3)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferData(r0, r1, r2, r3)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferData(r0, r1, r2, r3)
            return
    }

    public static native void nglBufferSubData(int r0, long r1, long r3, long r5);

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.LongBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglBufferSubData(r0, r1, r2, r3)
            return
    }

    public static native void nglGetBufferSubData(int r0, long r1, long r3, long r5);

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetBufferSubData(r0, r1, r2, r3)
            return
    }

    public static native long nglMapBuffer(int r0, int r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapBuffer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r5
            r1 = r6
            long r0 = nglMapBuffer(r0, r1)
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = 34660(0x8764, float:4.8569E-41)
            int r1 = glGetBufferParameteri(r1, r2)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapBuffer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            r0 = r5
            r1 = r6
            long r0 = nglMapBuffer(r0, r1)
            r8 = r0
            r0 = r5
            r1 = 34660(0x8764, float:4.8569E-41)
            int r0 = glGetBufferParameteri(r0, r1)
            r10 = r0
            r0 = r7
            r1 = r8
            r2 = r10
            java.nio.ByteBuffer r0 = org.lwjgl.system.APIUtil.apiGetMappedBuffer(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapBuffer(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, long r8, @javax.annotation.Nullable java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            long r0 = nglMapBuffer(r0, r1)
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r8
            int r2 = (int) r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.APIUtil.apiGetMappedBuffer(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glUnmapBuffer(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglGetBufferParameteriv(int r0, int r1, long r2);

    public static void glGetBufferParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetBufferParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetBufferParameteri(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetBufferParameteriv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetBufferPointerv(int r0, int r1, long r2);

    public static void glGetBufferPointerv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetBufferPointerv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetBufferPointer(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.callocPointer(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetBufferPointerv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r12 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native void nglGenQueries(int r0, long r1);

    public static void glGenQueries(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGenQueries(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenQueries() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r4 = r0
            r0 = r4
            int r0 = r0.getPointer()
            r5 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L24
            r6 = r0
            r0 = 1
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L24
            nglGenQueries(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L24
            r7 = r0
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r7
            return r0
        L24:
            r8 = move-exception
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r8
            throw r0
    }

    public static native void nglDeleteQueries(int r0, long r1);

    public static void glDeleteQueries(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglDeleteQueries(r0, r1)
            return
    }

    public static void glDeleteQueries(@org.lwjgl.system.NativeType("GLuint const *") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L1f
            r7 = r0
            r0 = 1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L1f
            nglDeleteQueries(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            goto L29
        L1f:
            r8 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            throw r0
        L29:
            return
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsQuery(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glBeginQuery(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glEndQuery(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglGetQueryiv(int r0, int r1, long r2);

    public static void glGetQueryiv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetQueryiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetQueryi(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetQueryiv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetQueryObjectiv(int r0, int r1, long r2);

    public static void glGetQueryObjectiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetQueryObjectiv(r0, r1, r2)
            return
    }

    public static void glGetQueryObjectiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            nglGetQueryObjectiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetQueryObjecti(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetQueryObjectiv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetQueryObjectuiv(int r0, int r1, long r2);

    public static void glGetQueryObjectuiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetQueryObjectuiv(r0, r1, r2)
            return
    }

    public static void glGetQueryObjectuiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint *") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            nglGetQueryObjectuiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetQueryObjectui(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetQueryObjectuiv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void glDeleteBuffers(@org.lwjgl.system.NativeType("GLuint const *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDeleteBuffers
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGenBuffers(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGenBuffers
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") short[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferData
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 1
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") int[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferData
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") long[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferData
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") float[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferData
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferData(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") double[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferData
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void const *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferSubData
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferSubData
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void const *") long[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferSubData
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void const *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferSubData
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void const *") double[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferSubData
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferSubData
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferSubData
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void *") long[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferSubData
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferSubData
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("void *") double[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferSubData
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r12
            r4 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetBufferParameteriv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferParameteriv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGenQueries(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGenQueries
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glDeleteQueries(@org.lwjgl.system.NativeType("GLuint const *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDeleteQueries
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetQueryiv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetQueryiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetQueryObjectiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetQueryObjectiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetQueryObjectuiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetQueryObjectuiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
