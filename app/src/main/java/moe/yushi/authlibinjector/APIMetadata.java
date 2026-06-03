package moe.yushi.authlibinjector;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/APIMetadata.class */
public class APIMetadata {
    private java.lang.String apiRoot;
    private java.util.List<java.lang.String> skinDomains;
    private java.util.Optional<java.security.PublicKey> decodedPublickey;
    private java.util.Map<java.lang.String, java.lang.Object> meta;

    public static moe.yushi.authlibinjector.APIMetadata parse(java.lang.String r7, java.lang.String r8) throws java.io.UncheckedIOException {
            r0 = r8
            java.lang.Object r0 = moe.yushi.authlibinjector.util.JsonUtils.parseJson(r0)
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = moe.yushi.authlibinjector.util.JsonUtils.asJsonObject(r0)
            r9 = r0
            r0 = r9
            java.lang.String r1 = "skinDomains"
            java.lang.Object r0 = r0.get(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            moe.yushi.authlibinjector.APIMetadata r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$parse$0(v0);
            }
            java.util.Optional r0 = r0.map(r1)
            java.util.List r1 = java.util.Collections.emptyList()
            java.lang.Object r0 = r0.orElse(r1)
            java.util.List r0 = (java.util.List) r0
            r10 = r0
            r0 = r9
            java.lang.String r1 = "signaturePublickey"
            java.lang.Object r0 = r0.get(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            moe.yushi.authlibinjector.APIMetadata r1 = moe.yushi.authlibinjector.util.JsonUtils::asJsonString
            java.util.Optional r0 = r0.map(r1)
            moe.yushi.authlibinjector.APIMetadata r1 = moe.yushi.authlibinjector.util.KeyUtils::parseSignaturePublicKey
            java.util.Optional r0 = r0.map(r1)
            r11 = r0
            r0 = r9
            java.lang.String r1 = "meta"
            java.lang.Object r0 = r0.get(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            moe.yushi.authlibinjector.APIMetadata r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$parse$1(v0);
            }
            java.util.Optional r0 = r0.map(r1)
            java.util.Map r1 = java.util.Collections.emptyMap()
            java.lang.Object r0 = r0.orElse(r1)
            java.util.Map r0 = (java.util.Map) r0
            r12 = r0
            moe.yushi.authlibinjector.APIMetadata r0 = new moe.yushi.authlibinjector.APIMetadata
            r1 = r0
            r2 = r7
            r3 = r10
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r4 = r12
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public APIMetadata(java.lang.String r4, java.util.List<java.lang.String> r5, java.util.Map<java.lang.String, java.lang.Object> r6, java.util.Optional<java.security.PublicKey> r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.apiRoot = r1
            r0 = r3
            r1 = r5
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            java.util.List r1 = (java.util.List) r1
            r0.skinDomains = r1
            r0 = r3
            r1 = r6
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.meta = r1
            r0 = r3
            r1 = r7
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            java.util.Optional r1 = (java.util.Optional) r1
            r0.decodedPublickey = r1
            return
    }

    public java.lang.String getApiRoot() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.apiRoot
            return r0
    }

    public java.util.List<java.lang.String> getSkinDomains() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.String> r0 = r0.skinDomains
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMeta() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.meta
            return r0
    }

    public java.util.Optional<java.security.PublicKey> getDecodedPublickey() {
            r2 = this;
            r0 = r2
            java.util.Optional<java.security.PublicKey> r0 = r0.decodedPublickey
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = "APIMetadata [apiRoot={0}, skinDomains={1}, decodedPublickey={2}, meta={3}]"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r6
            java.lang.String r4 = r4.apiRoot
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r6
            java.util.List<java.lang.String> r4 = r4.skinDomains
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r6
            java.util.Optional<java.security.PublicKey> r4 = r4.decodedPublickey
            r2[r3] = r4
            r2 = r1
            r3 = 3
            r4 = r6
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.meta
            r2[r3] = r4
            java.lang.String r0 = java.text.MessageFormat.format(r0, r1)
            return r0
    }

    private static /* synthetic */ java.util.Map lambda$parse$1(java.lang.Object r4) {
            java.util.TreeMap r0 = new java.util.TreeMap
            r1 = r0
            r2 = r4
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r2 = moe.yushi.authlibinjector.util.JsonUtils.asJsonObject(r2)
            r1.<init>(r2)
            return r0
    }

    private static /* synthetic */ java.util.List lambda$parse$0(java.lang.Object r3) {
            r0 = r3
            moe.yushi.authlibinjector.internal.org.json.simple.JSONArray r0 = moe.yushi.authlibinjector.util.JsonUtils.asJsonArray(r0)
            java.util.stream.Stream r0 = r0.stream()
            java.util.List r1 = moe.yushi.authlibinjector.util.JsonUtils::asJsonString
            java.util.stream.Stream r0 = r0.map(r1)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }
}
