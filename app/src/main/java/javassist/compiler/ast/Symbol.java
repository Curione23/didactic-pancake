package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/Symbol.class */
public class Symbol extends javassist.compiler.ast.ASTree {
    private static final long serialVersionUID = 1;
    protected java.lang.String identifier;

    public Symbol(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.identifier = r1
            return
    }

    public java.lang.String get() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.identifier
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.identifier
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atSymbol(r1)
            return
    }
}
