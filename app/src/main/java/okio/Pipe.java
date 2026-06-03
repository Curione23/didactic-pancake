package okio;

/* JADX INFO: compiled from: Pipe.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u0014J\r\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0002\b,J\r\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\b-J&\u0010.\u001a\u00020**\u00020\u00142\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020*00¢\u0006\u0002\b1H\u0082\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u00020\u00148G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u0013\u0010#\u001a\u00020$8G¢\u0006\b\n\u0000\u001a\u0004\b#\u0010%R\u001a\u0010&\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000e¨\u00062"}, d2 = {"Lokio/Pipe;", "", "maxBufferSize", "", "(J)V", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "canceled", "", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "()Lokio/Sink;", "setFoldedSink$okio", "(Lokio/Sink;)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "getMaxBufferSize$okio", "()J", "sink", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", "source", "Lokio/Source;", "()Lokio/Source;", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "cancel", "", "fold", "-deprecated_sink", "-deprecated_source", "forward", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Pipe {
    private final okio.Buffer buffer;
    private boolean canceled;
    private final java.util.concurrent.locks.Condition condition;
    private okio.Sink foldedSink;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final long maxBufferSize;
    private final okio.Sink sink;
    private boolean sinkClosed;
    private final okio.Source source;
    private boolean sourceClosed;



    public Pipe(long r3) {
            r2 = this;
            r2.<init>()
            r2.maxBufferSize = r3
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r2.buffer = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.lock = r0
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            java.lang.String r1 = "newCondition(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.condition = r0
            r0 = 1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L37
            okio.Pipe$sink$1 r3 = new okio.Pipe$sink$1
            r3.<init>(r2)
            okio.Sink r3 = (okio.Sink) r3
            r2.sink = r3
            okio.Pipe$source$1 r3 = new okio.Pipe$source$1
            r3.<init>(r2)
            okio.Source r3 = (okio.Source) r3
            r2.source = r3
            return
        L37:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "maxBufferSize < 1: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    private final void forward(okio.Sink r13, kotlin.jvm.functions.Function1<? super okio.Sink, kotlin.Unit> r14) {
            r12 = this;
            okio.Timeout r0 = r13.timeout()
            okio.Sink r1 = r12.sink()
            okio.Timeout r1 = r1.timeout()
            long r2 = r0.timeoutNanos()
            okio.Timeout$Companion r4 = okio.Timeout.Companion
            long r5 = r1.timeoutNanos()
            long r7 = r0.timeoutNanos()
            long r4 = r4.minTimeout(r5, r7)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r4, r6)
            boolean r4 = r0.hasDeadline()
            r5 = 1
            if (r4 == 0) goto L73
            long r6 = r0.deadlineNanoTime()
            boolean r4 = r1.hasDeadline()
            if (r4 == 0) goto L43
            long r8 = r0.deadlineNanoTime()
            long r10 = r1.deadlineNanoTime()
            long r8 = java.lang.Math.min(r8, r10)
            r0.deadlineNanoTime(r8)
        L43:
            r14.invoke(r13)     // Catch: java.lang.Throwable -> L5d
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5d
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r2, r13)
            boolean r13 = r1.hasDeadline()
            if (r13 == 0) goto L59
            r0.deadlineNanoTime(r6)
        L59:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            goto L99
        L5d:
            r13 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r2, r14)
            boolean r14 = r1.hasDeadline()
            if (r14 == 0) goto L6f
            r0.deadlineNanoTime(r6)
        L6f:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            throw r13
        L73:
            boolean r4 = r1.hasDeadline()
            if (r4 == 0) goto L80
            long r6 = r1.deadlineNanoTime()
            r0.deadlineNanoTime(r6)
        L80:
            r14.invoke(r13)     // Catch: java.lang.Throwable -> L9a
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9a
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r2, r13)
            boolean r13 = r1.hasDeadline()
            if (r13 == 0) goto L96
            r0.clearDeadline()
        L96:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
        L99:
            return
        L9a:
            r13 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r2, r14)
            boolean r14 = r1.hasDeadline()
            if (r14 == 0) goto Lac
            r0.clearDeadline()
        Lac:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            throw r13
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sink", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name */
    public final okio.Sink m2535deprecated_sink() {
            r1 = this;
            okio.Sink r0 = r1.sink
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "source", imports = {}))
    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name */
    public final okio.Source m2536deprecated_source() {
            r1 = this;
            okio.Source r0 = r1.source
            return r0
    }

    public final void cancel() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            r1 = 1
            r2.canceled = r1     // Catch: java.lang.Throwable -> L1a
            okio.Buffer r1 = r2.buffer     // Catch: java.lang.Throwable -> L1a
            r1.clear()     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.locks.Condition r1 = r2.condition     // Catch: java.lang.Throwable -> L1a
            r1.signalAll()     // Catch: java.lang.Throwable -> L1a
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1a
            r0.unlock()
            return
        L1a:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final void fold(okio.Sink r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
        L5:
            java.util.concurrent.locks.ReentrantLock r0 = r7.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            okio.Sink r1 = r7.foldedSink     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L74
            boolean r1 = r7.canceled     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L6a
            okio.Buffer r1 = r7.buffer     // Catch: java.lang.Throwable -> L80
            boolean r1 = r1.exhausted()     // Catch: java.lang.Throwable -> L80
            r2 = 1
            if (r1 == 0) goto L25
            r7.sourceClosed = r2     // Catch: java.lang.Throwable -> L80
            r7.foldedSink = r8     // Catch: java.lang.Throwable -> L80
            r0.unlock()
            return
        L25:
            boolean r1 = r7.sinkClosed     // Catch: java.lang.Throwable -> L80
            okio.Buffer r3 = new okio.Buffer     // Catch: java.lang.Throwable -> L80
            r3.<init>()     // Catch: java.lang.Throwable -> L80
            okio.Buffer r4 = r7.buffer     // Catch: java.lang.Throwable -> L80
            long r5 = r4.size()     // Catch: java.lang.Throwable -> L80
            r3.write(r4, r5)     // Catch: java.lang.Throwable -> L80
            java.util.concurrent.locks.Condition r4 = r7.condition     // Catch: java.lang.Throwable -> L80
            r4.signalAll()     // Catch: java.lang.Throwable -> L80
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L80
            r0.unlock()
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L50
            r8.write(r3, r4)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L4c
            r8.close()     // Catch: java.lang.Throwable -> L50
            goto L5
        L4c:
            r8.flush()     // Catch: java.lang.Throwable -> L50
            goto L5
        L50:
            r8 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r7.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            r7.sourceClosed = r2     // Catch: java.lang.Throwable -> L65
            java.util.concurrent.locks.Condition r1 = r7.condition     // Catch: java.lang.Throwable -> L65
            r1.signalAll()     // Catch: java.lang.Throwable -> L65
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L65
            r0.unlock()
            throw r8
        L65:
            r8 = move-exception
            r0.unlock()
            throw r8
        L6a:
            r7.foldedSink = r8     // Catch: java.lang.Throwable -> L80
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L80
            java.lang.String r1 = "canceled"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L80
            throw r8     // Catch: java.lang.Throwable -> L80
        L74:
            java.lang.String r8 = "sink already folded"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L80
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L80
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L80
            throw r1     // Catch: java.lang.Throwable -> L80
        L80:
            r8 = move-exception
            r0.unlock()
            throw r8
    }

    public final okio.Buffer getBuffer$okio() {
            r1 = this;
            okio.Buffer r0 = r1.buffer
            return r0
    }

    public final boolean getCanceled$okio() {
            r1 = this;
            boolean r0 = r1.canceled
            return r0
    }

    public final java.util.concurrent.locks.Condition getCondition() {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.condition
            return r0
    }

    public final okio.Sink getFoldedSink$okio() {
            r1 = this;
            okio.Sink r0 = r1.foldedSink
            return r0
    }

    public final java.util.concurrent.locks.ReentrantLock getLock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            return r0
    }

    public final long getMaxBufferSize$okio() {
            r2 = this;
            long r0 = r2.maxBufferSize
            return r0
    }

    public final boolean getSinkClosed$okio() {
            r1 = this;
            boolean r0 = r1.sinkClosed
            return r0
    }

    public final boolean getSourceClosed$okio() {
            r1 = this;
            boolean r0 = r1.sourceClosed
            return r0
    }

    public final void setCanceled$okio(boolean r1) {
            r0 = this;
            r0.canceled = r1
            return
    }

    public final void setFoldedSink$okio(okio.Sink r1) {
            r0 = this;
            r0.foldedSink = r1
            return
    }

    public final void setSinkClosed$okio(boolean r1) {
            r0 = this;
            r0.sinkClosed = r1
            return
    }

    public final void setSourceClosed$okio(boolean r1) {
            r0 = this;
            r0.sourceClosed = r1
            return
    }

    public final okio.Sink sink() {
            r1 = this;
            okio.Sink r0 = r1.sink
            return r0
    }

    public final okio.Source source() {
            r1 = this;
            okio.Source r0 = r1.source
            return r0
    }
}
