package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/ASTList.class */
public class ASTList extends javassist.compiler.ast.ASTree {
    private static final long serialVersionUID = 1;
    private javassist.compiler.ast.ASTree left;
    private javassist.compiler.ast.ASTList right;

    public ASTList(javassist.compiler.ast.ASTree r4, javassist.compiler.ast.ASTList r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.left = r1
            r0 = r3
            r1 = r5
            r0.right = r1
            return
    }

    public ASTList(javassist.compiler.ast.ASTree r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.left = r1
            r0 = r3
            r1 = 0
            r0.right = r1
            return
    }

    public static javassist.compiler.ast.ASTList make(javassist.compiler.ast.ASTree r10, javassist.compiler.ast.ASTree r11, javassist.compiler.ast.ASTree r12) {
            javassist.compiler.ast.ASTList r0 = new javassist.compiler.ast.ASTList
            r1 = r0
            r2 = r10
            javassist.compiler.ast.ASTList r3 = new javassist.compiler.ast.ASTList
            r4 = r3
            r5 = r11
            javassist.compiler.ast.ASTList r6 = new javassist.compiler.ast.ASTList
            r7 = r6
            r8 = r12
            r7.<init>(r8)
            r4.<init>(r5, r6)
            r1.<init>(r2, r3)
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    public javassist.compiler.ast.ASTree getLeft() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.left
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    public javassist.compiler.ast.ASTree getRight() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTList r0 = r0.right
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    public void setLeft(javassist.compiler.ast.ASTree r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.left = r1
            return
    }

    @Override // javassist.compiler.ast.ASTree
    public void setRight(javassist.compiler.ast.ASTree r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.compiler.ast.ASTList r1 = (javassist.compiler.ast.ASTList) r1
            r0.right = r1
            return
    }

    public javassist.compiler.ast.ASTree head() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.left
            return r0
    }

    public void setHead(javassist.compiler.ast.ASTree r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.left = r1
            return
    }

    public javassist.compiler.ast.ASTList tail() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTList r0 = r0.right
            return r0
    }

    public void setTail(javassist.compiler.ast.ASTList r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.right = r1
            return
    }

    @Override // javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atASTList(r1)
            return
    }

    @Override // javassist.compiler.ast.ASTree
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "(<"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.getTag()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            r5 = r0
        L21:
            r0 = r5
            if (r0 == 0) goto L4b
            r0 = r4
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.left
            r6 = r0
            r0 = r4
            r1 = r6
            if (r1 != 0) goto L3b
            java.lang.String r1 = "<null>"
            goto L3f
        L3b:
            r1 = r6
            java.lang.String r1 = r1.toString()
        L3f:
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            javassist.compiler.ast.ASTList r0 = r0.right
            r5 = r0
            goto L21
        L4b:
            r0 = r4
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int length() {
            r2 = this;
            r0 = r2
            int r0 = length(r0)
            return r0
    }

    public static int length(javassist.compiler.ast.ASTList r2) {
            r0 = r2
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 0
            r3 = r0
        L8:
            r0 = r2
            if (r0 == 0) goto L17
            r0 = r2
            javassist.compiler.ast.ASTList r0 = r0.right
            r2 = r0
            int r3 = r3 + 1
            goto L8
        L17:
            r0 = r3
            return r0
    }

    public javassist.compiler.ast.ASTList sublist(int r3) {
            r2 = this;
            r0 = r2
            r4 = r0
        L2:
            r0 = r3
            int r3 = r3 + (-1)
            if (r0 <= 0) goto L11
            r0 = r4
            javassist.compiler.ast.ASTList r0 = r0.right
            r4 = r0
            goto L2
        L11:
            r0 = r4
            return r0
    }

    public boolean subst(javassist.compiler.ast.ASTree r4, javassist.compiler.ast.ASTree r5) {
            r3 = this;
            r0 = r3
            r6 = r0
        L2:
            r0 = r6
            if (r0 == 0) goto L1d
            r0 = r6
            javassist.compiler.ast.ASTree r0 = r0.left
            r1 = r5
            if (r0 != r1) goto L15
            r0 = r6
            r1 = r4
            r0.left = r1
            r0 = 1
            return r0
        L15:
            r0 = r6
            javassist.compiler.ast.ASTList r0 = r0.right
            r6 = r0
            goto L2
        L1d:
            r0 = 0
            return r0
    }

    public static javassist.compiler.ast.ASTList append(javassist.compiler.ast.ASTList r5, javassist.compiler.ast.ASTree r6) {
            r0 = r5
            javassist.compiler.ast.ASTList r1 = new javassist.compiler.ast.ASTList
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            javassist.compiler.ast.ASTList r0 = concat(r0, r1)
            return r0
    }

    public static javassist.compiler.ast.ASTList concat(javassist.compiler.ast.ASTList r3, javassist.compiler.ast.ASTList r4) {
            r0 = r3
            if (r0 != 0) goto L6
            r0 = r4
            return r0
        L6:
            r0 = r3
            r5 = r0
        L8:
            r0 = r5
            javassist.compiler.ast.ASTList r0 = r0.right
            if (r0 == 0) goto L17
            r0 = r5
            javassist.compiler.ast.ASTList r0 = r0.right
            r5 = r0
            goto L8
        L17:
            r0 = r5
            r1 = r4
            r0.right = r1
            r0 = r3
            return r0
    }
}
