package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/PaperUsernameCheckTransformer.class */
public class PaperUsernameCheckTransformer implements moe.yushi.authlibinjector.transform.TransformUnit {


    public PaperUsernameCheckTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // moe.yushi.authlibinjector.transform.TransformUnit
    public java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.ClassLoader r8, java.lang.String r9, moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r10, moe.yushi.authlibinjector.transform.TransformContext r11) {
            r7 = this;
            r0 = r11
            java.util.List r0 = r0.getStringConstants()
            java.lang.String r1 = "Invalid characters in username"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L15
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        L15:
            moe.yushi.authlibinjector.transform.support.PaperUsernameCheckTransformer$1 r0 = new moe.yushi.authlibinjector.transform.support.PaperUsernameCheckTransformer$1
            r1 = r0
            r2 = r7
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Paper Username Check Transformer"
            return r0
    }
}
