package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CannotCompileException.class */
public class CannotCompileException extends java.lang.Exception {
    private static final long serialVersionUID = 1;
    private java.lang.Throwable myCause;
    private java.lang.String message;

    @Override // java.lang.Throwable
    public synchronized java.lang.Throwable getCause() {
            r3 = this;
            r0 = r3
            java.lang.Throwable r0 = r0.myCause
            r1 = r3
            if (r0 != r1) goto Lc
            r0 = 0
            goto L10
        Lc:
            r0 = r3
            java.lang.Throwable r0 = r0.myCause
        L10:
            return r0
    }

    @Override // java.lang.Throwable
    public synchronized java.lang.Throwable initCause(java.lang.Throwable r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.myCause = r1
            r0 = r3
            return r0
    }

    public java.lang.String getReason() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.message
            if (r0 == 0) goto Lc
            r0 = r2
            java.lang.String r0 = r0.message
            return r0
        Lc:
            r0 = r2
            java.lang.String r0 = r0.toString()
            return r0
    }

    public CannotCompileException(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.message = r1
            r0 = r3
            r1 = 0
            java.lang.Throwable r0 = r0.initCause(r1)
            return
    }

    public CannotCompileException(java.lang.Throwable r5) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "by "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r4
            r1 = 0
            r0.message = r1
            r0 = r4
            r1 = r5
            java.lang.Throwable r0 = r0.initCause(r1)
            return
    }

    public CannotCompileException(java.lang.String r4, java.lang.Throwable r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            java.lang.Throwable r0 = r0.initCause(r1)
            return
    }

    public CannotCompileException(javassist.NotFoundException r5) {
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
            r2 = r5
            r0.<init>(r1, r2)
            return
    }

    public CannotCompileException(javassist.compiler.CompileError r5) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[source error] "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r5
            r0.<init>(r1, r2)
            return
    }

    public CannotCompileException(java.lang.ClassNotFoundException r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "cannot find "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r5
            r0.<init>(r1, r2)
            return
    }

    public CannotCompileException(java.lang.ClassFormatError r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "invalid class format: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r5
            r0.<init>(r1, r2)
            return
    }
}
