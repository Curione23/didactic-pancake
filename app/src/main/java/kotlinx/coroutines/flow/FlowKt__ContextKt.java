package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\u0004\u001a(\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a0\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u000f"}, d2 = {"checkFlowContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "checkFlowContext$FlowKt__ContextKt", "buffer", "Lkotlinx/coroutines/flow/Flow;", "T", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "cancellable", "conflate", "flowOn", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ContextKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.flow.Flow buffer(kotlinx.coroutines.flow.Flow r2, int r3) {
            r0 = 0
            r1 = 2
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.buffer$default(r2, r3, r0, r1, r0)
            return r2
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> buffer(kotlinx.coroutines.flow.Flow<? extends T> r7, int r8, kotlinx.coroutines.channels.BufferOverflow r9) {
            r0 = -1
            if (r8 >= 0) goto L22
            r1 = -2
            if (r8 == r1) goto L22
            if (r8 != r0) goto L9
            goto L22
        L9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "
            r7.<init>(r9)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L22:
            if (r8 != r0) goto L35
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r9 != r1) goto L29
            goto L35
        L29:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L35:
            if (r8 != r0) goto L3a
            kotlinx.coroutines.channels.BufferOverflow r9 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r8 = 0
        L3a:
            r3 = r8
            r4 = r9
            boolean r8 = r7 instanceof kotlinx.coroutines.flow.internal.FusibleFlow
            if (r8 == 0) goto L4e
            r0 = r7
            kotlinx.coroutines.flow.internal.FusibleFlow r0 = (kotlinx.coroutines.flow.internal.FusibleFlow) r0
            r7 = 1
            r5 = 0
            r1 = 0
            r2 = r3
            r3 = r4
            r4 = r7
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.internal.FusibleFlow.DefaultImpls.fuse$default(r0, r1, r2, r3, r4, r5)
            goto L5b
        L4e:
            kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl r8 = new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl
            r5 = 2
            r6 = 0
            r2 = 0
            r0 = r8
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7 = r8
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
        L5b:
            return r7
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = -2
        L5:
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.buffer(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow r0, int r1, kotlinx.coroutines.channels.BufferOverflow r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = -2
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        Lb:
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.buffer(r0, r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> cancellable(kotlinx.coroutines.flow.Flow<? extends T> r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.CancellableFlow
            if (r0 == 0) goto L5
            goto Ld
        L5:
            kotlinx.coroutines.flow.CancellableFlowImpl r0 = new kotlinx.coroutines.flow.CancellableFlowImpl
            r0.<init>(r1)
            r1 = r0
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
        Ld:
            return r1
    }

    private static final void checkFlowContext$FlowKt__ContextKt(kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r2.get(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Flow context cannot contain job in it. Had "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> conflate(kotlinx.coroutines.flow.Flow<? extends T> r3) {
            r0 = 0
            r1 = 2
            r2 = -1
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.buffer$default(r3, r2, r0, r1, r0)
            return r3
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOn(kotlinx.coroutines.flow.Flow<? extends T> r8, kotlin.coroutines.CoroutineContext r9) {
            checkFlowContext$FlowKt__ContextKt(r9)
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r0)
            if (r0 == 0) goto Lc
            goto L2d
        Lc:
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.FusibleFlow
            if (r0 == 0) goto L1d
            r1 = r8
            kotlinx.coroutines.flow.internal.FusibleFlow r1 = (kotlinx.coroutines.flow.internal.FusibleFlow) r1
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r2 = r9
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.internal.FusibleFlow.DefaultImpls.fuse$default(r1, r2, r3, r4, r5, r6)
            goto L2d
        L1d:
            kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl r7 = new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8 = r7
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
        L2d:
            return r8
    }
}
