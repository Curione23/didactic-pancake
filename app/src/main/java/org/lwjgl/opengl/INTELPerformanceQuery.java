package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/INTELPerformanceQuery.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/INTELPerformanceQuery.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/INTELPerformanceQuery.class */
public class INTELPerformanceQuery {
    public static final int GL_PERFQUERY_SINGLE_CONTEXT_INTEL = 0;
    public static final int GL_PERFQUERY_GLOBAL_CONTEXT_INTEL = 1;
    public static final int GL_PERFQUERY_WAIT_INTEL = 33787;
    public static final int GL_PERFQUERY_FLUSH_INTEL = 33786;
    public static final int GL_PERFQUERY_DONOT_FLUSH_INTEL = 33785;
    public static final int GL_PERFQUERY_COUNTER_EVENT_INTEL = 38128;
    public static final int GL_PERFQUERY_COUNTER_DURATION_NORM_INTEL = 38129;
    public static final int GL_PERFQUERY_COUNTER_DURATION_RAW_INTEL = 38130;
    public static final int GL_PERFQUERY_COUNTER_THROUGHPUT_INTEL = 38131;
    public static final int GL_PERFQUERY_COUNTER_RAW_INTEL = 38132;
    public static final int GL_PERFQUERY_COUNTER_TIMESTAMP_INTEL = 38133;
    public static final int GL_PERFQUERY_COUNTER_DATA_UINT32_INTEL = 38136;
    public static final int GL_PERFQUERY_COUNTER_DATA_UINT64_INTEL = 38137;
    public static final int GL_PERFQUERY_COUNTER_DATA_FLOAT_INTEL = 38138;
    public static final int GL_PERFQUERY_COUNTER_DATA_DOUBLE_INTEL = 38139;
    public static final int GL_PERFQUERY_COUNTER_DATA_BOOL32_INTEL = 38140;
    public static final int GL_PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL = 38141;
    public static final int GL_PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL = 38142;
    public static final int GL_PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL = 38143;
    public static final int GL_PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL = 38144;

