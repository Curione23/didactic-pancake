package com.nide8.login2;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/Nide8Auth.class */
public final class Nide8Auth {
    private static final java.lang.String[] DEFAULT_IGNORED_PACKAGES = null;
    public static final java.lang.String LOG_PREFIX = "[统一通行证] ";
    private static final java.lang.String IS_DEBUG = "nide8auth.debug";
    private static final java.lang.String IS_CLIENT = "nide8auth.client";
    private static final java.lang.String CACHE_FILENAME = "nide8auth.cache";
    private static final java.lang.String DEFAULT_BASEURL = "https://auth2.nide8.com:233/";
    private static final java.lang.String VERSION = "2.2";
    public static boolean isDebug;
    public static boolean isClient;
    private static boolean booted;
    private static boolean triedCache;
    private static java.nio.file.Path workingPath;
    private static java.lang.String apiRoot;
    private static java.util.Optional<java.security.PublicKey> decodedPublickey;
    private static java.util.List<java.lang.String> skinDomains;
    private static java.util.Set<java.lang.String> ignoredPackages;

    private Nide8Auth() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void premain(java.lang.String r3, java.lang.instrument.Instrumentation r4) {
            boolean r0 = com.nide8.login2.Nide8Auth.booted
            if (r0 == 0) goto L10
            java.lang.String r0 = "重复初始化"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.nide8.login2.util.Logging.debug(r0, r1)
            return
        L10:
            r0 = 1
            com.nide8.login2.Nide8Auth.booted = r0
            java.lang.String r0 = "true"
            java.lang.String r1 = "nide8auth.debug"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            boolean r0 = r0.equals(r1)
            com.nide8.login2.Nide8Auth.isDebug = r0
            java.lang.String r0 = "true"
            java.lang.String r1 = "nide8auth.client"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            boolean r0 = r0.equals(r1)
            com.nide8.login2.Nide8Auth.isClient = r0
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            java.nio.file.Path r0 = r0.toAbsolutePath()
            com.nide8.login2.Nide8Auth.workingPath = r0
            java.lang.String r0 = "正在启动"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.nide8.login2.util.Logging.info(r0, r1)
            r0 = r3
            if (r0 == 0) goto L64
            r0 = r3
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L75
            if (r0 != 0) goto L64
            r0 = r3
            int r0 = r0.length()     // Catch: java.lang.Exception -> L75
            r1 = 32
            if (r0 != r1) goto L64
            r0 = r4
            r1 = r3
            bootstrap(r0, r1)     // Catch: java.lang.Exception -> L75
            goto L72
        L64:
            java.lang.String r0 = "没有设置32位服务器ID"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L75
            com.nide8.login2.util.Logging.error(r0, r1)     // Catch: java.lang.Exception -> L75
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            java.lang.System.exit(r0)     // Catch: java.lang.Exception -> L75
        L72:
            goto L88
        L75:
            r5 = move-exception
            java.lang.String r0 = "未知错误："
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.nide8.login2.util.Logging.error(r0, r1)
            r0 = r5
            r0.printStackTrace()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.System.exit(r0)
        L88:
            return
    }

