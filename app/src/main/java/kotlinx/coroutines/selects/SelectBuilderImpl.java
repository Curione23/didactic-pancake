package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020Y2\b\u0012\u0004\u0012\u00028\u00000Z2\b\u0012\u0004\u0012\u00028\u00000[2\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060Bj\u0002`C:\u0004TUVWB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\fJ8\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010\u001cJ \u0010+\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J5\u00108\u001a\u00020\b*\u0002072\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109JG\u00108\u001a\u00020\b\"\u0004\b\u0001\u0010:*\b\u0012\u0004\u0012\u00028\u00010;2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0<H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010=J[\u00108\u001a\u00020\b\"\u0004\b\u0001\u0010>\"\u0004\b\u0002\u0010:*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020?2\u0006\u0010@\u001a\u00028\u00012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0<H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010AR\u001c\u0010F\u001a\n\u0018\u00010Bj\u0004\u0018\u0001`C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010N\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u00102R(\u0010R\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010S\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl;", "R", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/Continuation;)V", "Lkotlinx/coroutines/DisposableHandle;", "handle", "", "disposeOnSelect", "(Lkotlinx/coroutines/DisposableHandle;)V", "doAfterSelect", "()V", "Lkotlin/Function0;", "", "value", "block", "doResume", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "e", "handleBuilderException", "(Ljava/lang/Throwable;)V", "initCancellability", "", "timeMillis", "Lkotlin/Function1;", "onTimeout", "(JLkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/AtomicDesc;", "desc", "performAtomicTrySelect", "(Lkotlinx/coroutines/internal/AtomicDesc;)Ljava/lang/Object;", "exception", "resumeSelectWithException", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "trySelect", "()Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "otherOp", "trySelectOther", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectClause0;", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getCompletion", "()Lkotlin/coroutines/Continuation;", "completion", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "isSelected", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setParentHandle", "parentHandle", "Lkotlin/coroutines/Continuation;", "AtomicSelectOp", "DisposeNode", "PairSelectOp", "SelectOnCancelling", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstance;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SelectBuilderImpl<R> extends kotlinx.coroutines.internal.LockFreeLinkedListHead implements kotlinx.coroutines.selects.SelectBuilder<R>, kotlinx.coroutines.selects.SelectInstance<R>, kotlin.coroutines.Continuation<R>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _result$FU = null;
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private volatile /* synthetic */ java.lang.Object _parentHandle;
    private volatile /* synthetic */ java.lang.Object _result;
    volatile /* synthetic */ java.lang.Object _state;
    private final kotlin.coroutines.Continuation<R> uCont;

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0002R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "", "impl", "Lkotlinx/coroutines/selects/SelectBuilderImpl;", "desc", "Lkotlinx/coroutines/internal/AtomicDesc;", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/internal/AtomicDesc;)V", "opSequence", "", "getOpSequence", "()J", "complete", "", "affected", "failure", "completeSelect", "prepare", "prepareSelectOp", "toString", "", "undoPrepare", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class AtomicSelectOp extends kotlinx.coroutines.internal.AtomicOp<java.lang.Object> {
        public final kotlinx.coroutines.internal.AtomicDesc desc;
        public final kotlinx.coroutines.selects.SelectBuilderImpl<?> impl;
        private final long opSequence;

        public AtomicSelectOp(kotlinx.coroutines.selects.SelectBuilderImpl<?> r3, kotlinx.coroutines.internal.AtomicDesc r4) {
                r2 = this;
                r2.<init>()
                r2.impl = r3
                r2.desc = r4
                kotlinx.coroutines.selects.SeqNumber r3 = kotlinx.coroutines.selects.SelectKt.access$getSelectOpSequenceNumber$p()
                long r0 = r3.next()
                r2.opSequence = r0
                r3 = r2
                kotlinx.coroutines.internal.AtomicOp r3 = (kotlinx.coroutines.internal.AtomicOp) r3
                r4.setAtomicOp(r3)
                return
        }

        private final void completeSelect(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 1
                goto L5
            L4:
                r4 = 0
            L5:
                if (r4 == 0) goto L9
                r0 = 0
                goto Ld
            L9:
                java.lang.Object r0 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            Ld:
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r1 = r3.impl
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
                boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r1, r3, r0)
                if (r0 == 0) goto L1e
                if (r4 == 0) goto L1e
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r4 = r3.impl
                kotlinx.coroutines.selects.SelectBuilderImpl.access$doAfterSelect(r4)
            L1e:
                return
        }

        private final java.lang.Object prepareSelectOp() {
                r5 = this;
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r0 = r5.impl
            L2:
                java.lang.Object r1 = r0._state
                r2 = 0
                if (r1 != r5) goto L8
                return r2
            L8:
                boolean r3 = r1 instanceof kotlinx.coroutines.internal.OpDescriptor
                if (r3 == 0) goto L14
                kotlinx.coroutines.internal.OpDescriptor r1 = (kotlinx.coroutines.internal.OpDescriptor) r1
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r2 = r5.impl
                r1.perform(r2)
                goto L2
            L14:
                java.lang.Object r3 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
                if (r1 != r3) goto L29
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r1 = r5.impl
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
                java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
                boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r1, r4, r5)
                if (r1 == 0) goto L2
                return r2
            L29:
                java.lang.Object r0 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
                return r0
        }

        private final void undoPrepare() {
                r3 = this;
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r0 = r3.impl
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
                java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r0, r3, r2)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public void complete(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                r1.completeSelect(r3)
                kotlinx.coroutines.internal.AtomicDesc r2 = r1.desc
                r0 = r1
                kotlinx.coroutines.internal.AtomicOp r0 = (kotlinx.coroutines.internal.AtomicOp) r0
                r2.complete(r0, r3)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public long getOpSequence() {
                r2 = this;
                long r0 = r2.opSequence
                return r0
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public java.lang.Object prepare(java.lang.Object r3) {
                r2 = this;
                if (r3 != 0) goto L9
                java.lang.Object r0 = r2.prepareSelectOp()
                if (r0 == 0) goto L9
                return r0
            L9:
                kotlinx.coroutines.internal.AtomicDesc r0 = r2.desc     // Catch: java.lang.Throwable -> L13
                r1 = r2
                kotlinx.coroutines.internal.AtomicOp r1 = (kotlinx.coroutines.internal.AtomicOp) r1     // Catch: java.lang.Throwable -> L13
                java.lang.Object r3 = r0.prepare(r1)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r0 = move-exception
                if (r3 != 0) goto L19
                r2.undoPrepare()
            L19:
                throw r0
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "AtomicSelectOp(sequence="
                r0.<init>(r1)
                long r1 = r3.getOpSequence()
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "handle", "Lkotlinx/coroutines/DisposableHandle;", "(Lkotlinx/coroutines/DisposableHandle;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class DisposeNode extends kotlinx.coroutines.internal.LockFreeLinkedListNode {
        public final kotlinx.coroutines.DisposableHandle handle;

        public DisposeNode(kotlinx.coroutines.DisposableHandle r1) {
                r0 = this;
                r0.<init>()
                r0.handle = r1
                return
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$PairSelectOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "perform", "", "affected", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class PairSelectOp extends kotlinx.coroutines.internal.OpDescriptor {
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp otherOp;

        public PairSelectOp(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r1) {
                r0 = this;
                r0.<init>()
                r0.otherOp = r1
                return
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r0 = r1.otherOp
                kotlinx.coroutines.internal.AtomicOp r0 = r0.getAtomicOp()
                return r0
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public java.lang.Object perform(java.lang.Object r4) {
                r3 = this;
                if (r4 == 0) goto L25
                kotlinx.coroutines.selects.SelectBuilderImpl r4 = (kotlinx.coroutines.selects.SelectBuilderImpl) r4
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r0 = r3.otherOp
                r0.finishPrepare()
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r0 = r3.otherOp
                kotlinx.coroutines.internal.AtomicOp r0 = r0.getAtomicOp()
                r1 = 0
                java.lang.Object r0 = r0.decide(r1)
                if (r0 != 0) goto L1b
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r1 = r3.otherOp
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r1 = r1.desc
                goto L1f
            L1b:
                java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            L1f:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r3, r1)
                return r0
            L25:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>"
                r4.<init>(r0)
                throw r4
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$SelectOnCancelling;", "Lkotlinx/coroutines/JobCancellingNode;", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class SelectOnCancelling extends kotlinx.coroutines.JobCancellingNode {
        final /* synthetic */ kotlinx.coroutines.selects.SelectBuilderImpl<R> this$0;

        public SelectOnCancelling(kotlinx.coroutines.selects.SelectBuilderImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
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

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.selects.SelectBuilderImpl<R> r2 = r1.this$0
                boolean r2 = r2.trySelect()
                if (r2 == 0) goto L17
                kotlinx.coroutines.selects.SelectBuilderImpl<R> r2 = r1.this$0
                kotlinx.coroutines.JobSupport r0 = r1.getJob()
                java.util.concurrent.CancellationException r0 = r0.getCancellationException()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r2.resumeSelectWithException(r0)
            L17:
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.selects.SelectBuilderImpl> r2 = kotlinx.coroutines.selects.SelectBuilderImpl.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.selects.SelectBuilderImpl._state$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_result"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.selects.SelectBuilderImpl._result$FU = r0
            return
    }

    public SelectBuilderImpl(kotlin.coroutines.Continuation<? super R> r1) {
            r0 = this;
            r0.<init>()
            r0.uCont = r1
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            r0._state = r1
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            r0._result = r1
            r1 = 0
            r0._parentHandle = r1
            return
    }

    public static final /* synthetic */ void access$doAfterSelect(kotlinx.coroutines.selects.SelectBuilderImpl r0) {
            r0.doAfterSelect()
            return
    }

    private final void doAfterSelect() {
            r3 = this;
            kotlinx.coroutines.DisposableHandle r0 = r3.getParentHandle()
            if (r0 == 0) goto L9
            r0.dispose()
        L9:
            r0 = r3
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r0
            java.lang.Object r1 = r0.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
        L12:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r2 != 0) goto L29
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.SelectBuilderImpl.DisposeNode
            if (r2 == 0) goto L24
            r2 = r1
            kotlinx.coroutines.selects.SelectBuilderImpl$DisposeNode r2 = (kotlinx.coroutines.selects.SelectBuilderImpl.DisposeNode) r2
            kotlinx.coroutines.DisposableHandle r2 = r2.handle
            r2.dispose()
        L24:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.getNextNode()
            goto L12
        L29:
            return
    }

    private final void doResume(kotlin.jvm.functions.Function0<? extends java.lang.Object> r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
            r3 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            boolean r0 = r3.isSelected()
            if (r0 == 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L13:
            java.lang.Object r0 = r3._result
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            if (r0 != r1) goto L2c
            java.lang.Object r0 = r4.invoke()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r2, r0)
            if (r0 == 0) goto L13
            return
        L2c:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L46
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r2)
            if (r0 == 0) goto L13
            r5.invoke()
            return
        L46:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already resumed"
            r4.<init>(r5)
            throw r4
    }

    private final kotlinx.coroutines.DisposableHandle getParentHandle() {
            r1 = this;
            java.lang.Object r0 = r1._parentHandle
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            return r0
    }

    private final void initCancellability() {
            r7 = this;
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            r1 = r0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 != 0) goto L12
            return
        L12:
            kotlinx.coroutines.selects.SelectBuilderImpl$SelectOnCancelling r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$SelectOnCancelling
            r0.<init>(r7)
            kotlinx.coroutines.CompletionHandlerBase r0 = (kotlinx.coroutines.CompletionHandlerBase) r0
            r4 = r0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 2
            r6 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r1, r2, r3, r4, r5, r6)
            r7.setParentHandle(r0)
            boolean r1 = r7.isSelected()
            if (r1 == 0) goto L30
            r0.dispose()
        L30:
            return
    }

    private final void setParentHandle(kotlinx.coroutines.DisposableHandle r1) {
            r0 = this;
            r0._parentHandle = r1
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnSelect(kotlinx.coroutines.DisposableHandle r3) {
            r2 = this;
            kotlinx.coroutines.selects.SelectBuilderImpl$DisposeNode r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$DisposeNode
            r0.<init>(r3)
            boolean r1 = r2.isSelected()
            if (r1 != 0) goto L17
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r2.addLast(r0)
            boolean r0 = r2.isSelected()
            if (r0 != 0) goto L17
            return
        L17:
            r3.dispose()
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<R> r0 = r2.uCont
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public kotlin.coroutines.Continuation<R> getCompletion() {
            r1 = this;
            r0 = r1
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.Continuation<R> r0 = r1.uCont
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            return r0
    }

    public final java.lang.Object getResult() {
            r3 = this;
            boolean r0 = r3.isSelected()
            if (r0 != 0) goto L9
            r3.initCancellability()
        L9:
            java.lang.Object r0 = r3._result
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            if (r0 != r1) goto L28
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r2)
            if (r0 == 0) goto L26
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
        L26:
            java.lang.Object r0 = r3._result
        L28:
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
            if (r0 == r1) goto L38
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L33
            return r0
        L33:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            throw r0
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void handleBuilderException(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.trySelect()
            if (r0 == 0) goto L17
            r0 = r2
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m767constructorimpl(r3)
            r0.resumeWith(r3)
            goto L47
        L17:
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L47
            java.lang.Object r0 = r2.getResult()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L40
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 != 0) goto L2e
            goto L32
        L2e:
            java.lang.Throwable r0 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r0)
        L32:
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 != 0) goto L3a
            r1 = r3
            goto L3e
        L3a:
            java.lang.Throwable r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r3)
        L3e:
            if (r0 == r1) goto L47
        L40:
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r3)
        L47:
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(kotlinx.coroutines.selects.SelectClause0 r2, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectInstance r0 = (kotlinx.coroutines.selects.SelectInstance) r0
            r2.registerSelectClause0(r0, r3)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(kotlinx.coroutines.selects.SelectClause1<? extends Q> r2, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectInstance r0 = (kotlinx.coroutines.selects.SelectInstance) r0
            r2.registerSelectClause1(r0, r3)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> r2, P r3, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectInstance r0 = (kotlinx.coroutines.selects.SelectInstance) r0
            r2.registerSelectClause2(r0, r3, r4)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> r1, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            r0 = this;
            kotlinx.coroutines.selects.SelectBuilder.DefaultImpls.invoke(r0, r1, r2)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean isSelected() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._state
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            if (r0 != r1) goto La
            r0 = 0
            return r0
        La:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L14
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r2)
            goto L0
        L14:
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void onTimeout(long r3, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L14
            boolean r3 = r2.trySelect()
            if (r3 == 0) goto L13
            kotlin.coroutines.Continuation r3 = r2.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r5, r3)
        L13:
            return
        L14:
            kotlinx.coroutines.selects.SelectBuilderImpl$onTimeout$$inlined$Runnable$1 r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$onTimeout$$inlined$Runnable$1
            r0.<init>(r2, r5)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            kotlin.coroutines.CoroutineContext r5 = r2.getContext()
            kotlinx.coroutines.Delay r5 = kotlinx.coroutines.DelayKt.getDelay(r5)
            kotlin.coroutines.CoroutineContext r1 = r2.getContext()
            kotlinx.coroutines.DisposableHandle r3 = r5.invokeOnTimeout(r3, r0, r1)
            r2.disposeOnSelect(r3)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public java.lang.Object performAtomicTrySelect(kotlinx.coroutines.internal.AtomicDesc r2) {
            r1 = this;
            kotlinx.coroutines.selects.SelectBuilderImpl$AtomicSelectOp r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$AtomicSelectOp
            r0.<init>(r1, r2)
            r2 = 0
            java.lang.Object r2 = r0.perform(r2)
            return r2
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void resumeSelectWithException(java.lang.Throwable r6) {
            r5 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            boolean r0 = r5.isSelected()
            if (r0 == 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L13:
            java.lang.Object r0 = r5._result
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            if (r0 != r1) goto L45
            kotlinx.coroutines.CompletedExceptionally r0 = new kotlinx.coroutines.CompletedExceptionally
            kotlin.coroutines.Continuation<R> r1 = r5.uCont
            boolean r2 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r2 == 0) goto L31
            boolean r2 = r1 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r2 != 0) goto L2a
            goto L31
        L2a:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r1 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r1
            java.lang.Throwable r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r6, r1)
            goto L32
        L31:
            r1 = r6
        L32:
            r2 = 2
            r3 = 0
            r4 = 0
            r0.<init>(r1, r4, r2, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r5, r2, r0)
            if (r0 == 0) goto L13
            goto L6e
        L45:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L6f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r5, r1, r2)
            if (r0 == 0) goto L13
            kotlin.coroutines.Continuation<R> r0 = r5.uCont
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
            java.lang.Object r6 = kotlin.Result.m767constructorimpl(r6)
            r0.resumeWith(r6)
        L6e:
            return
        L6f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            r6.<init>(r0)
            throw r6
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r4) {
            r3 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            boolean r0 = r3.isSelected()
            if (r0 == 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L13:
            java.lang.Object r0 = r3._result
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            if (r0 != r1) goto L2e
            r0 = 1
            r1 = 0
            java.lang.Object r0 = kotlinx.coroutines.CompletionStateKt.toState$default(r4, r1, r0, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r2, r0)
            if (r0 == 0) goto L13
            goto L78
        L2e:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L79
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r2)
            if (r0 == 0) goto L13
            boolean r0 = kotlin.Result.m773isFailureimpl(r4)
            if (r0 == 0) goto L73
            kotlin.coroutines.Continuation<R> r0 = r3.uCont
            java.lang.Throwable r4 = kotlin.Result.m770exceptionOrNullimpl(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 == 0) goto L67
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 != 0) goto L60
            goto L67
        L60:
            r1 = r0
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r1 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r1
            java.lang.Throwable r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r4, r1)
        L67:
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m767constructorimpl(r4)
            r0.resumeWith(r4)
            goto L78
        L73:
            kotlin.coroutines.Continuation<R> r0 = r3.uCont
            r0.resumeWith(r4)
        L78:
            return
        L79:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            r4.<init>(r0)
            throw r4
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SelectInstance(state="
            r0.<init>(r1)
            java.lang.Object r1 = r2._state
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", result="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2._result
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect() {
            r4 = this;
            r0 = 0
            java.lang.Object r0 = r4.trySelectOther(r0)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            if (r0 != r1) goto Lb
            r0 = 1
            goto Le
        Lb:
            if (r0 != 0) goto Lf
            r0 = 0
        Le:
            return r0
        Lf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected trySelectIdempotent result "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public java.lang.Object trySelectOther(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            r2 = 0
            if (r0 != r1) goto L36
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r2)
            if (r0 != 0) goto L30
            goto L0
        L18:
            kotlinx.coroutines.selects.SelectBuilderImpl$PairSelectOp r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$PairSelectOp
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r2, r0)
            if (r1 == 0) goto L0
            java.lang.Object r4 = r0.perform(r3)
            if (r4 == 0) goto L30
            return r4
        L30:
            r3.doAfterSelect()
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r4
        L36:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L6a
            if (r4 == 0) goto L64
            kotlinx.coroutines.internal.AtomicOp r1 = r4.getAtomicOp()
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.SelectBuilderImpl.AtomicSelectOp
            if (r2 == 0) goto L58
            r2 = r1
            kotlinx.coroutines.selects.SelectBuilderImpl$AtomicSelectOp r2 = (kotlinx.coroutines.selects.SelectBuilderImpl.AtomicSelectOp) r2
            kotlinx.coroutines.selects.SelectBuilderImpl<?> r2 = r2.impl
            if (r2 == r3) goto L4c
            goto L58
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L58:
            r2 = r0
            kotlinx.coroutines.internal.OpDescriptor r2 = (kotlinx.coroutines.internal.OpDescriptor) r2
            boolean r1 = r1.isEarlierThan(r2)
            if (r1 == 0) goto L64
            java.lang.Object r4 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            return r4
        L64:
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r3)
            goto L0
        L6a:
            if (r4 != 0) goto L6d
            return r2
        L6d:
            kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r4 = r4.desc
            if (r0 != r4) goto L74
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r4
        L74:
            return r2
    }
}
