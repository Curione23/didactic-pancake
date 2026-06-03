package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/CodeGen.class */
public abstract class CodeGen extends javassist.compiler.ast.Visitor implements javassist.bytecode.Opcode, javassist.compiler.TokenId {
    static final java.lang.String javaLangObject = "java.lang.Object";
    static final java.lang.String jvmJavaLangObject = "java/lang/Object";
    static final java.lang.String javaLangString = "java.lang.String";
    static final java.lang.String jvmJavaLangString = "java/lang/String";
    protected javassist.bytecode.Bytecode bytecode;
    private int tempVar;
    javassist.compiler.TypeChecker typeChecker;
    protected boolean hasReturned;
    public boolean inStaticMethod;
    protected java.util.List<java.lang.Integer> breakList;
    protected java.util.List<java.lang.Integer> continueList;
    protected javassist.compiler.CodeGen.ReturnHook returnHooks;
    protected int exprType;
    protected int arrayDim;
    protected java.lang.String className;
    static final int[] binOp = null;
    private static final int[] ifOp = null;
    private static final int[] ifOp2 = null;
    private static final int P_DOUBLE = 0;
    private static final int P_FLOAT = 1;
    private static final int P_LONG = 2;
    private static final int P_INT = 3;
    private static final int P_OTHER = -1;
    private static final int[] castOp = null;


    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/CodeGen$ReturnHook.class */
    protected static abstract class ReturnHook {
        javassist.compiler.CodeGen.ReturnHook next;

        protected abstract boolean doit(javassist.bytecode.Bytecode r1, int r2);

        protected ReturnHook(javassist.compiler.CodeGen r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                javassist.compiler.CodeGen$ReturnHook r1 = r1.returnHooks
                r0.next = r1
                r0 = r4
                r1 = r3
                r0.returnHooks = r1
                return
        }

        protected void remove(javassist.compiler.CodeGen r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                javassist.compiler.CodeGen$ReturnHook r1 = r1.next
                r0.returnHooks = r1
                return
        }
    }

    public CodeGen(javassist.bytecode.Bytecode r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.bytecode = r1
            r0 = r3
            r1 = -1
            r0.tempVar = r1
            r0 = r3
            r1 = 0
            r0.typeChecker = r1
            r0 = r3
            r1 = 0
            r0.hasReturned = r1
            r0 = r3
            r1 = 0
            r0.inStaticMethod = r1
            r0 = r3
            r1 = 0
            r0.breakList = r1
            r0 = r3
            r1 = 0
            r0.continueList = r1
            r0 = r3
            r1 = 0
            r0.returnHooks = r1
            return
    }

    public void setTypeChecker(javassist.compiler.TypeChecker r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.typeChecker = r1
            return
    }

    protected static void fatal() throws javassist.compiler.CompileError {
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "fatal"
            r1.<init>(r2)
            throw r0
    }

