package androidx.browser.trusted.sharing;

/* JADX INFO: loaded from: classes.dex */
public final class ShareData {
    public static final java.lang.String KEY_TEXT = "androidx.browser.trusted.sharing.KEY_TEXT";
    public static final java.lang.String KEY_TITLE = "androidx.browser.trusted.sharing.KEY_TITLE";
    public static final java.lang.String KEY_URIS = "androidx.browser.trusted.sharing.KEY_URIS";
    public final java.lang.String text;
    public final java.lang.String title;
    public final java.util.List<android.net.Uri> uris;

    public ShareData(java.lang.String r1, java.lang.String r2, java.util.List<android.net.Uri> r3) {
            r0 = this;
            r0.<init>()
            r0.title = r1
            r0.text = r2
            r0.uris = r3
            return
    }

    public static androidx.browser.trusted.sharing.ShareData fromBundle(android.os.Bundle r4) {
            androidx.browser.trusted.sharing.ShareData r0 = new androidx.browser.trusted.sharing.ShareData
            java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_TITLE"
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r2 = "androidx.browser.trusted.sharing.KEY_TEXT"
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "androidx.browser.trusted.sharing.KEY_URIS"
            java.util.ArrayList r4 = r4.getParcelableArrayList(r3)
            r0.<init>(r1, r2, r4)
            return r0
    }

    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_TITLE"
            java.lang.String r2 = r3.title
            r0.putString(r1, r2)
            java.lang.String r1 = "androidx.browser.trusted.sharing.KEY_TEXT"
            java.lang.String r2 = r3.text
            r0.putString(r1, r2)
            java.util.List<android.net.Uri> r1 = r3.uris
            if (r1 == 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<android.net.Uri> r2 = r3.uris
            r1.<init>(r2)
            java.lang.String r2 = "androidx.browser.trusted.sharing.KEY_URIS"
            r0.putParcelableArrayList(r2, r1)
        L23:
            return r0
    }
}
