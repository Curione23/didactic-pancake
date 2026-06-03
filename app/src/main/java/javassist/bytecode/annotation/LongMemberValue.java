package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/LongMemberValue.class */
public class LongMemberValue extends javassist.bytecode.annotation.MemberValue {
    int valueIndex;

    public LongMemberValue(int r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r1 = 74
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.valueIndex = r1
            return
    }

    public LongMemberValue(long r5, javassist.bytecode.ConstPool r7) {
            r4 = this;
            r0 = r4
            r1 = 74
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.setValue(r1)
            return
    }

    public LongMemberValue(javassist.bytecode.ConstPool r5) {
            r4 = this;
            r0 = r4
            r1 = 74
            r2 = r5
            r0.<init>(r1, r2)
            r0 = r4
            r1 = 0
            r0.setValue(r1)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Object getValue(java.lang.ClassLoader r4, javassist.ClassPool r5, java.lang.reflect.Method r6) {
            r3 = this;
            r0 = r3
            long r0 = r0.getValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Class<?> getType(java.lang.ClassLoader r3) {
            r2 = this;
            java.lang.Class r0 = java.lang.Long.TYPE
            return r0
    }

    public long getValue() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.cp
            r1 = r3
            int r1 = r1.valueIndex
            long r0 = r0.getLongInfo(r1)
            return r0
    }

    public void setValue(long r6) {
            r5 = this;
            r0 = r5
            r1 = r5
            javassist.bytecode.ConstPool r1 = r1.cp
            r2 = r6
            int r1 = r1.addLongInfo(r2)
            r0.valueIndex = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            long r0 = r0.getValue()
            java.lang.String r0 = java.lang.Long.toString(r0)
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void write(javassist.bytecode.annotation.AnnotationsWriter r5) throws java.io.IOException {
            r4 = this;
            r0 = r5
            r1 = r4
            long r1 = r1.getValue()
            r0.constValueIndex(r1)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void accept(javassist.bytecode.annotation.MemberValueVisitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.visitLongMemberValue(r1)
            return
    }
}
