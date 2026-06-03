package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class BrokenWriter extends java.io.Writer {
    public static final org.apache.commons.io.output.BrokenWriter INSTANCE = null;
    private final java.util.function.Supplier<java.lang.Throwable> exceptionSupplier;

    static {
            org.apache.commons.io.output.BrokenWriter r0 = new org.apache.commons.io.output.BrokenWriter
            r0.<init>()
            org.apache.commons.io.output.BrokenWriter.INSTANCE = r0
            return
    }

    public BrokenWriter() {
            r1 = this;
            org.apache.commons.io.output.BrokenWriter$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.output.BrokenWriter$$ExternalSyntheticLambda0
            r0.<init>()
            r1.<init>(r0)
            return
    }

    @java.lang.Deprecated
    public BrokenWriter(java.io.IOException r2) {
            r1 = this;
            org.apache.commons.io.output.BrokenWriter$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.output.BrokenWriter$$ExternalSyntheticLambda2
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public BrokenWriter(java.lang.Throwable r2) {
            r1 = this;
            org.apache.commons.io.output.BrokenWriter$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.output.BrokenWriter$$ExternalSyntheticLambda1
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public BrokenWriter(java.util.function.Supplier<java.lang.Throwable> r1) {
            r0 = this;
            r0.<init>()
            r0.exceptionSupplier = r1
            return
    }

    static /* synthetic */ java.lang.Throwable lambda$new$0() {
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Broken writer"
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ java.lang.Throwable lambda$new$1(java.io.IOException r0) {
            return r0
    }

    static /* synthetic */ java.lang.Throwable lambda$new$2(java.lang.Throwable r0) {
            return r0
    }

    private java.lang.RuntimeException rethrow() {
            r1 = this;
            java.util.function.Supplier<java.lang.Throwable> r0 = r1.exceptionSupplier
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = org.apache.commons.io.function.Erase.rethrow(r0)
            return r0
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.lang.RuntimeException r0 = r1.rethrow()
            throw r0
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.lang.RuntimeException r0 = r1.rethrow()
            throw r0
    }

    @Override // java.io.Writer
    public void write(char[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            java.lang.RuntimeException r1 = r0.rethrow()
            throw r1
    }
}
