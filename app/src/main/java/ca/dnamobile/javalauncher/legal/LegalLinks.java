package ca.dnamobile.javalauncher.legal;

/* JADX INFO: loaded from: classes.dex */
public final class LegalLinks {
    public static final java.lang.String DROIDBRIDGE_LICENSING = "https://www.dnamobilegaming.com/license";
    public static final java.lang.String DROIDBRIDGE_PRIVACY_POLICY_URL = "https://dnamobilegaming.com/privacy";
    public static final java.lang.String DROIDBRIDGE_TERMS_URL = "https://www.dnamobilegaming.com/terms";
    public static final java.lang.String MINECRAFT_EULA_URL = "https://www.minecraft.net/en-us/eula";

    private LegalLinks() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean open(android.content.Context r5, java.lang.String r6) {
            r0 = 0
            if (r6 == 0) goto L38
            java.lang.String r1 = r6.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Le
            goto L38
        Le:
            r1 = 1
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L27 android.content.ActivityNotFoundException -> L31
            java.lang.String r3 = "android.intent.action.VIEW"
            java.lang.String r4 = r6.trim()     // Catch: java.lang.Throwable -> L27 android.content.ActivityNotFoundException -> L31
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L27 android.content.ActivityNotFoundException -> L31
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L27 android.content.ActivityNotFoundException -> L31
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)     // Catch: java.lang.Throwable -> L27 android.content.ActivityNotFoundException -> L31
            r5.startActivity(r2)     // Catch: java.lang.Throwable -> L27 android.content.ActivityNotFoundException -> L31
            return r1
        L27:
            java.lang.String r6 = "Unable to open link."
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r1)
            r5.show()
            return r0
        L31:
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r1)
            r5.show()
        L38:
            return r0
    }
}
