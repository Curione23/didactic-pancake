package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/CallExpr.class */
public class CallExpr extends javassist.compiler.ast.Expr {
    private static final long serialVersionUID = 1;
    private javassist.compiler.MemberResolver.Method method;

    private CallExpr(javassist.compiler.ast.ASTree r6, javassist.compiler.ast.ASTList r7) {
            r5 = this;
            r0 = r5
            r1 = 67
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3)
            r0 = r5
            r1 = 0
            r0.method = r1
            return
    }

    public void setMethod(javassist.compiler.MemberResolver.Method r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.method = r1
            return
    }

    public javassist.compiler.MemberResolver.Method getMethod() {
            r2 = this;
            r0 = r2
            javassist.compiler.MemberResolver$Method r0 = r0.method
            return r0
    }

    public static javassist.compiler.ast.CallExpr makeCall(javassist.compiler.ast.ASTree r7, javassist.compiler.ast.ASTree r8) {
            javassist.compiler.ast.CallExpr r0 = new javassist.compiler.ast.CallExpr
            r1 = r0
            r2 = r7
            javassist.compiler.ast.ASTList r3 = new javassist.compiler.ast.ASTList
            r4 = r3
            r5 = r8
            r4.<init>(r5)
            r1.<init>(r2, r3)
            return r0
    }

    @Override // javassist.compiler.ast.Expr, javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atCallExpr(r1)
            return
    }
}
