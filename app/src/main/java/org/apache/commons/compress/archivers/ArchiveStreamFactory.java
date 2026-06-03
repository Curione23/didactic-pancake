package org.apache.commons.compress.archivers;

/* JADX INFO: loaded from: classes2.dex */
public class ArchiveStreamFactory implements org.apache.commons.compress.archivers.ArchiveStreamProvider {
    public static final java.lang.String APK = "apk";
    public static final java.lang.String APKM = "apkm";
    public static final java.lang.String APKS = "apks";
    public static final java.lang.String AR = "ar";
    public static final java.lang.String ARJ = "arj";
    public static final java.lang.String CPIO = "cpio";
    public static final org.apache.commons.compress.archivers.ArchiveStreamFactory DEFAULT = null;
    public static final java.lang.String DUMP = "dump";
    private static final int DUMP_SIGNATURE_SIZE = 32;
    public static final java.lang.String JAR = "jar";
    public static final java.lang.String SEVEN_Z = "7z";
    private static final int SIGNATURE_SIZE = 12;
    public static final java.lang.String TAR = "tar";
    private static final int TAR_HEADER_SIZE = 512;
    private static final int TAR_TEST_ENTRY_COUNT = 10;
    public static final java.lang.String XAPK = "xapk";
    public static final java.lang.String ZIP = "zip";
    private java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> archiveInputStreamProviders;
    private java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> archiveOutputStreamProviders;
    private volatile java.lang.String entryEncoding;

    static {
            org.apache.commons.compress.archivers.ArchiveStreamFactory r0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory
            r0.<init>()
            org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT = r0
            return
    }

    public ArchiveStreamFactory() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public ArchiveStreamFactory(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.entryEncoding = r1
            return
    }

    private static java.lang.Iterable<org.apache.commons.compress.archivers.ArchiveStreamProvider> archiveStreamProviderIterable() {
            java.lang.Class<org.apache.commons.compress.archivers.ArchiveStreamProvider> r0 = org.apache.commons.compress.archivers.ArchiveStreamProvider.class
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            return r0
    }

