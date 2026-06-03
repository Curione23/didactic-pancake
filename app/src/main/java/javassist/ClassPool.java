package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/ClassPool.class */
public class ClassPool {
    public boolean childFirstLookup;
    public static boolean doPruning;
    private int compressCount;
    private static final int COMPRESS_THRESHOLD = 100;
    public static boolean releaseUnmodifiedClassFile;
    public static boolean cacheOpenedJarFile;
    protected javassist.ClassPoolTail source;
    protected javassist.ClassPool parent;
    protected java.util.Hashtable classes;
    private java.util.Hashtable cflow;
    private static final int INIT_HASH_SIZE = 191;
    private java.util.ArrayList importedPackages;
    private static javassist.ClassPool defaultPool;

    public ClassPool() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    public ClassPool(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            r0 = r4
            if (r0 == 0) goto Le
            r0 = r3
            javassist.ClassPath r0 = r0.appendSystemPath()
        Le:
            return
    }

    public ClassPool(javassist.ClassPool r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = 0
            r0.childFirstLookup = r1
            r0 = r5
            r1 = 0
            r0.cflow = r1
            r0 = r5
            java.util.Hashtable r1 = new java.util.Hashtable
            r2 = r1
            r3 = 191(0xbf, float:2.68E-43)
            r2.<init>(r3)
            r0.classes = r1
            r0 = r5
            javassist.ClassPoolTail r1 = new javassist.ClassPoolTail
            r2 = r1
            r2.<init>()
            r0.source = r1
            r0 = r5
            r1 = r6
            r0.parent = r1
            r0 = r6
            if (r0 != 0) goto L53
            javassist.CtClass[] r0 = javassist.CtClass.primitiveTypes
            r7 = r0
            r0 = 0
            r8 = r0
        L36:
            r0 = r8
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L53
            r0 = r5
            java.util.Hashtable r0 = r0.classes
            r1 = r7
            r2 = r8
            r1 = r1[r2]
            java.lang.String r1 = r1.getName()
            r2 = r7
            r3 = r8
            r2 = r2[r3]
            java.lang.Object r0 = r0.put(r1, r2)
            int r8 = r8 + 1
            goto L36
        L53:
            r0 = r5
            r1 = 0
            r0.cflow = r1
            r0 = r5
            r1 = 0
            r0.compressCount = r1
            r0 = r5
            r0.clearImportedPackages()
            return
    }

    public static synchronized javassist.ClassPool getDefault() {
            javassist.ClassPool r0 = javassist.ClassPool.defaultPool
            if (r0 != 0) goto L18
            javassist.ClassPool r0 = new javassist.ClassPool
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            javassist.ClassPool.defaultPool = r0
            javassist.ClassPool r0 = javassist.ClassPool.defaultPool
            javassist.ClassPath r0 = r0.appendSystemPath()
        L18:
            javassist.ClassPool r0 = javassist.ClassPool.defaultPool
            return r0
    }

    protected javassist.CtClass getCached(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Hashtable r0 = r0.classes
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.CtClass r0 = (javassist.CtClass) r0
            return r0
    }

    protected void cacheCtClass(java.lang.String r5, javassist.CtClass r6, boolean r7) {
            r4 = this;
            r0 = r4
            java.util.Hashtable r0 = r0.classes
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    protected javassist.CtClass removeCached(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Hashtable r0 = r0.classes
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)
            javassist.CtClass r0 = (javassist.CtClass) r0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            javassist.ClassPoolTail r0 = r0.source
            java.lang.String r0 = r0.toString()
            return r0
    }

    void compress() {
            r5 = this;
            r0 = r5
            r1 = r0
            int r1 = r1.compressCount
            r2 = r1; r1 = r0; r0 = r2; 
            r3 = 1
            int r2 = r2 + r3
            r1.compressCount = r2
            r1 = 100
            if (r0 <= r1) goto L35
            r0 = r5
            r1 = 0
            r0.compressCount = r1
            r0 = r5
            java.util.Hashtable r0 = r0.classes
            java.util.Enumeration r0 = r0.elements()
            r6 = r0
        L1d:
            r0 = r6
            boolean r0 = r0.hasMoreElements()
            if (r0 == 0) goto L35
            r0 = r6
            java.lang.Object r0 = r0.nextElement()
            javassist.CtClass r0 = (javassist.CtClass) r0
            r0.compress()
            goto L1d
        L35:
            return
    }

