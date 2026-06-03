package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/INTELMapTexture.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/INTELMapTexture.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/INTELMapTexture.class */
public class INTELMapTexture {
    public static final int GL_TEXTURE_MEMORY_LAYOUT_INTEL = 33791;
    public static final int GL_LAYOUT_DEFAULT_INTEL = 0;
    public static final int GL_LAYOUT_LINEAR_INTEL = 1;
    public static final int GL_LAYOUT_LINEAR_CPU_CACHED_INTEL = 2;

    protected INTELMapTexture() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glSyncTextureINTEL(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glUnmapTexture2DINTEL(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native long nglMapTexture2DINTEL(int r0, int r1, int r2, long r3, long r5);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapTexture2DINTEL(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            long r0 = nglMapTexture2DINTEL(r0, r1, r2, r3, r4)
            r13 = r0
            r0 = r13
            r1 = r11
            int r1 = getStride(r1)
            r2 = r8
            r3 = 3553(0xde1, float:4.979E-42)
            r4 = r9
            r5 = 4097(0x1001, float:5.741E-42)
            int r2 = org.lwjgl.opengl.GLChecks.getTexLevelParameteri(r2, r3, r4, r5)
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapTexture2DINTEL(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r12, @javax.annotation.Nullable java.nio.ByteBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            long r0 = nglMapTexture2DINTEL(r0, r1, r2, r3, r4)
            r14 = r0
            r0 = r11
            int r0 = getStride(r0)
            r1 = r8
            r2 = 3553(0xde1, float:4.979E-42)
            r3 = r9
            r4 = 4097(0x1001, float:5.741E-42)
            int r1 = org.lwjgl.opengl.GLChecks.getTexLevelParameteri(r1, r2, r3, r4)
            int r0 = r0 * r1
            r16 = r0
            r0 = r13
            r1 = r14
            r2 = r16
            java.nio.ByteBuffer r0 = org.lwjgl.system.APIUtil.apiGetMappedBuffer(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapTexture2DINTEL(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r12, long r13, @javax.annotation.Nullable java.nio.ByteBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            long r0 = nglMapTexture2DINTEL(r0, r1, r2, r3, r4)
            r16 = r0
            r0 = r15
            r1 = r16
            r2 = r13
            int r2 = (int) r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.APIUtil.apiGetMappedBuffer(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapTexture2DINTEL(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLint *") int[] r11, @org.lwjgl.system.NativeType("GLenum *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMapTexture2DINTEL
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1f:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r15
            r1 = r11
            int r1 = getStride(r1)
            r2 = r8
            r3 = 3553(0xde1, float:4.979E-42)
            r4 = r9
            r5 = 4097(0x1001, float:5.741E-42)
            int r2 = org.lwjgl.opengl.GLChecks.getTexLevelParameteri(r2, r3, r4, r5)
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapTexture2DINTEL(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLint *") int[] r11, @org.lwjgl.system.NativeType("GLenum *") int[] r12, @javax.annotation.Nullable java.nio.ByteBuffer r13) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMapTexture2DINTEL
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1f:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2, r3, r4, r5)
            r16 = r0
            r0 = r11
            int r0 = getStride(r0)
            r1 = r8
            r2 = 3553(0xde1, float:4.979E-42)
            r3 = r9
            r4 = 4097(0x1001, float:5.741E-42)
            int r1 = org.lwjgl.opengl.GLChecks.getTexLevelParameteri(r1, r2, r3, r4)
            int r0 = r0 * r1
            r18 = r0
            r0 = r13
            r1 = r16
            r2 = r18
            java.nio.ByteBuffer r0 = org.lwjgl.system.APIUtil.apiGetMappedBuffer(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapTexture2DINTEL(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLint *") int[] r11, @org.lwjgl.system.NativeType("GLenum *") int[] r12, long r13, @javax.annotation.Nullable java.nio.ByteBuffer r15) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMapTexture2DINTEL
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1f:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r16
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2, r3, r4, r5)
            r18 = r0
            r0 = r15
            r1 = r18
            r2 = r13
            int r2 = (int) r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.APIUtil.apiGetMappedBuffer(r0, r1, r2)
            return r0
    }

    private static int getStride(java.nio.IntBuffer r3) {
            r0 = r3
            r1 = r3
            int r1 = r1.position()
            int r0 = r0.get(r1)
            return r0
    }

    private static int getStride(int[] r3) {
            r0 = r3
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
