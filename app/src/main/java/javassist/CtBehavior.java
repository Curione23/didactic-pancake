package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtBehavior.class */
public abstract class CtBehavior extends javassist.CtMember {
    protected javassist.bytecode.MethodInfo methodInfo;

    protected CtBehavior(javassist.CtClass r4, javassist.bytecode.MethodInfo r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.methodInfo = r1
            return
    }

    void copy(javassist.CtBehavior r9, boolean r10, javassist.ClassMap r11) throws javassist.CannotCompileException {
            r8 = this;
            r0 = r8
            javassist.CtClass r0 = r0.declaringClass
            r12 = r0
            r0 = r9
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            r13 = r0
            r0 = r9
            javassist.CtClass r0 = r0.getDeclaringClass()
            r14 = r0
            r0 = r12
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r15 = r0
            javassist.ClassMap r0 = new javassist.ClassMap
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            r1 = r14
            java.lang.String r1 = r1.getName()
            r2 = r12
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = r0.put(r1, r2)
            r0 = 0
            r16 = r0
            r0 = r14
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
            r17 = r0
            r0 = r12
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = r17
            if (r0 == 0) goto L82
            r0 = r18
            if (r0 == 0) goto L82
            r0 = r17
            java.lang.String r0 = r0.getName()     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
            r20 = r0
            r0 = r18
            java.lang.String r0 = r0.getName()     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
            r19 = r0
            r0 = r20
            r1 = r19
            boolean r0 = r0.equals(r1)     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
            if (r0 != 0) goto L82
            r0 = r20
            java.lang.String r1 = "java.lang.Object"
            boolean r0 = r0.equals(r1)     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
            if (r0 == 0) goto L7a
            r0 = 1
            r16 = r0
            goto L82
        L7a:
            r0 = r11
            r1 = r20
            r2 = r19
            r0.putIfNone(r1, r2)     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
        L82:
            r0 = r8
            javassist.bytecode.MethodInfo r1 = new javassist.bytecode.MethodInfo     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
            r2 = r1
            r3 = r15
            r4 = r13
            java.lang.String r4 = r4.getName()     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
            r5 = r13
            r6 = r11
            r2.<init>(r3, r4, r5, r6)     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
            r0.methodInfo = r1     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
            r0 = r10
            if (r0 == 0) goto La9
            r0 = r16
            if (r0 == 0) goto La9
            r0 = r8
            javassist.bytecode.MethodInfo r0 = r0.methodInfo     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
            r1 = r19
            r0.setSuperclass(r1)     // Catch: javassist.NotFoundException -> Lac javassist.bytecode.BadBytecode -> Lb8
        La9:
            goto Lc4
        Lac:
            r16 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r16
            r1.<init>(r2)
            throw r0
        Lb8:
            r16 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r16
            r1.<init>(r2)
            throw r0
        Lc4:
            return
    }

    @Override // javassist.CtMember
    protected void extendToString(java.lang.StringBuilder r4) {
            r3 = this;
            r0 = r4
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            javassist.bytecode.MethodInfo r1 = r1.methodInfo
            java.lang.String r1 = r1.getDescriptor()
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    public abstract java.lang.String getLongName();

    public javassist.bytecode.MethodInfo getMethodInfo() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r2
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            return r0
    }

    public javassist.bytecode.MethodInfo getMethodInfo2() {
            r2 = this;
            r0 = r2
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            return r0
    }

    @Override // javassist.CtMember
    public int getModifiers() {
            r2 = this;
            r0 = r2
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            int r0 = r0.getAccessFlags()
            int r0 = javassist.bytecode.AccessFlag.toModifier(r0)
            return r0
    }

    @Override // javassist.CtMember
    public void setModifiers(int r4) {
            r3 = this;
            r0 = r3
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r3
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            r1 = r4
            int r1 = javassist.bytecode.AccessFlag.of(r1)
            r0.setAccessFlags(r1)
            return
    }

