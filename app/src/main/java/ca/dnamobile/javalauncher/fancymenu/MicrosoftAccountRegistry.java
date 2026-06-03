package ca.dnamobile.javalauncher.fancymenu;

/* JADX INFO: loaded from: classes.dex */
public final class MicrosoftAccountRegistry {
    private static final java.lang.String KEY_ACCOUNTS = "accounts_json";
    private static final java.lang.String PREFS = "droidbridge_microsoft_accounts";
    private static final java.lang.String TAG = "MicrosoftAccounts";

    private MicrosoftAccountRegistry() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String clean(java.lang.String r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            goto L9
        L5:
            java.lang.String r0 = r0.trim()
        L9:
            return r0
    }

    public static void clear(android.content.Context r1) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "accounts_json"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            r1.apply()
            return
    }

    public static boolean containsSame(java.util.ArrayList<ca.dnamobile.javalauncher.data.AccountStore.Account> r2, ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = getStableId(r3)
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r2.next()
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r1
            java.lang.String r1 = getStableId(r1)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lc
            r2 = 1
            return r2
        L24:
            return r0
    }

    public static int count(android.content.Context r0) {
            java.util.LinkedHashMap r0 = loadMap(r0)
            int r0 = r0.size()
            return r0
    }

    private static ca.dnamobile.javalauncher.data.AccountStore.Account fromJson(org.json.JSONObject r20) {
            r0 = r20
            java.lang.String r1 = "displayName"
            java.lang.String r2 = ""
            ca.dnamobile.javalauncher.data.AccountStore$Account r19 = new ca.dnamobile.javalauncher.data.AccountStore$Account     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = "microsoft"
            java.lang.String r3 = "accountId"
            java.lang.String r5 = r0.optString(r3, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "email"
            java.lang.String r6 = r0.optString(r3, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r0.optString(r1, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "idToken"
            java.lang.String r8 = r0.optString(r3, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "accessToken"
            java.lang.String r9 = r0.optString(r3, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "refreshToken"
            java.lang.String r10 = r0.optString(r3, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "minecraftAccessToken"
            java.lang.String r11 = r0.optString(r3, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "minecraftName"
            java.lang.String r12 = "Microsoft Player"
            java.lang.String r1 = r0.optString(r1, r12)     // Catch: java.lang.Throwable -> L62
            java.lang.String r12 = r0.optString(r3, r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = "minecraftUuid"
            java.lang.String r13 = r0.optString(r1, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = "xuid"
            java.lang.String r14 = r0.optString(r1, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = "skinUrl"
            java.lang.String r15 = r0.optString(r1, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = "skinVariant"
            java.lang.String r2 = "classic"
            java.lang.String r16 = r0.optString(r1, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r17 = ""
            java.lang.String r18 = "none"
            r3 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L62
            return r19
        L62:
            r0 = move-exception
            java.lang.String r1 = "MicrosoftAccounts"
            java.lang.String r2 = "Unable to deserialize Microsoft account"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            r0 = 0
            return r0
    }

    public static java.lang.String getStableId(ca.dnamobile.javalauncher.data.AccountStore.Account r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.lang.String r0 = r2.minecraftUuid
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "uuid:"
            r0.<init>(r1)
            java.lang.String r2 = r2.minecraftUuid
            java.lang.String r2 = clean(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
        L23:
            java.lang.String r0 = r2.xuid
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "xuid:"
            r0.<init>(r1)
            java.lang.String r2 = r2.xuid
            java.lang.String r2 = clean(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
        L41:
            java.lang.String r0 = r2.accountId
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L5f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "id:"
            r0.<init>(r1)
            java.lang.String r2 = r2.accountId
            java.lang.String r2 = clean(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
        L5f:
            java.lang.String r0 = r2.minecraftName
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L83
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "name:"
            r0.<init>(r1)
            java.lang.String r2 = r2.minecraftName
            java.lang.String r2 = clean(r2)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
        L83:
            java.lang.String r0 = r2.displayName
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto La7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "display:"
            r0.<init>(r1)
            java.lang.String r2 = r2.displayName
            java.lang.String r2 = clean(r2)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
        La7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unknown:"
            r0.<init>(r1)
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static boolean hasAny(android.content.Context r0) {
            int r0 = count(r0)
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
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

    public static boolean isSameAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            if (r0 == 0) goto L12
            if (r1 != 0) goto L5
            goto L12
        L5:
            java.lang.String r0 = getStableId(r0)
            java.lang.String r1 = getStableId(r1)
            boolean r0 = r0.equals(r1)
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static boolean isUsableMicrosoftAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            if (r1 == 0) goto L22
            boolean r0 = r1.isMicrosoftAccount()
            if (r0 == 0) goto L22
            java.lang.String r0 = r1.minecraftAccessToken
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = r1.minecraftName
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L22
            java.lang.String r1 = r1.minecraftUuid
            boolean r1 = isBlank(r1)
            if (r1 != 0) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            return r1
    }

    public static java.util.ArrayList<ca.dnamobile.javalauncher.data.AccountStore.Account> list(android.content.Context r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.LinkedHashMap r1 = loadMap(r1)
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
    }

    private static java.util.LinkedHashMap<java.lang.String, ca.dnamobile.javalauncher.data.AccountStore.Account> loadMap(android.content.Context r4) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            android.content.SharedPreferences r4 = prefs(r4)
            java.lang.String r1 = "accounts_json"
            java.lang.String r2 = ""
            java.lang.String r4 = r4.getString(r1, r2)
            boolean r1 = isBlank(r4)
            if (r1 == 0) goto L18
            return r0
        L18:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L40
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L40
            r4 = 0
        L1e:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L40
            if (r4 >= r2) goto L48
            org.json.JSONObject r2 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L2b
            goto L3d
        L2b:
            ca.dnamobile.javalauncher.data.AccountStore$Account r2 = fromJson(r2)     // Catch: java.lang.Throwable -> L40
            boolean r3 = isUsableMicrosoftAccount(r2)     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto L36
            goto L3d
        L36:
            java.lang.String r3 = getStableId(r2)     // Catch: java.lang.Throwable -> L40
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L40
        L3d:
            int r4 = r4 + 1
            goto L1e
        L40:
            r4 = move-exception
            java.lang.String r1 = "MicrosoftAccounts"
            java.lang.String r2 = "Unable to read saved Microsoft account registry"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r4)
        L48:
            return r0
    }

    private static android.content.SharedPreferences prefs(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "droidbridge_microsoft_accounts"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static void remove(android.content.Context r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.String r1 = getStableId(r1)
            remove(r0, r1)
            return
    }

    public static void remove(android.content.Context r1, java.lang.String r2) {
            boolean r0 = isBlank(r2)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.LinkedHashMap r0 = loadMap(r1)
            r0.remove(r2)
            writeMap(r1, r0)
            return
    }

    private static java.lang.String safe(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    public static void save(android.content.Context r2, ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            boolean r0 = isUsableMicrosoftAccount(r3)
            if (r0 != 0) goto L7
            return
        L7:
            java.util.LinkedHashMap r0 = loadMap(r2)
            java.lang.String r1 = getStableId(r3)
            r0.put(r1, r3)
            writeMap(r2, r0)
            return
    }

    private static org.json.JSONObject toJson(ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "accountType"
            java.lang.String r2 = r3.accountType     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = safe(r2)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "accountId"
            java.lang.String r2 = r3.accountId     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = safe(r2)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "displayName"
            java.lang.String r2 = r3.displayName     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = safe(r2)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "email"
            java.lang.String r2 = r3.email     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = safe(r2)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "accessToken"
            java.lang.String r2 = r3.accessToken     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = safe(r2)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "refreshToken"
            java.lang.String r2 = r3.refreshToken     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = safe(r2)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "minecraftAccessToken"
            java.lang.String r2 = r3.minecraftAccessToken     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = safe(r2)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "minecraftName"
            java.lang.String r2 = r3.minecraftName     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = safe(r2)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "minecraftUuid"
            java.lang.String r2 = r3.minecraftUuid     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = safe(r2)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "xuid"
            java.lang.String r2 = r3.xuid     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = safe(r2)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "skinUrl"
            java.lang.String r2 = r3.skinUrl     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = safe(r2)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "skinVariant"
            java.lang.String r3 = r3.skinVariant     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = safe(r3)     // Catch: java.lang.Throwable -> L8a
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L8a
            goto L92
        L8a:
            r3 = move-exception
            java.lang.String r1 = "MicrosoftAccounts"
            java.lang.String r2 = "Unable to serialize Microsoft account"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r3)
        L92:
            return r0
    }

    private static void writeMap(android.content.Context r3, java.util.LinkedHashMap<java.lang.String, ca.dnamobile.javalauncher.data.AccountStore.Account> r4) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.next()
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r1
            boolean r2 = isUsableMicrosoftAccount(r1)
            if (r2 != 0) goto L20
            goto Ld
        L20:
            org.json.JSONObject r1 = toJson(r1)
            r0.put(r1)
            goto Ld
        L28:
            android.content.SharedPreferences r3 = prefs(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r4 = "accounts_json"
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r3 = r3.putString(r4, r0)
            r3.apply()
            return
    }
}
