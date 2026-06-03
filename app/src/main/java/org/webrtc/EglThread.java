package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglThread.class */
public class EglThread implements org.webrtc.RenderSynchronizer.Listener {
    private final org.webrtc.EglThread.ReleaseMonitor releaseMonitor;
    private final org.webrtc.EglThread.HandlerWithExceptionCallbacks handler;
    private final org.webrtc.EglBase.EglConnection eglConnection;
    private final org.webrtc.RenderSynchronizer renderSynchronizer;
    private final java.util.List<org.webrtc.EglThread.RenderUpdate> pendingRenderUpdates;
    private boolean renderWindowOpen;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglThread$HandlerWithExceptionCallbacks.class */
    private static class HandlerWithExceptionCallbacks extends android.os.Handler {
        private final java.lang.Object callbackLock;

        @androidx.annotation.GuardedBy("callbackLock")
        private final java.util.List<java.lang.Runnable> exceptionCallbacks;

        public HandlerWithExceptionCallbacks(android.os.Looper r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                java.lang.Object r1 = new java.lang.Object
                r2 = r1
                r2.<init>()
                r0.callbackLock = r1
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.exceptionCallbacks = r1
                return
        }

        public void dispatchMessage(android.os.Message r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                super.dispatchMessage(r1)     // Catch: java.lang.Exception -> L8
                goto L51
            L8:
                r6 = move-exception
                java.lang.String r0 = "EglThread"
                java.lang.String r1 = "Exception on EglThread"
                r2 = r6
                org.webrtc.Logging.e(r0, r1, r2)
                r0 = r4
                java.lang.Object r0 = r0.callbackLock
                r1 = r0
                r7 = r1
                monitor-enter(r0)
                r0 = r4
                java.util.List<java.lang.Runnable> r0 = r0.exceptionCallbacks     // Catch: java.lang.Throwable -> L48
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L48
                r8 = r0
            L23:
                r0 = r8
                boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L48
                if (r0 == 0) goto L43
                r0 = r8
                java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L48
                java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L48
                r9 = r0
                r0 = r9
                r0.run()     // Catch: java.lang.Throwable -> L48
                goto L23
            L43:
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
                goto L4f
            L48:
                r10 = move-exception
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
                r0 = r10
                throw r0
            L4f:
                r0 = r6
                throw r0
            L51:
                return
        }

        public void addExceptionCallback(java.lang.Runnable r4) {
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.callbackLock
                r1 = r0
                r5 = r1
                monitor-enter(r0)
                r0 = r3
                java.util.List<java.lang.Runnable> r0 = r0.exceptionCallbacks     // Catch: java.lang.Throwable -> L17
                r1 = r4
                boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L17
                r0 = r5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                goto L1c
            L17:
                r6 = move-exception
                r0 = r5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                r0 = r6
                throw r0
            L1c:
                return
        }

