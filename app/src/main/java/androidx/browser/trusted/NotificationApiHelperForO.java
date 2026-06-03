package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
class NotificationApiHelperForO {
    private NotificationApiHelperForO() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.app.Notification copyNotificationOntoChannel(android.content.Context r2, android.app.NotificationManager r3, android.app.Notification r4, java.lang.String r5, java.lang.String r6) {
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            r1 = 3
            r0.<init>(r5, r6, r1)
            r3.createNotificationChannel(r0)
            android.app.NotificationChannel r3 = r3.getNotificationChannel(r5)
            int r3 = r3.getImportance()
            if (r3 != 0) goto L15
            r2 = 0
            return r2
        L15:
            android.app.Notification$Builder r2 = android.app.Notification.Builder.recoverBuilder(r2, r4)
            r2.setChannelId(r5)
            android.app.Notification r2 = r2.build()
            return r2
    }

    static boolean isChannelEnabled(android.app.NotificationManager r0, java.lang.String r1) {
            android.app.NotificationChannel r0 = r0.getNotificationChannel(r1)
            if (r0 == 0) goto Lf
            int r0 = r0.getImportance()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }
}
