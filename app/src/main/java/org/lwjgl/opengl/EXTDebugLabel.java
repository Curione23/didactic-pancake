package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTDebugLabel.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTDebugLabel.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTDebugLabel.class */
public class EXTDebugLabel {
    public static final int GL_BUFFER_OBJECT_EXT = 37201;
    public static final int GL_SHADER_OBJECT_EXT = 35656;
    public static final int GL_PROGRAM_OBJECT_EXT = 35648;
    public static final int GL_VERTEX_ARRAY_OBJECT_EXT = 37204;
    public static final int GL_QUERY_OBJECT_EXT = 37203;
    public static final int GL_PROGRAM_PIPELINE_OBJECT_EXT = 35407;

    protected EXTDebugLabel() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglLabelObjectEXT(int r0, int r1, int r2, long r3);

    public static void glLabelObjectEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglLabelObjectEXT(r0, r1, r2, r3)
            return
    }

    public static void glLabelObjectEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r8
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2a
            r11 = r0
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2a
            r12 = r0
            r0 = r6
            r1 = r7
            r2 = r11
            r3 = r12
            nglLabelObjectEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            goto L35
        L2a:
            r14 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
        L35:
            return
    }

    public static native void nglGetObjectLabelEXT(int r0, int r1, int r2, long r3, long r5);

    public static void glGetObjectLabelEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetObjectLabelEXT(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetObjectLabelEXT(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L3e
            r13 = r0
            r0 = r11
            r1 = r10
            java.nio.ByteBuffer r0 = r0.malloc(r1)     // Catch: java.lang.Throwable -> L3e
            r14 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L3e
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L3e
            nglGetObjectLabelEXT(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L3e
            r0 = r14
            r1 = r13
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r15 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            return r0
        L3e:
            r16 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    public static void glGetObjectLabelEXT(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLsizei *") int[] r11, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetObjectLabelEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.remaining()
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r13
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
