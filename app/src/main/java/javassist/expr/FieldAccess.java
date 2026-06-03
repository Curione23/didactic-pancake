package javassist.expr;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/FieldAccess.class */
public class FieldAccess extends javassist.expr.Expr {
    int opcode;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/FieldAccess$ProceedForRead.class */
    static class ProceedForRead implements javassist.compiler.ProceedHandler {
        javassist.CtClass fieldType;
        int opcode;
        int targetVar;
        int index;

        ProceedForRead(javassist.CtClass r4, int r5, int r6, int r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.fieldType = r1
                r0 = r3
                r1 = r7
                r0.targetVar = r1
                r0 = r3
                r1 = r5
                r0.opcode = r1
                r0 = r3
                r1 = r6
                r0.index = r1
                return
        }

        @Override // javassist.compiler.ProceedHandler
        public void doit(javassist.compiler.JvstCodeGen r5, javassist.bytecode.Bytecode r6, javassist.compiler.ast.ASTList r7) throws javassist.compiler.CompileError {
                r4 = this;
                r0 = r7
                if (r0 == 0) goto L16
                r0 = r5
                r1 = r7
                boolean r0 = r0.isParamListName(r1)
                if (r0 != 0) goto L16
                javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
                r1 = r0
                java.lang.String r2 = "$proceed() cannot take a parameter for field reading"
                r1.<init>(r2)
                throw r0
            L16:
                r0 = r4
                int r0 = r0.opcode
                boolean r0 = javassist.expr.FieldAccess.isStatic(r0)
                if (r0 == 0) goto L26
                r0 = 0
                r8 = r0
                goto L31
            L26:
                r0 = -1
                r8 = r0
                r0 = r6
                r1 = r4
                int r1 = r1.targetVar
                r0.addAload(r1)
            L31:
                r0 = r4
                javassist.CtClass r0 = r0.fieldType
                boolean r0 = r0 instanceof javassist.CtPrimitiveType
                if (r0 == 0) goto L4d
                r0 = r8
                r1 = r4
                javassist.CtClass r1 = r1.fieldType
                javassist.CtPrimitiveType r1 = (javassist.CtPrimitiveType) r1
                int r1 = r1.getDataSize()
                int r0 = r0 + r1
                r8 = r0
                goto L50
            L4d:
                int r8 = r8 + 1
            L50:
                r0 = r6
                r1 = r4
                int r1 = r1.opcode
                r0.add(r1)
                r0 = r6
                r1 = r4
                int r1 = r1.index
                r0.addIndex(r1)
                r0 = r6
                r1 = r8
                r0.growStack(r1)
                r0 = r5
                r1 = r4
                javassist.CtClass r1 = r1.fieldType
                r0.setType(r1)
                return
        }

