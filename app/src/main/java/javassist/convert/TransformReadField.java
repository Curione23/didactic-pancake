package javassist.convert;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/convert/TransformReadField.class */
public class TransformReadField extends javassist.convert.Transformer {
    protected java.lang.String fieldname;
    protected javassist.CtClass fieldClass;
    protected boolean isPrivate;
    protected java.lang.String methodClassname;
    protected java.lang.String methodName;

    public TransformReadField(javassist.convert.Transformer r4, javassist.CtField r5, java.lang.String r6, java.lang.String r7) {
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
            r1 = r6
            r0.methodClassname = r1
            r0 = r3
            r1 = r7
            r0.methodName = r1
            r0 = r3
            r1 = r5
            int r1 = r1.getModifiers()
            boolean r1 = javassist.Modifier.isPrivate(r1)
            r0.isPrivate = r1
            return
    }

    static java.lang.String isField(javassist.ClassPool r4, javassist.bytecode.ConstPool r5, javassist.CtClass r6, java.lang.String r7, boolean r8, int r9) {
            r0 = r5
            r1 = r9
            java.lang.String r0 = r0.getFieldrefName(r1)
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r4
            r1 = r5
            r2 = r9
            java.lang.String r1 = r1.getFieldrefClassName(r2)     // Catch: javassist.NotFoundException -> L3a
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L3a
            r10 = r0
            r0 = r10
            r1 = r6
            if (r0 == r1) goto L30
            r0 = r8
            if (r0 != 0) goto L37
            r0 = r10
            r1 = r6
            r2 = r7
            boolean r0 = isFieldInSuper(r0, r1, r2)     // Catch: javassist.NotFoundException -> L3a
            if (r0 == 0) goto L37
        L30:
            r0 = r5
            r1 = r9
            java.lang.String r0 = r0.getFieldrefType(r1)     // Catch: javassist.NotFoundException -> L3a
            return r0
        L37:
            goto L3c
        L3a:
            r10 = move-exception
        L3c:
            r0 = 0
            return r0
    }

    static boolean isFieldInSuper(javassist.CtClass r3, javassist.CtClass r4, java.lang.String r5) {
            r0 = r3
            r1 = r4
            boolean r0 = r0.subclassOf(r1)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r3
            r1 = r5
            javassist.CtField r0 = r0.getField(r1)     // Catch: javassist.NotFoundException -> L1e
            r6 = r0
            r0 = r6
            javassist.CtClass r0 = r0.getDeclaringClass()     // Catch: javassist.NotFoundException -> L1e
            r1 = r4
            if (r0 != r1) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
        L1e:
            r6 = move-exception
            r0 = 0
            return r0
    }

    @Override // javassist.convert.Transformer
    public int transform(javassist.CtClass r8, int r9, javassist.bytecode.CodeIterator r10, javassist.bytecode.ConstPool r11) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = r10
            r1 = r9
            int r0 = r0.byteAt(r1)
            r12 = r0
            r0 = r12
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 == r1) goto L17
            r0 = r12
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 != r1) goto L9f
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
            if (r0 == 0) goto L9f
            r0 = r12
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 != r1) goto L5c
            r0 = r10
            r1 = r9
            r0.move(r1)
            r0 = r10
            r1 = 1
            int r0 = r0.insertGap(r1)
            r9 = r0
            r0 = r10
            r1 = 1
            r2 = r9
            r0.writeByte(r1, r2)
            r0 = r10
            int r0 = r0.next()
            r9 = r0
        L5c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "(Ljava/lang/Object;)"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r14
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15 = r0
            r0 = r11
            r1 = r7
            java.lang.String r1 = r1.methodClassname
            int r0 = r0.addClassInfo(r1)
            r16 = r0
            r0 = r11
            r1 = r16
            r2 = r7
            java.lang.String r2 = r2.methodName
            r3 = r15
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
            r0 = r9
            return r0
        L9f:
            r0 = r9
            return r0
    }
}
