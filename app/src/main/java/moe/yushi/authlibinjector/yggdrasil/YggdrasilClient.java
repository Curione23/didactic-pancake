package moe.yushi.authlibinjector.yggdrasil;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/yggdrasil/YggdrasilClient.class */
public class YggdrasilClient {
    private moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider apiProvider;
    private java.net.Proxy proxy;

    public YggdrasilClient(moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public YggdrasilClient(moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider r4, java.net.Proxy r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.apiProvider = r1
            r0 = r3
            r1 = r5
            r0.proxy = r1
            return
    }

    public java.util.Map<java.lang.String, java.util.UUID> queryUUIDs(java.util.Set<java.lang.String> r7) throws java.io.UncheckedIOException {
            r6 = this;
            java.lang.String r0 = "POST"
            r1 = r6
            moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider r1 = r1.apiProvider     // Catch: java.io.IOException -> L25
            java.lang.String r1 = r1.queryUUIDsByNames()     // Catch: java.io.IOException -> L25
            r2 = r7
            java.lang.String r2 = moe.yushi.authlibinjector.internal.org.json.simple.JSONArray.toJSONString(r2)     // Catch: java.io.IOException -> L25
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.io.IOException -> L25
            byte[] r2 = r2.getBytes(r3)     // Catch: java.io.IOException -> L25
            java.lang.String r3 = "application/json; charset=utf-8"
            r4 = r6
            java.net.Proxy r4 = r4.proxy     // Catch: java.io.IOException -> L25
            byte[] r0 = moe.yushi.authlibinjector.util.IOUtils.http(r0, r1, r2, r3, r4)     // Catch: java.io.IOException -> L25
            java.lang.String r0 = moe.yushi.authlibinjector.util.IOUtils.asString(r0)     // Catch: java.io.IOException -> L25
            r8 = r0
            goto L2f
        L25:
            r9 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L2f:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Query UUIDs of "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " at ["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider r2 = r2.apiProvider
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "], response: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r8
            java.lang.Object r0 = moe.yushi.authlibinjector.util.JsonUtils.parseJson(r0)
            moe.yushi.authlibinjector.internal.org.json.simple.JSONArray r0 = moe.yushi.authlibinjector.util.JsonUtils.asJsonArray(r0)
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L71:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lad
            r0 = r10
            java.lang.Object r0 = r0.next()
            r11 = r0
            r0 = r11
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = moe.yushi.authlibinjector.util.JsonUtils.asJsonObject(r0)
            r12 = r0
            r0 = r9
            r1 = r12
            java.lang.String r2 = "name"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = moe.yushi.authlibinjector.util.JsonUtils.asJsonString(r1)
            r2 = r6
            r3 = r12
            java.lang.String r4 = "id"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = moe.yushi.authlibinjector.util.JsonUtils.asJsonString(r3)
            java.util.UUID r2 = r2.parseUnsignedUUID(r3)
            java.lang.Object r0 = r0.put(r1, r2)
            goto L71
        Lad:
            r0 = r9
            return r0
    }

    public java.util.Optional<java.util.UUID> queryUUID(java.lang.String r4) throws java.io.UncheckedIOException {
            r3 = this;
            r0 = r3
            r1 = r4
            java.util.Set r1 = java.util.Collections.singleton(r1)
            java.util.Map r0 = r0.queryUUIDs(r1)
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.util.UUID r0 = (java.util.UUID) r0
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            return r0
    }

    public java.util.Optional<moe.yushi.authlibinjector.yggdrasil.GameProfile> queryProfile(java.util.UUID r5, boolean r6) throws java.io.UncheckedIOException {
            r4 = this;
            r0 = r4
            moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider r0 = r0.apiProvider
            r1 = r5
            java.lang.String r0 = r0.queryProfile(r1)
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "?unsigned=false"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r0
        L23:
            java.lang.String r0 = "GET"
            r1 = r7
            r2 = r4
            java.net.Proxy r2 = r2.proxy     // Catch: java.io.IOException -> L35
            byte[] r0 = moe.yushi.authlibinjector.util.IOUtils.http(r0, r1, r2)     // Catch: java.io.IOException -> L35
            java.lang.String r0 = moe.yushi.authlibinjector.util.IOUtils.asString(r0)     // Catch: java.io.IOException -> L35
            r8 = r0
            goto L41
        L35:
            r9 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L41:
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L77
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Query profile of ["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "] at ["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider r2 = r2.apiProvider
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "], not found"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        L77:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Query profile of ["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "] at ["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider r2 = r2.apiProvider
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "], response: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            r0 = r4
            r1 = r8
            java.lang.Object r1 = moe.yushi.authlibinjector.util.JsonUtils.parseJson(r1)
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r1 = moe.yushi.authlibinjector.util.JsonUtils.asJsonObject(r1)
            moe.yushi.authlibinjector.yggdrasil.GameProfile r0 = r0.parseGameProfile(r1)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
    }

    private moe.yushi.authlibinjector.yggdrasil.GameProfile parseGameProfile(moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r6) {
            r5 = this;
            moe.yushi.authlibinjector.yggdrasil.GameProfile r0 = new moe.yushi.authlibinjector.yggdrasil.GameProfile
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = r6
            java.lang.String r3 = "id"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = moe.yushi.authlibinjector.util.JsonUtils.asJsonString(r2)
            java.util.UUID r1 = r1.parseUnsignedUUID(r2)
            r0.id = r1
            r0 = r7
            r1 = r6
            java.lang.String r2 = "name"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = moe.yushi.authlibinjector.util.JsonUtils.asJsonString(r1)
            r0.name = r1
            r0 = r7
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = r1
            r2.<init>()
            r0.properties = r1
            r0 = r6
            java.lang.String r1 = "properties"
            java.lang.Object r0 = r0.get(r1)
            moe.yushi.authlibinjector.internal.org.json.simple.JSONArray r0 = moe.yushi.authlibinjector.util.JsonUtils.asJsonArray(r0)
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L3e:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La0
            r0 = r8
            java.lang.Object r0 = r0.next()
            r9 = r0
            r0 = r9
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = (moe.yushi.authlibinjector.internal.org.json.simple.JSONObject) r0
            r10 = r0
            moe.yushi.authlibinjector.yggdrasil.GameProfile$PropertyValue r0 = new moe.yushi.authlibinjector.yggdrasil.GameProfile$PropertyValue
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            r1 = r10
            java.lang.String r2 = "value"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = moe.yushi.authlibinjector.util.JsonUtils.asJsonString(r1)
            r0.value = r1
            r0 = r10
            java.lang.String r1 = "signature"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L87
            r0 = r11
            r1 = r10
            java.lang.String r2 = "signature"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = moe.yushi.authlibinjector.util.JsonUtils.asJsonString(r1)
            r0.signature = r1
        L87:
            r0 = r7
            java.util.Map<java.lang.String, moe.yushi.authlibinjector.yggdrasil.GameProfile$PropertyValue> r0 = r0.properties
            r1 = r10
            java.lang.String r2 = "name"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = moe.yushi.authlibinjector.util.JsonUtils.asJsonString(r1)
            r2 = r11
            java.lang.Object r0 = r0.put(r1, r2)
            goto L3e
        La0:
            r0 = r7
            return r0
    }

    private java.util.UUID parseUnsignedUUID(java.lang.String r3) throws java.io.UncheckedIOException {
            r2 = this;
            r0 = r3
            java.util.UUID r0 = moe.yushi.authlibinjector.util.UUIDUtils.fromUnsignedUUID(r0)     // Catch: java.lang.IllegalArgumentException -> L5
            return r0
        L5:
            r4 = move-exception
            r0 = r4
            java.lang.String r0 = r0.getMessage()
            java.io.UncheckedIOException r0 = moe.yushi.authlibinjector.util.IOUtils.newUncheckedIOException(r0)
            throw r0
    }
}
