package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public final class UncheckedFilterWriter extends java.io.FilterWriter {

    /* JADX INFO: renamed from: org.apache.commons.io.output.UncheckedFilterWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.output.UncheckedFilterWriter, org.apache.commons.io.output.UncheckedFilterWriter.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.output.UncheckedFilterWriter r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.output.UncheckedFilterWriter get() throws java.io.IOException {
                r3 = this;
                org.apache.commons.io.output.UncheckedFilterWriter r0 = new org.apache.commons.io.output.UncheckedFilterWriter
                java.io.Writer r1 = r3.getWriter()
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private UncheckedFilterWriter(java.io.Writer r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* synthetic */ UncheckedFilterWriter(java.io.Writer r1, org.apache.commons.io.output.UncheckedFilterWriter.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.apache.commons.io.output.UncheckedFilterWriter.Builder builder() {
            org.apache.commons.io.output.UncheckedFilterWriter$Builder r0 = new org.apache.commons.io.output.UncheckedFilterWriter$Builder
            r0.<init>()
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda1
            r0.<init>(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2)
            java.io.Writer r2 = (java.io.Writer) r2
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda0
            r0.<init>(r1)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2)
            java.io.Writer r2 = (java.io.Writer) r2
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r2, int r3, int r4) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda5 r0 = new org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda5
            r0.<init>(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2, r3, r4)
            java.io.Writer r2 = (java.io.Writer) r2
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda6 r0 = new org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda6
            r0.<init>(r1)
            org.apache.commons.io.function.Uncheck.run(r0)
            return
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda4
            r0.<init>(r1)
            org.apache.commons.io.function.Uncheck.run(r0)
            return
    }

    /* JADX INFO: renamed from: lambda$append$0$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ java.io.Writer m2648xc7671afa(char r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = super.append(r1)
            return r1
    }

    /* JADX INFO: renamed from: lambda$append$1$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ java.io.Writer m2649xf53fb559(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = super.append(r1)
            return r1
    }

    /* JADX INFO: renamed from: lambda$append$2$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ java.io.Writer m2650x23184fb8(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = super.append(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: lambda$close$3$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2651x17bbe853() throws java.io.IOException {
            r0 = this;
            super.close()
            return
    }

    /* JADX INFO: renamed from: lambda$flush$4$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2652x41f43526() throws java.io.IOException {
            r0 = this;
            super.flush()
            return
    }

    /* JADX INFO: renamed from: lambda$write$5$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2653x7979858a(char[] r1) throws java.io.IOException {
            r0 = this;
            super.write(r1)
            return
    }

    /* JADX INFO: renamed from: lambda$write$6$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2654xa7521fe9(char[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            super.write(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: lambda$write$7$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2655xd52aba48(int r1) throws java.io.IOException {
            r0 = this;
            super.write(r1)
            return
    }

    /* JADX INFO: renamed from: lambda$write$8$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2656x30354a7(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            super.write(r1)
            return
    }

    /* JADX INFO: renamed from: lambda$write$9$org-apache-commons-io-output-UncheckedFilterWriter, reason: not valid java name */
    /* synthetic */ void m2657x30dbef06(java.lang.String r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            super.write(r1, r2, r3)
            return
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda9 r0 = new org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda9
            r0.<init>(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            org.apache.commons.io.function.Uncheck.accept(r0, r2)
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda8 r0 = new org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda8
            r0.<init>(r1)
            org.apache.commons.io.function.Uncheck.accept(r0, r2)
            return
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(java.lang.String r2, int r3, int r4) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda2
            r0.<init>(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            org.apache.commons.io.function.Uncheck.accept(r0, r2, r3, r4)
            return
    }

    @Override // java.io.Writer
    public void write(char[] r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda7 r0 = new org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda7
            r0.<init>(r1)
            org.apache.commons.io.function.Uncheck.accept(r0, r2)
            return
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] r2, int r3, int r4) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.output.UncheckedFilterWriter$$ExternalSyntheticLambda3
            r0.<init>(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            org.apache.commons.io.function.Uncheck.accept(r0, r2, r3, r4)
            return
    }
}