    private static synchronized void bootstrap(java.lang.instrument.Instrumentation r6, java.lang.String r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "https://auth2.nide8.com:233/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8 = r0
            r0 = 1
            r9 = r0
        L1b:
            r0 = r9
            if (r0 == 0) goto L134
            java.lang.String r0 = "正在从服务器获取配置信息: {0}"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            com.nide8.login2.util.Logging.info(r0, r1)
            r0 = r8
            byte[] r0 = com.nide8.login2.util.IOUtils.getURL(r0)     // Catch: java.io.IOException -> L67
            java.lang.String r0 = com.nide8.login2.util.IOUtils.asString(r0)     // Catch: java.io.IOException -> L67
            r10 = r0
            java.lang.String r0 = "已从服务器获取元数据: {0}"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.io.IOException -> L67
            r2 = r1
            r3 = 0
            r4 = r10
            r2[r3] = r4     // Catch: java.io.IOException -> L67
            com.nide8.login2.util.Logging.debug(r0, r1)     // Catch: java.io.IOException -> L67
            r0 = r10
            java.lang.Object r0 = com.nide8.login2.util.JsonUtils.parseJson(r0)     // Catch: java.io.IOException -> L67
            com.nide8.login2.internal.org.json.simple.JSONObject r0 = com.nide8.login2.util.JsonUtils.asObject(r0)     // Catch: java.io.IOException -> L67
            r11 = r0
            r0 = r11
            r1 = 1
            parseConfig(r0, r1)     // Catch: java.io.IOException -> L67
            r0 = r11
            r1 = r7
            saveConfig(r0, r1)     // Catch: java.io.IOException -> L67
            java.lang.String r0 = "已正确解析服务器Json格式"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.io.IOException -> L67
            com.nide8.login2.util.Logging.debug(r0, r1)     // Catch: java.io.IOException -> L67
            r0 = 0
            r9 = r0
            goto L122
        L67:
            r10 = move-exception
            boolean r0 = com.nide8.login2.Nide8Auth.triedCache
            if (r0 != 0) goto L109
            r0 = 1
            com.nide8.login2.Nide8Auth.triedCache = r0
            java.lang.String r0 = "获取配置信息失败，尝试载入本地缓存: {0}"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r10
            r2[r3] = r4
            com.nide8.login2.util.Logging.error(r0, r1)
            java.nio.file.Path r0 = com.nide8.login2.Nide8Auth.workingPath
            java.lang.String r1 = "nide8auth.cache"
            java.nio.file.Path r0 = r0.resolve(r1)
            r11 = r0
            r0 = r11
            r1 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            boolean r0 = java.nio.file.Files.exists(r0, r1)
            if (r0 == 0) goto Led
            r0 = r11
            byte[] r0 = com.nide8.login2.util.IOUtils.loadFile(r0)     // Catch: java.io.IOException -> Lcf
            java.lang.String r0 = com.nide8.login2.util.IOUtils.asString(r0)     // Catch: java.io.IOException -> Lcf
            r12 = r0
            java.lang.String r0 = "已从缓存获取元数据: {0}"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.io.IOException -> Lcf
            r2 = r1
            r3 = 0
            r4 = r12
            r2[r3] = r4     // Catch: java.io.IOException -> Lcf
            com.nide8.login2.util.Logging.debug(r0, r1)     // Catch: java.io.IOException -> Lcf
            r0 = r12
            java.lang.Object r0 = com.nide8.login2.util.JsonUtils.parseJson(r0)     // Catch: java.io.IOException -> Lcf
            com.nide8.login2.internal.org.json.simple.JSONObject r0 = com.nide8.login2.util.JsonUtils.asObject(r0)     // Catch: java.io.IOException -> Lcf
            r13 = r0
            r0 = r13
            r1 = 0
            parseConfig(r0, r1)     // Catch: java.io.IOException -> Lcf
            java.lang.String r0 = "已正确解析缓存Json格式"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.io.IOException -> Lcf
            com.nide8.login2.util.Logging.debug(r0, r1)     // Catch: java.io.IOException -> Lcf
            r0 = 0
            r9 = r0
            goto L106
        Lcf:
            r12 = move-exception
            java.lang.String r0 = "载入本地缓存失败，10秒后重试联网获取: {0}"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r12
            r2[r3] = r4
            com.nide8.login2.util.Logging.error(r0, r1)
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Le8
            goto Lea
        Le8:
            r13 = move-exception
        Lea:
            goto L106
        Led:
            java.lang.String r0 = "本地缓存不存在，10秒后重试联网获取: {0}"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r10
            r2[r3] = r4
            com.nide8.login2.util.Logging.error(r0, r1)
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L104
            goto L106
        L104:
            r12 = move-exception
        L106:
            goto L122
        L109:
            java.lang.String r0 = "获取配置信息失败，10秒后重试: {0}"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r10
            r2[r3] = r4
            com.nide8.login2.util.Logging.error(r0, r1)
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L120
            goto L122
        L120:
            r11 = move-exception
        L122:
            r0 = r9
            if (r0 == 0) goto L1b
            boolean r0 = com.nide8.login2.Nide8Auth.isClient
            if (r0 == 0) goto L1b
            r0 = -2147483646(0xffffffff80000002, float:-2.8E-45)
            java.lang.System.exit(r0)
            goto L1b
        L134:
            r0 = r6
            boolean r0 = r0.isRetransformClassesSupported()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L14a
            java.lang.String r0 = "不支持重转换类"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.nide8.login2.util.Logging.debug(r0, r1)
        L14a:
            com.nide8.login2.transform.ClassTransformer r0 = new com.nide8.login2.transform.ClassTransformer
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            java.util.Set<java.lang.String> r0 = r0.ignores
            java.util.Set<java.lang.String> r1 = com.nide8.login2.Nide8Auth.ignoredPackages
            boolean r0 = r0.addAll(r1)
            r0 = r11
            java.util.List<com.nide8.login2.transform.TransformUnit> r0 = r0.units
            com.nide8.login2.transform.YggdrasilApiTransformUnit r1 = new com.nide8.login2.transform.YggdrasilApiTransformUnit
            r2 = r1
            java.lang.String r3 = com.nide8.login2.Nide8Auth.apiRoot
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r11
            java.util.List<com.nide8.login2.transform.TransformUnit> r0 = r0.units
            com.nide8.login2.transform.SkinWhitelistTransformUnit r1 = new com.nide8.login2.transform.SkinWhitelistTransformUnit
            r2 = r1
            java.util.List<java.lang.String> r3 = com.nide8.login2.Nide8Auth.skinDomains
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            java.util.Optional<java.security.PublicKey> r0 = com.nide8.login2.Nide8Auth.decodedPublickey
            r1 = r11
            void r1 = (v1) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$bootstrap$0(r1, v1);
            }
            r0.ifPresent(r1)
            java.util.Optional<java.security.PublicKey> r0 = com.nide8.login2.Nide8Auth.decodedPublickey
            r1 = r11
            void r1 = (v1) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$bootstrap$1(r1, v1);
            }
            r0.ifPresent(r1)
            r0 = r6
            r1 = r11
            r2 = r10
            r0.addTransformer(r1, r2)
            return
    }

    private static void parseConfig(com.nide8.login2.internal.org.json.simple.JSONObject r6, boolean r7) {
            r0 = r6
            java.lang.String r1 = "signaturePublickey"
            java.lang.Object r0 = r0.get(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            void r1 = com.nide8.login2.util.JsonUtils::asString
            java.util.Optional r0 = r0.map(r1)
            void r1 = com.nide8.login2.util.KeyUtils::parseSignaturePublicKey
            java.util.Optional r0 = r0.map(r1)
            com.nide8.login2.Nide8Auth.decodedPublickey = r0
            r0 = r6
            java.lang.String r1 = "skinDomains"
            java.lang.Object r0 = r0.get(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            void r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$parseConfig$2(v0);
            }
            java.util.Optional r0 = r0.map(r1)
            java.util.List r1 = java.util.Collections.emptyList()
            java.lang.Object r0 = r0.orElse(r1)
            java.util.List r0 = (java.util.List) r0
            com.nide8.login2.Nide8Auth.skinDomains = r0
            r0 = r6
            java.lang.String r1 = "extraPackages"
            java.lang.Object r0 = r0.get(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            void r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$parseConfig$3(v0);
            }
            java.util.Optional r0 = r0.map(r1)
            java.util.List r1 = java.util.Collections.emptyList()
            java.lang.Object r0 = r0.orElse(r1)
            java.util.List r0 = (java.util.List) r0
            r8 = r0
            java.lang.String r0 = "忽略包名默认列表："
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.nide8.login2.util.Logging.debug(r0, r1)
            java.lang.String[] r0 = com.nide8.login2.Nide8Auth.DEFAULT_IGNORED_PACKAGES
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L6c:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L93
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            java.util.Set<java.lang.String> r0 = com.nide8.login2.Nide8Auth.ignoredPackages
            r1 = r12
            boolean r0 = r0.add(r1)
            r0 = r12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.nide8.login2.util.Logging.debug(r0, r1)
            int r11 = r11 + 1
            goto L6c
        L93:
            java.lang.String r0 = "忽略包名补丁列表："
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.nide8.login2.util.Logging.debug(r0, r1)
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        La4:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lde
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r10
            java.lang.String r0 = r0.trim()
            r10 = r0
            r0 = r10
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ldb
            java.util.Set<java.lang.String> r0 = com.nide8.login2.Nide8Auth.ignoredPackages
            r1 = r10
            boolean r0 = r0.add(r1)
            r0 = r10
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.nide8.login2.util.Logging.debug(r0, r1)
        Ldb:
            goto La4
        Lde:
            r0 = r7
            if (r0 == 0) goto L13c
            r0 = r6
            java.lang.String r1 = "apiRoot"
            java.lang.Object r0 = r0.get(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            void r1 = com.nide8.login2.util.JsonUtils::asString
            java.util.Optional r0 = r0.map(r1)
            java.lang.String r1 = com.nide8.login2.Nide8Auth.apiRoot
            java.lang.Object r0 = r0.orElse(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.nide8.login2.Nide8Auth.apiRoot = r0
            r0 = r6
            java.lang.String r1 = "jarVersion"
            java.lang.Object r0 = r0.get(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            void r1 = com.nide8.login2.util.JsonUtils::asString
            java.util.Optional r0 = r0.map(r1)
            java.lang.String r1 = ""
            java.lang.Object r0 = r0.orElse(r1)
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L139
            java.lang.String r0 = "2.2"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L139
            java.lang.String r0 = "登录组件有新版本，建议更新: {0}"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r9
            r2[r3] = r4
            com.nide8.login2.util.Logging.info(r0, r1)
        L139:
            goto L170
        L13c:
            r0 = r6
            java.lang.String r1 = "uuid"
            java.lang.Object r0 = r0.get(r1)
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            void r1 = com.nide8.login2.util.JsonUtils::asString
            java.util.Optional r0 = r0.map(r1)
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "https://auth2.nide8.com:233/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.nide8.login2.Nide8Auth.apiRoot = r0
        L170:
            return
    }

    private static void saveConfig(com.nide8.login2.internal.org.json.simple.JSONObject r6, java.lang.String r7) {
            r0 = r6
            java.lang.String r1 = "meta"
            java.lang.Object r0 = r0.remove(r1)
            r0 = r6
            java.lang.String r1 = "jarVersion"
            java.lang.Object r0 = r0.remove(r1)
            r0 = r6
            java.lang.String r1 = "apiRoot"
            java.lang.Object r0 = r0.remove(r1)
            r0 = r6
            java.lang.String r1 = "uuid"
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            java.nio.file.Path r0 = com.nide8.login2.Nide8Auth.workingPath     // Catch: java.io.IOException -> L35
            java.lang.String r1 = "nide8auth.cache"
            java.nio.file.Path r0 = r0.resolve(r1)     // Catch: java.io.IOException -> L35
            r1 = r6
            java.lang.String r1 = r1.toJSONString()     // Catch: java.io.IOException -> L35
            com.nide8.login2.util.IOUtils.saveFile(r0, r1)     // Catch: java.io.IOException -> L35
            goto L44
        L35:
            r8 = move-exception
            java.lang.String r0 = "保存本地缓存失败: {0}"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            com.nide8.login2.util.Logging.error(r0, r1)
        L44:
            return
    }

    private static /* synthetic */ java.util.List lambda$parseConfig$3(java.lang.Object r3) {
            r0 = r3
            com.nide8.login2.internal.org.json.simple.JSONArray r0 = com.nide8.login2.util.JsonUtils.asArray(r0)
            java.util.stream.Stream r0 = r0.stream()
            java.util.List r1 = com.nide8.login2.util.JsonUtils::asString
            java.util.stream.Stream r0 = r0.map(r1)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static /* synthetic */ java.util.List lambda$parseConfig$2(java.lang.Object r3) {
            r0 = r3
            com.nide8.login2.internal.org.json.simple.JSONArray r0 = com.nide8.login2.util.JsonUtils.asArray(r0)
            java.util.stream.Stream r0 = r0.stream()
            java.util.List r1 = com.nide8.login2.util.JsonUtils::asString
            java.util.stream.Stream r0 = r0.map(r1)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static /* synthetic */ void lambda$bootstrap$1(com.nide8.login2.transform.ClassTransformer r5, java.security.PublicKey r6) {
            r0 = r5
            java.util.List<com.nide8.login2.transform.TransformUnit> r0 = r0.units
            com.nide8.login2.transform.YggdrasilKeyNewTransformUnit r1 = new com.nide8.login2.transform.YggdrasilKeyNewTransformUnit
            r2 = r1
            r3 = r6
            byte[] r3 = r3.getEncoded()
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            return
    }

    private static /* synthetic */ void lambda$bootstrap$0(com.nide8.login2.transform.ClassTransformer r5, java.security.PublicKey r6) {
            r0 = r5
            java.util.List<com.nide8.login2.transform.TransformUnit> r0 = r0.units
            com.nide8.login2.transform.YggdrasilKeyTransformUnit r1 = new com.nide8.login2.transform.YggdrasilKeyTransformUnit
            r2 = r1
            r3 = r6
            byte[] r3 = r3.getEncoded()
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            return
    }

    static {
            r0 = 37
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "com.nide8.login2."
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "java."
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "javax."
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "jdk."
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "com.sun."
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "sun."
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "net.java."
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "com.google."
            r1[r2] = r3
            r1 = r0
            r2 = 8
            java.lang.String r3 = "com.ibm."
            r1[r2] = r3
            r1 = r0
            r2 = 9
            java.lang.String r3 = "com.jcraft.jogg."
            r1[r2] = r3
            r1 = r0
            r2 = 10
            java.lang.String r3 = "com.jcraft.jorbis."
            r1[r2] = r3
            r1 = r0
            r2 = 11
            java.lang.String r3 = "com.oracle."
            r1[r2] = r3
            r1 = r0
            r2 = 12
            java.lang.String r3 = "com.paulscode."
            r1[r2] = r3
            r1 = r0
            r2 = 13
            java.lang.String r3 = "org.GNOME."
            r1[r2] = r3
            r1 = r0
            r2 = 14
            java.lang.String r3 = "org.apache."
            r1[r2] = r3
            r1 = r0
            r2 = 15
            java.lang.String r3 = "org.graalvm."
            r1[r2] = r3
            r1 = r0
            r2 = 16
            java.lang.String r3 = "org.jcp."
            r1[r2] = r3
            r1 = r0
            r2 = 17
            java.lang.String r3 = "org.json."
            r1[r2] = r3
            r1 = r0
            r2 = 18
            java.lang.String r3 = "org.lwjgl."
            r1[r2] = r3
            r1 = r0
            r2 = 19
            java.lang.String r3 = "com.mojang.blaze3d."
            r1[r2] = r3
            r1 = r0
            r2 = 20
            java.lang.String r3 = "com.mojang.brigadier."
            r1[r2] = r3
            r1 = r0
            r2 = 21
            java.lang.String r3 = "com.mojang.datafixers."
            r1[r2] = r3
            r1 = r0
            r2 = 22
            java.lang.String r3 = "com.mojang.serialization."
            r1[r2] = r3
            r1 = r0
            r2 = 23
            java.lang.String r3 = "com.nide8.login2.internal.org.objectweb.asm."
            r1[r2] = r3
            r1 = r0
            r2 = 24
            java.lang.String r3 = "org.slf4j."
            r1[r2] = r3
            r1 = r0
            r2 = 25
            java.lang.String r3 = "org.w3c."
            r1[r2] = r3
            r1 = r0
            r2 = 26
            java.lang.String r3 = "org.xml."
            r1[r2] = r3
            r1 = r0
            r2 = 27
            java.lang.String r3 = "org.yaml.snakeyaml."
            r1[r2] = r3
            r1 = r0
            r2 = 28
            java.lang.String r3 = "gnu.trove."
            r1[r2] = r3
            r1 = r0
            r2 = 29
            java.lang.String r3 = "io.netty."
            r1[r2] = r3
            r1 = r0
            r2 = 30
            java.lang.String r3 = "it.unimi.dsi.fastutil."
            r1[r2] = r3
            r1 = r0
            r2 = 31
            java.lang.String r3 = "javassist."
            r1[r2] = r3
            r1 = r0
            r2 = 32
            java.lang.String r3 = "jline."
            r1[r2] = r3
            r1 = r0
            r2 = 33
            java.lang.String r3 = "joptsimple."
            r1[r2] = r3
            r1 = r0
            r2 = 34
            java.lang.String r3 = "oracle."
            r1[r2] = r3
            r1 = r0
            r2 = 35
            java.lang.String r3 = "oshi."
            r1[r2] = r3
            r1 = r0
            r2 = 36
            java.lang.String r3 = "paulscode."
            r1[r2] = r3
            com.nide8.login2.Nide8Auth.DEFAULT_IGNORED_PACKAGES = r0
            r0 = 0
            com.nide8.login2.Nide8Auth.isDebug = r0
            r0 = 0
            com.nide8.login2.Nide8Auth.isClient = r0
            r0 = 0
            com.nide8.login2.Nide8Auth.booted = r0
            r0 = 0
            com.nide8.login2.Nide8Auth.triedCache = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            com.nide8.login2.Nide8Auth.ignoredPackages = r0
            return
    }
}
