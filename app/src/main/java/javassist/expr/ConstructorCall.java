package javassist.expr;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/ConstructorCall.class */
public class ConstructorCall extends javassist.expr.MethodCall {
    protected ConstructorCall(int r7, javassist.bytecode.CodeIterator r8, javassist.CtClass r9, javassist.bytecode.MethodInfo r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // javassist.expr.MethodCall
    public java.lang.String getMethodName() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isSuper()
            if (r0 == 0) goto Lc
            java.lang.String r0 = "super"
            goto Le
        Lc:
            java.lang.String r0 = "this"
        Le:
            return r0
    }

    @Override // javassist.expr.MethodCall
    public javassist.CtMethod getMethod() throws javassist.NotFoundException {
            r4 = this;
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            java.lang.String r2 = "this is a constructor call.  Call getConstructor()."
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtConstructor getConstructor() throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.CtClass r0 = r0.getCtClass()
            r1 = r3
            java.lang.String r1 = r1.getSignature()
            javassist.CtConstructor r0 = r0.getConstructor(r1)
            return r0
    }

    @Override // javassist.expr.MethodCall
    public boolean isSuper() {
            r2 = this;
            r0 = r2
            boolean r0 = super.isSuper()
            return r0
    }
}
