package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/ShortMemberValue.class */
public class ShortMemberValue extends javassist.bytecode.annotation.MemberValue {
    int valueIndex;

    public ShortMemberValue(int r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r1 = 83
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.valueIndex = r1
            return
    }

    public ShortMemberValue(short r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r1 = 83
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.setValue(r1)
            return
    }

    public ShortMemberValue(javassist.bytecode.ConstPool r5) {
            r4 = this;
            r0 = r4
            r1 = 83
            r2 = r5
            r0.<init>(r1, r2)
            r0 = r4
            r1 = 0
            r0.setValue(r1)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Object getValue(java.lang.ClassLoader r3, javassist.ClassPool r4, java.lang.reflect.Method r5) {
            r2 = this;
            r0 = r2
            short r0 = r0.getValue()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Class<?> getType(java.lang.ClassLoader r3) {
            r2 = this;
            java.lang.Class r0 = java.lang.Short.TYPE
            return r0
    }

    public short getValue() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.cp
            r1 = r3
            int r1 = r1.valueIndex
            int r0 = r0.getIntegerInfo(r1)
            short r0 = (short) r0
            return r0
    }

    public void setValue(short r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.cp
            r2 = r5
            int r1 = r1.addIntegerInfo(r2)
            r0.valueIndex = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            short r0 = r0.getValue()
            java.lang.String r0 = java.lang.Short.toString(r0)
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void write(javassist.bytecode.annotation.AnnotationsWriter r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = r3
            short r1 = r1.getValue()
            r0.constValueIndex(r1)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void accept(javassist.bytecode.annotation.MemberValueVisitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.visitShortMemberValue(r1)
            return
    }
}
