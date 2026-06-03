package androidx.activity;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"reportWhenComplete", "", "Landroidx/activity/FullyDrawnReporter;", "reporter", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/activity/FullyDrawnReporter;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FullyDrawnReporterKt {

    /* JADX INFO: renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1, reason: invalid class name */
    /* JADX INFO: compiled from: FullyDrawnReporter.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {185}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.activity.FullyDrawnReporterKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                r0 = r1
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                java.lang.Object r2 = androidx.activity.FullyDrawnReporterKt.reportWhenComplete(r2, r2, r0)
                return r2
        }
    }

    public static final java.lang.Object reportWhenComplete(androidx.activity.FullyDrawnReporter r4, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            boolean r0 = r6 instanceof androidx.activity.FullyDrawnReporterKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r6
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (androidx.activity.FullyDrawnReporterKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            androidx.activity.FullyDrawnReporter r4 = (androidx.activity.FullyDrawnReporter) r4
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L5c
            goto L50
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            r4.addReporter()
            boolean r6 = r4.isFullyDrawnReported()
            if (r6 == 0) goto L45
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L45:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L5c
            r0.label = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L5c
            if (r5 != r1) goto L50
            return r1
        L50:
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r4.removeReporter()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L5c:
            r5 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r4.removeReporter()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r5
    }

    private static final java.lang.Object reportWhenComplete$$forInline(androidx.activity.FullyDrawnReporter r1, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1.addReporter()
            boolean r0 = r1.isFullyDrawnReported()
            if (r0 == 0) goto Lc
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        Lc:
            r0 = 1
            r2.invoke(r3)     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r1.removeReporter()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L1c:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r1.removeReporter()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r2
    }
}
