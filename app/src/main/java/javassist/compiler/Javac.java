package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/Javac.class */
public class Javac {
    javassist.compiler.JvstCodeGen gen;
    javassist.compiler.SymbolTable stable;
    private javassist.bytecode.Bytecode bytecode;
    public static final java.lang.String param0Name = "$0";
    public static final java.lang.String resultVarName = "$_";
    public static final java.lang.String proceedName = "$proceed";




    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/Javac$CtFieldWithInit.class */
    public static class CtFieldWithInit extends javassist.CtField {
        private javassist.compiler.ast.ASTree init;

        CtFieldWithInit(javassist.CtClass r6, java.lang.String r7, javassist.CtClass r8) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                r0.<init>(r1, r2, r3)
                r0 = r5
                r1 = 0
                r0.init = r1
                return
        }

        protected void setInit(javassist.compiler.ast.ASTree r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.init = r1
                return
        }

        @Override // javassist.CtField
        protected javassist.compiler.ast.ASTree getInitAST() {
                r2 = this;
                r0 = r2
                javassist.compiler.ast.ASTree r0 = r0.init
                return r0
        }
    }

    public Javac(javassist.CtClass r8) {
            r7 = this;
            r0 = r7
            javassist.bytecode.Bytecode r1 = new javassist.bytecode.Bytecode
            r2 = r1
            r3 = r8
            javassist.bytecode.ClassFile r3 = r3.getClassFile2()
            javassist.bytecode.ConstPool r3 = r3.getConstPool()
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    public Javac(javassist.bytecode.Bytecode r8, javassist.CtClass r9) {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            javassist.compiler.JvstCodeGen r1 = new javassist.compiler.JvstCodeGen
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r9
            javassist.ClassPool r5 = r5.getClassPool()
            r2.<init>(r3, r4, r5)
            r0.gen = r1
            r0 = r7
            javassist.compiler.SymbolTable r1 = new javassist.compiler.SymbolTable
            r2 = r1
            r2.<init>()
            r0.stable = r1
            r0 = r7
            r1 = r8
            r0.bytecode = r1
            return
    }

    public javassist.bytecode.Bytecode getBytecode() {
            r2 = this;
            r0 = r2
            javassist.bytecode.Bytecode r0 = r0.bytecode
            return r0
    }

    public javassist.CtMember compile(java.lang.String r7) throws javassist.compiler.CompileError {
            r6 = this;
            javassist.compiler.Parser r0 = new javassist.compiler.Parser
            r1 = r0
            javassist.compiler.Lex r2 = new javassist.compiler.Lex
            r3 = r2
            r4 = r7
            r3.<init>(r4)
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r6
            javassist.compiler.SymbolTable r1 = r1.stable
            javassist.compiler.ast.ASTList r0 = r0.parseMember1(r1)
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof javassist.compiler.ast.FieldDecl     // Catch: javassist.bytecode.BadBytecode -> L50 javassist.CannotCompileException -> L5f
            if (r0 == 0) goto L29
            r0 = r6
            r1 = r9
            javassist.compiler.ast.FieldDecl r1 = (javassist.compiler.ast.FieldDecl) r1     // Catch: javassist.bytecode.BadBytecode -> L50 javassist.CannotCompileException -> L5f
            javassist.CtField r0 = r0.compileField(r1)     // Catch: javassist.bytecode.BadBytecode -> L50 javassist.CannotCompileException -> L5f
            return r0
        L29:
            r0 = r6
            r1 = r8
            r2 = r9
            javassist.compiler.ast.MethodDecl r2 = (javassist.compiler.ast.MethodDecl) r2     // Catch: javassist.bytecode.BadBytecode -> L50 javassist.CannotCompileException -> L5f
            javassist.CtBehavior r0 = r0.compileMethod(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L50 javassist.CannotCompileException -> L5f
            r10 = r0
            r0 = r10
            javassist.CtClass r0 = r0.getDeclaringClass()     // Catch: javassist.bytecode.BadBytecode -> L50 javassist.CannotCompileException -> L5f
            r11 = r0
            r0 = r10
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()     // Catch: javassist.bytecode.BadBytecode -> L50 javassist.CannotCompileException -> L5f
            r1 = r11
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.bytecode.BadBytecode -> L50 javassist.CannotCompileException -> L5f
            r2 = r11
            javassist.bytecode.ClassFile r2 = r2.getClassFile2()     // Catch: javassist.bytecode.BadBytecode -> L50 javassist.CannotCompileException -> L5f
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L50 javassist.CannotCompileException -> L5f
            r0 = r10
            return r0
        L50:
            r10 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r10
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            throw r0
        L5f:
            r10 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r10
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            throw r0
    }

    private javassist.CtField compileField(javassist.compiler.ast.FieldDecl r7) throws javassist.compiler.CompileError, javassist.CannotCompileException {
            r6 = this;
            r0 = r7
            javassist.compiler.ast.Declarator r0 = r0.getDeclarator()
            r9 = r0
            javassist.compiler.Javac$CtFieldWithInit r0 = new javassist.compiler.Javac$CtFieldWithInit
            r1 = r0
            r2 = r6
            javassist.compiler.JvstCodeGen r2 = r2.gen
            javassist.compiler.MemberResolver r2 = r2.resolver
            r3 = r9
            javassist.CtClass r2 = r2.lookupClass(r3)
            r3 = r9
            javassist.compiler.ast.Symbol r3 = r3.getVariable()
            java.lang.String r3 = r3.get()
            r4 = r6
            javassist.compiler.JvstCodeGen r4 = r4.gen
            javassist.CtClass r4 = r4.getThisClass()
            r1.<init>(r2, r3, r4)
            r8 = r0
            r0 = r8
            r1 = r7
            javassist.compiler.ast.ASTList r1 = r1.getModifiers()
            int r1 = javassist.compiler.MemberResolver.getModifiers(r1)
            r0.setModifiers(r1)
            r0 = r7
            javassist.compiler.ast.ASTree r0 = r0.getInit()
            if (r0 == 0) goto L40
            r0 = r8
            r1 = r7
            javassist.compiler.ast.ASTree r1 = r1.getInit()
            r0.setInit(r1)
        L40:
            r0 = r8
            return r0
    }

    private javassist.CtBehavior compileMethod(javassist.compiler.Parser r8, javassist.compiler.ast.MethodDecl r9) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r9
            javassist.compiler.ast.ASTList r0 = r0.getModifiers()
            int r0 = javassist.compiler.MemberResolver.getModifiers(r0)
            r10 = r0
            r0 = r7
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r9
            javassist.CtClass[] r0 = r0.makeParamList(r1)
            r11 = r0
            r0 = r7
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r9
            javassist.CtClass[] r0 = r0.makeThrowsList(r1)
            r12 = r0
            r0 = r7
            r1 = r11
            r2 = r10
            boolean r2 = javassist.Modifier.isStatic(r2)
            int r0 = r0.recordParams(r1, r2)
            r0 = r8
            r1 = r7
            javassist.compiler.SymbolTable r1 = r1.stable
            r2 = r9
            javassist.compiler.ast.MethodDecl r0 = r0.parseMethod2(r1, r2)
            r9 = r0
            r0 = r9
            boolean r0 = r0.isConstructor()     // Catch: javassist.NotFoundException -> Led
            if (r0 == 0) goto L71
            javassist.CtConstructor r0 = new javassist.CtConstructor     // Catch: javassist.NotFoundException -> Led
            r1 = r0
            r2 = r11
            r3 = r7
            javassist.compiler.JvstCodeGen r3 = r3.gen     // Catch: javassist.NotFoundException -> Led
            javassist.CtClass r3 = r3.getThisClass()     // Catch: javassist.NotFoundException -> Led
            r1.<init>(r2, r3)     // Catch: javassist.NotFoundException -> Led
            r13 = r0
            r0 = r13
            r1 = r10
            r0.setModifiers(r1)     // Catch: javassist.NotFoundException -> Led
            r0 = r9
            r1 = r7
            javassist.compiler.JvstCodeGen r1 = r1.gen     // Catch: javassist.NotFoundException -> Led
            r0.accept(r1)     // Catch: javassist.NotFoundException -> Led
            r0 = r13
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo()     // Catch: javassist.NotFoundException -> Led
            r1 = r7
            javassist.bytecode.Bytecode r1 = r1.bytecode     // Catch: javassist.NotFoundException -> Led
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()     // Catch: javassist.NotFoundException -> Led
            r0.setCodeAttribute(r1)     // Catch: javassist.NotFoundException -> Led
            r0 = r13
            r1 = r12
            r0.setExceptionTypes(r1)     // Catch: javassist.NotFoundException -> Led
            r0 = r13
            return r0
        L71:
            r0 = r9
            javassist.compiler.ast.Declarator r0 = r0.getReturn()     // Catch: javassist.NotFoundException -> Led
            r13 = r0
            r0 = r7
            javassist.compiler.JvstCodeGen r0 = r0.gen     // Catch: javassist.NotFoundException -> Led
            javassist.compiler.MemberResolver r0 = r0.resolver     // Catch: javassist.NotFoundException -> Led
            r1 = r13
            javassist.CtClass r0 = r0.lookupClass(r1)     // Catch: javassist.NotFoundException -> Led
            r14 = r0
            r0 = r7
            r1 = r14
            r2 = 0
            int r0 = r0.recordReturnType(r1, r2)     // Catch: javassist.NotFoundException -> Led
            javassist.CtMethod r0 = new javassist.CtMethod     // Catch: javassist.NotFoundException -> Led
            r1 = r0
            r2 = r14
            r3 = r13
            javassist.compiler.ast.Symbol r3 = r3.getVariable()     // Catch: javassist.NotFoundException -> Led
            java.lang.String r3 = r3.get()     // Catch: javassist.NotFoundException -> Led
            r4 = r11
            r5 = r7
            javassist.compiler.JvstCodeGen r5 = r5.gen     // Catch: javassist.NotFoundException -> Led
            javassist.CtClass r5 = r5.getThisClass()     // Catch: javassist.NotFoundException -> Led
            r1.<init>(r2, r3, r4, r5)     // Catch: javassist.NotFoundException -> Led
            r15 = r0
            r0 = r15
            r1 = r10
            r0.setModifiers(r1)     // Catch: javassist.NotFoundException -> Led
            r0 = r7
            javassist.compiler.JvstCodeGen r0 = r0.gen     // Catch: javassist.NotFoundException -> Led
            r1 = r15
            r0.setThisMethod(r1)     // Catch: javassist.NotFoundException -> Led
            r0 = r9
            r1 = r7
            javassist.compiler.JvstCodeGen r1 = r1.gen     // Catch: javassist.NotFoundException -> Led
            r0.accept(r1)     // Catch: javassist.NotFoundException -> Led
            r0 = r9
            javassist.compiler.ast.Stmnt r0 = r0.getBody()     // Catch: javassist.NotFoundException -> Led
            if (r0 == 0) goto Ld9
            r0 = r15
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo()     // Catch: javassist.NotFoundException -> Led
            r1 = r7
            javassist.bytecode.Bytecode r1 = r1.bytecode     // Catch: javassist.NotFoundException -> Led
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()     // Catch: javassist.NotFoundException -> Led
            r0.setCodeAttribute(r1)     // Catch: javassist.NotFoundException -> Led
            goto Le3
        Ld9:
            r0 = r15
            r1 = r10
            r2 = 1024(0x400, float:1.435E-42)
            r1 = r1 | r2
            r0.setModifiers(r1)     // Catch: javassist.NotFoundException -> Led
        Le3:
            r0 = r15
            r1 = r12
            r0.setExceptionTypes(r1)     // Catch: javassist.NotFoundException -> Led
            r0 = r15
            return r0
        Led:
            r13 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r13
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public javassist.bytecode.Bytecode compileBody(javassist.CtBehavior r7, java.lang.String r8) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            int r0 = r0.getModifiers()     // Catch: javassist.NotFoundException -> Lc3
            r9 = r0
            r0 = r6
            r1 = r7
            javassist.CtClass[] r1 = r1.getParameterTypes()     // Catch: javassist.NotFoundException -> Lc3
            r2 = r9
            boolean r2 = javassist.Modifier.isStatic(r2)     // Catch: javassist.NotFoundException -> Lc3
            int r0 = r0.recordParams(r1, r2)     // Catch: javassist.NotFoundException -> Lc3
            r0 = r7
            boolean r0 = r0 instanceof javassist.CtMethod     // Catch: javassist.NotFoundException -> Lc3
            if (r0 == 0) goto L30
            r0 = r6
            javassist.compiler.JvstCodeGen r0 = r0.gen     // Catch: javassist.NotFoundException -> Lc3
            r1 = r7
            javassist.CtMethod r1 = (javassist.CtMethod) r1     // Catch: javassist.NotFoundException -> Lc3
            r0.setThisMethod(r1)     // Catch: javassist.NotFoundException -> Lc3
            r0 = r7
            javassist.CtMethod r0 = (javassist.CtMethod) r0     // Catch: javassist.NotFoundException -> Lc3
            javassist.CtClass r0 = r0.getReturnType()     // Catch: javassist.NotFoundException -> Lc3
            r10 = r0
            goto L35
        L30:
            javassist.CtClass r0 = javassist.CtClass.voidType     // Catch: javassist.NotFoundException -> Lc3
            r10 = r0
        L35:
            r0 = r6
            r1 = r10
            r2 = 0
            int r0 = r0.recordReturnType(r1, r2)     // Catch: javassist.NotFoundException -> Lc3
            r0 = r10
            javassist.CtClass r1 = javassist.CtClass.voidType     // Catch: javassist.NotFoundException -> Lc3
            if (r0 != r1) goto L49
            r0 = 1
            goto L4a
        L49:
            r0 = 0
        L4a:
            r11 = r0
            r0 = r8
            if (r0 != 0) goto L5c
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode     // Catch: javassist.NotFoundException -> Lc3
            r1 = r10
            makeDefaultBody(r0, r1)     // Catch: javassist.NotFoundException -> Lc3
            goto Lbe
        L5c:
            javassist.compiler.Parser r0 = new javassist.compiler.Parser     // Catch: javassist.NotFoundException -> Lc3
            r1 = r0
            javassist.compiler.Lex r2 = new javassist.compiler.Lex     // Catch: javassist.NotFoundException -> Lc3
            r3 = r2
            r4 = r8
            r3.<init>(r4)     // Catch: javassist.NotFoundException -> Lc3
            r1.<init>(r2)     // Catch: javassist.NotFoundException -> Lc3
            r12 = r0
            javassist.compiler.SymbolTable r0 = new javassist.compiler.SymbolTable     // Catch: javassist.NotFoundException -> Lc3
            r1 = r0
            r2 = r6
            javassist.compiler.SymbolTable r2 = r2.stable     // Catch: javassist.NotFoundException -> Lc3
            r1.<init>(r2)     // Catch: javassist.NotFoundException -> Lc3
            r13 = r0
            r0 = r12
            r1 = r13
            javassist.compiler.ast.Stmnt r0 = r0.parseStatement(r1)     // Catch: javassist.NotFoundException -> Lc3
            r14 = r0
            r0 = r12
            boolean r0 = r0.hasMore()     // Catch: javassist.NotFoundException -> Lc3
            if (r0 == 0) goto L96
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError     // Catch: javassist.NotFoundException -> Lc3
            r1 = r0
            java.lang.String r2 = "the method/constructor body must be surrounded by {}"
            r1.<init>(r2)     // Catch: javassist.NotFoundException -> Lc3
            throw r0     // Catch: javassist.NotFoundException -> Lc3
        L96:
            r0 = 0
            r15 = r0
            r0 = r7
            boolean r0 = r0 instanceof javassist.CtConstructor     // Catch: javassist.NotFoundException -> Lc3
            if (r0 == 0) goto Lb1
            r0 = r7
            javassist.CtConstructor r0 = (javassist.CtConstructor) r0     // Catch: javassist.NotFoundException -> Lc3
            boolean r0 = r0.isClassInitializer()     // Catch: javassist.NotFoundException -> Lc3
            if (r0 != 0) goto Lae
            r0 = 1
            goto Laf
        Lae:
            r0 = 0
        Laf:
            r15 = r0
        Lb1:
            r0 = r6
            javassist.compiler.JvstCodeGen r0 = r0.gen     // Catch: javassist.NotFoundException -> Lc3
            r1 = r14
            r2 = r15
            r3 = r11
            r0.atMethodBody(r1, r2, r3)     // Catch: javassist.NotFoundException -> Lc3
        Lbe:
            r0 = r6
            javassist.bytecode.Bytecode r0 = r0.bytecode     // Catch: javassist.NotFoundException -> Lc3
            return r0
        Lc3:
            r9 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r9
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static void makeDefaultBody(javassist.bytecode.Bytecode r3, javassist.CtClass r4) {
            r0 = r4
            boolean r0 = r0 instanceof javassist.CtPrimitiveType
            if (r0 == 0) goto L4b
            r0 = r4
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r7 = r0
            r0 = r7
            int r0 = r0.getReturnOp()
            r5 = r0
            r0 = r5
            r1 = 175(0xaf, float:2.45E-43)
            if (r0 != r1) goto L20
            r0 = 14
            r6 = r0
            goto L48
        L20:
            r0 = r5
            r1 = 174(0xae, float:2.44E-43)
            if (r0 != r1) goto L2d
            r0 = 11
            r6 = r0
            goto L48
        L2d:
            r0 = r5
            r1 = 173(0xad, float:2.42E-43)
            if (r0 != r1) goto L3a
            r0 = 9
            r6 = r0
            goto L48
        L3a:
            r0 = r5
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 != r1) goto L46
            r0 = 0
            r6 = r0
            goto L48
        L46:
            r0 = 3
            r6 = r0
        L48:
            goto L51
        L4b:
            r0 = 176(0xb0, float:2.47E-43)
            r5 = r0
            r0 = 1
            r6 = r0
        L51:
            r0 = r6
            if (r0 == 0) goto L5a
            r0 = r3
            r1 = r6
            r0.addOpcode(r1)
        L5a:
            r0 = r3
            r1 = r5
            r0.addOpcode(r1)
            return
    }

    public boolean recordLocalVariables(javassist.bytecode.CodeAttribute r7, int r8) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            java.lang.String r1 = "LocalVariableTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.LocalVariableAttribute r0 = (javassist.bytecode.LocalVariableAttribute) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L11:
            r0 = r9
            int r0 = r0.tableLength()
            r10 = r0
            r0 = 0
            r11 = r0
        L1a:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L63
            r0 = r9
            r1 = r11
            int r0 = r0.startPc(r1)
            r12 = r0
            r0 = r9
            r1 = r11
            int r0 = r0.codeLength(r1)
            r13 = r0
            r0 = r12
            r1 = r8
            if (r0 > r1) goto L5d
            r0 = r8
            r1 = r12
            r2 = r13
            int r1 = r1 + r2
            if (r0 >= r1) goto L5d
            r0 = r6
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r9
            r2 = r11
            java.lang.String r1 = r1.descriptor(r2)
            r2 = r9
            r3 = r11
            java.lang.String r2 = r2.variableName(r3)
            r3 = r9
            r4 = r11
            int r3 = r3.index(r4)
            r4 = r6
            javassist.compiler.SymbolTable r4 = r4.stable
            r0.recordVariable(r1, r2, r3, r4)
        L5d:
            int r11 = r11 + 1
            goto L1a
        L63:
            r0 = 1
            return r0
    }

    public boolean recordParamNames(javassist.bytecode.CodeAttribute r7, int r8) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            java.lang.String r1 = "LocalVariableTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.LocalVariableAttribute r0 = (javassist.bytecode.LocalVariableAttribute) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L11:
            r0 = r9
            int r0 = r0.tableLength()
            r10 = r0
            r0 = 0
            r11 = r0
        L1a:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L4e
            r0 = r9
            r1 = r11
            int r0 = r0.index(r1)
            r12 = r0
            r0 = r12
            r1 = r8
            if (r0 >= r1) goto L48
            r0 = r6
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r9
            r2 = r11
            java.lang.String r1 = r1.descriptor(r2)
            r2 = r9
            r3 = r11
            java.lang.String r2 = r2.variableName(r3)
            r3 = r12
            r4 = r6
            javassist.compiler.SymbolTable r4 = r4.stable
            r0.recordVariable(r1, r2, r3, r4)
        L48:
            int r11 = r11 + 1
            goto L1a
        L4e:
            r0 = 1
            return r0
    }

    public int recordParams(javassist.CtClass[] r9, boolean r10) throws javassist.compiler.CompileError {
            r8 = this;
            r0 = r8
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r9
            r2 = r10
            java.lang.String r3 = "$"
            java.lang.String r4 = "$args"
            java.lang.String r5 = "$$"
            r6 = r8
            javassist.compiler.SymbolTable r6 = r6.stable
            int r0 = r0.recordParams(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public int recordParams(java.lang.String r12, javassist.CtClass[] r13, boolean r14, int r15, boolean r16) throws javassist.compiler.CompileError {
            r11 = this;
            r0 = r11
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r13
            r2 = r16
            java.lang.String r3 = "$"
            java.lang.String r4 = "$args"
            java.lang.String r5 = "$$"
            r6 = r14
            r7 = r15
            r8 = r12
            r9 = r11
            javassist.compiler.SymbolTable r9 = r9.stable
            int r0 = r0.recordParams(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public void setMaxLocals(int r4) {
            r3 = this;
            r0 = r3
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r4
            r0.setMaxLocals(r1)
            return
    }

    public int recordReturnType(javassist.CtClass r7, boolean r8) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r7
            r0.recordType(r1)
            r0 = r6
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r7
            java.lang.String r2 = "$r"
            r3 = r8
            if (r3 == 0) goto L1a
            java.lang.String r3 = "$_"
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r4 = r6
            javassist.compiler.SymbolTable r4 = r4.stable
            int r0 = r0.recordReturnType(r1, r2, r3, r4)
            return r0
    }

    public void recordType(javassist.CtClass r4) {
            r3 = this;
            r0 = r3
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r4
            r0.recordType(r1)
            return
    }

    public int recordVariable(javassist.CtClass r6, java.lang.String r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r6
            r2 = r7
            r3 = r5
            javassist.compiler.SymbolTable r3 = r3.stable
            int r0 = r0.recordVariable(r1, r2, r3)
            return r0
    }

    public void recordProceed(java.lang.String r7, java.lang.String r8) throws javassist.compiler.CompileError {
            r6 = this;
            javassist.compiler.Parser r0 = new javassist.compiler.Parser
            r1 = r0
            javassist.compiler.Lex r2 = new javassist.compiler.Lex
            r3 = r2
            r4 = r7
            r3.<init>(r4)
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            r1 = r6
            javassist.compiler.SymbolTable r1 = r1.stable
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r10 = r0
            r0 = r8
            r11 = r0
            javassist.compiler.Javac$1 r0 = new javassist.compiler.Javac$1
            r1 = r0
            r2 = r6
            r3 = r11
            r4 = r10
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r6
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r12
            java.lang.String r2 = "$proceed"
            r0.setProceedHandler(r1, r2)
            return
    }

    public void recordStaticProceed(java.lang.String r7, java.lang.String r8) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            r9 = r0
            r0 = r8
            r10 = r0
            javassist.compiler.Javac$2 r0 = new javassist.compiler.Javac$2
            r1 = r0
            r2 = r6
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r6
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r11
            java.lang.String r2 = "$proceed"
            r0.setProceedHandler(r1, r2)
            return
    }

    public void recordSpecialProceed(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14) throws javassist.compiler.CompileError {
            r9 = this;
            javassist.compiler.Parser r0 = new javassist.compiler.Parser
            r1 = r0
            javassist.compiler.Lex r2 = new javassist.compiler.Lex
            r3 = r2
            r4 = r10
            r3.<init>(r4)
            r1.<init>(r2)
            r15 = r0
            r0 = r15
            r1 = r9
            javassist.compiler.SymbolTable r1 = r1.stable
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r16 = r0
            javassist.compiler.Javac$3 r0 = new javassist.compiler.Javac$3
            r1 = r0
            r2 = r9
            r3 = r16
            r4 = r14
            r5 = r13
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r17 = r0
            r0 = r9
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r17
            java.lang.String r2 = "$proceed"
            r0.setProceedHandler(r1, r2)
            return
    }

    public void recordProceed(javassist.compiler.ProceedHandler r5) {
            r4 = this;
            r0 = r4
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r5
            java.lang.String r2 = "$proceed"
            r0.setProceedHandler(r1, r2)
            return
    }

    public void compileStmnt(java.lang.String r7) throws javassist.compiler.CompileError {
            r6 = this;
            javassist.compiler.Parser r0 = new javassist.compiler.Parser
            r1 = r0
            javassist.compiler.Lex r2 = new javassist.compiler.Lex
            r3 = r2
            r4 = r7
            r3.<init>(r4)
            r1.<init>(r2)
            r8 = r0
            javassist.compiler.SymbolTable r0 = new javassist.compiler.SymbolTable
            r1 = r0
            r2 = r6
            javassist.compiler.SymbolTable r2 = r2.stable
            r1.<init>(r2)
            r9 = r0
        L1c:
            r0 = r8
            boolean r0 = r0.hasMore()
            if (r0 == 0) goto L3b
            r0 = r8
            r1 = r9
            javassist.compiler.ast.Stmnt r0 = r0.parseStatement(r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L38
            r0 = r10
            r1 = r6
            javassist.compiler.JvstCodeGen r1 = r1.gen
            r0.accept(r1)
        L38:
            goto L1c
        L3b:
            return
    }

    public void compileExpr(java.lang.String r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            javassist.compiler.SymbolTable r1 = r1.stable
            javassist.compiler.ast.ASTree r0 = parseExpr(r0, r1)
            r5 = r0
            r0 = r3
            r1 = r5
            r0.compileExpr(r1)
            return
    }

    public static javassist.compiler.ast.ASTree parseExpr(java.lang.String r6, javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            javassist.compiler.Parser r0 = new javassist.compiler.Parser
            r1 = r0
            javassist.compiler.Lex r2 = new javassist.compiler.Lex
            r3 = r2
            r4 = r6
            r3.<init>(r4)
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            return r0
    }

    public void compileExpr(javassist.compiler.ast.ASTree r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto Lc
            r0 = r3
            javassist.compiler.JvstCodeGen r0 = r0.gen
            r1 = r4
            r0.compileExpr(r1)
        Lc:
            return
    }
}
