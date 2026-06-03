package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public final class UncheckedFilterReader extends java.io.FilterReader {

    /* JADX INFO: renamed from: org.apache.commons.io.input.UncheckedFilterReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.UncheckedFilterReader, org.apache.commons.io.input.UncheckedFilterReader.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.UncheckedFilterReader r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.UncheckedFilterReader get() {
                r1 = this;
                org.apache.commons.io.input.UncheckedFilterReader$Builder$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.input.UncheckedFilterReader$Builder$$ExternalSyntheticLambda0
                r0.<init>(r1)
                java.lang.Object r0 = org.apache.commons.io.function.Uncheck.get(r0)
                org.apache.commons.io.input.UncheckedFilterReader r0 = (org.apache.commons.io.input.UncheckedFilterReader) r0
                return r0
        }

        /* JADX INFO: renamed from: lambda$get$0$org-apache-commons-io-input-UncheckedFilterReader$Builder, reason: not valid java name */
        /* synthetic */ org.apache.commons.io.input.UncheckedFilterReader m2636x24463752() throws java.io.IOException {
                r3 = this;
                org.apache.commons.io.input.UncheckedFilterReader r0 = new org.apache.commons.io.input.UncheckedFilterReader
                java.io.Reader r1 = r3.getReader()
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private UncheckedFilterReader(java.io.Reader r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* synthetic */ UncheckedFilterReader(java.io.Reader r1, org.apache.commons.io.input.UncheckedFilterReader.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.apache.commons.io.input.UncheckedFilterReader.Builder builder() {
            org.apache.commons.io.input.UncheckedFilterReader$Builder r0 = new org.apache.commons.io.input.UncheckedFilterReader$Builder
            r0.<init>()
            return r0
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda3
            r0.<init>(r1)
            org.apache.commons.io.function.Uncheck.run(r0)
            return
    }

    /* JADX INFO: renamed from: lambda$close$0$org-apache-commons-io-input-UncheckedFilterReader, reason: not valid java name */
    /* synthetic */ void m2627lambda$close$0$orgapachecommonsioinputUncheckedFilterReader() throws java.io.IOException {
            r0 = this;
            super.close()
            return
    }

    /* JADX INFO: renamed from: lambda$mark$1$org-apache-commons-io-input-UncheckedFilterReader, reason: not valid java name */
    /* synthetic */ void m2628lambda$mark$1$orgapachecommonsioinputUncheckedFilterReader(int r1) throws java.io.IOException {
            r0 = this;
            super.mark(r1)
            return
    }

    /* JADX INFO: renamed from: lambda$read$2$org-apache-commons-io-input-UncheckedFilterReader, reason: not valid java name */
    /* synthetic */ java.lang.Integer m2629lambda$read$2$orgapachecommonsioinputUncheckedFilterReader() throws java.io.IOException {
            r1 = this;
            int r0 = super.read()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: lambda$read$3$org-apache-commons-io-input-UncheckedFilterReader, reason: not valid java name */
    /* synthetic */ java.lang.Integer m2630lambda$read$3$orgapachecommonsioinputUncheckedFilterReader(char[] r1) throws java.io.IOException {
            r0 = this;
            int r1 = super.read(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    /* JADX INFO: renamed from: lambda$read$4$org-apache-commons-io-input-UncheckedFilterReader, reason: not valid java name */
    /* synthetic */ java.lang.Integer m2631lambda$read$4$orgapachecommonsioinputUncheckedFilterReader(char[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            int r1 = super.read(r1, r2, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    /* JADX INFO: renamed from: lambda$read$5$org-apache-commons-io-input-UncheckedFilterReader, reason: not valid java name */
    /* synthetic */ java.lang.Integer m2632lambda$read$5$orgapachecommonsioinputUncheckedFilterReader(java.nio.CharBuffer r1) throws java.io.IOException {
            r0 = this;
            int r1 = super.read(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    /* JADX INFO: renamed from: lambda$ready$6$org-apache-commons-io-input-UncheckedFilterReader, reason: not valid java name */
    /* synthetic */ java.lang.Boolean m2633lambda$ready$6$orgapachecommonsioinputUncheckedFilterReader() throws java.io.IOException {
            r1 = this;
            boolean r0 = super.ready()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: lambda$reset$7$org-apache-commons-io-input-UncheckedFilterReader, reason: not valid java name */
    /* synthetic */ void m2634lambda$reset$7$orgapachecommonsioinputUncheckedFilterReader() throws java.io.IOException {
            r0 = this;
            super.reset()
            return
    }

    /* JADX INFO: renamed from: lambda$skip$8$org-apache-commons-io-input-UncheckedFilterReader, reason: not valid java name */
    /* synthetic */ java.lang.Long m2635lambda$skip$8$orgapachecommonsioinputUncheckedFilterReader(long r1) throws java.io.IOException {
            r0 = this;
            long r1 = super.skip(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
    }

    @Override // java.io.FilterReader, java.io.Reader
    public void mark(int r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda6 r0 = new org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda6
            r0.<init>(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            org.apache.commons.io.function.Uncheck.accept(r0, r2)
            return
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda0
            r0.<init>(r1)
            java.lang.Object r0 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(java.nio.CharBuffer r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda2
            r0.<init>(r1)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    @Override // java.io.Reader
    public int read(char[] r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda4
            r0.<init>(r1)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] r2, int r3, int r4) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda1
            r0.<init>(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2, r3, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda5 r0 = new org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda5
            r0.<init>(r1)
            java.lang.Object r0 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // java.io.FilterReader, java.io.Reader
    public void reset() throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda7 r0 = new org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda7
            r0.<init>(r1)
            org.apache.commons.io.function.Uncheck.run(r0)
            return
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda8 r0 = new org.apache.commons.io.input.UncheckedFilterReader$$ExternalSyntheticLambda8
            r0.<init>(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            return r2
    }
}
