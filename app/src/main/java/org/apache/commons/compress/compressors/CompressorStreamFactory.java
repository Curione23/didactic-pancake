package org.apache.commons.compress.compressors;

/* JADX INFO: loaded from: classes2.dex */
public class CompressorStreamFactory implements org.apache.commons.compress.compressors.CompressorStreamProvider {
    private static final java.util.Set<java.lang.String> ALL_NAMES = null;
    public static final java.lang.String BROTLI = "br";
    public static final java.lang.String BZIP2 = "bzip2";
    public static final java.lang.String DEFLATE = "deflate";
    public static final java.lang.String DEFLATE64 = "deflate64";
    public static final java.lang.String GZIP = "gz";
    public static final java.lang.String LZ4_BLOCK = "lz4-block";
    public static final java.lang.String LZ4_FRAMED = "lz4-framed";
    public static final java.lang.String LZMA = "lzma";
    public static final java.lang.String PACK200 = "pack200";
    private static final org.apache.commons.compress.compressors.CompressorStreamFactory SINGLETON = null;
    public static final java.lang.String SNAPPY_FRAMED = "snappy-framed";
    public static final java.lang.String SNAPPY_RAW = "snappy-raw";
    public static final java.lang.String XZ = "xz";
    private static final java.lang.String YOU_NEED_BROTLI_DEC = null;
    private static final java.lang.String YOU_NEED_XZ_JAVA = null;
    private static final java.lang.String YOU_NEED_ZSTD_JNI = null;
    public static final java.lang.String Z = "z";
    public static final java.lang.String ZSTANDARD = "zstd";
    private java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> compressorInputStreamProviders;
    private java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> compressorOutputStreamProviders;
    private volatile boolean decompressConcatenated;
    private final java.lang.Boolean decompressUntilEOF;
    private final int memoryLimitInKb;

    static {
            org.apache.commons.compress.compressors.CompressorStreamFactory r0 = new org.apache.commons.compress.compressors.CompressorStreamFactory
            r0.<init>()
            org.apache.commons.compress.compressors.CompressorStreamFactory.SINGLETON = r0
            java.lang.String r0 = "Google Brotli Dec"
            java.lang.String r1 = "https://github.com/google/brotli/"
            java.lang.String r0 = youNeed(r0, r1)
            org.apache.commons.compress.compressors.CompressorStreamFactory.YOU_NEED_BROTLI_DEC = r0
            java.lang.String r0 = "XZ for Java"
            java.lang.String r1 = "https://tukaani.org/xz/java.html"
            java.lang.String r0 = youNeed(r0, r1)
            org.apache.commons.compress.compressors.CompressorStreamFactory.YOU_NEED_XZ_JAVA = r0
            java.lang.String r0 = "Zstd JNI"
            java.lang.String r1 = "https://github.com/luben/zstd-jni"
            java.lang.String r0 = youNeed(r0, r1)
            org.apache.commons.compress.compressors.CompressorStreamFactory.YOU_NEED_ZSTD_JNI = r0
            r0 = 10
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "bzip2"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "gz"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "pack200"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "snappy-framed"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "z"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "deflate"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "xz"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "lzma"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "lz4-framed"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "zstd"
            r0[r1] = r2
            java.util.HashSet r0 = org.apache.commons.compress.utils.Sets.newHashSet(r0)
            org.apache.commons.compress.compressors.CompressorStreamFactory.ALL_NAMES = r0
            return
    }

