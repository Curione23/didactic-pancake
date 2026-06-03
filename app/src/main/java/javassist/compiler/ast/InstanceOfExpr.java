package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/InstanceOfExpr.class */
public class InstanceOfExpr extends javassist.compiler.ast.CastExpr {
    private static final long serialVersionUID = 1;

    public InstanceOfExpr(javassist.compiler.ast.ASTList r6, int r7, javassist.compiler.ast.ASTree r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public InstanceOfExpr(int r6, int r7, javassist.compiler.ast.ASTree r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // javassist.compiler.ast.CastExpr, javassist.compiler.ast.ASTree
    public java.lang.String getTag() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "instanceof:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.castType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.arrayDim
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.compiler.ast.CastExpr, javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atInstanceOfExpr(r1)
            return
    }
}
