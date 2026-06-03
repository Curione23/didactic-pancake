package javassist.util.proxy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/ProxyObject.class */
public interface ProxyObject extends javassist.util.proxy.Proxy {
    @Override // javassist.util.proxy.Proxy
    void setHandler(javassist.util.proxy.MethodHandler r1);

    javassist.util.proxy.MethodHandler getHandler();
}
