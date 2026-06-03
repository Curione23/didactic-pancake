package ca.dnamobile.javalauncher.update;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherUpdateInfo {
    public final java.lang.String apkAssetName;
    public final java.lang.String apkDownloadUrl;
    public final long apkSizeBytes;
    public final boolean prerelease;
    public final java.lang.String releaseName;
    public final java.lang.String releaseNotes;
    public final java.lang.String releaseUrl;
    public final java.lang.String tagName;
    public final boolean updateAvailable;

    public LauncherUpdateInfo(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, long r7, boolean r9, boolean r10) {
            r0 = this;
            r0.<init>()
            r0.tagName = r1
            r0.releaseName = r2
            r0.releaseUrl = r3
            r0.releaseNotes = r4
            r0.apkDownloadUrl = r5
            r0.apkAssetName = r6
            r0.apkSizeBytes = r7
            r0.prerelease = r9
            r0.updateAvailable = r10
            return
    }

    public java.lang.String getDisplaySize() {
            r4 = this;
            long r0 = r4.apkSizeBytes
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto Lb
            java.lang.String r0 = "Unknown size"
            return r0
        Lb:
            double r0 = (double) r0
            r2 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r0 = r0 / r2
            double r0 = r0 / r2
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "%.1f MB"
            java.lang.String r0 = java.lang.String.format(r2, r1, r0)
            return r0
    }

    public java.lang.String getDisplayVersion() {
            r1 = this;
            java.lang.String r0 = r1.releaseName
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            java.lang.String r0 = r1.releaseName
            java.lang.String r0 = r0.trim()
            return r0
        L13:
            java.lang.String r0 = r1.tagName
            java.lang.String r0 = r0.trim()
            return r0
    }

    public boolean hasApkAsset() {
            r1 = this;
            java.lang.String r0 = r1.apkDownloadUrl
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }
}
