package javassist.scopedpool;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/scopedpool/ScopedClassPool.class */
public class ScopedClassPool extends javassist.ClassPool {
    protected javassist.scopedpool.ScopedClassPoolRepository repository;
    protected java.lang.ref.Reference<java.lang.ClassLoader> classLoader;
    protected javassist.LoaderClassPath classPath;
    protected java.util.Map<java.lang.String, javassist.CtClass> softcache;
    boolean isBootstrapCl;

    protected ScopedClassPool(java.lang.ClassLoader r7, javassist.ClassPool r8, javassist.scopedpool.ScopedClassPoolRepository r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return
    }

    protected ScopedClassPool(java.lang.ClassLoader r6, javassist.ClassPool r7, javassist.scopedpool.ScopedClassPoolRepository r8, boolean r9) {
            r5 = this;
            r0 = r5
            r1 = r7
            r0.<init>(r1)
            r0 = r5
            javassist.scopedpool.SoftValueHashMap r1 = new javassist.scopedpool.SoftValueHashMap
            r2 = r1
            r2.<init>()
            r0.softcache = r1
            r0 = r5
            r1 = 1
            r0.isBootstrapCl = r1
            r0 = r5
            r1 = r8
            r0.repository = r1
            r0 = r5
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.classLoader = r1
            r0 = r6
            if (r0 == 0) goto L3f
            r0 = r5
            javassist.LoaderClassPath r1 = new javassist.LoaderClassPath
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.classPath = r1
            r0 = r5
            r1 = r5
            javassist.LoaderClassPath r1 = r1.classPath
            javassist.ClassPath r0 = r0.insertClassPath(r1)
        L3f:
            r0 = r5
            r1 = 1
            r0.childFirstLookup = r1
            r0 = r9
            if (r0 != 0) goto L52
            r0 = r6
            if (r0 != 0) goto L52
            r0 = r5
            r1 = 1
            r0.isBootstrapCl = r1
        L52:
            return
    }

    @Override // javassist.ClassPool
    public java.lang.ClassLoader getClassLoader() {
            r4 = this;
            r0 = r4
            java.lang.ClassLoader r0 = r0.getClassLoader0()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1a
            r0 = r4
            boolean r0 = r0.isBootstrapCl
            if (r0 != 0) goto L1a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "ClassLoader has been garbage collected"
            r1.<init>(r2)
            throw r0
        L1a:
            r0 = r5
            return r0
    }

    protected java.lang.ClassLoader getClassLoader0() {
            r2 = this;
            r0 = r2
            java.lang.ref.Reference<java.lang.ClassLoader> r0 = r0.classLoader
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            return r0
    }

    public void close() {
            r3 = this;
            r0 = r3
            r1 = r3
            javassist.LoaderClassPath r1 = r1.classPath
            r0.removeClassPath(r1)
            r0 = r3
            java.util.Hashtable r0 = r0.classes
            r0.clear()
            r0 = r3
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.softcache
            r0.clear()
            return
    }

