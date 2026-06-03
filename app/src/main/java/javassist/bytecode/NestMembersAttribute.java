package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/NestMembersAttribute.class */
public class NestMembersAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "NestMembers";

    NestMembersAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    private NestMembersAttribute(javassist.bytecode.ConstPool r6, byte[] r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "NestMembers"
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.get()
            r8 = r0
            r0 = r8
            int r0 = r0.length
            byte[] r0 = new byte[r0]
            r9 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r10 = r0
            r0 = r8
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r11 = r0
            r0 = r11
            r1 = r9
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = 0
            r12 = r0
            r0 = 2
            r13 = r0
        L26:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L52
            r0 = r8
            r1 = r13
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r14 = r0
            r0 = r10
            r1 = r14
            r2 = r6
            r3 = r7
            int r0 = r0.copy(r1, r2, r3)
            r15 = r0
            r0 = r15
            r1 = r9
            r2 = r13
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            int r12 = r12 + 1
            int r13 = r13 + 2
            goto L26
        L52:
            javassist.bytecode.NestMembersAttribute r0 = new javassist.bytecode.NestMembersAttribute
            r1 = r0
            r2 = r6
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public int numberOfClasses() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.info
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public int memberClass(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.info
            r1 = r5
            r2 = 2
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }
}
