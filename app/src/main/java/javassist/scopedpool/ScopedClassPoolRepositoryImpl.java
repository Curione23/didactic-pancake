package javassist.scopedpool;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/scopedpool/ScopedClassPoolRepositoryImpl.class */
public class ScopedClassPoolRepositoryImpl implements javassist.scopedpool.ScopedClassPoolRepository {
    private static final javassist.scopedpool.ScopedClassPoolRepositoryImpl instance = null;
    private boolean prune;
    boolean pruneWhenCached;
    protected java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> registeredCLs;
    protected javassist.ClassPool classpool;
    protected javassist.scopedpool.ScopedClassPoolFactory factory;

    public static javassist.scopedpool.ScopedClassPoolRepository getInstance() {
            javassist.scopedpool.ScopedClassPoolRepositoryImpl r0 = javassist.scopedpool.ScopedClassPoolRepositoryImpl.instance
            return r0
    }

    private ScopedClassPoolRepositoryImpl() {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = 1
            r0.prune = r1
            r0 = r5
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r2 = r1
            r2.<init>()
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r0.registeredCLs = r1
            r0 = r5
            javassist.scopedpool.ScopedClassPoolFactoryImpl r1 = new javassist.scopedpool.ScopedClassPoolFactoryImpl
            r2 = r1
            r2.<init>()
            r0.factory = r1
            r0 = r5
            javassist.ClassPool r1 = javassist.ClassPool.getDefault()
            r0.classpool = r1
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r6 = r0
            r0 = r5
            javassist.ClassPool r0 = r0.classpool
            javassist.LoaderClassPath r1 = new javassist.LoaderClassPath
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            javassist.ClassPath r0 = r0.insertClassPath(r1)
            return
    }