    public static boolean is2word(int r3, int r4) {
            r0 = r4
            if (r0 != 0) goto L16
            r0 = r3
            r1 = 312(0x138, float:4.37E-43)
            if (r0 == r1) goto L12
            r0 = r3
            r1 = 326(0x146, float:4.57E-43)
            if (r0 != r1) goto L16
        L12:
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public int getMaxLocals() {
            r2 = this;
            r0 = r2
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.getMaxLocals()
            return r0
    }

    public void setMaxLocals(int r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r4
            r0.setMaxLocals(r1)
            return
    }

    protected void incMaxLocals(int r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r4
            r0.incMaxLocals(r1)
            return
    }

    protected int getTempVar() {
            r3 = this;
            r0 = r3
            int r0 = r0.tempVar
            if (r0 >= 0) goto L14
            r0 = r3
            r1 = r3
            int r1 = r1.getMaxLocals()
            r0.tempVar = r1
            r0 = r3
            r1 = 2
            r0.incMaxLocals(r1)
        L14:
            r0 = r3
            int r0 = r0.tempVar
            return r0
    }

    protected int getLocalVar(javassist.compiler.ast.Declarator r4) {
            r3 = this;
            r0 = r4
            int r0 = r0.getLocalVar()
            r5 = r0
            r0 = r5
            if (r0 >= 0) goto L18
            r0 = r3
            int r0 = r0.getMaxLocals()
            r5 = r0
            r0 = r4
            r1 = r5
            r0.setLocalVar(r1)
            r0 = r3
            r1 = 1
            r0.incMaxLocals(r1)
        L18:
            r0 = r5
            return r0
    }

    protected abstract java.lang.String getThisName();

    protected abstract java.lang.String getSuperName() throws javassist.compiler.CompileError;

    protected abstract java.lang.String resolveClassName(javassist.compiler.ast.ASTList r1) throws javassist.compiler.CompileError;

    protected abstract java.lang.String resolveClassName(java.lang.String r1) throws javassist.compiler.CompileError;

    protected static java.lang.String toJvmArrayName(java.lang.String r3, int r4) {
            r0 = r3
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r4
            if (r0 != 0) goto Lc
            r0 = r3
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            r6 = r0
        L16:
            r0 = r6
            int r6 = r6 + (-1)
            if (r0 <= 0) goto L27
            r0 = r5
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L16
        L27:
            r0 = r5
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected static java.lang.String toJvmTypeName(int r3, int r4) {
            r0 = 73
            r5 = r0
            r0 = r3
            switch(r0) {
                case 301: goto L58;
                case 303: goto L5e;
                case 306: goto L64;
                case 312: goto L82;
                case 317: goto L7c;
                case 324: goto L70;
                case 326: goto L76;
                case 334: goto L6a;
                case 344: goto L88;
                default: goto L8b;
            }
        L58:
            r0 = 90
            r5 = r0
            goto L8b
        L5e:
            r0 = 66
            r5 = r0
            goto L8b
        L64:
            r0 = 67
            r5 = r0
            goto L8b
        L6a:
            r0 = 83
            r5 = r0
            goto L8b
        L70:
            r0 = 73
            r5 = r0
            goto L8b
        L76:
            r0 = 74
            r5 = r0
            goto L8b
        L7c:
            r0 = 70
            r5 = r0
            goto L8b
        L82:
            r0 = 68
            r5 = r0
            goto L8b
        L88:
            r0 = 86
            r5 = r0
        L8b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
        L93:
            r0 = r4
            int r4 = r4 + (-1)
            if (r0 <= 0) goto La4
            r0 = r6
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L93
        La4:
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void compileExpr(javassist.compiler.ast.ASTree r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.doTypeCheck(r1)
            r0 = r4
            r1 = r3
            r0.accept(r1)
            return
    }

    public boolean compileBooleanExpr(boolean r5, javassist.compiler.ast.ASTree r6) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r6
            r0.doTypeCheck(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = r0.booleanExpr(r1, r2)
            return r0
    }

    public void doTypeCheck(javassist.compiler.ast.ASTree r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            javassist.compiler.TypeChecker r0 = r0.typeChecker
            if (r0 == 0) goto Lf
            r0 = r4
            r1 = r3
            javassist.compiler.TypeChecker r1 = r1.typeChecker
            r0.accept(r1)
        Lf:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atASTList(javassist.compiler.ast.ASTList r2) throws javassist.compiler.CompileError {
            r1 = this;
            fatal()
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atPair(javassist.compiler.ast.Pair r2) throws javassist.compiler.CompileError {
            r1 = this;
            fatal()
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atSymbol(javassist.compiler.ast.Symbol r2) throws javassist.compiler.CompileError {
            r1 = this;
            fatal()
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atFieldDecl(javassist.compiler.ast.FieldDecl r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.getInit()
            r1 = r3
            r0.accept(r1)
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atMethodDecl(javassist.compiler.ast.MethodDecl r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            javassist.compiler.ast.ASTList r0 = r0.getModifiers()
            r8 = r0
            r0 = r6
            r1 = 1
            r0.setMaxLocals(r1)
        La:
            r0 = r8
            if (r0 == 0) goto L32
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Keyword r0 = (javassist.compiler.ast.Keyword) r0
            r9 = r0
            r0 = r8
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r8 = r0
            r0 = r9
            int r0 = r0.get()
            r1 = 335(0x14f, float:4.7E-43)
            if (r0 != r1) goto L2f
            r0 = r6
            r1 = 0
            r0.setMaxLocals(r1)
            r0 = r6
            r1 = 1
            r0.inStaticMethod = r1
        L2f:
            goto La
        L32:
            r0 = r7
            javassist.compiler.ast.ASTList r0 = r0.getParams()
            r9 = r0
        L37:
            r0 = r9
            if (r0 == 0) goto L4e
            r0 = r6
            r1 = r9
            javassist.compiler.ast.ASTree r1 = r1.head()
            javassist.compiler.ast.Declarator r1 = (javassist.compiler.ast.Declarator) r1
            r0.atDeclarator(r1)
            r0 = r9
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r9 = r0
            goto L37
        L4e:
            r0 = r7
            javassist.compiler.ast.Stmnt r0 = r0.getBody()
            r10 = r0
            r0 = r6
            r1 = r10
            r2 = r7
            boolean r2 = r2.isConstructor()
            r3 = r7
            javassist.compiler.ast.Declarator r3 = r3.getReturn()
            int r3 = r3.getType()
            r4 = 344(0x158, float:4.82E-43)
            if (r3 != r4) goto L6c
            r3 = 1
            goto L6d
        L6c:
            r3 = 0
        L6d:
            r0.atMethodBody(r1, r2, r3)
            return
    }

    public void atMethodBody(javassist.compiler.ast.Stmnt r5, boolean r6, boolean r7) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r6
            if (r0 == 0) goto L15
            r0 = r4
            r1 = r5
            boolean r0 = r0.needsSuperCall(r1)
            if (r0 == 0) goto L15
            r0 = r4
            r0.insertDefaultSuperCall()
        L15:
            r0 = r4
            r1 = 0
            r0.hasReturned = r1
            r0 = r5
            r1 = r4
            r0.accept(r1)
            r0 = r4
            boolean r0 = r0.hasReturned
            if (r0 != 0) goto L46
            r0 = r7
            if (r0 == 0) goto L3c
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 177(0xb1, float:2.48E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 1
            r0.hasReturned = r1
            goto L46
        L3c:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "no return statement"
            r1.<init>(r2)
            throw r0
        L46:
            return
    }

    private boolean needsSuperCall(javassist.compiler.ast.Stmnt r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            int r0 = r0.getOperator()
            r1 = 66
            if (r0 != r1) goto L11
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r4 = r0
        L11:
            r0 = r4
            if (r0 == 0) goto L68
            r0 = r4
            int r0 = r0.getOperator()
            r1 = 69
            if (r0 != r1) goto L68
            r0 = r4
            javassist.compiler.ast.ASTree r0 = r0.head()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L68
            r0 = r5
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L68
            r0 = r5
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            int r0 = r0.getOperator()
            r1 = 67
            if (r0 != r1) goto L68
            r0 = r5
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            javassist.compiler.ast.ASTree r0 = r0.head()
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Keyword
            if (r0 == 0) goto L68
            r0 = r6
            javassist.compiler.ast.Keyword r0 = (javassist.compiler.ast.Keyword) r0
            int r0 = r0.get()
            r7 = r0
            r0 = r7
            r1 = 339(0x153, float:4.75E-43)
            if (r0 == r1) goto L66
            r0 = r7
            r1 = 336(0x150, float:4.71E-43)
            if (r0 == r1) goto L66
            r0 = 1
            goto L67
        L66:
            r0 = 0
        L67:
            return r0
        L68:
            r0 = 1
            return r0
    }

    protected abstract void insertDefaultSuperCall() throws javassist.compiler.CompileError;

    @Override // javassist.compiler.ast.Visitor
    public void atStmnt(javassist.compiler.ast.Stmnt r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r7
            int r0 = r0.getOperator()
            r8 = r0
            r0 = r8
            r1 = 69
            if (r0 != r1) goto L83
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            r9 = r0
            r0 = r6
            r1 = r9
            r0.doTypeCheck(r1)
            r0 = r9
            boolean r0 = r0 instanceof javassist.compiler.ast.AssignExpr
            if (r0 == 0) goto L2d
            r0 = r6
            r1 = r9
            javassist.compiler.ast.AssignExpr r1 = (javassist.compiler.ast.AssignExpr) r1
            r2 = 0
            r0.atAssignExpr(r1, r2)
            goto L80
        L2d:
            r0 = r9
            boolean r0 = isPlusPlusExpr(r0)
            if (r0 == 0) goto L4e
            r0 = r9
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r10 = r0
            r0 = r6
            r1 = r10
            int r1 = r1.getOperator()
            r2 = r10
            javassist.compiler.ast.ASTree r2 = r2.oprand1()
            r3 = r10
            r4 = 0
            r0.atPlusPlus(r1, r2, r3, r4)
            goto L80
        L4e:
            r0 = r9
            r1 = r6
            r0.accept(r1)
            r0 = r6
            int r0 = r0.exprType
            r1 = r6
            int r1 = r1.arrayDim
            boolean r0 = is2word(r0, r1)
            if (r0 == 0) goto L6d
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 88
            r0.addOpcode(r1)
            goto L80
        L6d:
            r0 = r6
            int r0 = r0.exprType
            r1 = 344(0x158, float:4.82E-43)
            if (r0 == r1) goto L80
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 87
            r0.addOpcode(r1)
        L80:
            goto L17e
        L83:
            r0 = r8
            r1 = 68
            if (r0 == r1) goto L8f
            r0 = r8
            r1 = 66
            if (r0 != r1) goto Lb1
        L8f:
            r0 = r7
            r9 = r0
        L91:
            r0 = r9
            if (r0 == 0) goto Lae
            r0 = r9
            javassist.compiler.ast.ASTree r0 = r0.head()
            r10 = r0
            r0 = r9
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r9 = r0
            r0 = r10
            if (r0 == 0) goto Lab
            r0 = r10
            r1 = r6
            r0.accept(r1)
        Lab:
            goto L91
        Lae:
            goto L17e
        Lb1:
            r0 = r8
            r1 = 320(0x140, float:4.48E-43)
            if (r0 != r1) goto Lc0
            r0 = r6
            r1 = r7
            r0.atIfStmnt(r1)
            goto L17e
        Lc0:
            r0 = r8
            r1 = 346(0x15a, float:4.85E-43)
            if (r0 == r1) goto Lce
            r0 = r8
            r1 = 311(0x137, float:4.36E-43)
            if (r0 != r1) goto Le2
        Lce:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 346(0x15a, float:4.85E-43)
            if (r2 != r3) goto Ldb
            r2 = 1
            goto Ldc
        Ldb:
            r2 = 0
        Ldc:
            r0.atWhileStmnt(r1, r2)
            goto L17e
        Le2:
            r0 = r8
            r1 = 318(0x13e, float:4.46E-43)
            if (r0 != r1) goto Lf1
            r0 = r6
            r1 = r7
            r0.atForStmnt(r1)
            goto L17e
        Lf1:
            r0 = r8
            r1 = 302(0x12e, float:4.23E-43)
            if (r0 == r1) goto Lff
            r0 = r8
            r1 = 309(0x135, float:4.33E-43)
            if (r0 != r1) goto L113
        Lff:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 302(0x12e, float:4.23E-43)
            if (r2 != r3) goto L10c
            r2 = 1
            goto L10d
        L10c:
            r2 = 0
        L10d:
            r0.atBreakStmnt(r1, r2)
            goto L17e
        L113:
            r0 = r8
            r1 = 333(0x14d, float:4.67E-43)
            if (r0 != r1) goto L122
            r0 = r6
            r1 = r7
            r0.atReturnStmnt(r1)
            goto L17e
        L122:
            r0 = r8
            r1 = 340(0x154, float:4.76E-43)
            if (r0 != r1) goto L131
            r0 = r6
            r1 = r7
            r0.atThrowStmnt(r1)
            goto L17e
        L131:
            r0 = r8
            r1 = 343(0x157, float:4.8E-43)
            if (r0 != r1) goto L140
            r0 = r6
            r1 = r7
            r0.atTryStmnt(r1)
            goto L17e
        L140:
            r0 = r8
            r1 = 337(0x151, float:4.72E-43)
            if (r0 != r1) goto L14f
            r0 = r6
            r1 = r7
            r0.atSwitchStmnt(r1)
            goto L17e
        L14f:
            r0 = r8
            r1 = 338(0x152, float:4.74E-43)
            if (r0 != r1) goto L15e
            r0 = r6
            r1 = r7
            r0.atSyncStmnt(r1)
            goto L17e
        L15e:
            r0 = r6
            r1 = 0
            r0.hasReturned = r1
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "sorry, not supported statement: TokenId "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L17e:
            return
    }

    private void atIfStmnt(javassist.compiler.ast.Stmnt r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.head()
            r7 = r0
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r8 = r0
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r9 = r0
            r0 = r5
            r1 = 0
            r2 = r7
            boolean r0 = r0.compileBooleanExpr(r1, r2)
            if (r0 == 0) goto L39
            r0 = r5
            r1 = 0
            r0.hasReturned = r1
            r0 = r9
            if (r0 == 0) goto L38
            r0 = r9
            r1 = r5
            r0.accept(r1)
        L38:
            return
        L39:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIndex(r1)
            r0 = r5
            r1 = 0
            r0.hasReturned = r1
            r0 = r8
            if (r0 == 0) goto L5b
            r0 = r8
            r1 = r5
            r0.accept(r1)
        L5b:
            r0 = r5
            boolean r0 = r0.hasReturned
            r12 = r0
            r0 = r5
            r1 = 0
            r0.hasReturned = r1
            r0 = r9
            if (r0 == 0) goto L8b
            r0 = r12
            if (r0 != 0) goto L8b
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r11 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIndex(r1)
        L8b:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r10
            r2 = r5
            javassist.bytecode.Bytecode r2 = r2.bytecode
            int r2 = r2.currentPc()
            r3 = r10
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            r0 = r9
            if (r0 == 0) goto Lda
            r0 = r9
            r1 = r5
            r0.accept(r1)
            r0 = r12
            if (r0 != 0) goto Lc5
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r11
            r2 = r5
            javassist.bytecode.Bytecode r2 = r2.bytecode
            int r2 = r2.currentPc()
            r3 = r11
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
        Lc5:
            r0 = r5
            r1 = r12
            if (r1 == 0) goto Ld6
            r1 = r5
            boolean r1 = r1.hasReturned
            if (r1 == 0) goto Ld6
            r1 = 1
            goto Ld7
        Ld6:
            r1 = 0
        Ld7:
            r0.hasReturned = r1
        Lda:
            return
    }

    private void atWhileStmnt(javassist.compiler.ast.Stmnt r6, boolean r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.Integer> r0 = r0.breakList
            r8 = r0
            r0 = r5
            java.util.List<java.lang.Integer> r0 = r0.continueList
            r9 = r0
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.breakList = r1
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.continueList = r1
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.head()
            r10 = r0
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r7
            if (r0 == 0) goto L52
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r12 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIndex(r1)
        L52:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r13 = r0
            r0 = r11
            if (r0 == 0) goto L66
            r0 = r11
            r1 = r5
            r0.accept(r1)
        L66:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r14 = r0
            r0 = r7
            if (r0 == 0) goto L83
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r12
            r2 = r14
            r3 = r12
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
        L83:
            r0 = r5
            r1 = 1
            r2 = r10
            boolean r0 = r0.compileBooleanExpr(r1, r2)
            r15 = r0
            r0 = r15
            if (r0 == 0) goto La6
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r5
            java.util.List<java.lang.Integer> r0 = r0.breakList
            boolean r0 = r0.isEmpty()
            r15 = r0
        La6:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r13
            r2 = r5
            javassist.bytecode.Bytecode r2 = r2.bytecode
            int r2 = r2.currentPc()
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 + r2
            r0.addIndex(r1)
            r0 = r5
            r1 = r5
            java.util.List<java.lang.Integer> r1 = r1.breakList
            r2 = r5
            javassist.bytecode.Bytecode r2 = r2.bytecode
            int r2 = r2.currentPc()
            r0.patchGoto(r1, r2)
            r0 = r5
            r1 = r5
            java.util.List<java.lang.Integer> r1 = r1.continueList
            r2 = r14
            r0.patchGoto(r1, r2)
            r0 = r5
            r1 = r9
            r0.continueList = r1
            r0 = r5
            r1 = r8
            r0.breakList = r1
            r0 = r5
            r1 = r15
            r0.hasReturned = r1
            return
    }

    protected void patchGoto(java.util.List<java.lang.Integer> r6, int r7) {
            r5 = this;
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L7:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L30
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r9 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r9
            r2 = r7
            r3 = r9
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            goto L7
        L30:
            return
    }

    private void atForStmnt(javassist.compiler.ast.Stmnt r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.Integer> r0 = r0.breakList
            r7 = r0
            r0 = r5
            java.util.List<java.lang.Integer> r0 = r0.continueList
            r8 = r0
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.breakList = r1
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.continueList = r1
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r9 = r0
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r10 = r0
            r0 = r10
            javassist.compiler.ast.ASTree r0 = r0.head()
            r11 = r0
            r0 = r10
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r10 = r0
            r0 = r10
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r12 = r0
            r0 = r10
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r13 = r0
            r0 = r9
            if (r0 == 0) goto L5c
            r0 = r9
            r1 = r5
            r0.accept(r1)
        L5c:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r11
            if (r0 == 0) goto L98
            r0 = r5
            r1 = 0
            r2 = r11
            boolean r0 = r0.compileBooleanExpr(r1, r2)
            if (r0 == 0) goto L87
            r0 = r5
            r1 = r8
            r0.continueList = r1
            r0 = r5
            r1 = r7
            r0.breakList = r1
            r0 = r5
            r1 = 0
            r0.hasReturned = r1
            return
        L87:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r15 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIndex(r1)
        L98:
            r0 = r13
            if (r0 == 0) goto La3
            r0 = r13
            r1 = r5
            r0.accept(r1)
        La3:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r16 = r0
            r0 = r12
            if (r0 == 0) goto Lb7
            r0 = r12
            r1 = r5
            r0.accept(r1)
        Lb7:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r14
            r2 = r5
            javassist.bytecode.Bytecode r2 = r2.bytecode
            int r2 = r2.currentPc()
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 + r2
            r0.addIndex(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r17 = r0
            r0 = r11
            if (r0 == 0) goto Lf2
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r15
            r2 = r17
            r3 = r15
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
        Lf2:
            r0 = r5
            r1 = r5
            java.util.List<java.lang.Integer> r1 = r1.breakList
            r2 = r17
            r0.patchGoto(r1, r2)
            r0 = r5
            r1 = r5
            java.util.List<java.lang.Integer> r1 = r1.continueList
            r2 = r16
            r0.patchGoto(r1, r2)
            r0 = r5
            r1 = r8
            r0.continueList = r1
            r0 = r5
            r1 = r7
            r0.breakList = r1
            r0 = r5
            r1 = 0
            r0.hasReturned = r1
            return
    }

    private void atSwitchStmnt(javassist.compiler.ast.Stmnt r10) throws javassist.compiler.CompileError {
            r9 = this;
            r0 = 0
            r11 = r0
            r0 = r9
            javassist.compiler.TypeChecker r0 = r0.typeChecker
            if (r0 == 0) goto L3e
            r0 = r9
            r1 = r10
            javassist.compiler.ast.ASTree r1 = r1.head()
            r0.doTypeCheck(r1)
            r0 = r9
            javassist.compiler.TypeChecker r0 = r0.typeChecker
            int r0 = r0.exprType
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L3c
            r0 = r9
            javassist.compiler.TypeChecker r0 = r0.typeChecker
            int r0 = r0.arrayDim
            if (r0 != 0) goto L3c
            java.lang.String r0 = "java/lang/String"
            r1 = r9
            javassist.compiler.TypeChecker r1 = r1.typeChecker
            java.lang.String r1 = r1.className
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            r11 = r0
        L3e:
            r0 = r9
            r1 = r10
            javassist.compiler.ast.ASTree r1 = r1.head()
            r0.compileExpr(r1)
            r0 = -1
            r12 = r0
            r0 = r11
            if (r0 == 0) goto L76
            r0 = r9
            int r0 = r0.getMaxLocals()
            r12 = r0
            r0 = r9
            r1 = 1
            r0.incMaxLocals(r1)
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r12
            r0.addAstore(r1)
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r12
            r0.addAload(r1)
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java/lang/String"
            java.lang.String r2 = "hashCode"
            java.lang.String r3 = "()I"
            r0.addInvokevirtual(r1, r2, r3)
        L76:
            r0 = r9
            java.util.List<java.lang.Integer> r0 = r0.breakList
            r13 = r0
            r0 = r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.breakList = r1
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r14 = r0
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 171(0xab, float:2.4E-43)
            r0.addOpcode(r1)
            r0 = 3
            r1 = r14
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 - r1
            r15 = r0
        La2:
            r0 = r15
            int r15 = r15 + (-1)
            if (r0 <= 0) goto Lb5
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.add(r1)
            goto La2
        Lb5:
            r0 = r10
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r16
            r18 = r0
        Lc5:
            r0 = r18
            if (r0 == 0) goto Le8
            r0 = r18
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            int r0 = r0.getOperator()
            r1 = 304(0x130, float:4.26E-43)
            if (r0 != r1) goto Lde
            int r17 = r17 + 1
        Lde:
            r0 = r18
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r18 = r0
            goto Lc5
        Le8:
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r18 = r0
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 4
            r0.addGap(r1)
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r17
            r0.add32bit(r1)
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r17
            r2 = 8
            int r1 = r1 * r2
            r0.addGap(r1)
            r0 = r17
            long[] r0 = new long[r0]
            r19 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = -1
            r22 = r0
            r0 = r16
            r23 = r0
        L127:
            r0 = r23
            if (r0 == 0) goto L1bd
            r0 = r23
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r24 = r0
            r0 = r24
            int r0 = r0.getOperator()
            r25 = r0
            r0 = r25
            r1 = 310(0x136, float:4.34E-43)
            if (r0 != r1) goto L151
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r22 = r0
            goto L1a2
        L151:
            r0 = r25
            r1 = 304(0x130, float:4.26E-43)
            if (r0 == r1) goto L15f
            fatal()
            goto L1a2
        L15f:
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r26 = r0
            r0 = r11
            if (r0 == 0) goto L17e
            r0 = r9
            r1 = r24
            javassist.compiler.ast.ASTree r1 = r1.head()
            r2 = r12
            r3 = r20
            int r0 = r0.computeStringLabel(r1, r2, r3)
            long r0 = (long) r0
            r27 = r0
            goto L18a
        L17e:
            r0 = r9
            r1 = r24
            javassist.compiler.ast.ASTree r1 = r1.head()
            int r0 = r0.computeLabel(r1)
            long r0 = (long) r0
            r27 = r0
        L18a:
            r0 = r19
            r1 = r21
            int r21 = r21 + 1
            r2 = r27
            r3 = 32
            long r2 = r2 << r3
            r3 = r26
            r4 = r14
            int r3 = r3 - r4
            long r3 = (long) r3
            r4 = -1
            long r3 = r3 & r4
            long r2 = r2 + r3
            r0[r1] = r2
        L1a2:
            r0 = r9
            r1 = 0
            r0.hasReturned = r1
            r0 = r24
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r1 = r9
            r0.accept(r1)
            r0 = r23
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r23 = r0
            goto L127
        L1bd:
            r0 = r19
            java.util.Arrays.sort(r0)
            r0 = r18
            r1 = 8
            int r0 = r0 + r1
            r23 = r0
            r0 = 0
            r24 = r0
        L1cc:
            r0 = r24
            r1 = r17
            if (r0 >= r1) goto L1ff
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r23
            r2 = r19
            r3 = r24
            r2 = r2[r3]
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r0.write32bit(r1, r2)
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r23
            r2 = 4
            int r1 = r1 + r2
            r2 = r19
            r3 = r24
            r2 = r2[r3]
            int r2 = (int) r2
            r0.write32bit(r1, r2)
            int r23 = r23 + 8
            int r24 = r24 + 1
            goto L1cc
        L1ff:
            r0 = r22
            if (r0 < 0) goto L210
            r0 = r9
            java.util.List<java.lang.Integer> r0 = r0.breakList
            int r0 = r0.size()
            if (r0 <= 0) goto L215
        L210:
            r0 = r9
            r1 = 0
            r0.hasReturned = r1
        L215:
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r24 = r0
            r0 = r22
            if (r0 >= 0) goto L227
            r0 = r24
            r22 = r0
        L227:
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r18
            r2 = r22
            r3 = r14
            int r2 = r2 - r3
            r0.write32bit(r1, r2)
            r0 = r20
            java.util.Iterator r0 = r0.iterator()
            r25 = r0
        L23c:
            r0 = r25
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L268
            r0 = r25
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r26 = r0
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r26
            r2 = r22
            r3 = r26
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            goto L23c
        L268:
            r0 = r9
            r1 = r9
            java.util.List<java.lang.Integer> r1 = r1.breakList
            r2 = r24
            r0.patchGoto(r1, r2)
            r0 = r9
            r1 = r13
            r0.breakList = r1
            return
    }

    private int computeLabel(javassist.compiler.ast.ASTree r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.doTypeCheck(r1)
            r0 = r5
            javassist.compiler.ast.ASTree r0 = javassist.compiler.TypeChecker.stripPlusExpr(r0)
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof javassist.compiler.ast.IntConst
            if (r0 == 0) goto L1a
            r0 = r5
            javassist.compiler.ast.IntConst r0 = (javassist.compiler.ast.IntConst) r0
            long r0 = r0.get()
            int r0 = (int) r0
            return r0
        L1a:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad case label"
            r1.<init>(r2)
            throw r0
    }

    private int computeStringLabel(javassist.compiler.ast.ASTree r6, int r7, java.util.List<java.lang.Integer> r8) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            r1 = r6
            r0.doTypeCheck(r1)
            r0 = r6
            javassist.compiler.ast.ASTree r0 = javassist.compiler.TypeChecker.stripPlusExpr(r0)
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.StringL
            if (r0 == 0) goto L68
            r0 = r6
            javassist.compiler.ast.StringL r0 = (javassist.compiler.ast.StringL) r0
            java.lang.String r0 = r0.get()
            r9 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r7
            r0.addAload(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r9
            r0.addLdc(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java/lang/String"
            java.lang.String r2 = "equals"
            java.lang.String r3 = "(Ljava/lang/Object;)Z"
            r0.addInvokevirtual(r1, r2, r3)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 153(0x99, float:2.14E-43)
            r0.addOpcode(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIndex(r1)
            r0 = r8
            r1 = r10
            boolean r0 = r0.add(r1)
            r0 = r9
            int r0 = r0.hashCode()
            return r0
        L68:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad case label"
            r1.<init>(r2)
            throw r0
    }

    private void atBreakStmnt(javassist.compiler.ast.Stmnt r5, boolean r6) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.head()
            if (r0 == 0) goto L12
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "sorry, not support labeled break or continue"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7 = r0
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIndex(r1)
            r0 = r6
            if (r0 == 0) goto L41
            r0 = r4
            java.util.List<java.lang.Integer> r0 = r0.breakList
            r1 = r7
            boolean r0 = r0.add(r1)
            goto L4c
        L41:
            r0 = r4
            java.util.List<java.lang.Integer> r0 = r0.continueList
            r1 = r7
            boolean r0 = r0.add(r1)
        L4c:
            return
    }

    protected void atReturnStmnt(javassist.compiler.ast.Stmnt r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.compiler.ast.ASTree r1 = r1.getLeft()
            r0.atReturnStmnt2(r1)
            return
    }

    protected final void atReturnStmnt2(javassist.compiler.ast.ASTree r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto Lb
            r0 = 177(0xb1, float:2.48E-43)
            r6 = r0
            goto L5f
        Lb:
            r0 = r4
            r1 = r5
            r0.compileExpr(r1)
            r0 = r4
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L1e
            r0 = 176(0xb0, float:2.47E-43)
            r6 = r0
            goto L5f
        L1e:
            r0 = r4
            int r0 = r0.exprType
            r7 = r0
            r0 = r7
            r1 = 312(0x138, float:4.37E-43)
            if (r0 != r1) goto L31
            r0 = 175(0xaf, float:2.45E-43)
            r6 = r0
            goto L5f
        L31:
            r0 = r7
            r1 = 317(0x13d, float:4.44E-43)
            if (r0 != r1) goto L3f
            r0 = 174(0xae, float:2.44E-43)
            r6 = r0
            goto L5f
        L3f:
            r0 = r7
            r1 = 326(0x146, float:4.57E-43)
            if (r0 != r1) goto L4d
            r0 = 173(0xad, float:2.42E-43)
            r6 = r0
            goto L5f
        L4d:
            r0 = r7
            boolean r0 = isRefType(r0)
            if (r0 == 0) goto L5b
            r0 = 176(0xb0, float:2.47E-43)
            r6 = r0
            goto L5f
        L5b:
            r0 = 172(0xac, float:2.41E-43)
            r6 = r0
        L5f:
            r0 = r4
            javassist.compiler.CodeGen$ReturnHook r0 = r0.returnHooks
            r7 = r0
        L64:
            r0 = r7
            if (r0 == 0) goto L82
            r0 = r7
            r1 = r4
            javassist.bytecode.Bytecode r1 = r1.bytecode
            r2 = r6
            boolean r0 = r0.doit(r1, r2)
            if (r0 == 0) goto L7a
            r0 = r4
            r1 = 1
            r0.hasReturned = r1
            return
        L7a:
            r0 = r7
            javassist.compiler.CodeGen$ReturnHook r0 = r0.next
            r7 = r0
            goto L64
        L82:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            r0.addOpcode(r1)
            r0 = r4
            r1 = 1
            r0.hasReturned = r1
            return
    }

    private void atThrowStmnt(javassist.compiler.ast.Stmnt r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            r6 = r0
            r0 = r4
            r1 = r6
            r0.compileExpr(r1)
            r0 = r4
            int r0 = r0.exprType
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L1b
            r0 = r4
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L26
        L1b:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad throw statement"
            r1.<init>(r2)
            throw r0
        L26:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 191(0xbf, float:2.68E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 1
            r0.hasReturned = r1
            return
    }

    protected void atTryStmnt(javassist.compiler.ast.Stmnt r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.hasReturned = r1
            return
    }

    private void atSyncStmnt(javassist.compiler.ast.Stmnt r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            java.util.List<java.lang.Integer> r0 = r0.breakList
            int r0 = getListSize(r0)
            r8 = r0
            r0 = r6
            java.util.List<java.lang.Integer> r0 = r0.continueList
            int r0 = getListSize(r0)
            r9 = r0
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r1 = r1.head()
            r0.compileExpr(r1)
            r0 = r6
            int r0 = r0.exprType
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L34
            r0 = r6
            int r0 = r0.arrayDim
            if (r0 != 0) goto L34
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad type expr for synchronized block"
            r1.<init>(r2)
            throw r0
        L34:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r10 = r0
            r0 = r10
            int r0 = r0.getMaxLocals()
            r11 = r0
            r0 = r10
            r1 = 1
            r0.incMaxLocals(r1)
            r0 = r10
            r1 = 89
            r0.addOpcode(r1)
            r0 = r10
            r1 = r11
            r0.addAstore(r1)
            r0 = r10
            r1 = 194(0xc2, float:2.72E-43)
            r0.addOpcode(r1)
            javassist.compiler.CodeGen$1 r0 = new javassist.compiler.CodeGen$1
            r1 = r0
            r2 = r6
            r3 = r6
            r4 = r11
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r10
            int r0 = r0.currentPc()
            r13 = r0
            r0 = r7
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L85
            r0 = r14
            r1 = r6
            r0.accept(r1)
        L85:
            r0 = r10
            int r0 = r0.currentPc()
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = r6
            boolean r0 = r0.hasReturned
            if (r0 != 0) goto Lb4
            r0 = r12
            r1 = r10
            r2 = 0
            boolean r0 = r0.doit(r1, r2)
            r0 = r10
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r10
            int r0 = r0.currentPc()
            r16 = r0
            r0 = r10
            r1 = 0
            r0.addIndex(r1)
        Lb4:
            r0 = r13
            r1 = r15
            if (r0 >= r1) goto Ldf
            r0 = r10
            int r0 = r0.currentPc()
            r17 = r0
            r0 = r12
            r1 = r10
            r2 = 0
            boolean r0 = r0.doit(r1, r2)
            r0 = r10
            r1 = 191(0xbf, float:2.68E-43)
            r0.addOpcode(r1)
            r0 = r10
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = 0
            r0.addExceptionHandler(r1, r2, r3, r4)
        Ldf:
            r0 = r6
            boolean r0 = r0.hasReturned
            if (r0 != 0) goto Lf7
            r0 = r10
            r1 = r16
            r2 = r10
            int r2 = r2.currentPc()
            r3 = r16
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
        Lf7:
            r0 = r12
            r1 = r6
            r0.remove(r1)
            r0 = r6
            java.util.List<java.lang.Integer> r0 = r0.breakList
            int r0 = getListSize(r0)
            r1 = r8
            if (r0 != r1) goto L113
            r0 = r6
            java.util.List<java.lang.Integer> r0 = r0.continueList
            int r0 = getListSize(r0)
            r1 = r9
            if (r0 == r1) goto L11e
        L113:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "sorry, cannot break/continue in synchronized block"
            r1.<init>(r2)
            throw r0
        L11e:
            return
    }

    private static int getListSize(java.util.List<java.lang.Integer> r2) {
            r0 = r2
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            r0 = r2
            int r0 = r0.size()
        Le:
            return r0
    }

    private static boolean isPlusPlusExpr(javassist.compiler.ast.ASTree r3) {
            r0 = r3
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L23
            r0 = r3
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            int r0 = r0.getOperator()
            r4 = r0
            r0 = r4
            r1 = 362(0x16a, float:5.07E-43)
            if (r0 == r1) goto L1d
            r0 = r4
            r1 = 363(0x16b, float:5.09E-43)
            if (r0 != r1) goto L21
        L1d:
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
        L23:
            r0 = 0
            return r0
    }

    @Override // javassist.compiler.ast.Visitor
    public void atDeclarator(javassist.compiler.ast.Declarator r9) throws javassist.compiler.CompileError {
            r8 = this;
            r0 = r9
            r1 = r8
            int r1 = r1.getMaxLocals()
            r0.setLocalVar(r1)
            r0 = r9
            r1 = r8
            r2 = r9
            java.lang.String r2 = r2.getClassName()
            java.lang.String r1 = r1.resolveClassName(r2)
            r0.setClassName(r1)
            r0 = r9
            int r0 = r0.getType()
            r1 = r9
            int r1 = r1.getArrayDim()
            boolean r0 = is2word(r0, r1)
            if (r0 == 0) goto L27
            r0 = 2
            r10 = r0
            goto L29
        L27:
            r0 = 1
            r10 = r0
        L29:
            r0 = r8
            r1 = r10
            r0.incMaxLocals(r1)
            r0 = r9
            javassist.compiler.ast.ASTree r0 = r0.getInitializer()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L47
            r0 = r8
            r1 = r11
            r0.doTypeCheck(r1)
            r0 = r8
            r1 = 0
            r2 = 61
            r3 = 0
            r4 = r9
            r5 = r11
            r6 = 0
            r0.atVariableAssign(r1, r2, r3, r4, r5, r6)
        L47:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public abstract void atNewExpr(javassist.compiler.ast.NewExpr r1) throws javassist.compiler.CompileError;

    @Override // javassist.compiler.ast.Visitor
    public abstract void atArrayInit(javassist.compiler.ast.ArrayInit r1) throws javassist.compiler.CompileError;

    @Override // javassist.compiler.ast.Visitor
    public void atAssignExpr(javassist.compiler.ast.AssignExpr r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            r0.atAssignExpr(r1, r2)
            return
    }

    protected void atAssignExpr(javassist.compiler.ast.AssignExpr r9, boolean r10) throws javassist.compiler.CompileError {
            r8 = this;
            r0 = r9
            int r0 = r0.getOperator()
            r11 = r0
            r0 = r9
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r12 = r0
            r0 = r9
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            r13 = r0
            r0 = r12
            boolean r0 = r0 instanceof javassist.compiler.ast.Variable
            if (r0 == 0) goto L32
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            javassist.compiler.ast.Variable r3 = (javassist.compiler.ast.Variable) r3
            r4 = r12
            javassist.compiler.ast.Variable r4 = (javassist.compiler.ast.Variable) r4
            javassist.compiler.ast.Declarator r4 = r4.getDeclarator()
            r5 = r13
            r6 = r10
            r0.atVariableAssign(r1, r2, r3, r4, r5, r6)
            goto L65
        L32:
            r0 = r12
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L5a
            r0 = r12
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r14 = r0
            r0 = r14
            int r0 = r0.getOperator()
            r1 = 65
            if (r0 != r1) goto L5a
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            javassist.compiler.ast.Expr r3 = (javassist.compiler.ast.Expr) r3
            r4 = r13
            r5 = r10
            r0.atArrayAssign(r1, r2, r3, r4, r5)
            return
        L5a:
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r10
            r0.atFieldAssign(r1, r2, r3, r4, r5)
        L65:
            return
    }

    protected static void badAssign(javassist.compiler.ast.Expr r4) throws javassist.compiler.CompileError {
            r0 = r4
            if (r0 != 0) goto Lb
            java.lang.String r0 = "incompatible type for assignment"
            r5 = r0
            goto L23
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "incompatible type for "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5 = r0
        L23:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    private void atVariableAssign(javassist.compiler.ast.Expr r9, int r10, javassist.compiler.ast.Variable r11, javassist.compiler.ast.Declarator r12, javassist.compiler.ast.ASTree r13, boolean r14) throws javassist.compiler.CompileError {
            r8 = this;
            r0 = r12
            int r0 = r0.getType()
            r15 = r0
            r0 = r12
            int r0 = r0.getArrayDim()
            r16 = r0
            r0 = r12
            java.lang.String r0 = r0.getClassName()
            r17 = r0
            r0 = r8
            r1 = r12
            int r0 = r0.getLocalVar(r1)
            r18 = r0
            r0 = r10
            r1 = 61
            if (r0 == r1) goto L28
            r0 = r8
            r1 = r11
            r0.atVariable(r1)
        L28:
            r0 = r9
            if (r0 != 0) goto L46
            r0 = r13
            boolean r0 = r0 instanceof javassist.compiler.ast.ArrayInit
            if (r0 == 0) goto L46
            r0 = r8
            r1 = r13
            javassist.compiler.ast.ArrayInit r1 = (javassist.compiler.ast.ArrayInit) r1
            r2 = r15
            r3 = r16
            r4 = r17
            r0.atArrayVariableAssign(r1, r2, r3, r4)
            goto L54
        L46:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r0.atAssignCore(r1, r2, r3, r4, r5, r6)
        L54:
            r0 = r14
            if (r0 == 0) goto L78
            r0 = r15
            r1 = r16
            boolean r0 = is2word(r0, r1)
            if (r0 == 0) goto L6f
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 92
            r0.addOpcode(r1)
            goto L78
        L6f:
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 89
            r0.addOpcode(r1)
        L78:
            r0 = r16
            if (r0 <= 0) goto L89
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r18
            r0.addAstore(r1)
            goto Le2
        L89:
            r0 = r15
            r1 = 312(0x138, float:4.37E-43)
            if (r0 != r1) goto L9d
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r18
            r0.addDstore(r1)
            goto Le2
        L9d:
            r0 = r15
            r1 = 317(0x13d, float:4.44E-43)
            if (r0 != r1) goto Lb1
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r18
            r0.addFstore(r1)
            goto Le2
        Lb1:
            r0 = r15
            r1 = 326(0x146, float:4.57E-43)
            if (r0 != r1) goto Lc5
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r18
            r0.addLstore(r1)
            goto Le2
        Lc5:
            r0 = r15
            boolean r0 = isRefType(r0)
            if (r0 == 0) goto Ld9
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r18
            r0.addAstore(r1)
            goto Le2
        Ld9:
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r18
            r0.addIstore(r1)
        Le2:
            r0 = r8
            r1 = r15
            r0.exprType = r1
            r0 = r8
            r1 = r16
            r0.arrayDim = r1
            r0 = r8
            r1 = r17
            r0.className = r1
            return
    }

    protected abstract void atArrayVariableAssign(javassist.compiler.ast.ArrayInit r1, int r2, int r3, java.lang.String r4) throws javassist.compiler.CompileError;

    private void atArrayAssign(javassist.compiler.ast.Expr r9, int r10, javassist.compiler.ast.Expr r11, javassist.compiler.ast.ASTree r12, boolean r13) throws javassist.compiler.CompileError {
            r8 = this;
            r0 = r8
            r1 = r11
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            r2 = r11
            javassist.compiler.ast.ASTree r2 = r2.oprand2()
            r0.arrayAccess(r1, r2)
            r0 = r10
            r1 = 61
            if (r0 == r1) goto L2d
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 92
            r0.addOpcode(r1)
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r8
            int r1 = r1.exprType
            r2 = r8
            int r2 = r2.arrayDim
            int r1 = getArrayReadOp(r1, r2)
            r0.addOpcode(r1)
        L2d:
            r0 = r8
            int r0 = r0.exprType
            r14 = r0
            r0 = r8
            int r0 = r0.arrayDim
            r15 = r0
            r0 = r8
            java.lang.String r0 = r0.className
            r16 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r0.atAssignCore(r1, r2, r3, r4, r5, r6)
            r0 = r13
            if (r0 == 0) goto L71
            r0 = r14
            r1 = r15
            boolean r0 = is2word(r0, r1)
            if (r0 == 0) goto L68
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 94
            r0.addOpcode(r1)
            goto L71
        L68:
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 91
            r0.addOpcode(r1)
        L71:
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r14
            r2 = r15
            int r1 = getArrayWriteOp(r1, r2)
            r0.addOpcode(r1)
            r0 = r8
            r1 = r14
            r0.exprType = r1
            r0 = r8
            r1 = r15
            r0.arrayDim = r1
            r0 = r8
            r1 = r16
            r0.className = r1
            return
    }

    protected abstract void atFieldAssign(javassist.compiler.ast.Expr r1, int r2, javassist.compiler.ast.ASTree r3, javassist.compiler.ast.ASTree r4, boolean r5) throws javassist.compiler.CompileError;

    protected void atAssignCore(javassist.compiler.ast.Expr r10, int r11, javassist.compiler.ast.ASTree r12, int r13, int r14, java.lang.String r15) throws javassist.compiler.CompileError {
            r9 = this;
            r0 = r11
            r1 = 354(0x162, float:4.96E-43)
            if (r0 != r1) goto L23
            r0 = r14
            if (r0 != 0) goto L23
            r0 = r13
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L23
            r0 = r9
            r1 = r10
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r12
            r0.atStringPlusEq(r1, r2, r3, r4, r5)
            goto L7c
        L23:
            r0 = r12
            r1 = r9
            r0.accept(r1)
            r0 = r9
            r1 = r9
            int r1 = r1.exprType
            r2 = r9
            int r2 = r2.arrayDim
            r3 = r9
            java.lang.String r3 = r3.className
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = 0
            boolean r0 = r0.invalidDim(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L4d
            r0 = r11
            r1 = 61
            if (r0 == r1) goto L51
            r0 = r14
            if (r0 <= 0) goto L51
        L4d:
            r0 = r10
            badAssign(r0)
        L51:
            r0 = r11
            r1 = 61
            if (r0 == r1) goto L7c
            int[] r0 = javassist.compiler.CodeGen.assignOps
            r1 = r11
            r2 = 351(0x15f, float:4.92E-43)
            int r1 = r1 - r2
            r0 = r0[r1]
            r16 = r0
            r0 = r16
            int r0 = lookupBinOp(r0)
            r17 = r0
            r0 = r17
            if (r0 >= 0) goto L71
            fatal()
        L71:
            r0 = r9
            r1 = r10
            r2 = r16
            r3 = r17
            r4 = r13
            r0.atArithBinExpr(r1, r2, r3, r4)
        L7c:
            r0 = r11
            r1 = 61
            if (r0 != r1) goto L8f
            r0 = r14
            if (r0 != 0) goto L99
            r0 = r13
            boolean r0 = isRefType(r0)
            if (r0 != 0) goto L99
        L8f:
            r0 = r9
            r1 = r9
            int r1 = r1.exprType
            r2 = r13
            r0.atNumCastExpr(r1, r2)
        L99:
            return
    }

    private void atStringPlusEq(javassist.compiler.ast.Expr r6, int r7, int r8, java.lang.String r9, javassist.compiler.ast.ASTree r10) throws javassist.compiler.CompileError {
            r5 = this;
            java.lang.String r0 = "java/lang/String"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lf
            r0 = r6
            badAssign(r0)
        Lf:
            r0 = r5
            r1 = r7
            r2 = r8
            r0.convToString(r1, r2)
            r0 = r10
            r1 = r5
            r0.accept(r1)
            r0 = r5
            r1 = r5
            int r1 = r1.exprType
            r2 = r5
            int r2 = r2.arrayDim
            r0.convToString(r1, r2)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "concat"
            java.lang.String r3 = "(Ljava/lang/String;)Ljava/lang/String;"
            r0.addInvokevirtual(r1, r2, r3)
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 0
            r0.arrayDim = r1
            r0 = r5
            java.lang.String r1 = "java/lang/String"
            r0.className = r1
            return
    }

    private boolean invalidDim(int r4, int r5, java.lang.String r6, int r7, int r8, java.lang.String r9, boolean r10) {
            r3 = this;
            r0 = r5
            r1 = r8
            if (r0 == r1) goto L47
            r0 = r4
            r1 = 412(0x19c, float:5.77E-43)
            if (r0 != r1) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r8
            if (r0 != 0) goto L29
            r0 = r7
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L29
            java.lang.String r0 = "java/lang/Object"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L29
            r0 = 0
            return r0
        L29:
            r0 = r10
            if (r0 == 0) goto L45
            r0 = r5
            if (r0 != 0) goto L45
            r0 = r4
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L45
            java.lang.String r0 = "java/lang/Object"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L45
            r0 = 0
            return r0
        L45:
            r0 = 1
            return r0
        L47:
            r0 = 0
            return r0
    }

    @Override // javassist.compiler.ast.Visitor
    public void atCondExpr(javassist.compiler.ast.CondExpr r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = r6
            javassist.compiler.ast.ASTree r2 = r2.condExpr()
            boolean r0 = r0.booleanExpr(r1, r2)
            if (r0 == 0) goto L17
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.elseExpr()
            r1 = r5
            r0.accept(r1)
            goto L92
        L17:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r7 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIndex(r1)
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.thenExpr()
            r1 = r5
            r0.accept(r1)
            r0 = r5
            int r0 = r0.arrayDim
            r8 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r9 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIndex(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r7
            r2 = r5
            javassist.bytecode.Bytecode r2 = r2.bytecode
            int r2 = r2.currentPc()
            r3 = r7
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.elseExpr()
            r1 = r5
            r0.accept(r1)
            r0 = r8
            r1 = r5
            int r1 = r1.arrayDim
            if (r0 == r1) goto L7d
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "type mismatch in ?:"
            r1.<init>(r2)
            throw r0
        L7d:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r9
            r2 = r5
            javassist.bytecode.Bytecode r2 = r2.bytecode
            int r2 = r2.currentPc()
            r3 = r9
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
        L92:
            return
    }

    static int lookupBinOp(int r3) {
            int[] r0 = javassist.compiler.CodeGen.binOp
            r4 = r0
            r0 = r4
            int r0 = r0.length
            r5 = r0
            r0 = 0
            r6 = r0
        L9:
            r0 = r6
            r1 = r5
            if (r0 >= r1) goto L1e
            r0 = r4
            r1 = r6
            r0 = r0[r1]
            r1 = r3
            if (r0 != r1) goto L17
            r0 = r6
            return r0
        L17:
            r0 = r6
            r1 = 5
            int r0 = r0 + r1
            r6 = r0
            goto L9
        L1e:
            r0 = -1
            return r0
    }

    @Override // javassist.compiler.ast.Visitor
    public void atBinExpr(javassist.compiler.ast.BinExpr r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            int r0 = r0.getOperator()
            r8 = r0
            r0 = r8
            int r0 = lookupBinOp(r0)
            r9 = r0
            r0 = r9
            if (r0 < 0) goto L85
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r1 = r6
            r0.accept(r1)
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L22
            return
        L22:
            r0 = r6
            int r0 = r0.exprType
            r11 = r0
            r0 = r6
            int r0 = r0.arrayDim
            r12 = r0
            r0 = r6
            java.lang.String r0 = r0.className
            r13 = r0
            r0 = r10
            r1 = r6
            r0.accept(r1)
            r0 = r12
            r1 = r6
            int r1 = r1.arrayDim
            if (r0 == r1) goto L4e
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "incompatible array types"
            r1.<init>(r2)
            throw r0
        L4e:
            r0 = r8
            r1 = 43
            if (r0 != r1) goto L79
            r0 = r12
            if (r0 != 0) goto L79
            r0 = r11
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L6b
            r0 = r6
            int r0 = r0.exprType
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L79
        L6b:
            r0 = r6
            r1 = r7
            r2 = r11
            r3 = r12
            r4 = r13
            r0.atStringConcatExpr(r1, r2, r3, r4)
            goto L82
        L79:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r0.atArithBinExpr(r1, r2, r3, r4)
        L82:
            goto Lb9
        L85:
            r0 = r6
            r1 = 1
            r2 = r7
            boolean r0 = r0.booleanExpr(r1, r2)
            if (r0 != 0) goto Lb1
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 7
            r0.addIndex(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIconst(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 4
            r0.addIndex(r1)
        Lb1:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1
            r0.addIconst(r1)
        Lb9:
            return
    }

    private void atArithBinExpr(javassist.compiler.ast.Expr r6, int r7, int r8, int r9) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            int r0 = r0.arrayDim
            if (r0 == 0) goto Lb
            r0 = r6
            badTypes(r0)
        Lb:
            r0 = r5
            int r0 = r0.exprType
            r10 = r0
            r0 = r7
            r1 = 364(0x16c, float:5.1E-43)
            if (r0 == r1) goto L26
            r0 = r7
            r1 = 366(0x16e, float:5.13E-43)
            if (r0 == r1) goto L26
            r0 = r7
            r1 = 370(0x172, float:5.18E-43)
            if (r0 != r1) goto L56
        L26:
            r0 = r10
            r1 = 324(0x144, float:4.54E-43)
            if (r0 == r1) goto L46
            r0 = r10
            r1 = 334(0x14e, float:4.68E-43)
            if (r0 == r1) goto L46
            r0 = r10
            r1 = 306(0x132, float:4.29E-43)
            if (r0 == r1) goto L46
            r0 = r10
            r1 = 303(0x12f, float:4.25E-43)
            if (r0 != r1) goto L4f
        L46:
            r0 = r5
            r1 = r9
            r0.exprType = r1
            goto L5f
        L4f:
            r0 = r6
            badTypes(r0)
            goto L5f
        L56:
            r0 = r5
            r1 = r9
            r2 = r10
            r3 = r6
            r0.convertOprandTypes(r1, r2, r3)
        L5f:
            r0 = r5
            int r0 = r0.exprType
            int r0 = typePrecedence(r0)
            r11 = r0
            r0 = r11
            if (r0 < 0) goto L9f
            int[] r0 = javassist.compiler.CodeGen.binOp
            r1 = r8
            r2 = r11
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L9f
            r0 = r11
            r1 = 3
            if (r0 != r1) goto L95
            r0 = r5
            int r0 = r0.exprType
            r1 = 301(0x12d, float:4.22E-43)
            if (r0 == r1) goto L95
            r0 = r5
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
        L95:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r12
            r0.addOpcode(r1)
            return
        L9f:
            r0 = r6
            badTypes(r0)
            return
    }

    private void atStringConcatExpr(javassist.compiler.ast.Expr r6, int r7, int r8, java.lang.String r9) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            int r0 = r0.exprType
            r10 = r0
            r0 = r5
            int r0 = r0.arrayDim
            r11 = r0
            r0 = r10
            r1 = r11
            boolean r0 = is2word(r0, r1)
            r12 = r0
            r0 = r10
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L2e
            java.lang.String r0 = "java/lang/String"
            r1 = r5
            java.lang.String r1 = r1.className
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            r13 = r0
            r0 = r12
            if (r0 == 0) goto L3e
            r0 = r5
            r1 = r10
            r2 = r11
            r0.convToString(r1, r2)
        L3e:
            r0 = r7
            r1 = r8
            boolean r0 = is2word(r0, r1)
            if (r0 == 0) goto L5b
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 91
            r0.addOpcode(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 87
            r0.addOpcode(r1)
            goto L64
        L5b:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 95
            r0.addOpcode(r1)
        L64:
            r0 = r5
            r1 = r7
            r2 = r8
            r0.convToString(r1, r2)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 95
            r0.addOpcode(r1)
            r0 = r12
            if (r0 != 0) goto L85
            r0 = r13
            if (r0 != 0) goto L85
            r0 = r5
            r1 = r10
            r2 = r11
            r0.convToString(r1, r2)
        L85:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "concat"
            java.lang.String r3 = "(Ljava/lang/String;)Ljava/lang/String;"
            r0.addInvokevirtual(r1, r2, r3)
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = 0
            r0.arrayDim = r1
            r0 = r5
            java.lang.String r1 = "java/lang/String"
            r0.className = r1
            return
    }

    private void convToString(int r6, int r7) throws javassist.compiler.CompileError {
            r5 = this;
            java.lang.String r0 = "valueOf"
            r8 = r0
            r0 = r6
            boolean r0 = isRefType(r0)
            if (r0 != 0) goto Lf
            r0 = r7
            if (r0 <= 0) goto L22
        Lf:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "valueOf"
            java.lang.String r3 = "(Ljava/lang/Object;)Ljava/lang/String;"
            r0.addInvokestatic(r1, r2, r3)
            goto Lc6
        L22:
            r0 = r6
            r1 = 312(0x138, float:4.37E-43)
            if (r0 != r1) goto L3c
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "valueOf"
            java.lang.String r3 = "(D)Ljava/lang/String;"
            r0.addInvokestatic(r1, r2, r3)
            goto Lc6
        L3c:
            r0 = r6
            r1 = 317(0x13d, float:4.44E-43)
            if (r0 != r1) goto L56
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "valueOf"
            java.lang.String r3 = "(F)Ljava/lang/String;"
            r0.addInvokestatic(r1, r2, r3)
            goto Lc6
        L56:
            r0 = r6
            r1 = 326(0x146, float:4.57E-43)
            if (r0 != r1) goto L70
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "valueOf"
            java.lang.String r3 = "(J)Ljava/lang/String;"
            r0.addInvokestatic(r1, r2, r3)
            goto Lc6
        L70:
            r0 = r6
            r1 = 301(0x12d, float:4.22E-43)
            if (r0 != r1) goto L8a
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "valueOf"
            java.lang.String r3 = "(Z)Ljava/lang/String;"
            r0.addInvokestatic(r1, r2, r3)
            goto Lc6
        L8a:
            r0 = r6
            r1 = 306(0x132, float:4.29E-43)
            if (r0 != r1) goto La4
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "valueOf"
            java.lang.String r3 = "(C)Ljava/lang/String;"
            r0.addInvokestatic(r1, r2, r3)
            goto Lc6
        La4:
            r0 = r6
            r1 = 344(0x158, float:4.82E-43)
            if (r0 != r1) goto Lb6
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "void type expression"
            r1.<init>(r2)
            throw r0
        Lb6:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "valueOf"
            java.lang.String r3 = "(I)Ljava/lang/String;"
            r0.addInvokestatic(r1, r2, r3)
        Lc6:
            return
    }

    private boolean booleanExpr(boolean r7, javassist.compiler.ast.ASTree r8) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r8
            int r0 = getCompOperator(r0)
            r10 = r0
            r0 = r10
            r1 = 358(0x166, float:5.02E-43)
            if (r0 != r1) goto L2d
            r0 = r8
            javassist.compiler.ast.BinExpr r0 = (javassist.compiler.ast.BinExpr) r0
            r11 = r0
            r0 = r6
            r1 = r11
            int r0 = r0.compileOprands(r1)
            r12 = r0
            r0 = r6
            r1 = r7
            r2 = r11
            int r2 = r2.getOperator()
            r3 = r12
            r4 = r11
            r0.compareExpr(r1, r2, r3, r4)
            goto L12f
        L2d:
            r0 = r10
            r1 = 33
            if (r0 != r1) goto L49
            r0 = r6
            r1 = r7
            if (r1 != 0) goto L3d
            r1 = 1
            goto L3e
        L3d:
            r1 = 0
        L3e:
            r2 = r8
            javassist.compiler.ast.Expr r2 = (javassist.compiler.ast.Expr) r2
            javassist.compiler.ast.ASTree r2 = r2.oprand1()
            boolean r0 = r0.booleanExpr(r1, r2)
            return r0
        L49:
            r0 = r10
            r1 = 369(0x171, float:5.17E-43)
            if (r0 != r1) goto L55
            r0 = 1
            goto L56
        L55:
            r0 = 0
        L56:
            r1 = r0
            r9 = r1
            if (r0 != 0) goto L63
            r0 = r10
            r1 = 368(0x170, float:5.16E-43)
            if (r0 != r1) goto Le4
        L63:
            r0 = r8
            javassist.compiler.ast.BinExpr r0 = (javassist.compiler.ast.BinExpr) r0
            r11 = r0
            r0 = r6
            r1 = r9
            if (r1 != 0) goto L72
            r1 = 1
            goto L73
        L72:
            r1 = 0
        L73:
            r2 = r11
            javassist.compiler.ast.ASTree r2 = r2.oprand1()
            boolean r0 = r0.booleanExpr(r1, r2)
            if (r0 == 0) goto L8c
            r0 = r6
            r1 = 301(0x12d, float:4.22E-43)
            r0.exprType = r1
            r0 = r6
            r1 = 0
            r0.arrayDim = r1
            r0 = 1
            return r0
        L8c:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r12 = r0
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIndex(r1)
            r0 = r6
            r1 = r9
            r2 = r11
            javassist.compiler.ast.ASTree r2 = r2.oprand2()
            boolean r0 = r0.booleanExpr(r1, r2)
            if (r0 == 0) goto Lb4
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
        Lb4:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r12
            r2 = r6
            javassist.bytecode.Bytecode r2 = r2.bytecode
            int r2 = r2.currentPc()
            r3 = r12
            int r2 = r2 - r3
            r3 = 3
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            r0 = r7
            r1 = r9
            if (r0 == r1) goto Le1
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 6
            r0.addIndex(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
        Le1:
            goto L12f
        Le4:
            r0 = r8
            r1 = r7
            boolean r0 = isAlwaysBranch(r0, r1)
            if (r0 == 0) goto Lfa
            r0 = r6
            r1 = 301(0x12d, float:4.22E-43)
            r0.exprType = r1
            r0 = r6
            r1 = 0
            r0.arrayDim = r1
            r0 = 1
            return r0
        Lfa:
            r0 = r8
            r1 = r6
            r0.accept(r1)
            r0 = r6
            int r0 = r0.exprType
            r1 = 301(0x12d, float:4.22E-43)
            if (r0 != r1) goto L110
            r0 = r6
            int r0 = r0.arrayDim
            if (r0 == 0) goto L11b
        L110:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "boolean expr is required"
            r1.<init>(r2)
            throw r0
        L11b:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r7
            if (r1 == 0) goto L129
            r1 = 154(0x9a, float:2.16E-43)
            goto L12c
        L129:
            r1 = 153(0x99, float:2.14E-43)
        L12c:
            r0.addOpcode(r1)
        L12f:
            r0 = r6
            r1 = 301(0x12d, float:4.22E-43)
            r0.exprType = r1
            r0 = r6
            r1 = 0
            r0.arrayDim = r1
            r0 = 0
            return r0
    }

    private static boolean isAlwaysBranch(javassist.compiler.ast.ASTree r3, boolean r4) {
            r0 = r3
            boolean r0 = r0 instanceof javassist.compiler.ast.Keyword
            if (r0 == 0) goto L2f
            r0 = r3
            javassist.compiler.ast.Keyword r0 = (javassist.compiler.ast.Keyword) r0
            int r0 = r0.get()
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L22
            r0 = r5
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 != r1) goto L1e
            r0 = 1
            goto L2e
        L1e:
            r0 = 0
            goto L2e
        L22:
            r0 = r5
            r1 = 411(0x19b, float:5.76E-43)
            if (r0 != r1) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
        L2f:
            r0 = 0
            return r0
    }

    static int getCompOperator(javassist.compiler.ast.ASTree r3) throws javassist.compiler.CompileError {
            r0 = r3
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L41
            r0 = r3
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r4 = r0
            r0 = r4
            int r0 = r0.getOperator()
            r5 = r0
            r0 = r5
            r1 = 33
            if (r0 != r1) goto L1a
            r0 = 33
            return r0
        L1a:
            r0 = r4
            boolean r0 = r0 instanceof javassist.compiler.ast.BinExpr
            if (r0 == 0) goto L3f
            r0 = r5
            r1 = 368(0x170, float:5.16E-43)
            if (r0 == r1) goto L3f
            r0 = r5
            r1 = 369(0x171, float:5.17E-43)
            if (r0 == r1) goto L3f
            r0 = r5
            r1 = 38
            if (r0 == r1) goto L3f
            r0 = r5
            r1 = 124(0x7c, float:1.74E-43)
            if (r0 == r1) goto L3f
            r0 = 358(0x166, float:5.02E-43)
            return r0
        L3f:
            r0 = r5
            return r0
        L41:
            r0 = 32
            return r0
    }

    private int compileOprands(javassist.compiler.ast.BinExpr r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r1 = r4
            r0.accept(r1)
            r0 = r4
            int r0 = r0.exprType
            r6 = r0
            r0 = r4
            int r0 = r0.arrayDim
            r7 = r0
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            r1 = r4
            r0.accept(r1)
            r0 = r7
            r1 = r4
            int r1 = r1.arrayDim
            if (r0 == r1) goto L4d
            r0 = r6
            r1 = 412(0x19c, float:5.77E-43)
            if (r0 == r1) goto L3e
            r0 = r4
            int r0 = r0.exprType
            r1 = 412(0x19c, float:5.77E-43)
            if (r0 == r1) goto L3e
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "incompatible array types"
            r1.<init>(r2)
            throw r0
        L3e:
            r0 = r4
            int r0 = r0.exprType
            r1 = 412(0x19c, float:5.77E-43)
            if (r0 != r1) goto L4d
            r0 = r4
            r1 = r7
            r0.arrayDim = r1
        L4d:
            r0 = r6
            r1 = 412(0x19c, float:5.77E-43)
            if (r0 != r1) goto L59
            r0 = r4
            int r0 = r0.exprType
            return r0
        L59:
            r0 = r6
            return r0
    }

    private void compareExpr(boolean r6, int r7, int r8, javassist.compiler.ast.BinExpr r9) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            int r0 = r0.arrayDim
            if (r0 != 0) goto L12
            r0 = r5
            r1 = r8
            r2 = r5
            int r2 = r2.exprType
            r3 = r9
            r0.convertOprandTypes(r1, r2, r3)
        L12:
            r0 = r5
            int r0 = r0.exprType
            int r0 = typePrecedence(r0)
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 == r1) goto L28
            r0 = r5
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L6c
        L28:
            r0 = r7
            r1 = 358(0x166, float:5.02E-43)
            if (r0 != r1) goto L46
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            if (r1 == 0) goto L3d
            r1 = 165(0xa5, float:2.31E-43)
            goto L40
        L3d:
            r1 = 166(0xa6, float:2.33E-43)
        L40:
            r0.addOpcode(r1)
            goto L15a
        L46:
            r0 = r7
            r1 = 350(0x15e, float:4.9E-43)
            if (r0 != r1) goto L64
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            if (r1 == 0) goto L5b
            r1 = 166(0xa6, float:2.33E-43)
            goto L5e
        L5b:
            r1 = 165(0xa5, float:2.31E-43)
        L5e:
            r0.addOpcode(r1)
            goto L15a
        L64:
            r0 = r9
            badTypes(r0)
            goto L15a
        L6c:
            r0 = r10
            r1 = 3
            if (r0 != r1) goto Lb0
            int[] r0 = javassist.compiler.CodeGen.ifOp
            r11 = r0
            r0 = 0
            r12 = r0
        L7a:
            r0 = r12
            r1 = r11
            int r1 = r1.length
            if (r0 >= r1) goto La8
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            r1 = r7
            if (r0 != r1) goto La2
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r11
            r2 = r12
            r3 = r6
            if (r3 == 0) goto L9b
            r3 = 1
            goto L9c
        L9b:
            r3 = 2
        L9c:
            int r2 = r2 + r3
            r1 = r1[r2]
            r0.addOpcode(r1)
            return
        La2:
            int r12 = r12 + 3
            goto L7a
        La8:
            r0 = r9
            badTypes(r0)
            goto L15a
        Lb0:
            r0 = r10
            if (r0 != 0) goto Ldc
            r0 = r7
            r1 = 60
            if (r0 == r1) goto Lc2
            r0 = r7
            r1 = 357(0x165, float:5.0E-43)
            if (r0 != r1) goto Lcf
        Lc2:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 152(0x98, float:2.13E-43)
            r0.addOpcode(r1)
            goto L11f
        Lcf:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 151(0x97, float:2.12E-43)
            r0.addOpcode(r1)
            goto L11f
        Ldc:
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L109
            r0 = r7
            r1 = 60
            if (r0 == r1) goto Lef
            r0 = r7
            r1 = 357(0x165, float:5.0E-43)
            if (r0 != r1) goto Lfc
        Lef:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 150(0x96, float:2.1E-43)
            r0.addOpcode(r1)
            goto L11f
        Lfc:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 149(0x95, float:2.09E-43)
            r0.addOpcode(r1)
            goto L11f
        L109:
            r0 = r10
            r1 = 2
            if (r0 != r1) goto L11c
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 148(0x94, float:2.07E-43)
            r0.addOpcode(r1)
            goto L11f
        L11c:
            fatal()
        L11f:
            int[] r0 = javassist.compiler.CodeGen.ifOp2
            r11 = r0
            r0 = 0
            r12 = r0
        L127:
            r0 = r12
            r1 = r11
            int r1 = r1.length
            if (r0 >= r1) goto L155
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            r1 = r7
            if (r0 != r1) goto L14f
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r11
            r2 = r12
            r3 = r6
            if (r3 == 0) goto L148
            r3 = 1
            goto L149
        L148:
            r3 = 2
        L149:
            int r2 = r2 + r3
            r1 = r1[r2]
            r0.addOpcode(r1)
            return
        L14f:
            int r12 = r12 + 3
            goto L127
        L155:
            r0 = r9
            badTypes(r0)
        L15a:
            return
    }

    protected static void badTypes(javassist.compiler.ast.Expr r5) throws javassist.compiler.CompileError {
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "invalid types for "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    protected static boolean isRefType(int r3) {
            r0 = r3
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto Le
            r0 = r3
            r1 = 412(0x19c, float:5.77E-43)
            if (r0 != r1) goto L12
        Le:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private static int typePrecedence(int r3) {
            r0 = r3
            r1 = 312(0x138, float:4.37E-43)
            if (r0 != r1) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            r1 = 317(0x13d, float:4.44E-43)
            if (r0 != r1) goto L12
            r0 = 1
            return r0
        L12:
            r0 = r3
            r1 = 326(0x146, float:4.57E-43)
            if (r0 != r1) goto L1b
            r0 = 2
            return r0
        L1b:
            r0 = r3
            boolean r0 = isRefType(r0)
            if (r0 == 0) goto L24
            r0 = -1
            return r0
        L24:
            r0 = r3
            r1 = 344(0x158, float:4.82E-43)
            if (r0 != r1) goto L2d
            r0 = -1
            return r0
        L2d:
            r0 = 3
            return r0
    }

    static boolean isP_INT(int r3) {
            r0 = r3
            int r0 = typePrecedence(r0)
            r1 = 3
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    static boolean rightIsStrong(int r3, int r4) {
            r0 = r3
            int r0 = typePrecedence(r0)
            r5 = r0
            r0 = r4
            int r0 = typePrecedence(r0)
            r6 = r0
            r0 = r5
            if (r0 < 0) goto L1b
            r0 = r6
            if (r0 < 0) goto L1b
            r0 = r5
            r1 = r6
            if (r0 <= r1) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    private void convertOprandTypes(int r5, int r6, javassist.compiler.ast.Expr r7) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            int r0 = typePrecedence(r0)
            r9 = r0
            r0 = r6
            int r0 = typePrecedence(r0)
            r10 = r0
            r0 = r10
            if (r0 >= 0) goto L17
            r0 = r9
            if (r0 >= 0) goto L17
            return
        L17:
            r0 = r10
            if (r0 < 0) goto L21
            r0 = r9
            if (r0 >= 0) goto L25
        L21:
            r0 = r7
            badTypes(r0)
        L25:
            r0 = r9
            r1 = r10
            if (r0 > r1) goto L48
            r0 = 0
            r8 = r0
            r0 = r4
            r1 = r5
            r0.exprType = r1
            int[] r0 = javassist.compiler.CodeGen.castOp
            r1 = r10
            r2 = 4
            int r1 = r1 * r2
            r2 = r9
            int r1 = r1 + r2
            r0 = r0[r1]
            r11 = r0
            r0 = r9
            r12 = r0
            goto L5c
        L48:
            r0 = 1
            r8 = r0
            int[] r0 = javassist.compiler.CodeGen.castOp
            r1 = r9
            r2 = 4
            int r1 = r1 * r2
            r2 = r10
            int r1 = r1 + r2
            r0 = r0[r1]
            r11 = r0
            r0 = r10
            r12 = r0
        L5c:
            r0 = r8
            if (r0 == 0) goto Lf8
            r0 = r12
            if (r0 == 0) goto L6c
            r0 = r12
            r1 = 2
            if (r0 != r1) goto Lb3
        L6c:
            r0 = r9
            if (r0 == 0) goto L77
            r0 = r9
            r1 = 2
            if (r0 != r1) goto L83
        L77:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 94
            r0.addOpcode(r1)
            goto L8c
        L83:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 93
            r0.addOpcode(r1)
        L8c:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 88
            r0.addOpcode(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r11
            r0.addOpcode(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 94
            r0.addOpcode(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 88
            r0.addOpcode(r1)
            goto L106
        Lb3:
            r0 = r12
            r1 = 1
            if (r0 != r1) goto Lf2
            r0 = r9
            r1 = 2
            if (r0 != r1) goto Ld4
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 91
            r0.addOpcode(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 87
            r0.addOpcode(r1)
            goto Ldd
        Ld4:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 95
            r0.addOpcode(r1)
        Ldd:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r11
            r0.addOpcode(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 95
            r0.addOpcode(r1)
            goto L106
        Lf2:
            fatal()
            goto L106
        Lf8:
            r0 = r11
            if (r0 == 0) goto L106
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r11
            r0.addOpcode(r1)
        L106:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atCastExpr(javassist.compiler.ast.CastExpr r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            javassist.compiler.ast.ASTList r1 = r1.getClassName()
            java.lang.String r0 = r0.resolveClassName(r1)
            r6 = r0
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.String r0 = r0.checkCastExpr(r1, r2)
            r7 = r0
            r0 = r4
            int r0 = r0.exprType
            r8 = r0
            r0 = r4
            r1 = r5
            int r1 = r1.getType()
            r0.exprType = r1
            r0 = r4
            r1 = r5
            int r1 = r1.getArrayDim()
            r0.arrayDim = r1
            r0 = r4
            r1 = r6
            r0.className = r1
            r0 = r7
            if (r0 != 0) goto L3c
            r0 = r4
            r1 = r8
            r2 = r4
            int r2 = r2.exprType
            r0.atNumCastExpr(r1, r2)
            goto L44
        L3c:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r7
            r0.addCheckcast(r1)
        L44:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atInstanceOfExpr(javassist.compiler.ast.InstanceOfExpr r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            javassist.compiler.ast.ASTList r1 = r1.getClassName()
            java.lang.String r0 = r0.resolveClassName(r1)
            r6 = r0
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.String r0 = r0.checkCastExpr(r1, r2)
            r7 = r0
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r7
            r0.addInstanceof(r1)
            r0 = r4
            r1 = 301(0x12d, float:4.22E-43)
            r0.exprType = r1
            r0 = r4
            r1 = 0
            r0.arrayDim = r1
            return
    }

    private java.lang.String checkCastExpr(javassist.compiler.ast.CastExpr r10, java.lang.String r11) throws javassist.compiler.CompileError {
            r9 = this;
            java.lang.String r0 = "invalid cast"
            r12 = r0
            r0 = r10
            javassist.compiler.ast.ASTree r0 = r0.getOprand()
            r13 = r0
            r0 = r10
            int r0 = r0.getArrayDim()
            r14 = r0
            r0 = r10
            int r0 = r0.getType()
            r15 = r0
            r0 = r13
            r1 = r9
            r0.accept(r1)
            r0 = r9
            int r0 = r0.exprType
            r16 = r0
            r0 = r9
            int r0 = r0.arrayDim
            r17 = r0
            r0 = r9
            r1 = r16
            r2 = r9
            int r2 = r2.arrayDim
            r3 = r9
            java.lang.String r3 = r3.className
            r4 = r15
            r5 = r14
            r6 = r11
            r7 = 1
            boolean r0 = r0.invalidDim(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L4f
            r0 = r16
            r1 = 344(0x158, float:4.82E-43)
            if (r0 == r1) goto L4f
            r0 = r15
            r1 = 344(0x158, float:4.82E-43)
            if (r0 != r1) goto L5a
        L4f:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "invalid cast"
            r1.<init>(r2)
            throw r0
        L5a:
            r0 = r15
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L81
            r0 = r16
            boolean r0 = isRefType(r0)
            if (r0 != 0) goto L7a
            r0 = r17
            if (r0 != 0) goto L7a
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "invalid cast"
            r1.<init>(r2)
            throw r0
        L7a:
            r0 = r11
            r1 = r14
            java.lang.String r0 = toJvmArrayName(r0, r1)
            return r0
        L81:
            r0 = r14
            if (r0 <= 0) goto L8e
            r0 = r15
            r1 = r14
            java.lang.String r0 = toJvmTypeName(r0, r1)
            return r0
        L8e:
            r0 = 0
            return r0
    }

    void atNumCastExpr(int r5, int r6) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r5
            r1 = r6
            if (r0 != r1) goto L6
            return
        L6:
            r0 = r5
            int r0 = typePrecedence(r0)
            r9 = r0
            r0 = r6
            int r0 = typePrecedence(r0)
            r10 = r0
            r0 = 0
            r1 = r9
            if (r0 > r1) goto L2d
            r0 = r9
            r1 = 3
            if (r0 >= r1) goto L2d
            int[] r0 = javassist.compiler.CodeGen.castOp
            r1 = r9
            r2 = 4
            int r1 = r1 * r2
            r2 = r10
            int r1 = r1 + r2
            r0 = r0[r1]
            r7 = r0
            goto L2f
        L2d:
            r0 = 0
            r7 = r0
        L2f:
            r0 = r6
            r1 = 312(0x138, float:4.37E-43)
            if (r0 != r1) goto L3e
            r0 = 135(0x87, float:1.89E-43)
            r8 = r0
            goto L8c
        L3e:
            r0 = r6
            r1 = 317(0x13d, float:4.44E-43)
            if (r0 != r1) goto L4d
            r0 = 134(0x86, float:1.88E-43)
            r8 = r0
            goto L8c
        L4d:
            r0 = r6
            r1 = 326(0x146, float:4.57E-43)
            if (r0 != r1) goto L5c
            r0 = 133(0x85, float:1.86E-43)
            r8 = r0
            goto L8c
        L5c:
            r0 = r6
            r1 = 334(0x14e, float:4.68E-43)
            if (r0 != r1) goto L6b
            r0 = 147(0x93, float:2.06E-43)
            r8 = r0
            goto L8c
        L6b:
            r0 = r6
            r1 = 306(0x132, float:4.29E-43)
            if (r0 != r1) goto L7a
            r0 = 146(0x92, float:2.05E-43)
            r8 = r0
            goto L8c
        L7a:
            r0 = r6
            r1 = 303(0x12f, float:4.25E-43)
            if (r0 != r1) goto L89
            r0 = 145(0x91, float:2.03E-43)
            r8 = r0
            goto L8c
        L89:
            r0 = 0
            r8 = r0
        L8c:
            r0 = r7
            if (r0 == 0) goto L98
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r7
            r0.addOpcode(r1)
        L98:
            r0 = r7
            if (r0 == 0) goto Lb1
            r0 = r7
            r1 = 136(0x88, float:1.9E-43)
            if (r0 == r1) goto Lb1
            r0 = r7
            r1 = 139(0x8b, float:1.95E-43)
            if (r0 == r1) goto Lb1
            r0 = r7
            r1 = 142(0x8e, float:1.99E-43)
            if (r0 != r1) goto Lbf
        Lb1:
            r0 = r8
            if (r0 == 0) goto Lbf
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r8
            r0.addOpcode(r1)
        Lbf:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atExpr(javassist.compiler.ast.Expr r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            int r0 = r0.getOperator()
            r8 = r0
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r9 = r0
            r0 = r8
            r1 = 46
            if (r0 != r1) goto L37
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0
            java.lang.String r0 = r0.get()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "class"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2f
            r0 = r6
            r1 = r7
            r0.atClassObject(r1)
            goto L34
        L2f:
            r0 = r6
            r1 = r7
            r0.atFieldRead(r1)
        L34:
            goto L192
        L37:
            r0 = r8
            r1 = 35
            if (r0 != r1) goto L45
            r0 = r6
            r1 = r7
            r0.atFieldRead(r1)
            goto L192
        L45:
            r0 = r8
            r1 = 65
            if (r0 != r1) goto L57
            r0 = r6
            r1 = r9
            r2 = r7
            javassist.compiler.ast.ASTree r2 = r2.oprand2()
            r0.atArrayRead(r1, r2)
            goto L192
        L57:
            r0 = r8
            r1 = 362(0x16a, float:5.07E-43)
            if (r0 == r1) goto L65
            r0 = r8
            r1 = 363(0x16b, float:5.09E-43)
            if (r0 != r1) goto L70
        L65:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r7
            r4 = 1
            r0.atPlusPlus(r1, r2, r3, r4)
            goto L192
        L70:
            r0 = r8
            r1 = 33
            if (r0 != r1) goto Lad
            r0 = r6
            r1 = 0
            r2 = r7
            boolean r0 = r0.booleanExpr(r1, r2)
            if (r0 != 0) goto La2
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 7
            r0.addIndex(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1
            r0.addIconst(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 4
            r0.addIndex(r1)
        La2:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIconst(r1)
            goto L192
        Lad:
            r0 = r8
            r1 = 67
            if (r0 != r1) goto Lb9
            fatal()
            goto L192
        Lb9:
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r1 = r6
            r0.accept(r1)
            r0 = r6
            int r0 = r0.exprType
            int r0 = typePrecedence(r0)
            r10 = r0
            r0 = r6
            int r0 = r0.arrayDim
            if (r0 <= 0) goto Ld5
            r0 = r7
            badType(r0)
        Ld5:
            r0 = r8
            r1 = 45
            if (r0 != r1) goto L130
            r0 = r10
            if (r0 != 0) goto Lec
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 119(0x77, float:1.67E-43)
            r0.addOpcode(r1)
            goto L192
        Lec:
            r0 = r10
            r1 = 1
            if (r0 != r1) goto Lfe
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 118(0x76, float:1.65E-43)
            r0.addOpcode(r1)
            goto L192
        Lfe:
            r0 = r10
            r1 = 2
            if (r0 != r1) goto L110
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 117(0x75, float:1.64E-43)
            r0.addOpcode(r1)
            goto L192
        L110:
            r0 = r10
            r1 = 3
            if (r0 != r1) goto L129
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 116(0x74, float:1.63E-43)
            r0.addOpcode(r1)
            r0 = r6
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
            goto L192
        L129:
            r0 = r7
            badType(r0)
            goto L192
        L130:
            r0 = r8
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 != r1) goto L17c
            r0 = r10
            r1 = 3
            if (r0 != r1) goto L158
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = -1
            r0.addIconst(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 130(0x82, float:1.82E-43)
            r0.addOpcode(r1)
            r0 = r6
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
            goto L192
        L158:
            r0 = r10
            r1 = 2
            if (r0 != r1) goto L175
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = -1
            r0.addLconst(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 131(0x83, float:1.84E-43)
            r0.addOpcode(r1)
            goto L192
        L175:
            r0 = r7
            badType(r0)
            goto L192
        L17c:
            r0 = r8
            r1 = 43
            if (r0 != r1) goto L18f
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L192
            r0 = r7
            badType(r0)
            goto L192
        L18f:
            fatal()
        L192:
            return
    }

    protected static void badType(javassist.compiler.ast.Expr r5) throws javassist.compiler.CompileError {
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "invalid type for "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.compiler.ast.Visitor
    public abstract void atCallExpr(javassist.compiler.ast.CallExpr r1) throws javassist.compiler.CompileError;

    protected abstract void atFieldRead(javassist.compiler.ast.ASTree r1) throws javassist.compiler.CompileError;

    public void atClassObject(javassist.compiler.ast.Expr r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof javassist.compiler.ast.Symbol
            if (r0 != 0) goto L17
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "fatal error: badly parsed .class expr"
            r1.<init>(r2)
            throw r0
        L17:
            r0 = r7
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0
            java.lang.String r0 = r0.get()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "["
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L97
            r0 = r8
            java.lang.String r1 = "[L"
            int r0 = r0.indexOf(r1)
            r9 = r0
            r0 = r9
            if (r0 < 0) goto L94
            r0 = r8
            r1 = r9
            r2 = 2
            int r1 = r1 + r2
            r2 = r8
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r10 = r0
            r0 = r5
            r1 = r10
            java.lang.String r0 = r0.resolveClassName(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L94
            r0 = r11
            java.lang.String r0 = javassist.compiler.MemberResolver.jvmToJavaName(r0)
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r12 = r0
        L69:
            r0 = r9
            int r9 = r9 + (-1)
            if (r0 < 0) goto L7c
            r0 = r12
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L69
        L7c:
            r0 = r12
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            java.lang.String r0 = r0.toString()
            r8 = r0
        L94:
            goto La5
        L97:
            r0 = r5
            r1 = r8
            java.lang.String r1 = javassist.compiler.MemberResolver.javaToJvmName(r1)
            java.lang.String r0 = r0.resolveClassName(r1)
            r8 = r0
            r0 = r8
            java.lang.String r0 = javassist.compiler.MemberResolver.jvmToJavaName(r0)
            r8 = r0
        La5:
            r0 = r5
            r1 = r8
            r0.atClassObject2(r1)
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

    protected void atClassObject2(java.lang.String r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r8 = r0
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r7
            r0.addLdc(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "java.lang.Class"
            java.lang.String r2 = "forName"
            java.lang.String r3 = "(Ljava/lang/String;)Ljava/lang/Class;"
            r0.addInvokestatic(r1, r2, r3)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r9 = r0
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r10 = r0
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIndex(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r8
            r2 = r9
            r3 = r6
            javassist.bytecode.Bytecode r3 = r3.bytecode
            int r3 = r3.currentPc()
            java.lang.String r4 = "java.lang.ClassNotFoundException"
            r0.addExceptionHandler(r1, r2, r3, r4)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1
            r0.growStack(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            java.lang.String r1 = "javassist.runtime.DotClass"
            java.lang.String r2 = "fail"
            java.lang.String r3 = "(Ljava/lang/ClassNotFoundException;)Ljava/lang/NoClassDefFoundError;"
            r0.addInvokestatic(r1, r2, r3)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 191(0xbf, float:2.68E-43)
            r0.addOpcode(r1)
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r10
            r2 = r6
            javassist.bytecode.Bytecode r2 = r2.bytecode
            int r2 = r2.currentPc()
            r3 = r10
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            return
    }

    public void atArrayRead(javassist.compiler.ast.ASTree r5, javassist.compiler.ast.ASTree r6) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.arrayAccess(r1, r2)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r4
            int r1 = r1.exprType
            r2 = r4
            int r2 = r2.arrayDim
            int r1 = getArrayReadOp(r1, r2)
            r0.addOpcode(r1)
            return
    }

    protected void arrayAccess(javassist.compiler.ast.ASTree r5, javassist.compiler.ast.ASTree r6) throws javassist.compiler.CompileError {
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
            r0 = r8
            if (r0 != 0) goto L20
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad array access"
            r1.<init>(r2)
            throw r0
        L20:
            r0 = r4
            java.lang.String r0 = r0.className
            r9 = r0
            r0 = r6
            r1 = r4
            r0.accept(r1)
            r0 = r4
            int r0 = r0.exprType
            int r0 = typePrecedence(r0)
            r1 = 3
            if (r0 != r1) goto L3d
            r0 = r4
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L48
        L3d:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad array index"
            r1.<init>(r2)
            throw r0
        L48:
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

    protected static int getArrayReadOp(int r2, int r3) {
            r0 = r3
            if (r0 <= 0) goto L7
            r0 = 50
            return r0
        L7:
            r0 = r2
            switch(r0) {
                case 301: goto L66;
                case 303: goto L66;
                case 306: goto L63;
                case 312: goto L54;
                case 317: goto L57;
                case 324: goto L5d;
                case 326: goto L5a;
                case 334: goto L60;
                default: goto L69;
            }
        L54:
            r0 = 49
            return r0
        L57:
            r0 = 48
            return r0
        L5a:
            r0 = 47
            return r0
        L5d:
            r0 = 46
            return r0
        L60:
            r0 = 53
            return r0
        L63:
            r0 = 52
            return r0
        L66:
            r0 = 51
            return r0
        L69:
            r0 = 50
            return r0
    }

    protected static int getArrayWriteOp(int r2, int r3) {
            r0 = r3
            if (r0 <= 0) goto L7
            r0 = 83
            return r0
        L7:
            r0 = r2
            switch(r0) {
                case 301: goto L66;
                case 303: goto L66;
                case 306: goto L63;
                case 312: goto L54;
                case 317: goto L57;
                case 324: goto L5d;
                case 326: goto L5a;
                case 334: goto L60;
                default: goto L69;
            }
        L54:
            r0 = 82
            return r0
        L57:
            r0 = 81
            return r0
        L5a:
            r0 = 80
            return r0
        L5d:
            r0 = 79
            return r0
        L60:
            r0 = 86
            return r0
        L63:
            r0 = 85
            return r0
        L66:
            r0 = 84
            return r0
        L69:
            r0 = 83
            return r0
    }

    private void atPlusPlus(int r8, javassist.compiler.ast.ASTree r9, javassist.compiler.ast.Expr r10, boolean r11) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r9
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L15
            r0 = r10
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            r9 = r0
        L15:
            r0 = r9
            boolean r0 = r0 instanceof javassist.compiler.ast.Variable
            if (r0 == 0) goto L218
            r0 = r9
            javassist.compiler.ast.Variable r0 = (javassist.compiler.ast.Variable) r0
            javassist.compiler.ast.Declarator r0 = r0.getDeclarator()
            r13 = r0
            r0 = r7
            r1 = r13
            int r1 = r1.getType()
            r2 = r1; r1 = r0; r0 = r2; 
            r1.exprType = r2
            r14 = r0
            r0 = r7
            r1 = r13
            int r1 = r1.getArrayDim()
            r0.arrayDim = r1
            r0 = r7
            r1 = r13
            int r0 = r0.getLocalVar(r1)
            r15 = r0
            r0 = r7
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L4d
            r0 = r10
            badType(r0)
        L4d:
            r0 = r14
            r1 = 312(0x138, float:4.37E-43)
            if (r0 != r1) goto Lad
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r15
            r0.addDload(r1)
            r0 = r11
            if (r0 == 0) goto L71
            r0 = r12
            if (r0 == 0) goto L71
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 92
            r0.addOpcode(r1)
        L71:
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.addDconst(r1)
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r8
            r2 = 362(0x16a, float:5.07E-43)
            if (r1 != r2) goto L89
            r1 = 99
            goto L8b
        L89:
            r1 = 103(0x67, float:1.44E-43)
        L8b:
            r0.addOpcode(r1)
            r0 = r11
            if (r0 == 0) goto La1
            r0 = r12
            if (r0 != 0) goto La1
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 92
            r0.addOpcode(r1)
        La1:
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r15
            r0.addDstore(r1)
            goto L215
        Lad:
            r0 = r14
            r1 = 326(0x146, float:4.57E-43)
            if (r0 != r1) goto L10d
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r15
            r0.addLload(r1)
            r0 = r11
            if (r0 == 0) goto Ld1
            r0 = r12
            if (r0 == 0) goto Ld1
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 92
            r0.addOpcode(r1)
        Ld1:
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1
            r0.addLconst(r1)
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r8
            r2 = 362(0x16a, float:5.07E-43)
            if (r1 != r2) goto Le9
            r1 = 97
            goto Leb
        Le9:
            r1 = 101(0x65, float:1.42E-43)
        Leb:
            r0.addOpcode(r1)
            r0 = r11
            if (r0 == 0) goto L101
            r0 = r12
            if (r0 != 0) goto L101
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 92
            r0.addOpcode(r1)
        L101:
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r15
            r0.addLstore(r1)
            goto L215
        L10d:
            r0 = r14
            r1 = 317(0x13d, float:4.44E-43)
            if (r0 != r1) goto L16d
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r15
            r0.addFload(r1)
            r0 = r11
            if (r0 == 0) goto L131
            r0 = r12
            if (r0 == 0) goto L131
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 89
            r0.addOpcode(r1)
        L131:
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.addFconst(r1)
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r8
            r2 = 362(0x16a, float:5.07E-43)
            if (r1 != r2) goto L149
            r1 = 98
            goto L14b
        L149:
            r1 = 102(0x66, float:1.43E-43)
        L14b:
            r0.addOpcode(r1)
            r0 = r11
            if (r0 == 0) goto L161
            r0 = r12
            if (r0 != 0) goto L161
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 89
            r0.addOpcode(r1)
        L161:
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r15
            r0.addFstore(r1)
            goto L215
        L16d:
            r0 = r14
            r1 = 303(0x12f, float:4.25E-43)
            if (r0 == r1) goto L18d
            r0 = r14
            r1 = 306(0x132, float:4.29E-43)
            if (r0 == r1) goto L18d
            r0 = r14
            r1 = 334(0x14e, float:4.68E-43)
            if (r0 == r1) goto L18d
            r0 = r14
            r1 = 324(0x144, float:4.54E-43)
            if (r0 != r1) goto L211
        L18d:
            r0 = r11
            if (r0 == 0) goto L1a0
            r0 = r12
            if (r0 == 0) goto L1a0
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r15
            r0.addIload(r1)
        L1a0:
            r0 = r8
            r1 = 362(0x16a, float:5.07E-43)
            if (r0 != r1) goto L1ab
            r0 = 1
            goto L1ac
        L1ab:
            r0 = -1
        L1ac:
            r16 = r0
            r0 = r15
            r1 = 255(0xff, float:3.57E-43)
            if (r0 <= r1) goto L1df
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 132(0x84, float:1.85E-43)
            r0.addOpcode(r1)
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r15
            r0.addIndex(r1)
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r16
            r0.addIndex(r1)
            goto L1fb
        L1df:
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 132(0x84, float:1.85E-43)
            r0.addOpcode(r1)
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r15
            r0.add(r1)
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r16
            r0.add(r1)
        L1fb:
            r0 = r11
            if (r0 == 0) goto L20e
            r0 = r12
            if (r0 != 0) goto L20e
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r15
            r0.addIload(r1)
        L20e:
            goto L215
        L211:
            r0 = r10
            badType(r0)
        L215:
            goto L246
        L218:
            r0 = r9
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L23b
            r0 = r9
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r13 = r0
            r0 = r13
            int r0 = r0.getOperator()
            r1 = 65
            if (r0 != r1) goto L23b
            r0 = r7
            r1 = r8
            r2 = r12
            r3 = r13
            r4 = r11
            r0.atArrayPlusPlus(r1, r2, r3, r4)
            return
        L23b:
            r0 = r7
            r1 = r8
            r2 = r12
            r3 = r9
            r4 = r10
            r5 = r11
            r0.atFieldPlusPlus(r1, r2, r3, r4, r5)
        L246:
            return
    }

    public void atArrayPlusPlus(int r8, boolean r9, javassist.compiler.ast.Expr r10, boolean r11) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r7
            r1 = r10
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            r2 = r10
            javassist.compiler.ast.ASTree r2 = r2.oprand2()
            r0.arrayAccess(r1, r2)
            r0 = r7
            int r0 = r0.exprType
            r12 = r0
            r0 = r7
            int r0 = r0.arrayDim
            r13 = r0
            r0 = r13
            if (r0 <= 0) goto L21
            r0 = r10
            badType(r0)
        L21:
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 92
            r0.addOpcode(r1)
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r12
            r2 = r7
            int r2 = r2.arrayDim
            int r1 = getArrayReadOp(r1, r2)
            r0.addOpcode(r1)
            r0 = r12
            r1 = r13
            boolean r0 = is2word(r0, r1)
            if (r0 == 0) goto L49
            r0 = 94
            goto L4b
        L49:
            r0 = 91
        L4b:
            r14 = r0
            r0 = r7
            r1 = r14
            r2 = r11
            r3 = r8
            r4 = r9
            r5 = r10
            r0.atPlusPlusCore(r1, r2, r3, r4, r5)
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r12
            r2 = r13
            int r1 = getArrayWriteOp(r1, r2)
            r0.addOpcode(r1)
            return
    }

    protected void atPlusPlusCore(int r5, boolean r6, int r7, boolean r8, javassist.compiler.ast.Expr r9) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            int r0 = r0.exprType
            r10 = r0
            r0 = r6
            if (r0 == 0) goto L17
            r0 = r8
            if (r0 == 0) goto L17
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r5
            r0.addOpcode(r1)
        L17:
            r0 = r10
            r1 = 324(0x144, float:4.54E-43)
            if (r0 == r1) goto L37
            r0 = r10
            r1 = 303(0x12f, float:4.25E-43)
            if (r0 == r1) goto L37
            r0 = r10
            r1 = 306(0x132, float:4.29E-43)
            if (r0 == r1) goto L37
            r0 = r10
            r1 = 334(0x14e, float:4.68E-43)
            if (r0 != r1) goto L5e
        L37:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1
            r0.addIconst(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r7
            r2 = 362(0x16a, float:5.07E-43)
            if (r1 != r2) goto L4f
            r1 = 96
            goto L51
        L4f:
            r1 = 100
        L51:
            r0.addOpcode(r1)
            r0 = r4
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
            goto Ldb
        L5e:
            r0 = r10
            r1 = 326(0x146, float:4.57E-43)
            if (r0 != r1) goto L86
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1
            r0.addLconst(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r7
            r2 = 362(0x16a, float:5.07E-43)
            if (r1 != r2) goto L7e
            r1 = 97
            goto L80
        L7e:
            r1 = 101(0x65, float:1.42E-43)
        L80:
            r0.addOpcode(r1)
            goto Ldb
        L86:
            r0 = r10
            r1 = 317(0x13d, float:4.44E-43)
            if (r0 != r1) goto Lae
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.addFconst(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r7
            r2 = 362(0x16a, float:5.07E-43)
            if (r1 != r2) goto La6
            r1 = 98
            goto La8
        La6:
            r1 = 102(0x66, float:1.43E-43)
        La8:
            r0.addOpcode(r1)
            goto Ldb
        Lae:
            r0 = r10
            r1 = 312(0x138, float:4.37E-43)
            if (r0 != r1) goto Ld6
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.addDconst(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r7
            r2 = 362(0x16a, float:5.07E-43)
            if (r1 != r2) goto Lce
            r1 = 99
            goto Ld0
        Lce:
            r1 = 103(0x67, float:1.44E-43)
        Ld0:
            r0.addOpcode(r1)
            goto Ldb
        Ld6:
            r0 = r9
            badType(r0)
        Ldb:
            r0 = r6
            if (r0 == 0) goto Lec
            r0 = r8
            if (r0 != 0) goto Lec
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r5
            r0.addOpcode(r1)
        Lec:
            return
    }

    protected abstract void atFieldPlusPlus(int r1, boolean r2, javassist.compiler.ast.ASTree r3, javassist.compiler.ast.Expr r4, boolean r5) throws javassist.compiler.CompileError;

    @Override // javassist.compiler.ast.Visitor
    public abstract void atMember(javassist.compiler.ast.Member r1) throws javassist.compiler.CompileError;

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
            r0 = r3
            r1 = r5
            int r0 = r0.getLocalVar(r1)
            r6 = r0
            r0 = r3
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L35
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            r0.addAload(r1)
            goto L98
        L35:
            r0 = r3
            int r0 = r0.exprType
            switch(r0) {
                case 307: goto L64;
                case 312: goto L85;
                case 317: goto L7a;
                case 326: goto L6f;
                default: goto L90;
            }
        L64:
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            r0.addAload(r1)
            goto L98
        L6f:
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            r0.addLload(r1)
            goto L98
        L7a:
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            r0.addFload(r1)
            goto L98
        L85:
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            r0.addDload(r1)
            goto L98
        L90:
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            r0.addIload(r1)
        L98:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atKeyword(javassist.compiler.ast.Keyword r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            r1 = 0
            r0.arrayDim = r1
            r0 = r7
            int r0 = r0.get()
            r8 = r0
            r0 = r8
            switch(r0) {
                case 336: goto L72;
                case 339: goto L72;
                case 410: goto L3c;
                case 411: goto L4e;
                case 412: goto L60;
                default: goto Ld0;
            }
        L3c:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1
            r0.addIconst(r1)
            r0 = r6
            r1 = 301(0x12d, float:4.22E-43)
            r0.exprType = r1
            goto Ld3
        L4e:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addIconst(r1)
            r0 = r6
            r1 = 301(0x12d, float:4.22E-43)
            r0.exprType = r1
            goto Ld3
        L60:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1
            r0.addOpcode(r1)
            r0 = r6
            r1 = 412(0x19c, float:5.77E-43)
            r0.exprType = r1
            goto Ld3
        L72:
            r0 = r6
            boolean r0 = r0.inStaticMethod
            if (r0 == 0) goto La4
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "not-available: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            r4 = 339(0x153, float:4.75E-43)
            if (r3 != r4) goto L97
            java.lang.String r3 = "this"
            goto L9a
        L97:
            java.lang.String r3 = "super"
        L9a:
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        La4:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addAload(r1)
            r0 = r6
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r8
            r1 = 339(0x153, float:4.75E-43)
            if (r0 != r1) goto Lc5
            r0 = r6
            r1 = r6
            java.lang.String r1 = r1.getThisName()
            r0.className = r1
            goto Ld3
        Lc5:
            r0 = r6
            r1 = r6
            java.lang.String r1 = r1.getSuperName()
            r0.className = r1
            goto Ld3
        Ld0:
            fatal()
        Ld3:
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
            r0 = r3
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r4
            java.lang.String r1 = r1.get()
            r0.addLdc(r1)
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atIntConst(javassist.compiler.ast.IntConst r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = 0
            r0.arrayDim = r1
            r0 = r5
            long r0 = r0.get()
            r6 = r0
            r0 = r5
            int r0 = r0.getType()
            r8 = r0
            r0 = r8
            r1 = 402(0x192, float:5.63E-43)
            if (r0 == r1) goto L20
            r0 = r8
            r1 = 401(0x191, float:5.62E-43)
            if (r0 != r1) goto L41
        L20:
            r0 = r4
            r1 = r8
            r2 = 402(0x192, float:5.63E-43)
            if (r1 != r2) goto L2f
            r1 = 324(0x144, float:4.54E-43)
            goto L32
        L2f:
            r1 = 306(0x132, float:4.29E-43)
        L32:
            r0.exprType = r1
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            int r1 = (int) r1
            r0.addIconst(r1)
            goto L50
        L41:
            r0 = r4
            r1 = 326(0x146, float:4.57E-43)
            r0.exprType = r1
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            r0.addLconst(r1)
        L50:
            return
    }

    @Override // javassist.compiler.ast.Visitor
    public void atDoubleConst(javassist.compiler.ast.DoubleConst r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = 0
            r0.arrayDim = r1
            r0 = r5
            int r0 = r0.getType()
            r1 = 405(0x195, float:5.68E-43)
            if (r0 != r1) goto L24
            r0 = r4
            r1 = 312(0x138, float:4.37E-43)
            r0.exprType = r1
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r5
            double r1 = r1.get()
            r0.addDconst(r1)
            goto L37
        L24:
            r0 = r4
            r1 = 317(0x13d, float:4.44E-43)
            r0.exprType = r1
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r5
            double r1 = r1.get()
            float r1 = (float) r1
            r0.addFconst(r1)
        L37:
            return
    }

    static {
            r0 = 55
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 43
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 99
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 98
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 96
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 45
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 103(0x67, float:1.44E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 102(0x66, float:1.43E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 100
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 42
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 107(0x6b, float:1.5E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 106(0x6a, float:1.49E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 105(0x69, float:1.47E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 104(0x68, float:1.46E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 47
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 110(0x6e, float:1.54E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 109(0x6d, float:1.53E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 37
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 115(0x73, float:1.61E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 114(0x72, float:1.6E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 113(0x71, float:1.58E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 112(0x70, float:1.57E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 124(0x7c, float:1.74E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 129(0x81, float:1.81E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 128(0x80, float:1.8E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 94
            r1[r2] = r3
            r1 = r0
            r2 = 31
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 32
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 33
            r3 = 131(0x83, float:1.84E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 34
            r3 = 130(0x82, float:1.82E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 35
            r3 = 38
            r1[r2] = r3
            r1 = r0
            r2 = 36
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 37
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 38
            r3 = 127(0x7f, float:1.78E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 39
            r3 = 126(0x7e, float:1.77E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 40
            r3 = 364(0x16c, float:5.1E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 41
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 42
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 43
            r3 = 121(0x79, float:1.7E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 44
            r3 = 120(0x78, float:1.68E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 45
            r3 = 366(0x16e, float:5.13E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 46
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 47
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 48
            r3 = 123(0x7b, float:1.72E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 49
            r3 = 122(0x7a, float:1.71E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 50
            r3 = 370(0x172, float:5.18E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 51
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 52
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 53
            r3 = 125(0x7d, float:1.75E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 54
            r3 = 124(0x7c, float:1.74E-43)
            r1[r2] = r3
            javassist.compiler.CodeGen.binOp = r0
            r0 = 18
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 358(0x166, float:5.02E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 159(0x9f, float:2.23E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 160(0xa0, float:2.24E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 350(0x15e, float:4.9E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 160(0xa0, float:2.24E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 159(0x9f, float:2.23E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 357(0x165, float:5.0E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 164(0xa4, float:2.3E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 163(0xa3, float:2.28E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 359(0x167, float:5.03E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 162(0xa2, float:2.27E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 161(0xa1, float:2.26E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 60
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 161(0xa1, float:2.26E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 162(0xa2, float:2.27E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 62
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 163(0xa3, float:2.28E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 164(0xa4, float:2.3E-43)
            r1[r2] = r3
            javassist.compiler.CodeGen.ifOp = r0
            r0 = 18
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 358(0x166, float:5.02E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 153(0x99, float:2.14E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 154(0x9a, float:2.16E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 350(0x15e, float:4.9E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 154(0x9a, float:2.16E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 153(0x99, float:2.14E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 357(0x165, float:5.0E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 158(0x9e, float:2.21E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 157(0x9d, float:2.2E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 359(0x167, float:5.03E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 156(0x9c, float:2.19E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 155(0x9b, float:2.17E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 60
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 155(0x9b, float:2.17E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 156(0x9c, float:2.19E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 62
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 157(0x9d, float:2.2E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 158(0x9e, float:2.21E-43)
            r1[r2] = r3
            javassist.compiler.CodeGen.ifOp2 = r0
            r0 = 16
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 144(0x90, float:2.02E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 143(0x8f, float:2.0E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 142(0x8e, float:1.99E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 141(0x8d, float:1.98E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 140(0x8c, float:1.96E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 139(0x8b, float:1.95E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 138(0x8a, float:1.93E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 137(0x89, float:1.92E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 136(0x88, float:1.9E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 135(0x87, float:1.89E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 134(0x86, float:1.88E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 133(0x85, float:1.86E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 0
            r1[r2] = r3
            javassist.compiler.CodeGen.castOp = r0
            return
    }
}
