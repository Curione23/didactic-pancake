package moe.yushi.authlibinjector.internal.org.objectweb.asm;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/org/objectweb/asm/ModuleVisitor.class */
public abstract class ModuleVisitor {
    protected final int api;
    protected moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor mv;

    protected ModuleVisitor(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    protected ModuleVisitor(int r5, moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r6) {
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
            r0 = r5
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r0 != r1) goto L44
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Constants.checkAsmExperimental(r0)
        L44:
            r0 = r4
            r1 = r5
            r0.api = r1
            r0 = r4
            r1 = r6
            r0.mv = r1
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

    public moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor getDelegate() {
            r2 = this;
            r0 = r2
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            return r0
    }

    public void visitMainClass(java.lang.String r4) {
            r3 = this;
            r0 = r3
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            if (r0 == 0) goto Lf
            r0 = r3
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            r1 = r4
            r0.visitMainClass(r1)
        Lf:
            return
    }

    public void visitPackage(java.lang.String r4) {
            r3 = this;
            r0 = r3
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            if (r0 == 0) goto Lf
            r0 = r3
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            r1 = r4
            r0.visitPackage(r1)
        Lf:
            return
    }

    public void visitRequire(java.lang.String r6, int r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            if (r0 == 0) goto L11
            r0 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            r1 = r6
            r2 = r7
            r3 = r8
            r0.visitRequire(r1, r2, r3)
        L11:
            return
    }

    public void visitExport(java.lang.String r6, int r7, java.lang.String... r8) {
            r5 = this;
            r0 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            if (r0 == 0) goto L11
            r0 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            r1 = r6
            r2 = r7
            r3 = r8
            r0.visitExport(r1, r2, r3)
        L11:
            return
    }

    public void visitOpen(java.lang.String r6, int r7, java.lang.String... r8) {
            r5 = this;
            r0 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            if (r0 == 0) goto L11
            r0 = r5
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            r1 = r6
            r2 = r7
            r3 = r8
            r0.visitOpen(r1, r2, r3)
        L11:
            return
    }

    public void visitUse(java.lang.String r4) {
            r3 = this;
            r0 = r3
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            if (r0 == 0) goto Lf
            r0 = r3
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            r1 = r4
            r0.visitUse(r1)
        Lf:
            return
    }

    public void visitProvide(java.lang.String r5, java.lang.String... r6) {
            r4 = this;
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            if (r0 == 0) goto L10
            r0 = r4
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            r1 = r5
            r2 = r6
            r0.visitProvide(r1, r2)
        L10:
            return
    }

    public void visitEnd() {
            r2 = this;
            r0 = r2
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            if (r0 == 0) goto Le
            r0 = r2
            moe.yushi.authlibinjector.internal.org.objectweb.asm.ModuleVisitor r0 = r0.mv
            r0.visitEnd()
        Le:
            return
    }
}