        @Override // javassist.compiler.ProceedHandler
        public void setReturnType(javassist.compiler.JvstTypeChecker r4, javassist.compiler.ast.ASTList r5) throws javassist.compiler.CompileError {
                r3 = this;
                r0 = r4
                r1 = r3
                javassist.CtClass r1 = r1.fieldType
                r0.setType(r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/FieldAccess$ProceedForWrite.class */
    static class ProceedForWrite implements javassist.compiler.ProceedHandler {
        javassist.CtClass fieldType;
        int opcode;
        int targetVar;
        int index;

        ProceedForWrite(javassist.CtClass r4, int r5, int r6, int r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.fieldType = r1
                r0 = r3
                r1 = r7
                r0.targetVar = r1
                r0 = r3
                r1 = r5
                r0.opcode = r1
                r0 = r3
                r1 = r6
                r0.index = r1
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
                java.lang.String r2 = "$proceed() cannot take more than one parameter for field writing"
                r1.<init>(r2)
                throw r0
            L13:
                r0 = r6
                int r0 = r0.opcode
                boolean r0 = javassist.expr.FieldAccess.isStatic(r0)
                if (r0 == 0) goto L23
                r0 = 0
                r10 = r0
                goto L2e
            L23:
                r0 = -1
                r10 = r0
                r0 = r8
                r1 = r6
                int r1 = r1.targetVar
                r0.addAload(r1)
            L2e:
                r0 = r7
                r1 = r9
                r2 = 1
                int[] r2 = new int[r2]
                r3 = 1
                int[] r3 = new int[r3]
                r4 = 1
                java.lang.String[] r4 = new java.lang.String[r4]
                r0.atMethodArgs(r1, r2, r3, r4)
                r0 = r7
                r1 = r6
                javassist.CtClass r1 = r1.fieldType
                r0.doNumCast(r1)
                r0 = r6
                javassist.CtClass r0 = r0.fieldType
                boolean r0 = r0 instanceof javassist.CtPrimitiveType
                if (r0 == 0) goto L61
                r0 = r10
                r1 = r6
                javassist.CtClass r1 = r1.fieldType
                javassist.CtPrimitiveType r1 = (javassist.CtPrimitiveType) r1
                int r1 = r1.getDataSize()
                int r0 = r0 - r1
                r10 = r0
                goto L64
            L61:
                int r10 = r10 + (-1)
            L64:
                r0 = r8
                r1 = r6
                int r1 = r1.opcode
                r0.add(r1)
                r0 = r8
                r1 = r6
                int r1 = r1.index
                r0.addIndex(r1)
                r0 = r8
                r1 = r10
                r0.growStack(r1)
                r0 = r7
                javassist.CtClass r1 = javassist.CtClass.voidType
                r0.setType(r1)
                r0 = r7
                r0.addNullIfVoid()
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
                javassist.CtClass r1 = javassist.CtClass.voidType
                r0.setType(r1)
                r0 = r7
                r0.addNullIfVoid()
                return
        }
    }

    protected FieldAccess(int r7, javassist.bytecode.CodeIterator r8, javassist.CtClass r9, javassist.bytecode.MethodInfo r10, int r11) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            r0 = r6
            r1 = r11
            r0.opcode = r1
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

    public boolean isStatic() {
            r2 = this;
            r0 = r2
            int r0 = r0.opcode
            boolean r0 = isStatic(r0)
            return r0
    }

    static boolean isStatic(int r3) {
            r0 = r3
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 == r1) goto Le
            r0 = r3
            r1 = 179(0xb3, float:2.51E-43)
            if (r0 != r1) goto L12
        Le:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean isReader() {
            r3 = this;
            r0 = r3
            int r0 = r0.opcode
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 == r1) goto L14
            r0 = r3
            int r0 = r0.opcode
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 != r1) goto L18
        L14:
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    public boolean isWriter() {
            r3 = this;
            r0 = r3
            int r0 = r0.opcode
            r1 = 181(0xb5, float:2.54E-43)
            if (r0 == r1) goto L14
            r0 = r3
            int r0 = r0.opcode
            r1 = 179(0xb3, float:2.51E-43)
            if (r0 != r1) goto L18
        L14:
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    private javassist.CtClass getCtClass() throws javassist.NotFoundException {
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
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r4
            int r1 = r1.currentPos
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r5 = r0
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r5
            java.lang.String r0 = r0.getFieldrefClassName(r1)
            return r0
    }

    public java.lang.String getFieldName() {
            r4 = this;
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r4
            int r1 = r1.currentPos
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r5 = r0
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r5
            java.lang.String r0 = r0.getFieldrefName(r1)
            return r0
    }

    public javassist.CtField getField() throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            javassist.CtClass r0 = r0.getCtClass()
            r6 = r0
            r0 = r5
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r5
            int r1 = r1.currentPos
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r7 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r8 = r0
            r0 = r6
            r1 = r8
            r2 = r7
            java.lang.String r1 = r1.getFieldrefName(r2)
            r2 = r8
            r3 = r7
            java.lang.String r2 = r2.getFieldrefType(r3)
            javassist.CtField r0 = r0.getField(r1, r2)
            return r0
    }

    @Override // javassist.expr.Expr
    public javassist.CtClass[] mayThrow() {
            r2 = this;
            r0 = r2
            javassist.CtClass[] r0 = super.mayThrow()
            return r0
    }

    public java.lang.String getSignature() {
            r4 = this;
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r4
            int r1 = r1.currentPos
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r5 = r0
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r5
            java.lang.String r0 = r0.getFieldrefType(r1)
            return r0
    }

    @Override // javassist.expr.Expr
    public void replace(java.lang.String r9) throws javassist.CannotCompileException {
            r8 = this;
            r0 = r8
            javassist.CtClass r0 = r0.thisClass
            javassist.bytecode.ClassFile r0 = r0.getClassFile()
            r0 = r8
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r10 = r0
            r0 = r8
            int r0 = r0.currentPos
            r11 = r0
            r0 = r8
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r12 = r0
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r8
            javassist.CtClass r2 = r2.thisClass
            r1.<init>(r2)
            r13 = r0
            r0 = r8
            javassist.bytecode.CodeIterator r0 = r0.iterator
            javassist.bytecode.CodeAttribute r0 = r0.get()
            r14 = r0
            r0 = r10
            r1 = r12
            java.lang.String r0 = r0.getFieldrefType(r1)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r1 = r8
            javassist.CtClass r1 = r1.thisClass     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            javassist.CtClass r0 = javassist.bytecode.Descriptor.toCtClass(r0, r1)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r17 = r0
            r0 = r8
            boolean r0 = r0.isReader()     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L5e
            r0 = 0
            javassist.CtClass[] r0 = new javassist.CtClass[r0]     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r15 = r0
            r0 = r17
            r16 = r0
            goto L6f
        L5e:
            r0 = 1
            javassist.CtClass[] r0 = new javassist.CtClass[r0]     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r15 = r0
            r0 = r15
            r1 = 0
            r2 = r17
            r0[r1] = r2     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            javassist.CtClass r0 = javassist.CtClass.voidType     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r16 = r0
        L6f:
            r0 = r14
            int r0 = r0.getMaxLocals()     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r19 = r0
            r0 = r13
            r1 = r10
            r2 = r12
            java.lang.String r1 = r1.getFieldrefClassName(r2)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r2 = r15
            r3 = 1
            r4 = r19
            r5 = r8
            boolean r5 = r5.withinStatic()     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            int r0 = r0.recordParams(r1, r2, r3, r4, r5)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r0 = r16
            r1 = r9
            boolean r0 = checkResultValue(r0, r1)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r20 = r0
            r0 = r18
            if (r0 == 0) goto L9b
            r0 = 1
            r20 = r0
        L9b:
            r0 = r13
            r1 = r16
            r2 = r20
            int r0 = r0.recordReturnType(r1, r2)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r21 = r0
            r0 = r18
            if (r0 == 0) goto Lc4
            r0 = r13
            javassist.expr.FieldAccess$ProceedForRead r1 = new javassist.expr.FieldAccess$ProceedForRead     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r2 = r1
            r3 = r16
            r4 = r8
            int r4 = r4.opcode     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r5 = r12
            r6 = r19
            r2.<init>(r3, r4, r5, r6)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r0.recordProceed(r1)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            goto Le3
        Lc4:
            r0 = r13
            r1 = r17
            r0.recordType(r1)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r0 = r13
            javassist.expr.FieldAccess$ProceedForWrite r1 = new javassist.expr.FieldAccess$ProceedForWrite     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r2 = r1
            r3 = r15
            r4 = 0
            r3 = r3[r4]     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r4 = r8
            int r4 = r4.opcode     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r5 = r12
            r6 = r19
            r2.<init>(r3, r4, r5, r6)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r0.recordProceed(r1)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
        Le3:
            r0 = r13
            javassist.bytecode.Bytecode r0 = r0.getBytecode()     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r22 = r0
            r0 = r15
            r1 = r8
            boolean r1 = r1.isStatic()     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r2 = r19
            r3 = r22
            storeStack(r0, r1, r2, r3)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r0 = r13
            r1 = r14
            r2 = r11
            boolean r0 = r0.recordLocalVariables(r1, r2)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r0 = r20
            if (r0 == 0) goto L12e
            r0 = r16
            javassist.CtClass r1 = javassist.CtClass.voidType     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            if (r0 != r1) goto L11d
            r0 = r22
            r1 = 1
            r0.addOpcode(r1)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r0 = r22
            r1 = r21
            r0.addAstore(r1)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            goto L12e
        L11d:
            r0 = r22
            r1 = r16
            r0.addConstZero(r1)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r0 = r22
            r1 = r21
            r2 = r16
            int r0 = r0.addStore(r1, r2)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
        L12e:
            r0 = r13
            r1 = r9
            r0.compileStmnt(r1)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            r0 = r18
            if (r0 == 0) goto L143
            r0 = r22
            r1 = r21
            r2 = r16
            int r0 = r0.addLoad(r1, r2)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
        L143:
            r0 = r8
            r1 = r11
            r2 = r22
            r3 = 3
            r0.replace0(r1, r2, r3)     // Catch: javassist.compiler.CompileError -> L14e javassist.NotFoundException -> L15a javassist.bytecode.BadBytecode -> L166
            goto L172
        L14e:
            r15 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            throw r0
        L15a:
            r15 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            throw r0
        L166:
            r15 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "broken method"
            r1.<init>(r2)
            throw r0
        L172:
            return
    }
}
