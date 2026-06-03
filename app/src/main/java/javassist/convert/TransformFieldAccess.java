package javassist.convert;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/convert/TransformFieldAccess.class */
public final class TransformFieldAccess extends javassist.convert.Transformer {
    private java.lang.String newClassname;
    private java.lang.String newFieldname;
    private java.lang.String fieldname;
    private javassist.CtClass fieldClass;
    private boolean isPrivate;
    private int newIndex;
    private javassist.bytecode.ConstPool constPool;

    public TransformFieldAccess(javassist.convert.Transformer r4, javassist.CtField r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            javassist.CtClass r1 = r1.getDeclaringClass()
            r0.fieldClass = r1
            r0 = r3
            r1 = r5
            java.lang.String r1 = r1.getName()
            r0.fieldname = r1
            r0 = r3
            r1 = r5
            int r1 = r1.getModifiers()
            boolean r1 = javassist.Modifier.isPrivate(r1)
            r0.isPrivate = r1
            r0 = r3
            r1 = r6
            r0.newClassname = r1
            r0 = r3
            r1 = r7
            r0.newFieldname = r1
            r0 = r3
            r1 = 0
            r0.constPool = r1
            return
    }

    @Override // javassist.convert.Transformer
    public void initialize(javassist.bytecode.ConstPool r4, javassist.bytecode.CodeAttribute r5) {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r4
            if (r0 == r1) goto Ld
            r0 = r3
            r1 = 0
            r0.newIndex = r1
        Ld:
            return
    }

    @Override // javassist.convert.Transformer
    public int transform(javassist.CtClass r8, int r9, javassist.bytecode.CodeIterator r10, javassist.bytecode.ConstPool r11) {
            r7 = this;
            r0 = r10
            r1 = r9
            int r0 = r0.byteAt(r1)
            r12 = r0
            r0 = r12
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 == r1) goto L27
            r0 = r12
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 == r1) goto L27
            r0 = r12
            r1 = 181(0xb5, float:2.54E-43)
            if (r0 == r1) goto L27
            r0 = r12
            r1 = 179(0xb3, float:2.51E-43)
            if (r0 != r1) goto L87
        L27:
            r0 = r10
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r13 = r0
            r0 = r8
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r11
            r2 = r7
            javassist.CtClass r2 = r2.fieldClass
            r3 = r7
            java.lang.String r3 = r3.fieldname
            r4 = r7
            boolean r4 = r4.isPrivate
            r5 = r13
            java.lang.String r0 = javassist.convert.TransformReadField.isField(r0, r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L87
            r0 = r7
            int r0 = r0.newIndex
            if (r0 != 0) goto L7c
            r0 = r11
            r1 = r7
            java.lang.String r1 = r1.newFieldname
            r2 = r14
            int r0 = r0.addNameAndTypeInfo(r1, r2)
            r15 = r0
            r0 = r7
            r1 = r11
            r2 = r11
            r3 = r7
            java.lang.String r3 = r3.newClassname
            int r2 = r2.addClassInfo(r3)
            r3 = r15
            int r1 = r1.addFieldrefInfo(r2, r3)
            r0.newIndex = r1
            r0 = r7
            r1 = r11
            r0.constPool = r1
        L7c:
            r0 = r10
            r1 = r7
            int r1 = r1.newIndex
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
        L87:
            r0 = r9
            return r0
    }
}
