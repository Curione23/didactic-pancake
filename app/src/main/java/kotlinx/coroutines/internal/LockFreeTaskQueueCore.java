package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\b\u0000\u0018\u0000 /*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002/0B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0013J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#J3\u0010&\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0011\u0010)\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u0014\u0010*\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "element", "addLast", "(Ljava/lang/Object;)I", "", "state", "Lkotlinx/coroutines/internal/Core;", "allocateNextCopy", "(J)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "allocateOrGetNextCopy", "close", "()Z", "index", "fillPlaceholder", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "markFrozen", "()J", "next", "()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "removeFirstOrNull", "()Ljava/lang/Object;", "oldHead", "newHead", "removeSlowPath", "(II)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "I", "isEmpty", "mask", "Z", "getSize", "()I", "size", "Companion", "Placeholder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LockFreeTaskQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion Companion = null;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final kotlinx.coroutines.internal.Symbol REMOVE_FROZEN = null;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater _state$FU = null;
    private volatile /* synthetic */ java.lang.Object _next;
    private volatile /* synthetic */ long _state;
    private /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u00020\u0004*\u00020\tJ\u0012\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004JP\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c*\u00020\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0086\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", "other", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final int addFailReason(long r3) {
                r2 = this;
                r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
                long r3 = r3 & r0
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 == 0) goto Lb
                r3 = 2
                goto Lc
            Lb:
                r3 = 1
            Lc:
                return r3
        }

        public final long updateHead(long r3, int r5) {
                r2 = this;
                r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
                long r3 = r2.wo(r3, r0)
                long r0 = (long) r5
                long r3 = r3 | r0
                return r3
        }

        public final long updateTail(long r3, int r5) {
                r2 = this;
                r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
                long r3 = r2.wo(r3, r0)
                long r0 = (long) r5
                r5 = 30
                long r0 = r0 << r5
                long r3 = r3 | r0
                return r3
        }

        public final <T> T withState(long r4, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r6) {
                r3 = this;
                r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
                long r0 = r0 & r4
                int r0 = (int) r0
                r1 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
                long r4 = r4 & r1
                r1 = 30
                long r4 = r4 >> r1
                int r4 = (int) r4
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object r4 = r6.invoke(r5, r4)
                return r4
        }

        public final long wo(long r1, long r3) {
                r0 = this;
                long r3 = ~r3
                long r1 = r1 & r3
                return r1
        }
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", "index", "", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Placeholder {
        public final int index;

        public Placeholder(int r1) {
                r0 = this;
                r0.<init>()
                r0.index = r1
                return
        }
    }

    static {
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "REMOVE_FROZEN"
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_next"
            java.lang.Class<kotlinx.coroutines.internal.LockFreeTaskQueueCore> r2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore._next$FU = r0
            java.lang.String r0 = "_state"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU = r0
            return
    }

    public LockFreeTaskQueueCore(int r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r2.capacity = r3
            r2.singleConsumer = r4
            int r4 = r3 + (-1)
            r2.mask = r4
            r0 = 0
            r2._next = r0
            r0 = 0
            r2._state = r0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r3)
            r2.array = r0
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            java.lang.String r1 = "Check failed."
            if (r4 > r0) goto L2e
            r3 = r3 & r4
            if (r3 != 0) goto L24
            return
        L24:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
        L2e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> allocateNextCopy(long r7) {
            r6 = this;
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            int r1 = r6.capacity
            int r1 = r1 * 2
            boolean r2 = r6.singleConsumer
            r0.<init>(r1, r2)
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r7
            int r1 = (int) r1
            r2 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r2 = r2 & r7
            r4 = 30
            long r2 = r2 >> r4
            int r2 = (int) r2
        L1a:
            int r3 = r6.mask
            r4 = r1 & r3
            r5 = r2 & r3
            if (r4 == r5) goto L3b
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r6.array
            r3 = r3 & r1
            java.lang.Object r3 = r4.get(r3)
            if (r3 != 0) goto L30
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder r3 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder
            r3.<init>(r1)
        L30:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r0.array
            int r5 = r0.mask
            r5 = r5 & r1
            r4.set(r5, r3)
            int r1 = r1 + 1
            goto L1a
        L3b:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r2 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r7 = r1.wo(r7, r2)
            r0._state = r7
            return r0
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._next
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            if (r0 == 0) goto L7
            return r0
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._next$FU
            r1 = 0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = r3.allocateNextCopy(r4)
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r2)
            goto L0
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> fillPlaceholder(int r3, E r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.array
            int r1 = r2.mask
            r1 = r1 & r3
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r1 == 0) goto L1c
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder) r0
            int r0 = r0.index
            if (r0 != r3) goto L1c
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.array
            int r1 = r2.mask
            r3 = r3 & r1
            r0.set(r3, r4)
            return r2
        L1c:
            r3 = 0
            return r3
    }

    private final long markFrozen() {
            r8 = this;
        L0:
            long r2 = r8._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto Ld
            return r2
        Ld:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            r1 = r8
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            return r6
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> removeSlowPath(int r10, int r11) {
            r9 = this;
        L0:
            long r2 = r9._state
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r6 = (int) r4
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L18
            if (r6 != r10) goto L12
            goto L18
        L12:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L18:
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r4 & r2
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L26
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r10 = r9.next()
            return r10
        L26:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            long r4 = r0.updateHead(r2, r11)
            r0 = r1
            r1 = r9
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.array
            int r11 = r9.mask
            r11 = r11 & r6
            r0 = 0
            r10.set(r11, r0)
            return r0
    }

    public final int addLast(E r13) {
            r12 = this;
        L0:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L12
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r13 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            int r13 = r13.addFailReason(r2)
            return r13
        L12:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r8 = 30
            long r4 = r4 >> r8
            int r8 = (int) r4
            int r9 = r12.mask
            int r4 = r8 + 2
            r4 = r4 & r9
            r5 = r1 & r9
            r10 = 1
            if (r4 != r5) goto L2e
            return r10
        L2e:
            boolean r4 = r12.singleConsumer
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r12.array
            r11 = r8 & r9
            java.lang.Object r4 = r4.get(r11)
            if (r4 == 0) goto L4d
            int r0 = r12.capacity
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4c
            int r8 = r8 - r1
            r1 = r8 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4c:
            return r10
        L4d:
            int r1 = r8 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            long r10 = r0.updateTail(r2, r1)
            r0 = r4
            r1 = r12
            r4 = r10
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.array
            r1 = r8 & r9
            r0.set(r1, r13)
            r0 = r12
        L67:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L7a
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.next()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.fillPlaceholder(r8, r13)
            if (r0 != 0) goto L67
        L7a:
            r13 = 0
            return r13
    }

    public final boolean close() {
            r9 = this;
        L0:
            long r2 = r9._state
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r8 = 1
            if (r4 == 0) goto Le
            return r8
        Le:
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r4 & r2
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L17
            r0 = 0
            return r0
        L17:
            long r4 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            r1 = r9
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 != 0) goto L23
            goto L0
        L23:
            return r8
    }

    public final int getSize() {
            r5 = this;
            long r0 = r5._state
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            int r2 = (int) r2
            r3 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r3
            r3 = 30
            long r0 = r0 >> r3
            int r0 = (int) r0
            int r0 = r0 - r2
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r1
            return r0
    }

    public final boolean isClosed() {
            r4 = this;
            long r0 = r4._state
            r2 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public final boolean isEmpty() {
            r5 = this;
            long r0 = r5._state
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            int r2 = (int) r2
            r3 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r3
            r3 = 30
            long r0 = r0 >> r3
            int r0 = (int) r0
            if (r2 != r0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public final <R> java.util.List<R> map(kotlin.jvm.functions.Function1<? super E, ? extends R> r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.capacity
            r0.<init>(r1)
            long r1 = r6._state
            r3 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r3 = r3 & r1
            int r3 = (int) r3
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r4
            r4 = 30
            long r1 = r1 >> r4
            int r1 = (int) r1
        L18:
            int r2 = r6.mask
            r4 = r3 & r2
            r5 = r1 & r2
            if (r4 == r5) goto L37
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r6.array
            r2 = r2 & r3
            java.lang.Object r2 = r4.get(r2)
            if (r2 == 0) goto L34
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r4 != 0) goto L34
            java.lang.Object r2 = r7.invoke(r2)
            r0.add(r2)
        L34:
            int r3 = r3 + 1
            goto L18
        L37:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> next() {
            r2 = this;
            long r0 = r2.markFrozen()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r2.allocateOrGetNextCopy(r0)
            return r0
    }

    public final java.lang.Object removeFirstOrNull() {
            r10 = this;
        L0:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r0 & r2
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto Le
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            return r0
        Le:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r6 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r1 = (int) r4
            int r4 = r10.mask
            r1 = r1 & r4
            r5 = r6 & r4
            r7 = 0
            if (r1 != r5) goto L28
            return r7
        L28:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r10.array
            r4 = r4 & r6
            java.lang.Object r8 = r1.get(r4)
            if (r8 != 0) goto L36
            boolean r0 = r10.singleConsumer
            if (r0 == 0) goto L0
            return r7
        L36:
            boolean r1 = r8 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r1 == 0) goto L3b
            return r7
        L3b:
            int r1 = r6 + 1
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            r9 = r1 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            long r4 = r0.updateHead(r2, r9)
            r0 = r1
            r1 = r10
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L59
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r10.array
            int r1 = r10.mask
            r1 = r1 & r6
            r0.set(r1, r7)
            return r8
        L59:
            boolean r0 = r10.singleConsumer
            if (r0 == 0) goto L0
            r0 = r10
        L5e:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.removeSlowPath(r6, r9)
            if (r0 != 0) goto L5e
            return r8
    }
}
