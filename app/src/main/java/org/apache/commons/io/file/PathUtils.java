package org.apache.commons.io.file;

/* JADX INFO: loaded from: classes2.dex */
public final class PathUtils {
    public static final java.nio.file.CopyOption[] EMPTY_COPY_OPTIONS = null;
    public static final org.apache.commons.io.file.DeleteOption[] EMPTY_DELETE_OPTION_ARRAY = null;
    public static final java.nio.file.attribute.FileAttribute<?>[] EMPTY_FILE_ATTRIBUTE_ARRAY = null;
    public static final java.nio.file.FileVisitOption[] EMPTY_FILE_VISIT_OPTION_ARRAY = null;
    public static final java.nio.file.LinkOption[] EMPTY_LINK_OPTION_ARRAY = null;
    public static final java.nio.file.OpenOption[] EMPTY_OPEN_OPTION_ARRAY = null;
    public static final java.nio.file.Path[] EMPTY_PATH_ARRAY = null;

    @java.lang.Deprecated
    public static final java.nio.file.LinkOption[] NOFOLLOW_LINK_OPTION_ARRAY = null;
    static final java.nio.file.LinkOption NULL_LINK_OPTION = null;
    private static final java.nio.file.OpenOption[] OPEN_OPTIONS_APPEND = null;
    private static final java.nio.file.OpenOption[] OPEN_OPTIONS_TRUNCATE = null;

