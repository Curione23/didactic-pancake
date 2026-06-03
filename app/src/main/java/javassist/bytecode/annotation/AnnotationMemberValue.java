package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/AnnotationMemberValue.class */
public class AnnotationMemberValue extends javassist.bytecode.annotation.MemberValue {
    javassist.bytecode.annotation.Annotation value;

    public AnnotationMemberValue(javassist.bytecode.ConstPool r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = r5
            r0.<init>(r1, r2)
            return
    }

    public AnnotationMemberValue(javassist.bytecode.annotation.Annotation r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r1 = 64
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.value = r1
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Object getValue(java.lang.ClassLoader r6, javassist.ClassPool r7, java.lang.reflect.Method r8) throws java.lang.ClassNotFoundException {
            r5 = this;
            r0 = r6
            r1 = r5
            r2 = r6
            java.lang.Class r1 = r1.getType(r2)
            r2 = r7
            r3 = r5
            javassist.bytecode.annotation.Annotation r3 = r3.value
            java.lang.Object r0 = javassist.bytecode.annotation.AnnotationImpl.make(r0, r1, r2, r3)
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Class<?> getType(java.lang.ClassLoader r5) throws java.lang.ClassNotFoundException {
            r4 = this;
            r0 = r4
            javassist.bytecode.annotation.Annotation r0 = r0.value
            if (r0 != 0) goto L11
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            java.lang.String r2 = "no type specified"
            r1.<init>(r2)
            throw r0
        L11:
            r0 = r5
            r1 = r4
            javassist.bytecode.annotation.Annotation r1 = r1.value
            java.lang.String r1 = r1.getTypeName()
            java.lang.Class r0 = loadClass(r0, r1)
            return r0
    }

    public javassist.bytecode.annotation.Annotation getValue() {
            r2 = this;
            r0 = r2
            javassist.bytecode.annotation.Annotation r0 = r0.value
            return r0
    }

    public void setValue(javassist.bytecode.annotation.Annotation r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.value = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            javassist.bytecode.annotation.Annotation r0 = r0.value
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void write(javassist.bytecode.annotation.AnnotationsWriter r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r0.annotationValue()
            r0 = r3
            javassist.bytecode.annotation.Annotation r0 = r0.value
            r1 = r4
            r0.write(r1)
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void accept(javassist.bytecode.annotation.MemberValueVisitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.visitAnnotationMemberValue(r1)
            return
    }
}
