package javassist.expr;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/NewExpr.class */
public class NewExpr extends javassist.expr.Expr {
    java.lang.String newTypeName;
    int newPos;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/NewExpr$ProceedForNew.class */
    static class ProceedForNew implements javassist.compiler.ProceedHandler {
        javassist.CtClass newType;
        int newIndex;
        int methodIndex;

        ProceedForNew(javassist.CtClass r4, int r5, int r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.newType = r1
                r0 = r3
                r1 = r5
                r0.newIndex = r1
                r0 = r3
                r1 = r6
                r0.methodIndex = r1
                return
        }

        @Override // javassist.compiler.ProceedHandler
        public void doit(javassist.compiler.JvstCodeGen r10, javassist.bytecode.Bytecode r11, javassist.compiler.ast.ASTList r12) throws javassist.compiler.CompileError {
                r9 = this;
                r0 = r11
                r1 = 187(0xbb, float:2.62E-43)
                r0.addOpcode(r1)
                r0 = r11
                r1 = r9
                int r1 = r1.newIndex
                r0.addIndex(r1)
                r0 = r11
                r1 = 89
                r0.addOpcode(r1)
                r0 = r10
                r1 = r9
                javassist.CtClass r1 = r1.newType
                java.lang.String r2 = "<init>"
                r3 = r12
                r4 = 0
                r5 = 1
                r6 = -1
                r7 = 0
                r0.atMethodCallCore(r1, r2, r3, r4, r5, r6, r7)
                r0 = r10
                r1 = r9
                javassist.CtClass r1 = r1.newType
                r0.setType(r1)
                return
        }

        @Override // javassist.compiler.ProceedHandler
        public void setReturnType(javassist.compiler.JvstTypeChecker r6, javassist.compiler.ast.ASTList r7) throws javassist.compiler.CompileError {
                r5 = this;
                r0 = r6
                r1 = r5
                javassist.CtClass r1 = r1.newType
                java.lang.String r2 = "<init>"
                r3 = r7
                javassist.compiler.MemberResolver$Method r0 = r0.atMethodCallCore(r1, r2, r3)
                r0 = r6
                r1 = r5
                javassist.CtClass r1 = r1.newType
                r0.setType(r1)
                return
        }
    }

    protected NewExpr(int r7, javassist.bytecode.CodeIterator r8, javassist.CtClass r9, javassist.bytecode.MethodInfo r10, java.lang.String r11, int r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            r0 = r6
            r1 = r11
            r0.newTypeName = r1
            r0 = r6
            r1 = r12
            r0.newPos = r1
            return
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

    private javassist.CtClass getCtClass() throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.CtClass r0 = r0.thisClass
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r3
            java.lang.String r1 = r1.newTypeName
            javassist.CtClass r0 = r0.get(r1)
            return r0
    }

