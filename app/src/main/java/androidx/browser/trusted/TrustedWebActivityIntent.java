package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public final class TrustedWebActivityIntent {
    private final android.content.Intent mIntent;
    private final java.util.List<android.net.Uri> mSharedFileUris;

    TrustedWebActivityIntent(android.content.Intent r1, java.util.List<android.net.Uri> r2) {
            r0 = this;
            r0.<init>()
            r0.mIntent = r1
            r0.mSharedFileUris = r2
            return
    }

    private void grantUriPermissionToProvider(android.content.Context r5) {
            r4 = this;
            java.util.List<android.net.Uri> r0 = r4.mSharedFileUris
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            android.net.Uri r1 = (android.net.Uri) r1
            android.content.Intent r2 = r4.mIntent
            java.lang.String r2 = r2.getPackage()
            r3 = 1
            r5.grantUriPermission(r2, r1, r3)
            goto L6
        L1d:
            return
    }

    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.mIntent
            return r0
    }

    public void launchTrustedWebActivity(android.content.Context r3) {
            r2 = this;
            r2.grantUriPermissionToProvider(r3)
            android.content.Intent r0 = r2.mIntent
            r1 = 0
            androidx.core.content.ContextCompat.startActivity(r3, r0, r1)
            return
    }
}