    public static java.lang.String detect(java.io.InputStream r8) throws org.apache.commons.compress.archivers.ArchiveException {
            if (r8 == 0) goto Lfd
            boolean r0 = r8.markSupported()
            if (r0 == 0) goto Lf5
            r0 = 12
            byte[] r1 = new byte[r0]
            r8.mark(r0)
            int r0 = org.apache.commons.compress.utils.IOUtils.readFully(r8, r1)     // Catch: java.io.IOException -> Lec
            r8.reset()     // Catch: java.io.IOException -> Lec
            boolean r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(r1, r0)
            if (r2 == 0) goto L1f
            java.lang.String r8 = "zip"
            return r8
        L1f:
            boolean r2 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(r1, r0)
            if (r2 == 0) goto L28
            java.lang.String r8 = "jar"
            return r8
        L28:
            boolean r2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(r1, r0)
            if (r2 == 0) goto L31
            java.lang.String r8 = "ar"
            return r8
        L31:
            boolean r2 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(r1, r0)
            if (r2 == 0) goto L3a
            java.lang.String r8 = "cpio"
            return r8
        L3a:
            boolean r2 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(r1, r0)
            if (r2 == 0) goto L43
            java.lang.String r8 = "arj"
            return r8
        L43:
            boolean r0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(r1, r0)
            if (r0 == 0) goto L4c
            java.lang.String r8 = "7z"
            return r8
        L4c:
            r0 = 32
            byte[] r1 = new byte[r0]
            r8.mark(r0)
            int r0 = org.apache.commons.compress.utils.IOUtils.readFully(r8, r1)     // Catch: java.io.IOException -> Le3
            r8.reset()     // Catch: java.io.IOException -> Le3
            boolean r0 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(r1, r0)
            if (r0 == 0) goto L63
            java.lang.String r8 = "dump"
            return r8
        L63:
            r0 = 512(0x200, float:7.17E-43)
            byte[] r1 = new byte[r0]
            r8.mark(r0)
            int r2 = org.apache.commons.compress.utils.IOUtils.readFully(r8, r1)     // Catch: java.io.IOException -> Lda
            r8.reset()     // Catch: java.io.IOException -> Lda
            boolean r8 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(r1, r2)
            java.lang.String r3 = "tar"
            if (r8 == 0) goto L7a
            return r3
        L7a:
            if (r2 < r0) goto Ld2
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream r8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream     // Catch: java.lang.Exception -> Ld2
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> Ld2
            r0.<init>(r1)     // Catch: java.lang.Exception -> Ld2
            r8.<init>(r0)     // Catch: java.lang.Exception -> Ld2
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r8.getNextEntry()     // Catch: java.lang.Throwable -> Lc8
            r1 = 0
        L8b:
            if (r0 == 0) goto La6
            boolean r2 = r0.isDirectory()     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto La6
            boolean r2 = r0.isCheckSumOK()     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto La6
            int r2 = r1 + 1
            r4 = 10
            if (r1 >= r4) goto La5
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r8.getNextEntry()     // Catch: java.lang.Throwable -> Lc8
            r1 = r2
            goto L8b
        La5:
            r1 = r2
        La6:
            if (r0 == 0) goto Lbe
            boolean r2 = r0.isCheckSumOK()     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto Lbe
            boolean r2 = r0.isDirectory()     // Catch: java.lang.Throwable -> Lc8
            if (r2 != 0) goto Lbe
            long r4 = r0.getSize()     // Catch: java.lang.Throwable -> Lc8
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto Lc0
        Lbe:
            if (r1 <= 0) goto Lc4
        Lc0:
            r8.close()     // Catch: java.lang.Exception -> Ld2
            return r3
        Lc4:
            r8.close()     // Catch: java.lang.Exception -> Ld2
            goto Ld2
        Lc8:
            r0 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> Lcd
            goto Ld1
        Lcd:
            r8 = move-exception
            r0.addSuppressed(r8)     // Catch: java.lang.Exception -> Ld2
        Ld1:
            throw r0     // Catch: java.lang.Exception -> Ld2
        Ld2:
            org.apache.commons.compress.archivers.ArchiveException r8 = new org.apache.commons.compress.archivers.ArchiveException
            java.lang.String r0 = "No Archiver found for the stream signature"
            r8.<init>(r0)
            throw r8
        Lda:
            r8 = move-exception
            org.apache.commons.compress.archivers.ArchiveException r0 = new org.apache.commons.compress.archivers.ArchiveException
            java.lang.String r1 = "IOException while reading tar signature"
            r0.<init>(r1, r8)
            throw r0
        Le3:
            r8 = move-exception
            org.apache.commons.compress.archivers.ArchiveException r0 = new org.apache.commons.compress.archivers.ArchiveException
            java.lang.String r1 = "IOException while reading dump signature"
            r0.<init>(r1, r8)
            throw r0
        Lec:
            r8 = move-exception
            org.apache.commons.compress.archivers.ArchiveException r0 = new org.apache.commons.compress.archivers.ArchiveException
            java.lang.String r1 = "IOException while reading signature."
            r0.<init>(r1, r8)
            throw r0
        Lf5:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Mark is not supported."
            r8.<init>(r0)
            throw r8
        Lfd:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Stream must not be null."
            r8.<init>(r0)
            throw r8
    }

