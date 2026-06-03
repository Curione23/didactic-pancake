package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public final class ChecksumInputStream extends org.apache.commons.io.input.CountingInputStream {
    private final long countThreshold;
    private final long expectedChecksumValue;

    /* JADX INFO: renamed from: org.apache.commons.io.input.ChecksumInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.ChecksumInputStream, org.apache.commons.io.input.ChecksumInputStream.Builder> {
        private java.util.zip.Checksum checksum;
        private long countThreshold;
        private long expectedChecksumValue;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.countThreshold = r0
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.ChecksumInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.ChecksumInputStream get() throws java.io.IOException {
                r9 = this;
                org.apache.commons.io.input.ChecksumInputStream r8 = new org.apache.commons.io.input.ChecksumInputStream
                java.io.InputStream r1 = r9.getInputStream()
                java.util.zip.Checksum r2 = r9.checksum
                long r3 = r9.expectedChecksumValue
                long r5 = r9.countThreshold
                r7 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r5, r7)
                return r8
        }

        public org.apache.commons.io.input.ChecksumInputStream.Builder setChecksum(java.util.zip.Checksum r1) {
                r0 = this;
                r0.checksum = r1
                return r0
        }

        public org.apache.commons.io.input.ChecksumInputStream.Builder setCountThreshold(long r1) {
                r0 = this;
                r0.countThreshold = r1
                return r0
        }

        public org.apache.commons.io.input.ChecksumInputStream.Builder setExpectedChecksumValue(long r1) {
                r0 = this;
                r0.expectedChecksumValue = r1
                return r0
        }
    }

    private ChecksumInputStream(java.io.InputStream r2, java.util.zip.Checksum r3, long r4, long r6) {
            r1 = this;
            java.util.zip.CheckedInputStream r0 = new java.util.zip.CheckedInputStream
            r0.<init>(r2, r3)
            r1.<init>(r0)
            r1.countThreshold = r6
            r1.expectedChecksumValue = r4
            return
    }

    /* synthetic */ ChecksumInputStream(java.io.InputStream r1, java.util.zip.Checksum r2, long r3, long r5, org.apache.commons.io.input.ChecksumInputStream.AnonymousClass1 r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public static org.apache.commons.io.input.ChecksumInputStream.Builder builder() {
            org.apache.commons.io.input.ChecksumInputStream$Builder r0 = new org.apache.commons.io.input.ChecksumInputStream$Builder
            r0.<init>()
            return r0
    }

    private java.util.zip.Checksum getChecksum() {
            r1 = this;
            java.io.InputStream r0 = r1.in
            java.util.zip.CheckedInputStream r0 = (java.util.zip.CheckedInputStream) r0
            java.util.zip.Checksum r0 = r0.getChecksum()
            return r0
    }

    @Override // org.apache.commons.io.input.CountingInputStream, org.apache.commons.io.input.ProxyInputStream
    protected synchronized void afterRead(int r5) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            super.afterRead(r5)     // Catch: java.lang.Throwable -> L32
            long r0 = r4.countThreshold     // Catch: java.lang.Throwable -> L32
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L16
            long r0 = r4.getByteCount()     // Catch: java.lang.Throwable -> L32
            long r2 = r4.countThreshold     // Catch: java.lang.Throwable -> L32
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L19
        L16:
            r0 = -1
            if (r5 != r0) goto L30
        L19:
            long r0 = r4.expectedChecksumValue     // Catch: java.lang.Throwable -> L32
            java.util.zip.Checksum r5 = r4.getChecksum()     // Catch: java.lang.Throwable -> L32
            long r2 = r5.getValue()     // Catch: java.lang.Throwable -> L32
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L28
            goto L30
        L28:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "Checksum verification failed."
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L32
            throw r5     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r4)
            return
        L32:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            throw r5
    }

    public long getRemaining() {
            r4 = this;
            long r0 = r4.countThreshold
            long r2 = r4.getByteCount()
            long r0 = r0 - r2
            return r0
    }
}
