package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVVertexBufferUnifiedMemory.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVVertexBufferUnifiedMemory.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVVertexBufferUnifiedMemory.class */
public class NVVertexBufferUnifiedMemory {
    public static final int GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV = 36638;
    public static final int GL_ELEMENT_ARRAY_UNIFIED_NV = 36639;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV = 36640;
    public static final int GL_TEXTURE_COORD_ARRAY_ADDRESS_NV = 36645;
    public static final int GL_VERTEX_ARRAY_ADDRESS_NV = 36641;
    public static final int GL_NORMAL_ARRAY_ADDRESS_NV = 36642;
    public static final int GL_COLOR_ARRAY_ADDRESS_NV = 36643;
    public static final int GL_INDEX_ARRAY_ADDRESS_NV = 36644;
    public static final int GL_EDGE_FLAG_ARRAY_ADDRESS_NV = 36646;
    public static final int GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV = 36647;
    public static final int GL_FOG_COORD_ARRAY_ADDRESS_NV = 36648;
    public static final int GL_ELEMENT_ARRAY_ADDRESS_NV = 36649;
    public static final int GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV = 36650;
    public static final int GL_TEXTURE_COORD_ARRAY_LENGTH_NV = 36655;
    public static final int GL_VERTEX_ARRAY_LENGTH_NV = 36651;
    public static final int GL_NORMAL_ARRAY_LENGTH_NV = 36652;
    public static final int GL_COLOR_ARRAY_LENGTH_NV = 36653;
    public static final int GL_INDEX_ARRAY_LENGTH_NV = 36654;
    public static final int GL_EDGE_FLAG_ARRAY_LENGTH_NV = 36656;
    public static final int GL_SECONDARY_COLOR_ARRAY_LENGTH_NV = 36657;
    public static final int GL_FOG_COORD_ARRAY_LENGTH_NV = 36658;
    public static final int GL_ELEMENT_ARRAY_LENGTH_NV = 36659;

    protected NVVertexBufferUnifiedMemory() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glBufferAddressRangeNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint64EXT") long r2, @org.lwjgl.system.NativeType("GLsizeiptr") long r4);

    public static native void glVertexFormatNV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2);

    public static native void glNormalFormatNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1);

    public static native void glColorFormatNV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2);

    public static native void glIndexFormatNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1);

    public static native void glTexCoordFormatNV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2);

    public static native void glEdgeFlagFormatNV(@org.lwjgl.system.NativeType("GLsizei") int r0);

    public static native void glSecondaryColorFormatNV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2);

    public static native void glFogCoordFormatNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1);

    public static native void glVertexAttribFormatNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLboolean") boolean r3, @org.lwjgl.system.NativeType("GLsizei") int r4);

    public static native void glVertexAttribIFormatNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static native void nglGetIntegerui64i_vNV(int r0, int r1, long r2);

    public static void glGetIntegerui64i_vNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint64EXT *") java.nio.LongBuffer r7) {
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
            nglGetIntegerui64i_vNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetIntegerui64iNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.LongBuffer r0 = r0.callocLong(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetIntegerui64i_vNV(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static void glGetIntegerui64i_vNV(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint64EXT *") long[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetIntegerui64i_vNV
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
