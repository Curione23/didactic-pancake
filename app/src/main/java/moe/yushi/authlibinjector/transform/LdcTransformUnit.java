package moe.yushi.authlibinjector.transform;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/LdcTransformUnit.class */
public abstract class LdcTransformUnit implements moe.yushi.authlibinjector.transform.TransformUnit {


    public LdcTransformUnit() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // moe.yushi.authlibinjector.transform.TransformUnit
    public java.util.Optional<moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor> transform(java.lang.ClassLoader r8, java.lang.String r9, moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r10, moe.yushi.authlibinjector.transform.TransformContext r11) {
            r7 = this;
            r0 = 0
            r12 = r0
            r0 = r11
            java.util.List r0 = r0.getStringConstants()
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
        L11:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L50
            r0 = r13
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r14 = r0
            r0 = r7
            r1 = r14
            java.util.Optional r0 = r0.transformLdc(r1)
            r15 = r0
            r0 = r15
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L4d
            r0 = r15
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r1 = r14
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            r0 = 1
            r12 = r0
            goto L50
        L4d:
            goto L11
        L50:
            r0 = r12
            if (r0 != 0) goto L59
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        L59:
            moe.yushi.authlibinjector.transform.LdcTransformUnit$1 r0 = new moe.yushi.authlibinjector.transform.LdcTransformUnit$1
            r1 = r0
            r2 = r7
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
    }

    protected abstract java.util.Optional<java.lang.String> transformLdc(java.lang.String r1);
}
