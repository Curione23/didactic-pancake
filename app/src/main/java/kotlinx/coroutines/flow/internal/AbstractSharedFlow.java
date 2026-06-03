package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00060\u0003j\u0002`\u0004B\u0005¢\u0006\u0002\u0010\u0005J\r\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0019J\r\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0019J\u001d\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000e2\u0006\u0010\u001c\u001a\u00020\tH$¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0!H\u0084\bJ\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010$R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R:\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e@BX\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "S", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_subscriptionCount", "Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "<set-?>", "", "nCollectors", "getNCollectors", "()I", "nextIndex", "", "slots", "getSlots$annotations", "getSlots", "()[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "allocateSlot", "()Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "forEachSlotLocked", "", "block", "Lkotlin/Function1;", "freeSlot", "slot", "(Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AbstractSharedFlow<S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>> {
    private kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow _subscriptionCount;
    private int nCollectors;
    private int nextIndex;
    private S[] slots;

    public AbstractSharedFlow() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ int access$getNCollectors(kotlinx.coroutines.flow.internal.AbstractSharedFlow r0) {
            int r0 = r0.nCollectors
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] access$getSlots(kotlinx.coroutines.flow.internal.AbstractSharedFlow r0) {
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r0.slots
            return r0
    }

    protected static /* synthetic */ void getSlots$annotations() {
            return
    }

    protected final S allocateSlot() {
            r4 = this;
            monitor-enter(r4)
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r4.slots     // Catch: java.lang.Throwable -> L4d
            r1 = 2
            if (r0 != 0) goto Ld
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = r4.createSlotArray(r1)     // Catch: java.lang.Throwable -> L4d
            r4.slots = r0     // Catch: java.lang.Throwable -> L4d
            goto L24
        Ld:
            int r2 = r4.nCollectors     // Catch: java.lang.Throwable -> L4d
            int r3 = r0.length     // Catch: java.lang.Throwable -> L4d
            if (r2 < r3) goto L24
            int r2 = r0.length     // Catch: java.lang.Throwable -> L4d
            int r2 = r2 * r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L4d
            r1 = r0
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r1     // Catch: java.lang.Throwable -> L4d
            r4.slots = r1     // Catch: java.lang.Throwable -> L4d
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r0     // Catch: java.lang.Throwable -> L4d
        L24:
            int r1 = r4.nextIndex     // Catch: java.lang.Throwable -> L4d
        L26:
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L4d
            if (r2 != 0) goto L30
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r2 = r4.createSlot()     // Catch: java.lang.Throwable -> L4d
            r0[r1] = r2     // Catch: java.lang.Throwable -> L4d
        L30:
            int r1 = r1 + 1
            int r3 = r0.length     // Catch: java.lang.Throwable -> L4d
            if (r1 < r3) goto L36
            r1 = 0
        L36:
            boolean r3 = r2.allocateLocked(r4)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L26
            r4.nextIndex = r1     // Catch: java.lang.Throwable -> L4d
            int r0 = r4.nCollectors     // Catch: java.lang.Throwable -> L4d
            r1 = 1
            int r0 = r0 + r1
            r4.nCollectors = r0     // Catch: java.lang.Throwable -> L4d
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r0 = r4._subscriptionCount     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r4)
            if (r0 == 0) goto L4c
            r0.increment(r1)
        L4c:
            return r2
        L4d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    protected abstract S createSlot();

    protected abstract S[] createSlotArray(int r1);

    protected final void forEachSlotLocked(kotlin.jvm.functions.Function1<? super S, kotlin.Unit> r5) {
            r4 = this;
            int r0 = access$getNCollectors(r4)
            if (r0 != 0) goto L7
            return
        L7:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = access$getSlots(r4)
            if (r0 == 0) goto L1b
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1b
            r3 = r0[r2]
            if (r3 == 0) goto L18
            r5.invoke(r3)
        L18:
            int r2 = r2 + 1
            goto Lf
        L1b:
            return
    }

    protected final void freeSlot(S r7) {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.nCollectors     // Catch: java.lang.Throwable -> L2e
            r1 = -1
            int r0 = r0 + r1
            r6.nCollectors = r0     // Catch: java.lang.Throwable -> L2e
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r2 = r6._subscriptionCount     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            if (r0 != 0) goto Le
            r6.nextIndex = r3     // Catch: java.lang.Throwable -> L2e
        Le:
            kotlin.coroutines.Continuation[] r7 = r7.freeLocked(r6)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r6)
            int r0 = r7.length
        L14:
            if (r3 >= r0) goto L28
            r4 = r7[r3]
            if (r4 == 0) goto L25
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.Object r5 = kotlin.Result.m767constructorimpl(r5)
            r4.resumeWith(r5)
        L25:
            int r3 = r3 + 1
            goto L14
        L28:
            if (r2 == 0) goto L2d
            r2.increment(r1)
        L2d:
            return
        L2e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    protected final int getNCollectors() {
            r1 = this;
            int r0 = r1.nCollectors
            return r0
    }

    protected final S[] getSlots() {
            r1 = this;
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r1.slots
            return r0
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getSubscriptionCount() {
            r2 = this;
            monitor-enter(r2)
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r0 = r2._subscriptionCount     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Le
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r0 = new kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow     // Catch: java.lang.Throwable -> L12
            int r1 = r2.nCollectors     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
            r2._subscriptionCount = r0     // Catch: java.lang.Throwable -> L12
        Le:
            monitor-exit(r2)
            kotlinx.coroutines.flow.StateFlow r0 = (kotlinx.coroutines.flow.StateFlow) r0
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
