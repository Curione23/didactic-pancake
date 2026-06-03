package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public interface Clock {
    default long currentThreadTimeMillis() {
            r2 = this;
            long r0 = android.os.SystemClock.currentThreadTimeMillis()
            return r0
    }

    long currentTimeMillis();

    long elapsedRealtime();

    long nanoTime();
}
