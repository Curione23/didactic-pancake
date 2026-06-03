package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/SyntaxError.class */
public class SyntaxError extends javassist.compiler.CompileError {
    private static final long serialVersionUID = 1;

    public SyntaxError(javassist.compiler.Lex r5) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "syntax error near \""
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.String r2 = r2.getTextAround()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\""
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r5
            r0.<init>(r1, r2)
            return
    }
}
