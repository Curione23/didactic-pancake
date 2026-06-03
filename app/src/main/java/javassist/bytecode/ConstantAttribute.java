package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ConstantAttribute.class */
public class ConstantAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "ConstantValue";

    ConstantAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public ConstantAttribute(javassist.bytecode.ConstPool r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "ConstantValue"
            r0.<init>(r1, r2)
            r0 = 2
            byte[] r0 = new byte[r0]
            r8 = r0
            r0 = r8
            r1 = 0
            r2 = r7
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r8
            r1 = 1
            r2 = r7
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r8
            r0.set(r1)
            return
    }

    public int getConstantValue() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.get()
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r5
            int r1 = r1.getConstantValue()
            r2 = r6
            r3 = r7
            int r0 = r0.copy(r1, r2, r3)
            r8 = r0
            javassist.bytecode.ConstantAttribute r0 = new javassist.bytecode.ConstantAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }
}
