package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/ThreadUtils.class */
public class ThreadUtils {


    /* JADX INFO: renamed from: org.webrtc.ThreadUtils$1CaughtException, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/ThreadUtils$1CaughtException.class */
    class C1CaughtException {
        java.lang.Exception e;

        C1CaughtException() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: org.webrtc.ThreadUtils$1Result, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/ThreadUtils$1Result.class */
    class C1Result {
        public V value;

        C1Result() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }




    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/ThreadUtils$BlockingOperation.class */
    public interface BlockingOperation {
        void run() throws java.lang.InterruptedException;
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/ThreadUtils$ThreadChecker.class */
    public static class ThreadChecker {

        @androidx.annotation.Nullable
        private java.lang.Thread thread;

        public ThreadChecker() {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.thread = r1
                return
        }

        public void checkIsOnValidThread() {
                r4 = this;
                r0 = r4
                java.lang.Thread r0 = r0.thread
                if (r0 != 0) goto Le
                r0 = r4
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.thread = r1
            Le:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r1 = r4
                java.lang.Thread r1 = r1.thread
                if (r0 == r1) goto L22
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "Wrong thread"
                r1.<init>(r2)
                throw r0
            L22:
                return
        }

        public void detachThread() {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.thread = r1
                return
        }
    }

    public ThreadUtils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void checkIsOnMainThread() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 == r1) goto L16
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Not on main thread!"
            r1.<init>(r2)
            throw r0
        L16:
            return
    }

    public static void executeUninterruptibly(org.webrtc.ThreadUtils.BlockingOperation r2) {
            r0 = 0
            r3 = r0
        L2:
            r0 = r2
            r0.run()     // Catch: java.lang.InterruptedException -> Lb
            goto L11
        Lb:
            r4 = move-exception
            r0 = 1
            r3 = r0
            goto L2
        L11:
            r0 = r3
            if (r0 == 0) goto L1b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1b:
            return
    }

    public static boolean joinUninterruptibly(java.lang.Thread r5, long r6) {
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8 = r0
            r0 = r6
            r10 = r0
            r0 = 0
            r12 = r0
        La:
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2f
            r0 = r5
            r1 = r10
            r0.join(r1)     // Catch: java.lang.InterruptedException -> L1a
            goto L2f
        L1a:
            r13 = move-exception
            r0 = 1
            r12 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r1 = r8
            long r0 = r0 - r1
            r14 = r0
            r0 = r6
            r1 = r14
            long r0 = r0 - r1
            r10 = r0
            goto La
        L2f:
            r0 = r12
            if (r0 == 0) goto L3a
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L3a:
            r0 = r5
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L45
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }

    public static void joinUninterruptibly(java.lang.Thread r4) {
            org.webrtc.ThreadUtils$1 r0 = new org.webrtc.ThreadUtils$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            executeUninterruptibly(r0)
            return
    }

    public static void awaitUninterruptibly(java.util.concurrent.CountDownLatch r4) {
            org.webrtc.ThreadUtils$2 r0 = new org.webrtc.ThreadUtils$2
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            executeUninterruptibly(r0)
            return
    }

    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch r5, long r6) {
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8 = r0
            r0 = r6
            r10 = r0
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
        Ld:
            r0 = r5
            r1 = r10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L1b
            boolean r0 = r0.await(r1, r2)     // Catch: java.lang.InterruptedException -> L1b
            r13 = r0
            goto L34
        L1b:
            r14 = move-exception
            r0 = 1
            r12 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r1 = r8
            long r0 = r0 - r1
            r15 = r0
            r0 = r6
            r1 = r15
            long r0 = r0 - r1
            r10 = r0
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Ld
        L34:
            r0 = r12
            if (r0 == 0) goto L3f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L3f:
            r0 = r13
            return r0
    }

    public static <V> V invokeAtFrontUninterruptibly(android.os.Handler r8, java.util.concurrent.Callable<V> r9) {
            r0 = r8
            android.os.Looper r0 = r0.getLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L1e
            r0 = r9
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L14
            return r0
        L14:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
        L1e:
            org.webrtc.ThreadUtils$1Result r0 = new org.webrtc.ThreadUtils$1Result
            r1 = r0
            r1.<init>()
            r10 = r0
            org.webrtc.ThreadUtils$1CaughtException r0 = new org.webrtc.ThreadUtils$1CaughtException
            r1 = r0
            r1.<init>()
            r11 = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            r12 = r0
            r0 = r8
            org.webrtc.ThreadUtils$3 r1 = new org.webrtc.ThreadUtils$3
            r2 = r1
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.post(r1)
            r0 = r12
            awaitUninterruptibly(r0)
            r0 = r11
            java.lang.Exception r0 = r0.e
            if (r0 == 0) goto L79
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r11
            java.lang.Exception r2 = r2.e
            r1.<init>(r2)
            r13 = r0
            r0 = r13
            r1 = r11
            java.lang.Exception r1 = r1.e
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            r2 = r13
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            java.lang.StackTraceElement[] r1 = concatStackTraces(r1, r2)
            r0.setStackTrace(r1)
            r0 = r13
            throw r0
        L79:
            r0 = r10
            V r0 = r0.value
            return r0
    }

    public static void invokeAtFrontUninterruptibly(android.os.Handler r5, java.lang.Runnable r6) {
            r0 = r5
            org.webrtc.ThreadUtils$4 r1 = new org.webrtc.ThreadUtils$4
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            java.lang.Object r0 = invokeAtFrontUninterruptibly(r0, r1)
            return
    }

    static java.lang.StackTraceElement[] concatStackTraces(java.lang.StackTraceElement[] r6, java.lang.StackTraceElement[] r7) {
            r0 = r6
            int r0 = r0.length
            r1 = r7
            int r1 = r1.length
            int r0 = r0 + r1
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r8 = r0
            r0 = r6
            r1 = 0
            r2 = r8
            r3 = 0
            r4 = r6
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = 0
            r2 = r8
            r3 = r6
            int r3 = r3.length
            r4 = r7
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            return r0
    }
}