    @Override // javassist.CtMember
    public boolean hasAnnotation(java.lang.String r6) {
            r5 = this;
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r9 = r0
            r0 = r6
            r1 = r5
            javassist.CtClass r1 = r1.getDeclaringClass()
            javassist.ClassPool r1 = r1.getClassPool()
            r2 = r8
            r3 = r9
            boolean r0 = javassist.CtClassType.hasAnnotationType(r0, r1, r2, r3)
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.Object getAnnotation(java.lang.Class<?> r6) throws java.lang.ClassNotFoundException {
            r5 = this;
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r9 = r0
            r0 = r6
            r1 = r5
            javassist.CtClass r1 = r1.getDeclaringClass()
            javassist.ClassPool r1 = r1.getClassPool()
            r2 = r8
            r3 = r9
            java.lang.Object r0 = javassist.CtClassType.getAnnotationType(r0, r1, r2, r3)
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.Object[] getAnnotations() throws java.lang.ClassNotFoundException {
            r3 = this;
            r0 = r3
            r1 = 0
            java.lang.Object[] r0 = r0.getAnnotations(r1)
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.Object[] getAvailableAnnotations() {
            r5 = this;
            r0 = r5
            r1 = 1
            java.lang.Object[] r0 = r0.getAnnotations(r1)     // Catch: java.lang.ClassNotFoundException -> L6
            return r0
        L6:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Unexpected exception"
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
    }

    private java.lang.Object[] getAnnotations(boolean r6) throws java.lang.ClassNotFoundException {
            r5 = this;
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r9 = r0
            r0 = r6
            r1 = r5
            javassist.CtClass r1 = r1.getDeclaringClass()
            javassist.ClassPool r1 = r1.getClassPool()
            r2 = r8
            r3 = r9
            java.lang.Object[] r0 = javassist.CtClassType.toAnnotationType(r0, r1, r2, r3)
            return r0
    }

    public java.lang.Object[][] getParameterAnnotations() throws java.lang.ClassNotFoundException {
            r3 = this;
            r0 = r3
            r1 = 0
            java.lang.Object[][] r0 = r0.getParameterAnnotations(r1)
            return r0
    }

    public java.lang.Object[][] getAvailableParameterAnnotations() {
            r5 = this;
            r0 = r5
            r1 = 1
            java.lang.Object[][] r0 = r0.getParameterAnnotations(r1)     // Catch: java.lang.ClassNotFoundException -> L6
            return r0
        L6:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Unexpected exception"
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
    }

    java.lang.Object[][] getParameterAnnotations(boolean r7) throws java.lang.ClassNotFoundException {
            r6 = this;
            r0 = r6
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.ParameterAnnotationsAttribute r0 = (javassist.bytecode.ParameterAnnotationsAttribute) r0
            r9 = r0
            r0 = r8
            java.lang.String r1 = "RuntimeVisibleParameterAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.ParameterAnnotationsAttribute r0 = (javassist.bytecode.ParameterAnnotationsAttribute) r0
            r10 = r0
            r0 = r7
            r1 = r6
            javassist.CtClass r1 = r1.getDeclaringClass()
            javassist.ClassPool r1 = r1.getClassPool()
            r2 = r9
            r3 = r10
            r4 = r8
            java.lang.Object[][] r0 = javassist.CtClassType.toAnnotationType(r0, r1, r2, r3, r4)
            return r0
    }

    public javassist.CtClass[] getParameterTypes() throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            java.lang.String r0 = r0.getDescriptor()
            r1 = r3
            javassist.CtClass r1 = r1.declaringClass
            javassist.ClassPool r1 = r1.getClassPool()
            javassist.CtClass[] r0 = javassist.bytecode.Descriptor.getParameterTypes(r0, r1)
            return r0
    }

    javassist.CtClass getReturnType0() throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            java.lang.String r0 = r0.getDescriptor()
            r1 = r3
            javassist.CtClass r1 = r1.declaringClass
            javassist.ClassPool r1 = r1.getClassPool()
            javassist.CtClass r0 = javassist.bytecode.Descriptor.getReturnType(r0, r1)
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.String getSignature() {
            r2 = this;
            r0 = r2
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            java.lang.String r0 = r0.getDescriptor()
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.String getGenericSignature() {
            r3 = this;
            r0 = r3
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            java.lang.String r1 = "Signature"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.SignatureAttribute r0 = (javassist.bytecode.SignatureAttribute) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L15
            r0 = 0
            goto L19
        L15:
            r0 = r4
            java.lang.String r0 = r0.getSignature()
        L19:
            return r0
    }

    @Override // javassist.CtMember
    public void setGenericSignature(java.lang.String r7) {
            r6 = this;
            r0 = r6
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r6
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.SignatureAttribute r1 = new javassist.bytecode.SignatureAttribute
            r2 = r1
            r3 = r6
            javassist.bytecode.MethodInfo r3 = r3.methodInfo
            javassist.bytecode.ConstPool r3 = r3.getConstPool()
            r4 = r7
            r2.<init>(r3, r4)
            r0.addAttribute(r1)
            return
    }

    public javassist.CtClass[] getExceptionTypes() throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.ExceptionsAttribute r0 = r0.getExceptionsAttribute()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L11
            r0 = 0
            r4 = r0
            goto L16
        L11:
            r0 = r5
            java.lang.String[] r0 = r0.getExceptions()
            r4 = r0
        L16:
            r0 = r3
            javassist.CtClass r0 = r0.declaringClass
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r4
            javassist.CtClass[] r0 = r0.get(r1)
            return r0
    }

    public void setExceptionTypes(javassist.CtClass[] r6) throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r6
            if (r0 == 0) goto L10
            r0 = r6
            int r0 = r0.length
            if (r0 != 0) goto L18
        L10:
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            r0.removeExceptionsAttribute()
            return
        L18:
            r0 = r6
            int r0 = r0.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r7 = r0
            r0 = 0
            r8 = r0
        L20:
            r0 = r8
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L35
            r0 = r7
            r1 = r8
            r2 = r6
            r3 = r8
            r2 = r2[r3]
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            int r8 = r8 + 1
            goto L20
        L35:
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.ExceptionsAttribute r0 = r0.getExceptionsAttribute()
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L58
            javassist.bytecode.ExceptionsAttribute r0 = new javassist.bytecode.ExceptionsAttribute
            r1 = r0
            r2 = r5
            javassist.bytecode.MethodInfo r2 = r2.methodInfo
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            r1.<init>(r2)
            r8 = r0
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            r1 = r8
            r0.setExceptionsAttribute(r1)
        L58:
            r0 = r8
            r1 = r7
            r0.setExceptions(r1)
            return
    }

    public abstract boolean isEmpty();

    public void setBody(java.lang.String r6) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = 0
            r0.setBody(r1, r2, r3)
            return
    }

