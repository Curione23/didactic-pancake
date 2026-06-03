package org.apache.commons.compress.archivers.examples;

/* JADX INFO: loaded from: classes2.dex */
public class Archiver {
    public static final java.util.EnumSet<java.nio.file.FileVisitOption> EMPTY_FileVisitOption = null;


    private static class ArchiverFileVisitor<O extends org.apache.commons.compress.archivers.ArchiveOutputStream<E>, E extends org.apache.commons.compress.archivers.ArchiveEntry> extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> {
        private final java.nio.file.Path directory;
        private final java.nio.file.LinkOption[] linkOptions;
        private final O target;

        private ArchiverFileVisitor(O r1, java.nio.file.Path r2, java.nio.file.LinkOption... r3) {
                r0 = this;
                r0.<init>()
                r0.target = r1
                r0.directory = r2
                if (r3 != 0) goto Lc
                java.nio.file.LinkOption[] r1 = org.apache.commons.compress.utils.IOUtils.EMPTY_LINK_OPTIONS
                goto L12
            Lc:
                java.lang.Object r1 = r3.clone()
                java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            L12:
                r0.linkOptions = r1
                return
        }

        /* synthetic */ ArchiverFileVisitor(org.apache.commons.compress.archivers.ArchiveOutputStream r1, java.nio.file.Path r2, java.nio.file.LinkOption[] r3, org.apache.commons.compress.archivers.examples.Archiver.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult preVisitDirectory(java.lang.Object r1, java.nio.file.attribute.BasicFileAttributes r2) throws java.io.IOException {
                r0 = this;
                java.nio.file.Path r1 = (java.nio.file.Path) r1
                java.nio.file.FileVisitResult r1 = r0.preVisitDirectory(r1, r2)
                return r1
        }

        public java.nio.file.FileVisitResult preVisitDirectory(java.nio.file.Path r2, java.nio.file.attribute.BasicFileAttributes r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                java.nio.file.FileVisitResult r2 = r1.visit(r2, r3, r0)
                return r2
        }

        protected java.nio.file.FileVisitResult visit(java.nio.file.Path r4, java.nio.file.attribute.BasicFileAttributes r5, boolean r6) throws java.io.IOException {
                r3 = this;
                java.util.Objects.requireNonNull(r4)
                java.util.Objects.requireNonNull(r5)
                java.nio.file.Path r5 = r3.directory
                java.nio.file.Path r5 = r5.relativize(r4)
                java.lang.String r5 = r5.toString()
                r0 = 92
                r1 = 47
                java.lang.String r5 = r5.replace(r0, r1)
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L53
                O extends org.apache.commons.compress.archivers.ArchiveOutputStream<E> r0 = r3.target
                if (r6 != 0) goto L3c
                java.lang.String r1 = "/"
                boolean r2 = r5.endsWith(r1)
                if (r2 == 0) goto L2b
                goto L3c
            L2b:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r5 = r2.append(r5)
                java.lang.StringBuilder r5 = r5.append(r1)
                java.lang.String r5 = r5.toString()
            L3c:
                java.nio.file.LinkOption[] r1 = r3.linkOptions
                org.apache.commons.compress.archivers.ArchiveEntry r5 = r0.createArchiveEntry(r4, r5, r1)
                O extends org.apache.commons.compress.archivers.ArchiveOutputStream<E> r0 = r3.target
                r0.putArchiveEntry(r5)
                if (r6 == 0) goto L4e
                O extends org.apache.commons.compress.archivers.ArchiveOutputStream<E> r5 = r3.target
                java.nio.file.Files.copy(r4, r5)
            L4e:
                O extends org.apache.commons.compress.archivers.ArchiveOutputStream<E> r4 = r3.target
                r4.closeArchiveEntry()
            L53:
                java.nio.file.FileVisitResult r4 = java.nio.file.FileVisitResult.CONTINUE
                return r4
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFile(java.lang.Object r1, java.nio.file.attribute.BasicFileAttributes r2) throws java.io.IOException {
                r0 = this;
                java.nio.file.Path r1 = (java.nio.file.Path) r1
                java.nio.file.FileVisitResult r1 = r0.visitFile(r1, r2)
                return r1
        }

        public java.nio.file.FileVisitResult visitFile(java.nio.file.Path r2, java.nio.file.attribute.BasicFileAttributes r3) throws java.io.IOException {
                r1 = this;
                r0 = 1
                java.nio.file.FileVisitResult r2 = r1.visit(r2, r3, r0)
                return r2
        }
    }

    static {
            java.lang.Class<java.nio.file.FileVisitOption> r0 = java.nio.file.FileVisitOption.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            org.apache.commons.compress.archivers.examples.Archiver.EMPTY_FileVisitOption = r0
            return
    }

    public Archiver() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean prefersSeekableByteChannel(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "zip"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L13
            java.lang.String r0 = "7z"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    public void create(java.lang.String r1, java.io.File r2, java.io.File r3) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r0 = this;
            java.nio.file.Path r2 = r2.toPath()
            java.nio.file.Path r3 = r3.toPath()
            r0.create(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public void create(java.lang.String r2, java.io.OutputStream r3, java.io.File r4) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            org.apache.commons.compress.archivers.examples.CloseableConsumer r0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER
            r1.create(r2, r3, r4, r0)
            return
    }

    public void create(java.lang.String r2, java.io.OutputStream r3, java.io.File r4, org.apache.commons.compress.archivers.examples.CloseableConsumer r5) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter r0 = new org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter
            r0.<init>(r5)
            org.apache.commons.compress.archivers.ArchiveStreamFactory r5 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT     // Catch: java.lang.Throwable -> L18
            org.apache.commons.compress.archivers.ArchiveOutputStream r2 = r5.createArchiveOutputStream(r2, r3)     // Catch: java.lang.Throwable -> L18
            java.io.Closeable r2 = r0.track(r2)     // Catch: java.lang.Throwable -> L18
            org.apache.commons.compress.archivers.ArchiveOutputStream r2 = (org.apache.commons.compress.archivers.ArchiveOutputStream) r2     // Catch: java.lang.Throwable -> L18
            r1.create(r2, r4)     // Catch: java.lang.Throwable -> L18
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
    public void create(java.lang.String r2, java.nio.channels.SeekableByteChannel r3, java.io.File r4) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            org.apache.commons.compress.archivers.examples.CloseableConsumer r0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER
            r1.create(r2, r3, r4, r0)
            return
    }

    public void create(java.lang.String r3, java.nio.channels.SeekableByteChannel r4, java.io.File r5, org.apache.commons.compress.archivers.examples.CloseableConsumer r6) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r2 = this;
            java.lang.String r0 = "Don't know how to handle format "
            org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter r1 = new org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter
            r1.<init>(r6)
            boolean r6 = r2.prefersSeekableByteChannel(r3)     // Catch: java.lang.Throwable -> L5f
            if (r6 != 0) goto L1b
            java.io.OutputStream r4 = java.nio.channels.Channels.newOutputStream(r4)     // Catch: java.lang.Throwable -> L5f
            java.io.Closeable r4 = r1.track(r4)     // Catch: java.lang.Throwable -> L5f
            java.io.OutputStream r4 = (java.io.OutputStream) r4     // Catch: java.lang.Throwable -> L5f
            r2.create(r3, r4, r5)     // Catch: java.lang.Throwable -> L5f
            goto L48
        L1b:
            java.lang.String r6 = "zip"
            boolean r6 = r6.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L32
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream r3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5f
            java.io.Closeable r3 = r1.track(r3)     // Catch: java.lang.Throwable -> L5f
            org.apache.commons.compress.archivers.ArchiveOutputStream r3 = (org.apache.commons.compress.archivers.ArchiveOutputStream) r3     // Catch: java.lang.Throwable -> L5f
            r2.create(r3, r5)     // Catch: java.lang.Throwable -> L5f
            goto L48
        L32:
            java.lang.String r6 = "7z"
            boolean r6 = r6.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L4c
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5f
            java.io.Closeable r3 = r1.track(r3)     // Catch: java.lang.Throwable -> L5f
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r3 = (org.apache.commons.compress.archivers.sevenz.SevenZOutputFile) r3     // Catch: java.lang.Throwable -> L5f
            r2.create(r3, r5)     // Catch: java.lang.Throwable -> L5f
        L48:
            r1.close()
            return
        L4c:
            org.apache.commons.compress.archivers.ArchiveException r4 = new org.apache.commons.compress.archivers.ArchiveException     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r3 = r5.append(r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5f
            throw r4     // Catch: java.lang.Throwable -> L5f
        L5f:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r4 = move-exception
            r3.addSuppressed(r4)
        L68:
            throw r3
    }

    public void create(java.lang.String r2, java.nio.channels.SeekableByteChannel r3, java.nio.file.Path r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "7z"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L1e
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile
            r2.<init>(r3)
            r1.create(r2, r4)     // Catch: java.lang.Throwable -> L14
            r2.close()
            goto L36
        L14:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r2 = move-exception
            r3.addSuppressed(r2)
        L1d:
            throw r3
        L1e:
            java.lang.String r0 = "zip"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L41
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream r2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream
            r2.<init>(r3)
            java.util.EnumSet<java.nio.file.FileVisitOption> r3 = org.apache.commons.compress.archivers.examples.Archiver.EMPTY_FileVisitOption     // Catch: java.lang.Throwable -> L37
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]     // Catch: java.lang.Throwable -> L37
            r1.create(r2, r4, r3, r0)     // Catch: java.lang.Throwable -> L37
            r2.close()
        L36:
            return
        L37:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r2 = move-exception
            r3.addSuppressed(r2)
        L40:
            throw r3
        L41:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2)
            throw r3
    }

