package ca.dnamobile.javalauncher.data;

/* JADX INFO: loaded from: classes.dex */
public final class AccountStore {
    private static final java.lang.String KEY_ACCOUNT_JSON = "active_account_json";
    private static final java.lang.String KEY_LAST_MICROSOFT_ACCOUNT_JSON = "last_microsoft_account_json";
    private static final java.lang.String KEY_MICROSOFT_LOGIN_COMPLETED_ONCE = "microsoft_login_completed_once";
    private static final java.lang.String KEY_OFFLINE_ACCOUNTS_JSON = "offline_accounts_json";
    private static final java.lang.String OFFLINE_DIR = "offline_accounts";
    private static final java.lang.String PREFS = "java_launcher_accounts";
    private final android.content.Context context;
    private final android.content.SharedPreferences preferences;

    public static final class Account {
        public static final java.lang.String TYPE_MICROSOFT = "microsoft";
        public static final java.lang.String TYPE_OFFLINE = "offline";
        public final java.lang.String accessToken;
        public final java.lang.String accountId;
        public final java.lang.String accountType;
        public final java.lang.String displayName;
        public final java.lang.String email;
        public final java.lang.String idToken;
        public final java.lang.String minecraftAccessToken;
        public final java.lang.String minecraftName;
        public final java.lang.String minecraftUuid;
        public final java.lang.String offlineSkinModel;
        public final java.lang.String offlineSkinPath;
        public final java.lang.String refreshToken;
        public final java.lang.String skinUrl;
        public final java.lang.String skinVariant;
        public final java.lang.String xuid;

        public Account(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
                r16 = this;
                java.lang.String r14 = ""
                java.lang.String r15 = "none"
                java.lang.String r1 = "microsoft"
                java.lang.String r2 = ""
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                java.lang.String r9 = ""
                java.lang.String r10 = ""
                java.lang.String r11 = ""
                java.lang.String r12 = ""
                java.lang.String r13 = "classic"
                r0 = r16
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
        }

        public Account(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
                r16 = this;
                java.lang.String r14 = ""
                java.lang.String r15 = "none"
                java.lang.String r1 = "microsoft"
                java.lang.String r2 = ""
                java.lang.String r12 = ""
                java.lang.String r13 = "classic"
                r0 = r16
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r7 = r21
                r8 = r22
                r9 = r23
                r10 = r24
                r11 = r25
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
        }

        public Account(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
                r16 = this;
                java.lang.String r14 = ""
                java.lang.String r15 = "none"
                java.lang.String r1 = "microsoft"
                java.lang.String r2 = ""
                r0 = r16
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r7 = r21
                r8 = r22
                r9 = r23
                r10 = r24
                r11 = r25
                r12 = r26
                r13 = r27
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
        }

        public Account(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
                r0 = this;
                r0.<init>()
                r0.accountType = r1
                r0.accountId = r2
                r0.email = r3
                r0.displayName = r4
                r0.idToken = r5
                r0.accessToken = r6
                r0.refreshToken = r7
                r0.minecraftAccessToken = r8
                r0.minecraftName = r9
                r0.minecraftUuid = r10
                r0.xuid = r11
                r0.skinUrl = r12
                r0.skinVariant = r13
                r0.offlineSkinPath = r14
                r0.offlineSkinModel = r15
                return
        }

