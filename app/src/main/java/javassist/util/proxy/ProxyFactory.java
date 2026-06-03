package javassist.util.proxy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/ProxyFactory.class */
public class ProxyFactory {
    private java.lang.Class<?> superClass;
    private java.lang.Class<?>[] interfaces;
    private javassist.util.proxy.MethodFilter methodFilter;
    private javassist.util.proxy.MethodHandler handler;
    private java.util.List<java.util.Map.Entry<java.lang.String, java.lang.reflect.Method>> signatureMethods;
    private boolean hasGetHandler;
    private byte[] signature;
    private java.lang.String classname;
    private java.lang.String basename;
    private java.lang.String superName;
    private java.lang.Class<?> thisClass;
    private java.lang.String genericSignature;
    private boolean factoryUseCache;
    private boolean factoryWriteReplace;
    public static boolean onlyPublicMethods;
    public java.lang.String writeDirectory;
    private static final java.lang.Class<?> OBJECT_TYPE = null;
    private static final java.lang.String HOLDER = "_methods_";
    private static final java.lang.String HOLDER_TYPE = "[Ljava/lang/reflect/Method;";
    private static final java.lang.String FILTER_SIGNATURE_FIELD = "_filter_signature";
    private static final java.lang.String FILTER_SIGNATURE_TYPE = "[B";
    private static final java.lang.String HANDLER = "handler";
    private static final java.lang.String NULL_INTERCEPTOR_HOLDER = "javassist.util.proxy.RuntimeSupport";
    private static final java.lang.String DEFAULT_INTERCEPTOR = "default_interceptor";
    private static final java.lang.String HANDLER_TYPE = null;
    private static final java.lang.String HANDLER_SETTER = "setHandler";
    private static final java.lang.String HANDLER_SETTER_TYPE = null;
    private static final java.lang.String HANDLER_GETTER = "getHandler";
    private static final java.lang.String HANDLER_GETTER_TYPE = null;
    private static final java.lang.String SERIAL_VERSION_UID_FIELD = "serialVersionUID";
    private static final java.lang.String SERIAL_VERSION_UID_TYPE = "J";
    private static final long SERIAL_VERSION_UID_VALUE = -1;
    public static volatile boolean useCache;
    public static volatile boolean useWriteReplace;
    private static java.util.Map<java.lang.ClassLoader, java.util.Map<java.lang.String, javassist.util.proxy.ProxyFactory.ProxyDetails>> proxyCache;
    private static char[] hexDigits;
    public static javassist.util.proxy.ProxyFactory.ClassLoaderProvider classLoaderProvider;
    public static javassist.util.proxy.ProxyFactory.UniqueName nameGenerator;
    private static final java.lang.String packageForJavaBase = "javassist.util.proxy.";
    private static java.util.Comparator<java.util.Map.Entry<java.lang.String, java.lang.reflect.Method>> sorter;
    private static final java.lang.String HANDLER_GETTER_KEY = "getHandler:()";




    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/ProxyFactory$ClassLoaderProvider.class */
    public interface ClassLoaderProvider {
        java.lang.ClassLoader get(javassist.util.proxy.ProxyFactory r1);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/ProxyFactory$Find2MethodsArgs.class */
    static class Find2MethodsArgs {
        java.lang.String methodName;
        java.lang.String delegatorName;
        java.lang.String descriptor;
        int origIndex;

        Find2MethodsArgs(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.methodName = r1
                r0 = r3
                r1 = r5
                r0.delegatorName = r1
                r0 = r3
                r1 = r6
                r0.descriptor = r1
                r0 = r3
                r1 = r7
                r0.origIndex = r1
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/ProxyFactory$ProxyDetails.class */
    static class ProxyDetails {
        byte[] signature;
        java.lang.ref.Reference<java.lang.Class<?>> proxyClass;
        boolean isUseWriteReplace;

        ProxyDetails(byte[] r6, java.lang.Class<?> r7, boolean r8) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r6
                r0.signature = r1
                r0 = r5
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r2 = r1
                r3 = r7
                r2.<init>(r3)
                r0.proxyClass = r1
                r0 = r5
                r1 = r8
                r0.isUseWriteReplace = r1
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/ProxyFactory$UniqueName.class */
    public interface UniqueName {
        java.lang.String get(java.lang.String r1);
    }

    public boolean isUseCache() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.factoryUseCache
            return r0
    }

    public void setUseCache(boolean r5) {
            r4 = this;
            r0 = r4
            javassist.util.proxy.MethodHandler r0 = r0.handler
            if (r0 == 0) goto L15
            r0 = r5
            if (r0 == 0) goto L15
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "caching cannot be enabled if the factory default interceptor has been set"
            r1.<init>(r2)
            throw r0
        L15:
            r0 = r4
            r1 = r5
            r0.factoryUseCache = r1
            return
    }

    public boolean isUseWriteReplace() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.factoryWriteReplace
            return r0
    }

    public void setUseWriteReplace(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.factoryWriteReplace = r1
            return
    }

    public static boolean isProxyClass(java.lang.Class<?> r3) {
            java.lang.Class<javassist.util.proxy.Proxy> r0 = javassist.util.proxy.Proxy.class
            r1 = r3
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }

    public ProxyFactory() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.superClass = r1
            r0 = r3
            r1 = 0
            r0.interfaces = r1
            r0 = r3
            r1 = 0
            r0.methodFilter = r1
            r0 = r3
            r1 = 0
            r0.handler = r1
            r0 = r3
            r1 = 0
            r0.signature = r1
            r0 = r3
            r1 = 0
            r0.signatureMethods = r1
            r0 = r3
            r1 = 0
            r0.hasGetHandler = r1
            r0 = r3
            r1 = 0
            r0.thisClass = r1
            r0 = r3
            r1 = 0
            r0.genericSignature = r1
            r0 = r3
            r1 = 0
            r0.writeDirectory = r1
            r0 = r3
            boolean r1 = javassist.util.proxy.ProxyFactory.useCache
            r0.factoryUseCache = r1
            r0 = r3
            boolean r1 = javassist.util.proxy.ProxyFactory.useWriteReplace
            r0.factoryWriteReplace = r1
            return
    }

    public void setSuperclass(java.lang.Class<?> r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.superClass = r1
            r0 = r3
            r1 = 0
            r0.signature = r1
            return
    }

    public java.lang.Class<?> getSuperclass() {
            r2 = this;
            r0 = r2
            java.lang.Class<?> r0 = r0.superClass
            return r0
    }

    public void setInterfaces(java.lang.Class<?>[] r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.interfaces = r1
            r0 = r3
            r1 = 0
            r0.signature = r1
            return
    }

    public java.lang.Class<?>[] getInterfaces() {
            r2 = this;
            r0 = r2
            java.lang.Class<?>[] r0 = r0.interfaces
            return r0
    }

    public void setFilter(javassist.util.proxy.MethodFilter r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.methodFilter = r1
            r0 = r3
            r1 = 0
            r0.signature = r1
            return
    }

    public void setGenericSignature(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.genericSignature = r1
            return
    }

    public java.lang.Class<?> createClass() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.signature
            if (r0 != 0) goto Lf
            r0 = r3
            r1 = r3
            javassist.util.proxy.MethodFilter r1 = r1.methodFilter
            r0.computeSignature(r1)
        Lf:
            r0 = r3
            r1 = 0
            java.lang.Class r0 = r0.createClass1(r1)
            return r0
    }

    public java.lang.Class<?> createClass(javassist.util.proxy.MethodFilter r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.computeSignature(r1)
            r0 = r3
            r1 = 0
            java.lang.Class r0 = r0.createClass1(r1)
            return r0
    }

    java.lang.Class<?> createClass(byte[] r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.installSignature(r1)
            r0 = r3
            r1 = 0
            java.lang.Class r0 = r0.createClass1(r1)
            return r0
    }

    public java.lang.Class<?> createClass(java.lang.invoke.MethodHandles.Lookup r4) {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.signature
            if (r0 != 0) goto Lf
            r0 = r3
            r1 = r3
            javassist.util.proxy.MethodFilter r1 = r1.methodFilter
            r0.computeSignature(r1)
        Lf:
            r0 = r3
            r1 = r4
            java.lang.Class r0 = r0.createClass1(r1)
            return r0
    }

    public java.lang.Class<?> createClass(java.lang.invoke.MethodHandles.Lookup r4, javassist.util.proxy.MethodFilter r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.computeSignature(r1)
            r0 = r3
            r1 = r4
            java.lang.Class r0 = r0.createClass1(r1)
            return r0
    }

    java.lang.Class<?> createClass(java.lang.invoke.MethodHandles.Lookup r4, byte[] r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.installSignature(r1)
            r0 = r3
            r1 = r4
            java.lang.Class r0 = r0.createClass1(r1)
            return r0
    }

