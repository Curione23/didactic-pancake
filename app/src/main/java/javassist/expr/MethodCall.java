package javassist.expr;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/MethodCall.class */
public class MethodCall extends javassist.expr.Expr {
    protected MethodCall(int r7, javassist.bytecode.CodeIterator r8, javassist.CtClass r9, javassist.bytecode.MethodInfo r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private int getNameAndType(javassist.bytecode.ConstPool r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.currentPos
            r6 = r0
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r6
            int r0 = r0.byteAt(r1)
            r7 = r0
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r8 = r0
            r0 = r7
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 != r1) goto L28
            r0 = r5
            r1 = r8
            int r0 = r0.getInterfaceMethodrefNameAndType(r1)
            return r0
        L28:
            r0 = r5
            r1 = r8
            int r0 = r0.getMethodrefNameAndType(r1)
            return r0
    }

    @Override // javassist.expr.Expr
    public javassist.CtBehavior where() {
            r2 = this;
            r0 = r2
            javassist.CtBehavior r0 = super.where()
            return r0
    }

    @Override // javassist.expr.Expr
    public int getLineNumber() {
            r2 = this;
            r0 = r2
            int r0 = super.getLineNumber()
            return r0
    }

    @Override // javassist.expr.Expr
    public java.lang.String getFileName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = super.getFileName()
            return r0
    }

    protected javassist.CtClass getCtClass() throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.CtClass r0 = r0.thisClass
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r3
            java.lang.String r1 = r1.getClassName()
            javassist.CtClass r0 = r0.get(r1)
            return r0
    }

    public java.lang.String getClassName() {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r6 = r0
            r0 = r4
            int r0 = r0.currentPos
            r7 = r0
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r7
            int r0 = r0.byteAt(r1)
            r8 = r0
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r9 = r0
            r0 = r8
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 != r1) goto L32
            r0 = r6
            r1 = r9
            java.lang.String r0 = r0.getInterfaceMethodrefClassName(r1)
            r5 = r0
            goto L39
        L32:
            r0 = r6
            r1 = r9
            java.lang.String r0 = r0.getMethodrefClassName(r1)
            r5 = r0
        L39:
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L48
            r0 = r5
            java.lang.String r0 = javassist.bytecode.Descriptor.toClassName(r0)
            r5 = r0
        L48:
            r0 = r5
            return r0
    }

    public java.lang.String getMethodName() {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r5 = r0
            r0 = r4
            r1 = r5
            int r0 = r0.getNameAndType(r1)
            r6 = r0
            r0 = r5
            r1 = r5
            r2 = r6
            int r1 = r1.getNameAndTypeName(r2)
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public javassist.CtMethod getMethod() throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            javassist.CtClass r0 = r0.getCtClass()
            r1 = r4
            java.lang.String r1 = r1.getMethodName()
            r2 = r4
            java.lang.String r2 = r2.getSignature()
            javassist.CtMethod r0 = r0.getMethod(r1, r2)
            return r0
    }

    public java.lang.String getSignature() {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r5 = r0
            r0 = r4
            r1 = r5
            int r0 = r0.getNameAndType(r1)
            r6 = r0
            r0 = r5
            r1 = r5
            r2 = r6
            int r1 = r1.getNameAndTypeDescriptor(r2)
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    @Override // javassist.expr.Expr
    public javassist.CtClass[] mayThrow() {
            r2 = this;
            r0 = r2
            javassist.CtClass[] r0 = super.mayThrow()
            return r0
    }

    public boolean isSuper() {
            r3 = this;
            r0 = r3
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r3
            int r1 = r1.currentPos
            int r0 = r0.byteAt(r1)
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 != r1) goto L29
            r0 = r3
            javassist.CtBehavior r0 = r0.where()
            javassist.CtClass r0 = r0.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r1 = r3
            java.lang.String r1 = r1.getClassName()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
    }

    @Override // javassist.expr.Expr
    public void replace(java.lang.String r8) throws javassist.CannotCompileException {
            r7 = this;
            r0 = r7
            javassist.CtClass r0 = r0.thisClass
            javassist.bytecode.ClassFile r0 = r0.getClassFile()
            r0 = r7
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r9 = r0
            r0 = r7
            int r0 = r0.currentPos
            r10 = r0
            r0 = r7
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r11 = r0
            r0 = r7
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r10
            int r0 = r0.byteAt(r1)
            r16 = r0
            r0 = r16
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 != r1) goto L4e
            r0 = 5
            r15 = r0
            r0 = r9
            r1 = r11
            java.lang.String r0 = r0.getInterfaceMethodrefClassName(r1)
            r12 = r0
            r0 = r9
            r1 = r11
            java.lang.String r0 = r0.getInterfaceMethodrefName(r1)
            r13 = r0
            r0 = r9
            r1 = r11
            java.lang.String r0 = r0.getInterfaceMethodrefType(r1)
            r14 = r0
            goto L8e
        L4e:
            r0 = r16
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 == r1) goto L66
            r0 = r16
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 == r1) goto L66
            r0 = r16
            r1 = 182(0xb6, float:2.55E-43)
            if (r0 != r1) goto L84
        L66:
            r0 = 3
            r15 = r0
            r0 = r9
            r1 = r11
            java.lang.String r0 = r0.getMethodrefClassName(r1)
            r12 = r0
            r0 = r9
            r1 = r11
            java.lang.String r0 = r0.getMethodrefName(r1)
            r13 = r0
            r0 = r9
            r1 = r11
            java.lang.String r0 = r0.getMethodrefType(r1)
            r14 = r0
            goto L8e
        L84:
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "not method invocation"
            r1.<init>(r2)
            throw r0
        L8e:
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r7
            javassist.CtClass r2 = r2.thisClass
            r1.<init>(r2)
            r17 = r0
            r0 = r7
            javassist.CtClass r0 = r0.thisClass
            javassist.ClassPool r0 = r0.getClassPool()
            r18 = r0
            r0 = r7
            javassist.bytecode.CodeIterator r0 = r0.iterator
            javassist.bytecode.CodeAttribute r0 = r0.get()
            r19 = r0
            r0 = r14
            r1 = r18
            javassist.CtClass[] r0 = javassist.bytecode.Descriptor.getParameterTypes(r0, r1)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            r20 = r0
            r0 = r14
            r1 = r18
            javassist.CtClass r0 = javassist.bytecode.Descriptor.getReturnType(r0, r1)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            r21 = r0
            r0 = r19
            int r0 = r0.getMaxLocals()     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            r22 = r0
            r0 = r17
            r1 = r12
            r2 = r20
            r3 = 1
            r4 = r22
            r5 = r7
            boolean r5 = r5.withinStatic()     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            int r0 = r0.recordParams(r1, r2, r3, r4, r5)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            r0 = r17
            r1 = r21
            r2 = 1
            int r0 = r0.recordReturnType(r1, r2)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            r23 = r0
            r0 = r16
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 != r1) goto Lf5
            r0 = r17
            r1 = r12
            r2 = r13
            r0.recordStaticProceed(r1, r2)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            goto L118
        Lf5:
            r0 = r16
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 != r1) goto L10f
            r0 = r17
            java.lang.String r1 = "$0"
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r11
            r0.recordSpecialProceed(r1, r2, r3, r4, r5)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            goto L118
        L10f:
            r0 = r17
            java.lang.String r1 = "$0"
            r2 = r13
            r0.recordProceed(r1, r2)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
        L118:
            r0 = r21
            r1 = r8
            boolean r0 = checkResultValue(r0, r1)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            r0 = r17
            javassist.bytecode.Bytecode r0 = r0.getBytecode()     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            r24 = r0
            r0 = r20
            r1 = r16
            r2 = 184(0xb8, float:2.58E-43)
            if (r1 != r2) goto L134
            r1 = 1
            goto L135
        L134:
            r1 = 0
        L135:
            r2 = r22
            r3 = r24
            storeStack(r0, r1, r2, r3)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            r0 = r17
            r1 = r19
            r2 = r10
            boolean r0 = r0.recordLocalVariables(r1, r2)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            r0 = r21
            javassist.CtClass r1 = javassist.CtClass.voidType     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            if (r0 == r1) goto L15e
            r0 = r24
            r1 = r21
            r0.addConstZero(r1)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            r0 = r24
            r1 = r23
            r2 = r21
            int r0 = r0.addStore(r1, r2)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
        L15e:
            r0 = r17
            r1 = r8
            r0.compileStmnt(r1)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            r0 = r21
            javassist.CtClass r1 = javassist.CtClass.voidType     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            if (r0 == r1) goto L176
            r0 = r24
            r1 = r23
            r2 = r21
            int r0 = r0.addLoad(r1, r2)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
        L176:
            r0 = r7
            r1 = r10
            r2 = r24
            r3 = r15
            r0.replace0(r1, r2, r3)     // Catch: javassist.compiler.CompileError -> L182 javassist.NotFoundException -> L18e javassist.bytecode.BadBytecode -> L19a
            goto L1a6
        L182:
            r20 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r20
            r1.<init>(r2)
            throw r0
        L18e:
            r20 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r20
            r1.<init>(r2)
            throw r0
        L19a:
            r20 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "broken method"
            r1.<init>(r2)
            throw r0
        L1a6:
            return
    }
}
