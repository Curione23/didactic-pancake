package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BrowserActionItem {
    private final android.app.PendingIntent mAction;
    private int mIconId;
    private android.net.Uri mIconUri;
    private java.lang.Runnable mRunnableAction;
    private final java.lang.String mTitle;

    public BrowserActionItem(java.lang.String r2, android.app.PendingIntent r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public BrowserActionItem(java.lang.String r1, android.app.PendingIntent r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mTitle = r1
            r0.mAction = r2
            r0.mIconId = r3
            return
    }

    public BrowserActionItem(java.lang.String r1, android.app.PendingIntent r2, android.net.Uri r3) {
            r0 = this;
            r0.<init>()
            r0.mTitle = r1
            r0.mAction = r2
            r0.mIconUri = r3
            return
    }

    BrowserActionItem(java.lang.String r1, java.lang.Runnable r2) {
            r0 = this;
            r0.<init>()
            r0.mTitle = r1
            r1 = 0
            r0.mAction = r1
            r0.mRunnableAction = r2
            return
    }

    public android.app.PendingIntent getAction() {
            r2 = this;
            android.app.PendingIntent r0 = r2.mAction
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't call getAction on BrowserActionItem with null action."
            r0.<init>(r1)
            throw r0
    }

    public int getIconId() {
            r1 = this;
            int r0 = r1.mIconId
            return r0
    }

    public android.net.Uri getIconUri() {
            r1 = this;
            android.net.Uri r0 = r1.mIconUri
            return r0
    }

    java.lang.Runnable getRunnableAction() {
            r1 = this;
            java.lang.Runnable r0 = r1.mRunnableAction
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.mTitle
            return r0
    }
}
