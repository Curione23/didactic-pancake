package ca.dnamobile.javalauncher.skin;

/* JADX INFO: loaded from: classes.dex */
public final class OfflineYggdrasilServer {
    private static final java.lang.String TAG = "OfflineYggdrasilServer";
    private final java.util.Map<java.lang.String, ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer.CharacterProfile> charactersByName;
    private final java.util.Map<java.lang.String, ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer.CharacterProfile> charactersByUuid;
    private final java.lang.String implementationName;
    private final java.lang.String implementationVersion;
    private final java.security.KeyPair keyPair;
    private final int requestedPort;
    private volatile boolean running;
    private final java.lang.String serverName;
    private java.net.ServerSocket serverSocket;
    private java.lang.Thread serverThread;

    private static final class CharacterProfile {
        final ca.dnamobile.javalauncher.skin.SkinModelType model;
        final java.lang.String name;
        final byte[] skinBytes;
        final java.lang.String skinHash;
        final java.lang.String uuid;

        CharacterProfile(java.lang.String r1, java.lang.String r2, java.lang.String r3, byte[] r4, ca.dnamobile.javalauncher.skin.SkinModelType r5) {
                r0 = this;
                r0.<init>()
                r0.uuid = r1
                r0.name = r2
                r0.skinHash = r3
                r0.skinBytes = r4
                r0.model = r5
                return
        }

        java.lang.String toCompleteResponse(java.lang.String r5, ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer.Signer r6) throws java.lang.Exception {
                r4 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = r4.skinHash
                if (r1 == 0) goto L4f
                int r1 = r1.length()
                if (r1 <= 0) goto L4f
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r5 = r2.append(r5)
                java.lang.String r2 = "/textures/"
                java.lang.StringBuilder r5 = r5.append(r2)
                java.lang.String r2 = r4.skinHash
                java.lang.StringBuilder r5 = r5.append(r2)
                java.lang.String r5 = r5.toString()
                java.lang.String r2 = "url"
                r1.put(r2, r5)
                ca.dnamobile.javalauncher.skin.SkinModelType r5 = r4.model
                ca.dnamobile.javalauncher.skin.SkinModelType r2 = ca.dnamobile.javalauncher.skin.SkinModelType.SLIM
                if (r5 != r2) goto L4a
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                java.lang.String r2 = "model"
                java.lang.String r3 = "slim"
                org.json.JSONObject r5 = r5.put(r2, r3)
                java.lang.String r2 = "metadata"
                r1.put(r2, r5)
            L4a:
                java.lang.String r5 = "SKIN"
                r0.put(r5, r1)
            L4f:
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                java.lang.String r1 = "timestamp"
                long r2 = java.lang.System.currentTimeMillis()
                r5.put(r1, r2)
                java.lang.String r1 = "profileId"
                java.lang.String r2 = r4.uuid
                r5.put(r1, r2)
                java.lang.String r1 = "profileName"
                java.lang.String r2 = r4.name
                r5.put(r1, r2)
                java.lang.String r1 = "textures"
                r5.put(r1, r0)
                java.lang.String r5 = r5.toString()
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r5 = r5.getBytes(r0)
                r0 = 2
                java.lang.String r5 = android.util.Base64.encodeToString(r5, r0)
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r2 = "name"
                r0.put(r2, r1)
                java.lang.String r1 = "value"
                r0.put(r1, r5)
                java.lang.String r1 = "signature"
                java.lang.String r5 = r6.sign(r5)
                r0.put(r1, r5)
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                java.lang.String r6 = "id"
                java.lang.String r1 = r4.uuid
                r5.put(r6, r1)
                java.lang.String r6 = r4.name
                r5.put(r2, r6)
                org.json.JSONArray r6 = new org.json.JSONArray
                r6.<init>()
                org.json.JSONArray r6 = r6.put(r0)
                java.lang.String r0 = "properties"
                r5.put(r0, r6)
                java.lang.String r5 = r5.toString()
                return r5
        }
    }

