package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
final class ThreadMonitor implements java.lang.Runnable {
    private final java.lang.Thread thread;
    private final java.time.Duration timeout;

    private ThreadMonitor(java.lang.Thread r1, java.time.Duration r2) {
            r0 = this;
            r0.<init>()
            r0.thread = r1
            r0.timeout = r2
            return
    }

    static java.lang.Thread start(java.lang.Thread r2, java.time.Duration r3) {
            boolean r0 = r3.isZero()
            if (r0 != 0) goto L21
            boolean r0 = r3.isNegative()
            if (r0 == 0) goto Ld
            goto L21
        Ld:
            java.lang.Thread r0 = new java.lang.Thread
            org.apache.commons.io.ThreadMonitor r1 = new org.apache.commons.io.ThreadMonitor
            r1.<init>(r2, r3)
            java.lang.String r2 = "ThreadMonitor"
            r0.<init>(r1, r2)
            r2 = 1
            r0.setDaemon(r2)
            r0.start()
            return r0
        L21:
            r2 = 0
            return r2
    }

    static java.lang.Thread start(java.time.Duration r1) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = start(r0, r1)
            return r1
    }

    static void stop(java.lang.Thread r0) {
            if (r0 == 0) goto L5
            r0.interrupt()
        L5:
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
            java.time.Duration r0 = r1.timeout     // Catch: java.lang.InterruptedException -> La
            org.apache.commons.io.ThreadUtils.sleep(r0)     // Catch: java.lang.InterruptedException -> La
            java.lang.Thread r0 = r1.thread     // Catch: java.lang.InterruptedException -> La
            r0.interrupt()     // Catch: java.lang.InterruptedException -> La
        La:
            return
    }
}
