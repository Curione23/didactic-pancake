package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/AccountTypeTransformer.class */
public class AccountTypeTransformer {
    public AccountTypeTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.lang.String[] transform(java.lang.String[] r5) {
            r4 = this;
            r0 = 0
            r6 = r0
            r0 = 0
            r7 = r0
        L4:
            r0 = r7
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L42
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            java.lang.String r0 = "--userType"
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            r0 = 1
            r6 = r0
            goto L3c
        L1e:
            r0 = r6
            if (r0 == 0) goto L3c
            java.lang.String r0 = "mojang"
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            r0 = r5
            r1 = r7
            java.lang.String r2 = "msa"
            r0[r1] = r2
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.String r1 = "Setting accountType to msa"
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            goto L42
        L3c:
            int r7 = r7 + 1
            goto L4
        L42:
            r0 = r5
            return r0
    }
}