        static ca.dnamobile.javalauncher.data.AccountStore.Account fromJson(org.json.JSONObject r23) {
                r0 = r23
                java.lang.String r1 = "accountType"
                java.lang.String r2 = ""
                java.lang.String r1 = r0.optString(r1, r2)
                int r3 = r1.length()
                java.lang.String r4 = "microsoft"
                java.lang.String r5 = "offline"
                java.lang.String r6 = "minecraftAccessToken"
                if (r3 != 0) goto L23
                java.lang.String r1 = r0.optString(r6, r2)
                boolean r1 = ca.dnamobile.javalauncher.data.AccountStore.m444$$Nest$smnotEmpty(r1)
                if (r1 == 0) goto L22
                r1 = r4
                goto L23
            L22:
                r1 = r5
            L23:
                r8 = r1
                java.lang.String r1 = "displayName"
                java.lang.String r1 = r0.optString(r1, r2)
                int r3 = r1.length()
                if (r3 != 0) goto L38
                boolean r3 = r4.equals(r8)
                if (r3 == 0) goto L38
                java.lang.String r1 = "Microsoft Player"
            L38:
                r11 = r1
                java.lang.String r1 = "accountId"
                java.lang.String r1 = r0.optString(r1, r2)
                boolean r3 = r5.equals(r8)
                if (r3 == 0) goto L53
                int r3 = r1.length()
                if (r3 != 0) goto L53
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
            L53:
                r9 = r1
                ca.dnamobile.javalauncher.data.AccountStore$Account r1 = new ca.dnamobile.javalauncher.data.AccountStore$Account
                java.lang.String r3 = "email"
                java.lang.String r10 = r0.optString(r3, r2)
                java.lang.String r3 = "idToken"
                java.lang.String r12 = r0.optString(r3, r2)
                java.lang.String r3 = "accessToken"
                java.lang.String r13 = r0.optString(r3, r2)
                java.lang.String r3 = "refreshToken"
                java.lang.String r14 = r0.optString(r3, r2)
                java.lang.String r15 = r0.optString(r6, r2)
                java.lang.String r3 = "minecraftName"
                java.lang.String r16 = r0.optString(r3, r11)
                java.lang.String r3 = "minecraftUuid"
                java.lang.String r17 = r0.optString(r3, r2)
                java.lang.String r3 = "xuid"
                java.lang.String r18 = r0.optString(r3, r2)
                java.lang.String r3 = "skinUrl"
                java.lang.String r19 = r0.optString(r3, r2)
                java.lang.String r3 = "skinVariant"
                java.lang.String r4 = "classic"
                java.lang.String r20 = r0.optString(r3, r4)
                java.lang.String r3 = "offlineSkinPath"
                java.lang.String r21 = r0.optString(r3, r2)
                java.lang.String r2 = "offlineSkinModel"
                java.lang.String r3 = "none"
                java.lang.String r22 = r0.optString(r2, r3)
                r7 = r1
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return r1
        }

        public static ca.dnamobile.javalauncher.data.AccountStore.Account offline(java.lang.String r4) {
                java.lang.String r4 = sanitizePlayerName(r4)
                java.util.UUID r0 = java.util.UUID.randomUUID()
                java.lang.String r0 = r0.toString()
                ca.dnamobile.javalauncher.skin.SkinModelType r1 = ca.dnamobile.javalauncher.skin.SkinModelType.NONE
                java.lang.String r1 = ca.dnamobile.javalauncher.skin.CustomSkinStore.getOfflineUuidWithSkinModel(r4, r1)
                ca.dnamobile.javalauncher.skin.SkinModelType r2 = ca.dnamobile.javalauncher.skin.SkinModelType.NONE
                java.lang.String r2 = r2.id
                java.lang.String r3 = ""
                ca.dnamobile.javalauncher.data.AccountStore$Account r4 = offline(r0, r4, r1, r3, r2)
                return r4
        }

        public static ca.dnamobile.javalauncher.data.AccountStore.Account offline(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
                java.lang.String r9 = sanitizePlayerName(r18)
                ca.dnamobile.javalauncher.data.AccountStore$Account r16 = new ca.dnamobile.javalauncher.data.AccountStore$Account
                java.lang.String r12 = ""
                java.lang.String r13 = "classic"
                java.lang.String r1 = "offline"
                java.lang.String r3 = ""
                java.lang.String r5 = ""
                java.lang.String r6 = "0"
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                java.lang.String r11 = ""
                r0 = r16
                r2 = r17
                r4 = r9
                r10 = r19
                r14 = r20
                r15 = r21
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r16
        }

        public static java.lang.String sanitizePlayerName(java.lang.String r2) {
                java.lang.String r2 = r2.trim()
                java.lang.String r0 = "[^A-Za-z0-9_]"
                java.lang.String r1 = ""
                java.lang.String r2 = r2.replaceAll(r0, r1)
                int r0 = r2.length()
                r1 = 3
                if (r0 >= r1) goto L16
                java.lang.String r2 = "Player"
                return r2
            L16:
                int r0 = r2.length()
                r1 = 16
                if (r0 <= r1) goto L23
                r0 = 0
                java.lang.String r2 = r2.substring(r0, r1)
            L23:
                return r2
        }

