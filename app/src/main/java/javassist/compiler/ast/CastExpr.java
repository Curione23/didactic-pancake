package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/CastExpr.class */
public class CastExpr extends javassist.compiler.ast.ASTList implements javassist.compiler.TokenId {
    private static final long serialVersionUID = 1;
    protected int castType;
    protected int arrayDim;

    public CastExpr(javassist.compiler.ast.ASTList r7, int r8, javassist.compiler.ast.ASTree r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTList r2 = new javassist.compiler.ast.ASTList
            r3 = r2
            r4 = r9
            r3.<init>(r4)
            r0.<init>(r1, r2)
            r0 = r6
            r1 = 307(0x133, float:4.3E-43)
            r0.castType = r1
            r0 = r6
            r1 = r8
            r0.arrayDim = r1
            return
    }

    public CastExpr(int r7, int r8, javassist.compiler.ast.ASTree r9) {
            r6 = this;
            r0 = r6
            r1 = 0
            javassist.compiler.ast.ASTList r2 = new javassist.compiler.ast.ASTList
            r3 = r2
            r4 = r9
            r3.<init>(r4)
            r0.<init>(r1, r2)
            r0 = r6
            r1 = r7
            r0.castType = r1
            r0 = r6
            r1 = r8
            r0.arrayDim = r1
            return
    }

    public int getType() {
            r2 = this;
            r0 = r2
            int r0 = r0.castType
            return r0
    }

    public int getArrayDim() {
            r2 = this;
            r0 = r2
            int r0 = r0.arrayDim
            return r0
    }

    public javassist.compiler.ast.ASTList getClassName() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            javassist.compiler.ast.ASTList r0 = (javassist.compiler.ast.ASTList) r0
            return r0
    }

    public javassist.compiler.ast.ASTree getOprand() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            return r0
    }

    public void setOprand(javassist.compiler.ast.ASTree r4) {
            r3 = this;
            r0 = r3
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            r1 = r4
            r0.setLeft(r1)
            return
    }

    @Override // javassist.compiler.ast.ASTree
    public java.lang.String getTag() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "cast:"
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

    @Override // javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atCastExpr(r1)
            return
    }
}
