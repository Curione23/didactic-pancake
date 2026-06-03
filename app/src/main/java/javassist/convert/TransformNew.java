package javassist.convert;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/convert/TransformNew.class */
public final class TransformNew extends javassist.convert.Transformer {
    private int nested;
    private java.lang.String classname;
    private java.lang.String trapClass;
    private java.lang.String trapMethod;

    public TransformNew(javassist.convert.Transformer r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.classname = r1
            r0 = r3
            r1 = r6
            r0.trapClass = r1
            r0 = r3
            r1 = r7
            r0.trapMethod = r1
            return
    }

    @Override // javassist.convert.Transformer
    public void initialize(javassist.bytecode.ConstPool r4, javassist.bytecode.CodeAttribute r5) {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.nested = r1
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
            if (r0 != r1) goto L9c
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
            if (r0 == 0) goto Leb
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
            r0 = r8
            r1 = 0
            r2 = r7
            r0.writeByte(r1, r2)
            r0 = r8
            r1 = 0
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r0.writeByte(r1, r2)
            r0 = r8
            r1 = 0
            r2 = r7
            r3 = 2
            int r2 = r2 + r3
            r0.writeByte(r1, r2)
            r0 = r8
            r1 = 0
            r2 = r7
            r3 = 3
            int r2 = r2 + r3
            r0.writeByte(r1, r2)
            r0 = r5
            r1 = r0
            int r1 = r1.nested
            r2 = 1
            int r1 = r1 + r2
            r0.nested = r1
            r0 = r8
            javassist.bytecode.CodeAttribute r0 = r0.get()
            java.lang.String r1 = "StackMapTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.StackMapTable r0 = (javassist.bytecode.StackMapTable) r0
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L80
            r0 = r12
            r1 = r7
            r0.removeNew(r1)
        L80:
            r0 = r8
            javassist.bytecode.CodeAttribute r0 = r0.get()
            java.lang.String r1 = "StackMap"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.StackMap r0 = (javassist.bytecode.StackMap) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L99
            r0 = r13
            r1 = r7
            r0.removeNew(r1)
        L99:
            goto Leb
        L9c:
            r0 = r11
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 != r1) goto Leb
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
            if (r0 == 0) goto Leb
            r0 = r5
            int r0 = r0.nested
            if (r0 <= 0) goto Leb
            r0 = r5
            r1 = r12
            r2 = r9
            int r0 = r0.computeMethodref(r1, r2)
            r13 = r0
            r0 = r8
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r7
            r0.writeByte(r1, r2)
            r0 = r8
            r1 = r13
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
        Leb:
            r0 = r7
            return r0
    }

    private int computeMethodref(int r7, javassist.bytecode.ConstPool r8) {
            r6 = this;
            r0 = r8
            r1 = r6
            java.lang.String r1 = r1.trapClass
            int r0 = r0.addClassInfo(r1)
            r9 = r0
            r0 = r8
            r1 = r6
            java.lang.String r1 = r1.trapMethod
            int r0 = r0.addUtf8Info(r1)
            r10 = r0
            r0 = r8
            r1 = r6
            java.lang.String r1 = r1.classname
            r2 = r8
            r3 = r7
            java.lang.String r2 = r2.getUtf8Info(r3)
            java.lang.String r1 = javassist.bytecode.Descriptor.changeReturnType(r1, r2)
            int r0 = r0.addUtf8Info(r1)
            r7 = r0
            r0 = r8
            r1 = r9
            r2 = r8
            r3 = r10
            r4 = r7
            int r2 = r2.addNameAndTypeInfo(r3, r4)
            int r0 = r0.addMethodrefInfo(r1, r2)
            return r0
    }
}
