package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLUtil.class */
public final class GLUtil {
    private GLUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.Callback setupDebugMessageCallback() {
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            org.lwjgl.system.Callback r0 = setupDebugMessageCallback(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.Callback setupDebugMessageCallback(java.io.PrintStream r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilities()
            r5 = r0
            r0 = r5
            boolean r0 = r0.OpenGL43
            if (r0 == 0) goto L35
            java.lang.String r0 = "[GL] Using OpenGL 4.3 for error logging."
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = r4
            org.lwjgl.system.Callback r0 = (v1, v2, v3, v4, v5, v6, v7) -> { // org.lwjgl.opengl.GLDebugMessageCallbackI.invoke(int, int, int, int, int, long, long):void
                lambda$setupDebugMessageCallback$0(r0, v1, v2, v3, v4, v5, v6, v7);
            }
            org.lwjgl.opengl.GLDebugMessageCallback r0 = org.lwjgl.opengl.GLDebugMessageCallback.create(r0)
            r6 = r0
            r0 = r6
            r1 = 0
            org.lwjgl.opengl.GL43C.glDebugMessageCallback(r0, r1)
            r0 = 33310(0x821e, float:4.6677E-41)
            int r0 = org.lwjgl.opengl.GL43C.glGetInteger(r0)
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L33
            java.lang.String r0 = "[GL] Warning: A non-debug context may not produce any debug output."
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = 37600(0x92e0, float:5.2689E-41)
            org.lwjgl.opengl.GL43C.glEnable(r0)
        L33:
            r0 = r6
            return r0
        L35:
            r0 = r5
            boolean r0 = r0.GL_KHR_debug
            if (r0 == 0) goto L6d
            java.lang.String r0 = "[GL] Using KHR_debug for error logging."
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = r4
            org.lwjgl.system.Callback r0 = (v1, v2, v3, v4, v5, v6, v7) -> { // org.lwjgl.opengl.GLDebugMessageCallbackI.invoke(int, int, int, int, int, long, long):void
                lambda$setupDebugMessageCallback$1(r0, v1, v2, v3, v4, v5, v6, v7);
            }
            org.lwjgl.opengl.GLDebugMessageCallback r0 = org.lwjgl.opengl.GLDebugMessageCallback.create(r0)
            r6 = r0
            r0 = r6
            r1 = 0
            org.lwjgl.opengl.KHRDebug.glDebugMessageCallback(r0, r1)
            r0 = r5
            boolean r0 = r0.OpenGL30
            if (r0 == 0) goto L6b
            r0 = 33310(0x821e, float:4.6677E-41)
            int r0 = org.lwjgl.opengl.GL43C.glGetInteger(r0)
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L6b
            java.lang.String r0 = "[GL] Warning: A non-debug context may not produce any debug output."
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = 37600(0x92e0, float:5.2689E-41)
            org.lwjgl.opengl.GL43C.glEnable(r0)
        L6b:
            r0 = r6
            return r0
        L6d:
            r0 = r5
            boolean r0 = r0.GL_ARB_debug_output
            if (r0 == 0) goto L8a
            java.lang.String r0 = "[GL] Using ARB_debug_output for error logging."
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = r4
            org.lwjgl.system.Callback r0 = (v1, v2, v3, v4, v5, v6, v7) -> { // org.lwjgl.opengl.GLDebugMessageARBCallbackI.invoke(int, int, int, int, int, long, long):void
                lambda$setupDebugMessageCallback$2(r0, v1, v2, v3, v4, v5, v6, v7);
            }
            org.lwjgl.opengl.GLDebugMessageARBCallback r0 = org.lwjgl.opengl.GLDebugMessageARBCallback.create(r0)
            r6 = r0
            r0 = r6
            r1 = 0
            org.lwjgl.opengl.ARBDebugOutput.glDebugMessageCallbackARB(r0, r1)
            r0 = r6
            return r0
        L8a:
            r0 = r5
            boolean r0 = r0.GL_AMD_debug_output
            if (r0 == 0) goto La7
            java.lang.String r0 = "[GL] Using AMD_debug_output for error logging."
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = r4
            org.lwjgl.system.Callback r0 = (v1, v2, v3, v4, v5, v6) -> { // org.lwjgl.opengl.GLDebugMessageAMDCallbackI.invoke(int, int, int, int, long, long):void
                lambda$setupDebugMessageCallback$3(r0, v1, v2, v3, v4, v5, v6);
            }
            org.lwjgl.opengl.GLDebugMessageAMDCallback r0 = org.lwjgl.opengl.GLDebugMessageAMDCallback.create(r0)
            r6 = r0
            r0 = r6
            r1 = 0
            org.lwjgl.opengl.AMDDebugOutput.glDebugMessageCallbackAMD(r0, r1)
            r0 = r6
            return r0
        La7:
            java.lang.String r0 = "[GL] No debug output implementation is available."
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = 0
            return r0
    }

    private static void printDetail(java.lang.StringBuilder r3, java.lang.String r4, java.lang.String r5) {
            r0 = r3
            java.lang.String r1 = "\t"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    private static java.lang.String getDebugSource(int r2) {
            r0 = r2
            switch(r0) {
                case 33350: goto L28;
                case 33351: goto L2b;
                case 33352: goto L2e;
                case 33353: goto L31;
                case 33354: goto L34;
                case 33355: goto L37;
                default: goto L3a;
            }
        L28:
            java.lang.String r0 = "API"
            return r0
        L2b:
            java.lang.String r0 = "WINDOW SYSTEM"
            return r0
        L2e:
            java.lang.String r0 = "SHADER COMPILER"
            return r0
        L31:
            java.lang.String r0 = "THIRD PARTY"
            return r0
        L34:
            java.lang.String r0 = "APPLICATION"
            return r0
        L37:
            java.lang.String r0 = "OTHER"
            return r0
        L3a:
            r0 = r2
            java.lang.String r0 = org.lwjgl.system.APIUtil.apiUnknownToken(r0)
            return r0
    }

    private static java.lang.String getDebugType(int r2) {
            r0 = r2
            switch(r0) {
                case 33356: goto L44;
                case 33357: goto L47;
                case 33358: goto L4a;
                case 33359: goto L4d;
                case 33360: goto L50;
                case 33361: goto L53;
                case 33384: goto L56;
                default: goto L59;
            }
        L44:
            java.lang.String r0 = "ERROR"
            return r0
        L47:
            java.lang.String r0 = "DEPRECATED BEHAVIOR"
            return r0
        L4a:
            java.lang.String r0 = "UNDEFINED BEHAVIOR"
            return r0
        L4d:
            java.lang.String r0 = "PORTABILITY"
            return r0
        L50:
            java.lang.String r0 = "PERFORMANCE"
            return r0
        L53:
            java.lang.String r0 = "OTHER"
            return r0
        L56:
            java.lang.String r0 = "MARKER"
            return r0
        L59:
            r0 = r2
            java.lang.String r0 = org.lwjgl.system.APIUtil.apiUnknownToken(r0)
            return r0
    }

    private static java.lang.String getDebugSeverity(int r2) {
            r0 = r2
            switch(r0) {
                case 33387: goto L35;
                case 37190: goto L2c;
                case 37191: goto L2f;
                case 37192: goto L32;
                default: goto L38;
            }
        L2c:
            java.lang.String r0 = "HIGH"
            return r0
        L2f:
            java.lang.String r0 = "MEDIUM"
            return r0
        L32:
            java.lang.String r0 = "LOW"
            return r0
        L35:
            java.lang.String r0 = "NOTIFICATION"
            return r0
        L38:
            r0 = r2
            java.lang.String r0 = org.lwjgl.system.APIUtil.apiUnknownToken(r0)
            return r0
    }

    private static java.lang.String getSourceARB(int r2) {
            r0 = r2
            switch(r0) {
                case 33350: goto L28;
                case 33351: goto L2b;
                case 33352: goto L2e;
                case 33353: goto L31;
                case 33354: goto L34;
                case 33355: goto L37;
                default: goto L3a;
            }
        L28:
            java.lang.String r0 = "API"
            return r0
        L2b:
            java.lang.String r0 = "WINDOW SYSTEM"
            return r0
        L2e:
            java.lang.String r0 = "SHADER COMPILER"
            return r0
        L31:
            java.lang.String r0 = "THIRD PARTY"
            return r0
        L34:
            java.lang.String r0 = "APPLICATION"
            return r0
        L37:
            java.lang.String r0 = "OTHER"
            return r0
        L3a:
            r0 = r2
            java.lang.String r0 = org.lwjgl.system.APIUtil.apiUnknownToken(r0)
            return r0
    }

    private static java.lang.String getTypeARB(int r2) {
            r0 = r2
            switch(r0) {
                case 33356: goto L28;
                case 33357: goto L2b;
                case 33358: goto L2e;
                case 33359: goto L31;
                case 33360: goto L34;
                case 33361: goto L37;
                default: goto L3a;
            }
        L28:
            java.lang.String r0 = "ERROR"
            return r0
        L2b:
            java.lang.String r0 = "DEPRECATED BEHAVIOR"
            return r0
        L2e:
            java.lang.String r0 = "UNDEFINED BEHAVIOR"
            return r0
        L31:
            java.lang.String r0 = "PORTABILITY"
            return r0
        L34:
            java.lang.String r0 = "PERFORMANCE"
            return r0
        L37:
            java.lang.String r0 = "OTHER"
            return r0
        L3a:
            r0 = r2
            java.lang.String r0 = org.lwjgl.system.APIUtil.apiUnknownToken(r0)
            return r0
    }

    private static java.lang.String getSeverityARB(int r2) {
            r0 = r2
            switch(r0) {
                case 37190: goto L1c;
                case 37191: goto L1f;
                case 37192: goto L22;
                default: goto L25;
            }
        L1c:
            java.lang.String r0 = "HIGH"
            return r0
        L1f:
            java.lang.String r0 = "MEDIUM"
            return r0
        L22:
            java.lang.String r0 = "LOW"
            return r0
        L25:
            r0 = r2
            java.lang.String r0 = org.lwjgl.system.APIUtil.apiUnknownToken(r0)
            return r0
    }

    private static java.lang.String getCategoryAMD(int r2) {
            r0 = r2
            switch(r0) {
                case 37193: goto L30;
                case 37194: goto L33;
                case 37195: goto L36;
                case 37196: goto L39;
                case 37197: goto L3c;
                case 37198: goto L3f;
                case 37199: goto L42;
                case 37200: goto L45;
                default: goto L48;
            }
        L30:
            java.lang.String r0 = "API ERROR"
            return r0
        L33:
            java.lang.String r0 = "WINDOW SYSTEM"
            return r0
        L36:
            java.lang.String r0 = "DEPRECATION"
            return r0
        L39:
            java.lang.String r0 = "UNDEFINED BEHAVIOR"
            return r0
        L3c:
            java.lang.String r0 = "PERFORMANCE"
            return r0
        L3f:
            java.lang.String r0 = "SHADER COMPILER"
            return r0
        L42:
            java.lang.String r0 = "APPLICATION"
            return r0
        L45:
            java.lang.String r0 = "OTHER"
            return r0
        L48:
            r0 = r2
            java.lang.String r0 = org.lwjgl.system.APIUtil.apiUnknownToken(r0)
            return r0
    }

    private static java.lang.String getSeverityAMD(int r2) {
            r0 = r2
            switch(r0) {
                case 37190: goto L1c;
                case 37191: goto L1f;
                case 37192: goto L22;
                default: goto L25;
            }
        L1c:
            java.lang.String r0 = "HIGH"
            return r0
        L1f:
            java.lang.String r0 = "MEDIUM"
            return r0
        L22:
            java.lang.String r0 = "LOW"
            return r0
        L25:
            r0 = r2
            java.lang.String r0 = org.lwjgl.system.APIUtil.apiUnknownToken(r0)
            return r0
    }

    private static /* synthetic */ void lambda$setupDebugMessageCallback$3(java.io.PrintStream r6, int r7, int r8, int r9, int r10, long r11, long r13) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = 300(0x12c, float:4.2E-43)
            r1.<init>(r2)
            r15 = r0
            r0 = r15
            java.lang.String r1 = "[LWJGL] AMD_debug_output message\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r15
            java.lang.String r1 = "ID"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = r3.toUpperCase()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            printDetail(r0, r1, r2)
            r0 = r15
            java.lang.String r1 = "Category"
            r2 = r8
            java.lang.String r2 = getCategoryAMD(r2)
            printDetail(r0, r1, r2)
            r0 = r15
            java.lang.String r1 = "Severity"
            r2 = r9
            java.lang.String r2 = getSeverityAMD(r2)
            printDetail(r0, r1, r2)
            r0 = r15
            java.lang.String r1 = "Message"
            r2 = r10
            r3 = r11
            java.lang.String r2 = org.lwjgl.opengl.GLDebugMessageAMDCallback.getMessage(r2, r3)
            printDetail(r0, r1, r2)
            r0 = r6
            r1 = r15
            r0.print(r1)
            return
    }

    private static /* synthetic */ void lambda$setupDebugMessageCallback$2(java.io.PrintStream r6, int r7, int r8, int r9, int r10, int r11, long r12, long r14) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = 300(0x12c, float:4.2E-43)
            r1.<init>(r2)
            r16 = r0
            r0 = r16
            java.lang.String r1 = "[LWJGL] ARB_debug_output message\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r16
            java.lang.String r1 = "ID"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = r3.toUpperCase()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Source"
            r2 = r7
            java.lang.String r2 = getSourceARB(r2)
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Type"
            r2 = r8
            java.lang.String r2 = getTypeARB(r2)
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Severity"
            r2 = r10
            java.lang.String r2 = getSeverityARB(r2)
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Message"
            r2 = r11
            r3 = r12
            java.lang.String r2 = org.lwjgl.opengl.GLDebugMessageARBCallback.getMessage(r2, r3)
            printDetail(r0, r1, r2)
            r0 = r6
            r1 = r16
            r0.print(r1)
            return
    }

    private static /* synthetic */ void lambda$setupDebugMessageCallback$1(java.io.PrintStream r6, int r7, int r8, int r9, int r10, int r11, long r12, long r14) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = 300(0x12c, float:4.2E-43)
            r1.<init>(r2)
            r16 = r0
            r0 = r16
            java.lang.String r1 = "[LWJGL] OpenGL debug message\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r16
            java.lang.String r1 = "ID"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = r3.toUpperCase()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Source"
            r2 = r7
            java.lang.String r2 = getDebugSource(r2)
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Type"
            r2 = r8
            java.lang.String r2 = getDebugType(r2)
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Severity"
            r2 = r10
            java.lang.String r2 = getDebugSeverity(r2)
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Message"
            r2 = r11
            r3 = r12
            java.lang.String r2 = org.lwjgl.opengl.GLDebugMessageCallback.getMessage(r2, r3)
            printDetail(r0, r1, r2)
            r0 = r6
            r1 = r16
            r0.print(r1)
            return
    }

    private static /* synthetic */ void lambda$setupDebugMessageCallback$0(java.io.PrintStream r6, int r7, int r8, int r9, int r10, int r11, long r12, long r14) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = 300(0x12c, float:4.2E-43)
            r1.<init>(r2)
            r16 = r0
            r0 = r16
            java.lang.String r1 = "[LWJGL] OpenGL debug message\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r16
            java.lang.String r1 = "ID"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = r3.toUpperCase()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Source"
            r2 = r7
            java.lang.String r2 = getDebugSource(r2)
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Type"
            r2 = r8
            java.lang.String r2 = getDebugType(r2)
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Severity"
            r2 = r10
            java.lang.String r2 = getDebugSeverity(r2)
            printDetail(r0, r1, r2)
            r0 = r16
            java.lang.String r1 = "Message"
            r2 = r11
            r3 = r12
            java.lang.String r2 = org.lwjgl.opengl.GLDebugMessageCallback.getMessage(r2, r3)
            printDetail(r0, r1, r2)
            r0 = r6
            r1 = r16
            r0.print(r1)
            return
    }
}