    public java.lang.String getClassName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.newTypeName
            return r0
    }

    public java.lang.String getSignature() {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r5 = r0
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r4
            int r1 = r1.currentPos
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r6 = r0
            r0 = r5
            r1 = r6
            java.lang.String r0 = r0.getMethodrefType(r1)
            return r0
    }

    public javassist.CtConstructor getConstructor() throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r5 = r0
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r4
            int r1 = r1.currentPos
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r6 = r0
            r0 = r5
            r1 = r6
            java.lang.String r0 = r0.getMethodrefType(r1)
            r7 = r0
            r0 = r4
            javassist.CtClass r0 = r0.getCtClass()
            r1 = r7
            javassist.CtConstructor r0 = r0.getConstructor(r1)
            return r0
    }

    @Override // javassist.expr.Expr
    public javassist.CtClass[] mayThrow() {
            r2 = this;
            r0 = r2
            javassist.CtClass[] r0 = super.mayThrow()
            return r0
    }

    private int canReplace() throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r4
            int r1 = r1.newPos
            r2 = 3
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r5 = r0
            r0 = r5
            r1 = 89
            if (r0 != r1) goto L3f
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r4
            int r1 = r1.newPos
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r1 = 94
            if (r0 != r1) goto L3d
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r4
            int r1 = r1.newPos
            r2 = 5
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r1 = 88
            if (r0 != r1) goto L3d
            r0 = 6
            goto L3e
        L3d:
            r0 = 4
        L3e:
            return r0
        L3f:
            r0 = r5
            r1 = 90
            if (r0 != r1) goto L59
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r4
            int r1 = r1.newPos
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r1 = 95
            if (r0 != r1) goto L59
            r0 = 5
            return r0
        L59:
            r0 = 3
            return r0
    }

    @Override // javassist.expr.Expr
    public void replace(java.lang.String r8) throws javassist.CannotCompileException {
            r7 = this;
            r0 = r7
            javassist.CtClass r0 = r0.thisClass
            javassist.bytecode.ClassFile r0 = r0.getClassFile()
            r0 = 3
            r9 = r0
            r0 = r7
            int r0 = r0.newPos
            r10 = r0
            r0 = r7
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r11 = r0
            r0 = r7
            int r0 = r0.canReplace()
            r12 = r0
            r0 = r10
            r1 = r12
            int r0 = r0 + r1
            r13 = r0
            r0 = r10
            r14 = r0
        L2a:
            r0 = r14
            r1 = r13
            if (r0 >= r1) goto L41
            r0 = r7
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = 0
            r2 = r14
            r0.writeByte(r1, r2)
            int r14 = r14 + 1
            goto L2a
        L41:
            r0 = r7
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r14 = r0
            r0 = r7
            int r0 = r0.currentPos
            r10 = r0
            r0 = r7
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r15 = r0
            r0 = r14
            r1 = r15
            java.lang.String r0 = r0.getMethodrefType(r1)
            r16 = r0
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
            r0 = r16
            r1 = r18
            javassist.CtClass[] r0 = javassist.bytecode.Descriptor.getParameterTypes(r0, r1)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r20 = r0
            r0 = r18
            r1 = r7
            java.lang.String r1 = r1.newTypeName     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r21 = r0
            r0 = r19
            int r0 = r0.getMaxLocals()     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r22 = r0
            r0 = r17
            r1 = r7
            java.lang.String r1 = r1.newTypeName     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r2 = r20
            r3 = 1
            r4 = r22
            r5 = r7
            boolean r5 = r5.withinStatic()     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            int r0 = r0.recordParams(r1, r2, r3, r4, r5)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r0 = r17
            r1 = r21
            r2 = 1
            int r0 = r0.recordReturnType(r1, r2)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r23 = r0
            r0 = r17
            javassist.expr.NewExpr$ProceedForNew r1 = new javassist.expr.NewExpr$ProceedForNew     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r2 = r1
            r3 = r21
            r4 = r11
            r5 = r15
            r2.<init>(r3, r4, r5)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r0.recordProceed(r1)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r0 = r21
            r1 = r8
            boolean r0 = checkResultValue(r0, r1)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r0 = r17
            javassist.bytecode.Bytecode r0 = r0.getBytecode()     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r24 = r0
            r0 = r20
            r1 = 1
            r2 = r22
            r3 = r24
            storeStack(r0, r1, r2, r3)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r0 = r17
            r1 = r19
            r2 = r10
            boolean r0 = r0.recordLocalVariables(r1, r2)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r0 = r24
            r1 = r21
            r0.addConstZero(r1)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r0 = r24
            r1 = r23
            r2 = r21
            int r0 = r0.addStore(r1, r2)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r0 = r17
            r1 = r8
            r0.compileStmnt(r1)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            r0 = r12
            r1 = 3
            if (r0 <= r1) goto L10f
            r0 = r24
            r1 = r23
            r0.addAload(r1)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
        L10f:
            r0 = r7
            r1 = r10
            r2 = r24
            r3 = 3
            r0.replace0(r1, r2, r3)     // Catch: javassist.compiler.CompileError -> L11a javassist.NotFoundException -> L126 javassist.bytecode.BadBytecode -> L132
            goto L13e
        L11a:
            r20 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r20
            r1.<init>(r2)
            throw r0
        L126:
            r20 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r20
            r1.<init>(r2)
            throw r0
        L132:
            r20 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "broken method"
            r1.<init>(r2)
            throw r0
        L13e:
            return
    }
}
