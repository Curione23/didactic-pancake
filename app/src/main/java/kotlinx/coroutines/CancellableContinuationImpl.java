package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\t\u0012\u0004\u0012\u00028\u00000\u008a\u00012\t\u0012\u0004\u0012\u00028\u00000\u008b\u00012\u00060tj\u0002`uB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0012\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00112!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0018J\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010!J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u0011H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010+J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001b\u00108\u001a\u0004\u0018\u00010\u000f2\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020\u0011H\u0016¢\u0006\u0004\bB\u0010+J\u0011\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bD\u0010EJ8\u0010F\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u001fH\u0002¢\u0006\u0004\bH\u0010IJ8\u0010J\u001a\u00020\r2'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0002¢\u0006\u0004\bJ\u0010KJB\u0010L\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u00105\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0014¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020\u0011H\u0002¢\u0006\u0004\bT\u0010+J\u000f\u0010U\u001a\u00020\u001fH\u0001¢\u0006\u0004\bU\u0010IJ<\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00028\u00002#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\bW\u0010XJH\u0010Y\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bY\u0010ZJ \u0010]\u001a\u00020\u00112\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010)JZ\u0010`\u001a\u0004\u0018\u00010\b2\u0006\u00105\u001a\u00020^2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\b\u0010_\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\bb\u0010:J\u000f\u0010d\u001a\u00020NH\u0016¢\u0006\u0004\bd\u0010PJ\u000f\u0010e\u001a\u00020\u001fH\u0002¢\u0006\u0004\be\u0010IJ#\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\be\u0010fJH\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\be\u0010gJJ\u0010i\u001a\u0004\u0018\u00010h2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u001fH\u0002¢\u0006\u0004\bn\u0010IJ\u001b\u0010p\u001a\u00020\u0011*\u00020o2\u0006\u0010V\u001a\u00028\u0000H\u0016¢\u0006\u0004\bp\u0010qJ\u001b\u0010r\u001a\u00020\u0011*\u00020o2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\br\u0010sR\u001c\u0010x\u001a\n\u0018\u00010tj\u0004\u0018\u0001`u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001a\u0010z\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0080\u0004¢\u0006\r\n\u0004\b\u0003\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0081\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010IR\u0016\u0010\u0082\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010IR\u0016\u0010\u0083\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010IR\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u00105\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010:R\u0016\u0010\u0088\u0001\u001a\u00020N8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0089\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "proposedUpdate", "", "alreadyResumedError", "(Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlinx/coroutines/CancelHandler;", "handler", "", "cause", "", "callCancelHandler", "(Lkotlinx/coroutines/CancelHandler;Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "block", "callCancelHandlerSafely", "(Lkotlin/jvm/functions/Function0;)V", "onCancellation", "callOnCancellation", "", "cancel", "(Ljava/lang/Throwable;)Z", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "cancelLater", "token", "completeResume", "(Ljava/lang/Object;)V", "detachChild$kotlinx_coroutines_core", "()V", "detachChild", "detachChildIfNonResuable", "mode", "dispatchResume", "(I)V", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "state", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "initCancellability", "Lkotlinx/coroutines/DisposableHandle;", "installParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "(Lkotlin/jvm/functions/Function1;)V", "isReusable", "()Z", "makeCancelHandler", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;", "multipleHandlersError", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "", "nameString", "()Ljava/lang/String;", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "releaseClaimedReusableContinuation", "resetStateReusable", "value", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeImpl", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lkotlin/Result;", "result", "resumeWith", "Lkotlinx/coroutines/NotCompleted;", "idempotent", "resumedState", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "takeState$kotlinx_coroutines_core", "takeState", "toString", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/Symbol;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "trySuspend", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "isActive", "isCancelled", "isCompleted", "parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "getState$kotlinx_coroutines_core", "getStateDebugRepresentation", "stateDebugRepresentation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class CancellableContinuationImpl<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlinx.coroutines.CancellableContinuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decision$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ java.lang.Object _state;
    private final kotlin.coroutines.CoroutineContext context;
    private final kotlin.coroutines.Continuation<T> delegate;
    private kotlinx.coroutines.DisposableHandle parentHandle;

    static {
            java.lang.String r0 = "_decision"
            java.lang.Class<kotlinx.coroutines.CancellableContinuationImpl> r1 = kotlinx.coroutines.CancellableContinuationImpl.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.CancellableContinuationImpl._decision$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.CancellableContinuationImpl._state$FU = r0
            return
    }

    public CancellableContinuationImpl(kotlin.coroutines.Continuation<? super T> r2, int r3) {
            r1 = this;
            r1.<init>(r3)
            r1.delegate = r2
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L15
            r0 = -1
            if (r3 == r0) goto Lf
            goto L15
        Lf:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L15:
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            r1.context = r2
            r2 = 0
            r1._decision = r2
            kotlinx.coroutines.Active r2 = kotlinx.coroutines.Active.INSTANCE
            r1._state = r2
            return
    }

    private final java.lang.Void alreadyResumedError(java.lang.Object r4) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Already resumed, but proposed with update "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private final void callCancelHandler(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4, java.lang.Throwable r5) {
            r3 = this;
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L4
            goto L22
        L4:
            r4 = move-exception
            kotlin.coroutines.CoroutineContext r5 = r3.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r5, r0)
        L22:
            return
    }

    private final void callCancelHandlerSafely(kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
            r4 = this;
            r5.invoke()     // Catch: java.lang.Throwable -> L4
            goto L22
        L4:
            r5 = move-exception
            kotlin.coroutines.CoroutineContext r0 = r4.getContext()
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Exception in invokeOnCancellation handler for "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r5)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r1)
        L22:
            return
    }

    private final boolean cancelLater(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.isReusable()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            kotlin.coroutines.Continuation<T> r0 = r1.delegate
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            boolean r2 = r0.postponeCancellation(r2)
            return r2
    }

    private final void detachChildIfNonResuable() {
            r1 = this;
            boolean r0 = r1.isReusable()
            if (r0 != 0) goto L9
            r1.detachChild$kotlinx_coroutines_core()
        L9:
            return
    }

    private final void dispatchResume(int r2) {
            r1 = this;
            boolean r0 = r1.tryResume()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = r1
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            kotlinx.coroutines.DispatchedTaskKt.dispatch(r0, r2)
            return
    }

    private final java.lang.String getStateDebugRepresentation() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r1 == 0) goto Lb
            java.lang.String r0 = "Active"
            goto L14
        Lb:
            boolean r0 = r0 instanceof kotlinx.coroutines.CancelledContinuation
            if (r0 == 0) goto L12
            java.lang.String r0 = "Cancelled"
            goto L14
        L12:
            java.lang.String r0 = "Completed"
        L14:
            return r0
    }

    private final kotlinx.coroutines.DisposableHandle installParentHandle() {
            r7 = this;
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            r1 = r0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 != 0) goto L13
            r0 = 0
            return r0
        L13:
            kotlinx.coroutines.ChildContinuation r0 = new kotlinx.coroutines.ChildContinuation
            r0.<init>(r7)
            kotlinx.coroutines.CompletionHandlerBase r0 = (kotlinx.coroutines.CompletionHandlerBase) r0
            r4 = r0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 2
            r6 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r1, r2, r3, r4, r5, r6)
            r7.parentHandle = r0
            return r0
    }

    private final boolean isReusable() {
            r1 = this;
            int r0 = r1.resumeMode
            boolean r0 = kotlinx.coroutines.DispatchedTaskKt.isReusableMode(r0)
            if (r0 == 0) goto L14
            kotlin.coroutines.Continuation<T> r0 = r1.delegate
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            boolean r0 = r0.isReusable()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    private final kotlinx.coroutines.CancelHandler makeCancelHandler(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L7
            kotlinx.coroutines.CancelHandler r2 = (kotlinx.coroutines.CancelHandler) r2
            goto Lf
        L7:
            kotlinx.coroutines.InvokeOnCancel r0 = new kotlinx.coroutines.InvokeOnCancel
            r0.<init>(r2)
            r2 = r0
            kotlinx.coroutines.CancelHandler r2 = (kotlinx.coroutines.CancelHandler) r2
        Lf:
            return r2
    }

    private final void multipleHandlersError(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4, java.lang.Object r5) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "It's prohibited to register multiple handlers, tried to register "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ", already has "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private final void releaseClaimedReusableContinuation() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r1 == 0) goto L9
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L1c
            r1 = r2
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            java.lang.Throwable r0 = r0.tryReleaseClaimedContinuation(r1)
            if (r0 != 0) goto L16
            goto L1c
        L16:
            r2.detachChild$kotlinx_coroutines_core()
            r2.cancel(r0)
        L1c:
            return
    }

    private final void resumeImpl(java.lang.Object r9, int r10, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r11) {
            r8 = this;
        L0:
            java.lang.Object r0 = r8._state
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r1 == 0) goto L21
            r3 = r0
            kotlinx.coroutines.NotCompleted r3 = (kotlinx.coroutines.NotCompleted) r3
            r7 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            java.lang.Object r1 = r2.resumedState(r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r8, r0, r1)
            if (r0 == 0) goto L0
            r8.detachChildIfNonResuable()
            r8.dispatchResume(r10)
            return
        L21:
            boolean r10 = r0 instanceof kotlinx.coroutines.CancelledContinuation
            if (r10 == 0) goto L35
            kotlinx.coroutines.CancelledContinuation r0 = (kotlinx.coroutines.CancelledContinuation) r0
            boolean r10 = r0.makeResumed()
            if (r10 == 0) goto L35
            if (r11 == 0) goto L34
            java.lang.Throwable r9 = r0.cause
            r8.callOnCancellation(r11, r9)
        L34:
            return
        L35:
            r8.alreadyResumedError(r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
    }

    static /* synthetic */ void resumeImpl$default(kotlinx.coroutines.CancellableContinuationImpl r0, java.lang.Object r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto Lb
            r4 = r4 & 4
            if (r4 == 0) goto L7
            r3 = 0
        L7:
            r0.resumeImpl(r1, r2, r3)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: resumeImpl"
            r0.<init>(r1)
            throw r0
    }

    private final java.lang.Object resumedState(kotlinx.coroutines.NotCompleted r9, java.lang.Object r10, int r11, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r12, java.lang.Object r13) {
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L22
            boolean r9 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r9 == 0) goto L13
            if (r13 != 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L13:
            boolean r9 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r9 == 0) goto L4e
            if (r12 != 0) goto L1c
            goto L4e
        L1c:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L22:
            boolean r11 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r11)
            if (r11 != 0) goto L2b
            if (r13 != 0) goto L2b
            goto L4e
        L2b:
            if (r12 != 0) goto L37
            boolean r11 = r9 instanceof kotlinx.coroutines.CancelHandler
            if (r11 == 0) goto L35
            boolean r11 = r9 instanceof kotlinx.coroutines.BeforeResumeCancelHandler
            if (r11 == 0) goto L37
        L35:
            if (r13 == 0) goto L4e
        L37:
            kotlinx.coroutines.CompletedContinuation r11 = new kotlinx.coroutines.CompletedContinuation
            boolean r0 = r9 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L40
            kotlinx.coroutines.CancelHandler r9 = (kotlinx.coroutines.CancelHandler) r9
            goto L41
        L40:
            r9 = 0
        L41:
            r2 = r9
            r6 = 16
            r7 = 0
            r5 = 0
            r0 = r11
            r1 = r10
            r3 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10 = r11
        L4e:
            return r10
    }

    private final boolean tryResume() {
            r4 = this;
        L0:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto L9
            return r1
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._decision$FU
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L0
            return r2
    }

    private final kotlinx.coroutines.internal.Symbol tryResumeImpl(java.lang.Object r9, java.lang.Object r10, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r11) {
            r8 = this;
        L0:
            java.lang.Object r0 = r8._state
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r1 == 0) goto L21
            r3 = r0
            kotlinx.coroutines.NotCompleted r3 = (kotlinx.coroutines.NotCompleted) r3
            int r5 = r8.resumeMode
            r2 = r8
            r4 = r9
            r6 = r11
            r7 = r10
            java.lang.Object r1 = r2.resumedState(r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r8, r0, r1)
            if (r0 == 0) goto L0
            r8.detachChildIfNonResuable()
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r9
        L21:
            boolean r11 = r0 instanceof kotlinx.coroutines.CompletedContinuation
            r1 = 0
            if (r11 == 0) goto L49
            if (r10 == 0) goto L46
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            java.lang.Object r11 = r0.idempotentResume
            if (r11 != r10) goto L46
            boolean r10 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r10 == 0) goto L43
            java.lang.Object r10 = r0.result
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r9)
            if (r9 == 0) goto L3d
            goto L43
        L3d:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L43:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            goto L49
        L46:
            r9 = r1
            kotlinx.coroutines.internal.Symbol r9 = (kotlinx.coroutines.internal.Symbol) r9
        L49:
            return r1
    }

    private final boolean trySuspend() {
            r3 = this;
        L0:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L15
            r2 = 2
            if (r0 != r2) goto L9
            return r1
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._decision$FU
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            return r2
    }

    public final void callCancelHandler(kotlinx.coroutines.CancelHandler r4, java.lang.Throwable r5) {
            r3 = this;
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L4
            goto L22
        L4:
            r4 = move-exception
            kotlin.coroutines.CoroutineContext r5 = r3.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r5, r0)
        L22:
            return
    }

    public final void callOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4, java.lang.Throwable r5) {
            r3 = this;
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L4
            goto L22
        L4:
            r4 = move-exception
            kotlin.coroutines.CoroutineContext r5 = r3.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception in resume onCancellation handler for "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r5, r0)
        L22:
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(java.lang.Throwable r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r1 != 0) goto L8
            r5 = 0
            return r5
        L8:
            kotlinx.coroutines.CancelledContinuation r1 = new kotlinx.coroutines.CancelledContinuation
            r2 = r4
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            boolean r3 = r0 instanceof kotlinx.coroutines.CancelHandler
            r1.<init>(r2, r5, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r0, r1)
            if (r1 == 0) goto L0
            if (r3 == 0) goto L1f
            kotlinx.coroutines.CancelHandler r0 = (kotlinx.coroutines.CancelHandler) r0
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L25
            r4.callCancelHandler(r0, r5)
        L25:
            r4.detachChildIfNonResuable()
            int r5 = r4.resumeMode
            r4.dispatchResume(r5)
            r5 = 1
            return r5
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object r11, java.lang.Throwable r12) {
            r10 = this;
        L0:
            java.lang.Object r11 = r10._state
            boolean r0 = r11 instanceof kotlinx.coroutines.NotCompleted
            if (r0 != 0) goto L54
            boolean r0 = r11 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto Lb
            return
        Lb:
            boolean r0 = r11 instanceof kotlinx.coroutines.CompletedContinuation
            if (r0 == 0) goto L3d
            r0 = r11
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            boolean r1 = r0.getCancelled()
            if (r1 != 0) goto L31
            r7 = 15
            r8 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r0
            r6 = r12
            kotlinx.coroutines.CompletedContinuation r1 = kotlinx.coroutines.CompletedContinuation.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r11 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r10, r11, r1)
            if (r11 == 0) goto L0
            r0.invokeHandlers(r10, r12)
            return
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Must be called at most once"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L3d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            kotlinx.coroutines.CompletedContinuation r9 = new kotlinx.coroutines.CompletedContinuation
            r6 = 14
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            boolean r11 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r8, r10, r11, r9)
            if (r11 == 0) goto L0
            return
        L54:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not completed"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(java.lang.Object r2) {
            r1 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L11
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            if (r2 != r0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L11:
            int r2 = r1.resumeMode
            r1.dispatchResume(r2)
            return
    }

    public final void detachChild$kotlinx_coroutines_core() {
            r1 = this;
            kotlinx.coroutines.DisposableHandle r0 = r1.parentHandle
            if (r0 != 0) goto L5
            return
        L5:
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r0 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            r1.parentHandle = r0
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job r1) {
            r0 = this;
            java.util.concurrent.CancellationException r1 = r1.getCancellationException()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.delegate
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r3 = super.getExceptionalResult$kotlinx_coroutines_core(r3)
            if (r3 == 0) goto L1a
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 == 0) goto L1b
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 != 0) goto L13
            goto L1b
        L13:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r3, r0)
            goto L1b
        L1a:
            r3 = 0
        L1b:
            return r3
    }

    public final java.lang.Object getResult() {
            r3 = this;
            boolean r0 = r3.isReusable()
            boolean r1 = r3.trySuspend()
            if (r1 == 0) goto L1b
            kotlinx.coroutines.DisposableHandle r1 = r3.parentHandle
            if (r1 != 0) goto L11
            r3.installParentHandle()
        L11:
            if (r0 == 0) goto L16
            r3.releaseClaimedReusableContinuation()
        L16:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
        L1b:
            if (r0 == 0) goto L20
            r3.releaseClaimedReusableContinuation()
        L20:
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L41
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 == 0) goto L40
            r1 = r3
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            boolean r2 = r1 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r2 != 0) goto L3a
            goto L40
        L3a:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r1 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r1
            java.lang.Throwable r0 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r0, r1)
        L40:
            throw r0
        L41:
            int r1 = r3.resumeMode
            boolean r1 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r1)
            if (r1 == 0) goto L7d
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 == 0) goto L7d
            boolean r2 = r1.isActive()
            if (r2 != 0) goto L7d
            java.util.concurrent.CancellationException r1 = r1.getCancellationException()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r3.cancelCompletedResult$kotlinx_coroutines_core(r0, r1)
            boolean r0 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r0 == 0) goto L7c
            r0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            boolean r2 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r2 != 0) goto L76
            goto L7c
        L76:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            java.lang.Throwable r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r1, r0)
        L7c:
            throw r1
        L7d:
            java.lang.Object r0 = r3.getSuccessfulResult$kotlinx_coroutines_core(r0)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1._state
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedContinuation
            if (r0 == 0) goto L8
            kotlinx.coroutines.CompletedContinuation r2 = (kotlinx.coroutines.CompletedContinuation) r2
            java.lang.Object r2 = r2.result
        L8:
            return r2
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
            r2 = this;
            kotlinx.coroutines.DisposableHandle r0 = r2.installParentHandle()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r2.isCompleted()
            if (r1 == 0) goto L16
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r0 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            r2.parentHandle = r0
        L16:
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r12) {
            r11 = this;
            kotlinx.coroutines.CancelHandler r8 = r11.makeCancelHandler(r12)
        L4:
            java.lang.Object r9 = r11._state
            boolean r0 = r9 instanceof kotlinx.coroutines.Active
            if (r0 == 0) goto L13
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r11, r9, r8)
            if (r0 == 0) goto L4
            return
        L13:
            boolean r0 = r9 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L1b
            r11.multipleHandlersError(r12, r9)
            goto L4
        L1b:
            boolean r0 = r9 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L3c
            r1 = r9
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            boolean r2 = r1.makeHandled()
            if (r2 != 0) goto L2b
            r11.multipleHandlersError(r12, r9)
        L2b:
            boolean r2 = r9 instanceof kotlinx.coroutines.CancelledContinuation
            if (r2 == 0) goto L3b
            r2 = 0
            if (r0 == 0) goto L33
            goto L34
        L33:
            r1 = r2
        L34:
            if (r1 == 0) goto L38
            java.lang.Throwable r2 = r1.cause
        L38:
            r11.callCancelHandler(r12, r2)
        L3b:
            return
        L3c:
            boolean r0 = r9 instanceof kotlinx.coroutines.CompletedContinuation
            if (r0 == 0) goto L70
            r0 = r9
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            kotlinx.coroutines.CancelHandler r1 = r0.cancelHandler
            if (r1 == 0) goto L4a
            r11.multipleHandlersError(r12, r9)
        L4a:
            boolean r1 = r8 instanceof kotlinx.coroutines.BeforeResumeCancelHandler
            if (r1 == 0) goto L4f
            return
        L4f:
            boolean r1 = r0.getCancelled()
            if (r1 == 0) goto L5b
            java.lang.Throwable r0 = r0.cancelCause
            r11.callCancelHandler(r12, r0)
            return
        L5b:
            r6 = 29
            r7 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            kotlinx.coroutines.CompletedContinuation r0 = kotlinx.coroutines.CompletedContinuation.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r11, r9, r0)
            if (r0 == 0) goto L4
            return
        L70:
            boolean r0 = r8 instanceof kotlinx.coroutines.BeforeResumeCancelHandler
            if (r0 == 0) goto L75
            return
        L75:
            kotlinx.coroutines.CompletedContinuation r10 = new kotlinx.coroutines.CompletedContinuation
            r6 = 28
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r10
            r1 = r9
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r11, r9, r10)
            if (r0 == 0) goto L4
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.NotCompleted
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.CancelledContinuation
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.NotCompleted
            r0 = r0 ^ 1
            return r0
    }

    protected java.lang.String nameString() {
            r1 = this;
            java.lang.String r0 = "CancellableContinuation"
            return r0
    }

    public final void parentCancelled$kotlinx_coroutines_core(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.cancelLater(r2)
            if (r0 == 0) goto L7
            return
        L7:
            r1.cancel(r2)
            r1.detachChildIfNonResuable()
            return
    }

    public final boolean resetStateReusable() {
            r3 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L12
            int r0 = r3.resumeMode
            r1 = 2
            if (r0 != r1) goto Lc
            goto L12
        Lc:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L12:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L25
            kotlinx.coroutines.DisposableHandle r0 = r3.parentHandle
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r0 == r1) goto L1f
            goto L25
        L1f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L25:
            java.lang.Object r0 = r3._state
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L38
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r1 != 0) goto L32
            goto L38
        L32:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L38:
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedContinuation
            r2 = 0
            if (r1 == 0) goto L47
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            java.lang.Object r0 = r0.idempotentResume
            if (r0 == 0) goto L47
            r3.detachChild$kotlinx_coroutines_core()
            return r2
        L47:
            r3._decision = r2
            kotlinx.coroutines.Active r0 = kotlinx.coroutines.Active.INSTANCE
            r3._state = r0
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r1 = this;
            int r0 = r1.resumeMode
            r1.resumeImpl(r2, r0, r3)
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(kotlinx.coroutines.CoroutineDispatcher r7, T r8) {
            r6 = this;
            kotlin.coroutines.Continuation<T> r0 = r6.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto Lf
            kotlinx.coroutines.CoroutineDispatcher r2 = r0.dispatcher
        Lf:
            if (r2 != r7) goto L13
            r7 = 4
            goto L15
        L13:
            int r7 = r6.resumeMode
        L15:
            r2 = r7
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r8
            resumeImpl$default(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(kotlinx.coroutines.CoroutineDispatcher r10, java.lang.Throwable r11) {
            r9 = this;
            kotlin.coroutines.Continuation<T> r0 = r9.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            kotlinx.coroutines.CompletedExceptionally r4 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r3 = 2
            r4.<init>(r11, r1, r3, r2)
            if (r0 == 0) goto L16
            kotlinx.coroutines.CoroutineDispatcher r2 = r0.dispatcher
        L16:
            if (r2 != r10) goto L1a
            r10 = 4
            goto L1c
        L1a:
            int r10 = r9.resumeMode
        L1c:
            r5 = r10
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r9
            resumeImpl$default(r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r8) {
            r7 = this;
            r0 = r7
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            java.lang.Object r2 = kotlinx.coroutines.CompletionStateKt.toState(r8, r0)
            int r3 = r7.resumeMode
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            resumeImpl$default(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.nameString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.coroutines.Continuation<T> r1 = r2.delegate
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.toDebugString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "){"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getStateDebugRepresentation()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}@"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.internal.Symbol r2 = r1.tryResumeImpl(r2, r3, r0)
            return r2
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T r1, java.lang.Object r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r0 = this;
            kotlinx.coroutines.internal.Symbol r1 = r0.tryResumeImpl(r1, r2, r3)
            return r1
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResumeWithException(java.lang.Throwable r5) {
            r4 = this;
            kotlinx.coroutines.CompletedExceptionally r0 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r5, r1, r2, r3)
            kotlinx.coroutines.internal.Symbol r5 = r4.tryResumeImpl(r0, r3, r3)
            return r5
    }
}
