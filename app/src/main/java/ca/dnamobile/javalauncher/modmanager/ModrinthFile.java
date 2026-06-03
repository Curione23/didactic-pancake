package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModrinthFile {
    public final java.lang.String filename;
    public final boolean primary;
    public final java.lang.String sha1;
    public final long size;
    public final java.lang.String url;

    public ModrinthFile(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.url = r1
            r0.filename = r2
            if (r3 == 0) goto L19
            java.lang.String r1 = r3.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L14
            goto L19
        L14:
            java.lang.String r1 = r3.trim()
            goto L1a
        L19:
            r1 = 0
        L1a:
            r0.sha1 = r1
            r0.primary = r4
            r0.size = r5
            return
    }
}
