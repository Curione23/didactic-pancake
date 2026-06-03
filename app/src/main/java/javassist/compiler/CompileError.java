package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/CompileError.class */
public class CompileError extends java.lang.Exception {
    private static final long serialVersionUID = 1;
    private javassist.compiler.Lex lex;
    private java.lang.String reason;

    public CompileError(java.lang.String r4, javassist.compiler.Lex r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.reason = r1
            r0 = r3
            r1 = r5
            r0.lex = r1
            return
    }

    public CompileError(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.reason = r1
            r0 = r3
            r1 = 0
            r0.lex = r1
            return
    }

    public CompileError(javassist.CannotCompileException r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.getReason()
            r0.<init>(r1)
            return
    }

    public CompileError(javassist.NotFoundException r5) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "cannot find "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return
    }

    public javassist.compiler.Lex getLex() {
            r2 = this;
            r0 = r2
            javassist.compiler.Lex r0 = r0.lex
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.reason
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "compile error: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.reason
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
