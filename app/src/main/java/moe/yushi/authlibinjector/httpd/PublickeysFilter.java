package moe.yushi.authlibinjector.httpd;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/httpd/PublickeysFilter.class */
public class PublickeysFilter implements moe.yushi.authlibinjector.httpd.URLFilter {
    public PublickeysFilter() {
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
            java.lang.String r1 = "/publickeys"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            r0 = r7
            java.lang.String r0 = r0.getMethod()
            java.lang.String r1 = "GET"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.OK
            java.lang.String r1 = "application/json; charset=utf-8"
            r2 = r4
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r2 = r2.makePublickeysResponse()
            java.lang.String r2 = r2.toJSONString()
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L33:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    private moe.yushi.authlibinjector.internal.org.json.simple.JSONObject makePublickeysResponse() {
            r5 = this;
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONObject
            r1 = r0
            r1.<init>()
            r6 = r0
            moe.yushi.authlibinjector.internal.org.json.simple.JSONArray r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONArray
            r1 = r0
            r1.<init>()
            r7 = r0
            moe.yushi.authlibinjector.internal.org.json.simple.JSONArray r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONArray
            r1 = r0
            r1.<init>()
            r8 = r0
            java.util.List<java.security.PublicKey> r0 = moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit.PUBLIC_KEYS
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L22:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L67
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.security.PublicKey r0 = (java.security.PublicKey) r0
            r10 = r0
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONObject
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            java.lang.String r1 = "publicKey"
            java.util.Base64$Encoder r2 = java.util.Base64.getEncoder()
            r3 = r10
            byte[] r3 = r3.getEncoded()
            java.lang.String r2 = r2.encodeToString(r3)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            r1 = r11
            boolean r0 = r0.add(r1)
            r0 = r8
            r1 = r11
            boolean r0 = r0.add(r1)
            goto L22
        L67:
            r0 = r6
            java.lang.String r1 = "profilePropertyKeys"
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            java.lang.String r1 = "playerCertificateKeys"
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            return r0
    }
}
