package moe.yushi.authlibinjector.transform.support;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/support/ConstantURLTransformUnit.class */
public class ConstantURLTransformUnit extends moe.yushi.authlibinjector.transform.LdcTransformUnit {
    private moe.yushi.authlibinjector.httpd.URLProcessor urlProcessor;

    public ConstantURLTransformUnit(moe.yushi.authlibinjector.httpd.URLProcessor r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.urlProcessor = r1
            return
    }

    @Override // moe.yushi.authlibinjector.transform.LdcTransformUnit
    protected java.util.Optional<java.lang.String> transformLdc(java.lang.String r4) {
            r3 = this;
            r0 = r3
            moe.yushi.authlibinjector.httpd.URLProcessor r0 = r0.urlProcessor
            r1 = r4
            java.util.Optional r0 = r0.transformURL(r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Constant URL Transformer"
            return r0
    }
}
