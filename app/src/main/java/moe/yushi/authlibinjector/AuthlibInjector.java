package moe.yushi.authlibinjector;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/AuthlibInjector.class */
public final class AuthlibInjector {
    private static boolean booted;
    private static java.lang.instrument.Instrumentation instrumentation;
    private static boolean retransformSupported;
    private static moe.yushi.authlibinjector.transform.ClassTransformer classTransformer;

    private AuthlibInjector() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static synchronized void bootstrap(java.lang.instrument.Instrumentation r4, java.lang.String r5) throws moe.yushi.authlibinjector.InitializationException {
            boolean r0 = moe.yushi.authlibinjector.AuthlibInjector.booted
            if (r0 == 0) goto Lf
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.String r1 = "Already started, skipping"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            return
        Lf:
            r0 = 1
            moe.yushi.authlibinjector.AuthlibInjector.booted = r0
            r0 = r4
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            java.lang.instrument.Instrumentation r0 = (java.lang.instrument.Instrumentation) r0
            moe.yushi.authlibinjector.AuthlibInjector.instrumentation = r0
            moe.yushi.authlibinjector.Config.init()
            r0 = r4
            boolean r0 = r0.isRetransformClassesSupported()
            moe.yushi.authlibinjector.AuthlibInjector.retransformSupported = r0
            boolean r0 = moe.yushi.authlibinjector.AuthlibInjector.retransformSupported
            if (r0 != 0) goto L37
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.String r1 = "Retransform is not supported"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
        L37:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Version: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class<moe.yushi.authlibinjector.AuthlibInjector> r2 = moe.yushi.authlibinjector.AuthlibInjector.class
            java.lang.Package r2 = r2.getPackage()
            java.lang.String r2 = r2.getImplementationVersion()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            r0 = r5
            moe.yushi.authlibinjector.APIMetadata r0 = fetchAPIMetadata(r0)
            r6 = r0
            r0 = r6
            moe.yushi.authlibinjector.transform.ClassTransformer r0 = createTransformer(r0)
            moe.yushi.authlibinjector.AuthlibInjector.classTransformer = r0
            r0 = r4
            moe.yushi.authlibinjector.transform.ClassTransformer r1 = moe.yushi.authlibinjector.AuthlibInjector.classTransformer
            boolean r2 = moe.yushi.authlibinjector.AuthlibInjector.retransformSupported
            r0.addTransformer(r1, r2)
            moe.yushi.authlibinjector.transform.support.ProxyParameterWorkaround.init()
            moe.yushi.authlibinjector.transform.support.MC52974Workaround.init()
            moe.yushi.authlibinjector.transform.support.MC52974_1710Workaround.init()
            boolean r0 = moe.yushi.authlibinjector.Config.noShowServerName
            if (r0 != 0) goto L82
            r0 = r6
            moe.yushi.authlibinjector.transform.support.AuthServerNameInjector.init(r0)
        L82:
            return
    }

    private static java.util.Optional<java.lang.String> getPrefetchedResponse() {
            java.lang.String r0 = "authlibinjector.yggdrasil.prefetched"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r3 = r0
            r0 = r3
            if (r0 != 0) goto L1c
            java.lang.String r0 = "org.to2mbn.authlibinjector.config.prefetched"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L1c
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.String r1 = "'-Dorg.to2mbn.authlibinjector.config.prefetched=' is deprecated, use '-Dauthlibinjector.yggdrasil.prefetched=' instead"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
        L1c:
            r0 = r3
            java.util.Optional r0 = java.util.Optional.ofNullable(r0)
            return r0
    }

