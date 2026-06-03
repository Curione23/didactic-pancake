package javassist.convert;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/convert/TransformCall.class */
public class TransformCall extends javassist.convert.Transformer {
    protected java.lang.String classname;
    protected java.lang.String methodname;
    protected java.lang.String methodDescriptor;
    protected java.lang.String newClassname;
    protected java.lang.String newMethodname;
    protected boolean newMethodIsPrivate;
    protected int newIndex;
    protected javassist.bytecode.ConstPool constPool;

    public TransformCall(javassist.convert.Transformer r6, javassist.CtMethod r7, javassist.CtMethod r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r2 = r2.getName()
            r3 = r8
            r0.<init>(r1, r2, r3)
            r0 = r5
            r1 = r7
            javassist.CtClass r1 = r1.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.classname = r1
            return
    }

    public TransformCall(javassist.convert.Transformer r6, java.lang.String r7, javassist.CtMethod r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r0.<init>(r1)
            r0 = r5
            r1 = r7
            r0.methodname = r1
            r0 = r5
            r1 = r8
            javassist.bytecode.MethodInfo r1 = r1.getMethodInfo2()
            java.lang.String r1 = r1.getDescriptor()
            r0.methodDescriptor = r1
            r0 = r5
            r1 = r5
            r2 = r8
            javassist.CtClass r2 = r2.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            r3 = r2; r2 = r1; r1 = r3; 
            r2.newClassname = r3
            r0.classname = r1
            r0 = r5
            r1 = r8
            java.lang.String r1 = r1.getName()
            r0.newMethodname = r1
            r0 = r5
            r1 = 0
            r0.constPool = r1
            r0 = r5
            r1 = r8
            int r1 = r1.getModifiers()
            boolean r1 = javassist.Modifier.isPrivate(r1)
            r0.newMethodIsPrivate = r1
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
    public int transform(javassist.CtClass r8, int r9, javassist.bytecode.CodeIterator r10, javassist.bytecode.ConstPool r11) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = r10
            r1 = r9
            int r0 = r0.byteAt(r1)
            r12 = r0
            r0 = r12
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 == r1) goto L27
            r0 = r12
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 == r1) goto L27
            r0 = r12
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 == r1) goto L27
            r0 = r12
            r1 = 182(0xb6, float:2.55E-43)
            if (r0 != r1) goto L6e
        L27:
            r0 = r10
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r13 = r0
            r0 = r11
            r1 = r7
            java.lang.String r1 = r1.methodname
            r2 = r7
            java.lang.String r2 = r2.methodDescriptor
            r3 = r13
            java.lang.String r0 = r0.eqMember(r1, r2, r3)
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L6e
            r0 = r7
            r1 = r14
            r2 = r8
            javassist.ClassPool r2 = r2.getClassPool()
            boolean r0 = r0.matchClass(r1, r2)
            if (r0 == 0) goto L6e
            r0 = r11
            r1 = r13
            int r0 = r0.getMemberNameAndType(r1)
            r15 = r0
            r0 = r7
            r1 = r12
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r15
            int r4 = r4.getNameAndTypeDescriptor(r5)
            r5 = r11
            int r0 = r0.match(r1, r2, r3, r4, r5)
            r9 = r0
        L6e:
            r0 = r9
            return r0
    }

    private boolean matchClass(java.lang.String r5, javassist.ClassPool r6) {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.classname
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = r6
            r1 = r5
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L4b
            r7 = r0
            r0 = r6
            r1 = r4
            java.lang.String r1 = r1.classname     // Catch: javassist.NotFoundException -> L4b
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L4b
            r8 = r0
            r0 = r7
            r1 = r8
            boolean r0 = r0.subtypeOf(r1)     // Catch: javassist.NotFoundException -> L4b
            if (r0 == 0) goto L48
            r0 = r7
            r1 = r4
            java.lang.String r1 = r1.methodname     // Catch: javassist.NotFoundException -> L44 javassist.NotFoundException -> L4b
            r2 = r4
            java.lang.String r2 = r2.methodDescriptor     // Catch: javassist.NotFoundException -> L44 javassist.NotFoundException -> L4b
            javassist.CtMethod r0 = r0.getMethod(r1, r2)     // Catch: javassist.NotFoundException -> L44 javassist.NotFoundException -> L4b
            r9 = r0
            r0 = r9
            javassist.CtClass r0 = r0.getDeclaringClass()     // Catch: javassist.NotFoundException -> L44 javassist.NotFoundException -> L4b
            java.lang.String r0 = r0.getName()     // Catch: javassist.NotFoundException -> L44 javassist.NotFoundException -> L4b
            r1 = r4
            java.lang.String r1 = r1.classname     // Catch: javassist.NotFoundException -> L44 javassist.NotFoundException -> L4b
            boolean r0 = r0.equals(r1)     // Catch: javassist.NotFoundException -> L44 javassist.NotFoundException -> L4b
            return r0
        L44:
            r9 = move-exception
            r0 = 1
            return r0
        L48:
            goto L4e
        L4b:
            r7 = move-exception
            r0 = 0
            return r0
        L4e:
            r0 = 0
            return r0
    }

    protected int match(int r6, int r7, javassist.bytecode.CodeIterator r8, int r9, javassist.bytecode.ConstPool r10) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            int r0 = r0.newIndex
            if (r0 != 0) goto L64
            r0 = r10
            r1 = r10
            r2 = r5
            java.lang.String r2 = r2.newMethodname
            int r1 = r1.addUtf8Info(r2)
            r2 = r9
            int r0 = r0.addNameAndTypeInfo(r1, r2)
            r11 = r0
            r0 = r10
            r1 = r5
            java.lang.String r1 = r1.newClassname
            int r0 = r0.addClassInfo(r1)
            r12 = r0
            r0 = r6
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 != r1) goto L3b
            r0 = r5
            r1 = r10
            r2 = r12
            r3 = r11
            int r1 = r1.addInterfaceMethodrefInfo(r2, r3)
            r0.newIndex = r1
            goto L5e
        L3b:
            r0 = r5
            boolean r0 = r0.newMethodIsPrivate
            if (r0 == 0) goto L51
            r0 = r6
            r1 = 182(0xb6, float:2.55E-43)
            if (r0 != r1) goto L51
            r0 = r8
            r1 = 183(0xb7, float:2.56E-43)
            r2 = r7
            r0.writeByte(r1, r2)
        L51:
            r0 = r5
            r1 = r10
            r2 = r12
            r3 = r11
            int r1 = r1.addMethodrefInfo(r2, r3)
            r0.newIndex = r1
        L5e:
            r0 = r5
            r1 = r10
            r0.constPool = r1
        L64:
            r0 = r8
            r1 = r5
            int r1 = r1.newIndex
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            r0 = r7
            return r0
    }
}
