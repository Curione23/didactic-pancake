package moe.yushi.authlibinjector.internal.org.objectweb.asm.signature;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/org/objectweb/asm/signature/SignatureVisitor.class */
public abstract class SignatureVisitor {
    public static final char EXTENDS = '+';
    public static final char SUPER = '-';
    public static final char INSTANCEOF = '=';
    protected final int api;

    protected SignatureVisitor(int r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            r1 = 589824(0x90000, float:8.2652E-40)
            if (r0 == r1) goto L3a
            r0 = r5
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 == r1) goto L3a
            r0 = r5
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 == r1) goto L3a
            r0 = r5
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L3a
            r0 = r5
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 == r1) goto L3a
            r0 = r5
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == r1) goto L3a
            r0 = r5
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r0 == r1) goto L3a
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r5
            java.lang.String r2 = stringConcat$0(r2)
            r1.<init>(r2)
            throw r0
        L3a:
            r0 = r4
            r1 = r5
            r0.api = r1
            return
    }

    private static /* synthetic */ java.lang.String stringConcat$0(int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Unsupported api "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void visitFormalTypeParameter(java.lang.String r2) {
            r1 = this;
            return
    }

    public moe.yushi.authlibinjector.internal.org.objectweb.asm.signature.SignatureVisitor visitClassBound() {
            r2 = this;
            r0 = r2
            return r0
    }

    public moe.yushi.authlibinjector.internal.org.objectweb.asm.signature.SignatureVisitor visitInterfaceBound() {
            r2 = this;
            r0 = r2
            return r0
    }

    public moe.yushi.authlibinjector.internal.org.objectweb.asm.signature.SignatureVisitor visitSuperclass() {
            r2 = this;
            r0 = r2
            return r0
    }

    public moe.yushi.authlibinjector.internal.org.objectweb.asm.signature.SignatureVisitor visitInterface() {
            r2 = this;
            r0 = r2
            return r0
    }

    public moe.yushi.authlibinjector.internal.org.objectweb.asm.signature.SignatureVisitor visitParameterType() {
            r2 = this;
            r0 = r2
            return r0
    }

    public moe.yushi.authlibinjector.internal.org.objectweb.asm.signature.SignatureVisitor visitReturnType() {
            r2 = this;
            r0 = r2
            return r0
    }

    public moe.yushi.authlibinjector.internal.org.objectweb.asm.signature.SignatureVisitor visitExceptionType() {
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

    public moe.yushi.authlibinjector.internal.org.objectweb.asm.signature.SignatureVisitor visitArrayType() {
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

    public moe.yushi.authlibinjector.internal.org.objectweb.asm.signature.SignatureVisitor visitTypeArgument(char r3) {
            r2 = this;
            r0 = r2
            return r0
    }

    public void visitEnd() {
            r1 = this;
            return
    }
}
