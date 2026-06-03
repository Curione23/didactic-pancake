package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/Loader.class */
public class Loader extends java.lang.ClassLoader {
    private java.util.HashMap<java.lang.String, java.lang.ClassLoader> notDefinedHere;
    private java.util.Vector<java.lang.String> notDefinedPackages;
    private javassist.ClassPool source;
    private javassist.Translator translator;
    private java.security.ProtectionDomain domain;
    public boolean doDelegation;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/Loader$Simple.class */
    public static class Simple extends java.lang.ClassLoader {
        public Simple() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public Simple(java.lang.ClassLoader r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }

        public java.lang.Class<?> invokeDefineClass(javassist.CtClass r7) throws java.io.IOException, javassist.CannotCompileException {
                r6 = this;
                r0 = r7
                byte[] r0 = r0.toBytecode()
                r8 = r0
                r0 = r6
                r1 = r7
                java.lang.String r1 = r1.getName()
                r2 = r8
                r3 = 0
                r4 = r8
                int r4 = r4.length
                java.lang.Class r0 = r0.defineClass(r1, r2, r3, r4)
                return r0
        }
    }

    public Loader() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    public Loader(javassist.ClassPool r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 1
            r0.doDelegation = r1
            r0 = r3
            r1 = r4
            r0.init(r1)
            return
    }

    public Loader(java.lang.ClassLoader r4, javassist.ClassPool r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = 1
            r0.doDelegation = r1
            r0 = r3
            r1 = r5
            r0.init(r1)
            return
    }

    private void init(javassist.ClassPool r5) {
            r4 = this;
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.notDefinedHere = r1
            r0 = r4
            java.util.Vector r1 = new java.util.Vector
            r2 = r1
            r2.<init>()
            r0.notDefinedPackages = r1
            r0 = r4
            r1 = r5
            r0.source = r1
            r0 = r4
            r1 = 0
            r0.translator = r1
            r0 = r4
            r1 = 0
            r0.domain = r1
            r0 = r4
            java.lang.String r1 = "javassist.Loader"
            r0.delegateLoadingOf(r1)
            return
    }

    public void delegateLoadingOf(java.lang.String r5) {
            r4 = this;
            r0 = r5
            java.lang.String r1 = "."
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L14
            r0 = r4
            java.util.Vector<java.lang.String> r0 = r0.notDefinedPackages
            r1 = r5
            r0.addElement(r1)
            goto L1e
        L14:
            r0 = r4
            java.util.HashMap<java.lang.String, java.lang.ClassLoader> r0 = r0.notDefinedHere
            r1 = r5
            r2 = r4
            java.lang.Object r0 = r0.put(r1, r2)
        L1e:
            return
    }

    public void setDomain(java.security.ProtectionDomain r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.domain = r1
            return
    }

    public void setClassPool(javassist.ClassPool r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.source = r1
            return
    }

