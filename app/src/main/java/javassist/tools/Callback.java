package javassist.tools;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/Callback.class */
public abstract class Callback {
    public static java.util.Map<java.lang.String, javassist.tools.Callback> callbacks;
    private final java.lang.String sourceCode;

    public Callback(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r6 = r0
            java.util.Map<java.lang.String, javassist.tools.Callback> r0 = javassist.tools.Callback.callbacks
            r1 = r6
            r2 = r4
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "((javassist.tools.Callback) javassist.tools.Callback.callbacks.get(\""
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\")).result(new Object[]{"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "});"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.sourceCode = r1
            return
    }

    public abstract void result(java.lang.Object[] r1);

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.sourceCode()
            return r0
    }

    public java.lang.String sourceCode() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.sourceCode
            return r0
    }

    public static void insertBefore(javassist.CtBehavior r3, javassist.tools.Callback r4) throws javassist.CannotCompileException {
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.toString()
            r0.insertBefore(r1)
            return
    }

    public static void insertAfter(javassist.CtBehavior r4, javassist.tools.Callback r5) throws javassist.CannotCompileException {
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.insertAfter(r1, r2)
            return
    }

    public static void insertAfter(javassist.CtBehavior r4, javassist.tools.Callback r5, boolean r6) throws javassist.CannotCompileException {
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.toString()
            r2 = r6
            r0.insertAfter(r1, r2)
            return
    }

    public static int insertAt(javassist.CtBehavior r4, javassist.tools.Callback r5, int r6) throws javassist.CannotCompileException {
            r0 = r4
            r1 = r6
            r2 = r5
            java.lang.String r2 = r2.toString()
            int r0 = r0.insertAt(r1, r2)
            return r0
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            javassist.tools.Callback.callbacks = r0
            return
    }
}
