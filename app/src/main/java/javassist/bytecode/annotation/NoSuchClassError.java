package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/NoSuchClassError.class */
public class NoSuchClassError extends java.lang.Error {
    private static final long serialVersionUID = 1;
    private java.lang.String className;

    public NoSuchClassError(java.lang.String r5, java.lang.Error r6) {
            r4 = this;
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.toString()
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.className = r1
            return
    }

    public java.lang.String getClassName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.className
            return r0
    }
}
