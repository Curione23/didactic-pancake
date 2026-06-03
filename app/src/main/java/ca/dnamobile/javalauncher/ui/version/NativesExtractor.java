package ca.dnamobile.javalauncher.ui.version;

/* JADX INFO: loaded from: classes.dex */
public final class NativesExtractor {
    private static final java.util.ArrayList<java.lang.String> LIBRARY_BLACKLIST = null;
    private final java.io.File destinationDir;
    private final java.lang.String libraryLocation;

    private static final class NonCloseableInputStream extends java.io.FilterInputStream {
        private NonCloseableInputStream(java.io.InputStream r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ NonCloseableInputStream(java.io.InputStream r1, ca.dnamobile.javalauncher.ui.version.NativesExtractor.NonCloseableInputStreamIA r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ui.version.NativesExtractor$NonCloseableInputStream-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class NonCloseableInputStreamIA {
    }

    static {
            java.util.ArrayList r0 = createLibraryBlacklist()
            ca.dnamobile.javalauncher.ui.version.NativesExtractor.LIBRARY_BLACKLIST = r0
            return
    }

    public NativesExtractor(java.io.File r2) {
            r1 = this;
            r1.<init>()
            r1.destinationDir = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "jni/"
            r2.<init>(r0)
            java.lang.String r0 = getAarArchitectureName()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r0 = "/"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.libraryLocation = r2
            return
    }

    private static java.util.ArrayList<java.lang.String> createLibraryBlacklist() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r1 == 0) goto L3c
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            goto L3c
        L16:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r1.<init>(r2)
            java.lang.String[] r1 = r1.list()
            if (r1 != 0) goto L24
            return r0
        L24:
            int r2 = r1.length
            r3 = 0
        L26:
            if (r3 >= r2) goto L39
            r4 = r1[r3]
            java.lang.String r5 = "libjnidispatch.so"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L33
            goto L36
        L33:
            r0.add(r4)
        L36:
            int r3 = r3 + 1
            goto L26
        L39:
            r0.trimToSize()
        L3c:
            return r0
    }

    private static long fileCrc32(java.io.File r3, byte[] r4) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32     // Catch: java.lang.Throwable -> L1e
            r3.<init>()     // Catch: java.lang.Throwable -> L1e
        La:
            int r1 = r0.read(r4)     // Catch: java.lang.Throwable -> L1e
            r2 = -1
            if (r1 == r2) goto L16
            r2 = 0
            r3.update(r4, r2, r1)     // Catch: java.lang.Throwable -> L1e
            goto La
        L16:
            long r3 = r3.getValue()     // Catch: java.lang.Throwable -> L1e
            r0.close()
            return r3
        L1e:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r4 = move-exception
            r3.addSuppressed(r4)
        L27:
            throw r3
    }

    private static java.lang.String getAarArchitectureName() {
            int r0 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            if (r0 == 0) goto L2d
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L27
            r1 = 3
            if (r0 != r1) goto L12
            java.lang.String r0 = "x86_64"
            return r0
        L12:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown CPU architecture: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L27:
            java.lang.String r0 = "x86"
            return r0
        L2a:
            java.lang.String r0 = "arm64-v8a"
            return r0
        L2d:
            java.lang.String r0 = "armeabi-v7a"
            return r0
    }

    private static java.lang.String getFileName(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L32
            java.lang.String r1 = r3.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Le
            goto L32
        Le:
            r1 = 47
            int r1 = r3.lastIndexOf(r1)
            r2 = 92
            int r2 = r3.lastIndexOf(r2)
            int r1 = java.lang.Math.max(r1, r2)
            if (r1 < 0) goto L26
            int r1 = r1 + 1
            java.lang.String r3 = r3.substring(r1)
        L26:
            java.lang.String r1 = r3.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L31
            goto L32
        L31:
            r0 = r3
        L32:
            return r0
    }

