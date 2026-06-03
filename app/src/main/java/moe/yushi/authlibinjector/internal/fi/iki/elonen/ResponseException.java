package moe.yushi.authlibinjector.internal.fi.iki.elonen;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/ResponseException.class */
public class ResponseException extends java.lang.Exception {
    private final moe.yushi.authlibinjector.internal.fi.iki.elonen.Status status;

    public ResponseException(moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.status = r1
            return
    }

    public ResponseException(moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r5, java.lang.String r6, java.lang.Exception r7) {
            r4 = this;
            r0 = r4
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.status = r1
            return
    }

    public moe.yushi.authlibinjector.internal.fi.iki.elonen.Status getStatus() {
            r2 = this;
            r0 = r2
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = r0.status
            return r0
    }
}
