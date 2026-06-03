package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/AuthServerNameInjector.class */
public final class AuthServerNameInjector {
    private AuthServerNameInjector() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.lang.String getServerName(moe.yushi.authlibinjector.APIMetadata r3) {
            r0 = r3
            java.util.Map r0 = r0.getMeta()
            java.lang.String r1 = "serverName"
            java.lang.Object r0 = r0.get(r1)
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L18
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L18:
            r0 = r3
            java.lang.String r0 = r0.getApiRoot()
            return r0
    }

    public static void init(moe.yushi.authlibinjector.APIMetadata r3) {
            java.util.List r0 = moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer.getArgumentsListeners()
            r1 = r3
            void r1 = (v1) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$init$0(r1, v1);
            }
            boolean r0 = r0.add(r1)
            return
    }

    private static /* synthetic */ java.lang.String[] lambda$init$0(moe.yushi.authlibinjector.APIMetadata r4, java.lang.String[] r5) {
            r0 = 0
            r6 = r0
        L2:
            r0 = r6
            r1 = r5
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L42
            java.lang.String r0 = "--versionType"
            r1 = r5
            r2 = r6
            r1 = r1[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            r0 = r4
            java.lang.String r0 = getServerName(r0)
            r7 = r0
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Setting versionType to server name: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            r0[r1] = r2
            goto L42
        L3c:
            int r6 = r6 + 1
            goto L2
        L42:
            r0 = r5
            return r0
    }
}
