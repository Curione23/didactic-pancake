package com.nide8.login2.transform;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/transform/RegexTransformUnit.class */
public class RegexTransformUnit extends com.nide8.login2.transform.LdcTransformUnit {
    public RegexTransformUnit(java.util.regex.Pattern r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            void r1 = (v2) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$new$0(r1, r2, v2);
            }
            r0.<init>(r1)
            return
    }

    private static /* synthetic */ java.util.Optional lambda$new$0(java.util.regex.Pattern r3, java.lang.String r4, java.lang.String r5) {
            r0 = r3
            r1 = r5
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r1 = r4
            java.lang.String r0 = r0.replaceAll(r1)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
    }
}
