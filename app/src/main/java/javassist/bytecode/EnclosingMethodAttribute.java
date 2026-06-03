package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/EnclosingMethodAttribute.class */
public class EnclosingMethodAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "EnclosingMethod";

    EnclosingMethodAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public EnclosingMethodAttribute(javassist.bytecode.ConstPool r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "EnclosingMethod"
            r0.<init>(r1, r2)
            r0 = r6
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            r10 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = r0.addNameAndTypeInfo(r1, r2)
            r11 = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r12 = r0
            r0 = r12
            r1 = 0
            r2 = r10
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r12
            r1 = 1
            r2 = r10
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r12
            r1 = 2
            r2 = r11
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r12
            r1 = 3
            r2 = r11
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r12
            r0.set(r1)
            return
    }

    public EnclosingMethodAttribute(javassist.bytecode.ConstPool r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "EnclosingMethod"
            r0.<init>(r1, r2)
            r0 = r6
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r10 = r0
            r0 = r10
            r1 = 0
            r2 = r8
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r10
            r1 = 1
            r2 = r8
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r10
            r1 = 2
            r2 = r9
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r10
            r1 = 3
            r2 = r9
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r10
            r0.set(r1)
            return
    }

    public int classIndex() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.get()
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public int methodIndex() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.get()
            r1 = 2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public java.lang.String className() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r3
            int r1 = r1.classIndex()
            java.lang.String r0 = r0.getClassInfo(r1)
            return r0
    }

    public java.lang.String methodName() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r4 = r0
            r0 = r3
            int r0 = r0.methodIndex()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L11
            java.lang.String r0 = "<clinit>"
            return r0
        L11:
            r0 = r4
            r1 = r5
            int r0 = r0.getNameAndTypeName(r1)
            r6 = r0
            r0 = r4
            r1 = r6
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public java.lang.String methodDescriptor() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r4 = r0
            r0 = r3
            int r0 = r0.methodIndex()
            r5 = r0
            r0 = r4
            r1 = r5
            int r0 = r0.getNameAndTypeDescriptor(r1)
            r6 = r0
            r0 = r4
            r1 = r6
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r8, java.util.Map<java.lang.String, java.lang.String> r9) {
            r7 = this;
            r0 = r7
            int r0 = r0.methodIndex()
            if (r0 != 0) goto L14
            javassist.bytecode.EnclosingMethodAttribute r0 = new javassist.bytecode.EnclosingMethodAttribute
            r1 = r0
            r2 = r8
            r3 = r7
            java.lang.String r3 = r3.className()
            r1.<init>(r2, r3)
            return r0
        L14:
            javassist.bytecode.EnclosingMethodAttribute r0 = new javassist.bytecode.EnclosingMethodAttribute
            r1 = r0
            r2 = r8
            r3 = r7
            java.lang.String r3 = r3.className()
            r4 = r7
            java.lang.String r4 = r4.methodName()
            r5 = r7
            java.lang.String r5 = r5.methodDescriptor()
            r1.<init>(r2, r3, r4, r5)
            return r0
    }
}
