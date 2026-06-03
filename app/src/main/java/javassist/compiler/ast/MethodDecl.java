package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/MethodDecl.class */
public class MethodDecl extends javassist.compiler.ast.ASTList {
    private static final long serialVersionUID = 1;
    public static final java.lang.String initName = "<init>";

    public MethodDecl(javassist.compiler.ast.ASTree r5, javassist.compiler.ast.ASTList r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public boolean isConstructor() {
            r3 = this;
            r0 = r3
            javassist.compiler.ast.Declarator r0 = r0.getReturn()
            javassist.compiler.ast.Symbol r0 = r0.getVariable()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1c
            java.lang.String r0 = "<init>"
            r1 = r4
            java.lang.String r1 = r1.get()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    public javassist.compiler.ast.ASTList getModifiers() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            javassist.compiler.ast.ASTList r0 = (javassist.compiler.ast.ASTList) r0
            return r0
    }

    public javassist.compiler.ast.Declarator getReturn() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Declarator r0 = (javassist.compiler.ast.Declarator) r0
            return r0
    }

    public javassist.compiler.ast.ASTList getParams() {
            r3 = this;
            r0 = r3
            r1 = 2
            javassist.compiler.ast.ASTList r0 = r0.sublist(r1)
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.ASTList r0 = (javassist.compiler.ast.ASTList) r0
            return r0
    }

    public javassist.compiler.ast.ASTList getThrows() {
            r3 = this;
            r0 = r3
            r1 = 3
            javassist.compiler.ast.ASTList r0 = r0.sublist(r1)
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.ASTList r0 = (javassist.compiler.ast.ASTList) r0
            return r0
    }

    public javassist.compiler.ast.Stmnt getBody() {
            r3 = this;
            r0 = r3
            r1 = 4
            javassist.compiler.ast.ASTList r0 = r0.sublist(r1)
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Stmnt r0 = (javassist.compiler.ast.Stmnt) r0
            return r0
    }

    @Override // javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atMethodDecl(r1)
            return
    }
}
