package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/Parser.class */
public final class Parser implements javassist.compiler.TokenId {
    private javassist.compiler.Lex lex;
    private static final int[] binaryOpPrecedence = null;

    public Parser(javassist.compiler.Lex r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.lex = r1
            return
    }

    public boolean hasMore() {
            r2 = this;
            r0 = r2
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            if (r0 < 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public javassist.compiler.ast.ASTList parseMember(javassist.compiler.SymbolTable r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            javassist.compiler.ast.ASTList r0 = r0.parseMember1(r1)
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.MethodDecl
            if (r0 == 0) goto L17
            r0 = r4
            r1 = r5
            r2 = r6
            javassist.compiler.ast.MethodDecl r2 = (javassist.compiler.ast.MethodDecl) r2
            javassist.compiler.ast.MethodDecl r0 = r0.parseMethod2(r1, r2)
            return r0
        L17:
            r0 = r6
            return r0
    }

    public javassist.compiler.ast.ASTList parseMember1(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.parseMemberMods()
            r8 = r0
            r0 = 0
            r10 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L34
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            r1 = 1
            int r0 = r0.lookAhead(r1)
            r1 = 40
            if (r0 != r1) goto L34
            javassist.compiler.ast.Declarator r0 = new javassist.compiler.ast.Declarator
            r1 = r0
            r2 = 344(0x158, float:4.82E-43)
            r3 = 0
            r1.<init>(r2, r3)
            r9 = r0
            r0 = 1
            r10 = r0
            goto L3a
        L34:
            r0 = r6
            r1 = r7
            javassist.compiler.ast.Declarator r0 = r0.parseFormalType(r1)
            r9 = r0
        L3a:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 400(0x190, float:5.6E-43)
            if (r0 == r1) goto L53
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L53:
            r0 = r10
            if (r0 == 0) goto L5f
            java.lang.String r0 = "<init>"
            r11 = r0
            goto L68
        L5f:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            java.lang.String r0 = r0.getString()
            r11 = r0
        L68:
            r0 = r9
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r11
            r2.<init>(r3)
            r0.setVariable(r1)
            r0 = r10
            if (r0 != 0) goto L86
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 40
            if (r0 != r1) goto L90
        L86:
            r0 = r6
            r1 = r7
            r2 = r10
            r3 = r8
            r4 = r9
            javassist.compiler.ast.MethodDecl r0 = r0.parseMethod1(r1, r2, r3, r4)
            return r0
        L90:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            javassist.compiler.ast.FieldDecl r0 = r0.parseField(r1, r2, r3)
            return r0
    }

    private javassist.compiler.ast.FieldDecl parseField(javassist.compiler.SymbolTable r11, javassist.compiler.ast.ASTList r12, javassist.compiler.ast.Declarator r13) throws javassist.compiler.CompileError {
            r10 = this;
            r0 = 0
            r14 = r0
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 61
            if (r0 != r1) goto L1e
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r10
            r1 = r11
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r14 = r0
        L1e:
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r15 = r0
            r0 = r15
            r1 = 59
            if (r0 != r1) goto L48
            javassist.compiler.ast.FieldDecl r0 = new javassist.compiler.ast.FieldDecl
            r1 = r0
            r2 = r12
            javassist.compiler.ast.ASTList r3 = new javassist.compiler.ast.ASTList
            r4 = r3
            r5 = r13
            javassist.compiler.ast.ASTList r6 = new javassist.compiler.ast.ASTList
            r7 = r6
            r8 = r14
            r7.<init>(r8)
            r4.<init>(r5, r6)
            r1.<init>(r2, r3)
            return r0
        L48:
            r0 = r15
            r1 = 44
            if (r0 != r1) goto L5d
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "only one field can be declared in one declaration"
            r3 = r10
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L5d:
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r10
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
    }

    private javassist.compiler.ast.MethodDecl parseMethod1(javassist.compiler.SymbolTable r11, boolean r12, javassist.compiler.ast.ASTList r13, javassist.compiler.ast.Declarator r14) throws javassist.compiler.CompileError {
            r10 = this;
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 40
            if (r0 == r1) goto L18
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r10
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L18:
            r0 = 0
            r15 = r0
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 41
            if (r0 == r1) goto L5b
        L27:
            r0 = r15
            r1 = r10
            r2 = r11
            javassist.compiler.ast.Declarator r1 = r1.parseFormalParam(r2)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.append(r0, r1)
            r15 = r0
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r16 = r0
            r0 = r16
            r1 = 44
            if (r0 != r1) goto L4e
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            goto L58
        L4e:
            r0 = r16
            r1 = 41
            if (r0 != r1) goto L58
            goto L5b
        L58:
            goto L27
        L5b:
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r14
            r1 = r10
            int r1 = r1.parseArrayDimension()
            r0.addArrayDim(r1)
            r0 = r12
            if (r0 == 0) goto L84
            r0 = r14
            int r0 = r0.getArrayDim()
            if (r0 <= 0) goto L84
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r10
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L84:
            r0 = 0
            r16 = r0
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 341(0x155, float:4.78E-43)
            if (r0 != r1) goto Lbf
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
        L9c:
            r0 = r16
            r1 = r10
            r2 = r11
            javassist.compiler.ast.ASTList r1 = r1.parseClassType(r2)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.append(r0, r1)
            r16 = r0
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 44
            if (r0 != r1) goto Lbf
            r0 = r10
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            goto L9c
        Lbf:
            javassist.compiler.ast.MethodDecl r0 = new javassist.compiler.ast.MethodDecl
            r1 = r0
            r2 = r13
            javassist.compiler.ast.ASTList r3 = new javassist.compiler.ast.ASTList
            r4 = r3
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = 0
            javassist.compiler.ast.ASTList r6 = javassist.compiler.ast.ASTList.make(r6, r7, r8)
            r4.<init>(r5, r6)
            r1.<init>(r2, r3)
            return r0
    }

    public javassist.compiler.ast.MethodDecl parseMethod2(javassist.compiler.SymbolTable r5, javassist.compiler.ast.MethodDecl r6) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = 0
            r7 = r0
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 59
            if (r0 != r1) goto L19
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            goto L2d
        L19:
            r0 = r4
            r1 = r5
            javassist.compiler.ast.Stmnt r0 = r0.parseBlock(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L2d
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = 66
            r1.<init>(r2)
            r7 = r0
        L2d:
            r0 = r6
            r1 = 4
            javassist.compiler.ast.ASTList r0 = r0.sublist(r1)
            r1 = r7
            r0.setHead(r1)
            r0 = r6
            return r0
    }

    private javassist.compiler.ast.ASTList parseMemberMods() {
            r6 = this;
            r0 = 0
            r8 = r0
        L2:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r7 = r0
            r0 = r7
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 == r1) goto L50
            r0 = r7
            r1 = 315(0x13b, float:4.41E-43)
            if (r0 == r1) goto L50
            r0 = r7
            r1 = 332(0x14c, float:4.65E-43)
            if (r0 == r1) goto L50
            r0 = r7
            r1 = 331(0x14b, float:4.64E-43)
            if (r0 == r1) goto L50
            r0 = r7
            r1 = 330(0x14a, float:4.62E-43)
            if (r0 == r1) goto L50
            r0 = r7
            r1 = 338(0x152, float:4.74E-43)
            if (r0 == r1) goto L50
            r0 = r7
            r1 = 335(0x14f, float:4.7E-43)
            if (r0 == r1) goto L50
            r0 = r7
            r1 = 345(0x159, float:4.83E-43)
            if (r0 == r1) goto L50
            r0 = r7
            r1 = 342(0x156, float:4.79E-43)
            if (r0 == r1) goto L50
            r0 = r7
            r1 = 347(0x15b, float:4.86E-43)
            if (r0 != r1) goto L6a
        L50:
            javassist.compiler.ast.ASTList r0 = new javassist.compiler.ast.ASTList
            r1 = r0
            javassist.compiler.ast.Keyword r2 = new javassist.compiler.ast.Keyword
            r3 = r2
            r4 = r6
            javassist.compiler.Lex r4 = r4.lex
            int r4 = r4.get()
            r3.<init>(r4)
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
            goto L2
        L6a:
            r0 = r8
            return r0
    }

    private javassist.compiler.ast.Declarator parseFormalType(javassist.compiler.SymbolTable r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r7 = r0
            r0 = r7
            boolean r0 = isBuiltinType(r0)
            if (r0 != 0) goto L16
            r0 = r7
            r1 = 344(0x158, float:4.82E-43)
            if (r0 != r1) goto L2d
        L16:
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r5
            int r0 = r0.parseArrayDimension()
            r8 = r0
            javassist.compiler.ast.Declarator r0 = new javassist.compiler.ast.Declarator
            r1 = r0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L2d:
            r0 = r5
            r1 = r6
            javassist.compiler.ast.ASTList r0 = r0.parseClassType(r1)
            r8 = r0
            r0 = r5
            int r0 = r0.parseArrayDimension()
            r9 = r0
            javassist.compiler.ast.Declarator r0 = new javassist.compiler.ast.Declarator
            r1 = r0
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    private static boolean isBuiltinType(int r3) {
            r0 = r3
            r1 = 301(0x12d, float:4.22E-43)
            if (r0 == r1) goto L38
            r0 = r3
            r1 = 303(0x12f, float:4.25E-43)
            if (r0 == r1) goto L38
            r0 = r3
            r1 = 306(0x132, float:4.29E-43)
            if (r0 == r1) goto L38
            r0 = r3
            r1 = 334(0x14e, float:4.68E-43)
            if (r0 == r1) goto L38
            r0 = r3
            r1 = 324(0x144, float:4.54E-43)
            if (r0 == r1) goto L38
            r0 = r3
            r1 = 326(0x146, float:4.57E-43)
            if (r0 == r1) goto L38
            r0 = r3
            r1 = 317(0x13d, float:4.44E-43)
            if (r0 == r1) goto L38
            r0 = r3
            r1 = 312(0x138, float:4.37E-43)
            if (r0 != r1) goto L3c
        L38:
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            return r0
    }

    private javassist.compiler.ast.Declarator parseFormalParam(javassist.compiler.SymbolTable r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Declarator r0 = r0.parseFormalType(r1)
            r7 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 400(0x190, float:5.6E-43)
            if (r0 == r1) goto L1f
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r5
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L1f:
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            java.lang.String r0 = r0.getString()
            r8 = r0
            r0 = r7
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.setVariable(r1)
            r0 = r7
            r1 = r5
            int r1 = r1.parseArrayDimension()
            r0.addArrayDim(r1)
            r0 = r6
            r1 = r8
            r2 = r7
            r0.append(r1, r2)
            r0 = r7
            return r0
    }

    public javassist.compiler.ast.Stmnt parseStatement(javassist.compiler.SymbolTable r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r7 = r0
            r0 = r7
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L14
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseBlock(r1)
            return r0
        L14:
            r0 = r7
            r1 = 59
            if (r0 != r1) goto L2c
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = 66
            r1.<init>(r2)
            return r0
        L2c:
            r0 = r7
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L6b
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            r1 = 1
            int r0 = r0.lookAhead(r1)
            r1 = 58
            if (r0 != r1) goto L6b
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            java.lang.String r0 = r0.getString()
            r8 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = 76
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r2 = r5
            r3 = r6
            javassist.compiler.ast.Stmnt r2 = r2.parseStatement(r3)
            javassist.compiler.ast.Stmnt r0 = javassist.compiler.ast.Stmnt.make(r0, r1, r2)
            return r0
        L6b:
            r0 = r7
            r1 = 320(0x140, float:4.48E-43)
            if (r0 != r1) goto L78
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseIf(r1)
            return r0
        L78:
            r0 = r7
            r1 = 346(0x15a, float:4.85E-43)
            if (r0 != r1) goto L85
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseWhile(r1)
            return r0
        L85:
            r0 = r7
            r1 = 311(0x137, float:4.36E-43)
            if (r0 != r1) goto L92
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseDo(r1)
            return r0
        L92:
            r0 = r7
            r1 = 318(0x13e, float:4.46E-43)
            if (r0 != r1) goto L9f
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseFor(r1)
            return r0
        L9f:
            r0 = r7
            r1 = 343(0x157, float:4.8E-43)
            if (r0 != r1) goto Lac
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseTry(r1)
            return r0
        Lac:
            r0 = r7
            r1 = 337(0x151, float:4.72E-43)
            if (r0 != r1) goto Lb9
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseSwitch(r1)
            return r0
        Lb9:
            r0 = r7
            r1 = 338(0x152, float:4.74E-43)
            if (r0 != r1) goto Lc6
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseSynchronized(r1)
            return r0
        Lc6:
            r0 = r7
            r1 = 333(0x14d, float:4.67E-43)
            if (r0 != r1) goto Ld3
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseReturn(r1)
            return r0
        Ld3:
            r0 = r7
            r1 = 340(0x154, float:4.76E-43)
            if (r0 != r1) goto Le0
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseThrow(r1)
            return r0
        Le0:
            r0 = r7
            r1 = 302(0x12e, float:4.23E-43)
            if (r0 != r1) goto Led
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseBreak(r1)
            return r0
        Led:
            r0 = r7
            r1 = 309(0x135, float:4.33E-43)
            if (r0 != r1) goto Lfa
            r0 = r5
            r1 = r6
            javassist.compiler.ast.Stmnt r0 = r0.parseContinue(r1)
            return r0
        Lfa:
            r0 = r5
            r1 = r6
            r2 = 0
            javassist.compiler.ast.Stmnt r0 = r0.parseDeclarationOrExpression(r1, r2)
            return r0
    }

    private javassist.compiler.ast.Stmnt parseBlock(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L18
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L18:
            r0 = 0
            r8 = r0
            javassist.compiler.SymbolTable r0 = new javassist.compiler.SymbolTable
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r9 = r0
        L23:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 == r1) goto L51
            r0 = r6
            r1 = r9
            javassist.compiler.ast.Stmnt r0 = r0.parseStatement(r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L4e
            r0 = r8
            javassist.compiler.ast.Stmnt r1 = new javassist.compiler.ast.Stmnt
            r2 = r1
            r3 = 66
            r4 = r10
            r2.<init>(r3, r4)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.concat(r0, r1)
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r8 = r0
        L4e:
            goto L23
        L51:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r8
            if (r0 != 0) goto L67
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = 66
            r1.<init>(r2)
            return r0
        L67:
            r0 = r8
            return r0
    }

    private javassist.compiler.ast.Stmnt parseIf(javassist.compiler.SymbolTable r12) throws javassist.compiler.CompileError {
            r11 = this;
            r0 = r11
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r13 = r0
            r0 = r11
            r1 = r12
            javassist.compiler.ast.ASTree r0 = r0.parseParExpression(r1)
            r14 = r0
            r0 = r11
            r1 = r12
            javassist.compiler.ast.Stmnt r0 = r0.parseStatement(r1)
            r15 = r0
            r0 = r11
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 313(0x139, float:4.39E-43)
            if (r0 != r1) goto L34
            r0 = r11
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r11
            r1 = r12
            javassist.compiler.ast.Stmnt r0 = r0.parseStatement(r1)
            r16 = r0
            goto L37
        L34:
            r0 = 0
            r16 = r0
        L37:
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r13
            r3 = r14
            javassist.compiler.ast.ASTList r4 = new javassist.compiler.ast.ASTList
            r5 = r4
            r6 = r15
            javassist.compiler.ast.ASTList r7 = new javassist.compiler.ast.ASTList
            r8 = r7
            r9 = r16
            r8.<init>(r9)
            r5.<init>(r6, r7)
            r1.<init>(r2, r3, r4)
            return r0
    }

    private javassist.compiler.ast.Stmnt parseWhile(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r8 = r0
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parseParExpression(r1)
            r9 = r0
            r0 = r6
            r1 = r7
            javassist.compiler.ast.Stmnt r0 = r0.parseStatement(r1)
            r10 = r0
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4)
            return r0
    }

    private javassist.compiler.ast.Stmnt parseDo(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r8 = r0
            r0 = r6
            r1 = r7
            javassist.compiler.ast.Stmnt r0 = r0.parseStatement(r1)
            r9 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 346(0x15a, float:4.85E-43)
            if (r0 != r1) goto L27
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 40
            if (r0 == r1) goto L33
        L27:
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r10 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 41
            if (r0 != r1) goto L52
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 59
            if (r0 == r1) goto L5e
        L52:
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L5e:
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r8
            r3 = r10
            r4 = r9
            r1.<init>(r2, r3, r4)
            return r0
    }

    private javassist.compiler.ast.Stmnt parseFor(javassist.compiler.SymbolTable r13) throws javassist.compiler.CompileError {
            r12 = this;
            r0 = r12
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r17 = r0
            javassist.compiler.SymbolTable r0 = new javassist.compiler.SymbolTable
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            r18 = r0
            r0 = r12
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 40
            if (r0 == r1) goto L2b
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r12
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L2b:
            r0 = r12
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 59
            if (r0 != r1) goto L44
            r0 = r12
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = 0
            r14 = r0
            goto L4c
        L44:
            r0 = r12
            r1 = r18
            r2 = 1
            javassist.compiler.ast.Stmnt r0 = r0.parseDeclarationOrExpression(r1, r2)
            r14 = r0
        L4c:
            r0 = r12
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 59
            if (r0 != r1) goto L5e
            r0 = 0
            r16 = r0
            goto L66
        L5e:
            r0 = r12
            r1 = r18
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r16 = r0
        L66:
            r0 = r12
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 59
            if (r0 == r1) goto L80
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "; is missing"
            r3 = r12
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L80:
            r0 = r12
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 41
            if (r0 != r1) goto L91
            r0 = 0
            r15 = r0
            goto L98
        L91:
            r0 = r12
            r1 = r18
            javassist.compiler.ast.Stmnt r0 = r0.parseExprList(r1)
            r15 = r0
        L98:
            r0 = r12
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 41
            if (r0 == r1) goto Lb2
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = ") is missing"
            r3 = r12
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        Lb2:
            r0 = r12
            r1 = r18
            javassist.compiler.ast.Stmnt r0 = r0.parseStatement(r1)
            r19 = r0
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r17
            r3 = r14
            javassist.compiler.ast.ASTList r4 = new javassist.compiler.ast.ASTList
            r5 = r4
            r6 = r16
            javassist.compiler.ast.ASTList r7 = new javassist.compiler.ast.ASTList
            r8 = r7
            r9 = r15
            r10 = r19
            r8.<init>(r9, r10)
            r5.<init>(r6, r7)
            r1.<init>(r2, r3, r4)
            return r0
    }

    private javassist.compiler.ast.Stmnt parseSwitch(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r8 = r0
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parseParExpression(r1)
            r9 = r0
            r0 = r6
            r1 = r7
            javassist.compiler.ast.Stmnt r0 = r0.parseSwitchBlock(r1)
            r10 = r0
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4)
            return r0
    }

