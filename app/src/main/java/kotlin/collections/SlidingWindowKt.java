package kotlin.collections;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SlidingWindowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.SlidingWindowKt$windowedIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SlidingWindow.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.util.List<? extends T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.Iterator<T> $iterator;
        final /* synthetic */ boolean $partialWindows;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        AnonymousClass1(int r1, int r2, java.util.Iterator<? extends T> r3, boolean r4, boolean r5, kotlin.coroutines.Continuation<? super kotlin.collections.SlidingWindowKt.AnonymousClass1> r6) {
                r0 = this;
                r0.$size = r1
                r0.$step = r2
                r0.$iterator = r3
                r0.$reuseBuffer = r4
                r0.$partialWindows = r5
                r1 = 2
                r0.<init>(r1, r6)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r9, kotlin.coroutines.Continuation<?> r10) {
                r8 = this;
                kotlin.collections.SlidingWindowKt$windowedIterator$1 r7 = new kotlin.collections.SlidingWindowKt$windowedIterator$1
                int r1 = r8.$size
                int r2 = r8.$step
                java.util.Iterator<T> r3 = r8.$iterator
                boolean r4 = r8.$reuseBuffer
                boolean r5 = r8.$partialWindows
                r0 = r7
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.L$0 = r9
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                return r7
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.util.List<? extends T>> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlin.collections.SlidingWindowKt$windowedIterator$1 r1 = (kotlin.collections.SlidingWindowKt.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L57
                if (r1 == r6) goto L44
                if (r1 == r5) goto L3f
                if (r1 == r4) goto L2e
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                goto L3f
            L19:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L21:
                java.lang.Object r1 = r10.L$1
                kotlin.collections.RingBuffer r1 = (kotlin.collections.RingBuffer) r1
                java.lang.Object r4 = r10.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
                goto L165
            L2e:
                java.lang.Object r1 = r10.L$2
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r10.L$1
                kotlin.collections.RingBuffer r5 = (kotlin.collections.RingBuffer) r5
                java.lang.Object r6 = r10.L$0
                kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
                kotlin.ResultKt.throwOnFailure(r11)
                goto L12d
            L3f:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L186
            L44:
                int r1 = r10.I$0
                java.lang.Object r2 = r10.L$2
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r10.L$1
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r4 = r10.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
            L55:
                r11 = r1
                goto La8
            L57:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlin.sequences.SequenceScope r11 = (kotlin.sequences.SequenceScope) r11
                int r1 = r10.$size
                r8 = 1024(0x400, float:1.435E-42)
                int r1 = kotlin.ranges.RangesKt.coerceAtMost(r1, r8)
                int r8 = r10.$step
                int r9 = r10.$size
                int r8 = r8 - r9
                if (r8 < 0) goto Le1
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                java.util.Iterator<T> r1 = r10.$iterator
                r3 = 0
                r4 = r11
                r11 = r3
                r3 = r2
                r2 = r1
                r1 = r8
            L7a:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto Lba
                java.lang.Object r8 = r2.next()
                if (r11 <= 0) goto L89
                int r11 = r11 + (-1)
                goto L7a
            L89:
                r3.add(r8)
                int r8 = r3.size()
                int r9 = r10.$size
                if (r8 != r9) goto L7a
                r11 = r10
                kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
                r10.L$0 = r4
                r10.L$1 = r3
                r10.L$2 = r2
                r10.I$0 = r1
                r10.label = r6
                java.lang.Object r11 = r4.yield(r3, r11)
                if (r11 != r0) goto L55
                return r0
            La8:
                boolean r1 = r10.$reuseBuffer
                if (r1 == 0) goto Lb0
                r3.clear()
                goto Lb8
            Lb0:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r10.$size
                r1.<init>(r3)
                r3 = r1
            Lb8:
                r1 = r11
                goto L7a
            Lba:
                r11 = r3
                java.util.Collection r11 = (java.util.Collection) r11
                boolean r11 = r11.isEmpty()
                if (r11 != 0) goto L186
                boolean r11 = r10.$partialWindows
                if (r11 != 0) goto Lcf
                int r11 = r3.size()
                int r1 = r10.$size
                if (r11 != r1) goto L186
            Lcf:
                r11 = r10
                kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
                r10.L$0 = r7
                r10.L$1 = r7
                r10.L$2 = r7
                r10.label = r5
                java.lang.Object r11 = r4.yield(r3, r11)
                if (r11 != r0) goto L186
                return r0
            Le1:
                kotlin.collections.RingBuffer r5 = new kotlin.collections.RingBuffer
                r5.<init>(r1)
                java.util.Iterator<T> r1 = r10.$iterator
                r6 = r11
            Le9:
                boolean r11 = r1.hasNext()
                if (r11 == 0) goto L133
                java.lang.Object r11 = r1.next()
                r5.add(r11)
                boolean r11 = r5.isFull()
                if (r11 == 0) goto Le9
                int r11 = r5.size()
                int r8 = r10.$size
                if (r11 >= r8) goto L109
                kotlin.collections.RingBuffer r5 = r5.expanded(r8)
                goto Le9
            L109:
                boolean r11 = r10.$reuseBuffer
                if (r11 == 0) goto L111
                r11 = r5
                java.util.List r11 = (java.util.List) r11
                goto L11b
            L111:
                java.util.ArrayList r11 = new java.util.ArrayList
                r8 = r5
                java.util.Collection r8 = (java.util.Collection) r8
                r11.<init>(r8)
                java.util.List r11 = (java.util.List) r11
            L11b:
                r8 = r10
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r10.L$0 = r6
                r10.L$1 = r5
                r10.L$2 = r1
                r10.label = r4
                java.lang.Object r11 = r6.yield(r11, r8)
                if (r11 != r0) goto L12d
                return r0
            L12d:
                int r11 = r10.$step
                r5.removeFirst(r11)
                goto Le9
            L133:
                boolean r11 = r10.$partialWindows
                if (r11 == 0) goto L186
                r1 = r5
                r4 = r6
            L139:
                int r11 = r1.size()
                int r5 = r10.$step
                if (r11 <= r5) goto L16b
                boolean r11 = r10.$reuseBuffer
                if (r11 == 0) goto L149
                r11 = r1
                java.util.List r11 = (java.util.List) r11
                goto L153
            L149:
                java.util.ArrayList r11 = new java.util.ArrayList
                r5 = r1
                java.util.Collection r5 = (java.util.Collection) r5
                r11.<init>(r5)
                java.util.List r11 = (java.util.List) r11
            L153:
                r5 = r10
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r10.L$0 = r4
                r10.L$1 = r1
                r10.L$2 = r7
                r10.label = r3
                java.lang.Object r11 = r4.yield(r11, r5)
                if (r11 != r0) goto L165
                return r0
            L165:
                int r11 = r10.$step
                r1.removeFirst(r11)
                goto L139
            L16b:
                r11 = r1
                java.util.Collection r11 = (java.util.Collection) r11
                boolean r11 = r11.isEmpty()
                if (r11 != 0) goto L186
                r11 = r10
                kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
                r10.L$0 = r7
                r10.L$1 = r7
                r10.L$2 = r7
                r10.label = r2
                java.lang.Object r11 = r4.yield(r1, r11)
                if (r11 != r0) goto L186
                return r0
            L186:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }

    public static final void checkWindowSizeStep(int r3, int r4) {
            if (r3 <= 0) goto L5
            if (r4 <= 0) goto L5
            return
        L5:
            java.lang.String r0 = " must be greater than zero."
            if (r3 == r4) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Both size "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " and step "
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            goto L3a
        L27:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "size "
            r4.<init>(r1)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
        L3a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public static final <T> java.util.Iterator<java.util.List<T>> windowedIterator(java.util.Iterator<? extends T> r8, int r9, int r10, boolean r11, boolean r12) {
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L10
            kotlin.collections.EmptyIterator r8 = kotlin.collections.EmptyIterator.INSTANCE
            java.util.Iterator r8 = (java.util.Iterator) r8
            return r8
        L10:
            kotlin.collections.SlidingWindowKt$windowedIterator$1 r7 = new kotlin.collections.SlidingWindowKt$windowedIterator$1
            r6 = 0
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r8
            r4 = r12
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.util.Iterator r8 = kotlin.sequences.SequencesKt.iterator(r7)
            return r8
    }

    public static final <T> kotlin.sequences.Sequence<java.util.List<T>> windowedSequence(kotlin.sequences.Sequence<? extends T> r7, int r8, int r9, boolean r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            checkWindowSizeStep(r8, r9)
            kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1 r0 = new kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            return r0
    }
}
