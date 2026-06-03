package moe.yushi.authlibinjector;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/Config.class */
public final class Config {
    public static boolean verboseLogging;
    public static boolean authlibLogging;
    public static boolean printUntransformedClass;
    public static boolean dumpClass;
    public static boolean httpdDisabled;
    public static java.net.Proxy mojangProxy;
    public static java.util.Set<java.lang.String> ignoredPackages;
    public static moe.yushi.authlibinjector.Config.FeatureOption mojangNamespace;
    public static moe.yushi.authlibinjector.Config.FeatureOption legacySkinPolyfill;
    public static moe.yushi.authlibinjector.Config.FeatureOption mojangAntiFeatures;
    public static moe.yushi.authlibinjector.Config.FeatureOption profileKey;
    public static moe.yushi.authlibinjector.Config.FeatureOption usernameCheck;
    public static boolean noShowServerName;
    public static int httpdPort;
    private static final java.lang.String[] DEFAULT_IGNORED_PACKAGES = null;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/Config$FeatureOption.class */
    public enum FeatureOption extends java.lang.Enum<moe.yushi.authlibinjector.Config.FeatureOption> {
        public static final moe.yushi.authlibinjector.Config.FeatureOption DEFAULT = null;
        public static final moe.yushi.authlibinjector.Config.FeatureOption ENABLED = null;
        public static final moe.yushi.authlibinjector.Config.FeatureOption DISABLED = null;
        private static final /* synthetic */ moe.yushi.authlibinjector.Config.FeatureOption[] $VALUES = null;

        public static moe.yushi.authlibinjector.Config.FeatureOption[] values() {
                moe.yushi.authlibinjector.Config$FeatureOption[] r0 = moe.yushi.authlibinjector.Config.FeatureOption.$VALUES
                java.lang.Object r0 = r0.clone()
                moe.yushi.authlibinjector.Config$FeatureOption[] r0 = (moe.yushi.authlibinjector.Config.FeatureOption[]) r0
                return r0
        }

        public static moe.yushi.authlibinjector.Config.FeatureOption valueOf(java.lang.String r3) {
                java.lang.Class<moe.yushi.authlibinjector.Config$FeatureOption> r0 = moe.yushi.authlibinjector.Config.FeatureOption.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                moe.yushi.authlibinjector.Config$FeatureOption r0 = (moe.yushi.authlibinjector.Config.FeatureOption) r0
                return r0
        }

        FeatureOption(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public boolean isEnabled(boolean r4) {
                r3 = this;
                r0 = r3
                moe.yushi.authlibinjector.Config$FeatureOption r1 = moe.yushi.authlibinjector.Config.FeatureOption.DEFAULT
                if (r0 != r1) goto Lb
                r0 = r4
                goto L17
            Lb:
                r0 = r3
                moe.yushi.authlibinjector.Config$FeatureOption r1 = moe.yushi.authlibinjector.Config.FeatureOption.ENABLED
                if (r0 != r1) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                return r0
        }

        private static /* synthetic */ moe.yushi.authlibinjector.Config.FeatureOption[] $values() {
                r0 = 3
                moe.yushi.authlibinjector.Config$FeatureOption[] r0 = new moe.yushi.authlibinjector.Config.FeatureOption[r0]
                r1 = r0
                r2 = 0
                moe.yushi.authlibinjector.Config$FeatureOption r3 = moe.yushi.authlibinjector.Config.FeatureOption.DEFAULT
                r1[r2] = r3
                r1 = r0
                r2 = 1
                moe.yushi.authlibinjector.Config$FeatureOption r3 = moe.yushi.authlibinjector.Config.FeatureOption.ENABLED
                r1[r2] = r3
                r1 = r0
                r2 = 2
                moe.yushi.authlibinjector.Config$FeatureOption r3 = moe.yushi.authlibinjector.Config.FeatureOption.DISABLED
                r1[r2] = r3
                return r0
        }

        static {
                moe.yushi.authlibinjector.Config$FeatureOption r0 = new moe.yushi.authlibinjector.Config$FeatureOption
                r1 = r0
                java.lang.String r2 = "DEFAULT"
                r3 = 0
                r1.<init>(r2, r3)
                moe.yushi.authlibinjector.Config.FeatureOption.DEFAULT = r0
                moe.yushi.authlibinjector.Config$FeatureOption r0 = new moe.yushi.authlibinjector.Config$FeatureOption
                r1 = r0
                java.lang.String r2 = "ENABLED"
                r3 = 1
                r1.<init>(r2, r3)
                moe.yushi.authlibinjector.Config.FeatureOption.ENABLED = r0
                moe.yushi.authlibinjector.Config$FeatureOption r0 = new moe.yushi.authlibinjector.Config$FeatureOption
                r1 = r0
                java.lang.String r2 = "DISABLED"
                r3 = 2
                r1.<init>(r2, r3)
                moe.yushi.authlibinjector.Config.FeatureOption.DISABLED = r0
                moe.yushi.authlibinjector.Config$FeatureOption[] r0 = $values()
                moe.yushi.authlibinjector.Config.FeatureOption.$VALUES = r0
                return
        }
    }

