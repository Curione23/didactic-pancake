package com.nide8.login2.transform;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/transform/YggdrasilApiTransformUnit.class */
public class YggdrasilApiTransformUnit extends com.nide8.login2.transform.RegexTransformUnit {
    public static final java.util.regex.Pattern REGEX = null;
    public static final java.util.function.Function<java.lang.String, java.lang.String> REPLACEMENT = null;

    public YggdrasilApiTransformUnit(java.lang.String r6) {
            r5 = this;
            r0 = r5
            java.util.regex.Pattern r1 = com.nide8.login2.transform.YggdrasilApiTransformUnit.REGEX
            java.util.function.Function<java.lang.String, java.lang.String> r2 = com.nide8.login2.transform.YggdrasilApiTransformUnit.REPLACEMENT
            r3 = r6
            java.lang.Object r2 = r2.apply(r3)
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r1, r2)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Yggdrasil Api Transformer"
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$static$0(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "$1$2${path}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    static {
            java.lang.String r0 = "^https?:\\/\\/(?:(?:(api|authserver|sessionserver)\\.(?:mojang\\.com))|(?:(skins|session)\\.(?:minecraft\\.net))|(?:(api)\\.(?:minecraftservices\\.com)))(?<path>.*)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.nide8.login2.transform.YggdrasilApiTransformUnit.REGEX = r0
            void r0 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$static$0(v0);
            }
            com.nide8.login2.transform.YggdrasilApiTransformUnit.REPLACEMENT = r0
            return
    }
}
