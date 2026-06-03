package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {81}, m = "emit", n = {}, s = {})
final class DistinctFlowImpl$collect$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.DistinctFlowImpl.AnonymousClass2<T> this$0;

    DistinctFlowImpl$collect$2$emit$1(kotlinx.coroutines.flow.DistinctFlowImpl.AnonymousClass2<? super T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1> r2) {
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
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2<T> r3 = r2.this$0
            r0 = 0
            r1 = r2
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r3 = r3.emit(r0, r1)
            return r3
    }
}
