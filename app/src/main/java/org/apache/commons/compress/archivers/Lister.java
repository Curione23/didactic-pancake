package org.apache.commons.compress.archivers;

/* JADX INFO: loaded from: classes2.dex */
public final class Lister {
    private static final org.apache.commons.compress.archivers.ArchiveStreamFactory FACTORY = null;
    private final java.lang.String[] args;
    private final boolean quiet;

    /* JADX INFO: renamed from: $r8$lambda$7K4LkutmeGo0zI0-b7r0c4f8_vw, reason: not valid java name */
    public static /* synthetic */ void m2539$r8$lambda$7K4LkutmeGo0zI0b7r0c4f8_vw(org.apache.commons.compress.archivers.Lister r0, org.apache.commons.compress.archivers.ArchiveEntry r1) {
            r0.println(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$jeylU3_PA2GF71ZeMnn8XGhZPmk(org.apache.commons.compress.archivers.Lister r0, org.apache.commons.compress.archivers.ArchiveEntry r1) {
            r0.println(r1)
            return
    }

    static {
            org.apache.commons.compress.archivers.ArchiveStreamFactory r0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT
            org.apache.commons.compress.archivers.Lister.FACTORY = r0
            return
    }

    @java.lang.Deprecated
    public Lister() {
            r3 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = ""
            r2 = 0
            r0[r2] = r1
            r3.<init>(r2, r0)
            return
    }

    Lister(boolean r1, java.lang.String... r2) {
            r0 = this;
            r0.<init>()
            r0.quiet = r1
            java.lang.Object r1 = r2.clone()
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.args = r1
            r1 = 0
            r1 = r2[r1]
            java.lang.String r2 = "args[0]"
            java.util.Objects.requireNonNull(r1, r2)
            return
    }

    private static <T extends org.apache.commons.compress.archivers.ArchiveInputStream<? extends E>, E extends org.apache.commons.compress.archivers.ArchiveEntry> T createArchiveInputStream(java.lang.String[] r2, java.io.InputStream r3) throws org.apache.commons.compress.archivers.ArchiveException {
            int r0 = r2.length
            r1 = 1
            if (r0 <= r1) goto Ld
            org.apache.commons.compress.archivers.ArchiveStreamFactory r0 = org.apache.commons.compress.archivers.Lister.FACTORY
            r2 = r2[r1]
            org.apache.commons.compress.archivers.ArchiveInputStream r2 = r0.createArchiveInputStream(r2, r3)
            return r2
        Ld:
            org.apache.commons.compress.archivers.ArchiveStreamFactory r2 = org.apache.commons.compress.archivers.Lister.FACTORY
            org.apache.commons.compress.archivers.ArchiveInputStream r2 = r2.createArchiveInputStream(r3)
            return r2
    }

    private static java.lang.String detectFormat(java.nio.file.Path r2) throws org.apache.commons.compress.archivers.ArchiveException, java.io.IOException {
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
            java.io.InputStream r2 = java.nio.file.Files.newInputStream(r2, r1)
            r0.<init>(r2)
            java.lang.String r2 = org.apache.commons.compress.archivers.ArchiveStreamFactory.detect(r0)     // Catch: java.lang.Throwable -> L14
            r0.close()
            return r2
        L14:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r0 = move-exception
            r2.addSuppressed(r0)
        L1d:
            throw r2
    }

    private void list(java.nio.file.Path r6, java.lang.String... r7) throws org.apache.commons.compress.archivers.ArchiveException, java.io.IOException {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Analyzing "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            boolean r1 = java.nio.file.Files.isRegularFile(r6, r1)
            if (r1 != 0) goto L33
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = " doesn't exist or is a directory"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
        L33:
            int r1 = r7.length
            r2 = 1
            if (r1 <= r2) goto L3a
            r1 = r7[r2]
            goto L3e
        L3a:
            java.lang.String r1 = detectFormat(r6)
        L3e:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Detected format "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r5.println(r3)
            r1.hashCode()
            int r3 = r1.hashCode()
            r4 = -1
            switch(r3) {
                case 1827: goto L79;
                case 114597: goto L6e;
                case 120609: goto L63;
                default: goto L61;
            }
        L61:
            r0 = r4
            goto L82
        L63:
            java.lang.String r0 = "zip"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6c
            goto L61
        L6c:
            r0 = 2
            goto L82
        L6e:
            java.lang.String r0 = "tar"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L77
            goto L61
        L77:
            r0 = r2
            goto L82
        L79:
            java.lang.String r2 = "7z"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L82
            goto L61
        L82:
            switch(r0) {
                case 0: goto L91;
                case 1: goto L8d;
                case 2: goto L89;
                default: goto L85;
            }
        L85:
            r5.listStream(r6, r7)
            goto L94
        L89:
            r5.listZipUsingZipFile(r6)
            goto L94
        L8d:
            r5.listZipUsingTarFile(r6)
            goto L94
        L91:
            r5.list7z(r6)
        L94:
            return
    }

    private void list7z(java.nio.file.Path r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "Created "
            org.apache.commons.compress.archivers.sevenz.SevenZFile$Builder r1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r3 = r1.setPath(r3)
            org.apache.commons.compress.archivers.sevenz.SevenZFile$Builder r3 = (org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder) r3
            org.apache.commons.compress.archivers.sevenz.SevenZFile r3 = r3.get()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r0 = r1.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52
            r2.println(r0)     // Catch: java.lang.Throwable -> L52
        L20:
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r0 = r3.getNextEntry()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L4c
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r0.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r3.getDefaultName()     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = " (entry name was null)"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52
            goto L48
        L44:
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L52
        L48:
            r2.println(r0)     // Catch: java.lang.Throwable -> L52
            goto L20
        L4c:
            if (r3 == 0) goto L51
            r3.close()
        L51:
            return
        L52:
            r0 = move-exception
            if (r3 == 0) goto L5d
            r3.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r3 = move-exception
            r0.addSuppressed(r3)
        L5d:
            throw r0
    }

    private void listStream(java.nio.file.Path r4, java.lang.String[] r5) throws org.apache.commons.compress.archivers.ArchiveException, java.io.IOException {
            r3 = this;
            java.lang.String r0 = "Created "
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r2 = 0
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r2]
            java.io.InputStream r4 = java.nio.file.Files.newInputStream(r4, r2)
            r1.<init>(r4)
            org.apache.commons.compress.archivers.ArchiveInputStream r4 = createArchiveInputStream(r5, r1)     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L37
            r3.println(r5)     // Catch: java.lang.Throwable -> L37
            org.apache.commons.compress.archivers.Lister$$ExternalSyntheticLambda0 r5 = new org.apache.commons.compress.archivers.Lister$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L37
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L37
            r4.forEach(r5)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L33
            r4.close()     // Catch: java.lang.Throwable -> L43
        L33:
            r1.close()
            return
        L37:
            r5 = move-exception
            if (r4 == 0) goto L42
            r4.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L43
        L42:
            throw r5     // Catch: java.lang.Throwable -> L43
        L43:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r5 = move-exception
            r4.addSuppressed(r5)
        L4c:
            throw r4
    }

    private void listZipUsingTarFile(java.nio.file.Path r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "Created "
            org.apache.commons.compress.archivers.tar.TarFile r1 = new org.apache.commons.compress.archivers.tar.TarFile
            r1.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L27
            r2.println(r3)     // Catch: java.lang.Throwable -> L27
            java.util.List r3 = r1.getEntries()     // Catch: java.lang.Throwable -> L27
            org.apache.commons.compress.archivers.Lister$$ExternalSyntheticLambda1 r0 = new org.apache.commons.compress.archivers.Lister$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L27
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L27
            r3.forEach(r0)     // Catch: java.lang.Throwable -> L27
            r1.close()
            return
        L27:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r0 = move-exception
            r3.addSuppressed(r0)
        L30:
            throw r3
    }

    private void listZipUsingZipFile(java.nio.file.Path r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "Created "
            org.apache.commons.compress.archivers.zip.ZipFile$Builder r1 = org.apache.commons.compress.archivers.zip.ZipFile.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r3 = r1.setPath(r3)
            org.apache.commons.compress.archivers.zip.ZipFile$Builder r3 = (org.apache.commons.compress.archivers.zip.ZipFile.Builder) r3
            org.apache.commons.compress.archivers.zip.ZipFile r3 = r3.get()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r0 = r1.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3a
            r2.println(r0)     // Catch: java.lang.Throwable -> L3a
            java.util.Enumeration r0 = r3.getEntries()     // Catch: java.lang.Throwable -> L3a
        L24:
            boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Throwable -> L3a
            org.apache.commons.compress.archivers.ArchiveEntry r1 = (org.apache.commons.compress.archivers.ArchiveEntry) r1     // Catch: java.lang.Throwable -> L3a
            r2.println(r1)     // Catch: java.lang.Throwable -> L3a
            goto L24
        L34:
            if (r3 == 0) goto L39
            r3.close()
        L39:
            return
        L3a:
            r0 = move-exception
            if (r3 == 0) goto L45
            r3.close()     // Catch: java.lang.Throwable -> L41
            goto L45
        L41:
            r3 = move-exception
            r0.addSuppressed(r3)
        L45:
            throw r0
    }

    public static void main(java.lang.String... r2) throws org.apache.commons.compress.archivers.ArchiveException, java.io.IOException {
            if (r2 == 0) goto L10
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto L10
        L6:
            org.apache.commons.compress.archivers.Lister r0 = new org.apache.commons.compress.archivers.Lister
            r1 = 0
            r0.<init>(r1, r2)
            r0.go()
            return
        L10:
            usage()
            return
    }

    private void println(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.quiet
            if (r0 != 0) goto L9
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r2)
        L9:
            return
    }

    private void println(org.apache.commons.compress.archivers.ArchiveEntry r1) {
            r0 = this;
            java.lang.String r1 = r1.getName()
            r0.println(r1)
            return
    }

    private static void usage() {
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Parameters: archive-name [archive-type]\n"
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "The magic archive-type 'zipfile' prefers ZipFile over ZipArchiveInputStream"
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "The magic archive-type 'tarfile' prefers TarFile over TarArchiveInputStream"
            r0.println(r1)
            return
    }

    void go() throws org.apache.commons.compress.archivers.ArchiveException, java.io.IOException {
            r2 = this;
            java.lang.String[] r0 = r2.args
            r1 = 0
            r0 = r0[r1]
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            java.lang.String[] r1 = r2.args
            r2.list(r0, r1)
            return
    }
}