    private void processEntry(java.io.InputStream r9, java.util.zip.ZipEntry r10, java.io.File r11, byte[] r12) throws java.io.IOException {
            r8 = this;
            boolean r0 = r11.exists()
            if (r0 == 0) goto L1f
            long r0 = r10.getSize()
            long r2 = r10.getCrc()
            long r4 = r11.length()
            long r6 = fileCrc32(r11, r12)
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 != 0) goto L1f
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 != 0) goto L1f
            return
        L1f:
            java.io.File r10 = r11.getParentFile()
            if (r10 == 0) goto L4d
            boolean r0 = r10.exists()
            if (r0 != 0) goto L4d
            boolean r0 = r10.mkdirs()
            if (r0 != 0) goto L4d
            boolean r0 = r10.isDirectory()
            if (r0 == 0) goto L38
            goto L4d
        L38:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unable to create directory: "
            r11.<init>(r12)
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L4d:
            java.io.FileOutputStream r10 = new java.io.FileOutputStream
            r10.<init>(r11)
        L52:
            int r0 = r9.read(r12)     // Catch: java.lang.Throwable -> L69
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L5e
            r10.write(r12, r2, r0)     // Catch: java.lang.Throwable -> L69
            goto L52
        L5e:
            r10.close()
            r9 = 1
            r11.setReadable(r9, r2)
            r11.setExecutable(r9, r2)
            return
        L69:
            r9 = move-exception
            r10.close()     // Catch: java.lang.Throwable -> L6e
            goto L72
        L6e:
            r10 = move-exception
            r9.addSuppressed(r10)
        L72:
            throw r9
    }

    public void extractFromAar(java.io.File r8) throws java.io.IOException {
            r7 = this;
            boolean r0 = r8.isFile()
            if (r0 == 0) goto L9c
            java.io.File r0 = r7.destinationDir
            boolean r0 = r0.exists()
            if (r0 != 0) goto L3a
            java.io.File r0 = r7.destinationDir
            boolean r0 = r0.mkdirs()
            if (r0 != 0) goto L3a
            java.io.File r0 = r7.destinationDir
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L1f
            goto L3a
        L1f:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create native directory: "
            r0.<init>(r1)
            java.io.File r1 = r7.destinationDir
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L3a:
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r8)
            java.util.zip.ZipInputStream r8 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L92
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L92
            ca.dnamobile.javalauncher.ui.version.NativesExtractor$NonCloseableInputStream r2 = new ca.dnamobile.javalauncher.ui.version.NativesExtractor$NonCloseableInputStream     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L88
        L4e:
            java.util.zip.ZipEntry r3 = r8.getNextEntry()     // Catch: java.lang.Throwable -> L88
            if (r3 == 0) goto L81
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = r7.libraryLocation     // Catch: java.lang.Throwable -> L88
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L4e
            boolean r5 = r3.isDirectory()     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L67
            goto L4e
        L67:
            java.lang.String r4 = getFileName(r4)     // Catch: java.lang.Throwable -> L88
            if (r4 == 0) goto L4e
            java.util.ArrayList<java.lang.String> r5 = ca.dnamobile.javalauncher.ui.version.NativesExtractor.LIBRARY_BLACKLIST     // Catch: java.lang.Throwable -> L88
            boolean r5 = r5.contains(r4)     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L76
            goto L4e
        L76:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L88
            java.io.File r6 = r7.destinationDir     // Catch: java.lang.Throwable -> L88
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L88
            r7.processEntry(r2, r3, r5, r0)     // Catch: java.lang.Throwable -> L88
            goto L4e
        L81:
            r8.close()     // Catch: java.lang.Throwable -> L92
            r1.close()
            return
        L88:
            r0 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r8 = move-exception
            r0.addSuppressed(r8)     // Catch: java.lang.Throwable -> L92
        L91:
            throw r0     // Catch: java.lang.Throwable -> L92
        L92:
            r8 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L97
            goto L9b
        L97:
            r0 = move-exception
            r8.addSuppressed(r0)
        L9b:
            throw r8
        L9c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Missing native AAR: "
            r1.<init>(r2)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }
}
