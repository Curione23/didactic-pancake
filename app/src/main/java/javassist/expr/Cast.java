package javassist.expr;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/Cast.class */
public class Cast extends javassist.expr.Expr {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/Cast$ProceedForCast.class */
    static class ProceedForCast implements javassist.compiler.ProceedHandler {
        int index;
        javassist.CtClass retType;

        ProceedForCast(int r4, javassist.CtClass r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.index = r1
                r0 = r3
                r1 = r5
                r0.retType = r1
                return
        }

        @Override // javassist.compiler.ProceedHandler
        public void doit(javassist.compiler.JvstCodeGen r7, javassist.bytecode.Bytecode r8, javassist.compiler.ast.ASTList r9) throws javassist.compiler.CompileError {
                r6 = this;
                r0 = r7
                r1 = r9
                int r0 = r0.getMethodArgsLength(r1)
                r1 = 1
                if (r0 == r1) goto L13
                javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
                r1 = r0
                java.lang.String r2 = "$proceed() cannot take more than one parameter for cast"
                r1.<init>(r2)
                throw r0
            L13:
                r0 = r7
                r1 = r9
                r2 = 1
                int[] r2 = new int[r2]
                r3 = 1
                int[] r3 = new int[r3]
                r4 = 1
                java.lang.String[] r4 = new java.lang.String[r4]
                r0.atMethodArgs(r1, r2, r3, r4)
                r0 = r8
                r1 = 192(0xc0, float:2.69E-43)
                r0.addOpcode(r1)
                r0 = r8
                r1 = r6
                int r1 = r1.index
                r0.addIndex(r1)
                r0 = r7
                r1 = r6
                javassist.CtClass r1 = r1.retType
                r0.setType(r1)
                return
        }

        @Override // javassist.compiler.ProceedHandler
        public void setReturnType(javassist.compiler.JvstTypeChecker r7, javassist.compiler.ast.ASTList r8) throws javassist.compiler.CompileError {
                r6 = this;
                r0 = r7
                r1 = r8
                r2 = 1
                int[] r2 = new int[r2]
                r3 = 1
                int[] r3 = new int[r3]
                r4 = 1
                java.lang.String[] r4 = new java.lang.String[r4]
                r0.atMethodArgs(r1, r2, r3, r4)
                r0 = r7
                r1 = r6
                javassist.CtClass r1 = r1.retType
                r0.setType(r1)
                return
        }
    }

    protected Cast(int r7, javassist.bytecode.CodeIterator r8, javassist.CtClass r9, javassist.bytecode.MethodInfo r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
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

    public javassist.CtClass getType() throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r5 = r0
            r0 = r4
            int r0 = r0.currentPos
            r6 = r0
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r7 = r0
            r0 = r5
            r1 = r7
            java.lang.String r0 = r0.getClassInfo(r1)
            r8 = r0
            r0 = r4
            javassist.CtClass r0 = r0.thisClass
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r8
            javassist.CtClass r0 = r0.getCtClass(r1)
            return r0
    }

    @Override // javassist.expr.Expr
    public javassist.CtClass[] mayThrow() {
            r2 = this;
            r0 = r2
            javassist.CtClass[] r0 = super.mayThrow()
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
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r7
            javassist.CtClass r2 = r2.thisClass
            r1.<init>(r2)
            r12 = r0
            r0 = r7
            javassist.CtClass r0 = r0.thisClass
            javassist.ClassPool r0 = r0.getClassPool()
            r13 = r0
            r0 = r7
            javassist.bytecode.CodeIterator r0 = r0.iterator
            javassist.bytecode.CodeAttribute r0 = r0.get()
            r14 = r0
            r0 = 1
            javassist.CtClass[] r0 = new javassist.CtClass[r0]     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r1 = r0
            r2 = 0
            r3 = r13
            java.lang.String r4 = "java.lang.Object"
            javassist.CtClass r3 = r3.get(r4)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r1[r2] = r3     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r15 = r0
            r0 = r7
            javassist.CtClass r0 = r0.getType()     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r16 = r0
            r0 = r14
            int r0 = r0.getMaxLocals()     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r17 = r0
            r0 = r12
            java.lang.String r1 = "java.lang.Object"
            r2 = r15
            r3 = 1
            r4 = r17
            r5 = r7
            boolean r5 = r5.withinStatic()     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            int r0 = r0.recordParams(r1, r2, r3, r4, r5)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r0 = r12
            r1 = r16
            r2 = 1
            int r0 = r0.recordReturnType(r1, r2)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r18 = r0
            r0 = r12
            javassist.expr.Cast$ProceedForCast r1 = new javassist.expr.Cast$ProceedForCast     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r2 = r1
            r3 = r11
            r4 = r16
            r2.<init>(r3, r4)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r0.recordProceed(r1)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r0 = r16
            r1 = r8
            boolean r0 = checkResultValue(r0, r1)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r0 = r12
            javassist.bytecode.Bytecode r0 = r0.getBytecode()     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r19 = r0
            r0 = r15
            r1 = 1
            r2 = r17
            r3 = r19
            storeStack(r0, r1, r2, r3)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r0 = r12
            r1 = r14
            r2 = r10
            boolean r0 = r0.recordLocalVariables(r1, r2)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r0 = r19
            r1 = r16
            r0.addConstZero(r1)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r0 = r19
            r1 = r18
            r2 = r16
            int r0 = r0.addStore(r1, r2)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r0 = r12
            r1 = r8
            r0.compileStmnt(r1)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r0 = r19
            r1 = r18
            r2 = r16
            int r0 = r0.addLoad(r1, r2)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            r0 = r7
            r1 = r10
            r2 = r19
            r3 = 3
            r0.replace0(r1, r2, r3)     // Catch: javassist.compiler.CompileError -> Ld2 javassist.NotFoundException -> Lde javassist.bytecode.BadBytecode -> Lea
            goto Lf6
        Ld2:
            r15 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            throw r0
        Lde:
            r15 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            throw r0
        Lea:
            r15 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "broken method"
            r1.<init>(r2)
            throw r0
        Lf6:
            return
    }
}
