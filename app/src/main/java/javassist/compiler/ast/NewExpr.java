package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/NewExpr.class */
public class NewExpr extends javassist.compiler.ast.ASTList implements javassist.compiler.TokenId {
    private static final long serialVersionUID = 1;
    protected boolean newArray;
    protected int arrayType;

    public NewExpr(javassist.compiler.ast.ASTList r7, javassist.compiler.ast.ASTList r8) {
            r6 = this;
            r0 = r6
            r1 = r7
            javassist.compiler.ast.ASTList r2 = new javassist.compiler.ast.ASTList
            r3 = r2
            r4 = r8
            r3.<init>(r4)
            r0.<init>(r1, r2)
            r0 = r6
            r1 = 0
            r0.newArray = r1
            r0 = r6
            r1 = 307(0x133, float:4.3E-43)
            r0.arrayType = r1
            return
    }

    public NewExpr(int r7, javassist.compiler.ast.ASTList r8, javassist.compiler.ast.ArrayInit r9) {
            r6 = this;
            r0 = r6
            r1 = 0
            javassist.compiler.ast.ASTList r2 = new javassist.compiler.ast.ASTList
            r3 = r2
            r4 = r8
            r3.<init>(r4)
            r0.<init>(r1, r2)
            r0 = r6
            r1 = 1
            r0.newArray = r1
            r0 = r6
            r1 = r7
            r0.arrayType = r1
            r0 = r9
            if (r0 == 0) goto L21
            r0 = r6
            r1 = r9
            javassist.compiler.ast.ASTList r0 = append(r0, r1)
        L21:
            return
    }

    public static javassist.compiler.ast.NewExpr makeObjectArray(javassist.compiler.ast.ASTList r5, javassist.compiler.ast.ASTList r6, javassist.compiler.ast.ArrayInit r7) {
            javassist.compiler.ast.NewExpr r0 = new javassist.compiler.ast.NewExpr
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            r1 = 1
            r0.newArray = r1
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r8
            r1 = r7
            javassist.compiler.ast.ASTList r0 = append(r0, r1)
        L19:
            r0 = r8
            return r0
    }

    public boolean isArray() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.newArray
            return r0
    }

    public int getArrayType() {
            r2 = this;
            r0 = r2
            int r0 = r0.arrayType
            return r0
    }

    public javassist.compiler.ast.ASTList getClassName() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            javassist.compiler.ast.ASTList r0 = (javassist.compiler.ast.ASTList) r0
            return r0
    }

    public javassist.compiler.ast.ASTList getArguments() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            javassist.compiler.ast.ASTList r0 = (javassist.compiler.ast.ASTList) r0
            return r0
    }

    public javassist.compiler.ast.ASTList getArraySize() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTList r0 = r0.getArguments()
            return r0
    }

    public javassist.compiler.ast.ArrayInit getInitializer() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            javassist.compiler.ast.ASTree r0 = r0.getRight()
            r3 = r0
            r0 = r3
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r3
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            javassist.compiler.ast.ArrayInit r0 = (javassist.compiler.ast.ArrayInit) r0
            return r0
    }

    @Override // javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atNewExpr(r1)
            return
    }

    @Override // javassist.compiler.ast.ASTree
    protected java.lang.String getTag() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.newArray
            if (r0 == 0) goto Lc
            java.lang.String r0 = "new[]"
            goto Le
        Lc:
            java.lang.String r0 = "new"
        Le:
            return r0
    }
}
