package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShadingLanguageInclude.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShadingLanguageInclude.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShadingLanguageInclude.class */
public class ARBShadingLanguageInclude {
    public static final int GL_SHADER_INCLUDE_ARB = 36270;
    public static final int GL_NAMED_STRING_LENGTH_ARB = 36329;
    public static final int GL_NAMED_STRING_TYPE_ARB = 36330;

    protected ARBShadingLanguageInclude() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglNamedStringARB(int r0, int r1, long r2, int r4, long r5);

    public static void glNamedStringARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r10) {
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            int r3 = r3.remaining()
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglNamedStringARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedStringARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r9
            r2 = 0
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L3b
            r13 = r0
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3b
            r14 = r0
            r0 = r11
            r1 = r10
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L3b
            r16 = r0
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3b
            r17 = r0
            r0 = r8
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            nglNamedStringARB(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L3b
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            goto L46
        L3b:
            r19 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r19
            throw r0
        L46:
            return
    }

    public static native void nglDeleteNamedStringARB(int r0, long r1);

    public static void glDeleteNamedStringARB(@org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglDeleteNamedStringARB(r0, r1)
            return
    }

    public static void glDeleteNamedStringARB(@org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 0
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L24
            r7 = r0
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L24
            r8 = r0
            r0 = r7
            r1 = r8
            nglDeleteNamedStringARB(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            goto L2e
        L24:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            throw r0
        L2e:
            return
    }

    public static native void nglCompileShaderIncludeARB(int r0, int r1, long r2, long r4);

    public static void glCompileShaderIncludeARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Le:
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nglCompileShaderIncludeARB(r0, r1, r2, r3)
            return
    }

    public static native boolean nglIsNamedStringARB(int r0, long r1);

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsNamedStringARB(@org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            boolean r0 = nglIsNamedStringARB(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsNamedStringARB(@org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 0
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L26
            r7 = r0
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r7
            r1 = r8
            boolean r0 = nglIsNamedStringARB(r0, r1)     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            return r0
        L26:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetNamedStringARB(int r0, long r1, int r3, long r4, long r6);

    public static void glGetNamedStringARB(@org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r9
            int r0 = r0.remaining()
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            int r2 = r2.remaining()
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetNamedStringARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedStringARB(@org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r9
            r2 = 0
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L3f
            r14 = r0
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3f
            r15 = r0
            r0 = r14
            r1 = r15
            r2 = r11
            int r2 = r2.remaining()     // Catch: java.lang.Throwable -> L3f
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)     // Catch: java.lang.Throwable -> L3f
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L3f
            nglGetNamedStringARB(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L3f
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            goto L4a
        L3f:
            r17 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r17
            throw r0
        L4a:
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetNamedStringARB(@org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r9
            r2 = 0
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L4c
            r13 = r0
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4c
            r14 = r0
            r0 = r11
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L4c
            r16 = r0
            r0 = r11
            r1 = r10
            java.nio.ByteBuffer r0 = r0.malloc(r1)     // Catch: java.lang.Throwable -> L4c
            r17 = r0
            r0 = r13
            r1 = r14
            r2 = r10
            r3 = r16
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L4c
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L4c
            nglGetNamedStringARB(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4c
            r0 = r17
            r1 = r16
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0, r1)     // Catch: java.lang.Throwable -> L4c
            r18 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r18
            return r0
        L4c:
            r19 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r19
            throw r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetNamedStringARB(@org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r4) {
            r0 = r4
            r1 = r4
            r2 = 36329(0x8de9, float:5.0908E-41)
            int r1 = glGetNamedStringiARB(r1, r2)
            java.lang.String r0 = glGetNamedStringARB(r0, r1)
            return r0
    }

    public static native void nglGetNamedStringivARB(int r0, long r1, int r3, long r4);

    public static void glGetNamedStringivARB(@org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            int r0 = r0.remaining()
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetNamedStringivARB(r0, r1, r2, r3)
            return
    }

    public static void glGetNamedStringivARB(@org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r7
            r2 = 0
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L38
            r12 = r0
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L38
            r13 = r0
            r0 = r12
            r1 = r13
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L38
            nglGetNamedStringivARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L38
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            goto L43
        L38:
            r15 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r15
            throw r0
        L43:
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetNamedStringiARB(@org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r7
            r2 = 0
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L3b
            r11 = r0
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3b
            r12 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L3b
            r14 = r0
            r0 = r11
            r1 = r12
            r2 = r8
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L3b
            nglGetNamedStringivARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L3b
            r0 = r14
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3b
            r15 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r15
            return r0
        L3b:
            r16 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    public static void glCompileShaderIncludeARB(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glCompileShaderIncludeARB
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1a:
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedStringARB(@org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint *") int[] r11, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedStringARB
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r10
            int r0 = r0.remaining()
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            int r2 = r2.remaining()
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetNamedStringARB(@org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint *") int[] r11, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedStringARB
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r10
            r2 = 0
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L4e
            r17 = r0
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4e
            r18 = r0
            r0 = r17
            r1 = r18
            r2 = r12
            int r2 = r2.remaining()     // Catch: java.lang.Throwable -> L4e
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L4e
            r5 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4e
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            goto L5a
        L4e:
            r20 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r20
            throw r0
        L5a:
            return
    }

    public static void glGetNamedStringivARB(@org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedStringivARB
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r8
            int r0 = r0.remaining()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetNamedStringivARB(@org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNamedStringivARB
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r8
            r2 = 0
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L47
            r15 = r0
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L47
            r16 = r0
            r0 = r15
            r1 = r16
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L47
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            goto L53
        L47:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
        L53:
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
