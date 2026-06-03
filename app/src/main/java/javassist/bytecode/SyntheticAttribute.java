package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SyntheticAttribute.class */
public class SyntheticAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "Synthetic";

    SyntheticAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public SyntheticAttribute(javassist.bytecode.ConstPool r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "Synthetic"
            r3 = 0
            byte[] r3 = new byte[r3]
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            r4 = this;
            javassist.bytecode.SyntheticAttribute r0 = new javassist.bytecode.SyntheticAttribute
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
    }
}
