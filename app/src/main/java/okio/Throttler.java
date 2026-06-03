package okio;

/* JADX INFO: compiled from: Throttler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0014J$\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u001bJ\f\u0010\u001c\u001a\u00020\u0004*\u00020\u0004H\u0002J\f\u0010\u001d\u001a\u00020\u0004*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lokio/Throttler;", "", "()V", "allocatedUntil", "", "(J)V", "bytesPerSecond", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "maxByteCount", "waitByteCount", "byteCountOrWaitNanos", "now", "byteCount", "byteCountOrWaitNanos$okio", "", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "take", "take$okio", "bytesToNanos", "nanosToBytes", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private final java.util.concurrent.locks.Condition condition;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private long maxByteCount;
    private long waitByteCount;



    public Throttler() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            r2.<init>(r0)
            return
    }

    public Throttler(long r1) {
            r0 = this;
            r0.<init>()
            r0.allocatedUntil = r1
            r1 = 8192(0x2000, double:4.0474E-320)
            r0.waitByteCount = r1
            r1 = 262144(0x40000, double:1.295163E-318)
            r0.maxByteCount = r1
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r0.lock = r1
            java.util.concurrent.locks.Condition r1 = r1.newCondition()
            java.lang.String r2 = "newCondition(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.condition = r1
            return
    }

    public static /* synthetic */ void bytesPerSecond$default(okio.Throttler r7, long r8, long r10, long r12, int r14, java.lang.Object r15) {
            r15 = r14 & 2
            if (r15 == 0) goto L6
            long r10 = r7.waitByteCount
        L6:
            r3 = r10
            r10 = r14 & 4
            if (r10 == 0) goto Ld
            long r12 = r7.maxByteCount
        Ld:
            r5 = r12
            r0 = r7
            r1 = r8
            r0.bytesPerSecond(r1, r3, r5)
            return
    }

    private final long bytesToNanos(long r3) {
            r2 = this;
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r3 = r3 * r0
            long r0 = r2.bytesPerSecond
            long r3 = r3 / r0
            return r3
    }

    private final long nanosToBytes(long r3) {
            r2 = this;
            long r0 = r2.bytesPerSecond
            long r3 = r3 * r0
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r3 = r3 / r0
            return r3
    }

    public final long byteCountOrWaitNanos$okio(long r10, long r12) {
            r9 = this;
            long r0 = r9.bytesPerSecond
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L9
            return r12
        L9:
            long r0 = r9.allocatedUntil
            long r0 = r0 - r10
            long r0 = java.lang.Math.max(r0, r2)
            long r4 = r9.maxByteCount
            long r6 = r9.nanosToBytes(r0)
            long r4 = r4 - r6
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 < 0) goto L24
            long r10 = r10 + r0
            long r0 = r9.bytesToNanos(r12)
            long r10 = r10 + r0
            r9.allocatedUntil = r10
            return r12
        L24:
            long r6 = r9.waitByteCount
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L34
            long r12 = r9.maxByteCount
            long r12 = r9.bytesToNanos(r12)
            long r10 = r10 + r12
            r9.allocatedUntil = r10
            return r4
        L34:
            long r12 = java.lang.Math.min(r6, r12)
            long r4 = r9.maxByteCount
            long r4 = r12 - r4
            long r4 = r9.bytesToNanos(r4)
            long r0 = r0 + r4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L4f
            long r0 = r9.maxByteCount
            long r0 = r9.bytesToNanos(r0)
            long r10 = r10 + r0
            r9.allocatedUntil = r10
            return r12
        L4f:
            long r10 = -r0
            return r10
    }

    public final void bytesPerSecond(long r10) {
            r9 = this;
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            bytesPerSecond$default(r0, r1, r3, r5, r7, r8)
            return
    }

    public final void bytesPerSecond(long r10, long r12) {
            r9 = this;
            r7 = 4
            r8 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            r3 = r12
            bytesPerSecond$default(r0, r1, r3, r5, r7, r8)
            return
    }

    public final void bytesPerSecond(long r6, long r8, long r10) {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            java.lang.String r4 = "Failed requirement."
            if (r3 < 0) goto L3c
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L32
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 < 0) goto L28
            r5.bytesPerSecond = r6     // Catch: java.lang.Throwable -> L46
            r5.waitByteCount = r8     // Catch: java.lang.Throwable -> L46
            r5.maxByteCount = r10     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.locks.Condition r6 = r5.condition     // Catch: java.lang.Throwable -> L46
            r6.signalAll()     // Catch: java.lang.Throwable -> L46
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L46
            r0.unlock()
            return
        L28:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L46
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L46
            throw r6     // Catch: java.lang.Throwable -> L46
        L32:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L46
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L46
            throw r6     // Catch: java.lang.Throwable -> L46
        L3c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L46
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L46
            throw r6     // Catch: java.lang.Throwable -> L46
        L46:
            r6 = move-exception
            r0.unlock()
            throw r6
    }

    public final java.util.concurrent.locks.Condition getCondition() {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.condition
            return r0
    }

    public final java.util.concurrent.locks.ReentrantLock getLock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            return r0
    }

    public final okio.Sink sink(okio.Sink r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Throttler$sink$1 r0 = new okio.Throttler$sink$1
            r0.<init>(r2, r1)
            okio.Sink r0 = (okio.Sink) r0
            return r0
    }

    public final okio.Source source(okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Throttler$source$1 r0 = new okio.Throttler$source$1
            r0.<init>(r2, r1)
            okio.Source r0 = (okio.Source) r0
            return r0
    }

    public final long take$okio(long r7) {
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L29
            java.util.concurrent.locks.ReentrantLock r2 = r6.lock
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
        Ld:
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L24
            long r3 = r6.byteCountOrWaitNanos$okio(r3, r7)     // Catch: java.lang.Throwable -> L24
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 < 0) goto L1d
            r2.unlock()
            return r3
        L1d:
            java.util.concurrent.locks.Condition r5 = r6.condition     // Catch: java.lang.Throwable -> L24
            long r3 = -r3
            r5.awaitNanos(r3)     // Catch: java.lang.Throwable -> L24
            goto Ld
        L24:
            r7 = move-exception
            r2.unlock()
            throw r7
        L29:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Failed requirement."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }
}
