package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class BrokenReader extends java.io.Reader {
    public static final org.apache.commons.io.input.BrokenReader INSTANCE = null;
    private final java.util.function.Supplier<java.lang.Throwable> exceptionSupplier;

    static {
            org.apache.commons.io.input.BrokenReader r0 = new org.apache.commons.io.input.BrokenReader
            r0.<init>()
            org.apache.commons.io.input.BrokenReader.INSTANCE = r0
            return
    }

    public BrokenReader() {
            r1 = this;
            org.apache.commons.io.input.BrokenReader$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.input.BrokenReader$$ExternalSyntheticLambda2
            r0.<init>()
            r1.<init>(r0)
            return
    }

    @java.lang.Deprecated
    public BrokenReader(java.io.IOException r2) {
            r1 = this;
            org.apache.commons.io.input.BrokenReader$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.input.BrokenReader$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public BrokenReader(java.lang.Throwable r2) {
            r1 = this;
            org.apache.commons.io.input.BrokenReader$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.input.BrokenReader$$ExternalSyntheticLambda1
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public BrokenReader(java.util.function.Supplier<java.lang.Throwable> r1) {
            r0 = this;
            r0.<init>()
            r0.exceptionSupplier = r1
            return
    }

    static /* synthetic */ java.lang.Throwable lambda$new$0() {
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Broken reader"
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

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.lang.RuntimeException r0 = r1.rethrow()
            throw r0
    }

    @Override // java.io.Reader
    public void mark(int r1) throws java.io.IOException {
            r0 = this;
            java.lang.RuntimeException r1 = r0.rethrow()
            throw r1
    }

    @Override // java.io.Reader
    public int read(char[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            java.lang.RuntimeException r1 = r0.rethrow()
            throw r1
    }

    @Override // java.io.Reader
    public boolean ready() throws java.io.IOException {
            r1 = this;
            java.lang.RuntimeException r0 = r1.rethrow()
            throw r0
    }

    @Override // java.io.Reader
    public void reset() throws java.io.IOException {
            r1 = this;
            java.lang.RuntimeException r0 = r1.rethrow()
            throw r0
    }

    @Override // java.io.Reader
    public long skip(long r1) throws java.io.IOException {
            r0 = this;
            java.lang.RuntimeException r1 = r0.rethrow()
            throw r1
    }
}
