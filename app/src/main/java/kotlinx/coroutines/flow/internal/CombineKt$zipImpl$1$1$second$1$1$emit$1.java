package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {93}, m = "emit", n = {}, s = {})
final class CombineKt$zipImpl$1$1$second$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1.AnonymousClass1<T> this$0;

    CombineKt$zipImpl$1$1$second$1$1$emit$1(kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1.AnonymousClass1<? super T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1$emit$1> r2) {
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
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1<T> r3 = r2.this$0
            r0 = 0
            r1 = r2
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r3 = r3.emit(r0, r1)
            return r3
    }
}
