package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkImageLoader {
    private NetworkImageLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void lambda$load$0(android.widget.ImageView r2, java.lang.String r3, android.graphics.Bitmap r4, int r5) {
            java.lang.Object r0 = r2.getTag()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L17
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L17
            if (r4 == 0) goto L14
            r2.setImageBitmap(r4)
            goto L17
        L14:
            r2.setImageResource(r5)
        L17:
            return
    }

    static /* synthetic */ void lambda$load$1(java.lang.String r4, android.widget.ImageView r5, int r6) {
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L3f
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> L3f
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L3f
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L3f
            r2 = 15000(0x3a98, float:2.102E-41)
            r1.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = "JavaLauncher/1.0 (Android Minecraft Launcher)"
            r1.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L3f
            java.io.InputStream r2 = r1.getInputStream()     // Catch: java.lang.Throwable -> L3a
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L2a
            r2.close()     // Catch: java.lang.Throwable -> L3a
        L2a:
            r1.disconnect()     // Catch: java.lang.Throwable -> L3f
            goto L3f
        L2e:
            r3 = move-exception
            if (r2 == 0) goto L39
            r2.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L3a
        L39:
            throw r3     // Catch: java.lang.Throwable -> L3a
        L3a:
            r2 = move-exception
            r1.disconnect()     // Catch: java.lang.Throwable -> L3f
            throw r2     // Catch: java.lang.Throwable -> L3f
        L3f:
            ca.dnamobile.javalauncher.modmanager.NetworkImageLoader$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.modmanager.NetworkImageLoader$$ExternalSyntheticLambda1
            r1.<init>(r5, r4, r0, r6)
            r5.post(r1)
            return
    }

    public static void load(android.widget.ImageView r2, java.lang.String r3, int r4) {
            if (r3 != 0) goto L5
            java.lang.String r0 = ""
            goto L6
        L5:
            r0 = r3
        L6:
            r2.setTag(r0)
            r2.setImageResource(r4)
            if (r3 == 0) goto L2c
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            goto L2c
        L19:
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.modmanager.NetworkImageLoader$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.modmanager.NetworkImageLoader$$ExternalSyntheticLambda0
            r1.<init>(r3, r2, r4)
            java.lang.String r2 = "ModrinthIconLoader"
            r0.<init>(r1, r2)
            r2 = 1
            r0.setDaemon(r2)
            r0.start()
        L2c:
            return
    }
}
