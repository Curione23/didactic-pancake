package javassist.expr;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/NewArray.class */
public class NewArray extends javassist.expr.Expr {
    int opcode;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/NewArray$ProceedForArray.class */
    static class ProceedForArray implements javassist.compiler.ProceedHandler {
        javassist.CtClass arrayType;
        int opcode;
        int index;
        int dimension;

        ProceedForArray(javassist.CtClass r4, int r5, int r6, int r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.arrayType = r1
                r0 = r3
                r1 = r5
                r0.opcode = r1
                r0 = r3
                r1 = r6
                r0.index = r1
                r0 = r3
                r1 = r7
                r0.dimension = r1
                return
        }

        @Override // javassist.compiler.ProceedHandler
        public void doit(javassist.compiler.JvstCodeGen r7, javassist.bytecode.Bytecode r8, javassist.compiler.ast.ASTList r9) throws javassist.compiler.CompileError {
                r6 = this;
                r0 = r7
                r1 = r9
                int r0 = r0.getMethodArgsLength(r1)
                r10 = r0
                r0 = r10
                r1 = r6
                int r1 = r1.dimension
                if (r0 == r1) goto L1a
                javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
                r1 = r0
                java.lang.String r2 = "$proceed() with a wrong number of parameters"
                r1.<init>(r2)
                throw r0
            L1a:
                r0 = r7
                r1 = r9
                r2 = r10
                int[] r2 = new int[r2]
                r3 = r10
                int[] r3 = new int[r3]
                r4 = r10
                java.lang.String[] r4 = new java.lang.String[r4]
                r0.atMethodArgs(r1, r2, r3, r4)
                r0 = r8
                r1 = r6
                int r1 = r1.opcode
                r0.addOpcode(r1)
                r0 = r6
                int r0 = r0.opcode
                r1 = 189(0xbd, float:2.65E-43)
                if (r0 != r1) goto L49
                r0 = r8
                r1 = r6
                int r1 = r1.index
                r0.addIndex(r1)
                goto L78
            L49:
                r0 = r6
                int r0 = r0.opcode
                r1 = 188(0xbc, float:2.63E-43)
                if (r0 != r1) goto L5e
                r0 = r8
                r1 = r6
                int r1 = r1.index
                r0.add(r1)
                goto L78
            L5e:
                r0 = r8
                r1 = r6
                int r1 = r1.index
                r0.addIndex(r1)
                r0 = r8
                r1 = r6
                int r1 = r1.dimension
                r0.add(r1)
                r0 = r8
                r1 = 1
                r2 = r6
                int r2 = r2.dimension
                int r1 = r1 - r2
                r0.growStack(r1)
            L78:
                r0 = r7
                r1 = r6
                javassist.CtClass r1 = r1.arrayType
                r0.setType(r1)
                return
        }

        @Override // javassist.compiler.ProceedHandler
        public void setReturnType(javassist.compiler.JvstTypeChecker r4, javassist.compiler.ast.ASTList r5) throws javassist.compiler.CompileError {
                r3 = this;
                r0 = r4
                r1 = r3
                javassist.CtClass r1 = r1.arrayType
                r0.setType(r1)
                return
        }
    }

