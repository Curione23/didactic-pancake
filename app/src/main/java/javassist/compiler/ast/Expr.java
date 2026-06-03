package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/Expr.class */
public class Expr extends javassist.compiler.ast.ASTList implements javassist.compiler.TokenId {
    private static final long serialVersionUID = 1;
    protected int operatorId;

    Expr(int r5, javassist.compiler.ast.ASTree r6, javassist.compiler.ast.ASTList r7) {
            r4 = this;
            r0 = r4
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.operatorId = r1
            return
    }

    Expr(int r4, javassist.compiler.ast.ASTree r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.operatorId = r1
            return
    }

    public static javassist.compiler.ast.Expr make(int r8, javassist.compiler.ast.ASTree r9, javassist.compiler.ast.ASTree r10) {
            javassist.compiler.ast.Expr r0 = new javassist.compiler.ast.Expr
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

    public static javassist.compiler.ast.Expr make(int r5, javassist.compiler.ast.ASTree r6) {
            javassist.compiler.ast.Expr r0 = new javassist.compiler.ast.Expr
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public int getOperator() {
            r2 = this;
            r0 = r2
            int r0 = r0.operatorId
            return r0
    }

    public void setOperator(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.operatorId = r1
            return
    }

    public javassist.compiler.ast.ASTree oprand1() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            return r0
    }

    public void setOprand1(javassist.compiler.ast.ASTree r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.setLeft(r1)
            return
    }

    public javassist.compiler.ast.ASTree oprand2() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            return r0
    }

    public void setOprand2(javassist.compiler.ast.ASTree r4) {
            r3 = this;
            r0 = r3
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            r1 = r4
            r0.setLeft(r1)
            return
    }

    @Override // javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atExpr(r1)
            return
    }

    public java.lang.String getName() {
            r4 = this;
            r0 = r4
            int r0 = r0.operatorId
            r5 = r0
            r0 = r5
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L12
            r0 = r5
            char r0 = (char) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L12:
            r0 = 350(0x15e, float:4.9E-43)
            r1 = r5
            if (r0 > r1) goto L2a
            r0 = r5
            r1 = 371(0x173, float:5.2E-43)
            if (r0 > r1) goto L2a
            java.lang.String[] r0 = javassist.compiler.ast.Expr.opNames
            r1 = r5
            r2 = 350(0x15e, float:4.9E-43)
            int r1 = r1 - r2
            r0 = r0[r1]
            return r0
        L2a:
            r0 = r5
            r1 = 323(0x143, float:4.53E-43)
            if (r0 != r1) goto L34
            java.lang.String r0 = "instanceof"
            return r0
        L34:
            r0 = r5
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    protected java.lang.String getTag() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "op:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
