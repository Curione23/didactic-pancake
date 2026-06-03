package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/Member.class */
public class Member extends javassist.compiler.ast.Symbol {
    private static final long serialVersionUID = 1;
    private javassist.CtField field;

    public Member(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = 0
            r0.field = r1
            return
    }

    public void setField(javassist.CtField r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.field = r1
            return
    }

    public javassist.CtField getField() {
            r2 = this;
            r0 = r2
            javassist.CtField r0 = r0.field
            return r0
    }

    @Override // javassist.compiler.ast.Symbol, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atMember(r1)
            return
    }
}
