package kotlin.io.path;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0096\u0002JE\u0010\u0018\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0!\u0012\u0004\u0012\u00020\u00190 H\u0082Hø\u0001\u0000¢\u0006\u0002\u0010\"R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", "start", "options", "", "Lkotlin/io/path/PathWalkOption;", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)V", "followLinks", "", "getFollowLinks", "()Z", "includeDirectories", "getIncludeDirectories", "isBFS", "linkOptions", "Ljava/nio/file/LinkOption;", "getLinkOptions", "()[Ljava/nio/file/LinkOption;", "[Lkotlin/io/path/PathWalkOption;", "bfsIterator", "", "dfsIterator", "iterator", "yieldIfNeeded", "", "Lkotlin/sequences/SequenceScope;", "node", "Lkotlin/io/path/PathNode;", "entriesReader", "Lkotlin/io/path/DirectoryEntriesReader;", "entriesAction", "Lkotlin/Function1;", "", "(Lkotlin/sequences/SequenceScope;Lkotlin/io/path/PathNode;Lkotlin/io/path/DirectoryEntriesReader;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PathTreeWalk implements kotlin.sequences.Sequence<java.nio.file.Path> {
    private final kotlin.io.path.PathWalkOption[] options;
    private final java.nio.file.Path start;

    /* JADX INFO: renamed from: kotlin.io.path.PathTreeWalk$bfsIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: PathTreeWalk.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {184, 190}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.nio.file.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        final /* synthetic */ kotlin.io.path.PathTreeWalk this$0;

        AnonymousClass1(kotlin.io.path.PathTreeWalk r1, kotlin.coroutines.Continuation<? super kotlin.io.path.PathTreeWalk.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlin.io.path.PathTreeWalk$bfsIterator$1 r0 = new kotlin.io.path.PathTreeWalk$bfsIterator$1
                kotlin.io.path.PathTreeWalk r1 = r2.this$0
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.nio.file.Path> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super java.nio.file.Path> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlin.io.path.PathTreeWalk$bfsIterator$1 r1 = (kotlin.io.path.PathTreeWalk.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L44
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r12.L$2
                kotlin.io.path.DirectoryEntriesReader r1 = (kotlin.io.path.DirectoryEntriesReader) r1
                java.lang.Object r5 = r12.L$1
                kotlin.collections.ArrayDeque r5 = (kotlin.collections.ArrayDeque) r5
                java.lang.Object r6 = r12.L$0
                kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
                kotlin.ResultKt.throwOnFailure(r13)
                goto L7d
            L1f:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L27:
                java.lang.Object r1 = r12.L$5
                java.nio.file.Path r1 = (java.nio.file.Path) r1
                java.lang.Object r5 = r12.L$4
                kotlin.io.path.PathTreeWalk r5 = (kotlin.io.path.PathTreeWalk) r5
                java.lang.Object r6 = r12.L$3
                kotlin.io.path.PathNode r6 = (kotlin.io.path.PathNode) r6
                java.lang.Object r7 = r12.L$2
                kotlin.io.path.DirectoryEntriesReader r7 = (kotlin.io.path.DirectoryEntriesReader) r7
                java.lang.Object r8 = r12.L$1
                kotlin.collections.ArrayDeque r8 = (kotlin.collections.ArrayDeque) r8
                java.lang.Object r9 = r12.L$0
                kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
                kotlin.ResultKt.throwOnFailure(r13)
                goto Ld5
            L44:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
                kotlin.collections.ArrayDeque r1 = new kotlin.collections.ArrayDeque
                r1.<init>()
                kotlin.io.path.DirectoryEntriesReader r5 = new kotlin.io.path.DirectoryEntriesReader
                kotlin.io.path.PathTreeWalk r6 = r12.this$0
                boolean r6 = kotlin.io.path.PathTreeWalk.access$getFollowLinks(r6)
                r5.<init>(r6)
                kotlin.io.path.PathNode r6 = new kotlin.io.path.PathNode
                kotlin.io.path.PathTreeWalk r7 = r12.this$0
                java.nio.file.Path r7 = kotlin.io.path.PathTreeWalk.access$getStart$p(r7)
                kotlin.io.path.PathTreeWalk r8 = r12.this$0
                java.nio.file.Path r8 = kotlin.io.path.PathTreeWalk.access$getStart$p(r8)
                kotlin.io.path.PathTreeWalk r9 = r12.this$0
                java.nio.file.LinkOption[] r9 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r9)
                java.lang.Object r8 = kotlin.io.path.PathTreeWalkKt.access$keyOf(r8, r9)
                r6.<init>(r7, r8, r4)
                r1.addLast(r6)
                r6 = r13
                r11 = r5
                r5 = r1
                r1 = r11
            L7d:
                r13 = r5
                java.util.Collection r13 = (java.util.Collection) r13
                boolean r13 = r13.isEmpty()
                if (r13 != 0) goto L134
                java.lang.Object r13 = r5.removeFirst()
                kotlin.io.path.PathNode r13 = (kotlin.io.path.PathNode) r13
                kotlin.io.path.PathTreeWalk r7 = r12.this$0
                java.nio.file.Path r8 = r13.getPath()
                java.nio.file.LinkOption[] r9 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r7)
                int r10 = r9.length
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
                java.nio.file.LinkOption[] r9 = (java.nio.file.LinkOption[]) r9
                int r10 = r9.length
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
                java.nio.file.LinkOption[] r9 = (java.nio.file.LinkOption[]) r9
                boolean r9 = java.nio.file.Files.isDirectory(r8, r9)
                if (r9 == 0) goto L109
                boolean r9 = kotlin.io.path.PathTreeWalkKt.access$createsCycle(r13)
                if (r9 != 0) goto Lff
                boolean r9 = kotlin.io.path.PathTreeWalk.access$getIncludeDirectories(r7)
                if (r9 == 0) goto Ldc
                r9 = r12
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r12.L$0 = r6
                r12.L$1 = r5
                r12.L$2 = r1
                r12.L$3 = r13
                r12.L$4 = r7
                r12.L$5 = r8
                r12.label = r3
                java.lang.Object r9 = r6.yield(r8, r9)
                if (r9 != r0) goto Lce
                return r0
            Lce:
                r9 = r6
                r6 = r13
                r11 = r7
                r7 = r1
                r1 = r8
                r8 = r5
                r5 = r11
            Ld5:
                r13 = r6
                r6 = r9
                r11 = r8
                r8 = r1
                r1 = r7
                r7 = r5
                r5 = r11
            Ldc:
                java.nio.file.LinkOption[] r7 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r7)
                int r9 = r7.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r9)
                java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
                int r9 = r7.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r9)
                java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
                boolean r7 = java.nio.file.Files.isDirectory(r8, r7)
                if (r7 == 0) goto L7d
                java.util.List r13 = r1.readEntries(r13)
                java.util.Collection r13 = (java.util.Collection) r13
                r5.addAll(r13)
                goto L7d
            Lff:
                java.nio.file.FileSystemLoopException r13 = new java.nio.file.FileSystemLoopException
                java.lang.String r0 = r8.toString()
                r13.<init>(r0)
                throw r13
            L109:
                java.nio.file.LinkOption[] r13 = new java.nio.file.LinkOption[r3]
                r7 = 0
                java.nio.file.LinkOption r9 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                r13[r7] = r9
                java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r3)
                java.nio.file.LinkOption[] r13 = (java.nio.file.LinkOption[]) r13
                boolean r13 = java.nio.file.Files.exists(r8, r13)
                if (r13 == 0) goto L7d
                r13 = r12
                kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13
                r12.L$0 = r6
                r12.L$1 = r5
                r12.L$2 = r1
                r12.L$3 = r4
                r12.L$4 = r4
                r12.L$5 = r4
                r12.label = r2
                java.lang.Object r13 = r6.yield(r8, r13)
                if (r13 != r0) goto L7d
                return r0
            L134:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
        }
    }

    /* JADX INFO: renamed from: kotlin.io.path.PathTreeWalk$dfsIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PathTreeWalk.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, 190, 199, 205}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    static final class C00571 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.nio.file.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        final /* synthetic */ kotlin.io.path.PathTreeWalk this$0;

        C00571(kotlin.io.path.PathTreeWalk r1, kotlin.coroutines.Continuation<? super kotlin.io.path.PathTreeWalk.C00571> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlin.io.path.PathTreeWalk$dfsIterator$1 r0 = new kotlin.io.path.PathTreeWalk$dfsIterator$1
                kotlin.io.path.PathTreeWalk r1 = r2.this$0
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.nio.file.Path> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super java.nio.file.Path> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlin.io.path.PathTreeWalk$dfsIterator$1 r1 = (kotlin.io.path.PathTreeWalk.C00571) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                r18 = this;
                r0 = r18
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 0
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 0
                r8 = 1
                if (r2 == 0) goto L6c
                if (r2 == r8) goto L4f
                if (r2 == r6) goto L3e
                if (r2 == r5) goto L21
                if (r2 != r4) goto L19
                goto L3e
            L19:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L21:
                java.lang.Object r2 = r0.L$5
                java.nio.file.Path r2 = (java.nio.file.Path) r2
                java.lang.Object r6 = r0.L$4
                kotlin.io.path.PathTreeWalk r6 = (kotlin.io.path.PathTreeWalk) r6
                java.lang.Object r9 = r0.L$3
                kotlin.io.path.PathNode r9 = (kotlin.io.path.PathNode) r9
                java.lang.Object r10 = r0.L$2
                kotlin.io.path.DirectoryEntriesReader r10 = (kotlin.io.path.DirectoryEntriesReader) r10
                java.lang.Object r11 = r0.L$1
                kotlin.collections.ArrayDeque r11 = (kotlin.collections.ArrayDeque) r11
                java.lang.Object r12 = r0.L$0
                kotlin.sequences.SequenceScope r12 = (kotlin.sequences.SequenceScope) r12
                kotlin.ResultKt.throwOnFailure(r19)
                goto L1b2
            L3e:
                java.lang.Object r2 = r0.L$2
                kotlin.io.path.DirectoryEntriesReader r2 = (kotlin.io.path.DirectoryEntriesReader) r2
                java.lang.Object r6 = r0.L$1
                kotlin.collections.ArrayDeque r6 = (kotlin.collections.ArrayDeque) r6
                java.lang.Object r9 = r0.L$0
                kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
                kotlin.ResultKt.throwOnFailure(r19)
                goto L142
            L4f:
                java.lang.Object r2 = r0.L$5
                java.nio.file.Path r2 = (java.nio.file.Path) r2
                java.lang.Object r6 = r0.L$4
                kotlin.io.path.PathTreeWalk r6 = (kotlin.io.path.PathTreeWalk) r6
                java.lang.Object r9 = r0.L$3
                kotlin.io.path.PathNode r9 = (kotlin.io.path.PathNode) r9
                java.lang.Object r10 = r0.L$2
                kotlin.io.path.DirectoryEntriesReader r10 = (kotlin.io.path.DirectoryEntriesReader) r10
                java.lang.Object r11 = r0.L$1
                kotlin.collections.ArrayDeque r11 = (kotlin.collections.ArrayDeque) r11
                java.lang.Object r12 = r0.L$0
                kotlin.sequences.SequenceScope r12 = (kotlin.sequences.SequenceScope) r12
                kotlin.ResultKt.throwOnFailure(r19)
                goto Le6
            L6c:
                kotlin.ResultKt.throwOnFailure(r19)
                java.lang.Object r2 = r0.L$0
                r9 = r2
                kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
                kotlin.collections.ArrayDeque r2 = new kotlin.collections.ArrayDeque
                r2.<init>()
                kotlin.io.path.DirectoryEntriesReader r10 = new kotlin.io.path.DirectoryEntriesReader
                kotlin.io.path.PathTreeWalk r11 = r0.this$0
                boolean r11 = kotlin.io.path.PathTreeWalk.access$getFollowLinks(r11)
                r10.<init>(r11)
                kotlin.io.path.PathNode r11 = new kotlin.io.path.PathNode
                kotlin.io.path.PathTreeWalk r12 = r0.this$0
                java.nio.file.Path r12 = kotlin.io.path.PathTreeWalk.access$getStart$p(r12)
                kotlin.io.path.PathTreeWalk r13 = r0.this$0
                java.nio.file.Path r13 = kotlin.io.path.PathTreeWalk.access$getStart$p(r13)
                kotlin.io.path.PathTreeWalk r14 = r0.this$0
                java.nio.file.LinkOption[] r14 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r14)
                java.lang.Object r13 = kotlin.io.path.PathTreeWalkKt.access$keyOf(r13, r14)
                r11.<init>(r12, r13, r7)
                kotlin.io.path.PathTreeWalk r12 = r0.this$0
                java.nio.file.Path r13 = r11.getPath()
                java.nio.file.LinkOption[] r14 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r12)
                int r15 = r14.length
                java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
                java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
                int r15 = r14.length
                java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
                java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
                boolean r14 = java.nio.file.Files.isDirectory(r13, r14)
                if (r14 == 0) goto L11c
                boolean r6 = kotlin.io.path.PathTreeWalkKt.access$createsCycle(r11)
                if (r6 != 0) goto L112
                boolean r6 = kotlin.io.path.PathTreeWalk.access$getIncludeDirectories(r12)
                if (r6 == 0) goto Leb
                r6 = r0
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r0.L$0 = r9
                r0.L$1 = r2
                r0.L$2 = r10
                r0.L$3 = r11
                r0.L$4 = r12
                r0.L$5 = r13
                r0.label = r8
                java.lang.Object r6 = r9.yield(r13, r6)
                if (r6 != r1) goto Le1
                return r1
            Le1:
                r6 = r12
                r12 = r9
                r9 = r11
                r11 = r2
                r2 = r13
            Le6:
                r13 = r2
                r2 = r11
                r11 = r9
                r9 = r12
                r12 = r6
            Leb:
                java.nio.file.LinkOption[] r6 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r12)
                int r12 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r12)
                java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
                int r12 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r12)
                java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
                boolean r6 = java.nio.file.Files.isDirectory(r13, r6)
                if (r6 == 0) goto L140
                java.util.List r6 = r10.readEntries(r11)
                java.util.Iterator r6 = r6.iterator()
                r11.setContentIterator(r6)
                r2.addLast(r11)
                goto L140
            L112:
                java.nio.file.FileSystemLoopException r1 = new java.nio.file.FileSystemLoopException
                java.lang.String r2 = r13.toString()
                r1.<init>(r2)
                throw r1
            L11c:
                java.nio.file.LinkOption[] r11 = new java.nio.file.LinkOption[r8]
                java.nio.file.LinkOption r12 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                r11[r3] = r12
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r8)
                java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
                boolean r11 = java.nio.file.Files.exists(r13, r11)
                if (r11 == 0) goto L140
                r11 = r0
                kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
                r0.L$0 = r9
                r0.L$1 = r2
                r0.L$2 = r10
                r0.label = r6
                java.lang.Object r6 = r9.yield(r13, r11)
                if (r6 != r1) goto L140
                return r1
            L140:
                r6 = r2
                r2 = r10
            L142:
                r10 = r6
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto L21f
                java.lang.Object r10 = r6.last()
                kotlin.io.path.PathNode r10 = (kotlin.io.path.PathNode) r10
                java.util.Iterator r10 = r10.getContentIterator()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L21a
                java.lang.Object r10 = r10.next()
                kotlin.io.path.PathNode r10 = (kotlin.io.path.PathNode) r10
                kotlin.io.path.PathTreeWalk r11 = r0.this$0
                java.nio.file.Path r12 = r10.getPath()
                java.nio.file.LinkOption[] r13 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r11)
                int r14 = r13.length
                java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r14)
                java.nio.file.LinkOption[] r13 = (java.nio.file.LinkOption[]) r13
                int r14 = r13.length
                java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r14)
                java.nio.file.LinkOption[] r13 = (java.nio.file.LinkOption[]) r13
                boolean r13 = java.nio.file.Files.isDirectory(r12, r13)
                if (r13 == 0) goto L1f0
                boolean r13 = kotlin.io.path.PathTreeWalkKt.access$createsCycle(r10)
                if (r13 != 0) goto L1e6
                boolean r13 = kotlin.io.path.PathTreeWalk.access$getIncludeDirectories(r11)
                if (r13 == 0) goto L1be
                r13 = r0
                kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13
                r0.L$0 = r9
                r0.L$1 = r6
                r0.L$2 = r2
                r0.L$3 = r10
                r0.L$4 = r11
                r0.L$5 = r12
                r0.label = r5
                java.lang.Object r13 = r9.yield(r12, r13)
                if (r13 != r1) goto L1a6
                return r1
            L1a6:
                r16 = r10
                r10 = r2
                r2 = r12
                r12 = r9
                r9 = r16
                r17 = r11
                r11 = r6
                r6 = r17
            L1b2:
                r16 = r12
                r12 = r2
                r2 = r10
                r10 = r9
                r9 = r16
                r17 = r11
                r11 = r6
                r6 = r17
            L1be:
                java.nio.file.LinkOption[] r11 = kotlin.io.path.PathTreeWalk.access$getLinkOptions(r11)
                int r13 = r11.length
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r13)
                java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
                int r13 = r11.length
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r13)
                java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
                boolean r11 = java.nio.file.Files.isDirectory(r12, r11)
                if (r11 == 0) goto L142
                java.util.List r11 = r2.readEntries(r10)
                java.util.Iterator r11 = r11.iterator()
                r10.setContentIterator(r11)
                r6.addLast(r10)
                goto L142
            L1e6:
                java.nio.file.FileSystemLoopException r1 = new java.nio.file.FileSystemLoopException
                java.lang.String r2 = r12.toString()
                r1.<init>(r2)
                throw r1
            L1f0:
                java.nio.file.LinkOption[] r10 = new java.nio.file.LinkOption[r8]
                java.nio.file.LinkOption r11 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                r10[r3] = r11
                java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r8)
                java.nio.file.LinkOption[] r10 = (java.nio.file.LinkOption[]) r10
                boolean r10 = java.nio.file.Files.exists(r12, r10)
                if (r10 == 0) goto L142
                r10 = r0
                kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
                r0.L$0 = r9
                r0.L$1 = r6
                r0.L$2 = r2
                r0.L$3 = r7
                r0.L$4 = r7
                r0.L$5 = r7
                r0.label = r4
                java.lang.Object r10 = r9.yield(r12, r10)
                if (r10 != r1) goto L142
                return r1
            L21a:
                r6.removeLast()
                goto L142
            L21f:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public PathTreeWalk(java.nio.file.Path r2, kotlin.io.path.PathWalkOption[] r3) {
            r1 = this;
            java.lang.String r0 = "start"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.start = r2
            r1.options = r3
            return
    }

    public static final /* synthetic */ boolean access$getFollowLinks(kotlin.io.path.PathTreeWalk r0) {
            boolean r0 = r0.getFollowLinks()
            return r0
    }

    public static final /* synthetic */ boolean access$getIncludeDirectories(kotlin.io.path.PathTreeWalk r0) {
            boolean r0 = r0.getIncludeDirectories()
            return r0
    }

    public static final /* synthetic */ java.nio.file.LinkOption[] access$getLinkOptions(kotlin.io.path.PathTreeWalk r0) {
            java.nio.file.LinkOption[] r0 = r0.getLinkOptions()
            return r0
    }

    public static final /* synthetic */ java.nio.file.Path access$getStart$p(kotlin.io.path.PathTreeWalk r0) {
            java.nio.file.Path r0 = r0.start
            return r0
    }

    private final java.util.Iterator<java.nio.file.Path> bfsIterator() {
            r2 = this;
            kotlin.io.path.PathTreeWalk$bfsIterator$1 r0 = new kotlin.io.path.PathTreeWalk$bfsIterator$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.util.Iterator r0 = kotlin.sequences.SequencesKt.iterator(r0)
            return r0
    }

    private final java.util.Iterator<java.nio.file.Path> dfsIterator() {
            r2 = this;
            kotlin.io.path.PathTreeWalk$dfsIterator$1 r0 = new kotlin.io.path.PathTreeWalk$dfsIterator$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.util.Iterator r0 = kotlin.sequences.SequencesKt.iterator(r0)
            return r0
    }

    private final boolean getFollowLinks() {
            r2 = this;
            kotlin.io.path.PathWalkOption[] r0 = r2.options
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.FOLLOW_LINKS
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            return r0
    }

    private final boolean getIncludeDirectories() {
            r2 = this;
            kotlin.io.path.PathWalkOption[] r0 = r2.options
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.INCLUDE_DIRECTORIES
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            return r0
    }

    private final java.nio.file.LinkOption[] getLinkOptions() {
            r2 = this;
            kotlin.io.path.LinkFollowing r0 = kotlin.io.path.LinkFollowing.INSTANCE
            boolean r1 = r2.getFollowLinks()
            java.nio.file.LinkOption[] r0 = r0.toLinkOptions(r1)
            return r0
    }

    private final boolean isBFS() {
            r2 = this;
            kotlin.io.path.PathWalkOption[] r0 = r2.options
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.BREADTH_FIRST
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            return r0
    }

    private final java.lang.Object yieldIfNeeded(kotlin.sequences.SequenceScope<? super java.nio.file.Path> r5, kotlin.io.path.PathNode r6, kotlin.io.path.DirectoryEntriesReader r7, kotlin.jvm.functions.Function1<? super java.util.List<kotlin.io.path.PathNode>, kotlin.Unit> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            r4 = this;
            java.nio.file.Path r0 = r6.getPath()
            java.nio.file.LinkOption[] r1 = access$getLinkOptions(r4)
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.isDirectory(r0, r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L5d
            boolean r1 = kotlin.io.path.PathTreeWalkKt.access$createsCycle(r6)
            if (r1 != 0) goto L53
            boolean r1 = access$getIncludeDirectories(r4)
            if (r1 == 0) goto L33
            kotlin.jvm.internal.InlineMarker.mark(r2)
            r5.yield(r0, r9)
            kotlin.jvm.internal.InlineMarker.mark(r3)
        L33:
            java.nio.file.LinkOption[] r5 = access$getLinkOptions(r4)
            int r9 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r9)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            int r9 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r9)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            boolean r5 = java.nio.file.Files.isDirectory(r0, r5)
            if (r5 == 0) goto L7b
            java.util.List r5 = r7.readEntries(r6)
            r8.invoke(r5)
            goto L7b
        L53:
            java.nio.file.FileSystemLoopException r5 = new java.nio.file.FileSystemLoopException
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L5d:
            java.nio.file.LinkOption[] r6 = new java.nio.file.LinkOption[r3]
            java.nio.file.LinkOption r7 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r6[r2] = r7
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r3)
            java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
            boolean r6 = java.nio.file.Files.exists(r0, r6)
            if (r6 == 0) goto L7b
            kotlin.jvm.internal.InlineMarker.mark(r2)
            r5.yield(r0, r9)
            kotlin.jvm.internal.InlineMarker.mark(r3)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L7b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<java.nio.file.Path> iterator() {
            r1 = this;
            boolean r0 = r1.isBFS()
            if (r0 == 0) goto Lb
            java.util.Iterator r0 = r1.bfsIterator()
            goto Lf
        Lb:
            java.util.Iterator r0 = r1.dfsIterator()
        Lf:
            return r0
    }
}
