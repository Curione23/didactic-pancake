package moe.yushi.authlibinjector.httpd;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/httpd/URLFilter.class */
public interface URLFilter {
    boolean canHandle(java.lang.String r1);

    java.util.Optional<moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> handle(java.lang.String r1, java.lang.String r2, moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession r3) throws java.io.IOException;
}
