package androidx.lifecycle;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/Lifecycle;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LifecycleKt {
    public static final androidx.lifecycle.LifecycleCoroutineScope getCoroutineScope(androidx.lifecycle.Lifecycle r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
        L5:
            java.util.concurrent.atomic.AtomicReference r0 = r4.getInternalScopeRef()
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = (androidx.lifecycle.LifecycleCoroutineScopeImpl) r0
            if (r0 == 0) goto L14
            androidx.lifecycle.LifecycleCoroutineScope r0 = (androidx.lifecycle.LifecycleCoroutineScope) r0
            return r0
        L14:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = new androidx.lifecycle.LifecycleCoroutineScopeImpl
            r1 = 1
            r2 = 0
            kotlinx.coroutines.CompletableJob r1 = kotlinx.coroutines.SupervisorKt.SupervisorJob$default(r2, r1, r2)
            kotlinx.coroutines.MainCoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.MainCoroutineDispatcher r3 = r3.getImmediate()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r3)
            r0.<init>(r4, r1)
            java.util.concurrent.atomic.AtomicReference r1 = r4.getInternalScopeRef()
            boolean r1 = androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(r1, r2, r0)
            if (r1 == 0) goto L5
            r0.register()
            androidx.lifecycle.LifecycleCoroutineScope r0 = (androidx.lifecycle.LifecycleCoroutineScope) r0
            return r0
    }
}
