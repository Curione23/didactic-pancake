package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/MultiArrayType.class */
public class MultiArrayType extends javassist.bytecode.analysis.Type {
    private javassist.bytecode.analysis.MultiType component;
    private int dims;

    public MultiArrayType(javassist.bytecode.analysis.MultiType r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.component = r1
            r0 = r3
            r1 = r5
            r0.dims = r1
            return
    }

    @Override // javassist.bytecode.analysis.Type
    public javassist.CtClass getCtClass() {
            r4 = this;
            r0 = r4
            javassist.bytecode.analysis.MultiType r0 = r0.component
            javassist.CtClass r0 = r0.getCtClass()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r5
            javassist.ClassPool r0 = r0.getClassPool()
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L1b
            javassist.ClassPool r0 = javassist.ClassPool.getDefault()
            r6 = r0
        L1b:
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.getName()
            r2 = r4
            int r2 = r2.dims
            java.lang.String r0 = r0.arrayName(r1, r2)
            r7 = r0
            r0 = r6
            r1 = r7
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L2e
            return r0
        L2e:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.bytecode.analysis.Type
    boolean popChanged() {
            r2 = this;
            r0 = r2
            javassist.bytecode.analysis.MultiType r0 = r0.component
            boolean r0 = r0.popChanged()
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public int getDimensions() {
            r2 = this;
            r0 = r2
            int r0 = r0.dims
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public javassist.bytecode.analysis.Type getComponent() {
            r6 = this;
            r0 = r6
            int r0 = r0.dims
            r1 = 1
            if (r0 != r1) goto Lf
            r0 = r6
            javassist.bytecode.analysis.MultiType r0 = r0.component
            goto L20
        Lf:
            javassist.bytecode.analysis.MultiArrayType r0 = new javassist.bytecode.analysis.MultiArrayType
            r1 = r0
            r2 = r6
            javassist.bytecode.analysis.MultiType r2 = r2.component
            r3 = r6
            int r3 = r3.dims
            r4 = 1
            int r3 = r3 - r4
            r1.<init>(r2, r3)
        L20:
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public int getSize() {
            r2 = this;
            r0 = 1
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public boolean isArray() {
            r2 = this;
            r0 = 1
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public boolean isAssignableFrom(javassist.bytecode.analysis.Type r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented"
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.bytecode.analysis.Type
    public boolean isReference() {
            r2 = this;
            r0 = 1
            return r0
    }

    public boolean isAssignableTo(javassist.bytecode.analysis.Type r4) {
            r3 = this;
            r0 = r4
            javassist.CtClass r0 = r0.getCtClass()
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            javassist.CtClass r1 = r1.getCtClass()
            boolean r0 = eq(r0, r1)
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = r4
            javassist.CtClass r0 = r0.getCtClass()
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.CLONEABLE
            javassist.CtClass r1 = r1.getCtClass()
            boolean r0 = eq(r0, r1)
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = r4
            javassist.CtClass r0 = r0.getCtClass()
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.SERIALIZABLE
            javassist.CtClass r1 = r1.getCtClass()
            boolean r0 = eq(r0, r1)
            if (r0 == 0) goto L36
            r0 = 1
            return r0
        L36:
            r0 = r4
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L3f
            r0 = 0
            return r0
        L3f:
            r0 = r3
            r1 = r4
            javassist.bytecode.analysis.Type r0 = r0.getRootComponent(r1)
            r5 = r0
            r0 = r4
            int r0 = r0.getDimensions()
            r6 = r0
            r0 = r6
            r1 = r3
            int r1 = r1.dims
            if (r0 <= r1) goto L54
            r0 = 0
            return r0
        L54:
            r0 = r6
            r1 = r3
            int r1 = r1.dims
            if (r0 >= r1) goto L94
            r0 = r5
            javassist.CtClass r0 = r0.getCtClass()
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            javassist.CtClass r1 = r1.getCtClass()
            boolean r0 = eq(r0, r1)
            if (r0 == 0) goto L6e
            r0 = 1
            return r0
        L6e:
            r0 = r5
            javassist.CtClass r0 = r0.getCtClass()
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.CLONEABLE
            javassist.CtClass r1 = r1.getCtClass()
            boolean r0 = eq(r0, r1)
            if (r0 == 0) goto L80
            r0 = 1
            return r0
        L80:
            r0 = r5
            javassist.CtClass r0 = r0.getCtClass()
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.SERIALIZABLE
            javassist.CtClass r1 = r1.getCtClass()
            boolean r0 = eq(r0, r1)
            if (r0 == 0) goto L92
            r0 = 1
            return r0
        L92:
            r0 = 0
            return r0
        L94:
            r0 = r3
            javassist.bytecode.analysis.MultiType r0 = r0.component
            r1 = r5
            boolean r0 = r0.isAssignableTo(r1)
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public int hashCode() {
            r3 = this;
            r0 = r3
            javassist.bytecode.analysis.MultiType r0 = r0.component
            int r0 = r0.hashCode()
            r1 = r3
            int r1 = r1.dims
            int r0 = r0 + r1
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof javassist.bytecode.analysis.MultiArrayType
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            javassist.bytecode.analysis.MultiArrayType r0 = (javassist.bytecode.analysis.MultiArrayType) r0
            r5 = r0
            r0 = r3
            javassist.bytecode.analysis.MultiType r0 = r0.component
            r1 = r5
            javassist.bytecode.analysis.MultiType r1 = r1.component
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
            r0 = r3
            int r0 = r0.dims
            r1 = r5
            int r1 = r1.dims
            if (r0 != r1) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public java.lang.String toString() {
            r4 = this;
            r0 = r4
            r1 = r4
            javassist.bytecode.analysis.MultiType r1 = r1.component
            java.lang.String r1 = r1.toString()
            r2 = r4
            int r2 = r2.dims
            java.lang.String r0 = r0.arrayName(r1, r2)
            return r0
    }
}
