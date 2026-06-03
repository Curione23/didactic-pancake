package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/MemberCodeGen.class */
public class MemberCodeGen extends javassist.compiler.CodeGen {
    protected javassist.compiler.MemberResolver resolver;
    protected javassist.CtClass thisClass;
    protected javassist.bytecode.MethodInfo thisMethod;
    protected boolean resultStatic;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/MemberCodeGen$JsrHook.class */
    static class JsrHook extends javassist.compiler.CodeGen.ReturnHook {
        java.util.List<int[]> jsrList;
        javassist.compiler.CodeGen cgen;
        int var;

        JsrHook(javassist.compiler.CodeGen r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.jsrList = r1
                r0 = r4
                r1 = r5
                r0.cgen = r1
                r0 = r4
                r1 = -1
                r0.var = r1
                return
        }

        private int getVar(int r4) {
                r3 = this;
                r0 = r3
                int r0 = r0.var
                if (r0 >= 0) goto L1a
                r0 = r3
                r1 = r3
                javassist.compiler.CodeGen r1 = r1.cgen
                int r1 = r1.getMaxLocals()
                r0.var = r1
                r0 = r3
                javassist.compiler.CodeGen r0 = r0.cgen
                r1 = r4
                r0.incMaxLocals(r1)
            L1a:
                r0 = r3
                int r0 = r0.var
                return r0
        }

        private void jsrJmp(javassist.bytecode.Bytecode r7) {
                r6 = this;
                r0 = r7
                r1 = 167(0xa7, float:2.34E-43)
                r0.addOpcode(r1)
                r0 = r6
                java.util.List<int[]> r0 = r0.jsrList
                r1 = 2
                int[] r1 = new int[r1]
                r2 = r1
                r3 = 0
                r4 = r7
                int r4 = r4.currentPc()
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r6
                int r4 = r4.var
                r2[r3] = r4
                boolean r0 = r0.add(r1)
                r0 = r7
                r1 = 0
                r0.addIndex(r1)
                return
        }

        @Override // javassist.compiler.CodeGen.ReturnHook
        protected boolean doit(javassist.bytecode.Bytecode r5, int r6) {
                r4 = this;
                r0 = r6
                switch(r0) {
                    case 172: goto L49;
                    case 173: goto L62;
                    case 174: goto L94;
                    case 175: goto L7b;
                    case 176: goto L30;
                    case 177: goto L28;
                    default: goto Lad;
                }
            L28:
                r0 = r4
                r1 = r5
                r0.jsrJmp(r1)
                goto Lb7
            L30:
                r0 = r5
                r1 = r4
                r2 = 1
                int r1 = r1.getVar(r2)
                r0.addAstore(r1)
                r0 = r4
                r1 = r5
                r0.jsrJmp(r1)
                r0 = r5
                r1 = r4
                int r1 = r1.var
                r0.addAload(r1)
                goto Lb7
            L49:
                r0 = r5
                r1 = r4
                r2 = 1
                int r1 = r1.getVar(r2)
                r0.addIstore(r1)
                r0 = r4
                r1 = r5
                r0.jsrJmp(r1)
                r0 = r5
                r1 = r4
                int r1 = r1.var
                r0.addIload(r1)
                goto Lb7
            L62:
                r0 = r5
                r1 = r4
                r2 = 2
                int r1 = r1.getVar(r2)
                r0.addLstore(r1)
                r0 = r4
                r1 = r5
                r0.jsrJmp(r1)
                r0 = r5
                r1 = r4
                int r1 = r1.var
                r0.addLload(r1)
                goto Lb7
            L7b:
                r0 = r5
                r1 = r4
                r2 = 2
                int r1 = r1.getVar(r2)
                r0.addDstore(r1)
                r0 = r4
                r1 = r5
                r0.jsrJmp(r1)
                r0 = r5
                r1 = r4
                int r1 = r1.var
                r0.addDload(r1)
                goto Lb7
            L94:
                r0 = r5
                r1 = r4
                r2 = 1
                int r1 = r1.getVar(r2)
                r0.addFstore(r1)
                r0 = r4
                r1 = r5
                r0.jsrJmp(r1)
                r0 = r5
                r1 = r4
                int r1 = r1.var
                r0.addFload(r1)
                goto Lb7
            Lad:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "fatal"
                r1.<init>(r2)
                throw r0
            Lb7:
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/MemberCodeGen$JsrHook2.class */
    static class JsrHook2 extends javassist.compiler.CodeGen.ReturnHook {
        int var;
        int target;

        JsrHook2(javassist.compiler.CodeGen r5, int[] r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r6
                r2 = 0
                r1 = r1[r2]
                r0.target = r1
                r0 = r4
                r1 = r6
                r2 = 1
                r1 = r1[r2]
                r0.var = r1
                return
        }

        @Override // javassist.compiler.CodeGen.ReturnHook
        protected boolean doit(javassist.bytecode.Bytecode r5, int r6) {
                r4 = this;
                r0 = r6
                switch(r0) {
                    case 172: goto L36;
                    case 173: goto L41;
                    case 174: goto L57;
                    case 175: goto L4c;
                    case 176: goto L2b;
                    case 177: goto L28;
                    default: goto L62;
                }
            L28:
                goto L6c
            L2b:
                r0 = r5
                r1 = r4
                int r1 = r1.var
                r0.addAstore(r1)
                goto L6c
            L36:
                r0 = r5
                r1 = r4
                int r1 = r1.var
                r0.addIstore(r1)
                goto L6c
            L41:
                r0 = r5
                r1 = r4
                int r1 = r1.var
                r0.addLstore(r1)
                goto L6c
            L4c:
                r0 = r5
                r1 = r4
                int r1 = r1.var
                r0.addDstore(r1)
                goto L6c
            L57:
                r0 = r5
                r1 = r4
                int r1 = r1.var
                r0.addFstore(r1)
                goto L6c
            L62:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "fatal"
                r1.<init>(r2)
                throw r0
            L6c:
                r0 = r5
                r1 = 167(0xa7, float:2.34E-43)
                r0.addOpcode(r1)
                r0 = r5
                r1 = r4
                int r1 = r1.target
                r2 = r5
                int r2 = r2.currentPc()
                int r1 = r1 - r2
                r2 = 3
                int r1 = r1 + r2
                r0.addIndex(r1)
                r0 = 1
                return r0
        }
    }

    public MemberCodeGen(javassist.bytecode.Bytecode r6, javassist.CtClass r7, javassist.ClassPool r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r0.<init>(r1)
            r0 = r5
            javassist.compiler.MemberResolver r1 = new javassist.compiler.MemberResolver
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.resolver = r1
            r0 = r5
            r1 = r7
            r0.thisClass = r1
            r0 = r5
            r1 = 0
            r0.thisMethod = r1
            return
    }

    public int getMajorVersion() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.thisClass
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r3 = r0
            r0 = r3
            if (r0 != 0) goto L10
            int r0 = javassist.bytecode.ClassFile.MAJOR_VERSION
            return r0
        L10:
            r0 = r3
            int r0 = r0.getMajorVersion()
            return r0
    }

    public void setThisMethod(javassist.CtMethod r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.MethodInfo r1 = r1.getMethodInfo2()
            r0.thisMethod = r1
            r0 = r3
            javassist.compiler.TypeChecker r0 = r0.typeChecker
            if (r0 == 0) goto L1a
            r0 = r3
            javassist.compiler.TypeChecker r0 = r0.typeChecker
            r1 = r3
            javassist.bytecode.MethodInfo r1 = r1.thisMethod
            r0.setThisMethod(r1)
        L1a:
            return
    }

