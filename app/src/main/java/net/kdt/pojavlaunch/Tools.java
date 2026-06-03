package net.kdt.pojavlaunch;

/* JADX INFO: loaded from: classes2.dex */
public final class Tools {
    public static final int DEVICE_ARCHITECTURE = 0;

    public static final class SDL {
        private SDL() {
                r0 = this;
                r0.<init>()
                return
        }

        public static native void initializeControllerSubsystems();
    }

    static {
            int r0 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            net.kdt.pojavlaunch.Tools.DEVICE_ARCHITECTURE = r0
            return
    }

    private Tools() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkStorageRoot() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L17
            java.lang.String r1 = "mounted_ro"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    public static void copy(java.io.InputStream r3, java.io.OutputStream r4) throws java.io.IOException {
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r3.read(r0)
            r2 = -1
            if (r1 == r2) goto L10
            r2 = 0
            r4.write(r0, r2, r1)
            goto L4
        L10:
            return
    }

    public static void copyAssetFile(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L2b
            boolean r3 = r0.mkdirs()
            if (r3 == 0) goto L12
            goto L2b
        L12:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to create directory: "
            r2.<init>(r3)
            java.lang.String r3 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L2b:
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r4)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L39
            if (r5 != 0) goto L39
            return
        L39:
            android.content.res.AssetManager r1 = r1.getAssets()
            java.io.InputStream r1 = r1.open(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5c
            copy(r1, r2)     // Catch: java.lang.Throwable -> L52
            r2.close()     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L51
            r1.close()
        L51:
            return
        L52:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L5c
        L5b:
            throw r3     // Catch: java.lang.Throwable -> L5c
        L5c:
            r2 = move-exception
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r1 = move-exception
            r2.addSuppressed(r1)
        L67:
            throw r2
    }

    public static void copyAssetFile(android.content.Context r1, java.lang.String r2, java.lang.String r3, boolean r4) throws java.io.IOException {
            r0 = 47
            int r0 = r2.lastIndexOf(r0)
            if (r0 < 0) goto Lf
            int r0 = r0 + 1
            java.lang.String r0 = r2.substring(r0)
            goto L10
        Lf:
            r0 = r2
        L10:
            copyAssetFile(r1, r2, r3, r0, r4)
            return
    }

    public static java.lang.String printToString(java.lang.Throwable r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.printStackTrace(r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String read(java.io.InputStream r2) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            copy(r2, r0)     // Catch: java.lang.Throwable -> L1f
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r1.name()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r0.toString(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L1f
            r0.close()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L1e
            r2.close()
        L1e:
            return r1
        L1f:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L29
        L28:
            throw r1     // Catch: java.lang.Throwable -> L29
        L29:
            r0 = move-exception
            if (r2 == 0) goto L34
            r2.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r2 = move-exception
            r0.addSuppressed(r2)
        L34:
            throw r0
    }
}
