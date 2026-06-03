package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyCollectionWriter extends org.apache.commons.io.output.FilterCollectionWriter {
    public ProxyCollectionWriter(java.util.Collection<java.io.Writer> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ProxyCollectionWriter(java.io.Writer... r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected void afterWrite(int r1) throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.beforeWrite(r0)     // Catch: java.io.IOException -> Lb
            super.append(r2)     // Catch: java.io.IOException -> Lb
            r1.afterWrite(r0)     // Catch: java.io.IOException -> Lb
            goto Lf
        Lb:
            r2 = move-exception
            r1.handleIOException(r2)
        Lf:
            return r1
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r2) throws java.io.IOException {
            r1 = this;
            int r0 = org.apache.commons.io.IOUtils.length(r2)     // Catch: java.io.IOException -> Le
            r1.beforeWrite(r0)     // Catch: java.io.IOException -> Le
            super.append(r2)     // Catch: java.io.IOException -> Le
            r1.afterWrite(r0)     // Catch: java.io.IOException -> Le
            goto L12
        Le:
            r2 = move-exception
            r1.handleIOException(r2)
        L12:
            return r1
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r0 = r4 - r3
            r1.beforeWrite(r0)     // Catch: java.io.IOException -> Lc
            super.append(r2, r3, r4)     // Catch: java.io.IOException -> Lc
            r1.afterWrite(r0)     // Catch: java.io.IOException -> Lc
            goto L10
        Lc:
            r2 = move-exception
            r1.handleIOException(r2)
        L10:
            return r1
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1, r2, r3)
            return r1
    }

    protected void beforeWrite(int r1) throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            super.close()     // Catch: java.io.IOException -> L4
            goto L8
        L4:
            r0 = move-exception
            r1.handleIOException(r0)
        L8:
            return
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            super.flush()     // Catch: java.io.IOException -> L4
            goto L8
        L4:
            r0 = move-exception
            r1.handleIOException(r0)
        L8:
            return
    }

    protected void handleIOException(java.io.IOException r1) throws java.io.IOException {
            r0 = this;
            throw r1
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.beforeWrite(r0)     // Catch: java.io.IOException -> Lb
            super.write(r2)     // Catch: java.io.IOException -> Lb
            r1.afterWrite(r0)     // Catch: java.io.IOException -> Lb
            goto Lf
        Lb:
            r2 = move-exception
            r1.handleIOException(r2)
        Lf:
            return
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            int r0 = org.apache.commons.io.IOUtils.length(r2)     // Catch: java.io.IOException -> Le
            r1.beforeWrite(r0)     // Catch: java.io.IOException -> Le
            super.write(r2)     // Catch: java.io.IOException -> Le
            r1.afterWrite(r0)     // Catch: java.io.IOException -> Le
            goto L12
        Le:
            r2 = move-exception
            r1.handleIOException(r2)
        L12:
            return
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(java.lang.String r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            r0.beforeWrite(r3)     // Catch: java.io.IOException -> La
            super.write(r1, r2, r3)     // Catch: java.io.IOException -> La
            r0.afterWrite(r3)     // Catch: java.io.IOException -> La
            goto Le
        La:
            r1 = move-exception
            r0.handleIOException(r1)
        Le:
            return
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(char[] r2) throws java.io.IOException {
            r1 = this;
            int r0 = org.apache.commons.io.IOUtils.length(r2)     // Catch: java.io.IOException -> Le
            r1.beforeWrite(r0)     // Catch: java.io.IOException -> Le
            super.write(r2)     // Catch: java.io.IOException -> Le
            r1.afterWrite(r0)     // Catch: java.io.IOException -> Le
            goto L12
        Le:
            r2 = move-exception
            r1.handleIOException(r2)
        L12:
            return
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(char[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            r0.beforeWrite(r3)     // Catch: java.io.IOException -> La
            super.write(r1, r2, r3)     // Catch: java.io.IOException -> La
            r0.afterWrite(r3)     // Catch: java.io.IOException -> La
            goto Le
        La:
            r1 = move-exception
            r0.handleIOException(r1)
        Le:
            return
    }
}
