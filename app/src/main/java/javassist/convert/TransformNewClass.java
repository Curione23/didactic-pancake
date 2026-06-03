package javassist.convert;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/convert/TransformNewClass.class */
public final class TransformNewClass extends javassist.convert.Transformer {
    private int nested;
    private java.lang.String classname;
    private java.lang.String newClassName;
    private int newClassIndex;
    private int newMethodNTIndex;
    private int newMethodIndex;

    public TransformNewClass(javassist.convert.Transformer r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.classname = r1
            r0 = r3
            r1 = r6
            r0.newClassName = r1
            return
    }

    @Override // javassist.convert.Transformer
    public void initialize(javassist.bytecode.ConstPool r7, javassist.bytecode.CodeAttribute r8) {
            r6 = this;
            r0 = r6
            r1 = 0
            r0.nested = r1
            r0 = r6
            r1 = r6
            r2 = r6
            r3 = 0
            r4 = r3; r3 = r2; r2 = r4; 
            r3.newMethodIndex = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.newMethodNTIndex = r3
            r0.newClassIndex = r1
            return
    }

    @Override // javassist.convert.Transformer
    public int transform(javassist.CtClass r6, int r7, javassist.bytecode.CodeIterator r8, javassist.bytecode.ConstPool r9) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r8
            r1 = r7
            int r0 = r0.byteAt(r1)
            r11 = r0
            r0 = r11
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 != r1) goto L6b
            r0 = r8
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r10 = r0
            r0 = r9
            r1 = r10
            java.lang.String r0 = r0.getClassInfo(r1)
            r1 = r5
            java.lang.String r1 = r1.classname
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld1
            r0 = r8
            r1 = r7
            r2 = 3
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r1 = 89
            if (r0 == r1) goto L3f
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "NEW followed by no DUP was found"
            r1.<init>(r2)
            throw r0
        L3f:
            r0 = r5
            int r0 = r0.newClassIndex
            if (r0 != 0) goto L53
            r0 = r5
            r1 = r9
            r2 = r5
            java.lang.String r2 = r2.newClassName
            int r1 = r1.addClassInfo(r2)
            r0.newClassIndex = r1
        L53:
            r0 = r8
            r1 = r5
            int r1 = r1.newClassIndex
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            r0 = r5
            r1 = r0
            int r1 = r1.nested
            r2 = 1
            int r1 = r1 + r2
            r0.nested = r1
            goto Ld1
        L6b:
            r0 = r11
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 != r1) goto Ld1
            r0 = r8
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r10 = r0
            r0 = r9
            r1 = r5
            java.lang.String r1 = r1.classname
            r2 = r10
            int r0 = r0.isConstructor(r1, r2)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto Ld1
            r0 = r5
            int r0 = r0.nested
            if (r0 <= 0) goto Ld1
            r0 = r9
            r1 = r10
            int r0 = r0.getMethodrefNameAndType(r1)
            r13 = r0
            r0 = r5
            int r0 = r0.newMethodNTIndex
            r1 = r13
            if (r0 == r1) goto Lbc
            r0 = r5
            r1 = r13
            r0.newMethodNTIndex = r1
            r0 = r5
            r1 = r9
            r2 = r5
            int r2 = r2.newClassIndex
            r3 = r13
            int r1 = r1.addMethodrefInfo(r2, r3)
            r0.newMethodIndex = r1
        Lbc:
            r0 = r8
            r1 = r5
            int r1 = r1.newMethodIndex
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            r0 = r5
            r1 = r0
            int r1 = r1.nested
            r2 = 1
            int r1 = r1 - r2
            r0.nested = r1
        Ld1:
            r0 = r7
            return r0
    }
}
