package moe.yushi.authlibinjector.httpd;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/httpd/LegacySkinAPIFilter.class */
public class LegacySkinAPIFilter implements moe.yushi.authlibinjector.httpd.URLFilter {
    private static final java.util.regex.Pattern PATH_SKINS = null;
    private moe.yushi.authlibinjector.yggdrasil.YggdrasilClient upstream;

    public LegacySkinAPIFilter(moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.upstream = r1
            return
    }

    @Override // moe.yushi.authlibinjector.httpd.URLFilter
    public boolean canHandle(java.lang.String r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "skins.minecraft.net"
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // moe.yushi.authlibinjector.httpd.URLFilter
    public java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> handle(java.lang.String r7, java.lang.String r8, moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession r9) {
            r6 = this;
            r0 = r7
            java.lang.String r1 = "skins.minecraft.net"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        Ld:
            java.util.regex.Pattern r0 = moe.yushi.authlibinjector.httpd.LegacySkinAPIFilter.PATH_SKINS
            r1 = r8
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r10 = r0
            r0 = r10
            boolean r0 = r0.find()
            if (r0 != 0) goto L22
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        L22:
            r0 = r10
            java.lang.String r1 = "username"
            java.lang.String r0 = r0.group(r1)
            r11 = r0
            r0 = r11
            java.lang.String r0 = correctEncoding(r0)
            r11 = r0
            r0 = r6
            moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r0 = r0.upstream     // Catch: java.io.UncheckedIOException -> L62
            r1 = r11
            java.util.Optional r0 = r0.queryUUID(r1)     // Catch: java.io.UncheckedIOException -> L62
            r1 = r6
            java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> r1 = (v1) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return r1.lambda$handle$0(v1);
            }     // Catch: java.io.UncheckedIOException -> L62
            java.util.Optional r0 = r0.flatMap(r1)     // Catch: java.io.UncheckedIOException -> L62
            java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$handle$1(v0);
            }     // Catch: java.io.UncheckedIOException -> L62
            java.util.Optional r0 = r0.flatMap(r1)     // Catch: java.io.UncheckedIOException -> L62
            java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$handle$2(v0);
            }     // Catch: java.io.UncheckedIOException -> L62
            java.util.Optional r0 = r0.map(r1)     // Catch: java.io.UncheckedIOException -> L62
            r1 = r6
            java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> r1 = (v1) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return r1.lambda$handle$3(v1);
            }     // Catch: java.io.UncheckedIOException -> L62
            java.util.Optional r0 = r0.flatMap(r1)     // Catch: java.io.UncheckedIOException -> L62
            r12 = r0
            goto L7e
        L62:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Failed to fetch skin metadata for "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r13
            java.io.UncheckedIOException r0 = moe.yushi.authlibinjector.util.IOUtils.newUncheckedIOException(r0, r1)
            throw r0
        L7e:
            r0 = r12
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L129
            r0 = r12
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Retrieving skin for "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r11
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " from "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r13
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            java.lang.String r0 = "GET"
            r1 = r13
            byte[] r0 = moe.yushi.authlibinjector.util.IOUtils.http(r0, r1)     // Catch: java.io.IOException -> Lc0
            r14 = r0
            goto Ldc
        Lc0:
            r15 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Failed to retrieve skin from "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r13
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r15
            java.io.UncheckedIOException r0 = moe.yushi.authlibinjector.util.IOUtils.newUncheckedIOException(r0, r1)
            throw r0
        Ldc:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Retrieved skin for "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r11
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " from "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r13
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r14
            int r2 = r2.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " bytes"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.OK
            java.lang.String r1 = "image/png"
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r3 = r2
            r4 = r14
            r3.<init>(r4)
            r3 = r14
            int r3 = r3.length
            long r3 = (long) r3
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2, r3)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L129:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "No skin is found for "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r11
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_FOUND
            r1 = 0
            r2 = 0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
    }

    private java.util.Optional<java.lang.String> obtainTextureUrl(java.lang.String r4, java.lang.String r5) throws java.io.UncheckedIOException {
            r3 = this;
            r0 = r4
            java.lang.Object r0 = moe.yushi.authlibinjector.util.JsonUtils.parseJson(r0)
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = moe.yushi.authlibinjector.util.JsonUtils.asJsonObject(r0)
            r6 = r0
            r0 = r6
            java.lang.String r1 = "textures"
            java.lang.Object r0 = r0.get(r1)
            moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r0 = moe.yushi.authlibinjector.util.JsonUtils.asJsonObject(r0)
            r7 = r0
            r0 = r7
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            java.util.Optional<java.lang.String> r1 = moe.yushi.authlibinjector.util.JsonUtils::asJsonObject
            java.util.Optional r0 = r0.map(r1)
            java.util.Optional<java.lang.String> r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$obtainTextureUrl$5(v0);
            }
            java.util.Optional r0 = r0.map(r1)
            return r0
    }

    private static java.lang.String correctEncoding(java.lang.String r5) {
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r5
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.ISO_8859_1
            byte[] r2 = r2.getBytes(r3)
            r1.<init>(r2)
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$obtainTextureUrl$5(moe.yushi.authlibinjector.internal.org.json.simple.JSONObject r3) {
            r0 = r3
            java.lang.String r1 = "url"
            java.lang.Object r0 = r0.get(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            java.lang.String r1 = moe.yushi.authlibinjector.util.JsonUtils::asJsonString
            java.util.Optional r0 = r0.map(r1)
            java.lang.String r1 = () -> { // java.util.function.Supplier.get():java.lang.Object
                return lambda$obtainTextureUrl$4();
            }
            java.lang.Object r0 = r0.orElseThrow(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private static /* synthetic */ java.io.UncheckedIOException lambda$obtainTextureUrl$4() {
            java.lang.String r0 = "Invalid JSON: Missing texture url"
            java.io.UncheckedIOException r0 = moe.yushi.authlibinjector.util.IOUtils.newUncheckedIOException(r0)
            return r0
    }

    private /* synthetic */ java.util.Optional lambda$handle$3(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r2 = "SKIN"
            java.util.Optional r0 = r0.obtainTextureUrl(r1, r2)
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$handle$2(moe.yushi.authlibinjector.yggdrasil.GameProfile.PropertyValue r3) {
            java.util.Base64$Decoder r0 = java.util.Base64.getDecoder()
            r1 = r3
            java.lang.String r1 = r1.value
            byte[] r0 = r0.decode(r1)
            java.lang.String r0 = moe.yushi.authlibinjector.util.IOUtils.asString(r0)
            return r0
    }

    private static /* synthetic */ java.util.Optional lambda$handle$1(moe.yushi.authlibinjector.yggdrasil.GameProfile r3) {
            r0 = r3
            java.util.Map<java.lang.String, moe.yushi.authlibinjector.yggdrasil.GameProfile$PropertyValue> r0 = r0.properties
            java.lang.String r1 = "textures"
            java.lang.Object r0 = r0.get(r1)
            moe.yushi.authlibinjector.yggdrasil.GameProfile$PropertyValue r0 = (moe.yushi.authlibinjector.yggdrasil.GameProfile.PropertyValue) r0
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            return r0
    }

    private /* synthetic */ java.util.Optional lambda$handle$0(java.util.UUID r5) {
            r4 = this;
            r0 = r4
            moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r0 = r0.upstream
            r1 = r5
            r2 = 0
            java.util.Optional r0 = r0.queryProfile(r1, r2)
            return r0
    }

    static {
            java.lang.String r0 = "^/MinecraftSkins/(?<username>[^/]+)\\.png$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            moe.yushi.authlibinjector.httpd.LegacySkinAPIFilter.PATH_SKINS = r0
            return
    }
}
