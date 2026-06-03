package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDPerformanceMonitor.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDPerformanceMonitor.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDPerformanceMonitor.class */
public class AMDPerformanceMonitor {
    public static final int GL_COUNTER_TYPE_AMD = 35776;
    public static final int GL_COUNTER_RANGE_AMD = 35777;
    public static final int GL_UNSIGNED_INT64_AMD = 35778;
    public static final int GL_PERCENTAGE_AMD = 35779;
    public static final int GL_PERFMON_RESULT_AVAILABLE_AMD = 35780;
    public static final int GL_PERFMON_RESULT_SIZE_AMD = 35781;
    public static final int GL_PERFMON_RESULT_AMD = 35782;

    protected AMDPerformanceMonitor() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglGetPerfMonitorGroupsAMD(long r0, int r2, long r3);

    public static void glGetPerfMonitorGroupsAMD(@javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r7
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nglGetPerfMonitorGroupsAMD(r0, r1, r2)
            return
    }

    public static native void nglGetPerfMonitorCountersAMD(int r0, long r1, long r3, int r5, long r6);

    public static void glGetPerfMonitorCountersAMD(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r9
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            int r3 = r3.remaining()
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetPerfMonitorCountersAMD(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetPerfMonitorGroupStringAMD(int r0, int r1, long r2, long r4);

    public static void glGetPerfMonitorGroupStringAMD(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetPerfMonitorGroupStringAMD(r0, r1, r2, r3)
            return
    }

    public static native void nglGetPerfMonitorCounterStringAMD(int r0, int r1, int r2, long r3, long r5);

    public static void glGetPerfMonitorCounterStringAMD(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglGetPerfMonitorCounterStringAMD(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetPerfMonitorCounterInfoAMD(int r0, int r1, int r2, long r3);

    public static void glGetPerfMonitorCounterInfoAMD(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetPerfMonitorCounterInfoAMD(r0, r1, r2, r3)
            return
    }

    public static void glGetPerfMonitorCounterInfoAMD(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetPerfMonitorCounterInfoAMD(r0, r1, r2, r3)
            return
    }

    public static void glGetPerfMonitorCounterInfoAMD(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetPerfMonitorCounterInfoAMD(r0, r1, r2, r3)
            return
    }

    public static native void nglGenPerfMonitorsAMD(int r0, long r1);

    public static void glGenPerfMonitorsAMD(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGenPerfMonitorsAMD(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenPerfMonitorsAMD() {
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
            nglGenPerfMonitorsAMD(r0, r1)     // Catch: java.lang.Throwable -> L24
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

    public static native void nglDeletePerfMonitorsAMD(int r0, long r1);

    public static void glDeletePerfMonitorsAMD(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglDeletePerfMonitorsAMD(r0, r1)
            return
    }

    public static void glDeletePerfMonitorsAMD(@org.lwjgl.system.NativeType("GLuint *") int r4) {
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
            nglDeletePerfMonitorsAMD(r0, r1)     // Catch: java.lang.Throwable -> L1f
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

    public static native void nglSelectPerfMonitorCountersAMD(int r0, boolean r1, int r2, int r3, long r4);

    public static void glSelectPerfMonitorCountersAMD(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglSelectPerfMonitorCountersAMD(r0, r1, r2, r3, r4)
            return
    }

    public static native void glBeginPerfMonitorAMD(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glEndPerfMonitorAMD(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglGetPerfMonitorCounterDataAMD(int r0, int r1, int r2, long r3, long r5);

    public static void glGetPerfMonitorCounterDataAMD(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            r2 = r10
            int r2 = r2.remaining()
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglGetPerfMonitorCounterDataAMD(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetPerfMonitorGroupsAMD(@javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint *") int[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfMonitorGroupsAMD
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void glGetPerfMonitorCountersAMD(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint *") int[] r9, @org.lwjgl.system.NativeType("GLint *") int[] r10, @org.lwjgl.system.NativeType("GLuint *") int[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfMonitorCountersAMD
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.length
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetPerfMonitorGroupStringAMD(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfMonitorGroupStringAMD
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r8
            r1 = r10
            int r1 = r1.remaining()
            r2 = r9
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetPerfMonitorCounterStringAMD(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfMonitorCounterStringAMD
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L19:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r13
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetPerfMonitorCounterInfoAMD(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfMonitorCounterInfoAMD
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetPerfMonitorCounterInfoAMD(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") float[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfMonitorCounterInfoAMD
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGenPerfMonitorsAMD(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGenPerfMonitorsAMD
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

    public static void glDeletePerfMonitorsAMD(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDeletePerfMonitorsAMD
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

    public static void glSelectPerfMonitorCountersAMD(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLboolean") boolean r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint *") int[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSelectPerfMonitorCountersAMD
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.length
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetPerfMonitorCounterDataAMD(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint *") int[] r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint *") int[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfMonitorCounterDataAMD
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L19:
            r0 = r8
            r1 = r9
            r2 = r10
            int r2 = r2.length
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
