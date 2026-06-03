package org.apache.commons.io.build;

import org.apache.commons.io.build.AbstractOrigin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractOrigin<T, B extends org.apache.commons.io.build.AbstractOrigin<T, B>> extends org.apache.commons.io.build.AbstractSupplier<T, B> {
    final T origin;

    public static class ByteArrayOrigin extends org.apache.commons.io.build.AbstractOrigin<byte[], org.apache.commons.io.build.AbstractOrigin.ByteArrayOrigin> {
        public ByteArrayOrigin(byte[] r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                byte[] r0 = (byte[]) r0
                return r0
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.InputStream getInputStream(java.nio.file.OpenOption... r2) throws java.io.IOException {
                r1 = this;
                java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
                T r0 = r1.origin
                byte[] r0 = (byte[]) r0
                r2.<init>(r0)
                return r2
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.Reader getReader(java.nio.charset.Charset r3) throws java.io.IOException {
                r2 = this;
                java.io.InputStreamReader r0 = new java.io.InputStreamReader
                r1 = 0
                java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
                java.io.InputStream r1 = r2.getInputStream(r1)
                r0.<init>(r1, r3)
                return r0
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public long size() throws java.io.IOException {
                r2 = this;
                T r0 = r2.origin
                byte[] r0 = (byte[]) r0
                int r0 = r0.length
                long r0 = (long) r0
                return r0
        }
    }

    public static class CharSequenceOrigin extends org.apache.commons.io.build.AbstractOrigin<java.lang.CharSequence, org.apache.commons.io.build.AbstractOrigin.CharSequenceOrigin> {
        public CharSequenceOrigin(java.lang.CharSequence r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray() {
                r2 = this;
                T r0 = r2.origin
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r0 = r0.toString()
                java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
                byte[] r0 = r0.getBytes(r1)
                return r0
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.lang.CharSequence getCharSequence(java.nio.charset.Charset r1) {
                r0 = this;
                java.lang.Object r1 = r0.get()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                return r1
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.InputStream getInputStream(java.nio.file.OpenOption... r2) throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.CharSequenceInputStream$Builder r2 = org.apache.commons.io.input.CharSequenceInputStream.builder()
                java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
                java.lang.CharSequence r0 = r1.getCharSequence(r0)
                org.apache.commons.io.build.AbstractOriginSupplier r2 = r2.setCharSequence(r0)
                org.apache.commons.io.input.CharSequenceInputStream$Builder r2 = (org.apache.commons.io.input.CharSequenceInputStream.Builder) r2
                org.apache.commons.io.input.CharSequenceInputStream r2 = r2.get()
                return r2
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.Reader getReader(java.nio.charset.Charset r2) throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.CharSequenceReader r2 = new org.apache.commons.io.input.CharSequenceReader
                java.lang.Object r0 = r1.get()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r2.<init>(r0)
                return r2
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public long size() throws java.io.IOException {
                r2 = this;
                T r0 = r2.origin
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                long r0 = (long) r0
                return r0
        }
    }

    public static class FileOrigin extends org.apache.commons.io.build.AbstractOrigin<java.io.File, org.apache.commons.io.build.AbstractOrigin.FileOrigin> {
        public FileOrigin(java.io.File r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray(long r3, int r5) throws java.io.IOException {
                r2 = this;
                org.apache.commons.io.RandomAccessFileMode r0 = org.apache.commons.io.RandomAccessFileMode.READ_ONLY
                T r1 = r2.origin
                java.io.File r1 = (java.io.File) r1
                java.io.RandomAccessFile r0 = r0.create(r1)
                byte[] r3 = org.apache.commons.io.RandomAccessFiles.read(r0, r3, r5)     // Catch: java.lang.Throwable -> L14
                if (r0 == 0) goto L13
                r0.close()
            L13:
                return r3
            L14:
                r3 = move-exception
                if (r0 == 0) goto L1f
                r0.close()     // Catch: java.lang.Throwable -> L1b
                goto L1f
            L1b:
                r4 = move-exception
                r3.addSuppressed(r4)
            L1f:
                throw r3
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.File getFile() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                java.io.File r0 = (java.io.File) r0
                return r0
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.nio.file.Path getPath() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                java.io.File r0 = (java.io.File) r0
                java.nio.file.Path r0 = r0.toPath()
                return r0
        }
    }

    public static class InputStreamOrigin extends org.apache.commons.io.build.AbstractOrigin<java.io.InputStream, org.apache.commons.io.build.AbstractOrigin.InputStreamOrigin> {
        public InputStreamOrigin(java.io.InputStream r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray() throws java.io.IOException {
                r1 = this;
                T r0 = r1.origin
                java.io.InputStream r0 = (java.io.InputStream) r0
                byte[] r0 = org.apache.commons.io.IOUtils.toByteArray(r0)
                return r0
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.InputStream getInputStream(java.nio.file.OpenOption... r1) {
                r0 = this;
                java.lang.Object r1 = r0.get()
                java.io.InputStream r1 = (java.io.InputStream) r1
                return r1
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.Reader getReader(java.nio.charset.Charset r3) throws java.io.IOException {
                r2 = this;
                java.io.InputStreamReader r0 = new java.io.InputStreamReader
                r1 = 0
                java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
                java.io.InputStream r1 = r2.getInputStream(r1)
                r0.<init>(r1, r3)
                return r0
        }
    }

    public static class OutputStreamOrigin extends org.apache.commons.io.build.AbstractOrigin<java.io.OutputStream, org.apache.commons.io.build.AbstractOrigin.OutputStreamOrigin> {
        public OutputStreamOrigin(java.io.OutputStream r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.OutputStream getOutputStream(java.nio.file.OpenOption... r1) {
                r0 = this;
                java.lang.Object r1 = r0.get()
                java.io.OutputStream r1 = (java.io.OutputStream) r1
                return r1
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.Writer getWriter(java.nio.charset.Charset r2, java.nio.file.OpenOption... r3) throws java.io.IOException {
                r1 = this;
                java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
                T r0 = r1.origin
                java.io.OutputStream r0 = (java.io.OutputStream) r0
                r3.<init>(r0, r2)
                return r3
        }
    }

    public static class PathOrigin extends org.apache.commons.io.build.AbstractOrigin<java.nio.file.Path, org.apache.commons.io.build.AbstractOrigin.PathOrigin> {
        public PathOrigin(java.nio.file.Path r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray(long r3, int r5) throws java.io.IOException {
                r2 = this;
                org.apache.commons.io.RandomAccessFileMode r0 = org.apache.commons.io.RandomAccessFileMode.READ_ONLY
                T r1 = r2.origin
                java.nio.file.Path r1 = (java.nio.file.Path) r1
                java.io.RandomAccessFile r0 = r0.create(r1)
                byte[] r3 = org.apache.commons.io.RandomAccessFiles.read(r0, r3, r5)     // Catch: java.lang.Throwable -> L14
                if (r0 == 0) goto L13
                r0.close()
            L13:
                return r3
            L14:
                r3 = move-exception
                if (r0 == 0) goto L1f
                r0.close()     // Catch: java.lang.Throwable -> L1b
                goto L1f
            L1b:
                r4 = move-exception
                r3.addSuppressed(r4)
            L1f:
                throw r3
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.File getFile() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                java.nio.file.Path r0 = (java.nio.file.Path) r0
                java.io.File r0 = r0.toFile()
                return r0
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.nio.file.Path getPath() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                java.nio.file.Path r0 = (java.nio.file.Path) r0
                return r0
        }
    }

    public static class ReaderOrigin extends org.apache.commons.io.build.AbstractOrigin<java.io.Reader, org.apache.commons.io.build.AbstractOrigin.ReaderOrigin> {
        public ReaderOrigin(java.io.Reader r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public byte[] getByteArray() throws java.io.IOException {
                r2 = this;
                T r0 = r2.origin
                java.io.Reader r0 = (java.io.Reader) r0
                java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
                byte[] r0 = org.apache.commons.io.IOUtils.toByteArray(r0, r1)
                return r0
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.lang.CharSequence getCharSequence(java.nio.charset.Charset r1) throws java.io.IOException {
                r0 = this;
                T r1 = r0.origin
                java.io.Reader r1 = (java.io.Reader) r1
                java.lang.String r1 = org.apache.commons.io.IOUtils.toString(r1)
                return r1
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.InputStream getInputStream(java.nio.file.OpenOption... r2) throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.ReaderInputStream$Builder r2 = org.apache.commons.io.input.ReaderInputStream.builder()
                T r0 = r1.origin
                java.io.Reader r0 = (java.io.Reader) r0
                org.apache.commons.io.build.AbstractOriginSupplier r2 = r2.setReader(r0)
                org.apache.commons.io.input.ReaderInputStream$Builder r2 = (org.apache.commons.io.input.ReaderInputStream.Builder) r2
                java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
                org.apache.commons.io.input.ReaderInputStream$Builder r2 = r2.setCharset(r0)
                org.apache.commons.io.input.ReaderInputStream r2 = r2.get()
                return r2
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.Reader getReader(java.nio.charset.Charset r1) throws java.io.IOException {
                r0 = this;
                java.lang.Object r1 = r0.get()
                java.io.Reader r1 = (java.io.Reader) r1
                return r1
        }
    }

    public static class URIOrigin extends org.apache.commons.io.build.AbstractOrigin<java.net.URI, org.apache.commons.io.build.AbstractOrigin.URIOrigin> {
        public URIOrigin(java.net.URI r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.File getFile() {
                r1 = this;
                java.nio.file.Path r0 = r1.getPath()
                java.io.File r0 = r0.toFile()
                return r0
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.nio.file.Path getPath() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                java.net.URI r0 = (java.net.URI) r0
                java.nio.file.Path r0 = java.nio.file.Paths.get(r0)
                return r0
        }
    }

    public static class WriterOrigin extends org.apache.commons.io.build.AbstractOrigin<java.io.Writer, org.apache.commons.io.build.AbstractOrigin.WriterOrigin> {
        public WriterOrigin(java.io.Writer r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.OutputStream getOutputStream(java.nio.file.OpenOption... r2) throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.output.WriterOutputStream$Builder r2 = org.apache.commons.io.output.WriterOutputStream.builder()
                T r0 = r1.origin
                java.io.Writer r0 = (java.io.Writer) r0
                org.apache.commons.io.build.AbstractOriginSupplier r2 = r2.setWriter(r0)
                org.apache.commons.io.output.WriterOutputStream$Builder r2 = (org.apache.commons.io.output.WriterOutputStream.Builder) r2
                java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
                org.apache.commons.io.output.WriterOutputStream$Builder r2 = r2.setCharset(r0)
                org.apache.commons.io.output.WriterOutputStream r2 = r2.get()
                return r2
        }

        @Override // org.apache.commons.io.build.AbstractOrigin
        public java.io.Writer getWriter(java.nio.charset.Charset r1, java.nio.file.OpenOption... r2) throws java.io.IOException {
                r0 = this;
                java.lang.Object r1 = r0.get()
                java.io.Writer r1 = (java.io.Writer) r1
                return r1
        }
    }

    protected AbstractOrigin(T r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "origin"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            r1.origin = r2
            return
    }

    private java.lang.String getSimpleName() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public T get() {
            r1 = this;
            T r0 = r1.origin
            return r0
    }

    public byte[] getByteArray() throws java.io.IOException {
            r1 = this;
            java.nio.file.Path r0 = r1.getPath()
            byte[] r0 = java.nio.file.Files.readAllBytes(r0)
            return r0
    }

    public byte[] getByteArray(long r4, int r6) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.getByteArray()
            int r4 = java.lang.Math.toIntExact(r4)
            if (r4 < 0) goto L18
            if (r6 < 0) goto L18
            int r5 = r4 + r6
            if (r5 < 0) goto L18
            int r1 = r0.length
            if (r5 > r1) goto L18
            byte[] r4 = java.util.Arrays.copyOfRange(r0, r4, r5)
            return r4
        L18:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Couldn't read array (start: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ", length: "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = ", data length: "
            java.lang.StringBuilder r4 = r4.append(r6)
            int r6 = r0.length
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = ")."
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public java.lang.CharSequence getCharSequence(java.nio.charset.Charset r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r2.getByteArray()
            r0.<init>(r1, r3)
            return r0
    }

    public java.io.File getFile() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = r4.getSimpleName()
            T r2 = r4.origin
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            T r3 = r4.origin
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "%s#getFile() for %s origin %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public java.io.InputStream getInputStream(java.nio.file.OpenOption... r2) throws java.io.IOException {
            r1 = this;
            java.nio.file.Path r0 = r1.getPath()
            java.io.InputStream r2 = java.nio.file.Files.newInputStream(r0, r2)
            return r2
    }

    public java.io.OutputStream getOutputStream(java.nio.file.OpenOption... r2) throws java.io.IOException {
            r1 = this;
            java.nio.file.Path r0 = r1.getPath()
            java.io.OutputStream r2 = java.nio.file.Files.newOutputStream(r0, r2)
            return r2
    }

    public java.nio.file.Path getPath() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = r4.getSimpleName()
            T r2 = r4.origin
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            T r3 = r4.origin
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "%s#getPath() for %s origin %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public java.io.Reader getReader(java.nio.charset.Charset r2) throws java.io.IOException {
            r1 = this;
            java.nio.file.Path r0 = r1.getPath()
            java.io.BufferedReader r2 = java.nio.file.Files.newBufferedReader(r0, r2)
            return r2
    }

    public java.io.Writer getWriter(java.nio.charset.Charset r2, java.nio.file.OpenOption... r3) throws java.io.IOException {
            r1 = this;
            java.nio.file.Path r0 = r1.getPath()
            java.io.BufferedWriter r2 = java.nio.file.Files.newBufferedWriter(r0, r2, r3)
            return r2
    }

    public long size() throws java.io.IOException {
            r2 = this;
            java.nio.file.Path r0 = r2.getPath()
            long r0 = java.nio.file.Files.size(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)
            T r1 = r2.origin
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
