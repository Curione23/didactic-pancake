package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public final class UncheckedFilterInputStream extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: org.apache.commons.io.input.UncheckedFilterInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.UncheckedFilterInputStream, org.apache.commons.io.input.UncheckedFilterInputStream.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.UncheckedFilterInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.UncheckedFilterInputStream get() {
                r1 = this;
                org.apache.commons.io.input.UncheckedFilterInputStream$Builder$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.input.UncheckedFilterInputStream$Builder$$ExternalSyntheticLambda0
                r0.<init>(r1)
                java.lang.Object r0 = org.apache.commons.io.function.Uncheck.get(r0)
                org.apache.commons.io.input.UncheckedFilterInputStream r0 = (org.apache.commons.io.input.UncheckedFilterInputStream) r0
                return r0
        }

        /* JADX INFO: renamed from: lambda$get$0$org-apache-commons-io-input-UncheckedFilterInputStream$Builder, reason: not valid java name */
        /* synthetic */ org.apache.commons.io.input.UncheckedFilterInputStream m2626xbffad909() throws java.io.IOException {
                r3 = this;
                org.apache.commons.io.input.UncheckedFilterInputStream r0 = new org.apache.commons.io.input.UncheckedFilterInputStream
                java.io.InputStream r1 = r3.getInputStream()
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private UncheckedFilterInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* synthetic */ UncheckedFilterInputStream(java.io.InputStream r1, org.apache.commons.io.input.UncheckedFilterInputStream.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.apache.commons.io.input.UncheckedFilterInputStream.Builder builder() {
            org.apache.commons.io.input.UncheckedFilterInputStream$Builder r0 = new org.apache.commons.io.input.UncheckedFilterInputStream$Builder
            r0.<init>()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda4
            r0.<init>(r1)
            java.lang.Object r0 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda3
            r0.<init>(r1)
            org.apache.commons.io.function.Uncheck.run(r0)
            return
    }

    /* JADX INFO: renamed from: lambda$available$0$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ java.lang.Integer m2619xe65b9a5f() throws java.io.IOException {
            r1 = this;
            int r0 = super.available()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: lambda$close$1$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ void m2620x2286bf6f() throws java.io.IOException {
            r0 = this;
            super.close()
            return
    }

    /* JADX INFO: renamed from: lambda$read$2$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ java.lang.Integer m2621x2766e7d6() throws java.io.IOException {
            r1 = this;
            int r0 = super.read()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: lambda$read$3$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ java.lang.Integer m2622x289d3ab5(byte[] r1) throws java.io.IOException {
            r0 = this;
            int r1 = super.read(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    /* JADX INFO: renamed from: lambda$read$4$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ java.lang.Integer m2623x29d38d94(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            int r1 = super.read(r1, r2, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    /* JADX INFO: renamed from: lambda$reset$5$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ void m2624x2dd38774() throws java.io.IOException {
            r0 = this;
            super.reset()
            return
    }

    /* JADX INFO: renamed from: lambda$skip$6$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ java.lang.Long m2625x2b981389(long r1) throws java.io.IOException {
            r0 = this;
            long r1 = super.skip(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda0
            r0.<init>(r1)
            java.lang.Object r0 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda6 r0 = new org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda6
            r0.<init>(r1)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda2
            r0.<init>(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2, r3, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.UncheckedIOException {
            r1 = this;
            monitor-enter(r1)
            org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb
            org.apache.commons.io.function.Uncheck.run(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda5 r0 = new org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda5
            r0.<init>(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            return r2
    }
}