    public void importPackage(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.ArrayList r0 = r0.importedPackages
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    public void clearImportedPackages() {
            r4 = this;
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.importedPackages = r1
            r0 = r4
            java.util.ArrayList r0 = r0.importedPackages
            java.lang.String r1 = "java.lang"
            boolean r0 = r0.add(r1)
            return
    }

    public java.util.Iterator<java.lang.String> getImportedPackages() {
            r2 = this;
            r0 = r2
            java.util.ArrayList r0 = r0.importedPackages
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public void recordInvalidClassName(java.lang.String r2) {
            r1 = this;
            return
    }

    void recordCflow(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = r7
            java.util.Hashtable r0 = r0.cflow
            if (r0 != 0) goto L12
            r0 = r7
            java.util.Hashtable r1 = new java.util.Hashtable
            r2 = r1
            r2.<init>()
            r0.cflow = r1
        L12:
            r0 = r7
            java.util.Hashtable r0 = r0.cflow
            r1 = r8
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    public java.lang.Object[] lookupCflow(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.util.Hashtable r0 = r0.cflow
            if (r0 != 0) goto L12
            r0 = r4
            java.util.Hashtable r1 = new java.util.Hashtable
            r2 = r1
            r2.<init>()
            r0.cflow = r1
        L12:
            r0 = r4
            java.util.Hashtable r0 = r0.cflow
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    public javassist.CtClass getAndRename(java.lang.String r5, java.lang.String r6) throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            javassist.CtClass r0 = r0.get0(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L14
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r7
            boolean r0 = r0 instanceof javassist.CtClassType
            if (r0 == 0) goto L23
            r0 = r7
            javassist.CtClassType r0 = (javassist.CtClassType) r0
            r1 = r4
            r0.setClassPool(r1)
        L23:
            r0 = r7
            r1 = r6
            r0.setName(r1)
            r0 = r7
            return r0
    }

    synchronized void classNameChanged(java.lang.String r6, javassist.CtClass r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            javassist.CtClass r0 = r0.getCached(r1)
            r8 = r0
            r0 = r8
            r1 = r7
            if (r0 != r1) goto L11
            r0 = r5
            r1 = r6
            javassist.CtClass r0 = r0.removeCached(r1)
        L11:
            r0 = r7
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r5
            r1 = r9
            r0.checkNotFrozen(r1)
            r0 = r5
            r1 = r9
            r2 = r7
            r3 = 0
            r0.cacheCtClass(r1, r2, r3)
            return
    }

    public javassist.CtClass get(java.lang.String r5) throws javassist.NotFoundException {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L9
            r0 = 0
            r6 = r0
            goto L10
        L9:
            r0 = r4
            r1 = r5
            r2 = 1
            javassist.CtClass r0 = r0.get0(r1, r2)
            r6 = r0
        L10:
            r0 = r6
            if (r0 != 0) goto L1d
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L1d:
            r0 = r6
            r0.incGetCounter()
            r0 = r6
            return r0
    }

    public javassist.CtClass getOrNull(java.lang.String r5) {
            r4 = this;
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 != 0) goto Lb
            r0 = 0
            r6 = r0
            goto L16
        Lb:
            r0 = r4
            r1 = r5
            r2 = 1
            javassist.CtClass r0 = r0.get0(r1, r2)     // Catch: javassist.NotFoundException -> L15
            r6 = r0
            goto L16
        L15:
            r7 = move-exception
        L16:
            r0 = r6
            if (r0 == 0) goto L1e
            r0 = r6
            r0.incGetCounter()
        L1e:
            r0 = r6
            return r0
    }

    public javassist.CtClass getCtClass(java.lang.String r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r4
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L10
            r0 = r4
            r1 = r3
            javassist.CtClass r0 = javassist.bytecode.Descriptor.toCtClass(r0, r1)
            return r0
        L10:
            r0 = r3
            r1 = r4
            javassist.CtClass r0 = r0.get(r1)
            return r0
    }

    protected synchronized javassist.CtClass get0(java.lang.String r6, boolean r7) throws javassist.NotFoundException {
            r5 = this;
            r0 = 0
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L12
            r0 = r5
            r1 = r6
            javassist.CtClass r0 = r0.getCached(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L12
            r0 = r8
            return r0
        L12:
            r0 = r5
            boolean r0 = r0.childFirstLookup
            if (r0 != 0) goto L30
            r0 = r5
            javassist.ClassPool r0 = r0.parent
            if (r0 == 0) goto L30
            r0 = r5
            javassist.ClassPool r0 = r0.parent
            r1 = r6
            r2 = r7
            javassist.CtClass r0 = r0.get0(r1, r2)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L30
            r0 = r8
            return r0
        L30:
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.CtClass r0 = r0.createCtClass(r1, r2)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L4b
            r0 = r7
            if (r0 == 0) goto L49
            r0 = r5
            r1 = r8
            java.lang.String r1 = r1.getName()
            r2 = r8
            r3 = 0
            r0.cacheCtClass(r1, r2, r3)
        L49:
            r0 = r8
            return r0
        L4b:
            r0 = r5
            boolean r0 = r0.childFirstLookup
            if (r0 == 0) goto L63
            r0 = r5
            javassist.ClassPool r0 = r0.parent
            if (r0 == 0) goto L63
            r0 = r5
            javassist.ClassPool r0 = r0.parent
            r1 = r6
            r2 = r7
            javassist.CtClass r0 = r0.get0(r1, r2)
            r8 = r0
        L63:
            r0 = r8
            return r0
    }

    protected javassist.CtClass createCtClass(java.lang.String r6, boolean r7) {
            r5 = this;
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto Lf
            r0 = r6
            java.lang.String r0 = javassist.bytecode.Descriptor.toClassName(r0)
            r6 = r0
        Lf:
            r0 = r6
            java.lang.String r1 = "[]"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L44
            r0 = r6
            r1 = 0
            r2 = r6
            r3 = 91
            int r2 = r2.indexOf(r3)
            java.lang.String r0 = r0.substring(r1, r2)
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L30
            r0 = r5
            r1 = r8
            javassist.CtClass r0 = r0.getCached(r1)
            if (r0 != 0) goto L3a
        L30:
            r0 = r5
            r1 = r8
            java.net.URL r0 = r0.find(r1)
            if (r0 != 0) goto L3a
            r0 = 0
            return r0
        L3a:
            javassist.CtArray r0 = new javassist.CtArray
            r1 = r0
            r2 = r6
            r3 = r5
            r1.<init>(r2, r3)
            return r0
        L44:
            r0 = r5
            r1 = r6
            java.net.URL r0 = r0.find(r1)
            if (r0 != 0) goto L4e
            r0 = 0
            return r0
        L4e:
            javassist.CtClassType r0 = new javassist.CtClassType
            r1 = r0
            r2 = r6
            r3 = r5
            r1.<init>(r2, r3)
            return r0
    }

    public java.net.URL find(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javassist.ClassPoolTail r0 = r0.source
            r1 = r4
            java.net.URL r0 = r0.find(r1)
            return r0
    }

    void checkNotFrozen(java.lang.String r6) throws java.lang.RuntimeException {
            r5 = this;
            r0 = r5
            r1 = r6
            javassist.CtClass r0 = r0.getCached(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L45
            r0 = r5
            boolean r0 = r0.childFirstLookup
            if (r0 != 0) goto L67
            r0 = r5
            javassist.ClassPool r0 = r0.parent
            if (r0 == 0) goto L67
            r0 = r5
            javassist.ClassPool r0 = r0.parent     // Catch: javassist.NotFoundException -> L25
            r1 = r6
            r2 = 1
            javassist.CtClass r0 = r0.get0(r1, r2)     // Catch: javassist.NotFoundException -> L25
            r7 = r0
            goto L26
        L25:
            r8 = move-exception
        L26:
            r0 = r7
            if (r0 == 0) goto L67
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is in a parent ClassPool.  Use the parent."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L45:
            r0 = r7
            boolean r0 = r0.isFrozen()
            if (r0 == 0) goto L67
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": frozen class (cannot edit)"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L67:
            return
    }

    javassist.CtClass checkNotExists(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            javassist.CtClass r0 = r0.getCached(r1)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L26
            r0 = r4
            boolean r0 = r0.childFirstLookup
            if (r0 != 0) goto L26
            r0 = r4
            javassist.ClassPool r0 = r0.parent
            if (r0 == 0) goto L26
            r0 = r4
            javassist.ClassPool r0 = r0.parent     // Catch: javassist.NotFoundException -> L25
            r1 = r5
            r2 = 1
            javassist.CtClass r0 = r0.get0(r1, r2)     // Catch: javassist.NotFoundException -> L25
            r6 = r0
            goto L26
        L25:
            r7 = move-exception
        L26:
            r0 = r6
            return r0
    }

    java.io.InputStream openClassfile(java.lang.String r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.ClassPoolTail r0 = r0.source
            r1 = r4
            java.io.InputStream r0 = r0.openClassfile(r1)
            return r0
    }

    void writeClassfile(java.lang.String r5, java.io.OutputStream r6) throws javassist.NotFoundException, java.io.IOException, javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            javassist.ClassPoolTail r0 = r0.source
            r1 = r5
            r2 = r6
            r0.writeClassfile(r1, r2)
            return
    }

    public javassist.CtClass[] get(java.lang.String[] r7) throws javassist.NotFoundException {
            r6 = this;
            r0 = r7
            if (r0 != 0) goto L9
            r0 = 0
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            return r0
        L9:
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = r8
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r9 = r0
            r0 = 0
            r10 = r0
        L14:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L2c
            r0 = r9
            r1 = r10
            r2 = r6
            r3 = r7
            r4 = r10
            r3 = r3[r4]
            javassist.CtClass r2 = r2.get(r3)
            r0[r1] = r2
            int r10 = r10 + 1
            goto L14
        L2c:
            r0 = r9
            return r0
    }

    public javassist.CtMethod getMethod(java.lang.String r4, java.lang.String r5) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.CtClass r0 = r0.get(r1)
            r6 = r0
            r0 = r6
            r1 = r5
            javassist.CtMethod r0 = r0.getDeclaredMethod(r1)
            return r0
    }

    public javassist.CtClass makeClass(java.io.InputStream r5) throws java.io.IOException, java.lang.RuntimeException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            javassist.CtClass r0 = r0.makeClass(r1, r2)
            return r0
    }

    public javassist.CtClass makeClass(java.io.InputStream r6, boolean r7) throws java.io.IOException, java.lang.RuntimeException {
            r5 = this;
            r0 = r5
            r0.compress()
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
            javassist.CtClassType r0 = new javassist.CtClassType
            r1 = r0
            r2 = r6
            r3 = r5
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            r0.checkModify()
            r0 = r8
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L2b
            r0 = r5
            r1 = r9
            r0.checkNotFrozen(r1)
        L2b:
            r0 = r5
            r1 = r9
            r2 = r8
            r3 = 1
            r0.cacheCtClass(r1, r2, r3)
            r0 = r8
            return r0
    }

    public javassist.CtClass makeClass(javassist.bytecode.ClassFile r5) throws java.lang.RuntimeException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            javassist.CtClass r0 = r0.makeClass(r1, r2)
            return r0
    }

    public javassist.CtClass makeClass(javassist.bytecode.ClassFile r6, boolean r7) throws java.lang.RuntimeException {
            r5 = this;
            r0 = r5
            r0.compress()
            javassist.CtClassType r0 = new javassist.CtClassType
            r1 = r0
            r2 = r6
            r3 = r5
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            r0.checkModify()
            r0 = r8
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L22
            r0 = r5
            r1 = r9
            r0.checkNotFrozen(r1)
        L22:
            r0 = r5
            r1 = r9
            r2 = r8
            r3 = 1
            r0.cacheCtClass(r1, r2, r3)
            r0 = r8
            return r0
    }

    public javassist.CtClass makeClassIfNew(java.io.InputStream r6) throws java.io.IOException, java.lang.RuntimeException {
            r5 = this;
            r0 = r5
            r0.compress()
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
            javassist.CtClassType r0 = new javassist.CtClassType
            r1 = r0
            r2 = r6
            r3 = r5
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r7
            r0.checkModify()
            r0 = r7
            java.lang.String r0 = r0.getName()
            r8 = r0
            r0 = r5
            r1 = r8
            javassist.CtClass r0 = r0.checkNotExists(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L2f
            r0 = r9
            return r0
        L2f:
            r0 = r5
            r1 = r8
            r2 = r7
            r3 = 1
            r0.cacheCtClass(r1, r2, r3)
            r0 = r7
            return r0
    }

    public javassist.CtClass makeClass(java.lang.String r5) throws java.lang.RuntimeException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            javassist.CtClass r0 = r0.makeClass(r1, r2)
            return r0
    }

    public synchronized javassist.CtClass makeClass(java.lang.String r8, javassist.CtClass r9) throws java.lang.RuntimeException {
            r7 = this;
            r0 = r7
            r1 = r8
            r0.checkNotFrozen(r1)
            javassist.CtNewClass r0 = new javassist.CtNewClass
            r1 = r0
            r2 = r8
            r3 = r7
            r4 = 0
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            r10 = r0
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = 1
            r0.cacheCtClass(r1, r2, r3)
            r0 = r10
            return r0
    }

    synchronized javassist.CtClass makeNestedClass(java.lang.String r8) {
            r7 = this;
            r0 = r7
            r1 = r8
            r0.checkNotFrozen(r1)
            javassist.CtNewClass r0 = new javassist.CtNewClass
            r1 = r0
            r2 = r8
            r3 = r7
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r9 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = 1
            r0.cacheCtClass(r1, r2, r3)
            r0 = r9
            return r0
    }

    public javassist.CtClass makeInterface(java.lang.String r5) throws java.lang.RuntimeException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            javassist.CtClass r0 = r0.makeInterface(r1, r2)
            return r0
    }

