package moe.yushi.authlibinjector.httpd;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/httpd/QueryProfileFilter.class */
public class QueryProfileFilter implements moe.yushi.authlibinjector.httpd.URLFilter {
    private static final java.util.regex.Pattern PATH_REGEX = null;
    private moe.yushi.authlibinjector.yggdrasil.YggdrasilClient mojangClient;
    private moe.yushi.authlibinjector.yggdrasil.YggdrasilClient customClient;

    public QueryProfileFilter(moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r4, moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.mojangClient = r1
            r0 = r3
            r1 = r5
            r0.customClient = r1
            return
    }

    @Override // moe.yushi.authlibinjector.httpd.URLFilter
    public boolean canHandle(java.lang.String r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "sessionserver.mojang.com"
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // moe.yushi.authlibinjector.httpd.URLFilter
    public java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> handle(java.lang.String r6, java.lang.String r7, moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession r8) throws java.io.IOException {
            r5 = this;
            r0 = r6
            java.lang.String r1 = "sessionserver.mojang.com"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        Ld:
            java.util.regex.Pattern r0 = moe.yushi.authlibinjector.httpd.QueryProfileFilter.PATH_REGEX
            r1 = r7
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r9 = r0
            r0 = r9
            boolean r0 = r0.find()
            if (r0 != 0) goto L22
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        L22:
            r0 = r9
            java.lang.String r1 = "uuid"
            java.lang.String r0 = r0.group(r1)     // Catch: java.lang.IllegalArgumentException -> L31
            java.util.UUID r0 = moe.yushi.authlibinjector.util.UUIDUtils.fromUnsignedUUID(r0)     // Catch: java.lang.IllegalArgumentException -> L31
            r10 = r0
            goto L3f
        L31:
            r11 = move-exception
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NO_CONTENT
            r1 = 0
            r2 = 0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L3f:
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.Map r0 = r0.getParameters()
            java.lang.String r1 = "unsigned"
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L6f
            r0 = r12
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "false"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6f
            r0 = 1
            r11 = r0
        L6f:
            r0 = r10
            boolean r0 = moe.yushi.authlibinjector.httpd.QueryUUIDsFilter.isMaskedUUID(r0)
            if (r0 == 0) goto L96
            r0 = r5
            moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r0 = r0.mojangClient
            r1 = r10
            java.util.UUID r1 = moe.yushi.authlibinjector.httpd.QueryUUIDsFilter.unmaskUUID(r1)
            r2 = r11
            java.util.Optional r0 = r0.queryProfile(r1, r2)
            r13 = r0
            r0 = r13
            r1 = r10
            java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> r1 = (v1) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$handle$0(r1, v1);
            }
            r0.ifPresent(r1)
            goto La3
        L96:
            r0 = r5
            moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r0 = r0.customClient
            r1 = r10
            r2 = r11
            java.util.Optional r0 = r0.queryProfile(r1, r2)
            r13 = r0
        La3:
            r0 = r13
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto Lc3
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.OK
            r1 = 0
            r2 = r13
            java.lang.Object r2 = r2.get()
            moe.yushi.authlibinjector.yggdrasil.GameProfile r2 = (moe.yushi.authlibinjector.yggdrasil.GameProfile) r2
            r3 = r11
            java.lang.String r2 = moe.yushi.authlibinjector.yggdrasil.YggdrasilResponseBuilder.queryProfile(r2, r3)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        Lc3:
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NO_CONTENT
            r1 = 0
            r2 = 0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
    }

    private static /* synthetic */ void lambda$handle$0(java.util.UUID r4, moe.yushi.authlibinjector.yggdrasil.GameProfile r5) {
            r0 = r5
            r1 = r4
            r0.id = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            r2 = r1; r1 = r0; r0 = r2; 
            java.lang.String r2 = r2.name
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "@mojang"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.name = r1
            return
    }

    static {
            java.lang.String r0 = "^/session/minecraft/profile/(?<uuid>[0-9a-f]{32})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            moe.yushi.authlibinjector.httpd.QueryProfileFilter.PATH_REGEX = r0
            return
    }
}
