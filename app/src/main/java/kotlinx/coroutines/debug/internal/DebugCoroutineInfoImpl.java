package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\b\u0010$\u001a\u00020\u000eH\u0016J!\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u000e2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(H\u0000¢\u0006\u0002\b)J%\u0010*\u001a\u00020&*\b\u0012\u0004\u0012\u00020\u00150+2\b\u0010'\u001a\u0004\u0018\u00010\fH\u0082Pø\u0001\u0000¢\u0006\u0002\u0010,R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "", "context", "Lkotlin/coroutines/CoroutineContext;", "creationStackBottom", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "sequenceNumber", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/debug/internal/StackTraceFrame;J)V", "_context", "Ljava/lang/ref/WeakReference;", "_lastObservedFrame", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "_state", "", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCreationStackBottom", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "creationStackTrace", "", "Ljava/lang/StackTraceElement;", "getCreationStackTrace", "()Ljava/util/List;", "value", "lastObservedFrame", "getLastObservedFrame$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "setLastObservedFrame$kotlinx_coroutines_core", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "lastObservedThread", "Ljava/lang/Thread;", "state", "getState", "()Ljava/lang/String;", "lastObservedStackTrace", "toString", "updateState", "", "frame", "Lkotlin/coroutines/Continuation;", "updateState$kotlinx_coroutines_core", "yieldFrames", "Lkotlin/sequences/SequenceScope;", "(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DebugCoroutineInfoImpl {
    private final java.lang.ref.WeakReference<kotlin.coroutines.CoroutineContext> _context;
    private java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.CoroutineStackFrame> _lastObservedFrame;
    private java.lang.String _state;
    private final kotlinx.coroutines.debug.internal.StackTraceFrame creationStackBottom;
    public java.lang.Thread lastObservedThread;
    public final long sequenceNumber;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1, reason: invalid class name */
    /* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.debug.internal.StackTraceFrame $bottom;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl this$0;

        AnonymousClass1(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1, kotlinx.coroutines.debug.internal.StackTraceFrame r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.AnonymousClass1> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$bottom = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1 = r3.this$0
                kotlinx.coroutines.debug.internal.StackTraceFrame r2 = r3.$bottom
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1 r1 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r6)
                goto L32
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1 = r5.this$0
                kotlinx.coroutines.debug.internal.StackTraceFrame r3 = r5.$bottom
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = r3.getCallerFrame()
                r4 = r5
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5.label = r2
                java.lang.Object r6 = kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.access$yieldFrames(r1, r6, r3, r4)
                if (r6 != r0) goto L32
                return r0
            L32:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {80}, m = "yieldFrames", n = {}, s = {})
    static final class C01311 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl this$0;

        C01311(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C01311> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r3 = r2.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r3 | r0
                r2.label = r3
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = r2.this$0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r3 = kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.access$yieldFrames(r3, r0, r0, r1)
                return r3
        }
    }

    public DebugCoroutineInfoImpl(kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.debug.internal.StackTraceFrame r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.creationStackBottom = r2
            r0.sequenceNumber = r3
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0._context = r2
            java.lang.String r1 = "CREATED"
            r0._state = r1
            return
    }

    public static final /* synthetic */ java.lang.Object access$yieldFrames(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0, kotlin.sequences.SequenceScope r1, kotlin.coroutines.jvm.internal.CoroutineStackFrame r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r0.yieldFrames(r1, r2, r3)
            return r0
    }

    private final java.util.List<java.lang.StackTraceElement> creationStackTrace() {
            r3 = this;
            kotlinx.coroutines.debug.internal.StackTraceFrame r0 = r3.creationStackBottom
            if (r0 != 0) goto L9
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L9:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1 r1 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1
            r2 = 0
            r1.<init>(r3, r0, r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequence(r1)
            java.util.List r0 = kotlin.sequences.SequencesKt.toList(r0)
            return r0
    }

    private final java.lang.Object yieldFrames(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.CoroutineStackFrame r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C01311
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C01311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r5, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.L$2
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r6
            java.lang.Object r7 = r0.L$1
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5f
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            r2 = r5
        L42:
            if (r7 != 0) goto L47
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L47:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L62
            r0.L$0 = r2
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r8 = r6.yield(r8, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r4 = r7
            r7 = r6
            r6 = r4
        L5f:
            r4 = r7
            r7 = r6
            r6 = r4
        L62:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = r7.getCallerFrame()
            if (r7 == 0) goto L69
            goto L42
        L69:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    public final kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            java.lang.ref.WeakReference<kotlin.coroutines.CoroutineContext> r0 = r1._context
            java.lang.Object r0 = r0.get()
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            return r0
    }

    public final kotlinx.coroutines.debug.internal.StackTraceFrame getCreationStackBottom() {
            r1 = this;
            kotlinx.coroutines.debug.internal.StackTraceFrame r0 = r1.creationStackBottom
            return r0
    }

    public final java.util.List<java.lang.StackTraceElement> getCreationStackTrace() {
            r1 = this;
            java.util.List r0 = r1.creationStackTrace()
            return r0
    }

    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getLastObservedFrame$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.CoroutineStackFrame> r0 = r1._lastObservedFrame
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public final java.lang.String getState() {
            r1 = this;
            java.lang.String r0 = r1._state
            return r0
    }

    public final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace() {
            r3 = this;
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r3.getLastObservedFrame$kotlinx_coroutines_core()
            if (r0 != 0) goto Lb
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L10:
            if (r0 == 0) goto L20
            java.lang.StackTraceElement r2 = r0.getStackTraceElement()
            if (r2 == 0) goto L1b
            r1.add(r2)
        L1b:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r0.getCallerFrame()
            goto L10
        L20:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(kotlin.coroutines.jvm.internal.CoroutineStackFrame r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1._lastObservedFrame = r0
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DebugCoroutineInfo(state="
            r0.<init>(r1)
            java.lang.String r1 = r2.getState()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",context="
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.coroutines.CoroutineContext r1 = r2.getContext()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void updateState$kotlinx_coroutines_core(java.lang.String r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            java.lang.String r0 = r2._state
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L17
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L17
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r2.getLastObservedFrame$kotlinx_coroutines_core()
            if (r0 == 0) goto L17
            return
        L17:
            r2._state = r3
            boolean r0 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            r1 = 0
            if (r0 == 0) goto L21
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4
            goto L22
        L21:
            r4 = r1
        L22:
            r2.setLastObservedFrame$kotlinx_coroutines_core(r4)
            java.lang.String r4 = "RUNNING"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L32
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            goto L35
        L32:
            r3 = r1
            java.lang.Thread r3 = (java.lang.Thread) r3
        L35:
            r2.lastObservedThread = r1
            return
    }
}
