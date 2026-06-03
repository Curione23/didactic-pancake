package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/Pair.class */
public class Pair extends javassist.compiler.ast.ASTree {
    private static final long serialVersionUID = 1;
    protected javassist.compiler.ast.ASTree left;
    protected javassist.compiler.ast.ASTree right;

    public Pair(javassist.compiler.ast.ASTree r4, javassist.compiler.ast.ASTree r5) {
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

    @Override // javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atPair(r1)
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
            java.lang.String r1 = "(<Pair> "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            javassist.compiler.ast.ASTree r1 = r1.left
            if (r1 != 0) goto L1c
            java.lang.String r1 = "<null>"
            goto L23
        L1c:
            r1 = r3
            javassist.compiler.ast.ASTree r1 = r1.left
            java.lang.String r1 = r1.toString()
        L23:
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r1 = " . "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            javassist.compiler.ast.ASTree r1 = r1.right
            if (r1 != 0) goto L3b
            java.lang.String r1 = "<null>"
            goto L42
        L3b:
            r1 = r3
            javassist.compiler.ast.ASTree r1 = r1.right
            java.lang.String r1 = r1.toString()
        L42:
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
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
            javassist.compiler.ast.ASTree r0 = r0.right
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
            r0.right = r1
            return
    }
}
