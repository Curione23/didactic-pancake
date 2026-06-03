package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/StackWalkUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/StackWalkUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/StackWalkUtil.class */
final class StackWalkUtil {
    private StackWalkUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static java.lang.StackTraceElement[] stackWalkArray(java.lang.Object[] r2) {
            r0 = r2
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            return r0
    }

    static java.lang.Object stackWalkGetMethod(java.lang.Class<?> r3) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r4 = r0
            r0 = 3
            r5 = r0
        L9:
            r0 = r5
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L29
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            java.lang.String r0 = r0.getClassName()
            r1 = r3
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L23
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            return r0
        L23:
            int r5 = r5 + 1
            goto L9
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
    }

    private static boolean isSameMethod(java.lang.StackTraceElement r4, java.lang.StackTraceElement r5) {
            r0 = r4
            r1 = r5
            r2 = r5
            java.lang.String r2 = r2.getMethodName()
            boolean r0 = isSameMethod(r0, r1, r2)
            return r0
    }

    private static boolean isSameMethod(java.lang.StackTraceElement r3, java.lang.StackTraceElement r4, java.lang.String r5) {
            r0 = r3
            java.lang.String r0 = r0.getMethodName()
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
            r0 = r3
            java.lang.String r0 = r0.getClassName()
            r1 = r4
            java.lang.String r1 = r1.getClassName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
            r0 = r3
            java.lang.String r0 = r0.getFileName()
            r1 = r4
            java.lang.String r1 = r1.getFileName()
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
    }

    private static boolean isAutoCloseable(java.lang.StackTraceElement r4, java.lang.StackTraceElement r5) {
            r0 = r4
            r1 = r5
            java.lang.String r2 = "$closeResource"
            boolean r0 = isSameMethod(r0, r1, r2)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            java.lang.String r0 = "closeFinally"
            r1 = r4
            java.lang.String r1 = r1.getMethodName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.lang.String r0 = "AutoCloseable.kt"
            r1 = r4
            java.lang.String r1 = r1.getFileName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    @javax.annotation.Nullable
    static java.lang.Object stackWalkCheckPop(java.lang.Class<?> r5, java.lang.Object r6) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r7 = r0
            r0 = 3
            r8 = r0
        L9:
            r0 = r8
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L69
            r0 = r7
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.getClassName()
            r1 = r5
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L26
            goto L63
        L26:
            r0 = r6
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            r10 = r0
            r0 = r9
            r1 = r10
            boolean r0 = isSameMethod(r0, r1)
            if (r0 == 0) goto L38
            r0 = 0
            return r0
        L38:
            r0 = r9
            r1 = r10
            boolean r0 = isAutoCloseable(r0, r1)
            if (r0 == 0) goto L60
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L60
            r0 = r7
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r9 = r0
            r0 = r10
            r1 = r7
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            boolean r0 = isSameMethod(r0, r1)
            if (r0 == 0) goto L60
            r0 = 0
            return r0
        L60:
            r0 = r9
            return r0
        L63:
            int r8 = r8 + 1
            goto L9
        L69:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
    }

    static java.lang.Object[] stackWalkGetTrace() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r4 = r0
            r0 = 3
            r5 = r0
        L9:
            r0 = r5
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L26
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            java.lang.String r0 = r0.getClassName()
            java.lang.String r1 = "org.lwjgl.system.Memory"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            int r5 = r5 + 1
            goto L9
        L26:
            r0 = r4
            r1 = r5
            r2 = r4
            int r2 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)
            return r0
    }
}
