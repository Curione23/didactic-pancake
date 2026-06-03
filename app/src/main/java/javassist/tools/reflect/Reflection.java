package javassist.tools.reflect;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/reflect/Reflection.class */
public class Reflection implements javassist.Translator {
    static final java.lang.String classobjectField = "_classobject";
    static final java.lang.String classobjectAccessor = "_getClass";
    static final java.lang.String metaobjectField = "_metaobject";
    static final java.lang.String metaobjectGetter = "_getMetaobject";
    static final java.lang.String metaobjectSetter = "_setMetaobject";
    static final java.lang.String readPrefix = "_r_";
    static final java.lang.String writePrefix = "_w_";
    static final java.lang.String metaobjectClassName = "javassist.tools.reflect.Metaobject";
    static final java.lang.String classMetaobjectClassName = "javassist.tools.reflect.ClassMetaobject";
    protected javassist.CtMethod trapMethod;
    protected javassist.CtMethod trapStaticMethod;
    protected javassist.CtMethod trapRead;
    protected javassist.CtMethod trapWrite;
    protected javassist.CtClass[] readParam;
    protected javassist.ClassPool classPool;
    protected javassist.CodeConverter converter;

    private boolean isExcluded(java.lang.String r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "_m_"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L36
            r0 = r4
            java.lang.String r1 = "_getClass"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            r0 = r4
            java.lang.String r1 = "_setMetaobject"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            r0 = r4
            java.lang.String r1 = "_getMetaobject"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            r0 = r4
            java.lang.String r1 = "_r_"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L36
            r0 = r4
            java.lang.String r1 = "_w_"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L3a
        L36:
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            return r0
    }

