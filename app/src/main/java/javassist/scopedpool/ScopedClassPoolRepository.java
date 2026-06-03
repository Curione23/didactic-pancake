package javassist.scopedpool;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/scopedpool/ScopedClassPoolRepository.class */
public interface ScopedClassPoolRepository {
    void setClassPoolFactory(javassist.scopedpool.ScopedClassPoolFactory r1);

    javassist.scopedpool.ScopedClassPoolFactory getClassPoolFactory();

    boolean isPrune();

    void setPrune(boolean r1);

    javassist.scopedpool.ScopedClassPool createScopedClassPool(java.lang.ClassLoader r1, javassist.ClassPool r2);

    javassist.ClassPool findClassPool(java.lang.ClassLoader r1);

    javassist.ClassPool registerClassLoader(java.lang.ClassLoader r1);

    java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> getRegisteredCLs();

    void clearUnregisteredClassLoaders();

    void unregisterClassLoader(java.lang.ClassLoader r1);
}
