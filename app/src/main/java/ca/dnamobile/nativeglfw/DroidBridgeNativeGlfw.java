package ca.dnamobile.nativeglfw;

/* JADX INFO: loaded from: classes.dex */
public final class DroidBridgeNativeGlfw implements java.lang.AutoCloseable {
    public static final java.lang.String EGL_MESA_SONAME = "libEGL_mesa.so";
    public static final java.lang.String EGL_SYSTEM = "";
    public static final java.lang.String TAG = "DroidBridgeNativeGLFW";
    private boolean closed;
    private long nativeHandle;

    static {
            java.lang.String r0 = "droidbridge_native_glfw_v82"
            java.lang.System.loadLibrary(r0)
            return
    }

    public DroidBridgeNativeGlfw() {
            r4 = this;
            r4.<init>()
            long r0 = nativeCreate()
            r4.nativeHandle = r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L10
            return
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed to create native DroidBridgeNativeGlfw state"
            r0.<init>(r1)
            throw r0
    }

    private void ensureOpen() {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto Ld
            long r0 = r4.nativeHandle
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DroidBridgeNativeGlfw is closed"
            r0.<init>(r1)
            throw r0
    }

    private static native boolean nativeClearTest(long r0, float r2, float r3, float r4, float r5);

    private static native void nativeConfigureRenderer(long r0, java.lang.String r2, java.lang.String r3, boolean r4, int r5, int r6);

    private static native long nativeCreate();

    private static native void nativeDestroy(long r0);

    private static native java.lang.String nativeGetGlString(long r0, int r2);

    private static native java.lang.String nativeGetLastError(long r0);

    private static native boolean nativeMakeCurrent(long r0);

    private static native void nativeSurfaceChanged(long r0, int r2, int r3);

    private static native void nativeSurfaceCreated(long r0, android.view.Surface r2, int r3, int r4);

    private static native void nativeSurfaceDestroyed(long r0);

    private static native boolean nativeSwapBuffers(long r0);

    public synchronized boolean clearTest(float r7, float r8, float r9, float r10) {
            r6 = this;
            monitor-enter(r6)
            r6.ensureOpen()     // Catch: java.lang.Throwable -> L10
            long r0 = r6.nativeHandle     // Catch: java.lang.Throwable -> L10
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            boolean r7 = nativeClearTest(r0, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r6)
            return r7
        L10:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L10
            throw r7
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L15
            r0 = 1
            r4.closed = r0     // Catch: java.lang.Throwable -> L17
            long r0 = r4.nativeHandle     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r4.nativeHandle = r2     // Catch: java.lang.Throwable -> L17
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L15
            nativeDestroy(r0)     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r4)
            return
        L17:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    public synchronized void configureRenderer(java.lang.String r8, java.lang.String r9, boolean r10, int r11, int r12) {
            r7 = this;
            monitor-enter(r7)
            r7.ensureOpen()     // Catch: java.lang.Throwable -> L20
            long r0 = r7.nativeHandle     // Catch: java.lang.Throwable -> L20
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto Le
            java.lang.String r8 = ""
        Le:
            r2 = r8
            boolean r8 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L20
            if (r8 == 0) goto L17
            java.lang.String r9 = ""
        L17:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            nativeConfigureRenderer(r0, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r7)
            return
        L20:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L20
            throw r8
    }

    public synchronized java.lang.String getGlRenderer() {
            r3 = this;
            monitor-enter(r3)
            r3.ensureOpen()     // Catch: java.lang.Throwable -> Le
            long r0 = r3.nativeHandle     // Catch: java.lang.Throwable -> Le
            r2 = 7937(0x1f01, float:1.1122E-41)
            java.lang.String r0 = nativeGetGlString(r0, r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r3)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public synchronized java.lang.String getGlVendor() {
            r3 = this;
            monitor-enter(r3)
            r3.ensureOpen()     // Catch: java.lang.Throwable -> Le
            long r0 = r3.nativeHandle     // Catch: java.lang.Throwable -> Le
            r2 = 7936(0x1f00, float:1.1121E-41)
            java.lang.String r0 = nativeGetGlString(r0, r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r3)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public synchronized java.lang.String getGlVersion() {
            r3 = this;
            monitor-enter(r3)
            r3.ensureOpen()     // Catch: java.lang.Throwable -> Le
            long r0 = r3.nativeHandle     // Catch: java.lang.Throwable -> Le
            r2 = 7938(0x1f02, float:1.1124E-41)
            java.lang.String r0 = nativeGetGlString(r0, r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r3)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public synchronized java.lang.String getGlslVersion() {
            r3 = this;
            monitor-enter(r3)
            r3.ensureOpen()     // Catch: java.lang.Throwable -> Lf
            long r0 = r3.nativeHandle     // Catch: java.lang.Throwable -> Lf
            r2 = 35724(0x8b8c, float:5.006E-41)
            java.lang.String r0 = nativeGetGlString(r0, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r3)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public synchronized java.lang.String getLastError() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.nativeHandle     // Catch: java.lang.Throwable -> L13
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Ld
            java.lang.String r0 = "native handle closed"
            monitor-exit(r4)
            return r0
        Ld:
            java.lang.String r0 = nativeGetLastError(r0)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r4)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    public long getNativeHandleForTestingOnly() {
            r2 = this;
            long r0 = r2.nativeHandle
            return r0
    }

    public synchronized boolean makeCurrent() {
            r2 = this;
            monitor-enter(r2)
            r2.ensureOpen()     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.nativeHandle     // Catch: java.lang.Throwable -> Lc
            boolean r0 = nativeMakeCurrent(r0)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public synchronized void surfaceChanged(int r4, int r5) {
            r3 = this;
            monitor-enter(r3)
            r3.ensureOpen()     // Catch: java.lang.Throwable -> L14
            long r0 = r3.nativeHandle     // Catch: java.lang.Throwable -> L14
            r2 = 1
            int r4 = java.lang.Math.max(r4, r2)     // Catch: java.lang.Throwable -> L14
            int r5 = java.lang.Math.max(r5, r2)     // Catch: java.lang.Throwable -> L14
            nativeSurfaceChanged(r0, r4, r5)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            return
        L14:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    public synchronized void surfaceCreated(android.view.Surface r4, int r5, int r6) {
            r3 = this;
            monitor-enter(r3)
            r3.ensureOpen()     // Catch: java.lang.Throwable -> L14
            long r0 = r3.nativeHandle     // Catch: java.lang.Throwable -> L14
            r2 = 1
            int r5 = java.lang.Math.max(r5, r2)     // Catch: java.lang.Throwable -> L14
            int r6 = java.lang.Math.max(r6, r2)     // Catch: java.lang.Throwable -> L14
            nativeSurfaceCreated(r0, r4, r5, r6)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            return
        L14:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    public synchronized void surfaceDestroyed() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L10
            long r0 = r4.nativeHandle     // Catch: java.lang.Throwable -> L12
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L10
            nativeSurfaceDestroyed(r0)     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r4)
            return
        L12:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    public synchronized boolean swapBuffers() {
            r2 = this;
            monitor-enter(r2)
            r2.ensureOpen()     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.nativeHandle     // Catch: java.lang.Throwable -> Lc
            boolean r0 = nativeSwapBuffers(r0)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }
}
