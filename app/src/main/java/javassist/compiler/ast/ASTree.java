package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/ASTree.class */
public abstract class ASTree implements java.io.Serializable {
    private static final long serialVersionUID = 1;

    public ASTree() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public javassist.compiler.ast.ASTree getLeft() {
            r2 = this;
            r0 = 0
            return r0
    }

    public javassist.compiler.ast.ASTree getRight() {
            r2 = this;
            r0 = 0
            return r0
    }

    public void setLeft(javassist.compiler.ast.ASTree r2) {
            r1 = this;
            return
    }

    public void setRight(javassist.compiler.ast.ASTree r2) {
            r1 = this;
            return
    }

    public abstract void accept(javassist.compiler.ast.Visitor r1) throws javassist.compiler.CompileError;

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = 60
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.getTag()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = 62
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected java.lang.String getTag() {
            r4 = this;
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = r5
            r1 = r5
            r2 = 46
            int r1 = r1.lastIndexOf(r2)
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            return r0
    }
}
