package org.objectweb.asm.signature;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/signature/SignatureWriter.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/signature/SignatureWriter.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/signature/SignatureWriter.class */
public class SignatureWriter extends org.objectweb.asm.signature.SignatureVisitor {
    private final java.lang.StringBuffer a;
    private boolean b;
    private boolean c;
    private int d;

    public SignatureWriter() {
            r4 = this;
            r0 = r4
            r1 = 327680(0x50000, float:4.59177E-40)
            r0.<init>(r1)
            r0 = r4
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r2 = r1
            r2.<init>()
            r0.a = r1
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(java.lang.String r4) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.b
            if (r0 != 0) goto L16
            r0 = r3
            r1 = 1
            r0.b = r1
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 60
            java.lang.StringBuffer r0 = r0.append(r1)
        L16:
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = r4
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 58
            java.lang.StringBuffer r0 = r0.append(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitClassBound() {
            r2 = this;
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitInterfaceBound() {
            r3 = this;
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 58
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r3
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitSuperclass() {
            r2 = this;
            r0 = r2
            r0.a()
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitInterface() {
            r2 = this;
            r0 = r2
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitParameterType() {
            r3 = this;
            r0 = r3
            r0.a()
            r0 = r3
            boolean r0 = r0.c
            if (r0 != 0) goto L1a
            r0 = r3
            r1 = 1
            r0.c = r1
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 40
            java.lang.StringBuffer r0 = r0.append(r1)
        L1a:
            r0 = r3
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitReturnType() {
            r3 = this;
            r0 = r3
            r0.a()
            r0 = r3
            boolean r0 = r0.c
            if (r0 != 0) goto L15
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 40
            java.lang.StringBuffer r0 = r0.append(r1)
        L15:
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 41
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r3
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitExceptionType() {
            r3 = this;
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 94
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r3
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitBaseType(char r4) {
            r3 = this;
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = r4
            java.lang.StringBuffer r0 = r0.append(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeVariable(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 84
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = r4
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 59
            java.lang.StringBuffer r0 = r0.append(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitArrayType() {
            r3 = this;
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 91
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r3
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitClassType(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.lang.StringBuffer r0 = r0.a
            r1 = 76
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r4
            java.lang.StringBuffer r0 = r0.a
            r1 = r5
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.d
            r2 = 2
            int r1 = r1 * r2
            r0.d = r1
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitInnerClassType(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r0.b()
            r0 = r4
            java.lang.StringBuffer r0 = r0.a
            r1 = 46
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r4
            java.lang.StringBuffer r0 = r0.a
            r1 = r5
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.d
            r2 = 2
            int r1 = r1 * r2
            r0.d = r1
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
            r4 = this;
            r0 = r4
            int r0 = r0.d
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L1d
            r0 = r4
            r1 = r0
            int r1 = r1.d
            r2 = 1
            int r1 = r1 + r2
            r0.d = r1
            r0 = r4
            java.lang.StringBuffer r0 = r0.a
            r1 = 60
            java.lang.StringBuffer r0 = r0.append(r1)
        L1d:
            r0 = r4
            java.lang.StringBuffer r0 = r0.a
            r1 = 42
            java.lang.StringBuffer r0 = r0.append(r1)
            return
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public org.objectweb.asm.signature.SignatureVisitor visitTypeArgument(char r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.d
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L1d
            r0 = r4
            r1 = r0
            int r1 = r1.d
            r2 = 1
            int r1 = r1 + r2
            r0.d = r1
            r0 = r4
            java.lang.StringBuffer r0 = r0.a
            r1 = 60
            java.lang.StringBuffer r0 = r0.append(r1)
        L1d:
            r0 = r5
            r1 = 61
            if (r0 == r1) goto L2c
            r0 = r4
            java.lang.StringBuffer r0 = r0.a
            r1 = r5
            java.lang.StringBuffer r0 = r0.append(r1)
        L2c:
            r0 = r4
            return r0
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitEnd() {
            r3 = this;
            r0 = r3
            r0.b()
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 59
            java.lang.StringBuffer r0 = r0.append(r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.StringBuffer r0 = r0.a
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void a() {
            r3 = this;
            r0 = r3
            boolean r0 = r0.b
            if (r0 == 0) goto L16
            r0 = r3
            r1 = 0
            r0.b = r1
            r0 = r3
            java.lang.StringBuffer r0 = r0.a
            r1 = 62
            java.lang.StringBuffer r0 = r0.append(r1)
        L16:
            return
    }

    private void b() {
            r4 = this;
            r0 = r4
            int r0 = r0.d
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L13
            r0 = r4
            java.lang.StringBuffer r0 = r0.a
            r1 = 62
            java.lang.StringBuffer r0 = r0.append(r1)
        L13:
            r0 = r4
            r1 = r0
            int r1 = r1.d
            r2 = 2
            int r1 = r1 / r2
            r0.d = r1
            return
    }
}
