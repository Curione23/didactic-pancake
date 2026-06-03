package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00112\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 :\u0006$%&'()B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJT\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\"\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "", "locked", "<init>", "(Z)V", "", "owner", "holdsLock", "(Ljava/lang/Object;)Z", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectClause2", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "isLocked", "()Z", "isLockedEmptyQueueState$kotlinx_coroutines_core", "isLockedEmptyQueueState", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLock", "LockCont", "LockSelect", "LockWaiter", "LockedQueue", "TryLockDesc", "UnlockOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MutexImpl implements kotlinx.coroutines.sync.Mutex, kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> {
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    volatile /* synthetic */ java.lang.Object _state;

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockCont;", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeLockWaiter", "toString", "", "tryResumeLockWaiter", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class LockCont extends kotlinx.coroutines.sync.MutexImpl.LockWaiter {
        private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;
        final /* synthetic */ kotlinx.coroutines.sync.MutexImpl this$0;

        public LockCont(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                r0.cont = r3
                return
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public void completeResumeLockWaiter() {
                r2 = this;
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r2.cont
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                r0.completeResume(r1)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "LockCont["
                r0.<init>(r1)
                java.lang.Object r1 = r2.owner
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r1 = r2.cont
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "] for "
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.sync.MutexImpl r1 = r2.this$0
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public boolean tryResumeLockWaiter() {
                r5 = this;
                boolean r0 = r5.take()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r5.cont
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                kotlinx.coroutines.sync.MutexImpl$LockCont$tryResumeLockWaiter$1 r3 = new kotlinx.coroutines.sync.MutexImpl$LockCont$tryResumeLockWaiter$1
                kotlinx.coroutines.sync.MutexImpl r4 = r5.this$0
                r3.<init>(r4, r5)
                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                r4 = 0
                java.lang.Object r0 = r0.tryResume(r2, r4, r3)
                if (r0 == 0) goto L1d
                r1 = 1
            L1d:
                return r1
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BD\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tø\u0001\u0000¢\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R1\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockSelect;", "R", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "completeResumeLockWaiter", "", "toString", "", "tryResumeLockWaiter", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class LockSelect<R> extends kotlinx.coroutines.sync.MutexImpl.LockWaiter {
        public final kotlin.jvm.functions.Function2<kotlinx.coroutines.sync.Mutex, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;
        public final kotlinx.coroutines.selects.SelectInstance<R> select;
        final /* synthetic */ kotlinx.coroutines.sync.MutexImpl this$0;

        public LockSelect(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2, kotlinx.coroutines.selects.SelectInstance<? super R> r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.sync.Mutex, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                r0.select = r3
                r0.block = r4
                return
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public void completeResumeLockWaiter() {
                r5 = this;
                kotlin.jvm.functions.Function2<kotlinx.coroutines.sync.Mutex, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r0 = r5.block
                kotlinx.coroutines.sync.MutexImpl r1 = r5.this$0
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r5.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                kotlinx.coroutines.sync.MutexImpl$LockSelect$completeResumeLockWaiter$1 r3 = new kotlinx.coroutines.sync.MutexImpl$LockSelect$completeResumeLockWaiter$1
                kotlinx.coroutines.sync.MutexImpl r4 = r5.this$0
                r3.<init>(r4, r5)
                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r0, r1, r2, r3)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "LockSelect["
                r0.<init>(r1)
                java.lang.Object r1 = r2.owner
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r2.select
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "] for "
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.sync.MutexImpl r1 = r2.this$0
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public boolean tryResumeLockWaiter() {
                r1 = this;
                boolean r0 = r1.take()
                if (r0 == 0) goto L10
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r1.select
                boolean r0 = r0.trySelect()
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b¢\u0004\u0018\u00002\u00020\u000f2\u00020\u0010B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "", "completeResumeLockWaiter", "()V", "dispose", "", "take", "()Z", "tryResumeLockWaiter", "Ljava/lang/Object;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private abstract class LockWaiter extends kotlinx.coroutines.internal.LockFreeLinkedListNode implements kotlinx.coroutines.DisposableHandle {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater isTaken$FU = null;
        private volatile /* synthetic */ int isTaken;
        public final java.lang.Object owner;
        final /* synthetic */ kotlinx.coroutines.sync.MutexImpl this$0;

        static {
                java.lang.Class<kotlinx.coroutines.sync.MutexImpl$LockWaiter> r0 = kotlinx.coroutines.sync.MutexImpl.LockWaiter.class
                java.lang.String r1 = "isTaken"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.sync.MutexImpl.LockWaiter.isTaken$FU = r0
                return
        }

        public LockWaiter(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.owner = r2
                r1 = 0
                r0.isTaken = r1
                return
        }

        public abstract void completeResumeLockWaiter();

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
                r0 = this;
                r0.mo2317remove()
                return
        }

        public final boolean take() {
                r3 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.LockWaiter.isTaken$FU
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r3, r1, r2)
                return r0
        }

        public abstract boolean tryResumeLockWaiter();
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "owner", "", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class LockedQueue extends kotlinx.coroutines.internal.LockFreeLinkedListHead {
        public volatile java.lang.Object owner;

        public LockedQueue(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.owner = r1
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "LockedQueue["
                r0.<init>(r1)
                java.lang.Object r1 = r2.owner
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "mutex", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "complete", "", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "failure", "prepare", "PrepareOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class TryLockDesc extends kotlinx.coroutines.internal.AtomicDesc {
        public final kotlinx.coroutines.sync.MutexImpl mutex;
        public final java.lang.Object owner;

        /* JADX INFO: compiled from: Mutex.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "(Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;Lkotlinx/coroutines/internal/AtomicOp;)V", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "perform", "", "affected", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        private final class PrepareOp extends kotlinx.coroutines.internal.OpDescriptor {
            private final kotlinx.coroutines.internal.AtomicOp<?> atomicOp;
            final /* synthetic */ kotlinx.coroutines.sync.MutexImpl.TryLockDesc this$0;

            public PrepareOp(kotlinx.coroutines.sync.MutexImpl.TryLockDesc r1, kotlinx.coroutines.internal.AtomicOp<?> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.atomicOp = r2
                    return
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            public kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
                    r1 = this;
                    kotlinx.coroutines.internal.AtomicOp<?> r0 = r1.atomicOp
                    return r0
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            public java.lang.Object perform(java.lang.Object r3) {
                    r2 = this;
                    kotlinx.coroutines.internal.AtomicOp r0 = r2.getAtomicOp()
                    boolean r0 = r0.isDecided()
                    if (r0 == 0) goto Lf
                    kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
                    goto L13
                Lf:
                    kotlinx.coroutines.internal.AtomicOp r0 = r2.getAtomicOp()
                L13:
                    if (r3 == 0) goto L1e
                    kotlinx.coroutines.sync.MutexImpl r3 = (kotlinx.coroutines.sync.MutexImpl) r3
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl._state$FU
                    androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r2, r0)
                    r3 = 0
                    return r3
                L1e:
                    java.lang.NullPointerException r3 = new java.lang.NullPointerException
                    java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl"
                    r3.<init>(r0)
                    throw r3
            }
        }

        public TryLockDesc(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>()
                r0.mutex = r1
                r0.owner = r2
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public void complete(kotlinx.coroutines.internal.AtomicOp<?> r3, java.lang.Object r4) {
                r2 = this;
                if (r4 == 0) goto L7
                kotlinx.coroutines.sync.Empty r4 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
                goto L17
            L7:
                java.lang.Object r4 = r2.owner
                if (r4 != 0) goto L10
                kotlinx.coroutines.sync.Empty r4 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
                goto L17
            L10:
                kotlinx.coroutines.sync.Empty r4 = new kotlinx.coroutines.sync.Empty
                java.lang.Object r0 = r2.owner
                r4.<init>(r0)
            L17:
                kotlinx.coroutines.sync.MutexImpl r0 = r2.mutex
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl._state$FU
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r0, r3, r4)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public java.lang.Object prepare(kotlinx.coroutines.internal.AtomicOp<?> r4) {
                r3 = this;
                kotlinx.coroutines.sync.MutexImpl$TryLockDesc$PrepareOp r0 = new kotlinx.coroutines.sync.MutexImpl$TryLockDesc$PrepareOp
                r0.<init>(r3, r4)
                kotlinx.coroutines.sync.MutexImpl r4 = r3.mutex
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl._state$FU
                kotlinx.coroutines.sync.Empty r2 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
                boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r4, r2, r0)
                if (r4 != 0) goto L18
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.sync.MutexKt.access$getLOCK_FAIL$p()
                return r4
            L18:
                kotlinx.coroutines.sync.MutexImpl r4 = r3.mutex
                java.lang.Object r4 = r0.perform(r4)
                return r4
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$UnlockOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/sync/MutexImpl;", "queue", "Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "(Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;)V", "complete", "", "affected", "failure", "", "prepare", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class UnlockOp extends kotlinx.coroutines.internal.AtomicOp<kotlinx.coroutines.sync.MutexImpl> {
        public final kotlinx.coroutines.sync.MutexImpl.LockedQueue queue;

        public UnlockOp(kotlinx.coroutines.sync.MutexImpl.LockedQueue r1) {
                r0 = this;
                r0.<init>()
                r0.queue = r1
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ void complete(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.sync.MutexImpl r1 = (kotlinx.coroutines.sync.MutexImpl) r1
                r0.complete2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: complete, reason: avoid collision after fix types in other method */
        public void complete2(kotlinx.coroutines.sync.MutexImpl r2, java.lang.Object r3) {
                r1 = this;
                if (r3 != 0) goto L7
                kotlinx.coroutines.sync.Empty r3 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
                goto L9
            L7:
                kotlinx.coroutines.sync.MutexImpl$LockedQueue r3 = r1.queue
            L9:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl._state$FU
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r1, r3)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ java.lang.Object prepare(kotlinx.coroutines.sync.MutexImpl r1) {
                r0 = this;
                kotlinx.coroutines.sync.MutexImpl r1 = (kotlinx.coroutines.sync.MutexImpl) r1
                java.lang.Object r1 = r0.prepare2(r1)
                return r1
        }

        /* JADX INFO: renamed from: prepare, reason: avoid collision after fix types in other method */
        public java.lang.Object prepare2(kotlinx.coroutines.sync.MutexImpl r1) {
                r0 = this;
                kotlinx.coroutines.sync.MutexImpl$LockedQueue r1 = r0.queue
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto La
                r1 = 0
                goto Le
            La:
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCK_FAIL$p()
            Le:
                return r1
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.sync.MutexImpl> r2 = kotlinx.coroutines.sync.MutexImpl.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.sync.MutexImpl._state$FU = r0
            return
    }

    public MutexImpl(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            kotlinx.coroutines.sync.Empty r1 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
            goto Le
        La:
            kotlinx.coroutines.sync.Empty r1 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
        Le:
            r0._state = r1
            return
    }

    public static final /* synthetic */ java.lang.Object access$lockSuspend(kotlinx.coroutines.sync.MutexImpl r0, java.lang.Object r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.lockSuspend(r1, r2)
            return r0
    }

    private final java.lang.Object lockSuspend(java.lang.Object r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            r7 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r9)
            kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            kotlinx.coroutines.sync.MutexImpl$LockCont r2 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r2.<init>(r7, r8, r1)
        L10:
            java.lang.Object r3 = r7._state
            boolean r4 = r3 instanceof kotlinx.coroutines.sync.Empty
            if (r4 == 0) goto L4f
            r4 = r3
            kotlinx.coroutines.sync.Empty r4 = (kotlinx.coroutines.sync.Empty) r4
            java.lang.Object r5 = r4.locked
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r5 == r6) goto L2e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.sync.MutexImpl._state$FU
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r6 = new kotlinx.coroutines.sync.MutexImpl$LockedQueue
            java.lang.Object r4 = r4.locked
            r6.<init>(r4)
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r7, r3, r6)
            goto L10
        L2e:
            if (r8 != 0) goto L35
            kotlinx.coroutines.sync.Empty r4 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
            goto L3a
        L35:
            kotlinx.coroutines.sync.Empty r4 = new kotlinx.coroutines.sync.Empty
            r4.<init>(r8)
        L3a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.sync.MutexImpl._state$FU
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r7, r3, r4)
            if (r3 == 0) goto L10
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1 r3 = new kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1
            r3.<init>(r7, r8)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r1.resume(r2, r3)
            goto L74
        L4f:
            boolean r4 = r3 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r4 == 0) goto La4
            r4 = r3
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r4 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r4
            java.lang.Object r5 = r4.owner
            if (r5 == r8) goto L8b
            r5 = r2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r5
            r4.addLast(r5)
            java.lang.Object r4 = r7._state
            if (r4 == r3) goto L71
            boolean r2 = r2.take()
            if (r2 != 0) goto L6b
            goto L71
        L6b:
            kotlinx.coroutines.sync.MutexImpl$LockCont r2 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r2.<init>(r7, r8, r1)
            goto L10
        L71:
            kotlinx.coroutines.CancellableContinuationKt.removeOnCancellation(r1, r5)
        L74:
            java.lang.Object r8 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r0) goto L81
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r9)
        L81:
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L88
            return r8
        L88:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L8b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Already locked by "
            r9.<init>(r0)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        La4:
            boolean r4 = r3 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r4 == 0) goto Laf
            kotlinx.coroutines.internal.OpDescriptor r3 = (kotlinx.coroutines.internal.OpDescriptor) r3
            r3.perform(r7)
            goto L10
        Laf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal state "
            r9.<init>(r0)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> getOnLock() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectClause2 r0 = (kotlinx.coroutines.selects.SelectClause2) r0
            return r0
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lf
            kotlinx.coroutines.sync.Empty r0 = (kotlinx.coroutines.sync.Empty) r0
            java.lang.Object r0 = r0.locked
            if (r0 != r5) goto L1a
            goto L1b
        Lf:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L1a
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r0 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r0
            java.lang.Object r0 = r0.owner
            if (r0 != r5) goto L1a
            goto L1b
        L1a:
            r2 = r3
        L1b:
            return r2
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            r2 = 1
            if (r1 == 0) goto L14
            kotlinx.coroutines.sync.Empty r0 = (kotlinx.coroutines.sync.Empty) r0
            java.lang.Object r0 = r0.locked
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r0 == r1) goto L12
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
        L14:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L19
            return r2
        L19:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L23
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r4)
            goto L0
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Illegal state "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final boolean isLockedEmptyQueueState$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.Object r0 = r2._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L10
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r0 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public java.lang.Object lock(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            boolean r0 = r1.tryLock(r2)
            if (r0 == 0) goto L9
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L9:
            java.lang.Object r2 = r1.lockSuspend(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L14
            return r2
        L14:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    @Override // kotlinx.coroutines.selects.SelectClause2
    public <R> void registerSelectClause2(kotlinx.coroutines.selects.SelectInstance<? super R> r5, java.lang.Object r6, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.sync.Mutex, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r7) {
            r4 = this;
        L0:
            boolean r0 = r5.isSelected()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            if (r1 == 0) goto L65
            r1 = r0
            kotlinx.coroutines.sync.Empty r1 = (kotlinx.coroutines.sync.Empty) r1
            java.lang.Object r2 = r1.locked
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r2 == r3) goto L25
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.MutexImpl._state$FU
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r3 = new kotlinx.coroutines.sync.MutexImpl$LockedQueue
            java.lang.Object r1 = r1.locked
            r3.<init>(r1)
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r0, r3)
            goto L0
        L25:
            kotlinx.coroutines.sync.MutexImpl$TryLockDesc r0 = new kotlinx.coroutines.sync.MutexImpl$TryLockDesc
            r0.<init>(r4, r6)
            kotlinx.coroutines.internal.AtomicDesc r0 = (kotlinx.coroutines.internal.AtomicDesc) r0
            java.lang.Object r0 = r5.performAtomicTrySelect(r0)
            if (r0 != 0) goto L3a
            kotlin.coroutines.Continuation r5 = r5.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r7, r4, r5)
            return
        L3a:
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r0 != r1) goto L41
            return
        L41:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.access$getLOCK_FAIL$p()
            if (r0 == r1) goto L0
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r0 != r1) goto L4c
            goto L0
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "performAtomicTrySelect(TryLockDesc) returned "
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L65:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto La4
            r1 = r0
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r1 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r1
            java.lang.Object r2 = r1.owner
            if (r2 == r6) goto L8b
            kotlinx.coroutines.sync.MutexImpl$LockSelect r2 = new kotlinx.coroutines.sync.MutexImpl$LockSelect
            r2.<init>(r4, r6, r5, r7)
            r3 = r2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r1.addLast(r3)
            java.lang.Object r1 = r4._state
            if (r1 == r0) goto L85
            boolean r0 = r2.take()
            if (r0 != 0) goto L0
        L85:
            kotlinx.coroutines.DisposableHandle r2 = (kotlinx.coroutines.DisposableHandle) r2
            r5.disposeOnSelect(r2)
            return
        L8b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Already locked by "
            r5.<init>(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        La4:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto Laf
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r4)
            goto L0
        Laf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Illegal state "
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public java.lang.String toString() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            r2 = 93
            java.lang.String r3 = "Mutex["
            if (r1 == 0) goto L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            kotlinx.coroutines.sync.Empty r0 = (kotlinx.coroutines.sync.Empty) r0
            java.lang.Object r0 = r0.locked
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L20:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L2a
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r4)
            goto L0
        L2a:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r0 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r0
            java.lang.Object r0 = r0.owner
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Illegal state "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(java.lang.Object r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            r2 = 0
            if (r1 == 0) goto L29
            r1 = r0
            kotlinx.coroutines.sync.Empty r1 = (kotlinx.coroutines.sync.Empty) r1
            java.lang.Object r1 = r1.locked
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r1 == r3) goto L13
            return r2
        L13:
            if (r5 != 0) goto L1a
            kotlinx.coroutines.sync.Empty r1 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
            goto L1f
        L1a:
            kotlinx.coroutines.sync.Empty r1 = new kotlinx.coroutines.sync.Empty
            r1.<init>(r5)
        L1f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.MutexImpl._state$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r0, r1)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
        L29:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L4d
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r0 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r0
            java.lang.Object r0 = r0.owner
            if (r0 == r5) goto L34
            return r2
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Already locked by "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L4d:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L57
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r4)
            goto L0
        L57:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal state "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(java.lang.Object r6) {
            r5 = this;
        L0:
            java.lang.Object r0 = r5._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            java.lang.String r2 = " but expected "
            java.lang.String r3 = "Mutex is locked by "
            if (r1 == 0) goto L59
            if (r6 != 0) goto L24
            r1 = r0
            kotlinx.coroutines.sync.Empty r1 = (kotlinx.coroutines.sync.Empty) r1
            java.lang.Object r1 = r1.locked
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r1 == r2) goto L18
            goto L2b
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Mutex is not locked"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L24:
            r1 = r0
            kotlinx.coroutines.sync.Empty r1 = (kotlinx.coroutines.sync.Empty) r1
            java.lang.Object r4 = r1.locked
            if (r4 != r6) goto L38
        L2b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl._state$FU
            kotlinx.coroutines.sync.Empty r2 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r5, r0, r2)
            if (r0 == 0) goto L0
            return
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.Object r1 = r1.locked
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L59:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L63
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r5)
            goto L0
        L63:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto Lc5
            if (r6 == 0) goto L92
            r1 = r0
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r1 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r1
            java.lang.Object r4 = r1.owner
            if (r4 != r6) goto L71
            goto L92
        L71:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.Object r1 = r1.owner
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L92:
            r1 = r0
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r1 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r1
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r1.removeFirstOrNull()
            if (r2 != 0) goto Laf
            kotlinx.coroutines.sync.MutexImpl$UnlockOp r2 = new kotlinx.coroutines.sync.MutexImpl$UnlockOp
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl._state$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r5, r0, r2)
            if (r0 == 0) goto L0
            java.lang.Object r0 = r2.perform(r5)
            if (r0 != 0) goto L0
            return
        Laf:
            kotlinx.coroutines.sync.MutexImpl$LockWaiter r2 = (kotlinx.coroutines.sync.MutexImpl.LockWaiter) r2
            boolean r0 = r2.tryResumeLockWaiter()
            if (r0 == 0) goto L0
            java.lang.Object r6 = r2.owner
            if (r6 != 0) goto Lbf
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.sync.MutexKt.access$getLOCKED$p()
        Lbf:
            r1.owner = r6
            r2.completeResumeLockWaiter()
            return
        Lc5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal state "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }
}
