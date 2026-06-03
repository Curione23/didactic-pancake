package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;

    FlowKt__ChannelsKt$emitAllImpl$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1> r1) {
            r0 = this;
            r0.<init>(r1)
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
            r3 = 0
            r0 = r2
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            r1 = 0
            java.lang.Object r3 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.access$emitAllImpl$FlowKt__ChannelsKt(r1, r1, r3, r0)
            return r3
    }
}