    protected INTELPerformanceQuery() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glBeginPerfQueryINTEL(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglCreatePerfQueryINTEL(int r0, long r1);

    public static void glCreatePerfQueryINTEL(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglCreatePerfQueryINTEL(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreatePerfQueryINTEL(@org.lwjgl.system.NativeType("GLuint") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L26
            r7 = r0
            r0 = r4
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L26
            nglCreatePerfQueryINTEL(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r7
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            return r0
        L26:
            r9 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            throw r0
    }

    public static native void glDeletePerfQueryINTEL(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glEndPerfQueryINTEL(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglGetFirstPerfQueryIdINTEL(long r0);

    public static void glGetFirstPerfQueryIdINTEL(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglGetFirstPerfQueryIdINTEL(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetFirstPerfQueryIdINTEL() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r3 = r0
            r0 = r3
            int r0 = r0.getPointer()
            r4 = r0
            r0 = r3
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L23
            r5 = r0
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L23
            nglGetFirstPerfQueryIdINTEL(r0)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L23
            r6 = r0
            r0 = r3
            r1 = r4
            r0.setPointer(r1)
            r0 = r6
            return r0
        L23:
            r7 = move-exception
            r0 = r3
            r1 = r4
            r0.setPointer(r1)
            r0 = r7
            throw r0
    }

    public static native void nglGetNextPerfQueryIdINTEL(int r0, long r1);

    public static void glGetNextPerfQueryIdINTEL(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetNextPerfQueryIdINTEL(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetNextPerfQueryIdINTEL(@org.lwjgl.system.NativeType("GLuint") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L26
            r7 = r0
            r0 = r4
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L26
            nglGetNextPerfQueryIdINTEL(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r7
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            return r0
        L26:
            r9 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            throw r0
    }

    public static native void nglGetPerfCounterInfoINTEL(int r0, int r1, int r2, long r3, int r5, long r6, long r8, long r10, long r12, long r14, long r16);

    public static void glGetPerfCounterInfoINTEL(@org.lwjgl.system.NativeType("GLuint") int r19, @org.lwjgl.system.NativeType("GLuint") int r20, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r21, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r22, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r23, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r24, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r25, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r26, @org.lwjgl.system.NativeType("GLuint64 *") java.nio.LongBuffer r27) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r23
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r24
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r25
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r26
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r27
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L24:
            r0 = r19
            r1 = r20
            r2 = r21
            int r2 = r2.remaining()
            r3 = r21
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r22
            int r4 = r4.remaining()
            r5 = r22
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r23
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r24
            long r7 = org.lwjgl.system.MemoryUtil.memAddress(r7)
            r8 = r25
            long r8 = org.lwjgl.system.MemoryUtil.memAddress(r8)
            r9 = r26
            long r9 = org.lwjgl.system.MemoryUtil.memAddress(r9)
            r10 = r27
            long r10 = org.lwjgl.system.MemoryUtil.memAddress(r10)
            nglGetPerfCounterInfoINTEL(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static native void nglGetPerfQueryDataINTEL(int r0, int r1, int r2, long r3, long r5);

    public static void glGetPerfQueryDataINTEL(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            r2 = r10
            int r2 = r2.remaining()
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetPerfQueryDataINTEL(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetPerfQueryIdByNameINTEL(long r0, long r2);

    public static void glGetPerfQueryIdByNameINTEL(@org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lf:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetPerfQueryIdByNameINTEL(r0, r1)
            return
    }

    public static void glGetPerfQueryIdByNameINTEL(@org.lwjgl.system.NativeType("GLchar *") java.lang.CharSequence r5, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = r5
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L32
            r0 = r7
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L32
            r9 = r0
            r0 = r9
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L32
            nglGetPerfQueryIdByNameINTEL(r0, r1)     // Catch: java.lang.Throwable -> L32
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            goto L3c
        L32:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
        L3c:
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetPerfQueryIdByNameINTEL(@org.lwjgl.system.NativeType("GLchar *") java.lang.CharSequence r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r5
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L35
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L35
            r8 = r0
            r0 = r6
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L35
            r10 = r0
            r0 = r8
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L35
            nglGetPerfQueryIdByNameINTEL(r0, r1)     // Catch: java.lang.Throwable -> L35
            r0 = r10
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L35
            r11 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r11
            return r0
        L35:
            r12 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native void nglGetPerfQueryInfoINTEL(int r0, int r1, long r2, long r4, long r6, long r8, long r10);

    public static void glGetPerfQueryInfoINTEL(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r17, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r13
            r1 = r14
            int r1 = r1.remaining()
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r18
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglGetPerfQueryInfoINTEL(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCreatePerfQueryINTEL(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glCreatePerfQueryINTEL
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetFirstPerfQueryIdINTEL(@org.lwjgl.system.NativeType("GLuint *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetFirstPerfQueryIdINTEL
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glGetNextPerfQueryIdINTEL(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetNextPerfQueryIdINTEL
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetPerfCounterInfoINTEL(@org.lwjgl.system.NativeType("GLuint") int r16, @org.lwjgl.system.NativeType("GLuint") int r17, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r18, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r19, @org.lwjgl.system.NativeType("GLuint *") int[] r20, @org.lwjgl.system.NativeType("GLuint *") int[] r21, @org.lwjgl.system.NativeType("GLuint *") int[] r22, @org.lwjgl.system.NativeType("GLuint *") int[] r23, @org.lwjgl.system.NativeType("GLuint64 *") long[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfCounterInfoINTEL
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L32
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r20
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r22
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r23
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r24
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L32:
            r0 = r16
            r1 = r17
            r2 = r18
            int r2 = r2.remaining()
            r3 = r18
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r19
            int r4 = r4.remaining()
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPPPPPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glGetPerfQueryDataINTEL(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("GLuint *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfQueryDataINTEL
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r9
            r1 = r10
            r2 = r11
            int r2 = r2.remaining()
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetPerfQueryIdByNameINTEL(@org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("GLuint *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfQueryIdByNameINTEL
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void glGetPerfQueryIdByNameINTEL(@org.lwjgl.system.NativeType("GLchar *") java.lang.CharSequence r6, @org.lwjgl.system.NativeType("GLuint *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfQueryIdByNameINTEL
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r6
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L43
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L43
            r12 = r0
            r0 = r12
            r1 = r7
            r2 = r8
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)     // Catch: java.lang.Throwable -> L43
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            goto L4f
        L43:
            r14 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            throw r0
        L4f:
            return
    }

    public static void glGetPerfQueryInfoINTEL(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("GLuint *") int[] r13, @org.lwjgl.system.NativeType("GLuint *") int[] r14, @org.lwjgl.system.NativeType("GLuint *") int[] r15, @org.lwjgl.system.NativeType("GLuint *") int[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetPerfQueryInfoINTEL
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2a
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L2a:
            r0 = r11
            r1 = r12
            int r1 = r1.remaining()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            org.lwjgl.system.JNI.callPPPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
