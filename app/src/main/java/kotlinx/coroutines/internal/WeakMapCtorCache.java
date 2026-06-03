package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0005\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "()V", "cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", "key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class WeakMapCtorCache extends kotlinx.coroutines.internal.CtorCache {
    public static final kotlinx.coroutines.internal.WeakMapCtorCache INSTANCE = null;
    private static final java.util.concurrent.locks.ReentrantReadWriteLock cacheLock = null;
    private static final java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> exceptionCtors = null;

    static {
            kotlinx.coroutines.internal.WeakMapCtorCache r0 = new kotlinx.coroutines.internal.WeakMapCtorCache
            r0.<init>()
            kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            kotlinx.coroutines.internal.WeakMapCtorCache.cacheLock = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            kotlinx.coroutines.internal.WeakMapCtorCache.exceptionCtors = r0
            return
    }

    private WeakMapCtorCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> get(java.lang.Class<? extends java.lang.Throwable> r7) {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.internal.WeakMapCtorCache.cacheLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r2 = kotlinx.coroutines.internal.WeakMapCtorCache.exceptionCtors     // Catch: java.lang.Throwable -> L70
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L70
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2     // Catch: java.lang.Throwable -> L70
            r1.unlock()
            if (r2 == 0) goto L17
            return r2
        L17:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L27
            int r2 = r0.getReadHoldCount()
            goto L28
        L27:
            r2 = r3
        L28:
            r4 = r3
        L29:
            if (r4 >= r2) goto L31
            r1.unlock()
            int r4 = r4 + 1
            goto L29
        L31:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r4 = kotlinx.coroutines.internal.WeakMapCtorCache.exceptionCtors     // Catch: java.lang.Throwable -> L63
            java.lang.Object r5 = r4.get(r7)     // Catch: java.lang.Throwable -> L63
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L4e
        L42:
            if (r3 >= r2) goto L4a
            r1.lock()
            int r3 = r3 + 1
            goto L42
        L4a:
            r0.unlock()
            return r5
        L4e:
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.internal.ExceptionsConstructorKt.access$createConstructor(r7)     // Catch: java.lang.Throwable -> L63
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L63
            r4.put(r7, r5)     // Catch: java.lang.Throwable -> L63
        L57:
            if (r3 >= r2) goto L5f
            r1.lock()
            int r3 = r3 + 1
            goto L57
        L5f:
            r0.unlock()
            return r5
        L63:
            r7 = move-exception
        L64:
            if (r3 >= r2) goto L6c
            r1.lock()
            int r3 = r3 + 1
            goto L64
        L6c:
            r0.unlock()
            throw r7
        L70:
            r7 = move-exception
            r1.unlock()
            throw r7
    }
}
