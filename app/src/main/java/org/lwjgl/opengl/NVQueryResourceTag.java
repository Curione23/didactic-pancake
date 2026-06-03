package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVQueryResourceTag.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVQueryResourceTag.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVQueryResourceTag.class */
public class NVQueryResourceTag {
    protected NVQueryResourceTag() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglGenQueryResourceTagNV(int r0, long r1);

    public static void glGenQueryResourceTagNV(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGenQueryResourceTagNV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenQueryResourceTagNV() {
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
            nglGenQueryResourceTagNV(r0, r1)     // Catch: java.lang.Throwable -> L24
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

    public static native void nglDeleteQueryResourceTagNV(int r0, long r1);

    public static void glDeleteQueryResourceTagNV(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglDeleteQueryResourceTagNV(r0, r1)
            return
    }

    public static void glDeleteQueryResourceTagNV(@org.lwjgl.system.NativeType("GLuint const *") int r4) {
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
            nglDeleteQueryResourceTagNV(r0, r1)     // Catch: java.lang.Throwable -> L1f
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

    public static native void nglQueryResourceTagNV(int r0, long r1);

    public static void glQueryResourceTagNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglQueryResourceTagNV(r0, r1)
            return
    }

    public static void glQueryResourceTagNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r5
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L24
            r8 = r0
            r0 = r4
            r1 = r8
            nglQueryResourceTagNV(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            goto L2e
        L24:
            r10 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            throw r0
        L2e:
            return
    }

    public static void glGenQueryResourceTagNV(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGenQueryResourceTagNV
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

    public static void glDeleteQueryResourceTagNV(@org.lwjgl.system.NativeType("GLuint const *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDeleteQueryResourceTagNV
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
