package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/JvstTypeChecker.class */
public class JvstTypeChecker extends javassist.compiler.TypeChecker {
    private javassist.compiler.JvstCodeGen codeGen;

    public JvstTypeChecker(javassist.CtClass r5, javassist.ClassPool r6, javassist.compiler.JvstCodeGen r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r7
            r0.codeGen = r1
            return
    }

    public void addNullIfVoid() {
            r3 = this;
            r0 = r3
            int r0 = r0.exprType
            r1 = 344(0x158, float:4.82E-43)
            if (r0 != r1) goto L1c
            r0 = r3
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r3
            r1 = 0
            r0.arrayDim = r1
            r0 = r3
            java.lang.String r1 = "java/lang/Object"
            r0.className = r1
        L1c:
            return
    }

    @Override // javassist.compiler.TypeChecker, javassist.compiler.ast.Visitor
    public void atMember(javassist.compiler.ast.Member r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            java.lang.String r0 = r0.get()
            r5 = r0
            r0 = r5
            r1 = r3
            javassist.compiler.JvstCodeGen r1 = r1.codeGen
            java.lang.String r1 = r1.paramArrayName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            r0 = r3
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r3
            r1 = 1
            r0.arrayDim = r1
            r0 = r3
            java.lang.String r1 = "java/lang/Object"
            r0.className = r1
            goto L72
        L28:
            r0 = r5
            java.lang.String r1 = "$sig"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = r3
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r3
            r1 = 1
            r0.arrayDim = r1
            r0 = r3
            java.lang.String r1 = "java/lang/Class"
            r0.className = r1
            goto L72
        L46:
            r0 = r5
            java.lang.String r1 = "$type"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L58
            r0 = r5
            java.lang.String r1 = "$class"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6d
        L58:
            r0 = r3
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r3
            r1 = 0
            r0.arrayDim = r1
            r0 = r3
            java.lang.String r1 = "java/lang/Class"
            r0.className = r1
            goto L72
        L6d:
            r0 = r3
            r1 = r4
            super.atMember(r1)
        L72:
            return
    }

