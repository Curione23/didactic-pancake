package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\u0017\u0018\u00002\u00020C:\u0005JKLMNB\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000b\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u000f\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0011\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\r2\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001a\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\f\b\u0000\u0010\u001c*\u00060\u0000j\u0002`\u00032\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00030 ¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\u00060\u0000j\u0002`\u00032\n\u0010#\u001a\u00060\u0000j\u0002`\u0003H\u0082\u0010¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0002¢\u0006\u0004\b&\u0010\u0007J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u0002J\u000f\u0010(\u001a\u00020\u0005H\u0001¢\u0006\u0004\b(\u0010\u0002J,\u0010*\u001a\u00020)2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0081\b¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J.\u00100\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\rH\u0086\b¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b2\u0010-J\u0017\u00103\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0001¢\u0006\u0004\b3\u0010-J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J/\u0010<\u001a\u00020;2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00032\u0006\u0010:\u001a\u00020)H\u0001¢\u0006\u0004\b<\u0010=J'\u0010A\u001a\u00020\u00052\n\u0010>\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010/R\u0011\u0010\u0013\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0015\u0010G\u001a\u00060\u0000j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\bF\u0010-R\u0015\u0010I\u001a\u00060\u0000j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\bH\u0010-¨\u0006O"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "", "addLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlin/Function0;", "", "condition", "addLastIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;)Z", "addLastIfPrevAndIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Z", "next", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "addOneIfEmpty", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "correctPrev", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "current", "findPrevNonRemoved", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "finishAdd", "helpRemove", "helpRemovePrev", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "nextIfRemoved", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "remove", "()Z", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "removeOrNext", "Lkotlinx/coroutines/internal/Removed;", "removed", "()Lkotlinx/coroutines/internal/Removed;", "", "toString", "()Ljava/lang/String;", "condAdd", "", "tryCondAddNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "validateNode", "isRemoved", "", "getNext", "()Ljava/lang/Object;", "getNextNode", "nextNode", "getPrevNode", "prevNode", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "PrepareOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class LockFreeLinkedListNode {
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = null;
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _removedRef$FU = null;
    volatile /* synthetic */ java.lang.Object _next;
    volatile /* synthetic */ java.lang.Object _prev;
    private volatile /* synthetic */ java.lang.Object _removedRef;

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005H\u0014J \u0010\u0011\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H$J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0017\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rJ\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0014J\u0018\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\f\u001a\u00020\u001cH\u0014J \u0010\u001d\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H&R\u001a\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "()V", "affectedNode", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "originalNext", "getOriginalNext", "complete", "", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "failure", "", "affected", "finishOnSuccess", "next", "finishPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "onPrepare", "onRemoved", "prepare", "retry", "", "takeAffectedNode", "Lkotlinx/coroutines/internal/OpDescriptor;", "updatedNext", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class AbstractAtomicDesc extends kotlinx.coroutines.internal.AtomicDesc {
        public AbstractAtomicDesc() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public final void complete(kotlinx.coroutines.internal.AtomicOp<?> r5, java.lang.Object r6) {
                r4 = this;
                if (r6 != 0) goto L4
                r6 = 1
                goto L5
            L4:
                r6 = 0
            L5:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r4.getAffectedNode()
                if (r0 != 0) goto L1e
                r5 = r4
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc) r5
                boolean r5 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r5 == 0) goto L1d
                if (r6 != 0) goto L17
                goto L1d
            L17:
                java.lang.AssertionError r5 = new java.lang.AssertionError
                r5.<init>()
                throw r5
            L1d:
                return
            L1e:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r4.getOriginalNext()
                if (r1 != 0) goto L37
                r5 = r4
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc) r5
                boolean r5 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r5 == 0) goto L36
                if (r6 != 0) goto L30
                goto L36
            L30:
                java.lang.AssertionError r5 = new java.lang.AssertionError
                r5.<init>()
                throw r5
            L36:
                return
            L37:
                if (r6 == 0) goto L3e
                java.lang.Object r2 = r4.updatedNext(r0, r1)
                goto L3f
            L3e:
                r2 = r1
            L3f:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
                boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r0, r5, r2)
                if (r5 == 0) goto L4c
                if (r6 == 0) goto L4c
                r4.finishOnSuccess(r0, r1)
            L4c:
                return
        }

        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        protected abstract void finishOnSuccess(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, kotlinx.coroutines.internal.LockFreeLinkedListNode r2);

        public abstract void finishPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r1);

        protected abstract kotlinx.coroutines.internal.LockFreeLinkedListNode getAffectedNode();

        protected abstract kotlinx.coroutines.internal.LockFreeLinkedListNode getOriginalNext();

        public java.lang.Object onPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r1) {
                r0 = this;
                r0.finishPrepare(r1)
                r1 = 0
                return r1
        }

        public void onRemoved(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public final java.lang.Object prepare(kotlinx.coroutines.internal.AtomicOp<?> r7) {
                r6 = this;
            L0:
                r0 = r7
                kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r6.takeAffectedNode(r0)
                if (r0 != 0) goto Lc
                java.lang.Object r7 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                return r7
            Lc:
                java.lang.Object r1 = r0._next
                r2 = 0
                if (r1 != r7) goto L12
                return r2
            L12:
                boolean r3 = r7.isDecided()
                if (r3 == 0) goto L19
                return r2
            L19:
                boolean r3 = r1 instanceof kotlinx.coroutines.internal.OpDescriptor
                if (r3 == 0) goto L2c
                kotlinx.coroutines.internal.OpDescriptor r1 = (kotlinx.coroutines.internal.OpDescriptor) r1
                boolean r2 = r7.isEarlierThan(r1)
                if (r2 == 0) goto L28
                java.lang.Object r7 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                return r7
            L28:
                r1.perform(r0)
                goto L0
            L2c:
                java.lang.Object r3 = r6.failure(r0)
                if (r3 == 0) goto L33
                return r3
            L33:
                boolean r3 = r6.retry(r0, r1)
                if (r3 != 0) goto L0
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r3 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp
                r4 = r1
                kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
                r3.<init>(r0, r4, r6)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
                boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r0, r1, r3)
                if (r4 == 0) goto L0
                java.lang.Object r4 = r3.perform(r0)     // Catch: java.lang.Throwable -> L61
                java.lang.Object r5 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED     // Catch: java.lang.Throwable -> L61
                if (r4 == r5) goto L0
                boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L61
                if (r7 == 0) goto L60
                if (r4 != 0) goto L5a
                goto L60
            L5a:
                java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L61
                r7.<init>()     // Catch: java.lang.Throwable -> L61
                throw r7     // Catch: java.lang.Throwable -> L61
            L60:
                return r2
            L61:
                r7 = move-exception
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r0, r3, r1)
                throw r7
        }

        protected boolean retry(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, java.lang.Object r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        protected kotlinx.coroutines.internal.LockFreeLinkedListNode takeAffectedNode(kotlinx.coroutines.internal.OpDescriptor r1) {
                r0 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r0.getAffectedNode()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                return r1
        }

        public abstract java.lang.Object updatedNext(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, kotlinx.coroutines.internal.LockFreeLinkedListNode r2);
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020!B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\n\u0010\t\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\t\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00102\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\n\u0010\t\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0018\u0010\u001f\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\u0004\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001d¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "T", "queue", "node", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "affected", "next", "", "finishOnSuccess", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "prepareOp", "finishPrepare", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "", "", "retry", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "updatedNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affectedNode", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "getOriginalNext", "originalNext", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class AddLastDesc<T extends kotlinx.coroutines.internal.LockFreeLinkedListNode> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _affectedNode$FU = null;
        private volatile /* synthetic */ java.lang.Object _affectedNode;
        public final T node;
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode queue;

        static {
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.String r1 = "_affectedNode"
                java.lang.Class<kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc> r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc.class
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc._affectedNode$FU = r0
                return
        }

        public AddLastDesc(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, T r2) {
                r0 = this;
                r0.<init>()
                r0.queue = r1
                r0.node = r2
                boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r2._next
                if (r1 != r2) goto L16
                java.lang.Object r1 = r2._prev
                if (r1 != r2) goto L16
                goto L1c
            L16:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L1c:
                r1 = 0
                r0._affectedNode = r1
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected void finishOnSuccess(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r0 = this;
                T extends kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r0.node
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r0.queue
                kotlinx.coroutines.internal.LockFreeLinkedListNode.access$finishAdd(r1, r2)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void finishPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc._affectedNode$FU
                r1 = 0
                kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r3.affected
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r1, r3)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode getAffectedNode() {
                r1 = this;
                java.lang.Object r0 = r1._affectedNode
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                return r0
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode getOriginalNext() {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.queue
                return r0
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected boolean retry(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r0.queue
                if (r2 == r1) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode takeAffectedNode(kotlinx.coroutines.internal.OpDescriptor r2) {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.queue
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode.access$correctPrev(r0, r2)
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public java.lang.Object updatedNext(kotlinx.coroutines.internal.LockFreeLinkedListNode r3, kotlinx.coroutines.internal.LockFreeLinkedListNode r4) {
                r2 = this;
                T extends kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r2.node
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
                T extends kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r2.node
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r4, r1, r3)
                T extends kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r2.node
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
                T extends kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r2.node
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r2.queue
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r0, r1)
                T extends kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r2.node
                return r3
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", "failure", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class CondAddOp extends kotlinx.coroutines.internal.AtomicOp<kotlinx.coroutines.internal.LockFreeLinkedListNode> {
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode newNode;
        public kotlinx.coroutines.internal.LockFreeLinkedListNode oldNext;

        public CondAddOp(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                r0.<init>()
                r0.newNode = r1
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ void complete(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
                r0.complete2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: complete, reason: avoid collision after fix types in other method */
        public void complete2(kotlinx.coroutines.internal.LockFreeLinkedListNode r3, java.lang.Object r4) {
                r2 = this;
                if (r4 != 0) goto L4
                r4 = 1
                goto L5
            L4:
                r4 = 0
            L5:
                if (r4 == 0) goto La
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r2.newNode
                goto Lc
            La:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r2.oldNext
            Lc:
                if (r0 == 0) goto L22
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
                boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r2, r0)
                if (r3 == 0) goto L22
                if (r4 == 0) goto L22
                kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r2.newNode
                kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r2.oldNext
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.access$finishAdd(r3, r4)
            L22:
                return
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0002\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "next", "desc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "finishPrepare", "", "perform", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class PrepareOp extends kotlinx.coroutines.internal.OpDescriptor {
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode affected;
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc desc;
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode next;

        public PrepareOp(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, kotlinx.coroutines.internal.LockFreeLinkedListNode r2, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc r3) {
                r0 = this;
                r0.<init>()
                r0.affected = r1
                r0.next = r2
                r0.desc = r3
                return
        }

        public final void finishPrepare() {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r0 = r1.desc
                r0.finishPrepare(r1)
                return
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r0 = r1.desc
                kotlinx.coroutines.internal.AtomicOp r0 = r0.getAtomicOp()
                return r0
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public java.lang.Object perform(java.lang.Object r5) {
                r4 = this;
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r0 == 0) goto L11
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r4.affected
                if (r5 != r0) goto Lb
                goto L11
            Lb:
                java.lang.AssertionError r5 = new java.lang.AssertionError
                r5.<init>()
                throw r5
            L11:
                if (r5 == 0) goto L68
                kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r5
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r0 = r4.desc
                java.lang.Object r0 = r0.onPrepare(r4)
                java.lang.Object r1 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED
                r2 = 0
                if (r0 != r1) goto L39
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r4.next
                kotlinx.coroutines.internal.Removed r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.access$removed(r0)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
                boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r5, r4, r1)
                if (r1 == 0) goto L36
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r1 = r4.desc
                r1.onRemoved(r5)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.access$correctPrev(r0, r2)
            L36:
                java.lang.Object r5 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED
                return r5
            L39:
                if (r0 == 0) goto L44
                kotlinx.coroutines.internal.AtomicOp r1 = r4.getAtomicOp()
                java.lang.Object r0 = r1.decide(r0)
                goto L4c
            L44:
                kotlinx.coroutines.internal.AtomicOp r0 = r4.getAtomicOp()
                java.lang.Object r0 = r0.getConsensus()
            L4c:
                java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
                if (r0 != r1) goto L55
                kotlinx.coroutines.internal.AtomicOp r0 = r4.getAtomicOp()
                goto L62
            L55:
                if (r0 != 0) goto L60
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r0 = r4.desc
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r4.next
                java.lang.Object r0 = r0.updatedNext(r5, r1)
                goto L62
            L60:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r4.next
            L62:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r5, r4, r0)
                return r2
            L68:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                r5.<init>(r0)
                throw r5
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "PrepareOp(op="
                r0.<init>(r1)
                kotlinx.coroutines.internal.AtomicOp r1 = r2.getAtomicOp()
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020(B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0017\u0010&\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "queue", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "affected", "", "failure", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "next", "", "finishOnSuccess", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "prepareOp", "finishPrepare", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "", "retry", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "updatedNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "getResult", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class RemoveFirstDesc<T> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _affectedNode$FU = null;
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _originalNext$FU = null;
        private volatile /* synthetic */ java.lang.Object _affectedNode;
        private volatile /* synthetic */ java.lang.Object _originalNext;
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode queue;

        static {
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.String r1 = "_affectedNode"
                java.lang.Class<kotlinx.coroutines.internal.LockFreeLinkedListNode$RemoveFirstDesc> r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc.class
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc._affectedNode$FU = r0
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.String r1 = "_originalNext"
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc._originalNext$FU = r0
                return
        }

        public RemoveFirstDesc(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                r0.<init>()
                r0.queue = r1
                r1 = 0
                r0._affectedNode = r1
                r0._originalNext = r1
                return
        }

        public static /* synthetic */ void getResult$annotations() {
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.queue
                if (r2 != r0) goto L9
                java.lang.Object r2 = kotlinx.coroutines.internal.LockFreeLinkedListKt.getLIST_EMPTY()
                goto La
            L9:
                r2 = 0
            La:
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final void finishOnSuccess(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r0 = this;
                r1 = 0
                kotlinx.coroutines.internal.LockFreeLinkedListNode.access$correctPrev(r2, r1)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void finishPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc._affectedNode$FU
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r4.affected
                r2 = 0
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r2, r1)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc._originalNext$FU
                kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.next
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r2, r4)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode getAffectedNode() {
                r1 = this;
                java.lang.Object r0 = r1._affectedNode
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                return r0
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode getOriginalNext() {
                r1 = this;
                java.lang.Object r0 = r1._originalNext
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                return r0
        }

        public final T getResult() {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.getAffectedNode()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.lang.Object r0 = (java.lang.Object) r0
                return r0
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final boolean retry(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, java.lang.Object r2) {
                r0 = this;
                boolean r1 = r2 instanceof kotlinx.coroutines.internal.Removed
                if (r1 != 0) goto L6
                r1 = 0
                return r1
            L6:
                kotlinx.coroutines.internal.Removed r2 = (kotlinx.coroutines.internal.Removed) r2
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r2.ref
                r1.helpRemovePrev()
                r1 = 1
                return r1
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode takeAffectedNode(kotlinx.coroutines.internal.OpDescriptor r4) {
                r3 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r3.queue
            L2:
                java.lang.Object r1 = r0._next
                boolean r2 = r1 instanceof kotlinx.coroutines.internal.OpDescriptor
                if (r2 == 0) goto L18
                kotlinx.coroutines.internal.OpDescriptor r1 = (kotlinx.coroutines.internal.OpDescriptor) r1
                boolean r2 = r4.isEarlierThan(r1)
                if (r2 == 0) goto L12
                r4 = 0
                return r4
            L12:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r3.queue
                r1.perform(r2)
                goto L2
            L18:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
                return r1
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final java.lang.Object updatedNext(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r0 = this;
                kotlinx.coroutines.internal.Removed r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.access$removed(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1, reason: invalid class name */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass1 extends kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp {
        final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Boolean> $condition;

        public AnonymousClass1(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, kotlin.jvm.functions.Function0<java.lang.Boolean> r2) {
                r0 = this;
                r0.$condition = r2
                r0.<init>(r1)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ java.lang.Object prepare(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
                java.lang.Object r1 = r0.prepare2(r1)
                return r1
        }

        /* JADX INFO: renamed from: prepare, reason: avoid collision after fix types in other method */
        public java.lang.Object prepare2(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                kotlin.jvm.functions.Function0<java.lang.Boolean> r1 = r0.$condition
                java.lang.Object r1 = r1.invoke()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L10
                r1 = 0
                goto L14
            L10:
                java.lang.Object r1 = kotlinx.coroutines.internal.LockFreeLinkedListKt.getCONDITION_FALSE()
            L14:
                return r1
        }
    }


    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_next"
            java.lang.Class<kotlinx.coroutines.internal.LockFreeLinkedListNode> r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_removedRef"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._removedRef$FU = r0
            return
    }

    public LockFreeLinkedListNode() {
            r1 = this;
            r1.<init>()
            r1._next = r1
            r1._prev = r1
            r0 = 0
            r1._removedRef = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.LockFreeLinkedListNode access$correctPrev(kotlinx.coroutines.internal.LockFreeLinkedListNode r0, kotlinx.coroutines.internal.OpDescriptor r1) {
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.correctPrev(r1)
            return r0
    }

    public static final /* synthetic */ void access$finishAdd(kotlinx.coroutines.internal.LockFreeLinkedListNode r0, kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
            r0.finishAdd(r1)
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Removed access$removed(kotlinx.coroutines.internal.LockFreeLinkedListNode r0) {
            kotlinx.coroutines.internal.Removed r0 = r0.removed()
            return r0
    }

    private final kotlinx.coroutines.internal.LockFreeLinkedListNode correctPrev(kotlinx.coroutines.internal.OpDescriptor r8) {
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.isRemoved()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            boolean r0 = r8.isEarlierThan(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.Removed
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            kotlinx.coroutines.internal.Removed r4 = (kotlinx.coroutines.internal.Removed) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.ref
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
    }

    private final kotlinx.coroutines.internal.LockFreeLinkedListNode findPrevNonRemoved(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
        L0:
            boolean r0 = r2.isRemoved()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L0
    }

    private final void finishAdd(kotlinx.coroutines.internal.LockFreeLinkedListNode r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r3._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            java.lang.Object r1 = r2.getNext()
            if (r1 == r3) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r0, r2)
            if (r0 == 0) goto L0
            boolean r0 = r2.isRemoved()
            if (r0 == 0) goto L1d
            r0 = 0
            r3.correctPrev(r0)
        L1d:
            return
    }

    private final kotlinx.coroutines.internal.Removed removed() {
            r2 = this;
            java.lang.Object r0 = r2._removedRef
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            if (r0 != 0) goto L10
            kotlinx.coroutines.internal.Removed r0 = new kotlinx.coroutines.internal.Removed
            r0.<init>(r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode._removedRef$FU
            r1.lazySet(r2, r0)
        L10:
            return r0
    }

    public final void addLast(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
        L0:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.getPrevNode()
            boolean r0 = r0.addNext(r2, r1)
            if (r0 == 0) goto L0
            return
    }

    public final boolean addLastIf(kotlinx.coroutines.internal.LockFreeLinkedListNode r3, kotlin.jvm.functions.Function0<java.lang.Boolean> r4) {
            r2 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1 r0 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1
            r0.<init>(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r0
        L7:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r2.getPrevNode()
            int r4 = r4.tryCondAddNext(r3, r2, r0)
            r1 = 1
            if (r4 == r1) goto L18
            r1 = 2
            if (r4 == r1) goto L16
            goto L7
        L16:
            r3 = 0
            return r3
        L18:
            return r1
    }

    public final boolean addLastIfPrev(kotlinx.coroutines.internal.LockFreeLinkedListNode r3, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.internal.LockFreeLinkedListNode, java.lang.Boolean> r4) {
            r2 = this;
        L0:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r2.getPrevNode()
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L12
            r3 = 0
            return r3
        L12:
            boolean r0 = r0.addNext(r3, r2)
            if (r0 == 0) goto L0
            r3 = 1
            return r3
    }

    public final boolean addLastIfPrevAndIf(kotlinx.coroutines.internal.LockFreeLinkedListNode r4, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.internal.LockFreeLinkedListNode, java.lang.Boolean> r5, kotlin.jvm.functions.Function0<java.lang.Boolean> r6) {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1 r0 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1
            r0.<init>(r4, r6)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r0
        L7:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = r3.getPrevNode()
            java.lang.Object r1 = r5.invoke(r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 != 0) goto L19
            return r2
        L19:
            int r6 = r6.tryCondAddNext(r4, r3, r0)
            r1 = 1
            if (r6 == r1) goto L25
            r1 = 2
            if (r6 == r1) goto L24
            goto L7
        L24:
            return r2
        L25:
            return r1
    }

    public final boolean addNext(kotlinx.coroutines.internal.LockFreeLinkedListNode r2, kotlinx.coroutines.internal.LockFreeLinkedListNode r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            r0.lazySet(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            r0.lazySet(r2, r3)
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r3, r2)
            if (r0 != 0) goto L12
            r2 = 0
            return r2
        L12:
            r2.finishAdd(r3)
            r2 = 1
            return r2
    }

    public final boolean addOneIfEmpty(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            r0.lazySet(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            r0.lazySet(r2, r1)
        La:
            java.lang.Object r0 = r1.getNext()
            if (r0 == r1) goto L12
            r2 = 0
            return r2
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r1, r2)
            if (r0 == 0) goto La
            r2.finishAdd(r1)
            r2 = 1
            return r2
    }

    public final <T extends kotlinx.coroutines.internal.LockFreeLinkedListNode> kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<T> describeAddLast(T r2) {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc r0 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc
            r0.<init>(r1, r2)
            return r0
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<kotlinx.coroutines.internal.LockFreeLinkedListNode> describeRemoveFirst() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode$RemoveFirstDesc r0 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$RemoveFirstDesc
            r0.<init>(r1)
            return r0
    }

    public final java.lang.Object getNext() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._next
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 != 0) goto L7
            return r0
        L7:
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r2)
            goto L0
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getNextNode() {
            r1 = this;
            java.lang.Object r0 = r1.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = kotlinx.coroutines.internal.LockFreeLinkedListKt.unwrap(r0)
            return r0
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getPrevNode() {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.correctPrev(r0)
            if (r0 != 0) goto Lf
            java.lang.Object r0 = r1._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.findPrevNonRemoved(r0)
        Lf:
            return r0
    }

    public final void helpRemove() {
            r1 = this;
            java.lang.Object r0 = r1.getNext()
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.ref
            r0.helpRemovePrev()
            return
    }

    public final void helpRemovePrev() {
            r3 = this;
            r0 = r3
        L1:
            java.lang.Object r1 = r0.getNext()
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.Removed
            if (r2 == 0) goto Le
            kotlinx.coroutines.internal.Removed r1 = (kotlinx.coroutines.internal.Removed) r1
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.ref
            goto L1
        Le:
            r1 = 0
            r0.correctPrev(r1)
            return
    }

    public boolean isRemoved() {
            r1 = this;
            java.lang.Object r0 = r1.getNext()
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.Removed
            return r0
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp makeCondAddOp(kotlinx.coroutines.internal.LockFreeLinkedListNode r2, kotlin.jvm.functions.Function0<java.lang.Boolean> r3) {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1 r0 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1
            r0.<init>(r2, r3)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r0
            return r0
    }

    protected kotlinx.coroutines.internal.LockFreeLinkedListNode nextIfRemoved() {
            r3 = this;
            java.lang.Object r0 = r3.getNext()
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.Removed
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L11
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r0.ref
        L11:
            return r2
    }

    /* JADX INFO: renamed from: remove */
    public boolean mo2317remove() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.removeOrNext()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final /* synthetic */ <T> T removeFirstIfIsInstanceOfOrPeekIf(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            if (r0 != r4) goto La
            return r1
        La:
            r2 = 3
            java.lang.String r3 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r2, r3)
            boolean r2 = r0 instanceof java.lang.Object
            if (r2 != 0) goto L15
            return r1
        L15:
            java.lang.Object r1 = r5.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L28
            boolean r1 = r0.isRemoved()
            if (r1 != 0) goto L28
            return r0
        L28:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r0.removeOrNext()
            if (r1 != 0) goto L2f
            return r0
        L2f:
            r1.helpRemovePrev()
            goto L0
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode removeFirstOrNull() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            if (r0 != r2) goto La
            r0 = 0
            return r0
        La:
            boolean r1 = r0.mo2317remove()
            if (r1 == 0) goto L11
            return r0
        L11:
            r0.helpRemove()
            goto L0
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode removeOrNext() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.getNext()
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.Removed
            if (r1 == 0) goto Ld
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.ref
            return r0
        Ld:
            if (r0 != r4) goto L12
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            return r0
        L12:
            r1 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            kotlinx.coroutines.internal.Removed r2 = r1.removed()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r4, r0, r2)
            if (r0 == 0) goto L0
            r0 = 0
            r1.correctPrev(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1 r1 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int tryCondAddNext(kotlinx.coroutines.internal.LockFreeLinkedListNode r2, kotlinx.coroutines.internal.LockFreeLinkedListNode r3, kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            r0.lazySet(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            r0.lazySet(r2, r3)
            r4.oldNext = r3
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r3, r4)
            if (r2 != 0) goto L14
            r2 = 0
            return r2
        L14:
            java.lang.Object r2 = r4.perform(r1)
            if (r2 != 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 2
        L1d:
            return r2
    }

    public final void validateNode$kotlinx_coroutines_core(kotlinx.coroutines.internal.LockFreeLinkedListNode r2, kotlinx.coroutines.internal.LockFreeLinkedListNode r3) {
            r1 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r1._prev
            if (r2 != r0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L11:
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1._next
            if (r3 != r2) goto L1c
            goto L22
        L1c:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L22:
            return
    }
}
