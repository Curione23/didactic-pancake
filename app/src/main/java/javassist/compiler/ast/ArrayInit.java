package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/ArrayInit.class */
public class ArrayInit extends javassist.compiler.ast.ASTList {
    private static final long serialVersionUID = 1;

    public ArrayInit(javassist.compiler.ast.ASTree r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public int size() {
            r3 = this;
            r0 = r3
            int r0 = r0.length()
            r4 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L13
            r0 = r3
            javassist.compiler.ast.ASTree r0 = r0.head()
            if (r0 != 0) goto L13
            r0 = 0
            return r0
        L13:
            r0 = r4
            return r0
    }

    @Override // javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atArrayInit(r1)
            return
    }

    @Override // javassist.compiler.ast.ASTree
    public java.lang.String getTag() {
            r2 = this;
            java.lang.String r0 = "array"
            return r0
    }
}