    @Override // javassist.compiler.TypeChecker
    protected void atFieldAssign(javassist.compiler.ast.Expr r7, int r8, javassist.compiler.ast.ASTree r9, javassist.compiler.ast.ASTree r10) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r9
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L51
            r0 = r9
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r1 = r6
            javassist.compiler.JvstCodeGen r1 = r1.codeGen
            java.lang.String r1 = r1.paramArrayName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            r0 = r10
            r1 = r6
            r0.accept(r1)
            r0 = r6
            javassist.compiler.JvstCodeGen r0 = r0.codeGen
            javassist.CtClass[] r0 = r0.paramTypeList
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L30
            return
        L30:
            r0 = r11
            int r0 = r0.length
            r12 = r0
            r0 = 0
            r13 = r0
        L38:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L4e
            r0 = r6
            r1 = r11
            r2 = r13
            r1 = r1[r2]
            r0.compileUnwrapValue(r1)
            int r13 = r13 + 1
            goto L38
        L4e:
            goto L5a
        L51:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.atFieldAssign(r1, r2, r3, r4)
        L5a:
            return
    }

    @Override // javassist.compiler.TypeChecker, javassist.compiler.ast.Visitor
    public void atCastExpr(javassist.compiler.ast.CastExpr r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            javassist.compiler.ast.ASTList r0 = r0.getClassName()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L51
            r0 = r4
            int r0 = r0.getArrayDim()
            if (r0 != 0) goto L51
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.head()
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Symbol
            if (r0 == 0) goto L51
            r0 = r5
            javassist.compiler.ast.ASTList r0 = r0.tail()
            if (r0 != 0) goto L51
            r0 = r6
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0
            java.lang.String r0 = r0.get()
            r7 = r0
            r0 = r7
            r1 = r3
            javassist.compiler.JvstCodeGen r1 = r1.codeGen
            java.lang.String r1 = r1.returnCastName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L41
            r0 = r3
            r1 = r4
            r0.atCastToRtype(r1)
            return
        L41:
            r0 = r7
            java.lang.String r1 = "$w"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            r0 = r3
            r1 = r4
            r0.atCastToWrapper(r1)
            return
        L51:
            r0 = r3
            r1 = r4
            super.atCastExpr(r1)
            return
    }

    protected void atCastToRtype(javassist.compiler.ast.CastExpr r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            javassist.compiler.JvstCodeGen r0 = r0.codeGen
            javassist.CtClass r0 = r0.returnType
            r5 = r0
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.getOprand()
            r1 = r3
            r0.accept(r1)
            r0 = r3
            int r0 = r0.exprType
            r1 = 344(0x158, float:4.82E-43)
            if (r0 == r1) goto L2b
            r0 = r3
            int r0 = r0.exprType
            boolean r0 = javassist.compiler.CodeGen.isRefType(r0)
            if (r0 != 0) goto L2b
            r0 = r3
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L33
        L2b:
            r0 = r3
            r1 = r5
            r0.compileUnwrapValue(r1)
            goto L58
        L33:
            r0 = r5
            boolean r0 = r0 instanceof javassist.CtPrimitiveType
            if (r0 == 0) goto L58
            r0 = r5
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r6 = r0
            r0 = r6
            char r0 = r0.getDescriptor()
            int r0 = javassist.compiler.MemberResolver.descToType(r0)
            r7 = r0
            r0 = r3
            r1 = r7
            r0.exprType = r1
            r0 = r3
            r1 = 0
            r0.arrayDim = r1
            r0 = r3
            r1 = 0
            r0.className = r1
        L58:
            return
    }

    protected void atCastToWrapper(javassist.compiler.ast.CastExpr r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.getOprand()
            r1 = r5
            r0.accept(r1)
            r0 = r5
            int r0 = r0.exprType
            boolean r0 = javassist.compiler.CodeGen.isRefType(r0)
            if (r0 != 0) goto L19
            r0 = r5
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L1a
        L19:
            return
        L1a:
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r5
            int r1 = r1.exprType
            r2 = r5
            int r2 = r2.arrayDim
            r3 = r5
            java.lang.String r3 = r3.className
            javassist.CtClass r0 = r0.lookupClass(r1, r2, r3)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof javassist.CtPrimitiveType
            if (r0 == 0) goto L47
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 0
            r0.arrayDim = r1
            r0 = r5
            java.lang.String r1 = "java/lang/Object"
            r0.className = r1
        L47:
            return
    }

    @Override // javassist.compiler.TypeChecker, javassist.compiler.ast.Visitor
    public void atCallExpr(javassist.compiler.ast.CallExpr r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L56
            r0 = r6
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r7 = r0
            r0 = r4
            javassist.compiler.JvstCodeGen r0 = r0.codeGen
            javassist.compiler.ProceedHandler r0 = r0.procHandler
            if (r0 == 0) goto L41
            r0 = r7
            r1 = r4
            javassist.compiler.JvstCodeGen r1 = r1.codeGen
            java.lang.String r1 = r1.proceedName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L41
            r0 = r4
            javassist.compiler.JvstCodeGen r0 = r0.codeGen
            javassist.compiler.ProceedHandler r0 = r0.procHandler
            r1 = r4
            r2 = r5
            javassist.compiler.ast.ASTree r2 = r2.oprand2()
            javassist.compiler.ast.ASTList r2 = (javassist.compiler.ast.ASTList) r2
            r0.setReturnType(r1, r2)
            return
        L41:
            r0 = r7
            java.lang.String r1 = "$cflow"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L56
            r0 = r4
            r1 = r5
            javassist.compiler.ast.ASTree r1 = r1.oprand2()
            javassist.compiler.ast.ASTList r1 = (javassist.compiler.ast.ASTList) r1
            r0.atCflow(r1)
            return
        L56:
            r0 = r4
            r1 = r5
            super.atCallExpr(r1)
            return
    }

    protected void atCflow(javassist.compiler.ast.ASTList r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
            r0 = r3
            r1 = 0
            r0.arrayDim = r1
            r0 = r3
            r1 = 0
            r0.className = r1
            return
    }

    public boolean isParamListName(javassist.compiler.ast.ASTList r4) {
            r3 = this;
            r0 = r3
            javassist.compiler.JvstCodeGen r0 = r0.codeGen
            javassist.CtClass[] r0 = r0.paramTypeList
            if (r0 == 0) goto L3b
            r0 = r4
            if (r0 == 0) goto L3b
            r0 = r4
            javassist.compiler.ast.ASTList r0 = r0.tail()
            if (r0 != 0) goto L3b
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.head()
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L39
            r0 = r5
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r1 = r3
            javassist.compiler.JvstCodeGen r1 = r1.codeGen
            java.lang.String r1 = r1.paramListName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
        L3b:
            r0 = 0
            return r0
    }

    @Override // javassist.compiler.TypeChecker
    public int getMethodArgsLength(javassist.compiler.ast.ASTList r4) {
            r3 = this;
            r0 = r3
            javassist.compiler.JvstCodeGen r0 = r0.codeGen
            java.lang.String r0 = r0.paramListName
            r5 = r0
            r0 = 0
            r6 = r0
        La:
            r0 = r4
            if (r0 == 0) goto L4e
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.head()
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L43
            r0 = r7
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            r0 = r3
            javassist.compiler.JvstCodeGen r0 = r0.codeGen
            javassist.CtClass[] r0 = r0.paramTypeList
            if (r0 == 0) goto L46
            r0 = r6
            r1 = r3
            javassist.compiler.JvstCodeGen r1 = r1.codeGen
            javassist.CtClass[] r1 = r1.paramTypeList
            int r1 = r1.length
            int r0 = r0 + r1
            r6 = r0
            goto L46
        L43:
            int r6 = r6 + 1
        L46:
            r0 = r4
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r4 = r0
            goto La
        L4e:
            r0 = r6
            return r0
    }

    @Override // javassist.compiler.TypeChecker
    public void atMethodArgs(javassist.compiler.ast.ASTList r5, int[] r6, int[] r7, java.lang.String[] r8) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            javassist.compiler.JvstCodeGen r0 = r0.codeGen
            javassist.CtClass[] r0 = r0.paramTypeList
            r9 = r0
            r0 = r4
            javassist.compiler.JvstCodeGen r0 = r0.codeGen
            java.lang.String r0 = r0.paramListName
            r10 = r0
            r0 = 0
            r11 = r0
        L15:
            r0 = r5
            if (r0 == 0) goto La7
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.head()
            r12 = r0
            r0 = r12
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L7d
            r0 = r12
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7d
            r0 = r9
            if (r0 == 0) goto L9f
            r0 = r9
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r14 = r0
        L44:
            r0 = r14
            r1 = r13
            if (r0 >= r1) goto L7a
            r0 = r9
            r1 = r14
            r0 = r0[r1]
            r15 = r0
            r0 = r4
            r1 = r15
            r0.setType(r1)
            r0 = r6
            r1 = r11
            r2 = r4
            int r2 = r2.exprType
            r0[r1] = r2
            r0 = r7
            r1 = r11
            r2 = r4
            int r2 = r2.arrayDim
            r0[r1] = r2
            r0 = r8
            r1 = r11
            r2 = r4
            java.lang.String r2 = r2.className
            r0[r1] = r2
            int r11 = r11 + 1
            int r14 = r14 + 1
            goto L44
        L7a:
            goto L9f
        L7d:
            r0 = r12
            r1 = r4
            r0.accept(r1)
            r0 = r6
            r1 = r11
            r2 = r4
            int r2 = r2.exprType
            r0[r1] = r2
            r0 = r7
            r1 = r11
            r2 = r4
            int r2 = r2.arrayDim
            r0[r1] = r2
            r0 = r8
            r1 = r11
            r2 = r4
            java.lang.String r2 = r2.className
            r0[r1] = r2
            int r11 = r11 + 1
        L9f:
            r0 = r5
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r5 = r0
            goto L15
        La7:
            return
    }

    void compileInvokeSpecial(javassist.compiler.ast.ASTree r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, javassist.compiler.ast.ASTList r11) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            r1 = r6
            r0.accept(r1)
            r0 = r6
            r1 = r11
            int r0 = r0.getMethodArgsLength(r1)
            r12 = r0
            r0 = r6
            r1 = r11
            r2 = r12
            int[] r2 = new int[r2]
            r3 = r12
            int[] r3 = new int[r3]
            r4 = r12
            java.lang.String[] r4 = new java.lang.String[r4]
            r0.atMethodArgs(r1, r2, r3, r4)
            r0 = r6
            r1 = r10
            r0.setReturnType(r1)
            r0 = r6
            r0.addNullIfVoid()
            return
    }

    protected void compileUnwrapValue(javassist.CtClass r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            javassist.CtClass r1 = javassist.CtClass.voidType
            if (r0 != r1) goto Le
            r0 = r3
            r0.addNullIfVoid()
            goto L13
        Le:
            r0 = r3
            r1 = r4
            r0.setType(r1)
        L13:
            return
    }

    public void setType(javassist.CtClass r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.setType(r1, r2)
            return
    }

    private void setType(javassist.CtClass r6, int r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L24
            r0 = r6
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r8 = r0
            r0 = r5
            r1 = r8
            char r1 = r1.getDescriptor()
            int r1 = javassist.compiler.MemberResolver.descToType(r1)
            r0.exprType = r1
            r0 = r5
            r1 = r7
            r0.arrayDim = r1
            r0 = r5
            r1 = 0
            r0.className = r1
            goto L6f
        L24:
            r0 = r6
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L58
            r0 = r5
            r1 = r6
            javassist.CtClass r1 = r1.getComponentType()     // Catch: javassist.NotFoundException -> L39
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r0.setType(r1, r2)     // Catch: javassist.NotFoundException -> L39
            goto L6f
        L39:
            r8 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "undefined type: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L58:
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = r7
            r0.arrayDim = r1
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = javassist.compiler.MemberResolver.javaToJvmName(r1)
            r0.className = r1
        L6f:
            return
    }
}
