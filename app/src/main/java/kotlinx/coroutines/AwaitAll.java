package kotlinx.coroutines;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u000e:\u0002\u000b\fB\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/AwaitAll;", "T", "", "Lkotlinx/coroutines/Deferred;", "deferreds", "<init>", "([Lkotlinx/coroutines/Deferred;)V", "", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "[Lkotlinx/coroutines/Deferred;", "AwaitAllNode", "DisposeHandlersOnCancel", "kotlinx-coroutines-core", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
final class AwaitAll<T> {
    static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater notCompletedCount$FU = null;
    private final kotlinx.coroutines.Deferred<T>[] deferreds;
    volatile /* synthetic */ int notCompletedCount;

    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0082\u0004\u0018\u00002\u00020\u001cB\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR<\u0010\u0013\u001a\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u000e\u001a\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00028\u00000\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "<init>", "(Lkotlinx/coroutines/AwaitAll;Lkotlinx/coroutines/CancellableContinuation;)V", "", "cause", "", "invoke", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/AwaitAll;", "value", "getDisposer", "()Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "setDisposer", "(Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;)V", "disposer", "Lkotlinx/coroutines/DisposableHandle;", "handle", "Lkotlinx/coroutines/DisposableHandle;", "getHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setHandle", "(Lkotlinx/coroutines/DisposableHandle;)V", "kotlinx-coroutines-core", "Lkotlinx/coroutines/JobNode;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class AwaitAllNode extends kotlinx.coroutines.JobNode {
        private volatile /* synthetic */ java.lang.Object _disposer;
        private final kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> continuation;
        public kotlinx.coroutines.DisposableHandle handle;
        final /* synthetic */ kotlinx.coroutines.AwaitAll<T> this$0;

        public AwaitAllNode(kotlinx.coroutines.AwaitAll r1, kotlinx.coroutines.CancellableContinuation<? super java.util.List<? extends T>> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.continuation = r2
                r1 = 0
                r0._disposer = r1
                return
        }

        public final kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel getDisposer() {
                r1 = this;
                java.lang.Object r0 = r1._disposer
                kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel r0 = (kotlinx.coroutines.AwaitAll.DisposeHandlersOnCancel) r0
                return r0
        }

        public final kotlinx.coroutines.DisposableHandle getHandle() {
                r1 = this;
                kotlinx.coroutines.DisposableHandle r0 = r1.handle
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "handle"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                return r0
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable r6) {
                r5 = this;
                if (r6 == 0) goto L19
                kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> r0 = r5.continuation
                java.lang.Object r6 = r0.tryResumeWithException(r6)
                if (r6 == 0) goto L50
                kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> r0 = r5.continuation
                r0.completeResume(r6)
                kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel r6 = r5.getDisposer()
                if (r6 == 0) goto L50
                r6.disposeAll()
                goto L50
            L19:
                kotlinx.coroutines.AwaitAll<T> r6 = r5.this$0
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.AwaitAll.notCompletedCount$FU
                int r6 = r0.decrementAndGet(r6)
                if (r6 != 0) goto L50
                kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> r6 = r5.continuation
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                kotlinx.coroutines.AwaitAll<T> r0 = r5.this$0
                kotlinx.coroutines.Deferred[] r0 = kotlinx.coroutines.AwaitAll.access$getDeferreds$p(r0)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.length
                r1.<init>(r2)
                java.util.Collection r1 = (java.util.Collection) r1
                int r2 = r0.length
                r3 = 0
            L37:
                if (r3 >= r2) goto L45
                r4 = r0[r3]
                java.lang.Object r4 = r4.getCompleted()
                r1.add(r4)
                int r3 = r3 + 1
                goto L37
            L45:
                java.util.List r1 = (java.util.List) r1
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                java.lang.Object r0 = kotlin.Result.m767constructorimpl(r1)
                r6.resumeWith(r0)
            L50:
                return
        }

        public final void setDisposer(kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel r1) {
                r0 = this;
                r0._disposer = r1
                return
        }

        public final void setHandle(kotlinx.coroutines.DisposableHandle r1) {
                r0 = this;
                r0.handle = r1
                return
        }
    }

    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R \u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "nodes", "", "Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/AwaitAll;", "(Lkotlinx/coroutines/AwaitAll;[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;)V", "[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "disposeAll", "", "invoke", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class DisposeHandlersOnCancel extends kotlinx.coroutines.CancelHandler {
        private final kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] nodes;
        final /* synthetic */ kotlinx.coroutines.AwaitAll<T> this$0;

        public DisposeHandlersOnCancel(kotlinx.coroutines.AwaitAll r1, kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.nodes = r2
                return
        }

        public final void disposeAll() {
                r4 = this;
                kotlinx.coroutines.AwaitAll<T>$AwaitAllNode[] r0 = r4.nodes
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                kotlinx.coroutines.DisposableHandle r3 = r3.getHandle()
                r3.dispose()
                int r2 = r2 + 1
                goto L4
            L12:
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable r1) {
                r0 = this;
                r0.disposeAll()
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "DisposeHandlersOnCancel["
                r0.<init>(r1)
                kotlinx.coroutines.AwaitAll<T>$AwaitAllNode[] r1 = r2.nodes
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.AwaitAll> r0 = kotlinx.coroutines.AwaitAll.class
            java.lang.String r1 = "notCompletedCount"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.AwaitAll.notCompletedCount$FU = r0
            return
    }

    public AwaitAll(kotlinx.coroutines.Deferred<? extends T>[] r1) {
            r0 = this;
            r0.<init>()
            r0.deferreds = r1
            int r1 = r1.length
            r0.notCompletedCount = r1
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.Deferred[] access$getDeferreds$p(kotlinx.coroutines.AwaitAll r0) {
            kotlinx.coroutines.Deferred<T>[] r0 = r0.deferreds
            return r0
    }

    public final java.lang.Object await(kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r10) {
            r9 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r10)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            kotlinx.coroutines.Deferred[] r2 = access$getDeferreds$p(r9)
            int r2 = r2.length
            kotlinx.coroutines.AwaitAll$AwaitAllNode[] r3 = new kotlinx.coroutines.AwaitAll.AwaitAllNode[r2]
            r4 = 0
            r5 = r4
        L19:
            if (r5 >= r2) goto L3c
            kotlinx.coroutines.Deferred[] r6 = access$getDeferreds$p(r9)
            r6 = r6[r5]
            r6.start()
            kotlinx.coroutines.AwaitAll$AwaitAllNode r7 = new kotlinx.coroutines.AwaitAll$AwaitAllNode
            r7.<init>(r9, r1)
            r8 = r7
            kotlinx.coroutines.CompletionHandlerBase r8 = (kotlinx.coroutines.CompletionHandlerBase) r8
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            kotlinx.coroutines.DisposableHandle r6 = r6.invokeOnCompletion(r8)
            r7.setHandle(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r3[r5] = r7
            int r5 = r5 + 1
            goto L19
        L3c:
            kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel r5 = new kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel
            r5.<init>(r9, r3)
        L41:
            if (r4 >= r2) goto L4b
            r6 = r3[r4]
            r6.setDisposer(r5)
            int r4 = r4 + 1
            goto L41
        L4b:
            boolean r2 = r1.isCompleted()
            if (r2 == 0) goto L55
            r5.disposeAll()
            goto L5c
        L55:
            kotlinx.coroutines.CancelHandlerBase r5 = (kotlinx.coroutines.CancelHandlerBase) r5
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r1.invokeOnCancellation(r5)
        L5c:
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L69
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
        L69:
            return r0
    }
}
