package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/MultiType.class */
public class MultiType extends javassist.bytecode.analysis.Type {
    private java.util.Map<java.lang.String, javassist.CtClass> interfaces;
    private javassist.bytecode.analysis.Type resolved;
    private javassist.bytecode.analysis.Type potentialClass;
    private javassist.bytecode.analysis.MultiType mergeSource;
    private boolean changed;

    public MultiType(java.util.Map<java.lang.String, javassist.CtClass> r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public MultiType(java.util.Map<java.lang.String, javassist.CtClass> r4, javassist.bytecode.analysis.Type r5) {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            r0 = r3
            r1 = 0
            r0.changed = r1
            r0 = r3
            r1 = r4
            r0.interfaces = r1
            r0 = r3
            r1 = r5
            r0.potentialClass = r1
            return
    }

    @Override // javassist.bytecode.analysis.Type
    public javassist.CtClass getCtClass() {
            r2 = this;
            r0 = r2
            javassist.bytecode.analysis.Type r0 = r0.resolved
            if (r0 == 0) goto Lf
            r0 = r2
            javassist.bytecode.analysis.Type r0 = r0.resolved
            javassist.CtClass r0 = r0.getCtClass()
            return r0
        Lf:
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.OBJECT
            javassist.CtClass r0 = r0.getCtClass()
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public javassist.bytecode.analysis.Type getComponent() {
            r2 = this;
            r0 = 0
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
            r0 = 0
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    boolean popChanged() {
            r3 = this;
            r0 = r3
            boolean r0 = r0.changed
            r4 = r0
            r0 = r3
            r1 = 0
            r0.changed = r1
            r0 = r4
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

    public boolean isAssignableTo(javassist.bytecode.analysis.Type r5) {
            r4 = this;
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.resolved
            if (r0 == 0) goto L10
            r0 = r5
            r1 = r4
            javassist.bytecode.analysis.Type r1 = r1.resolved
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
        L10:
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.OBJECT
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.potentialClass
            if (r0 == 0) goto L33
            r0 = r5
            r1 = r4
            javassist.bytecode.analysis.Type r1 = r1.potentialClass
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L33
            r0 = r4
            r1 = 0
            r0.potentialClass = r1
        L33:
            r0 = r4
            r1 = r4
            r2 = r5
            java.util.Map r0 = r0.mergeMultiAndSingle(r1, r2)
            r6 = r0
            r0 = r6
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L6b
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.potentialClass
            if (r0 != 0) goto L6b
            r0 = r4
            r1 = r6
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            javassist.CtClass r1 = (javassist.CtClass) r1
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.get(r1)
            r0.resolved = r1
            r0 = r4
            r0.propogateResolved()
            r0 = 1
            return r0
        L6b:
            r0 = r6
            int r0 = r0.size()
            r1 = 1
            if (r0 < r1) goto L80
            r0 = r4
            r1 = r6
            r0.interfaces = r1
            r0 = r4
            r0.propogateState()
            r0 = 1
            return r0
        L80:
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.potentialClass
            if (r0 == 0) goto L95
            r0 = r4
            r1 = r4
            javassist.bytecode.analysis.Type r1 = r1.potentialClass
            r0.resolved = r1
            r0 = r4
            r0.propogateResolved()
            r0 = 1
            return r0
        L95:
            r0 = 0
            return r0
    }

    private void propogateState() {
            r3 = this;
            r0 = r3
            javassist.bytecode.analysis.MultiType r0 = r0.mergeSource
            r4 = r0
        L5:
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            r1 = r3
            java.util.Map<java.lang.String, javassist.CtClass> r1 = r1.interfaces
            r0.interfaces = r1
            r0 = r4
            r1 = r3
            javassist.bytecode.analysis.Type r1 = r1.potentialClass
            r0.potentialClass = r1
            r0 = r4
            javassist.bytecode.analysis.MultiType r0 = r0.mergeSource
            r4 = r0
            goto L5
        L21:
            return
    }

    private void propogateResolved() {
            r3 = this;
            r0 = r3
            javassist.bytecode.analysis.MultiType r0 = r0.mergeSource
            r4 = r0
        L5:
            r0 = r4
            if (r0 == 0) goto L19
            r0 = r4
            r1 = r3
            javassist.bytecode.analysis.Type r1 = r1.resolved
            r0.resolved = r1
            r0 = r4
            javassist.bytecode.analysis.MultiType r0 = r0.mergeSource
            r4 = r0
            goto L5
        L19:
            return
    }

    @Override // javassist.bytecode.analysis.Type
    public boolean isReference() {
            r2 = this;
            r0 = 1
            return r0
    }

    private java.util.Map<java.lang.String, javassist.CtClass> getAllMultiInterfaces(javassist.bytecode.analysis.MultiType r5) {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r5
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.interfaces
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L17:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L44
            r0 = r7
            java.lang.Object r0 = r0.next()
            javassist.CtClass r0 = (javassist.CtClass) r0
            r8 = r0
            r0 = r6
            r1 = r8
            java.lang.String r1 = r1.getName()
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            r1 = r8
            r2 = r6
            java.util.Map r0 = r0.getAllInterfaces(r1, r2)
            goto L17
        L44:
            r0 = r6
            return r0
    }

    private java.util.Map<java.lang.String, javassist.CtClass> mergeMultiInterfaces(javassist.bytecode.analysis.MultiType r5, javassist.bytecode.analysis.MultiType r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.util.Map r0 = r0.getAllMultiInterfaces(r1)
            r7 = r0
            r0 = r4
            r1 = r6
            java.util.Map r0 = r0.getAllMultiInterfaces(r1)
            r8 = r0
            r0 = r4
            r1 = r7
            r2 = r8
            java.util.Map r0 = r0.findCommonInterfaces(r1, r2)
            return r0
    }

    private java.util.Map<java.lang.String, javassist.CtClass> mergeMultiAndSingle(javassist.bytecode.analysis.MultiType r5, javassist.bytecode.analysis.Type r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.util.Map r0 = r0.getAllMultiInterfaces(r1)
            r7 = r0
            r0 = r4
            r1 = r6
            javassist.CtClass r1 = r1.getCtClass()
            r2 = 0
            java.util.Map r0 = r0.getAllInterfaces(r1, r2)
            r8 = r0
            r0 = r4
            r1 = r7
            r2 = r8
            java.util.Map r0 = r0.findCommonInterfaces(r1, r2)
            return r0
    }

    private boolean inMergeSource(javassist.bytecode.analysis.MultiType r4) {
            r3 = this;
        L0:
            r0 = r4
            if (r0 == 0) goto L13
            r0 = r4
            r1 = r3
            if (r0 != r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = r4
            javassist.bytecode.analysis.MultiType r0 = r0.mergeSource
            r4 = r0
            goto L0
        L13:
            r0 = 0
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public javassist.bytecode.analysis.Type merge(javassist.bytecode.analysis.Type r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            if (r0 != r1) goto L7
            r0 = r4
            return r0
        L7:
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.MultiType.UNINIT
            if (r0 != r1) goto L10
            r0 = r4
            return r0
        L10:
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.MultiType.BOGUS
            if (r0 != r1) goto L1b
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.MultiType.BOGUS
            return r0
        L1b:
            r0 = r5
            if (r0 != 0) goto L21
            r0 = r4
            return r0
        L21:
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.resolved
            if (r0 == 0) goto L31
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.resolved
            r1 = r5
            javassist.bytecode.analysis.Type r0 = r0.merge(r1)
            return r0
        L31:
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.potentialClass
            if (r0 == 0) goto L6b
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.potentialClass
            r1 = r5
            javassist.bytecode.analysis.Type r0 = r0.merge(r1)
            r6 = r0
            r0 = r6
            r1 = r4
            javassist.bytecode.analysis.Type r1 = r1.potentialClass
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            r0 = r6
            boolean r0 = r0.popChanged()
            if (r0 == 0) goto L6b
        L53:
            r0 = r4
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r6
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L62
            r1 = 0
            goto L63
        L62:
            r1 = r6
        L63:
            r0.potentialClass = r1
            r0 = r4
            r1 = 1
            r0.changed = r1
        L6b:
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.analysis.MultiType
            if (r0 == 0) goto La2
            r0 = r5
            javassist.bytecode.analysis.MultiType r0 = (javassist.bytecode.analysis.MultiType) r0
            r7 = r0
            r0 = r7
            javassist.bytecode.analysis.Type r0 = r0.resolved
            if (r0 == 0) goto L8b
            r0 = r4
            r1 = r4
            r2 = r7
            javassist.bytecode.analysis.Type r2 = r2.resolved
            java.util.Map r0 = r0.mergeMultiAndSingle(r1, r2)
            r6 = r0
            goto L9f
        L8b:
            r0 = r4
            r1 = r7
            r2 = r4
            java.util.Map r0 = r0.mergeMultiInterfaces(r1, r2)
            r6 = r0
            r0 = r4
            r1 = r7
            boolean r0 = r0.inMergeSource(r1)
            if (r0 != 0) goto L9f
            r0 = r4
            r1 = r7
            r0.mergeSource = r1
        L9f:
            goto La9
        La2:
            r0 = r4
            r1 = r4
            r2 = r5
            java.util.Map r0 = r0.mergeMultiAndSingle(r1, r2)
            r6 = r0
        La9:
            r0 = r6
            int r0 = r0.size()
            r1 = 1
            if (r0 > r1) goto Lc4
            r0 = r6
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L126
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.potentialClass
            if (r0 == 0) goto L126
        Lc4:
            r0 = r6
            int r0 = r0.size()
            r1 = r4
            java.util.Map<java.lang.String, javassist.CtClass> r1 = r1.interfaces
            int r1 = r1.size()
            if (r0 == r1) goto Lde
            r0 = r4
            r1 = 1
            r0.changed = r1
            goto L11b
        Lde:
            r0 = r4
            boolean r0 = r0.changed
            if (r0 != 0) goto L11b
            r0 = r6
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        Lf1:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L11b
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r4
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.interfaces
            r1 = r8
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L118
            r0 = r4
            r1 = 1
            r0.changed = r1
        L118:
            goto Lf1
        L11b:
            r0 = r4
            r1 = r6
            r0.interfaces = r1
            r0 = r4
            r0.propogateState()
            r0 = r4
            return r0
        L126:
            r0 = r6
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L14d
            r0 = r4
            r1 = r6
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            javassist.CtClass r1 = (javassist.CtClass) r1
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.get(r1)
            r0.resolved = r1
            goto L166
        L14d:
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.potentialClass
            if (r0 == 0) goto L15f
            r0 = r4
            r1 = r4
            javassist.bytecode.analysis.Type r1 = r1.potentialClass
            r0.resolved = r1
            goto L166
        L15f:
            r0 = r4
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.MultiType.OBJECT
            r0.resolved = r1
        L166:
            r0 = r4
            r0.propogateResolved()
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.resolved
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public int hashCode() {
            r2 = this;
            r0 = r2
            javassist.bytecode.analysis.Type r0 = r0.resolved
            if (r0 == 0) goto Lf
            r0 = r2
            javassist.bytecode.analysis.Type r0 = r0.resolved
            int r0 = r0.hashCode()
            return r0
        Lf:
            r0 = r2
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.interfaces
            java.util.Set r0 = r0.keySet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof javassist.bytecode.analysis.MultiType
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            javassist.bytecode.analysis.MultiType r0 = (javassist.bytecode.analysis.MultiType) r0
            r5 = r0
            r0 = r3
            javassist.bytecode.analysis.Type r0 = r0.resolved
            if (r0 == 0) goto L21
            r0 = r3
            javassist.bytecode.analysis.Type r0 = r0.resolved
            r1 = r5
            javassist.bytecode.analysis.Type r1 = r1.resolved
            boolean r0 = r0.equals(r1)
            return r0
        L21:
            r0 = r5
            javassist.bytecode.analysis.Type r0 = r0.resolved
            if (r0 == 0) goto L2a
            r0 = 0
            return r0
        L2a:
            r0 = r3
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.interfaces
            java.util.Set r0 = r0.keySet()
            r1 = r5
            java.util.Map<java.lang.String, javassist.CtClass> r1 = r1.interfaces
            java.util.Set r1 = r1.keySet()
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // javassist.bytecode.analysis.Type
    public java.lang.String toString() {
            r4 = this;
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.resolved
            if (r0 == 0) goto Lf
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.resolved
            java.lang.String r0 = r0.toString()
            return r0
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.util.Map<java.lang.String, javassist.CtClass> r0 = r0.interfaces
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L2d:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L4e
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r5
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L2d
        L4e:
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.potentialClass
            if (r0 == 0) goto L69
            r0 = r5
            r1 = 42
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            javassist.bytecode.analysis.Type r1 = r1.potentialClass
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L73
        L69:
            r0 = r5
            r1 = r5
            int r1 = r1.length()
            r2 = 2
            int r1 = r1 - r2
            r0.setLength(r1)
        L73:
            r0 = r5
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }
}
