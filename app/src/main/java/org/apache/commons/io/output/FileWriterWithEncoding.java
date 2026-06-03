package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class FileWriterWithEncoding extends org.apache.commons.io.output.ProxyWriter {

    /* JADX INFO: renamed from: org.apache.commons.io.output.FileWriterWithEncoding$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.output.FileWriterWithEncoding, org.apache.commons.io.output.FileWriterWithEncoding.Builder> {
        private boolean append;
        private java.nio.charset.CharsetEncoder charsetEncoder;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.nio.charset.Charset r0 = super.getCharset()
                java.nio.charset.CharsetEncoder r0 = r0.newEncoder()
                r1.charsetEncoder = r0
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.output.FileWriterWithEncoding r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.output.FileWriterWithEncoding get() throws java.io.IOException {
                r4 = this;
                java.nio.charset.CharsetEncoder r0 = r4.charsetEncoder
                if (r0 == 0) goto L35
                java.nio.charset.Charset r0 = r4.getCharset()
                if (r0 == 0) goto L35
                java.nio.charset.CharsetEncoder r0 = r4.charsetEncoder
                java.nio.charset.Charset r0 = r0.charset()
                java.nio.charset.Charset r1 = r4.getCharset()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1b
                goto L35
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.nio.charset.Charset r1 = r4.getCharset()
                java.nio.charset.CharsetEncoder r2 = r4.charsetEncoder
                java.nio.charset.Charset r2 = r2.charset()
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
                java.lang.String r2 = "Mismatched Charset(%s) and CharsetEncoder(%s)"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L35:
                java.nio.charset.CharsetEncoder r0 = r4.charsetEncoder
                if (r0 == 0) goto L3a
                goto L3e
            L3a:
                java.nio.charset.Charset r0 = r4.getCharset()
            L3e:
                org.apache.commons.io.output.FileWriterWithEncoding r1 = new org.apache.commons.io.output.FileWriterWithEncoding
                org.apache.commons.io.build.AbstractOrigin r2 = r4.checkOrigin()
                java.io.File r2 = r2.getFile()
                boolean r3 = r4.append
                java.io.OutputStreamWriter r0 = org.apache.commons.io.output.FileWriterWithEncoding.access$000(r2, r0, r3)
                r2 = 0
                r1.<init>(r0, r2)
                return r1
        }

        public org.apache.commons.io.output.FileWriterWithEncoding.Builder setAppend(boolean r1) {
                r0 = this;
                r0.append = r1
                return r0
        }

        public org.apache.commons.io.output.FileWriterWithEncoding.Builder setCharsetEncoder(java.nio.charset.CharsetEncoder r1) {
                r0 = this;
                r0.charsetEncoder = r1
                return r0
        }
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.io.File r1, java.lang.String r2, boolean r3) throws java.io.IOException {
            r0 = this;
            java.io.OutputStreamWriter r1 = initWriter(r1, r2, r3)
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.io.File r2, java.nio.charset.Charset r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.io.File r1, java.nio.charset.Charset r2, boolean r3) throws java.io.IOException {
            r0 = this;
            java.io.OutputStreamWriter r1 = initWriter(r1, r2, r3)
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.io.File r2, java.nio.charset.CharsetEncoder r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.io.File r1, java.nio.charset.CharsetEncoder r2, boolean r3) throws java.io.IOException {
            r0 = this;
            java.io.OutputStreamWriter r1 = initWriter(r1, r2, r3)
            r0.<init>(r1)
            return
    }

    private FileWriterWithEncoding(java.io.OutputStreamWriter r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* synthetic */ FileWriterWithEncoding(java.io.OutputStreamWriter r1, org.apache.commons.io.output.FileWriterWithEncoding.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r0, r3, r2)
            return
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.lang.String r2, java.lang.String r3, boolean r4) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.<init>(r0, r3, r4)
            return
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.lang.String r2, java.nio.charset.Charset r3) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r0, r3, r2)
            return
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.lang.String r2, java.nio.charset.Charset r3, boolean r4) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.<init>(r0, r3, r4)
            return
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.lang.String r2, java.nio.charset.CharsetEncoder r3) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r0, r3, r2)
            return
    }

    @java.lang.Deprecated
    public FileWriterWithEncoding(java.lang.String r2, java.nio.charset.CharsetEncoder r3, boolean r4) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.<init>(r0, r3, r4)
            return
    }

    static /* synthetic */ java.io.OutputStreamWriter access$000(java.io.File r0, java.lang.Object r1, boolean r2) throws java.io.IOException {
            java.io.OutputStreamWriter r0 = initWriter(r0, r1, r2)
            return r0
    }

    public static org.apache.commons.io.output.FileWriterWithEncoding.Builder builder() {
            org.apache.commons.io.output.FileWriterWithEncoding$Builder r0 = new org.apache.commons.io.output.FileWriterWithEncoding$Builder
            r0.<init>()
            return r0
    }

    private static java.io.OutputStreamWriter initWriter(java.io.File r2, java.lang.Object r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = r2.exists()
            r1 = 0
            java.io.OutputStream r1 = org.apache.commons.io.FileUtils.newOutputStream(r2, r4)     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            if (r3 == 0) goto L29
            boolean r4 = r3 instanceof java.nio.charset.Charset     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            if (r4 == 0) goto L15
            goto L29
        L15:
            boolean r4 = r3 instanceof java.nio.charset.CharsetEncoder     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            if (r4 == 0) goto L21
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            java.nio.charset.CharsetEncoder r3 = (java.nio.charset.CharsetEncoder) r3     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            r4.<init>(r1, r3)     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            return r4
        L21:
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            r4.<init>(r1, r3)     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            return r4
        L29:
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            java.nio.charset.Charset r3 = (java.nio.charset.Charset) r3     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3)     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            r4.<init>(r1, r3)     // Catch: java.lang.RuntimeException -> L35 java.io.IOException -> L37
            return r4
        L35:
            r3 = move-exception
            goto L38
        L37:
            r3 = move-exception
        L38:
            org.apache.commons.io.IOUtils.close(r1)     // Catch: java.io.IOException -> L3c
            goto L40
        L3c:
            r4 = move-exception
            r3.addSuppressed(r4)
        L40:
            if (r0 != 0) goto L45
            org.apache.commons.io.FileUtils.deleteQuietly(r2)
        L45:
            throw r3
    }
}
