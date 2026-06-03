package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
final class ChannelFlowMerge$collectTo$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2<T> this$0;

    ChannelFlowMerge$collectTo$2$emit$1(kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2<? super T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1> r2) {
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
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2<T> r3 = r2.this$0
            r0 = 0
            r1 = r2
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r3 = r3.emit(r0, r1)
            return r3
    }
}
