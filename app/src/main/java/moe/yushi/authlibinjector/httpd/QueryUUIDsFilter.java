package moe.yushi.authlibinjector.httpd;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/httpd/QueryUUIDsFilter.class */
public class QueryUUIDsFilter implements moe.yushi.authlibinjector.httpd.URLFilter {
    private moe.yushi.authlibinjector.yggdrasil.YggdrasilClient mojangClient;
    private moe.yushi.authlibinjector.yggdrasil.YggdrasilClient customClient;
    private static final int MSB_MASK = 32768;
    static final java.lang.String NAME_SUFFIX = "@mojang";

    public QueryUUIDsFilter(moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r4, moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r5) {
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
            java.lang.String r1 = "api.mojang.com"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12
            r0 = r4
            java.lang.String r1 = "api.minecraftservices.com"
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
    public java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> handle(java.lang.String r6, java.lang.String r7, moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession r8) throws java.io.IOException {
            r5 = this;
            r0 = r6
            java.lang.String r1 = "api.mojang.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            r0 = r7
            java.lang.String r1 = "/profiles/minecraft"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            r0 = r8
            java.lang.String r0 = r0.getMethod()
            java.lang.String r1 = "POST"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
        L20:
            r0 = r6
            java.lang.String r1 = "api.minecraftservices.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = r7
            java.lang.String r1 = "/minecraft/profile/lookup/bulk/byname"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = r8
            java.lang.String r0 = r0.getMethod()
            java.lang.String r1 = "POST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
        L40:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r8
            java.io.InputStream r0 = r0.getInputStream()
            byte[] r0 = moe.yushi.authlibinjector.util.IOUtils.asBytes(r0)
            java.lang.String r0 = moe.yushi.authlibinjector.util.IOUtils.asString(r0)
            java.lang.Object r0 = moe.yushi.authlibinjector.util.JsonUtils.parseJson(r0)
            moe.yushi.authlibinjector.internal.org.json.simple.JSONArray r0 = moe.yushi.authlibinjector.util.JsonUtils.asJsonArray(r0)
            r1 = r9
            java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> r1 = (v1) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$handle$0(r1, v1);
            }
            r0.forEach(r1)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.OK
            java.lang.String r1 = "application/json; charset=utf-8"
            r2 = r5
            r3 = r9
            java.util.Map r2 = r2.performQuery(r3)
            java.lang.String r2 = moe.yushi.authlibinjector.yggdrasil.YggdrasilResponseBuilder.queryUUIDs(r2)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L7a:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    private java.util.Map<java.lang.String, java.util.UUID> performQuery(java.util.Set<java.lang.String> r5) {
            r4 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = r0
            r1.<init>()
            r6 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            r1 = r7
            r2 = r6
            java.util.Map<java.lang.String, java.util.UUID> r1 = (v2) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$performQuery$1(r1, r2, v2);
            }
            r0.forEach(r1)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3e
            r0 = r8
            r1 = r4
            moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r1 = r1.customClient
            r2 = r6
            java.util.Map r1 = r1.queryUUIDs(r2)
            r0.putAll(r1)
        L3e:
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5b
            r0 = r4
            moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r0 = r0.mojangClient
            r1 = r7
            java.util.Map r0 = r0.queryUUIDs(r1)
            r1 = r8
            java.util.Map<java.lang.String, java.util.UUID> r1 = (v1, v2) -> { // java.util.function.BiConsumer.accept(java.lang.Object, java.lang.Object):void
                lambda$performQuery$2(r1, v1, v2);
            }
            r0.forEach(r1)
        L5b:
            r0 = r8
            return r0
    }

    static java.util.UUID maskUUID(java.util.UUID r7) {
            r0 = r7
            boolean r0 = isMaskedUUID(r0)
            if (r0 == 0) goto L20
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "UUID already masked: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
        L20:
            java.util.UUID r0 = new java.util.UUID
            r1 = r0
            r2 = r7
            long r2 = r2.getMostSignificantBits()
            r3 = 32768(0x8000, double:1.61895E-319)
            long r2 = r2 | r3
            r3 = r7
            long r3 = r3.getLeastSignificantBits()
            r1.<init>(r2, r3)
            return r0
    }

    static boolean isMaskedUUID(java.util.UUID r5) {
            r0 = r5
            long r0 = r0.getMostSignificantBits()
            r1 = 32768(0x8000, double:1.61895E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    static java.util.UUID unmaskUUID(java.util.UUID r7) {
            java.util.UUID r0 = new java.util.UUID
            r1 = r0
            r2 = r7
            long r2 = r2.getMostSignificantBits()
            r3 = -32769(0xffffffffffff7fff, double:NaN)
            long r2 = r2 & r3
            r3 = r7
            long r3 = r3.getLeastSignificantBits()
            r1.<init>(r2, r3)
            return r0
    }

    private static /* synthetic */ void lambda$performQuery$2(java.util.Map r4, java.lang.String r5, java.util.UUID r6) {
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "@mojang"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r6
            java.util.UUID r2 = maskUUID(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    private static /* synthetic */ void lambda$performQuery$1(java.util.Set r6, java.util.Set r7, java.lang.String r8) {
            r0 = r8
            java.lang.String r1 = "@mojang"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L22
            r0 = r6
            r1 = r8
            r2 = 0
            r3 = r8
            int r3 = r3.length()
            java.lang.String r4 = "@mojang"
            int r4 = r4.length()
            int r3 = r3 - r4
            java.lang.String r1 = r1.substring(r2, r3)
            boolean r0 = r0.add(r1)
            goto L2a
        L22:
            r0 = r7
            r1 = r8
            boolean r0 = r0.add(r1)
        L2a:
            return
    }

    private static /* synthetic */ void lambda$handle$0(java.util.Set r3, java.lang.Object r4) {
            r0 = r3
            r1 = r4
            java.lang.String r1 = moe.yushi.authlibinjector.util.JsonUtils.asJsonString(r1)
            boolean r0 = r0.add(r1)
            return
    }
}
