package ca.dnamobile.javalauncher.fancymenu;

/* JADX INFO: loaded from: classes.dex */
final class MicrosoftAuthSessionStore {
    private static final java.lang.String KEY_AUTH_URL = "auth_url";
    private static final java.lang.String KEY_CODE_VERIFIER = "code_verifier";
    private static final java.lang.String KEY_STARTED_AT = "started_at";
    private static final long MAX_SESSION_AGE_MS = 1800000;
    private static final java.lang.String PREFS = "microsoft_auth_pending_session";

    static final class Pending {
        final java.lang.String authUrl;
        final java.lang.String codeVerifier;
        final long startedAt;

        Pending(java.lang.String r1, java.lang.String r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.codeVerifier = r1
                r0.authUrl = r2
                r0.startedAt = r3
                return
        }
    }

    private MicrosoftAuthSessionStore() {
            r0 = this;
            r0.<init>()
            return
    }

    static void clear(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "microsoft_auth_pending_session"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.clear()
            r2.apply()
            return
    }

    private static boolean isBlank(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
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

    static ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.Pending load(android.content.Context r10) {
            android.content.Context r0 = r10.getApplicationContext()
            java.lang.String r1 = "microsoft_auth_pending_session"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "code_verifier"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.getString(r1, r2)
            java.lang.String r3 = "auth_url"
            java.lang.String r2 = r0.getString(r3, r2)
            java.lang.String r3 = "started_at"
            r4 = 0
            long r6 = r0.getLong(r3, r4)
            boolean r0 = isBlank(r1)
            r3 = 0
            if (r0 != 0) goto L4d
            boolean r0 = isBlank(r2)
            if (r0 != 0) goto L4d
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L33
            goto L4d
        L33:
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r6
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L4a
            r4 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L44
            goto L4a
        L44:
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore$Pending r10 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore$Pending
            r10.<init>(r1, r2, r6)
            return r10
        L4a:
            clear(r10)
        L4d:
            return r3
    }

    static void save(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "microsoft_auth_pending_session"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "code_verifier"
            android.content.SharedPreferences$Editor r2 = r2.putString(r0, r3)
            java.lang.String r3 = "auth_url"
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r4)
            java.lang.String r3 = "started_at"
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r2.putLong(r3, r0)
            r2.apply()
            return
    }
}
