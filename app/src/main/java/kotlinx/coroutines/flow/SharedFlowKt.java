package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a6\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\r\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a#\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u0019*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u001b\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\u001c"}, d2 = {"NO_VALUE", "Lkotlinx/coroutines/internal/Symbol;", "getNO_VALUE$annotations", "()V", "MutableSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "T", "replay", "", "extraBufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "fuseSharedFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharedFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getBufferAt", "", "", "index", "", "([Ljava/lang/Object;J)Ljava/lang/Object;", "setBufferAt", "", "item", "([Ljava/lang/Object;JLjava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SharedFlowKt {
    public static final kotlinx.coroutines.internal.Symbol NO_VALUE = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_VALUE"
            r0.<init>(r1)
            kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE = r0
            return
    }

    public static final <T> kotlinx.coroutines.flow.MutableSharedFlow<T> MutableSharedFlow(int r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3) {
            if (r1 < 0) goto L4d
            if (r2 < 0) goto L34
            if (r1 > 0) goto L26
            if (r2 > 0) goto L26
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r3 != r0) goto Ld
            goto L26
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L26:
            int r2 = r2 + r1
            if (r2 >= 0) goto L2c
            r2 = 2147483647(0x7fffffff, float:NaN)
        L2c:
            kotlinx.coroutines.flow.SharedFlowImpl r0 = new kotlinx.coroutines.flow.SharedFlowImpl
            r0.<init>(r1, r2, r3)
            kotlinx.coroutines.flow.MutableSharedFlow r0 = (kotlinx.coroutines.flow.MutableSharedFlow) r0
            return r0
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "extraBufferCapacity cannot be negative, but was "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L4d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "replay cannot be negative, but was "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow MutableSharedFlow$default(int r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r1 = r0
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lb
            r2 = r0
        Lb:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L11:
            kotlinx.coroutines.flow.MutableSharedFlow r1 = MutableSharedFlow(r1, r2, r3)
            return r1
    }

    public static final /* synthetic */ java.lang.Object access$getBufferAt(java.lang.Object[] r0, long r1) {
            java.lang.Object r0 = getBufferAt(r0, r1)
            return r0
    }

    public static final /* synthetic */ void access$setBufferAt(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            setBufferAt(r0, r1, r3)
            return
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> fuseSharedFlow(kotlinx.coroutines.flow.SharedFlow<? extends T> r1, kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            if (r3 == 0) goto L5
            r0 = -3
            if (r3 != r0) goto Lc
        L5:
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r0) goto Lc
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            return r1
        Lc:
            kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl r0 = new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            r0.<init>(r1, r2, r3, r4)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
    }

    private static final java.lang.Object getBufferAt(java.lang.Object[] r0, long r1) {
            int r1 = (int) r1
            int r2 = r0.length
            int r2 = r2 + (-1)
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
    }

    public static /* synthetic */ void getNO_VALUE$annotations() {
            return
    }

    private static final void setBufferAt(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            int r1 = (int) r1
            int r2 = r0.length
            int r2 = r2 + (-1)
            r1 = r1 & r2
            r0[r1] = r3
            return
    }
}
