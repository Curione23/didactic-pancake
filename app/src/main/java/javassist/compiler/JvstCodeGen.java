package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/JvstCodeGen.class */
public class JvstCodeGen extends javassist.compiler.MemberCodeGen {
    java.lang.String paramArrayName;
    java.lang.String paramListName;
    javassist.CtClass[] paramTypeList;
    private int paramVarBase;
    private boolean useParam0;
    private java.lang.String param0Type;
    public static final java.lang.String sigName = "$sig";
    public static final java.lang.String dollarTypeName = "$type";
    public static final java.lang.String clazzName = "$class";
    private javassist.CtClass dollarType;
    javassist.CtClass returnType;
    java.lang.String returnCastName;
    private java.lang.String returnVarName;
    public static final java.lang.String wrapperCastName = "$w";
    java.lang.String proceedName;
    public static final java.lang.String cflowName = "$cflow";
    javassist.compiler.ProceedHandler procHandler;

    public JvstCodeGen(javassist.bytecode.Bytecode r8, javassist.CtClass r9, javassist.ClassPool r10) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3)
            r0 = r7
            r1 = 0
            r0.paramArrayName = r1
            r0 = r7
            r1 = 0
            r0.paramListName = r1
            r0 = r7
            r1 = 0
            r0.paramTypeList = r1
            r0 = r7
            r1 = 0
            r0.paramVarBase = r1
            r0 = r7
            r1 = 0
            r0.useParam0 = r1
            r0 = r7
            r1 = 0
            r0.param0Type = r1
            r0 = r7
            r1 = 0
            r0.dollarType = r1
            r0 = r7
            r1 = 0
            r0.returnType = r1
            r0 = r7
            r1 = 0
            r0.returnCastName = r1
            r0 = r7
            r1 = 0
            r0.returnVarName = r1
            r0 = r7
            r1 = 0
            r0.proceedName = r1
            r0 = r7
            r1 = 0
            r0.procHandler = r1
            r0 = r7
            javassist.compiler.JvstTypeChecker r1 = new javassist.compiler.JvstTypeChecker
            r2 = r1
            r3 = r9
            r4 = r10
            r5 = r7
            r2.<init>(r3, r4, r5)
            r0.setTypeChecker(r1)
            return
    }

    private int indexOfParam1() {
            r3 = this;
            r0 = r3
            int r0 = r0.paramVarBase
            r1 = r3
            boolean r1 = r1.useParam0
            if (r1 == 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            int r0 = r0 + r1
            return r0
    }

    public void setProceedHandler(javassist.compiler.ProceedHandler r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.proceedName = r1
            r0 = r3
            r1 = r4
            r0.procHandler = r1
            return
    }

    public void addNullIfVoid() {
            r3 = this;
            r0 = r3
            int r0 = r0.exprType
            r1 = 344(0x158, float:4.82E-43)
            if (r0 != r1) goto L24
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1
            r0.addOpcode(r1)
            r0 = r3
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r3
            r1 = 0
            r0.arrayDim = r1
            r0 = r3
            java.lang.String r1 = "java/lang/Object"
            r0.className = r1
        L24:
            return
    }

    @Override // javassist.compiler.MemberCodeGen, javassist.compiler.CodeGen, javassist.compiler.ast.Visitor
    public void atMember(javassist.compiler.ast.Member r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            java.lang.String r0 = r0.get()
            r7 = r0
            r0 = r7
            r1 = r5
            java.lang.String r1 = r1.paramArrayName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r5
            javassist.CtClass[] r1 = r1.paramTypeList
            r2 = r5
            int r2 = r2.indexOfParam1()
            int r0 = compileParameterList(r0, r1, r2)
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 1
            r0.arrayDim = r1
            r0 = r5
            java.lang.String r1 = "java/lang/Object"
            r0.className = r1
            goto Ld6
        L35:
            r0 = r7
            java.lang.String r1 = "$sig"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L72
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r5
            javassist.CtClass r1 = r1.returnType
            r2 = r5
            javassist.CtClass[] r2 = r2.paramTypeList
            java.lang.String r1 = javassist.bytecode.Descriptor.ofMethod(r1, r2)
            r0.addLdc(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "javassist/runtime/Desc"
            java.lang.String r2 = "getParams"
            java.lang.String r3 = "(Ljava/lang/String;)[Ljava/lang/Class;"
            r0.addInvokestatic(r1, r2, r3)
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 1
            r0.arrayDim = r1
            r0 = r5
            java.lang.String r1 = "java/lang/Class"
            r0.className = r1
            goto Ld6
        L72:
            r0 = r7
            java.lang.String r1 = "$type"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La3
            r0 = r5
            javassist.CtClass r0 = r0.dollarType
            if (r0 != 0) goto L8c
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "$type is not available"
            r1.<init>(r2)
            throw r0
        L8c:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r5
            javassist.CtClass r1 = r1.dollarType
            java.lang.String r1 = javassist.bytecode.Descriptor.of(r1)
            r0.addLdc(r1)
            r0 = r5
            java.lang.String r1 = "getType"
            r0.callGetType(r1)
            goto Ld6
        La3:
            r0 = r7
            java.lang.String r1 = "$class"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld1
            r0 = r5
            java.lang.String r0 = r0.param0Type
            if (r0 != 0) goto Lbd
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "$class is not available"
            r1.<init>(r2)
            throw r0
        Lbd:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r5
            java.lang.String r1 = r1.param0Type
            r0.addLdc(r1)
            r0 = r5
            java.lang.String r1 = "getClazz"
            r0.callGetType(r1)
            goto Ld6
        Ld1:
            r0 = r5
            r1 = r6
            super.atMember(r1)
        Ld6:
            return
    }

    private void callGetType(java.lang.String r6) {
            r5 = this;
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "javassist/runtime/Desc"
            r2 = r6
            java.lang.String r3 = "(Ljava/lang/String;)Ljava/lang/Class;"
            r0.addInvokestatic(r1, r2, r3)
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 0
            r0.arrayDim = r1
            r0 = r5
            java.lang.String r1 = "java/lang/Class"
            r0.className = r1
            return
    }

    @Override // javassist.compiler.MemberCodeGen, javassist.compiler.CodeGen
    protected void atFieldAssign(javassist.compiler.ast.Expr r8, int r9, javassist.compiler.ast.ASTree r10, javassist.compiler.ast.ASTree r11, boolean r12) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r10
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L8f
            r0 = r10
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r1 = r7
            java.lang.String r1 = r1.paramArrayName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = r9
            r1 = 61
            if (r0 == r1) goto L3c
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad operator for "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.String r3 = r3.paramArrayName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3c:
            r0 = r11
            r1 = r7
            r0.accept(r1)
            r0 = r7
            int r0 = r0.arrayDim
            r1 = 1
            if (r0 != r1) goto L54
            r0 = r7
            int r0 = r0.exprType
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L72
        L54:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "invalid type for "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.String r3 = r3.paramArrayName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L72:
            r0 = r7
            r1 = r7
            javassist.CtClass[] r1 = r1.paramTypeList
            r2 = r7
            javassist.bytecode.Bytecode r2 = r2.bytecode
            r0.atAssignParamList(r1, r2)
            r0 = r12
            if (r0 != 0) goto L9a
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 87
            r0.addOpcode(r1)
            goto L9a
        L8f:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            super.atFieldAssign(r1, r2, r3, r4, r5)
        L9a:
            return
    }

    protected void atAssignParamList(javassist.CtClass[] r6, javassist.bytecode.Bytecode r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r5
            int r0 = r0.indexOfParam1()
            r8 = r0
            r0 = r6
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L11:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L59
            r0 = r7
            r1 = 89
            r0.addOpcode(r1)
            r0 = r7
            r1 = r10
            r0.addIconst(r1)
            r0 = r7
            r1 = 50
            r0.addOpcode(r1)
            r0 = r5
            r1 = r6
            r2 = r10
            r1 = r1[r2]
            r2 = r7
            r0.compileUnwrapValue(r1, r2)
            r0 = r7
            r1 = r8
            r2 = r6
            r3 = r10
            r2 = r2[r3]
            int r0 = r0.addStore(r1, r2)
            r0 = r8
            r1 = r5
            int r1 = r1.exprType
            r2 = r5
            int r2 = r2.arrayDim
            boolean r1 = is2word(r1, r2)
            if (r1 == 0) goto L50
            r1 = 2
            goto L51
        L50:
            r1 = 1
        L51:
            int r0 = r0 + r1
            r8 = r0
            int r10 = r10 + 1
            goto L11
        L59:
            return
    }

    @Override // javassist.compiler.CodeGen, javassist.compiler.ast.Visitor
    public void atCastExpr(javassist.compiler.ast.CastExpr r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            javassist.compiler.ast.ASTList r0 = r0.getClassName()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L4e
            r0 = r4
            int r0 = r0.getArrayDim()
            if (r0 != 0) goto L4e
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.head()
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Symbol
            if (r0 == 0) goto L4e
            r0 = r5
            javassist.compiler.ast.ASTList r0 = r0.tail()
            if (r0 != 0) goto L4e
            r0 = r6
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0
            java.lang.String r0 = r0.get()
            r7 = r0
            r0 = r7
            r1 = r3
            java.lang.String r1 = r1.returnCastName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            r0 = r3
            r1 = r4
            r0.atCastToRtype(r1)
            return
        L3e:
            r0 = r7
            java.lang.String r1 = "$w"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
            r0 = r3
            r1 = r4
            r0.atCastToWrapper(r1)
            return
        L4e:
            r0 = r3
            r1 = r4
            super.atCastExpr(r1)
            return
    }

    protected void atCastToRtype(javassist.compiler.ast.CastExpr r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.getOprand()
            r1 = r4
            r0.accept(r1)
            r0 = r4
            int r0 = r0.exprType
            r1 = 344(0x158, float:4.82E-43)
            if (r0 == r1) goto L23
            r0 = r4
            int r0 = r0.exprType
            boolean r0 = isRefType(r0)
            if (r0 != 0) goto L23
            r0 = r4
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L32
        L23:
            r0 = r4
            r1 = r4
            javassist.CtClass r1 = r1.returnType
            r2 = r4
            javassist.bytecode.Bytecode r2 = r2.bytecode
            r0.compileUnwrapValue(r1, r2)
            goto L72
        L32:
            r0 = r4
            javassist.CtClass r0 = r0.returnType
            boolean r0 = r0 instanceof javassist.CtPrimitiveType
            if (r0 == 0) goto L67
            r0 = r4
            javassist.CtClass r0 = r0.returnType
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r6 = r0
            r0 = r6
            char r0 = r0.getDescriptor()
            int r0 = javassist.compiler.MemberResolver.descToType(r0)
            r7 = r0
            r0 = r4
            r1 = r4
            int r1 = r1.exprType
            r2 = r7
            r0.atNumCastExpr(r1, r2)
            r0 = r4
            r1 = r7
            r0.exprType = r1
            r0 = r4
            r1 = 0
            r0.arrayDim = r1
            r0 = r4
            r1 = 0
            r0.className = r1
            goto L72
        L67:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "invalid cast"
            r1.<init>(r2)
            throw r0
        L72:
            return
    }

    protected void atCastToWrapper(javassist.compiler.ast.CastExpr r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.getOprand()
            r1 = r6
            r0.accept(r1)
            r0 = r6
            int r0 = r0.exprType
            boolean r0 = isRefType(r0)
            if (r0 != 0) goto L19
            r0 = r6
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L1a
        L19:
            return
        L1a:
            r0 = r6
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r6
            int r1 = r1.exprType
            r2 = r6
            int r2 = r2.arrayDim
            r3 = r6
            java.lang.String r3 = r3.className
            javassist.CtClass r0 = r0.lookupClass(r1, r2, r3)
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof javassist.CtPrimitiveType
            if (r0 == 0) goto Lb3
            r0 = r8
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.getWrapperName()
            r10 = r0
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r10
            r0.addNew(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 89
            r0.addOpcode(r1)
            r0 = r9
            int r0 = r0.getDataSize()
            r1 = 1
            if (r0 <= r1) goto L66
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 94
            r0.addOpcode(r1)
            goto L6f
        L66:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 93
            r0.addOpcode(r1)
        L6f:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 88
            r0.addOpcode(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r10
            java.lang.String r2 = "<init>"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            java.lang.String r4 = "("
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r9
            char r4 = r4.getDescriptor()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ")V"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.addInvokespecial(r1, r2, r3)
            r0 = r6
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r6
            r1 = 0
            r0.arrayDim = r1
            r0 = r6
            java.lang.String r1 = "java/lang/Object"
            r0.className = r1
        Lb3:
            return
    }

    @Override // javassist.compiler.MemberCodeGen, javassist.compiler.CodeGen, javassist.compiler.ast.Visitor
    public void atCallExpr(javassist.compiler.ast.CallExpr r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L52
            r0 = r7
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r8 = r0
            r0 = r5
            javassist.compiler.ProceedHandler r0 = r0.procHandler
            if (r0 == 0) goto L3c
            r0 = r8
            r1 = r5
            java.lang.String r1 = r1.proceedName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            r0 = r5
            javassist.compiler.ProceedHandler r0 = r0.procHandler
            r1 = r5
            r2 = r5
            javassist.bytecode.Bytecode r2 = r2.bytecode
            r3 = r6
            javassist.compiler.ast.ASTree r3 = r3.oprand2()
            javassist.compiler.ast.ASTList r3 = (javassist.compiler.ast.ASTList) r3
            r0.doit(r1, r2, r3)
            return
        L3c:
            r0 = r8
            java.lang.String r1 = "$cflow"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            r0 = r5
            r1 = r6
            javassist.compiler.ast.ASTree r1 = r1.oprand2()
            javassist.compiler.ast.ASTList r1 = (javassist.compiler.ast.ASTList) r1
            r0.atCflow(r1)
            return
        L52:
            r0 = r5
            r1 = r6
            super.atCallExpr(r1)
            return
    }

    protected void atCflow(javassist.compiler.ast.ASTList r6) throws javassist.compiler.CompileError {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L13
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.tail()
            if (r0 == 0) goto L1e
        L13:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad $cflow"
            r1.<init>(r2)
            throw r0
        L1e:
            r0 = r7
            r1 = r6
            javassist.compiler.ast.ASTree r1 = r1.head()
            makeCflowName(r0, r1)
            r0 = r7
            java.lang.String r0 = r0.toString()
            r8 = r0
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r8
            java.lang.Object[] r0 = r0.lookupCflow(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L59
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "no such $cflow: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L59:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r9
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = (java.lang.String) r1
            r2 = r9
            r3 = 1
            r2 = r2[r3]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "Ljavassist/runtime/Cflow;"
            r0.addGetstatic(r1, r2, r3)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "javassist.runtime.Cflow"
            java.lang.String r2 = "value"
            java.lang.String r3 = "()I"
            r0.addInvokevirtual(r1, r2, r3)
            r0 = r5
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 0
            r0.arrayDim = r1
            r0 = r5
            r1 = 0
            r0.className = r1
            return
    }

    private static void makeCflowName(java.lang.StringBuilder r4, javassist.compiler.ast.ASTree r5) throws javassist.compiler.CompileError {
            r0 = r5
            boolean r0 = r0 instanceof javassist.compiler.ast.Symbol
            if (r0 == 0) goto L14
            r0 = r4
            r1 = r5
            javassist.compiler.ast.Symbol r1 = (javassist.compiler.ast.Symbol) r1
            java.lang.String r1 = r1.get()
            java.lang.StringBuilder r0 = r0.append(r1)
            return
        L14:
            r0 = r5
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L41
            r0 = r5
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r6 = r0
            r0 = r6
            int r0 = r0.getOperator()
            r1 = 46
            if (r0 != r1) goto L41
            r0 = r4
            r1 = r6
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            makeCflowName(r0, r1)
            r0 = r4
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r6
            javassist.compiler.ast.ASTree r1 = r1.oprand2()
            makeCflowName(r0, r1)
            return
        L41:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad $cflow"
            r1.<init>(r2)
            throw r0
    }

    public boolean isParamListName(javassist.compiler.ast.ASTList r4) {
            r3 = this;
            r0 = r3
            javassist.CtClass[] r0 = r0.paramTypeList
            if (r0 == 0) goto L35
            r0 = r4
            if (r0 == 0) goto L35
            r0 = r4
            javassist.compiler.ast.ASTList r0 = r0.tail()
            if (r0 != 0) goto L35
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.head()
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L33
            r0 = r5
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r1 = r3
            java.lang.String r1 = r1.paramListName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
        L35:
            r0 = 0
            return r0
    }

    @Override // javassist.compiler.MemberCodeGen
    public int getMethodArgsLength(javassist.compiler.ast.ASTList r4) {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.paramListName
            r5 = r0
            r0 = 0
            r6 = r0
        L7:
            r0 = r4
            if (r0 == 0) goto L45
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.head()
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L3a
            r0 = r7
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3a
            r0 = r3
            javassist.CtClass[] r0 = r0.paramTypeList
            if (r0 == 0) goto L3d
            r0 = r6
            r1 = r3
            javassist.CtClass[] r1 = r1.paramTypeList
            int r1 = r1.length
            int r0 = r0 + r1
            r6 = r0
            goto L3d
        L3a:
            int r6 = r6 + 1
        L3d:
            r0 = r4
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r4 = r0
            goto L7
        L45:
            r0 = r6
            return r0
    }

    @Override // javassist.compiler.MemberCodeGen
    public void atMethodArgs(javassist.compiler.ast.ASTList r6, int[] r7, int[] r8, java.lang.String[] r9) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.CtClass[] r0 = r0.paramTypeList
            r10 = r0
            r0 = r5
            java.lang.String r0 = r0.paramListName
            r11 = r0
            r0 = 0
            r12 = r0
        Lf:
            r0 = r6
            if (r0 == 0) goto Lb7
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.head()
            r13 = r0
            r0 = r13
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L8d
            r0 = r13
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8d
            r0 = r10
            if (r0 == 0) goto Laf
            r0 = r10
            int r0 = r0.length
            r14 = r0
            r0 = r5
            int r0 = r0.indexOfParam1()
            r15 = r0
            r0 = 0
            r16 = r0
        L44:
            r0 = r16
            r1 = r14
            if (r0 >= r1) goto L8a
            r0 = r10
            r1 = r16
            r0 = r0[r1]
            r17 = r0
            r0 = r15
            r1 = r5
            javassist.bytecode.Bytecode r1 = r1.bytecode
            r2 = r15
            r3 = r17
            int r1 = r1.addLoad(r2, r3)
            int r0 = r0 + r1
            r15 = r0
            r0 = r5
            r1 = r17
            r0.setType(r1)
            r0 = r7
            r1 = r12
            r2 = r5
            int r2 = r2.exprType
            r0[r1] = r2
            r0 = r8
            r1 = r12
            r2 = r5
            int r2 = r2.arrayDim
            r0[r1] = r2
            r0 = r9
            r1 = r12
            r2 = r5
            java.lang.String r2 = r2.className
            r0[r1] = r2
            int r12 = r12 + 1
            int r16 = r16 + 1
            goto L44
        L8a:
            goto Laf
        L8d:
            r0 = r13
            r1 = r5
            r0.accept(r1)
            r0 = r7
            r1 = r12
            r2 = r5
            int r2 = r2.exprType
            r0[r1] = r2
            r0 = r8
            r1 = r12
            r2 = r5
            int r2 = r2.arrayDim
            r0[r1] = r2
            r0 = r9
            r1 = r12
            r2 = r5
            java.lang.String r2 = r2.className
            r0[r1] = r2
            int r12 = r12 + 1
        Laf:
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r6 = r0
            goto Lf
        Lb7:
            return
    }

    void compileInvokeSpecial(javassist.compiler.ast.ASTree r7, int r8, java.lang.String r9, javassist.compiler.ast.ASTList r10) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            r1 = r6
            r0.accept(r1)
            r0 = r6
            r1 = r10
            int r0 = r0.getMethodArgsLength(r1)
            r11 = r0
            r0 = r6
            r1 = r10
            r2 = r11
            int[] r2 = new int[r2]
            r3 = r11
            int[] r3 = new int[r3]
            r4 = r11
            java.lang.String[] r4 = new java.lang.String[r4]
            r0.atMethodArgs(r1, r2, r3, r4)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r8
            r2 = r9
            r0.addInvokespecial(r1, r2)
            r0 = r6
            r1 = r9
            r2 = 0
            r3 = 0
            r0.setReturnType(r1, r2, r3)
            r0 = r6
            r0.addNullIfVoid()
            return
    }

    @Override // javassist.compiler.CodeGen
    protected void atReturnStmnt(javassist.compiler.ast.Stmnt r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L47
            r0 = r3
            javassist.CtClass r0 = r0.returnType
            javassist.CtClass r1 = javassist.CtClass.voidType
            if (r0 != r1) goto L47
            r0 = r3
            r1 = r5
            r0.compileExpr(r1)
            r0 = r3
            int r0 = r0.exprType
            r1 = r3
            int r1 = r1.arrayDim
            boolean r0 = is2word(r0, r1)
            if (r0 == 0) goto L32
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 88
            r0.addOpcode(r1)
            goto L45
        L32:
            r0 = r3
            int r0 = r0.exprType
            r1 = 344(0x158, float:4.82E-43)
            if (r0 == r1) goto L45
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 87
            r0.addOpcode(r1)
        L45:
            r0 = 0
            r5 = r0
        L47:
            r0 = r3
            r1 = r5
            r0.atReturnStmnt2(r1)
            return
    }

    public int recordReturnType(javassist.CtClass r8, java.lang.String r9, java.lang.String r10, javassist.compiler.SymbolTable r11) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r7
            r1 = r8
            r0.returnType = r1
            r0 = r7
            r1 = r9
            r0.returnCastName = r1
            r0 = r7
            r1 = r10
            r0.returnVarName = r1
            r0 = r10
            if (r0 != 0) goto L15
            r0 = -1
            return r0
        L15:
            r0 = r7
            int r0 = r0.getMaxLocals()
            r12 = r0
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r12
            r5 = r11
            int r1 = r1.recordVar(r2, r3, r4, r5)
            int r0 = r0 + r1
            r13 = r0
            r0 = r7
            r1 = r13
            r0.setMaxLocals(r1)
            r0 = r12
            return r0
    }

    public void recordType(javassist.CtClass r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.dollarType = r1
            return
    }

    public int recordParams(javassist.CtClass[] r12, boolean r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, javassist.compiler.SymbolTable r17) throws javassist.compiler.CompileError {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r13
            if (r6 != 0) goto L10
            r6 = 1
            goto L11
        L10:
            r6 = 0
        L11:
            r7 = 0
            r8 = r11
            java.lang.String r8 = r8.getThisName()
            r9 = r17
            int r0 = r0.recordParams(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public int recordParams(javassist.CtClass[] r11, boolean r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16, int r17, java.lang.String r18, javassist.compiler.SymbolTable r19) throws javassist.compiler.CompileError {
            r10 = this;
            r0 = r10
            r1 = r11
            r0.paramTypeList = r1
            r0 = r10
            r1 = r14
            r0.paramArrayName = r1
            r0 = r10
            r1 = r15
            r0.paramListName = r1
            r0 = r10
            r1 = r17
            r0.paramVarBase = r1
            r0 = r10
            r1 = r16
            r0.useParam0 = r1
            r0 = r18
            if (r0 == 0) goto L2b
            r0 = r10
            r1 = r18
            java.lang.String r1 = javassist.compiler.MemberResolver.jvmToJavaName(r1)
            r0.param0Type = r1
        L2b:
            r0 = r10
            r1 = r12
            r0.inStaticMethod = r1
            r0 = r17
            r20 = r0
            r0 = r16
            if (r0 == 0) goto L78
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r13
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "0"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r21 = r0
            javassist.compiler.ast.Declarator r0 = new javassist.compiler.ast.Declarator
            r1 = r0
            r2 = 307(0x133, float:4.3E-43)
            r3 = r18
            java.lang.String r3 = javassist.compiler.MemberResolver.javaToJvmName(r3)
            r4 = 0
            r5 = r20
            int r20 = r20 + 1
            javassist.compiler.ast.Symbol r6 = new javassist.compiler.ast.Symbol
            r7 = r6
            r8 = r21
            r7.<init>(r8)
            r1.<init>(r2, r3, r4, r5, r6)
            r22 = r0
            r0 = r19
            r1 = r21
            r2 = r22
            r0.append(r1, r2)
        L78:
            r0 = 0
            r21 = r0
        L7b:
            r0 = r21
            r1 = r11
            int r1 = r1.length
            if (r0 >= r1) goto Lae
            r0 = r20
            r1 = r10
            r2 = r11
            r3 = r21
            r2 = r2[r3]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r13
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r21
            r5 = 1
            int r4 = r4 + r5
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r20
            r5 = r19
            int r1 = r1.recordVar(r2, r3, r4, r5)
            int r0 = r0 + r1
            r20 = r0
            int r21 = r21 + 1
            goto L7b
        Lae:
            r0 = r10
            int r0 = r0.getMaxLocals()
            r1 = r20
            if (r0 >= r1) goto Lbd
            r0 = r10
            r1 = r20
            r0.setMaxLocals(r1)
        Lbd:
            r0 = r20
            return r0
    }

    public int recordVariable(javassist.CtClass r8, java.lang.String r9, javassist.compiler.SymbolTable r10) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r9
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r7
            int r0 = r0.getMaxLocals()
            r11 = r0
            r0 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r5 = r10
            int r1 = r1.recordVar(r2, r3, r4, r5)
            int r0 = r0 + r1
            r12 = r0
            r0 = r7
            r1 = r12
            r0.setMaxLocals(r1)
            r0 = r11
            return r0
    }

    private int recordVar(javassist.CtClass r11, java.lang.String r12, int r13, javassist.compiler.SymbolTable r14) throws javassist.compiler.CompileError {
            r10 = this;
            r0 = r11
            javassist.CtClass r1 = javassist.CtClass.voidType
            if (r0 != r1) goto L1c
            r0 = r10
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r10
            r1 = 0
            r0.arrayDim = r1
            r0 = r10
            java.lang.String r1 = "java/lang/Object"
            r0.className = r1
            goto L21
        L1c:
            r0 = r10
            r1 = r11
            r0.setType(r1)
        L21:
            javassist.compiler.ast.Declarator r0 = new javassist.compiler.ast.Declarator
            r1 = r0
            r2 = r10
            int r2 = r2.exprType
            r3 = r10
            java.lang.String r3 = r3.className
            r4 = r10
            int r4 = r4.arrayDim
            r5 = r13
            javassist.compiler.ast.Symbol r6 = new javassist.compiler.ast.Symbol
            r7 = r6
            r8 = r12
            r7.<init>(r8)
            r1.<init>(r2, r3, r4, r5, r6)
            r15 = r0
            r0 = r14
            r1 = r12
            r2 = r15
            r0.append(r1, r2)
            r0 = r10
            int r0 = r0.exprType
            r1 = r10
            int r1 = r1.arrayDim
            boolean r0 = is2word(r0, r1)
            if (r0 == 0) goto L59
            r0 = 2
            goto L5a
        L59:
            r0 = 1
        L5a:
            return r0
    }

    public void recordVariable(java.lang.String r11, java.lang.String r12, int r13, javassist.compiler.SymbolTable r14) throws javassist.compiler.CompileError {
            r10 = this;
            r0 = 0
            r16 = r0
        L3:
            r0 = r11
            r1 = r16
            char r0 = r0.charAt(r1)
            r1 = r0
            r15 = r1
            r1 = 91
            if (r0 != r1) goto L17
            int r16 = r16 + 1
            goto L3
        L17:
            r0 = r15
            int r0 = javassist.compiler.MemberResolver.descToType(r0)
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = r17
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L4e
            r0 = r16
            if (r0 != 0) goto L3e
            r0 = r11
            r1 = 1
            r2 = r11
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r18 = r0
            goto L4e
        L3e:
            r0 = r11
            r1 = r16
            r2 = 1
            int r1 = r1 + r2
            r2 = r11
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r18 = r0
        L4e:
            javassist.compiler.ast.Declarator r0 = new javassist.compiler.ast.Declarator
            r1 = r0
            r2 = r17
            r3 = r18
            r4 = r16
            r5 = r13
            javassist.compiler.ast.Symbol r6 = new javassist.compiler.ast.Symbol
            r7 = r6
            r8 = r12
            r7.<init>(r8)
            r1.<init>(r2, r3, r4, r5, r6)
            r19 = r0
            r0 = r14
            r1 = r12
            r2 = r19
            r0.append(r1, r2)
            return
    }

    public static int compileParameterList(javassist.bytecode.Bytecode r6, javassist.CtClass[] r7, int r8) {
            r0 = r7
            if (r0 != 0) goto L12
            r0 = r6
            r1 = 0
            r0.addIconst(r1)
            r0 = r6
            java.lang.String r1 = "java.lang.Object"
            r0.addAnewarray(r1)
            r0 = 1
            return r0
        L12:
            r0 = 1
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r9 = r0
            r0 = r7
            int r0 = r0.length
            r10 = r0
            r0 = r6
            r1 = r10
            r0.addIconst(r1)
            r0 = r6
            java.lang.String r1 = "java.lang.Object"
            r0.addAnewarray(r1)
            r0 = 0
            r11 = r0
        L2b:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L9e
            r0 = r6
            r1 = 89
            r0.addOpcode(r1)
            r0 = r6
            r1 = r11
            r0.addIconst(r1)
            r0 = r7
            r1 = r11
            r0 = r0[r1]
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L8a
            r0 = r7
            r1 = r11
            r0 = r0[r1]
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r12 = r0
            r0 = r12
            java.lang.String r0 = r0.getWrapperName()
            r13 = r0
            r0 = r6
            r1 = r13
            r0.addNew(r1)
            r0 = r6
            r1 = 89
            r0.addOpcode(r1)
            r0 = r6
            r1 = r8
            r2 = r12
            int r0 = r0.addLoad(r1, r2)
            r14 = r0
            r0 = r8
            r1 = r14
            int r0 = r0 + r1
            r8 = r0
            r0 = r9
            r1 = 0
            r2 = r12
            r0[r1] = r2
            r0 = r6
            r1 = r13
            java.lang.String r2 = "<init>"
            javassist.CtClass r3 = javassist.CtClass.voidType
            r4 = r9
            java.lang.String r3 = javassist.bytecode.Descriptor.ofMethod(r3, r4)
            r0.addInvokespecial(r1, r2, r3)
            goto L92
        L8a:
            r0 = r6
            r1 = r8
            r0.addAload(r1)
            int r8 = r8 + 1
        L92:
            r0 = r6
            r1 = 83
            r0.addOpcode(r1)
            int r11 = r11 + 1
            goto L2b
        L9e:
            r0 = 8
            return r0
    }

    protected void compileUnwrapValue(javassist.CtClass r6, javassist.bytecode.Bytecode r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.voidType
            if (r0 != r1) goto Lc
            r0 = r5
            r0.addNullIfVoid()
            return
        Lc:
            r0 = r5
            int r0 = r0.exprType
            r1 = 344(0x158, float:4.82E-43)
            if (r0 != r1) goto L34
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "invalid type for "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.returnCastName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L34:
            r0 = r6
            boolean r0 = r0 instanceof javassist.CtPrimitiveType
            if (r0 == 0) goto L62
            r0 = r6
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getWrapperName()
            r9 = r0
            r0 = r7
            r1 = r9
            r0.addCheckcast(r1)
            r0 = r7
            r1 = r9
            r2 = r8
            java.lang.String r2 = r2.getGetMethodName()
            r3 = r8
            java.lang.String r3 = r3.getGetMethodDescriptor()
            r0.addInvokevirtual(r1, r2, r3)
            r0 = r5
            r1 = r6
            r0.setType(r1)
            goto L6c
        L62:
            r0 = r7
            r1 = r6
            r0.addCheckcast(r1)
            r0 = r5
            r1 = r6
            r0.setType(r1)
        L6c:
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
            goto L70
        L24:
            r0 = r6
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L59
            r0 = r5
            r1 = r6
            javassist.CtClass r1 = r1.getComponentType()     // Catch: javassist.NotFoundException -> L39
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r0.setType(r1, r2)     // Catch: javassist.NotFoundException -> L39
            goto L70
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
        L59:
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
        L70:
            return
    }

    public void doNumCast(javassist.CtClass r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            int r0 = r0.arrayDim
            if (r0 != 0) goto L3a
            r0 = r4
            int r0 = r0.exprType
            boolean r0 = isRefType(r0)
            if (r0 != 0) goto L3a
            r0 = r5
            boolean r0 = r0 instanceof javassist.CtPrimitiveType
            if (r0 == 0) goto L2f
            r0 = r5
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r6 = r0
            r0 = r4
            r1 = r4
            int r1 = r1.exprType
            r2 = r6
            char r2 = r2.getDescriptor()
            int r2 = javassist.compiler.MemberResolver.descToType(r2)
            r0.atNumCastExpr(r1, r2)
            goto L3a
        L2f:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "type mismatch"
            r1.<init>(r2)
            throw r0
        L3a:
            return
    }
}
