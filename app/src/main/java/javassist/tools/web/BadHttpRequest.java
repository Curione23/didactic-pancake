package javassist.tools.web;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/web/BadHttpRequest.class */
public class BadHttpRequest extends java.lang.Exception {
    private static final long serialVersionUID = 1;
    private java.lang.Exception e;

    public BadHttpRequest() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.e = r1
            return
    }

    public BadHttpRequest(java.lang.Exception r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.e = r1
            return
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.Exception r0 = r0.e
            if (r0 != 0) goto Lc
            r0 = r2
            java.lang.String r0 = super.toString()
            return r0
        Lc:
            r0 = r2
            java.lang.Exception r0 = r0.e
            java.lang.String r0 = r0.toString()
            return r0
    }
}
