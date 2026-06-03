package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class PackingUtils {
    private static java.util.logging.FileHandler fileHandler;
    private static org.apache.commons.compress.harmony.pack200.PackingUtils.PackingLogger packingLogger;

    private static final class PackingLogger extends java.util.logging.Logger {
        private boolean verbose;

        protected PackingLogger(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ void access$000(org.apache.commons.compress.harmony.pack200.PackingUtils.PackingLogger r0, boolean r1) {
                r0.setVerbose(r1)
                return
        }

        private void setVerbose(boolean r1) {
                r0 = this;
                r0.verbose = r1
                return
        }

        @Override // java.util.logging.Logger
        public void log(java.util.logging.LogRecord r2) {
                r1 = this;
                boolean r0 = r1.verbose
                if (r0 == 0) goto L7
                super.log(r2)
            L7:
                return
        }
    }

    static {
            org.apache.commons.compress.harmony.pack200.PackingUtils$PackingLogger r0 = new org.apache.commons.compress.harmony.pack200.PackingUtils$PackingLogger
            java.lang.String r1 = "org.harmony.apache.pack200"
            r2 = 0
            r0.<init>(r1, r2)
            org.apache.commons.compress.harmony.pack200.PackingUtils.packingLogger = r0
            java.util.logging.LogManager r0 = java.util.logging.LogManager.getLogManager()
            org.apache.commons.compress.harmony.pack200.PackingUtils$PackingLogger r1 = org.apache.commons.compress.harmony.pack200.PackingUtils.packingLogger
            r0.addLogger(r1)
            return
    }

    public PackingUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void config(org.apache.commons.compress.harmony.pack200.PackingOptions r3) throws java.io.IOException {
            if (r3 == 0) goto L7
            java.lang.String r0 = r3.getLogFile()
            goto L8
        L7:
            r0 = 0
        L8:
            java.util.logging.FileHandler r1 = org.apache.commons.compress.harmony.pack200.PackingUtils.fileHandler
            if (r1 == 0) goto Lf
            r1.close()
        Lf:
            if (r0 == 0) goto L2d
            java.util.logging.FileHandler r1 = new java.util.logging.FileHandler
            r2 = 0
            r1.<init>(r0, r2)
            org.apache.commons.compress.harmony.pack200.PackingUtils.fileHandler = r1
            java.util.logging.SimpleFormatter r0 = new java.util.logging.SimpleFormatter
            r0.<init>()
            r1.setFormatter(r0)
            org.apache.commons.compress.harmony.pack200.PackingUtils$PackingLogger r0 = org.apache.commons.compress.harmony.pack200.PackingUtils.packingLogger
            java.util.logging.FileHandler r1 = org.apache.commons.compress.harmony.pack200.PackingUtils.fileHandler
            r0.addHandler(r1)
            org.apache.commons.compress.harmony.pack200.PackingUtils$PackingLogger r0 = org.apache.commons.compress.harmony.pack200.PackingUtils.packingLogger
            r0.setUseParentHandlers(r2)
        L2d:
            if (r3 == 0) goto L38
            org.apache.commons.compress.harmony.pack200.PackingUtils$PackingLogger r0 = org.apache.commons.compress.harmony.pack200.PackingUtils.packingLogger
            boolean r3 = r3.isVerbose()
            org.apache.commons.compress.harmony.pack200.PackingUtils.PackingLogger.access$000(r0, r3)
        L38:
            return
    }

    public static void copyThroughJar(java.util.jar.JarFile r6, java.io.OutputStream r7) throws java.io.IOException {
            java.util.jar.JarOutputStream r0 = new java.util.jar.JarOutputStream
            r0.<init>(r7)
            java.lang.String r7 = "PACK200"
            r0.setComment(r7)     // Catch: java.lang.Throwable -> L67
            r7 = 16384(0x4000, float:2.2959E-41)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L67
            java.util.Enumeration r1 = r6.entries()     // Catch: java.lang.Throwable -> L67
        L12:
            boolean r2 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L60
            java.lang.Object r2 = r1.nextElement()     // Catch: java.lang.Throwable -> L67
            java.util.jar.JarEntry r2 = (java.util.jar.JarEntry) r2     // Catch: java.lang.Throwable -> L67
            r0.putNextEntry(r2)     // Catch: java.lang.Throwable -> L67
            java.io.InputStream r3 = r6.getInputStream(r2)     // Catch: java.lang.Throwable -> L67
        L25:
            int r4 = r3.read(r7)     // Catch: java.lang.Throwable -> L54
            r5 = -1
            if (r4 == r5) goto L31
            r5 = 0
            r0.write(r7, r5, r4)     // Catch: java.lang.Throwable -> L54
            goto L25
        L31:
            r0.closeEntry()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r4.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = "Packed "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L54
            log(r2)     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> L67
            goto L12
        L54:
            r6 = move-exception
            if (r3 == 0) goto L5f
            r3.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: java.lang.Throwable -> L67
        L5f:
            throw r6     // Catch: java.lang.Throwable -> L67
        L60:
            r6.close()     // Catch: java.lang.Throwable -> L67
            r0.close()
            return
        L67:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L6c
            goto L70
        L6c:
            r7 = move-exception
            r6.addSuppressed(r7)
        L70:
            throw r6
    }

    public static void copyThroughJar(java.util.jar.JarInputStream r4, java.io.OutputStream r5) throws java.io.IOException {
            java.util.jar.Manifest r0 = r4.getManifest()
            java.util.jar.JarOutputStream r1 = new java.util.jar.JarOutputStream
            r1.<init>(r5, r0)
            java.lang.String r5 = "PACK200"
            r1.setComment(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = "Packed META-INF/MANIFEST.MF"
            log(r5)     // Catch: java.lang.Throwable -> L4e
            r5 = 16384(0x4000, float:2.2959E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L4e
        L17:
            java.util.jar.JarEntry r0 = r4.getNextJarEntry()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L47
            r1.putNextEntry(r0)     // Catch: java.lang.Throwable -> L4e
        L20:
            int r2 = r4.read(r5)     // Catch: java.lang.Throwable -> L4e
            r3 = -1
            if (r2 == r3) goto L2c
            r3 = 0
            r1.write(r5, r3, r2)     // Catch: java.lang.Throwable -> L4e
            goto L20
        L2c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = "Packed "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4e
            log(r0)     // Catch: java.lang.Throwable -> L4e
            goto L17
        L47:
            r4.close()     // Catch: java.lang.Throwable -> L4e
            r1.close()
            return
        L4e:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r5 = move-exception
            r4.addSuppressed(r5)
        L57:
            throw r4
    }

    public static java.util.List<org.apache.commons.compress.harmony.pack200.Archive.PackingFile> getPackingFileListFromJar(java.util.jar.JarFile r6, boolean r7) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Enumeration r1 = r6.entries()
        L9:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.nextElement()
            java.util.jar.JarEntry r2 = (java.util.jar.JarEntry) r2
            java.io.InputStream r3 = r6.getInputStream(r2)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L30
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L30
            byte[] r4 = readJarEntry(r2, r4)     // Catch: java.lang.Throwable -> L30
            org.apache.commons.compress.harmony.pack200.Archive$PackingFile r5 = new org.apache.commons.compress.harmony.pack200.Archive$PackingFile     // Catch: java.lang.Throwable -> L30
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L30
            r0.add(r5)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L9
            r3.close()
            goto L9
        L30:
            r6 = move-exception
            if (r3 == 0) goto L3b
            r3.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r7 = move-exception
            r6.addSuppressed(r7)
        L3b:
            throw r6
        L3c:
            if (r7 != 0) goto L41
            reorderPackingFiles(r0)
        L41:
            return r0
    }

    public static java.util.List<org.apache.commons.compress.harmony.pack200.Archive.PackingFile> getPackingFileListFromJar(java.util.jar.JarInputStream r6, boolean r7) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.jar.Manifest r1 = r6.getManifest()
            if (r1 == 0) goto L23
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r1.write(r2)
            org.apache.commons.compress.harmony.pack200.Archive$PackingFile r1 = new org.apache.commons.compress.harmony.pack200.Archive$PackingFile
            byte[] r2 = r2.toByteArray()
            r3 = 0
            java.lang.String r5 = "META-INF/MANIFEST.MF"
            r1.<init>(r5, r2, r3)
            r0.add(r1)
        L23:
            java.util.jar.JarEntry r1 = r6.getNextJarEntry()
            if (r1 == 0) goto L3b
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r6)
            byte[] r2 = readJarEntry(r1, r2)
            org.apache.commons.compress.harmony.pack200.Archive$PackingFile r3 = new org.apache.commons.compress.harmony.pack200.Archive$PackingFile
            r3.<init>(r2, r1)
            r0.add(r3)
            goto L23
        L3b:
            if (r7 != 0) goto L40
            reorderPackingFiles(r0)
        L40:
            return r0
    }

    static /* synthetic */ int lambda$reorderPackingFiles$0(org.apache.commons.compress.harmony.pack200.Archive.PackingFile r2, org.apache.commons.compress.harmony.pack200.Archive.PackingFile r3) {
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = r3.getName()
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L10
            r2 = 0
            return r2
        L10:
            java.lang.String r0 = "META-INF/MANIFEST.MF"
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L1a
            r2 = -1
            return r2
        L1a:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L22
            r2 = 1
            return r2
        L22:
            int r2 = r2.compareTo(r3)
            return r2
    }

    public static void log(java.lang.String r2) {
            org.apache.commons.compress.harmony.pack200.PackingUtils$PackingLogger r0 = org.apache.commons.compress.harmony.pack200.PackingUtils.packingLogger
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            r0.log(r1, r2)
            return
    }

    private static byte[] readJarEntry(java.util.jar.JarEntry r4, java.io.InputStream r5) throws java.io.IOException {
            long r0 = r4.getSize()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L27
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L12
            r0 = r2
        L12:
            int r4 = (int) r0
            byte[] r4 = new byte[r4]
            int r5 = r5.read(r4)
            long r2 = (long) r5
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L1f
            return r4
        L1f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Error reading from stream"
            r4.<init>(r5)
            throw r4
        L27:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Large Class!"
            r4.<init>(r5)
            throw r4
    }

    private static void reorderPackingFiles(java.util.List<org.apache.commons.compress.harmony.pack200.Archive.PackingFile> r2) {
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.Archive$PackingFile r1 = (org.apache.commons.compress.harmony.pack200.Archive.PackingFile) r1
            boolean r1 = r1.isDirectory()
            if (r1 == 0) goto L4
            r0.remove()
            goto L4
        L1a:
            org.apache.commons.compress.harmony.pack200.PackingUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.harmony.pack200.PackingUtils$$ExternalSyntheticLambda0
            r0.<init>()
            r2.sort(r0)
            return
    }
}
