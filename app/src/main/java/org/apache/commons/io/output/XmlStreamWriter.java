package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class XmlStreamWriter extends java.io.Writer {
    private static final int BUFFER_SIZE = 8192;
    private java.nio.charset.Charset charset;
    private final java.nio.charset.Charset defaultCharset;
    private final java.io.OutputStream out;
    private java.io.StringWriter prologWriter;
    private java.io.Writer writer;

    /* JADX INFO: renamed from: org.apache.commons.io.output.XmlStreamWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.output.XmlStreamWriter, org.apache.commons.io.output.XmlStreamWriter.Builder> {
        public Builder() {
                r1 = this;
                r1.<init>()
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                r1.setCharsetDefault(r0)
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                r1.setCharset(r0)
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.output.XmlStreamWriter r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.output.XmlStreamWriter get() throws java.io.IOException {
                r4 = this;
                org.apache.commons.io.output.XmlStreamWriter r0 = new org.apache.commons.io.output.XmlStreamWriter
                java.io.OutputStream r1 = r4.getOutputStream()
                java.nio.charset.Charset r2 = r4.getCharset()
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    @java.lang.Deprecated
    public XmlStreamWriter(java.io.File r2) throws java.io.FileNotFoundException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public XmlStreamWriter(java.io.File r2, java.lang.String r3) throws java.io.FileNotFoundException {
            r1 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    @java.lang.Deprecated
    public XmlStreamWriter(java.io.OutputStream r2) {
            r1 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public XmlStreamWriter(java.io.OutputStream r2, java.lang.String r3) {
            r1 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    private XmlStreamWriter(java.io.OutputStream r3, java.nio.charset.Charset r4) {
            r2 = this;
            r2.<init>()
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r1)
            r2.prologWriter = r0
            r2.out = r3
            java.lang.Object r3 = java.util.Objects.requireNonNull(r4)
            java.nio.charset.Charset r3 = (java.nio.charset.Charset) r3
            r2.defaultCharset = r3
            return
    }

    /* synthetic */ XmlStreamWriter(java.io.OutputStream r1, java.nio.charset.Charset r2, org.apache.commons.io.output.XmlStreamWriter.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.apache.commons.io.output.XmlStreamWriter.Builder builder() {
            org.apache.commons.io.output.XmlStreamWriter$Builder r0 = new org.apache.commons.io.output.XmlStreamWriter$Builder
            r0.<init>()
            return r0
    }

    private void detectEncoding(char[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            java.io.StringWriter r0 = r6.prologWriter
            java.lang.StringBuffer r0 = r0.getBuffer()
            int r1 = r0.length()
            int r1 = r1 + r9
            r2 = 8192(0x2000, float:1.148E-41)
            if (r1 <= r2) goto L16
            int r1 = r0.length()
            int r1 = 8192 - r1
            goto L17
        L16:
            r1 = r9
        L17:
            java.io.StringWriter r3 = r6.prologWriter
            r3.write(r7, r8, r1)
            int r3 = r0.length()
            r4 = 5
            if (r3 < r4) goto L99
            r3 = 0
            java.lang.String r4 = r0.substring(r3, r4)
            java.lang.String r5 = "<?xml"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L73
            java.lang.String r4 = "?>"
            int r4 = r0.indexOf(r4)
            if (r4 <= 0) goto L68
            java.util.regex.Pattern r2 = org.apache.commons.io.input.XmlStreamReader.ENCODING_PATTERN
            java.lang.String r3 = r0.substring(r3, r4)
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.find()
            if (r3 == 0) goto L63
            r3 = 1
            java.lang.String r2 = r2.group(r3)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r4)
            int r4 = r2.length()
            int r4 = r4 - r3
            java.lang.String r2 = r2.substring(r3, r4)
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r6.charset = r2
            goto L77
        L63:
            java.nio.charset.Charset r2 = r6.defaultCharset
            r6.charset = r2
            goto L77
        L68:
            int r3 = r0.length()
            if (r3 < r2) goto L77
            java.nio.charset.Charset r2 = r6.defaultCharset
            r6.charset = r2
            goto L77
        L73:
            java.nio.charset.Charset r2 = r6.defaultCharset
            r6.charset = r2
        L77:
            java.nio.charset.Charset r2 = r6.charset
            if (r2 == 0) goto L99
            r2 = 0
            r6.prologWriter = r2
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            java.io.OutputStream r3 = r6.out
            java.nio.charset.Charset r4 = r6.charset
            r2.<init>(r3, r4)
            r6.writer = r2
            java.lang.String r0 = r0.toString()
            r2.write(r0)
            if (r9 <= r1) goto L99
            java.io.Writer r0 = r6.writer
            int r8 = r8 + r1
            int r9 = r9 - r1
            r0.write(r7, r8, r9)
        L99:
            return
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            java.io.Writer r0 = r3.writer
            if (r0 != 0) goto L1c
            java.nio.charset.Charset r0 = r3.defaultCharset
            r3.charset = r0
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.OutputStream r1 = r3.out
            java.nio.charset.Charset r2 = r3.charset
            r0.<init>(r1, r2)
            r3.writer = r0
            java.io.StringWriter r1 = r3.prologWriter
            java.lang.String r1 = r1.toString()
            r0.write(r1)
        L1c:
            java.io.Writer r0 = r3.writer
            r0.close()
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.io.Writer r0 = r1.writer
            if (r0 == 0) goto L7
            r0.flush()
        L7:
            return
    }

    public java.lang.String getDefaultEncoding() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.defaultCharset
            java.lang.String r0 = r0.name()
            return r0
    }

    public java.lang.String getEncoding() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset
            java.lang.String r0 = r0.name()
            return r0
    }

    @Override // java.io.Writer
    public void write(char[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.StringWriter r0 = r1.prologWriter
            if (r0 == 0) goto L8
            r1.detectEncoding(r2, r3, r4)
            goto Ld
        L8:
            java.io.Writer r0 = r1.writer
            r0.write(r2, r3, r4)
        Ld:
            return
    }
}
