package okio.internal;

/* JADX INFO: compiled from: ZipFiles.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0002\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u001b\u001a.\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#0\"H\u0000\u001a\f\u0010$\u001a\u00020\u0015*\u00020%H\u0000\u001a\f\u0010&\u001a\u00020'*\u00020%H\u0002\u001a.\u0010(\u001a\u00020)*\u00020%2\u0006\u0010*\u001a\u00020\u00012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020)0,H\u0002\u001a\u0014\u0010-\u001a\u00020.*\u00020%2\u0006\u0010/\u001a\u00020.H\u0000\u001a\u0018\u00100\u001a\u0004\u0018\u00010.*\u00020%2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002\u001a\u0014\u00101\u001a\u00020'*\u00020%2\u0006\u00102\u001a\u00020'H\u0002\u001a\f\u00103\u001a\u00020)*\u00020%H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u00064"}, d2 = {"BIT_FLAG_ENCRYPTED", "", "BIT_FLAG_UNSUPPORTED_MASK", "CENTRAL_FILE_HEADER_SIGNATURE", "COMPRESSION_METHOD_DEFLATED", "COMPRESSION_METHOD_STORED", "END_OF_CENTRAL_DIRECTORY_SIGNATURE", "HEADER_ID_EXTENDED_TIMESTAMP", "HEADER_ID_ZIP64_EXTENDED_INFO", "LOCAL_FILE_HEADER_SIGNATURE", "MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE", "", "ZIP64_EOCD_RECORD_SIGNATURE", "ZIP64_LOCATOR_SIGNATURE", "hex", "", "getHex", "(I)Ljava/lang/String;", "buildIndex", "", "Lokio/Path;", "Lokio/internal/ZipEntry;", "entries", "", "dosDateTimeToEpochMillis", "date", "time", "(II)Ljava/lang/Long;", "openZip", "Lokio/ZipFileSystem;", "zipPath", "fileSystem", "Lokio/FileSystem;", "predicate", "Lkotlin/Function1;", "", "readEntry", "Lokio/BufferedSource;", "readEocdRecord", "Lokio/internal/EocdRecord;", "readExtra", "", "extraSize", "block", "Lkotlin/Function2;", "readLocalHeader", "Lokio/FileMetadata;", "basicMetadata", "readOrSkipLocalHeader", "readZip64EocdRecord", "regularRecord", "skipLocalHeader", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;




    private static final java.util.Map<okio.Path, okio.internal.ZipEntry> buildIndex(java.util.List<okio.internal.ZipEntry> r23) {
            okio.Path$Companion r0 = okio.Path.Companion
            r1 = 0
            java.lang.String r2 = "/"
            r3 = 0
            r4 = 1
            okio.Path r0 = okio.Path.Companion.get$default(r0, r2, r3, r4, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[r4]
            okio.internal.ZipEntry r2 = new okio.internal.ZipEntry
            r19 = 508(0x1fc, float:7.12E-43)
            r20 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r5 = r2
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r11, r13, r15, r16, r17, r19, r20)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r1[r3] = r0
            java.util.Map r0 = kotlin.collections.MapsKt.mutableMapOf(r1)
            r1 = r23
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1 r2 = new okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            r2.<init>()
            java.util.Comparator r2 = (java.util.Comparator) r2
            java.util.List r1 = kotlin.collections.CollectionsKt.sortedWith(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r1.next()
            okio.internal.ZipEntry r2 = (okio.internal.ZipEntry) r2
            okio.Path r3 = r2.getCanonicalPath()
            java.lang.Object r3 = r0.put(r3, r2)
            okio.internal.ZipEntry r3 = (okio.internal.ZipEntry) r3
            if (r3 != 0) goto L42
        L5a:
            okio.Path r3 = r2.getCanonicalPath()
            okio.Path r3 = r3.parent()
            if (r3 != 0) goto L65
            goto L42
        L65:
            java.lang.Object r4 = r0.get(r3)
            okio.internal.ZipEntry r4 = (okio.internal.ZipEntry) r4
            if (r4 == 0) goto L7b
            java.util.List r3 = r4.getChildren()
            java.util.Collection r3 = (java.util.Collection) r3
            okio.Path r2 = r2.getCanonicalPath()
            r3.add(r2)
            goto L42
        L7b:
            okio.internal.ZipEntry r15 = new okio.internal.ZipEntry
            r18 = 508(0x1fc, float:7.12E-43)
            r19 = 0
            r6 = 1
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r20 = 0
            r4 = r15
            r5 = r3
            r22 = r15
            r15 = r16
            r16 = r20
            r4.<init>(r5, r6, r7, r8, r10, r12, r14, r15, r16, r18, r19)
            r4 = r22
            r0.put(r3, r4)
            java.util.List r3 = r4.getChildren()
            java.util.Collection r3 = (java.util.Collection) r3
            okio.Path r2 = r2.getCanonicalPath()
            r3.add(r2)
            r2 = r4
            goto L5a
        Lad:
            return r0
    }

    private static final java.lang.Long dosDateTimeToEpochMillis(int r8, int r9) {
            r0 = -1
            if (r9 != r0) goto L5
            r8 = 0
            return r8
        L5:
            java.util.GregorianCalendar r7 = new java.util.GregorianCalendar
            r7.<init>()
            r0 = 14
            r1 = 0
            r7.set(r0, r1)
            int r0 = r8 >> 9
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r1 = r0 + 1980
            int r0 = r8 >> 5
            r0 = r0 & 15
            r3 = r8 & 31
            int r8 = r9 >> 11
            r4 = r8 & 31
            int r8 = r9 >> 5
            r5 = r8 & 63
            r8 = r9 & 31
            int r6 = r8 << 1
            int r2 = r0 + (-1)
            r0 = r7
            r0.set(r1, r2, r3, r4, r5, r6)
            java.util.Date r8 = r7.getTime()
            long r8 = r8.getTime()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            return r8
    }

    private static final java.lang.String getHex(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "0x"
            r0.<init>(r1)
            r1 = 16
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            java.lang.String r2 = java.lang.Integer.toString(r2, r1)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static final okio.ZipFileSystem openZip(okio.Path r19, okio.FileSystem r20, kotlin.jvm.functions.Function1<? super okio.internal.ZipEntry, java.lang.Boolean> r21) throws java.io.IOException {
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "not a zip: size="
            java.lang.String r4 = "zipPath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "fileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            okio.FileHandle r4 = r1.openReadOnly(r0)
            java.io.Closeable r4 = (java.io.Closeable) r4
            r5 = r4
            okio.FileHandle r5 = (okio.FileHandle) r5     // Catch: java.lang.Throwable -> L18d
            long r6 = r5.size()     // Catch: java.lang.Throwable -> L18d
            r8 = 22
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L18d
            long r6 = r6 - r8
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L176
            r10 = 65536(0x10000, double:3.2379E-319)
            long r10 = r6 - r10
            long r10 = java.lang.Math.max(r10, r8)     // Catch: java.lang.Throwable -> L18d
        L37:
            okio.Source r3 = r5.source(r6)     // Catch: java.lang.Throwable -> L18d
            okio.BufferedSource r3 = okio.Okio.buffer(r3)     // Catch: java.lang.Throwable -> L18d
            int r12 = r3.readIntLe()     // Catch: java.lang.Throwable -> L171
            r13 = 101010256(0x6054b50, float:2.506985E-35)
            if (r12 != r13) goto L15d
            okio.internal.EocdRecord r10 = readEocdRecord(r3)     // Catch: java.lang.Throwable -> L171
            int r11 = r10.getCommentByteCount()     // Catch: java.lang.Throwable -> L171
            long r11 = (long) r11     // Catch: java.lang.Throwable -> L171
            java.lang.String r11 = r3.readUtf8(r11)     // Catch: java.lang.Throwable -> L171
            r3.close()     // Catch: java.lang.Throwable -> L18d
            r3 = 20
            long r12 = (long) r3     // Catch: java.lang.Throwable -> L18d
            long r6 = r6 - r12
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r12 = 0
            if (r3 <= 0) goto Lf4
            okio.Source r3 = r5.source(r6)     // Catch: java.lang.Throwable -> L18d
            okio.BufferedSource r3 = okio.Okio.buffer(r3)     // Catch: java.lang.Throwable -> L18d
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch: java.lang.Throwable -> L18d
            r6 = r3
            okio.BufferedSource r6 = (okio.BufferedSource) r6     // Catch: java.lang.Throwable -> Leb
            int r7 = r6.readIntLe()     // Catch: java.lang.Throwable -> Leb
            r13 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r7 != r13) goto Le5
            int r7 = r6.readIntLe()     // Catch: java.lang.Throwable -> Leb
            long r13 = r6.readLongLe()     // Catch: java.lang.Throwable -> Leb
            int r6 = r6.readIntLe()     // Catch: java.lang.Throwable -> Leb
            r15 = 1
            if (r6 != r15) goto Ldd
            if (r7 != 0) goto Ldd
            okio.Source r6 = r5.source(r13)     // Catch: java.lang.Throwable -> Leb
            okio.BufferedSource r6 = okio.Okio.buffer(r6)     // Catch: java.lang.Throwable -> Leb
            java.io.Closeable r6 = (java.io.Closeable) r6     // Catch: java.lang.Throwable -> Leb
            r7 = r6
            okio.BufferedSource r7 = (okio.BufferedSource) r7     // Catch: java.lang.Throwable -> Ld4
            int r13 = r7.readIntLe()     // Catch: java.lang.Throwable -> Ld4
            r14 = 101075792(0x6064b50, float:2.525793E-35)
            if (r13 != r14) goto La9
            okio.internal.EocdRecord r7 = readZip64EocdRecord(r7, r10)     // Catch: java.lang.Throwable -> Ld4
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld4
            kotlin.io.CloseableKt.closeFinally(r6, r12)     // Catch: java.lang.Throwable -> Leb
            r10 = r7
            goto Le5
        La9:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld4
            r1.<init>()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "bad zip: expected "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = getHex(r14)     // Catch: java.lang.Throwable -> Ld4
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = " but was "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = getHex(r13)     // Catch: java.lang.Throwable -> Ld4
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld4
            throw r0     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.closeFinally(r6, r1)     // Catch: java.lang.Throwable -> Leb
            throw r2     // Catch: java.lang.Throwable -> Leb
        Ldd:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "unsupported zip: spanned"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Leb
            throw r0     // Catch: java.lang.Throwable -> Leb
        Le5:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Leb
            kotlin.io.CloseableKt.closeFinally(r3, r12)     // Catch: java.lang.Throwable -> L18d
            goto Lf4
        Leb:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> Lee
        Lee:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.closeFinally(r3, r1)     // Catch: java.lang.Throwable -> L18d
            throw r2     // Catch: java.lang.Throwable -> L18d
        Lf4:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18d
            r3.<init>()     // Catch: java.lang.Throwable -> L18d
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L18d
            long r6 = r10.getCentralDirectoryOffset()     // Catch: java.lang.Throwable -> L18d
            okio.Source r5 = r5.source(r6)     // Catch: java.lang.Throwable -> L18d
            okio.BufferedSource r5 = okio.Okio.buffer(r5)     // Catch: java.lang.Throwable -> L18d
            java.io.Closeable r5 = (java.io.Closeable) r5     // Catch: java.lang.Throwable -> L18d
            r6 = r5
            okio.BufferedSource r6 = (okio.BufferedSource) r6     // Catch: java.lang.Throwable -> L154
            long r13 = r10.getEntryCount()     // Catch: java.lang.Throwable -> L154
        L110:
            int r7 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r7 >= 0) goto L142
            okio.internal.ZipEntry r7 = readEntry(r6)     // Catch: java.lang.Throwable -> L154
            long r15 = r7.getOffset()     // Catch: java.lang.Throwable -> L154
            long r17 = r10.getCentralDirectoryOffset()     // Catch: java.lang.Throwable -> L154
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L13a
            java.lang.Object r15 = r2.invoke(r7)     // Catch: java.lang.Throwable -> L154
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Throwable -> L154
            boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> L154
            if (r15 == 0) goto L136
            r15 = r3
            java.util.Collection r15 = (java.util.Collection) r15     // Catch: java.lang.Throwable -> L154
            r15.add(r7)     // Catch: java.lang.Throwable -> L154
        L136:
            r15 = 1
            long r8 = r8 + r15
            goto L110
        L13a:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L154
            java.lang.String r1 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L154
            throw r0     // Catch: java.lang.Throwable -> L154
        L142:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L154
            kotlin.io.CloseableKt.closeFinally(r5, r12)     // Catch: java.lang.Throwable -> L18d
            java.util.Map r2 = buildIndex(r3)     // Catch: java.lang.Throwable -> L18d
            okio.ZipFileSystem r3 = new okio.ZipFileSystem     // Catch: java.lang.Throwable -> L18d
            r3.<init>(r0, r1, r2, r11)     // Catch: java.lang.Throwable -> L18d
            kotlin.io.CloseableKt.closeFinally(r4, r12)
            return r3
        L154:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L157
        L157:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.closeFinally(r5, r1)     // Catch: java.lang.Throwable -> L18d
            throw r2     // Catch: java.lang.Throwable -> L18d
        L15d:
            r3.close()     // Catch: java.lang.Throwable -> L18d
            r12 = -1
            long r6 = r6 + r12
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 < 0) goto L169
            goto L37
        L169:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L18d
            java.lang.String r1 = "not a zip: end of central directory signature not found"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18d
            throw r0     // Catch: java.lang.Throwable -> L18d
        L171:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L18d
            throw r0     // Catch: java.lang.Throwable -> L18d
        L176:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L18d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18d
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L18d
            long r2 = r5.size()     // Catch: java.lang.Throwable -> L18d
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L18d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L18d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18d
            throw r0     // Catch: java.lang.Throwable -> L18d
        L18d:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L190
        L190:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.closeFinally(r4, r1)
            throw r2
    }

    public static /* synthetic */ okio.ZipFileSystem openZip$default(okio.Path r0, okio.FileSystem r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 4
            if (r3 == 0) goto L8
            okio.internal.ZipFilesKt$openZip$1 r2 = okio.internal.ZipFilesKt.AnonymousClass1.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
        L8:
            okio.ZipFileSystem r0 = openZip(r0, r1, r2)
            return r0
    }

    public static final okio.internal.ZipEntry readEntry(okio.BufferedSource r28) throws java.io.IOException {
            r8 = r28
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r28.readIntLe()
            r1 = 33639248(0x2014b50, float:9.499037E-38)
            if (r0 != r1) goto L146
            r0 = 4
            r8.skip(r0)
            short r0 = r28.readShortLe()
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r0 & r1
            r9 = 1
            r0 = r0 & r9
            if (r0 != 0) goto L12d
            short r0 = r28.readShortLe()
            r20 = r0 & r1
            short r0 = r28.readShortLe()
            r0 = r0 & r1
            short r2 = r28.readShortLe()
            r2 = r2 & r1
            java.lang.Long r21 = dosDateTimeToEpochMillis(r2, r0)
            int r0 = r28.readIntLe()
            long r2 = (long) r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r2 & r4
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            int r0 = r28.readIntLe()
            long r2 = (long) r0
            long r2 = r2 & r4
            r10.element = r2
            kotlin.jvm.internal.Ref$LongRef r11 = new kotlin.jvm.internal.Ref$LongRef
            r11.<init>()
            int r0 = r28.readIntLe()
            long r2 = (long) r0
            long r2 = r2 & r4
            r11.element = r2
            short r0 = r28.readShortLe()
            r0 = r0 & r1
            short r2 = r28.readShortLe()
            r12 = r2 & r1
            short r2 = r28.readShortLe()
            r13 = r2 & r1
            r1 = 8
            r8.skip(r1)
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            int r1 = r28.readIntLe()
            long r1 = (long) r1
            long r1 = r1 & r4
            r7.element = r1
            long r0 = (long) r0
            java.lang.String r6 = r8.readUtf8(r0)
            r0 = r6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = 0
            r3 = 2
            r1 = 0
            boolean r0 = kotlin.text.StringsKt.contains$default(r0, r2, r2, r3, r1)
            if (r0 != 0) goto L125
            long r1 = r11.element
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r18 = 0
            r1 = 8
            if (r0 != 0) goto L9e
            long r3 = (long) r1
            r24 = r3
            goto La0
        L9e:
            r24 = r18
        La0:
            long r2 = r10.element
            r22 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 != 0) goto Laf
            long r2 = (long) r1
            long r3 = r24 + r2
            goto Lb1
        Laf:
            r3 = r24
        Lb1:
            r24 = r6
            long r5 = r7.element
            int r0 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r0 != 0) goto Lbb
            long r0 = (long) r1
            long r3 = r3 + r0
        Lbb:
            r22 = r3
            kotlin.jvm.internal.Ref$BooleanRef r6 = new kotlin.jvm.internal.Ref$BooleanRef
            r6.<init>()
            okio.internal.ZipFilesKt$readEntry$1 r25 = new okio.internal.ZipFilesKt$readEntry$1
            r0 = r25
            r5 = 0
            r1 = r6
            r16 = r14
            r4 = 2
            r14 = 0
            r2 = r22
            r15 = r4
            r4 = r11
            r15 = r5
            r5 = r28
            r9 = r6
            r26 = r24
            r6 = r10
            r27 = r7
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r0 = r25
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            readExtra(r8, r12, r0)
            int r0 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r0 <= 0) goto Lf4
            boolean r0 = r9.element
            if (r0 == 0) goto Lec
            goto Lf4
        Lec:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "bad zip: zip64 extra required but absent"
            r0.<init>(r1)
            throw r0
        Lf4:
            long r0 = (long) r13
            java.lang.String r13 = r8.readUtf8(r0)
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.String r1 = "/"
            r2 = 1
            okio.Path r0 = okio.Path.Companion.get$default(r0, r1, r14, r2, r15)
            r2 = r26
            okio.Path r0 = r0.resolve(r2)
            r3 = 2
            boolean r12 = kotlin.text.StringsKt.endsWith$default(r2, r1, r14, r3, r15)
            okio.internal.ZipEntry r1 = new okio.internal.ZipEntry
            long r2 = r10.element
            long r4 = r11.element
            r6 = r27
            long r6 = r6.element
            r10 = r1
            r11 = r0
            r14 = r16
            r16 = r2
            r18 = r4
            r22 = r6
            r10.<init>(r11, r12, r13, r14, r16, r18, r20, r21, r22)
            return r1
        L125:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "bad zip: filename contains 0x00"
            r0.<init>(r1)
            throw r0
        L12d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "unsupported zip: general purpose bit flag="
            r1.<init>(r3)
            java.lang.String r2 = getHex(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L146:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "bad zip: expected "
            r3.<init>(r4)
            java.lang.String r1 = getHex(r1)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " but was "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r0 = getHex(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    private static final okio.internal.EocdRecord readEocdRecord(okio.BufferedSource r10) throws java.io.IOException {
            short r0 = r10.readShortLe()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r2 = r10.readShortLe()
            r2 = r2 & r1
            short r3 = r10.readShortLe()
            r3 = r3 & r1
            long r5 = (long) r3
            short r3 = r10.readShortLe()
            r3 = r3 & r1
            long r3 = (long) r3
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L3e
            if (r0 != 0) goto L3e
            if (r2 != 0) goto L3e
            r2 = 4
            r10.skip(r2)
            int r0 = r10.readIntLe()
            long r2 = (long) r0
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            short r10 = r10.readShortLe()
            r9 = r10 & r1
            okio.internal.EocdRecord r10 = new okio.internal.EocdRecord
            r4 = r10
            r4.<init>(r5, r7, r9)
            return r10
        L3e:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r0 = "unsupported zip: spanned"
            r10.<init>(r0)
            throw r10
    }

    private static final void readExtra(okio.BufferedSource r10, int r11, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> r12) {
            long r0 = (long) r11
        L1:
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L79
            r4 = 4
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 < 0) goto L71
            short r11 = r10.readShortLe()
            r4 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r4
            short r4 = r10.readShortLe()
            long r4 = (long) r4
            r6 = 65535(0xffff, double:3.23786E-319)
            long r4 = r4 & r6
            r6 = 4
            long r6 = (long) r6
            long r0 = r0 - r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L69
            r10.require(r4)
            okio.Buffer r6 = r10.getBuffer()
            long r6 = r6.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r12.invoke(r8, r9)
            okio.Buffer r8 = r10.getBuffer()
            long r8 = r8.size()
            long r8 = r8 + r4
            long r8 = r8 - r6
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 < 0) goto L54
            if (r2 <= 0) goto L52
            okio.Buffer r11 = r10.getBuffer()
            r11.skip(r8)
        L52:
            long r0 = r0 - r4
            goto L1
        L54:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "unsupported zip: too many bytes processed for "
            r12.<init>(r0)
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L69:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "bad zip: truncated value in extra field"
            r10.<init>(r11)
            throw r10
        L71:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "bad zip: truncated header in extra field"
            r10.<init>(r11)
            throw r10
        L79:
            return
    }

    public static final okio.FileMetadata readLocalHeader(okio.BufferedSource r1, okio.FileMetadata r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "basicMetadata"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.FileMetadata r1 = readOrSkipLocalHeader(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            return r1
    }

    private static final okio.FileMetadata readOrSkipLocalHeader(okio.BufferedSource r17, okio.FileMetadata r18) {
            r0 = r17
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r2 = 0
            if (r18 == 0) goto Lf
            java.lang.Long r3 = r18.getLastModifiedAtMillis()
            goto L10
        Lf:
            r3 = r2
        L10:
            r1.element = r3
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            int r5 = r17.readIntLe()
            r6 = 67324752(0x4034b50, float:1.5433558E-36)
            if (r5 != r6) goto L9f
            r5 = 2
            r0.skip(r5)
            short r5 = r17.readShortLe()
            r6 = 65535(0xffff, float:9.1834E-41)
            r7 = r5 & r6
            r5 = r5 & 1
            if (r5 != 0) goto L86
            r7 = 18
            r0.skip(r7)
            short r5 = r17.readShortLe()
            long r7 = (long) r5
            r9 = 65535(0xffff, double:3.23786E-319)
            long r7 = r7 & r9
            short r5 = r17.readShortLe()
            r5 = r5 & r6
            r0.skip(r7)
            if (r18 != 0) goto L54
            long r3 = (long) r5
            r0.skip(r3)
            return r2
        L54:
            okio.internal.ZipFilesKt$readOrSkipLocalHeader$1 r2 = new okio.internal.ZipFilesKt$readOrSkipLocalHeader$1
            r2.<init>(r0, r1, r3, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            readExtra(r0, r5, r2)
            okio.FileMetadata r0 = new okio.FileMetadata
            boolean r7 = r18.isRegularFile()
            boolean r8 = r18.isDirectory()
            java.lang.Long r10 = r18.getSize()
            T r2 = r4.element
            r11 = r2
            java.lang.Long r11 = (java.lang.Long) r11
            T r1 = r1.element
            r12 = r1
            java.lang.Long r12 = (java.lang.Long) r12
            T r1 = r3.element
            r13 = r1
            java.lang.Long r13 = (java.lang.Long) r13
            r15 = 128(0x80, float:1.8E-43)
            r16 = 0
            r9 = 0
            r14 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L86:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unsupported zip: general purpose bit flag="
            r1.<init>(r2)
            java.lang.String r2 = getHex(r7)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "bad zip: expected "
            r1.<init>(r2)
            java.lang.String r2 = getHex(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = getHex(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final okio.internal.EocdRecord readZip64EocdRecord(okio.BufferedSource r8, okio.internal.EocdRecord r9) throws java.io.IOException {
            r0 = 12
            r8.skip(r0)
            int r0 = r8.readIntLe()
            int r1 = r8.readIntLe()
            long r3 = r8.readLongLe()
            long r5 = r8.readLongLe()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L31
            if (r0 != 0) goto L31
            if (r1 != 0) goto L31
            r0 = 8
            r8.skip(r0)
            long r5 = r8.readLongLe()
            okio.internal.EocdRecord r8 = new okio.internal.EocdRecord
            int r7 = r9.getCommentByteCount()
            r2 = r8
            r2.<init>(r3, r5, r7)
            return r8
        L31:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "unsupported zip: spanned"
            r8.<init>(r9)
            throw r8
    }

    public static final void skipLocalHeader(okio.BufferedSource r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            readOrSkipLocalHeader(r1, r0)
            return
    }
}
