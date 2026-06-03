package androidx.lifecycle;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getLifecycle$lifecycle_common", "()Landroidx/lifecycle/Lifecycle;", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "register", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LifecycleCoroutineScopeImpl extends androidx.lifecycle.LifecycleCoroutineScope implements androidx.lifecycle.LifecycleEventObserver {
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final androidx.lifecycle.Lifecycle lifecycle;

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1, reason: invalid class name */
    /* JADX INFO: compiled from: Lifecycle.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.lifecycle.LifecycleCoroutineScopeImpl this$0;

        AnonymousClass1(androidx.lifecycle.LifecycleCoroutineScopeImpl r1, kotlin.coroutines.Continuation<? super androidx.lifecycle.LifecycleCoroutineScopeImpl.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 r0 = new androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1
                androidx.lifecycle.LifecycleCoroutineScopeImpl r1 = r2.this$0
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 r1 = (androidx.lifecycle.LifecycleCoroutineScopeImpl.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r2.label
                if (r0 != 0) goto L3c
                kotlin.ResultKt.throwOnFailure(r3)
                java.lang.Object r3 = r2.L$0
                kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
                androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = r2.this$0
                androidx.lifecycle.Lifecycle r0 = r0.getLifecycle$lifecycle_common()
                androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
                java.lang.Enum r1 = (java.lang.Enum) r1
                int r0 = r0.compareTo(r1)
                if (r0 < 0) goto L30
                androidx.lifecycle.LifecycleCoroutineScopeImpl r3 = r2.this$0
                androidx.lifecycle.Lifecycle r3 = r3.getLifecycle$lifecycle_common()
                androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = r2.this$0
                androidx.lifecycle.LifecycleObserver r0 = (androidx.lifecycle.LifecycleObserver) r0
                r3.addObserver(r0)
                goto L39
            L30:
                kotlin.coroutines.CoroutineContext r3 = r3.getCoroutineContext()
                r0 = 1
                r1 = 0
                kotlinx.coroutines.JobKt.cancel$default(r3, r1, r0, r1)
            L39:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L3c:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
        }
    }

    public LifecycleCoroutineScopeImpl(androidx.lifecycle.Lifecycle r2, kotlin.coroutines.CoroutineContext r3) {
            r1 = this;
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "coroutineContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.lifecycle = r2
            r1.coroutineContext = r3
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle$lifecycle_common()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r2 != r3) goto L26
            kotlin.coroutines.CoroutineContext r2 = r1.getCoroutineContext()
            r3 = 1
            r0 = 0
            kotlinx.coroutines.JobKt.cancel$default(r2, r0, r3, r0)
        L26:
            return
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.coroutineContext
            return r0
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public androidx.lifecycle.Lifecycle getLifecycle$lifecycle_common() {
            r1 = this;
            androidx.lifecycle.Lifecycle r0 = r1.lifecycle
            return r0
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle$lifecycle_common()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.DESTROYED
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L2f
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle$lifecycle_common()
            r3 = r1
            androidx.lifecycle.LifecycleObserver r3 = (androidx.lifecycle.LifecycleObserver) r3
            r2.removeObserver(r3)
            kotlin.coroutines.CoroutineContext r2 = r1.getCoroutineContext()
            r3 = 1
            r0 = 0
            kotlinx.coroutines.JobKt.cancel$default(r2, r0, r3, r0)
        L2f:
            return
    }

    public final void register() {
            r6 = this;
            r0 = r6
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.MainCoroutineDispatcher r1 = r1.getImmediate()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 r2 = new androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1
            r3 = 0
            r2.<init>(r6, r3)
            r3 = r2
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r4 = 2
            r5 = 0
            r2 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            return
    }
}
