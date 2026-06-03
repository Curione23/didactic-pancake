package okio.internal;

/* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"collectRecursively", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "stack", "Lkotlin/collections/ArrayDeque;", "path", "followSymlinks", "", "postorder", "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commonCopy", "source", "target", "commonCreateDirectories", "dir", "mustCreate", "commonDeleteRecursively", "fileOrDirectory", "mustExist", "commonExists", "commonListRecursively", "Lkotlin/sequences/Sequence;", "commonMetadata", "Lokio/FileMetadata;", "symlinkTarget", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FileSystem {

    /* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    /* JADX INFO: compiled from: FileSystem.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {116, 135, 145}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super okio.internal.FileSystem.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                r7.result = r8
                int r8 = r7.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r8 = r8 | r0
                r7.label = r8
                r5 = 0
                r6 = r7
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                java.lang.Object r8 = okio.internal.FileSystem.collectRecursively(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileSystem.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
    static final class C01581 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super okio.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ okio.Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C01581(okio.Path r1, okio.FileSystem r2, boolean r3, kotlin.coroutines.Continuation<? super okio.internal.FileSystem.C01581> r4) {
                r0 = this;
                r0.$dir = r1
                r0.$this_commonListRecursively = r2
                r0.$followSymlinks = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                okio.internal.-FileSystem$commonListRecursively$1 r0 = new okio.internal.-FileSystem$commonListRecursively$1
                okio.Path r1 = r4.$dir
                okio.FileSystem r2 = r4.$this_commonListRecursively
                boolean r3 = r4.$followSymlinks
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
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
                okio.internal.-FileSystem$commonListRecursively$1 r1 = (okio.internal.FileSystem.C01581) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r11.L$2
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r11.L$1
                kotlin.collections.ArrayDeque r3 = (kotlin.collections.ArrayDeque) r3
                java.lang.Object r4 = r11.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r12)
                r12 = r3
                r10 = r4
                goto L45
            L1d:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L25:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                kotlin.sequences.SequenceScope r12 = (kotlin.sequences.SequenceScope) r12
                kotlin.collections.ArrayDeque r1 = new kotlin.collections.ArrayDeque
                r1.<init>()
                okio.Path r3 = r11.$dir
                r1.addLast(r3)
                okio.FileSystem r3 = r11.$this_commonListRecursively
                okio.Path r4 = r11.$dir
                java.util.List r3 = r3.list(r4)
                java.util.Iterator r3 = r3.iterator()
                r10 = r12
                r12 = r1
                r1 = r3
            L45:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L6b
                java.lang.Object r3 = r1.next()
                r6 = r3
                okio.Path r6 = (okio.Path) r6
                okio.FileSystem r4 = r11.$this_commonListRecursively
                boolean r7 = r11.$followSymlinks
                r9 = r11
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r11.L$0 = r10
                r11.L$1 = r12
                r11.L$2 = r1
                r11.label = r2
                r8 = 0
                r3 = r10
                r5 = r12
                java.lang.Object r3 = okio.internal.FileSystem.collectRecursively(r3, r4, r5, r6, r7, r8, r9)
                if (r3 != r0) goto L45
                return r0
            L6b:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
        }
    }

    public static final java.lang.Object collectRecursively(kotlin.sequences.SequenceScope<? super okio.Path> r15, okio.FileSystem r16, kotlin.collections.ArrayDeque<okio.Path> r17, okio.Path r18, boolean r19, boolean r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
            r0 = r15
            r1 = r18
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof okio.internal.FileSystem.AnonymousClass1
            if (r4 == 0) goto L1b
            r4 = r3
            okio.internal.-FileSystem$collectRecursively$1 r4 = (okio.internal.FileSystem.AnonymousClass1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r6
            if (r5 == 0) goto L1b
            int r3 = r4.label
            int r3 = r3 - r6
            r4.label = r3
            goto L20
        L1b:
            okio.internal.-FileSystem$collectRecursively$1 r4 = new okio.internal.-FileSystem$collectRecursively$1
            r4.<init>(r3)
        L20:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.label
            r7 = 0
            r8 = 3
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L7d
            if (r6 == r10) goto L61
            if (r6 == r9) goto L41
            if (r6 != r8) goto L39
            kotlin.ResultKt.throwOnFailure(r3)
            goto L145
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            boolean r0 = r4.Z$1
            boolean r1 = r4.Z$0
            java.lang.Object r2 = r4.L$4
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r6 = r4.L$3
            okio.Path r6 = (okio.Path) r6
            java.lang.Object r7 = r4.L$2
            kotlin.collections.ArrayDeque r7 = (kotlin.collections.ArrayDeque) r7
            java.lang.Object r10 = r4.L$1
            okio.FileSystem r10 = (okio.FileSystem) r10
            java.lang.Object r11 = r4.L$0
            kotlin.sequences.SequenceScope r11 = (kotlin.sequences.SequenceScope) r11
            kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L5e
            goto Lef
        L5e:
            r0 = move-exception
            goto L127
        L61:
            boolean r0 = r4.Z$1
            boolean r1 = r4.Z$0
            java.lang.Object r2 = r4.L$3
            okio.Path r2 = (okio.Path) r2
            java.lang.Object r6 = r4.L$2
            kotlin.collections.ArrayDeque r6 = (kotlin.collections.ArrayDeque) r6
            java.lang.Object r10 = r4.L$1
            okio.FileSystem r10 = (okio.FileSystem) r10
            java.lang.Object r11 = r4.L$0
            kotlin.sequences.SequenceScope r11 = (kotlin.sequences.SequenceScope) r11
            kotlin.ResultKt.throwOnFailure(r3)
            r14 = r2
            r2 = r0
            r0 = r1
            r1 = r14
            goto La7
        L7d:
            kotlin.ResultKt.throwOnFailure(r3)
            if (r2 != 0) goto L9d
            r4.L$0 = r0
            r3 = r16
            r4.L$1 = r3
            r6 = r17
            r4.L$2 = r6
            r4.L$3 = r1
            r11 = r19
            r4.Z$0 = r11
            r4.Z$1 = r2
            r4.label = r10
            java.lang.Object r10 = r15.yield(r1, r4)
            if (r10 != r5) goto La3
            return r5
        L9d:
            r3 = r16
            r6 = r17
            r11 = r19
        La3:
            r10 = r3
            r14 = r11
            r11 = r0
            r0 = r14
        La7:
            java.util.List r3 = r10.listOrNull(r1)
            if (r3 != 0) goto Lb1
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        Lb1:
            r12 = r3
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L12f
            r12 = r1
        Lbb:
            if (r0 == 0) goto Ld9
            boolean r13 = r6.contains(r12)
            if (r13 != 0) goto Lc4
            goto Ld9
        Lc4:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "symlink cycle at "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Ld9:
            okio.Path r13 = symlinkTarget(r10, r12)
            if (r13 != 0) goto L12b
            if (r0 != 0) goto Le3
            if (r7 != 0) goto L12f
        Le3:
            r6.addLast(r12)
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L125
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r2
            r2 = r3
        Lef:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L11f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5e
            okio.Path r3 = (okio.Path) r3     // Catch: java.lang.Throwable -> L5e
            r4.L$0 = r11     // Catch: java.lang.Throwable -> L5e
            r4.L$1 = r10     // Catch: java.lang.Throwable -> L5e
            r4.L$2 = r7     // Catch: java.lang.Throwable -> L5e
            r4.L$3 = r6     // Catch: java.lang.Throwable -> L5e
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L5e
            r4.Z$0 = r1     // Catch: java.lang.Throwable -> L5e
            r4.Z$1 = r0     // Catch: java.lang.Throwable -> L5e
            r4.label = r9     // Catch: java.lang.Throwable -> L5e
            r15 = r11
            r16 = r10
            r17 = r7
            r18 = r3
            r19 = r1
            r20 = r0
            r21 = r4
            java.lang.Object r3 = collectRecursively(r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L5e
            if (r3 != r5) goto Lef
            return r5
        L11f:
            r7.removeLast()
            r2 = r0
            r1 = r6
            goto L12f
        L125:
            r0 = move-exception
            r7 = r6
        L127:
            r7.removeLast()
            throw r0
        L12b:
            int r7 = r7 + 1
            r12 = r13
            goto Lbb
        L12f:
            if (r2 == 0) goto L148
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r0
            r4.label = r8
            java.lang.Object r0 = r11.yield(r1, r4)
            if (r0 != r5) goto L145
            return r5
        L145:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L148:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public static final void commonCopy(okio.FileSystem r4, okio.Path r5, okio.Path r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.Source r5 = r4.source(r5)
            java.io.Closeable r5 = (java.io.Closeable) r5
            r0 = 0
            r1 = r5
            okio.Source r1 = (okio.Source) r1     // Catch: java.lang.Throwable -> L5d
            okio.Sink r4 = r4.sink(r6)     // Catch: java.lang.Throwable -> L5d
            okio.BufferedSink r4 = okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> L5d
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L5d
            r6 = r4
            okio.BufferedSink r6 = (okio.BufferedSink) r6     // Catch: java.lang.Throwable -> L38
            long r1 = r6.writeAll(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L36
            r4.close()     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r4 = move-exception
            goto L45
        L36:
            r4 = r0
            goto L45
        L38:
            r6 = move-exception
            if (r4 == 0) goto L43
            r4.close()     // Catch: java.lang.Throwable -> L3f
            goto L43
        L3f:
            r4 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r6, r4)     // Catch: java.lang.Throwable -> L5d
        L43:
            r4 = r6
            r6 = r0
        L45:
            if (r4 != 0) goto L5c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L5d
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L5d
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L6b
            r5.close()     // Catch: java.lang.Throwable -> L5a
            goto L6b
        L5a:
            r0 = move-exception
            goto L6b
        L5c:
            throw r4     // Catch: java.lang.Throwable -> L5d
        L5d:
            r4 = move-exception
            if (r5 == 0) goto L68
            r5.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r5 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r4, r5)
        L68:
            r3 = r0
            r0 = r4
            r4 = r3
        L6b:
            if (r0 != 0) goto L71
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            return
        L71:
            throw r0
    }

    public static final void commonCreateDirectories(okio.FileSystem r3, okio.Path r4, boolean r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1 = r4
        L10:
            if (r1 == 0) goto L20
            boolean r2 = r3.exists(r1)
            if (r2 != 0) goto L20
            r0.addFirst(r1)
            okio.Path r1 = r1.parent()
            goto L10
        L20:
            if (r5 == 0) goto L42
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L29
            goto L42
        L29:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = " already exists."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L42:
            java.util.Iterator r4 = r0.iterator()
        L46:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r5 = r4.next()
            okio.Path r5 = (okio.Path) r5
            r3.createDirectory(r5)
            goto L46
        L56:
            return
    }

    public static final void commonDeleteRecursively(okio.FileSystem r2, okio.Path r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "fileOrDirectory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r0 = new okio.internal.-FileSystem$commonDeleteRecursively$sequence$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.sequence(r0)
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            okio.Path r0 = (okio.Path) r0
            if (r4 == 0) goto L30
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L30
            r1 = 1
            goto L31
        L30:
            r1 = 0
        L31:
            r2.delete(r0, r1)
            goto L1a
        L35:
            return
    }

    public static final boolean commonExists(okio.FileSystem r1, okio.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.FileMetadata r1 = r1.metadataOrNull(r2)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public static final kotlin.sequences.Sequence<okio.Path> commonListRecursively(okio.FileSystem r2, okio.Path r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.internal.-FileSystem$commonListRecursively$1 r0 = new okio.internal.-FileSystem$commonListRecursively$1
            r1 = 0
            r0.<init>(r3, r2, r4, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.sequence(r0)
            return r2
    }

    public static final okio.FileMetadata commonMetadata(okio.FileSystem r2, okio.Path r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.FileMetadata r2 = r2.metadataOrNull(r3)
            if (r2 == 0) goto L11
            return r2
        L11:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "no such file: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static final okio.Path symlinkTarget(okio.FileSystem r1, okio.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.FileMetadata r1 = r1.metadata(r2)
            okio.Path r1 = r1.getSymlinkTarget()
            if (r1 != 0) goto L16
            r1 = 0
            return r1
        L16:
            okio.Path r2 = r2.parent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Path r1 = r2.resolve(r1)
            return r1
    }
}
