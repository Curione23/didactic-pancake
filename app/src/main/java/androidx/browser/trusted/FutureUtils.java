package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
class FutureUtils {
    private FutureUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> com.google.common.util.concurrent.ListenableFuture<T> immediateFailedFuture(java.lang.Throwable r1) {
            androidx.concurrent.futures.ResolvableFuture r0 = androidx.concurrent.futures.ResolvableFuture.create()
            r0.setException(r1)
            return r0
    }
}
