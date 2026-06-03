package javassist.convert;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/convert/TransformCallToStatic.class */
public class TransformCallToStatic extends javassist.convert.TransformCall {
    public TransformCallToStatic(javassist.convert.Transformer r6, javassist.CtMethod r7, javassist.CtMethod r8) {
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
            return
    }

    @Override // javassist.convert.TransformCall
    protected int match(int r6, int r7, javassist.bytecode.CodeIterator r8, int r9, javassist.bytecode.ConstPool r10) {
            r5 = this;
            r0 = r5
            int r0 = r0.newIndex
            if (r0 != 0) goto L3f
            r0 = r5
            java.lang.String r0 = r0.classname
            r1 = r5
            java.lang.String r1 = r1.methodDescriptor
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
        L3f:
            r0 = r8
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r7
            r0.writeByte(r1, r2)
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