    private static moe.yushi.authlibinjector.APIMetadata fetchAPIMetadata(java.lang.String r5) {
            r0 = r5
            if (r0 == 0) goto Lb
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b
        Lb:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.String r1 = "No authentication server specified"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.InitializationException r0 = new moe.yushi.authlibinjector.InitializationException
            r1 = r0
            r1.<init>()
            throw r0
        L1b:
            r0 = r5
            java.lang.String r0 = addHttpsIfMissing(r0)
            r5 = r0
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Authentication server: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            r0 = r5
            warnIfHttp(r0)
            java.util.Optional r0 = getPrefetchedResponse()
            r7 = r0
            r0 = r7
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto La0
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.String r1 = "Prefetched metadata detected"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.IllegalArgumentException -> L6e
            r1 = r0
            java.util.Base64$Decoder r2 = java.util.Base64.getDecoder()     // Catch: java.lang.IllegalArgumentException -> L6e
            r3 = r7
            java.lang.Object r3 = r3.get()     // Catch: java.lang.IllegalArgumentException -> L6e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.IllegalArgumentException -> L6e
            java.lang.String r3 = moe.yushi.authlibinjector.util.IOUtils.removeNewLines(r3)     // Catch: java.lang.IllegalArgumentException -> L6e
            byte[] r2 = r2.decode(r3)     // Catch: java.lang.IllegalArgumentException -> L6e
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.IllegalArgumentException -> L6e
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L6e
            r6 = r0
            goto L1a2
        L6e:
            r8 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Unable to decode metadata: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\nEncoded metadata:\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.InitializationException r0 = new moe.yushi.authlibinjector.InitializationException
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            throw r0
        La0:
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> L17e
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: java.io.IOException -> L17e
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.io.IOException -> L17e
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.io.IOException -> L17e
            r8 = r0
            r0 = r8
            java.lang.String r1 = "x-authlib-injector-api-location"
            java.lang.String r0 = r0.getHeaderField(r1)     // Catch: java.io.IOException -> L17e
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L144
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> L17e
            r1 = r0
            r2 = r8
            java.net.URL r2 = r2.getURL()     // Catch: java.io.IOException -> L17e
            r3 = r9
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L17e
            r10 = r0
            r0 = r5
            r1 = r10
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L17e
            boolean r0 = urlEqualsIgnoreSlash(r0, r1)     // Catch: java.io.IOException -> L17e
            if (r0 != 0) goto L144
            r0 = r8
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L114 java.io.IOException -> L17e
            r11 = r0
        Ldd:
            r0 = r11
            int r0 = r0.read()     // Catch: java.lang.Throwable -> Lf6 java.io.IOException -> L114 java.io.IOException -> L17e
            r1 = -1
            if (r0 == r1) goto Le9
            goto Ldd
        Le9:
            r0 = r11
            if (r0 == 0) goto L111
            r0 = r11
            r0.close()     // Catch: java.io.IOException -> L114 java.io.IOException -> L17e
            goto L111
        Lf6:
            r12 = move-exception
            r0 = r11
            if (r0 == 0) goto L10e
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> L105 java.io.IOException -> L114 java.io.IOException -> L17e
            goto L10e
        L105:
            r13 = move-exception
            r0 = r12
            r1 = r13
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> L114 java.io.IOException -> L17e
        L10e:
            r0 = r12
            throw r0     // Catch: java.io.IOException -> L114 java.io.IOException -> L17e
        L111:
            goto L116
        L114:
            r11 = move-exception
        L116:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO     // Catch: java.io.IOException -> L17e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L17e
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L17e
            java.lang.String r2 = "Redirect to: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L17e
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L17e
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L17e
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)     // Catch: java.io.IOException -> L17e
            r0 = r10
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L17e
            r5 = r0
            r0 = r5
            warnIfHttp(r0)     // Catch: java.io.IOException -> L17e
            r0 = r10
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.io.IOException -> L17e
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.io.IOException -> L17e
            r8 = r0
        L144:
            r0 = r8
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L17e
            r10 = r0
            r0 = r10
            byte[] r0 = moe.yushi.authlibinjector.util.IOUtils.asBytes(r0)     // Catch: java.lang.Throwable -> L160 java.io.IOException -> L17e
            java.lang.String r0 = moe.yushi.authlibinjector.util.IOUtils.asString(r0)     // Catch: java.lang.Throwable -> L160 java.io.IOException -> L17e
            r6 = r0
            r0 = r10
            if (r0 == 0) goto L17b
            r0 = r10
            r0.close()     // Catch: java.io.IOException -> L17e
            goto L17b
        L160:
            r11 = move-exception
            r0 = r10
            if (r0 == 0) goto L178
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> L16f java.io.IOException -> L17e
            goto L178
        L16f:
            r12 = move-exception
            r0 = r11
            r1 = r12
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> L17e
        L178:
            r0 = r11
            throw r0     // Catch: java.io.IOException -> L17e
        L17b:
            goto L1a2
        L17e:
            r8 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Failed to fetch metadata: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.InitializationException r0 = new moe.yushi.authlibinjector.InitializationException
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            throw r0
        L1a2:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Metadata: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            r0 = r5
            java.lang.String r1 = "/"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L1db
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5 = r0
        L1db:
            r0 = r5
            r1 = r6
            moe.yushi.authlibinjector.APIMetadata r0 = moe.yushi.authlibinjector.APIMetadata.parse(r0, r1)     // Catch: java.io.UncheckedIOException -> L1e4
            r8 = r0
            goto L218
        L1e4:
            r9 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Unable to parse metadata: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.io.IOException r2 = r2.getCause()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\nRaw metadata:\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.InitializationException r0 = new moe.yushi.authlibinjector.InitializationException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L218:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Parsed metadata: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            r0 = r8
            return r0
    }

    private static void warnIfHttp(java.lang.String r3) {
            r0 = r3
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "http://"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L16
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.String r1 = "You are using HTTP protocol, which is INSECURE! Please switch to HTTPS if possible."
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
        L16:
            return
    }

    private static java.lang.String addHttpsIfMissing(java.lang.String r3) {
            r0 = r3
            java.lang.String r0 = r0.toLowerCase()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "http://"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L2e
            r0 = r4
            java.lang.String r1 = "https://"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "https://"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3 = r0
        L2e:
            r0 = r3
            return r0
    }

    private static boolean urlEqualsIgnoreSlash(java.lang.String r3, java.lang.String r4) {
            r0 = r3
            java.lang.String r1 = "/"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3 = r0
        L1f:
            r0 = r4
            java.lang.String r1 = "/"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
        L3e:
            r0 = r3
            r1 = r4
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static java.util.List<moe.yushi.authlibinjector.httpd.URLFilter> createFilters(moe.yushi.authlibinjector.APIMetadata r6) {
            boolean r0 = moe.yushi.authlibinjector.Config.httpdDisabled
            if (r0 == 0) goto L13
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.String r1 = "Disabled local HTTP server"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L13:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r0 = new moe.yushi.authlibinjector.yggdrasil.YggdrasilClient
            r1 = r0
            moe.yushi.authlibinjector.yggdrasil.CustomYggdrasilAPIProvider r2 = new moe.yushi.authlibinjector.yggdrasil.CustomYggdrasilAPIProvider
            r3 = r2
            r4 = r6
            r3.<init>(r4)
            r1.<init>(r2)
            r8 = r0
            moe.yushi.authlibinjector.yggdrasil.YggdrasilClient r0 = new moe.yushi.authlibinjector.yggdrasil.YggdrasilClient
            r1 = r0
            moe.yushi.authlibinjector.yggdrasil.MojangYggdrasilAPIProvider r2 = new moe.yushi.authlibinjector.yggdrasil.MojangYggdrasilAPIProvider
            r3 = r2
            r3.<init>()
            java.net.Proxy r3 = moe.yushi.authlibinjector.Config.mojangProxy
            r1.<init>(r2, r3)
            r9 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r6
            java.util.Map r1 = r1.getMeta()
            java.lang.String r2 = "feature.legacy_skin_api"
            java.lang.Object r1 = r1.get(r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            r0 = 1
            goto L57
        L56:
            r0 = 0
        L57:
            r10 = r0
            moe.yushi.authlibinjector.Config$FeatureOption r0 = moe.yushi.authlibinjector.Config.legacySkinPolyfill
            r1 = r10
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L76
            r0 = r7
            moe.yushi.authlibinjector.httpd.LegacySkinAPIFilter r1 = new moe.yushi.authlibinjector.httpd.LegacySkinAPIFilter
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            goto L7f
        L76:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.String r1 = "Disabled legacy skin API polyfill"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
        L7f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r6
            java.util.Map r1 = r1.getMeta()
            java.lang.String r2 = "feature.no_mojang_namespace"
            java.lang.Object r1 = r1.get(r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L98
            r0 = 1
            goto L99
        L98:
            r0 = 0
        L99:
            r11 = r0
            moe.yushi.authlibinjector.Config$FeatureOption r0 = moe.yushi.authlibinjector.Config.mojangNamespace
            r1 = r11
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto Lc9
            r0 = r7
            moe.yushi.authlibinjector.httpd.QueryUUIDsFilter r1 = new moe.yushi.authlibinjector.httpd.QueryUUIDsFilter
            r2 = r1
            r3 = r9
            r4 = r8
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            r0 = r7
            moe.yushi.authlibinjector.httpd.QueryProfileFilter r1 = new moe.yushi.authlibinjector.httpd.QueryProfileFilter
            r2 = r1
            r3 = r9
            r4 = r8
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            goto Ld2
        Lc9:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.String r1 = "Disabled Mojang namespace"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
        Ld2:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r6
            java.util.Map r1 = r1.getMeta()
            java.lang.String r2 = "feature.enable_mojang_anti_features"
            java.lang.Object r1 = r1.get(r2)
            boolean r0 = r0.equals(r1)
            r12 = r0
            moe.yushi.authlibinjector.Config$FeatureOption r0 = moe.yushi.authlibinjector.Config.mojangAntiFeatures
            r1 = r12
            boolean r0 = r0.isEnabled(r1)
            if (r0 != 0) goto Lff
            r0 = r7
            moe.yushi.authlibinjector.httpd.AntiFeaturesFilter r1 = new moe.yushi.authlibinjector.httpd.AntiFeaturesFilter
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
        Lff:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r6
            java.util.Map r1 = r1.getMeta()
            java.lang.String r2 = "feature.enable_profile_key"
            java.lang.Object r1 = r1.get(r2)
            boolean r0 = r0.equals(r1)
            r13 = r0
            moe.yushi.authlibinjector.Config$FeatureOption r0 = moe.yushi.authlibinjector.Config.profileKey
            r1 = r13
            boolean r0 = r0.isEnabled(r1)
            if (r0 != 0) goto L12c
            r0 = r7
            moe.yushi.authlibinjector.httpd.ProfileKeyFilter r1 = new moe.yushi.authlibinjector.httpd.ProfileKeyFilter
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
        L12c:
            r0 = r7
            moe.yushi.authlibinjector.httpd.PublickeysFilter r1 = new moe.yushi.authlibinjector.httpd.PublickeysFilter
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r7
            return r0
    }

    private static moe.yushi.authlibinjector.transform.ClassTransformer createTransformer(moe.yushi.authlibinjector.APIMetadata r7) {
            moe.yushi.authlibinjector.httpd.URLProcessor r0 = new moe.yushi.authlibinjector.httpd.URLProcessor
            r1 = r0
            r2 = r7
            java.util.List r2 = createFilters(r2)
            moe.yushi.authlibinjector.httpd.DefaultURLRedirector r3 = new moe.yushi.authlibinjector.httpd.DefaultURLRedirector
            r4 = r3
            r5 = r7
            r4.<init>(r5)
            r1.<init>(r2, r3)
            r8 = r0
            moe.yushi.authlibinjector.transform.ClassTransformer r0 = new moe.yushi.authlibinjector.transform.ClassTransformer
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            java.util.Set<java.lang.String> r1 = moe.yushi.authlibinjector.Config.ignoredPackages
            r0.setIgnores(r1)
            boolean r0 = moe.yushi.authlibinjector.Config.dumpClass
            if (r0 == 0) goto L49
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.ClassLoadingListener> r0 = r0.listeners
            moe.yushi.authlibinjector.transform.DumpClassListener r1 = new moe.yushi.authlibinjector.transform.DumpClassListener
            r2 = r1
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            java.nio.file.Path r3 = java.nio.file.Paths.get(r3, r4)
            java.nio.file.Path r3 = r3.toAbsolutePath()
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
        L49:
            boolean r0 = moe.yushi.authlibinjector.Config.authlibLogging
            if (r0 == 0) goto L60
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.AuthlibLogInterceptor r1 = new moe.yushi.authlibinjector.transform.support.AuthlibLogInterceptor
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
        L60:
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer r1 = new moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.ConstantURLTransformUnit r1 = new moe.yushi.authlibinjector.transform.support.ConstantURLTransformUnit
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.CitizensTransformer r1 = new moe.yushi.authlibinjector.transform.support.CitizensTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.ConcatenateURLTransformUnit r1 = new moe.yushi.authlibinjector.transform.support.ConcatenateURLTransformUnit
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r7
            java.util.Map r1 = r1.getMeta()
            java.lang.String r2 = "feature.username_check"
            java.lang.Object r1 = r1.get(r2)
            boolean r0 = r0.equals(r1)
            r10 = r0
            moe.yushi.authlibinjector.Config$FeatureOption r0 = moe.yushi.authlibinjector.Config.usernameCheck
            r1 = r10
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto Lce
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.String r1 = "Username check is enforced"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            goto L101
        Lce:
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.UsernameCharacterCheckTransformer r1 = new moe.yushi.authlibinjector.transform.support.UsernameCharacterCheckTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.PaperUsernameCheckTransformer r1 = new moe.yushi.authlibinjector.transform.support.PaperUsernameCheckTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.BungeeCordAllowedCharactersTransformer r1 = new moe.yushi.authlibinjector.transform.support.BungeeCordAllowedCharactersTransformer
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
        L101:
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit r1 = new moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            java.util.List r0 = moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit.getWhitelistedDomains()
            r1 = r7
            java.util.List r1 = r1.getSkinDomains()
            boolean r0 = r0.addAll(r1)
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit r1 = new moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r7
            java.util.Optional r0 = r0.getDecodedPublickey()
            java.util.List<java.security.PublicKey> r1 = moe.yushi.authlibinjector.transform.support.YggdrasilKeyTransformUnit.PUBLIC_KEYS
            r2 = r1
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)
            moe.yushi.authlibinjector.transform.ClassTransformer r1 = (v1) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                r1.add(v1);
            }
            r0.ifPresent(r1)
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.VelocityProfileKeyTransformUnit r1 = new moe.yushi.authlibinjector.transform.support.VelocityProfileKeyTransformUnit
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r9
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.BungeeCordProfileKeyTransformUnit r1 = new moe.yushi.authlibinjector.transform.support.BungeeCordProfileKeyTransformUnit
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            java.util.List r0 = moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer.getArgumentsListeners()
            moe.yushi.authlibinjector.transform.support.AccountTypeTransformer r1 = new moe.yushi.authlibinjector.transform.support.AccountTypeTransformer
            r2 = r1
            r2.<init>()
            moe.yushi.authlibinjector.transform.ClassTransformer r1 = r1::transform
            boolean r0 = r0.add(r1)
            r0 = r9
            return r0
    }

    public static void retransformClasses(java.lang.String... r4) {
            boolean r0 = moe.yushi.authlibinjector.AuthlibInjector.retransformSupported
            if (r0 != 0) goto L7
            return
        L7:
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = r4
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            r5 = r0
            java.lang.instrument.Instrumentation r0 = moe.yushi.authlibinjector.AuthlibInjector.instrumentation
            java.lang.Class[] r0 = r0.getAllLoadedClasses()
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            r1 = r5
            void r1 = (v1) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
                return lambda$retransformClasses$0(r1, v1);
            }
            java.util.stream.Stream r0 = r0.filter(r1)
            void r1 = moe.yushi.authlibinjector.AuthlibInjector::canRetransformClass
            java.util.stream.Stream r0 = r0.filter(r1)
            void r1 = (v0) -> { // java.util.function.IntFunction.apply(int):java.lang.Object
                return lambda$retransformClasses$1(v0);
            }
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
            r6 = r0
            r0 = r6
            int r0 = r0.length
            if (r0 <= 0) goto L7a
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Attempt to retransform classes: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.String r2 = java.util.Arrays.toString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            java.lang.instrument.Instrumentation r0 = moe.yushi.authlibinjector.AuthlibInjector.instrumentation     // Catch: java.lang.Throwable -> L6f
            r1 = r6
            r0.retransformClasses(r1)     // Catch: java.lang.Throwable -> L6f
            goto L7a
        L6f:
            r7 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.String r1 = "Failed to retransform"
            r2 = r7
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
        L7a:
            return
    }

    public static void retransformAllClasses() {
            boolean r0 = moe.yushi.authlibinjector.AuthlibInjector.retransformSupported
            if (r0 != 0) goto L7
            return
        L7:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.String r1 = "Attempt to retransform all classes"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            r7 = r0
            java.lang.instrument.Instrumentation r0 = moe.yushi.authlibinjector.AuthlibInjector.instrumentation
            java.lang.Class[] r0 = r0.getAllLoadedClasses()
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            void r1 = moe.yushi.authlibinjector.AuthlibInjector::canRetransformClass
            java.util.stream.Stream r0 = r0.filter(r1)
            void r1 = (v0) -> { // java.util.function.IntFunction.apply(int):java.lang.Object
                return lambda$retransformAllClasses$2(v0);
            }
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
            r9 = r0
            r0 = r9
            int r0 = r0.length
            if (r0 <= 0) goto L54
            java.lang.instrument.Instrumentation r0 = moe.yushi.authlibinjector.AuthlibInjector.instrumentation     // Catch: java.lang.Throwable -> L48
            r1 = r9
            r0.retransformClasses(r1)     // Catch: java.lang.Throwable -> L48
            goto L54
        L48:
            r10 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.String r1 = "Failed to retransform"
            r2 = r10
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
            return
        L54:
            long r0 = java.lang.System.currentTimeMillis()
            r10 = r0
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Retransformed "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            int r2 = r2.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " classes in "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            r3 = r7
            long r2 = r2 - r3
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "ms"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            return
    }

    private static boolean canRetransformClass(java.lang.Class<?> r3) {
            java.lang.instrument.Instrumentation r0 = moe.yushi.authlibinjector.AuthlibInjector.instrumentation
            r1 = r3
            boolean r0 = r0.isModifiableClass(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r3
            java.lang.String r0 = r0.getName()
            r4 = r0
            java.util.Set<java.lang.String> r0 = moe.yushi.authlibinjector.Config.ignoredPackages
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L1c:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3c
            r0 = r5
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r4
            r1 = r6
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L39
            r0 = 0
            return r0
        L39:
            goto L1c
        L3c:
            r0 = 1
            return r0
    }

    public static moe.yushi.authlibinjector.transform.ClassTransformer getClassTransformer() {
            moe.yushi.authlibinjector.transform.ClassTransformer r0 = moe.yushi.authlibinjector.AuthlibInjector.classTransformer
            return r0
    }

    private static /* synthetic */ java.lang.Class[] lambda$retransformAllClasses$2(int r2) {
            r0 = r2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            return r0
    }

    private static /* synthetic */ java.lang.Class[] lambda$retransformClasses$1(int r2) {
            r0 = r2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            return r0
    }

    private static /* synthetic */ boolean lambda$retransformClasses$0(java.util.Set r3, java.lang.Class r4) {
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.contains(r1)
            return r0
    }

    static {
            r0 = 0
            moe.yushi.authlibinjector.AuthlibInjector.booted = r0
            return
    }
}