    public synchronized void flushClass(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Hashtable r0 = r0.classes
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)
            r0 = r3
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.softcache
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)
            return
    }

    public synchronized void soften(javassist.CtClass r5) {
            r4 = this;
            r0 = r4
            javassist.scopedpool.ScopedClassPoolRepository r0 = r0.repository
            boolean r0 = r0.isPrune()
            if (r0 == 0) goto L10
            r0 = r5
            r0.prune()
        L10:
            r0 = r4
            java.util.Hashtable r0 = r0.classes
            r1 = r5
            java.lang.String r1 = r1.getName()
            java.lang.Object r0 = r0.remove(r1)
            r0 = r4
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.softcache
            r1 = r5
            java.lang.String r1 = r1.getName()
            r2 = r5
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    public boolean isUnloadedClassLoader() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // javassist.ClassPool
    protected javassist.CtClass getCached(java.lang.String r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            javassist.CtClass r0 = r0.getCachedLocally(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto Lf4
            r0 = 0
            r8 = r0
            r0 = r5
            java.lang.ClassLoader r0 = r0.getClassLoader0()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L81
            r0 = r6
            r1 = 36
            int r0 = r0.lastIndexOf(r1)
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r10
            if (r0 >= 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.String r2 = "[\\.]"
            java.lang.String r3 = "/"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11 = r0
            goto L71
        L46:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            r2 = 0
            r3 = r10
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r2 = "[\\.]"
            java.lang.String r3 = "/"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r10
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11 = r0
        L71:
            r0 = r9
            r1 = r11
            java.net.URL r0 = r0.getResource(r1)
            if (r0 == 0) goto L7f
            r0 = 1
            goto L80
        L7f:
            r0 = 0
        L80:
            r8 = r0
        L81:
            r0 = r8
            if (r0 != 0) goto Lf4
            r0 = r5
            javassist.scopedpool.ScopedClassPoolRepository r0 = r0.repository
            java.util.Map r0 = r0.getRegisteredCLs()
            r10 = r0
            r0 = r10
            r1 = r0
            r11 = r1
            monitor-enter(r0)
            r0 = r10
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lec
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lec
            r12 = r0
        La4:
            r0 = r12
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto Le6
            r0 = r12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> Lec
            javassist.scopedpool.ScopedClassPool r0 = (javassist.scopedpool.ScopedClassPool) r0     // Catch: java.lang.Throwable -> Lec
            r13 = r0
            r0 = r13
            boolean r0 = r0.isUnloadedClassLoader()     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto Ld3
            r0 = r5
            javassist.scopedpool.ScopedClassPoolRepository r0 = r0.repository     // Catch: java.lang.Throwable -> Lec
            r1 = r13
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> Lec
            r0.unregisterClassLoader(r1)     // Catch: java.lang.Throwable -> Lec
            goto La4
        Ld3:
            r0 = r13
            r1 = r6
            javassist.CtClass r0 = r0.getCachedLocally(r1)     // Catch: java.lang.Throwable -> Lec
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Le3
            r0 = r7
            r1 = r11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lec
            return r0
        Le3:
            goto La4
        Le6:
            r0 = r11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            goto Lf4
        Lec:
            r14 = move-exception
            r0 = r11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            r0 = r14
            throw r0
        Lf4:
            r0 = r7
            return r0
    }

    @Override // javassist.ClassPool
    protected void cacheCtClass(java.lang.String r6, javassist.CtClass r7, boolean r8) {
            r5 = this;
            r0 = r8
            if (r0 == 0) goto Le
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            super.cacheCtClass(r1, r2, r3)
            goto L2a
        Le:
            r0 = r5
            javassist.scopedpool.ScopedClassPoolRepository r0 = r0.repository
            boolean r0 = r0.isPrune()
            if (r0 == 0) goto L1e
            r0 = r7
            r0.prune()
        L1e:
            r0 = r5
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.softcache
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
        L2a:
            return
    }

    public void lockInCache(javassist.CtClass r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.getName()
            r2 = r6
            r3 = 0
            super.cacheCtClass(r1, r2, r3)
            return
    }

    protected javassist.CtClass getCachedLocally(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Hashtable r0 = r0.classes
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.CtClass r0 = (javassist.CtClass) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L12
            r0 = r5
            return r0
        L12:
            r0 = r3
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.softcache
            r1 = r0
            r6 = r1
            monitor-enter(r0)
            r0 = r3
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.softcache     // Catch: java.lang.Throwable -> L29
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L29
            javassist.CtClass r0 = (javassist.CtClass) r0     // Catch: java.lang.Throwable -> L29
            r1 = r6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            return r0
        L29:
            r7 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            r0 = r7
            throw r0
    }

    public synchronized javassist.CtClass getLocally(java.lang.String r6) throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.softcache
            r1 = r6
            java.lang.Object r0 = r0.remove(r1)
            r0 = r5
            java.util.Hashtable r0 = r0.classes
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            javassist.CtClass r0 = (javassist.CtClass) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L36
            r0 = r5
            r1 = r6
            r2 = 1
            javassist.CtClass r0 = r0.createCtClass(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L2f
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L2f:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            super.cacheCtClass(r1, r2, r3)
        L36:
            r0 = r7
            return r0
    }

    @Override // javassist.ClassPool
    public java.lang.Class<?> toClass(javassist.CtClass r6, java.lang.ClassLoader r7, java.security.ProtectionDomain r8) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r1 = r6
            r0.lockInCache(r1)
            r0 = r5
            r1 = r6
            r2 = r5
            java.lang.ClassLoader r2 = r2.getClassLoader0()
            r3 = r8
            java.lang.Class r0 = super.toClass(r1, r2, r3)
            return r0
    }

    static {
            r0 = 0
            javassist.ClassPool.doPruning = r0
            r0 = 0
            javassist.ClassPool.releaseUnmodifiedClassFile = r0
            return
    }
}
