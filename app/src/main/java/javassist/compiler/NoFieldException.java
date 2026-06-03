package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/NoFieldException.class */
public class NoFieldException extends javassist.compiler.CompileError {
    private static final long serialVersionUID = 1;
    private java.lang.String fieldName;
    private javassist.compiler.ast.ASTree expr;

    public NoFieldException(java.lang.String r5, javassist.compiler.ast.ASTree r6) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "no such field: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.fieldName = r1
            r0 = r4
            r1 = r6
            r0.expr = r1
            return
    }

    public java.lang.String getField() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.fieldName
            return r0
    }

    public javassist.compiler.ast.ASTree getExpr() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.expr
            return r0
    }
}
