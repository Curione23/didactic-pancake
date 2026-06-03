package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/ClassMap.class */
public class ClassMap extends java.util.HashMap<java.lang.String, java.lang.String> {
    private static final long serialVersionUID = 1;
    private javassist.ClassMap parent;

    public ClassMap() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.parent = r1
            return
    }

    ClassMap(javassist.ClassMap r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.parent = r1
            return
    }

    public void put(javassist.CtClass r5, javassist.CtClass r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.getName()
            r2 = r6
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = r0.put(r1, r2)
            return
    }

    public java.lang.String put(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r5
            r1 = r6
            if (r0 != r1) goto L7
            r0 = r5
            return r0
        L7:
            r0 = r5
            java.lang.String r0 = toJvmName(r0)
            r7 = r0
            r0 = r4
            r1 = r7
            java.lang.String r0 = r0.get(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L21
            r0 = r8
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
        L21:
            r0 = r4
            r1 = r7
            r2 = r6
            java.lang.String r2 = toJvmName(r2)
            java.lang.Object r0 = super.put(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L2e:
            r0 = r8
            return r0
    }

    public void putIfNone(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r5
            r1 = r6
            if (r0 != r1) goto L6
            return
        L6:
            r0 = r5
            java.lang.String r0 = toJvmName(r0)
            r7 = r0
            r0 = r4
            r1 = r7
            java.lang.String r0 = r0.get(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L21
            r0 = r4
            r1 = r7
            r2 = r6
            java.lang.String r2 = toJvmName(r2)
            java.lang.Object r0 = super.put(r1, r2)
        L21:
            return
    }

    protected final java.lang.String put0(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Object r0 = super.put(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.String get(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = super.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1d
            r0 = r3
            javassist.ClassMap r0 = r0.parent
            if (r0 == 0) goto L1d
            r0 = r3
            javassist.ClassMap r0 = r0.parent
            r1 = r4
            java.lang.String r0 = r0.get(r1)
            return r0
        L1d:
            r0 = r5
            return r0
    }

    public void fix(javassist.CtClass r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.getName()
            r0.fix(r1)
            return
    }

    public void fix(java.lang.String r5) {
            r4 = this;
            r0 = r5
            java.lang.String r0 = toJvmName(r0)
            r6 = r0
            r0 = r4
            r1 = r6
            r2 = r6
            java.lang.Object r0 = super.put(r1, r2)
            return
    }

    public static java.lang.String toJvmName(java.lang.String r2) {
            r0 = r2
            java.lang.String r0 = javassist.bytecode.Descriptor.toJvmName(r0)
            return r0
    }

    public static java.lang.String toJavaName(java.lang.String r2) {
            r0 = r2
            java.lang.String r0 = javassist.bytecode.Descriptor.toJavaName(r0)
            return r0
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = r0.put(r1, r2)
            return r0
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.get(r1)
            return r0
    }
}
