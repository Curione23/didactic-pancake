package moe.yushi.authlibinjector.internal.org.objectweb.asm;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/org/objectweb/asm/ClassTooLargeException.class */
public final class ClassTooLargeException extends java.lang.IndexOutOfBoundsException {
    private static final long serialVersionUID = 160715609518896765L;
    private final java.lang.String className;
    private final int constantPoolCount;

    public ClassTooLargeException(java.lang.String r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r1 = stringConcat$0(r1)
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.className = r1
            r0 = r3
            r1 = r5
            r0.constantPoolCount = r1
            return
    }

    private static /* synthetic */ java.lang.String stringConcat$0(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Class too large: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String getClassName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.className
            return r0
    }

    public int getConstantPoolCount() {
            r2 = this;
            r0 = r2
            int r0 = r0.constantPoolCount
            return r0
    }
}
