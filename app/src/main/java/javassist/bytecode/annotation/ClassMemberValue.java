package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/ClassMemberValue.class */
public class ClassMemberValue extends javassist.bytecode.annotation.MemberValue {
    int valueIndex;

    public ClassMemberValue(int r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r1 = 99
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.valueIndex = r1
            return
    }

    public ClassMemberValue(java.lang.String r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r1 = 99
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.setValue(r1)
            return
    }

    public ClassMemberValue(javassist.bytecode.ConstPool r5) {
            r4 = this;
            r0 = r4
            r1 = 99
            r2 = r5
            r0.<init>(r1, r2)
            r0 = r4
            java.lang.String r1 = "java.lang.Class"
            r0.setValue(r1)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Object getValue(java.lang.ClassLoader r4, javassist.ClassPool r5, java.lang.reflect.Method r6) throws java.lang.ClassNotFoundException {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.getValue()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            java.lang.Class r0 = java.lang.Void.TYPE
            return r0
        L14:
            r0 = r7
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22
            java.lang.Class r0 = java.lang.Integer.TYPE
            return r0
        L22:
            r0 = r7
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            java.lang.Class r0 = java.lang.Byte.TYPE
            return r0
        L30:
            r0 = r7
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            java.lang.Class r0 = java.lang.Long.TYPE
            return r0
        L3e:
            r0 = r7
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            java.lang.Class r0 = java.lang.Double.TYPE
            return r0
        L4c:
            r0 = r7
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            java.lang.Class r0 = java.lang.Float.TYPE
            return r0
        L5a:
            r0 = r7
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L68
            java.lang.Class r0 = java.lang.Character.TYPE
            return r0
        L68:
            r0 = r7
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L76
            java.lang.Class r0 = java.lang.Short.TYPE
            return r0
        L76:
            r0 = r7
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L84
            java.lang.Class r0 = java.lang.Boolean.TYPE
            return r0
        L84:
            r0 = r4
            r1 = r7
            java.lang.Class r0 = loadClass(r0, r1)
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Class<?> getType(java.lang.ClassLoader r4) throws java.lang.ClassNotFoundException {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "java.lang.Class"
            java.lang.Class r0 = loadClass(r0, r1)
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void renameClass(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.cp
            r1 = r4
            int r1 = r1.valueIndex
            java.lang.String r0 = r0.getUtf8Info(r1)
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = r6
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1, r2)
            r8 = r0
            r0 = r4
            r1 = r8
            java.lang.String r1 = javassist.bytecode.Descriptor.toClassName(r1)
            r0.setValue(r1)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void renameClass(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.cp
            r1 = r3
            int r1 = r1.valueIndex
            java.lang.String r0 = r0.getUtf8Info(r1)
            r5 = r0
            r0 = r5
            r1 = r4
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
            r6 = r0
            r0 = r3
            r1 = r6
            java.lang.String r1 = javassist.bytecode.Descriptor.toClassName(r1)
            r0.setValue(r1)
            return
    }

    public java.lang.String getValue() {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.cp
            r1 = r4
            int r1 = r1.valueIndex
            java.lang.String r0 = r0.getUtf8Info(r1)
            r5 = r0
            r0 = r5
            javassist.bytecode.SignatureAttribute$Type r0 = javassist.bytecode.SignatureAttribute.toTypeSignature(r0)     // Catch: javassist.bytecode.BadBytecode -> L14
            java.lang.String r0 = r0.jvmTypeName()     // Catch: javassist.bytecode.BadBytecode -> L14
            return r0
        L14:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    public void setValue(java.lang.String r5) {
            r4 = this;
            r0 = r5
            java.lang.String r0 = javassist.bytecode.Descriptor.of(r0)
            r6 = r0
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.cp
            r2 = r6
            int r1 = r1.addUtf8Info(r2)
            r0.valueIndex = r1
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            java.lang.String r1 = r1.getValue()
            r2 = 36
            r3 = 46
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void write(javassist.bytecode.annotation.AnnotationsWriter r5) throws java.io.IOException {
            r4 = this;
            r0 = r5
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.cp
            r2 = r4
            int r2 = r2.valueIndex
            java.lang.String r1 = r1.getUtf8Info(r2)
            r0.classInfoIndex(r1)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void accept(javassist.bytecode.annotation.MemberValueVisitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.visitClassMemberValue(r1)
            return
    }
}