        ca.dnamobile.javalauncher.data.AccountStore.Account asMicrosoftAccount() {
                r18 = this;
                r0 = r18
                java.lang.String r1 = "microsoft"
                java.lang.String r2 = r0.accountType
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto Ld
                return r0
            Ld:
                ca.dnamobile.javalauncher.data.AccountStore$Account r1 = new ca.dnamobile.javalauncher.data.AccountStore$Account
                java.lang.String r4 = r0.accountId
                java.lang.String r5 = r0.email
                java.lang.String r6 = r0.displayName
                java.lang.String r7 = r0.idToken
                java.lang.String r8 = r0.accessToken
                java.lang.String r9 = r0.refreshToken
                java.lang.String r10 = r0.minecraftAccessToken
                java.lang.String r11 = r0.minecraftName
                java.lang.String r12 = r0.minecraftUuid
                java.lang.String r13 = r0.xuid
                java.lang.String r14 = r0.skinUrl
                java.lang.String r15 = r0.skinVariant
                java.lang.String r16 = ""
                java.lang.String r17 = "none"
                java.lang.String r3 = "microsoft"
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return r1
        }

        ca.dnamobile.javalauncher.data.AccountStore.Account asOfflineAccount() {
                r5 = this;
                java.lang.String r0 = "offline"
                java.lang.String r1 = r5.accountType
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Lb
                return r5
            Lb:
                java.lang.String r0 = r5.accountId
                int r0 = r0.length()
                if (r0 <= 0) goto L16
                java.lang.String r0 = r5.accountId
                goto L1e
            L16:
                java.util.UUID r0 = java.util.UUID.randomUUID()
                java.lang.String r0 = r0.toString()
            L1e:
                java.lang.String r1 = r5.getBestDisplayName()
                java.lang.String r2 = r5.getBestDisplayName()
                java.lang.String r3 = r5.offlineSkinModel
                ca.dnamobile.javalauncher.skin.SkinModelType r3 = ca.dnamobile.javalauncher.skin.SkinModelType.fromId(r3)
                java.lang.String r2 = ca.dnamobile.javalauncher.skin.CustomSkinStore.getOfflineUuidWithSkinModel(r2, r3)
                java.lang.String r3 = r5.offlineSkinPath
                java.lang.String r4 = r5.offlineSkinModel
                ca.dnamobile.javalauncher.data.AccountStore$Account r0 = offline(r0, r1, r2, r3, r4)
                return r0
        }

        public java.lang.String getBestDisplayName() {
                r1 = this;
                java.lang.String r0 = r1.displayName
                boolean r0 = ca.dnamobile.javalauncher.data.AccountStore.m444$$Nest$smnotEmpty(r0)
                if (r0 == 0) goto Lb
                java.lang.String r0 = r1.displayName
                return r0
            Lb:
                java.lang.String r0 = r1.minecraftName
                boolean r0 = ca.dnamobile.javalauncher.data.AccountStore.m444$$Nest$smnotEmpty(r0)
                if (r0 == 0) goto L16
                java.lang.String r0 = r1.minecraftName
                return r0
            L16:
                java.lang.String r0 = r1.email
                boolean r0 = ca.dnamobile.javalauncher.data.AccountStore.m444$$Nest$smnotEmpty(r0)
                if (r0 == 0) goto L21
                java.lang.String r0 = r1.email
                return r0
            L21:
                boolean r0 = r1.isOfflineAccount()
                if (r0 == 0) goto L2a
                java.lang.String r0 = "Offline Player"
                goto L2c
            L2a:
                java.lang.String r0 = "Microsoft Player"
            L2c:
                return r0
        }

        public boolean hasMinecraftSession() {
                r1 = this;
                java.lang.String r0 = r1.minecraftAccessToken
                boolean r0 = ca.dnamobile.javalauncher.data.AccountStore.m444$$Nest$smnotEmpty(r0)
                if (r0 == 0) goto L1a
                java.lang.String r0 = r1.minecraftName
                boolean r0 = ca.dnamobile.javalauncher.data.AccountStore.m444$$Nest$smnotEmpty(r0)
                if (r0 == 0) goto L1a
                java.lang.String r0 = r1.minecraftUuid
                boolean r0 = ca.dnamobile.javalauncher.data.AccountStore.m444$$Nest$smnotEmpty(r0)
                if (r0 == 0) goto L1a
                r0 = 1
                goto L1b
            L1a:
                r0 = 0
            L1b:
                return r0
        }

