package moe.yushi.authlibinjector.httpd;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/httpd/AntiFeaturesFilter.class */
public class AntiFeaturesFilter implements moe.yushi.authlibinjector.httpd.URLFilter {
    private static final java.lang.String RESPONSE_PRIVILEGES = "{\"privileges\":{\"onlineChat\":{\"enabled\":true},\"multiplayerServer\":{\"enabled\":true},\"multiplayerRealms\":{\"enabled\":true},\"telemetry\":{\"enabled\":false}}}";
    private static final java.lang.String RESPONSE_PLAYER_ATTRIBUTES = "{\"privileges\":{\"multiplayerRealms\":{\"enabled\":true},\"multiplayerServer\":{\"enabled\":true},\"onlineChat\":{\"enabled\":true},\"telemetry\":{\"enabled\":false}},\"profanityFilterPreferences\":{\"profanityFilterOn\":false}}";
    private static final java.lang.String RESPONSE_PRIVACY_BLOCKLIST = "{\"blockedProfiles\":[]}";

    public AntiFeaturesFilter() {
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
            if (r0 != 0) goto L12
            r0 = r4
            java.lang.String r1 = "sessionserver.mojang.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
        L12:
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    @Override // moe.yushi.authlibinjector.httpd.URLFilter
    public java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> handle(java.lang.String r5, java.lang.String r6, moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession r7) throws java.io.IOException {
            r4 = this;
            r0 = r5
            java.lang.String r1 = "api.minecraftservices.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            r0 = r6
            java.lang.String r1 = "/privileges"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            r0 = r7
            java.lang.String r0 = r0.getMethod()
            java.lang.String r1 = "GET"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.OK
            java.lang.String r1 = "application/json; charset=utf-8"
            java.lang.String r2 = "{\"privileges\":{\"onlineChat\":{\"enabled\":true},\"multiplayerServer\":{\"enabled\":true},\"multiplayerRealms\":{\"enabled\":true},\"telemetry\":{\"enabled\":false}}}"
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L2e:
            r0 = r5
            java.lang.String r1 = "api.minecraftservices.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5c
            r0 = r6
            java.lang.String r1 = "/player/attributes"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5c
            r0 = r7
            java.lang.String r0 = r0.getMethod()
            java.lang.String r1 = "GET"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5c
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.OK
            java.lang.String r1 = "application/json; charset=utf-8"
            java.lang.String r2 = "{\"privileges\":{\"multiplayerRealms\":{\"enabled\":true},\"multiplayerServer\":{\"enabled\":true},\"onlineChat\":{\"enabled\":true},\"telemetry\":{\"enabled\":false}},\"profanityFilterPreferences\":{\"profanityFilterOn\":false}}"
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L5c:
            r0 = r5
            java.lang.String r1 = "api.minecraftservices.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8a
            r0 = r6
            java.lang.String r1 = "/privacy/blocklist"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8a
            r0 = r7
            java.lang.String r0 = r0.getMethod()
            java.lang.String r1 = "GET"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8a
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.OK
            java.lang.String r1 = "application/json; charset=utf-8"
            java.lang.String r2 = "{\"blockedProfiles\":[]}"
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L8a:
            r0 = r5
            java.lang.String r1 = "sessionserver.mojang.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb8
            r0 = r6
            java.lang.String r1 = "/blockedservers"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb8
            r0 = r7
            java.lang.String r0 = r0.getMethod()
            java.lang.String r1 = "GET"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb8
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_FOUND
            java.lang.String r1 = "text/plain; charset=utf-8"
            java.lang.String r2 = ""
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        Lb8:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }
}
