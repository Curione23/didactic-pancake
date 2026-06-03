package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"fixedDelayTicker", "", "delayMillis", "", "initialDelayMillis", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "(JJLkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fixedPeriodTicker", "ticker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "context", "Lkotlin/coroutines/CoroutineContext;", "mode", "Lkotlinx/coroutines/channels/TickerMode;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TickerChannelsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1, reason: invalid class name */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                r6.result = r7
                int r7 = r6.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r7 | r0
                r6.label = r7
                r4 = 0
                r5 = r6
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r0 = 0
                r2 = 0
                java.lang.Object r7 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedDelayTicker(r0, r2, r4, r5)
                return r7
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    static final class C01301 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        long J$1;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C01301(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.C01301> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                r6.result = r7
                int r7 = r6.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r7 | r0
                r6.label = r7
                r4 = 0
                r5 = r6
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r0 = 0
                r2 = 0
                java.lang.Object r7 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedPeriodTicker(r0, r2, r4, r5)
                return r7
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3, reason: invalid class name */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $initialDelayMillis;
        final /* synthetic */ kotlinx.coroutines.channels.TickerMode $mode;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3$WhenMappings */
        /* JADX INFO: compiled from: TickerChannels.kt */
        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    kotlinx.coroutines.channels.TickerMode[] r0 = kotlinx.coroutines.channels.TickerMode.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD
                    int r1 = r1.ordinal()
                    r2 = 1
                    r0[r1] = r2
                    kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_DELAY
                    int r1 = r1.ordinal()
                    r2 = 2
                    r0[r1] = r2
                    kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        AnonymousClass3(kotlinx.coroutines.channels.TickerMode r1, long r2, long r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3> r6) {
                r0 = this;
                r0.$mode = r1
                r0.$delayMillis = r2
                r0.$initialDelayMillis = r4
                r1 = 2
                r0.<init>(r1, r6)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r9, kotlin.coroutines.Continuation<?> r10) {
                r8 = this;
                kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r7 = new kotlinx.coroutines.channels.TickerChannelsKt$ticker$3
                kotlinx.coroutines.channels.TickerMode r1 = r8.$mode
                long r2 = r8.$delayMillis
                long r4 = r8.$initialDelayMillis
                r0 = r7
                r6 = r10
                r0.<init>(r1, r2, r4, r6)
                r7.L$0 = r9
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                return r7
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r1 = (kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 == r3) goto Le
                if (r1 != r2) goto L12
            Le:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L5a
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                kotlinx.coroutines.channels.TickerMode r1 = r10.$mode
                int[] r4 = kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3.WhenMappings.$EnumSwitchMapping$0
                int r1 = r1.ordinal()
                r1 = r4[r1]
                if (r1 == r3) goto L44
                if (r1 == r2) goto L30
                goto L5a
            L30:
                long r4 = r10.$delayMillis
                long r6 = r10.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r8 = r11.getChannel()
                r9 = r10
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r10.label = r2
                java.lang.Object r11 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedDelayTicker(r4, r6, r8, r9)
                if (r11 != r0) goto L5a
                return r0
            L44:
                long r1 = r10.$delayMillis
                long r4 = r10.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r11 = r11.getChannel()
                r6 = r10
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r10.label = r3
                r3 = r4
                r5 = r11
                java.lang.Object r11 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedPeriodTicker(r1, r3, r5, r6)
                if (r11 != r0) goto L5a
                return r0
            L5a:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }

    public static final /* synthetic */ java.lang.Object access$fixedDelayTicker(long r0, long r2, kotlinx.coroutines.channels.SendChannel r4, kotlin.coroutines.Continuation r5) {
            java.lang.Object r0 = fixedDelayTicker(r0, r2, r4, r5)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$fixedPeriodTicker(long r0, long r2, kotlinx.coroutines.channels.SendChannel r4, kotlin.coroutines.Continuation r5) {
            java.lang.Object r0 = fixedPeriodTicker(r0, r2, r4, r5)
            return r0
    }

    private static final java.lang.Object fixedDelayTicker(long r6, long r8, kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            kotlin.ResultKt.throwOnFailure(r11)
        L35:
            r10 = r8
            goto L64
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            kotlin.ResultKt.throwOnFailure(r11)
            goto L74
        L49:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            r10 = r8
            kotlinx.coroutines.channels.SendChannel r10 = (kotlinx.coroutines.channels.SendChannel) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L64
        L54:
            kotlin.ResultKt.throwOnFailure(r11)
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r5
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r8, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r4
            java.lang.Object r8 = r10.send(r8, r0)
            if (r8 != r1) goto L73
            return r1
        L73:
            r8 = r10
        L74:
            r0.L$0 = r8
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r0)
            if (r9 != r1) goto L35
            return r1
    }

    private static final java.lang.Object fixedPeriodTicker(long r18, long r20, kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
            r0 = r23
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.TickerChannelsKt.C01301
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = (kotlinx.coroutines.channels.TickerChannelsKt.C01301) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L1b
        L16:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            r1.<init>(r0)
        L1b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L7a
            if (r3 == r7) goto L6c
            if (r3 == r6) goto L60
            if (r3 == r5) goto L4d
            if (r3 != r4) goto L45
            long r7 = r1.J$1
            long r9 = r1.J$0
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.throwOnFailure(r0)
            r11 = r4
            r0 = r5
        L3e:
            r16 = r7
            r7 = r9
            r9 = r16
            goto L116
        L45:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4d:
            long r7 = r1.J$1
            long r9 = r1.J$0
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
        L59:
            r16 = r7
            r7 = r9
            r9 = r16
            goto Lfd
        L60:
            long r7 = r1.J$1
            long r9 = r1.J$0
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lc3
        L6c:
            long r7 = r1.J$1
            long r9 = r1.J$0
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r3
            r10 = r9
            goto La7
        L7a:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto L88
            long r8 = r0.nanoTime()
            goto L8c
        L88:
            long r8 = java.lang.System.nanoTime()
        L8c:
            long r10 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r20)
            long r8 = r8 + r10
            r0 = r22
            r1.L$0 = r0
            r10 = r18
            r1.J$0 = r10
            r1.J$1 = r8
            r1.label = r7
            r12 = r20
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r12, r1)
            if (r3 != r2) goto La6
            return r2
        La6:
            r7 = r8
        La7:
            long r9 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r10)
        Lab:
            long r7 = r7 + r9
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            r1.L$0 = r0
            r1.J$0 = r7
            r1.J$1 = r9
            r1.label = r6
            java.lang.Object r3 = r0.send(r3, r1)
            if (r3 != r2) goto Lbd
            return r2
        Lbd:
            r3 = r0
            r16 = r7
            r7 = r9
            r9 = r16
        Lc3:
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto Lce
            long r11 = r0.nanoTime()
            goto Ld2
        Lce:
            long r11 = java.lang.System.nanoTime()
        Ld2:
            long r13 = r9 - r11
            r4 = 0
            long r13 = kotlin.ranges.RangesKt.coerceAtLeast(r13, r4)
            int r15 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r15 != 0) goto L101
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 == 0) goto L101
            long r4 = r11 - r9
            long r4 = r4 % r7
            long r4 = r7 - r4
            long r9 = r11 + r4
            long r4 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r4)
            r1.L$0 = r3
            r1.J$0 = r9
            r1.J$1 = r7
            r0 = 3
            r1.label = r0
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.delay(r4, r1)
            if (r4 != r2) goto L59
            return r2
        Lfd:
            r5 = r0
            r0 = r3
            r4 = 4
            goto Lab
        L101:
            r0 = 3
            long r4 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r13)
            r1.L$0 = r3
            r1.J$0 = r9
            r1.J$1 = r7
            r11 = 4
            r1.label = r11
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.delay(r4, r1)
            if (r4 != r2) goto L3e
            return r2
        L116:
            r5 = r0
            r0 = r3
            r4 = r11
            goto Lab
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> ticker(long r9, long r11, kotlin.coroutines.CoroutineContext r13, kotlinx.coroutines.channels.TickerMode r14) {
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            java.lang.String r3 = " ms"
            if (r2 < 0) goto L47
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L2a
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r13 = r1.plus(r13)
            kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r8 = new kotlinx.coroutines.channels.TickerChannelsKt$ticker$3
            r7 = 0
            r1 = r8
            r2 = r14
            r3 = r9
            r5 = r11
            r1.<init>(r2, r3, r5, r7)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r9 = 0
            kotlinx.coroutines.channels.ReceiveChannel r9 = kotlinx.coroutines.channels.ProduceKt.produce(r0, r13, r9, r8)
            return r9
        L2a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Expected non-negative initial delay, but has "
            r9.<init>(r10)
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L47:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Expected non-negative delay, but has "
            r11.<init>(r12)
            java.lang.StringBuilder r9 = r11.append(r9)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel ticker$default(long r0, long r2, kotlin.coroutines.CoroutineContext r4, kotlinx.coroutines.channels.TickerMode r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r2 = r0
        L5:
            r7 = r6 & 4
            if (r7 == 0) goto Ld
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
        Ld:
            r6 = r6 & 8
            if (r6 == 0) goto L13
            kotlinx.coroutines.channels.TickerMode r5 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD
        L13:
            kotlinx.coroutines.channels.ReceiveChannel r0 = ticker(r0, r2, r4, r5)
            return r0
    }
}
