package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class BrokenOutputStream extends java.io.OutputStream {
    public static final org.apache.commons.io.output.BrokenOutputStream INSTANCE = null;
    private final java.util.function.Supplier<java.lang.Throwable> exceptionSupplier;

    static {
            org.apache.commons.io.output.BrokenOutputStream r0 = new org.apache.commons.io.output.BrokenOutputStream
            r0.<init>()
            org.apache.commons.io.output.BrokenOutputStream.INSTANCE = r0
            return
    }

    public BrokenOutputStream() {
            r1 = this;
            org.apache.commons.io.output.BrokenOutputStream$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.output.BrokenOutputStream$$ExternalSyntheticLambda1
            r0.<init>()
            r1.<init>(r0)
            return
    }

    @java.lang.Deprecated
    public BrokenOutputStream(java.io.IOException r2) {
            r1 = this;
            org.apache.commons.io.output.BrokenOutputStream$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.output.BrokenOutputStream$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public BrokenOutputStream(java.lang.Throwable r2) {
            r1 = this;
            org.apache.commons.io.output.BrokenOutputStream$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.output.BrokenOutputStream$$ExternalSyntheticLambda2
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public BrokenOutputStream(java.util.function.Supplier<java.lang.Throwable> r1) {
            r0 = this;
            r0.<init>()
            r0.exceptionSupplier = r1
            return
    }

    static /* synthetic */ java.lang.Throwable lambda$new$0() {
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Broken output stream"
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

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.lang.RuntimeException r0 = r1.rethrow()
            throw r0
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.lang.RuntimeException r0 = r1.rethrow()
            throw r0
    }

    @Override // java.io.OutputStream
    public void write(int r1) throws java.io.IOException {
            r0 = this;
            java.lang.RuntimeException r1 = r0.rethrow()
            throw r1
    }
}
