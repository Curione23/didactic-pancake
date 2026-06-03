package org.apache.commons.codec;

/* JADX INFO: loaded from: classes2.dex */
public class Resources {
    @java.lang.Deprecated
    public Resources() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.io.InputStream getInputStream(java.lang.String r3) {
            java.lang.Class<org.apache.commons.codec.Resources> r0 = org.apache.commons.codec.Resources.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to resolve required resource: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}
