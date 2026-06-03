package moe.yushi.authlibinjector.httpd;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/httpd/DefaultURLRedirector.class */
public class DefaultURLRedirector implements moe.yushi.authlibinjector.httpd.URLRedirector {
    private java.util.Map<java.lang.String, java.lang.String> domainMapping;
    private java.lang.String apiRoot;

    public DefaultURLRedirector(moe.yushi.authlibinjector.APIMetadata r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.domainMapping = r1
            r0 = r4
            r0.initDomainMapping()
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.getApiRoot()
            r0.apiRoot = r1
            return
    }

    private void initDomainMapping() {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.domainMapping
            java.lang.String r1 = "api.mojang.com"
            java.lang.String r2 = "api"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.domainMapping
            java.lang.String r1 = "authserver.mojang.com"
            java.lang.String r2 = "authserver"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.domainMapping
            java.lang.String r1 = "sessionserver.mojang.com"
            java.lang.String r2 = "sessionserver"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.domainMapping
            java.lang.String r1 = "skins.minecraft.net"
            java.lang.String r2 = "skins"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.domainMapping
            java.lang.String r1 = "api.minecraftservices.com"
            java.lang.String r2 = "minecraftservices"
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    @Override // moe.yushi.authlibinjector.httpd.URLRedirector
    public java.util.Optional<java.lang.String> redirect(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.domainMapping
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L16
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.String r1 = r1.apiRoot
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
    }
}
