package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SourceFileAttribute.class */
public class SourceFileAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "SourceFile";

    SourceFileAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public SourceFileAttribute(javassist.bytecode.ConstPool r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "SourceFile"
            r0.<init>(r1, r2)
            r0 = r6
            r1 = r7
            int r0 = r0.addUtf8Info(r1)
            r8 = r0
            r0 = 2
            byte[] r0 = new byte[r0]
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r8
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = 1
            r2 = r8
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r9
            r0.set(r1)
            return
    }

    public java.lang.String getFileName() {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r4
            byte[] r1 = r1.get()
            r2 = 0
            int r1 = javassist.bytecode.ByteArray.readU16bit(r1, r2)
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r5 = this;
            javassist.bytecode.SourceFileAttribute r0 = new javassist.bytecode.SourceFileAttribute
            r1 = r0
            r2 = r6
            r3 = r5
            java.lang.String r3 = r3.getFileName()
            r1.<init>(r2, r3)
            return r0
    }
}