    private javassist.compiler.ast.Stmnt parseSwitchBlock(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L18
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L18:
            javassist.compiler.SymbolTable r0 = new javassist.compiler.SymbolTable
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r8 = r0
            r0 = r6
            r1 = r8
            javassist.compiler.ast.Stmnt r0 = r0.parseStmntOrCase(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L39
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "empty switch block"
            r3 = r6
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L39:
            r0 = r9
            int r0 = r0.getOperator()
            r10 = r0
            r0 = r10
            r1 = 304(0x130, float:4.26E-43)
            if (r0 == r1) goto L5d
            r0 = r10
            r1 = 310(0x136, float:4.34E-43)
            if (r0 == r1) goto L5d
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "no case or default in a switch block"
            r3 = r6
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L5d:
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = 66
            r3 = r9
            r1.<init>(r2, r3)
            r11 = r0
        L69:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 == r1) goto Lc9
            r0 = r6
            r1 = r8
            javassist.compiler.ast.Stmnt r0 = r0.parseStmntOrCase(r1)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto Lc6
            r0 = r12
            int r0 = r0.getOperator()
            r13 = r0
            r0 = r13
            r1 = 304(0x130, float:4.26E-43)
            if (r0 == r1) goto L98
            r0 = r13
            r1 = 310(0x136, float:4.34E-43)
            if (r0 != r1) goto Lb3
        L98:
            r0 = r11
            javassist.compiler.ast.Stmnt r1 = new javassist.compiler.ast.Stmnt
            r2 = r1
            r3 = 66
            r4 = r12
            r2.<init>(r3, r4)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.concat(r0, r1)
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r11 = r0
            r0 = r12
            r9 = r0
            goto Lc6
        Lb3:
            r0 = r9
            javassist.compiler.ast.Stmnt r1 = new javassist.compiler.ast.Stmnt
            r2 = r1
            r3 = 66
            r4 = r12
            r2.<init>(r3, r4)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.concat(r0, r1)
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r9 = r0
        Lc6:
            goto L69
        Lc9:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r11
            return r0
    }

