package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/TypeChecker.class */
public class TypeChecker extends javassist.compiler.ast.Visitor implements javassist.bytecode.Opcode, javassist.compiler.TokenId {
    static final java.lang.String javaLangObject = "java.lang.Object";
    static final java.lang.String jvmJavaLangObject = "java/lang/Object";
    static final java.lang.String jvmJavaLangString = "java/lang/String";
    static final java.lang.String jvmJavaLangClass = "java/lang/Class";
    protected int exprType;
    protected int arrayDim;
    protected java.lang.String className;
    protected javassist.compiler.MemberResolver resolver;
    protected javassist.CtClass thisClass;
    protected javassist.bytecode.MethodInfo thisMethod;

    public TypeChecker(javassist.CtClass r6, javassist.ClassPool r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            javassist.compiler.MemberResolver r1 = new javassist.compiler.MemberResolver
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.resolver = r1
            r0 = r5
            r1 = r6
            r0.thisClass = r1
            r0 = r5
            r1 = 0
            r0.thisMethod = r1
            return
    }

    protected static java.lang.String argTypesToString(int[] r6, int[] r7, java.lang.String[] r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            int r0 = r0.length
            r10 = r0
            r0 = r10
            if (r0 <= 0) goto L40
            r0 = 0
            r11 = r0
        L1b:
            r0 = r9
            r1 = r6
            r2 = r11
            r1 = r1[r2]
            r2 = r7
            r3 = r11
            r2 = r2[r3]
            r3 = r8
            r4 = r11
            r3 = r3[r4]
            java.lang.StringBuilder r0 = typeToString(r0, r1, r2, r3)
            int r11 = r11 + 1
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L40
            r0 = r9
            r1 = 44
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L1b
        L40:
            r0 = r9
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected static java.lang.StringBuilder typeToString(java.lang.StringBuilder r3, int r4, int r5, java.lang.String r6) {
            r0 = r4
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L10
            r0 = r6
            java.lang.String r0 = javassist.compiler.MemberResolver.jvmToJavaName(r0)
            r7 = r0
            goto L2d
        L10:
            r0 = r4
            r1 = 412(0x19c, float:5.77E-43)
            if (r0 != r1) goto L1e
            java.lang.String r0 = "Object"
            r7 = r0
            goto L2d
        L1e:
            r0 = r4
            java.lang.String r0 = javassist.compiler.MemberResolver.getTypeName(r0)     // Catch: javassist.compiler.CompileError -> L27
            r7 = r0
            goto L2d
        L27:
            r8 = move-exception
            java.lang.String r0 = "?"
            r7 = r0
        L2d:
            r0 = r3
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
        L34:
            r0 = r5
            int r5 = r5 + (-1)
            if (r0 <= 0) goto L45
            r0 = r3
            java.lang.String r1 = "[]"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L34
        L45:
            r0 = r3
            return r0
    }

    public void setThisMethod(javassist.bytecode.MethodInfo r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.thisMethod = r1
            return
    }

    protected static void fatal() throws javassist.compiler.CompileError {
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "fatal"
            r1.<init>(r2)
            throw r0
    }

    protected java.lang.String getThisName() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.thisClass
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = javassist.compiler.MemberResolver.javaToJvmName(r0)
            return r0
    }

    protected java.lang.String getSuperName() throws javassist.compiler.CompileError {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.thisClass
            javassist.CtClass r0 = javassist.compiler.MemberResolver.getSuperclass(r0)
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = javassist.compiler.MemberResolver.javaToJvmName(r0)
            return r0
    }

    protected java.lang.String resolveClassName(javassist.compiler.ast.ASTList r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r4
            java.lang.String r0 = r0.resolveClassName(r1)
            return r0
    }

    protected java.lang.String resolveClassName(java.lang.String r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r4
            java.lang.String r0 = r0.resolveJvmClassName(r1)
            return r0
    }

    @Override // javassist.compiler.ast.Visitor
    public void atNewExpr(javassist.compiler.ast.NewExpr r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Lf
            r0 = r5
            r1 = r6
            r0.atNewArrayExpr(r1)
            goto L44
        Lf:
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r6
            javassist.compiler.ast.ASTList r1 = r1.getClassName()
            javassist.CtClass r0 = r0.lookupClassByName(r1)
            r7 = r0
            r0 = r7
            java.lang.String r0 = r0.getName()
            r8 = r0
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.getArguments()
            r9 = r0
            r0 = r5
            r1 = r7
            java.lang.String r2 = "<init>"
            r3 = r9
            javassist.compiler.MemberResolver$Method r0 = r0.atMethodCallCore(r1, r2, r3)
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 0
            r0.arrayDim = r1
            r0 = r5
            r1 = r8
            java.lang.String r1 = javassist.compiler.MemberResolver.javaToJvmName(r1)
            r0.className = r1
        L44:
            return
    }

    public void atNewArrayExpr(javassist.compiler.ast.NewExpr r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            int r0 = r0.getArrayType()
            r7 = r0
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.getArraySize()
            r8 = r0
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.getClassName()
            r9 = r0
            r0 = r6
            javassist.compiler.ast.ArrayInit r0 = r0.getInitializer()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L21
            r0 = r10
            r1 = r5
            r0.accept(r1)
        L21:
            r0 = r8
            int r0 = r0.length()
            r1 = 1
            if (r0 <= r1) goto L34
            r0 = r5
            r1 = r7
            r2 = r9
            r3 = r8
            r0.atMultiNewArray(r1, r2, r3)
            goto L68
        L34:
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.head()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L45
            r0 = r11
            r1 = r5
            r0.accept(r1)
        L45:
            r0 = r5
            r1 = r7
            r0.exprType = r1
            r0 = r5
            r1 = 1
            r0.arrayDim = r1
            r0 = r7
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L63
            r0 = r5
            r1 = r5
            r2 = r9
            java.lang.String r1 = r1.resolveClassName(r2)
            r0.className = r1
            goto L68
        L63:
            r0 = r5
            r1 = 0
            r0.className = r1
        L68:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atArrayInit(javassist.compiler.ast.ArrayInit r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r5 = r0
        L2:
            r0 = r5
            if (r0 == 0) goto L1c
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.head()
            r6 = r0
            r0 = r5
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r5 = r0
            r0 = r6
            if (r0 == 0) goto L19
            r0 = r6
            r1 = r3
            r0.accept(r1)
        L19:
            goto L2
        L1c:
            return
    }

    protected void atMultiNewArray(int r5, javassist.compiler.ast.ASTList r6, javassist.compiler.ast.ASTList r7) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r7
            int r0 = r0.length()
            r9 = r0
            r0 = 0
            r8 = r0
        L9:
            r0 = r7
            if (r0 == 0) goto L2c
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.head()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L1b
            goto L2c
        L1b:
            int r8 = r8 + 1
            r0 = r10
            r1 = r4
            r0.accept(r1)
            r0 = r7
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r7 = r0
            goto L9
        L2c:
            r0 = r4
            r1 = r5
            r0.exprType = r1
            r0 = r4
            r1 = r9
            r0.arrayDim = r1
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L4a
            r0 = r4
            r1 = r4
            r2 = r6
            java.lang.String r1 = r1.resolveClassName(r2)
            r0.className = r1
            goto L4f
        L4a:
            r0 = r4
            r1 = 0
            r0.className = r1
        L4f:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atAssignExpr(javassist.compiler.ast.AssignExpr r8) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r8
            int r0 = r0.getOperator()
            r9 = r0
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r10 = r0
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            r11 = r0
            r0 = r10
            boolean r0 = r0 instanceof javassist.compiler.ast.Variable
            if (r0 == 0) goto L2d
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            javassist.compiler.ast.Variable r3 = (javassist.compiler.ast.Variable) r3
            r4 = r10
            javassist.compiler.ast.Variable r4 = (javassist.compiler.ast.Variable) r4
            javassist.compiler.ast.Declarator r4 = r4.getDeclarator()
            r5 = r11
            r0.atVariableAssign(r1, r2, r3, r4, r5)
            goto L5a
        L2d:
            r0 = r10
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L51
            r0 = r10
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r12 = r0
            r0 = r12
            int r0 = r0.getOperator()
            r1 = 65
            if (r0 != r1) goto L51
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            javassist.compiler.ast.Expr r3 = (javassist.compiler.ast.Expr) r3
            r4 = r11
            r0.atArrayAssign(r1, r2, r3, r4)
            return
        L51:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.atFieldAssign(r1, r2, r3, r4)
        L5a:
            return
    }

