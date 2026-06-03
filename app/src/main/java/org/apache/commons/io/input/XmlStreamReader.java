package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class XmlStreamReader extends java.io.Reader {
    private static final org.apache.commons.io.ByteOrderMark[] BOMS = null;
    private static final java.util.regex.Pattern CHARSET_PATTERN = null;
    private static final java.lang.String EBCDIC = "CP1047";
    public static final java.util.regex.Pattern ENCODING_PATTERN = null;
    private static final java.lang.String HTTP_EX_1 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be null";
    private static final java.lang.String HTTP_EX_2 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    private static final java.lang.String HTTP_EX_3 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Illegal MIME";
    private static final java.lang.String RAW_EX_1 = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    private static final java.lang.String RAW_EX_2 = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    private static final java.lang.String US_ASCII = null;
    private static final java.lang.String UTF_16 = null;
    private static final java.lang.String UTF_16BE = null;
    private static final java.lang.String UTF_16LE = null;
    private static final java.lang.String UTF_32 = "UTF-32";
    private static final java.lang.String UTF_32BE = "UTF-32BE";
    private static final java.lang.String UTF_32LE = "UTF-32LE";
    private static final java.lang.String UTF_8 = null;
    private static final org.apache.commons.io.ByteOrderMark[] XML_GUESS_BYTES = null;
    private final java.lang.String defaultEncoding;
    private final java.lang.String encoding;
    private final java.io.Reader reader;

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.XmlStreamReader, org.apache.commons.io.input.XmlStreamReader.Builder> {
        private java.lang.String httpContentType;
        private boolean lenient;
        private boolean nullCharset;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.nullCharset = r0
                r1.lenient = r0
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.XmlStreamReader r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.XmlStreamReader get() throws java.io.IOException {
                r5 = this;
                boolean r0 = r5.nullCharset
                if (r0 == 0) goto L6
                r0 = 0
                goto Le
            L6:
                java.nio.charset.Charset r0 = r5.getCharset()
                java.lang.String r0 = r0.name()
            Le:
                java.lang.String r1 = r5.httpContentType
                if (r1 != 0) goto L1e
                org.apache.commons.io.input.XmlStreamReader r1 = new org.apache.commons.io.input.XmlStreamReader
                java.io.InputStream r2 = r5.getInputStream()
                boolean r3 = r5.lenient
                r1.<init>(r2, r3, r0)
                goto L2b
            L1e:
                org.apache.commons.io.input.XmlStreamReader r1 = new org.apache.commons.io.input.XmlStreamReader
                java.io.InputStream r2 = r5.getInputStream()
                java.lang.String r3 = r5.httpContentType
                boolean r4 = r5.lenient
                r1.<init>(r2, r3, r4, r0)
            L2b:
                return r1
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public /* bridge */ /* synthetic */ org.apache.commons.io.build.AbstractStreamBuilder setCharset(java.lang.String r1) {
                r0 = this;
                org.apache.commons.io.input.XmlStreamReader$Builder r1 = r0.setCharset(r1)
                return r1
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public /* bridge */ /* synthetic */ org.apache.commons.io.build.AbstractStreamBuilder setCharset(java.nio.charset.Charset r1) {
                r0 = this;
                org.apache.commons.io.input.XmlStreamReader$Builder r1 = r0.setCharset(r1)
                return r1
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public org.apache.commons.io.input.XmlStreamReader.Builder setCharset(java.lang.String r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                r1.nullCharset = r0
                java.nio.charset.Charset r0 = r1.getCharsetDefault()
                java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2, r0)
                org.apache.commons.io.build.AbstractStreamBuilder r2 = super.setCharset(r2)
                org.apache.commons.io.input.XmlStreamReader$Builder r2 = (org.apache.commons.io.input.XmlStreamReader.Builder) r2
                return r2
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public org.apache.commons.io.input.XmlStreamReader.Builder setCharset(java.nio.charset.Charset r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                r1.nullCharset = r0
                org.apache.commons.io.build.AbstractStreamBuilder r2 = super.setCharset(r2)
                org.apache.commons.io.input.XmlStreamReader$Builder r2 = (org.apache.commons.io.input.XmlStreamReader.Builder) r2
                return r2
        }

        public org.apache.commons.io.input.XmlStreamReader.Builder setHttpContentType(java.lang.String r1) {
                r0 = this;
                r0.httpContentType = r1
                return r0
        }

        public org.apache.commons.io.input.XmlStreamReader.Builder setLenient(boolean r1) {
                r0 = this;
                r0.lenient = r1
                return r0
        }
    }

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r0.name()
            org.apache.commons.io.input.XmlStreamReader.UTF_8 = r0
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            java.lang.String r1 = r1.name()
            org.apache.commons.io.input.XmlStreamReader.US_ASCII = r1
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            java.lang.String r1 = r1.name()
            org.apache.commons.io.input.XmlStreamReader.UTF_16BE = r1
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            java.lang.String r2 = r2.name()
            org.apache.commons.io.input.XmlStreamReader.UTF_16LE = r2
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_16
            java.lang.String r3 = r3.name()
            org.apache.commons.io.input.XmlStreamReader.UTF_16 = r3
            r3 = 5
            org.apache.commons.io.ByteOrderMark[] r4 = new org.apache.commons.io.ByteOrderMark[r3]
            org.apache.commons.io.ByteOrderMark r5 = org.apache.commons.io.ByteOrderMark.UTF_8
            r6 = 0
            r4[r6] = r5
            org.apache.commons.io.ByteOrderMark r5 = org.apache.commons.io.ByteOrderMark.UTF_16BE
            r7 = 1
            r4[r7] = r5
            org.apache.commons.io.ByteOrderMark r5 = org.apache.commons.io.ByteOrderMark.UTF_16LE
            r8 = 2
            r4[r8] = r5
            org.apache.commons.io.ByteOrderMark r5 = org.apache.commons.io.ByteOrderMark.UTF_32BE
            r9 = 3
            r4[r9] = r5
            org.apache.commons.io.ByteOrderMark r5 = org.apache.commons.io.ByteOrderMark.UTF_32LE
            r10 = 4
            r4[r10] = r5
            org.apache.commons.io.input.XmlStreamReader.BOMS = r4
            r4 = 6
            org.apache.commons.io.ByteOrderMark[] r4 = new org.apache.commons.io.ByteOrderMark[r4]
            org.apache.commons.io.ByteOrderMark r5 = new org.apache.commons.io.ByteOrderMark
            r11 = 120(0x78, float:1.68E-43)
            r12 = 109(0x6d, float:1.53E-43)
            r13 = 60
            r14 = 63
            int[] r11 = new int[]{r13, r14, r11, r12}
            r5.<init>(r0, r11)
            r4[r6] = r5
            org.apache.commons.io.ByteOrderMark r0 = new org.apache.commons.io.ByteOrderMark
            int[] r5 = new int[]{r6, r13, r6, r14}
            r0.<init>(r1, r5)
            r4[r7] = r0
            org.apache.commons.io.ByteOrderMark r0 = new org.apache.commons.io.ByteOrderMark
            int[] r1 = new int[]{r13, r6, r14, r6}
            r0.<init>(r2, r1)
            r4[r8] = r0
            org.apache.commons.io.ByteOrderMark r0 = new org.apache.commons.io.ByteOrderMark
            r1 = 16
            int[] r2 = new int[r1]
            r2 = {x00ba: FILL_ARRAY_DATA , data: [0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109} // fill-array
            java.lang.String r5 = "UTF-32BE"
            r0.<init>(r5, r2)
            r4[r9] = r0
            org.apache.commons.io.ByteOrderMark r0 = new org.apache.commons.io.ByteOrderMark
            int[] r1 = new int[r1]
            r1 = {x00de: FILL_ARRAY_DATA , data: [60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0} // fill-array
            java.lang.String r2 = "UTF-32LE"
            r0.<init>(r2, r1)
            r4[r10] = r0
            org.apache.commons.io.ByteOrderMark r0 = new org.apache.commons.io.ByteOrderMark
            r1 = 167(0xa7, float:2.34E-43)
            r2 = 148(0x94, float:2.07E-43)
            r5 = 76
            r6 = 111(0x6f, float:1.56E-43)
            int[] r1 = new int[]{r5, r6, r1, r2}
            java.lang.String r2 = "CP1047"
            r0.<init>(r2, r1)
            r4[r3] = r0
            org.apache.commons.io.input.XmlStreamReader.XML_GUESS_BYTES = r4
            java.lang.String r0 = "charset=[\"']?([.[^; \"']]*)[\"']?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.io.input.XmlStreamReader.CHARSET_PATTERN = r0
            java.lang.String r0 = "^<\\?xml\\s+(?:version\\s*=\\s*(?:(?:\"1\\.[0-9]+\")|(?:'1.[0-9]+'))\\s+)??encoding\\s*=\\s*((?:\"[A-Za-z0-9][A-Za-z0-9._+:-]*\")|(?:'[A-Za-z0-9][A-Za-z0-9._+:-]*'))"
            r1 = 8
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            org.apache.commons.io.input.XmlStreamReader.ENCODING_PATTERN = r0
            return
    }

    @java.lang.Deprecated
    public XmlStreamReader(java.io.File r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "file"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.io.File r2 = (java.io.File) r2
            java.nio.file.Path r2 = r2.toPath()
            r1.<init>(r2)
            return
    }

    @java.lang.Deprecated
    public XmlStreamReader(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public XmlStreamReader(java.io.InputStream r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public XmlStreamReader(java.io.InputStream r2, java.lang.String r3, boolean r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public XmlStreamReader(java.io.InputStream r3, java.lang.String r4, boolean r5, java.lang.String r6) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r2.defaultEncoding = r6
            org.apache.commons.io.input.BOMInputStream r6 = new org.apache.commons.io.input.BOMInputStream
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.lang.String r1 = "inputStream"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r1)
            java.io.InputStream r3 = (java.io.InputStream) r3
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r3, r1)
            r3 = 0
            org.apache.commons.io.ByteOrderMark[] r1 = org.apache.commons.io.input.XmlStreamReader.BOMS
            r6.<init>(r0, r3, r1)
            org.apache.commons.io.input.BOMInputStream r3 = new org.apache.commons.io.input.BOMInputStream
            r0 = 1
            org.apache.commons.io.ByteOrderMark[] r1 = org.apache.commons.io.input.XmlStreamReader.XML_GUESS_BYTES
            r3.<init>(r6, r0, r1)
            java.lang.String r4 = r2.processHttpStream(r6, r3, r5, r4)
            r2.encoding = r4
            java.io.InputStreamReader r5 = new java.io.InputStreamReader
            r5.<init>(r3, r4)
            r2.reader = r5
            return
    }

    @java.lang.Deprecated
    public XmlStreamReader(java.io.InputStream r2, boolean r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public XmlStreamReader(java.io.InputStream r3, boolean r4, java.lang.String r5) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r2.defaultEncoding = r5
            org.apache.commons.io.input.BOMInputStream r5 = new org.apache.commons.io.input.BOMInputStream
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.lang.String r1 = "inputStream"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r1)
            java.io.InputStream r3 = (java.io.InputStream) r3
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r3, r1)
            r3 = 0
            org.apache.commons.io.ByteOrderMark[] r1 = org.apache.commons.io.input.XmlStreamReader.BOMS
            r5.<init>(r0, r3, r1)
            org.apache.commons.io.input.BOMInputStream r3 = new org.apache.commons.io.input.BOMInputStream
            r0 = 1
            org.apache.commons.io.ByteOrderMark[] r1 = org.apache.commons.io.input.XmlStreamReader.XML_GUESS_BYTES
            r3.<init>(r5, r0, r1)
            java.lang.String r4 = r2.processHttpStream(r5, r3, r4)
            r2.encoding = r4
            java.io.InputStreamReader r5 = new java.io.InputStreamReader
            r5.<init>(r3, r4)
            r2.reader = r5
            return
    }

    public XmlStreamReader(java.net.URL r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "url"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.net.URL r2 = (java.net.URL) r2
            java.net.URLConnection r2 = r2.openConnection()
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public XmlStreamReader(java.net.URLConnection r5, java.lang.String r6) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "urlConnection"
            java.util.Objects.requireNonNull(r5, r0)
            r4.defaultEncoding = r6
            java.lang.String r6 = r5.getContentType()
            java.io.InputStream r0 = r5.getInputStream()
            org.apache.commons.io.input.BOMInputStream$Builder r1 = org.apache.commons.io.input.BOMInputStream.builder()
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r3 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r0, r3)
            org.apache.commons.io.build.AbstractOriginSupplier r0 = r1.setInputStream(r2)
            org.apache.commons.io.input.BOMInputStream$Builder r0 = (org.apache.commons.io.input.BOMInputStream.Builder) r0
            r1 = 0
            org.apache.commons.io.input.BOMInputStream$Builder r0 = r0.setInclude(r1)
            org.apache.commons.io.ByteOrderMark[] r1 = org.apache.commons.io.input.XmlStreamReader.BOMS
            org.apache.commons.io.input.BOMInputStream$Builder r0 = r0.setByteOrderMarks(r1)
            org.apache.commons.io.input.BOMInputStream r0 = r0.get()
            org.apache.commons.io.input.BOMInputStream$Builder r1 = org.apache.commons.io.input.BOMInputStream.builder()
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r0, r3)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r1.setInputStream(r2)
            org.apache.commons.io.input.BOMInputStream$Builder r1 = (org.apache.commons.io.input.BOMInputStream.Builder) r1
            r2 = 1
            org.apache.commons.io.input.BOMInputStream$Builder r1 = r1.setInclude(r2)
            org.apache.commons.io.ByteOrderMark[] r3 = org.apache.commons.io.input.XmlStreamReader.XML_GUESS_BYTES
            org.apache.commons.io.input.BOMInputStream$Builder r1 = r1.setByteOrderMarks(r3)
            org.apache.commons.io.input.BOMInputStream r1 = r1.get()
            boolean r5 = r5 instanceof java.net.HttpURLConnection
            if (r5 != 0) goto L5e
            if (r6 == 0) goto L57
            goto L5e
        L57:
            java.lang.String r5 = r4.processHttpStream(r0, r1, r2)
            r4.encoding = r5
            goto L64
        L5e:
            java.lang.String r5 = r4.processHttpStream(r0, r1, r2, r6)
            r4.encoding = r5
        L64:
            java.io.InputStreamReader r5 = new java.io.InputStreamReader
            java.lang.String r6 = r4.encoding
            r5.<init>(r1, r6)
            r4.reader = r5
            return
    }

    @java.lang.Deprecated
    public XmlStreamReader(java.nio.file.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "file"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.nio.file.Path r2 = (java.nio.file.Path) r2
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.io.InputStream r2 = java.nio.file.Files.newInputStream(r2, r0)
            r1.<init>(r2)
            return
    }

    public static org.apache.commons.io.input.XmlStreamReader.Builder builder() {
            org.apache.commons.io.input.XmlStreamReader$Builder r0 = new org.apache.commons.io.input.XmlStreamReader$Builder
            r0.<init>()
            return r0
    }

    private java.lang.String doLenientDetection(java.lang.String r7, org.apache.commons.io.input.XmlStreamReaderException r8) throws java.io.IOException {
            r6 = this;
            if (r7 == 0) goto L36
            java.lang.String r0 = "text/html"
            boolean r1 = r7.startsWith(r0)
            if (r1 == 0) goto L36
            int r0 = r0.length()
            java.lang.String r7 = r7.substring(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "text/xml"
            r0.<init>(r1)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r5 = r7.toString()
            java.lang.String r1 = r8.getBomEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L34
            java.lang.String r2 = r8.getXmlGuessEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L34
            java.lang.String r3 = r8.getXmlEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L34
            r4 = 1
            r0 = r6
            java.lang.String r7 = r0.calculateHttpEncoding(r1, r2, r3, r4, r5)     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L34
            return r7
        L34:
            r7 = move-exception
            r8 = r7
        L36:
            java.lang.String r7 = r8.getXmlEncoding()
            if (r7 != 0) goto L40
            java.lang.String r7 = r8.getContentTypeEncoding()
        L40:
            if (r7 != 0) goto L48
            java.lang.String r7 = r6.defaultEncoding
            if (r7 != 0) goto L48
            java.lang.String r7 = org.apache.commons.io.input.XmlStreamReader.UTF_8
        L48:
            return r7
    }

    static java.lang.String getContentTypeEncoding(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L2d
            java.lang.String r1 = ";"
            int r1 = r3.indexOf(r1)
            r2 = -1
            if (r1 <= r2) goto L2d
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r3 = r3.substring(r1)
            java.util.regex.Pattern r1 = org.apache.commons.io.input.XmlStreamReader.CHARSET_PATTERN
            java.util.regex.Matcher r3 = r1.matcher(r3)
            boolean r1 = r3.find()
            if (r1 == 0) goto L23
            java.lang.String r3 = r3.group(r2)
            goto L24
        L23:
            r3 = r0
        L24:
            if (r3 == 0) goto L2d
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r0)
            r0 = r3
        L2d:
            return r0
    }

    static java.lang.String getContentTypeMime(java.lang.String r2) {
            if (r2 == 0) goto L14
            java.lang.String r0 = ";"
            int r0 = r2.indexOf(r0)
            if (r0 < 0) goto Lf
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        Lf:
            java.lang.String r2 = r2.trim()
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    private static java.lang.String getXmlProlog(java.io.InputStream r9, java.lang.String r10) throws java.io.IOException {
            if (r10 == 0) goto L9b
            byte[] r0 = org.apache.commons.io.IOUtils.byteArray()
            r1 = 8192(0x2000, float:1.148E-41)
            r9.mark(r1)
            r2 = 0
            int r3 = r9.read(r0, r2, r1)
            r4 = -1
            java.lang.String r5 = ""
            r8 = r1
            r7 = r2
            r6 = r4
        L16:
            if (r3 == r4) goto L2e
            if (r6 != r4) goto L2e
            if (r7 >= r1) goto L2e
            int r7 = r7 + r3
            int r8 = r8 - r3
            int r3 = r9.read(r0, r7, r8)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2, r7, r10)
            r6 = 62
            int r6 = r5.indexOf(r6)
            goto L16
        L2e:
            if (r6 != r4) goto L55
            if (r3 != r4) goto L3a
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Unexpected end of XML stream"
            r9.<init>(r10)
            throw r9
        L3a:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "XML prolog or ROOT element not found on first "
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r7)
            java.lang.String r0 = " bytes"
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L55:
            if (r7 <= 0) goto L9b
            r9.reset()
            java.io.BufferedReader r9 = new java.io.BufferedReader
            java.io.StringReader r10 = new java.io.StringReader
            r0 = 1
            int r6 = r6 + r0
            java.lang.String r1 = r5.substring(r2, r6)
            r10.<init>(r1)
            r9.<init>(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.util.stream.Stream r9 = r9.lines()
            org.apache.commons.io.input.XmlStreamReader$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.input.XmlStreamReader$$ExternalSyntheticLambda0
            r1.<init>(r10)
            org.apache.commons.io.function.IOConsumer.forEach(r9, r1)
            java.util.regex.Pattern r9 = org.apache.commons.io.input.XmlStreamReader.ENCODING_PATTERN
            java.util.regex.Matcher r9 = r9.matcher(r10)
            boolean r10 = r9.find()
            if (r10 == 0) goto L9b
            java.lang.String r9 = r9.group(r0)
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toUpperCase(r10)
            int r10 = r9.length()
            int r10 = r10 - r0
            java.lang.String r9 = r9.substring(r0, r10)
            goto L9c
        L9b:
            r9 = 0
        L9c:
            return r9
    }

    static boolean isAppXml(java.lang.String r1) {
            if (r1 == 0) goto L2c
            java.lang.String r0 = "application/xml"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "application/xml-dtd"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "application/xml-external-parsed-entity"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "application/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L2c
            java.lang.String r0 = "+xml"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L2c
        L2a:
            r1 = 1
            goto L2d
        L2c:
            r1 = 0
        L2d:
            return r1
    }

    static boolean isTextXml(java.lang.String r1) {
            if (r1 == 0) goto L24
            java.lang.String r0 = "text/xml"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = "text/xml-external-parsed-entity"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = "text/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "+xml"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L24
        L22:
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            return r1
    }

    static /* synthetic */ void lambda$getXmlProlog$0(java.lang.StringBuilder r0, java.lang.String r1) throws java.io.IOException {
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 32
            r0.append(r1)
            return
    }

    private java.lang.String processHttpStream(org.apache.commons.io.input.BOMInputStream r2, org.apache.commons.io.input.BOMInputStream r3, boolean r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r2 = r2.getBOMCharsetName()
            java.lang.String r0 = r3.getBOMCharsetName()
            java.lang.String r3 = getXmlProlog(r3, r0)
            java.lang.String r2 = r1.calculateRawEncoding(r2, r0, r3)     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L11
            return r2
        L11:
            r2 = move-exception
            if (r4 == 0) goto L1a
            r3 = 0
            java.lang.String r2 = r1.doLenientDetection(r3, r2)
            return r2
        L1a:
            throw r2
    }

    private java.lang.String processHttpStream(org.apache.commons.io.input.BOMInputStream r7, org.apache.commons.io.input.BOMInputStream r8, boolean r9, java.lang.String r10) throws java.io.IOException {
            r6 = this;
            java.lang.String r1 = r7.getBOMCharsetName()
            java.lang.String r2 = r8.getBOMCharsetName()
            java.lang.String r3 = getXmlProlog(r8, r2)
            r0 = r6
            r4 = r9
            r5 = r10
            java.lang.String r7 = r0.calculateHttpEncoding(r1, r2, r3, r4, r5)     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L14
            return r7
        L14:
            r7 = move-exception
            if (r9 == 0) goto L1c
            java.lang.String r7 = r6.doLenientDetection(r10, r7)
            return r7
        L1c:
            throw r7
    }

    java.lang.String calculateHttpEncoding(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, java.lang.String r12) throws java.io.IOException {
            r7 = this;
            if (r11 == 0) goto L5
            if (r10 == 0) goto L5
            return r10
        L5:
            java.lang.String r2 = getContentTypeMime(r12)
            java.lang.String r3 = getContentTypeEncoding(r12)
            boolean r11 = isAppXml(r2)
            boolean r12 = isTextXml(r2)
            if (r11 != 0) goto L2e
            if (r12 == 0) goto L1a
            goto L2e
        L1a:
            java.lang.String r11 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Illegal MIME"
            java.lang.Object[] r12 = new java.lang.Object[]{r2, r3, r8, r9, r10}
            java.lang.String r1 = java.text.MessageFormat.format(r11, r12)
            org.apache.commons.io.input.XmlStreamReaderException r11 = new org.apache.commons.io.input.XmlStreamReaderException
            r0 = r11
            r4 = r8
            r5 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r11
        L2e:
            if (r3 != 0) goto L3e
            if (r11 == 0) goto L37
            java.lang.String r8 = r7.calculateRawEncoding(r8, r9, r10)
            return r8
        L37:
            java.lang.String r8 = r7.defaultEncoding
            if (r8 != 0) goto L3d
            java.lang.String r8 = org.apache.commons.io.input.XmlStreamReader.US_ASCII
        L3d:
            return r8
        L3e:
            java.lang.String r11 = org.apache.commons.io.input.XmlStreamReader.UTF_16BE
            boolean r11 = r3.equals(r11)
            java.lang.String r12 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be null"
            if (r11 != 0) goto Lc1
            java.lang.String r11 = org.apache.commons.io.input.XmlStreamReader.UTF_16LE
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L52
            goto Lc1
        L52:
            java.lang.String r11 = org.apache.commons.io.input.XmlStreamReader.UTF_16
            boolean r0 = r3.equals(r11)
            java.lang.String r1 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch"
            if (r0 == 0) goto L77
            if (r8 == 0) goto L65
            boolean r11 = r8.startsWith(r11)
            if (r11 == 0) goto L65
            return r8
        L65:
            java.lang.Object[] r11 = new java.lang.Object[]{r2, r3, r8, r9, r10}
            java.lang.String r1 = java.text.MessageFormat.format(r1, r11)
            org.apache.commons.io.input.XmlStreamReaderException r11 = new org.apache.commons.io.input.XmlStreamReaderException
            r0 = r11
            r4 = r8
            r5 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r11
        L77:
            java.lang.String r11 = "UTF-32BE"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto Lac
            java.lang.String r11 = "UTF-32LE"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L88
            goto Lac
        L88:
            java.lang.String r11 = "UTF-32"
            boolean r12 = r3.equals(r11)
            if (r12 == 0) goto Lab
            if (r8 == 0) goto L99
            boolean r11 = r8.startsWith(r11)
            if (r11 == 0) goto L99
            return r8
        L99:
            java.lang.Object[] r11 = new java.lang.Object[]{r2, r3, r8, r9, r10}
            java.lang.String r1 = java.text.MessageFormat.format(r1, r11)
            org.apache.commons.io.input.XmlStreamReaderException r11 = new org.apache.commons.io.input.XmlStreamReaderException
            r0 = r11
            r4 = r8
            r5 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r11
        Lab:
            return r3
        Lac:
            if (r8 != 0) goto Laf
            return r3
        Laf:
            java.lang.Object[] r11 = new java.lang.Object[]{r2, r3, r8, r9, r10}
            java.lang.String r1 = java.text.MessageFormat.format(r12, r11)
            org.apache.commons.io.input.XmlStreamReaderException r11 = new org.apache.commons.io.input.XmlStreamReaderException
            r0 = r11
            r4 = r8
            r5 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r11
        Lc1:
            if (r8 != 0) goto Lc4
            return r3
        Lc4:
            java.lang.Object[] r11 = new java.lang.Object[]{r2, r3, r8, r9, r10}
            java.lang.String r1 = java.text.MessageFormat.format(r12, r11)
            org.apache.commons.io.input.XmlStreamReaderException r11 = new org.apache.commons.io.input.XmlStreamReaderException
            r0 = r11
            r4 = r8
            r5 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r11
    }

    java.lang.String calculateRawEncoding(java.lang.String r4, java.lang.String r5, java.lang.String r6) throws java.io.IOException {
            r3 = this;
            if (r4 != 0) goto L28
            if (r5 == 0) goto L21
            if (r6 != 0) goto L7
            goto L21
        L7:
            java.lang.String r4 = org.apache.commons.io.input.XmlStreamReader.UTF_16
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L20
            java.lang.String r4 = org.apache.commons.io.input.XmlStreamReader.UTF_16BE
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L1f
            java.lang.String r4 = org.apache.commons.io.input.XmlStreamReader.UTF_16LE
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L20
        L1f:
            return r5
        L20:
            return r6
        L21:
            java.lang.String r4 = r3.defaultEncoding
            if (r4 != 0) goto L27
            java.lang.String r4 = org.apache.commons.io.input.XmlStreamReader.UTF_8
        L27:
            return r4
        L28:
            java.lang.String r0 = org.apache.commons.io.input.XmlStreamReader.UTF_8
            boolean r1 = r4.equals(r0)
            java.lang.String r2 = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch"
            if (r1 == 0) goto L61
            if (r5 == 0) goto L49
            boolean r1 = r5.equals(r0)
            if (r1 == 0) goto L3b
            goto L49
        L3b:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r0 = java.text.MessageFormat.format(r2, r0)
            org.apache.commons.io.input.XmlStreamReaderException r1 = new org.apache.commons.io.input.XmlStreamReaderException
            r1.<init>(r0, r4, r5, r6)
            throw r1
        L49:
            if (r6 == 0) goto L60
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L52
            goto L60
        L52:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r0 = java.text.MessageFormat.format(r2, r0)
            org.apache.commons.io.input.XmlStreamReaderException r1 = new org.apache.commons.io.input.XmlStreamReaderException
            r1.<init>(r0, r4, r5, r6)
            throw r1
        L60:
            return r4
        L61:
            java.lang.String r0 = org.apache.commons.io.input.XmlStreamReader.UTF_16BE
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lca
            java.lang.String r0 = org.apache.commons.io.input.XmlStreamReader.UTF_16LE
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L72
            goto Lca
        L72:
            java.lang.String r0 = "UTF-32BE"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L93
            java.lang.String r0 = "UTF-32LE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L83
            goto L93
        L83:
            java.lang.String r0 = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM"
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r0 = java.text.MessageFormat.format(r0, r1)
            org.apache.commons.io.input.XmlStreamReaderException r1 = new org.apache.commons.io.input.XmlStreamReaderException
            r1.<init>(r0, r4, r5, r6)
            throw r1
        L93:
            if (r5 == 0) goto Laa
            boolean r0 = r5.equals(r4)
            if (r0 == 0) goto L9c
            goto Laa
        L9c:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r0 = java.text.MessageFormat.format(r2, r0)
            org.apache.commons.io.input.XmlStreamReaderException r1 = new org.apache.commons.io.input.XmlStreamReaderException
            r1.<init>(r0, r4, r5, r6)
            throw r1
        Laa:
            if (r6 == 0) goto Lc9
            java.lang.String r0 = "UTF-32"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lc9
            boolean r0 = r6.equals(r4)
            if (r0 == 0) goto Lbb
            goto Lc9
        Lbb:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r0 = java.text.MessageFormat.format(r2, r0)
            org.apache.commons.io.input.XmlStreamReaderException r1 = new org.apache.commons.io.input.XmlStreamReaderException
            r1.<init>(r0, r4, r5, r6)
            throw r1
        Lc9:
            return r4
        Lca:
            if (r5 == 0) goto Le1
            boolean r0 = r5.equals(r4)
            if (r0 == 0) goto Ld3
            goto Le1
        Ld3:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r0 = java.text.MessageFormat.format(r2, r0)
            org.apache.commons.io.input.XmlStreamReaderException r1 = new org.apache.commons.io.input.XmlStreamReaderException
            r1.<init>(r0, r4, r5, r6)
            throw r1
        Le1:
            if (r6 == 0) goto L100
            java.lang.String r0 = org.apache.commons.io.input.XmlStreamReader.UTF_16
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L100
            boolean r0 = r6.equals(r4)
            if (r0 == 0) goto Lf2
            goto L100
        Lf2:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r0 = java.text.MessageFormat.format(r2, r0)
            org.apache.commons.io.input.XmlStreamReaderException r1 = new org.apache.commons.io.input.XmlStreamReaderException
            r1.<init>(r0, r4, r5, r6)
            throw r1
        L100:
            return r4
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.reader
            r0.close()
            return
    }

    public java.lang.String getDefaultEncoding() {
            r1 = this;
            java.lang.String r0 = r1.defaultEncoding
            return r0
    }

    public java.lang.String getEncoding() {
            r1 = this;
            java.lang.String r0 = r1.encoding
            return r0
    }

    @Override // java.io.Reader
    public int read(char[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.reader
            int r2 = r0.read(r2, r3, r4)
            return r2
    }
}
