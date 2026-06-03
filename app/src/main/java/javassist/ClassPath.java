package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/ClassPath.class */
public interface ClassPath {
    java.io.InputStream openClassfile(java.lang.String r1) throws javassist.NotFoundException;

    java.net.URL find(java.lang.String r1);
}