    public void create(java.lang.String r4, java.nio.file.Path r5, java.nio.file.Path r6) throws java.io.IOException, org.apache.commons.compress.archivers.ArchiveException {
            r3 = this;
            boolean r0 = r3.prefersSeekableByteChannel(r4)
            r1 = 0
            if (r0 == 0) goto L31
            r0 = 3
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.WRITE
            r0[r1] = r2
            r1 = 1
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.CREATE
            r0[r1] = r2
            r1 = 2
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.TRUNCATE_EXISTING
            r0[r1] = r2
            java.nio.channels.FileChannel r5 = java.nio.channels.FileChannel.open(r5, r0)
            r3.create(r4, r5, r6)     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L24
            r5.close()
        L24:
            return
        L25:
            r4 = move-exception
            if (r5 == 0) goto L30
            r5.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r5 = move-exception
            r4.addSuppressed(r5)
        L30:
            throw r4
        L31:
            org.apache.commons.compress.archivers.ArchiveStreamFactory r0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r1]
            java.io.OutputStream r5 = java.nio.file.Files.newOutputStream(r5, r2)
            org.apache.commons.compress.archivers.ArchiveOutputStream r4 = r0.createArchiveOutputStream(r4, r5)
            java.util.EnumSet<java.nio.file.FileVisitOption> r5 = org.apache.commons.compress.archivers.examples.Archiver.EMPTY_FileVisitOption     // Catch: java.lang.Throwable -> L4a
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r1]     // Catch: java.lang.Throwable -> L4a
            r3.create(r4, r6, r5, r0)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L49
            r4.close()
        L49:
            return
        L4a:
            r5 = move-exception
            if (r4 == 0) goto L55
            r4.close()     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r4 = move-exception
            r5.addSuppressed(r4)
        L55:
            throw r5
    }

    public void create(org.apache.commons.compress.archivers.ArchiveOutputStream<?> r3, java.io.File r4) throws java.io.IOException {
            r2 = this;
            java.nio.file.Path r4 = r4.toPath()
            java.util.EnumSet<java.nio.file.FileVisitOption> r0 = org.apache.commons.compress.archivers.examples.Archiver.EMPTY_FileVisitOption
            r1 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            r2.create(r3, r4, r0, r1)
            return
    }

    public void create(org.apache.commons.compress.archivers.ArchiveOutputStream<?> r3, java.nio.file.Path r4) throws java.io.IOException {
            r2 = this;
            java.util.EnumSet<java.nio.file.FileVisitOption> r0 = org.apache.commons.compress.archivers.examples.Archiver.EMPTY_FileVisitOption
            r1 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            r2.create(r3, r4, r0, r1)
            return
    }

    public void create(org.apache.commons.compress.archivers.ArchiveOutputStream<?> r3, java.nio.file.Path r4, java.util.EnumSet<java.nio.file.FileVisitOption> r5, java.nio.file.LinkOption... r6) throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.archivers.examples.Archiver$ArchiverFileVisitor r0 = new org.apache.commons.compress.archivers.examples.Archiver$ArchiverFileVisitor
            r1 = 0
            r0.<init>(r3, r4, r6, r1)
            r6 = 2147483647(0x7fffffff, float:NaN)
            java.nio.file.Files.walkFileTree(r4, r5, r6, r0)
            r3.finish()
            return
    }

    public void create(org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r1, java.io.File r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r2 = r2.toPath()
            r0.create(r1, r2)
            return
    }

    public void create(org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r9, java.nio.file.Path r10) throws java.io.IOException {
            r8 = this;
            org.apache.commons.compress.archivers.examples.Archiver$1 r7 = new org.apache.commons.compress.archivers.examples.Archiver$1
            r0 = 0
            java.nio.file.LinkOption[] r4 = new java.nio.file.LinkOption[r0]
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r10
            r5 = r10
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.nio.file.Files.walkFileTree(r10, r7)
            r9.finish()
            return
    }
}
