package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public final class ThrottledInputStream extends org.apache.commons.io.input.CountingInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long maxBytesPerSecond;
    private final long startTime;
    private java.time.Duration totalSleepDuration;

    /* JADX INFO: renamed from: org.apache.commons.io.input.ThrottledInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.ThrottledInputStream, org.apache.commons.io.input.ThrottledInputStream.Builder> {
        private long maxBytesPerSecond;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.maxBytesPerSecond = r0
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.ThrottledInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.ThrottledInputStream get() throws java.io.IOException {
                r5 = this;
                org.apache.commons.io.input.ThrottledInputStream r0 = new org.apache.commons.io.input.ThrottledInputStream
                java.io.InputStream r1 = r5.getInputStream()
                long r2 = r5.maxBytesPerSecond
                r4 = 0
                r0.<init>(r1, r2, r4)
                return r0
        }

        public void setMaxBytesPerSecond(long r1) {
                r0 = this;
                r0.maxBytesPerSecond = r1
                return
        }
    }

    static {
            return
    }

    private ThrottledInputStream(java.io.InputStream r3, long r4) {
            r2 = this;
            r2.<init>(r3)
            long r0 = java.lang.System.currentTimeMillis()
            r2.startTime = r0
            java.time.Duration r3 = java.time.Duration.ZERO
            r2.totalSleepDuration = r3
            r2.maxBytesPerSecond = r4
            return
    }

    /* synthetic */ ThrottledInputStream(java.io.InputStream r1, long r2, org.apache.commons.io.input.ThrottledInputStream.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.apache.commons.io.input.ThrottledInputStream.Builder builder() {
            org.apache.commons.io.input.ThrottledInputStream$Builder r0 = new org.apache.commons.io.input.ThrottledInputStream$Builder
            r0.<init>()
            return r0
    }

    private long getBytesPerSecond() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.startTime
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L15
            long r0 = r4.getByteCount()
            return r0
        L15:
            long r2 = r4.getByteCount()
            long r2 = r2 / r0
            return r2
    }

    private long getSleepMillis() {
            r8 = this;
            long r0 = r8.getByteCount()
            long r2 = r8.maxBytesPerSecond
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.startTime
            long r4 = r4 - r6
            long r0 = toSleepMillis(r0, r2, r4)
            return r0
    }

    private void throttle() throws java.io.InterruptedIOException {
            r4 = this;
            long r0 = r4.getSleepMillis()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L22
            java.time.Duration r2 = r4.totalSleepDuration
            java.time.temporal.ChronoUnit r3 = java.time.temporal.ChronoUnit.MILLIS
            java.time.Duration r2 = r2.plus(r0, r3)
            r4.totalSleepDuration = r2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L1a
            r2.sleep(r0)     // Catch: java.lang.InterruptedException -> L1a
            goto L22
        L1a:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "Thread aborted"
            r0.<init>(r1)
            throw r0
        L22:
            return
    }

    static long toSleepMillis(long r3, long r5, long r7) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L21
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L21
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto Lf
            goto L21
        Lf:
            double r3 = (double) r3
            double r5 = (double) r5
            double r3 = r3 / r5
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 * r5
            double r5 = (double) r7
            double r3 = r3 - r5
            long r3 = (long) r3
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L20
            return r0
        L20:
            return r3
        L21:
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    protected void beforeRead(int r1) throws java.io.IOException {
            r0 = this;
            r0.throttle()
            return
    }

    java.time.Duration getTotalSleepDuration() {
            r1 = this;
            java.time.Duration r0 = r1.totalSleepDuration
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ThrottledInputStream[bytesRead="
            r0.<init>(r1)
            long r1 = r3.getByteCount()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", maxBytesPerSec="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.maxBytesPerSecond
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", bytesPerSec="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.getBytesPerSecond()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", totalSleepDuration="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.time.Duration r1 = r3.totalSleepDuration
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