    public CompressorStreamFactory() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.decompressUntilEOF = r0
            r0 = -1
            r1.memoryLimitInKb = r0
            return
    }

    public CompressorStreamFactory(boolean r2) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0)
            return
    }

    public CompressorStreamFactory(boolean r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.decompressUntilEOF = r0
            r1.decompressConcatenated = r2
            r1.memoryLimitInKb = r3
            return
    }

    private static java.lang.Iterable<org.apache.commons.compress.compressors.CompressorStreamProvider> archiveStreamProviderIterable() {
            java.lang.Class<org.apache.commons.compress.compressors.CompressorStreamProvider> r0 = org.apache.commons.compress.compressors.CompressorStreamProvider.class
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            return r0
    }

    public static java.lang.String detect(java.io.InputStream r1) throws org.apache.commons.compress.compressors.CompressorException {
            java.util.Set<java.lang.String> r0 = org.apache.commons.compress.compressors.CompressorStreamFactory.ALL_NAMES
            java.lang.String r1 = detect(r1, r0)
            return r1
    }

    static java.lang.String detect(java.io.InputStream r3, java.util.Set<java.lang.String> r4) throws org.apache.commons.compress.compressors.CompressorException {
            if (r3 == 0) goto Ld5
            if (r4 == 0) goto Lcd
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lcd
            boolean r0 = r3.markSupported()
            if (r0 == 0) goto Lc5
            r0 = 12
            byte[] r1 = new byte[r0]
            r3.mark(r0)
            int r0 = org.apache.commons.compress.utils.IOUtils.readFully(r3, r1)     // Catch: java.io.IOException -> Lbc
            r3.reset()     // Catch: java.io.IOException -> Lbc
            java.lang.String r3 = "bzip2"
            boolean r2 = r4.contains(r3)
            if (r2 == 0) goto L2d
            boolean r2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(r1, r0)
            if (r2 == 0) goto L2d
            return r3
        L2d:
            java.lang.String r3 = "gz"
            boolean r2 = r4.contains(r3)
            if (r2 == 0) goto L3c
            boolean r2 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(r1, r0)
            if (r2 == 0) goto L3c
            return r3
        L3c:
            java.lang.String r3 = "pack200"
            boolean r2 = r4.contains(r3)
            if (r2 == 0) goto L4b
            boolean r2 = org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.matches(r1, r0)
            if (r2 == 0) goto L4b
            return r3
        L4b:
            java.lang.String r3 = "snappy-framed"
            boolean r2 = r4.contains(r3)
            if (r2 == 0) goto L5a
            boolean r2 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(r1, r0)
            if (r2 == 0) goto L5a
            return r3
        L5a:
            java.lang.String r3 = "z"
            boolean r2 = r4.contains(r3)
            if (r2 == 0) goto L69
            boolean r2 = org.apache.commons.compress.compressors.z.ZCompressorInputStream.matches(r1, r0)
            if (r2 == 0) goto L69
            return r3
        L69:
            java.lang.String r3 = "deflate"
            boolean r2 = r4.contains(r3)
            if (r2 == 0) goto L78
            boolean r2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(r1, r0)
            if (r2 == 0) goto L78
            return r3
        L78:
            java.lang.String r3 = "xz"
            boolean r2 = r4.contains(r3)
            if (r2 == 0) goto L87
            boolean r2 = org.apache.commons.compress.compressors.xz.XZUtils.matches(r1, r0)
            if (r2 == 0) goto L87
            return r3
        L87:
            java.lang.String r3 = "lzma"
            boolean r2 = r4.contains(r3)
            if (r2 == 0) goto L96
            boolean r2 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(r1, r0)
            if (r2 == 0) goto L96
            return r3
        L96:
            java.lang.String r3 = "lz4-framed"
            boolean r2 = r4.contains(r3)
            if (r2 == 0) goto La5
            boolean r2 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.matches(r1, r0)
            if (r2 == 0) goto La5
            return r3
        La5:
            java.lang.String r3 = "zstd"
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto Lb4
            boolean r4 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.matches(r1, r0)
            if (r4 == 0) goto Lb4
            return r3
        Lb4:
            org.apache.commons.compress.compressors.CompressorException r3 = new org.apache.commons.compress.compressors.CompressorException
            java.lang.String r4 = "No Compressor found for the stream signature."
            r3.<init>(r4)
            throw r3
        Lbc:
            r3 = move-exception
            org.apache.commons.compress.compressors.CompressorException r4 = new org.apache.commons.compress.compressors.CompressorException
            java.lang.String r0 = "IOException while reading signature."
            r4.<init>(r0, r3)
            throw r4
        Lc5:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Mark is not supported."
            r3.<init>(r4)
            throw r3
        Lcd:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Compressor names cannot be null or empty"
            r3.<init>(r4)
            throw r3
        Ld5:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Stream must not be null."
            r3.<init>(r4)
            throw r3
    }

    public static java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> findAvailableCompressorInputStreamProviders() {
            org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda3 r0 = new org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda3
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    public static java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> findAvailableCompressorOutputStreamProviders() {
            org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda2 r0 = new org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    public static java.lang.String getBrotli() {
            java.lang.String r0 = "br"
            return r0
    }

    public static java.lang.String getBzip2() {
            java.lang.String r0 = "bzip2"
            return r0
    }

    public static java.lang.String getDeflate() {
            java.lang.String r0 = "deflate"
            return r0
    }

    public static java.lang.String getDeflate64() {
            java.lang.String r0 = "deflate64"
            return r0
    }

    public static java.lang.String getGzip() {
            java.lang.String r0 = "gz"
            return r0
    }

    public static java.lang.String getLZ4Block() {
            java.lang.String r0 = "lz4-block"
            return r0
    }

    public static java.lang.String getLZ4Framed() {
            java.lang.String r0 = "lz4-framed"
            return r0
    }

    public static java.lang.String getLzma() {
            java.lang.String r0 = "lzma"
            return r0
    }

    public static java.lang.String getPack200() {
            java.lang.String r0 = "pack200"
            return r0
    }

    public static org.apache.commons.compress.compressors.CompressorStreamFactory getSingleton() {
            org.apache.commons.compress.compressors.CompressorStreamFactory r0 = org.apache.commons.compress.compressors.CompressorStreamFactory.SINGLETON
            return r0
    }

    public static java.lang.String getSnappyFramed() {
            java.lang.String r0 = "snappy-framed"
            return r0
    }

    public static java.lang.String getSnappyRaw() {
            java.lang.String r0 = "snappy-raw"
            return r0
    }

    public static java.lang.String getXz() {
            java.lang.String r0 = "xz"
            return r0
    }

    public static java.lang.String getZ() {
            java.lang.String r0 = "z"
            return r0
    }

    public static java.lang.String getZstandard() {
            java.lang.String r0 = "zstd"
            return r0
    }

    static /* synthetic */ void lambda$findAvailableCompressorInputStreamProviders$0(java.util.TreeMap r1, org.apache.commons.compress.compressors.CompressorStreamProvider r2) {
            java.util.Set r0 = r2.getInputStreamCompressorNames()
            putAll(r0, r2, r1)
            return
    }

    static /* synthetic */ java.util.SortedMap lambda$findAvailableCompressorInputStreamProviders$1() {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            org.apache.commons.compress.compressors.CompressorStreamFactory r1 = org.apache.commons.compress.compressors.CompressorStreamFactory.SINGLETON
            java.util.Set r2 = r1.getInputStreamCompressorNames()
            putAll(r2, r1, r0)
            java.lang.Iterable r1 = archiveStreamProviderIterable()
            org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda0 r2 = new org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda0
            r2.<init>(r0)
            r1.forEach(r2)
            return r0
    }

    static /* synthetic */ void lambda$findAvailableCompressorOutputStreamProviders$2(java.util.TreeMap r1, org.apache.commons.compress.compressors.CompressorStreamProvider r2) {
            java.util.Set r0 = r2.getOutputStreamCompressorNames()
            putAll(r0, r2, r1)
            return
    }

    static /* synthetic */ java.util.SortedMap lambda$findAvailableCompressorOutputStreamProviders$3() {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            org.apache.commons.compress.compressors.CompressorStreamFactory r1 = org.apache.commons.compress.compressors.CompressorStreamFactory.SINGLETON
            java.util.Set r2 = r1.getOutputStreamCompressorNames()
            putAll(r2, r1, r0)
            java.lang.Iterable r1 = archiveStreamProviderIterable()
            org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda1 r2 = new org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda1
            r2.<init>(r0)
            r1.forEach(r2)
            return r0
    }

    static /* synthetic */ void lambda$putAll$4(java.util.TreeMap r0, org.apache.commons.compress.compressors.CompressorStreamProvider r1, java.lang.String r2) {
            java.lang.String r2 = toKey(r2)
            r0.put(r2, r1)
            return
    }

    static void putAll(java.util.Set<java.lang.String> r1, org.apache.commons.compress.compressors.CompressorStreamProvider r2, java.util.TreeMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> r3) {
            org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda4 r0 = new org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda4
            r0.<init>(r3, r2)
            r1.forEach(r0)
            return
    }

    private static java.lang.String toKey(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            return r1
    }

    private static java.lang.String youNeed(java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " In addition to Apache Commons Compress you need the "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " library - see "
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public org.apache.commons.compress.compressors.CompressorInputStream createCompressorInputStream(java.io.InputStream r2) throws org.apache.commons.compress.compressors.CompressorException {
            r1 = this;
            java.lang.String r0 = detect(r2)
            org.apache.commons.compress.compressors.CompressorInputStream r2 = r1.createCompressorInputStream(r0, r2)
            return r2
    }

    public org.apache.commons.compress.compressors.CompressorInputStream createCompressorInputStream(java.io.InputStream r1, java.util.Set<java.lang.String> r2) throws org.apache.commons.compress.compressors.CompressorException {
            r0 = this;
            java.lang.String r2 = detect(r1, r2)
            org.apache.commons.compress.compressors.CompressorInputStream r1 = r0.createCompressorInputStream(r2, r1)
            return r1
    }

    public org.apache.commons.compress.compressors.CompressorInputStream createCompressorInputStream(java.lang.String r2, java.io.InputStream r3) throws org.apache.commons.compress.compressors.CompressorException {
            r1 = this;
            boolean r0 = r1.decompressConcatenated
            org.apache.commons.compress.compressors.CompressorInputStream r2 = r1.createCompressorInputStream(r2, r3, r0)
            return r2
    }

    @Override // org.apache.commons.compress.compressors.CompressorStreamProvider
    public org.apache.commons.compress.compressors.CompressorInputStream createCompressorInputStream(java.lang.String r6, java.io.InputStream r7, boolean r8) throws org.apache.commons.compress.compressors.CompressorException {
            r5 = this;
            java.lang.String r0 = "LZMA compression is not available"
            java.lang.String r1 = "Zstandard compression is not available."
            java.lang.String r2 = "XZ compression is not available."
            java.lang.String r3 = "Brotli compression is not available."
            if (r6 == 0) goto L17b
            if (r7 == 0) goto L17b
            java.lang.String r4 = "gz"
            boolean r4 = r4.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r4 == 0) goto L1a
            org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream r6 = new org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream     // Catch: java.io.IOException -> L172
            r6.<init>(r7, r8)     // Catch: java.io.IOException -> L172
            return r6
        L1a:
            java.lang.String r4 = "bzip2"
            boolean r4 = r4.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r4 == 0) goto L28
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream r6 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream     // Catch: java.io.IOException -> L172
            r6.<init>(r7, r8)     // Catch: java.io.IOException -> L172
            return r6
        L28:
            java.lang.String r4 = "br"
            boolean r4 = r4.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r4 == 0) goto L51
            boolean r6 = org.apache.commons.compress.compressors.brotli.BrotliUtils.isBrotliCompressionAvailable()     // Catch: java.io.IOException -> L172
            if (r6 == 0) goto L3c
            org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream r6 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            return r6
        L3c:
            org.apache.commons.compress.compressors.CompressorException r6 = new org.apache.commons.compress.compressors.CompressorException     // Catch: java.io.IOException -> L172
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L172
            r7.<init>(r3)     // Catch: java.io.IOException -> L172
            java.lang.String r8 = org.apache.commons.compress.compressors.CompressorStreamFactory.YOU_NEED_BROTLI_DEC     // Catch: java.io.IOException -> L172
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.io.IOException -> L172
            java.lang.String r7 = r7.toString()     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            throw r6     // Catch: java.io.IOException -> L172
        L51:
            java.lang.String r3 = "xz"
            boolean r3 = r3.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r3 == 0) goto L7c
            boolean r6 = org.apache.commons.compress.compressors.xz.XZUtils.isXZCompressionAvailable()     // Catch: java.io.IOException -> L172
            if (r6 == 0) goto L67
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream r6 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream     // Catch: java.io.IOException -> L172
            int r0 = r5.memoryLimitInKb     // Catch: java.io.IOException -> L172
            r6.<init>(r7, r8, r0)     // Catch: java.io.IOException -> L172
            return r6
        L67:
            org.apache.commons.compress.compressors.CompressorException r6 = new org.apache.commons.compress.compressors.CompressorException     // Catch: java.io.IOException -> L172
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L172
            r7.<init>(r2)     // Catch: java.io.IOException -> L172
            java.lang.String r8 = org.apache.commons.compress.compressors.CompressorStreamFactory.YOU_NEED_XZ_JAVA     // Catch: java.io.IOException -> L172
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.io.IOException -> L172
            java.lang.String r7 = r7.toString()     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            throw r6     // Catch: java.io.IOException -> L172
        L7c:
            java.lang.String r2 = "zstd"
            boolean r2 = r2.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r2 == 0) goto La5
            boolean r6 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.isZstdCompressionAvailable()     // Catch: java.io.IOException -> L172
            if (r6 == 0) goto L90
            org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream r6 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            return r6
        L90:
            org.apache.commons.compress.compressors.CompressorException r6 = new org.apache.commons.compress.compressors.CompressorException     // Catch: java.io.IOException -> L172
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L172
            r7.<init>(r1)     // Catch: java.io.IOException -> L172
            java.lang.String r8 = org.apache.commons.compress.compressors.CompressorStreamFactory.YOU_NEED_ZSTD_JNI     // Catch: java.io.IOException -> L172
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.io.IOException -> L172
            java.lang.String r7 = r7.toString()     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            throw r6     // Catch: java.io.IOException -> L172
        La5:
            java.lang.String r1 = "lzma"
            boolean r1 = r1.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r1 == 0) goto Ld0
            boolean r6 = org.apache.commons.compress.compressors.lzma.LZMAUtils.isLZMACompressionAvailable()     // Catch: java.io.IOException -> L172
            if (r6 == 0) goto Lbb
            org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream r6 = new org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream     // Catch: java.io.IOException -> L172
            int r8 = r5.memoryLimitInKb     // Catch: java.io.IOException -> L172
            r6.<init>(r7, r8)     // Catch: java.io.IOException -> L172
            return r6
        Lbb:
            org.apache.commons.compress.compressors.CompressorException r6 = new org.apache.commons.compress.compressors.CompressorException     // Catch: java.io.IOException -> L172
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L172
            r7.<init>(r0)     // Catch: java.io.IOException -> L172
            java.lang.String r8 = org.apache.commons.compress.compressors.CompressorStreamFactory.YOU_NEED_XZ_JAVA     // Catch: java.io.IOException -> L172
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.io.IOException -> L172
            java.lang.String r7 = r7.toString()     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            throw r6     // Catch: java.io.IOException -> L172
        Ld0:
            java.lang.String r0 = "pack200"
            boolean r0 = r0.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r0 == 0) goto Lde
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream r6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            return r6
        Lde:
            java.lang.String r0 = "snappy-raw"
            boolean r0 = r0.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r0 == 0) goto Lec
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r6 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            return r6
        Lec:
            java.lang.String r0 = "snappy-framed"
            boolean r0 = r0.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r0 == 0) goto Lfa
            org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream r6 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            return r6
        Lfa:
            java.lang.String r0 = "z"
            boolean r0 = r0.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r0 == 0) goto L10a
            org.apache.commons.compress.compressors.z.ZCompressorInputStream r6 = new org.apache.commons.compress.compressors.z.ZCompressorInputStream     // Catch: java.io.IOException -> L172
            int r8 = r5.memoryLimitInKb     // Catch: java.io.IOException -> L172
            r6.<init>(r7, r8)     // Catch: java.io.IOException -> L172
            return r6
        L10a:
            java.lang.String r0 = "deflate"
            boolean r0 = r0.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r0 == 0) goto L118
            org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream r6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            return r6
        L118:
            java.lang.String r0 = "deflate64"
            boolean r0 = r0.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r0 == 0) goto L126
            org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream r6 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            return r6
        L126:
            java.lang.String r0 = "lz4-block"
            boolean r0 = r0.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r0 == 0) goto L134
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream r6 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream     // Catch: java.io.IOException -> L172
            r6.<init>(r7)     // Catch: java.io.IOException -> L172
            return r6
        L134:
            java.lang.String r0 = "lz4-framed"
            boolean r0 = r0.equalsIgnoreCase(r6)     // Catch: java.io.IOException -> L172
            if (r0 == 0) goto L142
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream r6 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream     // Catch: java.io.IOException -> L172
            r6.<init>(r7, r8)     // Catch: java.io.IOException -> L172
            return r6
        L142:
            java.util.SortedMap r0 = r5.getCompressorInputStreamProviders()
            java.lang.String r1 = toKey(r6)
            java.lang.Object r0 = r0.get(r1)
            org.apache.commons.compress.compressors.CompressorStreamProvider r0 = (org.apache.commons.compress.compressors.CompressorStreamProvider) r0
            if (r0 == 0) goto L157
            org.apache.commons.compress.compressors.CompressorInputStream r6 = r0.createCompressorInputStream(r6, r7, r8)
            return r6
        L157:
            org.apache.commons.compress.compressors.CompressorException r7 = new org.apache.commons.compress.compressors.CompressorException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Compressor: "
            r8.<init>(r0)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r8 = " not found."
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L172:
            r6 = move-exception
            org.apache.commons.compress.compressors.CompressorException r7 = new org.apache.commons.compress.compressors.CompressorException
            java.lang.String r8 = "Could not create CompressorInputStream."
            r7.<init>(r8, r6)
            throw r7
        L17b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Compressor name and stream must not be null."
            r6.<init>(r7)
            throw r6
    }

    @Override // org.apache.commons.compress.compressors.CompressorStreamProvider
    public org.apache.commons.compress.compressors.CompressorOutputStream<?> createCompressorOutputStream(java.lang.String r3, java.io.OutputStream r4) throws org.apache.commons.compress.compressors.CompressorException {
            r2 = this;
            if (r3 == 0) goto Lc9
            if (r4 == 0) goto Lc9
            java.lang.String r0 = "gz"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L12
            org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream r3 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream     // Catch: java.io.IOException -> Lc0
            r3.<init>(r4)     // Catch: java.io.IOException -> Lc0
            return r3
        L12:
            java.lang.String r0 = "bzip2"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L20
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream r3 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream     // Catch: java.io.IOException -> Lc0
            r3.<init>(r4)     // Catch: java.io.IOException -> Lc0
            return r3
        L20:
            java.lang.String r0 = "xz"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L2e
            org.apache.commons.compress.compressors.xz.XZCompressorOutputStream r3 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream     // Catch: java.io.IOException -> Lc0
            r3.<init>(r4)     // Catch: java.io.IOException -> Lc0
            return r3
        L2e:
            java.lang.String r0 = "pack200"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L3c
            org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream r3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream     // Catch: java.io.IOException -> Lc0
            r3.<init>(r4)     // Catch: java.io.IOException -> Lc0
            return r3
        L3c:
            java.lang.String r0 = "lzma"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L4a
            org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream r3 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream     // Catch: java.io.IOException -> Lc0
            r3.<init>(r4)     // Catch: java.io.IOException -> Lc0
            return r3
        L4a:
            java.lang.String r0 = "deflate"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L58
            org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream r3 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream     // Catch: java.io.IOException -> Lc0
            r3.<init>(r4)     // Catch: java.io.IOException -> Lc0
            return r3
        L58:
            java.lang.String r0 = "snappy-framed"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L66
            org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream r3 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream     // Catch: java.io.IOException -> Lc0
            r3.<init>(r4)     // Catch: java.io.IOException -> Lc0
            return r3
        L66:
            java.lang.String r0 = "lz4-block"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L74
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream r3 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream     // Catch: java.io.IOException -> Lc0
            r3.<init>(r4)     // Catch: java.io.IOException -> Lc0
            return r3
        L74:
            java.lang.String r0 = "lz4-framed"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L82
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream r3 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream     // Catch: java.io.IOException -> Lc0
            r3.<init>(r4)     // Catch: java.io.IOException -> Lc0
            return r3
        L82:
            java.lang.String r0 = "zstd"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L90
            org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream r3 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream     // Catch: java.io.IOException -> Lc0
            r3.<init>(r4)     // Catch: java.io.IOException -> Lc0
            return r3
        L90:
            java.util.SortedMap r0 = r2.getCompressorOutputStreamProviders()
            java.lang.String r1 = toKey(r3)
            java.lang.Object r0 = r0.get(r1)
            org.apache.commons.compress.compressors.CompressorStreamProvider r0 = (org.apache.commons.compress.compressors.CompressorStreamProvider) r0
            if (r0 == 0) goto La5
            org.apache.commons.compress.compressors.CompressorOutputStream r3 = r0.createCompressorOutputStream(r3, r4)
            return r3
        La5:
            org.apache.commons.compress.compressors.CompressorException r4 = new org.apache.commons.compress.compressors.CompressorException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Compressor: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " not found."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        Lc0:
            r3 = move-exception
            org.apache.commons.compress.compressors.CompressorException r4 = new org.apache.commons.compress.compressors.CompressorException
            java.lang.String r0 = "Could not create CompressorOutputStream"
            r4.<init>(r0, r3)
            throw r4
        Lc9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Compressor name and stream must not be null."
            r3.<init>(r4)
            throw r3
    }

    public java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> getCompressorInputStreamProviders() {
            r1 = this;
            java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> r0 = r1.compressorInputStreamProviders
            if (r0 != 0) goto Le
            java.util.SortedMap r0 = findAvailableCompressorInputStreamProviders()
            java.util.SortedMap r0 = java.util.Collections.unmodifiableSortedMap(r0)
            r1.compressorInputStreamProviders = r0
        Le:
            java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> r0 = r1.compressorInputStreamProviders
            return r0
    }

    public java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> getCompressorOutputStreamProviders() {
            r1 = this;
            java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> r0 = r1.compressorOutputStreamProviders
            if (r0 != 0) goto Le
            java.util.SortedMap r0 = findAvailableCompressorOutputStreamProviders()
            java.util.SortedMap r0 = java.util.Collections.unmodifiableSortedMap(r0)
            r1.compressorOutputStreamProviders = r0
        Le:
            java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> r0 = r1.compressorOutputStreamProviders
            return r0
    }

    boolean getDecompressConcatenated() {
            r1 = this;
            boolean r0 = r1.decompressConcatenated
            return r0
    }

    public java.lang.Boolean getDecompressUntilEOF() {
            r1 = this;
            java.lang.Boolean r0 = r1.decompressUntilEOF
            return r0
    }

    @Override // org.apache.commons.compress.compressors.CompressorStreamProvider
    public java.util.Set<java.lang.String> getInputStreamCompressorNames() {
            r3 = this;
            r0 = 14
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "gz"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "br"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "bzip2"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "xz"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "lzma"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "pack200"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "deflate"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "snappy-raw"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "snappy-framed"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "z"
            r0[r1] = r2
            r1 = 10
            java.lang.String r2 = "lz4-block"
            r0[r1] = r2
            r1 = 11
            java.lang.String r2 = "lz4-framed"
            r0[r1] = r2
            r1 = 12
            java.lang.String r2 = "zstd"
            r0[r1] = r2
            r1 = 13
            java.lang.String r2 = "deflate64"
            r0[r1] = r2
            java.util.HashSet r0 = org.apache.commons.compress.utils.Sets.newHashSet(r0)
            return r0
    }

    @Override // org.apache.commons.compress.compressors.CompressorStreamProvider
    public java.util.Set<java.lang.String> getOutputStreamCompressorNames() {
            r3 = this;
            r0 = 10
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "gz"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "bzip2"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "xz"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "lzma"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "pack200"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "deflate"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "snappy-framed"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "lz4-block"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "lz4-framed"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "zstd"
            r0[r1] = r2
            java.util.HashSet r0 = org.apache.commons.compress.utils.Sets.newHashSet(r0)
            return r0
    }

    @java.lang.Deprecated
    public void setDecompressConcatenated(boolean r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.decompressUntilEOF
            if (r0 != 0) goto L7
            r1.decompressConcatenated = r2
            return
        L7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot override the setting defined by the constructor"
            r2.<init>(r0)
            throw r2
    }
}