    public synchronized javassist.CtClass makeInterface(java.lang.String r8, javassist.CtClass r9) throws java.lang.RuntimeException {
            r7 = this;
            r0 = r7
            r1 = r8
            r0.checkNotFrozen(r1)
            javassist.CtNewClass r0 = new javassist.CtNewClass
            r1 = r0
            r2 = r8
            r3 = r7
            r4 = 1
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            r10 = r0
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = 1
            r0.cacheCtClass(r1, r2, r3)
            r0 = r10
            return r0
    }

    public javassist.CtClass makeAnnotation(java.lang.String r6) throws java.lang.RuntimeException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            java.lang.String r3 = "java.lang.annotation.Annotation"
            javassist.CtClass r2 = r2.get(r3)     // Catch: javassist.NotFoundException -> L1b
            javassist.CtClass r0 = r0.makeInterface(r1, r2)     // Catch: javassist.NotFoundException -> L1b
            r7 = r0
            r0 = r7
            r1 = r7
            int r1 = r1.getModifiers()     // Catch: javassist.NotFoundException -> L1b
            r2 = 8192(0x2000, float:1.148E-41)
            r1 = r1 | r2
            r0.setModifiers(r1)     // Catch: javassist.NotFoundException -> L1b
            r0 = r7
            return r0
        L1b:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.getMessage()
            r3 = r7
            r1.<init>(r2, r3)
            throw r0
    }

    public javassist.ClassPath appendSystemPath() {
            r2 = this;
            r0 = r2
            javassist.ClassPoolTail r0 = r0.source
            javassist.ClassPath r0 = r0.appendSystemPath()
            return r0
    }

    public javassist.ClassPath insertClassPath(javassist.ClassPath r4) {
            r3 = this;
            r0 = r3
            javassist.ClassPoolTail r0 = r0.source
            r1 = r4
            javassist.ClassPath r0 = r0.insertClassPath(r1)
            return r0
    }

    public javassist.ClassPath appendClassPath(javassist.ClassPath r4) {
            r3 = this;
            r0 = r3
            javassist.ClassPoolTail r0 = r0.source
            r1 = r4
            javassist.ClassPath r0 = r0.appendClassPath(r1)
            return r0
    }

    public javassist.ClassPath insertClassPath(java.lang.String r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.ClassPoolTail r0 = r0.source
            r1 = r4
            javassist.ClassPath r0 = r0.insertClassPath(r1)
            return r0
    }

    public javassist.ClassPath appendClassPath(java.lang.String r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.ClassPoolTail r0 = r0.source
            r1 = r4
            javassist.ClassPath r0 = r0.appendClassPath(r1)
            return r0
    }

    public void removeClassPath(javassist.ClassPath r4) {
            r3 = this;
            r0 = r3
            javassist.ClassPoolTail r0 = r0.source
            r1 = r4
            r0.removeClassPath(r1)
            return
    }

    public void appendPathList(java.lang.String r6) throws javassist.NotFoundException {
            r5 = this;
            char r0 = java.io.File.pathSeparatorChar
            r7 = r0
            r0 = 0
            r8 = r0
        L6:
            r0 = r6
            r1 = r7
            r2 = r8
            int r0 = r0.indexOf(r1, r2)
            r9 = r0
            r0 = r9
            if (r0 >= 0) goto L20
            r0 = r5
            r1 = r6
            r2 = r8
            java.lang.String r1 = r1.substring(r2)
            javassist.ClassPath r0 = r0.appendClassPath(r1)
            goto L34
        L20:
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r9
            java.lang.String r1 = r1.substring(r2, r3)
            javassist.ClassPath r0 = r0.appendClassPath(r1)
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
            goto L6
        L34:
            return
    }

    public java.lang.Class toClass(javassist.CtClass r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.Class r0 = r0.toClass(r1, r2)
            return r0
    }

    public java.lang.ClassLoader getClassLoader() {
            r2 = this;
            java.lang.ClassLoader r0 = getContextClassLoader()
            return r0
    }

    static java.lang.ClassLoader getContextClassLoader() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            return r0
    }

    public java.lang.Class toClass(javassist.CtClass r7, java.lang.ClassLoader r8) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r8
            r4 = 0
            java.lang.Class r0 = r0.toClass(r1, r2, r3, r4)
            return r0
    }

    public java.lang.Class toClass(javassist.CtClass r7, java.lang.ClassLoader r8, java.security.ProtectionDomain r9) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r8
            r4 = r9
            java.lang.Class r0 = r0.toClass(r1, r2, r3, r4)
            return r0
    }

    public java.lang.Class<?> toClass(javassist.CtClass r5, java.lang.Class<?> r6) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r6
            r1 = r5
            byte[] r1 = r1.toBytecode()     // Catch: java.io.IOException -> L9
            java.lang.Class r0 = javassist.util.proxy.DefineClassHelper.toClass(r0, r1)     // Catch: java.io.IOException -> L9
            return r0
        L9:
            r7 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
    }

    public java.lang.Class<?> toClass(javassist.CtClass r5, java.lang.invoke.MethodHandles.Lookup r6) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r6
            r1 = r5
            byte[] r1 = r1.toBytecode()     // Catch: java.io.IOException -> L9
            java.lang.Class r0 = javassist.util.proxy.DefineClassHelper.toClass(r0, r1)     // Catch: java.io.IOException -> L9
            return r0
        L9:
            r7 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
    }

    public java.lang.Class toClass(javassist.CtClass r7, java.lang.Class<?> r8, java.lang.ClassLoader r9, java.security.ProtectionDomain r10) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r7
            java.lang.String r0 = r0.getName()     // Catch: java.io.IOException -> L10
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r7
            byte[] r4 = r4.toBytecode()     // Catch: java.io.IOException -> L10
            java.lang.Class r0 = javassist.util.proxy.DefineClassHelper.toClass(r0, r1, r2, r3, r4)     // Catch: java.io.IOException -> L10
            return r0
        L10:
            r11 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
    }

    public void makePackage(java.lang.ClassLoader r4, java.lang.String r5) throws javassist.CannotCompileException {
            r3 = this;
            r0 = r5
            r1 = r4
            javassist.util.proxy.DefinePackageHelper.definePackage(r0, r1)
            return
    }

    static {
            r0 = 0
            javassist.ClassPool.doPruning = r0
            r0 = 1
            javassist.ClassPool.releaseUnmodifiedClassFile = r0
            r0 = 1
            javassist.ClassPool.cacheOpenedJarFile = r0
            r0 = 0
            javassist.ClassPool.defaultPool = r0
            return
    }
}
