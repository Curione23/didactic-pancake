package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/Keyword.class */
public class Keyword extends javassist.compiler.ast.ASTree {
    private static final long serialVersionUID = 1;
    protected int tokenId;

    public Keyword(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.tokenId = r1
            return
    }

    public int get() {
            r2 = this;
            r0 = r2
            int r0 = r0.tokenId
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "id:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.tokenId
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atKeyword(r1)
            return
    }
}
