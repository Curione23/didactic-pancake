package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/GlShader.class */
public class GlShader {
    private static final java.lang.String TAG = "GlShader";
    private int program;

    private static int compileShader(int r5, java.lang.String r6) {
            r0 = r5
            int r0 = android.opengl.GLES20.glCreateShader(r0)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L19
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            int r2 = android.opengl.GLES20.glGetError()
            java.lang.String r2 = "glCreateShader() failed. GLES20 error: " + r2
            r1.<init>(r2)
            throw r0
        L19:
            r0 = r7
            r1 = r6
            android.opengl.GLES20.glShaderSource(r0, r1)
            r0 = r7
            android.opengl.GLES20.glCompileShader(r0)
            r0 = 1
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r8 = r0
            r0 = r7
            r1 = 35713(0x8b81, float:5.0045E-41)
            r2 = r8
            r3 = 0
            android.opengl.GLES20.glGetShaderiv(r0, r1, r2, r3)
            r0 = r8
            r1 = 0
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L54
            java.lang.String r0 = "GlShader"
            r1 = r7
            java.lang.String r1 = android.opengl.GLES20.glGetShaderInfoLog(r1)
            r2 = r6
            java.lang.String r1 = "Compile error " + r1 + " in shader:\n" + r2
            org.webrtc.Logging.e(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            java.lang.String r2 = android.opengl.GLES20.glGetShaderInfoLog(r2)
            r1.<init>(r2)
            throw r0
        L54:
            java.lang.String r0 = "compileShader"
            org.webrtc.GlUtil.checkNoGLES2Error(r0)
            r0 = r7
            return r0
    }

    public GlShader(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = 35633(0x8b31, float:4.9932E-41)
            r1 = r6
            int r0 = compileShader(r0, r1)
            r8 = r0
            r0 = 35632(0x8b30, float:4.9931E-41)
            r1 = r7
            int r0 = compileShader(r0, r1)
            r9 = r0
            r0 = r5
            int r1 = android.opengl.GLES20.glCreateProgram()
            r0.program = r1
            r0 = r5
            int r0 = r0.program
            if (r0 != 0) goto L31
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            int r2 = android.opengl.GLES20.glGetError()
            java.lang.String r2 = "glCreateProgram() failed. GLES20 error: " + r2
            r1.<init>(r2)
            throw r0
        L31:
            r0 = r5
            int r0 = r0.program
            r1 = r8
            android.opengl.GLES20.glAttachShader(r0, r1)
            r0 = r5
            int r0 = r0.program
            r1 = r9
            android.opengl.GLES20.glAttachShader(r0, r1)
            r0 = r5
            int r0 = r0.program
            android.opengl.GLES20.glLinkProgram(r0)
            r0 = 1
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r10 = r0
            r0 = r5
            int r0 = r0.program
            r1 = 35714(0x8b82, float:5.0046E-41)
            r2 = r10
            r3 = 0
            android.opengl.GLES20.glGetProgramiv(r0, r1, r2, r3)
            r0 = r10
            r1 = 0
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L86
            java.lang.String r0 = "GlShader"
            r1 = r5
            int r1 = r1.program
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r1)
            java.lang.String r1 = "Could not link program: " + r1
            org.webrtc.Logging.e(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            int r2 = r2.program
            java.lang.String r2 = android.opengl.GLES20.glGetProgramInfoLog(r2)
            r1.<init>(r2)
            throw r0
        L86:
            r0 = r8
            android.opengl.GLES20.glDeleteShader(r0)
            r0 = r9
            android.opengl.GLES20.glDeleteShader(r0)
            java.lang.String r0 = "Creating GlShader"
            org.webrtc.GlUtil.checkNoGLES2Error(r0)
            return
    }

    public int getAttribLocation(java.lang.String r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.program
            r1 = -1
            if (r0 != r1) goto L12
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "The program has been released"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r4
            int r0 = r0.program
            r1 = r5
            int r0 = android.opengl.GLES20.glGetAttribLocation(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 >= 0) goto L2d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            java.lang.String r2 = "Could not locate '" + r2 + "' in program"
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r6
            return r0
    }

    public void setVertexAttribArray(java.lang.String r7, int r8, java.nio.FloatBuffer r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = r9
            r0.setVertexAttribArray(r1, r2, r3, r4)
            return
    }

    public void setVertexAttribArray(java.lang.String r8, int r9, int r10, java.nio.FloatBuffer r11) {
            r7 = this;
            r0 = r7
            int r0 = r0.program
            r1 = -1
            if (r0 != r1) goto L12
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "The program has been released"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r7
            r1 = r8
            int r0 = r0.getAttribLocation(r1)
            r12 = r0
            r0 = r12
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            r0 = r12
            r1 = r9
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = 0
            r4 = r10
            r5 = r11
            android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "setVertexAttribArray"
            org.webrtc.GlUtil.checkNoGLES2Error(r0)
            return
    }

    public int getUniformLocation(java.lang.String r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.program
            r1 = -1
            if (r0 != r1) goto L12
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "The program has been released"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r4
            int r0 = r0.program
            r1 = r5
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 >= 0) goto L2d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            java.lang.String r2 = "Could not locate uniform '" + r2 + "' in program"
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r6
            return r0
    }

    public void useProgram() {
            r4 = this;
            r0 = r4
            int r0 = r0.program
            r1 = -1
            if (r0 != r1) goto L12
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "The program has been released"
            r1.<init>(r2)
            throw r0
        L12:
            java.lang.Object r0 = org.webrtc.EglBase.lock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r4
            int r0 = r0.program     // Catch: java.lang.Throwable -> L24
            android.opengl.GLES20.glUseProgram(r0)     // Catch: java.lang.Throwable -> L24
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            throw r0
        L29:
            java.lang.String r0 = "glUseProgram"
            org.webrtc.GlUtil.checkNoGLES2Error(r0)
            return
    }

    public void release() {
            r3 = this;
            java.lang.String r0 = "GlShader"
            java.lang.String r1 = "Deleting shader."
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            int r0 = r0.program
            r1 = -1
            if (r0 == r1) goto L1b
            r0 = r3
            int r0 = r0.program
            android.opengl.GLES20.glDeleteProgram(r0)
            r0 = r3
            r1 = -1
            r0.program = r1
        L1b:
            return
    }
}
