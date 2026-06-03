package moe.yushi.authlibinjector;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/Premain.class */
public final class Premain {
    private Premain() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void premain(java.lang.String r4, java.lang.instrument.Instrumentation r5) {
            r0 = r4
            r1 = r5
            r2 = 0
            initInjector(r0, r1, r2)     // Catch: moe.yushi.authlibinjector.InitializationException -> L9 java.lang.Throwable -> L1a
            goto L28
        L9:
            r6 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.String r1 = "A known exception has occurred"
            r2 = r6
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
            r0 = 1
            java.lang.System.exit(r0)
            goto L28
        L1a:
            r6 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.String r1 = "An exception has occurred, exiting"
            r2 = r6
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
            r0 = 1
            java.lang.System.exit(r0)
        L28:
            return
    }

    public static void agentmain(java.lang.String r4, java.lang.instrument.Instrumentation r5) {
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO     // Catch: moe.yushi.authlibinjector.InitializationException -> L11 java.lang.Throwable -> L1e
            java.lang.String r1 = "Launched from agentmain"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)     // Catch: moe.yushi.authlibinjector.InitializationException -> L11 java.lang.Throwable -> L1e
            r0 = r4
            r1 = r5
            r2 = 1
            initInjector(r0, r1, r2)     // Catch: moe.yushi.authlibinjector.InitializationException -> L11 java.lang.Throwable -> L1e
            goto L28
        L11:
            r6 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.String r1 = "A known exception has occurred"
            r2 = r6
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
            goto L28
        L1e:
            r6 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.String r1 = "An exception has occurred"
            r2 = r6
            moe.yushi.authlibinjector.util.Logging.log(r0, r1, r2)
        L28:
            return
    }

    private static void initInjector(java.lang.String r3, java.lang.instrument.Instrumentation r4, boolean r5) {
            r0 = r4
            r1 = r3
            moe.yushi.authlibinjector.AuthlibInjector.bootstrap(r0, r1)
            r0 = r5
            if (r0 == 0) goto Lc
            moe.yushi.authlibinjector.AuthlibInjector.retransformAllClasses()
        Lc:
            return
    }
}
