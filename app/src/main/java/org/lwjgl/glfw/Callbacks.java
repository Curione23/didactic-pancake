package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/Callbacks.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/Callbacks.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/Callbacks.class */
public final class Callbacks {
    private Callbacks() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void glfwFreeCallbacks(@org.lwjgl.system.NativeType("GLFWwindow *") long r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            java.lang.Class<org.lwjgl.glfw.GLFW> r0 = org.lwjgl.glfw.GLFW.class
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            r10 = r0
            r0 = r10
            int r0 = r0.length     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            r11 = r0
            r0 = 0
            r12 = r0
        L17:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L76
            r0 = r10
            r1 = r12
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            r13 = r0
            r0 = r13
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            java.lang.String r1 = "glfwSet"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            if (r0 == 0) goto L70
            r0 = r13
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            java.lang.String r1 = "Callback"
            boolean r0 = r0.endsWith(r1)     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            if (r0 == 0) goto L70
            r0 = r13
            int r0 = r0.getParameterCount()     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            r1 = 1
            if (r0 != r1) goto L58
            r0 = r13
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            r3 = r2
            r4 = 0
            r5 = 0
            r3[r4] = r5     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            goto L70
        L58:
            r0 = r13
            r1 = 0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            r3 = r2
            r4 = 0
            long r5 = org.lwjgl.glfw.GLFW.glfwGetCurrentContext()     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            r3[r4] = r5     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            r3 = r2
            r4 = 1
            r5 = 0
            r3[r4] = r5     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L79 java.lang.reflect.InvocationTargetException -> L85
        L70:
            int r12 = r12 + 1
            goto L17
        L76:
            goto L8f
        L79:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "org.lwjgl.GLFW.glfwSetXXXCallback() must be set to public and static"
            r3 = r10
            r1.<init>(r2, r3)
            throw r0
        L85:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
        L8f:
            return
    }
}
