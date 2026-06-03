package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public final class ThreadUtils {
    @java.lang.Deprecated
    public ThreadUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getNanosOfMilli(java.time.Duration r1) {
            int r1 = r1.getNano()
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r1 % r0
            return r1
    }

    public static void sleep(java.time.Duration r3) throws java.lang.InterruptedException {
            java.time.Instant r0 = java.time.Instant.now()
            java.time.Instant r0 = r0.plus(r3)
        L8:
            long r1 = r3.toMillis()
            int r3 = getNanosOfMilli(r3)
            java.lang.Thread.sleep(r1, r3)
            java.time.Instant r3 = java.time.Instant.now()
            java.time.Duration r3 = java.time.Duration.between(r3, r0)
            boolean r1 = r3.isNegative()
            if (r1 == 0) goto L8
            return
    }
}