    public void addTranslator(javassist.ClassPool r4, javassist.Translator r5) throws javassist.NotFoundException, javassist.CannotCompileException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.source = r1
            r0 = r3
            r1 = r5
            r0.translator = r1
            r0 = r5
            r1 = r4
            r0.start(r1)
            return
    }

    public static void main(java.lang.String[] r3) throws java.lang.Throwable {
            javassist.Loader r0 = new javassist.Loader
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            r0.run(r1)
            return
    }

    public void run(java.lang.String[] r7) throws java.lang.Throwable {
            r6 = this;
            r0 = r7
            int r0 = r0.length
            r1 = 1
            if (r0 < r1) goto L17
            r0 = r6
            r1 = r7
            r2 = 0
            r1 = r1[r2]
            r2 = r7
            r3 = 1
            r4 = r7
            int r4 = r4.length
            java.lang.Object[] r2 = java.util.Arrays.copyOfRange(r2, r3, r4)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.run(r1, r2)
        L17:
            return
    }

    public void run(java.lang.String r8, java.lang.String[] r9) throws java.lang.Throwable {
            r7 = this;
            r0 = r7
            r1 = r8
            java.lang.Class r0 = r0.loadClass(r1)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "main"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L25
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L25
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L25
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L25
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L25
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L25
            goto L2d
        L25:
            r11 = move-exception
            r0 = r11
            java.lang.Throwable r0 = r0.getTargetException()
            throw r0
        L2d:
            return
    }

    @Override // java.lang.ClassLoader
    protected java.lang.Class<?> loadClass(java.lang.String r4, boolean r5) throws java.lang.ClassFormatError, java.lang.ClassNotFoundException {
            r3 = this;
            r0 = r4
            java.lang.String r0 = r0.intern()
            r4 = r0
            r0 = r4
            r1 = r0
            r6 = r1
            monitor-enter(r0)
            r0 = r3
            r1 = r4
            java.lang.Class r0 = r0.findLoadedClass(r1)     // Catch: java.lang.Throwable -> L43
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L1c
            r0 = r3
            r1 = r4
            java.lang.Class r0 = r0.loadClassByDelegation(r1)     // Catch: java.lang.Throwable -> L43
            r7 = r0
        L1c:
            r0 = r7
            if (r0 != 0) goto L28
            r0 = r3
            r1 = r4
            java.lang.Class r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L43
            r7 = r0
        L28:
            r0 = r7
            if (r0 != 0) goto L34
            r0 = r3
            r1 = r4
            java.lang.Class r0 = r0.delegateToParent(r1)     // Catch: java.lang.Throwable -> L43
            r7 = r0
        L34:
            r0 = r5
            if (r0 == 0) goto L3e
            r0 = r3
            r1 = r7
            r0.resolveClass(r1)     // Catch: java.lang.Throwable -> L43
        L3e:
            r0 = r7
            r1 = r6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            return r0
        L43:
            r8 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            r0 = r8
            throw r0
    }

    @Override // java.lang.ClassLoader
    protected java.lang.Class<?> findClass(java.lang.String r11) throws java.lang.ClassNotFoundException {
            r10 = this;
            r0 = r10
            javassist.ClassPool r0 = r0.source     // Catch: java.lang.Exception -> L68
            if (r0 == 0) goto L2e
            r0 = r10
            javassist.Translator r0 = r0.translator     // Catch: java.lang.Exception -> L68
            if (r0 == 0) goto L1c
            r0 = r10
            javassist.Translator r0 = r0.translator     // Catch: java.lang.Exception -> L68
            r1 = r10
            javassist.ClassPool r1 = r1.source     // Catch: java.lang.Exception -> L68
            r2 = r11
            r0.onLoad(r1, r2)     // Catch: java.lang.Exception -> L68
        L1c:
            r0 = r10
            javassist.ClassPool r0 = r0.source     // Catch: javassist.NotFoundException -> L2b java.lang.Exception -> L68
            r1 = r11
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L2b java.lang.Exception -> L68
            byte[] r0 = r0.toBytecode()     // Catch: javassist.NotFoundException -> L2b java.lang.Exception -> L68
            r12 = r0
            goto L65
        L2b:
            r13 = move-exception
            r0 = 0
            return r0
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L68
            r1 = r11
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L68
            r13 = r0
            r0 = r10
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L68
            r1 = r13
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Exception -> L68
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L5f
            r0 = 0
            return r0
        L5f:
            r0 = r14
            byte[] r0 = javassist.ClassPoolTail.readStream(r0)     // Catch: java.lang.Exception -> L68
            r12 = r0
        L65:
            goto L85
        L68:
            r13 = move-exception
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "caught an exception while obtaining a class file for "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r13
            r1.<init>(r2, r3)
            throw r0
        L85:
            r0 = r11
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r13 = r0
            r0 = r13
            r1 = -1
            if (r0 == r1) goto Lb5
            r0 = r11
            r1 = 0
            r2 = r13
            java.lang.String r0 = r0.substring(r1, r2)
            r14 = r0
            r0 = r10
            r1 = r14
            boolean r0 = r0.isDefinedPackage(r1)
            if (r0 == 0) goto Lb5
            r0 = r10
            r1 = r14
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.Package r0 = r0.definePackage(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalArgumentException -> Lb3
            goto Lb5
        Lb3:
            r15 = move-exception
        Lb5:
            r0 = r10
            java.security.ProtectionDomain r0 = r0.domain
            if (r0 != 0) goto Lc6
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = 0
            r4 = r12
            int r4 = r4.length
            java.lang.Class r0 = r0.defineClass(r1, r2, r3, r4)
            return r0
        Lc6:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = 0
            r4 = r12
            int r4 = r4.length
            r5 = r10
            java.security.ProtectionDomain r5 = r5.domain
            java.lang.Class r0 = r0.defineClass(r1, r2, r3, r4, r5)
            return r0
    }

    private boolean isDefinedPackage(java.lang.String r4) {
            r3 = this;
            int r0 = javassist.bytecode.ClassFile.MAJOR_VERSION
            r1 = 53
            if (r0 < r1) goto L16
            r0 = r3
            r1 = r4
            java.lang.Package r0 = r0.getDefinedPackage(r1)
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
        L16:
            r0 = r3
            r1 = r4
            java.lang.Package r0 = r0.getPackage(r1)
            if (r0 != 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
    }

    protected java.lang.Class<?> loadClassByDelegation(java.lang.String r4) throws java.lang.ClassNotFoundException {
            r3 = this;
            r0 = 0
            r5 = r0
            r0 = r3
            boolean r0 = r0.doDelegation
            if (r0 == 0) goto L56
            r0 = r4
            java.lang.String r1 = "java."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L50
            r0 = r4
            java.lang.String r1 = "javax."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L50
            r0 = r4
            java.lang.String r1 = "jdk.internal."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L50
            r0 = r4
            java.lang.String r1 = "sun."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L50
            r0 = r4
            java.lang.String r1 = "com.sun."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L50
            r0 = r4
            java.lang.String r1 = "org.w3c."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L50
            r0 = r4
            java.lang.String r1 = "org.xml."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L50
            r0 = r3
            r1 = r4
            boolean r0 = r0.notDelegated(r1)
            if (r0 == 0) goto L56
        L50:
            r0 = r3
            r1 = r4
            java.lang.Class r0 = r0.delegateToParent(r1)
            r5 = r0
        L56:
            r0 = r5
            return r0
    }

    private boolean notDelegated(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.HashMap<java.lang.String, java.lang.ClassLoader> r0 = r0.notDefinedHere
            r1 = r4
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = r3
            java.util.Vector<java.lang.String> r0 = r0.notDefinedPackages
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L15:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L35
            r0 = r5
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r4
            r1 = r6
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L32
            r0 = 1
            return r0
        L32:
            goto L15
        L35:
            r0 = 0
            return r0
    }

    protected java.lang.Class<?> delegateToParent(java.lang.String r4) throws java.lang.ClassNotFoundException {
            r3 = this;
            r0 = r3
            java.lang.ClassLoader r0 = r0.getParent()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto Lf
            r0 = r5
            r1 = r4
            java.lang.Class r0 = r0.loadClass(r1)
            return r0
        Lf:
            r0 = r3
            r1 = r4
            java.lang.Class r0 = r0.findSystemClass(r1)
            return r0
    }
}