    private javassist.compiler.ast.Stmnt parseStmntOrCase(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r8 = r0
            r0 = r8
            r1 = 304(0x130, float:4.26E-43)
            if (r0 == r1) goto L1c
            r0 = r8
            r1 = 310(0x136, float:4.34E-43)
            if (r0 == r1) goto L1c
            r0 = r6
            r1 = r7
            javassist.compiler.ast.Stmnt r0 = r0.parseStatement(r1)
            return r0
        L1c:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r8
            r1 = 304(0x130, float:4.26E-43)
            if (r0 != r1) goto L3c
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r8
            r3 = r6
            r4 = r7
            javassist.compiler.ast.ASTree r3 = r3.parseExpression(r4)
            r1.<init>(r2, r3)
            r9 = r0
            goto L47
        L3c:
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = 310(0x136, float:4.34E-43)
            r1.<init>(r2)
            r9 = r0
        L47:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 58
            if (r0 == r1) goto L61
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = ": is missing"
            r3 = r6
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L61:
            r0 = r9
            return r0
    }

    private javassist.compiler.ast.Stmnt parseSynchronized(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r8 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 40
            if (r0 == r1) goto L20
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L20:
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r9 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 41
            if (r0 == r1) goto L3e
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L3e:
            r0 = r6
            r1 = r7
            javassist.compiler.ast.Stmnt r0 = r0.parseBlock(r1)
            r10 = r0
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4)
            return r0
    }

    private javassist.compiler.ast.Stmnt parseTry(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r6
            r1 = r7
            javassist.compiler.ast.Stmnt r0 = r0.parseBlock(r1)
            r8 = r0
            r0 = 0
            r9 = r0
        L10:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 305(0x131, float:4.27E-43)
            if (r0 != r1) goto La1
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 40
            if (r0 == r1) goto L3d
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L3d:
            javassist.compiler.SymbolTable r0 = new javassist.compiler.SymbolTable
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r10 = r0
            r0 = r6
            r1 = r10
            javassist.compiler.ast.Declarator r0 = r0.parseFormalParam(r1)
            r11 = r0
            r0 = r11
            int r0 = r0.getArrayDim()
            if (r0 > 0) goto L62
            r0 = r11
            int r0 = r0.getType()
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L6e
        L62:
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L6e:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 41
            if (r0 == r1) goto L86
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L86:
            r0 = r6
            r1 = r10
            javassist.compiler.ast.Stmnt r0 = r0.parseBlock(r1)
            r12 = r0
            r0 = r9
            javassist.compiler.ast.Pair r1 = new javassist.compiler.ast.Pair
            r2 = r1
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.append(r0, r1)
            r9 = r0
            goto L10
        La1:
            r0 = 0
            r10 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 316(0x13c, float:4.43E-43)
            if (r0 != r1) goto Lc0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r6
            r1 = r7
            javassist.compiler.ast.Stmnt r0 = r0.parseBlock(r1)
            r10 = r0
        Lc0:
            r0 = 343(0x157, float:4.8E-43)
            r1 = r8
            r2 = r9
            r3 = r10
            javassist.compiler.ast.Stmnt r0 = javassist.compiler.ast.Stmnt.make(r0, r1, r2, r3)
            return r0
    }

    private javassist.compiler.ast.Stmnt parseReturn(javassist.compiler.SymbolTable r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r7 = r0
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r8 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 59
            if (r0 == r1) goto L26
            r0 = r8
            r1 = r5
            r2 = r6
            javassist.compiler.ast.ASTree r1 = r1.parseExpression(r2)
            r0.setLeft(r1)
        L26:
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 59
            if (r0 == r1) goto L40
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "; is missing"
            r3 = r5
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L40:
            r0 = r8
            return r0
    }

    private javassist.compiler.ast.Stmnt parseThrow(javassist.compiler.SymbolTable r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r7 = r0
            r0 = r5
            r1 = r6
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r8 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 59
            if (r0 == r1) goto L28
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "; is missing"
            r3 = r5
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L28:
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    private javassist.compiler.ast.Stmnt parseBreak(javassist.compiler.SymbolTable r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.compiler.ast.Stmnt r0 = r0.parseContinue(r1)
            return r0
    }

    private javassist.compiler.ast.Stmnt parseContinue(javassist.compiler.SymbolTable r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r7 = r0
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r8 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r9 = r0
            r0 = r9
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L3d
            r0 = r8
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r5
            javassist.compiler.Lex r3 = r3.lex
            java.lang.String r3 = r3.getString()
            r2.<init>(r3)
            r0.setLeft(r1)
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r9 = r0
        L3d:
            r0 = r9
            r1 = 59
            if (r0 == r1) goto L52
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "; is missing"
            r3 = r5
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L52:
            r0 = r8
            return r0
    }

    private javassist.compiler.ast.Stmnt parseDeclarationOrExpression(javassist.compiler.SymbolTable r8, boolean r9) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r10 = r0
        L8:
            r0 = r10
            r1 = 315(0x13b, float:4.41E-43)
            if (r0 != r1) goto L22
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r10 = r0
            goto L8
        L22:
            r0 = r10
            boolean r0 = isBuiltinType(r0)
            if (r0 == 0) goto L47
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r10 = r0
            r0 = r7
            int r0 = r0.parseArrayDimension()
            r11 = r0
            r0 = r7
            r1 = r8
            javassist.compiler.ast.Declarator r2 = new javassist.compiler.ast.Declarator
            r3 = r2
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5)
            javassist.compiler.ast.Stmnt r0 = r0.parseDeclarators(r1, r2)
            return r0
        L47:
            r0 = r10
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L87
            r0 = r7
            r1 = 0
            int r0 = r0.nextIsClassType(r1)
            r11 = r0
            r0 = r11
            if (r0 < 0) goto L87
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            r1 = r11
            int r0 = r0.lookAhead(r1)
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L87
            r0 = r7
            r1 = r8
            javassist.compiler.ast.ASTList r0 = r0.parseClassType(r1)
            r12 = r0
            r0 = r7
            int r0 = r0.parseArrayDimension()
            r13 = r0
            r0 = r7
            r1 = r8
            javassist.compiler.ast.Declarator r2 = new javassist.compiler.ast.Declarator
            r3 = r2
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5)
            javassist.compiler.ast.Stmnt r0 = r0.parseDeclarators(r1, r2)
            return r0
        L87:
            r0 = r9
            if (r0 == 0) goto L95
            r0 = r7
            r1 = r8
            javassist.compiler.ast.Stmnt r0 = r0.parseExprList(r1)
            r11 = r0
            goto La5
        L95:
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = 69
            r3 = r7
            r4 = r8
            javassist.compiler.ast.ASTree r3 = r3.parseExpression(r4)
            r1.<init>(r2, r3)
            r11 = r0
        La5:
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 59
            if (r0 == r1) goto Lbf
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "; is missing"
            r3 = r7
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        Lbf:
            r0 = r11
            return r0
    }

    private javassist.compiler.ast.Stmnt parseExprList(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = 0
            r8 = r0
        L2:
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = 69
            r3 = r6
            r4 = r7
            javassist.compiler.ast.ASTree r3 = r3.parseExpression(r4)
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r8
            javassist.compiler.ast.Stmnt r1 = new javassist.compiler.ast.Stmnt
            r2 = r1
            r3 = 66
            r4 = r9
            r2.<init>(r3, r4)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.concat(r0, r1)
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r8 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 44
            if (r0 != r1) goto L3a
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            goto L3c
        L3a:
            r0 = r8
            return r0
        L3c:
            goto L2
    }

    private javassist.compiler.ast.Stmnt parseDeclarators(javassist.compiler.SymbolTable r9, javassist.compiler.ast.Declarator r10) throws javassist.compiler.CompileError {
            r8 = this;
            r0 = 0
            r11 = r0
        L2:
            r0 = r11
            javassist.compiler.ast.Stmnt r1 = new javassist.compiler.ast.Stmnt
            r2 = r1
            r3 = 68
            r4 = r8
            r5 = r9
            r6 = r10
            javassist.compiler.ast.Declarator r4 = r4.parseDeclarator(r5, r6)
            r2.<init>(r3, r4)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.concat(r0, r1)
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            r11 = r0
            r0 = r8
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r12 = r0
            r0 = r12
            r1 = 59
            if (r0 != r1) goto L2b
            r0 = r11
            return r0
        L2b:
            r0 = r12
            r1 = 44
            if (r0 == r1) goto L40
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "; is missing"
            r3 = r8
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L40:
            goto L2
    }

    private javassist.compiler.ast.Declarator parseDeclarator(javassist.compiler.SymbolTable r6, javassist.compiler.ast.Declarator r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L17
            r0 = r7
            int r0 = r0.getType()
            r1 = 344(0x158, float:4.82E-43)
            if (r0 != r1) goto L23
        L17:
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r5
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L23:
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            java.lang.String r0 = r0.getString()
            r8 = r0
            javassist.compiler.ast.Symbol r0 = new javassist.compiler.ast.Symbol
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r9 = r0
            r0 = r5
            int r0 = r0.parseArrayDimension()
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 61
            if (r0 != r1) goto L59
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r5
            r1 = r6
            javassist.compiler.ast.ASTree r0 = r0.parseInitializer(r1)
            r11 = r0
        L59:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            javassist.compiler.ast.Declarator r0 = r0.make(r1, r2, r3)
            r12 = r0
            r0 = r6
            r1 = r8
            r2 = r12
            r0.append(r1, r2)
            r0 = r12
            return r0
    }

    private javassist.compiler.ast.ASTree parseInitializer(javassist.compiler.SymbolTable r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r3
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L12
            r0 = r3
            r1 = r4
            javassist.compiler.ast.ArrayInit r0 = r0.parseArrayInitializer(r1)
            return r0
        L12:
            r0 = r3
            r1 = r4
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            return r0
    }

    private javassist.compiler.ast.ArrayInit parseArrayInitializer(javassist.compiler.SymbolTable r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != r1) goto L25
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            javassist.compiler.ast.ArrayInit r0 = new javassist.compiler.ast.ArrayInit
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            return r0
        L25:
            r0 = r4
            r1 = r5
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r6 = r0
            javassist.compiler.ast.ArrayInit r0 = new javassist.compiler.ast.ArrayInit
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r7 = r0
        L34:
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 44
            if (r0 != r1) goto L57
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r4
            r1 = r5
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r6 = r0
            r0 = r7
            r1 = r6
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.append(r0, r1)
            goto L34
        L57:
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 == r1) goto L6f
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r4
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L6f:
            r0 = r7
            return r0
    }

    private javassist.compiler.ast.ASTree parseParExpression(javassist.compiler.SymbolTable r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 40
            if (r0 == r1) goto L18
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r4
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L18:
            r0 = r4
            r1 = r5
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r6 = r0
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 41
            if (r0 == r1) goto L36
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r4
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L36:
            r0 = r6
            return r0
    }

    public javassist.compiler.ast.ASTree parseExpression(javassist.compiler.SymbolTable r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            javassist.compiler.ast.ASTree r0 = r0.parseConditionalExpr(r1)
            r6 = r0
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            boolean r0 = isAssignOp(r0)
            if (r0 != 0) goto L15
            r0 = r6
            return r0
        L15:
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r7 = r0
            r0 = r4
            r1 = r5
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r8 = r0
            r0 = r7
            r1 = r6
            r2 = r8
            javassist.compiler.ast.AssignExpr r0 = javassist.compiler.ast.AssignExpr.makeAssign(r0, r1, r2)
            return r0
    }

    private static boolean isAssignOp(int r3) {
            r0 = r3
            r1 = 61
            if (r0 == r1) goto L53
            r0 = r3
            r1 = 351(0x15f, float:4.92E-43)
            if (r0 == r1) goto L53
            r0 = r3
            r1 = 352(0x160, float:4.93E-43)
            if (r0 == r1) goto L53
            r0 = r3
            r1 = 353(0x161, float:4.95E-43)
            if (r0 == r1) goto L53
            r0 = r3
            r1 = 354(0x162, float:4.96E-43)
            if (r0 == r1) goto L53
            r0 = r3
            r1 = 355(0x163, float:4.97E-43)
            if (r0 == r1) goto L53
            r0 = r3
            r1 = 356(0x164, float:4.99E-43)
            if (r0 == r1) goto L53
            r0 = r3
            r1 = 360(0x168, float:5.04E-43)
            if (r0 == r1) goto L53
            r0 = r3
            r1 = 361(0x169, float:5.06E-43)
            if (r0 == r1) goto L53
            r0 = r3
            r1 = 365(0x16d, float:5.11E-43)
            if (r0 == r1) goto L53
            r0 = r3
            r1 = 367(0x16f, float:5.14E-43)
            if (r0 == r1) goto L53
            r0 = r3
            r1 = 371(0x173, float:5.2E-43)
            if (r0 != r1) goto L57
        L53:
            r0 = 1
            goto L58
        L57:
            r0 = 0
        L58:
            return r0
    }

    private javassist.compiler.ast.ASTree parseConditionalExpr(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parseBinaryExpr(r1)
            r8 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 63
            if (r0 != r1) goto L4d
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r9 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 58
            if (r0 == r1) goto L3a
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = ": is missing"
            r3 = r6
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L3a:
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r10 = r0
            javassist.compiler.ast.CondExpr r0 = new javassist.compiler.ast.CondExpr
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4)
            return r0
        L4d:
            r0 = r8
            return r0
    }

    private javassist.compiler.ast.ASTree parseBinaryExpr(javassist.compiler.SymbolTable r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            r1 = r6
            javassist.compiler.ast.ASTree r0 = r0.parseUnaryExpr(r1)
            r7 = r0
        L6:
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r8 = r0
            r0 = r5
            r1 = r8
            int r0 = r0.getOpPrecedence(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L1c
            r0 = r7
            return r0
        L1c:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r9
            javassist.compiler.ast.ASTree r0 = r0.binaryExpr2(r1, r2, r3)
            r7 = r0
            goto L6
    }

    private javassist.compiler.ast.ASTree parseInstanceOf(javassist.compiler.SymbolTable r7, javassist.compiler.ast.ASTree r8) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r9 = r0
            r0 = r9
            boolean r0 = isBuiltinType(r0)
            if (r0 == 0) goto L29
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r6
            int r0 = r0.parseArrayDimension()
            r10 = r0
            javassist.compiler.ast.InstanceOfExpr r0 = new javassist.compiler.ast.InstanceOfExpr
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
        L29:
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTList r0 = r0.parseClassType(r1)
            r10 = r0
            r0 = r6
            int r0 = r0.parseArrayDimension()
            r11 = r0
            javassist.compiler.ast.InstanceOfExpr r0 = new javassist.compiler.ast.InstanceOfExpr
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    private javassist.compiler.ast.ASTree binaryExpr2(javassist.compiler.SymbolTable r6, javassist.compiler.ast.ASTree r7, int r8) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r9 = r0
            r0 = r9
            r1 = 323(0x143, float:4.53E-43)
            if (r0 != r1) goto L18
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.compiler.ast.ASTree r0 = r0.parseInstanceOf(r1, r2)
            return r0
        L18:
            r0 = r5
            r1 = r6
            javassist.compiler.ast.ASTree r0 = r0.parseUnaryExpr(r1)
            r10 = r0
        L1f:
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r11 = r0
            r0 = r5
            r1 = r11
            int r0 = r0.getOpPrecedence(r1)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L49
            r0 = r8
            r1 = r12
            if (r0 <= r1) goto L49
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r12
            javassist.compiler.ast.ASTree r0 = r0.binaryExpr2(r1, r2, r3)
            r10 = r0
            goto L52
        L49:
            r0 = r9
            r1 = r7
            r2 = r10
            javassist.compiler.ast.BinExpr r0 = javassist.compiler.ast.BinExpr.makeBin(r0, r1, r2)
            return r0
        L52:
            goto L1f
    }

    private int getOpPrecedence(int r5) {
            r4 = this;
            r0 = 33
            r1 = r5
            if (r0 > r1) goto L15
            r0 = r5
            r1 = 63
            if (r0 > r1) goto L15
            int[] r0 = javassist.compiler.Parser.binaryOpPrecedence
            r1 = r5
            r2 = 33
            int r1 = r1 - r2
            r0 = r0[r1]
            return r0
        L15:
            r0 = r5
            r1 = 94
            if (r0 != r1) goto L1e
            r0 = 7
            return r0
        L1e:
            r0 = r5
            r1 = 124(0x7c, float:1.74E-43)
            if (r0 != r1) goto L27
            r0 = 8
            return r0
        L27:
            r0 = r5
            r1 = 369(0x171, float:5.17E-43)
            if (r0 != r1) goto L31
            r0 = 9
            return r0
        L31:
            r0 = r5
            r1 = 368(0x170, float:5.16E-43)
            if (r0 != r1) goto L3b
            r0 = 10
            return r0
        L3b:
            r0 = r5
            r1 = 358(0x166, float:5.02E-43)
            if (r0 == r1) goto L49
            r0 = r5
            r1 = 350(0x15e, float:4.9E-43)
            if (r0 != r1) goto L4b
        L49:
            r0 = 5
            return r0
        L4b:
            r0 = r5
            r1 = 357(0x165, float:5.0E-43)
            if (r0 == r1) goto L60
            r0 = r5
            r1 = 359(0x167, float:5.03E-43)
            if (r0 == r1) goto L60
            r0 = r5
            r1 = 323(0x143, float:4.53E-43)
            if (r0 != r1) goto L62
        L60:
            r0 = 4
            return r0
        L62:
            r0 = r5
            r1 = 364(0x16c, float:5.1E-43)
            if (r0 == r1) goto L77
            r0 = r5
            r1 = 366(0x16e, float:5.13E-43)
            if (r0 == r1) goto L77
            r0 = r5
            r1 = 370(0x172, float:5.18E-43)
            if (r0 != r1) goto L79
        L77:
            r0 = 3
            return r0
        L79:
            r0 = 0
            return r0
    }

    private javassist.compiler.ast.ASTree parseUnaryExpr(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            switch(r0) {
                case 33: goto L48;
                case 40: goto Lbc;
                case 43: goto L48;
                case 45: goto L48;
                case 126: goto L48;
                case 362: goto L48;
                case 363: goto L48;
                default: goto Lc2;
            }
        L48:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r8 = r0
            r0 = r8
            r1 = 45
            if (r0 != r1) goto Lb2
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r9 = r0
            r0 = r9
            switch(r0) {
                case 401: goto L80;
                case 402: goto L80;
                case 403: goto L80;
                case 404: goto L99;
                case 405: goto L99;
                default: goto Lb2;
            }
        L80:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            javassist.compiler.ast.IntConst r0 = new javassist.compiler.ast.IntConst
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            long r2 = r2.getLong()
            long r2 = -r2
            r3 = r9
            r1.<init>(r2, r3)
            return r0
        L99:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            javassist.compiler.ast.DoubleConst r0 = new javassist.compiler.ast.DoubleConst
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            double r2 = r2.getDouble()
            double r2 = -r2
            r3 = r9
            r1.<init>(r2, r3)
            return r0
        Lb2:
            r0 = r8
            r1 = r6
            r2 = r7
            javassist.compiler.ast.ASTree r1 = r1.parseUnaryExpr(r2)
            javassist.compiler.ast.Expr r0 = javassist.compiler.ast.Expr.make(r0, r1)
            return r0
        Lbc:
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parseCast(r1)
            return r0
        Lc2:
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parsePostfix(r1)
            return r0
    }

    private javassist.compiler.ast.ASTree parseCast(javassist.compiler.SymbolTable r8) throws javassist.compiler.CompileError {
            r7 = this;
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            r1 = 1
            int r0 = r0.lookAhead(r1)
            r9 = r0
            r0 = r9
            boolean r0 = isBuiltinType(r0)
            if (r0 == 0) goto L55
            r0 = r7
            boolean r0 = r0.nextIsBuiltinCast()
            if (r0 == 0) goto L55
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r7
            int r0 = r0.parseArrayDimension()
            r10 = r0
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 41
            if (r0 == r1) goto L46
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = ") is missing"
            r3 = r7
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L46:
            javassist.compiler.ast.CastExpr r0 = new javassist.compiler.ast.CastExpr
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r7
            r5 = r8
            javassist.compiler.ast.ASTree r4 = r4.parseUnaryExpr(r5)
            r1.<init>(r2, r3, r4)
            return r0
        L55:
            r0 = r9
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto La1
            r0 = r7
            boolean r0 = r0.nextIsClassCast()
            if (r0 == 0) goto La1
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r7
            r1 = r8
            javassist.compiler.ast.ASTList r0 = r0.parseClassType(r1)
            r10 = r0
            r0 = r7
            int r0 = r0.parseArrayDimension()
            r11 = r0
            r0 = r7
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 41
            if (r0 == r1) goto L91
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = ") is missing"
            r3 = r7
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L91:
            javassist.compiler.ast.CastExpr r0 = new javassist.compiler.ast.CastExpr
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r7
            r5 = r8
            javassist.compiler.ast.ASTree r4 = r4.parseUnaryExpr(r5)
            r1.<init>(r2, r3, r4)
            return r0
        La1:
            r0 = r7
            r1 = r8
            javassist.compiler.ast.ASTree r0 = r0.parsePostfix(r1)
            return r0
    }

    private boolean nextIsBuiltinCast() {
            r4 = this;
            r0 = 2
            r6 = r0
        L2:
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            r1 = r6
            int r6 = r6 + 1
            int r0 = r0.lookAhead(r1)
            r1 = r0
            r5 = r1
            r1 = 91
            if (r0 != r1) goto L26
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            r1 = r6
            int r6 = r6 + 1
            int r0 = r0.lookAhead(r1)
            r1 = 93
            if (r0 == r1) goto L2
            r0 = 0
            return r0
        L26:
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            r1 = r6
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.lookAhead(r1)
            r1 = 41
            if (r0 != r1) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private boolean nextIsClassCast() {
            r4 = this;
            r0 = r4
            r1 = 1
            int r0 = r0.nextIsClassType(r1)
            r5 = r0
            r0 = r5
            if (r0 >= 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            r1 = r5
            int r0 = r0.lookAhead(r1)
            r6 = r0
            r0 = r6
            r1 = 41
            if (r0 == r1) goto L1d
            r0 = 0
            return r0
        L1d:
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.lookAhead(r1)
            r6 = r0
            r0 = r6
            r1 = 40
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 412(0x19c, float:5.77E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 406(0x196, float:5.69E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 400(0x190, float:5.6E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 339(0x153, float:4.75E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 336(0x150, float:4.71E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 328(0x148, float:4.6E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 411(0x19b, float:5.76E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 403(0x193, float:5.65E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 402(0x192, float:5.63E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 401(0x191, float:5.62E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L89
            r0 = r6
            r1 = 404(0x194, float:5.66E-43)
            if (r0 != r1) goto L8d
        L89:
            r0 = 1
            goto L8e
        L8d:
            r0 = 0
        L8e:
            return r0
    }

    private int nextIsClassType(int r4) {
            r3 = this;
        L0:
            r0 = r3
            javassist.compiler.Lex r0 = r0.lex
            int r4 = r4 + 1
            r1 = r4
            int r0 = r0.lookAhead(r1)
            r1 = 46
            if (r0 != r1) goto L23
            r0 = r3
            javassist.compiler.Lex r0 = r0.lex
            int r4 = r4 + 1
            r1 = r4
            int r0 = r0.lookAhead(r1)
            r1 = 400(0x190, float:5.6E-43)
            if (r0 == r1) goto L0
            r0 = -1
            return r0
        L23:
            r0 = r3
            javassist.compiler.Lex r0 = r0.lex
            r1 = r4
            int r4 = r4 + 1
            int r0 = r0.lookAhead(r1)
            r1 = r0
            r5 = r1
            r1 = 91
            if (r0 != r1) goto L47
            r0 = r3
            javassist.compiler.Lex r0 = r0.lex
            r1 = r4
            int r4 = r4 + 1
            int r0 = r0.lookAhead(r1)
            r1 = 93
            if (r0 == r1) goto L23
            r0 = -1
            return r0
        L47:
            r0 = r4
            r1 = 1
            int r0 = r0 - r1
            return r0
    }

    private int parseArrayDimension() throws javassist.compiler.CompileError {
            r5 = this;
            r0 = 0
            r6 = r0
        L2:
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 91
            if (r0 != r1) goto L34
            int r6 = r6 + 1
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 93
            if (r0 == r1) goto L2
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "] is missing"
            r3 = r5
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L34:
            r0 = r6
            return r0
    }

    private javassist.compiler.ast.ASTList parseClassType(javassist.compiler.SymbolTable r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = 0
            r7 = r0
        L2:
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 400(0x190, float:5.6E-43)
            if (r0 == r1) goto L1b
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r5
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L1b:
            r0 = r7
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r5
            javassist.compiler.Lex r3 = r3.lex
            java.lang.String r3 = r3.getString()
            r2.<init>(r3)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.append(r0, r1)
            r7 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 46
            if (r0 != r1) goto L45
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            goto L2
        L45:
            r0 = r7
            return r0
    }

    private javassist.compiler.ast.ASTree parsePostfix(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r8 = r0
            r0 = r8
            switch(r0) {
                case 401: goto L2c;
                case 402: goto L2c;
                case 403: goto L2c;
                case 404: goto L44;
                case 405: goto L44;
                default: goto L5c;
            }
        L2c:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            javassist.compiler.ast.IntConst r0 = new javassist.compiler.ast.IntConst
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            long r2 = r2.getLong()
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L44:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            javassist.compiler.ast.DoubleConst r0 = new javassist.compiler.ast.DoubleConst
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            double r2 = r2.getDouble()
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L5c:
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parsePrimaryExpr(r1)
            r11 = r0
        L63:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            switch(r0) {
                case 35: goto L1b1;
                case 40: goto La4;
                case 46: goto L131;
                case 91: goto Lb0;
                case 362: goto L11b;
                case 363: goto L11b;
                default: goto L200;
            }
        La4:
            r0 = r6
            r1 = r7
            r2 = r11
            javassist.compiler.ast.ASTree r0 = r0.parseMethodCall(r1, r2)
            r11 = r0
            goto L63
        Lb0:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            r1 = 1
            int r0 = r0.lookAhead(r1)
            r1 = 93
            if (r0 != r1) goto Lf5
            r0 = r6
            int r0 = r0.parseArrayDimension()
            r13 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 46
            if (r0 != r1) goto Ldc
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto Le8
        Ldc:
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        Le8:
            r0 = r6
            r1 = r11
            r2 = r13
            javassist.compiler.ast.ASTree r0 = r0.parseDotClass(r1, r2)
            r11 = r0
            goto L63
        Lf5:
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTree r0 = r0.parseArrayIndex(r1)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L10d
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L10d:
            r0 = 65
            r1 = r11
            r2 = r10
            javassist.compiler.ast.Expr r0 = javassist.compiler.ast.Expr.make(r0, r1, r2)
            r11 = r0
            goto L63
        L11b:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r12 = r0
            r0 = r12
            r1 = 0
            r2 = r11
            javassist.compiler.ast.Expr r0 = javassist.compiler.ast.Expr.make(r0, r1, r2)
            r11 = r0
            goto L63
        L131:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r12 = r0
            r0 = r12
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L156
            r0 = r6
            r1 = r11
            r2 = 0
            javassist.compiler.ast.ASTree r0 = r0.parseDotClass(r1, r2)
            r11 = r0
            goto L63
        L156:
            r0 = r12
            r1 = 336(0x150, float:4.71E-43)
            if (r0 != r1) goto L17e
            r0 = 46
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r6
            r4 = r11
            java.lang.String r3 = r3.toClassName(r4)
            r2.<init>(r3)
            javassist.compiler.ast.Keyword r2 = new javassist.compiler.ast.Keyword
            r3 = r2
            r4 = r12
            r3.<init>(r4)
            javassist.compiler.ast.Expr r0 = javassist.compiler.ast.Expr.make(r0, r1, r2)
            r11 = r0
            goto L63
        L17e:
            r0 = r12
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L1a2
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            java.lang.String r0 = r0.getString()
            r9 = r0
            r0 = 46
            r1 = r11
            javassist.compiler.ast.Member r2 = new javassist.compiler.ast.Member
            r3 = r2
            r4 = r9
            r3.<init>(r4)
            javassist.compiler.ast.Expr r0 = javassist.compiler.ast.Expr.make(r0, r1, r2)
            r11 = r0
            goto L63
        L1a2:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "missing member name"
            r3 = r6
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L1b1:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r12 = r0
            r0 = r12
            r1 = 400(0x190, float:5.6E-43)
            if (r0 == r1) goto L1d9
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "missing static member name"
            r3 = r6
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L1d9:
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            java.lang.String r0 = r0.getString()
            r9 = r0
            r0 = 35
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r6
            r4 = r11
            java.lang.String r3 = r3.toClassName(r4)
            r2.<init>(r3)
            javassist.compiler.ast.Member r2 = new javassist.compiler.ast.Member
            r3 = r2
            r4 = r9
            r3.<init>(r4)
            javassist.compiler.ast.Expr r0 = javassist.compiler.ast.Expr.make(r0, r1, r2)
            r11 = r0
            goto L63
        L200:
            r0 = r11
            return r0
    }

    private javassist.compiler.ast.ASTree parseDotClass(javassist.compiler.ast.ASTree r7, int r8) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r6
            r1 = r7
            java.lang.String r0 = r0.toClassName(r1)
            r9 = r0
            r0 = r8
            if (r0 <= 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r10 = r0
        L13:
            r0 = r8
            int r8 = r8 + (-1)
            if (r0 <= 0) goto L25
            r0 = r10
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L13
        L25:
            r0 = r10
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r9 = r0
        L43:
            r0 = 46
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r9
            r2.<init>(r3)
            javassist.compiler.ast.Member r2 = new javassist.compiler.ast.Member
            r3 = r2
            java.lang.String r4 = "class"
            r3.<init>(r4)
            javassist.compiler.ast.Expr r0 = javassist.compiler.ast.Expr.make(r0, r1, r2)
            return r0
    }

    private javassist.compiler.ast.ASTree parseDotClass(int r7, int r8) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r8
            if (r0 <= 0) goto L22
            r0 = r7
            r1 = r8
            java.lang.String r0 = javassist.compiler.CodeGen.toJvmTypeName(r0, r1)
            r9 = r0
            r0 = 46
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r9
            r2.<init>(r3)
            javassist.compiler.ast.Member r2 = new javassist.compiler.ast.Member
            r3 = r2
            java.lang.String r4 = "class"
            r3.<init>(r4)
            javassist.compiler.ast.Expr r0 = javassist.compiler.ast.Expr.make(r0, r1, r2)
            return r0
        L22:
            r0 = r7
            switch(r0) {
                case 301: goto L74;
                case 303: goto L7b;
                case 306: goto L82;
                case 312: goto La5;
                case 317: goto L9e;
                case 324: goto L90;
                case 326: goto L97;
                case 334: goto L89;
                case 344: goto Lac;
                default: goto Lb3;
            }
        L74:
            java.lang.String r0 = "java.lang.Boolean"
            r9 = r0
            goto Lcf
        L7b:
            java.lang.String r0 = "java.lang.Byte"
            r9 = r0
            goto Lcf
        L82:
            java.lang.String r0 = "java.lang.Character"
            r9 = r0
            goto Lcf
        L89:
            java.lang.String r0 = "java.lang.Short"
            r9 = r0
            goto Lcf
        L90:
            java.lang.String r0 = "java.lang.Integer"
            r9 = r0
            goto Lcf
        L97:
            java.lang.String r0 = "java.lang.Long"
            r9 = r0
            goto Lcf
        L9e:
            java.lang.String r0 = "java.lang.Float"
            r9 = r0
            goto Lcf
        La5:
            java.lang.String r0 = "java.lang.Double"
            r9 = r0
            goto Lcf
        Lac:
            java.lang.String r0 = "java.lang.Void"
            r9 = r0
            goto Lcf
        Lb3:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "invalid builtin type: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lcf:
            r0 = 35
            javassist.compiler.ast.Symbol r1 = new javassist.compiler.ast.Symbol
            r2 = r1
            r3 = r9
            r2.<init>(r3)
            javassist.compiler.ast.Member r2 = new javassist.compiler.ast.Member
            r3 = r2
            java.lang.String r4 = "TYPE"
            r3.<init>(r4)
            javassist.compiler.ast.Expr r0 = javassist.compiler.ast.Expr.make(r0, r1, r2)
            return r0
    }

    private javassist.compiler.ast.ASTree parseMethodCall(javassist.compiler.SymbolTable r5, javassist.compiler.ast.ASTree r6) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Keyword
            if (r0 == 0) goto L2c
            r0 = r6
            javassist.compiler.ast.Keyword r0 = (javassist.compiler.ast.Keyword) r0
            int r0 = r0.get()
            r7 = r0
            r0 = r7
            r1 = 339(0x153, float:4.75E-43)
            if (r0 == r1) goto L29
            r0 = r7
            r1 = 336(0x150, float:4.71E-43)
            if (r0 == r1) goto L29
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r4
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L29:
            goto L5d
        L2c:
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Symbol
            if (r0 == 0) goto L36
            goto L5d
        L36:
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L5d
            r0 = r6
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            int r0 = r0.getOperator()
            r7 = r0
            r0 = r7
            r1 = 46
            if (r0 == r1) goto L5d
            r0 = r7
            r1 = 35
            if (r0 == r1) goto L5d
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r4
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
        L5d:
            r0 = r6
            r1 = r4
            r2 = r5
            javassist.compiler.ast.ASTList r1 = r1.parseArgumentList(r2)
            javassist.compiler.ast.CallExpr r0 = javassist.compiler.ast.CallExpr.makeCall(r0, r1)
            return r0
    }

    private java.lang.String toClassName(javassist.compiler.ast.ASTree r5) throws javassist.compiler.CompileError {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r4
            r1 = r5
            r2 = r6
            r0.toClassName(r1, r2)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void toClassName(javassist.compiler.ast.ASTree r6, java.lang.StringBuilder r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Symbol
            if (r0 == 0) goto L14
            r0 = r7
            r1 = r6
            javassist.compiler.ast.Symbol r1 = (javassist.compiler.ast.Symbol) r1
            java.lang.String r1 = r1.get()
            java.lang.StringBuilder r0 = r0.append(r1)
            return
        L14:
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.Expr
            if (r0 == 0) goto L43
            r0 = r6
            javassist.compiler.ast.Expr r0 = (javassist.compiler.ast.Expr) r0
            r8 = r0
            r0 = r8
            int r0 = r0.getOperator()
            r1 = 46
            if (r0 != r1) goto L43
            r0 = r5
            r1 = r8
            javassist.compiler.ast.ASTree r1 = r1.oprand1()
            r2 = r7
            r0.toClassName(r1, r2)
            r0 = r7
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r8
            javassist.compiler.ast.ASTree r1 = r1.oprand2()
            r2 = r7
            r0.toClassName(r1, r2)
            return
        L43:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "bad static member access"
            r3 = r5
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
    }

    private javassist.compiler.ast.ASTree parsePrimaryExpr(javassist.compiler.SymbolTable r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = r0
            r7 = r1
            switch(r0) {
                case 40: goto La2;
                case 328: goto L9c;
                case 336: goto L5c;
                case 339: goto L5c;
                case 400: goto L65;
                case 406: goto L8d;
                case 410: goto L5c;
                case 411: goto L5c;
                case 412: goto L5c;
                default: goto Lc6;
            }
        L5c:
            javassist.compiler.ast.Keyword r0 = new javassist.compiler.ast.Keyword
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            return r0
        L65:
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            java.lang.String r0 = r0.getString()
            r8 = r0
            r0 = r6
            r1 = r8
            javassist.compiler.ast.Declarator r0 = r0.lookup(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L82
            javassist.compiler.ast.Member r0 = new javassist.compiler.ast.Member
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            return r0
        L82:
            javassist.compiler.ast.Variable r0 = new javassist.compiler.ast.Variable
            r1 = r0
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3)
            return r0
        L8d:
            javassist.compiler.ast.StringL r0 = new javassist.compiler.ast.StringL
            r1 = r0
            r2 = r5
            javassist.compiler.Lex r2 = r2.lex
            java.lang.String r2 = r2.getString()
            r1.<init>(r2)
            return r0
        L9c:
            r0 = r5
            r1 = r6
            javassist.compiler.ast.NewExpr r0 = r0.parseNew(r1)
            return r0
        La2:
            r0 = r5
            r1 = r6
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r10 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 41
            if (r0 != r1) goto Lb8
            r0 = r10
            return r0
        Lb8:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = ") is missing"
            r3 = r5
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        Lc6:
            r0 = r7
            boolean r0 = isBuiltinType(r0)
            if (r0 != 0) goto Ld4
            r0 = r7
            r1 = 344(0x158, float:4.82E-43)
            if (r0 != r1) goto Lfb
        Ld4:
            r0 = r5
            int r0 = r0.parseArrayDimension()
            r11 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 46
            if (r0 != r1) goto Lfb
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto Lfb
            r0 = r5
            r1 = r7
            r2 = r11
            javassist.compiler.ast.ASTree r0 = r0.parseDotClass(r1, r2)
            return r0
        Lfb:
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r5
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
    }

    private javassist.compiler.ast.NewExpr parseNew(javassist.compiler.SymbolTable r7) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = 0
            r8 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r9 = r0
            r0 = r9
            boolean r0 = isBuiltinType(r0)
            if (r0 == 0) goto L3e
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTList r0 = r0.parseArraySize(r1)
            r10 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L32
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ArrayInit r0 = r0.parseArrayInitializer(r1)
            r8 = r0
        L32:
            javassist.compiler.ast.NewExpr r0 = new javassist.compiler.ast.NewExpr
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
        L3e:
            r0 = r9
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L95
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTList r0 = r0.parseClassType(r1)
            r10 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r9 = r0
            r0 = r9
            r1 = 40
            if (r0 != r1) goto L6d
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTList r0 = r0.parseArgumentList(r1)
            r11 = r0
            javassist.compiler.ast.NewExpr r0 = new javassist.compiler.ast.NewExpr
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)
            return r0
        L6d:
            r0 = r9
            r1 = 91
            if (r0 != r1) goto L95
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTList r0 = r0.parseArraySize(r1)
            r11 = r0
            r0 = r6
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L8c
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ArrayInit r0 = r0.parseArrayInitializer(r1)
            r8 = r0
        L8c:
            r0 = r10
            r1 = r11
            r2 = r8
            javassist.compiler.ast.NewExpr r0 = javassist.compiler.ast.NewExpr.makeObjectArray(r0, r1, r2)
            return r0
        L95:
            javassist.compiler.SyntaxError r0 = new javassist.compiler.SyntaxError
            r1 = r0
            r2 = r6
            javassist.compiler.Lex r2 = r2.lex
            r1.<init>(r2)
            throw r0
    }

    private javassist.compiler.ast.ASTList parseArraySize(javassist.compiler.SymbolTable r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = 0
            r6 = r0
        L2:
            r0 = r4
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 91
            if (r0 != r1) goto L1b
            r0 = r6
            r1 = r4
            r2 = r5
            javassist.compiler.ast.ASTree r1 = r1.parseArrayIndex(r2)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.append(r0, r1)
            r6 = r0
            goto L2
        L1b:
            r0 = r6
            return r0
    }

    private javassist.compiler.ast.ASTree parseArrayIndex(javassist.compiler.SymbolTable r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 93
            if (r0 != r1) goto L1e
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r0 = 0
            return r0
        L1e:
            r0 = r5
            r1 = r6
            javassist.compiler.ast.ASTree r0 = r0.parseExpression(r1)
            r7 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 93
            if (r0 == r1) goto L3f
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "] is missing"
            r3 = r5
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L3f:
            r0 = r7
            return r0
    }

    private javassist.compiler.ast.ASTList parseArgumentList(javassist.compiler.SymbolTable r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 40
            if (r0 == r1) goto L1b
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "( is missing"
            r3 = r5
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L1b:
            r0 = 0
            r7 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 41
            if (r0 == r1) goto L4a
        L29:
            r0 = r7
            r1 = r5
            r2 = r6
            javassist.compiler.ast.ASTree r1 = r1.parseExpression(r2)
            javassist.compiler.ast.ASTList r0 = javassist.compiler.ast.ASTList.append(r0, r1)
            r7 = r0
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.lookAhead()
            r1 = 44
            if (r0 != r1) goto L4a
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            goto L29
        L4a:
            r0 = r5
            javassist.compiler.Lex r0 = r0.lex
            int r0 = r0.get()
            r1 = 41
            if (r0 == r1) goto L64
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = ") is missing"
            r3 = r5
            javassist.compiler.Lex r3 = r3.lex
            r1.<init>(r2, r3)
            throw r0
        L64:
            r0 = r7
            return r0
    }

    static {
            r0 = 31
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 6
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 4
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 4
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 0
            r1[r2] = r3
            javassist.compiler.Parser.binaryOpPrecedence = r0
            return
    }
}
