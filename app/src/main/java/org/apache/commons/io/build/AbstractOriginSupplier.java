package org.apache.commons.io.build;

import org.apache.commons.io.build.AbstractOriginSupplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractOriginSupplier<T, B extends org.apache.commons.io.build.AbstractOriginSupplier<T, B>> extends org.apache.commons.io.build.AbstractSupplier<T, B> {
    private org.apache.commons.io.build.AbstractOrigin<?, ?> origin;

    public AbstractOriginSupplier() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static org.apache.commons.io.build.AbstractOrigin.ByteArrayOrigin newByteArrayOrigin(byte[] r1) {
            org.apache.commons.io.build.AbstractOrigin$ByteArrayOrigin r0 = new org.apache.commons.io.build.AbstractOrigin$ByteArrayOrigin
            r0.<init>(r1)
            return r0
    }

    protected static org.apache.commons.io.build.AbstractOrigin.CharSequenceOrigin newCharSequenceOrigin(java.lang.CharSequence r1) {
            org.apache.commons.io.build.AbstractOrigin$CharSequenceOrigin r0 = new org.apache.commons.io.build.AbstractOrigin$CharSequenceOrigin
            r0.<init>(r1)
            return r0
    }

    protected static org.apache.commons.io.build.AbstractOrigin.FileOrigin newFileOrigin(java.io.File r1) {
            org.apache.commons.io.build.AbstractOrigin$FileOrigin r0 = new org.apache.commons.io.build.AbstractOrigin$FileOrigin
            r0.<init>(r1)
            return r0
    }

    protected static org.apache.commons.io.build.AbstractOrigin.FileOrigin newFileOrigin(java.lang.String r2) {
            org.apache.commons.io.build.AbstractOrigin$FileOrigin r0 = new org.apache.commons.io.build.AbstractOrigin$FileOrigin
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    protected static org.apache.commons.io.build.AbstractOrigin.InputStreamOrigin newInputStreamOrigin(java.io.InputStream r1) {
            org.apache.commons.io.build.AbstractOrigin$InputStreamOrigin r0 = new org.apache.commons.io.build.AbstractOrigin$InputStreamOrigin
            r0.<init>(r1)
            return r0
    }

    protected static org.apache.commons.io.build.AbstractOrigin.OutputStreamOrigin newOutputStreamOrigin(java.io.OutputStream r1) {
            org.apache.commons.io.build.AbstractOrigin$OutputStreamOrigin r0 = new org.apache.commons.io.build.AbstractOrigin$OutputStreamOrigin
            r0.<init>(r1)
            return r0
    }

    protected static org.apache.commons.io.build.AbstractOrigin.PathOrigin newPathOrigin(java.lang.String r2) {
            org.apache.commons.io.build.AbstractOrigin$PathOrigin r0 = new org.apache.commons.io.build.AbstractOrigin$PathOrigin
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r2 = java.nio.file.Paths.get(r2, r1)
            r0.<init>(r2)
            return r0
    }

    protected static org.apache.commons.io.build.AbstractOrigin.PathOrigin newPathOrigin(java.nio.file.Path r1) {
            org.apache.commons.io.build.AbstractOrigin$PathOrigin r0 = new org.apache.commons.io.build.AbstractOrigin$PathOrigin
            r0.<init>(r1)
            return r0
    }

    protected static org.apache.commons.io.build.AbstractOrigin.ReaderOrigin newReaderOrigin(java.io.Reader r1) {
            org.apache.commons.io.build.AbstractOrigin$ReaderOrigin r0 = new org.apache.commons.io.build.AbstractOrigin$ReaderOrigin
            r0.<init>(r1)
            return r0
    }

    protected static org.apache.commons.io.build.AbstractOrigin.URIOrigin newURIOrigin(java.net.URI r1) {
            org.apache.commons.io.build.AbstractOrigin$URIOrigin r0 = new org.apache.commons.io.build.AbstractOrigin$URIOrigin
            r0.<init>(r1)
            return r0
    }

    protected static org.apache.commons.io.build.AbstractOrigin.WriterOrigin newWriterOrigin(java.io.Writer r1) {
            org.apache.commons.io.build.AbstractOrigin$WriterOrigin r0 = new org.apache.commons.io.build.AbstractOrigin$WriterOrigin
            r0.<init>(r1)
            return r0
    }

    protected org.apache.commons.io.build.AbstractOrigin<?, ?> checkOrigin() {
            r2 = this;
            org.apache.commons.io.build.AbstractOrigin<?, ?> r0 = r2.origin
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "origin == null"
            r0.<init>(r1)
            throw r0
    }

    protected org.apache.commons.io.build.AbstractOrigin<?, ?> getOrigin() {
            r1 = this;
            org.apache.commons.io.build.AbstractOrigin<?, ?> r0 = r1.origin
            return r0
    }

    protected boolean hasOrigin() {
            r1 = this;
            org.apache.commons.io.build.AbstractOrigin<?, ?> r0 = r1.origin
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public B setByteArray(byte[] r1) {
            r0 = this;
            org.apache.commons.io.build.AbstractOrigin$ByteArrayOrigin r1 = newByteArrayOrigin(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setOrigin(r1)
            return r1
    }

    public B setCharSequence(java.lang.CharSequence r1) {
            r0 = this;
            org.apache.commons.io.build.AbstractOrigin$CharSequenceOrigin r1 = newCharSequenceOrigin(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setOrigin(r1)
            return r1
    }

    public B setFile(java.io.File r1) {
            r0 = this;
            org.apache.commons.io.build.AbstractOrigin$FileOrigin r1 = newFileOrigin(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setOrigin(r1)
            return r1
    }

    public B setFile(java.lang.String r1) {
            r0 = this;
            org.apache.commons.io.build.AbstractOrigin$FileOrigin r1 = newFileOrigin(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setOrigin(r1)
            return r1
    }

    public B setInputStream(java.io.InputStream r1) {
            r0 = this;
            org.apache.commons.io.build.AbstractOrigin$InputStreamOrigin r1 = newInputStreamOrigin(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setOrigin(r1)
            return r1
    }

    protected B setOrigin(org.apache.commons.io.build.AbstractOrigin<?, ?> r1) {
            r0 = this;
            r0.origin = r1
            org.apache.commons.io.build.AbstractSupplier r1 = r0.asThis()
            org.apache.commons.io.build.AbstractOriginSupplier r1 = (org.apache.commons.io.build.AbstractOriginSupplier) r1
            return r1
    }

    public B setOutputStream(java.io.OutputStream r1) {
            r0 = this;
            org.apache.commons.io.build.AbstractOrigin$OutputStreamOrigin r1 = newOutputStreamOrigin(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setOrigin(r1)
            return r1
    }

    public B setPath(java.lang.String r1) {
            r0 = this;
            org.apache.commons.io.build.AbstractOrigin$PathOrigin r1 = newPathOrigin(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setOrigin(r1)
            return r1
    }

    public B setPath(java.nio.file.Path r1) {
            r0 = this;
            org.apache.commons.io.build.AbstractOrigin$PathOrigin r1 = newPathOrigin(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setOrigin(r1)
            return r1
    }

    public B setReader(java.io.Reader r1) {
            r0 = this;
            org.apache.commons.io.build.AbstractOrigin$ReaderOrigin r1 = newReaderOrigin(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setOrigin(r1)
            return r1
    }

    public B setURI(java.net.URI r1) {
            r0 = this;
            org.apache.commons.io.build.AbstractOrigin$URIOrigin r1 = newURIOrigin(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setOrigin(r1)
            return r1
    }

    public B setWriter(java.io.Writer r1) {
            r0 = this;
            org.apache.commons.io.build.AbstractOrigin$WriterOrigin r1 = newWriterOrigin(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setOrigin(r1)
            return r1
    }
}
