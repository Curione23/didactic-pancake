package org.apache.commons.compress.archivers.examples;

/* JADX INFO: loaded from: classes2.dex */
public class Expander {

    @java.lang.FunctionalInterface
    private interface ArchiveEntryBiConsumer<T extends org.apache.commons.compress.archivers.ArchiveEntry> {
        void accept(T r1, java.io.OutputStream r2) throws java.io.IOException;
    }

    @java.lang.FunctionalInterface
    private interface ArchiveEntrySupplier<T extends org.apache.commons.compress.archivers.ArchiveEntry> {
        T get() throws java.io.IOException;
    }

    public Expander() {
            r0 = this;
            r0.<init>()
            return
    }

    private <T extends org.apache.commons.compress.archivers.ArchiveEntry> void expand(org.apache.commons.compress.archivers.examples.Expander.ArchiveEntrySupplier<T> r9, org.apache.commons.compress.archivers.examples.Expander.ArchiveEntryBiConsumer<T> r10, java.nio.file.Path r11) throws java.io.IOException {
            r8 = this;
            r0 = 0
            if (r11 != 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 0
            if (r1 == 0) goto Lb
            r11 = r2
            goto Lf
        Lb:
            java.nio.file.Path r11 = r11.normalize()
        Lf:
            org.apache.commons.compress.archivers.ArchiveEntry r3 = r9.get()
        L13:
            if (r3 == 0) goto La1
            if (r1 == 0) goto L19
            r4 = r2
            goto L1d
        L19:
            java.nio.file.Path r4 = r3.resolveIn(r11)
        L1d:
            boolean r5 = r3.isDirectory()
            java.lang.String r6 = "Failed to create directory "
            if (r5 == 0) goto L4b
            if (r1 != 0) goto L8f
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r0]
            boolean r3 = java.nio.file.Files.isDirectory(r4, r3)
            if (r3 != 0) goto L8f
            java.nio.file.attribute.FileAttribute[] r3 = new java.nio.file.attribute.FileAttribute[r0]
            java.nio.file.Path r3 = java.nio.file.Files.createDirectories(r4, r3)
            if (r3 == 0) goto L38
            goto L8f
        L38:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            java.lang.StringBuilder r10 = r10.append(r4)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L4b:
            if (r1 == 0) goto L4f
            r5 = r2
            goto L53
        L4f:
            java.nio.file.Path r5 = r4.getParent()
        L53:
            if (r1 != 0) goto L79
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r0]
            boolean r7 = java.nio.file.Files.isDirectory(r5, r7)
            if (r7 != 0) goto L79
            java.nio.file.attribute.FileAttribute[] r7 = new java.nio.file.attribute.FileAttribute[r0]
            java.nio.file.Path r7 = java.nio.file.Files.createDirectories(r5, r7)
            if (r7 == 0) goto L66
            goto L79
        L66:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            java.lang.StringBuilder r10 = r10.append(r5)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L79:
            if (r1 == 0) goto L81
            org.apache.commons.io.output.NullOutputStream r4 = org.apache.commons.io.output.NullOutputStream.INSTANCE
            r10.accept(r3, r4)
            goto L8f
        L81:
            java.nio.file.OpenOption[] r5 = new java.nio.file.OpenOption[r0]
            java.io.OutputStream r4 = java.nio.file.Files.newOutputStream(r4, r5)
            r10.accept(r3, r4)     // Catch: java.lang.Throwable -> L95
            if (r4 == 0) goto L8f
            r4.close()
        L8f:
            org.apache.commons.compress.archivers.ArchiveEntry r3 = r9.get()
            goto L13
        L95:
            r9 = move-exception
            if (r4 == 0) goto La0
            r4.close()     // Catch: java.lang.Throwable -> L9c
            goto La0
        L9c:
            r10 = move-exception
            r9.addSuppressed(r10)
        La0:
            throw r9
        La1:
            return
    }

    static /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry lambda$expand$0(org.apache.commons.compress.archivers.ArchiveInputStream r2) throws java.io.IOException {
            org.apache.commons.compress.archivers.ArchiveEntry r0 = r2.getNextEntry()
        L4:
            if (r0 == 0) goto L11
            boolean r1 = r2.canReadEntryData(r0)
            if (r1 != 0) goto L11
            org.apache.commons.compress.archivers.ArchiveEntry r0 = r2.getNextEntry()
            goto L4
        L11:
            return r0
    }

    static /* synthetic */ void lambda$expand$1(org.apache.commons.compress.archivers.ArchiveInputStream r0, org.apache.commons.compress.archivers.ArchiveEntry r1, java.io.OutputStream r2) throws java.io.IOException {
            org.apache.commons.io.IOUtils.copy(r0, r2)
            return
    }

    static /* synthetic */ void lambda$expand$2(org.apache.commons.compress.archivers.sevenz.SevenZFile r2, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r3, java.io.OutputStream r4) throws java.io.IOException {
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]
        L4:
            int r0 = r2.read(r3)
            r1 = -1
            if (r1 == r0) goto L12
            if (r4 == 0) goto L4
            r1 = 0
            r4.write(r3, r1, r0)
            goto L4
        L12:
            return
    }

    static /* synthetic */ org.apache.commons.compress.archivers.tar.TarArchiveEntry lambda$expand$3(java.util.Iterator r1) throws java.io.IOException {
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld
            java.lang.Object r1 = r1.next()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) r1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    static /* synthetic */ void lambda$expand$4(org.apache.commons.compress.archivers.tar.TarFile r0, org.apache.commons.compress.archivers.tar.TarArchiveEntry r1, java.io.OutputStream r2) throws java.io.IOException {
            java.io.InputStream r0 = r0.getInputStream(r1)
            org.apache.commons.io.IOUtils.copy(r0, r2)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lc
            r0.close()
        Lc:
            return
        Ld:
            r1 = move-exception
            if (r0 == 0) goto L18
            r0.close()     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r0 = move-exception
            r1.addSuppressed(r0)
        L18:
            throw r1
    }

    static /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveEntry lambda$expand$5(java.util.Enumeration r3, org.apache.commons.compress.archivers.zip.ZipFile r4) throws java.io.IOException {
            boolean r0 = r3.hasMoreElements()
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.Object r0 = r3.nextElement()
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r0
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L24
            boolean r2 = r4.canReadEntryData(r0)
            if (r2 != 0) goto L24
            boolean r0 = r3.hasMoreElements()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r3.nextElement()
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r0
            goto Lf
        L24:
            return r0
    }

    static /* synthetic */ void lambda$expand$6(org.apache.commons.compress.archivers.zip.ZipFile r0, org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1, java.io.OutputStream r2) throws java.io.IOException {
            java.io.InputStream r0 = r0.getInputStream(r1)
            org.apache.commons.io.IOUtils.copy(r0, r2)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lc
            r0.close()
        Lc:
            return
        Ld:
            r1 = move-exception
            if (r0 == 0) goto L18
            r0.close()     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r0 = move-exception
            r1.addSuppressed(r0)
        L18:
            throw r1
    }

    private boolean prefersSeekableByteChannel(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "tar"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "zip"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "7z"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = 0
            goto L1c
        L1b:
            r2 = 1
        L1c:
            return r2
    }

    private java.nio.file.Path toPath(java.io.File r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.nio.file.Path r1 = r1.toPath()
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public void expand(java.io.File r1, java.io.File r2) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            java.nio.file.Path r2 = r0.toPath(r2)
            r0.expand(r1, r2)
            return
    }

    @java.lang.Deprecated
    public void expand(java.io.InputStream r2, java.io.File r3) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            org.apache.commons.compress.archivers.examples.CloseableConsumer r0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER
            r1.expand(r2, r3, r0)
            return
    }

    public void expand(java.io.InputStream r2, java.io.File r3, org.apache.commons.compress.archivers.examples.CloseableConsumer r4) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter r0 = new org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter
            r0.<init>(r4)
            org.apache.commons.compress.archivers.ArchiveStreamFactory r4 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT     // Catch: java.lang.Throwable -> L18
            org.apache.commons.compress.archivers.ArchiveInputStream r2 = r4.createArchiveInputStream(r2)     // Catch: java.lang.Throwable -> L18
            java.io.Closeable r2 = r0.track(r2)     // Catch: java.lang.Throwable -> L18
            org.apache.commons.compress.archivers.ArchiveInputStream r2 = (org.apache.commons.compress.archivers.ArchiveInputStream) r2     // Catch: java.lang.Throwable -> L18
            r1.expand(r2, r3)     // Catch: java.lang.Throwable -> L18
            r0.close()
            return
        L18:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1d
            goto L21
        L1d:
            r3 = move-exception
            r2.addSuppressed(r3)
        L21:
            throw r2
    }

    public void expand(java.lang.String r1, java.io.File r2, java.io.File r3) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r0 = this;
            java.nio.file.Path r2 = r2.toPath()
            java.nio.file.Path r3 = r0.toPath(r3)
            r0.expand(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public void expand(java.lang.String r2, java.io.InputStream r3, java.io.File r4) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            org.apache.commons.compress.archivers.examples.CloseableConsumer r0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER
            r1.expand(r2, r3, r4, r0)
            return
    }

    public void expand(java.lang.String r1, java.io.InputStream r2, java.io.File r3, org.apache.commons.compress.archivers.examples.CloseableConsumer r4) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r0 = this;
            java.nio.file.Path r3 = r0.toPath(r3)
            r0.expand(r1, r2, r3, r4)
            return
    }

    public void expand(java.lang.String r2, java.io.InputStream r3, java.nio.file.Path r4, org.apache.commons.compress.archivers.examples.CloseableConsumer r5) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter r0 = new org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter
            r0.<init>(r5)
            org.apache.commons.compress.archivers.ArchiveStreamFactory r5 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT     // Catch: java.lang.Throwable -> L18
            org.apache.commons.compress.archivers.ArchiveInputStream r2 = r5.createArchiveInputStream(r2, r3)     // Catch: java.lang.Throwable -> L18
            java.io.Closeable r2 = r0.track(r2)     // Catch: java.lang.Throwable -> L18
            org.apache.commons.compress.archivers.ArchiveInputStream r2 = (org.apache.commons.compress.archivers.ArchiveInputStream) r2     // Catch: java.lang.Throwable -> L18
            r1.expand(r2, r4)     // Catch: java.lang.Throwable -> L18
            r0.close()
            return
        L18:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1d
            goto L21
        L1d:
            r3 = move-exception
            r2.addSuppressed(r3)
        L21:
            throw r2
    }

    @java.lang.Deprecated
    public void expand(java.lang.String r2, java.nio.channels.SeekableByteChannel r3, java.io.File r4) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            org.apache.commons.compress.archivers.examples.CloseableConsumer r0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER
            r1.expand(r2, r3, r4, r0)
            return
    }

    public void expand(java.lang.String r1, java.nio.channels.SeekableByteChannel r2, java.io.File r3, org.apache.commons.compress.archivers.examples.CloseableConsumer r4) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r0 = this;
            java.nio.file.Path r3 = r0.toPath(r3)
            r0.expand(r1, r2, r3, r4)
            return
    }

    public void expand(java.lang.String r3, java.nio.channels.SeekableByteChannel r4, java.nio.file.Path r5, org.apache.commons.compress.archivers.examples.CloseableConsumer r6) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r2 = this;
            java.lang.String r0 = "Don't know how to handle format "
            org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter r1 = new org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter
            r1.<init>(r6)
            boolean r6 = r2.prefersSeekableByteChannel(r3)     // Catch: java.lang.Throwable -> L86
            if (r6 != 0) goto L1d
            java.io.InputStream r4 = java.nio.channels.Channels.newInputStream(r4)     // Catch: java.lang.Throwable -> L86
            java.io.Closeable r4 = r1.track(r4)     // Catch: java.lang.Throwable -> L86
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch: java.lang.Throwable -> L86
            org.apache.commons.compress.archivers.examples.CloseableConsumer r6 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER     // Catch: java.lang.Throwable -> L86
            r2.expand(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L86
            goto L6f
        L1d:
            java.lang.String r6 = "tar"
            boolean r6 = r6.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L86
            if (r6 == 0) goto L34
            org.apache.commons.compress.archivers.tar.TarFile r3 = new org.apache.commons.compress.archivers.tar.TarFile     // Catch: java.lang.Throwable -> L86
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L86
            java.io.Closeable r3 = r1.track(r3)     // Catch: java.lang.Throwable -> L86
            org.apache.commons.compress.archivers.tar.TarFile r3 = (org.apache.commons.compress.archivers.tar.TarFile) r3     // Catch: java.lang.Throwable -> L86
            r2.expand(r3, r5)     // Catch: java.lang.Throwable -> L86
            goto L6f
        L34:
            java.lang.String r6 = "zip"
            boolean r6 = r6.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L86
            if (r6 == 0) goto L52
            org.apache.commons.compress.archivers.zip.ZipFile$Builder r3 = org.apache.commons.compress.archivers.zip.ZipFile.builder()     // Catch: java.lang.Throwable -> L86
            org.apache.commons.compress.archivers.zip.ZipFile$Builder r3 = r3.setSeekableByteChannel(r4)     // Catch: java.lang.Throwable -> L86
            org.apache.commons.compress.archivers.zip.ZipFile r3 = r3.get()     // Catch: java.lang.Throwable -> L86
            java.io.Closeable r3 = r1.track(r3)     // Catch: java.lang.Throwable -> L86
            org.apache.commons.compress.archivers.zip.ZipFile r3 = (org.apache.commons.compress.archivers.zip.ZipFile) r3     // Catch: java.lang.Throwable -> L86
            r2.expand(r3, r5)     // Catch: java.lang.Throwable -> L86
            goto L6f
        L52:
            java.lang.String r6 = "7z"
            boolean r6 = r6.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L86
            if (r6 == 0) goto L73
            org.apache.commons.compress.archivers.sevenz.SevenZFile$Builder r3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.builder()     // Catch: java.lang.Throwable -> L86
            org.apache.commons.compress.archivers.sevenz.SevenZFile$Builder r3 = r3.setSeekableByteChannel(r4)     // Catch: java.lang.Throwable -> L86
            org.apache.commons.compress.archivers.sevenz.SevenZFile r3 = r3.get()     // Catch: java.lang.Throwable -> L86
            java.io.Closeable r3 = r1.track(r3)     // Catch: java.lang.Throwable -> L86
            org.apache.commons.compress.archivers.sevenz.SevenZFile r3 = (org.apache.commons.compress.archivers.sevenz.SevenZFile) r3     // Catch: java.lang.Throwable -> L86
            r2.expand(r3, r5)     // Catch: java.lang.Throwable -> L86
        L6f:
            r1.close()
            return
        L73:
            org.apache.commons.compress.archivers.ArchiveException r4 = new org.apache.commons.compress.archivers.ArchiveException     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r3 = r5.append(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L86
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L86
            throw r4     // Catch: java.lang.Throwable -> L86
        L86:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r4 = move-exception
            r3.addSuppressed(r4)
        L8f:
            throw r3
    }

    public void expand(java.lang.String r4, java.nio.file.Path r5, java.nio.file.Path r6) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r3 = this;
            boolean r0 = r3.prefersSeekableByteChannel(r4)
            r1 = 0
            if (r0 == 0) goto L29
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.READ
            r0[r1] = r2
            java.nio.channels.FileChannel r5 = java.nio.channels.FileChannel.open(r5, r0)
            org.apache.commons.compress.archivers.examples.CloseableConsumer r0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.CLOSING_CONSUMER     // Catch: java.lang.Throwable -> L1d
            r3.expand(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L1c
            r5.close()
        L1c:
            return
        L1d:
            r4 = move-exception
            if (r5 == 0) goto L28
            r5.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r5 = move-exception
            r4.addSuppressed(r5)
        L28:
            throw r4
        L29:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
            java.io.InputStream r5 = java.nio.file.Files.newInputStream(r5, r1)
            r0.<init>(r5)
            org.apache.commons.compress.archivers.examples.CloseableConsumer r5 = org.apache.commons.compress.archivers.examples.CloseableConsumer.CLOSING_CONSUMER     // Catch: java.lang.Throwable -> L3d
            r3.expand(r4, r0, r6, r5)     // Catch: java.lang.Throwable -> L3d
            r0.close()
            return
        L3d:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r5 = move-exception
            r4.addSuppressed(r5)
        L46:
            throw r4
    }

    public void expand(java.nio.file.Path r3, java.nio.file.Path r4) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r2 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
            java.io.InputStream r1 = java.nio.file.Files.newInputStream(r3, r1)
            r0.<init>(r1)
            java.lang.String r1 = org.apache.commons.compress.archivers.ArchiveStreamFactory.detect(r0)     // Catch: java.lang.Throwable -> L17
            r2.expand(r1, r3, r4)     // Catch: java.lang.Throwable -> L17
            r0.close()
            return
        L17:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r4 = move-exception
            r3.addSuppressed(r4)
        L20:
            throw r3
    }

    public void expand(org.apache.commons.compress.archivers.ArchiveInputStream<?> r1, java.io.File r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r2 = r0.toPath(r2)
            r0.expand(r1, r2)
            return
    }

    public void expand(org.apache.commons.compress.archivers.ArchiveInputStream<?> r3, java.nio.file.Path r4) throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda4 r0 = new org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda4
            r0.<init>(r3)
            org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda5 r1 = new org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda5
            r1.<init>(r3)
            r2.expand(r0, r1, r4)
            return
    }

    public void expand(org.apache.commons.compress.archivers.sevenz.SevenZFile r1, java.io.File r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r2 = r0.toPath(r2)
            r0.expand(r1, r2)
            return
    }

    public void expand(org.apache.commons.compress.archivers.sevenz.SevenZFile r3, java.nio.file.Path r4) throws java.io.IOException {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda0
            r0.<init>(r3)
            org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda1 r1 = new org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda1
            r1.<init>(r3)
            r2.expand(r0, r1, r4)
            return
    }

    public void expand(org.apache.commons.compress.archivers.tar.TarFile r1, java.io.File r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r2 = r0.toPath(r2)
            r0.expand(r1, r2)
            return
    }

    public void expand(org.apache.commons.compress.archivers.tar.TarFile r3, java.nio.file.Path r4) throws java.io.IOException {
            r2 = this;
            java.util.List r0 = r3.getEntries()
            java.util.Iterator r0 = r0.iterator()
            org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda2 r1 = new org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda2
            r1.<init>(r0)
            org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda3 r0 = new org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda3
            r0.<init>(r3)
            r2.expand(r1, r0, r4)
            return
    }

    public void expand(org.apache.commons.compress.archivers.zip.ZipFile r1, java.io.File r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r2 = r0.toPath(r2)
            r0.expand(r1, r2)
            return
    }

    public void expand(org.apache.commons.compress.archivers.zip.ZipFile r3, java.nio.file.Path r4) throws java.io.IOException {
            r2 = this;
            java.util.Enumeration r0 = r3.getEntries()
            org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda6 r1 = new org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda6
            r1.<init>(r0, r3)
            org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda7 r0 = new org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda7
            r0.<init>(r3)
            r2.expand(r1, r0, r4)
            return
    }
}
