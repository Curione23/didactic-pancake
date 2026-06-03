package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001hB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020,H\u0002J\u001f\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u0003H\u0014J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010<\u001a\u00020\bH\u0014¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020,H\u0002J\u0019\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0019\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0012\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0002J1\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0014\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000eH\u0002¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020\u0012H\u0002J7\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0010\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020,H\u0016J\u0015\u0010V\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Z\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0010\u0010[\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0003H\u0002J(\u0010]\u001a\u00020,2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u0012H\u0002J%\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0006\u0010c\u001a\u00020\u0012H\u0000¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u0012H\u0000¢\u0006\u0002\bgR\u001a\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006i"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferEndIndex", "", "getBufferEndIndex", "()J", "bufferSize", "head", "getHead", "lastReplayedLocked", "getLastReplayedLocked$annotations", "()V", "getLastReplayedLocked", "()Ljava/lang/Object;", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "awaitValue", "", "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", "item", "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", "index", "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", "", "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class SharedFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.SharedFlowSlot> implements kotlinx.coroutines.flow.MutableSharedFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    private java.lang.Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "index", "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Emitter implements kotlinx.coroutines.DisposableHandle {
        public final kotlin.coroutines.Continuation<kotlin.Unit> cont;
        public final kotlinx.coroutines.flow.SharedFlowImpl<?> flow;
        public long index;
        public final java.lang.Object value;

        public Emitter(kotlinx.coroutines.flow.SharedFlowImpl<?> r1, long r2, java.lang.Object r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r0 = this;
                r0.<init>()
                r0.flow = r1
                r0.index = r2
                r0.value = r4
                r0.cont = r5
                return
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
                r1 = this;
                kotlinx.coroutines.flow.SharedFlowImpl<?> r0 = r1.flow
                kotlinx.coroutines.flow.SharedFlowImpl.access$cancelEmitter(r0, r1)
                return
        }
    }

    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {373, 380, 383}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.SharedFlowImpl<T> this$0;

        AnonymousClass1(kotlinx.coroutines.flow.SharedFlowImpl<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1> r2) {
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
                kotlinx.coroutines.flow.SharedFlowImpl<T> r3 = r2.this$0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r3 = kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(r3, r0, r1)
                return r3
        }
    }

    public SharedFlowImpl(int r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            r0.<init>()
            r0.replay = r1
            r0.bufferCapacity = r2
            r0.onBufferOverflow = r3
            return
    }

    public static final /* synthetic */ java.lang.Object access$awaitValue(kotlinx.coroutines.flow.SharedFlowImpl r0, kotlinx.coroutines.flow.SharedFlowSlot r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.awaitValue(r1, r2)
            return r0
    }

    public static final /* synthetic */ void access$cancelEmitter(kotlinx.coroutines.flow.SharedFlowImpl r0, kotlinx.coroutines.flow.SharedFlowImpl.Emitter r1) {
            r0.cancelEmitter(r1)
            return
    }

    public static final /* synthetic */ java.lang.Object access$emitSuspend(kotlinx.coroutines.flow.SharedFlowImpl r0, java.lang.Object r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.emitSuspend(r1, r2)
            return r0
    }

    public static final /* synthetic */ void access$enqueueLocked(kotlinx.coroutines.flow.SharedFlowImpl r0, java.lang.Object r1) {
            r0.enqueueLocked(r1)
            return
    }

    public static final /* synthetic */ kotlin.coroutines.Continuation[] access$findSlotsToResumeLocked(kotlinx.coroutines.flow.SharedFlowImpl r0, kotlin.coroutines.Continuation[] r1) {
            kotlin.coroutines.Continuation[] r0 = r0.findSlotsToResumeLocked(r1)
            return r0
    }

    public static final /* synthetic */ int access$getBufferCapacity$p(kotlinx.coroutines.flow.SharedFlowImpl r0) {
            int r0 = r0.bufferCapacity
            return r0
    }

    public static final /* synthetic */ long access$getHead(kotlinx.coroutines.flow.SharedFlowImpl r2) {
            long r0 = r2.getHead()
            return r0
    }

    public static final /* synthetic */ int access$getQueueSize$p(kotlinx.coroutines.flow.SharedFlowImpl r0) {
            int r0 = r0.queueSize
            return r0
    }

    public static final /* synthetic */ int access$getTotalSize(kotlinx.coroutines.flow.SharedFlowImpl r0) {
            int r0 = r0.getTotalSize()
            return r0
    }

    public static final /* synthetic */ void access$setQueueSize$p(kotlinx.coroutines.flow.SharedFlowImpl r0, int r1) {
            r0.queueSize = r1
            return
    }

    public static final /* synthetic */ boolean access$tryEmitLocked(kotlinx.coroutines.flow.SharedFlowImpl r0, java.lang.Object r1) {
            boolean r0 = r0.tryEmitLocked(r1)
            return r0
    }

    public static final /* synthetic */ long access$tryPeekLocked(kotlinx.coroutines.flow.SharedFlowImpl r0, kotlinx.coroutines.flow.SharedFlowSlot r1) {
            long r0 = r0.tryPeekLocked(r1)
            return r0
    }

    private final java.lang.Object awaitValue(kotlinx.coroutines.flow.SharedFlowSlot r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            r6 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r8)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            monitor-enter(r6)
            long r2 = access$tryPeekLocked(r6, r7)     // Catch: java.lang.Throwable -> L4c
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L25
            r2 = r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2     // Catch: java.lang.Throwable -> L4c
            r7.cont = r2     // Catch: java.lang.Throwable -> L4c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1     // Catch: java.lang.Throwable -> L4c
            r7.cont = r1     // Catch: java.lang.Throwable -> L4c
            goto L32
        L25:
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1     // Catch: java.lang.Throwable -> L4c
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L4c
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r7 = kotlin.Result.m767constructorimpl(r7)     // Catch: java.lang.Throwable -> L4c
            r1.resumeWith(r7)     // Catch: java.lang.Throwable -> L4c
        L32:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r6)
            java.lang.Object r7 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r0) goto L42
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)
        L42:
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r8) goto L49
            return r7
        L49:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L4c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    private final void cancelEmitter(kotlinx.coroutines.flow.SharedFlowImpl.Emitter r5) {
            r4 = this;
            monitor-enter(r4)
            long r0 = r5.index     // Catch: java.lang.Throwable -> L2a
            long r2 = r4.getHead()     // Catch: java.lang.Throwable -> L2a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto Ld
            monitor-exit(r4)
            return
        Ld:
            java.lang.Object[] r0 = r4.buffer     // Catch: java.lang.Throwable -> L2a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L2a
            long r1 = r5.index     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 == r5) goto L1c
            monitor-exit(r4)
            return
        L1c:
            long r1 = r5.index     // Catch: java.lang.Throwable -> L2a
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> L2a
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r0, r1, r5)     // Catch: java.lang.Throwable -> L2a
            r4.cleanupTailLocked()     // Catch: java.lang.Throwable -> L2a
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return
        L2a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private final void cleanupTailLocked() {
            r5 = this;
            int r0 = r5.bufferCapacity
            if (r0 != 0) goto La
            int r0 = r5.queueSize
            r1 = 1
            if (r0 > r1) goto La
            return
        La:
            java.lang.Object[] r0 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
        Lf:
            int r1 = r5.queueSize
            if (r1 <= 0) goto L3d
            long r1 = r5.getHead()
            int r3 = r5.getTotalSize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            java.lang.Object r1 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r1)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            if (r1 != r2) goto L3d
            int r1 = r5.queueSize
            int r1 = r1 + (-1)
            r5.queueSize = r1
            long r1 = r5.getHead()
            int r3 = r5.getTotalSize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r0, r1, r3)
            goto Lf
        L3d:
            return
    }

    static /* synthetic */ java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl r8, kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            r0.<init>(r8, r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L76
            if (r2 == r5) goto L5f
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.flow.SharedFlowSlot r9 = (kotlinx.coroutines.flow.SharedFlowSlot) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r5 = (kotlinx.coroutines.flow.SharedFlowImpl) r5
            goto L55
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L45:
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.flow.SharedFlowSlot r9 = (kotlinx.coroutines.flow.SharedFlowSlot) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r5 = (kotlinx.coroutines.flow.SharedFlowImpl) r5
        L55:
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5c
            r10 = r2
            r2 = r8
            r8 = r5
            goto La6
        L5c:
            r8 = move-exception
            goto Ldd
        L5f:
            java.lang.Object r8 = r0.L$2
            r9 = r8
            kotlinx.coroutines.flow.SharedFlowSlot r9 = (kotlinx.coroutines.flow.SharedFlowSlot) r9
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r2 = (kotlinx.coroutines.flow.SharedFlowImpl) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L72
            r10 = r8
            r8 = r2
            goto L98
        L72:
            r8 = move-exception
            r5 = r2
            goto Ldd
        L76:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r10 = r8.allocateSlot()
            kotlinx.coroutines.flow.SharedFlowSlot r10 = (kotlinx.coroutines.flow.SharedFlowSlot) r10
            boolean r2 = r9 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch: java.lang.Throwable -> Ld9
            if (r2 == 0) goto L95
            r2 = r9
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch: java.lang.Throwable -> Ld9
            r0.L$0 = r8     // Catch: java.lang.Throwable -> Ld9
            r0.L$1 = r9     // Catch: java.lang.Throwable -> Ld9
            r0.L$2 = r10     // Catch: java.lang.Throwable -> Ld9
            r0.label = r5     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r2 = r2.onSubscription(r0)     // Catch: java.lang.Throwable -> Ld9
            if (r2 != r1) goto L95
            return r1
        L95:
            r7 = r10
            r10 = r9
            r9 = r7
        L98:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch: java.lang.Throwable -> Ld5
            kotlinx.coroutines.Job$Key r5 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> Ld5
            kotlin.coroutines.CoroutineContext$Key r5 = (kotlin.coroutines.CoroutineContext.Key) r5     // Catch: java.lang.Throwable -> Ld5
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Ld5
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2     // Catch: java.lang.Throwable -> Ld5
        La6:
            java.lang.Object r5 = r8.tryTakeValue(r9)     // Catch: java.lang.Throwable -> Ld5
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> Ld5
            if (r5 != r6) goto Lbf
            r0.L$0 = r8     // Catch: java.lang.Throwable -> Ld5
            r0.L$1 = r10     // Catch: java.lang.Throwable -> Ld5
            r0.L$2 = r9     // Catch: java.lang.Throwable -> Ld5
            r0.L$3 = r2     // Catch: java.lang.Throwable -> Ld5
            r0.label = r4     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r5 = r8.awaitValue(r9, r0)     // Catch: java.lang.Throwable -> Ld5
            if (r5 != r1) goto La6
            return r1
        Lbf:
            if (r2 == 0) goto Lc4
            kotlinx.coroutines.JobKt.ensureActive(r2)     // Catch: java.lang.Throwable -> Ld5
        Lc4:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> Ld5
            r0.L$1 = r10     // Catch: java.lang.Throwable -> Ld5
            r0.L$2 = r9     // Catch: java.lang.Throwable -> Ld5
            r0.L$3 = r2     // Catch: java.lang.Throwable -> Ld5
            r0.label = r3     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r5 = r10.emit(r5, r0)     // Catch: java.lang.Throwable -> Ld5
            if (r5 != r1) goto La6
            return r1
        Ld5:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto Ldd
        Ld9:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
        Ldd:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r9 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r9
            r5.freeSlot(r9)
            throw r8
    }

    private final void correctCollectorIndexesOnDropOldest(long r9) {
            r8 = this;
            r0 = r8
            kotlinx.coroutines.flow.internal.AbstractSharedFlow r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlow) r0
            int r1 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r0)
            if (r1 == 0) goto L2c
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r0)
            if (r0 == 0) goto L2c
            int r1 = r0.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L2c
            r3 = r0[r2]
            if (r3 == 0) goto L29
            kotlinx.coroutines.flow.SharedFlowSlot r3 = (kotlinx.coroutines.flow.SharedFlowSlot) r3
            long r4 = r3.index
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L29
            long r4 = r3.index
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L29
            r3.index = r9
        L29:
            int r2 = r2 + 1
            goto L11
        L2c:
            r8.minCollectorIndex = r9
            return
    }

    private final void dropOldestLocked() {
            r4 = this;
            java.lang.Object[] r0 = r4.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r1 = r4.getHead()
            r3 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r0, r1, r3)
            int r0 = r4.bufferSize
            int r0 = r0 + (-1)
            r4.bufferSize = r0
            long r0 = r4.getHead()
            r2 = 1
            long r0 = r0 + r2
            long r2 = r4.replayIndex
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L22
            r4.replayIndex = r0
        L22:
            long r2 = r4.minCollectorIndex
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L2b
            r4.correctCollectorIndexesOnDropOldest(r0)
        L2b:
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L40
            long r2 = r4.getHead()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L3a
            goto L40
        L3a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L40:
            return
    }

    static /* synthetic */ java.lang.Object emit$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl r1, java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            boolean r0 = r1.tryEmit(r2)
            if (r0 == 0) goto L9
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L9:
            java.lang.Object r1 = r1.emitSuspend(r2, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L14
            return r1
        L14:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private final java.lang.Object emitSuspend(T r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
            r11 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r13)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            kotlin.coroutines.Continuation<kotlin.Unit>[] r3 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            monitor-enter(r11)
            boolean r4 = access$tryEmitLocked(r11, r12)     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L2d
            r12 = r1
            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12     // Catch: java.lang.Throwable -> L8e
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L8e
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r2 = kotlin.Result.m767constructorimpl(r2)     // Catch: java.lang.Throwable -> L8e
            r12.resumeWith(r2)     // Catch: java.lang.Throwable -> L8e
            kotlin.coroutines.Continuation[] r12 = access$findSlotsToResumeLocked(r11, r3)     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            goto L59
        L2d:
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r10 = new kotlinx.coroutines.flow.SharedFlowImpl$Emitter     // Catch: java.lang.Throwable -> L8e
            long r4 = access$getHead(r11)     // Catch: java.lang.Throwable -> L8e
            int r6 = access$getTotalSize(r11)     // Catch: java.lang.Throwable -> L8e
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L8e
            long r6 = r6 + r4
            r9 = r1
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9     // Catch: java.lang.Throwable -> L8e
            r4 = r10
            r5 = r11
            r8 = r12
            r4.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L8e
            access$enqueueLocked(r11, r10)     // Catch: java.lang.Throwable -> L8e
            int r12 = access$getQueueSize$p(r11)     // Catch: java.lang.Throwable -> L8e
            int r12 = r12 + r2
            access$setQueueSize$p(r11, r12)     // Catch: java.lang.Throwable -> L8e
            int r12 = access$getBufferCapacity$p(r11)     // Catch: java.lang.Throwable -> L8e
            if (r12 != 0) goto L57
            kotlin.coroutines.Continuation[] r3 = access$findSlotsToResumeLocked(r11, r3)     // Catch: java.lang.Throwable -> L8e
        L57:
            r12 = r3
            r2 = r10
        L59:
            monitor-exit(r11)
            if (r2 == 0) goto L61
            kotlinx.coroutines.DisposableHandle r2 = (kotlinx.coroutines.DisposableHandle) r2
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r1, r2)
        L61:
            int r1 = r12.length
            r2 = 0
        L63:
            if (r2 >= r1) goto L77
            r3 = r12[r2]
            if (r3 == 0) goto L74
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = kotlin.Result.m767constructorimpl(r4)
            r3.resumeWith(r4)
        L74:
            int r2 = r2 + 1
            goto L63
        L77:
            java.lang.Object r12 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r12 != r0) goto L84
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r13)
        L84:
            java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r12 != r13) goto L8b
            return r12
        L8b:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L8e:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
    }

    private final void enqueueLocked(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.getTotalSize()
            java.lang.Object[] r1 = r6.buffer
            r2 = 2
            if (r1 != 0) goto L10
            r1 = 0
            r3 = 0
            java.lang.Object[] r1 = r6.growBuffer(r1, r3, r2)
            goto L19
        L10:
            int r3 = r1.length
            if (r0 < r3) goto L19
            int r3 = r1.length
            int r3 = r3 * r2
            java.lang.Object[] r1 = r6.growBuffer(r1, r0, r3)
        L19:
            long r2 = r6.getHead()
            long r4 = (long) r0
            long r2 = r2 + r4
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r1, r2, r7)
            return
    }

    private final kotlin.coroutines.Continuation<kotlin.Unit>[] findSlotsToResumeLocked(kotlin.coroutines.Continuation<kotlin.Unit>[] r11) {
            r10 = this;
            int r0 = r11.length
            r1 = r10
            kotlinx.coroutines.flow.internal.AbstractSharedFlow r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlow) r1
            int r2 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r1)
            if (r2 == 0) goto L4d
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r1)
            if (r1 == 0) goto L4d
            int r2 = r1.length
            r3 = 0
        L12:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            if (r4 == 0) goto L4a
            kotlinx.coroutines.flow.SharedFlowSlot r4 = (kotlinx.coroutines.flow.SharedFlowSlot) r4
            kotlin.coroutines.Continuation<? super kotlin.Unit> r5 = r4.cont
            if (r5 != 0) goto L1f
            goto L4a
        L1f:
            long r6 = r10.tryPeekLocked(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L4a
            r6 = r11
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r7 = r6.length
            if (r0 < r7) goto L3f
            int r11 = r6.length
            r7 = 2
            int r11 = r11 * r7
            int r11 = java.lang.Math.max(r7, r11)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r6, r11)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r6)
        L3f:
            r6 = r11
            kotlin.coroutines.Continuation[] r6 = (kotlin.coroutines.Continuation[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.cont = r0
            r0 = r7
        L4a:
            int r3 = r3 + 1
            goto L12
        L4d:
            kotlin.coroutines.Continuation[] r11 = (kotlin.coroutines.Continuation[]) r11
            return r11
    }

    private final long getBufferEndIndex() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    private final long getHead() {
            r4 = this;
            long r0 = r4.minCollectorIndex
            long r2 = r4.replayIndex
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    protected static /* synthetic */ void getLastReplayedLocked$annotations() {
            return
    }

    private final java.lang.Object getPeekedValueLockedAt(long r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Object r2 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r2)
            boolean r3 = r2 instanceof kotlinx.coroutines.flow.SharedFlowImpl.Emitter
            if (r3 == 0) goto L11
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r2 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r2
            java.lang.Object r2 = r2.value
        L11:
            return r2
    }

    private final long getQueueEndIndex() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = r4.queueSize
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    private final int getReplaySize() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r4.replayIndex
            long r0 = r0 - r2
            int r0 = (int) r0
            return r0
    }

    private final int getTotalSize() {
            r2 = this;
            int r0 = r2.bufferSize
            int r1 = r2.queueSize
            int r0 = r0 + r1
            return r0
    }

    private final java.lang.Object[] growBuffer(java.lang.Object[] r7, int r8, int r9) {
            r6 = this;
            if (r9 <= 0) goto L1d
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r6.buffer = r9
            if (r7 != 0) goto L9
            return r9
        L9:
            long r0 = r6.getHead()
            r2 = 0
        Le:
            if (r2 >= r8) goto L1c
            long r3 = (long) r2
            long r3 = r3 + r0
            java.lang.Object r5 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r7, r3)
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r9, r3, r5)
            int r2 = r2 + 1
            goto Le
        L1c:
            return r9
        L1d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Buffer size overflow"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    private final boolean tryEmitLocked(T r15) {
            r14 = this;
            int r0 = r14.getNCollectors()
            if (r0 != 0) goto Lb
            boolean r15 = r14.tryEmitNoCollectorsLocked(r15)
            return r15
        Lb:
            int r0 = r14.bufferSize
            int r1 = r14.bufferCapacity
            r2 = 1
            if (r0 < r1) goto L2d
            long r0 = r14.minCollectorIndex
            long r3 = r14.replayIndex
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L2d
            kotlinx.coroutines.channels.BufferOverflow r0 = r14.onBufferOverflow
            int[] r1 = kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L2b
            r1 = 2
            if (r0 == r1) goto L2a
            goto L2d
        L2a:
            return r2
        L2b:
            r15 = 0
            return r15
        L2d:
            r14.enqueueLocked(r15)
            int r15 = r14.bufferSize
            int r15 = r15 + r2
            r14.bufferSize = r15
            int r0 = r14.bufferCapacity
            if (r15 <= r0) goto L3c
            r14.dropOldestLocked()
        L3c:
            int r15 = r14.getReplaySize()
            int r0 = r14.replay
            if (r15 <= r0) goto L58
            long r0 = r14.replayIndex
            r3 = 1
            long r6 = r0 + r3
            long r8 = r14.minCollectorIndex
            long r10 = r14.getBufferEndIndex()
            long r12 = r14.getQueueEndIndex()
            r5 = r14
            r5.updateBufferLocked(r6, r8, r10, r12)
        L58:
            return r2
    }

    private final boolean tryEmitNoCollectorsLocked(T r7) {
            r6 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            int r0 = r6.getNCollectors()
            if (r0 != 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L13:
            int r0 = r6.replay
            r1 = 1
            if (r0 != 0) goto L19
            return r1
        L19:
            r6.enqueueLocked(r7)
            int r7 = r6.bufferSize
            int r7 = r7 + r1
            r6.bufferSize = r7
            int r0 = r6.replay
            if (r7 <= r0) goto L28
            r6.dropOldestLocked()
        L28:
            long r2 = r6.getHead()
            int r7 = r6.bufferSize
            long r4 = (long) r7
            long r2 = r2 + r4
            r6.minCollectorIndex = r2
            return r1
    }

    private final long tryPeekLocked(kotlinx.coroutines.flow.SharedFlowSlot r7) {
            r6 = this;
            long r0 = r7.index
            long r2 = r6.getBufferEndIndex()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto Lb
            return r0
        Lb:
            int r7 = r6.bufferCapacity
            r2 = -1
            if (r7 <= 0) goto L12
            return r2
        L12:
            long r4 = r6.getHead()
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L1b
            return r2
        L1b:
            int r7 = r6.queueSize
            if (r7 != 0) goto L20
            return r2
        L20:
            return r0
    }

    private final java.lang.Object tryTakeValue(kotlinx.coroutines.flow.SharedFlowSlot r9) {
            r8 = this;
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            monitor-enter(r8)
            long r1 = r8.tryPeekLocked(r9)     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L10
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> L3a
            goto L22
        L10:
            long r3 = r9.index     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r8.getPeekedValueLockedAt(r1)     // Catch: java.lang.Throwable -> L3a
            r5 = 1
            long r1 = r1 + r5
            r9.index = r1     // Catch: java.lang.Throwable -> L3a
            kotlin.coroutines.Continuation[] r9 = r8.updateCollectorIndexLocked$kotlinx_coroutines_core(r3)     // Catch: java.lang.Throwable -> L3a
            r7 = r0
            r0 = r9
            r9 = r7
        L22:
            monitor-exit(r8)
            int r1 = r0.length
            r2 = 0
        L25:
            if (r2 >= r1) goto L39
            r3 = r0[r2]
            if (r3 == 0) goto L36
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = kotlin.Result.m767constructorimpl(r4)
            r3.resumeWith(r4)
        L36:
            int r2 = r2 + 1
            goto L25
        L39:
            return r9
        L3a:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    private final void updateBufferLocked(long r7, long r9, long r11, long r13) {
            r6 = this;
            long r0 = java.lang.Math.min(r9, r7)
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L19
            long r2 = r6.getHead()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L13
            goto L19
        L13:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L19:
            long r2 = r6.getHead()
        L1d:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L2e
            java.lang.Object[] r4 = r6.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r5 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r4, r2, r5)
            r4 = 1
            long r2 = r2 + r4
            goto L1d
        L2e:
            r6.replayIndex = r7
            r6.minCollectorIndex = r9
            long r7 = r11 - r0
            int r7 = (int) r7
            r6.bufferSize = r7
            long r13 = r13 - r11
            int r7 = (int) r13
            r6.queueSize = r7
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L4c
            int r7 = r6.bufferSize
            if (r7 < 0) goto L46
            goto L4c
        L46:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L4c:
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L5d
            int r7 = r6.queueSize
            if (r7 < 0) goto L57
            goto L5d
        L57:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L5d:
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L78
            long r7 = r6.replayIndex
            long r9 = r6.getHead()
            int r11 = r6.bufferSize
            long r11 = (long) r11
            long r9 = r9 + r11
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L72
            goto L78
        L72:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L78:
            return
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.coroutines.Continuation<?> r2) {
            r0 = this;
            java.lang.Object r1 = collect$suspendImpl(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.SharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.SharedFlowSlot r0 = new kotlinx.coroutines.flow.SharedFlowSlot
            r0.<init>()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.SharedFlowSlot r0 = r1.createSlot()
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.SharedFlowSlot[] createSlotArray(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.SharedFlowSlot[] r1 = new kotlinx.coroutines.flow.SharedFlowSlot[r1]
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] createSlotArray(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.SharedFlowSlot[] r1 = r0.createSlotArray(r1)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r1
            return r1
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = emit$suspendImpl(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.flow.SharedFlow r0 = (kotlinx.coroutines.flow.SharedFlow) r0
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(r0, r2, r3, r4)
            return r2
    }

    protected final T getLastReplayedLocked() {
            r5 = this;
            java.lang.Object[] r0 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r1 = r5.replayIndex
            int r3 = r5.getReplaySize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            java.lang.Object r0 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public java.util.List<T> getReplayCache() {
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.getReplaySize()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto Ld
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r9)
            return r0
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r2 = r9.buffer     // Catch: java.lang.Throwable -> L2f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L2f
            r3 = 0
        L18:
            if (r3 >= r0) goto L2b
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L2f
            long r5 = r9.replayIndex     // Catch: java.lang.Throwable -> L2f
            long r7 = (long) r3     // Catch: java.lang.Throwable -> L2f
            long r5 = r5 + r7
            java.lang.Object r5 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r2, r5)     // Catch: java.lang.Throwable -> L2f
            r4.add(r5)     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            goto L18
        L2b:
            monitor-exit(r9)
            java.util.List r1 = (java.util.List) r1
            return r1
        L2f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
            r9 = this;
            monitor-enter(r9)
            long r1 = r9.getBufferEndIndex()     // Catch: java.lang.Throwable -> L17
            long r3 = r9.minCollectorIndex     // Catch: java.lang.Throwable -> L17
            long r5 = r9.getBufferEndIndex()     // Catch: java.lang.Throwable -> L17
            long r7 = r9.getQueueEndIndex()     // Catch: java.lang.Throwable -> L17
            r0 = r9
            r0.updateBufferLocked(r1, r3, r5, r7)     // Catch: java.lang.Throwable -> L17
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17
            monitor-exit(r9)
            return
        L17:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T r6) {
            r5 = this;
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            monitor-enter(r5)
            boolean r6 = r5.tryEmitLocked(r6)     // Catch: java.lang.Throwable -> L28
            r1 = 0
            if (r6 == 0) goto L10
            kotlin.coroutines.Continuation[] r0 = r5.findSlotsToResumeLocked(r0)     // Catch: java.lang.Throwable -> L28
            r6 = 1
            goto L11
        L10:
            r6 = r1
        L11:
            monitor-exit(r5)
            int r2 = r0.length
        L13:
            if (r1 >= r2) goto L27
            r3 = r0[r1]
            if (r3 == 0) goto L24
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = kotlin.Result.m767constructorimpl(r4)
            r3.resumeWith(r4)
        L24:
            int r1 = r1 + 1
            goto L13
        L27:
            return r6
        L28:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long r22) {
            r21 = this;
            r9 = r21
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L15
            long r0 = r9.minCollectorIndex
            int r0 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r0 < 0) goto Lf
            goto L15
        Lf:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L15:
            long r0 = r9.minCollectorIndex
            int r0 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1e
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r0
        L1e:
            long r0 = r21.getHead()
            int r2 = r9.bufferSize
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r9.bufferCapacity
            r5 = 1
            if (r4 != 0) goto L31
            int r4 = r9.queueSize
            if (r4 <= 0) goto L31
            long r2 = r2 + r5
        L31:
            r4 = r9
            kotlinx.coroutines.flow.internal.AbstractSharedFlow r4 = (kotlinx.coroutines.flow.internal.AbstractSharedFlow) r4
            int r7 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r4)
            if (r7 == 0) goto L5d
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r4 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r4)
            if (r4 == 0) goto L5d
            int r7 = r4.length
            r8 = 0
        L42:
            if (r8 >= r7) goto L5d
            r11 = r4[r8]
            if (r11 == 0) goto L5a
            kotlinx.coroutines.flow.SharedFlowSlot r11 = (kotlinx.coroutines.flow.SharedFlowSlot) r11
            long r12 = r11.index
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 < 0) goto L5a
            long r12 = r11.index
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 >= 0) goto L5a
            long r2 = r11.index
        L5a:
            int r8 = r8 + 1
            goto L42
        L5d:
            boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r4 == 0) goto L70
            long r7 = r9.minCollectorIndex
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 < 0) goto L6a
            goto L70
        L6a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L70:
            long r7 = r9.minCollectorIndex
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L79
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r0
        L79:
            long r7 = r21.getBufferEndIndex()
            int r4 = r21.getNCollectors()
            if (r4 <= 0) goto L90
            long r11 = r7 - r2
            int r4 = (int) r11
            int r11 = r9.queueSize
            int r12 = r9.bufferCapacity
            int r12 = r12 - r4
            int r4 = java.lang.Math.min(r11, r12)
            goto L92
        L90:
            int r4 = r9.queueSize
        L92:
            kotlin.coroutines.Continuation<kotlin.Unit>[] r11 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            int r12 = r9.queueSize
            long r12 = (long) r12
            long r12 = r12 + r7
            if (r4 <= 0) goto Le0
            kotlin.coroutines.Continuation[] r11 = new kotlin.coroutines.Continuation[r4]
            java.lang.Object[] r14 = r9.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            r5 = r7
            r15 = 0
        La3:
            int r16 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r16 >= 0) goto Ldc
            java.lang.Object r10 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r14, r7)
            r17 = r2
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            if (r10 == r2) goto Ld5
            if (r10 == 0) goto Lcd
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r10 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r10
            int r2 = r15 + 1
            kotlin.coroutines.Continuation<kotlin.Unit> r3 = r10.cont
            r11[r15] = r3
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r14, r7, r3)
            java.lang.Object r3 = r10.value
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r14, r5, r3)
            r19 = 1
            long r5 = r5 + r19
            if (r2 >= r4) goto Lde
            r15 = r2
            goto Ld7
        Lcd:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"
            r0.<init>(r1)
            throw r0
        Ld5:
            r19 = 1
        Ld7:
            long r7 = r7 + r19
            r2 = r17
            goto La3
        Ldc:
            r17 = r2
        Lde:
            r7 = r5
            goto Le2
        Le0:
            r17 = r2
        Le2:
            long r0 = r7 - r0
            int r0 = (int) r0
            int r1 = r21.getNCollectors()
            if (r1 != 0) goto Led
            r3 = r7
            goto Lef
        Led:
            r3 = r17
        Lef:
            long r1 = r9.replayIndex
            int r5 = r9.replay
            int r0 = java.lang.Math.min(r5, r0)
            long r5 = (long) r0
            long r5 = r7 - r5
            long r0 = java.lang.Math.max(r1, r5)
            int r2 = r9.bufferCapacity
            if (r2 != 0) goto L11b
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L11b
            java.lang.Object[] r2 = r9.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Object r2 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r2, r0)
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
            if (r2 == 0) goto L11b
            r5 = 1
            long r7 = r7 + r5
            long r0 = r0 + r5
        L11b:
            r1 = r0
            r5 = r7
            r0 = r21
            r7 = r12
            r0.updateBufferLocked(r1, r3, r5, r7)
            r21.cleanupTailLocked()
            int r0 = r11.length
            if (r0 != 0) goto L12b
            r10 = 1
            goto L12c
        L12b:
            r10 = 0
        L12c:
            if (r10 != 0) goto L132
            kotlin.coroutines.Continuation[] r11 = r9.findSlotsToResumeLocked(r11)
        L132:
            return r11
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
            r4 = this;
            long r0 = r4.replayIndex
            long r2 = r4.minCollectorIndex
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto La
            r4.minCollectorIndex = r0
        La:
            return r0
    }
}
