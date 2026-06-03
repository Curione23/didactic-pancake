package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public final class UncheckedFilterOutputStream extends java.io.FilterOutputStream {

    /* JADX INFO: renamed from: org.apache.commons.io.output.UncheckedFilterOutputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.output.UncheckedFilterOutputStream, org.apache.commons.io.output.UncheckedFilterOutputStream.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.output.UncheckedFilterOutputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.output.UncheckedFilterOutputStream get() throws java.io.IOException {
                r3 = this;
                org.apache.commons.io.output.UncheckedFilterOutputStream r0 = new org.apache.commons.io.output.UncheckedFilterOutputStream
                java.io.OutputStream r1 = r3.getOutputStream()
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private UncheckedFilterOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* synthetic */ UncheckedFilterOutputStream(java.io.OutputStream r1, org.apache.commons.io.output.UncheckedFilterOutputStream.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.apache.commons.io.output.UncheckedFilterOutputStream.Builder builder() {
            org.apache.commons.io.output.UncheckedFilterOutputStream$Builder r0 = new org.apache.commons.io.output.UncheckedFilterOutputStream$Builder
            r0.<init>()
            return r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda4
            r0.<init>(r1)
            org.apache.commons.io.function.Uncheck.run(r0)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda3
            r0.<init>(r1)
            org.apache.commons.io.function.Uncheck.run(r0)
            return
    }

    /* JADX INFO: renamed from: lambda$close$0$org-apache-commons-io-output-UncheckedFilterOutputStream, reason: not valid java name */
    /* synthetic */ void m2643x705c6664() throws java.io.IOException {
            r0 = this;
            super.close()
            return
    }

    /* JADX INFO: renamed from: lambda$flush$1$org-apache-commons-io-output-UncheckedFilterOutputStream, reason: not valid java name */
    /* synthetic */ void m2644x3ee88f7() throws java.io.IOException {
            r0 = this;
            super.flush()
            return
    }

    /* JADX INFO: renamed from: lambda$write$2$org-apache-commons-io-output-UncheckedFilterOutputStream, reason: not valid java name */
    /* synthetic */ void m2645x6026fe5b(byte[] r1) throws java.io.IOException {
            r0 = this;
            super.write(r1)
            return
    }

    /* JADX INFO: renamed from: lambda$write$3$org-apache-commons-io-output-UncheckedFilterOutputStream, reason: not valid java name */
    /* synthetic */ void m2646xed14157a(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            super.write(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: lambda$write$4$org-apache-commons-io-output-UncheckedFilterOutputStream, reason: not valid java name */
    /* synthetic */ void m2647x7a012c99(int r1) throws java.io.IOException {
            r0 = this;
            super.write(r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda0
            r0.<init>(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            org.apache.commons.io.function.Uncheck.accept(r0, r2)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda1
            r0.<init>(r1)
            org.apache.commons.io.function.Uncheck.accept(r0, r2)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) throws java.io.UncheckedIOException {
            r1 = this;
            org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda2
            r0.<init>(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            org.apache.commons.io.function.Uncheck.accept(r0, r2, r3, r4)
            return
    }
}
