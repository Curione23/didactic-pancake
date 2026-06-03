package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/EventLoop.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/EventLoop.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/EventLoop.class */
final class EventLoop {
    private EventLoop() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static void check() {
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.MACOSX
            if (r0 != r1) goto L24
            boolean r0 = isMainThread()
            if (r0 != 0) goto L24
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            boolean r2 = isJavaStartedOnFirstThread()
            if (r2 == 0) goto L1e
            java.lang.String r2 = "GLFW may only be used on the main thread. This check may be disabled with Configuration.GLFW_CHECK_THREAD0."
            goto L20
        L1e:
            java.lang.String r2 = "GLFW may only be used on the main thread and that thread must be the first thread in the process. Please run the JVM with -XstartOnFirstThread. This check may be disabled with Configuration.GLFW_CHECK_THREAD0."
        L20:
            r1.<init>(r2)
            throw r0
        L24:
            return
    }

    private static boolean isMainThread() {
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.GLFW_CHECK_THREAD0
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L26
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.GLFW_LIBRARY_NAME
            java.lang.String r1 = ""
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "glfw_async"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L28
        L26:
            r0 = 1
            return r0
        L28:
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.ObjCRuntime.getLibrary()
            java.lang.String r1 = "objc_msgSend"
            long r0 = r0.getFunctionAddress(r1)
            r7 = r0
            java.lang.String r0 = "NSThread"
            long r0 = org.lwjgl.system.macosx.ObjCRuntime.objc_getClass(r0)
            r9 = r0
            r0 = r9
            java.lang.String r1 = "currentThread"
            long r1 = org.lwjgl.system.macosx.ObjCRuntime.sel_getUid(r1)
            r2 = r7
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            r11 = r0
            r0 = r11
            java.lang.String r1 = "isMainThread"
            long r1 = org.lwjgl.system.macosx.ObjCRuntime.sel_getUid(r1)
            r2 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }

    private static boolean isJavaStartedOnFirstThread() {
            java.lang.String r0 = "1"
            java.util.Map r1 = java.lang.System.getenv()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "JAVA_STARTED_ON_FIRST_THREAD_"
            java.lang.StringBuilder r2 = r2.append(r3)
            long r3 = org.lwjgl.system.macosx.LibC.getpid()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r1 = r1.get(r2)
            boolean r0 = r0.equals(r1)
            return r0
    }
}
