package javassist.tools.reflect;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/reflect/CannotInvokeException.class */
public class CannotInvokeException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 1;
    private java.lang.Throwable err;

    public java.lang.Throwable getReason() {
            r2 = this;
            r0 = r2
            java.lang.Throwable r0 = r0.err
            return r0
    }

    public CannotInvokeException(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = 0
            r0.err = r1
            return
    }

    public CannotInvokeException(java.lang.reflect.InvocationTargetException r5) {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "by "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.Throwable r2 = r2.getTargetException()
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r4
            r1 = 0
            r0.err = r1
            r0 = r4
            r1 = r5
            java.lang.Throwable r1 = r1.getTargetException()
            r0.err = r1
            return
    }

    public CannotInvokeException(java.lang.IllegalAccessException r5) {
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
            r0.err = r1
            r0 = r4
            r1 = r5
            r0.err = r1
            return
    }

    public CannotInvokeException(java.lang.ClassNotFoundException r5) {
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
            r0.err = r1
            r0 = r4
            r1 = r5
            r0.err = r1
            return
    }
}
