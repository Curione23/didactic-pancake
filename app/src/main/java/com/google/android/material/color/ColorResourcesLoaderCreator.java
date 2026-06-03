package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
final class ColorResourcesLoaderCreator {
    private static final java.lang.String TAG = "ColorResLoaderCreator";

    private ColorResourcesLoaderCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.content.res.loader.ResourcesLoader create(android.content.Context r5, java.util.Map<java.lang.Integer, java.lang.Integer> r6) {
            java.lang.String r0 = "ColorResLoaderCreator"
            java.lang.String r1 = "Table created, length: "
            r2 = 0
            byte[] r5 = com.google.android.material.color.ColorResourcesTableCreator.create(r5, r6)     // Catch: java.lang.Exception -> L78
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L78
            r6.<init>(r1)     // Catch: java.lang.Exception -> L78
            int r1 = r5.length     // Catch: java.lang.Exception -> L78
            java.lang.StringBuilder r6 = r6.append(r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L78
            android.util.Log.i(r0, r6)     // Catch: java.lang.Exception -> L78
            int r6 = r5.length     // Catch: java.lang.Exception -> L78
            if (r6 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r6 = "temp.arsc"
            r1 = 0
            java.io.FileDescriptor r6 = android.system.Os.memfd_create(r6, r1)     // Catch: java.lang.Throwable -> L70
            if (r6 != 0) goto L32
            java.lang.String r5 = "Cannot create memory file descriptor."
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L31
            android.system.Os.close(r6)     // Catch: java.lang.Exception -> L78
        L31:
            return r2
        L32:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L6e
            r1.write(r5)     // Catch: java.lang.Throwable -> L64
            android.os.ParcelFileDescriptor r5 = android.os.ParcelFileDescriptor.dup(r6)     // Catch: java.lang.Throwable -> L64
            android.content.res.loader.ResourcesLoader r3 = new android.content.res.loader.ResourcesLoader     // Catch: java.lang.Throwable -> L58
            r3.<init>()     // Catch: java.lang.Throwable -> L58
            android.content.res.loader.ResourcesProvider r4 = android.content.res.loader.ResourcesProvider.loadFromTable(r5, r2)     // Catch: java.lang.Throwable -> L58
            r3.addProvider(r4)     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L4f
            r5.close()     // Catch: java.lang.Throwable -> L64
        L4f:
            r1.close()     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L57
            android.system.Os.close(r6)     // Catch: java.lang.Exception -> L78
        L57:
            return r3
        L58:
            r3 = move-exception
            if (r5 == 0) goto L63
            r5.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r5 = move-exception
            r3.addSuppressed(r5)     // Catch: java.lang.Throwable -> L64
        L63:
            throw r3     // Catch: java.lang.Throwable -> L64
        L64:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L69
            goto L6d
        L69:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch: java.lang.Throwable -> L6e
        L6d:
            throw r5     // Catch: java.lang.Throwable -> L6e
        L6e:
            r5 = move-exception
            goto L72
        L70:
            r5 = move-exception
            r6 = r2
        L72:
            if (r6 == 0) goto L77
            android.system.Os.close(r6)     // Catch: java.lang.Exception -> L78
        L77:
            throw r5     // Catch: java.lang.Exception -> L78
        L78:
            r5 = move-exception
            java.lang.String r6 = "Failed to create the ColorResourcesTableCreator."
            android.util.Log.e(r0, r6, r5)
            return r2
    }
}
