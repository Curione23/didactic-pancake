package ca.dnamobile.javalauncher.utils;

/* JADX INFO: loaded from: classes.dex */
public final class CopyDefaultFromAssets {
    private CopyDefaultFromAssets() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean checkDirectoryEmpty(java.lang.String r2) {
            r0 = 1
            if (r2 != 0) goto L4
            return r0
        L4:
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            java.io.File[] r2 = r1.listFiles()
            if (r2 == 0) goto L14
            int r2 = r2.length
            if (r2 != 0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    public static void copyFromAssets(android.content.Context r3) throws java.io.IOException {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CTRLMAP_PATH
            boolean r0 = checkDirectoryEmpty(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CTRLMAP_PATH
            r1 = 0
            java.lang.String r2 = "default.json"
            net.kdt.pojavlaunch.Tools.copyAssetFile(r3, r2, r0, r1)
        L13:
            return
    }
}
