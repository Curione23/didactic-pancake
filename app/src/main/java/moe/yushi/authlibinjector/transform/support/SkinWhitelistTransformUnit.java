package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/SkinWhitelistTransformUnit.class */
public class SkinWhitelistTransformUnit implements moe.yushi.authlibinjector.transform.TransformUnit {
    private static final java.lang.String[] DEFAULT_WHITELISTED_DOMAINS = null;
    private static final java.lang.String[] DEFAULT_BLACKLISTED_DOMAINS = null;
    private static final java.util.List<java.lang.String> WHITELISTED_DOMAINS = null;


    public SkinWhitelistTransformUnit() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean domainMatches(java.lang.String r3, java.lang.String r4) {
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            java.lang.String r1 = "."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L18
            r0 = r4
            r1 = r3
            boolean r0 = r0.endsWith(r1)
            return r0
        L18:
            r0 = r4
            r1 = r3
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static java.util.List<java.lang.String> getWhitelistedDomains() {
            java.util.List<java.lang.String> r0 = moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit.WHITELISTED_DOMAINS
            return r0
    }

    @moe.yushi.authlibinjector.transform.CallbackMethod
    public static boolean isWhitelistedDomain(java.lang.String r5) {
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r5
            r0.println(r1)
            java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> L16
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: java.net.URISyntaxException -> L16
            java.lang.String r0 = r0.getHost()     // Catch: java.net.URISyntaxException -> L16
            r6 = r0
            goto L37
        L16:
            r7 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid URL '"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "'"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L37:
            java.lang.String[] r0 = moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit.DEFAULT_BLACKLISTED_DOMAINS
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L41:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L5e
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = r6
            boolean r0 = domainMatches(r0, r1)
            if (r0 == 0) goto L58
            r0 = 0
            return r0
        L58:
            int r9 = r9 + 1
            goto L41
        L5e:
            java.lang.String[] r0 = moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit.DEFAULT_WHITELISTED_DOMAINS
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L68:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L85
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = r6
            boolean r0 = domainMatches(r0, r1)
            if (r0 == 0) goto L7f
            r0 = 1
            return r0
        L7f:
            int r9 = r9 + 1
            goto L68
        L85:
            java.util.List<java.lang.String> r0 = moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit.WHITELISTED_DOMAINS
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L8e:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lae
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            r1 = r6
            boolean r0 = domainMatches(r0, r1)
            if (r0 == 0) goto Lab
            r0 = 1
            return r0
        Lab:
            goto L8e
        Lae:
            r0 = 0
            return r0
    }

    @Override // moe.yushi.authlibinjector.transform.TransformUnit
    public java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.ClassLoader r8, java.lang.String r9, moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r10, moe.yushi.authlibinjector.transform.TransformContext r11) {
            r7 = this;
            java.lang.String r0 = "com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12
            java.lang.String r0 = "com.mojang.authlib.yggdrasil.TextureUrlChecker"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L23
        L12:
            moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit$1 r0 = new moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit$1
            r1 = r0
            r2 = r7
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L23:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Texture Whitelist Transformer"
            return r0
    }

    static {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = ".minecraft.net"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = ".mojang.com"
            r1[r2] = r3
            moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit.DEFAULT_WHITELISTED_DOMAINS = r0
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "education.minecraft.net"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "bugs.mojang.com"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "feedback.minecraft.net"
            r1[r2] = r3
            moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit.DEFAULT_BLACKLISTED_DOMAINS = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r1 = r0
            r1.<init>()
            moe.yushi.authlibinjector.transform.support.SkinWhitelistTransformUnit.WHITELISTED_DOMAINS = r0
            return
    }
}
