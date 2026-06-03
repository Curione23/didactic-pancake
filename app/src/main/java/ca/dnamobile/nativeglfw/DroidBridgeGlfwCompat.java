package ca.dnamobile.nativeglfw;

/* JADX INFO: loaded from: classes.dex */
public final class DroidBridgeGlfwCompat {
    private static ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw instance;

    private DroidBridgeGlfwCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized long createWindow(int r0, int r1, java.lang.String r2) {
            java.lang.Class<ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat> r0 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.class
            monitor-enter(r0)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = require()     // Catch: java.lang.Throwable -> Ld
            long r1 = r1.getNativeHandleForTestingOnly()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public static synchronized java.lang.String getDebugString() {
            java.lang.String r0 = "vendor="
            java.lang.Class<ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat> r1 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.class
            monitor-enter(r1)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r2 = require()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r2.getGlVendor()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = ", renderer="
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = r2.getGlRenderer()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = ", version="
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = r2.getGlVersion()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = ", glsl="
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = r2.getGlslVersion()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = ", lastError="
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r2.getLastError()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r1)
            return r0
        L54:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            throw r0
    }

    public static synchronized void init(java.lang.String r7, java.lang.String r8, boolean r9) {
            java.lang.Class<ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat> r0 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.class
            monitor-enter(r0)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.instance     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto Le
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = new ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.instance = r1     // Catch: java.lang.Throwable -> L1a
        Le:
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.instance     // Catch: java.lang.Throwable -> L1a
            r5 = 0
            r6 = 0
            r2 = r7
            r3 = r8
            r4 = r9
            r1.configureRenderer(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return
        L1a:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r7
    }

    public static synchronized void makeContextCurrent(long r0) {
            java.lang.Class<ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat> r0 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.class
            monitor-enter(r0)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = require()     // Catch: java.lang.Throwable -> Lc
            r1.makeCurrent()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public static synchronized void nativeSurfaceChanged(int r2, int r3) {
            java.lang.Class<ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat> r0 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.class
            monitor-enter(r0)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = require()     // Catch: java.lang.Throwable -> Lc
            r1.surfaceChanged(r2, r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    public static synchronized void nativeSurfaceCreated(android.view.Surface r2, int r3, int r4) {
            java.lang.Class<ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat> r0 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.class
            monitor-enter(r0)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = require()     // Catch: java.lang.Throwable -> Lc
            r1.surfaceCreated(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    public static synchronized void nativeSurfaceDestroyed() {
            java.lang.Class<ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat> r0 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.class
            monitor-enter(r0)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.instance     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            r1.surfaceDestroyed()     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    private static ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw require() {
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r0 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.instance
            if (r0 != 0) goto Lb
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r0 = new ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw
            r0.<init>()
            ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.instance = r0
        Lb:
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r0 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.instance
            return r0
    }

    public static synchronized void swapBuffers(long r0) {
            java.lang.Class<ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat> r0 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.class
            monitor-enter(r0)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = require()     // Catch: java.lang.Throwable -> Lc
            r1.swapBuffers()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public static synchronized void terminate() {
            java.lang.Class<ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat> r0 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.class
            monitor-enter(r0)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.instance     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Ld
            r1.close()     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            ca.dnamobile.nativeglfw.DroidBridgeGlfwCompat.instance = r1     // Catch: java.lang.Throwable -> Lf
        Ld:
            monitor-exit(r0)
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }
}
