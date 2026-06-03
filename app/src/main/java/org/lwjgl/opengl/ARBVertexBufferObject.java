package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBVertexBufferObject.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBVertexBufferObject.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBVertexBufferObject.class */
public class ARBVertexBufferObject {
    public static final int GL_ARRAY_BUFFER_ARB = 34962;
    public static final int GL_ELEMENT_ARRAY_BUFFER_ARB = 34963;
    public static final int GL_ARRAY_BUFFER_BINDING_ARB = 34964;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB = 34965;
    public static final int GL_VERTEX_ARRAY_BUFFER_BINDING_ARB = 34966;
    public static final int GL_NORMAL_ARRAY_BUFFER_BINDING_ARB = 34967;
    public static final int GL_COLOR_ARRAY_BUFFER_BINDING_ARB = 34968;
    public static final int GL_INDEX_ARRAY_BUFFER_BINDING_ARB = 34969;
    public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB = 34970;
    public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB = 34971;
    public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB = 34972;
    public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB = 34973;
    public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB = 34974;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB = 34975;
    public static final int GL_STREAM_DRAW_ARB = 35040;
    public static final int GL_STREAM_READ_ARB = 35041;
    public static final int GL_STREAM_COPY_ARB = 35042;
    public static final int GL_STATIC_DRAW_ARB = 35044;
    public static final int GL_STATIC_READ_ARB = 35045;
    public static final int GL_STATIC_COPY_ARB = 35046;
    public static final int GL_DYNAMIC_DRAW_ARB = 35048;
    public static final int GL_DYNAMIC_READ_ARB = 35049;
    public static final int GL_DYNAMIC_COPY_ARB = 35050;
    public static final int GL_READ_ONLY_ARB = 35000;
    public static final int GL_WRITE_ONLY_ARB = 35001;
    public static final int GL_READ_WRITE_ARB = 35002;
    public static final int GL_BUFFER_SIZE_ARB = 34660;
    public static final int GL_BUFFER_USAGE_ARB = 34661;
    public static final int GL_BUFFER_ACCESS_ARB = 35003;
    public static final int GL_BUFFER_MAPPED_ARB = 35004;
    public static final int GL_BUFFER_MAP_POINTER_ARB = 35005;

    protected ARBVertexBufferObject() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glBindBufferARB(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void nglDeleteBuffersARB(int r0, long r1);

    public static void glDeleteBuffersARB(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglDeleteBuffersARB(r0, r1)
            return
    }

    public static void glDeleteBuffersARB(@org.lwjgl.system.NativeType("GLuint const *") int r4) {
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
            nglDeleteBuffersARB(r0, r1)     // Catch: java.lang.Throwable -> L1f
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

    public static native void nglGenBuffersARB(int r0, long r1);

    public static void glGenBuffersARB(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGenBuffersARB(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenBuffersARB() {
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
            nglGenBuffersARB(r0, r1)     // Catch: java.lang.Throwable -> L24
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
    public static native boolean glIsBufferARB(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglBufferDataARB(int r0, long r1, long r3, int r5);

    public static void glBufferDataARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizeiptrARB") long r8, @org.lwjgl.system.NativeType("GLenum") int r10) {
            r0 = r7
            r1 = r8
            r2 = 0
            r3 = r10
            nglBufferDataARB(r0, r1, r2, r3)
            return
    }

    public static void glBufferDataARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = (long) r1
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferDataARB(r0, r1, r2, r3)
            return
    }

    public static void glBufferDataARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 1
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferDataARB(r0, r1, r2, r3)
            return
    }

    public static void glBufferDataARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferDataARB(r0, r1, r2, r3)
            return
    }

    public static void glBufferDataARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferDataARB(r0, r1, r2, r3)
            return
    }

    public static void glBufferDataARB(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferDataARB(r0, r1, r2, r3)
            return
    }

    public static native void nglBufferSubDataARB(int r0, long r1, long r3, long r5);

    public static void glBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptrARB") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglBufferSubDataARB(r0, r1, r2, r3)
            return
    }

