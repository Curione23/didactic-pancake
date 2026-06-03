package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/NestHostAttribute.class */
public class NestHostAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "NestHost";

    NestHostAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    private NestHostAttribute(javassist.bytecode.ConstPool r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "NestHost"
            r3 = 2
            byte[] r3 = new byte[r3]
            r0.<init>(r1, r2, r3)
            r0 = r7
            r1 = r5
            byte[] r1 = r1.get()
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.get()
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r8 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r8
            r2 = r6
            r3 = r7
            int r0 = r0.copy(r1, r2, r3)
            r9 = r0
            javassist.bytecode.NestHostAttribute r0 = new javassist.bytecode.NestHostAttribute
            r1 = r0
            r2 = r6
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public int hostClassIndex() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.info
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }
}
