package moe.yushi.authlibinjector.yggdrasil;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/yggdrasil/YggdrasilResponseBuilder.class */
public final class YggdrasilResponseBuilder {
    private YggdrasilResponseBuilder() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String queryUUIDs(java.util.Map<java.lang.String, java.util.UUID> r3) {
            moe.yushi.authlibinjector.internal.org.json.simple.JSONArray r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONArray
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            r1 = r4
            java.lang.String r1 = (v1, v2) -> { // java.util.function.BiConsumer.accept(java.lang.Object, java.lang.Object):void
                lambda$queryUUIDs$0(r1, v1, v2);
            }
            r0.forEach(r1)
            r0 = r4
            java.lang.String r0 = r0.toJSONString()
            return r0
    }

    public static java.lang.String queryProfile(moe.yushi.authlibinjector.yggdrasil.GameProfile r4, boolean r5) {
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONObject
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "id"
            r2 = r4
            java.util.UUID r2 = r2.id
            java.lang.String r2 = moe.yushi.authlibinjector.util.UUIDUtils.toUnsignedUUID(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            java.lang.String r1 = "name"
            r2 = r4
            java.lang.String r2 = r2.name
            java.lang.Object r0 = r0.put(r1, r2)
            moe.yushi.authlibinjector.internal.org.json.simple.JSONArray r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONArray
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r4
            java.util.Map<java.lang.String, moe.yushi.authlibinjector.yggdrasil.GameProfile$PropertyValue> r0 = r0.properties
            r1 = r5
            r2 = r7
            java.lang.String r1 = (v2, v3) -> { // java.util.function.BiConsumer.accept(java.lang.Object, java.lang.Object):void
                lambda$queryProfile$1(r1, r2, v2, v3);
            }
            r0.forEach(r1)
            r0 = r6
            java.lang.String r1 = "properties"
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            java.lang.String r0 = r0.toJSONString()
            return r0
    }

    private static /* synthetic */ void lambda$queryProfile$1(boolean r4, moe.yushi.authlibinjector.internal.org.json.simple.JSONArray r5, java.lang.String r6, moe.yushi.authlibinjector.yggdrasil.GameProfile.PropertyValue r7) {
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONObject
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "name"
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r8
            java.lang.String r1 = "value"
            r2 = r7
            java.lang.String r2 = r2.value
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            if (r0 == 0) goto L35
            r0 = r7
            java.lang.String r0 = r0.signature
            if (r0 == 0) goto L35
            r0 = r8
            java.lang.String r1 = "signature"
            r2 = r7
            java.lang.String r2 = r2.signature
            java.lang.Object r0 = r0.put(r1, r2)
        L35:
            r0 = r5
            r1 = r8
            boolean r0 = r0.add(r1)
            return
    }

    private static /* synthetic */ void lambda$queryUUIDs$0(moe.yushi.authlibinjector.internal.org.json.simple.JSONArray r4, java.lang.String r5, java.util.UUID r6) {
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = new moe.yushi.authlibinjector.internal.org.json.simple.JSONObject
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "id"
            r2 = r6
            java.lang.String r2 = moe.yushi.authlibinjector.util.UUIDUtils.toUnsignedUUID(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "name"
            r2 = r5
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            r1 = r7
            boolean r0 = r0.add(r1)
            return
    }
}
