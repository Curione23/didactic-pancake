package org.apache.commons.io.build;

import org.apache.commons.io.build.AbstractStreamBuilder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractStreamBuilder<T, B extends org.apache.commons.io.build.AbstractStreamBuilder<T, B>> extends org.apache.commons.io.build.AbstractOriginSupplier<T, B> {
    private static final int DEFAULT_MAX_VALUE = Integer.MAX_VALUE;
    private static final java.nio.file.OpenOption[] DEFAULT_OPEN_OPTIONS = null;
    private int bufferSize;
    private java.util.function.IntUnaryOperator bufferSizeChecker;
    private int bufferSizeDefault;
    private int bufferSizeMax;
    private java.nio.charset.Charset charset;
    private java.nio.charset.Charset charsetDefault;
    private final java.util.function.IntUnaryOperator defaultSizeChecker;
    private java.nio.file.OpenOption[] openOptions;

    static {
            java.nio.file.OpenOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_OPEN_OPTION_ARRAY
            org.apache.commons.io.build.AbstractStreamBuilder.DEFAULT_OPEN_OPTIONS = r0
            return
    }

    public AbstractStreamBuilder() {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            r1.bufferSize = r0
            r1.bufferSizeDefault = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.bufferSizeMax = r0
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r1.charset = r0
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r1.charsetDefault = r0
            java.nio.file.OpenOption[] r0 = org.apache.commons.io.build.AbstractStreamBuilder.DEFAULT_OPEN_OPTIONS
            r1.openOptions = r0
            org.apache.commons.io.build.AbstractStreamBuilder$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.build.AbstractStreamBuilder$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.defaultSizeChecker = r0
            r1.bufferSizeChecker = r0
            return
    }

    private int checkBufferSize(int r2) {
            r1 = this;
            java.util.function.IntUnaryOperator r0 = r1.bufferSizeChecker
            int r2 = r0.applyAsInt(r2)
            return r2
    }

    private int throwIae(int r2, int r3) {
            r1 = this;
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "Request %,d exceeds maximum %,d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
    }

    protected int getBufferSize() {
            r1 = this;
            int r0 = r1.bufferSize
            return r0
    }

    protected int getBufferSizeDefault() {
            r1 = this;
            int r0 = r1.bufferSizeDefault
            return r0
    }

    protected java.lang.CharSequence getCharSequence() throws java.io.IOException {
            r2 = this;
            org.apache.commons.io.build.AbstractOrigin r0 = r2.checkOrigin()
            java.nio.charset.Charset r1 = r2.getCharset()
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            return r0
    }

    public java.nio.charset.Charset getCharset() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset
            return r0
    }

    protected java.nio.charset.Charset getCharsetDefault() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charsetDefault
            return r0
    }

    protected java.io.InputStream getInputStream() throws java.io.IOException {
            r2 = this;
            org.apache.commons.io.build.AbstractOrigin r0 = r2.checkOrigin()
            java.nio.file.OpenOption[] r1 = r2.getOpenOptions()
            java.io.InputStream r0 = r0.getInputStream(r1)
            return r0
    }

    protected java.nio.file.OpenOption[] getOpenOptions() {
            r1 = this;
            java.nio.file.OpenOption[] r0 = r1.openOptions
            return r0
    }

    protected java.io.OutputStream getOutputStream() throws java.io.IOException {
            r2 = this;
            org.apache.commons.io.build.AbstractOrigin r0 = r2.checkOrigin()
            java.nio.file.OpenOption[] r1 = r2.getOpenOptions()
            java.io.OutputStream r0 = r0.getOutputStream(r1)
            return r0
    }

    protected java.nio.file.Path getPath() {
            r1 = this;
            org.apache.commons.io.build.AbstractOrigin r0 = r1.checkOrigin()
            java.nio.file.Path r0 = r0.getPath()
            return r0
    }

    protected java.io.Reader getReader() throws java.io.IOException {
            r2 = this;
            org.apache.commons.io.build.AbstractOrigin r0 = r2.checkOrigin()
            java.nio.charset.Charset r1 = r2.getCharset()
            java.io.Reader r0 = r0.getReader(r1)
            return r0
    }

    protected java.io.Writer getWriter() throws java.io.IOException {
            r3 = this;
            org.apache.commons.io.build.AbstractOrigin r0 = r3.checkOrigin()
            java.nio.charset.Charset r1 = r3.getCharset()
            java.nio.file.OpenOption[] r2 = r3.getOpenOptions()
            java.io.Writer r0 = r0.getWriter(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: lambda$new$0$org-apache-commons-io-build-AbstractStreamBuilder, reason: not valid java name */
    /* synthetic */ int m2573lambda$new$0$orgapachecommonsiobuildAbstractStreamBuilder(int r2) {
            r1 = this;
            int r0 = r1.bufferSizeMax
            if (r2 <= r0) goto L8
            int r2 = r1.throwIae(r2, r0)
        L8:
            return r2
    }

    public B setBufferSize(int r1) {
            r0 = this;
            if (r1 <= 0) goto L3
            goto L5
        L3:
            int r1 = r0.bufferSizeDefault
        L5:
            int r1 = r0.checkBufferSize(r1)
            r0.bufferSize = r1
            org.apache.commons.io.build.AbstractSupplier r1 = r0.asThis()
            org.apache.commons.io.build.AbstractStreamBuilder r1 = (org.apache.commons.io.build.AbstractStreamBuilder) r1
            return r1
    }

    public B setBufferSize(java.lang.Integer r1) {
            r0 = this;
            if (r1 == 0) goto L7
            int r1 = r1.intValue()
            goto L9
        L7:
            int r1 = r0.bufferSizeDefault
        L9:
            r0.setBufferSize(r1)
            org.apache.commons.io.build.AbstractSupplier r1 = r0.asThis()
            org.apache.commons.io.build.AbstractStreamBuilder r1 = (org.apache.commons.io.build.AbstractStreamBuilder) r1
            return r1
    }

    public B setBufferSizeChecker(java.util.function.IntUnaryOperator r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.util.function.IntUnaryOperator r1 = r0.defaultSizeChecker
        L5:
            r0.bufferSizeChecker = r1
            org.apache.commons.io.build.AbstractSupplier r1 = r0.asThis()
            org.apache.commons.io.build.AbstractStreamBuilder r1 = (org.apache.commons.io.build.AbstractStreamBuilder) r1
            return r1
    }

    protected B setBufferSizeDefault(int r1) {
            r0 = this;
            r0.bufferSizeDefault = r1
            org.apache.commons.io.build.AbstractSupplier r1 = r0.asThis()
            org.apache.commons.io.build.AbstractStreamBuilder r1 = (org.apache.commons.io.build.AbstractStreamBuilder) r1
            return r1
    }

    public B setBufferSizeMax(int r1) {
            r0 = this;
            if (r1 <= 0) goto L3
            goto L6
        L3:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L6:
            r0.bufferSizeMax = r1
            org.apache.commons.io.build.AbstractSupplier r1 = r0.asThis()
            org.apache.commons.io.build.AbstractStreamBuilder r1 = (org.apache.commons.io.build.AbstractStreamBuilder) r1
            return r1
    }

    public B setCharset(java.lang.String r2) {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charsetDefault
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2, r0)
            org.apache.commons.io.build.AbstractStreamBuilder r2 = r1.setCharset(r2)
            return r2
    }

    public B setCharset(java.nio.charset.Charset r2) {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charsetDefault
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2, r0)
            r1.charset = r2
            org.apache.commons.io.build.AbstractSupplier r2 = r1.asThis()
            org.apache.commons.io.build.AbstractStreamBuilder r2 = (org.apache.commons.io.build.AbstractStreamBuilder) r2
            return r2
    }

    protected B setCharsetDefault(java.nio.charset.Charset r1) {
            r0 = this;
            r0.charsetDefault = r1
            org.apache.commons.io.build.AbstractSupplier r1 = r0.asThis()
            org.apache.commons.io.build.AbstractStreamBuilder r1 = (org.apache.commons.io.build.AbstractStreamBuilder) r1
            return r1
    }

    public B setOpenOptions(java.nio.file.OpenOption... r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.nio.file.OpenOption[] r1 = org.apache.commons.io.build.AbstractStreamBuilder.DEFAULT_OPEN_OPTIONS
        L5:
            r0.openOptions = r1
            org.apache.commons.io.build.AbstractSupplier r1 = r0.asThis()
            org.apache.commons.io.build.AbstractStreamBuilder r1 = (org.apache.commons.io.build.AbstractStreamBuilder) r1
            return r1
    }
}
