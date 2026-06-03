package javassist.expr;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/Handler.class */
public class Handler extends javassist.expr.Expr {
    private static java.lang.String EXCEPTION_NAME;
    private javassist.bytecode.ExceptionTable etable;
    private int index;

    protected Handler(javassist.bytecode.ExceptionTable r7, int r8, javassist.bytecode.CodeIterator r9, javassist.CtClass r10, javassist.bytecode.MethodInfo r11) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            int r1 = r1.handlerPc(r2)
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4)
            r0 = r6
            r1 = r7
            r0.etable = r1
            r0 = r6
            r1 = r8
            r0.index = r1
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

    @Override // javassist.expr.Expr
    public javassist.CtClass[] mayThrow() {
            r2 = this;
            r0 = r2
            javassist.CtClass[] r0 = super.mayThrow()
            return r0
    }

    public javassist.CtClass getType() throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.bytecode.ExceptionTable r0 = r0.etable
            r1 = r3
            int r1 = r1.index
            int r0 = r0.catchType(r1)
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r5 = r0
            r0 = r5
            r1 = r4
            java.lang.String r0 = r0.getClassInfo(r1)
            r6 = r0
            r0 = r3
            javassist.CtClass r0 = r0.thisClass
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r6
            javassist.CtClass r0 = r0.getCtClass(r1)
            return r0
    }

    public boolean isFinally() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ExceptionTable r0 = r0.etable
            r1 = r3
            int r1 = r1.index
            int r0 = r0.catchType(r1)
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // javassist.expr.Expr
    public void replace(java.lang.String r5) throws javassist.CannotCompileException {
            r4 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "not implemented yet"
            r1.<init>(r2)
            throw r0
    }

    public void insertBefore(java.lang.String r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r1 = 1
            r0.edited = r1
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r6 = r0
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            javassist.bytecode.CodeAttribute r0 = r0.get()
            r7 = r0
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r4
            javassist.CtClass r2 = r2.thisClass
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.getBytecode()
            r9 = r0
            r0 = r9
            r1 = 1
            r0.setStackDepth(r1)
            r0 = r9
            r1 = r7
            int r1 = r1.getMaxLocals()
            r0.setMaxLocals(r1)
            r0 = r4
            javassist.CtClass r0 = r0.getType()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r10 = r0
            r0 = r8
            r1 = r10
            java.lang.String r2 = javassist.expr.Handler.EXCEPTION_NAME     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            int r0 = r0.recordVariable(r1, r2)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r11 = r0
            r0 = r8
            r1 = r10
            r2 = 0
            int r0 = r0.recordReturnType(r1, r2)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r0 = r9
            r1 = r11
            r0.addAstore(r1)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r0 = r8
            r1 = r5
            r0.compileStmnt(r1)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r0 = r9
            r1 = r11
            r0.addAload(r1)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r0 = r4
            javassist.bytecode.ExceptionTable r0 = r0.etable     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r1 = r4
            int r1 = r1.index     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            int r0 = r0.handlerPc(r1)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r12 = r0
            r0 = r9
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r0 = r9
            r1 = r12
            r2 = r4
            javassist.bytecode.CodeIterator r2 = r2.iterator     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            int r2 = r2.getCodeLength()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            int r1 = r1 - r2
            r2 = r9
            int r2 = r2.currentPc()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 + r2
            r0.addIndex(r1)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r0 = r4
            r1 = r9
            int r1 = r1.getMaxStack()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r0.maxStack = r1     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r0 = r4
            r1 = r9
            int r1 = r1.getMaxLocals()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r0.maxLocals = r1     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r1 = r9
            byte[] r1 = r1.get()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            int r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r13 = r0
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r1 = r9
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r2 = r13
            r0.append(r1, r2)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r0 = r4
            javassist.bytecode.ExceptionTable r0 = r0.etable     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r1 = r4
            int r1 = r1.index     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            r2 = r13
            r0.setHandlerPc(r1, r2)     // Catch: javassist.NotFoundException -> Lce javassist.compiler.CompileError -> Lda
            goto Le6
        Lce:
            r10 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
        Lda:
            r10 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
        Le6:
            return
    }

    static {
            java.lang.String r0 = "$1"
            javassist.expr.Handler.EXCEPTION_NAME = r0
            return
    }
}
