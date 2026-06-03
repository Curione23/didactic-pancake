package org.objectweb.asm.signature;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/signature/SignatureVisitor.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/signature/SignatureVisitor.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/signature/SignatureVisitor.class */
public abstract class SignatureVisitor {
    public static final char EXTENDS = '+';
    public static final char SUPER = '-';
    public static final char INSTANCEOF = '=';
    protected final int api;

    public SignatureVisitor(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r4
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == r1) goto L18
            r0 = r4
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 == r1) goto L18
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L18:
            r0 = r3
            r1 = r4
            r0.api = r1
            return
    }

    public void visitFormalTypeParameter(java.lang.String r2) {
            r1 = this;
            return
    }

    public org.objectweb.asm.signature.SignatureVisitor visitClassBound() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitInterfaceBound() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitSuperclass() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitInterface() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitParameterType() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitReturnType() {
            r2 = this;
            r0 = r2
            return r0
    }

    public org.objectweb.asm.signature.SignatureVisitor visitExceptionType() {
            r2 = this;
            r0 = r2
            return r0
    }

    public void visitBaseType(char r2) {
            r1 = this;
            return
    }

    public void visitTypeVariable(java.lang.String r2) {
            r1 = this;
            return
    }

    public org.objectweb.asm.signature.SignatureVisitor visitArrayType() {
            r2 = this;
            r0 = r2
            return r0
    }

    public void visitClassType(java.lang.String r2) {
            r1 = this;
            return
    }

    public void visitInnerClassType(java.lang.String r2) {
            r1 = this;
            return
    }

    public void visitTypeArgument() {
            r1 = this;
            return
    }

    public org.objectweb.asm.signature.SignatureVisitor visitTypeArgument(char r3) {
            r2 = this;
            r0 = r2
            return r0
    }

    public void visitEnd() {
            r1 = this;
            return
    }
}
