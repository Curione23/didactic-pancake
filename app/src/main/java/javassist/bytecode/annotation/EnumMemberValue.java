package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/EnumMemberValue.class */
public class EnumMemberValue extends javassist.bytecode.annotation.MemberValue {
    int typeIndex;
    int valueIndex;

    public EnumMemberValue(int r5, int r6, javassist.bytecode.ConstPool r7) {
            r4 = this;
            r0 = r4
            r1 = 101(0x65, float:1.42E-43)
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.typeIndex = r1
            r0 = r4
            r1 = r6
            r0.valueIndex = r1
            return
    }

    public EnumMemberValue(javassist.bytecode.ConstPool r6) {
            r5 = this;
            r0 = r5
            r1 = 101(0x65, float:1.42E-43)
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r5
            r1 = r5
            r2 = 0
            r3 = r2; r2 = r1; r1 = r3; 
            r2.valueIndex = r3
            r0.typeIndex = r1
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Object getValue(java.lang.ClassLoader r6, javassist.ClassPool r7, java.lang.reflect.Method r8) throws java.lang.ClassNotFoundException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Class r0 = r0.getType(r1)     // Catch: java.lang.NoSuchFieldException -> L11 java.lang.IllegalAccessException -> L38
            r1 = r5
            java.lang.String r1 = r1.getValue()     // Catch: java.lang.NoSuchFieldException -> L11 java.lang.IllegalAccessException -> L38
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.NoSuchFieldException -> L11 java.lang.IllegalAccessException -> L38
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NoSuchFieldException -> L11 java.lang.IllegalAccessException -> L38
            return r0
        L11:
            r9 = move-exception
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r5
            java.lang.String r3 = r3.getType()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getValue()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L38:
            r9 = move-exception
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r5
            java.lang.String r3 = r3.getType()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getValue()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Class<?> getType(java.lang.ClassLoader r4) throws java.lang.ClassNotFoundException {
            r3 = this;
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.getType()
            java.lang.Class r0 = loadClass(r0, r1)
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void renameClass(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.cp
            r1 = r4
            int r1 = r1.typeIndex
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
            r0.setType(r1)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void renameClass(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.cp
            r1 = r3
            int r1 = r1.typeIndex
            java.lang.String r0 = r0.getUtf8Info(r1)
            r5 = r0
            r0 = r5
            r1 = r4
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
            r6 = r0
            r0 = r3
            r1 = r6
            java.lang.String r1 = javassist.bytecode.Descriptor.toClassName(r1)
            r0.setType(r1)
            return
    }

    public java.lang.String getType() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.cp
            r1 = r3
            int r1 = r1.typeIndex
            java.lang.String r0 = r0.getUtf8Info(r1)
            java.lang.String r0 = javassist.bytecode.Descriptor.toClassName(r0)
            return r0
    }

    public void setType(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.cp
            r2 = r5
            java.lang.String r2 = javassist.bytecode.Descriptor.of(r2)
            int r1 = r1.addUtf8Info(r2)
            r0.typeIndex = r1
            return
    }

    public java.lang.String getValue() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.cp
            r1 = r3
            int r1 = r1.valueIndex
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public void setValue(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.cp
            r2 = r5
            int r1 = r1.addUtf8Info(r2)
            r0.valueIndex = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.String r1 = r1.getType()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.getValue()
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
            int r2 = r2.typeIndex
            java.lang.String r1 = r1.getUtf8Info(r2)
            r2 = r4
            java.lang.String r2 = r2.getValue()
            r0.enumConstValue(r1, r2)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void accept(javassist.bytecode.annotation.MemberValueVisitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.visitEnumMemberValue(r1)
            return
    }
}