    @Override // javassist.scopedpool.ScopedClassPoolRepository
    public boolean isPrune() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.prune
            return r0
    }

    @Override // javassist.scopedpool.ScopedClassPoolRepository
    public void setPrune(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.prune = r1
            return
    }

    @Override // javassist.scopedpool.ScopedClassPoolRepository
    public javassist.scopedpool.ScopedClassPool createScopedClassPool(java.lang.ClassLoader r6, javassist.ClassPool r7) {
            r5 = this;
            r0 = r5
            javassist.scopedpool.ScopedClassPoolFactory r0 = r0.factory
            r1 = r6
            r2 = r7
            r3 = r5
            javassist.scopedpool.ScopedClassPool r0 = r0.create(r1, r2, r3)
            return r0
    }

    @Override // javassist.scopedpool.ScopedClassPoolRepository
    public javassist.ClassPool findClassPool(java.lang.ClassLoader r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Lc
            r0 = r3
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
            javassist.ClassPool r0 = r0.registerClassLoader(r1)
            return r0
        Lc:
            r0 = r3
            r1 = r4
            javassist.ClassPool r0 = r0.registerClassLoader(r1)
            return r0
    }

    @Override // javassist.scopedpool.ScopedClassPoolRepository
    public javassist.ClassPool registerClassLoader(java.lang.ClassLoader r5) {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> r0 = r0.registeredCLs
            r1 = r0
            r6 = r1
            monitor-enter(r0)
            r0 = r4
            java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> r0 = r0.registeredCLs     // Catch: java.lang.Throwable -> L3e
            r1 = r5
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L24
            r0 = r4
            java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> r0 = r0.registeredCLs     // Catch: java.lang.Throwable -> L3e
            r1 = r5
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3e
            javassist.ClassPool r0 = (javassist.ClassPool) r0     // Catch: java.lang.Throwable -> L3e
            r1 = r6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
            return r0
        L24:
            r0 = r4
            r1 = r5
            r2 = r4
            javassist.ClassPool r2 = r2.classpool     // Catch: java.lang.Throwable -> L3e
            javassist.scopedpool.ScopedClassPool r0 = r0.createScopedClassPool(r1, r2)     // Catch: java.lang.Throwable -> L3e
            r7 = r0
            r0 = r4
            java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> r0 = r0.registeredCLs     // Catch: java.lang.Throwable -> L3e
            r1 = r5
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L3e
            r0 = r7
            r1 = r6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
            return r0
        L3e:
            r8 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r8
            throw r0
    }

    @Override // javassist.scopedpool.ScopedClassPoolRepository
    public java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> getRegisteredCLs() {
            r2 = this;
            r0 = r2
            r0.clearUnregisteredClassLoaders()
            r0 = r2
            java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> r0 = r0.registeredCLs
            return r0
    }

    @Override // javassist.scopedpool.ScopedClassPoolRepository
    public void clearUnregisteredClassLoaders() {
            r3 = this;
            r0 = 0
            r4 = r0
            r0 = r3
            java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> r0 = r0.registeredCLs
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> r0 = r0.registeredCLs     // Catch: java.lang.Throwable -> La6
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> La6
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La6
            r6 = r0
        L18:
            r0 = r6
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L79
            r0 = r6
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> La6
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> La6
            r7 = r0
            r0 = r7
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La6
            javassist.scopedpool.ScopedClassPool r0 = (javassist.scopedpool.ScopedClassPool) r0     // Catch: java.lang.Throwable -> La6
            boolean r0 = r0.isUnloadedClassLoader()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L76
            r0 = r7
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La6
            javassist.scopedpool.ScopedClassPool r0 = (javassist.scopedpool.ScopedClassPool) r0     // Catch: java.lang.Throwable -> La6
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> La6
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L65
            r0 = r4
            if (r0 != 0) goto L5c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La6
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            r4 = r0
        L5c:
            r0 = r4
            r1 = r8
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> La6
        L65:
            r0 = r3
            java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> r0 = r0.registeredCLs     // Catch: java.lang.Throwable -> La6
            r1 = r7
            java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> La6
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> La6
        L76:
            goto L18
        L79:
            r0 = r4
            if (r0 == 0) goto La1
            r0 = r4
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La6
            r6 = r0
        L84:
            r0 = r6
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto La1
            r0 = r6
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> La6
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch: java.lang.Throwable -> La6
            r7 = r0
            r0 = r3
            r1 = r7
            r0.unregisterClassLoader(r1)     // Catch: java.lang.Throwable -> La6
            goto L84
        La1:
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            goto Lad
        La6:
            r9 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            r0 = r9
            throw r0
        Lad:
            return
    }

    @Override // javassist.scopedpool.ScopedClassPoolRepository
    public void unregisterClassLoader(java.lang.ClassLoader r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> r0 = r0.registeredCLs
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            java.util.Map<java.lang.ClassLoader, javassist.scopedpool.ScopedClassPool> r0 = r0.registeredCLs     // Catch: java.lang.Throwable -> L22
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L22
            javassist.scopedpool.ScopedClassPool r0 = (javassist.scopedpool.ScopedClassPool) r0     // Catch: java.lang.Throwable -> L22
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1d
            r0 = r6
            r0.close()     // Catch: java.lang.Throwable -> L22
        L1d:
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L29
        L22:
            r7 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            r0 = r7
            throw r0
        L29:
            return
    }

    public void insertDelegate(javassist.scopedpool.ScopedClassPoolRepository r2) {
            r1 = this;
            return
    }

    @Override // javassist.scopedpool.ScopedClassPoolRepository
    public void setClassPoolFactory(javassist.scopedpool.ScopedClassPoolFactory r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.factory = r1
            return
    }

    @Override // javassist.scopedpool.ScopedClassPoolRepository
    public javassist.scopedpool.ScopedClassPoolFactory getClassPoolFactory() {
            r2 = this;
            r0 = r2
            javassist.scopedpool.ScopedClassPoolFactory r0 = r0.factory
            return r0
    }

    static {
            javassist.scopedpool.ScopedClassPoolRepositoryImpl r0 = new javassist.scopedpool.ScopedClassPoolRepositoryImpl
            r1 = r0
            r1.<init>()
            javassist.scopedpool.ScopedClassPoolRepositoryImpl.instance = r0
            return
    }
}