    private java.lang.Class<?> createClass1(java.lang.invoke.MethodHandles.Lookup r5) {
            r4 = this;
            r0 = r4
            java.lang.Class<?> r0 = r0.thisClass
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L43
            r0 = r4
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r7 = r0
            java.util.Map<java.lang.ClassLoader, java.util.Map<java.lang.String, javassist.util.proxy.ProxyFactory$ProxyDetails>> r0 = javassist.util.proxy.ProxyFactory.proxyCache
            r1 = r0
            r8 = r1
            monitor-enter(r0)
            r0 = r4
            boolean r0 = r0.factoryUseCache     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L25
            r0 = r4
            r1 = r7
            r2 = r5
            r0.createClass2(r1, r2)     // Catch: java.lang.Throwable -> L3b
            goto L2b
        L25:
            r0 = r4
            r1 = r7
            r2 = r5
            r0.createClass3(r1, r2)     // Catch: java.lang.Throwable -> L3b
        L2b:
            r0 = r4
            java.lang.Class<?> r0 = r0.thisClass     // Catch: java.lang.Throwable -> L3b
            r6 = r0
            r0 = r4
            r1 = 0
            r0.thisClass = r1     // Catch: java.lang.Throwable -> L3b
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            goto L43
        L3b:
            r9 = move-exception
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            r0 = r9
            throw r0
        L43:
            r0 = r6
            return r0
    }

