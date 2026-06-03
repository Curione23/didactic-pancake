package ca.dnamobile.javalauncher.legal;

/* JADX INFO: loaded from: classes.dex */
public final class LegalConsentStore {
    private static final int CURRENT_TERMS_VERSION = 1;
    private static final java.lang.String KEY_ACCEPTED_AT = "accepted_terms_at";
    private static final java.lang.String KEY_TERMS_VERSION = "accepted_terms_version";
    private static final java.lang.String PREFS_NAME = "droidbridge_legal_consent";

    private LegalConsentStore() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean hasAcceptedCurrentTerms(android.content.Context r2) {
            java.lang.String r0 = "droidbridge_legal_consent"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            java.lang.String r0 = "accepted_terms_version"
            int r2 = r2.getInt(r0, r1)
            r0 = 1
            if (r2 < r0) goto L11
            r1 = r0
        L11:
            return r1
    }

    public static void markCurrentTermsAccepted(android.content.Context r3) {
            java.lang.String r0 = "droidbridge_legal_consent"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r0 = "accepted_terms_version"
            r1 = 1
            android.content.SharedPreferences$Editor r3 = r3.putInt(r0, r1)
            java.lang.String r0 = "accepted_terms_at"
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r3 = r3.putLong(r0, r1)
            r3.apply()
            return
    }
}
