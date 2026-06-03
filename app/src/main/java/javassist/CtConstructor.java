package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtConstructor.class */
public final class CtConstructor extends javassist.CtBehavior {
    protected CtConstructor(javassist.bytecode.MethodInfo r5, javassist.CtClass r6) {
            r4 = this;
            r0 = r4
            r1 = r6
            r2 = r5
            r0.<init>(r1, r2)
            return
    }

    public CtConstructor(javassist.CtClass[] r8, javassist.CtClass r9) {
            r7 = this;
            r0 = r7
            r1 = 0
            javassist.bytecode.MethodInfo r1 = (javassist.bytecode.MethodInfo) r1
            r2 = r9
            r0.<init>(r1, r2)
            r0 = r9
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r10 = r0
            r0 = r8
            java.lang.String r0 = javassist.bytecode.Descriptor.ofConstructor(r0)
            r11 = r0
            r0 = r7
            javassist.bytecode.MethodInfo r1 = new javassist.bytecode.MethodInfo
            r2 = r1
            r3 = r10
            java.lang.String r4 = "<init>"
            r5 = r11
            r2.<init>(r3, r4, r5)
            r0.methodInfo = r1
            r0 = r7
            r1 = 1
            r0.setModifiers(r1)
            return
    }

    public CtConstructor(javassist.CtConstructor r6, javassist.CtClass r7, javassist.ClassMap r8) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r1 = 0
            javassist.bytecode.MethodInfo r1 = (javassist.bytecode.MethodInfo) r1
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r5
            r1 = r6
            r2 = 1
            r3 = r8
            r0.copy(r1, r2, r3)
            return
    }

    public boolean isConstructor() {
            r2 = this;
            r0 = r2
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            boolean r0 = r0.isConstructor()
            return r0
    }

    public boolean isClassInitializer() {
            r2 = this;
            r0 = r2
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            boolean r0 = r0.isStaticInitializer()
            return r0
    }

    @Override // javassist.CtBehavior
    public java.lang.String getLongName() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            javassist.CtClass r1 = r1.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            boolean r1 = r1.isConstructor()
            if (r1 == 0) goto L22
            r1 = r3
            java.lang.String r1 = r1.getSignature()
            java.lang.String r1 = javassist.bytecode.Descriptor.toString(r1)
            goto L24
        L22:
            java.lang.String r1 = ".<clinit>()"
        L24:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            boolean r0 = r0.isStaticInitializer()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "<clinit>"
            return r0
        Ld:
            r0 = r2
            javassist.CtClass r0 = r0.declaringClass
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    @Override // javassist.CtBehavior
    public boolean isEmpty() {
            r6 = this;
            r0 = r6
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r7
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r8 = r0
            r0 = r7
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r9 = r0
            r0 = r9
            r1 = r9
            int r1 = r1.next()     // Catch: javassist.bytecode.BadBytecode -> L81
            int r0 = r0.byteAt(r1)     // Catch: javassist.bytecode.BadBytecode -> L81
            r12 = r0
            r0 = r12
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 == r1) goto L7b
            r0 = r12
            r1 = 42
            if (r0 != r1) goto L7f
            r0 = r9
            r1 = r9
            int r1 = r1.next()     // Catch: javassist.bytecode.BadBytecode -> L81
            r2 = r1
            r10 = r2
            int r0 = r0.byteAt(r1)     // Catch: javassist.bytecode.BadBytecode -> L81
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 != r1) goto L7f
            r0 = r8
            r1 = r6
            java.lang.String r1 = r1.getSuperclassName()     // Catch: javassist.bytecode.BadBytecode -> L81
            r2 = r9
            r3 = r10
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)     // Catch: javassist.bytecode.BadBytecode -> L81
            int r0 = r0.isConstructor(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L81
            r1 = r0
            r11 = r1
            if (r0 == 0) goto L7f
            java.lang.String r0 = "()V"
            r1 = r8
            r2 = r11
            java.lang.String r1 = r1.getUtf8Info(r2)     // Catch: javassist.bytecode.BadBytecode -> L81
            boolean r0 = r0.equals(r1)     // Catch: javassist.bytecode.BadBytecode -> L81
            if (r0 == 0) goto L7f
            r0 = r9
            r1 = r9
            int r1 = r1.next()     // Catch: javassist.bytecode.BadBytecode -> L81
            int r0 = r0.byteAt(r1)     // Catch: javassist.bytecode.BadBytecode -> L81
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 != r1) goto L7f
            r0 = r9
            boolean r0 = r0.hasNext()     // Catch: javassist.bytecode.BadBytecode -> L81
            if (r0 != 0) goto L7f
        L7b:
            r0 = 1
            goto L80
        L7f:
            r0 = 0
        L80:
            return r0
        L81:
            r10 = move-exception
            r0 = 0
            return r0
    }

    private java.lang.String getSuperclassName() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.declaringClass
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r3 = r0
            r0 = r3
            java.lang.String r0 = r0.getSuperclass()
            return r0
    }

    public boolean callsSuper() throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2a
            r0 = r5
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r6 = r0
            r0 = r6
            int r0 = r0.skipSuperConstructor()     // Catch: javassist.bytecode.BadBytecode -> L20
            r7 = r0
            r0 = r7
            if (r0 < 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
        L20:
            r7 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L2a:
            r0 = 0
            return r0
    }

    @Override // javassist.CtBehavior
    public void setBody(java.lang.String r4) throws javassist.CannotCompileException {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L14
            r0 = r3
            boolean r0 = r0.isClassInitializer()
            if (r0 == 0) goto L11
            java.lang.String r0 = ";"
            r4 = r0
            goto L14
        L11:
            java.lang.String r0 = "super();"
            r4 = r0
        L14:
            r0 = r3
            r1 = r4
            super.setBody(r1)
            return
    }

    public void setBody(javassist.CtConstructor r7, javassist.ClassMap r8) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r7
            javassist.CtClass r0 = r0.declaringClass
            r1 = r7
            javassist.bytecode.MethodInfo r1 = r1.methodInfo
            r2 = r6
            javassist.CtClass r2 = r2.declaringClass
            r3 = r6
            javassist.bytecode.MethodInfo r3 = r3.methodInfo
            r4 = r8
            setBody0(r0, r1, r2, r3, r4)
            return
    }

    public void insertBeforeBody(java.lang.String r7) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r6
            javassist.CtClass r0 = r0.declaringClass
            r8 = r0
            r0 = r8
            r0.checkModify()
            r0 = r6
            boolean r0 = r0.isClassInitializer()
            if (r0 == 0) goto L1a
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "class initializer"
            r1.<init>(r2)
            throw r0
        L1a:
            r0 = r6
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r9 = r0
            r0 = r9
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r10 = r0
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r6
            javassist.bytecode.MethodInfo r2 = r2.methodInfo
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            r3 = r9
            int r3 = r3.getMaxStack()
            r4 = r9
            int r4 = r4.getMaxLocals()
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r11
            r1 = r9
            int r1 = r1.getMaxStack()
            r0.setStackDepth(r1)
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r11
            r3 = r8
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r12
            r1 = r6
            javassist.CtClass[] r1 = r1.getParameterTypes()     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r2 = 0
            int r0 = r0.recordParams(r1, r2)     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r0 = r12
            r1 = r7
            r0.compileStmnt(r1)     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r0 = r9
            r1 = r11
            int r1 = r1.getMaxStack()     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r0.setMaxStack(r1)     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r0 = r9
            r1 = r11
            int r1 = r1.getMaxLocals()     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r0.setMaxLocals(r1)     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r0 = r10
            int r0 = r0.skipConstructor()     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r0 = r10
            r1 = r11
            byte[] r1 = r1.get()     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            int r0 = r0.insertEx(r1)     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r13 = r0
            r0 = r10
            r1 = r11
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r2 = r13
            r0.insert(r1, r2)     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r0 = r6
            javassist.bytecode.MethodInfo r0 = r0.methodInfo     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r1 = r8
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r2 = r8
            javassist.bytecode.ClassFile r2 = r2.getClassFile2()     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.NotFoundException -> La8 javassist.compiler.CompileError -> Lb4 javassist.bytecode.BadBytecode -> Lc0
            goto Lcc
        La8:
            r13 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        Lb4:
            r13 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        Lc0:
            r13 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        Lcc:
            return
    }

    @Override // javassist.CtBehavior
    int getStartPosOfBody(javassist.bytecode.CodeAttribute r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r5
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r6 = r0
            r0 = r6
            int r0 = r0.skipConstructor()     // Catch: javassist.bytecode.BadBytecode -> Lf
            r0 = r6
            int r0 = r0.next()     // Catch: javassist.bytecode.BadBytecode -> Lf
            return r0
        Lf:
            r7 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtMethod toMethod(java.lang.String r6, javassist.CtClass r7) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            javassist.CtMethod r0 = r0.toMethod(r1, r2, r3)
            return r0
    }

    public javassist.CtMethod toMethod(java.lang.String r6, javassist.CtClass r7, javassist.ClassMap r8) throws javassist.CannotCompileException {
            r5 = this;
            javassist.CtMethod r0 = new javassist.CtMethod
            r1 = r0
            r2 = 0
            r3 = r7
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r9
            r1 = r5
            r2 = 0
            r3 = r8
            r0.copy(r1, r2, r3)
            r0 = r5
            boolean r0 = r0.isConstructor()
            if (r0 == 0) goto L50
            r0 = r9
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r10 = r0
            r0 = r10
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L50
            r0 = r11
            removeConsCall(r0)
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.methodInfo     // Catch: javassist.bytecode.BadBytecode -> L44
            r1 = r7
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.bytecode.BadBytecode -> L44
            r2 = r7
            javassist.bytecode.ClassFile r2 = r2.getClassFile2()     // Catch: javassist.bytecode.BadBytecode -> L44
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L44
            goto L50
        L44:
            r12 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        L50:
            r0 = r9
            r1 = r6
            r0.setName(r1)
            r0 = r9
            return r0
    }

    private static void removeConsCall(javassist.bytecode.CodeAttribute r5) throws javassist.CannotCompileException {
            r0 = r5
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r6 = r0
            r0 = r6
            int r0 = r0.skipConstructor()     // Catch: javassist.bytecode.BadBytecode -> L8b
            r7 = r0
            r0 = r7
            if (r0 < 0) goto L88
            r0 = r6
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)     // Catch: javassist.bytecode.BadBytecode -> L8b
            r8 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.getConstPool()     // Catch: javassist.bytecode.BadBytecode -> L8b
            r1 = r8
            java.lang.String r0 = r0.getMethodrefType(r1)     // Catch: javassist.bytecode.BadBytecode -> L8b
            r9 = r0
            r0 = r9
            int r0 = javassist.bytecode.Descriptor.numOfParameters(r0)     // Catch: javassist.bytecode.BadBytecode -> L8b
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            r0 = r10
            r1 = 3
            if (r0 <= r1) goto L3d
            r0 = r6
            r1 = r7
            r2 = r10
            r3 = 3
            int r2 = r2 - r3
            r3 = 0
            javassist.bytecode.CodeIterator$Gap r0 = r0.insertGapAt(r1, r2, r3)     // Catch: javassist.bytecode.BadBytecode -> L8b
            int r0 = r0.position     // Catch: javassist.bytecode.BadBytecode -> L8b
            r7 = r0
        L3d:
            r0 = r6
            r1 = 87
            r2 = r7
            int r7 = r7 + 1
            r0.writeByte(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L8b
            r0 = r6
            r1 = 0
            r2 = r7
            r0.writeByte(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L8b
            r0 = r6
            r1 = 0
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r0.writeByte(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L8b
            javassist.bytecode.Descriptor$Iterator r0 = new javassist.bytecode.Descriptor$Iterator     // Catch: javassist.bytecode.BadBytecode -> L8b
            r1 = r0
            r2 = r9
            r1.<init>(r2)     // Catch: javassist.bytecode.BadBytecode -> L8b
            r11 = r0
        L60:
            r0 = r11
            int r0 = r0.next()     // Catch: javassist.bytecode.BadBytecode -> L8b
            r0 = r11
            boolean r0 = r0.isParameter()     // Catch: javassist.bytecode.BadBytecode -> L8b
            if (r0 == 0) goto L88
            r0 = r6
            r1 = r11
            boolean r1 = r1.is2byte()     // Catch: javassist.bytecode.BadBytecode -> L8b
            if (r1 == 0) goto L7c
            r1 = 88
            goto L7e
        L7c:
            r1 = 87
        L7e:
            r2 = r7
            int r7 = r7 + 1
            r0.writeByte(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L8b
            goto L60
        L88:
            goto L95
        L8b:
            r7 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L95:
            return
    }
}
