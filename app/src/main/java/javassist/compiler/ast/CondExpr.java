package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/CondExpr.class */
public class CondExpr extends javassist.compiler.ast.ASTList {
    private static final long serialVersionUID = 1;

    public CondExpr(javassist.compiler.ast.ASTree r10, javassist.compiler.ast.ASTree r11, javassist.compiler.ast.ASTree r12) {
            r9 = this;
            r0 = r9
            r1 = r10
            javassist.compiler.ast.ASTList r2 = new javassist.compiler.ast.ASTList
            r3 = r2
            r4 = r11
            javassist.compiler.ast.ASTList r5 = new javassist.compiler.ast.ASTList
            r6 = r5
            r7 = r12
            r6.<init>(r7)
            r3.<init>(r4, r5)
            r0.<init>(r1, r2)
            return
    }

    public javassist.compiler.ast.ASTree condExpr() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.head()
            return r0
    }

    public void setCond(javassist.compiler.ast.ASTree r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.setHead(r1)
            return
    }

    public javassist.compiler.ast.ASTree thenExpr() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.ASTree r0 = r0.head()
            return r0
    }

    public void setThen(javassist.compiler.ast.ASTree r4) {
            r3 = this;
            r0 = r3
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r1 = r4
            r0.setHead(r1)
            return
    }

    public javassist.compiler.ast.ASTree elseExpr() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.ASTree r0 = r0.head()
            return r0
    }

    public void setElse(javassist.compiler.ast.ASTree r4) {
            r3 = this;
            r0 = r3
            javassist.compiler.ast.ASTList r0 = r0.tail()
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r1 = r4
            r0.setHead(r1)
            return
    }

    @Override // javassist.compiler.ast.ASTree
    public java.lang.String getTag() {
            r2 = this;
            java.lang.String r0 = "?:"
            return r0
    }

    @Override // javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atCondExpr(r1)
            return
    }
}
