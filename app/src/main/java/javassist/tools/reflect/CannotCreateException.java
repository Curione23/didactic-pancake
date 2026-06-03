package javassist.tools.reflect;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/reflect/CannotCreateException.class */
public class CannotCreateException extends java.lang.Exception {
    private static final long serialVersionUID = 1;

    public CannotCreateException(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public CannotCreateException(java.lang.Exception r5) {
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
            return
    }
}
