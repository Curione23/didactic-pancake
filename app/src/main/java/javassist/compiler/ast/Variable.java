package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/Variable.class */
public class Variable extends javassist.compiler.ast.Symbol {
    private static final long serialVersionUID = 1;
    protected javassist.compiler.ast.Declarator declarator;

    public Variable(java.lang.String r4, javassist.compiler.ast.Declarator r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.declarator = r1
            return
    }

    public javassist.compiler.ast.Declarator getDeclarator() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.Declarator r0 = r0.declarator
            return r0
    }

    @Override // javassist.compiler.ast.Symbol, javassist.compiler.ast.ASTree
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.String r1 = r1.identifier
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            javassist.compiler.ast.Declarator r1 = r1.declarator
            int r1 = r1.getType()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.compiler.ast.Symbol, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atVariable(r1)
            return
    }
}
