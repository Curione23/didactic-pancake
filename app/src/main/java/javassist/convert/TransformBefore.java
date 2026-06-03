package javassist.convert;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/convert/TransformBefore.class */
public class TransformBefore extends javassist.convert.TransformCall {
    protected javassist.CtClass[] parameterTypes;
    protected int locals;
    protected int maxLocals;
    protected byte[] saveCode;
    protected byte[] loadCode;

    public TransformBefore(javassist.convert.Transformer r6, javassist.CtMethod r7, javassist.CtMethod r8) throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            r0 = r5
            r1 = r7
            javassist.bytecode.MethodInfo r1 = r1.getMethodInfo2()
            java.lang.String r1 = r1.getDescriptor()
            r0.methodDescriptor = r1
            r0 = r5
            r1 = r7
            javassist.CtClass[] r1 = r1.getParameterTypes()
            r0.parameterTypes = r1
            r0 = r5
            r1 = 0
            r0.locals = r1
            r0 = r5
            r1 = 0
            r0.maxLocals = r1
            r0 = r5
            r1 = r5
            r2 = 0
            r3 = r2; r2 = r1; r1 = r3; 
            r2.loadCode = r3
            r0.saveCode = r1
            return
    }

    @Override // javassist.convert.TransformCall, javassist.convert.Transformer
    public void initialize(javassist.bytecode.ConstPool r6, javassist.bytecode.CodeAttribute r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            super.initialize(r1, r2)
            r0 = r5
            r1 = 0
            r0.locals = r1
            r0 = r5
            r1 = r7
            int r1 = r1.getMaxLocals()
            r0.maxLocals = r1
            r0 = r5
            r1 = r5
            r2 = 0
            r3 = r2; r2 = r1; r1 = r3; 
            r2.loadCode = r3
            r0.saveCode = r1
            return
    }

    @Override // javassist.convert.TransformCall
    protected int match(int r6, int r7, javassist.bytecode.CodeIterator r8, int r9, javassist.bytecode.ConstPool r10) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            int r0 = r0.newIndex
            if (r0 != 0) goto L58
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            javassist.CtClass[] r1 = r1.parameterTypes
            java.lang.String r1 = javassist.bytecode.Descriptor.ofParameters(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 86
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11 = r0
            r0 = r5
            java.lang.String r0 = r0.classname
            r1 = r11
            java.lang.String r0 = javassist.bytecode.Descriptor.insertParameter(r0, r1)
            r11 = r0
            r0 = r10
            r1 = r5
            java.lang.String r1 = r1.newMethodname
            r2 = r11
            int r0 = r0.addNameAndTypeInfo(r1, r2)
            r12 = r0
            r0 = r10
            r1 = r5
            java.lang.String r1 = r1.newClassname
            int r0 = r0.addClassInfo(r1)
            r13 = r0
            r0 = r5
            r1 = r10
            r2 = r13
            r3 = r12
            int r1 = r1.addMethodrefInfo(r2, r3)
            r0.newIndex = r1
            r0 = r5
            r1 = r10
            r0.constPool = r1
        L58:
            r0 = r5
            byte[] r0 = r0.saveCode
            if (r0 != 0) goto L69
            r0 = r5
            r1 = r5
            javassist.CtClass[] r1 = r1.parameterTypes
            r2 = r10
            r0.makeCode(r1, r2)
        L69:
            r0 = r5
            r1 = r7
            r2 = r8
            int r0 = r0.match2(r1, r2)
            return r0
    }

    protected int match2(int r6, javassist.bytecode.CodeIterator r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            r1 = r6
            r0.move(r1)
            r0 = r7
            r1 = r5
            byte[] r1 = r1.saveCode
            int r0 = r0.insert(r1)
            r0 = r7
            r1 = r5
            byte[] r1 = r1.loadCode
            int r0 = r0.insert(r1)
            r0 = r7
            r1 = 3
            int r0 = r0.insertGap(r1)
            r8 = r0
            r0 = r7
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r8
            r0.writeByte(r1, r2)
            r0 = r7
            r1 = r5
            int r1 = r1.newIndex
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            r0 = r7
            r1 = r5
            byte[] r1 = r1.loadCode
            int r0 = r0.insert(r1)
            r0 = r7
            int r0 = r0.next()
            return r0
    }

    @Override // javassist.convert.Transformer
    public int extraLocals() {
            r2 = this;
            r0 = r2
            int r0 = r0.locals
            return r0
    }

    protected void makeCode(javassist.CtClass[] r10, javassist.bytecode.ConstPool r11) {
            r9 = this;
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r11
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r12 = r0
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r11
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r9
            int r0 = r0.maxLocals
            r14 = r0
            r0 = r10
            if (r0 != 0) goto L25
            r0 = 0
            goto L27
        L25:
            r0 = r10
            int r0 = r0.length
        L27:
            r15 = r0
            r0 = r13
            r1 = r14
            r0.addAload(r1)
            r0 = r9
            r1 = r12
            r2 = r13
            r3 = 0
            r4 = r15
            r5 = r10
            r6 = r14
            r7 = 1
            int r6 = r6 + r7
            r0.makeCode2(r1, r2, r3, r4, r5, r6)
            r0 = r12
            r1 = r14
            r0.addAstore(r1)
            r0 = r9
            r1 = r12
            byte[] r1 = r1.get()
            r0.saveCode = r1
            r0 = r9
            r1 = r13
            byte[] r1 = r1.get()
            r0.loadCode = r1
            return
    }

    private void makeCode2(javassist.bytecode.Bytecode r10, javassist.bytecode.Bytecode r11, int r12, int r13, javassist.CtClass[] r14, int r15) {
            r9 = this;
            r0 = r12
            r1 = r13
            if (r0 >= r1) goto L32
            r0 = r11
            r1 = r15
            r2 = r14
            r3 = r12
            r2 = r2[r3]
            int r0 = r0.addLoad(r1, r2)
            r16 = r0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = 1
            int r3 = r3 + r4
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            int r6 = r6 + r7
            r0.makeCode2(r1, r2, r3, r4, r5, r6)
            r0 = r10
            r1 = r15
            r2 = r14
            r3 = r12
            r2 = r2[r3]
            int r0 = r0.addStore(r1, r2)
            goto L3d
        L32:
            r0 = r9
            r1 = r15
            r2 = r9
            int r2 = r2.maxLocals
            int r1 = r1 - r2
            r0.locals = r1
        L3d:
            return
    }
}