    private Config() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static void initDebugOptions() {
            java.lang.String r0 = "authlibinjector.debug"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r4 = r0
            java.lang.String r0 = "all"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            java.lang.String r0 = ""
            r4 = r0
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.String r1 = "'-Dauthlibinjector.debug=all' is deprecated, use '-Dauthlibinjector.debug' instead"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
        L1a:
            r0 = r4
            if (r0 != 0) goto L21
            goto L124
        L21:
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L33
            r0 = 1
            moe.yushi.authlibinjector.Config.verboseLogging = r0
            r0 = 1
            moe.yushi.authlibinjector.Config.authlibLogging = r0
            goto L124
        L33:
            r0 = r4
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            r5 = r0
            r0 = r5
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        L3f:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L124
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            r9 = r0
            r0 = -1
            r10 = r0
            r0 = r9
            int r0 = r0.hashCode()
            switch(r0) {
                case -1381132316: goto Lb0;
                case -646511651: goto L90;
                case 351107458: goto L80;
                case 1840927525: goto La0;
                default: goto Lbd;
            }
        L80:
            r0 = r9
            java.lang.String r1 = "verbose"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbd
            r0 = 0
            r10 = r0
            goto Lbd
        L90:
            r0 = r9
            java.lang.String r1 = "authlib"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbd
            r0 = 1
            r10 = r0
            goto Lbd
        La0:
            r0 = r9
            java.lang.String r1 = "printUntransformed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbd
            r0 = 2
            r10 = r0
            goto Lbd
        Lb0:
            r0 = r9
            java.lang.String r1 = "dumpClass"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbd
            r0 = 3
            r10 = r0
        Lbd:
            r0 = r10
            switch(r0) {
                case 0: goto Ldc;
                case 1: goto Le3;
                case 2: goto Lea;
                case 3: goto Lf5;
                default: goto Lfc;
            }
        Ldc:
            r0 = 1
            moe.yushi.authlibinjector.Config.verboseLogging = r0
            goto L11e
        Le3:
            r0 = 1
            moe.yushi.authlibinjector.Config.authlibLogging = r0
            goto L11e
        Lea:
            r0 = 1
            moe.yushi.authlibinjector.Config.printUntransformedClass = r0
            r0 = 1
            moe.yushi.authlibinjector.Config.verboseLogging = r0
            goto L11e
        Lf5:
            r0 = 1
            moe.yushi.authlibinjector.Config.dumpClass = r0
            goto L11e
        Lfc:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Unrecognized debug option: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.InitializationException r0 = new moe.yushi.authlibinjector.InitializationException
            r1 = r0
            r1.<init>()
            throw r0
        L11e:
            int r7 = r7 + 1
            goto L3f
        L124:
            return
    }

    private static void initIgnoredPackages() {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r3 = r0
            java.lang.String[] r0 = moe.yushi.authlibinjector.Config.DEFAULT_IGNORED_PACKAGES
            r4 = r0
            r0 = r4
            int r0 = r0.length
            r5 = r0
            r0 = 0
            r6 = r0
        L11:
            r0 = r6
            r1 = r5
            if (r0 >= r1) goto L2a
            r0 = r4
            r1 = r6
            r0 = r0[r1]
            r7 = r0
            r0 = r3
            r1 = r7
            boolean r0 = r0.add(r1)
            int r6 = r6 + 1
            goto L11
        L2a:
            java.lang.String r0 = "authlibinjector.ignoredPackages"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L6b
            r0 = r4
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            r5 = r0
            r0 = r5
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        L41:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L6b
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.trim()
            r8 = r0
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L65
            r0 = r3
            r1 = r8
            boolean r0 = r0.add(r1)
        L65:
            int r7 = r7 + 1
            goto L41
        L6b:
            r0 = r3
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            moe.yushi.authlibinjector.Config.ignoredPackages = r0
            return
    }

