package moe.yushi.authlibinjector.internal.fi.iki.elonen;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/IHTTPSession.class */
public interface IHTTPSession {
    java.net.InetSocketAddress getRemoteAddress();

    java.lang.String getMethod();

    java.lang.String getUri();

    java.lang.String getQueryParameterString();

    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getParameters();

    java.util.Map<java.lang.String, java.lang.String> getHeaders();

    java.io.InputStream getInputStream() throws java.io.IOException;
}
