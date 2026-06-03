package ca.dnamobile.javalauncher.settings;

/* JADX INFO: loaded from: classes.dex */
final class ResolutionScalePreferenceStore {
    private static final java.lang.String FILE_NAME = "game_resolution_scale_percent.txt";

    private ResolutionScalePreferenceStore() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.io.File file(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r2.getApplicationContext()
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r1 = "game_resolution_scale_percent.txt"
            r0.<init>(r2, r1)
            return r0
    }

    static int read(android.content.Context r4, int r5) {
            java.io.File r4 = file(r4)
            boolean r0 = r4.isFile()
            if (r0 != 0) goto Lb
            return r5
        Lb:
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4d
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r4.<init>()     // Catch: java.lang.Throwable -> L43
            r1 = 32
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L43
        L20:
            int r2 = r0.read(r1)     // Catch: java.lang.Throwable -> L43
            r3 = -1
            if (r2 == r3) goto L33
            r3 = 0
            r4.append(r1, r3, r2)     // Catch: java.lang.Throwable -> L43
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L43
            r3 = 16
            if (r2 <= r3) goto L20
        L33:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L43
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L43
            r0.close()     // Catch: java.lang.Throwable -> L4d
            return r4
        L43:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L4d
        L4c:
            throw r4     // Catch: java.lang.Throwable -> L4d
        L4d:
            return r5
    }

    static void write(android.content.Context r4, int r5) {
            java.io.File r4 = file(r4)
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto L13
            boolean r1 = r0.exists()
            if (r1 != 0) goto L13
            r0.mkdirs()
        L13:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.getParentFile()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".tmp"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lac
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lac
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> La2
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> La2
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L98
            r2.write(r3)     // Catch: java.lang.Throwable -> L98
            r2.flush()     // Catch: java.lang.Throwable -> L98
            java.io.FileDescriptor r3 = r1.getFD()     // Catch: java.lang.Throwable -> L50
            r3.sync()     // Catch: java.lang.Throwable -> L50
        L50:
            r2.close()     // Catch: java.lang.Throwable -> La2
            r1.close()     // Catch: java.lang.Throwable -> Lac
            boolean r1 = r0.renameTo(r4)
            if (r1 != 0) goto L97
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L94
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L94
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L8a
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L8a
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L80
            r4.write(r5)     // Catch: java.lang.Throwable -> L80
            r4.flush()     // Catch: java.lang.Throwable -> L80
            java.io.FileDescriptor r5 = r1.getFD()     // Catch: java.lang.Throwable -> L79
            r5.sync()     // Catch: java.lang.Throwable -> L79
        L79:
            r4.close()     // Catch: java.lang.Throwable -> L8a
            r1.close()     // Catch: java.lang.Throwable -> L94
            goto L94
        L80:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L85
            goto L89
        L85:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L8a
        L89:
            throw r5     // Catch: java.lang.Throwable -> L8a
        L8a:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L8f
            goto L93
        L8f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.Throwable -> L94
        L93:
            throw r4     // Catch: java.lang.Throwable -> L94
        L94:
            r0.delete()
        L97:
            return
        L98:
            r4 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L9d
            goto La1
        L9d:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.Throwable -> La2
        La1:
            throw r4     // Catch: java.lang.Throwable -> La2
        La2:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> La7
            goto Lab
        La7:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.Throwable -> Lac
        Lab:
            throw r4     // Catch: java.lang.Throwable -> Lac
        Lac:
            return
    }
}
