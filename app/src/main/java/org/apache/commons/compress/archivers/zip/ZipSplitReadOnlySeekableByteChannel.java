package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class ZipSplitReadOnlySeekableByteChannel extends org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel {
    private static final java.nio.file.Path[] EMPTY_PATH_ARRAY = null;
    private static final int ZIP_SPLIT_SIGNATURE_LENGTH = 4;
    private final java.nio.ByteBuffer zipSplitSignatureByteBuffer;

    /* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class ZipSplitSegmentComparator implements java.util.Comparator<java.nio.file.Path>, java.io.Serializable {
        private static final long serialVersionUID = 20200123;

        private ZipSplitSegmentComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ ZipSplitSegmentComparator(org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.nio.file.Path r1, java.nio.file.Path r2) {
                r0 = this;
                java.nio.file.Path r1 = (java.nio.file.Path) r1
                java.nio.file.Path r2 = (java.nio.file.Path) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(java.nio.file.Path r3, java.nio.file.Path r4) {
                r2 = this;
                java.lang.String r3 = org.apache.commons.compress.utils.FileNameUtils.getExtension(r3)
                java.lang.String r4 = org.apache.commons.compress.utils.FileNameUtils.getExtension(r4)
                java.lang.String r0 = "z"
                boolean r1 = r3.startsWith(r0)
                if (r1 != 0) goto L12
                r3 = -1
                return r3
            L12:
                boolean r0 = r4.startsWith(r0)
                r1 = 1
                if (r0 != 0) goto L1a
                return r1
            L1a:
                java.lang.String r3 = r3.substring(r1)
                int r3 = java.lang.Integer.parseInt(r3)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.String r4 = r4.substring(r1)
                int r4 = java.lang.Integer.parseInt(r4)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                int r3 = r3.compareTo(r4)
                return r3
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$wBZ5N9SAmxJLRX-vx8hIUeo_fgc, reason: not valid java name */
    public static /* synthetic */ java.util.ArrayList m2547$r8$lambda$wBZ5N9SAmxJLRXvx8hIUeo_fgc() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    static {
            r0 = 0
            java.nio.file.Path[] r0 = new java.nio.file.Path[r0]
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.EMPTY_PATH_ARRAY = r0
            return
    }

    public ZipSplitReadOnlySeekableByteChannel(java.util.List<java.nio.channels.SeekableByteChannel> r2) throws java.io.IOException {
            r1 = this;
            r1.<init>(r2)
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1.zipSplitSignatureByteBuffer = r0
            r1.assertSplitSignature(r2)
            return
    }

    private void assertSplitSignature(java.util.List<java.nio.channels.SeekableByteChannel> r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            java.nio.channels.SeekableByteChannel r5 = (java.nio.channels.SeekableByteChannel) r5
            r0 = 0
            r5.position(r0)
            java.nio.ByteBuffer r2 = r4.zipSplitSignatureByteBuffer
            r2.rewind()
            java.nio.ByteBuffer r2 = r4.zipSplitSignatureByteBuffer
            r5.read(r2)
            org.apache.commons.compress.archivers.zip.ZipLong r2 = new org.apache.commons.compress.archivers.zip.ZipLong
            java.nio.ByteBuffer r3 = r4.zipSplitSignatureByteBuffer
            byte[] r3 = r3.array()
            r2.<init>(r3)
            org.apache.commons.compress.archivers.zip.ZipLong r3 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2d
            r5.position(r0)
            return
        L2d:
            r5.position(r0)
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "The first ZIP split segment does not begin with split ZIP file signature"
            r5.<init>(r0)
            throw r5
    }

    public static java.nio.channels.SeekableByteChannel buildFromLastSplitSegment(java.io.File r0) throws java.io.IOException {
            java.nio.file.Path r0 = r0.toPath()
            java.nio.channels.SeekableByteChannel r0 = buildFromLastSplitSegment(r0)
            return r0
    }

    public static java.nio.channels.SeekableByteChannel buildFromLastSplitSegment(java.nio.file.Path r4) throws java.io.IOException {
            java.lang.String r0 = org.apache.commons.compress.utils.FileNameUtils.getExtension(r4)
            java.lang.String r1 = "zip"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L8e
            java.nio.file.Path r0 = r4.getParent()
            java.util.Objects.nonNull(r0)
            r1 = 0
            if (r0 == 0) goto L1b
            java.nio.file.Path r0 = r4.getParent()
            goto L27
        L1b:
            java.nio.file.FileSystem r0 = r4.getFileSystem()
            java.lang.String r2 = "."
            java.lang.String[] r3 = new java.lang.String[r1]
            java.nio.file.Path r0 = r0.getPath(r2, r3)
        L27:
            java.lang.String r2 = org.apache.commons.compress.utils.FileNameUtils.getBaseName(r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = java.util.regex.Pattern.quote(r2)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = ".[zZ][0-9]+"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r3 = 1
            java.nio.file.FileVisitOption[] r1 = new java.nio.file.FileVisitOption[r1]
            java.util.stream.Stream r0 = java.nio.file.Files.walk(r0, r3, r1)
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda2 r1 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> L82
            r1.<init>()     // Catch: java.lang.Throwable -> L82
            java.util.stream.Stream r1 = r0.filter(r1)     // Catch: java.lang.Throwable -> L82
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda3 r3 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda3     // Catch: java.lang.Throwable -> L82
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L82
            java.util.stream.Stream r1 = r1.filter(r3)     // Catch: java.lang.Throwable -> L82
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$ZipSplitSegmentComparator r2 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$ZipSplitSegmentComparator     // Catch: java.lang.Throwable -> L82
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L82
            java.util.stream.Stream r1 = r1.sorted(r2)     // Catch: java.lang.Throwable -> L82
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda4 r2 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda4     // Catch: java.lang.Throwable -> L82
            r2.<init>()     // Catch: java.lang.Throwable -> L82
            java.util.stream.Collector r2 = java.util.stream.Collectors.toCollection(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r1 = r1.collect(r2)     // Catch: java.lang.Throwable -> L82
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7d
            r0.close()
        L7d:
            java.nio.channels.SeekableByteChannel r4 = forPaths(r4, r1)
            return r4
        L82:
            r4 = move-exception
            if (r0 == 0) goto L8d
            r0.close()     // Catch: java.lang.Throwable -> L89
            goto L8d
        L89:
            r0 = move-exception
            r4.addSuppressed(r0)
        L8d:
            throw r4
        L8e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The extension of last ZIP split segment should be .zip"
            r4.<init>(r0)
            throw r4
    }

    public static java.nio.channels.SeekableByteChannel forFiles(java.io.File r2, java.lang.Iterable<java.io.File> r3) throws java.io.IOException {
            java.lang.String r0 = "files"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "lastSegmentFile"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda1 r1 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda1
            r1.<init>(r0)
            r3.forEach(r1)
            java.nio.file.Path r2 = r2.toPath()
            java.nio.channels.SeekableByteChannel r2 = forPaths(r2, r0)
            return r2
    }

    public static java.nio.channels.SeekableByteChannel forFiles(java.io.File... r4) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "files"
            java.lang.Object r4 = java.util.Objects.requireNonNull(r4, r1)
            java.io.File[] r4 = (java.io.File[]) r4
            int r1 = r4.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1d
            r3 = r4[r2]
            java.nio.file.Path r3 = r3.toPath()
            r0.add(r3)
            int r2 = r2 + 1
            goto Lf
        L1d:
            java.nio.file.Path[] r4 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.EMPTY_PATH_ARRAY
            java.lang.Object[] r4 = r0.toArray(r4)
            java.nio.file.Path[] r4 = (java.nio.file.Path[]) r4
            java.nio.channels.SeekableByteChannel r4 = forPaths(r4)
            return r4
    }

    public static java.nio.channels.SeekableByteChannel forOrderedSeekableByteChannels(java.nio.channels.SeekableByteChannel r2, java.lang.Iterable<java.nio.channels.SeekableByteChannel> r3) throws java.io.IOException {
            java.lang.String r0 = "channels"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "lastSegmentChannel"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda5 r1 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda5
            r1.<init>(r0)
            r3.forEach(r1)
            r0.add(r2)
            r2 = 0
            java.nio.channels.SeekableByteChannel[] r2 = new java.nio.channels.SeekableByteChannel[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            java.nio.channels.SeekableByteChannel[] r2 = (java.nio.channels.SeekableByteChannel[]) r2
            java.nio.channels.SeekableByteChannel r2 = forOrderedSeekableByteChannels(r2)
            return r2
    }

    public static java.nio.channels.SeekableByteChannel forOrderedSeekableByteChannels(java.nio.channels.SeekableByteChannel... r2) throws java.io.IOException {
            java.lang.String r0 = "channels"
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2, r0)
            java.nio.channels.SeekableByteChannel[] r0 = (java.nio.channels.SeekableByteChannel[]) r0
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L10
            r0 = 0
            r2 = r2[r0]
            return r2
        L10:
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel r0 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            return r0
    }

    public static java.nio.channels.SeekableByteChannel forPaths(java.nio.file.Path r2, java.lang.Iterable<java.nio.file.Path> r3) throws java.io.IOException {
            java.lang.String r0 = "paths"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "lastSegmentPath"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda0
            r1.<init>(r0)
            r3.forEach(r1)
            r0.add(r2)
            java.nio.file.Path[] r2 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.EMPTY_PATH_ARRAY
            java.lang.Object[] r2 = r0.toArray(r2)
            java.nio.file.Path[] r2 = (java.nio.file.Path[]) r2
            java.nio.channels.SeekableByteChannel r2 = forPaths(r2)
            return r2
    }

    public static java.nio.channels.SeekableByteChannel forPaths(java.util.List<java.nio.file.Path> r2, java.nio.file.OpenOption[] r3) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "paths"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r1)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.channels.SeekableByteChannel r1 = java.nio.file.Files.newByteChannel(r1, r3)
            r0.add(r1)
            goto L11
        L25:
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L34
            r2 = 0
            java.lang.Object r2 = r0.get(r2)
            java.nio.channels.SeekableByteChannel r2 = (java.nio.channels.SeekableByteChannel) r2
            return r2
        L34:
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel r2 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel
            r2.<init>(r0)
            return r2
    }

    public static java.nio.channels.SeekableByteChannel forPaths(java.nio.file.Path... r3) throws java.io.IOException {
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.READ
            r0[r1] = r2
            java.nio.channels.SeekableByteChannel r3 = forPaths(r3, r0)
            return r3
    }

    static /* synthetic */ boolean lambda$buildFromLastSplitSegment$0(java.nio.file.Path r1) {
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r1 = java.nio.file.Files.isRegularFile(r1, r0)
            return r1
    }

    static /* synthetic */ boolean lambda$buildFromLastSplitSegment$1(java.util.regex.Pattern r0, java.nio.file.Path r1) {
            java.nio.file.Path r1 = r1.getFileName()
            java.lang.String r1 = r1.toString()
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            return r0
    }

    static /* synthetic */ void lambda$forFiles$2(java.util.List r0, java.io.File r1) {
            java.nio.file.Path r1 = r1.toPath()
            r0.add(r1)
            return
    }
}
