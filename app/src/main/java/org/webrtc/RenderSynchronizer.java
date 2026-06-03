package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RenderSynchronizer.class */
public final class RenderSynchronizer {
    private static final java.lang.String TAG = "RenderSynchronizer";
    private static final float DEFAULT_TARGET_FPS = 30.0f;
    private final java.lang.Object lock;
    private final java.util.List<org.webrtc.RenderSynchronizer.Listener> listeners;
    private final long targetFrameIntervalNanos;
    private final android.os.Handler mainThreadHandler;
    private android.view.Choreographer choreographer;

    @androidx.annotation.GuardedBy("lock")
    private boolean isListening;
    private boolean renderWindowOpen;
    private long lastRefreshTimeNanos;
    private long lastOpenedTimeNanos;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RenderSynchronizer$Listener.class */
    public interface Listener {
        void onRenderWindowOpen();

        void onRenderWindowClose();
    }

    public RenderSynchronizer(float r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.lock = r1
            r0 = r5
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r2 = r1
            r2.<init>()
            r0.listeners = r1
            r0 = r5
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 1
            long r1 = r1.toNanos(r2)
            float r1 = (float) r1
            r2 = r6
            float r1 = r1 / r2
            int r1 = java.lang.Math.round(r1)
            long r1 = (long) r1
            r0.targetFrameIntervalNanos = r1
            r0 = r5
            android.os.Handler r1 = new android.os.Handler
            r2 = r1
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r0.mainThreadHandler = r1
            r0 = r5
            android.os.Handler r0 = r0.mainThreadHandler
            r1 = r5
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$new$0();
            }
            boolean r0 = r0.post(r1)
            java.lang.String r0 = "RenderSynchronizer"
            java.lang.String r1 = "Created"
            org.webrtc.Logging.d(r0, r1)
            return
    }

    public RenderSynchronizer() {
            r3 = this;
            r0 = r3
            r1 = 1106247680(0x41f00000, float:30.0)
            r0.<init>(r1)
            return
    }

    public void registerListener(org.webrtc.RenderSynchronizer.Listener r4) {
            r3 = this;
            r0 = r3
            java.util.List<org.webrtc.RenderSynchronizer$Listener> r0 = r0.listeners
            r1 = r4
            boolean r0 = r0.add(r1)
            r0 = r3
            java.lang.Object r0 = r0.lock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            boolean r0 = r0.isListening     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L33
            java.lang.String r0 = "RenderSynchronizer"
            java.lang.String r1 = "First listener, subscribing to frame callbacks"
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L38
            r0 = r3
            r1 = 1
            r0.isListening = r1     // Catch: java.lang.Throwable -> L38
            r0 = r3
            android.os.Handler r0 = r0.mainThreadHandler     // Catch: java.lang.Throwable -> L38
            r1 = r3
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$registerListener$1();
            }     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.post(r1)     // Catch: java.lang.Throwable -> L38
        L33:
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            goto L3d
        L38:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r0 = r6
            throw r0
        L3d:
            return
    }

    public void removeListener(org.webrtc.RenderSynchronizer.Listener r4) {
            r3 = this;
            r0 = r3
            java.util.List<org.webrtc.RenderSynchronizer$Listener> r0 = r0.listeners
            r1 = r4
            boolean r0 = r0.remove(r1)
            return
    }

    private void onDisplayRefreshCycleBegin(long r8) {
            r7 = this;
            r0 = r7
            java.lang.Object r0 = r0.lock
            r1 = r0
            r10 = r1
            monitor-enter(r0)
            r0 = r7
            java.util.List<org.webrtc.RenderSynchronizer$Listener> r0 = r0.listeners     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L22
            java.lang.String r0 = "RenderSynchronizer"
            java.lang.String r1 = "No listeners, unsubscribing to frame callbacks"
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L27
            r0 = r7
            r1 = 0
            r0.isListening = r1     // Catch: java.lang.Throwable -> L27
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L22:
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            goto L2e
        L27:
            r11 = move-exception
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            r0 = r11
            throw r0
        L2e:
            r0 = r7
            android.view.Choreographer r0 = r0.choreographer
            r1 = r7
            void r1 = r1::onDisplayRefreshCycleBegin
            r0.postFrameCallback(r1)
            r0 = r8
            r1 = r7
            long r1 = r1.lastOpenedTimeNanos
            long r0 = r0 - r1
            r10 = r0
            r0 = r8
            r1 = r7
            long r1 = r1.lastRefreshTimeNanos
            long r0 = r0 - r1
            r12 = r0
            r0 = r7
            r1 = r8
            r0.lastRefreshTimeNanos = r1
            r0 = r10
            r1 = r7
            long r1 = r1.targetFrameIntervalNanos
            long r0 = r0 - r1
            long r0 = java.lang.Math.abs(r0)
            r1 = r10
            r2 = r7
            long r2 = r2.targetFrameIntervalNanos
            long r1 = r1 - r2
            r2 = r12
            long r1 = r1 + r2
            long r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L74
            r0 = r7
            r1 = r8
            r0.lastOpenedTimeNanos = r1
            r0 = r7
            r0.openRenderWindow()
            goto L7f
        L74:
            r0 = r7
            boolean r0 = r0.renderWindowOpen
            if (r0 == 0) goto L7f
            r0 = r7
            r0.closeRenderWindow()
        L7f:
            return
    }

    private void traceRenderWindowChange() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L19
            java.lang.String r0 = "RenderWindow"
            r1 = r4
            boolean r1 = r1.renderWindowOpen
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            android.os.Trace.setCounter(r0, r1)
        L19:
            return
    }

    private void openRenderWindow() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.renderWindowOpen = r1
            r0 = r3
            r0.traceRenderWindowChange()
            r0 = r3
            java.util.List<org.webrtc.RenderSynchronizer$Listener> r0 = r0.listeners
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
        L13:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2f
            r0 = r4
            java.lang.Object r0 = r0.next()
            org.webrtc.RenderSynchronizer$Listener r0 = (org.webrtc.RenderSynchronizer.Listener) r0
            r5 = r0
            r0 = r5
            r0.onRenderWindowOpen()
            goto L13
        L2f:
            return
    }

    private void closeRenderWindow() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.renderWindowOpen = r1
            r0 = r3
            r0.traceRenderWindowChange()
            r0 = r3
            java.util.List<org.webrtc.RenderSynchronizer$Listener> r0 = r0.listeners
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
        L13:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2f
            r0 = r4
            java.lang.Object r0 = r0.next()
            org.webrtc.RenderSynchronizer$Listener r0 = (org.webrtc.RenderSynchronizer.Listener) r0
            r5 = r0
            r0 = r5
            r0.onRenderWindowClose()
            goto L13
        L2f:
            return
    }

    private /* synthetic */ void lambda$registerListener$1() {
            r3 = this;
            r0 = r3
            android.view.Choreographer r0 = r0.choreographer
            r1 = r3
            void r1 = r1::onDisplayRefreshCycleBegin
            r0.postFrameCallback(r1)
            return
    }

    private /* synthetic */ void lambda$new$0() {
            r3 = this;
            r0 = r3
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            r0.choreographer = r1
            return
    }
}
