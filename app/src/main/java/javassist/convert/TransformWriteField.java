package javassist.convert;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/convert/TransformWriteField.class */
public final class TransformWriteField extends javassist.convert.TransformReadField {
    public TransformWriteField(javassist.convert.Transformer r7, javassist.CtField r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // javassist.convert.TransformReadField, javassist.convert.Transformer
    public int transform(javassist.CtClass r8, int r9, javassist.bytecode.CodeIterator r10, javassist.bytecode.ConstPool r11) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = r10
            r1 = r9
            int r0 = r0.byteAt(r1)
            r12 = r0
            r0 = r12
            r1 = 181(0xb5, float:2.54E-43)
            if (r0 == r1) goto L17
            r0 = r12
            r1 = 179(0xb3, float:2.51E-43)
            if (r0 != r1) goto L100
        L17:
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
            java.lang.String r0 = isField(r0, r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L100
            r0 = r12
            r1 = 179(0xb3, float:2.51E-43)
            if (r0 != r1) goto Lba
            r0 = r10
            javassist.bytecode.CodeAttribute r0 = r0.get()
            r15 = r0
            r0 = r10
            r1 = r9
            r0.move(r1)
            r0 = r14
            r1 = 0
            char r0 = r0.charAt(r1)
            r16 = r0
            r0 = r16
            r1 = 74
            if (r0 == r1) goto L67
            r0 = r16
            r1 = 68
            if (r0 != r1) goto L94
        L67:
            r0 = r10
            r1 = 3
            int r0 = r0.insertGap(r1)
            r9 = r0
            r0 = r10
            r1 = 1
            r2 = r9
            r0.writeByte(r1, r2)
            r0 = r10
            r1 = 91
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            r0.writeByte(r1, r2)
            r0 = r10
            r1 = 87
            r2 = r9
            r3 = 2
            int r2 = r2 + r3
            r0.writeByte(r1, r2)
            r0 = r15
            r1 = r15
            int r1 = r1.getMaxStack()
            r2 = 2
            int r1 = r1 + r2
            r0.setMaxStack(r1)
            goto Lb5
        L94:
            r0 = r10
            r1 = 2
            int r0 = r0.insertGap(r1)
            r9 = r0
            r0 = r10
            r1 = 1
            r2 = r9
            r0.writeByte(r1, r2)
            r0 = r10
            r1 = 95
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            r0.writeByte(r1, r2)
            r0 = r15
            r1 = r15
            int r1 = r1.getMaxStack()
            r2 = 1
            int r1 = r1 + r2
            r0.setMaxStack(r1)
        Lb5:
            r0 = r10
            int r0 = r0.next()
            r9 = r0
        Lba:
            r0 = r11
            r1 = r7
            java.lang.String r1 = r1.methodClassname
            int r0 = r0.addClassInfo(r1)
            r15 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "(Ljava/lang/Object;"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r14
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")V"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r16 = r0
            r0 = r11
            r1 = r15
            r2 = r7
            java.lang.String r2 = r2.methodName
            r3 = r16
            int r0 = r0.addMethodrefInfo(r1, r2, r3)
            r17 = r0
            r0 = r10
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r9
            r0.writeByte(r1, r2)
            r0 = r10
            r1 = r17
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
        L100:
            r0 = r9
            return r0
    }
}