    public static void glBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptrARB") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglBufferSubDataARB(r0, r1, r2, r3)
            return
    }

    public static void glBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptrARB") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglBufferSubDataARB(r0, r1, r2, r3)
            return
    }

    public static void glBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptrARB") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglBufferSubDataARB(r0, r1, r2, r3)
            return
    }

    public static void glBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptrARB") long r9, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglBufferSubDataARB(r0, r1, r2, r3)
            return
    }

    public static native void nglGetBufferSubDataARB(int r0, long r1, long r3, long r5);

    public static void glGetBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptrARB") long r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetBufferSubDataARB(r0, r1, r2, r3)
            return
    }

    public static void glGetBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptrARB") long r9, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetBufferSubDataARB(r0, r1, r2, r3)
            return
    }

    public static void glGetBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptrARB") long r9, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetBufferSubDataARB(r0, r1, r2, r3)
            return
    }

    public static void glGetBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptrARB") long r9, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetBufferSubDataARB(r0, r1, r2, r3)
            return
    }

    public static void glGetBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptrARB") long r9, @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r11) {
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetBufferSubDataARB(r0, r1, r2, r3)
            return
    }

    public static native long nglMapBufferARB(int r0, int r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapBufferARB(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r5
            r1 = r6
            long r0 = nglMapBufferARB(r0, r1)
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = 34660(0x8764, float:4.8569E-41)
            int r1 = glGetBufferParameteriARB(r1, r2)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapBufferARB(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            r0 = r5
            r1 = r6
            long r0 = nglMapBufferARB(r0, r1)
            r8 = r0
            r0 = r5
            r1 = 34660(0x8764, float:4.8569E-41)
            int r0 = glGetBufferParameteriARB(r0, r1)
            r10 = r0
            r0 = r7
            r1 = r8
            r2 = r10
            java.nio.ByteBuffer r0 = org.lwjgl.system.APIUtil.apiGetMappedBuffer(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapBufferARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, long r8, @javax.annotation.Nullable java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            long r0 = nglMapBufferARB(r0, r1)
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r8
            int r2 = (int) r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.APIUtil.apiGetMappedBuffer(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glUnmapBufferARB(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglGetBufferParameterivARB(int r0, int r1, long r2);

    public static void glGetBufferParameterivARB(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetBufferParameterivARB(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetBufferParameteriARB(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetBufferParameterivARB(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetBufferPointervARB(int r0, int r1, long r2);

    public static void glGetBufferPointervARB(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r7) {
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
            nglGetBufferPointervARB(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetBufferPointerARB(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetBufferPointervARB(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static void glDeleteBuffersARB(@org.lwjgl.system.NativeType("GLuint const *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDeleteBuffersARB
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

    public static void glGenBuffersARB(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGenBuffersARB
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

    public static void glBufferDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") short[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferDataARB
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

    public static void glBufferDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") int[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferDataARB
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

    public static void glBufferDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") float[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferDataARB
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

    public static void glBufferDataARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") double[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferDataARB
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

    public static void glBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptrARB") long r10, @org.lwjgl.system.NativeType("void const *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferSubDataARB
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

    public static void glBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptrARB") long r10, @org.lwjgl.system.NativeType("void const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferSubDataARB
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

    public static void glBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptrARB") long r10, @org.lwjgl.system.NativeType("void const *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferSubDataARB
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

    public static void glBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptrARB") long r10, @org.lwjgl.system.NativeType("void const *") double[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferSubDataARB
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

    public static void glGetBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptrARB") long r10, @org.lwjgl.system.NativeType("void *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferSubDataARB
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

    public static void glGetBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptrARB") long r10, @org.lwjgl.system.NativeType("void *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferSubDataARB
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

    public static void glGetBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptrARB") long r10, @org.lwjgl.system.NativeType("void *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferSubDataARB
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

    public static void glGetBufferSubDataARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLintptrARB") long r10, @org.lwjgl.system.NativeType("void *") double[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferSubDataARB
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

    public static void glGetBufferParameterivARB(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferParameterivARB
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
