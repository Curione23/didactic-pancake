package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyWriter extends java.io.FilterWriter {
    public ProxyWriter(java.io.Writer r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected void afterWrite(int r1) throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char r3) throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.beforeWrite(r0)     // Catch: java.io.IOException -> Ld
            java.io.Writer r1 = r2.out     // Catch: java.io.IOException -> Ld
            r1.append(r3)     // Catch: java.io.IOException -> Ld
            r2.afterWrite(r0)     // Catch: java.io.IOException -> Ld
            goto L11
        Ld:
            r3 = move-exception
            r2.handleIOException(r3)
        L11:
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r3) throws java.io.IOException {
            r2 = this;
            int r0 = org.apache.commons.io.IOUtils.length(r3)     // Catch: java.io.IOException -> L10
            r2.beforeWrite(r0)     // Catch: java.io.IOException -> L10
            java.io.Writer r1 = r2.out     // Catch: java.io.IOException -> L10
            r1.append(r3)     // Catch: java.io.IOException -> L10
            r2.afterWrite(r0)     // Catch: java.io.IOException -> L10
            goto L14
        L10:
            r3 = move-exception
            r2.handleIOException(r3)
        L14:
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            int r0 = r5 - r4
            r2.beforeWrite(r0)     // Catch: java.io.IOException -> Le
            java.io.Writer r1 = r2.out     // Catch: java.io.IOException -> Le
            r1.append(r3, r4, r5)     // Catch: java.io.IOException -> Le
            r2.afterWrite(r0)     // Catch: java.io.IOException -> Le
            goto L12
        Le:
            r3 = move-exception
            r2.handleIOException(r3)
        L12:
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

    protected void beforeWrite(int r1) throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.Writer r0 = r2.out
            org.apache.commons.io.output.ProxyWriter$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.output.ProxyWriter$$ExternalSyntheticLambda0
            r1.<init>(r2)
            org.apache.commons.io.IOUtils.close(r0, r1)
            return
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.io.Writer r0 = r1.out     // Catch: java.io.IOException -> L6
            r0.flush()     // Catch: java.io.IOException -> L6
            goto La
        L6:
            r0 = move-exception
            r1.handleIOException(r0)
        La:
            return
    }

    protected void handleIOException(java.io.IOException r1) throws java.io.IOException {
            r0 = this;
            throw r1
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.beforeWrite(r0)     // Catch: java.io.IOException -> Ld
            java.io.Writer r1 = r2.out     // Catch: java.io.IOException -> Ld
            r1.write(r3)     // Catch: java.io.IOException -> Ld
            r2.afterWrite(r0)     // Catch: java.io.IOException -> Ld
            goto L11
        Ld:
            r3 = move-exception
            r2.handleIOException(r3)
        L11:
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            int r0 = org.apache.commons.io.IOUtils.length(r3)     // Catch: java.io.IOException -> L10
            r2.beforeWrite(r0)     // Catch: java.io.IOException -> L10
            java.io.Writer r1 = r2.out     // Catch: java.io.IOException -> L10
            r1.write(r3)     // Catch: java.io.IOException -> L10
            r2.afterWrite(r0)     // Catch: java.io.IOException -> L10
            goto L14
        L10:
            r3 = move-exception
            r2.handleIOException(r3)
        L14:
            return
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(java.lang.String r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.beforeWrite(r4)     // Catch: java.io.IOException -> Lc
            java.io.Writer r0 = r1.out     // Catch: java.io.IOException -> Lc
            r0.write(r2, r3, r4)     // Catch: java.io.IOException -> Lc
            r1.afterWrite(r4)     // Catch: java.io.IOException -> Lc
            goto L10
        Lc:
            r2 = move-exception
            r1.handleIOException(r2)
        L10:
            return
    }

    @Override // java.io.Writer
    public void write(char[] r3) throws java.io.IOException {
            r2 = this;
            int r0 = org.apache.commons.io.IOUtils.length(r3)     // Catch: java.io.IOException -> L10
            r2.beforeWrite(r0)     // Catch: java.io.IOException -> L10
            java.io.Writer r1 = r2.out     // Catch: java.io.IOException -> L10
            r1.write(r3)     // Catch: java.io.IOException -> L10
            r2.afterWrite(r0)     // Catch: java.io.IOException -> L10
            goto L14
        L10:
            r3 = move-exception
            r2.handleIOException(r3)
        L14:
            return
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.beforeWrite(r4)     // Catch: java.io.IOException -> Lc
            java.io.Writer r0 = r1.out     // Catch: java.io.IOException -> Lc
            r0.write(r2, r3, r4)     // Catch: java.io.IOException -> Lc
            r1.afterWrite(r4)     // Catch: java.io.IOException -> Lc
            goto L10
        Lc:
            r2 = move-exception
            r1.handleIOException(r2)
        L10:
            return
    }
}