    private void atVariableAssign(javassist.compiler.ast.Expr r4, int r5, javassist.compiler.ast.Variable r6, javassist.compiler.ast.Declarator r7, javassist.compiler.ast.ASTree r8) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r7
            int r0 = r0.getType()
            r9 = r0
            r0 = r7
            int r0 = r0.getArrayDim()
            r10 = r0
            r0 = r7
            java.lang.String r0 = r0.getClassName()
            r11 = r0
            r0 = r5
            r1 = 61
            if (r0 == r1) goto L20
            r0 = r3
            r1 = r6
            r0.atVariable(r1)
        L20:
            r0 = r8
            r1 = r3
            r0.accept(r1)
            r0 = r3
            r1 = r9
            r0.exprType = r1
            r0 = r3
            r1 = r10
            r0.arrayDim = r1
            r0 = r3
            r1 = r11
            r0.className = r1
            return
    }

    private void atArrayAssign(javassist.compiler.ast.Expr r5, int r6, javassist.compiler.ast.Expr r7, javassist.compiler.ast.ASTree r8) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r7
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            r2 = r7
            javassist.compiler.ast.ASTree r2 = r2.oprand2()
            r0.atArrayRead(r1, r2)
            r0 = r4
            int r0 = r0.exprType
            r9 = r0
            r0 = r4
            int r0 = r0.arrayDim
            r10 = r0
            r0 = r4
            java.lang.String r0 = r0.className
            r11 = r0
            r0 = r8
            r1 = r4
            r0.accept(r1)
            r0 = r4
            r1 = r9
            r0.exprType = r1
            r0 = r4
            r1 = r10
            r0.arrayDim = r1
            r0 = r4
            r1 = r11
            r0.className = r1
            return
    }

    protected void atFieldAssign(javassist.compiler.ast.Expr r4, int r5, javassist.compiler.ast.ASTree r6, javassist.compiler.ast.ASTree r7) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = r6
            javassist.CtField r0 = r0.fieldAccess(r1)
            r8 = r0
            r0 = r3
            r1 = r8
            r0.atFieldRead(r1)
            r0 = r3
            int r0 = r0.exprType
            r9 = r0
            r0 = r3
            int r0 = r0.arrayDim
            r10 = r0
            r0 = r3
            java.lang.String r0 = r0.className
            r11 = r0
            r0 = r7
            r1 = r3
            r0.accept(r1)
            r0 = r3
            r1 = r9
            r0.exprType = r1
            r0 = r3
            r1 = r10
            r0.arrayDim = r1
            r0 = r3
            r1 = r11
            r0.className = r1
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atCondExpr(javassist.compiler.ast.CondExpr r8) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r7
            r1 = r8
            javassist.compiler.ast.ASTree r1 = r1.condExpr()
            r0.booleanExpr(r1)
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.thenExpr()
            r1 = r7
            r0.accept(r1)
            r0 = r7
            int r0 = r0.exprType
            r9 = r0
            r0 = r7
            int r0 = r0.arrayDim
            r10 = r0
            r0 = r7
            java.lang.String r0 = r0.className
            r11 = r0
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.elseExpr()
            r1 = r7
            r0.accept(r1)
            r0 = r10
            if (r0 != 0) goto L77
            r0 = r10
            r1 = r7
            int r1 = r1.arrayDim
            if (r0 != r1) goto L77
            r0 = r9
            r1 = r7
            int r1 = r1.exprType
            boolean r0 = javassist.compiler.CodeGen.rightIsStrong(r0, r1)
            if (r0 == 0) goto L56
            r0 = r8
            javassist.compiler.ast.CastExpr r1 = new javassist.compiler.ast.CastExpr
            r2 = r1
            r3 = r7
            int r3 = r3.exprType
            r4 = 0
            r5 = r8
            javassist.compiler.ast.ASTree r5 = r5.thenExpr()
            r2.<init>(r3, r4, r5)
            r0.setThen(r1)
            goto L77
        L56:
            r0 = r7
            int r0 = r0.exprType
            r1 = r9
            boolean r0 = javassist.compiler.CodeGen.rightIsStrong(r0, r1)
            if (r0 == 0) goto L77
            r0 = r8
            javassist.compiler.ast.CastExpr r1 = new javassist.compiler.ast.CastExpr
            r2 = r1
            r3 = r9
            r4 = 0
            r5 = r8
            javassist.compiler.ast.ASTree r5 = r5.elseExpr()
            r2.<init>(r3, r4, r5)
            r0.setElse(r1)
            r0 = r7
            r1 = r9
            r0.exprType = r1
        L77:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atBinExpr(javassist.compiler.ast.BinExpr r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            int r0 = r0.getOperator()
            r8 = r0
            r0 = r8
            int r0 = javassist.compiler.CodeGen.lookupBinOp(r0)
            r9 = r0
            r0 = r9
            if (r0 < 0) goto L82
            r0 = r8
            r1 = 43
            if (r0 != r1) goto L4c
            r0 = r6
            r1 = r7
            javassist.compiler.ast.Expr r0 = r0.atPlusExpr(r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L49
            r0 = 46
            r1 = r10
            javassist.compiler.ast.Member r2 = new javassist.compiler.ast.Member
            r3 = r2
            java.lang.String r4 = "toString"
            r3.<init>(r4)
            javassist.compiler.ast.Expr r0 = javassist.compiler.ast.Expr.make(r0, r1, r2)
            r1 = 0
            javassist.compiler.ast.CallExpr r0 = javassist.compiler.ast.CallExpr.makeCall(r0, r1)
            r10 = r0
            r0 = r7
            r1 = r10
            r0.setOprand1(r1)
            r0 = r7
            r1 = 0
            r0.setOprand2(r1)
            r0 = r6
            java.lang.String r1 = "java/lang/String"
            r0.className = r1
        L49:
            goto L87
        L4c:
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r10 = r0
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            r11 = r0
            r0 = r10
            r1 = r6
            r0.accept(r1)
            r0 = r6
            int r0 = r0.exprType
            r12 = r0
            r0 = r11
            r1 = r6
            r0.accept(r1)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r11
            boolean r0 = r0.isConstant(r1, r2, r3, r4)
            if (r0 != 0) goto L7f
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r12
            r0.computeBinExprType(r1, r2, r3)
        L7f:
            goto L87
        L82:
            r0 = r6
            r1 = r7
            r0.booleanExpr(r1)
        L87:
            return
    }

    private javassist.compiler.ast.Expr atPlusExpr(javassist.compiler.ast.BinExpr r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r8 = r0
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L15
            r0 = r8
            r1 = r6
            r0.accept(r1)
            r0 = 0
            return r0
        L15:
            r0 = r8
            boolean r0 = isPlusExpr(r0)
            if (r0 == 0) goto L4d
            r0 = r6
            r1 = r8
            javassist.compiler.ast.BinExpr r1 = (javassist.compiler.ast.BinExpr) r1
            javassist.compiler.ast.Expr r0 = r0.atPlusExpr(r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L4a
            r0 = r9
            r1 = r6
            r0.accept(r1)
            r0 = r6
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r6
            r1 = 0
            r0.arrayDim = r1
            r0 = r6
            java.lang.String r1 = "java/lang/StringBuffer"
            r0.className = r1
            r0 = r10
            r1 = r9
            javassist.compiler.ast.Expr r0 = makeAppendCall(r0, r1)
            return r0
        L4a:
            goto L52
        L4d:
            r0 = r8
            r1 = r6
            r0.accept(r1)
        L52:
            r0 = r6
            int r0 = r0.exprType
            r10 = r0
            r0 = r6
            int r0 = r0.arrayDim
            r11 = r0
            r0 = r6
            java.lang.String r0 = r0.className
            r12 = r0
            r0 = r9
            r1 = r6
            r0.accept(r1)
            r0 = r6
            r1 = r7
            r2 = 43
            r3 = r8
            r4 = r9
            boolean r0 = r0.isConstant(r1, r2, r3, r4)
            if (r0 == 0) goto L77
            r0 = 0
            return r0
        L77:
            r0 = r10
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L8f
            r0 = r11
            if (r0 != 0) goto L8f
            java.lang.String r0 = "java/lang/String"
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lad
        L8f:
            r0 = r6
            int r0 = r0.exprType
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto Lfa
            r0 = r6
            int r0 = r0.arrayDim
            if (r0 != 0) goto Lfa
            java.lang.String r0 = "java/lang/String"
            r1 = r6
            java.lang.String r1 = r1.className
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lfa
        Lad:
            javassist.compiler.ast.Symbol r0 = new javassist.compiler.ast.Symbol
            r1 = r0
            java.lang.String r2 = "java"
            r1.<init>(r2)
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            java.lang.String r3 = "lang"
            r2.<init>(r3)
            javassist.compiler.ast.Symbol r2 = new javassist.compiler.ast.Symbol
            r3 = r2
            java.lang.String r4 = "StringBuffer"
            r3.<init>(r4)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.make(r0, r1, r2)
            r13 = r0
            javassist.compiler.ast.NewExpr r0 = new javassist.compiler.ast.NewExpr
            r1 = r0
            r2 = r13
            r3 = 0
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r6
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r6
            r1 = 0
            r0.arrayDim = r1
            r0 = r6
            java.lang.String r1 = "java/lang/StringBuffer"
            r0.className = r1
            r0 = r14
            r1 = r8
            javassist.compiler.ast.Expr r0 = makeAppendCall(r0, r1)
            r1 = r9
            javassist.compiler.ast.Expr r0 = makeAppendCall(r0, r1)
            return r0
        Lfa:
            r0 = r6
            r1 = r7
            r2 = 43
            r3 = r10
            r0.computeBinExprType(r1, r2, r3)
            r0 = 0
            return r0
    }

    private boolean isConstant(javassist.compiler.ast.BinExpr r6, int r7, javassist.compiler.ast.ASTree r8, javassist.compiler.ast.ASTree r9) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r8
            javassist.compiler.ast.ASTree r0 = stripPlusExpr(r0)
            r8 = r0
            r0 = r9
            javassist.compiler.ast.ASTree r0 = stripPlusExpr(r0)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r8
            boolean r0 = r0 instanceof javassist.compiler.ast.StringL
            if (r0 == 0) goto L4f
            r0 = r9
            boolean r0 = r0 instanceof javassist.compiler.ast.StringL
            if (r0 == 0) goto L4f
            r0 = r7
            r1 = 43
            if (r0 != r1) goto L4f
            javassist.compiler.ast.StringL r0 = new javassist.compiler.ast.StringL
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r8
            javassist.compiler.ast.StringL r3 = (javassist.compiler.ast.StringL) r3
            java.lang.String r3 = r3.get()
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            javassist.compiler.ast.StringL r3 = (javassist.compiler.ast.StringL) r3
            java.lang.String r3 = r3.get()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r10 = r0
            goto L78
        L4f:
            r0 = r8
            boolean r0 = r0 instanceof javassist.compiler.ast.IntConst
            if (r0 == 0) goto L65
            r0 = r8
            javassist.compiler.ast.IntConst r0 = (javassist.compiler.ast.IntConst) r0
            r1 = r7
            r2 = r9
            javassist.compiler.ast.ASTree r0 = r0.compute(r1, r2)
            r10 = r0
            goto L78
        L65:
            r0 = r8
            boolean r0 = r0 instanceof javassist.compiler.ast.DoubleConst
            if (r0 == 0) goto L78
            r0 = r8
            javassist.compiler.ast.DoubleConst r0 = (javassist.compiler.ast.DoubleConst) r0
            r1 = r7
            r2 = r9
            javassist.compiler.ast.ASTree r0 = r0.compute(r1, r2)
            r10 = r0
        L78:
            r0 = r10
            if (r0 != 0) goto L7f
            r0 = 0
            return r0
        L7f:
            r0 = r6
            r1 = 43
            r0.setOperator(r1)
            r0 = r6
            r1 = r10
            r0.setOprand1(r1)
            r0 = r6
            r1 = 0
            r0.setOprand2(r1)
            r0 = r10
            r1 = r5
            r0.accept(r1)
            r0 = 1
            return r0
    }

    static javassist.compiler.ast.ASTree stripPlusExpr(javassist.compiler.ast.ASTree r3) {
            r0 = r3
            boolean r0 = r0 instanceof javassist.compiler.ast.BinExpr
            if (r0 == 0) goto L24
            r0 = r3
            javassist.compiler.ast.BinExpr r0 = (javassist.compiler.ast.BinExpr) r0
            r4 = r0
            r0 = r4
            int r0 = r0.getOperator()
            r1 = 43
            if (r0 != r1) goto L21
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            if (r0 != 0) goto L21
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            return r0
        L21:
            goto L79
        L24:
            r0 = r3
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L64
            r0 = r3
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r4 = r0
            r0 = r4
            int r0 = r0.getOperator()
            r5 = r0
            r0 = r5
            r1 = 35
            if (r0 != r1) goto L4f
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            javassist.compiler.ast.ASTree r0 = getConstantFieldValue(r0)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L4c
            r0 = r6
            return r0
        L4c:
            goto L61
        L4f:
            r0 = r5
            r1 = 43
            if (r0 != r1) goto L61
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            if (r0 != 0) goto L61
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            return r0
        L61:
            goto L79
        L64:
            r0 = r3
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L79
            r0 = r3
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            javassist.compiler.ast.ASTree r0 = getConstantFieldValue(r0)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L79
            r0 = r4
            return r0
        L79:
            r0 = r3
            return r0
    }

    private static javassist.compiler.ast.ASTree getConstantFieldValue(javassist.compiler.ast.Member r2) {
            r0 = r2
            javassist.CtField r0 = r0.getField()
            javassist.compiler.ast.ASTree r0 = getConstantFieldValue(r0)
            return r0
    }

    public static javassist.compiler.ast.ASTree getConstantFieldValue(javassist.CtField r6) {
            r0 = r6
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r6
            java.lang.Object r0 = r0.getConstantValue()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L11:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L24
            javassist.compiler.ast.StringL r0 = new javassist.compiler.ast.StringL
            r1 = r0
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r2)
            return r0
        L24:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 != 0) goto L32
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto L53
        L32:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L3f
            r0 = 405(0x195, float:5.68E-43)
            goto L42
        L3f:
            r0 = 404(0x194, float:5.66E-43)
        L42:
            r8 = r0
            javassist.compiler.ast.DoubleConst r0 = new javassist.compiler.ast.DoubleConst
            r1 = r0
            r2 = r7
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L53:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L7b
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 == 0) goto L67
            r0 = 403(0x193, float:5.65E-43)
            goto L6a
        L67:
            r0 = 402(0x192, float:5.63E-43)
        L6a:
            r8 = r0
            javassist.compiler.ast.IntConst r0 = new javassist.compiler.ast.IntConst
            r1 = r0
            r2 = r7
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L7b:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L9d
            javassist.compiler.ast.Keyword r0 = new javassist.compiler.ast.Keyword
            r1 = r0
            r2 = r7
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L96
            r2 = 410(0x19a, float:5.75E-43)
            goto L99
        L96:
            r2 = 411(0x19b, float:5.76E-43)
        L99:
            r1.<init>(r2)
            return r0
        L9d:
            r0 = 0
            return r0
    }

    private static boolean isPlusExpr(javassist.compiler.ast.ASTree r3) {
            r0 = r3
            boolean r0 = r0 instanceof javassist.compiler.ast.BinExpr
            if (r0 == 0) goto L1d
            r0 = r3
            javassist.compiler.ast.BinExpr r0 = (javassist.compiler.ast.BinExpr) r0
            r4 = r0
            r0 = r4
            int r0 = r0.getOperator()
            r5 = r0
            r0 = r5
            r1 = 43
            if (r0 != r1) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
        L1d:
            r0 = 0
            return r0
    }

    private static javassist.compiler.ast.Expr makeAppendCall(javassist.compiler.ast.ASTree r6, javassist.compiler.ast.ASTree r7) {
            r0 = 46
            r1 = r6
            javassist.compiler.ast.Member r2 = new javassist.compiler.ast.Member
            r3 = r2
            java.lang.String r4 = "append"
            r3.<init>(r4)
            javassist.compiler.ast.Expr r0 = javassist.compiler.ast.Expr.make(r0, r1, r2)
            javassist.compiler.ast.ASTList r1 = new javassist.compiler.ast.ASTList
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            javassist.compiler.ast.CallExpr r0 = javassist.compiler.ast.CallExpr.makeCall(r0, r1)
            return r0
    }

    private void computeBinExprType(javassist.compiler.ast.BinExpr r6, int r7, int r8) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            int r0 = r0.exprType
            r9 = r0
            r0 = r7
            r1 = 364(0x16c, float:5.1E-43)
            if (r0 == r1) goto L1b
            r0 = r7
            r1 = 366(0x16e, float:5.13E-43)
            if (r0 == r1) goto L1b
            r0 = r7
            r1 = 370(0x172, float:5.18E-43)
            if (r0 != r1) goto L23
        L1b:
            r0 = r5
            r1 = r8
            r0.exprType = r1
            goto L2b
        L23:
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r9
            r0.insertCast(r1, r2, r3)
        L2b:
            r0 = r5
            int r0 = r0.exprType
            boolean r0 = javassist.compiler.CodeGen.isP_INT(r0)
            if (r0 == 0) goto L46
            r0 = r5
            int r0 = r0.exprType
            r1 = 301(0x12d, float:4.22E-43)
            if (r0 == r1) goto L46
            r0 = r5
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
        L46:
            return
    }

    private void booleanExpr(javassist.compiler.ast.ASTree r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            int r0 = javassist.compiler.CodeGen.getCompOperator(r0)
            r7 = r0
            r0 = r7
            r1 = 358(0x166, float:5.02E-43)
            if (r0 != r1) goto L47
            r0 = r6
            javassist.compiler.ast.BinExpr r0 = (javassist.compiler.ast.BinExpr) r0
            r8 = r0
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r1 = r5
            r0.accept(r1)
            r0 = r5
            int r0 = r0.exprType
            r9 = r0
            r0 = r5
            int r0 = r0.arrayDim
            r10 = r0
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            r1 = r5
            r0.accept(r1)
            r0 = r10
            if (r0 != 0) goto L44
            r0 = r5
            int r0 = r0.arrayDim
            if (r0 != 0) goto L44
            r0 = r5
            r1 = r8
            r2 = r9
            r3 = r5
            int r3 = r3.exprType
            r0.insertCast(r1, r2, r3)
        L44:
            goto L86
        L47:
            r0 = r7
            r1 = 33
            if (r0 != r1) goto L5b
            r0 = r6
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r1 = r5
            r0.accept(r1)
            goto L86
        L5b:
            r0 = r7
            r1 = 369(0x171, float:5.17E-43)
            if (r0 == r1) goto L69
            r0 = r7
            r1 = 368(0x170, float:5.16E-43)
            if (r0 != r1) goto L81
        L69:
            r0 = r6
            javassist.compiler.ast.BinExpr r0 = (javassist.compiler.ast.BinExpr) r0
            r8 = r0
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r1 = r5
            r0.accept(r1)
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            r1 = r5
            r0.accept(r1)
            goto L86
        L81:
            r0 = r6
            r1 = r5
            r0.accept(r1)
        L86:
            r0 = r5
            r1 = 301(0x12d, float:4.22E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 0
            r0.arrayDim = r1
            return
    }

    private void insertCast(javassist.compiler.ast.BinExpr r8, int r9, int r10) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r9
            r1 = r10
            boolean r0 = javassist.compiler.CodeGen.rightIsStrong(r0, r1)
            if (r0 == 0) goto L1c
            r0 = r8
            javassist.compiler.ast.CastExpr r1 = new javassist.compiler.ast.CastExpr
            r2 = r1
            r3 = r10
            r4 = 0
            r5 = r8
            javassist.compiler.ast.ASTree r5 = r5.oprand1()
            r2.<init>(r3, r4, r5)
            r0.setLeft(r1)
            goto L21
        L1c:
            r0 = r7
            r1 = r9
            r0.exprType = r1
        L21:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atCastExpr(javassist.compiler.ast.CastExpr r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.compiler.ast.ASTList r1 = r1.getClassName()
            java.lang.String r0 = r0.resolveClassName(r1)
            r5 = r0
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.getOprand()
            r1 = r3
            r0.accept(r1)
            r0 = r3
            r1 = r4
            int r1 = r1.getType()
            r0.exprType = r1
            r0 = r3
            r1 = r4
            int r1 = r1.getArrayDim()
            r0.arrayDim = r1
            r0 = r3
            r1 = r5
            r0.className = r1
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atInstanceOfExpr(javassist.compiler.ast.InstanceOfExpr r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.getOprand()
            r1 = r3
            r0.accept(r1)
            r0 = r3
            r1 = 301(0x12d, float:4.22E-43)
            r0.exprType = r1
            r0 = r3
            r1 = 0
            r0.arrayDim = r1
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atExpr(javassist.compiler.ast.Expr r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            int r0 = r0.getOperator()
            r7 = r0
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r8 = r0
            r0 = r7
            r1 = 46
            if (r0 != r1) goto L54
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0
            java.lang.String r0 = r0.get()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "length"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L39
            r0 = r5
            r1 = r6
            r0.atArrayLength(r1)     // Catch: javassist.compiler.NoFieldException -> L2f
            goto L51
        L2f:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.atFieldRead(r1)
            goto L51
        L39:
            r0 = r9
            java.lang.String r1 = "class"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            r0 = r5
            r1 = r6
            r0.atClassObject(r1)
            goto L51
        L4c:
            r0 = r5
            r1 = r6
            r0.atFieldRead(r1)
        L51:
            goto Lf1
        L54:
            r0 = r7
            r1 = 35
            if (r0 != r1) goto L81
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0
            java.lang.String r0 = r0.get()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "class"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L79
            r0 = r5
            r1 = r6
            r0.atClassObject(r1)
            goto L7e
        L79:
            r0 = r5
            r1 = r6
            r0.atFieldRead(r1)
        L7e:
            goto Lf1
        L81:
            r0 = r7
            r1 = 65
            if (r0 != r1) goto L93
            r0 = r5
            r1 = r8
            r2 = r6
            javassist.compiler.ast.ASTree r2 = r2.oprand2()
            r0.atArrayRead(r1, r2)
            goto Lf1
        L93:
            r0 = r7
            r1 = 362(0x16a, float:5.07E-43)
            if (r0 == r1) goto La1
            r0 = r7
            r1 = 363(0x16b, float:5.09E-43)
            if (r0 != r1) goto Lab
        La1:
            r0 = r5
            r1 = r7
            r2 = r8
            r3 = r6
            r0.atPlusPlus(r1, r2, r3)
            goto Lf1
        Lab:
            r0 = r7
            r1 = 33
            if (r0 != r1) goto Lb9
            r0 = r5
            r1 = r6
            r0.booleanExpr(r1)
            goto Lf1
        Lb9:
            r0 = r7
            r1 = 67
            if (r0 != r1) goto Lc5
            fatal()
            goto Lf1
        Lc5:
            r0 = r8
            r1 = r5
            r0.accept(r1)
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            boolean r0 = r0.isConstant(r1, r2, r3)
            if (r0 != 0) goto Lf1
            r0 = r7
            r1 = 45
            if (r0 == r1) goto Le0
            r0 = r7
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 != r1) goto Lf1
        Le0:
            r0 = r5
            int r0 = r0.exprType
            boolean r0 = javassist.compiler.CodeGen.isP_INT(r0)
            if (r0 == 0) goto Lf1
            r0 = r5
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
        Lf1:
            return
    }

    private boolean isConstant(javassist.compiler.ast.Expr r6, int r7, javassist.compiler.ast.ASTree r8) {
            r5 = this;
            r0 = r8
            javassist.compiler.ast.ASTree r0 = stripPlusExpr(r0)
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof javassist.compiler.ast.IntConst
            if (r0 == 0) goto L44
            r0 = r8
            javassist.compiler.ast.IntConst r0 = (javassist.compiler.ast.IntConst) r0
            r9 = r0
            r0 = r9
            long r0 = r0.get()
            r10 = r0
            r0 = r7
            r1 = 45
            if (r0 != r1) goto L27
            r0 = r10
            long r0 = -r0
            r10 = r0
            goto L3a
        L27:
            r0 = r7
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 != r1) goto L38
            r0 = r10
            r1 = -1
            long r0 = r0 ^ r1
            r10 = r0
            goto L3a
        L38:
            r0 = 0
            return r0
        L3a:
            r0 = r9
            r1 = r10
            r0.set(r1)
            goto L6c
        L44:
            r0 = r8
            boolean r0 = r0 instanceof javassist.compiler.ast.DoubleConst
            if (r0 == 0) goto L6a
            r0 = r8
            javassist.compiler.ast.DoubleConst r0 = (javassist.compiler.ast.DoubleConst) r0
            r9 = r0
            r0 = r7
            r1 = 45
            if (r0 != r1) goto L65
            r0 = r9
            r1 = r9
            double r1 = r1.get()
            double r1 = -r1
            r0.set(r1)
            goto L67
        L65:
            r0 = 0
            return r0
        L67:
            goto L6c
        L6a:
            r0 = 0
            return r0
        L6c:
            r0 = r6
            r1 = 43
            r0.setOperator(r1)
            r0 = 1
            return r0
    }

    @Override // javassist.compiler.ast.Visitor
    public void atCallExpr(javassist.compiler.ast.CallExpr r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r9 = r0
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            javassist.compiler.ast.ASTList r0 = (javassist.compiler.ast.ASTList) r0
            r10 = r0
            r0 = r9
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L2c
            r0 = r9
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r7 = r0
            r0 = r5
            javassist.CtClass r0 = r0.thisClass
            r8 = r0
            goto L144
        L2c:
            r0 = r9
            boolean r0 = r0 instanceof javassist.compiler.ast.Keyword
            if (r0 == 0) goto L58
            java.lang.String r0 = "<init>"
            r7 = r0
            r0 = r9
            javassist.compiler.ast.Keyword r0 = (javassist.compiler.ast.Keyword) r0
            int r0 = r0.get()
            r1 = 336(0x150, float:4.71E-43)
            if (r0 != r1) goto L50
            r0 = r5
            javassist.CtClass r0 = r0.thisClass
            javassist.CtClass r0 = javassist.compiler.MemberResolver.getSuperclass(r0)
            r8 = r0
            goto L144
        L50:
            r0 = r5
            javassist.CtClass r0 = r0.thisClass
            r8 = r0
            goto L144
        L58:
            r0 = r9
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L141
            r0 = r9
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r11 = r0
            r0 = r11
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0
            java.lang.String r0 = r0.get()
            r7 = r0
            r0 = r11
            int r0 = r0.getOperator()
            r12 = r0
            r0 = r12
            r1 = 35
            if (r0 != r1) goto L98
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r11
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            javassist.compiler.ast.Symbol r1 = (javassist.compiler.ast.Symbol) r1
            java.lang.String r1 = r1.get()
            r2 = 0
            javassist.CtClass r0 = r0.lookupClass(r1, r2)
            r8 = r0
            goto L13e
        L98:
            r0 = r12
            r1 = 46
            if (r0 != r1) goto L13b
            r0 = r11
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r13 = r0
            r0 = r13
            java.lang.String r0 = isDotSuper(r0)
            r14 = r0
            r0 = r14
            if (r0 == 0) goto Lbf
            r0 = r5
            javassist.CtClass r0 = r0.thisClass
            r1 = r14
            javassist.CtClass r0 = javassist.compiler.MemberResolver.getSuperInterface(r0, r1)
            r8 = r0
            goto L138
        Lbf:
            r0 = r13
            r1 = r5
            r0.accept(r1)     // Catch: javassist.compiler.NoFieldException -> Lc8
            goto L106
        Lc8:
            r15 = move-exception
            r0 = r15
            javassist.compiler.ast.ASTree r0 = r0.getExpr()
            r1 = r13
            if (r0 == r1) goto Ld7
            r0 = r15
            throw r0
        Ld7:
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 0
            r0.arrayDim = r1
            r0 = r5
            r1 = r15
            java.lang.String r1 = r1.getField()
            r0.className = r1
            r0 = r11
            r1 = 35
            r0.setOperator(r1)
            r0 = r11
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r5
            java.lang.String r3 = r3.className
            java.lang.String r3 = javassist.compiler.MemberResolver.jvmToJavaName(r3)
            r2.<init>(r3)
            r0.setOprand1(r1)
        L106:
            r0 = r5
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L11c
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver
            java.lang.String r1 = "java.lang.Object"
            r2 = 1
            javassist.CtClass r0 = r0.lookupClass(r1, r2)
            r8 = r0
            goto L138
        L11c:
            r0 = r5
            int r0 = r0.exprType
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L135
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r5
            java.lang.String r1 = r1.className
            javassist.CtClass r0 = r0.lookupClassByJvmName(r1)
            r8 = r0
            goto L138
        L135:
            badMethod()
        L138:
            goto L13e
        L13b:
            badMethod()
        L13e:
            goto L144
        L141:
            fatal()
        L144:
            r0 = r5
            r1 = r8
            r2 = r7
            r3 = r10
            javassist.compiler.MemberResolver$Method r0 = r0.atMethodCallCore(r1, r2, r3)
            r11 = r0
            r0 = r6
            r1 = r11
            r0.setMethod(r1)
            return
    }

    private static void badMethod() throws javassist.compiler.CompileError {
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad method"
            r1.<init>(r2)
            throw r0
    }

    static java.lang.String isDotSuper(javassist.compiler.ast.ASTree r3) {
            r0 = r3
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L39
            r0 = r3
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r4 = r0
            r0 = r4
            int r0 = r0.getOperator()
            r1 = 46
            if (r0 != r1) goto L39
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof javassist.compiler.ast.Keyword
            if (r0 == 0) goto L39
            r0 = r5
            javassist.compiler.ast.Keyword r0 = (javassist.compiler.ast.Keyword) r0
            int r0 = r0.get()
            r1 = 336(0x150, float:4.71E-43)
            if (r0 != r1) goto L39
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0
            java.lang.String r0 = r0.get()
            return r0
        L39:
            r0 = 0
            return r0
    }

    public javassist.compiler.MemberResolver.Method atMethodCallCore(javassist.CtClass r10, java.lang.String r11, javassist.compiler.ast.ASTList r12) throws javassist.compiler.CompileError {
            r9 = this;
            r0 = r9
            r1 = r12
            int r0 = r0.getMethodArgsLength(r1)
            r13 = r0
            r0 = r13
            int[] r0 = new int[r0]
            r14 = r0
            r0 = r13
            int[] r0 = new int[r0]
            r15 = r0
            r0 = r13
            java.lang.String[] r0 = new java.lang.String[r0]
            r16 = r0
            r0 = r9
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r16
            r0.atMethodArgs(r1, r2, r3, r4)
            r0 = r9
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r10
            r2 = r9
            javassist.CtClass r2 = r2.thisClass
            r3 = r9
            javassist.bytecode.MethodInfo r3 = r3.thisMethod
            r4 = r11
            r5 = r14
            r6 = r15
            r7 = r16
            javassist.compiler.MemberResolver$Method r0 = r0.lookupMethod(r1, r2, r3, r4, r5, r6, r7)
            r17 = r0
            r0 = r17
            if (r0 != 0) goto La6
            r0 = r10
            java.lang.String r0 = r0.getName()
            r18 = r0
            r0 = r14
            r1 = r15
            r2 = r16
            java.lang.String r0 = argTypesToString(r0, r1, r2)
            r19 = r0
            r0 = r11
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "cannot find constructor "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r18
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r19
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r20 = r0
            goto L9c
        L7c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r19
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " not found in "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r18
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r20 = r0
        L9c:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r20
            r1.<init>(r2)
            throw r0
        La6:
            r0 = r17
            javassist.bytecode.MethodInfo r0 = r0.info
            java.lang.String r0 = r0.getDescriptor()
            r18 = r0
            r0 = r9
            r1 = r18
            r0.setReturnType(r1)
            r0 = r17
            return r0
    }

    public int getMethodArgsLength(javassist.compiler.ast.ASTList r3) {
            r2 = this;
            r0 = r3
            int r0 = javassist.compiler.ast.ASTList.length(r0)
            return r0
    }

    public void atMethodArgs(javassist.compiler.ast.ASTList r5, int[] r6, int[] r7, java.lang.String[] r8) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = 0
            r9 = r0
        L3:
            r0 = r5
            if (r0 == 0) goto L37
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.head()
            r10 = r0
            r0 = r10
            r1 = r4
            r0.accept(r1)
            r0 = r6
            r1 = r9
            r2 = r4
            int r2 = r2.exprType
            r0[r1] = r2
            r0 = r7
            r1 = r9
            r2 = r4
            int r2 = r2.arrayDim
            r0[r1] = r2
            r0 = r8
            r1 = r9
            r2 = r4
            java.lang.String r2 = r2.className
            r0[r1] = r2
            int r9 = r9 + 1
            r0 = r5
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r5 = r0
            goto L3
        L37:
            return
    }

    void setReturnType(java.lang.String r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            r1 = 41
            int r0 = r0.indexOf(r1)
            r7 = r0
            r0 = r7
            if (r0 >= 0) goto Le
            badMethod()
        Le:
            r0 = r6
            int r7 = r7 + 1
            r1 = r7
            char r0 = r0.charAt(r1)
            r8 = r0
            r0 = 0
            r9 = r0
        L1a:
            r0 = r8
            r1 = 91
            if (r0 != r1) goto L2f
            int r9 = r9 + 1
            r0 = r6
            int r7 = r7 + 1
            r1 = r7
            char r0 = r0.charAt(r1)
            r8 = r0
            goto L1a
        L2f:
            r0 = r5
            r1 = r9
            r0.arrayDim = r1
            r0 = r8
            r1 = 76
            if (r0 != r1) goto L65
            r0 = r6
            r1 = 59
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r0 = r0.indexOf(r1, r2)
            r10 = r0
            r0 = r10
            if (r0 >= 0) goto L4e
            badMethod()
        L4e:
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r3 = r10
            java.lang.String r1 = r1.substring(r2, r3)
            r0.className = r1
            goto L72
        L65:
            r0 = r5
            r1 = r8
            int r1 = javassist.compiler.MemberResolver.descToType(r1)
            r0.exprType = r1
            r0 = r5
            r1 = 0
            r0.className = r1
        L72:
            return
    }

    private void atFieldRead(javassist.compiler.ast.ASTree r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r4
            r2 = r5
            javassist.CtField r1 = r1.fieldAccess(r2)
            r0.atFieldRead(r1)
            return
    }

    private void atFieldRead(javassist.CtField r9) throws javassist.compiler.CompileError {
            r8 = this;
            r0 = r9
            javassist.bytecode.FieldInfo r0 = r0.getFieldInfo2()
            r10 = r0
            r0 = r10
            java.lang.String r0 = r0.getDescriptor()
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r11
            r1 = r12
            char r0 = r0.charAt(r1)
            r14 = r0
        L18:
            r0 = r14
            r1 = 91
            if (r0 != r1) goto L30
            int r13 = r13 + 1
            r0 = r11
            int r12 = r12 + 1
            r1 = r12
            char r0 = r0.charAt(r1)
            r14 = r0
            goto L18
        L30:
            r0 = r8
            r1 = r13
            r0.arrayDim = r1
            r0 = r8
            r1 = r14
            int r1 = javassist.compiler.MemberResolver.descToType(r1)
            r0.exprType = r1
            r0 = r14
            r1 = 76
            if (r0 != r1) goto L5f
            r0 = r8
            r1 = r11
            r2 = r12
            r3 = 1
            int r2 = r2 + r3
            r3 = r11
            r4 = 59
            r5 = r12
            r6 = 1
            int r5 = r5 + r6
            int r3 = r3.indexOf(r4, r5)
            java.lang.String r1 = r1.substring(r2, r3)
            r0.className = r1
            goto L64
        L5f:
            r0 = r8
            r1 = 0
            r0.className = r1
        L64:
            return
    }

    protected javassist.CtField fieldAccess(javassist.compiler.ast.ASTree r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L3b
            r0 = r6
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            r7 = r0
            r0 = r7
            java.lang.String r0 = r0.get()
            r8 = r0
            r0 = r5
            javassist.CtClass r0 = r0.thisClass     // Catch: javassist.NotFoundException -> L2f
            r1 = r8
            javassist.CtField r0 = r0.getField(r1)     // Catch: javassist.NotFoundException -> L2f
            r9 = r0
            r0 = r9
            int r0 = r0.getModifiers()     // Catch: javassist.NotFoundException -> L2f
            boolean r0 = javassist.Modifier.isStatic(r0)     // Catch: javassist.NotFoundException -> L2f
            if (r0 == 0) goto L2c
            r0 = r7
            r1 = r9
            r0.setField(r1)     // Catch: javassist.NotFoundException -> L2f
        L2c:
            r0 = r9
            return r0
        L2f:
            r9 = move-exception
            javassist.compiler.NoFieldException r0 = new javassist.compiler.NoFieldException
            r1 = r0
            r2 = r8
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
        L3b:
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto Lfb
            r0 = r6
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r7 = r0
            r0 = r7
            int r0 = r0.getOperator()
            r8 = r0
            r0 = r8
            r1 = 35
            if (r0 != r1) goto L7a
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            r9 = r0
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r7
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            javassist.compiler.ast.Symbol r1 = (javassist.compiler.ast.Symbol) r1
            java.lang.String r1 = r1.get()
            r2 = r9
            javassist.CtField r0 = r0.lookupField(r1, r2)
            r10 = r0
            r0 = r9
            r1 = r10
            r0.setField(r1)
            r0 = r10
            return r0
        L7a:
            r0 = r8
            r1 = 46
            if (r0 != r1) goto Lfb
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand1()     // Catch: javassist.compiler.NoFieldException -> L8b
            r1 = r5
            r0.accept(r1)     // Catch: javassist.compiler.NoFieldException -> L8b
            goto La7
        L8b:
            r9 = move-exception
            r0 = r9
            javassist.compiler.ast.ASTree r0 = r0.getExpr()
            r1 = r7
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            if (r0 == r1) goto L9c
            r0 = r9
            throw r0
        L9c:
            r0 = r5
            r1 = r7
            r2 = r9
            java.lang.String r2 = r2.getField()
            javassist.CtField r0 = r0.fieldAccess2(r1, r2)
            return r0
        La7:
            r0 = 0
            r9 = r0
            r0 = r5
            int r0 = r0.exprType     // Catch: javassist.compiler.CompileError -> Ld1
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto Lce
            r0 = r5
            int r0 = r0.arrayDim     // Catch: javassist.compiler.CompileError -> Ld1
            if (r0 != 0) goto Lce
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver     // Catch: javassist.compiler.CompileError -> Ld1
            r1 = r5
            java.lang.String r1 = r1.className     // Catch: javassist.compiler.CompileError -> Ld1
            r2 = r7
            javassist.compiler.ast.ASTree r2 = r2.oprand2()     // Catch: javassist.compiler.CompileError -> Ld1
            javassist.compiler.ast.Symbol r2 = (javassist.compiler.ast.Symbol) r2     // Catch: javassist.compiler.CompileError -> Ld1
            javassist.CtField r0 = r0.lookupFieldByJvmName(r1, r2)     // Catch: javassist.compiler.CompileError -> Ld1
            return r0
        Lce:
            goto Ld7
        Ld1:
            r10 = move-exception
            r0 = r10
            r9 = r0
        Ld7:
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof javassist.compiler.ast.Symbol
            if (r0 == 0) goto Lf3
            r0 = r5
            r1 = r7
            r2 = r10
            javassist.compiler.ast.Symbol r2 = (javassist.compiler.ast.Symbol) r2
            java.lang.String r2 = r2.get()
            javassist.CtField r0 = r0.fieldAccess2(r1, r2)
            return r0
        Lf3:
            r0 = r9
            if (r0 == 0) goto Lfb
            r0 = r9
            throw r0
        Lfb:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad field access"
            r1.<init>(r2)
            throw r0
    }

    private javassist.CtField fieldAccess2(javassist.compiler.ast.Expr r6, java.lang.String r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            r8 = r0
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r7
            r2 = r8
            r3 = r6
            javassist.CtField r0 = r0.lookupFieldByJvmName2(r1, r2, r3)
            r9 = r0
            r0 = r6
            r1 = 35
            r0.setOperator(r1)
            r0 = r6
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r7
            java.lang.String r3 = javassist.compiler.MemberResolver.jvmToJavaName(r3)
            r2.<init>(r3)
            r0.setOprand1(r1)
            r0 = r8
            r1 = r9
            r0.setField(r1)
            r0 = r9
            return r0
    }

    public void atClassObject(javassist.compiler.ast.Expr r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r3
            r1 = 0
            r0.arrayDim = r1
            r0 = r3
            java.lang.String r1 = "java/lang/Class"
            r0.className = r1
            return
    }

    public void atArrayLength(javassist.compiler.ast.Expr r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r1 = r5
            r0.accept(r1)
            r0 = r5
            int r0 = r0.arrayDim
            if (r0 != 0) goto L1b
            javassist.compiler.NoFieldException r0 = new javassist.compiler.NoFieldException
            r1 = r0
            java.lang.String r2 = "length"
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
        L1b:
            r0 = r5
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 0
            r0.arrayDim = r1
            return
    }

    public void atArrayRead(javassist.compiler.ast.ASTree r5, javassist.compiler.ast.ASTree r6) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            r1 = r4
            r0.accept(r1)
            r0 = r4
            int r0 = r0.exprType
            r7 = r0
            r0 = r4
            int r0 = r0.arrayDim
            r8 = r0
            r0 = r4
            java.lang.String r0 = r0.className
            r9 = r0
            r0 = r6
            r1 = r4
            r0.accept(r1)
            r0 = r4
            r1 = r7
            r0.exprType = r1
            r0 = r4
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            r0.arrayDim = r1
            r0 = r4
            r1 = r9
            r0.className = r1
            return
    }

    private void atPlusPlus(int r5, javassist.compiler.ast.ASTree r6, javassist.compiler.ast.Expr r7) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r6
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L15
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            r6 = r0
        L15:
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Variable
            if (r0 == 0) goto L3a
            r0 = r6
            javassist.compiler.ast.Variable r0 = (javassist.compiler.ast.Variable) r0
            javassist.compiler.ast.Declarator r0 = r0.getDeclarator()
            r9 = r0
            r0 = r4
            r1 = r9
            int r1 = r1.getType()
            r0.exprType = r1
            r0 = r4
            r1 = r9
            int r1 = r1.getArrayDim()
            r0.arrayDim = r1
            goto L92
        L3a:
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L8d
            r0 = r6
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r9 = r0
            r0 = r9
            int r0 = r0.getOperator()
            r1 = 65
            if (r0 != r1) goto L8d
            r0 = r4
            r1 = r9
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            r2 = r9
            javassist.compiler.ast.ASTree r2 = r2.oprand2()
            r0.atArrayRead(r1, r2)
            r0 = r4
            int r0 = r0.exprType
            r10 = r0
            r0 = r10
            r1 = 324(0x144, float:4.54E-43)
            if (r0 == r1) goto L85
            r0 = r10
            r1 = 303(0x12f, float:4.25E-43)
            if (r0 == r1) goto L85
            r0 = r10
            r1 = 306(0x132, float:4.29E-43)
            if (r0 == r1) goto L85
            r0 = r10
            r1 = 334(0x14e, float:4.68E-43)
            if (r0 != r1) goto L8c
        L85:
            r0 = r4
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
        L8c:
            return
        L8d:
            r0 = r4
            r1 = r6
            r0.atFieldPlusPlus(r1)
        L92:
            return
    }

    protected void atFieldPlusPlus(javassist.compiler.ast.ASTree r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.CtField r0 = r0.fieldAccess(r1)
            r5 = r0
            r0 = r3
            r1 = r5
            r0.atFieldRead(r1)
            r0 = r3
            int r0 = r0.exprType
            r6 = r0
            r0 = r6
            r1 = 324(0x144, float:4.54E-43)
            if (r0 == r1) goto L2c
            r0 = r6
            r1 = 303(0x12f, float:4.25E-43)
            if (r0 == r1) goto L2c
            r0 = r6
            r1 = 306(0x132, float:4.29E-43)
            if (r0 == r1) goto L2c
            r0 = r6
            r1 = 334(0x14e, float:4.68E-43)
            if (r0 != r1) goto L33
        L2c:
            r0 = r3
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
        L33:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atMember(javassist.compiler.ast.Member r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.atFieldRead(r1)
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atVariable(javassist.compiler.ast.Variable r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            javassist.compiler.ast.Declarator r0 = r0.getDeclarator()
            r5 = r0
            r0 = r3
            r1 = r5
            int r1 = r1.getType()
            r0.exprType = r1
            r0 = r3
            r1 = r5
            int r1 = r1.getArrayDim()
            r0.arrayDim = r1
            r0 = r3
            r1 = r5
            java.lang.String r1 = r1.getClassName()
            r0.className = r1
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atKeyword(javassist.compiler.ast.Keyword r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.arrayDim = r1
            r0 = r4
            int r0 = r0.get()
            r5 = r0
            r0 = r5
            switch(r0) {
                case 336: goto L50;
                case 339: goto L50;
                case 410: goto L3c;
                case 411: goto L3c;
                case 412: goto L46;
                default: goto L74;
            }
        L3c:
            r0 = r3
            r1 = 301(0x12d, float:4.22E-43)
            r0.exprType = r1
            goto L77
        L46:
            r0 = r3
            r1 = 412(0x19c, float:5.77E-43)
            r0.exprType = r1
            goto L77
        L50:
            r0 = r3
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 339(0x153, float:4.75E-43)
            if (r0 != r1) goto L69
            r0 = r3
            r1 = r3
            java.lang.String r1 = r1.getThisName()
            r0.className = r1
            goto L77
        L69:
            r0 = r3
            r1 = r3
            java.lang.String r1 = r1.getSuperName()
            r0.className = r1
            goto L77
        L74:
            fatal()
        L77:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atStringL(javassist.compiler.ast.StringL r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r3
            r1 = 0
            r0.arrayDim = r1
            r0 = r3
            java.lang.String r1 = "java/lang/String"
            r0.className = r1
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atIntConst(javassist.compiler.ast.IntConst r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = 0
            r0.arrayDim = r1
            r0 = r5
            int r0 = r0.getType()
            r6 = r0
            r0 = r6
            r1 = 402(0x192, float:5.63E-43)
            if (r0 == r1) goto L18
            r0 = r6
            r1 = 401(0x191, float:5.62E-43)
            if (r0 != r1) goto L2f
        L18:
            r0 = r4
            r1 = r6
            r2 = 402(0x192, float:5.63E-43)
            if (r1 != r2) goto L26
            r1 = 324(0x144, float:4.54E-43)
            goto L29
        L26:
            r1 = 306(0x132, float:4.29E-43)
        L29:
            r0.exprType = r1
            goto L36
        L2f:
            r0 = r4
            r1 = 326(0x146, float:4.57E-43)
            r0.exprType = r1
        L36:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atDoubleConst(javassist.compiler.ast.DoubleConst r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.arrayDim = r1
            r0 = r4
            int r0 = r0.getType()
            r1 = 405(0x195, float:5.68E-43)
            if (r0 != r1) goto L19
            r0 = r3
            r1 = 312(0x138, float:4.37E-43)
            r0.exprType = r1
            goto L20
        L19:
            r0 = r3
            r1 = 317(0x13d, float:4.44E-43)
            r0.exprType = r1
        L20:
            return
    }
}
