package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IORunnable {
    static /* synthetic */ void lambda$asRunnable$0(org.apache.commons.io.function.IORunnable r0) {
            org.apache.commons.io.function.Uncheck.run(r0)
            return
    }

    static org.apache.commons.io.function.IORunnable noop() {
            org.apache.commons.io.function.IORunnable r0 = org.apache.commons.io.function.Constants.IO_RUNNABLE
            return r0
    }

    default java.lang.Runnable asRunnable() {
            r1 = this;
            org.apache.commons.io.function.IORunnable$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IORunnable$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    void run() throws java.io.IOException;
}
