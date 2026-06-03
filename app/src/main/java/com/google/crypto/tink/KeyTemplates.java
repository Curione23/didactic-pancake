package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyTemplates {
    private KeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.KeyTemplate get(java.lang.String r3) throws java.security.GeneralSecurityException {
            java.util.Map r0 = com.google.crypto.tink.Registry.keyTemplateMap()
            java.lang.Object r0 = r0.get(r3)
            com.google.crypto.tink.KeyTemplate r0 = (com.google.crypto.tink.KeyTemplate) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cannot find key template: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}
