package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public class NotificationApiHelperForM {
    private NotificationApiHelperForM() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.os.Parcelable[] getActiveNotifications(android.app.NotificationManager r0) {
            android.service.notification.StatusBarNotification[] r0 = r0.getActiveNotifications()
            return r0
    }
}