    private static final class HttpRequest {
        final byte[] body;
        final java.lang.String method;
        final java.lang.String path;
        final java.util.Map<java.lang.String, java.lang.String> query;

        HttpRequest(java.lang.String r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3, byte[] r4) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.path = r2
                r0.query = r3
                r0.body = r4
                return
        }
    }

    private interface Signer {
        java.lang.String sign(java.lang.String r1) throws java.lang.Exception;
    }

    /* JADX INFO: renamed from: $r8$lambda$-2RweA-lONhN4Ad9g3YZXOKNpZ8, reason: not valid java name */
    public static /* synthetic */ java.lang.String m561$r8$lambda$2RweAlONhN4Ad9g3YZXOKNpZ8(ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer r0, java.lang.String r1) {
            java.lang.String r0 = r0.sign(r1)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$20f71g8Nn2fMRIAVwWr0L2rWD1I(ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer r0, java.net.Socket r1) {
            r0.lambda$acceptLoop$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$TY4lNgXJ0VbH9TU2pTPhGfmQcSE(ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer r0) {
            r0.acceptLoop()
            return
    }

    public OfflineYggdrasilServer() throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = "JavaLauncher"
            java.lang.String r1 = "1.0"
            java.lang.String r2 = "JavaLauncher_Offline"
            r3.<init>(r2, r0, r1)
            return
    }

    public OfflineYggdrasilServer(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.charactersByUuid = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.charactersByName = r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r1.requestedPort = r2
            r1.serverName = r3
            r1.implementationName = r4
            r1.implementationVersion = r5
            java.lang.String r2 = "RSA"
            java.security.KeyPairGenerator r2 = java.security.KeyPairGenerator.getInstance(r2)
            r3 = 2048(0x800, float:2.87E-42)
            r2.initialize(r3)
            java.security.KeyPair r2 = r2.generateKeyPair()
            r1.keyPair = r2
            return
    }

    public OfflineYggdrasilServer(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3, r4)
            return
    }

    private void acceptLoop() {
            r3 = this;
        L0:
            boolean r0 = r3.running
            if (r0 == 0) goto L2b
            java.net.ServerSocket r0 = r3.serverSocket     // Catch: java.lang.Throwable -> L1e
            java.net.Socket r0 = r0.accept()     // Catch: java.lang.Throwable -> L1e
            java.lang.Thread r1 = new java.lang.Thread     // Catch: java.lang.Throwable -> L1e
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "JavaLauncherOfflineYggdrasilRequest"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L1e
            r0 = 1
            r1.setDaemon(r0)     // Catch: java.lang.Throwable -> L1e
            r1.start()     // Catch: java.lang.Throwable -> L1e
            goto L0
        L1e:
            r0 = move-exception
            boolean r1 = r3.running
            if (r1 == 0) goto L0
            java.lang.String r1 = "OfflineYggdrasilServer"
            java.lang.String r2 = "Accept failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            goto L0
        L2b:
            return
    }

    private void handleSocket(java.net.Socket r6) {
            r5 = this;
            java.io.InputStream r0 = r6.getInputStream()     // Catch: java.lang.Throwable -> L58
            java.io.OutputStream r1 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L4c
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$HttpRequest r2 = r5.readRequest(r0)     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L2d
            java.lang.String r2 = "text/plain; charset=utf-8"
            java.lang.String r3 = "Bad Request"
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L40
            byte[] r3 = r3.getBytes(r4)     // Catch: java.lang.Throwable -> L40
            r4 = 400(0x190, float:5.6E-43)
            r5.writeResponse(r1, r4, r2, r3)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L22
            r1.close()     // Catch: java.lang.Throwable -> L4c
        L22:
            if (r0 == 0) goto L27
            r0.close()     // Catch: java.lang.Throwable -> L58
        L27:
            if (r6 == 0) goto L2c
            r6.close()     // Catch: java.lang.Throwable -> L64
        L2c:
            return
        L2d:
            r5.route(r2, r1)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L35
            r1.close()     // Catch: java.lang.Throwable -> L4c
        L35:
            if (r0 == 0) goto L3a
            r0.close()     // Catch: java.lang.Throwable -> L58
        L3a:
            if (r6 == 0) goto L6c
            r6.close()     // Catch: java.lang.Throwable -> L64
            goto L6c
        L40:
            r2 = move-exception
            if (r1 == 0) goto L4b
            r1.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L4c
        L4b:
            throw r2     // Catch: java.lang.Throwable -> L4c
        L4c:
            r1 = move-exception
            if (r0 == 0) goto L57
            r0.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L58
        L57:
            throw r1     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            if (r6 == 0) goto L63
            r6.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r6 = move-exception
            r0.addSuppressed(r6)     // Catch: java.lang.Throwable -> L64
        L63:
            throw r0     // Catch: java.lang.Throwable -> L64
        L64:
            r6 = move-exception
            java.lang.String r0 = "OfflineYggdrasilServer"
            java.lang.String r1 = "Request failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r6)
        L6c:
            return
    }

    private java.lang.String hasJoined(java.lang.String r3) throws java.lang.Exception {
            r2 = this;
            if (r3 == 0) goto L35
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L35
        Ld:
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile> r0 = r2.charactersByName
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            java.lang.Object r3 = r0.get(r3)
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile r3 = (ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer.CharacterProfile) r3
            if (r3 == 0) goto L2b
            java.lang.String r0 = r2.rootUrl()
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$$ExternalSyntheticLambda0
            r1.<init>(r2)
            java.lang.String r3 = r3.toCompleteResponse(r0, r1)
            goto L34
        L2b:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r3 = r3.toString()
        L34:
            return r3
        L35:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r3 = r3.toString()
            return r3
    }

    private /* synthetic */ void lambda$acceptLoop$0(java.net.Socket r1) {
            r0 = this;
            r0.handleSocket(r1)
            return
    }

    private java.util.Map<java.lang.String, java.lang.String> parseQuery(java.lang.String r8) throws java.io.IOException {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r8.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L10
            return r0
        L10:
            java.lang.String r1 = "&"
            java.lang.String[] r8 = r8.split(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L19:
            if (r3 >= r1) goto L44
            r4 = r8[r3]
            r5 = 61
            int r5 = r4.indexOf(r5)
            if (r5 < 0) goto L2a
            java.lang.String r6 = r4.substring(r2, r5)
            goto L2b
        L2a:
            r6 = r4
        L2b:
            if (r5 < 0) goto L34
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)
            goto L36
        L34:
            java.lang.String r4 = ""
        L36:
            java.lang.String r5 = r7.urlDecode(r6)
            java.lang.String r4 = r7.urlDecode(r4)
            r0.put(r5, r4)
            int r3 = r3 + 1
            goto L19
        L44:
            return r0
    }

    private java.lang.String profile(java.lang.String r4) throws java.lang.Exception {
            r3 = this;
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile> r0 = r3.charactersByUuid
            java.lang.String r1 = "-"
            java.lang.String r2 = ""
            java.lang.String r4 = r4.replace(r1, r2)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            java.lang.Object r4 = r0.get(r4)
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile r4 = (ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer.CharacterProfile) r4
            if (r4 == 0) goto L26
            java.lang.String r0 = r3.rootUrl()
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$$ExternalSyntheticLambda0
            r1.<init>(r3)
            java.lang.String r4 = r4.toCompleteResponse(r0, r1)
            goto L2f
        L26:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r4 = r4.toString()
        L2f:
            return r4
    }

    private java.lang.String profiles(byte[] r7) throws java.lang.Exception {
            r6 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r7, r2)
            r0.<init>(r1)
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            r1 = 0
        L12:
            int r2 = r0.length()
            if (r1 >= r2) goto L48
            java.lang.String r2 = ""
            java.lang.String r2 = r0.optString(r1, r2)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile> r3 = r6.charactersByName
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r4)
            java.lang.Object r2 = r3.get(r2)
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile r2 = (ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer.CharacterProfile) r2
            if (r2 != 0) goto L2f
            goto L45
        L2f:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "id"
            java.lang.String r5 = r2.uuid
            r3.put(r4, r5)
            java.lang.String r4 = "name"
            java.lang.String r2 = r2.name
            r3.put(r4, r2)
            r7.put(r3)
        L45:
            int r1 = r1 + 1
            goto L12
        L48:
            java.lang.String r7 = r7.toString()
            return r7
    }

    private java.lang.String readLine(java.io.InputStream r5) throws java.io.IOException {
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.read()
            r3 = -1
            if (r2 == r3) goto L1d
            r1 = 10
            r3 = 1
            if (r2 != r1) goto L14
            r1 = r3
            goto L1d
        L14:
            r1 = 13
            if (r2 == r1) goto L1b
            r0.write(r2)
        L1b:
            r1 = r3
            goto L6
        L1d:
            if (r1 != 0) goto L27
            int r5 = r0.size()
            if (r5 != 0) goto L27
            r5 = 0
            return r5
        L27:
            java.lang.String r5 = "UTF-8"
            java.lang.String r5 = r0.toString(r5)
            return r5
    }

    private ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer.HttpRequest readRequest(java.io.InputStream r10) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = r9.readLine(r10)
            r1 = 0
            if (r0 == 0) goto Lab
            java.lang.String r2 = r0.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L13
            goto Lab
        L13:
            java.lang.String r2 = " "
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            r3 = 2
            if (r2 >= r3) goto L1e
            return r1
        L1e:
            r1 = 0
            r2 = r0[r1]
            java.lang.String r2 = r2.trim()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            r3 = 1
            r0 = r0[r3]
            java.lang.String r0 = r0.trim()
            r4 = 63
            int r4 = r0.indexOf(r4)
            if (r4 < 0) goto L46
            java.lang.String r5 = r0.substring(r1, r4)
            int r4 = r4 + r3
            java.lang.String r0 = r0.substring(r4)
            r3 = r0
            r0 = r5
            goto L48
        L46:
            java.lang.String r3 = ""
        L48:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L4d:
            java.lang.String r5 = r9.readLine(r10)
            if (r5 == 0) goto L7e
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L5a
            goto L7e
        L5a:
            r6 = 58
            int r6 = r5.indexOf(r6)
            if (r6 <= 0) goto L4d
            java.lang.String r7 = r5.substring(r1, r6)
            java.lang.String r7 = r7.trim()
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)
            java.lang.String r5 = r5.trim()
            r4.put(r7, r5)
            goto L4d
        L7e:
            java.lang.String r5 = "content-length"
            java.lang.String r6 = "0"
            java.lang.Object r4 = r4.getOrDefault(r5, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L8d
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L8d
            goto L8e
        L8d:
            r4 = r1
        L8e:
            int r4 = java.lang.Math.max(r1, r4)
            byte[] r5 = new byte[r4]
        L94:
            if (r1 >= r4) goto La1
            int r6 = r4 - r1
            int r6 = r10.read(r5, r1, r6)
            if (r6 >= 0) goto L9f
            goto La1
        L9f:
            int r1 = r1 + r6
            goto L94
        La1:
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$HttpRequest r10 = new ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$HttpRequest
            java.util.Map r1 = r9.parseQuery(r3)
            r10.<init>(r2, r0, r1, r5)
            return r10
        Lab:
            return r1
    }

    private byte[] readSkinBytes(java.io.File r5) throws java.io.IOException {
            r4 = this;
            if (r5 == 0) goto L42
            boolean r0 = r5.isFile()
            if (r0 != 0) goto L9
            goto L42
        L9:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r5)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L38
            r5.<init>()     // Catch: java.lang.Throwable -> L38
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L2e
        L17:
            int r2 = r0.read(r1)     // Catch: java.lang.Throwable -> L2e
            r3 = -1
            if (r2 == r3) goto L23
            r3 = 0
            r5.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L2e
            goto L17
        L23:
            byte[] r1 = r5.toByteArray()     // Catch: java.lang.Throwable -> L2e
            r5.close()     // Catch: java.lang.Throwable -> L38
            r0.close()
            return r1
        L2e:
            r1 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r5 = move-exception
            r1.addSuppressed(r5)     // Catch: java.lang.Throwable -> L38
        L37:
            throw r1     // Catch: java.lang.Throwable -> L38
        L38:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r0 = move-exception
            r5.addSuppressed(r0)
        L41:
            throw r5
        L42:
            r5 = 0
            return r5
    }

    private java.lang.String root() throws java.lang.Exception {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "serverName"
            java.lang.String r2 = r4.serverName
            r0.put(r1, r2)
            java.lang.String r1 = "implementationName"
            java.lang.String r2 = r4.implementationName
            r0.put(r1, r2)
            java.lang.String r1 = "implementationVersion"
            java.lang.String r2 = r4.implementationVersion
            r0.put(r1, r2)
            java.lang.String r1 = "feature.non_email_login"
            r2 = 1
            r0.put(r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.lang.String r3 = "127.0.0.1"
            org.json.JSONArray r2 = r2.put(r3)
            java.lang.String r3 = "localhost"
            org.json.JSONArray r2 = r2.put(r3)
            java.lang.String r3 = "skinDomains"
            r1.put(r3, r2)
            java.lang.String r2 = "meta"
            r1.put(r2, r0)
            java.security.KeyPair r0 = r4.keyPair
            java.security.PublicKey r0 = r0.getPublic()
            java.lang.String r0 = r4.toPemPublicKey(r0)
            java.lang.String r2 = "signaturePublickey"
            r1.put(r2, r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private java.lang.String rootUrl() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "http://127.0.0.1:"
            r0.<init>(r1)
            int r1 = r2.getPort()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void route(ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer.HttpRequest r4, java.io.OutputStream r5) throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = r4.path
            java.lang.String r1 = "/"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L12
            java.lang.String r4 = r3.root()
            r3.writeJson(r5, r4)
            return
        L12:
            java.lang.String r1 = "/status"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L22
            java.lang.String r4 = r3.status()
            r3.writeJson(r5, r4)
            return
        L22:
            java.lang.String r1 = r4.method
            java.lang.String r2 = "POST"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L3e
            java.lang.String r1 = "/api/profiles/minecraft"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3e
            byte[] r4 = r4.body
            java.lang.String r4 = r3.profiles(r4)
            r3.writeJson(r5, r4)
            return
        L3e:
            java.lang.String r1 = "/sessionserver/session/minecraft/hasJoined"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L58
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.query
            java.lang.String r0 = "username"
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r3.hasJoined(r4)
            r3.writeJson(r5, r4)
            return
        L58:
            java.lang.String r4 = r4.method
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L73
            java.lang.String r4 = "/sessionserver/session/minecraft/join"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L73
            r4 = 0
            byte[] r4 = new byte[r4]
            r0 = 204(0xcc, float:2.86E-43)
            java.lang.String r1 = "text/plain; charset=utf-8"
            r3.writeResponse(r5, r0, r1, r4)
            return
        L73:
            java.lang.String r4 = "/sessionserver/session/minecraft/profile/"
            boolean r1 = r0.startsWith(r4)
            if (r1 == 0) goto L8b
            int r4 = r4.length()
            java.lang.String r4 = r0.substring(r4)
            java.lang.String r4 = r3.profile(r4)
            r3.writeJson(r5, r4)
            return
        L8b:
            java.lang.String r4 = "/textures/"
            boolean r1 = r0.startsWith(r4)
            if (r1 == 0) goto L9f
            int r4 = r4.length()
            java.lang.String r4 = r0.substring(r4)
            r3.writeTexture(r5, r4)
            return
        L9f:
            java.lang.String r4 = "{}"
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r4.getBytes(r0)
            r0 = 404(0x194, float:5.66E-43)
            java.lang.String r1 = "application/json; charset=utf-8"
            r3.writeResponse(r5, r0, r1, r4)
            return
    }

    private java.lang.String sha256(byte[] r7) throws java.lang.Exception {
            r6 = this;
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r7 = r0.digest(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L2d
            r3 = r7[r2]
            java.util.Locale r4 = java.util.Locale.ROOT
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r5 = "%02x"
            java.lang.String r3 = java.lang.String.format(r4, r5, r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto L11
        L2d:
            java.lang.String r7 = r0.toString()
            return r7
    }

    private java.lang.String sign(java.lang.String r3) throws java.lang.Exception {
            r2 = this;
            java.lang.String r0 = "SHA1withRSA"
            java.security.Signature r0 = java.security.Signature.getInstance(r0)
            java.security.KeyPair r1 = r2.keyPair
            java.security.PrivateKey r1 = r1.getPrivate()
            r0.initSign(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r1)
            r0.update(r3)
            byte[] r3 = r0.sign()
            r0 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)
            return r3
    }

    private java.lang.String status() throws java.lang.Exception {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile> r1 = r3.charactersByUuid
            int r1 = r1.size()
            java.lang.String r2 = "user.count"
            r0.put(r2, r1)
            java.lang.String r1 = "token.count"
            r2 = 0
            r0.put(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String toPemPublicKey(java.security.PublicKey r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-----BEGIN PUBLIC KEY-----\n"
            r0.<init>(r1)
            byte[] r3 = r3.getEncoded()
            r1 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\n-----END PUBLIC KEY-----"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private java.lang.String urlDecode(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r0)
            return r2
    }

    private void writeJson(java.io.OutputStream r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r4.getBytes(r0)
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = "application/json; charset=utf-8"
            r2.writeResponse(r3, r0, r1, r4)
            return
    }

    private void writeResponse(java.io.OutputStream r7, int r8, java.lang.String r9, byte[] r10) throws java.io.IOException {
            r6 = this;
            java.lang.String r5 = ""
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.writeResponse(r1, r2, r3, r4, r5)
            return
    }

    private void writeResponse(java.io.OutputStream r4, int r5, java.lang.String r6, byte[] r7, java.lang.String r8) throws java.io.IOException {
            r3 = this;
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = "OK"
            if (r5 != r0) goto L7
            goto L1b
        L7:
            r0 = 204(0xcc, float:2.86E-43)
            if (r5 != r0) goto Le
            java.lang.String r1 = "No Content"
            goto L1b
        Le:
            r0 = 400(0x190, float:5.6E-43)
            if (r5 != r0) goto L15
            java.lang.String r1 = "Bad Request"
            goto L1b
        L15:
            r0 = 404(0x194, float:5.66E-43)
            if (r5 != r0) goto L1b
            java.lang.String r1 = "Not Found"
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP/1.1 "
            r0.<init>(r2)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = " "
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r0 = "\r\nConnection: close\r\nContent-Type: "
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "\r\n"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r6 = "Content-Length: "
            java.lang.StringBuilder r5 = r5.append(r6)
            int r6 = r7.length
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "\r\n\r\n"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r5.getBytes(r6)
            r4.write(r5)
            r4.write(r7)
            r4.flush()
            return
    }

    private void writeTexture(java.io.OutputStream r10, java.lang.String r11) throws java.lang.Exception {
            r9 = this;
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile> r0 = r9.charactersByUuid
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile r1 = (ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer.CharacterProfile) r1
            java.lang.String r2 = r1.skinHash
            if (r2 == 0) goto La
            java.lang.String r2 = r1.skinHash
            boolean r2 = r2.equalsIgnoreCase(r11)
            if (r2 == 0) goto La
            byte[] r2 = r1.skinBytes
            if (r2 == 0) goto La
            byte[] r7 = r1.skinBytes
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cache-Control: max-age=2592000, public\r\nEtag: \""
            r0.<init>(r1)
            java.lang.StringBuilder r11 = r0.append(r11)
            java.lang.String r0 = "\"\r\n"
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r8 = r11.toString()
            r5 = 200(0xc8, float:2.8E-43)
            java.lang.String r6 = "image/png"
            r3 = r9
            r4 = r10
            r3.writeResponse(r4, r5, r6, r7, r8)
            return
        L47:
            java.lang.String r11 = "Not Found"
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r11 = r11.getBytes(r0)
            r0 = 404(0x194, float:5.66E-43)
            java.lang.String r1 = "text/plain; charset=utf-8"
            r9.writeResponse(r10, r0, r1, r11)
            return
    }

    public void addCharacter(java.lang.String r7, java.lang.String r8, java.io.File r9, ca.dnamobile.javalauncher.skin.SkinModelType r10) throws java.lang.Exception {
            r6 = this;
            byte[] r4 = r6.readSkinBytes(r9)
            if (r4 == 0) goto Lb
            java.lang.String r9 = r6.sha256(r4)
            goto Lc
        Lb:
            r9 = 0
        Lc:
            r3 = r9
            java.lang.String r9 = "-"
            java.lang.String r0 = ""
            java.lang.String r7 = r7.replace(r9, r0)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r1 = r7.toLowerCase(r9)
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile r7 = new ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile
            r0 = r7
            r2 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile> r8 = r6.charactersByUuid
            java.lang.String r9 = r7.uuid
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r10)
            r8.put(r9, r7)
            java.util.Map<java.lang.String, ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$CharacterProfile> r8 = r6.charactersByName
            java.lang.String r9 = r7.name
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r10)
            r8.put(r9, r7)
            return
    }

    public int getPort() {
            r2 = this;
            java.net.ServerSocket r0 = r2.serverSocket
            boolean r1 = r2.running
            if (r1 == 0) goto L14
            if (r0 == 0) goto L14
            boolean r1 = r0.isClosed()
            if (r1 == 0) goto Lf
            goto L14
        Lf:
            int r0 = r0.getLocalPort()
            return r0
        L14:
            r0 = -1
            return r0
    }

    public synchronized void start() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.running     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.net.ServerSocket r0 = new java.net.ServerSocket     // Catch: java.lang.Throwable -> L33
            int r1 = r4.requestedPort     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "127.0.0.1"
            java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)     // Catch: java.lang.Throwable -> L33
            r3 = 50
            r0.<init>(r1, r3, r2)     // Catch: java.lang.Throwable -> L33
            r4.serverSocket = r0     // Catch: java.lang.Throwable -> L33
            r0 = 1
            r4.running = r0     // Catch: java.lang.Throwable -> L33
            java.lang.Thread r1 = new java.lang.Thread     // Catch: java.lang.Throwable -> L33
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$$ExternalSyntheticLambda2 r2 = new ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> L33
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "JavaLauncherOfflineYggdrasilServer"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L33
            r4.serverThread = r1     // Catch: java.lang.Throwable -> L33
            r1.setDaemon(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.Thread r0 = r4.serverThread     // Catch: java.lang.Throwable -> L33
            r0.start()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r4)
            return
        L33:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
            throw r0
    }

    public synchronized void stop() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.running = r0     // Catch: java.lang.Throwable -> L10
            java.net.ServerSocket r0 = r1.serverSocket     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
        Lb:
            r0 = 0
            r1.serverSocket = r0     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return
        L10:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }
}
