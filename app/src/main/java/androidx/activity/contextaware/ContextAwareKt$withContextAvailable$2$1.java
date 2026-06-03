package androidx.activity.contextaware;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
final class ContextAwareKt$withContextAvailable$2$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    final /* synthetic */ androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1<R> $listener;
    final /* synthetic */ androidx.activity.contextaware.ContextAware $this_withContextAvailable;

    public ContextAwareKt$withContextAvailable$2$1(androidx.activity.contextaware.ContextAware r1, androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1<R> r2) {
            r0 = this;
            r0.$this_withContextAvailable = r1
            r0.$listener = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.invoke2(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.Throwable r2) {
            r1 = this;
            androidx.activity.contextaware.ContextAware r2 = r1.$this_withContextAvailable
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1<R> r0 = r1.$listener
            androidx.activity.contextaware.OnContextAvailableListener r0 = (androidx.activity.contextaware.OnContextAvailableListener) r0
            r2.removeOnContextAvailableListener(r0)
            return
    }
}