        public boolean hasOfflineSkin() {
                r2 = this;
                java.lang.String r0 = r2.offlineSkinPath
                boolean r0 = ca.dnamobile.javalauncher.data.AccountStore.m444$$Nest$smnotEmpty(r0)
                if (r0 == 0) goto L17
                java.io.File r0 = new java.io.File
                java.lang.String r1 = r2.offlineSkinPath
                r0.<init>(r1)
                boolean r0 = r0.isFile()
                if (r0 == 0) goto L17
                r0 = 1
                goto L18
            L17:
                r0 = 0
            L18:
                return r0
        }

        public boolean isMicrosoftAccount() {
                r2 = this;
                java.lang.String r0 = "microsoft"
                java.lang.String r1 = r2.accountType
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L1d
                java.lang.String r0 = "offline"
                java.lang.String r1 = r2.accountType
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L1b
                boolean r0 = r2.hasMinecraftSession()
                if (r0 == 0) goto L1b
                goto L1d
            L1b:
                r0 = 0
                goto L1e
            L1d:
                r0 = 1
            L1e:
                return r0
        }

        public boolean isOfflineAccount() {
                r2 = this;
                java.lang.String r0 = "offline"
                java.lang.String r1 = r2.accountType
                boolean r0 = r0.equals(r1)
                return r0
        }

