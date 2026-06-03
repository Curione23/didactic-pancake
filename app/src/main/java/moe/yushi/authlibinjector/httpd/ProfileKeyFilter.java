package moe.yushi.authlibinjector.httpd;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/httpd/ProfileKeyFilter.class */
public class ProfileKeyFilter implements moe.yushi.authlibinjector.httpd.URLFilter {
    public ProfileKeyFilter() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // moe.yushi.authlibinjector.httpd.URLFilter
    public boolean canHandle(java.lang.String r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "api.minecraftservices.com"
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // moe.yushi.authlibinjector.httpd.URLFilter
    public java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> handle(java.lang.String r5, java.lang.String r6, moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession r7) throws java.io.IOException {
            r4 = this;
            r0 = r5
            java.lang.String r1 = "api.minecraftservices.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            r0 = r6
            java.lang.String r1 = "/player/certificates"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            r0 = r7
            java.lang.String r0 = r0.getMethod()
            java.lang.String r1 = "POST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.OK
            java.lang.String r1 = "application/json; charset=utf-8"
            r2 = r4
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r2 = r2.makeDummyResponse()
            java.lang.String r2 = r2.toJSONString()
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L33:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    private moe.yushi.authlibinjector.internal.org.json.simple.JSONObject makeDummyResponse() {
            r5 = this;
            java.lang.String r0 = "RSA"
            java.security.KeyPairGenerator r0 = java.security.KeyPairGenerator.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L9
            r6 = r0
            goto L13
        L9:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r6
            r1 = 2048(0x800, float:2.87E-42)
            r0.initialize(r1)
            r0 = r6
            java.security.KeyPair r0 = r0.generateKeyPair()
            r7 = r0
            r0 = 76
            java.lang.String r1 = "\n"
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r2)
            java.util.Base64$Encoder r0 = java.util.Base64.getMimeEncoder(r0, r1)
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "-----BEGIN RSA PUBLIC KEY-----\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = r7
            java.security.PublicKey r2 = r2.getPublic()
            byte[] r2 = r2.getEncoded()
            java.lang.String r1 = r1.encodeToString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n-----END RSA PUBLIC KEY-----\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "-----BEGIN RSA PRIVATE KEY-----\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = r7
            java.security.PrivateKey r2 = r2.getPrivate()
            byte[] r2 = r2.getEncoded()
            java.lang.String r1 = r1.encodeToString(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n-----END RSA PRIVATE KEY-----\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10 = r0
            java.time.Instant r0 = java.time.Instant.now()
            r11 = r0
            r0 = r11
            r1 = 48
            java.time.temporal.ChronoUnit r2 = java.time.temporal.ChronoUnit.HOURS
            java.time.Instant r0 = r0.plus(r1, r2)
            r12 = r0
            r0 = r11
            r1 = 36
            java.time.temporal.ChronoUnit r2 = java.time.temporal.ChronoUnit.HOURS
            java.time.Instant r0 = r0.plus(r1, r2)
            r13 = r0
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONObject
            r1 = r0
            r1.<init>()
            r14 = r0
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONObject
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r15
            java.lang.String r1 = "privateKey"
            r2 = r10
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r15
            java.lang.String r1 = "publicKey"
            r2 = r9
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.lang.String r1 = "keyPair"
            r2 = r15
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.lang.String r1 = "publicKeySignature"
            java.lang.String r2 = "AA=="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.lang.String r1 = "publicKeySignatureV2"
            java.lang.String r2 = "AA=="
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.lang.String r1 = "expiresAt"
            java.time.format.DateTimeFormatter r2 = java.time.format.DateTimeFormatter.ISO_INSTANT
            r3 = r12
            java.lang.String r2 = r2.format(r3)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.lang.String r1 = "refreshedAfter"
            java.time.format.DateTimeFormatter r2 = java.time.format.DateTimeFormatter.ISO_INSTANT
            r3 = r13
            java.lang.String r2 = r2.format(r3)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            return r0
    }
}
