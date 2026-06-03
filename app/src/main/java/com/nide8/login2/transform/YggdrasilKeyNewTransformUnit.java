package com.nide8.login2.transform;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/transform/YggdrasilKeyNewTransformUnit.class */
public class YggdrasilKeyNewTransformUnit implements com.nide8.login2.transform.TransformUnit {
    private byte[] publicKey;


    public YggdrasilKeyNewTransformUnit(byte[] r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.publicKey = r1
            return
    }

    @Override // com.nide8.login2.transform.TransformUnit
    public java.util.Optional<com.nide8.login2.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.String r8, com.nide8.login2.internal.org.objectweb.asm.ClassVisitor r9, java.lang.Runnable r10) {
            r7 = this;
            java.lang.String r0 = "com.mojang.authlib.yggdrasil.YggdrasilServicesKeyInfo"
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19
            com.nide8.login2.transform.YggdrasilKeyNewTransformUnit$1 r0 = new com.nide8.login2.transform.YggdrasilKeyNewTransformUnit$1
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
            java.lang.String r0 = "Yggdrasil Publickey Transform"
            return r0
    }

    static /* synthetic */ byte[] access$000(com.nide8.login2.transform.YggdrasilKeyNewTransformUnit r2) {
            r0 = r2
            byte[] r0 = r0.publicKey
            return r0
    }
}
