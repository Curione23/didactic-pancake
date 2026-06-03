package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/StringMemberValue.class */
public class StringMemberValue extends javassist.bytecode.annotation.MemberValue {
    int valueIndex;

    public StringMemberValue(int r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r1 = 115(0x73, float:1.61E-43)
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.valueIndex = r1
            return
    }

    public StringMemberValue(java.lang.String r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r1 = 115(0x73, float:1.61E-43)
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.setValue(r1)
            return
    }

    public StringMemberValue(javassist.bytecode.ConstPool r5) {
            r4 = this;
            r0 = r4
            r1 = 115(0x73, float:1.61E-43)
            r2 = r5
            r0.<init>(r1, r2)
            r0 = r4
            java.lang.String r1 = ""
            r0.setValue(r1)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Object getValue(java.lang.ClassLoader r3, javassist.ClassPool r4, java.lang.reflect.Method r5) {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getValue()
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Class<?> getType(java.lang.ClassLoader r3) {
            r2 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            return r0
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
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.getValue()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void write(javassist.bytecode.annotation.AnnotationsWriter r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.getValue()
            r0.constValueIndex(r1)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void accept(javassist.bytecode.annotation.MemberValueVisitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.visitStringMemberValue(r1)
            return
    }
}
