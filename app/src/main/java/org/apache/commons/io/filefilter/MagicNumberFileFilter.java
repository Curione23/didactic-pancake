package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class MagicNumberFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    private static final long serialVersionUID = -547733176983104172L;
    private final long byteOffset;
    private final byte[] magicNumbers;

    public MagicNumberFileFilter(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r0)
            return
    }

    public MagicNumberFileFilter(java.lang.String r3, long r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "magicNumber"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L29
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L21
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            byte[] r3 = r3.getBytes(r0)
            r2.magicNumbers = r3
            r2.byteOffset = r4
            return
        L21:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The offset cannot be negative"
            r3.<init>(r4)
            throw r3
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The magic number must contain at least one byte"
            r3.<init>(r4)
            throw r3
    }

    public MagicNumberFileFilter(byte[] r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r0)
            return
    }

    public MagicNumberFileFilter(byte[] r3, long r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "magicNumbers"
            java.util.Objects.requireNonNull(r3, r0)
            int r0 = r3.length
            if (r0 == 0) goto L24
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L1c
            java.lang.Object r3 = r3.clone()
            byte[] r3 = (byte[]) r3
            r2.magicNumbers = r3
            r2.byteOffset = r4
            return
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The offset cannot be negative"
            r3.<init>(r4)
            throw r3
        L24:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The magic number must contain at least one byte"
            r3.<init>(r4)
            throw r3
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r4, java.nio.file.attribute.BasicFileAttributes r5) {
            r3 = this;
            if (r4 == 0) goto L52
            r5 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r5]
            boolean r0 = java.nio.file.Files.isRegularFile(r4, r0)
            if (r0 == 0) goto L52
            boolean r0 = java.nio.file.Files.isReadable(r4)
            if (r0 == 0) goto L52
            java.nio.file.OpenOption[] r5 = new java.nio.file.OpenOption[r5]     // Catch: java.io.IOException -> L52
            java.nio.channels.FileChannel r4 = java.nio.channels.FileChannel.open(r4, r5)     // Catch: java.io.IOException -> L52
            byte[] r5 = r3.magicNumbers     // Catch: java.lang.Throwable -> L46
            int r5 = r5.length     // Catch: java.lang.Throwable -> L46
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r5)     // Catch: java.lang.Throwable -> L46
            long r0 = r3.byteOffset     // Catch: java.lang.Throwable -> L46
            r4.position(r0)     // Catch: java.lang.Throwable -> L46
            int r0 = r4.read(r5)     // Catch: java.lang.Throwable -> L46
            byte[] r1 = r3.magicNumbers     // Catch: java.lang.Throwable -> L46
            int r2 = r1.length     // Catch: java.lang.Throwable -> L46
            if (r0 == r2) goto L34
            java.nio.file.FileVisitResult r5 = java.nio.file.FileVisitResult.TERMINATE     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L33
            r4.close()     // Catch: java.io.IOException -> L52
        L33:
            return r5
        L34:
            byte[] r5 = r5.array()     // Catch: java.lang.Throwable -> L46
            boolean r5 = java.util.Arrays.equals(r1, r5)     // Catch: java.lang.Throwable -> L46
            java.nio.file.FileVisitResult r5 = r3.toFileVisitResult(r5)     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L45
            r4.close()     // Catch: java.io.IOException -> L52
        L45:
            return r5
        L46:
            r5 = move-exception
            if (r4 == 0) goto L51
            r4.close()     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.io.IOException -> L52
        L51:
            throw r5     // Catch: java.io.IOException -> L52
        L52:
            java.nio.file.FileVisitResult r4 = java.nio.file.FileVisitResult.TERMINATE
            return r4
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r5) {
            r4 = this;
            if (r5 == 0) goto L33
            boolean r0 = r5.isFile()
            if (r0 == 0) goto L33
            boolean r0 = r5.canRead()
            if (r0 == 0) goto L33
            org.apache.commons.io.RandomAccessFileMode r0 = org.apache.commons.io.RandomAccessFileMode.READ_ONLY     // Catch: java.io.IOException -> L33
            java.io.RandomAccessFile r5 = r0.create(r5)     // Catch: java.io.IOException -> L33
            byte[] r0 = r4.magicNumbers     // Catch: java.lang.Throwable -> L27
            long r1 = r4.byteOffset     // Catch: java.lang.Throwable -> L27
            int r3 = r0.length     // Catch: java.lang.Throwable -> L27
            byte[] r1 = org.apache.commons.io.RandomAccessFiles.read(r5, r1, r3)     // Catch: java.lang.Throwable -> L27
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L26
            r5.close()     // Catch: java.io.IOException -> L33
        L26:
            return r0
        L27:
            r0 = move-exception
            if (r5 == 0) goto L32
            r5.close()     // Catch: java.lang.Throwable -> L2e
            goto L32
        L2e:
            r5 = move-exception
            r0.addSuppressed(r5)     // Catch: java.io.IOException -> L33
        L32:
            throw r0     // Catch: java.io.IOException -> L33
        L33:
            r5 = 0
            return r5
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = super.toString()
            r0.<init>(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r4.magicNumbers
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            r1.<init>(r2, r3)
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            long r1 = r4.byteOffset
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
