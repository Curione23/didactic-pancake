package okio.internal;

/* JADX INFO: renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
final class FileSystem$commonDeleteRecursively$sequence$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super okio.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ okio.Path $fileOrDirectory;
    final /* synthetic */ okio.FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    FileSystem$commonDeleteRecursively$sequence$1(okio.FileSystem r1, okio.Path r2, kotlin.coroutines.Continuation<? super okio.internal.FileSystem$commonDeleteRecursively$sequence$1> r3) {
            r0 = this;
            r0.$this_commonDeleteRecursively = r1
            r0.$fileOrDirectory = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r0 = new okio.internal.-FileSystem$commonDeleteRecursively$sequence$1
            okio.FileSystem r1 = r3.$this_commonDeleteRecursively
            okio.Path r2 = r3.$fileOrDirectory
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super okio.Path> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super okio.Path> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r1 = (okio.internal.FileSystem$commonDeleteRecursively$sequence$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r11)
            goto L36
        Lf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L17:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.L$0
            r3 = r11
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            okio.FileSystem r4 = r10.$this_commonDeleteRecursively
            kotlin.collections.ArrayDeque r5 = new kotlin.collections.ArrayDeque
            r5.<init>()
            okio.Path r6 = r10.$fileOrDirectory
            r9 = r10
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            r10.label = r2
            r7 = 0
            r8 = 1
            java.lang.Object r11 = okio.internal.FileSystem.collectRecursively(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L36
            return r0
        L36:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
    }
}