    public javassist.CtClass getThisClass() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.thisClass
            return r0
    }

    @Override // javassist.compiler.CodeGen
    protected java.lang.String getThisName() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.thisClass
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = javassist.compiler.MemberResolver.javaToJvmName(r0)
            return r0
    }

    @Override // javassist.compiler.CodeGen
    protected java.lang.String getSuperName() throws javassist.compiler.CompileError {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.thisClass
            javassist.CtClass r0 = javassist.compiler.MemberResolver.getSuperclass(r0)
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = javassist.compiler.MemberResolver.javaToJvmName(r0)
            return r0
    }

    @Override // javassist.compiler.CodeGen
    protected void insertDefaultSuperCall() throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addAload(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r5
            javassist.CtClass r1 = r1.thisClass
            javassist.CtClass r1 = javassist.compiler.MemberResolver.getSuperclass(r1)
            java.lang.String r2 = "<init>"
            java.lang.String r3 = "()V"
            r0.addInvokespecial(r1, r2, r3)
            return
    }

    @Override // javassist.compiler.CodeGen
    protected void atTryStmnt(javassist.compiler.ast.Stmnt r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r8 = r0
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L12
            return
        L12:
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            javassist.compiler.ast.ASTList r0 = (javassist.compiler.ast.ASTList) r0
            r10 = r0
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r11 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r11
            if (r0 == 0) goto L48
            javassist.compiler.MemberCodeGen$JsrHook r0 = new javassist.compiler.MemberCodeGen$JsrHook
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r13 = r0
        L48:
            r0 = r8
            int r0 = r0.currentPc()
            r14 = r0
            r0 = r9
            r1 = r6
            r0.accept(r1)
            r0 = r8
            int r0 = r0.currentPc()
            r15 = r0
            r0 = r14
            r1 = r15
            if (r0 != r1) goto L6a
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "empty try block"
            r1.<init>(r2)
            throw r0
        L6a:
            r0 = r6
            boolean r0 = r0.hasReturned
            if (r0 != 0) goto L75
            r0 = 1
            goto L76
        L75:
            r0 = 0
        L76:
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L98
            r0 = r8
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r12
            r1 = r8
            int r1 = r1.currentPc()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            r0 = r8
            r1 = 0
            r0.addIndex(r1)
        L98:
            r0 = r6
            int r0 = r0.getMaxLocals()
            r17 = r0
            r0 = r6
            r1 = 1
            r0.incMaxLocals(r1)
        La3:
            r0 = r10
            if (r0 == 0) goto L140
            r0 = r10
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Pair r0 = (javassist.compiler.ast.Pair) r0
            r18 = r0
            r0 = r10
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r10 = r0
            r0 = r18
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            javassist.compiler.ast.Declarator r0 = (javassist.compiler.ast.Declarator) r0
            r19 = r0
            r0 = r18
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r20 = r0
            r0 = r19
            r1 = r17
            r0.setLocalVar(r1)
            r0 = r6
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r19
            java.lang.String r1 = r1.getClassName()
            javassist.CtClass r0 = r0.lookupClassByJvmName(r1)
            r21 = r0
            r0 = r19
            r1 = r21
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = javassist.compiler.MemberResolver.javaToJvmName(r1)
            r0.setClassName(r1)
            r0 = r8
            r1 = r14
            r2 = r15
            r3 = r8
            int r3 = r3.currentPc()
            r4 = r21
            r0.addExceptionHandler(r1, r2, r3, r4)
            r0 = r8
            r1 = 1
            r0.growStack(r1)
            r0 = r8
            r1 = r17
            r0.addAstore(r1)
            r0 = r6
            r1 = 0
            r0.hasReturned = r1
            r0 = r20
            if (r0 == 0) goto L118
            r0 = r20
            r1 = r6
            r0.accept(r1)
        L118:
            r0 = r6
            boolean r0 = r0.hasReturned
            if (r0 != 0) goto L13d
            r0 = r8
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r12
            r1 = r8
            int r1 = r1.currentPc()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            r0 = r8
            r1 = 0
            r0.addIndex(r1)
            r0 = 1
            r16 = r0
        L13d:
            goto La3
        L140:
            r0 = r11
            if (r0 == 0) goto L191
            r0 = r13
            r1 = r6
            r0.remove(r1)
            r0 = r8
            int r0 = r0.currentPc()
            r18 = r0
            r0 = r8
            r1 = r14
            r2 = r18
            r3 = r18
            r4 = 0
            r0.addExceptionHandler(r1, r2, r3, r4)
            r0 = r8
            r1 = 1
            r0.growStack(r1)
            r0 = r8
            r1 = r17
            r0.addAstore(r1)
            r0 = r6
            r1 = 0
            r0.hasReturned = r1
            r0 = r11
            r1 = r6
            r0.accept(r1)
            r0 = r6
            boolean r0 = r0.hasReturned
            if (r0 != 0) goto L186
            r0 = r8
            r1 = r17
            r0.addAload(r1)
            r0 = r8
            r1 = 191(0xbf, float:2.68E-43)
            r0.addOpcode(r1)
        L186:
            r0 = r6
            r1 = r13
            java.util.List<int[]> r1 = r1.jsrList
            r2 = r11
            r0.addFinally(r1, r2)
        L191:
            r0 = r8
            int r0 = r0.currentPc()
            r18 = r0
            r0 = r6
            r1 = r12
            r2 = r18
            r0.patchGoto(r1, r2)
            r0 = r6
            r1 = r16
            if (r1 != 0) goto L1a9
            r1 = 1
            goto L1aa
        L1a9:
            r1 = 0
        L1aa:
            r0.hasReturned = r1
            r0 = r11
            if (r0 == 0) goto L1bd
            r0 = r16
            if (r0 == 0) goto L1bd
            r0 = r11
            r1 = r6
            r0.accept(r1)
        L1bd:
            return
    }

    private void addFinally(java.util.List<int[]> r6, javassist.compiler.ast.Stmnt r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r8 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        Ld:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L6d
            r0 = r9
            java.lang.Object r0 = r0.next()
            int[] r0 = (int[]) r0
            r10 = r0
            r0 = r10
            r1 = 0
            r0 = r0[r1]
            r11 = r0
            r0 = r8
            r1 = r11
            r2 = r8
            int r2 = r2.currentPc()
            r3 = r11
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            javassist.compiler.MemberCodeGen$JsrHook2 r0 = new javassist.compiler.MemberCodeGen$JsrHook2
            r1 = r0
            r2 = r5
            r3 = r10
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r7
            r1 = r5
            r0.accept(r1)
            r0 = r12
            r1 = r5
            r0.remove(r1)
            r0 = r5
            boolean r0 = r0.hasReturned
            if (r0 != 0) goto L6a
            r0 = r8
            r1 = 167(0xa7, float:2.34E-43)
            r0.addOpcode(r1)
            r0 = r8
            r1 = r11
            r2 = 3
            int r1 = r1 + r2
            r2 = r8
            int r2 = r2.currentPc()
            int r1 = r1 - r2
            r0.addIndex(r1)
        L6a:
            goto Ld
        L6d:
            return
    }

    @Override // javassist.compiler.CodeGen, javassist.compiler.ast.Visitor
    public void atNewExpr(javassist.compiler.ast.NewExpr r10) throws javassist.compiler.CompileError {
            r9 = this;
            r0 = r10
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Lf
            r0 = r9
            r1 = r10
            r0.atNewArrayExpr(r1)
            goto L58
        Lf:
            r0 = r9
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r10
            javassist.compiler.ast.ASTList r1 = r1.getClassName()
            javassist.CtClass r0 = r0.lookupClassByName(r1)
            r11 = r0
            r0 = r11
            java.lang.String r0 = r0.getName()
            r12 = r0
            r0 = r10
            javassist.compiler.ast.ASTList r0 = r0.getArguments()
            r13 = r0
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r12
            r0.addNew(r1)
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 89
            r0.addOpcode(r1)
            r0 = r9
            r1 = r11
            java.lang.String r2 = "<init>"
            r3 = r13
            r4 = 0
            r5 = 1
            r6 = -1
            r7 = 0
            r0.atMethodCallCore(r1, r2, r3, r4, r5, r6, r7)
            r0 = r9
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r9
            r1 = 0
            r0.arrayDim = r1
            r0 = r9
            r1 = r12
            java.lang.String r1 = javassist.compiler.MemberResolver.javaToJvmName(r1)
            r0.className = r1
        L58:
            return
    }

    public void atNewArrayExpr(javassist.compiler.ast.NewExpr r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            int r0 = r0.getArrayType()
            r8 = r0
            r0 = r7
            javassist.compiler.ast.ASTList r0 = r0.getArraySize()
            r9 = r0
            r0 = r7
            javassist.compiler.ast.ASTList r0 = r0.getClassName()
            r10 = r0
            r0 = r7
            javassist.compiler.ast.ArrayInit r0 = r0.getInitializer()
            r11 = r0
            r0 = r9
            int r0 = r0.length()
            r1 = 1
            if (r0 <= r1) goto L37
            r0 = r11
            if (r0 == 0) goto L2e
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "sorry, multi-dimensional array initializer for new is not supported"
            r1.<init>(r2)
            throw r0
        L2e:
            r0 = r6
            r1 = r8
            r2 = r10
            r3 = r9
            r0.atMultiNewArray(r1, r2, r3)
            return
        L37:
            r0 = r9
            javassist.compiler.ast.ASTree r0 = r0.head()
            r12 = r0
            r0 = r6
            r1 = r8
            r2 = r12
            r3 = r10
            r4 = 47
            java.lang.String r3 = javassist.compiler.ast.Declarator.astToClassName(r3, r4)
            r4 = r11
            r0.atNewArrayExpr2(r1, r2, r3, r4)
            return
    }

    private void atNewArrayExpr2(int r5, javassist.compiler.ast.ASTree r6, java.lang.String r7, javassist.compiler.ast.ArrayInit r8) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r8
            if (r0 != 0) goto L1c
            r0 = r6
            if (r0 != 0) goto L14
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "no array size"
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r6
            r1 = r4
            r0.accept(r1)
            goto L3e
        L1c:
            r0 = r6
            if (r0 != 0) goto L33
            r0 = r8
            int r0 = r0.size()
            r9 = r0
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r9
            r0.addIconst(r1)
            goto L3e
        L33:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "unnecessary array size specified for new"
            r1.<init>(r2)
            throw r0
        L3e:
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L5b
            r0 = r4
            r1 = r7
            java.lang.String r0 = r0.resolveClassName(r1)
            r9 = r0
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r9
            java.lang.String r1 = javassist.compiler.MemberResolver.jvmToJavaName(r1)
            r0.addAnewarray(r1)
            goto Lf8
        L5b:
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r5
            switch(r0) {
                case 301: goto Lac;
                case 303: goto Lc6;
                case 306: goto Lb2;
                case 312: goto Lbf;
                case 317: goto Lb8;
                case 324: goto Ld4;
                case 326: goto Ldb;
                case 334: goto Lcd;
                default: goto Le2;
            }
        Lac:
            r0 = 4
            r10 = r0
            goto Le5
        Lb2:
            r0 = 5
            r10 = r0
            goto Le5
        Lb8:
            r0 = 6
            r10 = r0
            goto Le5
        Lbf:
            r0 = 7
            r10 = r0
            goto Le5
        Lc6:
            r0 = 8
            r10 = r0
            goto Le5
        Lcd:
            r0 = 9
            r10 = r0
            goto Le5
        Ld4:
            r0 = 10
            r10 = r0
            goto Le5
        Ldb:
            r0 = 11
            r10 = r0
            goto Le5
        Le2:
            badNewExpr()
        Le5:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 188(0xbc, float:2.63E-43)
            r0.addOpcode(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r10
            r0.add(r1)
        Lf8:
            r0 = r8
            if (r0 == 0) goto L156
            r0 = r8
            int r0 = r0.size()
            r10 = r0
            r0 = r8
            r11 = r0
            r0 = 0
            r12 = r0
        L10b:
            r0 = r12
            r1 = r10
            if (r0 >= r1) goto L156
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 89
            r0.addOpcode(r1)
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r12
            r0.addIconst(r1)
            r0 = r11
            javassist.compiler.ast.ASTree r0 = r0.head()
            r1 = r4
            r0.accept(r1)
            r0 = r5
            boolean r0 = isRefType(r0)
            if (r0 != 0) goto L13d
            r0 = r4
            r1 = r4
            int r1 = r1.exprType
            r2 = r5
            r0.atNumCastExpr(r1, r2)
        L13d:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r5
            r2 = 0
            int r1 = getArrayWriteOp(r1, r2)
            r0.addOpcode(r1)
            r0 = r11
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r11 = r0
            int r12 = r12 + 1
            goto L10b
        L156:
            r0 = r4
            r1 = r5
            r0.exprType = r1
            r0 = r4
            r1 = 1
            r0.arrayDim = r1
            r0 = r4
            r1 = r9
            r0.className = r1
            return
    }

    private static void badNewExpr() throws javassist.compiler.CompileError {
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad new expression"
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.compiler.CodeGen
    protected void atArrayVariableAssign(javassist.compiler.ast.ArrayInit r7, int r8, int r9, java.lang.String r10) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            r1 = r8
            r2 = 0
            r3 = r10
            r4 = r7
            r0.atNewArrayExpr2(r1, r2, r3, r4)
            return
    }

    @Override // javassist.compiler.CodeGen, javassist.compiler.ast.Visitor
    public void atArrayInit(javassist.compiler.ast.ArrayInit r5) throws javassist.compiler.CompileError {
            r4 = this;
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "array initializer is not supported"
            r1.<init>(r2)
            throw r0
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
            if (r0 == 0) goto L41
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.head()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L1b
            goto L41
        L1b:
            int r8 = r8 + 1
            r0 = r10
            r1 = r4
            r0.accept(r1)
            r0 = r4
            int r0 = r0.exprType
            r1 = 324(0x144, float:4.54E-43)
            if (r0 == r1) goto L39
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad type for array size"
            r1.<init>(r2)
            throw r0
        L39:
            r0 = r7
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r7 = r0
            goto L9
        L41:
            r0 = r4
            r1 = r5
            r0.exprType = r1
            r0 = r4
            r1 = r9
            r0.arrayDim = r1
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L6a
            r0 = r4
            r1 = r4
            r2 = r6
            java.lang.String r1 = r1.resolveClassName(r2)
            r0.className = r1
            r0 = r4
            java.lang.String r0 = r0.className
            r1 = r9
            java.lang.String r0 = toJvmArrayName(r0, r1)
            r10 = r0
            goto L72
        L6a:
            r0 = r5
            r1 = r9
            java.lang.String r0 = toJvmTypeName(r0, r1)
            r10 = r0
        L72:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r10
            r2 = r8
            int r0 = r0.addMultiNewarray(r1, r2)
            return
    }

    @Override // javassist.compiler.CodeGen, javassist.compiler.ast.Visitor
    public void atCallExpr(javassist.compiler.ast.CallExpr r10) throws javassist.compiler.CompileError {
            r9 = this;
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r10
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r13 = r0
            r0 = r10
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            javassist.compiler.ast.ASTList r0 = (javassist.compiler.ast.ASTList) r0
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = -1
            r17 = r0
            r0 = r10
            javassist.compiler.MemberResolver$Method r0 = r0.getMethod()
            r18 = r0
            r0 = r13
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L66
            r0 = r13
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r11 = r0
            r0 = r9
            javassist.CtClass r0 = r0.thisClass
            r12 = r0
            r0 = r9
            boolean r0 = r0.inStaticMethod
            if (r0 != 0) goto L4c
            r0 = r18
            if (r0 == 0) goto L52
            r0 = r18
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L52
        L4c:
            r0 = 1
            r15 = r0
            goto L1c8
        L52:
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r17 = r0
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addAload(r1)
            goto L1c8
        L66:
            r0 = r13
            boolean r0 = r0 instanceof javassist.compiler.ast.Keyword
            if (r0 == 0) goto La9
            r0 = 1
            r16 = r0
            java.lang.String r0 = "<init>"
            r11 = r0
            r0 = r9
            javassist.CtClass r0 = r0.thisClass
            r12 = r0
            r0 = r9
            boolean r0 = r0.inStaticMethod
            if (r0 == 0) goto L8b
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "a constructor cannot be static"
            r1.<init>(r2)
            throw r0
        L8b:
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addAload(r1)
            r0 = r13
            javassist.compiler.ast.Keyword r0 = (javassist.compiler.ast.Keyword) r0
            int r0 = r0.get()
            r1 = 336(0x150, float:4.71E-43)
            if (r0 != r1) goto L1c8
            r0 = r12
            javassist.CtClass r0 = javassist.compiler.MemberResolver.getSuperclass(r0)
            r12 = r0
            goto L1c8
        La9:
            r0 = r13
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L1c5
            r0 = r13
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r19 = r0
            r0 = r19
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0
            java.lang.String r0 = r0.get()
            r11 = r0
            r0 = r19
            int r0 = r0.getOperator()
            r20 = r0
            r0 = r20
            r1 = 35
            if (r0 != r1) goto Lec
            r0 = r9
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r19
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            javassist.compiler.ast.Symbol r1 = (javassist.compiler.ast.Symbol) r1
            java.lang.String r1 = r1.get()
            r2 = 0
            javassist.CtClass r0 = r0.lookupClass(r1, r2)
            r12 = r0
            r0 = 1
            r15 = r0
            goto L1c2
        Lec:
            r0 = r20
            r1 = 46
            if (r0 != r1) goto L1bf
            r0 = r19
            javassist.compiler.ast.ASTree r0 = r0.oprand1()
            r21 = r0
            r0 = r21
            java.lang.String r0 = javassist.compiler.TypeChecker.isDotSuper(r0)
            r22 = r0
            r0 = r22
            if (r0 == 0) goto L141
            r0 = 1
            r16 = r0
            r0 = r9
            javassist.CtClass r0 = r0.thisClass
            r1 = r22
            javassist.CtClass r0 = javassist.compiler.MemberResolver.getSuperInterface(r0, r1)
            r12 = r0
            r0 = r9
            boolean r0 = r0.inStaticMethod
            if (r0 != 0) goto L127
            r0 = r18
            if (r0 == 0) goto L12d
            r0 = r18
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L12d
        L127:
            r0 = 1
            r15 = r0
            goto L1bc
        L12d:
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.currentPc()
            r17 = r0
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addAload(r1)
            goto L1bc
        L141:
            r0 = r21
            boolean r0 = r0 instanceof javassist.compiler.ast.Keyword
            if (r0 == 0) goto L15a
            r0 = r21
            javassist.compiler.ast.Keyword r0 = (javassist.compiler.ast.Keyword) r0
            int r0 = r0.get()
            r1 = 336(0x150, float:4.71E-43)
            if (r0 != r1) goto L15a
            r0 = 1
            r16 = r0
        L15a:
            r0 = r21
            r1 = r9
            r0.accept(r1)     // Catch: javassist.compiler.NoFieldException -> L163
            goto L18a
        L163:
            r23 = move-exception
            r0 = r23
            javassist.compiler.ast.ASTree r0 = r0.getExpr()
            r1 = r21
            if (r0 == r1) goto L172
            r0 = r23
            throw r0
        L172:
            r0 = r9
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r9
            r1 = 0
            r0.arrayDim = r1
            r0 = r9
            r1 = r23
            java.lang.String r1 = r1.getField()
            r0.className = r1
            r0 = 1
            r15 = r0
        L18a:
            r0 = r9
            int r0 = r0.arrayDim
            if (r0 <= 0) goto L1a0
            r0 = r9
            javassist.compiler.MemberResolver r0 = r0.resolver
            java.lang.String r1 = "java.lang.Object"
            r2 = 1
            javassist.CtClass r0 = r0.lookupClass(r1, r2)
            r12 = r0
            goto L1bc
        L1a0:
            r0 = r9
            int r0 = r0.exprType
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L1b9
            r0 = r9
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r9
            java.lang.String r1 = r1.className
            javassist.CtClass r0 = r0.lookupClassByJvmName(r1)
            r12 = r0
            goto L1bc
        L1b9:
            badMethod()
        L1bc:
            goto L1c2
        L1bf:
            badMethod()
        L1c2:
            goto L1c8
        L1c5:
            fatal()
        L1c8:
            r0 = r9
            r1 = r12
            r2 = r11
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.atMethodCallCore(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private static void badMethod() throws javassist.compiler.CompileError {
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad method"
            r1.<init>(r2)
            throw r0
    }

    public void atMethodCallCore(javassist.CtClass r10, java.lang.String r11, javassist.compiler.ast.ASTList r12, boolean r13, boolean r14, int r15, javassist.compiler.MemberResolver.Method r16) throws javassist.compiler.CompileError {
            r9 = this;
            r0 = r9
            r1 = r12
            int r0 = r0.getMethodArgsLength(r1)
            r17 = r0
            r0 = r17
            int[] r0 = new int[r0]
            r18 = r0
            r0 = r17
            int[] r0 = new int[r0]
            r19 = r0
            r0 = r17
            java.lang.String[] r0 = new java.lang.String[r0]
            r20 = r0
            r0 = r13
            if (r0 != 0) goto L38
            r0 = r16
            if (r0 == 0) goto L38
            r0 = r16
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L38
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 87
            r0.addOpcode(r1)
            r0 = 1
            r13 = r0
        L38:
            r0 = r9
            javassist.bytecode.Bytecode r0 = r0.bytecode
            int r0 = r0.getStackDepth()
            r21 = r0
            r0 = r9
            r1 = r12
            r2 = r18
            r3 = r19
            r4 = r20
            r0.atMethodArgs(r1, r2, r3, r4)
            r0 = r16
            if (r0 != 0) goto L6a
            r0 = r9
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r10
            r2 = r9
            javassist.CtClass r2 = r2.thisClass
            r3 = r9
            javassist.bytecode.MethodInfo r3 = r3.thisMethod
            r4 = r11
            r5 = r18
            r6 = r19
            r7 = r20
            javassist.compiler.MemberResolver$Method r0 = r0.lookupMethod(r1, r2, r3, r4, r5, r6, r7)
            r16 = r0
        L6a:
            r0 = r16
            if (r0 != 0) goto Lad
            r0 = r11
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L80
            java.lang.String r0 = "constructor not found"
            r22 = r0
            goto La3
        L80:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Method "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " not found in "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r22 = r0
        La3:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r22
            r1.<init>(r2)
            throw r0
        Lad:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.atMethodCallCore2(r1, r2, r3, r4, r5, r6)
            return
    }

    private boolean isFromSameDeclaringClass(javassist.CtClass r5, javassist.CtClass r6) {
            r4 = this;
        L0:
            r0 = r5
            if (r0 == 0) goto L17
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = r0.isEnclosing(r1, r2)     // Catch: javassist.NotFoundException -> L1a
            if (r0 == 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = r5
            javassist.CtClass r0 = r0.getDeclaringClass()     // Catch: javassist.NotFoundException -> L1a
            r5 = r0
            goto L0
        L17:
            goto L1b
        L1a:
            r7 = move-exception
        L1b:
            r0 = 0
            return r0
    }

    private void atMethodCallCore2(javassist.CtClass r8, java.lang.String r9, boolean r10, boolean r11, int r12, javassist.compiler.MemberResolver.Method r13) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r13
            javassist.CtClass r0 = r0.declaring
            r14 = r0
            r0 = r13
            javassist.bytecode.MethodInfo r0 = r0.info
            r15 = r0
            r0 = r15
            java.lang.String r0 = r0.getDescriptor()
            r16 = r0
            r0 = r15
            int r0 = r0.getAccessFlags()
            r17 = r0
            r0 = r9
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8f
            r0 = 1
            r11 = r0
            r0 = r14
            r1 = r8
            if (r0 == r1) goto L4d
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "no such constructor: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L4d:
            r0 = r14
            r1 = r7
            javassist.CtClass r1 = r1.thisClass
            if (r0 == r1) goto Ldb
            r0 = r17
            boolean r0 = javassist.bytecode.AccessFlag.isPrivate(r0)
            if (r0 == 0) goto Ldb
            r0 = r14
            javassist.bytecode.ClassFile r0 = r0.getClassFile()
            int r0 = r0.getMajorVersion()
            r1 = 52
            if (r0 < r1) goto L78
            r0 = r7
            r1 = r14
            r2 = r7
            javassist.CtClass r2 = r2.thisClass
            boolean r0 = r0.isFromSameDeclaringClass(r1, r2)
            if (r0 != 0) goto Ldb
        L78:
            r0 = r7
            r1 = r16
            r2 = r14
            r3 = r15
            java.lang.String r0 = r0.getAccessibleConstructor(r1, r2, r3)
            r16 = r0
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 1
            r0.addOpcode(r1)
            goto Ldb
        L8f:
            r0 = r17
            boolean r0 = javassist.bytecode.AccessFlag.isPrivate(r0)
            if (r0 == 0) goto Ldb
            r0 = r14
            r1 = r7
            javassist.CtClass r1 = r1.thisClass
            if (r0 != r1) goto La6
            r0 = 1
            r11 = r0
            goto Ldb
        La6:
            r0 = 0
            r11 = r0
            r0 = 1
            r10 = r0
            r0 = r16
            r18 = r0
            r0 = r17
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto Lc3
            r0 = r14
            java.lang.String r0 = r0.getName()
            r1 = r18
            java.lang.String r0 = javassist.bytecode.Descriptor.insertParameter(r0, r1)
            r16 = r0
        Lc3:
            r0 = r17
            int r0 = javassist.bytecode.AccessFlag.setPackage(r0)
            r1 = 8
            r0 = r0 | r1
            r17 = r0
            r0 = r7
            r1 = r9
            r2 = r18
            r3 = r16
            r4 = r15
            r5 = r14
            java.lang.String r0 = r0.getAccessiblePrivate(r1, r2, r3, r4, r5)
            r9 = r0
        Ldb:
            r0 = 0
            r18 = r0
            r0 = r17
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L110
            r0 = r10
            if (r0 != 0) goto L101
            r0 = 1
            r10 = r0
            r0 = r12
            if (r0 < 0) goto Lfe
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r12
            r2 = 0
            r0.write(r1, r2)
            goto L101
        Lfe:
            r0 = 1
            r18 = r0
        L101:
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r14
            r2 = r9
            r3 = r16
            r0.addInvokestatic(r1, r2, r3)
            goto L18b
        L110:
            r0 = r11
            if (r0 == 0) goto L123
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r8
            r2 = r9
            r3 = r16
            r0.addInvokespecial(r1, r2, r3)
            goto L18b
        L123:
            r0 = r14
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isPublic(r0)
            if (r0 == 0) goto L13a
            r0 = r14
            boolean r0 = r0.isInterface()
            r1 = r8
            boolean r1 = r1.isInterface()
            if (r0 == r1) goto L13d
        L13a:
            r0 = r8
            r14 = r0
        L13d:
            r0 = r14
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L15f
            r0 = r16
            int r0 = javassist.bytecode.Descriptor.paramSize(r0)
            r1 = 1
            int r0 = r0 + r1
            r19 = r0
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r14
            r2 = r9
            r3 = r16
            r4 = r19
            r0.addInvokeinterface(r1, r2, r3, r4)
            goto L18b
        L15f:
            r0 = r10
            if (r0 == 0) goto L17f
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is not static"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L17f:
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r14
            r2 = r9
            r3 = r16
            r0.addInvokevirtual(r1, r2, r3)
        L18b:
            r0 = r7
            r1 = r16
            r2 = r10
            r3 = r18
            r0.setReturnType(r1, r2, r3)
            return
    }

    protected java.lang.String getAccessiblePrivate(java.lang.String r7, java.lang.String r8, java.lang.String r9, javassist.bytecode.MethodInfo r10, javassist.CtClass r11) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            r1 = r11
            r2 = r6
            javassist.CtClass r2 = r2.thisClass
            boolean r0 = r0.isEnclosing(r1, r2)
            if (r0 == 0) goto L24
            r0 = r11
            javassist.compiler.AccessorMaker r0 = r0.getAccessorMaker()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L24
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.String r0 = r0.getMethodAccessor(r1, r2, r3, r4)
            return r0
        L24:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Method "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is private"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    protected java.lang.String getAccessibleConstructor(java.lang.String r6, javassist.CtClass r7, javassist.bytecode.MethodInfo r8) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            r1 = r7
            r2 = r5
            javassist.CtClass r2 = r2.thisClass
            boolean r0 = r0.isEnclosing(r1, r2)
            if (r0 == 0) goto L20
            r0 = r7
            javassist.compiler.AccessorMaker r0 = r0.getAccessorMaker()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L20
            r0 = r9
            r1 = r7
            r2 = r6
            r3 = r8
            java.lang.String r0 = r0.getConstructor(r1, r2, r3)
            return r0
        L20:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "the called constructor is private in "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private boolean isEnclosing(javassist.CtClass r4, javassist.CtClass r5) {
            r3 = this;
        L0:
            r0 = r5
            if (r0 == 0) goto L10
            r0 = r5
            javassist.CtClass r0 = r0.getDeclaringClass()     // Catch: javassist.NotFoundException -> L13
            r5 = r0
            r0 = r5
            r1 = r4
            if (r0 != r1) goto L0
            r0 = 1
            return r0
        L10:
            goto L14
        L13:
            r6 = move-exception
        L14:
            r0 = 0
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

    void setReturnType(java.lang.String r6, boolean r7, boolean r8) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            r1 = 41
            int r0 = r0.indexOf(r1)
            r9 = r0
            r0 = r9
            if (r0 >= 0) goto L10
            badMethod()
        L10:
            r0 = r6
            int r9 = r9 + 1
            r1 = r9
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = 0
            r11 = r0
        L1e:
            r0 = r10
            r1 = 91
            if (r0 != r1) goto L36
            int r11 = r11 + 1
            r0 = r6
            int r9 = r9 + 1
            r1 = r9
            char r0 = r0.charAt(r1)
            r10 = r0
            goto L1e
        L36:
            r0 = r5
            r1 = r11
            r0.arrayDim = r1
            r0 = r10
            r1 = 76
            if (r0 != r1) goto L6f
            r0 = r6
            r1 = 59
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            int r0 = r0.indexOf(r1, r2)
            r12 = r0
            r0 = r12
            if (r0 >= 0) goto L57
            badMethod()
        L57:
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            r0.exprType = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            r3 = r12
            java.lang.String r1 = r1.substring(r2, r3)
            r0.className = r1
            goto L7d
        L6f:
            r0 = r5
            r1 = r10
            int r1 = javassist.compiler.MemberResolver.descToType(r1)
            r0.exprType = r1
            r0 = r5
            r1 = 0
            r0.className = r1
        L7d:
            r0 = r5
            int r0 = r0.exprType
            r12 = r0
            r0 = r7
            if (r0 == 0) goto Ld9
            r0 = r8
            if (r0 == 0) goto Ld9
            r0 = r12
            r1 = r11
            boolean r0 = is2word(r0, r1)
            if (r0 == 0) goto Lb3
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 93
            r0.addOpcode(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 88
            r0.addOpcode(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 87
            r0.addOpcode(r1)
            goto Ld9
        Lb3:
            r0 = r12
            r1 = 344(0x158, float:4.82E-43)
            if (r0 != r1) goto Lc7
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 87
            r0.addOpcode(r1)
            goto Ld9
        Lc7:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 95
            r0.addOpcode(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 87
            r0.addOpcode(r1)
        Ld9:
            return
    }

    @Override // javassist.compiler.CodeGen
    protected void atFieldAssign(javassist.compiler.ast.Expr r9, int r10, javassist.compiler.ast.ASTree r11, javassist.compiler.ast.ASTree r12, boolean r13) throws javassist.compiler.CompileError {
            r8 = this;
            r0 = r8
            r1 = r11
            r2 = 0
            javassist.CtField r0 = r0.fieldAccess(r1, r2)
            r14 = r0
            r0 = r8
            boolean r0 = r0.resultStatic
            r15 = r0
            r0 = r10
            r1 = 61
            if (r0 == r1) goto L22
            r0 = r15
            if (r0 != 0) goto L22
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 89
            r0.addOpcode(r1)
        L22:
            r0 = r10
            r1 = 61
            if (r0 != r1) goto L58
            r0 = r14
            javassist.bytecode.FieldInfo r0 = r0.getFieldInfo2()
            r17 = r0
            r0 = r8
            r1 = r17
            boolean r0 = r0.setFieldType(r1)
            r0 = r8
            r1 = r14
            r2 = r17
            javassist.compiler.AccessorMaker r0 = r0.isAccessibleField(r1, r2)
            r18 = r0
            r0 = r18
            if (r0 != 0) goto L52
            r0 = r8
            r1 = r14
            r2 = r17
            int r0 = r0.addFieldrefInfo(r1, r2)
            r16 = r0
            goto L55
        L52:
            r0 = 0
            r16 = r0
        L55:
            goto L62
        L58:
            r0 = r8
            r1 = r14
            r2 = r15
            int r0 = r0.atFieldRead(r1, r2)
            r16 = r0
        L62:
            r0 = r8
            int r0 = r0.exprType
            r17 = r0
            r0 = r8
            int r0 = r0.arrayDim
            r18 = r0
            r0 = r8
            java.lang.String r0 = r0.className
            r19 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r17
            r5 = r18
            r6 = r19
            r0.atAssignCore(r1, r2, r3, r4, r5, r6)
            r0 = r17
            r1 = r18
            boolean r0 = is2word(r0, r1)
            r20 = r0
            r0 = r13
            if (r0 == 0) goto Lbd
            r0 = r15
            if (r0 == 0) goto La6
            r0 = r20
            if (r0 == 0) goto L9f
            r0 = 92
            goto La1
        L9f:
            r0 = 89
        La1:
            r21 = r0
            goto Lb4
        La6:
            r0 = r20
            if (r0 == 0) goto Lb0
            r0 = 93
            goto Lb2
        Lb0:
            r0 = 90
        Lb2:
            r21 = r0
        Lb4:
            r0 = r8
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r21
            r0.addOpcode(r1)
        Lbd:
            r0 = r8
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r20
            r0.atFieldAssignCore(r1, r2, r3, r4)
            r0 = r8
            r1 = r17
            r0.exprType = r1
            r0 = r8
            r1 = r18
            r0.arrayDim = r1
            r0 = r8
            r1 = r19
            r0.className = r1
            return
    }

    private void atFieldAssignCore(javassist.CtField r6, boolean r7, int r8, boolean r9) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r8
            if (r0 == 0) goto L4f
            r0 = r7
            if (r0 == 0) goto L27
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 179(0xb3, float:2.51E-43)
            r0.add(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r9
            if (r1 == 0) goto L20
            r1 = -2
            goto L21
        L20:
            r1 = -1
        L21:
            r0.growStack(r1)
            goto L44
        L27:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 181(0xb5, float:2.54E-43)
            r0.add(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r9
            if (r1 == 0) goto L3f
            r1 = -3
            goto L41
        L3f:
            r1 = -2
        L41:
            r0.growStack(r1)
        L44:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r8
            r0.addIndex(r1)
            goto L7f
        L4f:
            r0 = r6
            javassist.CtClass r0 = r0.getDeclaringClass()
            r10 = r0
            r0 = r10
            javassist.compiler.AccessorMaker r0 = r0.getAccessorMaker()
            r11 = r0
            r0 = r6
            javassist.bytecode.FieldInfo r0 = r0.getFieldInfo2()
            r12 = r0
            r0 = r11
            r1 = r12
            r2 = r7
            javassist.bytecode.MethodInfo r0 = r0.getFieldSetter(r1, r2)
            r13 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r10
            r2 = r13
            java.lang.String r2 = r2.getName()
            r3 = r13
            java.lang.String r3 = r3.getDescriptor()
            r0.addInvokestatic(r1, r2, r3)
        L7f:
            return
    }

    @Override // javassist.compiler.CodeGen, javassist.compiler.ast.Visitor
    public void atMember(javassist.compiler.ast.Member r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.atFieldRead(r1)
            return
    }

    @Override // javassist.compiler.CodeGen
    protected void atFieldRead(javassist.compiler.ast.ASTree r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            javassist.CtField r0 = r0.fieldAccess(r1, r2)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L11
            r0 = r4
            r1 = r5
            r0.atArrayLength(r1)
            return
        L11:
            r0 = r4
            boolean r0 = r0.resultStatic
            r7 = r0
            r0 = r6
            javassist.compiler.ast.ASTree r0 = javassist.compiler.TypeChecker.getConstantFieldValue(r0)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L2b
            r0 = r4
            r1 = r6
            r2 = r7
            int r0 = r0.atFieldRead(r1, r2)
            goto L3a
        L2b:
            r0 = r8
            r1 = r4
            r0.accept(r1)
            r0 = r4
            r1 = r6
            javassist.bytecode.FieldInfo r1 = r1.getFieldInfo2()
            boolean r0 = r0.setFieldType(r1)
        L3a:
            return
    }

    private void atArrayLength(javassist.compiler.ast.ASTree r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            int r0 = r0.arrayDim
            if (r0 != 0) goto L12
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = ".length applied to a non array"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 190(0xbe, float:2.66E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 324(0x144, float:4.54E-43)
            r0.exprType = r1
            r0 = r4
            r1 = 0
            r0.arrayDim = r1
            return
    }

    private int atFieldRead(javassist.CtField r6, boolean r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            javassist.bytecode.FieldInfo r0 = r0.getFieldInfo2()
            r8 = r0
            r0 = r5
            r1 = r8
            boolean r0 = r0.setFieldType(r1)
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r8
            javassist.compiler.AccessorMaker r0 = r0.isAccessibleField(r1, r2)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L39
            r0 = r10
            r1 = r8
            r2 = r7
            javassist.bytecode.MethodInfo r0 = r0.getFieldGetter(r1, r2)
            r11 = r0
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r6
            javassist.CtClass r1 = r1.getDeclaringClass()
            r2 = r11
            java.lang.String r2 = r2.getName()
            r3 = r11
            java.lang.String r3 = r3.getDescriptor()
            r0.addInvokestatic(r1, r2, r3)
            r0 = 0
            return r0
        L39:
            r0 = r5
            r1 = r6
            r2 = r8
            int r0 = r0.addFieldrefInfo(r1, r2)
            r11 = r0
            r0 = r7
            if (r0 == 0) goto L63
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 178(0xb2, float:2.5E-43)
            r0.add(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r9
            if (r1 == 0) goto L5c
            r1 = 2
            goto L5d
        L5c:
            r1 = 1
        L5d:
            r0.growStack(r1)
            goto L7e
        L63:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 180(0xb4, float:2.52E-43)
            r0.add(r1)
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r9
            if (r1 == 0) goto L7a
            r1 = 1
            goto L7b
        L7a:
            r1 = 0
        L7b:
            r0.growStack(r1)
        L7e:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r11
            r0.addIndex(r1)
            r0 = r11
            return r0
    }

    private javassist.compiler.AccessorMaker isAccessibleField(javassist.CtField r6, javassist.bytecode.FieldInfo r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r7
            int r0 = r0.getAccessFlags()
            boolean r0 = javassist.bytecode.AccessFlag.isPrivate(r0)
            if (r0 == 0) goto L66
            r0 = r6
            javassist.CtClass r0 = r0.getDeclaringClass()
            r1 = r5
            javassist.CtClass r1 = r1.thisClass
            if (r0 == r1) goto L66
            r0 = r6
            javassist.CtClass r0 = r0.getDeclaringClass()
            r8 = r0
            r0 = r5
            r1 = r8
            r2 = r5
            javassist.CtClass r2 = r2.thisClass
            boolean r0 = r0.isEnclosing(r1, r2)
            if (r0 == 0) goto L34
            r0 = r8
            javassist.compiler.AccessorMaker r0 = r0.getAccessorMaker()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L34
            r0 = r9
            return r0
        L34:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Field "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " in "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is private."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L66:
            r0 = 0
            return r0
    }

    private boolean setFieldType(javassist.bytecode.FieldInfo r9) throws javassist.compiler.CompileError {
            r8 = this;
            r0 = r9
            java.lang.String r0 = r0.getDescriptor()
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r10
            r1 = r11
            char r0 = r0.charAt(r1)
            r13 = r0
        L11:
            r0 = r13
            r1 = 91
            if (r0 != r1) goto L28
            int r12 = r12 + 1
            r0 = r10
            int r11 = r11 + 1
            r1 = r11
            char r0 = r0.charAt(r1)
            r13 = r0
            goto L11
        L28:
            r0 = r8
            r1 = r12
            r0.arrayDim = r1
            r0 = r8
            r1 = r13
            int r1 = javassist.compiler.MemberResolver.descToType(r1)
            r0.exprType = r1
            r0 = r13
            r1 = 76
            if (r0 != r1) goto L55
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = 1
            int r2 = r2 + r3
            r3 = r10
            r4 = 59
            r5 = r11
            r6 = 1
            int r5 = r5 + r6
            int r3 = r3.indexOf(r4, r5)
            java.lang.String r1 = r1.substring(r2, r3)
            r0.className = r1
            goto L5a
        L55:
            r0 = r8
            r1 = 0
            r0.className = r1
        L5a:
            r0 = r12
            if (r0 != 0) goto L71
            r0 = r13
            r1 = 74
            if (r0 == r1) goto L6d
            r0 = r13
            r1 = 68
            if (r0 != r1) goto L71
        L6d:
            r0 = 1
            goto L72
        L71:
            r0 = 0
        L72:
            r14 = r0
            r0 = r14
            return r0
    }

    private int addFieldrefInfo(javassist.CtField r6, javassist.bytecode.FieldInfo r7) {
            r5 = this;
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r8 = r0
            r0 = r6
            javassist.CtClass r0 = r0.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r8
            r1 = r9
            int r0 = r0.addClassInfo(r1)
            r10 = r0
            r0 = r7
            java.lang.String r0 = r0.getName()
            r11 = r0
            r0 = r7
            java.lang.String r0 = r0.getDescriptor()
            r12 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            int r0 = r0.addFieldrefInfo(r1, r2, r3)
            return r0
    }

    @Override // javassist.compiler.CodeGen
    protected void atClassObject2(java.lang.String r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            int r0 = r0.getMajorVersion()
            r1 = 49
            if (r0 >= r1) goto L11
            r0 = r4
            r1 = r5
            super.atClassObject2(r1)
            goto L23
        L11:
            r0 = r4
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = r4
            javassist.bytecode.Bytecode r1 = r1.bytecode
            javassist.bytecode.ConstPool r1 = r1.getConstPool()
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.addLdc(r1)
        L23:
            return
    }

    @Override // javassist.compiler.CodeGen
    protected void atFieldPlusPlus(int r8, boolean r9, javassist.compiler.ast.ASTree r10, javassist.compiler.ast.Expr r11, boolean r12) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r7
            r1 = r10
            r2 = 0
            javassist.CtField r0 = r0.fieldAccess(r1, r2)
            r13 = r0
            r0 = r7
            boolean r0 = r0.resultStatic
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L1c
            r0 = r7
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 89
            r0.addOpcode(r1)
        L1c:
            r0 = r7
            r1 = r13
            r2 = r14
            int r0 = r0.atFieldRead(r1, r2)
            r15 = r0
            r0 = r7
            int r0 = r0.exprType
            r16 = r0
            r0 = r16
            r1 = r7
            int r1 = r1.arrayDim
            boolean r0 = is2word(r0, r1)
            r17 = r0
            r0 = r14
            if (r0 == 0) goto L4d
            r0 = r17
            if (r0 == 0) goto L46
            r0 = 92
            goto L48
        L46:
            r0 = 89
        L48:
            r18 = r0
            goto L5b
        L4d:
            r0 = r17
            if (r0 == 0) goto L57
            r0 = 93
            goto L59
        L57:
            r0 = 90
        L59:
            r18 = r0
        L5b:
            r0 = r7
            r1 = r18
            r2 = r12
            r3 = r8
            r4 = r9
            r5 = r11
            r0.atPlusPlusCore(r1, r2, r3, r4, r5)
            r0 = r7
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r17
            r0.atFieldAssignCore(r1, r2, r3, r4)
            return
    }

    protected javassist.CtField fieldAccess(javassist.compiler.ast.ASTree r6, boolean r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Member
            if (r0 == 0) goto L6e
            r0 = r6
            javassist.compiler.ast.Member r0 = (javassist.compiler.ast.Member) r0
            java.lang.String r0 = r0.get()
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r5
            javassist.CtClass r0 = r0.thisClass     // Catch: javassist.NotFoundException -> L1f
            r1 = r8
            javassist.CtField r0 = r0.getField(r1)     // Catch: javassist.NotFoundException -> L1f
            r9 = r0
            goto L2b
        L1f:
            r10 = move-exception
            javassist.compiler.NoFieldException r0 = new javassist.compiler.NoFieldException
            r1 = r0
            r2 = r8
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
        L2b:
            r0 = r9
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isStatic(r0)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L65
            r0 = r5
            boolean r0 = r0.inStaticMethod
            if (r0 == 0) goto L5d
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "not available in a static method: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L5d:
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode
            r1 = 0
            r0.addAload(r1)
        L65:
            r0 = r5
            r1 = r10
            r0.resultStatic = r1
            r0 = r9
            return r0
        L6e:
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L164
            r0 = r6
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r8 = r0
            r0 = r8
            int r0 = r0.getOperator()
            r9 = r0
            r0 = r9
            r1 = 35
            if (r0 != r1) goto La9
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r8
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            javassist.compiler.ast.Symbol r1 = (javassist.compiler.ast.Symbol) r1
            java.lang.String r1 = r1.get()
            r2 = r8
            javassist.compiler.ast.ASTree r2 = r2.oprand2()
            javassist.compiler.ast.Symbol r2 = (javassist.compiler.ast.Symbol) r2
            javassist.CtField r0 = r0.lookupField(r1, r2)
            r10 = r0
            r0 = r5
            r1 = 1
            r0.resultStatic = r1
            r0 = r10
            return r0
        La9:
            r0 = r9
            r1 = 46
            if (r0 != r1) goto L15e
            r0 = 0
            r10 = r0
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.oprand1()     // Catch: javassist.compiler.NoFieldException -> L127
            r1 = r5
            r0.accept(r1)     // Catch: javassist.compiler.NoFieldException -> L127
            r0 = r5
            int r0 = r0.exprType     // Catch: javassist.compiler.NoFieldException -> L127
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto Le3
            r0 = r5
            int r0 = r0.arrayDim     // Catch: javassist.compiler.NoFieldException -> L127
            if (r0 != 0) goto Le3
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver     // Catch: javassist.compiler.NoFieldException -> L127
            r1 = r5
            java.lang.String r1 = r1.className     // Catch: javassist.compiler.NoFieldException -> L127
            r2 = r8
            javassist.compiler.ast.ASTree r2 = r2.oprand2()     // Catch: javassist.compiler.NoFieldException -> L127
            javassist.compiler.ast.Symbol r2 = (javassist.compiler.ast.Symbol) r2     // Catch: javassist.compiler.NoFieldException -> L127
            javassist.CtField r0 = r0.lookupFieldByJvmName(r1, r2)     // Catch: javassist.compiler.NoFieldException -> L127
            r10 = r0
            goto L106
        Le3:
            r0 = r7
            if (r0 == 0) goto L103
            r0 = r5
            int r0 = r0.arrayDim     // Catch: javassist.compiler.NoFieldException -> L127
            if (r0 <= 0) goto L103
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.oprand2()     // Catch: javassist.compiler.NoFieldException -> L127
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0     // Catch: javassist.compiler.NoFieldException -> L127
            java.lang.String r0 = r0.get()     // Catch: javassist.compiler.NoFieldException -> L127
            java.lang.String r1 = "length"
            boolean r0 = r0.equals(r1)     // Catch: javassist.compiler.NoFieldException -> L127
            if (r0 == 0) goto L103
            r0 = 0
            return r0
        L103:
            badLvalue()     // Catch: javassist.compiler.NoFieldException -> L127
        L106:
            r0 = r10
            int r0 = r0.getModifiers()     // Catch: javassist.compiler.NoFieldException -> L127
            boolean r0 = javassist.Modifier.isStatic(r0)     // Catch: javassist.compiler.NoFieldException -> L127
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L11e
            r0 = r5
            javassist.bytecode.Bytecode r0 = r0.bytecode     // Catch: javassist.compiler.NoFieldException -> L127
            r1 = 87
            r0.addOpcode(r1)     // Catch: javassist.compiler.NoFieldException -> L127
        L11e:
            r0 = r5
            r1 = r11
            r0.resultStatic = r1     // Catch: javassist.compiler.NoFieldException -> L127
            r0 = r10
            return r0
        L127:
            r11 = move-exception
            r0 = r11
            javassist.compiler.ast.ASTree r0 = r0.getExpr()
            r1 = r8
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            if (r0 == r1) goto L138
            r0 = r11
            throw r0
        L138:
            r0 = r8
            javassist.compiler.ast.ASTree r0 = r0.oprand2()
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0
            r12 = r0
            r0 = r11
            java.lang.String r0 = r0.getField()
            r13 = r0
            r0 = r5
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r13
            r2 = r12
            r3 = r6
            javassist.CtField r0 = r0.lookupFieldByJvmName2(r1, r2, r3)
            r10 = r0
            r0 = r5
            r1 = 1
            r0.resultStatic = r1
            r0 = r10
            return r0
        L15e:
            badLvalue()
            goto L167
        L164:
            badLvalue()
        L167:
            r0 = r5
            r1 = 0
            r0.resultStatic = r1
            r0 = 0
            return r0
    }

    private static void badLvalue() throws javassist.compiler.CompileError {
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad l-value"
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtClass[] makeParamList(javassist.compiler.ast.MethodDecl r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.getParams()
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L11
            r0 = 0
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r7 = r0
            goto L3d
        L11:
            r0 = 0
            r9 = r0
            r0 = r8
            int r0 = r0.length()
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r7 = r0
        L1c:
            r0 = r8
            if (r0 == 0) goto L3d
            r0 = r7
            r1 = r9
            int r9 = r9 + 1
            r2 = r5
            javassist.compiler.MemberResolver r2 = r2.resolver
            r3 = r8
            javassist.compiler.ast.ASTree r3 = r3.head()
            javassist.compiler.ast.Declarator r3 = (javassist.compiler.ast.Declarator) r3
            javassist.CtClass r2 = r2.lookupClass(r3)
            r0[r1] = r2
            r0 = r8
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r8 = r0
            goto L1c
        L3d:
            r0 = r7
            return r0
    }

    public javassist.CtClass[] makeThrowsList(javassist.compiler.ast.MethodDecl r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.getThrows()
            r8 = r0
            r0 = r8
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = 0
            r9 = r0
            r0 = r8
            int r0 = r0.length()
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r7 = r0
        L16:
            r0 = r8
            if (r0 == 0) goto L37
            r0 = r7
            r1 = r9
            int r9 = r9 + 1
            r2 = r5
            javassist.compiler.MemberResolver r2 = r2.resolver
            r3 = r8
            javassist.compiler.ast.ASTree r3 = r3.head()
            javassist.compiler.ast.ASTList r3 = (javassist.compiler.ast.ASTList) r3
            javassist.CtClass r2 = r2.lookupClassByName(r3)
            r0[r1] = r2
            r0 = r8
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r8 = r0
            goto L16
        L37:
            r0 = r7
            return r0
    }

    @Override // javassist.compiler.CodeGen
    protected java.lang.String resolveClassName(javassist.compiler.ast.ASTList r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r4
            java.lang.String r0 = r0.resolveClassName(r1)
            return r0
    }

    @Override // javassist.compiler.CodeGen
    protected java.lang.String resolveClassName(java.lang.String r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            javassist.compiler.MemberResolver r0 = r0.resolver
            r1 = r4
            java.lang.String r0 = r0.resolveJvmClassName(r1)
            return r0
    }
}
