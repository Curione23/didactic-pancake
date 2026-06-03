package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {409, 411}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
final class ViewKt$allViews$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super android.view.View>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.view.View $this_allViews;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    ViewKt$allViews$1(android.view.View r1, kotlin.coroutines.Continuation<? super androidx.core.view.ViewKt$allViews$1> r2) {
            r0 = this;
            r0.$this_allViews = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.core.view.ViewKt$allViews$1 r0 = new androidx.core.view.ViewKt$allViews$1
            android.view.View r1 = r2.$this_allViews
            r0.<init>(r1, r4)
            r0.L$0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super android.view.View> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super android.view.View> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            androidx.core.view.ViewKt$allViews$1 r1 = (androidx.core.view.ViewKt$allViews$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r6)
            goto L55
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.L$0
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3a
        L22:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            android.view.View r6 = r5.$this_allViews
            r4 = r5
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r1.yield(r6, r4)
            if (r6 != r0) goto L3a
            return r0
        L3a:
            android.view.View r6 = r5.$this_allViews
            boolean r3 = r6 instanceof android.view.ViewGroup
            if (r3 == 0) goto L55
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            kotlin.sequences.Sequence r6 = androidx.core.view.ViewGroupKt.getDescendants(r6)
            r3 = r5
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r1.yieldAll(r6, r3)
            if (r6 != r0) goto L55
            return r0
        L55:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }
}
