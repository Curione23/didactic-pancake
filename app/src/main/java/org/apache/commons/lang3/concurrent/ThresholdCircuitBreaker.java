package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class ThresholdCircuitBreaker extends org.apache.commons.lang3.concurrent.AbstractCircuitBreaker<java.lang.Long> {
    private static final long INITIAL_COUNT = 0;
    private final long threshold;
    private final java.util.concurrent.atomic.AtomicLong used;

    public ThresholdCircuitBreaker(long r4) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r3.used = r0
            r3.threshold = r4
            return
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean checkState() {
            r1 = this;
            boolean r0 = r1.isOpen()
            r0 = r0 ^ 1
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public void close() {
            r3 = this;
            super.close()
            java.util.concurrent.atomic.AtomicLong r0 = r3.used
            r1 = 0
            r0.set(r1)
            return
    }

    public long getThreshold() {
            r2 = this;
            long r0 = r2.threshold
            return r0
    }

    public boolean incrementAndCheckState(java.lang.Long r5) {
            r4 = this;
            long r0 = r4.threshold
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            r4.open()
        Lb:
            java.util.concurrent.atomic.AtomicLong r0 = r4.used
            long r1 = r5.longValue()
            long r0 = r0.addAndGet(r1)
            long r2 = r4.threshold
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L1e
            r4.open()
        L1e:
            boolean r5 = r4.checkState()
            return r5
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public /* bridge */ /* synthetic */ boolean incrementAndCheckState(java.lang.Object r1) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            boolean r1 = r0.incrementAndCheckState(r1)
            return r1
    }
}
