package com.nide8.login2.transform;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/transform/SkinWhitelistTransformUnit.class */
public class SkinWhitelistTransformUnit implements com.nide8.login2.transform.TransformUnit {
    private java.lang.String[] skinWhitelist;


    public SkinWhitelistTransformUnit(java.lang.String[] r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.skinWhitelist = r1
            return
    }

    @Override // com.nide8.login2.transform.TransformUnit
    public java.util.Optional<com.nide8.login2.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.String r8, com.nide8.login2.internal.org.objectweb.asm.ClassVisitor r9, java.lang.Runnable r10) {
            r7 = this;
            java.lang.String r0 = "com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService"
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19
            com.nide8.login2.transform.SkinWhitelistTransformUnit$1 r0 = new com.nide8.login2.transform.SkinWhitelistTransformUnit$1
            r1 = r0
            r2 = r7
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L19:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Skin Whitelist Transformer"
            return r0
    }

    static /* synthetic */ java.lang.String[] access$000(com.nide8.login2.transform.SkinWhitelistTransformUnit r2) {
            r0 = r2
            java.lang.String[] r0 = r0.skinWhitelist
            return r0
    }
}
