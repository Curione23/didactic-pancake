package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class IOUtils {
    public static final java.nio.file.LinkOption[] EMPTY_LINK_OPTIONS = null;

    public static /* synthetic */ byte[] $r8$lambda$4BQ5ArfWXirWkxf9s4XfDylm8lY() {
            byte[] r0 = org.apache.commons.io.IOUtils.byteArray()
            return r0
    }

    static {
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            org.apache.commons.compress.utils.IOUtils.EMPTY_LINK_OPTIONS = r0
            return
    }

    private IOUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void closeQuietly(java.io.Closeable r0) {
            org.apache.commons.io.IOUtils.closeQuietly(r0)
            return
    }

    @java.lang.Deprecated
    public static long copy(java.io.InputStream r0, java.io.OutputStream r1) throws java.io.IOException {
            int r0 = org.apache.commons.io.IOUtils.copy(r0, r1)
            long r0 = (long) r0
            return r0
    }

    @java.lang.Deprecated
    public static long copy(java.io.InputStream r0, java.io.OutputStream r1, int r2) throws java.io.IOException {
            long r0 = org.apache.commons.io.IOUtils.copy(r0, r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static void copy(java.io.File r0, java.io.OutputStream r1) throws java.io.IOException {
            org.apache.commons.io.FileUtils.copyFile(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static long copyRange(java.io.InputStream r6, long r7, java.io.OutputStream r9) throws java.io.IOException {
            r2 = 0
            r0 = r6
            r1 = r9
            r4 = r7
            long r6 = org.apache.commons.io.IOUtils.copyLarge(r0, r1, r2, r4)
            return r6
    }

    @java.lang.Deprecated
    public static long copyRange(java.io.InputStream r8, long r9, java.io.OutputStream r11, int r12) throws java.io.IOException {
            r0 = 1
            if (r12 < r0) goto L2e
            long r0 = (long) r12
            r2 = 0
            long r4 = java.lang.Math.max(r2, r9)
            long r0 = java.lang.Math.min(r0, r4)
            int r12 = (int) r0
            byte[] r0 = new byte[r12]
        L11:
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r1 >= 0) goto L2d
            long r4 = r9 - r2
            long r6 = (long) r12
            long r4 = java.lang.Math.min(r4, r6)
            int r1 = (int) r4
            r4 = 0
            int r1 = r8.read(r0, r4, r1)
            r5 = -1
            if (r5 == r1) goto L2d
            if (r11 == 0) goto L2a
            r11.write(r0, r4, r1)
        L2a:
            long r4 = (long) r1
            long r2 = r2 + r4
            goto L11
        L2d:
            return r2
        L2e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "bufferSize must be bigger than 0"
            r8.<init>(r9)
            throw r8
    }

    @java.lang.Deprecated
    public static int read(java.io.File r2, byte[] r3) throws java.io.IOException {
            java.nio.file.Path r2 = r2.toPath()
            r0 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r0]
            java.io.InputStream r2 = java.nio.file.Files.newInputStream(r2, r1)
            int r1 = r3.length     // Catch: java.lang.Throwable -> L16
            int r3 = readFully(r2, r3, r0, r1)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L15
            r2.close()
        L15:
            return r3
        L16:
            r3 = move-exception
            if (r2 == 0) goto L21
            r2.close()     // Catch: java.lang.Throwable -> L1d
            goto L21
        L1d:
            r2 = move-exception
            r3.addSuppressed(r2)
        L21:
            throw r3
    }

    public static int readFully(java.io.InputStream r2, byte[] r3) throws java.io.IOException {
            r0 = 0
            int r1 = r3.length
            int r2 = readFully(r2, r3, r0, r1)
            return r2
    }

    public static int readFully(java.io.InputStream r2, byte[] r3, int r4, int r5) throws java.io.IOException {
            if (r5 < 0) goto L10
            if (r4 < 0) goto L10
            int r0 = r5 + r4
            int r1 = r3.length
            if (r0 > r1) goto L10
            if (r0 < 0) goto L10
            int r2 = org.apache.commons.io.IOUtils.read(r2, r3, r4, r5)
            return r2
        L10:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public static void readFully(java.nio.channels.ReadableByteChannel r1, java.nio.ByteBuffer r2) throws java.io.IOException {
            int r0 = r2.remaining()
            int r1 = org.apache.commons.io.IOUtils.read(r1, r2)
            if (r1 < r0) goto Lb
            return
        Lb:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static byte[] readRange(java.io.InputStream r7, int r8) throws java.io.IOException {
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            r2 = 0
            long r4 = (long) r8
            r0 = r7
            r1 = r6
            org.apache.commons.io.IOUtils.copyLarge(r0, r1, r2, r4)
            byte[] r7 = r6.toByteArray()
            return r7
    }

    public static byte[] readRange(java.nio.channels.ReadableByteChannel r6, int r7) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            int r1 = java.lang.Math.min(r7, r1)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r2 = 0
            r3 = r2
        L11:
            if (r3 >= r7) goto L33
            int r4 = r7 - r3
            int r5 = r1.capacity()
            int r4 = java.lang.Math.min(r4, r5)
            r1.limit(r4)
            int r4 = r6.read(r1)
            if (r4 > 0) goto L27
            goto L33
        L27:
            byte[] r5 = r1.array()
            r0.write(r5, r2, r4)
            r1.rewind()
            int r3 = r3 + r4
            goto L11
        L33:
            byte[] r6 = r0.toByteArray()
            return r6
    }

    public static long skip(java.io.InputStream r1, long r2) throws java.io.IOException {
            org.apache.commons.compress.utils.IOUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.utils.IOUtils$$ExternalSyntheticLambda0
            r0.<init>()
            long r1 = org.apache.commons.io.IOUtils.skip(r1, r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static byte[] toByteArray(java.io.InputStream r0) throws java.io.IOException {
            byte[] r0 = org.apache.commons.io.IOUtils.toByteArray(r0)
            return r0
    }
}
