package ca.dnamobile.javalauncher.fancymenu;

/* JADX INFO: loaded from: classes.dex */
public final class MicrosoftAuthManagerPersonal {
    private static final java.util.concurrent.ExecutorService AUTH_EXECUTOR = null;
    private final ca.dnamobile.javalauncher.data.AccountStore accountStore;
    private final androidx.activity.ComponentActivity activity;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> authLauncher;
    private ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal.Listener listener;
    private final android.os.Handler mainHandler;

    public interface Listener {
        void onError(java.lang.String r1);

        void onSignedIn(ca.dnamobile.javalauncher.data.AccountStore.Account r1);
    }

    private static final class LiveTokens {
        final java.lang.String accessToken;
        final java.lang.String refreshToken;

        LiveTokens(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.accessToken = r1
                r0.refreshToken = r2
                return
        }
    }

    private static final class MinecraftProfile {
        final java.lang.String name;
        final java.lang.String skinUrl;
        final java.lang.String skinVariant;
        final java.lang.String uuidWithDashes;

        MinecraftProfile(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.uuidWithDashes = r2
                r0.skinUrl = r3
                r0.skinVariant = r4
                return
        }
    }

    private static final class XstsToken {
        final java.lang.String token;
        final java.lang.String userHash;

        XstsToken(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.userHash = r1
                r0.token = r2
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$-OqjirIBhKqm0QI8d09hy7Ce4JI, reason: not valid java name */
    public static /* synthetic */ void m449$r8$lambda$OqjirIBhKqm0QI8d09hy7Ce4JI(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            r0.lambda$exchangeCodeForMinecraftAccount$4(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$7v3FkY_XedBkDRVMxfHxvHhMcRs(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0, java.lang.String r1) {
            r0.lambda$refreshMicrosoftAccount$3(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$9Tq71XobhlyCa-QS-lQU4UBzNjw, reason: not valid java name */
    public static /* synthetic */ void m450$r8$lambda$9Tq71XobhlyCaQSlQU4UBzNjw(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0) {
            r0.lambda$clearWebAuthenticationState$1()
            return
    }

    public static /* synthetic */ void $r8$lambda$FinNDKM4sINdLK_qwajBGD6ENeI(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0, androidx.activity.result.ActivityResult r1) {
            r0.lambda$new$0(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$U3FZAN-bIlf9PVA4vbFcCdYJXY4, reason: not valid java name */
    public static /* synthetic */ void m451$r8$lambda$U3FZANbIlf9PVA4vbFcCdYJXY4(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            r0.lambda$refreshMicrosoftAccount$2(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$UAtmw-IysSlo71n2II5jjbzHoRg, reason: not valid java name */
    public static /* synthetic */ void m452$r8$lambda$UAtmwIysSlo71n2II5jjbzHoRg(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0, java.lang.String r1) {
            r0.lambda$notifyError$6(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$pXpBdlbperEkWyEA9_XePmyRIhw(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal r0, java.lang.String r1, java.lang.String r2) {
            r0.lambda$exchangeCodeForMinecraftAccount$5(r1, r2)
            return
    }

    static {
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal.AUTH_EXECUTOR = r0
            return
    }

    public MicrosoftAuthManagerPersonal(android.app.Activity r3, ca.dnamobile.javalauncher.data.AccountStore r4) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.mainHandler = r0
            boolean r0 = r3 instanceof androidx.activity.ComponentActivity
            if (r0 == 0) goto L29
            androidx.activity.ComponentActivity r3 = (androidx.activity.ComponentActivity) r3
            r2.activity = r3
            r2.accountStore = r4
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r4 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r4.<init>()
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda4 r0 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda4
            r0.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r3 = r3.registerForActivityResult(r4, r0)
            r2.authLauncher = r3
            return
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "MicrosoftAuthManager requires an androidx.activity.ComponentActivity."
            r3.<init>(r4)
            throw r3
    }

    private ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal.LiveTokens acquireLiveAccessToken(boolean r4, java.lang.String r5, java.lang.String r6) throws java.io.IOException, org.json.JSONException {
            r3 = this;
            java.lang.String r5 = r3.createTokenRequestFormData(r4, r5, r6)
            java.lang.String r6 = "https://login.microsoftonline.com/consumers/oauth2/v2.0/token"
            org.json.JSONObject r5 = postForm(r6, r5)     // Catch: java.lang.Throwable -> L23
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$LiveTokens r6 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$LiveTokens     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "access_token"
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "refresh_token"
            java.lang.String r2 = ""
            java.lang.String r5 = r5.optString(r1, r2)     // Catch: java.lang.Throwable -> L23
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> L23
            if (r4 != 0) goto L22
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.clearCodeVerifier()
        L22:
            return r6
        L23:
            r5 = move-exception
            if (r4 != 0) goto L29
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.clearCodeVerifier()
        L29:
            throw r5
    }

    private java.lang.String acquireMinecraftToken(java.lang.String r4, java.lang.String r5) throws java.io.IOException, org.json.JSONException {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "XBL3.0 x="
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ";"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "identityToken"
            r0.put(r5, r4)
            java.lang.String r4 = "https://api.minecraftservices.com/authentication/login_with_xbox"
            org.json.JSONObject r4 = postJson(r4, r0)
            java.lang.String r5 = "access_token"
            java.lang.String r4 = r4.getString(r5)
            return r4
    }

    private java.lang.String acquireXblToken(java.lang.String r4) throws java.io.IOException, org.json.JSONException {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "AuthMethod"
            java.lang.String r2 = "RPS"
            r0.put(r1, r2)
            java.lang.String r1 = "SiteName"
            java.lang.String r2 = "user.auth.xboxlive.com"
            r0.put(r1, r2)
            java.lang.String r1 = "RpsTicket"
            java.lang.String r4 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.formatRpsTicket(r4)
            r0.put(r1, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r1 = "Properties"
            r4.put(r1, r0)
            java.lang.String r0 = "RelyingParty"
            java.lang.String r1 = "http://auth.xboxlive.com"
            r4.put(r0, r1)
            java.lang.String r0 = "TokenType"
            java.lang.String r1 = "JWT"
            r4.put(r0, r1)
            java.lang.String r0 = "https://user.auth.xboxlive.com/user/authenticate"
            org.json.JSONObject r4 = postJson(r0, r4)
            java.lang.String r0 = "Token"
            java.lang.String r4 = r4.getString(r0)
            return r4
    }

    private ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal.XstsToken acquireXstsToken(java.lang.String r4) throws java.io.IOException, org.json.JSONException {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "SandboxId"
            java.lang.String r2 = "RETAIL"
            r0.put(r1, r2)
            org.json.JSONArray r1 = new org.json.JSONArray
            java.util.Set r4 = java.util.Collections.singleton(r4)
            r1.<init>(r4)
            java.lang.String r4 = "UserTokens"
            r0.put(r4, r1)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r1 = "Properties"
            r4.put(r1, r0)
            java.lang.String r0 = "RelyingParty"
            java.lang.String r1 = "rp://api.minecraftservices.com/"
            r4.put(r0, r1)
            java.lang.String r0 = "TokenType"
            java.lang.String r1 = "JWT"
            r4.put(r0, r1)
            java.lang.String r0 = "https://xsts.auth.xboxlive.com/xsts/authorize"
            org.json.JSONObject r4 = postJson(r0, r4)
            java.lang.String r0 = "DisplayClaims"
            org.json.JSONObject r0 = r4.getJSONObject(r0)
            java.lang.String r1 = "xui"
            org.json.JSONArray r0 = r0.getJSONArray(r1)
            r1 = 0
            org.json.JSONObject r0 = r0.getJSONObject(r1)
            java.lang.String r1 = "uhs"
            java.lang.String r0 = r0.getString(r1)
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$XstsToken r1 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$XstsToken
            java.lang.String r2 = "Token"
            java.lang.String r4 = r4.getString(r2)
            r1.<init>(r0, r4)
            return r1
    }

    private static java.lang.String addDashesToUuid(java.lang.String r2) {
            java.lang.String r0 = "-"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L19
            int r0 = r2.length()
            r1 = 32
            if (r0 == r1) goto L11
            goto L19
        L11:
            java.lang.String r0 = "(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)"
            java.lang.String r1 = "$1-$2-$3-$4-$5"
            java.lang.String r2 = r2.replaceFirst(r0, r1)
        L19:
            return r2
    }

    private void clearStoredMicrosoftAccount() {
            r1 = this;
            java.lang.String r0 = "signOutMicrosoftAccount"
            boolean r0 = r1.invokeNoArgAccountStoreMethod(r0)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = "clearMicrosoftAccount"
            boolean r0 = r1.invokeNoArgAccountStoreMethod(r0)
            if (r0 == 0) goto L12
            return
        L12:
            java.lang.String r0 = "clearStoredMicrosoftAccount"
            boolean r0 = r1.invokeNoArgAccountStoreMethod(r0)
            if (r0 == 0) goto L1b
            return
        L1b:
            java.lang.String r0 = "deleteStoredMicrosoftAccount"
            boolean r0 = r1.invokeNoArgAccountStoreMethod(r0)
            if (r0 == 0) goto L24
            return
        L24:
            ca.dnamobile.javalauncher.data.AccountStore r0 = r1.accountStore     // Catch: java.lang.Throwable -> L29
            r0.clear()     // Catch: java.lang.Throwable -> L29
        L29:
            return
    }

    private void clearWebAuthenticationState() {
            r2 = this;
            android.os.Handler r0 = r2.mainHandler
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda1
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    private java.lang.String createTokenRequestFormData(boolean r16, java.lang.String r17, java.lang.String r18) throws java.io.IOException {
            r15 = this;
            java.lang.String r0 = "XboxLive.signin offline_access"
            r1 = 7
            java.lang.String r2 = "scope"
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 3
            java.lang.String r7 = "grant_type"
            r8 = 2
            r9 = 1
            java.lang.String r10 = "client_id"
            r11 = 0
            r12 = 8
            if (r16 == 0) goto L2f
            java.lang.String[] r12 = new java.lang.String[r12]
            r12[r11] = r10
            java.lang.String r10 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.CLIENT_ID
            r12[r9] = r10
            r12[r8] = r7
            java.lang.String r7 = "refresh_token"
            r12[r6] = r7
            r12[r5] = r7
            r12[r4] = r17
            r12[r3] = r2
            r12[r1] = r0
            java.lang.String r0 = toFormData(r12)
            return r0
        L2f:
            boolean r13 = isBlank(r18)
            if (r13 != 0) goto L38
            r13 = r18
            goto L3c
        L38:
            java.lang.String r13 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.requireCodeVerifier()
        L3c:
            r14 = 12
            java.lang.String[] r14 = new java.lang.String[r14]
            r14[r11] = r10
            java.lang.String r10 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.CLIENT_ID
            r14[r9] = r10
            r14[r8] = r7
            java.lang.String r7 = "authorization_code"
            r14[r6] = r7
            java.lang.String r6 = "code"
            r14[r5] = r6
            r14[r4] = r17
            java.lang.String r4 = "redirect_uri"
            r14[r3] = r4
            java.lang.String r3 = "droidbridge://auth"
            r14[r1] = r3
            r14[r12] = r2
            r1 = 9
            r14[r1] = r0
            r0 = 10
            java.lang.String r1 = "code_verifier"
            r14[r0] = r1
            r0 = 11
            r14[r0] = r13
            java.lang.String r0 = toFormData(r14)
            return r0
    }

    private void exchangeCodeForMinecraftAccount(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal.AUTH_EXECUTOR
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda3
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }

    private ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal.MinecraftProfile fetchMinecraftProfile(java.lang.String r12) throws java.io.IOException, org.json.JSONException {
            r11 = this;
            java.lang.String r0 = "https://api.minecraftservices.com/minecraft/profile"
            java.net.HttpURLConnection r0 = openConnection(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Bearer "
            r1.<init>(r2)
            java.lang.StringBuilder r12 = r1.append(r12)
            java.lang.String r12 = r12.toString()
            java.lang.String r1 = "Authorization"
            r0.setRequestProperty(r1, r12)
            int r12 = r0.getResponseCode()
            r1 = 300(0x12c, float:4.2E-43)
            r2 = 200(0xc8, float:2.8E-43)
            if (r12 < r2) goto L2b
            if (r12 >= r1) goto L2b
            java.io.InputStream r3 = r0.getInputStream()
            goto L2f
        L2b:
            java.io.InputStream r3 = r0.getErrorStream()
        L2f:
            java.lang.String r3 = readFully(r3)
            r0.disconnect()
            if (r12 < r2) goto Lba
            if (r12 < r1) goto L3c
            goto Lba
        L3c:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>(r3)
            java.lang.String r0 = "skins"
            org.json.JSONArray r0 = r12.optJSONArray(r0)
            java.lang.String r1 = "classic"
            java.lang.String r2 = ""
            if (r0 == 0) goto La2
            r3 = 0
            r5 = r1
            r4 = r2
        L50:
            int r6 = r0.length()
            if (r3 >= r6) goto La0
            org.json.JSONObject r6 = r0.optJSONObject(r3)
            if (r6 != 0) goto L5d
            goto L9d
        L5d:
            java.lang.String r7 = "state"
            java.lang.String r8 = "ACTIVE"
            java.lang.String r7 = r6.optString(r7, r8)
            java.lang.String r9 = "url"
            java.lang.String r9 = r6.optString(r9, r2)
            int r10 = r9.length()
            if (r10 != 0) goto L72
            goto L9d
        L72:
            int r10 = r4.length()
            if (r10 == 0) goto L7e
            boolean r10 = r8.equalsIgnoreCase(r7)
            if (r10 == 0) goto L9d
        L7e:
            java.lang.String r4 = ca.dnamobile.javalauncher.skin.AccountSkinCache.normalizeSkinUrl(r9)
            java.lang.String r5 = "variant"
            java.lang.String r9 = "CLASSIC"
            java.lang.String r5 = r6.optString(r5, r9)
            java.lang.String r6 = "SLIM"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L95
            java.lang.String r5 = "slim"
            goto L96
        L95:
            r5 = r1
        L96:
            boolean r6 = r8.equalsIgnoreCase(r7)
            if (r6 == 0) goto L9d
            goto La0
        L9d:
            int r3 = r3 + 1
            goto L50
        La0:
            r2 = r4
            r1 = r5
        La2:
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$MinecraftProfile r0 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$MinecraftProfile
            java.lang.String r3 = "name"
            java.lang.String r4 = "Microsoft Player"
            java.lang.String r3 = r12.optString(r3, r4)
            java.lang.String r4 = "id"
            java.lang.String r12 = r12.getString(r4)
            java.lang.String r12 = addDashesToUuid(r12)
            r0.<init>(r3, r12, r2, r1)
            return r0
        Lba:
            r0 = 404(0x194, float:5.66E-43)
            if (r12 != r0) goto Lc6
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "This Microsoft account does not own Minecraft: Java Edition."
            r12.<init>(r0)
            throw r12
        Lc6:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Minecraft profile request failed: HTTP "
            r1.<init>(r2)
            java.lang.StringBuilder r12 = r1.append(r12)
            java.lang.String r1 = " "
            java.lang.StringBuilder r12 = r12.append(r1)
            java.lang.StringBuilder r12 = r12.append(r3)
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
    }

    private void fetchOwnedItemsQuietly(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "Bearer "
            r1 = 0
            java.lang.String r2 = "https://api.minecraftservices.com/entitlements/mcstore"
            java.net.HttpURLConnection r1 = openConnection(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "Authorization"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r5 = r3.append(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L36
            r1.setRequestProperty(r2, r5)     // Catch: java.lang.Throwable -> L36
            int r5 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L36
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 < r0) goto L2c
            r0 = 300(0x12c, float:4.2E-43)
            if (r5 >= r0) goto L2c
            java.io.InputStream r5 = r1.getInputStream()     // Catch: java.lang.Throwable -> L36
            goto L30
        L2c:
            java.io.InputStream r5 = r1.getErrorStream()     // Catch: java.lang.Throwable -> L36
        L30:
            readFully(r5)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L3b
            goto L38
        L36:
            if (r1 == 0) goto L3b
        L38:
            r1.disconnect()
        L3b:
            return
    }

    private boolean invokeNoArgAccountStoreMethod(java.lang.String r4) {
            r3 = this;
            r0 = 0
            ca.dnamobile.javalauncher.data.AccountStore r1 = r3.accountStore     // Catch: java.lang.Throwable -> L16
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L16
            java.lang.reflect.Method r4 = r1.getMethod(r4, r2)     // Catch: java.lang.Throwable -> L16
            ca.dnamobile.javalauncher.data.AccountStore r1 = r3.accountStore     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L16
            r4.invoke(r1, r2)     // Catch: java.lang.Throwable -> L16
            r4 = 1
            return r4
        L16:
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

    private /* synthetic */ void lambda$clearWebAuthenticationState$1() {
            r2 = this;
            r0 = 0
            android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Throwable -> Le
            r1.removeAllCookies(r0)     // Catch: java.lang.Throwable -> Le
            r1.removeSessionCookies(r0)     // Catch: java.lang.Throwable -> Le
            r1.flush()     // Catch: java.lang.Throwable -> Le
        Le:
            android.webkit.WebStorage r1 = android.webkit.WebStorage.getInstance()     // Catch: java.lang.Throwable -> L15
            r1.deleteAllData()     // Catch: java.lang.Throwable -> L15
        L15:
            androidx.activity.ComponentActivity r1 = r2.activity     // Catch: java.lang.Throwable -> L21
            android.webkit.WebViewDatabase r1 = android.webkit.WebViewDatabase.getInstance(r1)     // Catch: java.lang.Throwable -> L21
            r1.clearFormData()     // Catch: java.lang.Throwable -> L21
            r1.clearHttpAuthUsernamePassword()     // Catch: java.lang.Throwable -> L21
        L21:
            android.webkit.WebView.clearClientCertPreferences(r0)     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    private /* synthetic */ void lambda$exchangeCodeForMinecraftAccount$4(ca.dnamobile.javalauncher.data.AccountStore.Account r2) {
            r1 = this;
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$Listener r0 = r1.listener
            if (r0 == 0) goto L7
            r0.onSignedIn(r2)
        L7:
            return
    }

    private /* synthetic */ void lambda$exchangeCodeForMinecraftAccount$5(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            ca.dnamobile.javalauncher.data.AccountStore$Account r2 = r1.loginWithMicrosoftCode(r2, r3)     // Catch: java.lang.Throwable -> L2b
            ca.dnamobile.javalauncher.data.AccountStore r3 = r1.accountStore     // Catch: java.lang.Throwable -> L2b
            r3.saveMicrosoftAccount(r2)     // Catch: java.lang.Throwable -> L2b
            androidx.activity.ComponentActivity r3 = r1.activity     // Catch: java.lang.Throwable -> L2b
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.save(r3, r2)     // Catch: java.lang.Throwable -> L2b
            ca.dnamobile.javalauncher.data.AccountStore r3 = r1.accountStore     // Catch: java.lang.Throwable -> L2b
            r3.markMicrosoftLoginCompletedOnce()     // Catch: java.lang.Throwable -> L2b
            androidx.activity.ComponentActivity r3 = r1.activity     // Catch: java.lang.Throwable -> L2b
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.clear(r3)     // Catch: java.lang.Throwable -> L2b
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.clearCodeVerifier()     // Catch: java.lang.Throwable -> L2b
            androidx.activity.ComponentActivity r3 = r1.activity     // Catch: java.lang.Throwable -> L2b
            ca.dnamobile.javalauncher.skin.AccountSkinCache.cacheMicrosoftSkinAsync(r3, r2)     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r3 = r1.mainHandler     // Catch: java.lang.Throwable -> L2b
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2b
            r3.post(r0)     // Catch: java.lang.Throwable -> L2b
            goto L46
        L2b:
            r2 = move-exception
            androidx.activity.ComponentActivity r3 = r1.activity
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.clear(r3)
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.clearCodeVerifier()
            java.lang.String r3 = r2.getMessage()
            if (r3 == 0) goto L3f
            java.lang.String r2 = r2.getMessage()
            goto L43
        L3f:
            java.lang.String r2 = r2.toString()
        L43:
            r1.notifyError(r2)
        L46:
            return
    }

    private /* synthetic */ void lambda$new$0(androidx.activity.result.ActivityResult r3) {
            r2 = this;
            android.content.Intent r0 = r3.getData()
            int r3 = r3.getResultCode()
            r1 = -1
            if (r3 != r1) goto L43
            if (r0 != 0) goto Le
            goto L43
        Le:
            java.lang.String r3 = "ca.dnamobile.javalauncher.auth.AUTH_CODE"
            java.lang.String r3 = r0.getStringExtra(r3)
            if (r3 == 0) goto L38
            int r1 = r3.length()
            if (r1 != 0) goto L1d
            goto L38
        L1d:
            java.lang.String r1 = "ca.dnamobile.javalauncher.auth.CODE_VERIFIER"
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r1 = isBlank(r0)
            if (r1 == 0) goto L34
            androidx.activity.ComponentActivity r3 = r2.activity
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.clear(r3)
            java.lang.String r3 = "Authorization finished without a PKCE verifier. Please start Microsoft sign-in again."
            r2.notifyError(r3)
            return
        L34:
            r2.exchangeCodeForMinecraftAccount(r3, r0)
            return
        L38:
            androidx.activity.ComponentActivity r3 = r2.activity
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.clear(r3)
            java.lang.String r3 = "Authorization finished without a code."
            r2.notifyError(r3)
            return
        L43:
            androidx.activity.ComponentActivity r3 = r2.activity
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.clear(r3)
            if (r0 == 0) goto L51
            java.lang.String r3 = "ca.dnamobile.javalauncher.auth.ERROR"
            java.lang.String r3 = r0.getStringExtra(r3)
            goto L52
        L51:
            r3 = 0
        L52:
            if (r3 == 0) goto L5b
            int r0 = r3.length()
            if (r0 <= 0) goto L5b
            goto L5d
        L5b:
            java.lang.String r3 = "Authorization canceled"
        L5d:
            r2.notifyError(r3)
            return
    }

    private /* synthetic */ void lambda$notifyError$6(java.lang.String r2) {
            r1 = this;
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$Listener r0 = r1.listener
            if (r0 == 0) goto L7
            r0.onError(r2)
        L7:
            return
    }

    private /* synthetic */ void lambda$refreshMicrosoftAccount$2(ca.dnamobile.javalauncher.data.AccountStore.Account r2) {
            r1 = this;
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$Listener r0 = r1.listener
            if (r0 == 0) goto L7
            r0.onSignedIn(r2)
        L7:
            return
    }

    private /* synthetic */ void lambda$refreshMicrosoftAccount$3(java.lang.String r3) {
            r2 = this;
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = r2.loginWithMicrosoftRefreshToken(r3)     // Catch: java.lang.Throwable -> L23
            ca.dnamobile.javalauncher.data.AccountStore r0 = r2.accountStore     // Catch: java.lang.Throwable -> L23
            r0.saveMicrosoftAccount(r3)     // Catch: java.lang.Throwable -> L23
            androidx.activity.ComponentActivity r0 = r2.activity     // Catch: java.lang.Throwable -> L23
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.save(r0, r3)     // Catch: java.lang.Throwable -> L23
            ca.dnamobile.javalauncher.data.AccountStore r0 = r2.accountStore     // Catch: java.lang.Throwable -> L23
            r0.markMicrosoftLoginCompletedOnce()     // Catch: java.lang.Throwable -> L23
            androidx.activity.ComponentActivity r0 = r2.activity     // Catch: java.lang.Throwable -> L23
            ca.dnamobile.javalauncher.skin.AccountSkinCache.cacheMicrosoftSkinAsync(r0, r3)     // Catch: java.lang.Throwable -> L23
            android.os.Handler r0 = r2.mainHandler     // Catch: java.lang.Throwable -> L23
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda5 r1 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda5     // Catch: java.lang.Throwable -> L23
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L23
            r0.post(r1)     // Catch: java.lang.Throwable -> L23
            goto L36
        L23:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto L2f
            java.lang.String r3 = r3.getMessage()
            goto L33
        L2f:
            java.lang.String r3 = r3.toString()
        L33:
            r2.notifyError(r3)
        L36:
            return
    }

    private ca.dnamobile.javalauncher.data.AccountStore.Account loginWithLiveTokens(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal.LiveTokens r14, java.lang.String r15) throws java.io.IOException, org.json.JSONException {
            r13 = this;
            java.lang.String r0 = r14.refreshToken
            int r0 = r0.length()
            if (r0 <= 0) goto La
            java.lang.String r15 = r14.refreshToken
        La:
            r5 = r15
            java.lang.String r14 = r14.accessToken
            java.lang.String r14 = r13.acquireXblToken(r14)
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$XstsToken r14 = r13.acquireXstsToken(r14)
            java.lang.String r15 = r14.userHash
            java.lang.String r0 = r14.token
            java.lang.String r6 = r13.acquireMinecraftToken(r15, r0)
            r13.fetchOwnedItemsQuietly(r6)
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$MinecraftProfile r15 = r13.fetchMinecraftProfile(r6)
            java.lang.String r0 = r15.name
            int r0 = r0.length()
            if (r0 <= 0) goto L2f
            java.lang.String r0 = r15.name
            goto L31
        L2f:
            java.lang.String r0 = "Microsoft Player"
        L31:
            r7 = r0
            ca.dnamobile.javalauncher.data.AccountStore$Account r12 = new ca.dnamobile.javalauncher.data.AccountStore$Account
            java.lang.String r8 = r15.uuidWithDashes
            java.lang.String r9 = r14.userHash
            java.lang.String r10 = r15.skinUrl
            java.lang.String r11 = r15.skinVariant
            java.lang.String r1 = ""
            java.lang.String r3 = ""
            r0 = r12
            r2 = r7
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
    }

    private ca.dnamobile.javalauncher.data.AccountStore.Account loginWithMicrosoftCode(java.lang.String r2, java.lang.String r3) throws java.io.IOException, org.json.JSONException {
            r1 = this;
            r0 = 0
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$LiveTokens r2 = r1.acquireLiveAccessToken(r0, r2, r3)
            java.lang.String r3 = ""
            ca.dnamobile.javalauncher.data.AccountStore$Account r2 = r1.loginWithLiveTokens(r2, r3)
            return r2
    }

    private ca.dnamobile.javalauncher.data.AccountStore.Account loginWithMicrosoftRefreshToken(java.lang.String r3) throws java.io.IOException, org.json.JSONException {
            r2 = this;
            r0 = 1
            r1 = 0
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$LiveTokens r0 = r2.acquireLiveAccessToken(r0, r3, r1)
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = r2.loginWithLiveTokens(r0, r3)
            return r3
    }

    private void notifyError(java.lang.String r3) {
            r2 = this;
            android.os.Handler r0 = r2.mainHandler
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda2
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    private static java.net.HttpURLConnection openConnection(java.lang.String r1) throws java.io.IOException {
            java.net.URL r0 = new java.net.URL
            r0.<init>(r1)
            java.net.URLConnection r1 = r0.openConnection()
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r0 = 30000(0x7530, float:4.2039E-41)
            r1.setConnectTimeout(r0)
            r1.setReadTimeout(r0)
            return r1
    }

    private static org.json.JSONObject postForm(java.lang.String r2, java.lang.String r3) throws java.io.IOException, org.json.JSONException {
            java.net.HttpURLConnection r2 = openConnection(r2)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r0)
            java.lang.String r0 = "POST"
            r2.setRequestMethod(r0)
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/x-www-form-urlencoded"
            r2.setRequestProperty(r0, r1)
            java.lang.String r0 = "charset"
            java.lang.String r1 = "utf-8"
            r2.setRequestProperty(r0, r1)
            int r0 = r3.length
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "Content-Length"
            r2.setRequestProperty(r1, r0)
            r0 = 0
            r2.setUseCaches(r0)
            r0 = 1
            r2.setDoInput(r0)
            r2.setDoOutput(r0)
            java.io.OutputStream r0 = r2.getOutputStream()
            r0.write(r3)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L3e
            r0.close()
        L3e:
            org.json.JSONObject r2 = readJsonResponse(r2)
            return r2
        L43:
            r2 = move-exception
            if (r0 == 0) goto L4e
            r0.close()     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            r3 = move-exception
            r2.addSuppressed(r3)
        L4e:
            throw r2
    }

    private static org.json.JSONObject postJson(java.lang.String r2, org.json.JSONObject r3) throws java.io.IOException, org.json.JSONException {
            java.net.HttpURLConnection r2 = openConnection(r2)
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r0)
            java.lang.String r0 = "POST"
            r2.setRequestMethod(r0)
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/json"
            r2.setRequestProperty(r0, r1)
            java.lang.String r0 = "Accept"
            r2.setRequestProperty(r0, r1)
            java.lang.String r0 = "charset"
            java.lang.String r1 = "utf-8"
            r2.setRequestProperty(r0, r1)
            int r0 = r3.length
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "Content-Length"
            r2.setRequestProperty(r1, r0)
            r0 = 0
            r2.setUseCaches(r0)
            r0 = 1
            r2.setDoInput(r0)
            r2.setDoOutput(r0)
            java.io.OutputStream r0 = r2.getOutputStream()
            r0.write(r3)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L47
            r0.close()
        L47:
            org.json.JSONObject r2 = readJsonResponse(r2)
            return r2
        L4c:
            r2 = move-exception
            if (r0 == 0) goto L57
            r0.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r3 = move-exception
            r2.addSuppressed(r3)
        L57:
            throw r2
    }

    private static java.lang.String readFully(java.io.InputStream r4) throws java.io.IOException {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r4, r3)
            r1.<init>(r2)
        L16:
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L20
            r0.append(r4)     // Catch: java.lang.Throwable -> L28
            goto L16
        L20:
            r1.close()
            java.lang.String r4 = r0.toString()
            return r4
        L28:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r4.addSuppressed(r0)
        L31:
            throw r4
    }

    private static org.json.JSONObject readJsonResponse(java.net.HttpURLConnection r4) throws java.io.IOException, org.json.JSONException {
            int r0 = r4.getResponseCode()
            r1 = 300(0x12c, float:4.2E-43)
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L11
            if (r0 >= r1) goto L11
            java.io.InputStream r3 = r4.getInputStream()
            goto L15
        L11:
            java.io.InputStream r3 = r4.getErrorStream()
        L15:
            java.lang.String r3 = readFully(r3)
            r4.disconnect()
            if (r0 < r2) goto L26
            if (r0 >= r1) goto L26
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r3)
            return r4
        L26:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    private static java.lang.String toFormData(java.lang.String... r5) throws java.io.IOException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 >= r2) goto L34
            int r2 = r0.length()
            if (r2 <= 0) goto L14
            r2 = 38
            r0.append(r2)
        L14:
            r2 = r5[r1]
            java.lang.String r3 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r3)
            java.lang.StringBuilder r2 = r0.append(r2)
            r4 = 61
            java.lang.StringBuilder r2 = r2.append(r4)
            int r4 = r1 + 1
            r4 = r5[r4]
            java.lang.String r3 = java.net.URLEncoder.encode(r4, r3)
            r2.append(r3)
            int r1 = r1 + 2
            goto L6
        L34:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public boolean canUseOfflineMode() {
            r1 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r1.accountStore
            boolean r0 = r0.canUseOfflineMode()
            return r0
    }

    public void dispose() {
            r1 = this;
            r0 = 0
            r1.listener = r0
            return
    }

    public boolean hasLoggedIntoMicrosoftAtLeastOnce() {
            r1 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r1.accountStore
            boolean r0 = r0.hasMicrosoftLoginCompletedOnce()
            return r0
    }

    public void refreshMicrosoftAccount() {
            r3 = this;
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.load()
            if (r0 == 0) goto L16
            boolean r1 = r0.isMicrosoftAccount()
            if (r1 == 0) goto L16
            java.lang.String r1 = r0.refreshToken
            boolean r1 = isBlank(r1)
            if (r1 == 0) goto L1c
        L16:
            ca.dnamobile.javalauncher.data.AccountStore r0 = r3.accountStore
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r0.loadLastMicrosoftAccount()
        L1c:
            if (r0 == 0) goto L34
            java.lang.String r1 = r0.refreshToken
            boolean r1 = isBlank(r1)
            if (r1 == 0) goto L27
            goto L34
        L27:
            java.lang.String r0 = r0.refreshToken
            java.util.concurrent.ExecutorService r1 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal.AUTH_EXECUTOR
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda6 r2 = new ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal$$ExternalSyntheticLambda6
            r2.<init>(r3, r0)
            r1.execute(r2)
            return
        L34:
            r3.signIn()
            return
    }

    public void setListener(ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthManagerPersonal.Listener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    public void signIn() {
            r4 = this;
            boolean r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.isConfigured()
            if (r0 != 0) goto Lc
            java.lang.String r0 = "Microsoft client ID is not configured."
            r4.notifyError(r0)
            return
        Lc:
            android.content.Intent r0 = new android.content.Intent
            androidx.activity.ComponentActivity r1 = r4.activity
            java.lang.Class<ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity> r2 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.createCodeVerifier()
            android.net.Uri r2 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.buildAuthorizationUriWithPkce(r1)
            java.lang.String r2 = r2.toString()
            androidx.activity.ComponentActivity r3 = r4.activity
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.save(r3, r1, r2)
            java.lang.String r3 = "ca.dnamobile.javalauncher.auth.AUTH_URL"
            r0.putExtra(r3, r2)
            java.lang.String r2 = "ca.dnamobile.javalauncher.auth.CODE_VERIFIER"
            r0.putExtra(r2, r1)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r4.authLauncher
            r1.launch(r0)
            return
    }

    public void signOut() {
            r1 = this;
            androidx.activity.ComponentActivity r0 = r1.activity
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthSessionStore.clear(r0)
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.clearCodeVerifier()
            r1.clearStoredMicrosoftAccount()
            androidx.activity.ComponentActivity r0 = r1.activity
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAccountRegistry.clear(r0)
            r1.clearWebAuthenticationState()
            return
    }
}