    public void setBody(java.lang.String r5, java.lang.String r6, java.lang.String r7) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            javassist.CtClass r0 = r0.declaringClass
            r8 = r0
            r0 = r8
            r0.checkModify()
            javassist.compiler.Javac r0 = new javassist.compiler.Javac     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r1 = r0
            r2 = r8
            r1.<init>(r2)     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L21
            r0 = r9
            r1 = r6
            r2 = r7
            r0.recordProceed(r1, r2)     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
        L21:
            r0 = r9
            r1 = r4
            r2 = r5
            javassist.bytecode.Bytecode r0 = r0.compileBody(r1, r2)     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r10 = r0
            r0 = r4
            javassist.bytecode.MethodInfo r0 = r0.methodInfo     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r1 = r10
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r0.setCodeAttribute(r1)     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r0 = r4
            javassist.bytecode.MethodInfo r0 = r0.methodInfo     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r1 = r4
            javassist.bytecode.MethodInfo r1 = r1.methodInfo     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            int r1 = r1.getAccessFlags()     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r2 = -1025(0xfffffffffffffbff, float:NaN)
            r1 = r1 & r2
            r0.setAccessFlags(r1)     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r0 = r4
            javassist.bytecode.MethodInfo r0 = r0.methodInfo     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r1 = r8
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r2 = r8
            javassist.bytecode.ClassFile r2 = r2.getClassFile2()     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r0 = r4
            javassist.CtClass r0 = r0.declaringClass     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            r0.rebuildClassFile()     // Catch: javassist.compiler.CompileError -> L63 javassist.bytecode.BadBytecode -> L6f
            goto L7b
        L63:
            r9 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L6f:
            r9 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L7b:
            return
    }

    static void setBody0(javassist.CtClass r4, javassist.bytecode.MethodInfo r5, javassist.CtClass r6, javassist.bytecode.MethodInfo r7, javassist.ClassMap r8) throws javassist.CannotCompileException {
            r0 = r6
            r0.checkModify()
            javassist.ClassMap r0 = new javassist.ClassMap
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r4
            java.lang.String r1 = r1.getName()
            r2 = r6
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = r0.put(r1, r2)
            r0 = r5
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()     // Catch: javassist.bytecode.CodeAttribute.RuntimeCopyException -> L45
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L42
            r0 = r7
            javassist.bytecode.ConstPool r0 = r0.getConstPool()     // Catch: javassist.bytecode.CodeAttribute.RuntimeCopyException -> L45
            r10 = r0
            r0 = r9
            r1 = r10
            r2 = r8
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)     // Catch: javassist.bytecode.CodeAttribute.RuntimeCopyException -> L45
            javassist.bytecode.CodeAttribute r0 = (javassist.bytecode.CodeAttribute) r0     // Catch: javassist.bytecode.CodeAttribute.RuntimeCopyException -> L45
            r11 = r0
            r0 = r7
            r1 = r11
            r0.setCodeAttribute(r1)     // Catch: javassist.bytecode.CodeAttribute.RuntimeCopyException -> L45
        L42:
            goto L51
        L45:
            r9 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L51:
            r0 = r7
            r1 = r7
            int r1 = r1.getAccessFlags()
            r2 = -1025(0xfffffffffffffbff, float:NaN)
            r1 = r1 & r2
            r0.setAccessFlags(r1)
            r0 = r6
            r0.rebuildClassFile()
            return
    }

    @Override // javassist.CtMember
    public byte[] getAttribute(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            r1 = r4
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r5
            byte[] r0 = r0.get()
            return r0
    }

    @Override // javassist.CtMember
    public void setAttribute(java.lang.String r8, byte[] r9) {
            r7 = this;
            r0 = r7
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.AttributeInfo r1 = new javassist.bytecode.AttributeInfo
            r2 = r1
            r3 = r7
            javassist.bytecode.MethodInfo r3 = r3.methodInfo
            javassist.bytecode.ConstPool r3 = r3.getConstPool()
            r4 = r8
            r5 = r9
            r2.<init>(r3, r4, r5)
            r0.addAttribute(r1)
            return
    }

    public void useCflow(java.lang.String r7) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r6
            javassist.CtClass r0 = r0.declaringClass
            r8 = r0
            r0 = r8
            r0.checkModify()
            r0 = r8
            javassist.ClassPool r0 = r0.getClassPool()
            r9 = r0
            r0 = 0
            r11 = r0
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "_cflow$"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r11
            int r11 = r11 + 1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r8
            r1 = r10
            javassist.CtField r0 = r0.getDeclaredField(r1)     // Catch: javassist.NotFoundException -> L35
            goto L11
        L35:
            r12 = move-exception
            goto L3a
        L3a:
            r0 = r9
            r1 = r7
            r2 = r6
            javassist.CtClass r2 = r2.declaringClass
            java.lang.String r2 = r2.getName()
            r3 = r10
            r0.recordCflow(r1, r2, r3)
            r0 = r9
            java.lang.String r1 = "javassist.runtime.Cflow"
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> Lac
            r12 = r0
            javassist.CtField r0 = new javassist.CtField     // Catch: javassist.NotFoundException -> Lac
            r1 = r0
            r2 = r12
            r3 = r10
            r4 = r8
            r1.<init>(r2, r3, r4)     // Catch: javassist.NotFoundException -> Lac
            r13 = r0
            r0 = r13
            r1 = 9
            r0.setModifiers(r1)     // Catch: javassist.NotFoundException -> Lac
            r0 = r8
            r1 = r13
            r2 = r12
            javassist.CtField$Initializer r2 = javassist.CtField.Initializer.byNew(r2)     // Catch: javassist.NotFoundException -> Lac
            r0.addField(r1, r2)     // Catch: javassist.NotFoundException -> Lac
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: javassist.NotFoundException -> Lac
            r2 = r1
            r2.<init>()     // Catch: javassist.NotFoundException -> Lac
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: javassist.NotFoundException -> Lac
            java.lang.String r2 = ".enter();"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: javassist.NotFoundException -> Lac
            java.lang.String r1 = r1.toString()     // Catch: javassist.NotFoundException -> Lac
            r2 = 0
            r0.insertBefore(r1, r2)     // Catch: javassist.NotFoundException -> Lac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: javassist.NotFoundException -> Lac
            r1 = r0
            r1.<init>()     // Catch: javassist.NotFoundException -> Lac
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> Lac
            java.lang.String r1 = ".exit();"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> Lac
            java.lang.String r0 = r0.toString()     // Catch: javassist.NotFoundException -> Lac
            r14 = r0
            r0 = r6
            r1 = r14
            r2 = 1
            r0.insertAfter(r1, r2)     // Catch: javassist.NotFoundException -> Lac
            goto Lb8
        Lac:
            r12 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        Lb8:
            return
    }

    public void addLocalVariable(java.lang.String r8, javassist.CtClass r9) throws javassist.CannotCompileException {
            r7 = this;
            r0 = r7
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r10 = r0
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L28
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "no method body"
            r1.<init>(r2)
            throw r0
        L28:
            r0 = r11
            java.lang.String r1 = "LocalVariableTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.LocalVariableAttribute r0 = (javassist.bytecode.LocalVariableAttribute) r0
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L51
            javassist.bytecode.LocalVariableAttribute r0 = new javassist.bytecode.LocalVariableAttribute
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r12 = r0
            r0 = r11
            java.util.List r0 = r0.getAttributes()
            r1 = r12
            boolean r0 = r0.add(r1)
        L51:
            r0 = r11
            int r0 = r0.getMaxLocals()
            r13 = r0
            r0 = r9
            java.lang.String r0 = javassist.bytecode.Descriptor.of(r0)
            r14 = r0
            r0 = r12
            r1 = 0
            r2 = r11
            int r2 = r2.getCodeLength()
            r3 = r10
            r4 = r8
            int r3 = r3.addUtf8Info(r4)
            r4 = r10
            r5 = r14
            int r4 = r4.addUtf8Info(r5)
            r5 = r13
            r0.addEntry(r1, r2, r3, r4, r5)
            r0 = r11
            r1 = r13
            r2 = r14
            int r2 = javassist.bytecode.Descriptor.dataSize(r2)
            int r1 = r1 + r2
            r0.setMaxLocals(r1)
            return
    }

    public void insertParameter(javassist.CtClass r6) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            java.lang.String r0 = r0.getDescriptor()
            r7 = r0
            r0 = r6
            r1 = r7
            java.lang.String r0 = javassist.bytecode.Descriptor.insertParameter(r0, r1)
            r8 = r0
            r0 = r5
            r1 = r5
            int r1 = r1.getModifiers()     // Catch: javassist.bytecode.BadBytecode -> L2d
            boolean r1 = javassist.Modifier.isStatic(r1)     // Catch: javassist.bytecode.BadBytecode -> L2d
            if (r1 == 0) goto L24
            r1 = 0
            goto L25
        L24:
            r1 = 1
        L25:
            r2 = r6
            r3 = r7
            r0.addParameter2(r1, r2, r3)     // Catch: javassist.bytecode.BadBytecode -> L2d
            goto L39
        L2d:
            r9 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L39:
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            r1 = r8
            r0.setDescriptor(r1)
            return
    }

    public void addParameter(javassist.CtClass r6) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            java.lang.String r0 = r0.getDescriptor()
            r7 = r0
            r0 = r6
            r1 = r7
            java.lang.String r0 = javassist.bytecode.Descriptor.appendParameter(r0, r1)
            r8 = r0
            r0 = r5
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isStatic(r0)
            if (r0 == 0) goto L23
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            r9 = r0
            r0 = r5
            r1 = r9
            r2 = r7
            int r2 = javassist.bytecode.Descriptor.paramSize(r2)     // Catch: javassist.bytecode.BadBytecode -> L36
            int r1 = r1 + r2
            r2 = r6
            r3 = r7
            r0.addParameter2(r1, r2, r3)     // Catch: javassist.bytecode.BadBytecode -> L36
            goto L42
        L36:
            r10 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
        L42:
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            r1 = r8
            r0.setDescriptor(r1)
            return
    }

    private void addParameter2(int r6, javassist.CtClass r7, java.lang.String r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto Lbd
            r0 = 1
            r10 = r0
            r0 = 76
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r7
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L36
            r0 = r7
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r13 = r0
            r0 = r13
            int r0 = r0.getDataSize()
            r10 = r0
            r0 = r13
            char r0 = r0.getDescriptor()
            r11 = r0
            goto L43
        L36:
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            r12 = r0
        L43:
            r0 = r9
            r1 = r6
            r2 = r10
            r0.insertLocalVar(r1, r2)
            r0 = r9
            java.lang.String r1 = "LocalVariableTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.LocalVariableAttribute r0 = (javassist.bytecode.LocalVariableAttribute) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L65
            r0 = r13
            r1 = r6
            r2 = r10
            r0.shiftIndex(r1, r2)
        L65:
            r0 = r9
            java.lang.String r1 = "LocalVariableTypeTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.LocalVariableTypeAttribute r0 = (javassist.bytecode.LocalVariableTypeAttribute) r0
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L7f
            r0 = r14
            r1 = r6
            r2 = r10
            r0.shiftIndex(r1, r2)
        L7f:
            r0 = r9
            java.lang.String r1 = "StackMapTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.StackMapTable r0 = (javassist.bytecode.StackMapTable) r0
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L9e
            r0 = r15
            r1 = r6
            r2 = r11
            int r2 = javassist.bytecode.StackMapTable.typeTagOf(r2)
            r3 = r12
            r0.insertLocal(r1, r2, r3)
        L9e:
            r0 = r9
            java.lang.String r1 = "StackMap"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.StackMap r0 = (javassist.bytecode.StackMap) r0
            r16 = r0
            r0 = r16
            if (r0 == 0) goto Lbd
            r0 = r16
            r1 = r6
            r2 = r11
            int r2 = javassist.bytecode.StackMapTable.typeTagOf(r2)
            r3 = r12
            r0.insertLocal(r1, r2, r3)
        Lbd:
            return
    }

    public void instrument(javassist.CodeConverter r6) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r7 = r0
            r0 = r6
            r1 = r5
            javassist.CtClass r1 = r1.getDeclaringClass()
            r2 = r5
            javassist.bytecode.MethodInfo r2 = r2.methodInfo
            r3 = r7
            r0.doit(r1, r2, r3)
            return
    }

    public void instrument(javassist.expr.ExprEditor r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            javassist.CtClass r0 = r0.declaringClass
            boolean r0 = r0.isFrozen()
            if (r0 == 0) goto L11
            r0 = r4
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
        L11:
            r0 = r5
            r1 = r4
            javassist.CtClass r1 = r1.declaringClass
            r2 = r4
            javassist.bytecode.MethodInfo r2 = r2.methodInfo
            boolean r0 = r0.doit(r1, r2)
            if (r0 == 0) goto L27
            r0 = r4
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
        L27:
            return
    }

    public void insertBefore(java.lang.String r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            r0.insertBefore(r1, r2)
            return
    }

    private void insertBefore(java.lang.String r5, boolean r6) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            javassist.CtClass r0 = r0.declaringClass
            r7 = r0
            r0 = r7
            r0.checkModify()
            r0 = r4
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L22
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "no method body"
            r1.<init>(r2)
            throw r0
        L22:
            r0 = r8
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r9 = r0
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r4
            javassist.CtClass[] r1 = r1.getParameterTypes()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r2 = r4
            int r2 = r2.getModifiers()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            boolean r2 = javassist.Modifier.isStatic(r2)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            int r0 = r0.recordParams(r1, r2)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = r11
            boolean r0 = r0.recordParamNames(r1, r2)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r0 = r10
            r1 = r8
            r2 = 0
            boolean r0 = r0.recordLocalVariables(r1, r2)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r0 = r10
            r1 = r4
            javassist.CtClass r1 = r1.getReturnType0()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r2 = 0
            int r0 = r0.recordReturnType(r1, r2)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r0 = r10
            r1 = r5
            r0.compileStmnt(r1)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r0 = r10
            javassist.bytecode.Bytecode r0 = r0.getBytecode()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r12 = r0
            r0 = r12
            int r0 = r0.getMaxStack()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r13 = r0
            r0 = r12
            int r0 = r0.getMaxLocals()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r14 = r0
            r0 = r13
            r1 = r8
            int r1 = r1.getMaxStack()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            if (r0 <= r1) goto L8f
            r0 = r8
            r1 = r13
            r0.setMaxStack(r1)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
        L8f:
            r0 = r14
            r1 = r8
            int r1 = r1.getMaxLocals()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            if (r0 <= r1) goto La0
            r0 = r8
            r1 = r14
            r0.setMaxLocals(r1)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
        La0:
            r0 = r9
            r1 = r12
            byte[] r1 = r1.get()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            int r0 = r0.insertEx(r1)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r15 = r0
            r0 = r9
            r1 = r12
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r2 = r15
            r0.insert(r1, r2)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r0 = r6
            if (r0 == 0) goto Lcb
            r0 = r4
            javassist.bytecode.MethodInfo r0 = r0.methodInfo     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r1 = r7
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r2 = r7
            javassist.bytecode.ClassFile r2 = r2.getClassFile2()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda javassist.bytecode.BadBytecode -> Le6
        Lcb:
            goto Lf2
        Lce:
            r11 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
        Lda:
            r11 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
        Le6:
            r11 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
        Lf2:
            return
    }

    public void insertAfter(java.lang.String r6) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = 0
            r0.insertAfter(r1, r2, r3)
            return
    }

    public void insertAfter(java.lang.String r6, boolean r7) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            r0.insertAfter(r1, r2, r3)
            return
    }

    public void insertAfter(java.lang.String r9, boolean r10, boolean r11) throws javassist.CannotCompileException {
            r8 = this;
            r0 = r8
            javassist.CtClass r0 = r0.declaringClass
            r12 = r0
            r0 = r12
            r0.checkModify()
            r0 = r8
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r13 = r0
            r0 = r8
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L2d
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "no method body"
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r14
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r15 = r0
            r0 = r14
            int r0 = r0.getMaxLocals()
            r16 = r0
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r13
            r3 = 0
            r4 = r16
            r5 = 1
            int r4 = r4 + r5
            r1.<init>(r2, r3, r4)
            r17 = r0
            r0 = r17
            r1 = r14
            int r1 = r1.getMaxStack()
            r2 = 1
            int r1 = r1 + r2
            r0.setStackDepth(r1)
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r17
            r3 = r12
            r1.<init>(r2, r3)
            r18 = r0
            r0 = r18
            r1 = r8
            javassist.CtClass[] r1 = r1.getParameterTypes()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r2 = r8
            int r2 = r2.getModifiers()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            boolean r2 = javassist.Modifier.isStatic(r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            int r0 = r0.recordParams(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r19 = r0
            r0 = r18
            r1 = r14
            r2 = r19
            boolean r0 = r0.recordParamNames(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0 = r8
            javassist.CtClass r0 = r0.getReturnType0()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r20 = r0
            r0 = r18
            r1 = r20
            r2 = 1
            int r0 = r0.recordReturnType(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r21 = r0
            r0 = r18
            r1 = r14
            r2 = 0
            boolean r0 = r0.recordLocalVariables(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0 = r8
            r1 = r10
            r2 = r17
            r3 = r20
            r4 = r21
            r5 = r18
            r6 = r9
            int r0 = r0.insertAfterHandler(r1, r2, r3, r4, r5, r6)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r22 = r0
            r0 = r15
            int r0 = r0.getCodeLength()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r23 = r0
            r0 = r10
            if (r0 == 0) goto Lc7
            r0 = r14
            javassist.bytecode.ExceptionTable r0 = r0.getExceptionTable()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r1 = r8
            r2 = r14
            int r1 = r1.getStartPosOfBody(r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r2 = r23
            r3 = r23
            r4 = 0
            r0.add(r1, r2, r3, r4)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
        Lc7:
            r0 = 0
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = 1
            r26 = r0
        Ld0:
            r0 = r15
            boolean r0 = r0.hasNext()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            if (r0 == 0) goto L243
            r0 = r15
            int r0 = r0.next()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r27 = r0
            r0 = r27
            r1 = r23
            if (r0 < r1) goto Le9
            goto L243
        Le9:
            r0 = r15
            r1 = r27
            int r0 = r0.byteAt(r1)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r28 = r0
            r0 = r28
            r1 = 176(0xb0, float:2.47E-43)
            if (r0 == r1) goto L122
            r0 = r28
            r1 = 172(0xac, float:2.41E-43)
            if (r0 == r1) goto L122
            r0 = r28
            r1 = 174(0xae, float:2.44E-43)
            if (r0 == r1) goto L122
            r0 = r28
            r1 = 173(0xad, float:2.42E-43)
            if (r0 == r1) goto L122
            r0 = r28
            r1 = 175(0xaf, float:2.45E-43)
            if (r0 == r1) goto L122
            r0 = r28
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 != r1) goto L240
        L122:
            r0 = r11
            if (r0 == 0) goto L1e3
            r0 = r15
            r1 = r23
            r0.setMark2(r1)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0 = r26
            if (r0 == 0) goto L144
            r0 = 0
            r26 = r0
            r0 = r17
            r29 = r0
            r0 = r18
            r30 = r0
            r0 = r21
            r31 = r0
            goto L19c
        L144:
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r1 = r0
            r2 = r13
            r3 = 0
            r4 = r16
            r5 = 1
            int r4 = r4 + r5
            r1.<init>(r2, r3, r4)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r29 = r0
            r0 = r29
            r1 = r14
            int r1 = r1.getMaxStack()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r2 = 1
            int r1 = r1 + r2
            r0.setStackDepth(r1)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            javassist.compiler.Javac r0 = new javassist.compiler.Javac     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r1 = r0
            r2 = r29
            r3 = r12
            r1.<init>(r2, r3)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r30 = r0
            r0 = r30
            r1 = r8
            javassist.CtClass[] r1 = r1.getParameterTypes()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r2 = r8
            int r2 = r2.getModifiers()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            boolean r2 = javassist.Modifier.isStatic(r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            int r0 = r0.recordParams(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r32 = r0
            r0 = r30
            r1 = r14
            r2 = r32
            boolean r0 = r0.recordParamNames(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0 = r30
            r1 = r20
            r2 = 1
            int r0 = r0.recordReturnType(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r31 = r0
            r0 = r30
            r1 = r14
            r2 = 0
            boolean r0 = r0.recordLocalVariables(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
        L19c:
            r0 = r8
            r1 = r29
            r2 = r30
            r3 = r9
            r4 = r13
            r5 = r20
            r6 = r31
            int r0 = r0.insertAfterAdvice(r1, r2, r3, r4, r5, r6)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r32 = r0
            r0 = r15
            r1 = r29
            byte[] r1 = r1.get()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            int r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r33 = r0
            r0 = r15
            r1 = r29
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r2 = r33
            r0.append(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0 = r15
            int r0 = r0.getCodeLength()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r1 = r32
            int r0 = r0 - r1
            r34 = r0
            r0 = r8
            r1 = r15
            r2 = r34
            r3 = r27
            r0.insertGoto(r1, r2, r3)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0 = r15
            int r0 = r0.getMark2()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r23 = r0
            goto L240
        L1e3:
            r0 = r26
            if (r0 == 0) goto L225
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r9
            r4 = r13
            r5 = r20
            r6 = r21
            int r0 = r0.insertAfterAdvice(r1, r2, r3, r4, r5, r6)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r24 = r0
            r0 = r15
            r1 = r17
            byte[] r1 = r1.get()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            int r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r23 = r0
            r0 = r15
            r1 = r17
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r2 = r23
            r0.append(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0 = r15
            int r0 = r0.getCodeLength()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r1 = r24
            int r0 = r0 - r1
            r25 = r0
            r0 = r25
            r1 = r23
            int r0 = r0 - r1
            r22 = r0
            r0 = 0
            r26 = r0
        L225:
            r0 = r8
            r1 = r15
            r2 = r25
            r3 = r27
            r0.insertGoto(r1, r2, r3)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0 = r15
            int r0 = r0.getCodeLength()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r1 = r24
            int r0 = r0 - r1
            r25 = r0
            r0 = r25
            r1 = r22
            int r0 = r0 - r1
            r23 = r0
        L240:
            goto Ld0
        L243:
            r0 = r26
            if (r0 == 0) goto L260
            r0 = r15
            r1 = r17
            byte[] r1 = r1.get()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            int r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r23 = r0
            r0 = r15
            r1 = r17
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r2 = r23
            r0.append(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
        L260:
            r0 = r14
            r1 = r17
            int r1 = r1.getMaxStack()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0.setMaxStack(r1)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0 = r14
            r1 = r17
            int r1 = r1.getMaxLocals()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0.setMaxLocals(r1)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0 = r8
            javassist.bytecode.MethodInfo r0 = r0.methodInfo     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r1 = r12
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r2 = r12
            javassist.bytecode.ClassFile r2 = r2.getClassFile2()     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.NotFoundException -> L288 javassist.compiler.CompileError -> L294 javassist.bytecode.BadBytecode -> L2a0
            goto L2ac
        L288:
            r19 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r19
            r1.<init>(r2)
            throw r0
        L294:
            r19 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r19
            r1.<init>(r2)
            throw r0
        L2a0:
            r19 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r19
            r1.<init>(r2)
            throw r0
        L2ac:
            return
    }

    private int insertAfterAdvice(javassist.bytecode.Bytecode r5, javassist.compiler.Javac r6, java.lang.String r7, javassist.bytecode.ConstPool r8, javassist.CtClass r9, int r10) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            int r0 = r0.currentPc()
            r11 = r0
            r0 = r9
            javassist.CtClass r1 = javassist.CtClass.voidType
            if (r0 != r1) goto L35
            r0 = r5
            r1 = 1
            r0.addOpcode(r1)
            r0 = r5
            r1 = r10
            r0.addAstore(r1)
            r0 = r6
            r1 = r7
            r0.compileStmnt(r1)
            r0 = r5
            r1 = 177(0xb1, float:2.48E-43)
            r0.addOpcode(r1)
            r0 = r5
            int r0 = r0.getMaxLocals()
            r1 = 1
            if (r0 >= r1) goto L6a
            r0 = r5
            r1 = 1
            r0.setMaxLocals(r1)
            goto L6a
        L35:
            r0 = r5
            r1 = r10
            r2 = r9
            int r0 = r0.addStore(r1, r2)
            r0 = r6
            r1 = r7
            r0.compileStmnt(r1)
            r0 = r5
            r1 = r10
            r2 = r9
            int r0 = r0.addLoad(r1, r2)
            r0 = r9
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L63
            r0 = r5
            r1 = r9
            javassist.CtPrimitiveType r1 = (javassist.CtPrimitiveType) r1
            int r1 = r1.getReturnOp()
            r0.addOpcode(r1)
            goto L6a
        L63:
            r0 = r5
            r1 = 176(0xb0, float:2.47E-43)
            r0.addOpcode(r1)
        L6a:
            r0 = r5
            int r0 = r0.currentPc()
            r1 = r11
            int r0 = r0 - r1
            return r0
    }

    private void insertGoto(javassist.bytecode.CodeIterator r6, int r7, int r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r6
            r1 = r7
            r0.setMark(r1)
            r0 = r6
            r1 = 0
            r2 = r8
            r0.writeByte(r1, r2)
            r0 = r7
            r1 = 2
            int r0 = r0 + r1
            r1 = r8
            int r0 = r0 - r1
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r1) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L26
            r0 = 4
            goto L27
        L26:
            r0 = 2
        L27:
            r10 = r0
            r0 = r6
            r1 = r8
            r2 = r10
            r3 = 0
            javassist.bytecode.CodeIterator$Gap r0 = r0.insertGapAt(r1, r2, r3)
            r11 = r0
            r0 = r11
            int r0 = r0.position
            r1 = r11
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r10
            int r0 = r0 - r1
            r8 = r0
            r0 = r6
            int r0 = r0.getMark()
            r1 = r8
            int r0 = r0 - r1
            r12 = r0
            r0 = r9
            if (r0 == 0) goto L63
            r0 = r6
            r1 = 200(0xc8, float:2.8E-43)
            r2 = r8
            r0.writeByte(r1, r2)
            r0 = r6
            r1 = r12
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            r0.write32bit(r1, r2)
            goto Lbe
        L63:
            r0 = r12
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r0 > r1) goto L7f
            r0 = r6
            r1 = 167(0xa7, float:2.34E-43)
            r2 = r8
            r0.writeByte(r1, r2)
            r0 = r6
            r1 = r12
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            goto Lbe
        L7f:
            r0 = r11
            int r0 = r0.length
            r1 = 4
            if (r0 >= r1) goto La9
            r0 = r6
            r1 = r11
            int r1 = r1.position
            r2 = 2
            r3 = 0
            javassist.bytecode.CodeIterator$Gap r0 = r0.insertGapAt(r1, r2, r3)
            r13 = r0
            r0 = r13
            int r0 = r0.position
            r1 = r13
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r11
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = 4
            int r0 = r0 - r1
            r8 = r0
        La9:
            r0 = r6
            r1 = 200(0xc8, float:2.8E-43)
            r2 = r8
            r0.writeByte(r1, r2)
            r0 = r6
            r1 = r6
            int r1 = r1.getMark()
            r2 = r8
            int r1 = r1 - r2
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            r0.write32bit(r1, r2)
        Lbe:
            return
    }

    private int insertAfterHandler(boolean r5, javassist.bytecode.Bytecode r6, javassist.CtClass r7, int r8, javassist.compiler.Javac r9, java.lang.String r10) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r6
            int r0 = r0.getMaxLocals()
            r11 = r0
            r0 = r6
            r1 = 1
            r0.incMaxLocals(r1)
            r0 = r6
            int r0 = r0.currentPc()
            r12 = r0
            r0 = r6
            r1 = r11
            r0.addAstore(r1)
            r0 = r7
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L8f
            r0 = r7
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            char r0 = r0.getDescriptor()
            r13 = r0
            r0 = r13
            r1 = 68
            if (r0 != r1) goto L42
            r0 = r6
            r1 = 0
            r0.addDconst(r1)
            r0 = r6
            r1 = r8
            r0.addDstore(r1)
            goto L8c
        L42:
            r0 = r13
            r1 = 70
            if (r0 != r1) goto L57
            r0 = r6
            r1 = 0
            r0.addFconst(r1)
            r0 = r6
            r1 = r8
            r0.addFstore(r1)
            goto L8c
        L57:
            r0 = r13
            r1 = 74
            if (r0 != r1) goto L6c
            r0 = r6
            r1 = 0
            r0.addLconst(r1)
            r0 = r6
            r1 = r8
            r0.addLstore(r1)
            goto L8c
        L6c:
            r0 = r13
            r1 = 86
            if (r0 != r1) goto L81
            r0 = r6
            r1 = 1
            r0.addOpcode(r1)
            r0 = r6
            r1 = r8
            r0.addAstore(r1)
            goto L8c
        L81:
            r0 = r6
            r1 = 0
            r0.addIconst(r1)
            r0 = r6
            r1 = r8
            r0.addIstore(r1)
        L8c:
            goto L9a
        L8f:
            r0 = r6
            r1 = 1
            r0.addOpcode(r1)
            r0 = r6
            r1 = r8
            r0.addAstore(r1)
        L9a:
            r0 = r9
            r1 = r10
            r0.compileStmnt(r1)
            r0 = r6
            r1 = r11
            r0.addAload(r1)
            r0 = r6
            r1 = 191(0xbf, float:2.68E-43)
            r0.addOpcode(r1)
            r0 = r6
            int r0 = r0.currentPc()
            r1 = r12
            int r0 = r0 - r1
            return r0
    }

    public void addCatch(java.lang.String r6, javassist.CtClass r7) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r3 = "$e"
            r0.addCatch(r1, r2, r3)
            return
    }

    public void addCatch(java.lang.String r8, javassist.CtClass r9, java.lang.String r10) throws javassist.CannotCompileException {
            r7 = this;
            r0 = r7
            javassist.CtClass r0 = r0.declaringClass
            r11 = r0
            r0 = r11
            r0.checkModify()
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r12 = r0
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r13 = r0
            r0 = r13
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r14 = r0
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r12
            r3 = r13
            int r3 = r3.getMaxStack()
            r4 = r13
            int r4 = r4.getMaxLocals()
            r1.<init>(r2, r3, r4)
            r15 = r0
            r0 = r15
            r1 = 1
            r0.setStackDepth(r1)
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r15
            r3 = r11
            r1.<init>(r2, r3)
            r16 = r0
            r0 = r16
            r1 = r7
            javassist.CtClass[] r1 = r1.getParameterTypes()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r2 = r7
            int r2 = r2.getModifiers()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            boolean r2 = javassist.Modifier.isStatic(r2)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            int r0 = r0.recordParams(r1, r2)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r0 = r16
            r1 = r9
            r2 = r10
            int r0 = r0.recordVariable(r1, r2)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r17 = r0
            r0 = r15
            r1 = r17
            r0.addAstore(r1)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r0 = r16
            r1 = r8
            r0.compileStmnt(r1)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r0 = r15
            int r0 = r0.getMaxStack()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r18 = r0
            r0 = r15
            int r0 = r0.getMaxLocals()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r19 = r0
            r0 = r18
            r1 = r13
            int r1 = r1.getMaxStack()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            if (r0 <= r1) goto L92
            r0 = r13
            r1 = r18
            r0.setMaxStack(r1)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
        L92:
            r0 = r19
            r1 = r13
            int r1 = r1.getMaxLocals()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            if (r0 <= r1) goto La3
            r0 = r13
            r1 = r19
            r0.setMaxLocals(r1)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
        La3:
            r0 = r14
            int r0 = r0.getCodeLength()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r20 = r0
            r0 = r14
            r1 = r15
            byte[] r1 = r1.get()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            int r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r21 = r0
            r0 = r13
            javassist.bytecode.ExceptionTable r0 = r0.getExceptionTable()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r1 = r7
            r2 = r13
            int r1 = r1.getStartPosOfBody(r2)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r2 = r20
            r3 = r20
            r4 = r12
            r5 = r9
            int r4 = r4.addClassInfo(r5)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r0.add(r1, r2, r3, r4)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r0 = r14
            r1 = r15
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r2 = r21
            r0.append(r1, r2)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.methodInfo     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r1 = r11
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r2 = r11
            javassist.bytecode.ClassFile r2 = r2.getClassFile2()     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.NotFoundException -> Lee javassist.compiler.CompileError -> Lfa javassist.bytecode.BadBytecode -> L106
            goto L112
        Lee:
            r17 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r17
            r1.<init>(r2)
            throw r0
        Lfa:
            r17 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r17
            r1.<init>(r2)
            throw r0
        L106:
            r17 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r17
            r1.<init>(r2)
            throw r0
        L112:
            return
    }

    int getStartPosOfBody(javassist.bytecode.CodeAttribute r3) throws javassist.CannotCompileException {
            r2 = this;
            r0 = 0
            return r0
    }

    public int insertAt(int r6, java.lang.String r7) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 1
            r3 = r7
            int r0 = r0.insertAt(r1, r2, r3)
            return r0
    }

    public int insertAt(int r5, boolean r6, java.lang.String r7) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L19
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "no method body"
            r1.<init>(r2)
            throw r0
        L19:
            r0 = r8
            java.lang.String r1 = "LineNumberTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.LineNumberAttribute r0 = (javassist.bytecode.LineNumberAttribute) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L36
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "no line number info"
            r1.<init>(r2)
            throw r0
        L36:
            r0 = r9
            r1 = r5
            javassist.bytecode.LineNumberAttribute$Pc r0 = r0.toNearPc(r1)
            r10 = r0
            r0 = r10
            int r0 = r0.line
            r5 = r0
            r0 = r10
            int r0 = r0.index
            r11 = r0
            r0 = r6
            if (r0 != 0) goto L51
            r0 = r5
            return r0
        L51:
            r0 = r4
            javassist.CtClass r0 = r0.declaringClass
            r12 = r0
            r0 = r12
            r0.checkModify()
            r0 = r8
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r13 = r0
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            r14 = r0
            r0 = r14
            r1 = r8
            r2 = r11
            boolean r0 = r0.recordLocalVariables(r1, r2)     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r0 = r14
            r1 = r4
            javassist.CtClass[] r1 = r1.getParameterTypes()     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r2 = r4
            int r2 = r2.getModifiers()     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            boolean r2 = javassist.Modifier.isStatic(r2)     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            int r0 = r0.recordParams(r1, r2)     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r0 = r14
            r1 = r8
            int r1 = r1.getMaxLocals()     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r0.setMaxLocals(r1)     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r0 = r14
            r1 = r7
            r0.compileStmnt(r1)     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r0 = r14
            javassist.bytecode.Bytecode r0 = r0.getBytecode()     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r15 = r0
            r0 = r15
            int r0 = r0.getMaxLocals()     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r16 = r0
            r0 = r15
            int r0 = r0.getMaxStack()     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r17 = r0
            r0 = r8
            r1 = r16
            r0.setMaxLocals(r1)     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r0 = r17
            r1 = r8
            int r1 = r1.getMaxStack()     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            if (r0 <= r1) goto Lc6
            r0 = r8
            r1 = r17
            r0.setMaxStack(r1)     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
        Lc6:
            r0 = r13
            r1 = r11
            r2 = r15
            byte[] r2 = r2.get()     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            int r0 = r0.insertAt(r1, r2)     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r11 = r0
            r0 = r13
            r1 = r15
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r2 = r11
            r0.insert(r1, r2)     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r0 = r4
            javassist.bytecode.MethodInfo r0 = r0.methodInfo     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r1 = r12
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r2 = r12
            javassist.bytecode.ClassFile r2 = r2.getClassFile2()     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.NotFoundException -> Lf3 javassist.compiler.CompileError -> Lff javassist.bytecode.BadBytecode -> L10b
            r0 = r5
            return r0
        Lf3:
            r15 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            throw r0
        Lff:
            r15 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            throw r0
        L10b:
            r15 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            throw r0
    }
}
