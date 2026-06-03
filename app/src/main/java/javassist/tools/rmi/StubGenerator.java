package javassist.tools.rmi;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/rmi/StubGenerator.class */
public class StubGenerator implements javassist.Translator {
    private static final java.lang.String fieldImporter = "importer";
    private static final java.lang.String fieldObjectId = "objectId";
    private static final java.lang.String accessorObjectId = "_getObjectId";
    private static final java.lang.String sampleClass = "javassist.tools.rmi.Sample";
    private javassist.ClassPool classPool;
    private java.util.Map<java.lang.String, javassist.CtClass> proxyClasses;
    private javassist.CtMethod forwardMethod;
    private javassist.CtMethod forwardStaticMethod;
    private javassist.CtClass[] proxyConstructorParamTypes;
    private javassist.CtClass[] interfacesForProxy;
    private javassist.CtClass[] exceptionForProxy;

    public StubGenerator() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.Hashtable r1 = new java.util.Hashtable
            r2 = r1
            r2.<init>()
            r0.proxyClasses = r1
            return
    }

    @Override // javassist.Translator
    public void start(javassist.ClassPool r8) throws javassist.NotFoundException {
            r7 = this;
            r0 = r7
            r1 = r8
            r0.classPool = r1
            r0 = r8
            java.lang.String r1 = "javassist.tools.rmi.Sample"
            javassist.CtClass r0 = r0.get(r1)
            r9 = r0
            r0 = r7
            r1 = r9
            java.lang.String r2 = "forward"
            javassist.CtMethod r1 = r1.getDeclaredMethod(r2)
            r0.forwardMethod = r1
            r0 = r7
            r1 = r9
            java.lang.String r2 = "forwardStatic"
            javassist.CtMethod r1 = r1.getDeclaredMethod(r2)
            r0.forwardStaticMethod = r1
            r0 = r7
            r1 = r8
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "javassist.tools.rmi.ObjectImporter"
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.String r5 = "int"
            r3[r4] = r5
            javassist.CtClass[] r1 = r1.get(r2)
            r0.proxyConstructorParamTypes = r1
            r0 = r7
            r1 = r8
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "java.io.Serializable"
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.String r5 = "javassist.tools.rmi.Proxy"
            r3[r4] = r5
            javassist.CtClass[] r1 = r1.get(r2)
            r0.interfacesForProxy = r1
            r0 = r7
            r1 = 1
            javassist.CtClass[] r1 = new javassist.CtClass[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            java.lang.String r5 = "javassist.tools.rmi.RemoteException"
            javassist.CtClass r4 = r4.get(r5)
            r2[r3] = r4
            r0.exceptionForProxy = r1
            return
    }

    @Override // javassist.Translator
    public void onLoad(javassist.ClassPool r2, java.lang.String r3) {
            r1 = this;
            return
    }

    public boolean isProxyClass(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.proxyClasses
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public synchronized boolean makeProxyClass(java.lang.Class<?> r5) throws javassist.CannotCompileException, javassist.NotFoundException {
            r4 = this;
            r0 = r5
            java.lang.String r0 = r0.getName()
            r6 = r0
            r0 = r4
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.proxyClasses
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r4
            r1 = r4
            javassist.ClassPool r1 = r1.classPool
            r2 = r6
            javassist.CtClass r1 = r1.get(r2)
            r2 = r5
            javassist.CtClass r0 = r0.produceProxyClass(r1, r2)
            r7 = r0
            r0 = r4
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.proxyClasses
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            r1 = r7
            r0.modifySuperclass(r1)
            r0 = 1
            return r0
    }

    private javassist.CtClass produceProxyClass(javassist.CtClass r7, java.lang.Class<?> r8) throws javassist.CannotCompileException, javassist.NotFoundException {
            r6 = this;
            r0 = r7
            int r0 = r0.getModifiers()
            r9 = r0
            r0 = r9
            boolean r0 = javassist.Modifier.isAbstract(r0)
            if (r0 != 0) goto L1a
            r0 = r9
            boolean r0 = javassist.Modifier.isNative(r0)
            if (r0 != 0) goto L1a
            r0 = r9
            boolean r0 = javassist.Modifier.isPublic(r0)
            if (r0 != 0) goto L38
        L1a:
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r7
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " must be public, non-native, and non-abstract."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L38:
            r0 = r6
            javassist.ClassPool r0 = r0.classPool
            r1 = r7
            java.lang.String r1 = r1.getName()
            r2 = r7
            javassist.CtClass r2 = r2.getSuperclass()
            javassist.CtClass r0 = r0.makeClass(r1, r2)
            r10 = r0
            r0 = r10
            r1 = r6
            javassist.CtClass[] r1 = r1.interfacesForProxy
            r0.setInterfaces(r1)
            javassist.CtField r0 = new javassist.CtField
            r1 = r0
            r2 = r6
            javassist.ClassPool r2 = r2.classPool
            java.lang.String r3 = "javassist.tools.rmi.ObjectImporter"
            javassist.CtClass r2 = r2.get(r3)
            java.lang.String r3 = "importer"
            r4 = r10
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r11
            r1 = 2
            r0.setModifiers(r1)
            r0 = r10
            r1 = r11
            r2 = 0
            javassist.CtField$Initializer r2 = javassist.CtField.Initializer.byParameter(r2)
            r0.addField(r1, r2)
            javassist.CtField r0 = new javassist.CtField
            r1 = r0
            javassist.CtClass r2 = javassist.CtClass.intType
            java.lang.String r3 = "objectId"
            r4 = r10
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r11
            r1 = 2
            r0.setModifiers(r1)
            r0 = r10
            r1 = r11
            r2 = 1
            javassist.CtField$Initializer r2 = javassist.CtField.Initializer.byParameter(r2)
            r0.addField(r1, r2)
            r0 = r10
            java.lang.String r1 = "_getObjectId"
            r2 = r11
            javassist.CtMethod r1 = javassist.CtNewMethod.getter(r1, r2)
            r0.addMethod(r1)
            r0 = r10
            r1 = r10
            javassist.CtConstructor r1 = javassist.CtNewConstructor.defaultConstructor(r1)
            r0.addConstructor(r1)
            r0 = r6
            javassist.CtClass[] r0 = r0.proxyConstructorParamTypes
            r1 = 0
            r2 = r10
            javassist.CtConstructor r0 = javassist.CtNewConstructor.skeleton(r0, r1, r2)
            r12 = r0
            r0 = r10
            r1 = r12
            r0.addConstructor(r1)
            r0 = r6
            r1 = r10
            r2 = r8
            java.lang.reflect.Method[] r2 = r2.getMethods()     // Catch: java.lang.SecurityException -> Ld0
            r0.addMethods(r1, r2)     // Catch: java.lang.SecurityException -> Ld0
            r0 = r10
            return r0
        Ld0:
            r13 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
    }

    private javassist.CtClass toCtClass(java.lang.Class<?> r5) throws javassist.NotFoundException {
            r4 = this;
            r0 = r5
            boolean r0 = r0.isArray()
            if (r0 != 0) goto Lf
            r0 = r5
            java.lang.String r0 = r0.getName()
            r6 = r0
            goto L39
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
        L17:
            r0 = r7
            java.lang.String r1 = "[]"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.Class r0 = r0.getComponentType()
            r5 = r0
            r0 = r5
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L17
            r0 = r7
            r1 = 0
            r2 = r5
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r0 = r0.insert(r1, r2)
            r0 = r7
            java.lang.String r0 = r0.toString()
            r6 = r0
        L39:
            r0 = r4
            javassist.ClassPool r0 = r0.classPool
            r1 = r6
            javassist.CtClass r0 = r0.get(r1)
            return r0
    }

    private javassist.CtClass[] toCtClass(java.lang.Class<?>[] r7) throws javassist.NotFoundException {
            r6 = this;
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = r8
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r9 = r0
            r0 = 0
            r10 = r0
        Lb:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L23
            r0 = r9
            r1 = r10
            r2 = r6
            r3 = r7
            r4 = r10
            r3 = r3[r4]
            javassist.CtClass r2 = r2.toCtClass(r3)
            r0[r1] = r2
            int r10 = r10 + 1
            goto Lb
        L23:
            r0 = r9
            return r0
    }

    private void addMethods(javassist.CtClass r9, java.lang.reflect.Method[] r10) throws javassist.CannotCompileException, javassist.NotFoundException {
            r8 = this;
            r0 = 0
            r12 = r0
        L3:
            r0 = r12
            r1 = r10
            int r1 = r1.length
            if (r0 >= r1) goto L9e
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            int r0 = r0.getModifiers()
            r14 = r0
            r0 = r13
            java.lang.Class r0 = r0.getDeclaringClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L98
            r0 = r14
            boolean r0 = javassist.Modifier.isFinal(r0)
            if (r0 != 0) goto L98
            r0 = r14
            boolean r0 = javassist.Modifier.isPublic(r0)
            if (r0 == 0) goto L7d
            r0 = r14
            boolean r0 = javassist.Modifier.isStatic(r0)
            if (r0 == 0) goto L42
            r0 = r8
            javassist.CtMethod r0 = r0.forwardStaticMethod
            r15 = r0
            goto L48
        L42:
            r0 = r8
            javassist.CtMethod r0 = r0.forwardMethod
            r15 = r0
        L48:
            r0 = r8
            r1 = r13
            java.lang.Class r1 = r1.getReturnType()
            javassist.CtClass r0 = r0.toCtClass(r1)
            r1 = r13
            java.lang.String r1 = r1.getName()
            r2 = r8
            r3 = r13
            java.lang.Class[] r3 = r3.getParameterTypes()
            javassist.CtClass[] r2 = r2.toCtClass(r3)
            r3 = r8
            javassist.CtClass[] r3 = r3.exceptionForProxy
            r4 = r15
            r5 = r12
            javassist.CtMethod$ConstParameter r5 = javassist.CtMethod.ConstParameter.integer(r5)
            r6 = r9
            javassist.CtMethod r0 = javassist.CtNewMethod.wrapped(r0, r1, r2, r3, r4, r5, r6)
            r11 = r0
            r0 = r11
            r1 = r14
            r0.setModifiers(r1)
            r0 = r9
            r1 = r11
            r0.addMethod(r1)
            goto L98
        L7d:
            r0 = r14
            boolean r0 = javassist.Modifier.isProtected(r0)
            if (r0 != 0) goto L98
            r0 = r14
            boolean r0 = javassist.Modifier.isPrivate(r0)
            if (r0 != 0) goto L98
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "the methods must be public, protected, or private."
            r1.<init>(r2)
            throw r0
        L98:
            int r12 = r12 + 1
            goto L3
        L9e:
            return
    }

    private void modifySuperclass(javassist.CtClass r4) throws javassist.CannotCompileException, javassist.NotFoundException {
            r3 = this;
        L0:
            r0 = r4
            javassist.CtClass r0 = r0.getSuperclass()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lc
            goto L23
        Lc:
            r0 = r5
            r1 = 0
            javassist.CtConstructor r0 = r0.getDeclaredConstructor(r1)     // Catch: javassist.NotFoundException -> L15
            goto L23
        L15:
            r6 = move-exception
            r0 = r5
            r1 = r5
            javassist.CtConstructor r1 = javassist.CtNewConstructor.defaultConstructor(r1)
            r0.addConstructor(r1)
            r0 = r5
            r4 = r0
            goto L0
        L23:
            return
    }
}
