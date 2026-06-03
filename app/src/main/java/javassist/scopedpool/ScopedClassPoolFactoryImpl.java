package javassist.scopedpool;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/scopedpool/ScopedClassPoolFactoryImpl.class */
public class ScopedClassPoolFactoryImpl implements javassist.scopedpool.ScopedClassPoolFactory {
    public ScopedClassPoolFactoryImpl() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // javassist.scopedpool.ScopedClassPoolFactory
    public javassist.scopedpool.ScopedClassPool create(java.lang.ClassLoader r8, javassist.ClassPool r9, javassist.scopedpool.ScopedClassPoolRepository r10) {
            r7 = this;
            javassist.scopedpool.ScopedClassPool r0 = new javassist.scopedpool.ScopedClassPool
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    @Override // javassist.scopedpool.ScopedClassPoolFactory
    public javassist.scopedpool.ScopedClassPool create(javassist.ClassPool r8, javassist.scopedpool.ScopedClassPoolRepository r9) {
            r7 = this;
            javassist.scopedpool.ScopedClassPool r0 = new javassist.scopedpool.ScopedClassPool
            r1 = r0
            r2 = 0
            r3 = r8
            r4 = r9
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            return r0
    }
}
