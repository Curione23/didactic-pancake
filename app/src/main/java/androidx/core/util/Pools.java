package androidx.core.util;

/* JADX INFO: compiled from: Pools.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Landroidx/core/util/Pools;", "", "()V", "Pool", "SimplePool", "SynchronizedPool", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Pools {

    /* JADX INFO: compiled from: Pools.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/core/util/Pools$Pool;", "T", "", "acquire", "()Ljava/lang/Object;", "release", "", "instance", "(Ljava/lang/Object;)Z", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Pool<T> {
        T acquire();

        boolean release(T r1);
    }

    /* JADX INFO: compiled from: Pools.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/core/util/Pools$SimplePool;", "T", "", "Landroidx/core/util/Pools$Pool;", "maxPoolSize", "", "(I)V", "pool", "", "[Ljava/lang/Object;", "poolSize", "acquire", "()Ljava/lang/Object;", "isInPool", "", "instance", "(Ljava/lang/Object;)Z", "release", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SimplePool<T> implements androidx.core.util.Pools.Pool<T> {
        private final java.lang.Object[] pool;
        private int poolSize;

        public SimplePool(int r2) {
                r1 = this;
                r1.<init>()
                if (r2 <= 0) goto La
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r1.pool = r2
                return
            La:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The max pool size must be > 0"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        private final boolean isInPool(T r5) {
                r4 = this;
                int r0 = r4.poolSize
                r1 = 0
                r2 = r1
            L4:
                if (r2 >= r0) goto L11
                java.lang.Object[] r3 = r4.pool
                r3 = r3[r2]
                if (r3 != r5) goto Le
                r5 = 1
                return r5
            Le:
                int r2 = r2 + 1
                goto L4
            L11:
                return r1
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
                r4 = this;
                int r0 = r4.poolSize
                r1 = 0
                if (r0 <= 0) goto L1b
                int r0 = r0 + (-1)
                java.lang.Object[] r2 = r4.pool
                r2 = r2[r0]
                java.lang.String r3 = "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
                java.lang.Object[] r3 = r4.pool
                r3[r0] = r1
                int r0 = r4.poolSize
                int r0 = r0 + (-1)
                r4.poolSize = r0
                return r2
            L1b:
                return r1
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T r4) {
                r3 = this;
                java.lang.String r0 = "instance"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                boolean r0 = r3.isInPool(r4)
                if (r0 != 0) goto L1b
                int r0 = r3.poolSize
                java.lang.Object[] r1 = r3.pool
                int r2 = r1.length
                if (r0 >= r2) goto L19
                r1[r0] = r4
                r4 = 1
                int r0 = r0 + r4
                r3.poolSize = r0
                return r4
            L19:
                r4 = 0
                return r4
            L1b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "Already in the pool!"
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
        }
    }

    /* JADX INFO: compiled from: Pools.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/core/util/Pools$SynchronizedPool;", "T", "", "Landroidx/core/util/Pools$SimplePool;", "maxPoolSize", "", "(I)V", "lock", "acquire", "()Ljava/lang/Object;", "release", "", "instance", "(Ljava/lang/Object;)Z", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SynchronizedPool<T> extends androidx.core.util.Pools.SimplePool<T> {
        private final java.lang.Object lock;

        public SynchronizedPool(int r1) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = new java.lang.Object
                r1.<init>()
                r0.lock = r1
                return
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
                r2 = this;
                java.lang.Object r0 = r2.lock
                monitor-enter(r0)
                java.lang.Object r1 = super.acquire()     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)
                return r1
            L9:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T r2) {
                r1 = this;
                java.lang.String r0 = "instance"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.Object r0 = r1.lock
                monitor-enter(r0)
                boolean r2 = super.release(r2)     // Catch: java.lang.Throwable -> Le
                monitor-exit(r0)
                return r2
            Le:
                r2 = move-exception
                monitor-exit(r0)
                throw r2
        }
    }

    private Pools() {
            r0 = this;
            r0.<init>()
            return
    }
}
