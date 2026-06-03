package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/FieldDecl.class */
public class FieldDecl extends javassist.compiler.ast.ASTList {
    private static final long serialVersionUID = 1;

    public FieldDecl(javassist.compiler.ast.ASTree r5, javassist.compiler.ast.ASTList r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public javassist.compiler.ast.ASTList getModifiers() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            javassist.compiler.ast.ASTList r0 = (javassist.compiler.ast.ASTList) r0
            return r0
    }

    public javassist.compiler.ast.Declarator getDeclarator() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Declarator r0 = (javassist.compiler.ast.Declarator) r0
            return r0
    }

    public javassist.compiler.ast.ASTree getInit() {
            r3 = this;
            r0 = r3
            r1 = 2
            javassist.compiler.ast.ASTList r0 = r0.sublist(r1)
            javassist.compiler.ast.ASTree r0 = r0.head()
            return r0
    }

    @Override // javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atFieldDecl(r1)
            return
    }
}