    public java.lang.String getKey(java.lang.Class<?> r5, java.lang.Class<?>[] r6, byte[] r7, boolean r8) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r5
            if (r0 == 0) goto L17
            r0 = r9
            r1 = r5
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
        L17:
            r0 = r9
            r1 = 58
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r10 = r0
        L22:
            r0 = r10
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L44
            r0 = r9
            r1 = r6
            r2 = r10
            r1 = r1[r2]
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            r1 = 58
            java.lang.StringBuilder r0 = r0.append(r1)
            int r10 = r10 + 1
            goto L22
        L44:
            r0 = 0
            r10 = r0
        L47:
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L82
            r0 = r7
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            r1 = 15
            r0 = r0 & r1
            r12 = r0
            r0 = r11
            r1 = 4
            int r0 = r0 >> r1
            r1 = 15
            r0 = r0 & r1
            r13 = r0
            r0 = r9
            char[] r1 = javassist.util.proxy.ProxyFactory.hexDigits
            r2 = r12
            char r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            char[] r1 = javassist.util.proxy.ProxyFactory.hexDigits
            r2 = r13
            char r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            int r10 = r10 + 1
            goto L47
        L82:
            r0 = r8
            if (r0 == 0) goto L8f
            r0 = r9
            java.lang.String r1 = ":w"
            java.lang.StringBuilder r0 = r0.append(r1)
        L8f:
            r0 = r9
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void createClass2(java.lang.ClassLoader r7, java.lang.invoke.MethodHandles.Lookup r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            java.lang.Class<?> r1 = r1.superClass
            r2 = r6
            java.lang.Class<?>[] r2 = r2.interfaces
            r3 = r6
            byte[] r3 = r3.signature
            r4 = r6
            boolean r4 = r4.factoryWriteReplace
            java.lang.String r0 = r0.getKey(r1, r2, r3, r4)
            r9 = r0
            java.util.Map<java.lang.ClassLoader, java.util.Map<java.lang.String, javassist.util.proxy.ProxyFactory$ProxyDetails>> r0 = javassist.util.proxy.ProxyFactory.proxyCache
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L3d
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r10 = r0
            java.util.Map<java.lang.ClassLoader, java.util.Map<java.lang.String, javassist.util.proxy.ProxyFactory$ProxyDetails>> r0 = javassist.util.proxy.ProxyFactory.proxyCache
            r1 = r7
            r2 = r10
            java.lang.Object r0 = r0.put(r1, r2)
        L3d:
            r0 = r10
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            javassist.util.proxy.ProxyFactory$ProxyDetails r0 = (javassist.util.proxy.ProxyFactory.ProxyDetails) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L6a
            r0 = r11
            java.lang.ref.Reference<java.lang.Class<?>> r0 = r0.proxyClass
            r12 = r0
            r0 = r6
            r1 = r12
            java.lang.Object r1 = r1.get()
            java.lang.Class r1 = (java.lang.Class) r1
            r0.thisClass = r1
            r0 = r6
            java.lang.Class<?> r0 = r0.thisClass
            if (r0 == 0) goto L6a
            return
        L6a:
            r0 = r6
            r1 = r7
            r2 = r8
            r0.createClass3(r1, r2)
            javassist.util.proxy.ProxyFactory$ProxyDetails r0 = new javassist.util.proxy.ProxyFactory$ProxyDetails
            r1 = r0
            r2 = r6
            byte[] r2 = r2.signature
            r3 = r6
            java.lang.Class<?> r3 = r3.thisClass
            r4 = r6
            boolean r4 = r4.factoryWriteReplace
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r10
            r1 = r9
            r2 = r11
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    private void createClass3(java.lang.ClassLoader r7, java.lang.invoke.MethodHandles.Lookup r8) {
            r6 = this;
            r0 = r6
            r0.allocateClassName()
            r0 = r6
            javassist.bytecode.ClassFile r0 = r0.make()     // Catch: javassist.CannotCompileException -> L57
            r9 = r0
            r0 = r6
            java.lang.String r0 = r0.writeDirectory     // Catch: javassist.CannotCompileException -> L57
            if (r0 == 0) goto L18
            r0 = r9
            r1 = r6
            java.lang.String r1 = r1.writeDirectory     // Catch: javassist.CannotCompileException -> L57
            javassist.util.proxy.FactoryHelper.writeFile(r0, r1)     // Catch: javassist.CannotCompileException -> L57
        L18:
            r0 = r8
            if (r0 != 0) goto L30
            r0 = r6
            r1 = r9
            r2 = r6
            java.lang.Class r2 = r2.getClassInTheSamePackage()     // Catch: javassist.CannotCompileException -> L57
            r3 = r7
            r4 = r6
            java.security.ProtectionDomain r4 = r4.getDomain()     // Catch: javassist.CannotCompileException -> L57
            java.lang.Class r1 = javassist.util.proxy.FactoryHelper.toClass(r1, r2, r3, r4)     // Catch: javassist.CannotCompileException -> L57
            r0.thisClass = r1     // Catch: javassist.CannotCompileException -> L57
            goto L39
        L30:
            r0 = r6
            r1 = r9
            r2 = r8
            java.lang.Class r1 = javassist.util.proxy.FactoryHelper.toClass(r1, r2)     // Catch: javassist.CannotCompileException -> L57
            r0.thisClass = r1     // Catch: javassist.CannotCompileException -> L57
        L39:
            r0 = r6
            java.lang.String r1 = "_filter_signature"
            r2 = r6
            byte[] r2 = r2.signature     // Catch: javassist.CannotCompileException -> L57
            r0.setField(r1, r2)     // Catch: javassist.CannotCompileException -> L57
            r0 = r6
            boolean r0 = r0.factoryUseCache     // Catch: javassist.CannotCompileException -> L57
            if (r0 != 0) goto L54
            r0 = r6
            java.lang.String r1 = "default_interceptor"
            r2 = r6
            javassist.util.proxy.MethodHandler r2 = r2.handler     // Catch: javassist.CannotCompileException -> L57
            r0.setField(r1, r2)     // Catch: javassist.CannotCompileException -> L57
        L54:
            goto L65
        L57:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r9
            java.lang.String r2 = r2.getMessage()
            r3 = r9
            r1.<init>(r2, r3)
            throw r0
        L65:
            return
    }

    private java.lang.Class<?> getClassInTheSamePackage() {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.basename
            java.lang.String r1 = "javassist.util.proxy."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L11
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            return r0
        L11:
            r0 = r3
            java.lang.Class<?> r0 = r0.superClass
            if (r0 == 0) goto L27
            r0 = r3
            java.lang.Class<?> r0 = r0.superClass
            java.lang.Class<?> r1 = javassist.util.proxy.ProxyFactory.OBJECT_TYPE
            if (r0 == r1) goto L27
            r0 = r3
            java.lang.Class<?> r0 = r0.superClass
            return r0
        L27:
            r0 = r3
            java.lang.Class<?>[] r0 = r0.interfaces
            if (r0 == 0) goto L3d
            r0 = r3
            java.lang.Class<?>[] r0 = r0.interfaces
            int r0 = r0.length
            if (r0 <= 0) goto L3d
            r0 = r3
            java.lang.Class<?>[] r0 = r0.interfaces
            r1 = 0
            r0 = r0[r1]
            return r0
        L3d:
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    private void setField(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            java.lang.Class<?> r0 = r0.thisClass
            if (r0 == 0) goto L31
            r0 = r6
            if (r0 == 0) goto L31
            r0 = r4
            java.lang.Class<?> r0 = r0.thisClass     // Catch: java.lang.Exception -> L27
            r1 = r5
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L27
            r7 = r0
            r0 = r7
            r1 = 1
            javassist.util.proxy.SecurityActions.setAccessible(r0, r1)     // Catch: java.lang.Exception -> L27
            r0 = r7
            r1 = 0
            r2 = r6
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L27
            r0 = r7
            r1 = 0
            javassist.util.proxy.SecurityActions.setAccessible(r0, r1)     // Catch: java.lang.Exception -> L27
            goto L31
        L27:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L31:
            return
    }

    static byte[] getFilterSignature(java.lang.Class<?> r3) {
            r0 = r3
            java.lang.String r1 = "_filter_signature"
            java.lang.Object r0 = getField(r0, r1)
            byte[] r0 = (byte[]) r0
            return r0
    }

    private static java.lang.Object getField(java.lang.Class<?> r4, java.lang.String r5) {
            r0 = r4
            r1 = r5
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L18
            r6 = r0
            r0 = r6
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L18
            r0 = r6
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L18
            r7 = r0
            r0 = r6
            r1 = 0
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L18
            r0 = r7
            return r0
        L18:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    public static javassist.util.proxy.MethodHandler getHandler(javassist.util.proxy.Proxy r4) {
            r0 = r4
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L21
            java.lang.String r1 = "handler"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L21
            r5 = r0
            r0 = r5
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L21
            r0 = r5
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L21
            r6 = r0
            r0 = r5
            r1 = 0
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L21
            r0 = r6
            javassist.util.proxy.MethodHandler r0 = (javassist.util.proxy.MethodHandler) r0     // Catch: java.lang.Exception -> L21
            return r0
        L21:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    protected java.lang.ClassLoader getClassLoader() {
            r3 = this;
            javassist.util.proxy.ProxyFactory$ClassLoaderProvider r0 = javassist.util.proxy.ProxyFactory.classLoaderProvider
            r1 = r3
            java.lang.ClassLoader r0 = r0.get(r1)
            return r0
    }

    protected java.lang.ClassLoader getClassLoader0() {
            r3 = this;
            r0 = 0
            r4 = r0
            r0 = r3
            java.lang.Class<?> r0 = r0.superClass
            if (r0 == 0) goto L24
            r0 = r3
            java.lang.Class<?> r0 = r0.superClass
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.lang.Object"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            r0 = r3
            java.lang.Class<?> r0 = r0.superClass
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r4 = r0
            goto L3d
        L24:
            r0 = r3
            java.lang.Class<?>[] r0 = r0.interfaces
            if (r0 == 0) goto L3d
            r0 = r3
            java.lang.Class<?>[] r0 = r0.interfaces
            int r0 = r0.length
            if (r0 <= 0) goto L3d
            r0 = r3
            java.lang.Class<?>[] r0 = r0.interfaces
            r1 = 0
            r0 = r0[r1]
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r4 = r0
        L3d:
            r0 = r4
            if (r0 != 0) goto L5c
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L5c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L5c
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            r4 = r0
        L5c:
            r0 = r4
            return r0
    }

    protected java.security.ProtectionDomain getDomain() {
            r3 = this;
            r0 = r3
            java.lang.Class<?> r0 = r0.superClass
            if (r0 == 0) goto L1f
            r0 = r3
            java.lang.Class<?> r0 = r0.superClass
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.lang.Object"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1f
            r0 = r3
            java.lang.Class<?> r0 = r0.superClass
            r4 = r0
            goto L3d
        L1f:
            r0 = r3
            java.lang.Class<?>[] r0 = r0.interfaces
            if (r0 == 0) goto L38
            r0 = r3
            java.lang.Class<?>[] r0 = r0.interfaces
            int r0 = r0.length
            if (r0 <= 0) goto L38
            r0 = r3
            java.lang.Class<?>[] r0 = r0.interfaces
            r1 = 0
            r0 = r0[r1]
            r4 = r0
            goto L3d
        L38:
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            r4 = r0
        L3d:
            r0 = r4
            java.security.ProtectionDomain r0 = r0.getProtectionDomain()
            return r0
    }

    public java.lang.Object create(java.lang.Class<?>[] r5, java.lang.Object[] r6, javassist.util.proxy.MethodHandler r7) throws java.lang.NoSuchMethodException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.create(r1, r2)
            r8 = r0
            r0 = r8
            javassist.util.proxy.Proxy r0 = (javassist.util.proxy.Proxy) r0
            r1 = r7
            r0.setHandler(r1)
            r0 = r8
            return r0
    }

    public java.lang.Object create(java.lang.Class<?>[] r4, java.lang.Object[] r5) throws java.lang.NoSuchMethodException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r3 = this;
            r0 = r3
            java.lang.Class r0 = r0.createClass()
            r6 = r0
            r0 = r6
            r1 = r4
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            r7 = r0
            r0 = r7
            r1 = r5
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    @java.lang.Deprecated
    public void setHandler(javassist.util.proxy.MethodHandler r5) {
            r4 = this;
            r0 = r4
            boolean r0 = r0.factoryUseCache
            if (r0 == 0) goto L15
            r0 = r5
            if (r0 == 0) goto L15
            r0 = r4
            r1 = 0
            r0.factoryUseCache = r1
            r0 = r4
            r1 = 0
            r0.thisClass = r1
        L15:
            r0 = r4
            r1 = r5
            r0.handler = r1
            r0 = r4
            java.lang.String r1 = "default_interceptor"
            r2 = r4
            javassist.util.proxy.MethodHandler r2 = r2.handler
            r0.setField(r1, r2)
            return
    }

    private static java.lang.String makeProxyName(java.lang.String r3) {
            javassist.util.proxy.ProxyFactory$UniqueName r0 = javassist.util.proxy.ProxyFactory.nameGenerator
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            javassist.util.proxy.ProxyFactory$UniqueName r0 = javassist.util.proxy.ProxyFactory.nameGenerator     // Catch: java.lang.Throwable -> L12
            r1 = r3
            java.lang.String r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L12
            r1 = r4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            r0 = r5
            throw r0
    }

    private javassist.bytecode.ClassFile make() throws javassist.CannotCompileException {
            r6 = this;
            javassist.bytecode.ClassFile r0 = new javassist.bytecode.ClassFile
            r1 = r0
            r2 = 0
            r3 = r6
            java.lang.String r3 = r3.classname
            r4 = r6
            java.lang.String r4 = r4.superName
            r1.<init>(r2, r3, r4)
            r7 = r0
            r0 = r7
            r1 = 1
            r0.setAccessFlags(r1)
            r0 = r7
            r1 = r6
            java.lang.Class<?>[] r1 = r1.interfaces
            r2 = r6
            boolean r2 = r2.hasGetHandler
            if (r2 == 0) goto L27
            java.lang.Class<javassist.util.proxy.Proxy> r2 = javassist.util.proxy.Proxy.class
            goto L2a
        L27:
            java.lang.Class<javassist.util.proxy.ProxyObject> r2 = javassist.util.proxy.ProxyObject.class
        L2a:
            setInterfaces(r0, r1, r2)
            r0 = r7
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r8 = r0
            r0 = r6
            boolean r0 = r0.factoryUseCache
            if (r0 != 0) goto L52
            javassist.bytecode.FieldInfo r0 = new javassist.bytecode.FieldInfo
            r1 = r0
            r2 = r8
            java.lang.String r3 = "default_interceptor"
            java.lang.String r4 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r9
            r1 = 9
            r0.setAccessFlags(r1)
            r0 = r7
            r1 = r9
            r0.addField(r1)
        L52:
            javassist.bytecode.FieldInfo r0 = new javassist.bytecode.FieldInfo
            r1 = r0
            r2 = r8
            java.lang.String r3 = "handler"
            java.lang.String r4 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r9
            r1 = 2
            r0.setAccessFlags(r1)
            r0 = r7
            r1 = r9
            r0.addField(r1)
            javassist.bytecode.FieldInfo r0 = new javassist.bytecode.FieldInfo
            r1 = r0
            r2 = r8
            java.lang.String r3 = "_filter_signature"
            java.lang.String r4 = "[B"
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r10
            r1 = 9
            r0.setAccessFlags(r1)
            r0 = r7
            r1 = r10
            r0.addField(r1)
            javassist.bytecode.FieldInfo r0 = new javassist.bytecode.FieldInfo
            r1 = r0
            r2 = r8
            java.lang.String r3 = "serialVersionUID"
            java.lang.String r4 = "J"
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r11
            r1 = 25
            r0.setAccessFlags(r1)
            r0 = r7
            r1 = r11
            r0.addField(r1)
            r0 = r6
            java.lang.String r0 = r0.genericSignature
            if (r0 == 0) goto Lbe
            javassist.bytecode.SignatureAttribute r0 = new javassist.bytecode.SignatureAttribute
            r1 = r0
            r2 = r8
            r3 = r6
            java.lang.String r3 = r3.genericSignature
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r7
            r1 = r12
            r0.addAttribute(r1)
        Lbe:
            r0 = r6
            r1 = r6
            java.lang.String r1 = r1.classname
            r2 = r7
            r3 = r8
            r4 = r6
            java.lang.String r4 = r4.classname
            r0.makeConstructors(r1, r2, r3, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r6
            java.lang.String r3 = r3.classname
            r4 = r12
            int r0 = r0.overrideMethods(r1, r2, r3, r4)
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r6
            java.lang.String r2 = r2.classname
            r3 = r13
            r4 = r12
            addClassInitializer(r0, r1, r2, r3, r4)
            r0 = r6
            java.lang.String r0 = r0.classname
            r1 = r7
            r2 = r8
            addSetter(r0, r1, r2)
            r0 = r6
            boolean r0 = r0.hasGetHandler
            if (r0 != 0) goto L109
            r0 = r6
            java.lang.String r0 = r0.classname
            r1 = r7
            r2 = r8
            addGetter(r0, r1, r2)
        L109:
            r0 = r6
            boolean r0 = r0.factoryWriteReplace
            if (r0 == 0) goto L11d
            r0 = r7
            r1 = r8
            javassist.bytecode.MethodInfo r1 = makeWriteReplace(r1)     // Catch: javassist.bytecode.DuplicateMemberException -> L11b
            r0.addMethod(r1)     // Catch: javassist.bytecode.DuplicateMemberException -> L11b
            goto L11d
        L11b:
            r14 = move-exception
        L11d:
            r0 = r6
            r1 = 0
            r0.thisClass = r1
            r0 = r7
            return r0
    }

    private void checkClassAndSuperName() {
            r6 = this;
            r0 = r6
            java.lang.Class<?>[] r0 = r0.interfaces
            if (r0 != 0) goto Lf
            r0 = r6
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r0.interfaces = r1
        Lf:
            r0 = r6
            java.lang.Class<?> r0 = r0.superClass
            if (r0 != 0) goto L47
            r0 = r6
            java.lang.Class<?> r1 = javassist.util.proxy.ProxyFactory.OBJECT_TYPE
            r0.superClass = r1
            r0 = r6
            r1 = r6
            java.lang.Class<?> r1 = r1.superClass
            java.lang.String r1 = r1.getName()
            r0.superName = r1
            r0 = r6
            r1 = r6
            java.lang.Class<?>[] r1 = r1.interfaces
            int r1 = r1.length
            if (r1 != 0) goto L38
            r1 = r6
            java.lang.String r1 = r1.superName
            goto L41
        L38:
            r1 = r6
            java.lang.Class<?>[] r1 = r1.interfaces
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = r1.getName()
        L41:
            r0.basename = r1
            goto L5a
        L47:
            r0 = r6
            r1 = r6
            java.lang.Class<?> r1 = r1.superClass
            java.lang.String r1 = r1.getName()
            r0.superName = r1
            r0 = r6
            r1 = r6
            java.lang.String r1 = r1.superName
            r0.basename = r1
        L5a:
            r0 = r6
            java.lang.Class<?> r0 = r0.superClass
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 == 0) goto L86
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.String r3 = r3.superName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is final"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L86:
            r0 = r6
            java.lang.String r0 = r0.basename
            java.lang.String r1 = "java."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto La6
            r0 = r6
            java.lang.String r0 = r0.basename
            java.lang.String r1 = "jdk."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto La6
            boolean r0 = javassist.util.proxy.ProxyFactory.onlyPublicMethods
            if (r0 == 0) goto Lc7
        La6:
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "javassist.util.proxy."
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.String r2 = r2.basename
            r3 = 46
            r4 = 95
            java.lang.String r2 = r2.replace(r3, r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.basename = r1
        Lc7:
            return
    }

    private void allocateClassName() {
            r3 = this;
            r0 = r3
            r1 = r3
            java.lang.String r1 = r1.basename
            java.lang.String r1 = makeProxyName(r1)
            r0.classname = r1
            return
    }

    private void makeSortedMethodList() {
            r5 = this;
            r0 = r5
            r0.checkClassAndSuperName()
            r0 = r5
            r1 = 0
            r0.hasGetHandler = r1
            r0 = r5
            r1 = r5
            java.lang.Class<?> r1 = r1.superClass
            r2 = r5
            java.lang.Class<?>[] r2 = r2.interfaces
            java.util.Map r0 = r0.getMethods(r1, r2)
            r6 = r0
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r6
            java.util.Set r3 = r3.entrySet()
            r2.<init>(r3)
            r0.signatureMethods = r1
            r0 = r5
            java.util.List<java.util.Map$Entry<java.lang.String, java.lang.reflect.Method>> r0 = r0.signatureMethods
            java.util.Comparator<java.util.Map$Entry<java.lang.String, java.lang.reflect.Method>> r1 = javassist.util.proxy.ProxyFactory.sorter
            java.util.Collections.sort(r0, r1)
            return
    }

    private void computeSignature(javassist.util.proxy.MethodFilter r5) {
            r4 = this;
            r0 = r4
            r0.makeSortedMethodList()
            r0 = r4
            java.util.List<java.util.Map$Entry<java.lang.String, java.lang.reflect.Method>> r0 = r0.signatureMethods
            int r0 = r0.size()
            r6 = r0
            r0 = r6
            r1 = 7
            int r0 = r0 + r1
            r1 = 3
            int r0 = r0 >> r1
            r7 = r0
            r0 = r4
            r1 = r7
            byte[] r1 = new byte[r1]
            r0.signature = r1
            r0 = 0
            r8 = r0
        L1f:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L81
            r0 = r4
            java.util.List<java.util.Map$Entry<java.lang.String, java.lang.reflect.Method>> r0 = r0.signatureMethods
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r9 = r0
            r0 = r9
            int r0 = r0.getModifiers()
            r10 = r0
            r0 = r10
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 != 0) goto L7b
            r0 = r10
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L7b
            r0 = r10
            r1 = r4
            java.lang.String r1 = r1.basename
            r2 = r9
            boolean r0 = isVisible(r0, r1, r2)
            if (r0 == 0) goto L7b
            r0 = r5
            if (r0 == 0) goto L71
            r0 = r5
            r1 = r9
            boolean r0 = r0.isHandled(r1)
            if (r0 == 0) goto L7b
        L71:
            r0 = r4
            r1 = r4
            byte[] r1 = r1.signature
            r2 = r8
            r0.setBit(r1, r2)
        L7b:
            int r8 = r8 + 1
            goto L1f
        L81:
            return
    }

    private void installSignature(byte[] r5) {
            r4 = this;
            r0 = r4
            r0.makeSortedMethodList()
            r0 = r4
            java.util.List<java.util.Map$Entry<java.lang.String, java.lang.reflect.Method>> r0 = r0.signatureMethods
            int r0 = r0.size()
            r6 = r0
            r0 = r6
            r1 = 7
            int r0 = r0 + r1
            r1 = 3
            int r0 = r0 >> r1
            r7 = r0
            r0 = r5
            int r0 = r0.length
            r1 = r7
            if (r0 == r1) goto L26
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "invalid filter signature length for deserialized proxy class"
            r1.<init>(r2)
            throw r0
        L26:
            r0 = r4
            r1 = r5
            r0.signature = r1
            return
    }

    private boolean testBit(byte[] r4, int r5) {
            r3 = this;
            r0 = r5
            r1 = 3
            int r0 = r0 >> r1
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.length
            if (r0 <= r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r5
            r1 = 7
            r0 = r0 & r1
            r7 = r0
            r0 = 1
            r1 = r7
            int r0 = r0 << r1
            r8 = r0
            r0 = r4
            r1 = r6
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = r8
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
    }

    private void setBit(byte[] r6, int r7) {
            r5 = this;
            r0 = r7
            r1 = 3
            int r0 = r0 >> r1
            r8 = r0
            r0 = r8
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L24
            r0 = r7
            r1 = 7
            r0 = r0 & r1
            r9 = r0
            r0 = 1
            r1 = r9
            int r0 = r0 << r1
            r10 = r0
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r11 = r0
            r0 = r6
            r1 = r8
            r2 = r11
            r3 = r10
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
        L24:
            return
    }

    private static void setInterfaces(javassist.bytecode.ClassFile r5, java.lang.Class<?>[] r6, java.lang.Class<?> r7) {
            r0 = r7
            java.lang.String r0 = r0.getName()
            r8 = r0
            r0 = r6
            if (r0 == 0) goto Le
            r0 = r6
            int r0 = r0.length
            if (r0 != 0) goto L1b
        Le:
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            r3 = r8
            r1[r2] = r3
            r9 = r0
            goto L46
        L1b:
            r0 = r6
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            java.lang.String[] r0 = new java.lang.String[r0]
            r9 = r0
            r0 = 0
            r10 = r0
        L27:
            r0 = r10
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L40
            r0 = r9
            r1 = r10
            r2 = r6
            r3 = r10
            r2 = r2[r3]
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            int r10 = r10 + 1
            goto L27
        L40:
            r0 = r9
            r1 = r6
            int r1 = r1.length
            r2 = r8
            r0[r1] = r2
        L46:
            r0 = r5
            r1 = r9
            r0.setInterfaces(r1)
            return
    }

    private static void addClassInitializer(javassist.bytecode.ClassFile r8, javassist.bytecode.ConstPool r9, java.lang.String r10, int r11, java.util.List<javassist.util.proxy.ProxyFactory.Find2MethodsArgs> r12) throws javassist.CannotCompileException {
            javassist.bytecode.FieldInfo r0 = new javassist.bytecode.FieldInfo
            r1 = r0
            r2 = r9
            java.lang.String r3 = "_methods_"
            java.lang.String r4 = "[Ljava/lang/reflect/Method;"
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r13
            r1 = 10
            r0.setAccessFlags(r1)
            r0 = r8
            r1 = r13
            r0.addField(r1)
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r9
            java.lang.String r3 = "<clinit>"
            java.lang.String r4 = "()V"
            r1.<init>(r2, r3, r4)
            r14 = r0
            r0 = r14
            r1 = 8
            r0.setAccessFlags(r1)
            r0 = r14
            r1 = r9
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.ClassNotFoundException> r5 = java.lang.ClassNotFoundException.class
            r3[r4] = r5
            setThrows(r0, r1, r2)
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r9
            r3 = 0
            r4 = 2
            r1.<init>(r2, r3, r4)
            r15 = r0
            r0 = r15
            r1 = r11
            r2 = 2
            int r1 = r1 * r2
            r0.addIconst(r1)
            r0 = r15
            java.lang.String r1 = "java.lang.reflect.Method"
            r0.addAnewarray(r1)
            r0 = 0
            r16 = r0
            r0 = r15
            r1 = 0
            r0.addAstore(r1)
            r0 = r15
            r1 = r10
            r0.addLdc(r1)
            r0 = r15
            java.lang.String r1 = "java.lang.Class"
            java.lang.String r2 = "forName"
            java.lang.String r3 = "(Ljava/lang/String;)Ljava/lang/Class;"
            r0.addInvokestatic(r1, r2, r3)
            r0 = 1
            r17 = r0
            r0 = r15
            r1 = 1
            r0.addAstore(r1)
            r0 = r12
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
        L8f:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lc3
            r0 = r18
            java.lang.Object r0 = r0.next()
            javassist.util.proxy.ProxyFactory$Find2MethodsArgs r0 = (javassist.util.proxy.ProxyFactory.Find2MethodsArgs) r0
            r19 = r0
            r0 = r15
            r1 = r19
            java.lang.String r1 = r1.methodName
            r2 = r19
            java.lang.String r2 = r2.delegatorName
            r3 = r19
            int r3 = r3.origIndex
            r4 = r19
            java.lang.String r4 = r4.descriptor
            r5 = 1
            r6 = 0
            callFind2Methods(r0, r1, r2, r3, r4, r5, r6)
            goto L8f
        Lc3:
            r0 = r15
            r1 = 0
            r0.addAload(r1)
            r0 = r15
            r1 = r10
            java.lang.String r2 = "_methods_"
            java.lang.String r3 = "[Ljava/lang/reflect/Method;"
            r0.addPutstatic(r1, r2, r3)
            r0 = r15
            r1 = -1
            r0.addLconst(r1)
            r0 = r15
            r1 = r10
            java.lang.String r2 = "serialVersionUID"
            java.lang.String r3 = "J"
            r0.addPutstatic(r1, r2, r3)
            r0 = r15
            r1 = 177(0xb1, float:2.48E-43)
            r0.addOpcode(r1)
            r0 = r14
            r1 = r15
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()
            r0.setCodeAttribute(r1)
            r0 = r8
            r1 = r14
            r0.addMethod(r1)
            return
    }

    private static void callFind2Methods(javassist.bytecode.Bytecode r5, java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9, int r10, int r11) {
            java.lang.Class<javassist.util.proxy.RuntimeSupport> r0 = javassist.util.proxy.RuntimeSupport.class
            java.lang.String r0 = r0.getName()
            r12 = r0
            java.lang.String r0 = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/reflect/Method;)V"
            r13 = r0
            r0 = r5
            r1 = r10
            r0.addAload(r1)
            r0 = r5
            r1 = r6
            r0.addLdc(r1)
            r0 = r7
            if (r0 != 0) goto L24
            r0 = r5
            r1 = 1
            r0.addOpcode(r1)
            goto L29
        L24:
            r0 = r5
            r1 = r7
            r0.addLdc(r1)
        L29:
            r0 = r5
            r1 = r8
            r0.addIconst(r1)
            r0 = r5
            r1 = r9
            r0.addLdc(r1)
            r0 = r5
            r1 = r11
            r0.addAload(r1)
            r0 = r5
            r1 = r12
            java.lang.String r2 = "find2Methods"
            r3 = r13
            r0.addInvokestatic(r1, r2, r3)
            return
    }

    private static void addSetter(java.lang.String r6, javassist.bytecode.ClassFile r7, javassist.bytecode.ConstPool r8) throws javassist.CannotCompileException {
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r8
            java.lang.String r3 = "setHandler"
            java.lang.String r4 = javassist.util.proxy.ProxyFactory.HANDLER_SETTER_TYPE
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r9
            r1 = 1
            r0.setAccessFlags(r1)
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r8
            r3 = 2
            r4 = 2
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r10
            r1 = 0
            r0.addAload(r1)
            r0 = r10
            r1 = 1
            r0.addAload(r1)
            r0 = r10
            r1 = r6
            java.lang.String r2 = "handler"
            java.lang.String r3 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            r0.addPutfield(r1, r2, r3)
            r0 = r10
            r1 = 177(0xb1, float:2.48E-43)
            r0.addOpcode(r1)
            r0 = r9
            r1 = r10
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()
            r0.setCodeAttribute(r1)
            r0 = r7
            r1 = r9
            r0.addMethod(r1)
            return
    }

    private static void addGetter(java.lang.String r6, javassist.bytecode.ClassFile r7, javassist.bytecode.ConstPool r8) throws javassist.CannotCompileException {
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r8
            java.lang.String r3 = "getHandler"
            java.lang.String r4 = javassist.util.proxy.ProxyFactory.HANDLER_GETTER_TYPE
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r9
            r1 = 1
            r0.setAccessFlags(r1)
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r8
            r3 = 1
            r4 = 1
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r10
            r1 = 0
            r0.addAload(r1)
            r0 = r10
            r1 = r6
            java.lang.String r2 = "handler"
            java.lang.String r3 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            r0.addGetfield(r1, r2, r3)
            r0 = r10
            r1 = 176(0xb0, float:2.47E-43)
            r0.addOpcode(r1)
            r0 = r9
            r1 = r10
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()
            r0.setCodeAttribute(r1)
            r0 = r7
            r1 = r9
            r0.addMethod(r1)
            return
    }

    private int overrideMethods(javassist.bytecode.ClassFile r11, javassist.bytecode.ConstPool r12, java.lang.String r13, java.util.List<javassist.util.proxy.ProxyFactory.Find2MethodsArgs> r14) throws javassist.CannotCompileException {
            r10 = this;
            java.lang.String r0 = "_d"
            r1 = r10
            java.util.List<java.util.Map$Entry<java.lang.String, java.lang.reflect.Method>> r1 = r1.signatureMethods
            java.lang.String r0 = makeUniqueName(r0, r1)
            r15 = r0
            r0 = r10
            java.util.List<java.util.Map$Entry<java.lang.String, java.lang.reflect.Method>> r0 = r0.signatureMethods
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
            r0 = 0
            r17 = r0
        L1a:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L89
            r0 = r16
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r18 = r0
            int r0 = javassist.bytecode.ClassFile.MAJOR_VERSION
            r1 = 49
            if (r0 < r1) goto L48
            r0 = r18
            java.lang.Object r0 = r0.getValue()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r0 = isBridge(r0)
            if (r0 != 0) goto L83
        L48:
            r0 = r10
            r1 = r10
            byte[] r1 = r1.signature
            r2 = r17
            boolean r0 = r0.testBit(r1, r2)
            if (r0 == 0) goto L83
            r0 = r10
            r1 = r13
            r2 = r18
            java.lang.Object r2 = r2.getValue()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r3 = r15
            r4 = r17
            r5 = r18
            java.lang.Object r5 = r5.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r6 = r18
            java.lang.Object r6 = r6.getValue()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r5 = keyToDesc(r5, r6)
            r6 = r11
            r7 = r12
            r8 = r14
            r0.override(r1, r2, r3, r4, r5, r6, r7, r8)
        L83:
            int r17 = r17 + 1
            goto L1a
        L89:
            r0 = r17
            return r0
    }

    private static boolean isBridge(java.lang.reflect.Method r2) {
            r0 = r2
            boolean r0 = r0.isBridge()
            return r0
    }

    private void override(java.lang.String r10, java.lang.reflect.Method r11, java.lang.String r12, int r13, java.lang.String r14, javassist.bytecode.ClassFile r15, javassist.bytecode.ConstPool r16, java.util.List<javassist.util.proxy.ProxyFactory.Find2MethodsArgs> r17) throws javassist.CannotCompileException {
            r9 = this;
            r0 = r11
            java.lang.Class r0 = r0.getDeclaringClass()
            r18 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r13
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r11
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r19 = r0
            r0 = r11
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L32
            r0 = 0
            r19 = r0
            goto L55
        L32:
            r0 = r9
            r1 = r11
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r19
            javassist.bytecode.MethodInfo r0 = r0.makeDelegator(r1, r2, r3, r4, r5)
            r20 = r0
            r0 = r20
            r1 = r20
            int r1 = r1.getAccessFlags()
            r2 = -65
            r1 = r1 & r2
            r0.setAccessFlags(r1)
            r0 = r15
            r1 = r20
            r0.addMethod(r1)
        L55:
            r0 = r10
            r1 = r11
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r13
            r7 = r17
            javassist.bytecode.MethodInfo r0 = makeForwarder(r0, r1, r2, r3, r4, r5, r6, r7)
            r20 = r0
            r0 = r15
            r1 = r20
            r0.addMethod(r1)
            return
    }

    private void makeConstructors(java.lang.String r7, javassist.bytecode.ClassFile r8, javassist.bytecode.ConstPool r9, java.lang.String r10) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r6
            java.lang.Class<?> r0 = r0.superClass
            java.lang.reflect.Constructor[] r0 = javassist.util.proxy.SecurityActions.getDeclaredConstructors(r0)
            r11 = r0
            r0 = r6
            boolean r0 = r0.factoryUseCache
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r12 = r0
            r0 = 0
            r13 = r0
        L1a:
            r0 = r13
            r1 = r11
            int r1 = r1.length
            if (r0 >= r1) goto L69
            r0 = r11
            r1 = r13
            r0 = r0[r1]
            r14 = r0
            r0 = r14
            int r0 = r0.getModifiers()
            r15 = r0
            r0 = r15
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 != 0) goto L63
            r0 = r15
            boolean r0 = java.lang.reflect.Modifier.isPrivate(r0)
            if (r0 != 0) goto L63
            r0 = r15
            r1 = r6
            java.lang.String r1 = r1.basename
            r2 = r14
            boolean r0 = isVisible(r0, r1, r2)
            if (r0 == 0) goto L63
            r0 = r7
            r1 = r14
            r2 = r9
            r3 = r6
            java.lang.Class<?> r3 = r3.superClass
            r4 = r12
            javassist.bytecode.MethodInfo r0 = makeConstructor(r0, r1, r2, r3, r4)
            r16 = r0
            r0 = r8
            r1 = r16
            r0.addMethod(r1)
        L63:
            int r13 = r13 + 1
            goto L1a
        L69:
            return
    }

    private static java.lang.String makeUniqueName(java.lang.String r4, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.reflect.Method>> r5) {
            r0 = r4
            r1 = r5
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = makeUniqueName0(r0, r1)
            if (r0 == 0) goto Lf
            r0 = r4
            return r0
        Lf:
            r0 = 100
            r6 = r0
        L12:
            r0 = r6
            r1 = 999(0x3e7, float:1.4E-42)
            if (r0 >= r1) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r7
            r1 = r5
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = makeUniqueName0(r0, r1)
            if (r0 == 0) goto L3b
            r0 = r7
            return r0
        L3b:
            int r6 = r6 + 1
            goto L12
        L41:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "cannot make a unique method name"
            r1.<init>(r2)
            throw r0
    }

    private static boolean makeUniqueName0(java.lang.String r3, java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.reflect.Method>> r4) {
        L0:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L23
            r0 = r4
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1 = r3
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L0
            r0 = 0
            return r0
        L23:
            r0 = 1
            return r0
    }

    private static boolean isVisible(int r3, java.lang.String r4, java.lang.reflect.Member r5) {
            r0 = r3
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = r3
            r1 = 5
            r0 = r0 & r1
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = r4
            java.lang.String r0 = getPackageName(r0)
            r6 = r0
            r0 = r5
            java.lang.Class r0 = r0.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getPackageName(r0)
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L32
            r0 = r7
            if (r0 != 0) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            return r0
        L32:
            r0 = r6
            r1 = r7
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static java.lang.String getPackageName(java.lang.String r4) {
            r0 = r4
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r5 = r0
            r0 = r5
            if (r0 >= 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r4
            r1 = 0
            r2 = r5
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    private java.util.Map<java.lang.String, java.lang.reflect.Method> getMethods(java.lang.Class<?> r6, java.lang.Class<?>[] r7) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r8 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = 0
            r10 = r0
        L14:
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L2c
            r0 = r5
            r1 = r8
            r2 = r7
            r3 = r10
            r2 = r2[r3]
            r3 = r9
            r0.getMethods(r1, r2, r3)
            int r10 = r10 + 1
            goto L14
        L2c:
            r0 = r5
            r1 = r8
            r2 = r6
            r3 = r9
            r0.getMethods(r1, r2, r3)
            r0 = r8
            return r0
    }

    private void getMethods(java.util.Map<java.lang.String, java.lang.reflect.Method> r6, java.lang.Class<?> r7, java.util.Set<java.lang.Class<?>> r8) {
            r5 = this;
            r0 = r8
            r1 = r7
            boolean r0 = r0.add(r1)
            if (r0 != 0) goto Lb
            return
        Lb:
            r0 = r7
            java.lang.Class[] r0 = r0.getInterfaces()
            r9 = r0
            r0 = 0
            r10 = r0
        L14:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L2d
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r10
            r2 = r2[r3]
            r3 = r8
            r0.getMethods(r1, r2, r3)
            int r10 = r10 + 1
            goto L14
        L2d:
            r0 = r7
            java.lang.Class r0 = r0.getSuperclass()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L40
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r8
            r0.getMethods(r1, r2, r3)
        L40:
            r0 = r7
            java.lang.reflect.Method[] r0 = javassist.util.proxy.SecurityActions.getDeclaredMethods(r0)
            r11 = r0
            r0 = 0
            r12 = r0
        L49:
            r0 = r12
            r1 = r11
            int r1 = r1.length
            if (r0 >= r1) goto L10f
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPrivate(r0)
            if (r0 != 0) goto L109
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r13
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 58
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r13
            java.lang.String r1 = javassist.util.proxy.RuntimeSupport.makeDescriptor(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14 = r0
            r0 = r14
            java.lang.String r1 = "getHandler:()"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L97
            r0 = r5
            r1 = 1
            r0.hasGetHandler = r1
        L97:
            r0 = r6
            r1 = r14
            r2 = r13
            java.lang.Object r0 = r0.put(r1, r2)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r15 = r0
            r0 = 0
            r1 = r15
            if (r0 == r1) goto Le2
            r0 = r13
            boolean r0 = isBridge(r0)
            if (r0 == 0) goto Le2
            r0 = r15
            java.lang.Class r0 = r0.getDeclaringClass()
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 != 0) goto Le2
            r0 = r15
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto Le2
            r0 = r12
            r1 = r11
            boolean r0 = isDuplicated(r0, r1)
            if (r0 != 0) goto Le2
            r0 = r6
            r1 = r14
            r2 = r15
            java.lang.Object r0 = r0.put(r1, r2)
        Le2:
            r0 = 0
            r1 = r15
            if (r0 == r1) goto L109
            r0 = r15
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L109
            r0 = r13
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 != 0) goto L109
            r0 = r6
            r1 = r14
            r2 = r15
            java.lang.Object r0 = r0.put(r1, r2)
        L109:
            int r12 = r12 + 1
            goto L49
        L10f:
            return
    }

    private static boolean isDuplicated(int r4, java.lang.reflect.Method[] r5) {
            r0 = r5
            r1 = r4
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            r6 = r0
            r0 = 0
            r7 = r0
        L9:
            r0 = r7
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L35
            r0 = r7
            r1 = r4
            if (r0 == r1) goto L2f
            r0 = r6
            r1 = r5
            r2 = r7
            r1 = r1[r2]
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2f
            r0 = r5
            r1 = r4
            r0 = r0[r1]
            r1 = r5
            r2 = r7
            r1 = r1[r2]
            boolean r0 = areParametersSame(r0, r1)
            if (r0 == 0) goto L2f
            r0 = 1
            return r0
        L2f:
            int r7 = r7 + 1
            goto L9
        L35:
            r0 = 0
            return r0
    }

    private static boolean areParametersSame(java.lang.reflect.Method r4, java.lang.reflect.Method r5) {
            r0 = r4
            java.lang.Class[] r0 = r0.getParameterTypes()
            r6 = r0
            r0 = r5
            java.lang.Class[] r0 = r0.getParameterTypes()
            r7 = r0
            r0 = r6
            int r0 = r0.length
            r1 = r7
            int r1 = r1.length
            if (r0 != r1) goto L3c
            r0 = 0
            r8 = r0
        L14:
            r0 = r8
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L3a
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            r1 = r7
            r2 = r8
            r1 = r1[r2]
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32
            goto L34
        L32:
            r0 = 0
            return r0
        L34:
            int r8 = r8 + 1
            goto L14
        L3a:
            r0 = 1
            return r0
        L3c:
            r0 = 0
            return r0
    }

    private static java.lang.String keyToDesc(java.lang.String r4, java.lang.reflect.Method r5) {
            r0 = r4
            r1 = r4
            r2 = 58
            int r1 = r1.indexOf(r2)
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            return r0
    }

    private static javassist.bytecode.MethodInfo makeConstructor(java.lang.String r6, java.lang.reflect.Constructor<?> r7, javassist.bytecode.ConstPool r8, java.lang.Class<?> r9, boolean r10) {
            r0 = r7
            java.lang.Class[] r0 = r0.getParameterTypes()
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.String r0 = javassist.util.proxy.RuntimeSupport.makeDescriptor(r0, r1)
            r11 = r0
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r8
            java.lang.String r3 = "<init>"
            r4 = r11
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r12
            r1 = 1
            r0.setAccessFlags(r1)
            r0 = r12
            r1 = r8
            r2 = r7
            java.lang.Class[] r2 = r2.getExceptionTypes()
            setThrows(r0, r1, r2)
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r8
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r10
            if (r0 == 0) goto L72
            r0 = r13
            r1 = 0
            r0.addAload(r1)
            r0 = r13
            r1 = r6
            java.lang.String r2 = "default_interceptor"
            java.lang.String r3 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            r0.addGetstatic(r1, r2, r3)
            r0 = r13
            r1 = r6
            java.lang.String r2 = "handler"
            java.lang.String r3 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            r0.addPutfield(r1, r2, r3)
            r0 = r13
            r1 = r6
            java.lang.String r2 = "default_interceptor"
            java.lang.String r3 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            r0.addGetstatic(r1, r2, r3)
            r0 = r13
            r1 = 199(0xc7, float:2.79E-43)
            r0.addOpcode(r1)
            r0 = r13
            r1 = 10
            r0.addIndex(r1)
        L72:
            r0 = r13
            r1 = 0
            r0.addAload(r1)
            r0 = r13
            java.lang.String r1 = "javassist.util.proxy.RuntimeSupport"
            java.lang.String r2 = "default_interceptor"
            java.lang.String r3 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            r0.addGetstatic(r1, r2, r3)
            r0 = r13
            r1 = r6
            java.lang.String r2 = "handler"
            java.lang.String r3 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            r0.addPutfield(r1, r2, r3)
            r0 = r13
            int r0 = r0.currentPc()
            r14 = r0
            r0 = r13
            r1 = 0
            r0.addAload(r1)
            r0 = r13
            r1 = r7
            java.lang.Class[] r1 = r1.getParameterTypes()
            r2 = 1
            int r0 = addLoadParameters(r0, r1, r2)
            r15 = r0
            r0 = r13
            r1 = r9
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "<init>"
            r3 = r11
            r0.addInvokespecial(r1, r2, r3)
            r0 = r13
            r1 = 177(0xb1, float:2.48E-43)
            r0.addOpcode(r1)
            r0 = r13
            r1 = r15
            r2 = 1
            int r1 = r1 + r2
            r0.setMaxLocals(r1)
            r0 = r13
            javassist.bytecode.CodeAttribute r0 = r0.toCodeAttribute()
            r16 = r0
            r0 = r12
            r1 = r16
            r0.setCodeAttribute(r1)
            javassist.bytecode.StackMapTable$Writer r0 = new javassist.bytecode.StackMapTable$Writer
            r1 = r0
            r2 = 32
            r1.<init>(r2)
            r17 = r0
            r0 = r17
            r1 = r14
            r0.sameFrame(r1)
            r0 = r16
            r1 = r17
            r2 = r8
            javassist.bytecode.StackMapTable r1 = r1.toStackMapTable(r2)
            r0.setAttribute(r1)
            r0 = r12
            return r0
    }

    private javassist.bytecode.MethodInfo makeDelegator(java.lang.reflect.Method r7, java.lang.String r8, javassist.bytecode.ConstPool r9, java.lang.Class<?> r10, java.lang.String r11) {
            r6 = this;
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r9
            r3 = r11
            r4 = r8
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r12
            r1 = 17
            r2 = r7
            int r2 = r2.getModifiers()
            r3 = -1319(0xfffffffffffffad9, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            r0.setAccessFlags(r1)
            r0 = r12
            r1 = r9
            r2 = r7
            setThrows(r0, r1, r2)
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r9
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r13
            r1 = 0
            r0.addAload(r1)
            r0 = r13
            r1 = r7
            java.lang.Class[] r1 = r1.getParameterTypes()
            r2 = 1
            int r0 = addLoadParameters(r0, r1, r2)
            r14 = r0
            r0 = r6
            r1 = r10
            java.lang.Class r0 = r0.invokespecialTarget(r1)
            r15 = r0
            r0 = r13
            r1 = r15
            boolean r1 = r1.isInterface()
            r2 = r9
            r3 = r15
            java.lang.String r3 = r3.getName()
            int r2 = r2.addClassInfo(r3)
            r3 = r7
            java.lang.String r3 = r3.getName()
            r4 = r8
            r0.addInvokespecial(r1, r2, r3, r4)
            r0 = r13
            r1 = r7
            java.lang.Class r1 = r1.getReturnType()
            int r0 = addReturn(r0, r1)
            r0 = r13
            int r14 = r14 + 1
            r1 = r14
            r0.setMaxLocals(r1)
            r0 = r12
            r1 = r13
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()
            r0.setCodeAttribute(r1)
            r0 = r12
            return r0
    }

    private java.lang.Class<?> invokespecialTarget(java.lang.Class<?> r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L30
            r0 = r3
            java.lang.Class<?>[] r0 = r0.interfaces
            r5 = r0
            r0 = r5
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        L12:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L30
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r4
            r1 = r8
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L2a
            r0 = r8
            return r0
        L2a:
            int r7 = r7 + 1
            goto L12
        L30:
            r0 = r3
            java.lang.Class<?> r0 = r0.superClass
            return r0
    }

    private static javassist.bytecode.MethodInfo makeForwarder(java.lang.String r8, java.lang.reflect.Method r9, java.lang.String r10, javassist.bytecode.ConstPool r11, java.lang.Class<?> r12, java.lang.String r13, int r14, java.util.List<javassist.util.proxy.ProxyFactory.Find2MethodsArgs> r15) {
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r11
            r3 = r9
            java.lang.String r3 = r3.getName()
            r4 = r10
            r1.<init>(r2, r3, r4)
            r16 = r0
            r0 = r16
            r1 = 16
            r2 = r9
            int r2 = r2.getModifiers()
            r3 = -1313(0xfffffffffffffadf, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            r0.setAccessFlags(r1)
            r0 = r16
            r1 = r11
            r2 = r9
            setThrows(r0, r1, r2)
            r0 = r10
            int r0 = javassist.bytecode.Descriptor.paramSize(r0)
            r17 = r0
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r11
            r3 = 0
            r4 = r17
            r5 = 2
            int r4 = r4 + r5
            r1.<init>(r2, r3, r4)
            r18 = r0
            r0 = r14
            r1 = 2
            int r0 = r0 * r1
            r19 = r0
            r0 = r14
            r1 = 2
            int r0 = r0 * r1
            r1 = 1
            int r0 = r0 + r1
            r20 = r0
            r0 = r17
            r1 = 1
            int r0 = r0 + r1
            r21 = r0
            r0 = r18
            r1 = r8
            java.lang.String r2 = "_methods_"
            java.lang.String r3 = "[Ljava/lang/reflect/Method;"
            r0.addGetstatic(r1, r2, r3)
            r0 = r18
            r1 = r21
            r0.addAstore(r1)
            r0 = r15
            javassist.util.proxy.ProxyFactory$Find2MethodsArgs r1 = new javassist.util.proxy.ProxyFactory$Find2MethodsArgs
            r2 = r1
            r3 = r9
            java.lang.String r3 = r3.getName()
            r4 = r13
            r5 = r10
            r6 = r19
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
            r0 = r18
            r1 = 0
            r0.addAload(r1)
            r0 = r18
            r1 = r8
            java.lang.String r2 = "handler"
            java.lang.String r3 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            r0.addGetfield(r1, r2, r3)
            r0 = r18
            r1 = 0
            r0.addAload(r1)
            r0 = r18
            r1 = r21
            r0.addAload(r1)
            r0 = r18
            r1 = r19
            r0.addIconst(r1)
            r0 = r18
            r1 = 50
            r0.addOpcode(r1)
            r0 = r18
            r1 = r21
            r0.addAload(r1)
            r0 = r18
            r1 = r20
            r0.addIconst(r1)
            r0 = r18
            r1 = 50
            r0.addOpcode(r1)
            r0 = r18
            r1 = r9
            java.lang.Class[] r1 = r1.getParameterTypes()
            makeParameterList(r0, r1)
            r0 = r18
            java.lang.Class<javassist.util.proxy.MethodHandler> r1 = javassist.util.proxy.MethodHandler.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "invoke"
            java.lang.String r3 = "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"
            r4 = 5
            r0.addInvokeinterface(r1, r2, r3, r4)
            r0 = r9
            java.lang.Class r0 = r0.getReturnType()
            r22 = r0
            r0 = r18
            r1 = r22
            addUnwrapper(r0, r1)
            r0 = r18
            r1 = r22
            int r0 = addReturn(r0, r1)
            r0 = r18
            javassist.bytecode.CodeAttribute r0 = r0.toCodeAttribute()
            r23 = r0
            r0 = r16
            r1 = r23
            r0.setCodeAttribute(r1)
            r0 = r16
            return r0
    }

    private static void setThrows(javassist.bytecode.MethodInfo r4, javassist.bytecode.ConstPool r5, java.lang.reflect.Method r6) {
            r0 = r6
            java.lang.Class[] r0 = r0.getExceptionTypes()
            r7 = r0
            r0 = r4
            r1 = r5
            r2 = r7
            setThrows(r0, r1, r2)
            return
    }

    private static void setThrows(javassist.bytecode.MethodInfo r5, javassist.bytecode.ConstPool r6, java.lang.Class<?>[] r7) {
            r0 = r7
            int r0 = r0.length
            if (r0 != 0) goto L6
            return
        L6:
            r0 = r7
            int r0 = r0.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r8 = r0
            r0 = 0
            r9 = r0
        Lf:
            r0 = r9
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L27
            r0 = r8
            r1 = r9
            r2 = r7
            r3 = r9
            r2 = r2[r3]
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            int r9 = r9 + 1
            goto Lf
        L27:
            javassist.bytecode.ExceptionsAttribute r0 = new javassist.bytecode.ExceptionsAttribute
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            r1 = r8
            r0.setExceptions(r1)
            r0 = r5
            r1 = r9
            r0.setExceptionsAttribute(r1)
            return
    }

    private static int addLoadParameters(javassist.bytecode.Bytecode r6, java.lang.Class<?>[] r7, int r8) {
            r0 = 0
            r9 = r0
            r0 = r7
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L9:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L24
            r0 = r9
            r1 = r6
            r2 = r9
            r3 = r8
            int r2 = r2 + r3
            r3 = r7
            r4 = r11
            r3 = r3[r4]
            int r1 = addLoad(r1, r2, r3)
            int r0 = r0 + r1
            r9 = r0
            int r11 = r11 + 1
            goto L9
        L24:
            r0 = r9
            return r0
    }

    private static int addLoad(javassist.bytecode.Bytecode r3, int r4, java.lang.Class<?> r5) {
            r0 = r5
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L3a
            r0 = r5
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L15
            r0 = r3
            r1 = r4
            r0.addLload(r1)
            r0 = 2
            return r0
        L15:
            r0 = r5
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L24
            r0 = r3
            r1 = r4
            r0.addFload(r1)
            goto L3f
        L24:
            r0 = r5
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L32
            r0 = r3
            r1 = r4
            r0.addDload(r1)
            r0 = 2
            return r0
        L32:
            r0 = r3
            r1 = r4
            r0.addIload(r1)
            goto L3f
        L3a:
            r0 = r3
            r1 = r4
            r0.addAload(r1)
        L3f:
            r0 = 1
            return r0
    }

    private static int addReturn(javassist.bytecode.Bytecode r3, java.lang.Class<?> r4) {
            r0 = r4
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L52
            r0 = r4
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L17
            r0 = r3
            r1 = 173(0xad, float:2.42E-43)
            r0.addOpcode(r1)
            r0 = 2
            return r0
        L17:
            r0 = r4
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L28
            r0 = r3
            r1 = 174(0xae, float:2.44E-43)
            r0.addOpcode(r1)
            goto L59
        L28:
            r0 = r4
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L38
            r0 = r3
            r1 = 175(0xaf, float:2.45E-43)
            r0.addOpcode(r1)
            r0 = 2
            return r0
        L38:
            r0 = r4
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L48
            r0 = r3
            r1 = 177(0xb1, float:2.48E-43)
            r0.addOpcode(r1)
            r0 = 0
            return r0
        L48:
            r0 = r3
            r1 = 172(0xac, float:2.41E-43)
            r0.addOpcode(r1)
            goto L59
        L52:
            r0 = r3
            r1 = 176(0xb0, float:2.47E-43)
            r0.addOpcode(r1)
        L59:
            r0 = 1
            return r0
    }

    private static void makeParameterList(javassist.bytecode.Bytecode r4, java.lang.Class<?>[] r5) {
            r0 = 1
            r6 = r0
            r0 = r5
            int r0 = r0.length
            r7 = r0
            r0 = r4
            r1 = r7
            r0.addIconst(r1)
            r0 = r4
            java.lang.String r1 = "java/lang/Object"
            r0.addAnewarray(r1)
            r0 = 0
            r8 = r0
        L14:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L53
            r0 = r4
            r1 = 89
            r0.addOpcode(r1)
            r0 = r4
            r1 = r8
            r0.addIconst(r1)
            r0 = r5
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L3f
            r0 = r4
            r1 = r9
            r2 = r6
            int r0 = makeWrapper(r0, r1, r2)
            r6 = r0
            goto L47
        L3f:
            r0 = r4
            r1 = r6
            r0.addAload(r1)
            int r6 = r6 + 1
        L47:
            r0 = r4
            r1 = 83
            r0.addOpcode(r1)
            int r8 = r8 + 1
            goto L14
        L53:
            return
    }

    private static int makeWrapper(javassist.bytecode.Bytecode r6, java.lang.Class<?> r7, int r8) {
            r0 = r7
            int r0 = javassist.util.proxy.FactoryHelper.typeIndex(r0)
            r9 = r0
            java.lang.String[] r0 = javassist.util.proxy.FactoryHelper.wrapperTypes
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r6
            r1 = r10
            r0.addNew(r1)
            r0 = r6
            r1 = 89
            r0.addOpcode(r1)
            r0 = r6
            r1 = r8
            r2 = r7
            int r0 = addLoad(r0, r1, r2)
            r0 = r6
            r1 = r10
            java.lang.String r2 = "<init>"
            java.lang.String[] r3 = javassist.util.proxy.FactoryHelper.wrapperDesc
            r4 = r9
            r3 = r3[r4]
            r0.addInvokespecial(r1, r2, r3)
            r0 = r8
            int[] r1 = javassist.util.proxy.FactoryHelper.dataSize
            r2 = r9
            r1 = r1[r2]
            int r0 = r0 + r1
            return r0
    }

    private static void addUnwrapper(javassist.bytecode.Bytecode r6, java.lang.Class<?> r7) {
            r0 = r7
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L39
            r0 = r7
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L17
            r0 = r6
            r1 = 87
            r0.addOpcode(r1)
            goto L41
        L17:
            r0 = r7
            int r0 = javassist.util.proxy.FactoryHelper.typeIndex(r0)
            r8 = r0
            java.lang.String[] r0 = javassist.util.proxy.FactoryHelper.wrapperTypes
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r6
            r1 = r9
            r0.addCheckcast(r1)
            r0 = r6
            r1 = r9
            java.lang.String[] r2 = javassist.util.proxy.FactoryHelper.unwarpMethods
            r3 = r8
            r2 = r2[r3]
            java.lang.String[] r3 = javassist.util.proxy.FactoryHelper.unwrapDesc
            r4 = r8
            r3 = r3[r4]
            r0.addInvokevirtual(r1, r2, r3)
            goto L41
        L39:
            r0 = r6
            r1 = r7
            java.lang.String r1 = r1.getName()
            r0.addCheckcast(r1)
        L41:
            return
    }

    private static javassist.bytecode.MethodInfo makeWriteReplace(javassist.bytecode.ConstPool r6) {
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r6
            java.lang.String r3 = "writeReplace"
            java.lang.String r4 = "()Ljava/lang/Object;"
            r1.<init>(r2, r3, r4)
            r7 = r0
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r8 = r0
            r0 = r8
            r1 = 0
            java.lang.String r2 = "java.io.ObjectStreamException"
            r0[r1] = r2
            javassist.bytecode.ExceptionsAttribute r0 = new javassist.bytecode.ExceptionsAttribute
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            r1 = r8
            r0.setExceptions(r1)
            r0 = r7
            r1 = r9
            r0.setExceptionsAttribute(r1)
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r6
            r3 = 0
            r4 = 1
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r10
            r1 = 0
            r0.addAload(r1)
            r0 = r10
            java.lang.String r1 = "javassist.util.proxy.RuntimeSupport"
            java.lang.String r2 = "makeSerializedProxy"
            java.lang.String r3 = "(Ljava/lang/Object;)Ljavassist/util/proxy/SerializedProxy;"
            r0.addInvokestatic(r1, r2, r3)
            r0 = r10
            r1 = 176(0xb0, float:2.47E-43)
            r0.addOpcode(r1)
            r0 = r7
            r1 = r10
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()
            r0.setCodeAttribute(r1)
            r0 = r7
            return r0
    }

    static {
            r0 = 0
            javassist.util.proxy.ProxyFactory.onlyPublicMethods = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            javassist.util.proxy.ProxyFactory.OBJECT_TYPE = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Class<javassist.util.proxy.MethodHandler> r1 = javassist.util.proxy.MethodHandler.class
            java.lang.String r1 = r1.getName()
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            javassist.util.proxy.ProxyFactory.HANDLER_TYPE = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")V"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            javassist.util.proxy.ProxyFactory.HANDLER_SETTER_TYPE = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "()"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = javassist.util.proxy.ProxyFactory.HANDLER_TYPE
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            javassist.util.proxy.ProxyFactory.HANDLER_GETTER_TYPE = r0
            r0 = 1
            javassist.util.proxy.ProxyFactory.useCache = r0
            r0 = 1
            javassist.util.proxy.ProxyFactory.useWriteReplace = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = r0
            r1.<init>()
            javassist.util.proxy.ProxyFactory.proxyCache = r0
            r0 = 16
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 48
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 49
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 50
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 51
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 52
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 53
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 54
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 55
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 56
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 57
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 98
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 99
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 100
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 102(0x66, float:1.43E-43)
            r1[r2] = r3
            javassist.util.proxy.ProxyFactory.hexDigits = r0
            javassist.util.proxy.ProxyFactory$1 r0 = new javassist.util.proxy.ProxyFactory$1
            r1 = r0
            r1.<init>()
            javassist.util.proxy.ProxyFactory.classLoaderProvider = r0
            javassist.util.proxy.ProxyFactory$2 r0 = new javassist.util.proxy.ProxyFactory$2
            r1 = r0
            r1.<init>()
            javassist.util.proxy.ProxyFactory.nameGenerator = r0
            javassist.util.proxy.ProxyFactory$3 r0 = new javassist.util.proxy.ProxyFactory$3
            r1 = r0
            r1.<init>()
            javassist.util.proxy.ProxyFactory.sorter = r0
            return
    }
}