        org.json.JSONObject toJson() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "accountType"
                java.lang.String r2 = r3.accountType     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "accountId"
                java.lang.String r2 = r3.accountId     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "email"
                java.lang.String r2 = r3.email     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "displayName"
                java.lang.String r2 = r3.displayName     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "idToken"
                java.lang.String r2 = r3.idToken     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "accessToken"
                java.lang.String r2 = r3.accessToken     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "refreshToken"
                java.lang.String r2 = r3.refreshToken     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "minecraftAccessToken"
                java.lang.String r2 = r3.minecraftAccessToken     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "minecraftName"
                java.lang.String r2 = r3.minecraftName     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "minecraftUuid"
                java.lang.String r2 = r3.minecraftUuid     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "xuid"
                java.lang.String r2 = r3.xuid     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "skinUrl"
                java.lang.String r2 = r3.skinUrl     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "skinVariant"
                java.lang.String r2 = r3.skinVariant     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "offlineSkinPath"
                java.lang.String r2 = r3.offlineSkinPath     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "offlineSkinModel"
                java.lang.String r2 = r3.offlineSkinModel     // Catch: org.json.JSONException -> L6e
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L6e
            L6e:
                return r0
        }
    }

    /* JADX INFO: renamed from: -$$Nest$smnotEmpty, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m444$$Nest$smnotEmpty(java.lang.String r0) {
            boolean r0 = notEmpty(r0)
            return r0
    }

    public AccountStore(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            r2.context = r3
            java.lang.String r0 = "java_launcher_accounts"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.preferences = r3
            return
    }

    private static void copyFile(java.io.File r3, java.io.File r4) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L21
        Le:
            int r1 = r0.read(r4)     // Catch: java.lang.Throwable -> L21
            r2 = -1
            if (r1 == r2) goto L1a
            r2 = 0
            r3.write(r4, r2, r1)     // Catch: java.lang.Throwable -> L21
            goto Le
        L1a:
            r3.close()     // Catch: java.lang.Throwable -> L2b
            r0.close()
            return
        L21:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> L2b
        L2a:
            throw r4     // Catch: java.lang.Throwable -> L2b
        L2b:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r4 = move-exception
            r3.addSuppressed(r4)
        L34:
            throw r3
    }

    private void copyUriToFile(android.net.Uri r4, java.io.File r5) throws java.io.IOException {
            r3 = this;
            android.content.Context r0 = r3.context
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.io.InputStream r4 = r0.openInputStream(r4)
            if (r4 == 0) goto L39
            ensureParent(r5)     // Catch: java.lang.Throwable -> L37
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L37
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L37
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L2d
        L18:
            int r1 = r4.read(r5)     // Catch: java.lang.Throwable -> L2d
            r2 = -1
            if (r1 == r2) goto L24
            r2 = 0
            r0.write(r5, r2, r1)     // Catch: java.lang.Throwable -> L2d
            goto L18
        L24:
            r0.close()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L2c
            r4.close()
        L2c:
            return
        L2d:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L37
        L36:
            throw r5     // Catch: java.lang.Throwable -> L37
        L37:
            r5 = move-exception
            goto L41
        L39:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "Could not open selected skin."
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L37
            throw r5     // Catch: java.lang.Throwable -> L37
        L41:
            if (r4 == 0) goto L4b
            r4.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r4 = move-exception
            r5.addSuppressed(r4)
        L4b:
            throw r5
    }

    private static void ensureParent(java.io.File r3) throws java.io.IOException {
            java.io.File r3 = r3.getParentFile()
            if (r3 == 0) goto L2c
            boolean r0 = r3.exists()
            if (r0 != 0) goto L2c
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L13
            goto L2c
        L13:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not create folder: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2c:
            return
    }

    private java.io.File getOfflineSkinFile(java.lang.String r6) {
            r5 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r5.context
            java.io.File r2 = r2.getFilesDir()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "offline_accounts/"
            r3.<init>(r4)
            java.lang.StringBuilder r6 = r3.append(r6)
            java.lang.String r6 = r6.toString()
            r1.<init>(r2, r6)
            java.lang.String r6 = "skin.png"
            r0.<init>(r1, r6)
            return r0
    }

    private static boolean notEmpty(java.lang.String r0) {
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private ca.dnamobile.javalauncher.data.AccountStore.Account readAccount(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.preferences
            r1 = 0
            java.lang.String r3 = r0.getString(r3, r1)
            if (r3 == 0) goto L1a
            int r0 = r3.length()
            if (r0 != 0) goto L10
            goto L1a
        L10:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a
            r0.<init>(r3)     // Catch: org.json.JSONException -> L1a
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = ca.dnamobile.javalauncher.data.AccountStore.Account.fromJson(r0)     // Catch: org.json.JSONException -> L1a
            return r3
        L1a:
            return r1
    }

    private void saveActiveOnly(ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.preferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            org.json.JSONObject r3 = r3.toJson()
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "active_account_json"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            r3.apply()
            return
    }

    private void saveOfflineAccounts(java.util.ArrayList<ca.dnamobile.javalauncher.data.AccountStore.Account> r3) {
            r2 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r3.next()
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r1
            org.json.JSONObject r1 = r1.toJson()
            r0.put(r1)
            goto L9
        L1d:
            android.content.SharedPreferences r3 = r2.preferences
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r1 = "offline_accounts_json"
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r3 = r3.putString(r1, r0)
            r3.apply()
            return
    }

    public void activateOfflineAccount(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.canUseOfflineMode()
            if (r0 == 0) goto L2e
            java.util.ArrayList r0 = r3.listOfflineAccounts()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r1
            java.lang.String r2 = r1.accountId
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Le
            r3.saveActiveOnly(r1)
            return
        L26:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Offline account was not found."
            r4.<init>(r0)
            throw r4
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Offline profiles are disabled in this build. Sign in with a Microsoft account to continue."
            r4.<init>(r0)
            throw r4
    }

    public boolean canUseOfflineMode() {
            r1 = this;
            boolean r0 = ca.dnamobile.javalauncher.security.LauncherSecurity.allowsOfflineProfileAuth()
            if (r0 == 0) goto Le
            boolean r0 = r1.hasMicrosoftLoginCompletedOnce()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public void clear() {
            r2 = this;
            android.content.SharedPreferences r0 = r2.preferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "active_account_json"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
            return
    }

    public void clearMicrosoftLoginHistoryForFullResetOnly() {
            r2 = this;
            android.content.SharedPreferences r0 = r2.preferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "active_account_json"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "last_microsoft_account_json"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "microsoft_login_completed_once"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "offline_accounts_json"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
            return
    }

    public void deleteOfflineAccount(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.listOfflineAccounts()
            r1 = 0
        L5:
            int r2 = r0.size()
            if (r1 >= r2) goto L23
            java.lang.Object r2 = r0.get(r1)
            ca.dnamobile.javalauncher.data.AccountStore$Account r2 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r2
            java.lang.String r2 = r2.accountId
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L20
            java.lang.Object r1 = r0.remove(r1)
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r1
            goto L24
        L20:
            int r1 = r1 + 1
            goto L5
        L23:
            r1 = 0
        L24:
            if (r1 == 0) goto L33
            java.io.File r1 = r3.getOfflineSkinFile(r4)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L33
            r1.delete()
        L33:
            r3.saveOfflineAccounts(r0)
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r3.load()
            if (r0 == 0) goto L5b
            boolean r1 = r0.isOfflineAccount()
            if (r1 == 0) goto L5b
            java.lang.String r0 = r0.accountId
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L5b
            ca.dnamobile.javalauncher.data.AccountStore$Account r4 = r3.loadLastMicrosoftAccount()
            if (r4 == 0) goto L58
            ca.dnamobile.javalauncher.data.AccountStore$Account r4 = r4.asMicrosoftAccount()
            r3.saveActiveOnly(r4)
            goto L5b
        L58:
            r3.clear()
        L5b:
            return
    }

    public boolean hasActiveAccount() {
            r1 = this;
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r1.load()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasActiveMicrosoftAccount() {
            r2 = this;
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r2.load()
            if (r0 == 0) goto L14
            boolean r1 = r0.isMicrosoftAccount()
            if (r1 == 0) goto L14
            boolean r0 = r0.hasMinecraftSession()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public boolean hasMicrosoftLoginCompletedOnce() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.preferences
            java.lang.String r1 = "microsoft_login_completed_once"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r1 = 1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r3.loadLastMicrosoftAccount()
            if (r0 == 0) goto L1a
            boolean r0 = r0.isMicrosoftAccount()
            if (r0 == 0) goto L1a
            r2 = r1
        L1a:
            return r2
    }

    public boolean hasStoredMicrosoftAccount() {
            r1 = this;
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r1.loadLastMicrosoftAccount()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public java.util.ArrayList<ca.dnamobile.javalauncher.data.AccountStore.Account> listOfflineAccounts() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.SharedPreferences r1 = r5.preferences
            java.lang.String r2 = "offline_accounts_json"
            java.lang.String r3 = "[]"
            java.lang.String r1 = r1.getString(r2, r3)
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L32
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L32
            r1 = 0
        L15:
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L32
            if (r1 >= r3) goto L32
            org.json.JSONObject r3 = r2.optJSONObject(r1)     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L22
            goto L2f
        L22:
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = ca.dnamobile.javalauncher.data.AccountStore.Account.fromJson(r3)     // Catch: java.lang.Throwable -> L32
            boolean r4 = r3.isOfflineAccount()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L2f
            r0.add(r3)     // Catch: java.lang.Throwable -> L32
        L2f:
            int r1 = r1 + 1
            goto L15
        L32:
            return r0
    }

    public ca.dnamobile.javalauncher.data.AccountStore.Account load() {
            r1 = this;
            java.lang.String r0 = "active_account_json"
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r1.readAccount(r0)
            return r0
    }

    public ca.dnamobile.javalauncher.data.AccountStore.Account loadLastMicrosoftAccount() {
            r2 = this;
            java.lang.String r0 = "last_microsoft_account_json"
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r2.readAccount(r0)
            if (r0 == 0) goto Lf
            boolean r1 = r0.isMicrosoftAccount()
            if (r1 == 0) goto Lf
            return r0
        Lf:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r2.load()
            if (r0 == 0) goto L1c
            boolean r1 = r0.isMicrosoftAccount()
            if (r1 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    public void markMicrosoftLoginCompletedOnce() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.preferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "microsoft_login_completed_once"
            r2 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            r0.apply()
            return
    }

    public void save(ca.dnamobile.javalauncher.data.AccountStore.Account r2) {
            r1 = this;
            boolean r0 = r2.isMicrosoftAccount()
            if (r0 == 0) goto La
            r1.saveMicrosoftAccount(r2)
            goto Ld
        La:
            r1.saveOfflineAccount(r2)
        Ld:
            return
    }

    public void saveMicrosoftAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r4) {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore$Account r4 = r4.asMicrosoftAccount()
            android.content.SharedPreferences r0 = r3.preferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            org.json.JSONObject r1 = r4.toJson()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "active_account_json"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            org.json.JSONObject r4 = r4.toJson()
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "last_microsoft_account_json"
            android.content.SharedPreferences$Editor r4 = r0.putString(r1, r4)
            java.lang.String r0 = "microsoft_login_completed_once"
            r1 = 1
            android.content.SharedPreferences$Editor r4 = r4.putBoolean(r0, r1)
            r4.apply()
            return
    }

    public void saveOfflineAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r5) {
            r4 = this;
            boolean r0 = r5.isOfflineAccount()
            if (r0 == 0) goto L44
            boolean r0 = r4.canUseOfflineMode()
            if (r0 == 0) goto L3c
            java.util.ArrayList r0 = r4.listOfflineAccounts()
            ca.dnamobile.javalauncher.data.AccountStore$Account r5 = r5.asOfflineAccount()
            r1 = 0
        L15:
            int r2 = r0.size()
            if (r1 >= r2) goto L32
            java.lang.String r2 = r5.accountId
            java.lang.Object r3 = r0.get(r1)
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r3
            java.lang.String r3 = r3.accountId
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2f
            r0.set(r1, r5)
            goto L35
        L2f:
            int r1 = r1 + 1
            goto L15
        L32:
            r0.add(r5)
        L35:
            r4.saveOfflineAccounts(r0)
            r4.saveActiveOnly(r5)
            return
        L3c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Offline profiles are disabled in this build. Sign in with a Microsoft account to continue."
            r5.<init>(r0)
            throw r5
        L44:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Expected offline account"
            r5.<init>(r0)
            throw r5
    }

    public void saveOfflineAccount(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.saveOrUpdateOfflineAccount(r0, r3, r0, r1)
            return
    }

    public ca.dnamobile.javalauncher.data.AccountStore.Account saveOrUpdateOfflineAccount(java.lang.String r6, java.lang.String r7, android.net.Uri r8, boolean r9) {
            r5 = this;
            boolean r0 = r5.canUseOfflineMode()
            if (r0 == 0) goto L132
            java.lang.String r7 = ca.dnamobile.javalauncher.data.AccountStore.Account.sanitizePlayerName(r7)
            int r0 = r7.length()
            r1 = 3
            if (r0 < r1) goto L12a
            int r0 = r7.length()
            r1 = 16
            if (r0 > r1) goto L12a
            java.util.ArrayList r0 = r5.listOfflineAccounts()
            if (r6 == 0) goto L42
            java.lang.String r1 = r6.trim()
            int r1 = r1.length()
            if (r1 <= 0) goto L42
            java.util.Iterator r1 = r0.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.data.AccountStore$Account r2 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r2
            java.lang.String r3 = r2.accountId
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L2d
            goto L43
        L42:
            r2 = 0
        L43:
            if (r2 == 0) goto L48
            java.lang.String r6 = r2.accountId
            goto L50
        L48:
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
        L50:
            java.io.File r1 = r5.getOfflineSkinFile(r6)
            java.lang.String r3 = ""
            if (r2 == 0) goto L5b
            java.lang.String r4 = r2.offlineSkinPath
            goto L5c
        L5b:
            r4 = r3
        L5c:
            if (r2 == 0) goto L65
            java.lang.String r2 = r2.offlineSkinModel
            ca.dnamobile.javalauncher.skin.SkinModelType r2 = ca.dnamobile.javalauncher.skin.SkinModelType.fromId(r2)
            goto L67
        L65:
            ca.dnamobile.javalauncher.skin.SkinModelType r2 = ca.dnamobile.javalauncher.skin.SkinModelType.NONE
        L67:
            if (r8 == 0) goto Lc0
            ensureParent(r1)     // Catch: java.io.IOException -> Lbe
            java.io.File r9 = new java.io.File     // Catch: java.io.IOException -> Lbe
            java.io.File r2 = r1.getParentFile()     // Catch: java.io.IOException -> Lbe
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbe
            r3.<init>()     // Catch: java.io.IOException -> Lbe
            java.lang.String r4 = r1.getName()     // Catch: java.io.IOException -> Lbe
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.io.IOException -> Lbe
            java.lang.String r4 = ".tmp"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.io.IOException -> Lbe
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> Lbe
            r9.<init>(r2, r3)     // Catch: java.io.IOException -> Lbe
            r5.copyUriToFile(r8, r9)     // Catch: java.io.IOException -> Lbe
            boolean r8 = ca.dnamobile.javalauncher.skin.CustomSkinStore.isSkinValid(r9)     // Catch: java.io.IOException -> Lbe
            if (r8 == 0) goto Lb3
            ca.dnamobile.javalauncher.skin.SkinModelType r2 = ca.dnamobile.javalauncher.skin.CustomSkinStore.getSkinModel(r9)     // Catch: java.io.IOException -> Lbe
            boolean r8 = r1.exists()     // Catch: java.io.IOException -> Lbe
            if (r8 == 0) goto La2
            r1.delete()     // Catch: java.io.IOException -> Lbe
        La2:
            boolean r8 = r9.renameTo(r1)     // Catch: java.io.IOException -> Lbe
            if (r8 != 0) goto Lae
            copyFile(r9, r1)     // Catch: java.io.IOException -> Lbe
            r9.delete()     // Catch: java.io.IOException -> Lbe
        Lae:
            java.lang.String r3 = r1.getAbsolutePath()     // Catch: java.io.IOException -> Lbe
            goto Le3
        Lb3:
            r9.delete()     // Catch: java.io.IOException -> Lbe
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> Lbe
            java.lang.String r7 = "Invalid skin. Use a 64x64 or 64x32 PNG skin."
            r6.<init>(r7)     // Catch: java.io.IOException -> Lbe
            throw r6     // Catch: java.io.IOException -> Lbe
        Lbe:
            r6 = move-exception
            goto L115
        Lc0:
            if (r9 == 0) goto Lce
            boolean r8 = r1.exists()     // Catch: java.io.IOException -> Lbe
            if (r8 == 0) goto Lcb
            r1.delete()     // Catch: java.io.IOException -> Lbe
        Lcb:
            ca.dnamobile.javalauncher.skin.SkinModelType r2 = ca.dnamobile.javalauncher.skin.SkinModelType.NONE     // Catch: java.io.IOException -> Lbe
            goto Le3
        Lce:
            int r8 = r4.length()     // Catch: java.io.IOException -> Lbe
            if (r8 <= 0) goto Le2
            java.io.File r8 = new java.io.File     // Catch: java.io.IOException -> Lbe
            r8.<init>(r4)     // Catch: java.io.IOException -> Lbe
            boolean r8 = r8.isFile()     // Catch: java.io.IOException -> Lbe
            if (r8 != 0) goto Le2
            ca.dnamobile.javalauncher.skin.SkinModelType r2 = ca.dnamobile.javalauncher.skin.SkinModelType.NONE     // Catch: java.io.IOException -> Lbe
            goto Le3
        Le2:
            r3 = r4
        Le3:
            java.lang.String r8 = ca.dnamobile.javalauncher.skin.CustomSkinStore.getOfflineUuidWithSkinModel(r7, r2)
            java.lang.String r9 = r2.id
            ca.dnamobile.javalauncher.data.AccountStore$Account r6 = ca.dnamobile.javalauncher.data.AccountStore.Account.offline(r6, r7, r8, r3, r9)
            r7 = 0
        Lee:
            int r8 = r0.size()
            if (r7 >= r8) goto L10b
            java.lang.String r8 = r6.accountId
            java.lang.Object r9 = r0.get(r7)
            ca.dnamobile.javalauncher.data.AccountStore$Account r9 = (ca.dnamobile.javalauncher.data.AccountStore.Account) r9
            java.lang.String r9 = r9.accountId
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L108
            r0.set(r7, r6)
            goto L10e
        L108:
            int r7 = r7 + 1
            goto Lee
        L10b:
            r0.add(r6)
        L10e:
            r5.saveOfflineAccounts(r0)
            r5.saveActiveOnly(r6)
            return r6
        L115:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = r6.getMessage()
            if (r8 == 0) goto L122
            java.lang.String r8 = r6.getMessage()
            goto L126
        L122:
            java.lang.String r8 = r6.toString()
        L126:
            r7.<init>(r8, r6)
            throw r7
        L12a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Offline username must be 3-16 letters, numbers, or underscores."
            r6.<init>(r7)
            throw r6
        L132:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Offline profiles are disabled in this build. Sign in with a Microsoft account to continue."
            r6.<init>(r7)
            throw r6
    }

    public void signOutMicrosoftAccount() {
            r2 = this;
            android.content.SharedPreferences r0 = r2.preferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "active_account_json"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "last_microsoft_account_json"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "microsoft_login_completed_once"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.commit()
            return
    }

    public void useLastMicrosoftAccount() {
            r2 = this;
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r2.loadLastMicrosoftAccount()
            if (r0 == 0) goto Le
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.asMicrosoftAccount()
            r2.saveActiveOnly(r0)
            return
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No remembered Microsoft account is available."
            r0.<init>(r1)
            throw r0
    }
}
