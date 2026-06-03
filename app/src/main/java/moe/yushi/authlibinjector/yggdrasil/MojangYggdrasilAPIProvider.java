package moe.yushi.authlibinjector.yggdrasil;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/yggdrasil/MojangYggdrasilAPIProvider.class */
public class MojangYggdrasilAPIProvider implements moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider {
    public MojangYggdrasilAPIProvider() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider
    public java.lang.String queryUUIDsByNames() {
            r2 = this;
            java.lang.String r0 = "https://api.mojang.com/profiles/minecraft"
            return r0
    }

    @Override // moe.yushi.authlibinjector.yggdrasil.YggdrasilAPIProvider
    public java.lang.String queryProfile(java.util.UUID r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "https://sessionserver.mojang.com/session/minecraft/profile/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = moe.yushi.authlibinjector.util.UUIDUtils.toUnsignedUUID(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Mojang"
            return r0
    }
}