    public Reflection() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 0
            r0.classPool = r1
            r0 = r4
            javassist.CodeConverter r1 = new javassist.CodeConverter
            r2 = r1
            r2.<init>()
            r0.converter = r1
            return
    }

    @Override // javassist.Translator
    public void start(javassist.ClassPool r8) throws javassist.NotFoundException {
            r7 = this;
            r0 = r7
            r1 = r8
            r0.classPool = r1
            java.lang.String r0 = "javassist.tools.reflect.Sample is not found or broken."
            r9 = r0
            r0 = r7
            javassist.ClassPool r0 = r0.classPool     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            java.lang.String r1 = "javassist.tools.reflect.Sample"
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r10 = r0
            r0 = r7
            r1 = r10
            javassist.bytecode.ClassFile r1 = r1.getClassFile()     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r0.rebuildClassFile(r1)     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r0 = r7
            r1 = r10
            java.lang.String r2 = "trap"
            javassist.CtMethod r1 = r1.getDeclaredMethod(r2)     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r0.trapMethod = r1     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r0 = r7
            r1 = r10
            java.lang.String r2 = "trapStatic"
            javassist.CtMethod r1 = r1.getDeclaredMethod(r2)     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r0.trapStaticMethod = r1     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r0 = r7
            r1 = r10
            java.lang.String r2 = "trapRead"
            javassist.CtMethod r1 = r1.getDeclaredMethod(r2)     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r0.trapRead = r1     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r0 = r7
            r1 = r10
            java.lang.String r2 = "trapWrite"
            javassist.CtMethod r1 = r1.getDeclaredMethod(r2)     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r0.trapWrite = r1     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r0 = r7
            r1 = 1
            javassist.CtClass[] r1 = new javassist.CtClass[r1]     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r2 = r1
            r3 = 0
            r4 = r7
            javassist.ClassPool r4 = r4.classPool     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            java.lang.String r5 = "java.lang.Object"
            javassist.CtClass r4 = r4.get(r5)     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r2[r3] = r4     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            r0.readParam = r1     // Catch: javassist.NotFoundException -> L59 javassist.bytecode.BadBytecode -> L64
            goto L6f
        L59:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "javassist.tools.reflect.Sample is not found or broken."
            r1.<init>(r2)
            throw r0
        L64:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "javassist.tools.reflect.Sample is not found or broken."
            r1.<init>(r2)
            throw r0
        L6f:
            return
    }

    @Override // javassist.Translator
    public void onLoad(javassist.ClassPool r4, java.lang.String r5) throws javassist.CannotCompileException, javassist.NotFoundException {
            r3 = this;
            r0 = r4
            r1 = r5
            javassist.CtClass r0 = r0.get(r1)
            r6 = r0
            r0 = r6
            r1 = r3
            javassist.CodeConverter r1 = r1.converter
            r0.instrument(r1)
            return
    }

    public boolean makeReflective(java.lang.String r7, java.lang.String r8, java.lang.String r9) throws javassist.CannotCompileException, javassist.NotFoundException {
            r6 = this;
            r0 = r6
            r1 = r6
            javassist.ClassPool r1 = r1.classPool
            r2 = r7
            javassist.CtClass r1 = r1.get(r2)
            r2 = r6
            javassist.ClassPool r2 = r2.classPool
            r3 = r8
            javassist.CtClass r2 = r2.get(r3)
            r3 = r6
            javassist.ClassPool r3 = r3.classPool
            r4 = r9
            javassist.CtClass r3 = r3.get(r4)
            boolean r0 = r0.makeReflective(r1, r2, r3)
            return r0
    }

    public boolean makeReflective(java.lang.Class<?> r6, java.lang.Class<?> r7, java.lang.Class<?> r8) throws javassist.CannotCompileException, javassist.NotFoundException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.getName()
            r2 = r7
            java.lang.String r2 = r2.getName()
            r3 = r8
            java.lang.String r3 = r3.getName()
            boolean r0 = r0.makeReflective(r1, r2, r3)
            return r0
    }

    public boolean makeReflective(javassist.CtClass r6, javassist.CtClass r7, javassist.CtClass r8) throws javassist.CannotCompileException, javassist.tools.reflect.CannotReflectException, javassist.NotFoundException {
            r5 = this;
            r0 = r6
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L25
            javassist.tools.reflect.CannotReflectException r0 = new javassist.tools.reflect.CannotReflectException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Cannot reflect an interface: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L25:
            r0 = r6
            r1 = r5
            javassist.ClassPool r1 = r1.classPool
            java.lang.String r2 = "javassist.tools.reflect.ClassMetaobject"
            javassist.CtClass r1 = r1.get(r2)
            boolean r0 = r0.subclassOf(r1)
            if (r0 == 0) goto L53
            javassist.tools.reflect.CannotReflectException r0 = new javassist.tools.reflect.CannotReflectException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Cannot reflect a subclass of ClassMetaobject: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L53:
            r0 = r6
            r1 = r5
            javassist.ClassPool r1 = r1.classPool
            java.lang.String r2 = "javassist.tools.reflect.Metaobject"
            javassist.CtClass r1 = r1.get(r2)
            boolean r0 = r0.subclassOf(r1)
            if (r0 == 0) goto L81
            javassist.tools.reflect.CannotReflectException r0 = new javassist.tools.reflect.CannotReflectException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Cannot reflect a subclass of Metaobject: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L81:
            r0 = r5
            r1 = r6
            r0.registerReflectiveClass(r1)
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            boolean r0 = r0.modifyClassfile(r1, r2, r3)
            return r0
    }

    private void registerReflectiveClass(javassist.CtClass r7) {
            r6 = this;
            r0 = r7
            javassist.CtField[] r0 = r0.getDeclaredFields()
            r8 = r0
            r0 = 0
            r9 = r0
        L7:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L71
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            int r0 = r0.getModifiers()
            r11 = r0
            r0 = r11
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L6b
            r0 = r11
            r1 = 16
            r0 = r0 & r1
            if (r0 != 0) goto L6b
            r0 = r10
            java.lang.String r0 = r0.getName()
            r12 = r0
            r0 = r6
            javassist.CodeConverter r0 = r0.converter
            r1 = r10
            r2 = r7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            java.lang.String r4 = "_r_"
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r12
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.replaceFieldRead(r1, r2, r3)
            r0 = r6
            javassist.CodeConverter r0 = r0.converter
            r1 = r10
            r2 = r7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            java.lang.String r4 = "_w_"
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r12
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.replaceFieldWrite(r1, r2, r3)
        L6b:
            int r9 = r9 + 1
            goto L7
        L71:
            return
    }

    private boolean modifyClassfile(javassist.CtClass r9, javassist.CtClass r10, javassist.CtClass r11) throws javassist.CannotCompileException, javassist.NotFoundException {
            r8 = this;
            r0 = r9
            java.lang.String r1 = "Reflective"
            byte[] r0 = r0.getAttribute(r1)
            if (r0 == 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r9
            java.lang.String r1 = "Reflective"
            r2 = 0
            byte[] r2 = new byte[r2]
            r0.setAttribute(r1, r2)
            r0 = r8
            javassist.ClassPool r0 = r0.classPool
            java.lang.String r1 = "javassist.tools.reflect.Metalevel"
            javassist.CtClass r0 = r0.get(r1)
            r12 = r0
            r0 = r9
            r1 = r12
            boolean r0 = r0.subtypeOf(r1)
            if (r0 != 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L3a
            r0 = r9
            r1 = r12
            r0.addInterface(r1)
        L3a:
            r0 = r8
            r1 = r9
            r2 = r13
            r0.processMethods(r1, r2)
            r0 = r8
            r1 = r9
            r0.processFields(r1)
            r0 = r13
            if (r0 == 0) goto L86
            javassist.CtField r0 = new javassist.CtField
            r1 = r0
            r2 = r8
            javassist.ClassPool r2 = r2.classPool
            java.lang.String r3 = "javassist.tools.reflect.Metaobject"
            javassist.CtClass r2 = r2.get(r3)
            java.lang.String r3 = "_metaobject"
            r4 = r9
            r1.<init>(r2, r3, r4)
            r14 = r0
            r0 = r14
            r1 = 4
            r0.setModifiers(r1)
            r0 = r9
            r1 = r14
            r2 = r10
            javassist.CtField$Initializer r2 = javassist.CtField.Initializer.byNewWithParams(r2)
            r0.addField(r1, r2)
            r0 = r9
            java.lang.String r1 = "_getMetaobject"
            r2 = r14
            javassist.CtMethod r1 = javassist.CtNewMethod.getter(r1, r2)
            r0.addMethod(r1)
            r0 = r9
            java.lang.String r1 = "_setMetaobject"
            r2 = r14
            javassist.CtMethod r1 = javassist.CtNewMethod.setter(r1, r2)
            r0.addMethod(r1)
        L86:
            javassist.CtField r0 = new javassist.CtField
            r1 = r0
            r2 = r8
            javassist.ClassPool r2 = r2.classPool
            java.lang.String r3 = "javassist.tools.reflect.ClassMetaobject"
            javassist.CtClass r2 = r2.get(r3)
            java.lang.String r3 = "_classobject"
            r4 = r9
            r1.<init>(r2, r3, r4)
            r14 = r0
            r0 = r14
            r1 = 10
            r0.setModifiers(r1)
            r0 = r9
            r1 = r14
            r2 = r11
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            r6 = r9
            java.lang.String r6 = r6.getName()
            r4[r5] = r6
            javassist.CtField$Initializer r2 = javassist.CtField.Initializer.byNew(r2, r3)
            r0.addField(r1, r2)
            r0 = r9
            java.lang.String r1 = "_getClass"
            r2 = r14
            javassist.CtMethod r1 = javassist.CtNewMethod.getter(r1, r2)
            r0.addMethod(r1)
            r0 = 1
            return r0
    }

    private void processMethods(javassist.CtClass r8, boolean r9) throws javassist.CannotCompileException, javassist.NotFoundException {
            r7 = this;
            r0 = r8
            javassist.CtMethod[] r0 = r0.getMethods()
            r10 = r0
            r0 = 0
            r11 = r0
        L8:
            r0 = r11
            r1 = r10
            int r1 = r1.length
            if (r0 >= r1) goto L3e
            r0 = r10
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            int r0 = r0.getModifiers()
            r13 = r0
            r0 = r13
            boolean r0 = javassist.Modifier.isPublic(r0)
            if (r0 == 0) goto L38
            r0 = r13
            boolean r0 = javassist.Modifier.isAbstract(r0)
            if (r0 != 0) goto L38
            r0 = r7
            r1 = r13
            r2 = r8
            r3 = r12
            r4 = r11
            r5 = r9
            r0.processMethods0(r1, r2, r3, r4, r5)
        L38:
            int r11 = r11 + 1
            goto L8
        L3e:
            return
    }

    private void processMethods0(int r9, javassist.CtClass r10, javassist.CtMethod r11, int r12, boolean r13) throws javassist.CannotCompileException, javassist.NotFoundException {
            r8 = this;
            r0 = r11
            java.lang.String r0 = r0.getName()
            r15 = r0
            r0 = r8
            r1 = r15
            boolean r0 = r0.isExcluded(r1)
            if (r0 == 0) goto L10
            return
        L10:
            r0 = r11
            javassist.CtClass r0 = r0.getDeclaringClass()
            r1 = r10
            if (r0 != r1) goto L38
            r0 = r9
            boolean r0 = javassist.Modifier.isNative(r0)
            if (r0 == 0) goto L20
            return
        L20:
            r0 = r11
            r16 = r0
            r0 = r9
            boolean r0 = javassist.Modifier.isFinal(r0)
            if (r0 == 0) goto L5f
            r0 = r9
            r1 = -17
            r0 = r0 & r1
            r9 = r0
            r0 = r16
            r1 = r9
            r0.setModifiers(r1)
            goto L5f
        L38:
            r0 = r9
            boolean r0 = javassist.Modifier.isFinal(r0)
            if (r0 == 0) goto L40
            return
        L40:
            r0 = r9
            r1 = -257(0xfffffffffffffeff, float:NaN)
            r0 = r0 & r1
            r9 = r0
            r0 = r8
            r1 = r11
            r2 = r13
            javassist.CtMethod r0 = r0.findOriginal(r1, r2)
            r1 = r10
            javassist.CtMethod r0 = javassist.CtNewMethod.delegator(r0, r1)
            r16 = r0
            r0 = r16
            r1 = r9
            r0.setModifiers(r1)
            r0 = r10
            r1 = r16
            r0.addMethod(r1)
        L5f:
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "_m_"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "_"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r15
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setName(r1)
            r0 = r9
            boolean r0 = javassist.Modifier.isStatic(r0)
            if (r0 == 0) goto L93
            r0 = r8
            javassist.CtMethod r0 = r0.trapStaticMethod
            r14 = r0
            goto L99
        L93:
            r0 = r8
            javassist.CtMethod r0 = r0.trapMethod
            r14 = r0
        L99:
            r0 = r11
            javassist.CtClass r0 = r0.getReturnType()
            r1 = r15
            r2 = r11
            javassist.CtClass[] r2 = r2.getParameterTypes()
            r3 = r11
            javassist.CtClass[] r3 = r3.getExceptionTypes()
            r4 = r14
            r5 = r12
            javassist.CtMethod$ConstParameter r5 = javassist.CtMethod.ConstParameter.integer(r5)
            r6 = r10
            javassist.CtMethod r0 = javassist.CtNewMethod.wrapped(r0, r1, r2, r3, r4, r5, r6)
            r17 = r0
            r0 = r17
            r1 = r9
            r0.setModifiers(r1)
            r0 = r10
            r1 = r17
            r0.addMethod(r1)
            return
    }

    private javassist.CtMethod findOriginal(javassist.CtMethod r4, boolean r5) throws javassist.NotFoundException {
            r3 = this;
            r0 = r5
            if (r0 == 0) goto L6
            r0 = r4
            return r0
        L6:
            r0 = r4
            java.lang.String r0 = r0.getName()
            r6 = r0
            r0 = r4
            javassist.CtClass r0 = r0.getDeclaringClass()
            javassist.CtMethod[] r0 = r0.getDeclaredMethods()
            r7 = r0
            r0 = 0
            r8 = r0
        L17:
            r0 = r8
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L5a
            r0 = r7
            r1 = r8
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r9
            r1 = r6
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L54
            r0 = r9
            java.lang.String r1 = "_m_"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L54
            r0 = r7
            r1 = r8
            r0 = r0[r1]
            java.lang.String r0 = r0.getSignature()
            r1 = r4
            java.lang.String r1 = r1.getSignature()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            r0 = r7
            r1 = r8
            r0 = r0[r1]
            return r0
        L54:
            int r8 = r8 + 1
            goto L17
        L5a:
            r0 = r4
            return r0
    }

    private void processFields(javassist.CtClass r9) throws javassist.CannotCompileException, javassist.NotFoundException {
            r8 = this;
            r0 = r9
            javassist.CtField[] r0 = r0.getDeclaredFields()
            r10 = r0
            r0 = 0
            r11 = r0
        L7:
            r0 = r11
            r1 = r10
            int r1 = r1.length
            if (r0 >= r1) goto Lc9
            r0 = r10
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            int r0 = r0.getModifiers()
            r13 = r0
            r0 = r13
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto Lc3
            r0 = r13
            r1 = 16
            r0 = r0 & r1
            if (r0 != 0) goto Lc3
            r0 = r13
            r1 = 8
            r0 = r0 | r1
            r13 = r0
            r0 = r12
            java.lang.String r0 = r0.getName()
            r14 = r0
            r0 = r12
            javassist.CtClass r0 = r0.getType()
            r15 = r0
            r0 = r15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "_r_"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r14
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r8
            javassist.CtClass[] r2 = r2.readParam
            r3 = 0
            r4 = r8
            javassist.CtMethod r4 = r4.trapRead
            r5 = r14
            javassist.CtMethod$ConstParameter r5 = javassist.CtMethod.ConstParameter.string(r5)
            r6 = r9
            javassist.CtMethod r0 = javassist.CtNewMethod.wrapped(r0, r1, r2, r3, r4, r5, r6)
            r16 = r0
            r0 = r16
            r1 = r13
            r0.setModifiers(r1)
            r0 = r9
            r1 = r16
            r0.addMethod(r1)
            r0 = 2
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r17 = r0
            r0 = r17
            r1 = 0
            r2 = r8
            javassist.ClassPool r2 = r2.classPool
            java.lang.String r3 = "java.lang.Object"
            javassist.CtClass r2 = r2.get(r3)
            r0[r1] = r2
            r0 = r17
            r1 = 1
            r2 = r15
            r0[r1] = r2
            javassist.CtClass r0 = javassist.CtClass.voidType
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "_w_"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r14
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r17
            r3 = 0
            r4 = r8
            javassist.CtMethod r4 = r4.trapWrite
            r5 = r14
            javassist.CtMethod$ConstParameter r5 = javassist.CtMethod.ConstParameter.string(r5)
            r6 = r9
            javassist.CtMethod r0 = javassist.CtNewMethod.wrapped(r0, r1, r2, r3, r4, r5, r6)
            r16 = r0
            r0 = r16
            r1 = r13
            r0.setModifiers(r1)
            r0 = r9
            r1 = r16
            r0.addMethod(r1)
        Lc3:
            int r11 = r11 + 1
            goto L7
        Lc9:
            return
    }

    public void rebuildClassFile(javassist.bytecode.ClassFile r4) throws javassist.bytecode.BadBytecode {
            r3 = this;
            int r0 = javassist.bytecode.ClassFile.MAJOR_VERSION
            r1 = 50
            if (r0 >= r1) goto L9
            return
        L9:
            r0 = r4
            java.util.List r0 = r0.getMethods()
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L13:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L31
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r6 = r0
            r0 = r6
            r1 = r3
            javassist.ClassPool r1 = r1.classPool
            r0.rebuildStackMap(r1)
            goto L13
        L31:
            return
    }
}
