package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGGLConfig.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGGLConfig.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGGLConfig.class */
final class NanoVGGLConfig {
    private NanoVGGLConfig() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static void configGL(long r4) {
            r0 = r4
            java.lang.String r1 = "org.lwjgl.opengl.GL"
            org.lwjgl.system.FunctionProvider r1 = getFunctionProvider(r1)
            config(r0, r1)
            return
    }

    static void configGLES(long r4) {
            r0 = r4
            java.lang.String r1 = "org.lwjgl.opengles.GLES"
            org.lwjgl.system.FunctionProvider r1 = getFunctionProvider(r1)
            config(r0, r1)
            return
    }

    private static org.lwjgl.system.FunctionProvider getFunctionProvider(java.lang.String r4) {
            r0 = r4
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L32
            r5 = r0
            r0 = r5
            java.lang.String r1 = "getCapabilities"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L32
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L32
            r6 = r0
            r0 = r6
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L32
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L32
            r0 = r5
            java.lang.String r1 = "getFunctionProvider"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L32
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L32
            r7 = r0
            r0 = r7
            r1 = 0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L32
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L32
            org.lwjgl.system.FunctionProvider r0 = (org.lwjgl.system.FunctionProvider) r0     // Catch: java.lang.Exception -> L32
            return r0
        L32:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    private static void config(long r6, org.lwjgl.system.FunctionProvider r8) {
            r0 = 67
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "glActiveTexture"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "glAttachShader"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "glBindAttribLocation"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "glBindBuffer"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "glBindBufferRange"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "glBindFramebuffer"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "glBindRenderbuffer"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "glBindTexture"
            r1[r2] = r3
            r1 = r0
            r2 = 8
            java.lang.String r3 = "glBindVertexArray"
            r1[r2] = r3
            r1 = r0
            r2 = 9
            java.lang.String r3 = "glBlendFunc"
            r1[r2] = r3
            r1 = r0
            r2 = 10
            java.lang.String r3 = "glBlendFuncSeparate"
            r1[r2] = r3
            r1 = r0
            r2 = 11
            java.lang.String r3 = "glBufferData"
            r1[r2] = r3
            r1 = r0
            r2 = 12
            java.lang.String r3 = "glCheckFramebufferStatus"
            r1[r2] = r3
            r1 = r0
            r2 = 13
            java.lang.String r3 = "glColorMask"
            r1[r2] = r3
            r1 = r0
            r2 = 14
            java.lang.String r3 = "glCompileShader"
            r1[r2] = r3
            r1 = r0
            r2 = 15
            java.lang.String r3 = "glCreateProgram"
            r1[r2] = r3
            r1 = r0
            r2 = 16
            java.lang.String r3 = "glCreateShader"
            r1[r2] = r3
            r1 = r0
            r2 = 17
            java.lang.String r3 = "glCullFace"
            r1[r2] = r3
            r1 = r0
            r2 = 18
            java.lang.String r3 = "glDeleteBuffers"
            r1[r2] = r3
            r1 = r0
            r2 = 19
            java.lang.String r3 = "glDeleteFramebuffers"
            r1[r2] = r3
            r1 = r0
            r2 = 20
            java.lang.String r3 = "glDeleteProgram"
            r1[r2] = r3
            r1 = r0
            r2 = 21
            java.lang.String r3 = "glDeleteRenderbuffers"
            r1[r2] = r3
            r1 = r0
            r2 = 22
            java.lang.String r3 = "glDeleteShader"
            r1[r2] = r3
            r1 = r0
            r2 = 23
            java.lang.String r3 = "glDeleteTextures"
            r1[r2] = r3
            r1 = r0
            r2 = 24
            java.lang.String r3 = "glDeleteVertexArrays"
            r1[r2] = r3
            r1 = r0
            r2 = 25
            java.lang.String r3 = "glDetachShader"
            r1[r2] = r3
            r1 = r0
            r2 = 26
            java.lang.String r3 = "glDisable"
            r1[r2] = r3
            r1 = r0
            r2 = 27
            java.lang.String r3 = "glDisableVertexAttribArray"
            r1[r2] = r3
            r1 = r0
            r2 = 28
            java.lang.String r3 = "glDrawArrays"
            r1[r2] = r3
            r1 = r0
            r2 = 29
            java.lang.String r3 = "glEnable"
            r1[r2] = r3
            r1 = r0
            r2 = 30
            java.lang.String r3 = "glEnableVertexAttribArray"
            r1[r2] = r3
            r1 = r0
            r2 = 31
            java.lang.String r3 = "glFinish"
            r1[r2] = r3
            r1 = r0
            r2 = 32
            java.lang.String r3 = "glFlush"
            r1[r2] = r3
            r1 = r0
            r2 = 33
            java.lang.String r3 = "glFramebufferRenderbuffer"
            r1[r2] = r3
            r1 = r0
            r2 = 34
            java.lang.String r3 = "glFramebufferTexture2D"
            r1[r2] = r3
            r1 = r0
            r2 = 35
            java.lang.String r3 = "glFrontFace"
            r1[r2] = r3
            r1 = r0
            r2 = 36
            java.lang.String r3 = "glGenBuffers"
            r1[r2] = r3
            r1 = r0
            r2 = 37
            java.lang.String r3 = "glGenFramebuffers"
            r1[r2] = r3
            r1 = r0
            r2 = 38
            java.lang.String r3 = "glGenRenderbuffers"
            r1[r2] = r3
            r1 = r0
            r2 = 39
            java.lang.String r3 = "glGenTextures"
            r1[r2] = r3
            r1 = r0
            r2 = 40
            java.lang.String r3 = "glGenVertexArrays"
            r1[r2] = r3
            r1 = r0
            r2 = 41
            java.lang.String r3 = "glGenerateMipmap"
            r1[r2] = r3
            r1 = r0
            r2 = 42
            java.lang.String r3 = "glGetError"
            r1[r2] = r3
            r1 = r0
            r2 = 43
            java.lang.String r3 = "glGetIntegerv"
            r1[r2] = r3
            r1 = r0
            r2 = 44
            java.lang.String r3 = "glGetProgramiv"
            r1[r2] = r3
            r1 = r0
            r2 = 45
            java.lang.String r3 = "glGetProgramInfoLog"
            r1[r2] = r3
            r1 = r0
            r2 = 46
            java.lang.String r3 = "glGetShaderiv"
            r1[r2] = r3
            r1 = r0
            r2 = 47
            java.lang.String r3 = "glGetShaderInfoLog"
            r1[r2] = r3
            r1 = r0
            r2 = 48
            java.lang.String r3 = "glGetUniformBlockIndex"
            r1[r2] = r3
            r1 = r0
            r2 = 49
            java.lang.String r3 = "glGetUniformLocation"
            r1[r2] = r3
            r1 = r0
            r2 = 50
            java.lang.String r3 = "glLinkProgram"
            r1[r2] = r3
            r1 = r0
            r2 = 51
            java.lang.String r3 = "glPixelStorei"
            r1[r2] = r3
            r1 = r0
            r2 = 52
            java.lang.String r3 = "glRenderbufferStorage"
            r1[r2] = r3
            r1 = r0
            r2 = 53
            java.lang.String r3 = "glShaderSource"
            r1[r2] = r3
            r1 = r0
            r2 = 54
            java.lang.String r3 = "glStencilFunc"
            r1[r2] = r3
            r1 = r0
            r2 = 55
            java.lang.String r3 = "glStencilMask"
            r1[r2] = r3
            r1 = r0
            r2 = 56
            java.lang.String r3 = "glStencilOp"
            r1[r2] = r3
            r1 = r0
            r2 = 57
            java.lang.String r3 = "glStencilOpSeparate"
            r1[r2] = r3
            r1 = r0
            r2 = 58
            java.lang.String r3 = "glTexImage2D"
            r1[r2] = r3
            r1 = r0
            r2 = 59
            java.lang.String r3 = "glTexParameteri"
            r1[r2] = r3
            r1 = r0
            r2 = 60
            java.lang.String r3 = "glTexSubImage2D"
            r1[r2] = r3
            r1 = r0
            r2 = 61
            java.lang.String r3 = "glUniform1i"
            r1[r2] = r3
            r1 = r0
            r2 = 62
            java.lang.String r3 = "glUniform2fv"
            r1[r2] = r3
            r1 = r0
            r2 = 63
            java.lang.String r3 = "glUniform4fv"
            r1[r2] = r3
            r1 = r0
            r2 = 64
            java.lang.String r3 = "glUniformBlockBinding"
            r1[r2] = r3
            r1 = r0
            r2 = 65
            java.lang.String r3 = "glUseProgram"
            r1[r2] = r3
            r1 = r0
            r2 = 66
            java.lang.String r3 = "glVertexAttribPointer"
            r1[r2] = r3
            r9 = r0
            r0 = r6
            r1 = r9
            int r1 = r1.length
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBuffer(r0, r1)
            r10 = r0
            r0 = 0
            r11 = r0
        L19d:
            r0 = r11
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L1bc
            r0 = r10
            r1 = r11
            r2 = r8
            r3 = r9
            r4 = r11
            r3 = r3[r4]
            long r2 = r2.getFunctionAddress(r3)
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
            int r11 = r11 + 1
            goto L19d
        L1bc:
            return
    }
}
