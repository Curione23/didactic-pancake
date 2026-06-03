package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class Archive {
    private static final int[] MAGIC = null;
    private final boolean closeStreams;
    private boolean deflateHint;
    private final java.nio.file.Path inputPath;
    private final long inputSize;
    private org.apache.commons.io.input.BoundedInputStream inputStream;
    private java.io.FileOutputStream logFile;
    private int logLevel;
    private final java.lang.String outputFileName;
    private final java.util.jar.JarOutputStream outputStream;
    private boolean overrideDeflateHint;
    private boolean removePackFile;

    static {
            r0 = 208(0xd0, float:2.91E-43)
            r1 = 13
            r2 = 202(0xca, float:2.83E-43)
            r3 = 254(0xfe, float:3.56E-43)
            int[] r0 = new int[]{r2, r3, r0, r1}
            org.apache.commons.compress.harmony.unpack200.Archive.MAGIC = r0
            return
    }

    public Archive(java.io.InputStream r3, java.util.jar.JarOutputStream r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.logLevel = r0
            org.apache.commons.io.input.BoundedInputStream r0 = org.apache.commons.compress.harmony.unpack200.Pack200UnpackerAdapter.newBoundedInputStream(r3)
            r2.inputStream = r0
            r2.outputStream = r4
            boolean r4 = r3 instanceof java.io.FileInputStream
            r0 = 0
            r1 = 0
            if (r4 == 0) goto L23
            java.io.FileInputStream r3 = (java.io.FileInputStream) r3
            java.lang.String r3 = org.apache.commons.compress.harmony.unpack200.Pack200UnpackerAdapter.readPathString(r3)
            java.lang.String[] r4 = new java.lang.String[r0]
            java.nio.file.Path r3 = java.nio.file.Paths.get(r3, r4)
            r2.inputPath = r3
            goto L25
        L23:
            r2.inputPath = r1
        L25:
            r2.outputFileName = r1
            r3 = -1
            r2.inputSize = r3
            r2.closeStreams = r0
            return
    }

    public Archive(java.lang.String r6, java.lang.String r7) throws java.io.FileNotFoundException, java.io.IOException {
            r5 = this;
            r5.<init>()
            r0 = 1
            r5.logLevel = r0
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.nio.file.Path r6 = java.nio.file.Paths.get(r6, r2)
            r5.inputPath = r6
            long r2 = java.nio.file.Files.size(r6)
            r5.inputSize = r2
            org.apache.commons.io.input.BoundedInputStream r4 = new org.apache.commons.io.input.BoundedInputStream
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
            java.io.InputStream r6 = java.nio.file.Files.newInputStream(r6, r1)
            r4.<init>(r6, r2)
            r5.inputStream = r4
            java.util.jar.JarOutputStream r6 = new java.util.jar.JarOutputStream
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r7)
            r1.<init>(r2)
            r6.<init>(r1)
            r5.outputStream = r6
            r5.outputFileName = r7
            r5.closeStreams = r0
            return
    }

    private boolean available(java.io.InputStream r3) throws java.io.IOException {
            r2 = this;
            r0 = 1
            r3.mark(r0)
            int r1 = r3.read()
            r3.reset()
            r3 = -1
            if (r1 == r3) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public void setDeflateHint(boolean r2) {
            r1 = this;
            r0 = 1
            r1.overrideDeflateHint = r0
            r1.deflateHint = r2
            return
    }

    public void setLogFile(java.lang.String r2) throws java.io.FileNotFoundException {
            r1 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            r1.logFile = r0
            return
    }

    public void setLogFile(java.lang.String r2, boolean r3) throws java.io.FileNotFoundException {
            r1 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2, r3)
            r1.logFile = r0
            return
    }

    public void setQuiet(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L6
            int r1 = r0.logLevel
            if (r1 != 0) goto L9
        L6:
            r1 = 0
            r0.logLevel = r1
        L9:
            return
    }

    public void setRemovePackFile(boolean r1) {
            r0 = this;
            r0.removePackFile = r1
            return
    }

    public void setVerbose(boolean r2) {
            r1 = this;
            r0 = 2
            if (r2 == 0) goto L6
            r1.logLevel = r0
            goto Ld
        L6:
            int r2 = r1.logLevel
            if (r2 != r0) goto Ld
            r2 = 1
            r1.logLevel = r2
        Ld:
            return
    }

    public void unpack() throws org.apache.commons.compress.harmony.pack200.Pack200Exception, java.io.IOException {
            r7 = this;
            java.util.jar.JarOutputStream r0 = r7.outputStream
            java.lang.String r1 = "PACK200"
            r0.setComment(r1)
            org.apache.commons.io.input.BoundedInputStream r0 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            boolean r0 = r0.markSupported()     // Catch: java.lang.Throwable -> L159
            if (r0 != 0) goto L2a
            org.apache.commons.io.input.BoundedInputStream r0 = new org.apache.commons.io.input.BoundedInputStream     // Catch: java.lang.Throwable -> L159
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L159
            org.apache.commons.io.input.BoundedInputStream r2 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L159
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L159
            r7.inputStream = r0     // Catch: java.lang.Throwable -> L159
            boolean r0 = r0.markSupported()     // Catch: java.lang.Throwable -> L159
            if (r0 == 0) goto L24
            goto L2a
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L159
            r0.<init>()     // Catch: java.lang.Throwable -> L159
            throw r0     // Catch: java.lang.Throwable -> L159
        L2a:
            org.apache.commons.io.input.BoundedInputStream r0 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            r1 = 2
            r0.mark(r1)     // Catch: java.lang.Throwable -> L159
            org.apache.commons.io.input.BoundedInputStream r0 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            int r0 = r0.read()     // Catch: java.lang.Throwable -> L159
            r0 = r0 & 255(0xff, float:3.57E-43)
            org.apache.commons.io.input.BoundedInputStream r2 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            int r2 = r2.read()     // Catch: java.lang.Throwable -> L159
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r0 = r0 | r2
            r2 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r2) goto L61
            org.apache.commons.io.input.BoundedInputStream r0 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            r0.reset()     // Catch: java.lang.Throwable -> L159
            org.apache.commons.io.input.BoundedInputStream r0 = new org.apache.commons.io.input.BoundedInputStream     // Catch: java.lang.Throwable -> L159
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L159
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L159
            org.apache.commons.io.input.BoundedInputStream r4 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L159
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L159
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L159
            r7.inputStream = r0     // Catch: java.lang.Throwable -> L159
            goto L66
        L61:
            org.apache.commons.io.input.BoundedInputStream r0 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            r0.reset()     // Catch: java.lang.Throwable -> L159
        L66:
            org.apache.commons.io.input.BoundedInputStream r0 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            int[] r2 = org.apache.commons.compress.harmony.unpack200.Archive.MAGIC     // Catch: java.lang.Throwable -> L159
            int r3 = r2.length     // Catch: java.lang.Throwable -> L159
            r0.mark(r3)     // Catch: java.lang.Throwable -> L159
            int r0 = r2.length     // Catch: java.lang.Throwable -> L159
            int[] r2 = new int[r0]     // Catch: java.lang.Throwable -> L159
            r3 = 0
            r4 = r3
        L73:
            if (r4 >= r0) goto L80
            org.apache.commons.io.input.BoundedInputStream r5 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            int r5 = r5.read()     // Catch: java.lang.Throwable -> L159
            r2[r4] = r5     // Catch: java.lang.Throwable -> L159
            int r4 = r4 + 1
            goto L73
        L80:
            r0 = r3
        L81:
            int[] r4 = org.apache.commons.compress.harmony.unpack200.Archive.MAGIC     // Catch: java.lang.Throwable -> L159
            int r5 = r4.length     // Catch: java.lang.Throwable -> L159
            r6 = 1
            if (r0 >= r5) goto L92
            r5 = r2[r0]     // Catch: java.lang.Throwable -> L159
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L159
            if (r5 == r4) goto L8f
            r0 = r6
            goto L93
        L8f:
            int r0 = r0 + 1
            goto L81
        L92:
            r0 = r3
        L93:
            org.apache.commons.io.input.BoundedInputStream r2 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            r2.reset()     // Catch: java.lang.Throwable -> L159
            if (r0 == 0) goto Lc7
            java.util.jar.JarInputStream r0 = new java.util.jar.JarInputStream     // Catch: java.lang.Throwable -> L159
            org.apache.commons.io.input.BoundedInputStream r1 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L159
        La1:
            java.util.jar.JarEntry r1 = r0.getNextJarEntry()     // Catch: java.lang.Throwable -> L159
            if (r1 == 0) goto L13a
            java.util.jar.JarOutputStream r2 = r7.outputStream     // Catch: java.lang.Throwable -> L159
            r2.putNextEntry(r1)     // Catch: java.lang.Throwable -> L159
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L159
            int r2 = r0.read(r1)     // Catch: java.lang.Throwable -> L159
        Lb4:
            r4 = -1
            if (r2 == r4) goto Lc1
            java.util.jar.JarOutputStream r4 = r7.outputStream     // Catch: java.lang.Throwable -> L159
            r4.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L159
            int r2 = r0.read(r1)     // Catch: java.lang.Throwable -> L159
            goto Lb4
        Lc1:
            java.util.jar.JarOutputStream r1 = r7.outputStream     // Catch: java.lang.Throwable -> L159
            r1.closeEntry()     // Catch: java.lang.Throwable -> L159
            goto La1
        Lc7:
            r0 = r3
        Lc8:
            org.apache.commons.io.input.BoundedInputStream r2 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            boolean r2 = r7.available(r2)     // Catch: java.lang.Throwable -> L159
            if (r2 == 0) goto L13a
            int r0 = r0 + r6
            org.apache.commons.compress.harmony.unpack200.Segment r2 = new org.apache.commons.compress.harmony.unpack200.Segment     // Catch: java.lang.Throwable -> L159
            r2.<init>()     // Catch: java.lang.Throwable -> L159
            int r4 = r7.logLevel     // Catch: java.lang.Throwable -> L159
            r2.setLogLevel(r4)     // Catch: java.lang.Throwable -> L159
            java.io.FileOutputStream r4 = r7.logFile     // Catch: java.lang.Throwable -> L159
            if (r4 == 0) goto Le0
            goto Le2
        Le0:
            java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.Throwable -> L159
        Le2:
            r2.setLogStream(r4)     // Catch: java.lang.Throwable -> L159
            r2.setPreRead(r3)     // Catch: java.lang.Throwable -> L159
            if (r0 != r6) goto L10e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L159
            r4.<init>()     // Catch: java.lang.Throwable -> L159
            java.lang.String r5 = "Unpacking from "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L159
            java.nio.file.Path r5 = r7.inputPath     // Catch: java.lang.Throwable -> L159
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L159
            java.lang.String r5 = " to "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L159
            java.lang.String r5 = r7.outputFileName     // Catch: java.lang.Throwable -> L159
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L159
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L159
            r2.log(r1, r4)     // Catch: java.lang.Throwable -> L159
        L10e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L159
            r4.<init>()     // Catch: java.lang.Throwable -> L159
            java.lang.String r5 = "Reading segment "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L159
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L159
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L159
            r2.log(r1, r4)     // Catch: java.lang.Throwable -> L159
            boolean r4 = r7.overrideDeflateHint     // Catch: java.lang.Throwable -> L159
            if (r4 == 0) goto L12d
            boolean r4 = r7.deflateHint     // Catch: java.lang.Throwable -> L159
            r2.overrideDeflateHint(r4)     // Catch: java.lang.Throwable -> L159
        L12d:
            org.apache.commons.io.input.BoundedInputStream r4 = r7.inputStream     // Catch: java.lang.Throwable -> L159
            java.util.jar.JarOutputStream r5 = r7.outputStream     // Catch: java.lang.Throwable -> L159
            r2.unpack(r4, r5)     // Catch: java.lang.Throwable -> L159
            java.util.jar.JarOutputStream r2 = r7.outputStream     // Catch: java.lang.Throwable -> L159
            r2.flush()     // Catch: java.lang.Throwable -> L159
            goto Lc8
        L13a:
            boolean r0 = r7.closeStreams
            if (r0 == 0) goto L148
            org.apache.commons.io.input.BoundedInputStream r0 = r7.inputStream
            org.apache.commons.io.IOUtils.closeQuietly(r0)
            java.util.jar.JarOutputStream r0 = r7.outputStream
            org.apache.commons.io.IOUtils.closeQuietly(r0)
        L148:
            java.io.FileOutputStream r0 = r7.logFile
            org.apache.commons.io.IOUtils.closeQuietly(r0)
            boolean r0 = r7.removePackFile
            if (r0 == 0) goto L158
            java.nio.file.Path r0 = r7.inputPath
            if (r0 == 0) goto L158
            java.nio.file.Files.delete(r0)
        L158:
            return
        L159:
            r0 = move-exception
            boolean r1 = r7.closeStreams
            if (r1 == 0) goto L168
            org.apache.commons.io.input.BoundedInputStream r1 = r7.inputStream
            org.apache.commons.io.IOUtils.closeQuietly(r1)
            java.util.jar.JarOutputStream r1 = r7.outputStream
            org.apache.commons.io.IOUtils.closeQuietly(r1)
        L168:
            java.io.FileOutputStream r1 = r7.logFile
            org.apache.commons.io.IOUtils.closeQuietly(r1)
            throw r0
    }
}
