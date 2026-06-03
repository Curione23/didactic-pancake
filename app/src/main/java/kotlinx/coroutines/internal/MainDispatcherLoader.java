package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "()V", "FAST_SERVICE_LOADER_ENABLED", "", "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "loadMainDispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MainDispatcherLoader {
    private static final boolean FAST_SERVICE_LOADER_ENABLED = false;
    public static final kotlinx.coroutines.internal.MainDispatcherLoader INSTANCE = null;
    public static final kotlinx.coroutines.MainCoroutineDispatcher dispatcher = null;

    static {
            kotlinx.coroutines.internal.MainDispatcherLoader r0 = new kotlinx.coroutines.internal.MainDispatcherLoader
            r0.<init>()
            kotlinx.coroutines.internal.MainDispatcherLoader.INSTANCE = r0
            java.lang.String r1 = "kotlinx.coroutines.fast.service.loader"
            r2 = 1
            boolean r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r1, r2)
            kotlinx.coroutines.internal.MainDispatcherLoader.FAST_SERVICE_LOADER_ENABLED = r1
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.loadMainDispatcher()
            kotlinx.coroutines.internal.MainDispatcherLoader.dispatcher = r0
            return
    }

    private MainDispatcherLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlinx.coroutines.MainCoroutineDispatcher loadMainDispatcher() {
            r7 = this;
            r0 = 0
            boolean r1 = kotlinx.coroutines.internal.MainDispatcherLoader.FAST_SERVICE_LOADER_ENABLED     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto Lc
            kotlinx.coroutines.internal.FastServiceLoader r1 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L6c
            java.util.List r1 = r1.loadMainDispatcherFactory$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L6c
            goto L24
        Lc:
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r1 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r2 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L6c
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r1, r2)     // Catch: java.lang.Throwable -> L6c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6c
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.asSequence(r1)     // Catch: java.lang.Throwable -> L6c
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)     // Catch: java.lang.Throwable -> L6c
        L24:
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L6c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6c
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r3 != 0) goto L33
            r3 = r0
            goto L5a
        L33:
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6c
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r4 != 0) goto L3e
            goto L5a
        L3e:
            r4 = r3
            kotlinx.coroutines.internal.MainDispatcherFactory r4 = (kotlinx.coroutines.internal.MainDispatcherFactory) r4     // Catch: java.lang.Throwable -> L6c
            int r4 = r4.getLoadPriority()     // Catch: java.lang.Throwable -> L6c
        L45:
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L6c
            r6 = r5
            kotlinx.coroutines.internal.MainDispatcherFactory r6 = (kotlinx.coroutines.internal.MainDispatcherFactory) r6     // Catch: java.lang.Throwable -> L6c
            int r6 = r6.getLoadPriority()     // Catch: java.lang.Throwable -> L6c
            if (r4 >= r6) goto L54
            r3 = r5
            r4 = r6
        L54:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r5 != 0) goto L45
        L5a:
            kotlinx.coroutines.internal.MainDispatcherFactory r3 = (kotlinx.coroutines.internal.MainDispatcherFactory) r3     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L64
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.internal.MainDispatchersKt.tryCreateDispatcher(r3, r1)     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L75
        L64:
            r1 = 3
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r1 = kotlinx.coroutines.internal.MainDispatchersKt.createMissingDispatcher$default(r0, r0, r1, r0)     // Catch: java.lang.Throwable -> L6c
            kotlinx.coroutines.MainCoroutineDispatcher r1 = (kotlinx.coroutines.MainCoroutineDispatcher) r1     // Catch: java.lang.Throwable -> L6c
            goto L75
        L6c:
            r1 = move-exception
            r2 = 2
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r0 = kotlinx.coroutines.internal.MainDispatchersKt.createMissingDispatcher$default(r1, r0, r2, r0)
            r1 = r0
            kotlinx.coroutines.MainCoroutineDispatcher r1 = (kotlinx.coroutines.MainCoroutineDispatcher) r1
        L75:
            return r1
    }
}