    protected NewArray(int r7, javassist.bytecode.CodeIterator r8, javassist.CtClass r9, javassist.bytecode.MethodInfo r10, int r11) {
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

    @Override // javassist.expr.Expr
    public javassist.CtClass[] mayThrow() {
            r2 = this;
            r0 = r2
            javassist.CtClass[] r0 = super.mayThrow()
            return r0
    }

    public javassist.CtClass getComponentType() throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            int r0 = r0.opcode
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 != r1) goto L1e
            r0 = r5
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r5
            int r1 = r1.currentPos
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r6 = r0
            r0 = r5
            r1 = r6
            javassist.CtClass r0 = r0.getPrimitiveType(r1)
            return r0
        L1e:
            r0 = r5
            int r0 = r0.opcode
            r1 = 189(0xbd, float:2.65E-43)
            if (r0 == r1) goto L32
            r0 = r5
            int r0 = r0.opcode
            r1 = 197(0xc5, float:2.76E-43)
            if (r0 != r1) goto L60
        L32:
            r0 = r5
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r5
            int r1 = r1.currentPos
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r6 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r6
            java.lang.String r0 = r0.getClassInfo(r1)
            r7 = r0
            r0 = r7
            int r0 = javassist.bytecode.Descriptor.arrayDimension(r0)
            r8 = r0
            r0 = r7
            r1 = r8
            java.lang.String r0 = javassist.bytecode.Descriptor.toArrayComponent(r0, r1)
            r7 = r0
            r0 = r7
            r1 = r5
            javassist.CtClass r1 = r1.thisClass
            javassist.ClassPool r1 = r1.getClassPool()
            javassist.CtClass r0 = javassist.bytecode.Descriptor.toCtClass(r0, r1)
            return r0
        L60:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad opcode: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.opcode
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    javassist.CtClass getPrimitiveType(int r6) {
            r5 = this;
            r0 = r6
            switch(r0) {
                case 4: goto L30;
                case 5: goto L34;
                case 6: goto L38;
                case 7: goto L3c;
                case 8: goto L40;
                case 9: goto L44;
                case 10: goto L48;
                case 11: goto L4c;
                default: goto L50;
            }
        L30:
            javassist.CtClass r0 = javassist.CtClass.booleanType
            return r0
        L34:
            javassist.CtClass r0 = javassist.CtClass.charType
            return r0
        L38:
            javassist.CtClass r0 = javassist.CtClass.floatType
            return r0
        L3c:
            javassist.CtClass r0 = javassist.CtClass.doubleType
            return r0
        L40:
            javassist.CtClass r0 = javassist.CtClass.byteType
            return r0
        L44:
            javassist.CtClass r0 = javassist.CtClass.shortType
            return r0
        L48:
            javassist.CtClass r0 = javassist.CtClass.intType
            return r0
        L4c:
            javassist.CtClass r0 = javassist.CtClass.longType
            return r0
        L50:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad atype: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public int getDimension() {
            r5 = this;
            r0 = r5
            int r0 = r0.opcode
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = r5
            int r0 = r0.opcode
            r1 = 189(0xbd, float:2.65E-43)
            if (r0 == r1) goto L20
            r0 = r5
            int r0 = r0.opcode
            r1 = 197(0xc5, float:2.76E-43)
            if (r0 != r1) goto L4c
        L20:
            r0 = r5
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r5
            int r1 = r1.currentPos
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r6 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r6
            java.lang.String r0 = r0.getClassInfo(r1)
            r7 = r0
            r0 = r7
            int r0 = javassist.bytecode.Descriptor.arrayDimension(r0)
            r1 = r5
            int r1 = r1.opcode
            r2 = 189(0xbd, float:2.65E-43)
            if (r1 != r2) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            int r0 = r0 + r1
            return r0
        L4c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad opcode: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.opcode
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public int getCreatedDimensions() {
            r4 = this;
            r0 = r4
            int r0 = r0.opcode
            r1 = 197(0xc5, float:2.76E-43)
            if (r0 != r1) goto L18
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r4
            int r1 = r1.currentPos
            r2 = 3
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            return r0
        L18:
            r0 = 1
            return r0
    }

    @Override // javassist.expr.Expr
    public void replace(java.lang.String r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.replace2(r1)     // Catch: javassist.compiler.CompileError -> L8 javassist.NotFoundException -> L12 javassist.bytecode.BadBytecode -> L1c
            goto L27
        L8:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L12:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L1c:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "broken method"
            r1.<init>(r2)
            throw r0
        L27:
            return
    }

    private void replace2(java.lang.String r9) throws javassist.compiler.CompileError, javassist.NotFoundException, javassist.bytecode.BadBytecode, javassist.CannotCompileException {
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
            r0 = 0
            r14 = r0
            r0 = 1
            r15 = r0
            r0 = r8
            int r0 = r0.opcode
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 != r1) goto L5b
            r0 = r8
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r8
            int r1 = r1.currentPos
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r14 = r0
            r0 = r8
            r1 = r14
            javassist.CtClass r0 = r0.getPrimitiveType(r1)
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r17 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r17
            char r1 = r1.getDescriptor()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r16 = r0
            r0 = 2
            r13 = r0
            goto L111
        L5b:
            r0 = r8
            int r0 = r0.opcode
            r1 = 189(0xbd, float:2.65E-43)
            if (r0 != r1) goto Lbd
            r0 = r8
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r14 = r0
            r0 = r10
            r1 = r14
            java.lang.String r0 = r0.getClassInfo(r1)
            r16 = r0
            r0 = r16
            java.lang.String r1 = "["
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L9c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r16 = r0
            goto Lb7
        L9c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "[L"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ";"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r16 = r0
        Lb7:
            r0 = 3
            r13 = r0
            goto L111
        Lbd:
            r0 = r8
            int r0 = r0.opcode
            r1 = 197(0xc5, float:2.76E-43)
            if (r0 != r1) goto Lf3
            r0 = r8
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r8
            int r1 = r1.currentPos
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r14 = r0
            r0 = r10
            r1 = r14
            java.lang.String r0 = r0.getClassInfo(r1)
            r16 = r0
            r0 = r8
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r8
            int r1 = r1.currentPos
            r2 = 3
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r15 = r0
            r0 = 4
            r13 = r0
            goto L111
        Lf3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad opcode: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            int r3 = r3.opcode
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L111:
            r0 = r16
            r1 = r8
            javassist.CtClass r1 = r1.thisClass
            javassist.ClassPool r1 = r1.getClassPool()
            javassist.CtClass r0 = javassist.bytecode.Descriptor.toCtClass(r0, r1)
            r12 = r0
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r8
            javassist.CtClass r2 = r2.thisClass
            r1.<init>(r2)
            r17 = r0
            r0 = r8
            javassist.bytecode.CodeIterator r0 = r0.iterator
            javassist.bytecode.CodeAttribute r0 = r0.get()
            r18 = r0
            r0 = r15
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r19 = r0
            r0 = 0
            r20 = r0
        L13f:
            r0 = r20
            r1 = r15
            if (r0 >= r1) goto L154
            r0 = r19
            r1 = r20
            javassist.CtClass r2 = javassist.CtClass.intType
            r0[r1] = r2
            int r20 = r20 + 1
            goto L13f
        L154:
            r0 = r18
            int r0 = r0.getMaxLocals()
            r20 = r0
            r0 = r17
            java.lang.String r1 = "java.lang.Object"
            r2 = r19
            r3 = 1
            r4 = r20
            r5 = r8
            boolean r5 = r5.withinStatic()
            int r0 = r0.recordParams(r1, r2, r3, r4, r5)
            r0 = r12
            r1 = r9
            boolean r0 = checkResultValue(r0, r1)
            r0 = r17
            r1 = r12
            r2 = 1
            int r0 = r0.recordReturnType(r1, r2)
            r21 = r0
            r0 = r17
            javassist.expr.NewArray$ProceedForArray r1 = new javassist.expr.NewArray$ProceedForArray
            r2 = r1
            r3 = r12
            r4 = r8
            int r4 = r4.opcode
            r5 = r14
            r6 = r15
            r2.<init>(r3, r4, r5, r6)
            r0.recordProceed(r1)
            r0 = r17
            javassist.bytecode.Bytecode r0 = r0.getBytecode()
            r22 = r0
            r0 = r19
            r1 = 1
            r2 = r20
            r3 = r22
            storeStack(r0, r1, r2, r3)
            r0 = r17
            r1 = r18
            r2 = r11
            boolean r0 = r0.recordLocalVariables(r1, r2)
            r0 = r22
            r1 = 1
            r0.addOpcode(r1)
            r0 = r22
            r1 = r21
            r0.addAstore(r1)
            r0 = r17
            r1 = r9
            r0.compileStmnt(r1)
            r0 = r22
            r1 = r21
            r0.addAload(r1)
            r0 = r8
            r1 = r11
            r2 = r22
            r3 = r13
            r0.replace0(r1, r2, r3)
            return
    }
}
