package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/BinExpr.class */
public class BinExpr extends javassist.compiler.ast.Expr {
    private static final long serialVersionUID = 1;

    private BinExpr(int r6, javassist.compiler.ast.ASTree r7, javassist.compiler.ast.ASTList r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public static javassist.compiler.ast.BinExpr makeBin(int r8, javassist.compiler.ast.ASTree r9, javassist.compiler.ast.ASTree r10) {
            javassist.compiler.ast.BinExpr r0 = new javassist.compiler.ast.BinExpr
            r1 = r0
            r2 = r8
            r3 = r9
            javassist.compiler.ast.ASTList r4 = new javassist.compiler.ast.ASTList
            r5 = r4
            r6 = r10
            r5.<init>(r6)
            r1.<init>(r2, r3, r4)
            return r0
    }

    @Override // javassist.compiler.ast.Expr, javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atBinExpr(r1)
            return
    }
}