    /* JADX INFO: renamed from: org.apache.commons.io.file.PathUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class RelativeSortedPaths {
        final boolean equals;
        final java.util.List<java.nio.file.Path> relativeFileList1;
        final java.util.List<java.nio.file.Path> relativeFileList2;

        private RelativeSortedPaths(java.nio.file.Path r7, java.nio.file.Path r8, int r9, java.nio.file.LinkOption[] r10, java.nio.file.FileVisitOption[] r11) throws java.io.IOException {
                r6 = this;
                r6.<init>()
                r0 = 1
                r1 = 0
                if (r7 != 0) goto Ld
                if (r8 != 0) goto Ld
                r6.equals = r0
                goto L87
            Ld:
                r2 = 0
                if (r7 != 0) goto L12
                r3 = r0
                goto L13
            L12:
                r3 = r2
            L13:
                if (r8 != 0) goto L17
                r4 = r0
                goto L18
            L17:
                r4 = r2
            L18:
                r3 = r3 ^ r4
                if (r3 == 0) goto L1f
                r6.equals = r2
                goto L87
            L1f:
                boolean r3 = java.nio.file.Files.notExists(r7, r10)
                boolean r10 = java.nio.file.Files.notExists(r8, r10)
                if (r3 != 0) goto L7f
                if (r10 == 0) goto L2c
                goto L7f
            L2c:
                org.apache.commons.io.file.AccumulatorPathVisitor r10 = org.apache.commons.io.file.PathUtils.access$000(r7, r9, r11)
                org.apache.commons.io.file.AccumulatorPathVisitor r9 = org.apache.commons.io.file.PathUtils.access$000(r8, r9, r11)
                java.util.List r11 = r10.getDirList()
                int r11 = r11.size()
                java.util.List r3 = r9.getDirList()
                int r3 = r3.size()
                if (r11 != r3) goto L7c
                java.util.List r11 = r10.getFileList()
                int r11 = r11.size()
                java.util.List r3 = r9.getFileList()
                int r3 = r3.size()
                if (r11 == r3) goto L59
                goto L7c
            L59:
                java.util.List r11 = r10.relativizeDirectories(r7, r0, r1)
                java.util.List r3 = r9.relativizeDirectories(r8, r0, r1)
                boolean r11 = r11.equals(r3)
                if (r11 != 0) goto L6a
                r6.equals = r2
                goto L87
            L6a:
                java.util.List r7 = r10.relativizeFiles(r7, r0, r1)
                java.util.List r1 = r9.relativizeFiles(r8, r0, r1)
                boolean r8 = r7.equals(r1)
                r6.equals = r8
                r5 = r1
                r1 = r7
                r7 = r5
                goto L88
            L7c:
                r6.equals = r2
                goto L87
            L7f:
                if (r3 == 0) goto L84
                if (r10 == 0) goto L84
                goto L85
            L84:
                r0 = r2
            L85:
                r6.equals = r0
            L87:
                r7 = r1
            L88:
                r6.relativeFileList1 = r1
                r6.relativeFileList2 = r7
                return
        }

        /* synthetic */ RelativeSortedPaths(java.nio.file.Path r1, java.nio.file.Path r2, int r3, java.nio.file.LinkOption[] r4, java.nio.file.FileVisitOption[] r5, org.apache.commons.io.file.PathUtils.AnonymousClass1 r6) throws java.io.IOException {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }
    }

    public static /* synthetic */ java.io.InputStream $r8$lambda$GF8JHa7vXNEFej4auUeh7g5xcuU(java.net.URL r0) {
            java.io.InputStream r0 = r0.openStream()
            return r0
    }

    static {
            r0 = 2
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r0]
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.CREATE
            r3 = 0
            r1[r3] = r2
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.TRUNCATE_EXISTING
            r4 = 1
            r1[r4] = r2
            org.apache.commons.io.file.PathUtils.OPEN_OPTIONS_TRUNCATE = r1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.CREATE
            r0[r3] = r1
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r0[r4] = r1
            org.apache.commons.io.file.PathUtils.OPEN_OPTIONS_APPEND = r0
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r3]
            org.apache.commons.io.file.PathUtils.EMPTY_COPY_OPTIONS = r0
            org.apache.commons.io.file.DeleteOption[] r0 = new org.apache.commons.io.file.DeleteOption[r3]
            org.apache.commons.io.file.PathUtils.EMPTY_DELETE_OPTION_ARRAY = r0
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r3]
            org.apache.commons.io.file.PathUtils.EMPTY_FILE_ATTRIBUTE_ARRAY = r0
            java.nio.file.FileVisitOption[] r0 = new java.nio.file.FileVisitOption[r3]
            org.apache.commons.io.file.PathUtils.EMPTY_FILE_VISIT_OPTION_ARRAY = r0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r3]
            org.apache.commons.io.file.PathUtils.EMPTY_LINK_OPTION_ARRAY = r0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r4]
            java.nio.file.LinkOption r1 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r0[r3] = r1
            org.apache.commons.io.file.PathUtils.NOFOLLOW_LINK_OPTION_ARRAY = r0
            r0 = 0
            org.apache.commons.io.file.PathUtils.NULL_LINK_OPTION = r0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r3]
            org.apache.commons.io.file.PathUtils.EMPTY_OPEN_OPTION_ARRAY = r0
            java.nio.file.Path[] r0 = new java.nio.file.Path[r3]
            org.apache.commons.io.file.PathUtils.EMPTY_PATH_ARRAY = r0
            return
    }

    private PathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ org.apache.commons.io.file.AccumulatorPathVisitor access$000(java.nio.file.Path r0, int r1, java.nio.file.FileVisitOption[] r2) throws java.io.IOException {
            org.apache.commons.io.file.AccumulatorPathVisitor r0 = accumulate(r0, r1, r2)
            return r0
    }

    private static org.apache.commons.io.file.AccumulatorPathVisitor accumulate(java.nio.file.Path r1, int r2, java.nio.file.FileVisitOption[] r3) throws java.io.IOException {
            org.apache.commons.io.file.AccumulatorPathVisitor r0 = org.apache.commons.io.file.AccumulatorPathVisitor.withLongCounters()
            java.util.Set r3 = toFileVisitOptionSet(r3)
            java.nio.file.FileVisitor r1 = visitFileTree(r0, r1, r3, r2)
            org.apache.commons.io.file.AccumulatorPathVisitor r1 = (org.apache.commons.io.file.AccumulatorPathVisitor) r1
            return r1
    }

    public static org.apache.commons.io.file.Counters.PathCounters cleanDirectory(java.nio.file.Path r1) throws java.io.IOException {
            org.apache.commons.io.file.DeleteOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_DELETE_OPTION_ARRAY
            org.apache.commons.io.file.Counters$PathCounters r1 = cleanDirectory(r1, r0)
            return r1
    }

    public static org.apache.commons.io.file.Counters.PathCounters cleanDirectory(java.nio.file.Path r3, org.apache.commons.io.file.DeleteOption... r4) throws java.io.IOException {
            org.apache.commons.io.file.CleaningPathVisitor r0 = new org.apache.commons.io.file.CleaningPathVisitor
            org.apache.commons.io.file.Counters$PathCounters r1 = org.apache.commons.io.file.Counters.longPathCounters()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.<init>(r1, r4, r2)
            java.nio.file.FileVisitor r3 = visitFileTree(r0, r3)
            org.apache.commons.io.file.CleaningPathVisitor r3 = (org.apache.commons.io.file.CleaningPathVisitor) r3
            org.apache.commons.io.file.Counters$PathCounters r3 = r3.getPathCounters()
            return r3
    }

    private static int compareLastModifiedTimeTo(java.nio.file.Path r0, java.nio.file.attribute.FileTime r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.nio.file.attribute.FileTime r0 = getLastModifiedTime(r0, r2)
            int r0 = r0.compareTo(r1)
            return r0
    }

    public static long copy(org.apache.commons.io.function.IOSupplier<java.io.InputStream> r0, java.nio.file.Path r1, java.nio.file.CopyOption... r2) throws java.io.IOException {
            java.lang.Object r0 = r0.get()
            java.io.InputStream r0 = (java.io.InputStream) r0
            long r1 = java.nio.file.Files.copy(r0, r1, r2)     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Lf
            r0.close()
        Lf:
            return r1
        L10:
            r1 = move-exception
            if (r0 == 0) goto L1b
            r0.close()     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r0 = move-exception
            r1.addSuppressed(r0)
        L1b:
            throw r1
    }

    public static org.apache.commons.io.file.Counters.PathCounters copyDirectory(java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.CopyOption... r4) throws java.io.IOException {
            java.nio.file.Path r2 = r2.toAbsolutePath()
            org.apache.commons.io.file.CopyDirectoryVisitor r0 = new org.apache.commons.io.file.CopyDirectoryVisitor
            org.apache.commons.io.file.Counters$PathCounters r1 = org.apache.commons.io.file.Counters.longPathCounters()
            r0.<init>(r1, r2, r3, r4)
            java.nio.file.FileVisitor r2 = visitFileTree(r0, r2)
            org.apache.commons.io.file.CopyDirectoryVisitor r2 = (org.apache.commons.io.file.CopyDirectoryVisitor) r2
            org.apache.commons.io.file.Counters$PathCounters r2 = r2.getPathCounters()
            return r2
    }

    public static java.nio.file.Path copyFile(java.net.URL r1, java.nio.file.Path r2, java.nio.file.CopyOption... r3) throws java.io.IOException {
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda2
            r0.<init>(r1)
            copy(r0, r2, r3)
            return r2
    }

    public static java.nio.file.Path copyFileToDirectory(java.net.URL r1, java.nio.file.Path r2, java.nio.file.CopyOption... r3) throws java.io.IOException {
            java.lang.String r0 = r1.getFile()
            java.lang.String r0 = org.apache.commons.io.FilenameUtils.getName(r0)
            java.nio.file.Path r2 = r2.resolve(r0)
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda2
            r0.<init>(r1)
            copy(r0, r2, r3)
            return r2
    }

    public static java.nio.file.Path copyFileToDirectory(java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.CopyOption... r3) throws java.io.IOException {
            java.nio.file.Path r0 = r1.getFileName()
            java.nio.file.Path r2 = r2.resolve(r0)
            java.nio.file.Path r1 = java.nio.file.Files.copy(r1, r2, r3)
            return r1
    }

    public static org.apache.commons.io.file.Counters.PathCounters countDirectory(java.nio.file.Path r1) throws java.io.IOException {
            org.apache.commons.io.file.CountingPathVisitor r0 = org.apache.commons.io.file.CountingPathVisitor.withLongCounters()
            java.nio.file.FileVisitor r1 = visitFileTree(r0, r1)
            org.apache.commons.io.file.CountingPathVisitor r1 = (org.apache.commons.io.file.CountingPathVisitor) r1
            org.apache.commons.io.file.Counters$PathCounters r1 = r1.getPathCounters()
            return r1
    }

    public static org.apache.commons.io.file.Counters.PathCounters countDirectoryAsBigInteger(java.nio.file.Path r1) throws java.io.IOException {
            org.apache.commons.io.file.CountingPathVisitor r0 = org.apache.commons.io.file.CountingPathVisitor.withBigIntegerCounters()
            java.nio.file.FileVisitor r1 = visitFileTree(r0, r1)
            org.apache.commons.io.file.CountingPathVisitor r1 = (org.apache.commons.io.file.CountingPathVisitor) r1
            org.apache.commons.io.file.Counters$PathCounters r1 = r1.getPathCounters()
            return r1
    }

    public static java.nio.file.Path createParentDirectories(java.nio.file.Path r2, java.nio.file.LinkOption r3, java.nio.file.attribute.FileAttribute<?>... r4) throws java.io.IOException {
            java.nio.file.Path r2 = getParent(r2)
            java.nio.file.LinkOption r0 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            if (r3 != r0) goto L9
            goto Ld
        L9:
            java.nio.file.Path r2 = readIfSymbolicLink(r2)
        Ld:
            if (r2 != 0) goto L11
            r2 = 0
            return r2
        L11:
            r0 = 0
            if (r3 != 0) goto L1b
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r0]
            boolean r3 = java.nio.file.Files.exists(r2, r3)
            goto L24
        L1b:
            r1 = 1
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            r1[r0] = r3
            boolean r3 = java.nio.file.Files.exists(r2, r1)
        L24:
            if (r3 == 0) goto L27
            goto L2b
        L27:
            java.nio.file.Path r2 = java.nio.file.Files.createDirectories(r2, r4)
        L2b:
            return r2
    }

    public static java.nio.file.Path createParentDirectories(java.nio.file.Path r1, java.nio.file.attribute.FileAttribute<?>... r2) throws java.io.IOException {
            java.nio.file.LinkOption r0 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            java.nio.file.Path r1 = createParentDirectories(r1, r0, r2)
            return r1
    }

    public static java.nio.file.Path current() {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "."
            java.nio.file.Path r0 = java.nio.file.Paths.get(r1, r0)
            return r0
    }

    public static org.apache.commons.io.file.Counters.PathCounters delete(java.nio.file.Path r1) throws java.io.IOException {
            org.apache.commons.io.file.DeleteOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_DELETE_OPTION_ARRAY
            org.apache.commons.io.file.Counters$PathCounters r1 = delete(r1, r0)
            return r1
    }

    public static org.apache.commons.io.file.Counters.PathCounters delete(java.nio.file.Path r1, java.nio.file.LinkOption[] r2, org.apache.commons.io.file.DeleteOption... r3) throws java.io.IOException {
            boolean r0 = java.nio.file.Files.isDirectory(r1, r2)
            if (r0 == 0) goto Lb
            org.apache.commons.io.file.Counters$PathCounters r1 = deleteDirectory(r1, r2, r3)
            goto Lf
        Lb:
            org.apache.commons.io.file.Counters$PathCounters r1 = deleteFile(r1, r2, r3)
        Lf:
            return r1
    }

    public static org.apache.commons.io.file.Counters.PathCounters delete(java.nio.file.Path r3, org.apache.commons.io.file.DeleteOption... r4) throws java.io.IOException {
            r0 = 1
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            r1 = 0
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r0[r1] = r2
            boolean r0 = java.nio.file.Files.isDirectory(r3, r0)
            if (r0 == 0) goto L13
            org.apache.commons.io.file.Counters$PathCounters r3 = deleteDirectory(r3, r4)
            goto L17
        L13:
            org.apache.commons.io.file.Counters$PathCounters r3 = deleteFile(r3, r4)
        L17:
            return r3
    }

    public static org.apache.commons.io.file.Counters.PathCounters deleteDirectory(java.nio.file.Path r1) throws java.io.IOException {
            org.apache.commons.io.file.DeleteOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_DELETE_OPTION_ARRAY
            org.apache.commons.io.file.Counters$PathCounters r1 = deleteDirectory(r1, r0)
            return r1
    }

    public static org.apache.commons.io.file.Counters.PathCounters deleteDirectory(java.nio.file.Path r3, java.nio.file.LinkOption[] r4, org.apache.commons.io.file.DeleteOption... r5) throws java.io.IOException {
            org.apache.commons.io.file.DeletingPathVisitor r0 = new org.apache.commons.io.file.DeletingPathVisitor
            org.apache.commons.io.file.Counters$PathCounters r1 = org.apache.commons.io.file.Counters.longPathCounters()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.<init>(r1, r4, r5, r2)
            java.nio.file.FileVisitor r3 = visitFileTree(r0, r3)
            org.apache.commons.io.file.DeletingPathVisitor r3 = (org.apache.commons.io.file.DeletingPathVisitor) r3
            org.apache.commons.io.file.Counters$PathCounters r3 = r3.getPathCounters()
            return r3
    }

    public static org.apache.commons.io.file.Counters.PathCounters deleteDirectory(java.nio.file.Path r4, org.apache.commons.io.file.DeleteOption... r5) throws java.io.IOException {
            java.nio.file.LinkOption[] r0 = noFollowLinkOptionArray()
            java.nio.file.Path r1 = getParent(r4)
            boolean r2 = overrideReadOnly(r5)
            org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda5 r3 = new org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda5
            r3.<init>(r0, r5, r4)
            java.lang.Object r4 = withPosixFileAttributes(r1, r0, r2, r3)
            org.apache.commons.io.file.Counters$PathCounters r4 = (org.apache.commons.io.file.Counters.PathCounters) r4
            return r4
    }

    public static org.apache.commons.io.file.Counters.PathCounters deleteFile(java.nio.file.Path r1) throws java.io.IOException {
            org.apache.commons.io.file.DeleteOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_DELETE_OPTION_ARRAY
            org.apache.commons.io.file.Counters$PathCounters r1 = deleteFile(r1, r0)
            return r1
    }

    public static org.apache.commons.io.file.Counters.PathCounters deleteFile(java.nio.file.Path r6, java.nio.file.LinkOption[] r7, org.apache.commons.io.file.DeleteOption... r8) throws java.nio.file.NoSuchFileException, java.io.IOException {
            boolean r0 = java.nio.file.Files.isDirectory(r6, r7)
            if (r0 != 0) goto L7f
            org.apache.commons.io.file.Counters$PathCounters r0 = org.apache.commons.io.file.Counters.longPathCounters()
            boolean r1 = exists(r6, r7)
            r2 = 0
            if (r1 == 0) goto L1d
            boolean r1 = java.nio.file.Files.isSymbolicLink(r6)
            if (r1 != 0) goto L1d
            long r4 = java.nio.file.Files.size(r6)
            goto L1e
        L1d:
            r4 = r2
        L1e:
            boolean r1 = java.nio.file.Files.deleteIfExists(r6)     // Catch: java.nio.file.AccessDeniedException -> L33
            if (r1 == 0) goto L33
            org.apache.commons.io.file.Counters$Counter r1 = r0.getFileCounter()     // Catch: java.nio.file.AccessDeniedException -> L33
            r1.increment()     // Catch: java.nio.file.AccessDeniedException -> L33
            org.apache.commons.io.file.Counters$Counter r1 = r0.getByteCounter()     // Catch: java.nio.file.AccessDeniedException -> L33
            r1.add(r4)     // Catch: java.nio.file.AccessDeniedException -> L33
            return r0
        L33:
            java.nio.file.Path r1 = getParent(r6)
            r4 = 0
            boolean r8 = overrideReadOnly(r8)     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L46
            java.nio.file.attribute.PosixFileAttributes r4 = readPosixFileAttributes(r1, r7)     // Catch: java.lang.Throwable -> L74
            r8 = 0
            setReadOnly(r6, r8, r7)     // Catch: java.lang.Throwable -> L74
        L46:
            boolean r7 = exists(r6, r7)     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L56
            boolean r7 = java.nio.file.Files.isSymbolicLink(r6)     // Catch: java.lang.Throwable -> L74
            if (r7 != 0) goto L56
            long r2 = java.nio.file.Files.size(r6)     // Catch: java.lang.Throwable -> L74
        L56:
            boolean r6 = java.nio.file.Files.deleteIfExists(r6)     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L6a
            org.apache.commons.io.file.Counters$Counter r6 = r0.getFileCounter()     // Catch: java.lang.Throwable -> L74
            r6.increment()     // Catch: java.lang.Throwable -> L74
            org.apache.commons.io.file.Counters$Counter r6 = r0.getByteCounter()     // Catch: java.lang.Throwable -> L74
            r6.add(r2)     // Catch: java.lang.Throwable -> L74
        L6a:
            if (r4 == 0) goto L73
            java.util.Set r6 = r4.permissions()
            java.nio.file.Files.setPosixFilePermissions(r1, r6)
        L73:
            return r0
        L74:
            r6 = move-exception
            if (r4 == 0) goto L7e
            java.util.Set r7 = r4.permissions()
            java.nio.file.Files.setPosixFilePermissions(r1, r7)
        L7e:
            throw r6
        L7f:
            java.nio.file.NoSuchFileException r7 = new java.nio.file.NoSuchFileException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    public static org.apache.commons.io.file.Counters.PathCounters deleteFile(java.nio.file.Path r1, org.apache.commons.io.file.DeleteOption... r2) throws java.io.IOException {
            java.nio.file.LinkOption[] r0 = noFollowLinkOptionArray()
            org.apache.commons.io.file.Counters$PathCounters r1 = deleteFile(r1, r0, r2)
            return r1
    }

    public static void deleteOnExit(java.nio.file.Path r0) {
            java.io.File r0 = r0.toFile()
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            java.io.File r0 = (java.io.File) r0
            r0.deleteOnExit()
            return
    }

    public static boolean directoryAndFileContentEquals(java.nio.file.Path r3, java.nio.file.Path r4) throws java.io.IOException {
            java.nio.file.LinkOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_LINK_OPTION_ARRAY
            java.nio.file.OpenOption[] r1 = org.apache.commons.io.file.PathUtils.EMPTY_OPEN_OPTION_ARRAY
            java.nio.file.FileVisitOption[] r2 = org.apache.commons.io.file.PathUtils.EMPTY_FILE_VISIT_OPTION_ARRAY
            boolean r3 = directoryAndFileContentEquals(r3, r4, r0, r1, r2)
            return r3
    }

    public static boolean directoryAndFileContentEquals(java.nio.file.Path r10, java.nio.file.Path r11, java.nio.file.LinkOption[] r12, java.nio.file.OpenOption[] r13, java.nio.file.FileVisitOption[] r14) throws java.io.IOException {
            r0 = 1
            if (r10 != 0) goto L6
            if (r11 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r10 == 0) goto L63
            if (r11 != 0) goto Lc
            goto L63
        Lc:
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r1]
            boolean r2 = notExists(r10, r2)
            if (r2 == 0) goto L1d
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r1]
            boolean r2 = notExists(r11, r2)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            org.apache.commons.io.file.PathUtils$RelativeSortedPaths r2 = new org.apache.commons.io.file.PathUtils$RelativeSortedPaths
            r6 = 2147483647(0x7fffffff, float:NaN)
            r9 = 0
            r3 = r2
            r4 = r10
            r5 = r11
            r7 = r12
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            boolean r14 = r2.equals
            if (r14 != 0) goto L30
            return r1
        L30:
            java.util.List<java.nio.file.Path> r14 = r2.relativeFileList1
            java.util.List<java.nio.file.Path> r2 = r2.relativeFileList2
            java.util.Iterator r14 = r14.iterator()
        L38:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r14.next()
            java.nio.file.Path r3 = (java.nio.file.Path) r3
            int r4 = java.util.Collections.binarySearch(r2, r3)
            r5 = -1
            if (r4 <= r5) goto L5a
            java.nio.file.Path r4 = r10.resolve(r3)
            java.nio.file.Path r3 = r11.resolve(r3)
            boolean r3 = fileContentEquals(r4, r3, r12, r13)
            if (r3 != 0) goto L38
            return r1
        L5a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Unexpected mismatch."
            r10.<init>(r11)
            throw r10
        L62:
            return r0
        L63:
            return r1
    }

    public static boolean directoryContentEquals(java.nio.file.Path r3, java.nio.file.Path r4) throws java.io.IOException {
            java.nio.file.LinkOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_LINK_OPTION_ARRAY
            java.nio.file.FileVisitOption[] r1 = org.apache.commons.io.file.PathUtils.EMPTY_FILE_VISIT_OPTION_ARRAY
            r2 = 2147483647(0x7fffffff, float:NaN)
            boolean r3 = directoryContentEquals(r3, r4, r2, r0, r1)
            return r3
    }

    public static boolean directoryContentEquals(java.nio.file.Path r8, java.nio.file.Path r9, int r10, java.nio.file.LinkOption[] r11, java.nio.file.FileVisitOption[] r12) throws java.io.IOException {
            org.apache.commons.io.file.PathUtils$RelativeSortedPaths r7 = new org.apache.commons.io.file.PathUtils$RelativeSortedPaths
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            boolean r8 = r7.equals
            return r8
    }

    private static boolean exists(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "path"
            java.util.Objects.requireNonNull(r1, r0)
            if (r2 == 0) goto Lc
            boolean r1 = java.nio.file.Files.exists(r1, r2)
            goto L13
        Lc:
            r2 = 0
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r2]
            boolean r1 = java.nio.file.Files.exists(r1, r2)
        L13:
            return r1
    }

    public static boolean fileContentEquals(java.nio.file.Path r2, java.nio.file.Path r3) throws java.io.IOException {
            java.nio.file.LinkOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_LINK_OPTION_ARRAY
            java.nio.file.OpenOption[] r1 = org.apache.commons.io.file.PathUtils.EMPTY_OPEN_OPTION_ARRAY
            boolean r2 = fileContentEquals(r2, r3, r0, r1)
            return r2
    }

    public static boolean fileContentEquals(java.nio.file.Path r8, java.nio.file.Path r9, java.nio.file.LinkOption[] r10, java.nio.file.OpenOption[] r11) throws java.io.IOException {
            r0 = 1
            if (r8 != 0) goto L6
            if (r9 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r8 == 0) goto Ld5
            if (r9 != 0) goto Ld
            goto Ld5
        Ld:
            java.nio.file.Path r2 = r8.normalize()
            java.nio.file.Path r3 = r9.normalize()
            boolean r4 = exists(r2, r10)
            boolean r5 = exists(r3, r10)
            if (r4 == r5) goto L20
            return r1
        L20:
            if (r4 != 0) goto L23
            return r0
        L23:
            boolean r4 = java.nio.file.Files.isDirectory(r2, r10)
            java.lang.String r5 = "Can't compare directories, only files: "
            if (r4 != 0) goto Lc2
            boolean r4 = java.nio.file.Files.isDirectory(r3, r10)
            if (r4 != 0) goto Laf
            long r4 = java.nio.file.Files.size(r2)
            long r6 = java.nio.file.Files.size(r3)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L3e
            return r1
        L3e:
            boolean r1 = r8.equals(r9)
            if (r1 == 0) goto L45
            return r0
        L45:
            org.apache.commons.io.RandomAccessFileMode r0 = org.apache.commons.io.RandomAccessFileMode.READ_ONLY     // Catch: java.lang.UnsupportedOperationException -> L80
            java.nio.file.Path r8 = r8.toRealPath(r10)     // Catch: java.lang.UnsupportedOperationException -> L80
            java.io.RandomAccessFile r8 = r0.create(r8)     // Catch: java.lang.UnsupportedOperationException -> L80
            org.apache.commons.io.RandomAccessFileMode r0 = org.apache.commons.io.RandomAccessFileMode.READ_ONLY     // Catch: java.lang.Throwable -> L74
            java.nio.file.Path r9 = r9.toRealPath(r10)     // Catch: java.lang.Throwable -> L74
            java.io.RandomAccessFile r9 = r0.create(r9)     // Catch: java.lang.Throwable -> L74
            boolean r10 = org.apache.commons.io.RandomAccessFiles.contentEquals(r8, r9)     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L62
            r9.close()     // Catch: java.lang.Throwable -> L74
        L62:
            if (r8 == 0) goto L67
            r8.close()     // Catch: java.lang.UnsupportedOperationException -> L80
        L67:
            return r10
        L68:
            r10 = move-exception
            if (r9 == 0) goto L73
            r9.close()     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r9 = move-exception
            r10.addSuppressed(r9)     // Catch: java.lang.Throwable -> L74
        L73:
            throw r10     // Catch: java.lang.Throwable -> L74
        L74:
            r9 = move-exception
            if (r8 == 0) goto L7f
            r8.close()     // Catch: java.lang.Throwable -> L7b
            goto L7f
        L7b:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch: java.lang.UnsupportedOperationException -> L80
        L7f:
            throw r9     // Catch: java.lang.UnsupportedOperationException -> L80
        L80:
            java.io.InputStream r8 = java.nio.file.Files.newInputStream(r2, r11)
            java.io.InputStream r9 = java.nio.file.Files.newInputStream(r3, r11)     // Catch: java.lang.Throwable -> La3
            boolean r10 = org.apache.commons.io.IOUtils.contentEquals(r8, r9)     // Catch: java.lang.Throwable -> L97
            if (r9 == 0) goto L91
            r9.close()     // Catch: java.lang.Throwable -> La3
        L91:
            if (r8 == 0) goto L96
            r8.close()
        L96:
            return r10
        L97:
            r10 = move-exception
            if (r9 == 0) goto La2
            r9.close()     // Catch: java.lang.Throwable -> L9e
            goto La2
        L9e:
            r9 = move-exception
            r10.addSuppressed(r9)     // Catch: java.lang.Throwable -> La3
        La2:
            throw r10     // Catch: java.lang.Throwable -> La3
        La3:
            r9 = move-exception
            if (r8 == 0) goto Lae
            r8.close()     // Catch: java.lang.Throwable -> Laa
            goto Lae
        Laa:
            r8 = move-exception
            r9.addSuppressed(r8)
        Lae:
            throw r9
        Laf:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r5)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lc2:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r5)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Ld5:
            return r1
    }

    public static java.nio.file.Path[] filter(org.apache.commons.io.file.PathFilter r1, java.nio.file.Path... r2) {
            java.lang.String r0 = "filter"
            java.util.Objects.requireNonNull(r1, r0)
            if (r2 != 0) goto La
            java.nio.file.Path[] r1 = org.apache.commons.io.file.PathUtils.EMPTY_PATH_ARRAY
            return r1
        La:
            java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = filterPaths(r1, r2, r0)
            java.util.List r1 = (java.util.List) r1
            java.nio.file.Path[] r2 = org.apache.commons.io.file.PathUtils.EMPTY_PATH_ARRAY
            java.lang.Object[] r1 = r1.toArray(r2)
            java.nio.file.Path[] r1 = (java.nio.file.Path[]) r1
            return r1
    }

    private static <R, A> R filterPaths(org.apache.commons.io.file.PathFilter r1, java.util.stream.Stream<java.nio.file.Path> r2, java.util.stream.Collector<? super java.nio.file.Path, A, R> r3) {
            java.lang.String r0 = "filter"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "collector"
            java.util.Objects.requireNonNull(r3, r0)
            if (r2 != 0) goto L15
            java.util.stream.Stream r1 = java.util.stream.Stream.empty()
            java.lang.Object r1 = r1.collect(r3)
            return r1
        L15:
            org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda4
            r0.<init>(r1)
            java.util.stream.Stream r1 = r2.filter(r0)
            java.lang.Object r1 = r1.collect(r3)
            return r1
    }

    public static java.util.List<java.nio.file.attribute.AclEntry> getAclEntryList(java.nio.file.Path r1) throws java.io.IOException {
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.attribute.AclFileAttributeView r1 = getAclFileAttributeView(r1, r0)
            if (r1 != 0) goto Lb
            r1 = 0
            goto Lf
        Lb:
            java.util.List r1 = r1.getAcl()
        Lf:
            return r1
    }

    public static java.nio.file.attribute.AclFileAttributeView getAclFileAttributeView(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.Class<java.nio.file.attribute.AclFileAttributeView> r0 = java.nio.file.attribute.AclFileAttributeView.class
            java.nio.file.attribute.FileAttributeView r1 = java.nio.file.Files.getFileAttributeView(r1, r0, r2)
            java.nio.file.attribute.AclFileAttributeView r1 = (java.nio.file.attribute.AclFileAttributeView) r1
            return r1
    }

    public static java.lang.String getBaseName(java.nio.file.Path r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            java.nio.file.Path r1 = r1.getFileName()
            if (r1 == 0) goto L12
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = org.apache.commons.io.FilenameUtils.removeExtension(r1)
        L12:
            return r0
    }

    public static java.nio.file.attribute.DosFileAttributeView getDosFileAttributeView(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.Class<java.nio.file.attribute.DosFileAttributeView> r0 = java.nio.file.attribute.DosFileAttributeView.class
            java.nio.file.attribute.FileAttributeView r1 = java.nio.file.Files.getFileAttributeView(r1, r0, r2)
            java.nio.file.attribute.DosFileAttributeView r1 = (java.nio.file.attribute.DosFileAttributeView) r1
            return r1
    }

    public static java.lang.String getExtension(java.nio.file.Path r0) {
            java.lang.String r0 = getFileNameString(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = org.apache.commons.io.FilenameUtils.getExtension(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public static <R> R getFileName(java.nio.file.Path r1, java.util.function.Function<java.nio.file.Path, R> r2) {
            r0 = 0
            if (r1 == 0) goto L8
            java.nio.file.Path r1 = r1.getFileName()
            goto L9
        L8:
            r1 = r0
        L9:
            if (r1 == 0) goto Lf
            java.lang.Object r0 = r2.apply(r1)
        Lf:
            return r0
    }

    public static java.lang.String getFileNameString(java.nio.file.Path r1) {
            org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda1
            r0.<init>()
            java.lang.Object r1 = getFileName(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static java.nio.file.attribute.FileTime getLastModifiedFileTime(java.io.File r2) throws java.io.IOException {
            java.nio.file.Path r2 = r2.toPath()
            r0 = 0
            java.nio.file.LinkOption[] r1 = org.apache.commons.io.file.PathUtils.EMPTY_LINK_OPTION_ARRAY
            java.nio.file.attribute.FileTime r2 = getLastModifiedFileTime(r2, r0, r1)
            return r2
    }

    public static java.nio.file.attribute.FileTime getLastModifiedFileTime(java.net.URI r2) throws java.io.IOException {
            java.nio.file.Path r2 = java.nio.file.Paths.get(r2)
            r0 = 0
            java.nio.file.LinkOption[] r1 = org.apache.commons.io.file.PathUtils.EMPTY_LINK_OPTION_ARRAY
            java.nio.file.attribute.FileTime r2 = getLastModifiedFileTime(r2, r0, r1)
            return r2
    }

    public static java.nio.file.attribute.FileTime getLastModifiedFileTime(java.net.URL r0) throws java.io.IOException, java.net.URISyntaxException {
            java.net.URI r0 = r0.toURI()
            java.nio.file.attribute.FileTime r0 = getLastModifiedFileTime(r0)
            return r0
    }

    public static java.nio.file.attribute.FileTime getLastModifiedFileTime(java.nio.file.Path r1, java.nio.file.attribute.FileTime r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r0 = java.nio.file.Files.exists(r1, r0)
            if (r0 == 0) goto Ld
            java.nio.file.attribute.FileTime r2 = getLastModifiedTime(r1, r3)
        Ld:
            return r2
    }

    public static java.nio.file.attribute.FileTime getLastModifiedFileTime(java.nio.file.Path r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            r0 = 0
            java.nio.file.attribute.FileTime r1 = getLastModifiedFileTime(r1, r0, r2)
            return r1
    }

    private static java.nio.file.attribute.FileTime getLastModifiedTime(java.nio.file.Path r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.lang.String r0 = "path"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.attribute.FileTime r1 = java.nio.file.Files.getLastModifiedTime(r1, r2)
            return r1
    }

    private static java.nio.file.Path getParent(java.nio.file.Path r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.nio.file.Path r0 = r0.getParent()
        L8:
            return r0
    }

    public static java.nio.file.attribute.PosixFileAttributeView getPosixFileAttributeView(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.Class<java.nio.file.attribute.PosixFileAttributeView> r0 = java.nio.file.attribute.PosixFileAttributeView.class
            java.nio.file.attribute.FileAttributeView r1 = java.nio.file.Files.getFileAttributeView(r1, r0, r2)
            java.nio.file.attribute.PosixFileAttributeView r1 = (java.nio.file.attribute.PosixFileAttributeView) r1
            return r1
    }

    public static java.nio.file.Path getTempDirectory() {
            java.lang.String r0 = org.apache.commons.io.FileUtils.getTempDirectoryPath()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            return r0
    }

    public static boolean isDirectory(java.nio.file.Path r0, java.nio.file.LinkOption... r1) {
            if (r0 == 0) goto La
            boolean r0 = java.nio.file.Files.isDirectory(r0, r1)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static boolean isEmpty(java.nio.file.Path r1) throws java.io.IOException {
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r0 = java.nio.file.Files.isDirectory(r1, r0)
            if (r0 == 0) goto Le
            boolean r1 = isEmptyDirectory(r1)
            goto L12
        Le:
            boolean r1 = isEmptyFile(r1)
        L12:
            return r1
    }

    public static boolean isEmptyDirectory(java.nio.file.Path r1) throws java.io.IOException {
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1)
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L14
            r0 = r0 ^ 1
            if (r1 == 0) goto L13
            r1.close()
        L13:
            return r0
        L14:
            r0 = move-exception
            if (r1 == 0) goto L1f
            r1.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r1 = move-exception
            r0.addSuppressed(r1)
        L1f:
            throw r0
    }

    public static boolean isEmptyFile(java.nio.file.Path r4) throws java.io.IOException {
            long r0 = java.nio.file.Files.size(r4)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            return r4
    }

    public static boolean isNewer(java.nio.file.Path r0, long r1, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.nio.file.attribute.FileTime r1 = java.nio.file.attribute.FileTime.fromMillis(r1)
            boolean r0 = isNewer(r0, r1, r3)
            return r0
    }

    public static boolean isNewer(java.nio.file.Path r2, java.nio.file.Path r3) throws java.io.IOException {
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.nio.file.attribute.FileTime r3 = getLastModifiedTime(r3, r1)
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r2 = isNewer(r2, r3, r0)
            return r2
    }

    public static boolean isNewer(java.nio.file.Path r2, java.nio.file.attribute.FileTime r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            boolean r1 = notExists(r2, r1)
            if (r1 == 0) goto La
            return r0
        La:
            int r2 = compareLastModifiedTimeTo(r2, r3, r4)
            if (r2 <= 0) goto L11
            r0 = 1
        L11:
            return r0
    }

    public static boolean isNewer(java.nio.file.Path r0, java.time.Instant r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.nio.file.attribute.FileTime r1 = java.nio.file.attribute.FileTime.from(r1)
            boolean r0 = isNewer(r0, r1, r2)
            return r0
    }

    public static boolean isNewer(java.nio.file.Path r1, java.time.chrono.ChronoZonedDateTime<?> r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.lang.String r0 = "czdt"
            java.util.Objects.requireNonNull(r2, r0)
            java.time.Instant r2 = r2.toInstant()
            boolean r1 = isNewer(r1, r2, r3)
            return r1
    }

    public static boolean isOlder(java.nio.file.Path r0, long r1, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.nio.file.attribute.FileTime r1 = java.nio.file.attribute.FileTime.fromMillis(r1)
            boolean r0 = isOlder(r0, r1, r3)
            return r0
    }

    public static boolean isOlder(java.nio.file.Path r2, java.nio.file.Path r3) throws java.io.IOException {
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.nio.file.attribute.FileTime r3 = getLastModifiedTime(r3, r1)
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r2 = isOlder(r2, r3, r0)
            return r2
    }

    public static boolean isOlder(java.nio.file.Path r2, java.nio.file.attribute.FileTime r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            boolean r1 = notExists(r2, r1)
            if (r1 == 0) goto La
            return r0
        La:
            int r2 = compareLastModifiedTimeTo(r2, r3, r4)
            if (r2 >= 0) goto L11
            r0 = 1
        L11:
            return r0
    }

    public static boolean isOlder(java.nio.file.Path r0, java.time.Instant r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.nio.file.attribute.FileTime r1 = java.nio.file.attribute.FileTime.from(r1)
            boolean r0 = isOlder(r0, r1, r2)
            return r0
    }

    public static boolean isPosix(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            boolean r0 = exists(r1, r2)
            if (r0 == 0) goto Le
            java.nio.file.attribute.PosixFileAttributes r1 = readPosixFileAttributes(r1, r2)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static boolean isRegularFile(java.nio.file.Path r0, java.nio.file.LinkOption... r1) {
            if (r0 == 0) goto La
            boolean r0 = java.nio.file.Files.isRegularFile(r0, r1)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    static /* synthetic */ org.apache.commons.io.file.Counters.PathCounters lambda$deleteDirectory$0(java.nio.file.LinkOption[] r2, org.apache.commons.io.file.DeleteOption[] r3, java.nio.file.Path r4, java.nio.file.attribute.PosixFileAttributes r5) throws java.io.IOException {
            org.apache.commons.io.file.DeletingPathVisitor r5 = new org.apache.commons.io.file.DeletingPathVisitor
            org.apache.commons.io.file.Counters$PathCounters r0 = org.apache.commons.io.file.Counters.longPathCounters()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r5.<init>(r0, r2, r3, r1)
            java.nio.file.FileVisitor r2 = visitFileTree(r5, r4)
            org.apache.commons.io.file.DeletingPathVisitor r2 = (org.apache.commons.io.file.DeletingPathVisitor) r2
            org.apache.commons.io.file.Counters$PathCounters r2 = r2.getPathCounters()
            return r2
    }

    static /* synthetic */ boolean lambda$filterPaths$1(org.apache.commons.io.file.PathFilter r2, java.nio.file.Path r3) {
            r0 = 0
            if (r3 == 0) goto L11
            java.nio.file.attribute.BasicFileAttributes r1 = readBasicFileAttributes(r3)     // Catch: java.io.IOException -> L11
            java.nio.file.FileVisitResult r2 = r2.accept(r3, r1)     // Catch: java.io.IOException -> L11
            java.nio.file.FileVisitResult r3 = java.nio.file.FileVisitResult.CONTINUE     // Catch: java.io.IOException -> L11
            if (r2 != r3) goto L11
            r0 = 1
        L11:
            return r0
    }

    static /* synthetic */ boolean lambda$overrideReadOnly$2(org.apache.commons.io.file.DeleteOption r1) {
            org.apache.commons.io.file.StandardDeleteOption r0 = org.apache.commons.io.file.StandardDeleteOption.OVERRIDE_READ_ONLY
            if (r1 != r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    static /* synthetic */ boolean lambda$walk$3(org.apache.commons.io.file.PathFilter r0, boolean r1, java.nio.file.Path r2) {
            if (r1 == 0) goto L7
            java.nio.file.attribute.BasicFileAttributes r1 = readBasicFileAttributesUnchecked(r2)
            goto L8
        L7:
            r1 = 0
        L8:
            java.nio.file.FileVisitResult r0 = r0.accept(r2, r1)
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.CONTINUE
            if (r0 != r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public static java.nio.file.DirectoryStream<java.nio.file.Path> newDirectoryStream(java.nio.file.Path r1, org.apache.commons.io.file.PathFilter r2) throws java.io.IOException {
            org.apache.commons.io.file.DirectoryStreamFilter r0 = new org.apache.commons.io.file.DirectoryStreamFilter
            r0.<init>(r2)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r0)
            return r1
    }

    public static java.io.OutputStream newOutputStream(java.nio.file.Path r1, boolean r2) throws java.io.IOException {
            java.nio.file.LinkOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_LINK_OPTION_ARRAY
            if (r2 == 0) goto L7
            java.nio.file.OpenOption[] r2 = org.apache.commons.io.file.PathUtils.OPEN_OPTIONS_APPEND
            goto L9
        L7:
            java.nio.file.OpenOption[] r2 = org.apache.commons.io.file.PathUtils.OPEN_OPTIONS_TRUNCATE
        L9:
            java.io.OutputStream r1 = newOutputStream(r1, r0, r2)
            return r1
    }

    static java.io.OutputStream newOutputStream(java.nio.file.Path r2, java.nio.file.LinkOption[] r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            boolean r0 = exists(r2, r3)
            if (r0 != 0) goto L16
            r0 = 0
            if (r3 == 0) goto Lf
            int r1 = r3.length
            if (r1 <= 0) goto Lf
            r1 = r3[r0]
            goto L11
        Lf:
            java.nio.file.LinkOption r1 = org.apache.commons.io.file.PathUtils.NULL_LINK_OPTION
        L11:
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r0]
            createParentDirectories(r2, r1, r0)
        L16:
            java.util.ArrayList r0 = new java.util.ArrayList
            if (r4 == 0) goto L1b
            goto L1d
        L1b:
            java.nio.file.OpenOption[] r4 = org.apache.commons.io.file.PathUtils.EMPTY_OPEN_OPTION_ARRAY
        L1d:
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.<init>(r4)
            if (r3 == 0) goto L27
            goto L29
        L27:
            java.nio.file.LinkOption[] r3 = org.apache.commons.io.file.PathUtils.EMPTY_LINK_OPTION_ARRAY
        L29:
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.addAll(r3)
            java.nio.file.OpenOption[] r3 = org.apache.commons.io.file.PathUtils.EMPTY_OPEN_OPTION_ARRAY
            java.lang.Object[] r3 = r0.toArray(r3)
            java.nio.file.OpenOption[] r3 = (java.nio.file.OpenOption[]) r3
            java.io.OutputStream r2 = java.nio.file.Files.newOutputStream(r2, r3)
            return r2
    }

    public static java.nio.file.LinkOption[] noFollowLinkOptionArray() {
            java.nio.file.LinkOption[] r0 = org.apache.commons.io.file.PathUtils.NOFOLLOW_LINK_OPTION_ARRAY
            java.lang.Object r0 = r0.clone()
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            return r0
    }

    private static boolean notExists(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "path"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            boolean r1 = java.nio.file.Files.notExists(r1, r2)
            return r1
    }

    private static boolean overrideReadOnly(org.apache.commons.io.file.DeleteOption... r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda6 r0 = new org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda6
            r0.<init>()
            boolean r1 = r1.anyMatch(r0)
            return r1
    }

    public static <A extends java.nio.file.attribute.BasicFileAttributes> A readAttributes(java.nio.file.Path r1, java.lang.Class<A> r2, java.nio.file.LinkOption... r3) {
            r0 = 0
            if (r1 != 0) goto L4
            goto L8
        L4:
            java.nio.file.attribute.BasicFileAttributes r0 = java.nio.file.Files.readAttributes(r1, r2, r3)     // Catch: java.lang.Throwable -> L8
        L8:
            return r0
    }

    public static java.nio.file.attribute.BasicFileAttributes readBasicFileAttributes(java.nio.file.Path r2) throws java.io.IOException {
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r0 = java.nio.file.attribute.BasicFileAttributes.class
            r1 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            java.nio.file.attribute.BasicFileAttributes r2 = java.nio.file.Files.readAttributes(r2, r0, r1)
            return r2
    }

    public static java.nio.file.attribute.BasicFileAttributes readBasicFileAttributes(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r0 = java.nio.file.attribute.BasicFileAttributes.class
            java.nio.file.attribute.BasicFileAttributes r1 = readAttributes(r1, r0, r2)
            return r1
    }

    @java.lang.Deprecated
    public static java.nio.file.attribute.BasicFileAttributes readBasicFileAttributesUnchecked(java.nio.file.Path r1) {
            java.nio.file.LinkOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_LINK_OPTION_ARRAY
            java.nio.file.attribute.BasicFileAttributes r1 = readBasicFileAttributes(r1, r0)
            return r1
    }

    public static java.nio.file.attribute.DosFileAttributes readDosFileAttributes(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.Class<java.nio.file.attribute.DosFileAttributes> r0 = java.nio.file.attribute.DosFileAttributes.class
            java.nio.file.attribute.BasicFileAttributes r1 = readAttributes(r1, r0, r2)
            java.nio.file.attribute.DosFileAttributes r1 = (java.nio.file.attribute.DosFileAttributes) r1
            return r1
    }

    private static java.nio.file.Path readIfSymbolicLink(java.nio.file.Path r1) throws java.io.IOException {
            if (r1 == 0) goto Ld
            boolean r0 = java.nio.file.Files.isSymbolicLink(r1)
            if (r0 == 0) goto Le
            java.nio.file.Path r1 = java.nio.file.Files.readSymbolicLink(r1)
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public static java.nio.file.attribute.BasicFileAttributes readOsFileAttributes(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.nio.file.attribute.PosixFileAttributes r0 = readPosixFileAttributes(r1, r2)
            if (r0 == 0) goto L7
            goto Lb
        L7:
            java.nio.file.attribute.DosFileAttributes r0 = readDosFileAttributes(r1, r2)
        Lb:
            return r0
    }

    public static java.nio.file.attribute.PosixFileAttributes readPosixFileAttributes(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.Class<java.nio.file.attribute.PosixFileAttributes> r0 = java.nio.file.attribute.PosixFileAttributes.class
            java.nio.file.attribute.BasicFileAttributes r1 = readAttributes(r1, r0, r2)
            java.nio.file.attribute.PosixFileAttributes r1 = (java.nio.file.attribute.PosixFileAttributes) r1
            return r1
    }

    public static java.lang.String readString(java.nio.file.Path r1, java.nio.charset.Charset r2) throws java.io.IOException {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = java.nio.file.Files.readAllBytes(r1)
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            r0.<init>(r1, r2)
            return r0
    }

    static java.util.List<java.nio.file.Path> relativize(java.util.Collection<java.nio.file.Path> r1, java.nio.file.Path r2, boolean r3, java.util.Comparator<? super java.nio.file.Path> r4) {
            java.util.stream.Stream r1 = r1.stream()
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda3
            r0.<init>(r2)
            java.util.stream.Stream r1 = r1.map(r0)
            if (r3 == 0) goto L1d
            if (r4 != 0) goto L19
            java.util.stream.Stream r1 = r1.sorted()
            goto L1d
        L19:
            java.util.stream.Stream r1 = r1.sorted(r4)
        L1d:
            java.util.stream.Collector r2 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r2)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    private static java.nio.file.Path requireExists(java.nio.file.Path r2, java.lang.String r3, java.nio.file.LinkOption... r4) {
            java.util.Objects.requireNonNull(r2, r3)
            boolean r4 = exists(r2, r4)
            if (r4 == 0) goto La
            return r2
        La:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "File system element for parameter '"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "' does not exist: '"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = "'"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4.<init>(r2)
            throw r4
    }

    private static boolean setDosReadOnly(java.nio.file.Path r0, boolean r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.nio.file.attribute.DosFileAttributeView r0 = getDosFileAttributeView(r0, r2)
            if (r0 == 0) goto Lb
            r0.setReadOnly(r1)
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static void setLastModifiedTime(java.nio.file.Path r1, java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "sourceFile"
            java.util.Objects.requireNonNull(r1, r0)
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.attribute.FileTime r1 = getLastModifiedTime(r1, r0)
            java.nio.file.Files.setLastModifiedTime(r2, r1)
            return
    }

    private static boolean setPosixDeletePermissions(java.nio.file.Path r3, boolean r4, java.nio.file.LinkOption... r5) throws java.io.IOException {
            r0 = 2
            java.nio.file.attribute.PosixFilePermission[] r0 = new java.nio.file.attribute.PosixFilePermission[r0]
            r1 = 0
            java.nio.file.attribute.PosixFilePermission r2 = java.nio.file.attribute.PosixFilePermission.OWNER_WRITE
            r0[r1] = r2
            r1 = 1
            java.nio.file.attribute.PosixFilePermission r2 = java.nio.file.attribute.PosixFilePermission.OWNER_EXECUTE
            r0[r1] = r2
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r3 = setPosixPermissions(r3, r4, r0, r5)
            return r3
    }

    private static boolean setPosixPermissions(java.nio.file.Path r1, boolean r2, java.util.List<java.nio.file.attribute.PosixFilePermission> r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            if (r1 == 0) goto L1f
            java.util.Set r4 = java.nio.file.Files.getPosixFilePermissions(r1, r4)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r4)
            if (r2 == 0) goto L11
            r0.addAll(r3)
            goto L14
        L11:
            r0.removeAll(r3)
        L14:
            boolean r2 = r0.equals(r4)
            if (r2 != 0) goto L1d
            java.nio.file.Files.setPosixFilePermissions(r1, r0)
        L1d:
            r1 = 1
            return r1
        L1f:
            r1 = 0
            return r1
    }

    private static void setPosixReadOnlyFile(java.nio.file.Path r4, boolean r5, java.nio.file.LinkOption... r6) throws java.io.IOException {
            java.util.Set r6 = java.nio.file.Files.getPosixFilePermissions(r4, r6)
            r0 = 1
            java.nio.file.attribute.PosixFilePermission[] r1 = new java.nio.file.attribute.PosixFilePermission[r0]
            java.nio.file.attribute.PosixFilePermission r2 = java.nio.file.attribute.PosixFilePermission.OWNER_READ
            r3 = 0
            r1[r3] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.nio.file.attribute.PosixFilePermission[] r0 = new java.nio.file.attribute.PosixFilePermission[r0]
            java.nio.file.attribute.PosixFilePermission r2 = java.nio.file.attribute.PosixFilePermission.OWNER_WRITE
            r0[r3] = r2
            java.util.List r0 = java.util.Arrays.asList(r0)
            if (r5 == 0) goto L23
            r6.addAll(r1)
            r6.removeAll(r0)
            goto L29
        L23:
            r6.addAll(r1)
            r6.addAll(r0)
        L29:
            java.nio.file.Files.setPosixFilePermissions(r4, r6)
            return
    }

    public static java.nio.file.Path setReadOnly(java.nio.file.Path r2, boolean r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            boolean r0 = setDosReadOnly(r2, r3, r4)     // Catch: java.io.IOException -> L7
            if (r0 == 0) goto L7
            return r2
        L7:
            java.nio.file.Path r0 = getParent(r2)
            boolean r1 = isPosix(r0, r4)
            if (r1 == 0) goto L20
            if (r3 == 0) goto L1b
            setPosixReadOnlyFile(r2, r3, r4)
            r3 = 0
            setPosixDeletePermissions(r0, r3, r4)
            goto L1f
        L1b:
            r3 = 1
            setPosixDeletePermissions(r0, r3, r4)
        L1f:
            return r2
        L20:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = java.util.Arrays.toString(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}
            java.lang.String r4 = "DOS or POSIX file operations not available for '%s' %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            r3.<init>(r2)
            throw r3
    }

    public static long sizeOf(java.nio.file.Path r3) throws java.io.IOException {
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.String r2 = "path"
            requireExists(r3, r2, r1)
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r0 = java.nio.file.Files.isDirectory(r3, r0)
            if (r0 == 0) goto L15
            long r0 = sizeOfDirectory(r3)
            goto L19
        L15:
            long r0 = java.nio.file.Files.size(r3)
        L19:
            return r0
    }

    public static java.math.BigInteger sizeOfAsBigInteger(java.nio.file.Path r3) throws java.io.IOException {
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.String r2 = "path"
            requireExists(r3, r2, r1)
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r0 = java.nio.file.Files.isDirectory(r3, r0)
            if (r0 == 0) goto L15
            java.math.BigInteger r3 = sizeOfDirectoryAsBigInteger(r3)
            goto L1d
        L15:
            long r0 = java.nio.file.Files.size(r3)
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r0)
        L1d:
            return r3
    }

    public static long sizeOfDirectory(java.nio.file.Path r2) throws java.io.IOException {
            org.apache.commons.io.file.Counters$PathCounters r2 = countDirectory(r2)
            org.apache.commons.io.file.Counters$Counter r2 = r2.getByteCounter()
            java.lang.Long r2 = r2.getLong()
            long r0 = r2.longValue()
            return r0
    }

    public static java.math.BigInteger sizeOfDirectoryAsBigInteger(java.nio.file.Path r0) throws java.io.IOException {
            org.apache.commons.io.file.Counters$PathCounters r0 = countDirectoryAsBigInteger(r0)
            org.apache.commons.io.file.Counters$Counter r0 = r0.getByteCounter()
            java.math.BigInteger r0 = r0.getBigInteger()
            return r0
    }

    static java.util.Set<java.nio.file.FileVisitOption> toFileVisitOptionSet(java.nio.file.FileVisitOption... r1) {
            if (r1 != 0) goto L9
            java.lang.Class<java.nio.file.FileVisitOption> r1 = java.nio.file.FileVisitOption.class
            java.util.EnumSet r1 = java.util.EnumSet.noneOf(r1)
            goto L17
        L9:
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toSet()
            java.lang.Object r1 = r1.collect(r0)
            java.util.Set r1 = (java.util.Set) r1
        L17:
            return r1
    }

    public static java.nio.file.Path touch(java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r2, r0)
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            boolean r1 = java.nio.file.Files.exists(r2, r1)
            if (r1 != 0) goto L19
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r0]
            createParentDirectories(r2, r1)
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r0]
            java.nio.file.Files.createFile(r2, r0)
            goto L1c
        L19:
            org.apache.commons.io.file.attribute.FileTimes.setLastModifiedTime(r2)
        L1c:
            return r2
    }

    public static <T extends java.nio.file.FileVisitor<? super java.nio.file.Path>> T visitFileTree(T r0, java.lang.String r1, java.lang.String... r2) throws java.io.IOException {
            java.nio.file.Path r1 = java.nio.file.Paths.get(r1, r2)
            java.nio.file.FileVisitor r0 = visitFileTree(r0, r1)
            return r0
    }

    public static <T extends java.nio.file.FileVisitor<? super java.nio.file.Path>> T visitFileTree(T r0, java.net.URI r1) throws java.io.IOException {
            java.nio.file.Path r1 = java.nio.file.Paths.get(r1)
            java.nio.file.FileVisitor r0 = visitFileTree(r0, r1)
            return r0
    }

    public static <T extends java.nio.file.FileVisitor<? super java.nio.file.Path>> T visitFileTree(T r0, java.nio.file.Path r1) throws java.io.IOException {
            java.nio.file.Files.walkFileTree(r1, r0)
            return r0
    }

    public static <T extends java.nio.file.FileVisitor<? super java.nio.file.Path>> T visitFileTree(T r0, java.nio.file.Path r1, java.util.Set<java.nio.file.FileVisitOption> r2, int r3) throws java.io.IOException {
            java.nio.file.Files.walkFileTree(r1, r2, r3, r0)
            return r0
    }

    public static boolean waitFor(java.nio.file.Path r6, java.time.Duration r7, java.nio.file.LinkOption... r8) {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r6, r0)
            java.time.Instant r0 = java.time.Instant.now()
            java.time.Instant r7 = r0.plus(r7)
            r0 = 0
            r1 = r0
        Lf:
            boolean r2 = exists(r6, r8)     // Catch: java.lang.Throwable -> L53
            if (r2 != 0) goto L45
            java.time.Instant r2 = java.time.Instant.now()     // Catch: java.lang.Throwable -> L53
            boolean r3 = r2.isAfter(r7)     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L29
            if (r1 == 0) goto L28
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L28:
            return r0
        L29:
            long r2 = r2.toEpochMilli()     // Catch: java.lang.InterruptedException -> L43 java.lang.Exception -> L45 java.lang.Throwable -> L53
            java.time.Instant r2 = r7.minusMillis(r2)     // Catch: java.lang.InterruptedException -> L43 java.lang.Exception -> L45 java.lang.Throwable -> L53
            long r2 = r2.toEpochMilli()     // Catch: java.lang.InterruptedException -> L43 java.lang.Exception -> L45 java.lang.Throwable -> L53
            r4 = 100
            long r2 = java.lang.Math.min(r4, r2)     // Catch: java.lang.InterruptedException -> L43 java.lang.Exception -> L45 java.lang.Throwable -> L53
            java.time.Duration r2 = java.time.Duration.ofMillis(r2)     // Catch: java.lang.InterruptedException -> L43 java.lang.Exception -> L45 java.lang.Throwable -> L53
            org.apache.commons.io.ThreadUtils.sleep(r2)     // Catch: java.lang.InterruptedException -> L43 java.lang.Exception -> L45 java.lang.Throwable -> L53
            goto Lf
        L43:
            r1 = 1
            goto Lf
        L45:
            if (r1 == 0) goto L4e
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        L4e:
            boolean r6 = exists(r6, r8)
            return r6
        L53:
            r6 = move-exception
            if (r1 == 0) goto L5d
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        L5d:
            throw r6
    }

    public static java.util.stream.Stream<java.nio.file.Path> walk(java.nio.file.Path r0, org.apache.commons.io.file.PathFilter r1, int r2, boolean r3, java.nio.file.FileVisitOption... r4) throws java.io.IOException {
            java.util.stream.Stream r0 = java.nio.file.Files.walk(r0, r2, r4)
            org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda0 r2 = new org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda0
            r2.<init>(r1, r3)
            java.util.stream.Stream r0 = r0.filter(r2)
            return r0
    }

    private static <R> R withPosixFileAttributes(java.nio.file.Path r0, java.nio.file.LinkOption[] r1, boolean r2, org.apache.commons.io.function.IOFunction<java.nio.file.attribute.PosixFileAttributes, R> r3) throws java.io.IOException {
            if (r2 == 0) goto L7
            java.nio.file.attribute.PosixFileAttributes r2 = readPosixFileAttributes(r0, r1)
            goto L8
        L7:
            r2 = 0
        L8:
            java.lang.Object r3 = r3.apply(r2)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1d
            if (r0 == 0) goto L1d
            boolean r1 = java.nio.file.Files.exists(r0, r1)
            if (r1 == 0) goto L1d
            java.util.Set r1 = r2.permissions()
            java.nio.file.Files.setPosixFilePermissions(r0, r1)
        L1d:
            return r3
        L1e:
            r3 = move-exception
            if (r2 == 0) goto L30
            if (r0 == 0) goto L30
            boolean r1 = java.nio.file.Files.exists(r0, r1)
            if (r1 == 0) goto L30
            java.util.Set r1 = r2.permissions()
            java.nio.file.Files.setPosixFilePermissions(r0, r1)
        L30:
            throw r3
    }

    public static java.nio.file.Path writeString(java.nio.file.Path r1, java.lang.CharSequence r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "path"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "charSequence"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3)
            byte[] r2 = r2.getBytes(r3)
            java.nio.file.Files.write(r1, r2, r4)
            return r1
    }
}
