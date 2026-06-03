package moe.yushi.authlibinjector.yggdrasil;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/yggdrasil/CustomYggdrasilAPIProvider.class */
public class CustomYggdrasilAPIProvider implements moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider {
    private java.lang.String apiRoot;

    public CustomYggdrasilAPIProvider(moe.yushi.authlibinjector.APIMetadata r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.getApiRoot()
            r0.apiRoot = r1
            return
    }

    @Override // moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider
    public java.lang.String queryUUIDsByNames() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.String r1 = r1.apiRoot
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "api/profiles/minecraft"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider
    public java.lang.String queryProfile(java.util.UUID r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.String r1 = r1.apiRoot
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "sessionserver/session/minecraft/profile/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = moe.yushi.authlibinjector.util.UUIDUtils.toUnsignedUUID(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.apiRoot
            return r0
    }
}
