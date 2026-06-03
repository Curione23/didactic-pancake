package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class ResolvableFuture<V> extends androidx.concurrent.futures.AbstractResolvableFuture<V> {
    private ResolvableFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> androidx.concurrent.futures.ResolvableFuture<V> create() {
            androidx.concurrent.futures.ResolvableFuture r0 = new androidx.concurrent.futures.ResolvableFuture
            r0.<init>()
            return r0
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean set(V r1) {
            r0 = this;
            boolean r1 = super.set(r1)
            return r1
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setException(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.setException(r1)
            return r1
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r1) {
            r0 = this;
            boolean r1 = super.setFuture(r1)
            return r1
    }
}
