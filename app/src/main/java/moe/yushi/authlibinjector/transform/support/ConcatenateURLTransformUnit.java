package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/ConcatenateURLTransformUnit.class */
public class ConcatenateURLTransformUnit implements moe.yushi.authlibinjector.transform.TransformUnit {


    public ConcatenateURLTransformUnit() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @moe.yushi.authlibinjector.transform.CallbackMethod
    public static java.net.URL concatenateURL(java.net.URL r8, java.lang.String r9) {
            r0 = r8
            java.lang.String r0 = r0.getQuery()     // Catch: java.net.MalformedURLException -> L6d
            if (r0 == 0) goto L3f
            r0 = r8
            java.lang.String r0 = r0.getQuery()     // Catch: java.net.MalformedURLException -> L6d
            int r0 = r0.length()     // Catch: java.net.MalformedURLException -> L6d
            if (r0 <= 0) goto L3f
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L6d
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.getProtocol()     // Catch: java.net.MalformedURLException -> L6d
            r3 = r8
            java.lang.String r3 = r3.getHost()     // Catch: java.net.MalformedURLException -> L6d
            r4 = r8
            int r4 = r4.getPort()     // Catch: java.net.MalformedURLException -> L6d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.net.MalformedURLException -> L6d
            r6 = r5
            r6.<init>()     // Catch: java.net.MalformedURLException -> L6d
            r6 = r8
            java.lang.String r6 = r6.getFile()     // Catch: java.net.MalformedURLException -> L6d
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.net.MalformedURLException -> L6d
            java.lang.String r6 = "&"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.net.MalformedURLException -> L6d
            r6 = r9
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.net.MalformedURLException -> L6d
            java.lang.String r5 = r5.toString()     // Catch: java.net.MalformedURLException -> L6d
            r1.<init>(r2, r3, r4, r5)     // Catch: java.net.MalformedURLException -> L6d
            return r0
        L3f:
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L6d
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.getProtocol()     // Catch: java.net.MalformedURLException -> L6d
            r3 = r8
            java.lang.String r3 = r3.getHost()     // Catch: java.net.MalformedURLException -> L6d
            r4 = r8
            int r4 = r4.getPort()     // Catch: java.net.MalformedURLException -> L6d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.net.MalformedURLException -> L6d
            r6 = r5
            r6.<init>()     // Catch: java.net.MalformedURLException -> L6d
            r6 = r8
            java.lang.String r6 = r6.getFile()     // Catch: java.net.MalformedURLException -> L6d
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.net.MalformedURLException -> L6d
            java.lang.String r6 = "?"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.net.MalformedURLException -> L6d
            r6 = r9
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.net.MalformedURLException -> L6d
            java.lang.String r5 = r5.toString()     // Catch: java.net.MalformedURLException -> L6d
            r1.<init>(r2, r3, r4, r5)     // Catch: java.net.MalformedURLException -> L6d
            return r0
        L6d:
            r10 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Could not concatenate given URL with GET arguments!"
            r3 = r10
            r1.<init>(r2, r3)
            throw r0
    }

    @Override // moe.yushi.authlibinjector.transform.TransformUnit
    public java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.ClassLoader r8, java.lang.String r9, moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r10, moe.yushi.authlibinjector.transform.TransformContext r11) {
            r7 = this;
            java.lang.String r0 = "com.mojang.authlib.HttpAuthenticationService"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            moe.yushi.authlibinjector.transform.support.ConcatenateURLTransformUnit$1 r0 = new moe.yushi.authlibinjector.transform.support.ConcatenateURLTransformUnit$1
            r1 = r0
            r2 = r7
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L1a:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ConcatenateURL Workaround"
            return r0
    }
}