    private static void initMojangProxy() {
            java.lang.String r0 = "authlibinjector.mojangProxy"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L1d
            java.lang.String r0 = "authlibinjector.mojang.proxy"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L15
            return
        L15:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.String r1 = "'-Dauthlibinjector.mojang.proxy=' is deprecated, use '-Dauthlibinjector.mojangProxy=' instead"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
        L1d:
            java.lang.String r0 = "^(?<protocol>[^:]+)://(?<host>[^/]+)+:(?<port>\\d+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r1 = r8
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r9 = r0
            r0 = r9
            boolean r0 = r0.find()
            if (r0 != 0) goto L4f
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Unrecognized proxy URL: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.InitializationException r0 = new moe.yushi.authlibinjector.InitializationException
            r1 = r0
            r1.<init>()
            throw r0
        L4f:
            r0 = r9
            java.lang.String r1 = "protocol"
            java.lang.String r0 = r0.group(r1)
            r10 = r0
            r0 = r9
            java.lang.String r1 = "host"
            java.lang.String r0 = r0.group(r1)
            r11 = r0
            r0 = r9
            java.lang.String r1 = "port"
            java.lang.String r0 = r0.group(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r12 = r0
            r0 = r10
            r13 = r0
            r0 = -1
            r14 = r0
            r0 = r13
            int r0 = r0.hashCode()
            switch(r0) {
                case 109610287: goto L84;
                default: goto L91;
            }
        L84:
            r0 = r13
            java.lang.String r1 = "socks"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L91
            r0 = 0
            r14 = r0
        L91:
            r0 = r14
            switch(r0) {
                case 0: goto La4;
                default: goto Lbe;
            }
        La4:
            java.net.Proxy r0 = new java.net.Proxy
            r1 = r0
            java.net.Proxy$Type r2 = java.net.Proxy.Type.SOCKS
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress
            r4 = r3
            r5 = r11
            r6 = r12
            r4.<init>(r5, r6)
            r1.<init>(r2, r3)
            moe.yushi.authlibinjector.Config.mojangProxy = r0
            goto Ldf
        Lbe:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Unsupported proxy protocol: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.InitializationException r0 = new moe.yushi.authlibinjector.InitializationException
            r1 = r0
            r1.<init>()
            throw r0
        Ldf:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Mojang proxy: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.net.Proxy r2 = moe.yushi.authlibinjector.Config.mojangProxy
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            return
    }

    private static moe.yushi.authlibinjector.Config.FeatureOption parseFeatureOption(java.lang.String r4) {
            r0 = r4
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Ld
            moe.yushi.authlibinjector.Config$FeatureOption r0 = moe.yushi.authlibinjector.Config.FeatureOption.DEFAULT
            return r0
        Ld:
            r0 = r5
            java.lang.String r0 = r0.toUpperCase()     // Catch: java.lang.IllegalArgumentException -> L15
            moe.yushi.authlibinjector.Config$FeatureOption r0 = moe.yushi.authlibinjector.Config.FeatureOption.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L15
            return r0
        L15:
            r6 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Invalid option: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.InitializationException r0 = new moe.yushi.authlibinjector.InitializationException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    static void init() {
            initDebugOptions()
            initIgnoredPackages()
            initMojangProxy()
            java.lang.String r0 = "authlibinjector.mojangNamespace"
            moe.yushi.authlibinjector.Config$FeatureOption r0 = parseFeatureOption(r0)
            moe.yushi.authlibinjector.Config.mojangNamespace = r0
            java.lang.String r0 = "authlibinjector.legacySkinPolyfill"
            moe.yushi.authlibinjector.Config$FeatureOption r0 = parseFeatureOption(r0)
            moe.yushi.authlibinjector.Config.legacySkinPolyfill = r0
            java.lang.String r0 = "authlibinjector.mojangAntiFeatures"
            moe.yushi.authlibinjector.Config$FeatureOption r0 = parseFeatureOption(r0)
            moe.yushi.authlibinjector.Config.mojangAntiFeatures = r0
            java.lang.String r0 = "authlibinjector.profileKey"
            moe.yushi.authlibinjector.Config$FeatureOption r0 = parseFeatureOption(r0)
            moe.yushi.authlibinjector.Config.profileKey = r0
            java.lang.String r0 = "authlibinjector.usernameCheck"
            moe.yushi.authlibinjector.Config$FeatureOption r0 = parseFeatureOption(r0)
            moe.yushi.authlibinjector.Config.usernameCheck = r0
            java.lang.String r0 = "authlibinjector.disableHttpd"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L42
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            moe.yushi.authlibinjector.Config.httpdDisabled = r0
            java.lang.String r0 = "authlibinjector.noShowServerName"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L53
            r0 = 1
            goto L54
        L53:
            r0 = 0
        L54:
            moe.yushi.authlibinjector.Config.noShowServerName = r0
            java.lang.String r0 = "authlibinjector.httpdPort"
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            moe.yushi.authlibinjector.Config.httpdPort = r0
            return
    }

    static {
            r0 = 7
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "moe.yushi.authlibinjector."
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
            moe.yushi.authlibinjector.Config.DEFAULT_IGNORED_PACKAGES = r0
            return
    }
}
