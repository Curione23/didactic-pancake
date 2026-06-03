package javassist.scopedpool;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/scopedpool/ScopedClassPoolFactory.class */
public interface ScopedClassPoolFactory {
    javassist.scopedpool.ScopedClassPool create(java.lang.ClassLoader r1, javassist.ClassPool r2, javassist.scopedpool.ScopedClassPoolRepository r3);

    javassist.scopedpool.ScopedClassPool create(javassist.ClassPool r1, javassist.scopedpool.ScopedClassPoolRepository r2);
}
