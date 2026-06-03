package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class FutureTasks {
    private FutureTasks() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> java.util.concurrent.FutureTask<V> run(java.util.concurrent.Callable<V> r1) {
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            r0.<init>(r1)
            r0.run()
            return r0
    }
}
