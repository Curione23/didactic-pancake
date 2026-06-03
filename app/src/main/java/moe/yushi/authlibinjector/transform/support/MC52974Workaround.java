package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/MC52974Workaround.class */
public class MC52974Workaround implements moe.yushi.authlibinjector.transform.TransformUnit {
    private static final java.util.Set<java.lang.String> AFFECTED_VERSION_SERIES = null;


    private MC52974Workaround() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void init() {
            java.util.List r0 = moe.yushi.authlibinjector.transform.support.MainArgumentsTransformer.getVersionSeriesListeners()
            void r1 = (v0) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$init$0(v0);
            }
            boolean r0 = r0.add(r1)
            return
    }

    @Override // moe.yushi.authlibinjector.transform.TransformUnit
    public java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.ClassLoader r8, java.lang.String r9, moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r10, moe.yushi.authlibinjector.transform.TransformContext r11) {
            r7 = this;
            java.lang.String r0 = "com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            moe.yushi.authlibinjector.transform.support.MC52974Workaround$1 r0 = new moe.yushi.authlibinjector.transform.support.MC52974Workaround$1
            r1 = r0
            r2 = r7
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L1a:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "MC-52974 Workaround"
            return r0
    }

    private static /* synthetic */ void lambda$init$0(java.lang.String r5) {
            java.util.Set<java.lang.String> r0 = moe.yushi.authlibinjector.transform.support.MC52974Workaround.AFFECTED_VERSION_SERIES
            r1 = r5
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L33
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.String r1 = "Enable MC-52974 Workaround"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.transform.ClassTransformer r0 = moe.yushi.authlibinjector.AuthlibInjector.getClassTransformer()
            java.util.List<moe.yushi.authlibinjector.transform.TransformUnit> r0 = r0.units
            moe.yushi.authlibinjector.transform.support.MC52974Workaround r1 = new moe.yushi.authlibinjector.transform.support.MC52974Workaround
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService"
            r1[r2] = r3
            moe.yushi.authlibinjector.AuthlibInjector.retransformClasses(r0)
        L33:
            return
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 6
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "1.7.10"
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.String r5 = "1.8"
            r3[r4] = r5
            r3 = r2
            r4 = 2
            java.lang.String r5 = "1.9"
            r3[r4] = r5
            r3 = r2
            r4 = 3
            java.lang.String r5 = "1.10"
            r3[r4] = r5
            r3 = r2
            r4 = 4
            java.lang.String r5 = "1.11"
            r3[r4] = r5
            r3 = r2
            r4 = 5
            java.lang.String r5 = "1.12"
            r3[r4] = r5
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            moe.yushi.authlibinjector.transform.support.MC52974Workaround.AFFECTED_VERSION_SERIES = r0
            return
    }
}