        public void removeExceptionCallback(java.lang.Runnable r4) {
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.callbackLock
                r1 = r0
                r5 = r1
                monitor-enter(r0)
                r0 = r3
                java.util.List<java.lang.Runnable> r0 = r0.exceptionCallbacks     // Catch: java.lang.Throwable -> L17
                r1 = r4
                boolean r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L17
                r0 = r5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                goto L1c
            L17:
                r6 = move-exception
                r0 = r5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                r0 = r6
                throw r0
            L1c:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglThread$ReleaseMonitor.class */
    public interface ReleaseMonitor {
        boolean onRelease(org.webrtc.EglThread r1);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglThread$RenderUpdate.class */
    public interface RenderUpdate {
        void update(boolean r1);
    }

    public static org.webrtc.EglThread create(@androidx.annotation.Nullable org.webrtc.EglThread.ReleaseMonitor r7, @androidx.annotation.Nullable org.webrtc.EglBase.Context r8, int[] r9, @androidx.annotation.Nullable org.webrtc.RenderSynchronizer r10) {
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r1 = r0
            java.lang.String r2 = "EglThread"
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            r0.start()
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r0 = new org.webrtc.EglThread$HandlerWithExceptionCallbacks
            r1 = r0
            r2 = r11
            android.os.Looper r2 = r2.getLooper()
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            r1 = r8
            r2 = r9
            org.webrtc.EglThread r1 = () -> { // java.util.concurrent.Callable.call():java.lang.Object
                return lambda$create$0(r1, r2);
            }
            java.lang.Object r0 = org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(r0, r1)
            org.webrtc.EglBase$EglConnection r0 = (org.webrtc.EglBase.EglConnection) r0
            r13 = r0
            org.webrtc.EglThread r0 = new org.webrtc.EglThread
            r1 = r0
            r2 = r7
            if (r2 == 0) goto L3b
            r2 = r7
            goto L40
        L3b:
            org.webrtc.EglThread r2 = (v0) -> { // org.webrtc.EglThread.ReleaseMonitor.onRelease(org.webrtc.EglThread):boolean
                return lambda$create$1(v0);
            }
        L40:
            r3 = r12
            r4 = r13
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static org.webrtc.EglThread create(@androidx.annotation.Nullable org.webrtc.EglThread.ReleaseMonitor r5, @androidx.annotation.Nullable org.webrtc.EglBase.Context r6, int[] r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            org.webrtc.EglThread r0 = create(r0, r1, r2, r3)
            return r0
    }

    private EglThread(org.webrtc.EglThread.ReleaseMonitor r5, org.webrtc.EglThread.HandlerWithExceptionCallbacks r6, org.webrtc.EglBase.EglConnection r7, org.webrtc.RenderSynchronizer r8) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.pendingRenderUpdates = r1
            r0 = r4
            r1 = 1
            r0.renderWindowOpen = r1
            r0 = r4
            r1 = r5
            r0.releaseMonitor = r1
            r0 = r4
            r1 = r6
            r0.handler = r1
            r0 = r4
            r1 = r7
            r0.eglConnection = r1
            r0 = r4
            r1 = r8
            r0.renderSynchronizer = r1
            r0 = r8
            if (r0 == 0) goto L34
            r0 = r8
            r1 = r4
            r0.registerListener(r1)
        L34:
            return
    }

    public void release() {
            r4 = this;
            r0 = r4
            org.webrtc.EglThread$ReleaseMonitor r0 = r0.releaseMonitor
            r1 = r4
            boolean r0 = r0.onRelease(r1)
            if (r0 != 0) goto Le
            return
        Le:
            r0 = r4
            org.webrtc.RenderSynchronizer r0 = r0.renderSynchronizer
            if (r0 == 0) goto L1d
            r0 = r4
            org.webrtc.RenderSynchronizer r0 = r0.renderSynchronizer
            r1 = r4
            r0.removeListener(r1)
        L1d:
            r0 = r4
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r0 = r0.handler
            r1 = r4
            org.webrtc.EglBase$EglConnection r1 = r1.eglConnection
            r2 = r1
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)
            void r1 = r1::release
            boolean r0 = r0.post(r1)
            r0 = r4
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r0 = r0.handler
            android.os.Looper r0 = r0.getLooper()
            r0.quitSafely()
            return
    }

    public org.webrtc.EglBase createEglBaseWithSharedConnection() {
            r2 = this;
            r0 = r2
            org.webrtc.EglBase$EglConnection r0 = r0.eglConnection
            org.webrtc.EglBase r0 = org.webrtc.EglBase.create(r0)
            return r0
    }

    public android.os.Handler getHandler() {
            r2 = this;
            r0 = r2
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r0 = r0.handler
            return r0
    }

    public void addExceptionCallback(java.lang.Runnable r4) {
            r3 = this;
            r0 = r3
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r0 = r0.handler
            r1 = r4
            r0.addExceptionCallback(r1)
            return
    }

    public void removeExceptionCallback(java.lang.Runnable r4) {
            r3 = this;
            r0 = r3
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r0 = r0.handler
            r1 = r4
            r0.removeExceptionCallback(r1)
            return
    }

    public void scheduleRenderUpdate(org.webrtc.EglThread.RenderUpdate r4) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.renderWindowOpen
            if (r0 == 0) goto L11
            r0 = r4
            r1 = 1
            r0.update(r1)
            goto L1c
        L11:
            r0 = r3
            java.util.List<org.webrtc.EglThread$RenderUpdate> r0 = r0.pendingRenderUpdates
            r1 = r4
            boolean r0 = r0.add(r1)
        L1c:
            return
    }

    @Override // org.webrtc.RenderSynchronizer.Listener
    public void onRenderWindowOpen() {
            r3 = this;
            r0 = r3
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r0 = r0.handler
            r1 = r3
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$onRenderWindowOpen$2();
            }
            boolean r0 = r0.post(r1)
            return
    }

    @Override // org.webrtc.RenderSynchronizer.Listener
    public void onRenderWindowClose() {
            r3 = this;
            r0 = r3
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r0 = r0.handler
            r1 = r3
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$onRenderWindowClose$3();
            }
            boolean r0 = r0.post(r1)
            return
    }

    private /* synthetic */ void lambda$onRenderWindowClose$3() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.renderWindowOpen = r1
            return
    }

    private /* synthetic */ void lambda$onRenderWindowOpen$2() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.renderWindowOpen = r1
            r0 = r3
            java.util.List<org.webrtc.EglThread$RenderUpdate> r0 = r0.pendingRenderUpdates
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
        Lf:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2c
            r0 = r4
            java.lang.Object r0 = r0.next()
            org.webrtc.EglThread$RenderUpdate r0 = (org.webrtc.EglThread.RenderUpdate) r0
            r5 = r0
            r0 = r5
            r1 = 0
            r0.update(r1)
            goto Lf
        L2c:
            r0 = r3
            java.util.List<org.webrtc.EglThread$RenderUpdate> r0 = r0.pendingRenderUpdates
            r0.clear()
            return
    }

    private static /* synthetic */ boolean lambda$create$1(org.webrtc.EglThread r2) {
            r0 = 1
            return r0
    }

    private static /* synthetic */ org.webrtc.EglBase.EglConnection lambda$create$0(org.webrtc.EglBase.Context r3, int[] r4) throws java.lang.Exception {
            r0 = r3
            if (r0 != 0) goto L9
            r0 = r4
            org.webrtc.EglBase$EglConnection r0 = org.webrtc.EglBase.EglConnection.createEgl10(r0)
            return r0
        L9:
            r0 = r3
            r1 = r4
            org.webrtc.EglBase$EglConnection r0 = org.webrtc.EglBase.EglConnection.create(r0, r1)
            return r0
    }
}
