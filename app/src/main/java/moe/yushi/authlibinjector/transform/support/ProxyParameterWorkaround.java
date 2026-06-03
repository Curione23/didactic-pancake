package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/ProxyParameterWorkaround.class */
public final class ProxyParameterWorkaround {
    private static final java.util.Set<java.lang.String> PROXY_PARAMETERS = null;

    private ProxyParameterWorkaround() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void init() {
            java.util.List r0 = moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer.getArgumentsListeners()
            void r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$init$0(v0);
            }
            boolean r0 = r0.add(r1)
            return
    }

    private static /* synthetic */ java.lang.String[] lambda$init$0(java.lang.String[] r6) {
            r0 = 0
            r7 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = 0
            r9 = r0
        Lc:
            r0 = r9
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L68
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L58
            java.util.Set<java.lang.String> r0 = moe.yushi.authlibinjector.transform.support.ProxyParameterWorkaround.PROXY_PARAMETERS
            r1 = r6
            r2 = r9
            r1 = r1[r2]
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L58
            r0 = 1
            r7 = r0
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Dropping main argument "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            r3 = r9
            r2 = r2[r3]
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            int r9 = r9 + 1
            goto L62
        L58:
            r0 = r8
            r1 = r6
            r2 = r9
            r1 = r1[r2]
            boolean r0 = r0.add(r1)
        L62:
            int r9 = r9 + 1
            goto Lc
        L68:
            r0 = r7
            if (r0 == 0) goto L74
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.String r1 = "--proxyHost parameter conflicts with authlib-injector, therefore proxy is disabled."
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
        L74:
            r0 = r8
            r1 = r8
            int r1 = r1.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 4
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "--proxyHost"
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.String r5 = "--proxyPort"
            r3[r4] = r5
            r3 = r2
            r4 = 2
            java.lang.String r5 = "--proxyUser"
            r3[r4] = r5
            r3 = r2
            r4 = 3
            java.lang.String r5 = "--proxyPass"
            r3[r4] = r5
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            moe.yushi.authlibinjector.transform.support.ProxyParameterWorkaround.PROXY_PARAMETERS = r0
            return
    }
}
