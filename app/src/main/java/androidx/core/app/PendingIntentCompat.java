package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class PendingIntentCompat {

    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void send(android.app.PendingIntent r0, android.content.Context r1, int r2, android.content.Intent r3, android.app.PendingIntent.OnFinished r4, android.os.Handler r5, java.lang.String r6, android.os.Bundle r7) throws android.app.PendingIntent.CanceledException {
                r0.send(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.app.PendingIntent getForegroundService(android.content.Context r0, int r1, android.content.Intent r2, int r3) {
                android.app.PendingIntent r0 = android.app.PendingIntent.getForegroundService(r0, r1, r2, r3)
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static class GatedCallback implements java.io.Closeable {
        private android.app.PendingIntent.OnFinished mCallback;
        private final java.util.concurrent.CountDownLatch mComplete;
        private boolean mSuccess;

        /* JADX INFO: renamed from: $r8$lambda$-_JLK_p2qvpYOAwGjpaXu2HJ864, reason: not valid java name */
        public static /* synthetic */ void m23$r8$lambda$_JLK_p2qvpYOAwGjpaXu2HJ864(androidx.core.app.PendingIntentCompat.GatedCallback r0, android.app.PendingIntent r1, android.content.Intent r2, int r3, java.lang.String r4, android.os.Bundle r5) {
                r0.onSendFinished(r1, r2, r3, r4, r5)
                return
        }

        GatedCallback(android.app.PendingIntent.OnFinished r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.mComplete = r0
                r2.mCallback = r3
                r3 = 0
                r2.mSuccess = r3
                return
        }

        private void onSendFinished(android.app.PendingIntent r8, android.content.Intent r9, int r10, java.lang.String r11, android.os.Bundle r12) {
                r7 = this;
                r0 = 0
            L1:
                java.util.concurrent.CountDownLatch r1 = r7.mComplete     // Catch: java.lang.Throwable -> L1f java.lang.InterruptedException -> L2a
                r1.await()     // Catch: java.lang.Throwable -> L1f java.lang.InterruptedException -> L2a
                if (r0 == 0) goto Lf
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            Lf:
                android.app.PendingIntent$OnFinished r1 = r7.mCallback
                if (r1 == 0) goto L1e
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r1.onSendFinished(r2, r3, r4, r5, r6)
                r8 = 0
                r7.mCallback = r8
            L1e:
                return
            L1f:
                r8 = move-exception
                if (r0 == 0) goto L29
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                r9.interrupt()
            L29:
                throw r8
            L2a:
                r0 = 1
                goto L1
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                boolean r0 = r1.mSuccess
                if (r0 != 0) goto L7
                r0 = 0
                r1.mCallback = r0
            L7:
                java.util.concurrent.CountDownLatch r0 = r1.mComplete
                r0.countDown()
                return
        }

        public void complete() {
                r1 = this;
                r0 = 1
                r1.mSuccess = r0
                return
        }

        public android.app.PendingIntent.OnFinished getCallback() {
                r1 = this;
                android.app.PendingIntent$OnFinished r0 = r1.mCallback
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                androidx.core.app.PendingIntentCompat$GatedCallback$$ExternalSyntheticLambda0 r0 = new androidx.core.app.PendingIntentCompat$GatedCallback$$ExternalSyntheticLambda0
                r0.<init>(r1)
                return r0
        }
    }

    private PendingIntentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int addMutabilityFlags(boolean r1, int r2) {
            if (r1 == 0) goto Lb
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto Le
            r1 = 33554432(0x2000000, float:9.403955E-38)
            goto Ld
        Lb:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
        Ld:
            r2 = r2 | r1
        Le:
            return r2
    }

    public static android.app.PendingIntent getActivities(android.content.Context r0, int r1, android.content.Intent[] r2, int r3, android.os.Bundle r4, boolean r5) {
            int r3 = addMutabilityFlags(r5, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivities(r0, r1, r2, r3, r4)
            return r0
    }

    public static android.app.PendingIntent getActivities(android.content.Context r0, int r1, android.content.Intent[] r2, int r3, boolean r4) {
            int r3 = addMutabilityFlags(r4, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivities(r0, r1, r2, r3)
            return r0
    }

    public static android.app.PendingIntent getActivity(android.content.Context r0, int r1, android.content.Intent r2, int r3, android.os.Bundle r4, boolean r5) {
            int r3 = addMutabilityFlags(r5, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r1, r2, r3, r4)
            return r0
    }

    public static android.app.PendingIntent getActivity(android.content.Context r0, int r1, android.content.Intent r2, int r3, boolean r4) {
            int r3 = addMutabilityFlags(r4, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r1, r2, r3)
            return r0
    }

    public static android.app.PendingIntent getBroadcast(android.content.Context r0, int r1, android.content.Intent r2, int r3, boolean r4) {
            int r3 = addMutabilityFlags(r4, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r1, r2, r3)
            return r0
    }

    public static android.app.PendingIntent getForegroundService(android.content.Context r0, int r1, android.content.Intent r2, int r3, boolean r4) {
            int r3 = addMutabilityFlags(r4, r3)
            android.app.PendingIntent r0 = androidx.core.app.PendingIntentCompat.Api26Impl.getForegroundService(r0, r1, r2, r3)
            return r0
    }

    public static android.app.PendingIntent getService(android.content.Context r0, int r1, android.content.Intent r2, int r3, boolean r4) {
            int r3 = addMutabilityFlags(r4, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r0, r1, r2, r3)
            return r0
    }

    public static void send(android.app.PendingIntent r1, int r2, android.app.PendingIntent.OnFinished r3, android.os.Handler r4) throws android.app.PendingIntent.CanceledException {
            androidx.core.app.PendingIntentCompat$GatedCallback r0 = new androidx.core.app.PendingIntentCompat$GatedCallback
            r0.<init>(r3)
            android.app.PendingIntent$OnFinished r3 = r0.getCallback()     // Catch: java.lang.Throwable -> L13
            r1.send(r2, r3, r4)     // Catch: java.lang.Throwable -> L13
            r0.complete()     // Catch: java.lang.Throwable -> L13
            r0.close()
            return
        L13:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L18
            goto L1c
        L18:
            r2 = move-exception
            r1.addSuppressed(r2)
        L1c:
            throw r1
    }

    public static void send(android.app.PendingIntent r8, android.content.Context r9, int r10, android.content.Intent r11, android.app.PendingIntent.OnFinished r12, android.os.Handler r13) throws android.app.PendingIntent.CanceledException {
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            send(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void send(android.app.PendingIntent r1, android.content.Context r2, int r3, android.content.Intent r4, android.app.PendingIntent.OnFinished r5, android.os.Handler r6, java.lang.String r7, android.os.Bundle r8) throws android.app.PendingIntent.CanceledException {
            androidx.core.app.PendingIntentCompat$GatedCallback r0 = new androidx.core.app.PendingIntentCompat$GatedCallback
            r0.<init>(r5)
            androidx.core.app.PendingIntentCompat.Api23Impl.send(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lf
            r0.complete()     // Catch: java.lang.Throwable -> Lf
            r0.close()
            return
        Lf:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r2 = move-exception
            r1.addSuppressed(r2)
        L18:
            throw r1
    }
}