    public static java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> findAvailableArchiveInputStreamProviders() {
            org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda3 r0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda3
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    public static java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> findAvailableArchiveOutputStreamProviders() {
            org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda2 r0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    static /* synthetic */ void lambda$findAvailableArchiveInputStreamProviders$0(java.util.TreeMap r1, org.apache.commons.compress.archivers.ArchiveStreamProvider r2) {
            java.util.Set r0 = r2.getInputStreamArchiveNames()
            putAll(r0, r2, r1)
            return
    }

    static /* synthetic */ java.util.SortedMap lambda$findAvailableArchiveInputStreamProviders$1() {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            org.apache.commons.compress.archivers.ArchiveStreamFactory r1 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT
            java.util.Set r2 = r1.getInputStreamArchiveNames()
            putAll(r2, r1, r0)
            java.lang.Iterable r1 = archiveStreamProviderIterable()
            org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda0 r2 = new org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda0
            r2.<init>(r0)
            r1.forEach(r2)
            return r0
    }

    static /* synthetic */ void lambda$findAvailableArchiveOutputStreamProviders$2(java.util.TreeMap r1, org.apache.commons.compress.archivers.ArchiveStreamProvider r2) {
            java.util.Set r0 = r2.getOutputStreamArchiveNames()
            putAll(r0, r2, r1)
            return
    }

    static /* synthetic */ java.util.SortedMap lambda$findAvailableArchiveOutputStreamProviders$3() {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            org.apache.commons.compress.archivers.ArchiveStreamFactory r1 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT
            java.util.Set r2 = r1.getOutputStreamArchiveNames()
            putAll(r2, r1, r0)
            java.lang.Iterable r1 = archiveStreamProviderIterable()
            org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda4 r2 = new org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda4
            r2.<init>(r0)
            r1.forEach(r2)
            return r0
    }

    static /* synthetic */ void lambda$putAll$4(java.util.TreeMap r0, org.apache.commons.compress.archivers.ArchiveStreamProvider r1, java.lang.String r2) {
            java.lang.String r2 = toKey(r2)
            r0.put(r2, r1)
            return
    }

    static void putAll(java.util.Set<java.lang.String> r1, org.apache.commons.compress.archivers.ArchiveStreamProvider r2, java.util.TreeMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> r3) {
            org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda1 r0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda1
            r0.<init>(r3, r2)
            r1.forEach(r0)
            return
    }

    private static java.lang.String toKey(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            return r1
    }

    public <I extends org.apache.commons.compress.archivers.ArchiveInputStream<? extends org.apache.commons.compress.archivers.ArchiveEntry>> I createArchiveInputStream(java.io.InputStream r2) throws org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            java.lang.String r0 = detect(r2)
            org.apache.commons.compress.archivers.ArchiveInputStream r2 = r1.createArchiveInputStream(r0, r2)
            return r2
    }

    public <I extends org.apache.commons.compress.archivers.ArchiveInputStream<? extends org.apache.commons.compress.archivers.ArchiveEntry>> I createArchiveInputStream(java.lang.String r2, java.io.InputStream r3) throws org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            java.lang.String r0 = r1.entryEncoding
            org.apache.commons.compress.archivers.ArchiveInputStream r2 = r1.createArchiveInputStream(r2, r3, r0)
            return r2
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public <I extends org.apache.commons.compress.archivers.ArchiveInputStream<? extends org.apache.commons.compress.archivers.ArchiveEntry>> I createArchiveInputStream(java.lang.String r3, java.io.InputStream r4, java.lang.String r5) throws org.apache.commons.compress.archivers.ArchiveException {
            r2 = this;
            if (r3 == 0) goto Le5
            if (r4 == 0) goto Ldd
            java.lang.String r0 = "ar"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L12
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream r3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream
            r3.<init>(r4)
            return r3
        L12:
            java.lang.String r0 = "arj"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L28
            if (r5 == 0) goto L22
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream r3 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream
            r3.<init>(r4, r5)
            return r3
        L22:
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream r3 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream
            r3.<init>(r4)
            return r3
        L28:
            java.lang.String r0 = "zip"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L3e
            if (r5 == 0) goto L38
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream r3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream
            r3.<init>(r4, r5)
            return r3
        L38:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream r3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream
            r3.<init>(r4)
            return r3
        L3e:
            java.lang.String r0 = "tar"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L54
            if (r5 == 0) goto L4e
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream r3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream
            r3.<init>(r4, r5)
            return r3
        L4e:
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream r3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream
            r3.<init>(r4)
            return r3
        L54:
            java.lang.String r0 = "jar"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto Lcf
            java.lang.String r0 = "apk"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L65
            goto Lcf
        L65:
            java.lang.String r0 = "cpio"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L7b
            if (r5 == 0) goto L75
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream r3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream
            r3.<init>(r4, r5)
            return r3
        L75:
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream r3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream
            r3.<init>(r4)
            return r3
        L7b:
            java.lang.String r0 = "dump"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L91
            if (r5 == 0) goto L8b
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream r3 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream
            r3.<init>(r4, r5)
            return r3
        L8b:
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream r3 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream
            r3.<init>(r4)
            return r3
        L91:
            java.lang.String r0 = "7z"
            boolean r1 = r0.equalsIgnoreCase(r3)
            if (r1 != 0) goto Lc9
            java.util.SortedMap r0 = r2.getArchiveInputStreamProviders()
            java.lang.String r1 = toKey(r3)
            java.lang.Object r0 = r0.get(r1)
            org.apache.commons.compress.archivers.ArchiveStreamProvider r0 = (org.apache.commons.compress.archivers.ArchiveStreamProvider) r0
            if (r0 == 0) goto Lae
            org.apache.commons.compress.archivers.ArchiveInputStream r3 = r0.createArchiveInputStream(r3, r4, r5)
            return r3
        Lae:
            org.apache.commons.compress.archivers.ArchiveException r4 = new org.apache.commons.compress.archivers.ArchiveException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Archiver: "
            r5.<init>(r0)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = " not found."
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        Lc9:
            org.apache.commons.compress.archivers.StreamingNotSupportedException r3 = new org.apache.commons.compress.archivers.StreamingNotSupportedException
            r3.<init>(r0)
            throw r3
        Lcf:
            if (r5 == 0) goto Ld7
            org.apache.commons.compress.archivers.jar.JarArchiveInputStream r3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream
            r3.<init>(r4, r5)
            return r3
        Ld7:
            org.apache.commons.compress.archivers.jar.JarArchiveInputStream r3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream
            r3.<init>(r4)
            return r3
        Ldd:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "InputStream must not be null."
            r3.<init>(r4)
            throw r3
        Le5:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Archiver name must not be null."
            r3.<init>(r4)
            throw r3
    }

    public <O extends org.apache.commons.compress.archivers.ArchiveOutputStream<? extends org.apache.commons.compress.archivers.ArchiveEntry>> O createArchiveOutputStream(java.lang.String r2, java.io.OutputStream r3) throws org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            java.lang.String r0 = r1.entryEncoding
            org.apache.commons.compress.archivers.ArchiveOutputStream r2 = r1.createArchiveOutputStream(r2, r3, r0)
            return r2
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public <O extends org.apache.commons.compress.archivers.ArchiveOutputStream<? extends org.apache.commons.compress.archivers.ArchiveEntry>> O createArchiveOutputStream(java.lang.String r3, java.io.OutputStream r4, java.lang.String r5) throws org.apache.commons.compress.archivers.ArchiveException {
            r2 = this;
            if (r3 == 0) goto Lad
            if (r4 == 0) goto La5
            java.lang.String r0 = "ar"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L12
            org.apache.commons.compress.archivers.ar.ArArchiveOutputStream r3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream
            r3.<init>(r4)
            return r3
        L12:
            java.lang.String r0 = "zip"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L25
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream r3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream
            r3.<init>(r4)
            if (r5 == 0) goto L24
            r3.setEncoding(r5)
        L24:
            return r3
        L25:
            java.lang.String r0 = "tar"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L3b
            if (r5 == 0) goto L35
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream r3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream
            r3.<init>(r4, r5)
            return r3
        L35:
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream r3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream
            r3.<init>(r4)
            return r3
        L3b:
            java.lang.String r0 = "jar"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L51
            if (r5 == 0) goto L4b
            org.apache.commons.compress.archivers.jar.JarArchiveOutputStream r3 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream
            r3.<init>(r4, r5)
            return r3
        L4b:
            org.apache.commons.compress.archivers.jar.JarArchiveOutputStream r3 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream
            r3.<init>(r4)
            return r3
        L51:
            java.lang.String r0 = "cpio"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L67
            if (r5 == 0) goto L61
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream r3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream
            r3.<init>(r4, r5)
            return r3
        L61:
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream r3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream
            r3.<init>(r4)
            return r3
        L67:
            java.lang.String r0 = "7z"
            boolean r1 = r0.equalsIgnoreCase(r3)
            if (r1 != 0) goto L9f
            java.util.SortedMap r0 = r2.getArchiveOutputStreamProviders()
            java.lang.String r1 = toKey(r3)
            java.lang.Object r0 = r0.get(r1)
            org.apache.commons.compress.archivers.ArchiveStreamProvider r0 = (org.apache.commons.compress.archivers.ArchiveStreamProvider) r0
            if (r0 == 0) goto L84
            org.apache.commons.compress.archivers.ArchiveOutputStream r3 = r0.createArchiveOutputStream(r3, r4, r5)
            return r3
        L84:
            org.apache.commons.compress.archivers.ArchiveException r4 = new org.apache.commons.compress.archivers.ArchiveException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Archiver: "
            r5.<init>(r0)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = " not found."
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L9f:
            org.apache.commons.compress.archivers.StreamingNotSupportedException r3 = new org.apache.commons.compress.archivers.StreamingNotSupportedException
            r3.<init>(r0)
            throw r3
        La5:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "OutputStream must not be null."
            r3.<init>(r4)
            throw r3
        Lad:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Archiver name must not be null."
            r3.<init>(r4)
            throw r3
    }

    public java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> getArchiveInputStreamProviders() {
            r1 = this;
            java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> r0 = r1.archiveInputStreamProviders
            if (r0 != 0) goto Le
            java.util.SortedMap r0 = findAvailableArchiveInputStreamProviders()
            java.util.SortedMap r0 = java.util.Collections.unmodifiableSortedMap(r0)
            r1.archiveInputStreamProviders = r0
        Le:
            java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> r0 = r1.archiveInputStreamProviders
            return r0
    }

    public java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> getArchiveOutputStreamProviders() {
            r1 = this;
            java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> r0 = r1.archiveOutputStreamProviders
            if (r0 != 0) goto Le
            java.util.SortedMap r0 = findAvailableArchiveOutputStreamProviders()
            java.util.SortedMap r0 = java.util.Collections.unmodifiableSortedMap(r0)
            r1.archiveOutputStreamProviders = r0
        Le:
            java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> r0 = r1.archiveOutputStreamProviders
            return r0
    }

    public java.lang.String getEntryEncoding() {
            r1 = this;
            java.lang.String r0 = r1.entryEncoding
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public java.util.Set<java.lang.String> getInputStreamArchiveNames() {
            r3 = this;
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "ar"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "arj"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "zip"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "tar"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "jar"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "cpio"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "dump"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "7z"
            r0[r1] = r2
            java.util.HashSet r0 = org.apache.commons.compress.utils.Sets.newHashSet(r0)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public java.util.Set<java.lang.String> getOutputStreamArchiveNames() {
            r3 = this;
            r0 = 6
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "ar"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "zip"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "tar"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "jar"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "cpio"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "7z"
            r0[r1] = r2
            java.util.HashSet r0 = org.apache.commons.compress.utils.Sets.newHashSet(r0)
            return r0
    }

    @java.lang.Deprecated
    public void setEntryEncoding(java.lang.String r1) {
            r0 = this;
            r0.entryEncoding = r1
            return
    }
}
