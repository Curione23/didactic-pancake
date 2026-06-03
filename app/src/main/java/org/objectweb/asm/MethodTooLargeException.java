package org.objectweb.asm;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/MethodTooLargeException.class */
public final class MethodTooLargeException extends java.lang.IndexOutOfBoundsException {
    private static final long serialVersionUID = 6807380416709738314L;
    private final java.lang.String className;
    private final java.lang.String methodName;
    private final java.lang.String descriptor;
    private final int codeSize;

    public MethodTooLargeException(java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            java.lang.String r1 = stringConcat$0(r1, r2, r3)
            r0.<init>(r1)
            r0 = r5
            r1 = r6
            r0.className = r1
            r0 = r5
            r1 = r7
            r0.methodName = r1
            r0 = r5
            r1 = r8
            r0.descriptor = r1
            r0 = r5
            r1 = r9
            r0.codeSize = r1
            return
    }

    private static /* synthetic */ java.lang.String stringConcat$0(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Method too large: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
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

    public java.lang.String getMethodName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.methodName
            return r0
    }

    public java.lang.String getDescriptor() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.descriptor
            return r0
    }

    public int getCodeSize() {
            r2 = this;
            r0 = r2
            int r0 = r0.codeSize
            return r0
    }
}
