package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/MethodParametersAttribute.class */
public class MethodParametersAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "MethodParameters";

    MethodParametersAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public MethodParametersAttribute(javassist.bytecode.ConstPool r6, java.lang.String[] r7, int[] r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "MethodParameters"
            r0.<init>(r1, r2)
            r0 = r7
            int r0 = r0.length
            r1 = 4
            int r0 = r0 * r1
            r1 = 1
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r7
            int r2 = r2.length
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = 0
            r10 = r0
        L1b:
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L4a
            r0 = r6
            r1 = r7
            r2 = r10
            r1 = r1[r2]
            int r0 = r0.addUtf8Info(r1)
            r1 = r9
            r2 = r10
            r3 = 4
            int r2 = r2 * r3
            r3 = 1
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r1 = r9
            r2 = r10
            r3 = 4
            int r2 = r2 * r3
            r3 = 3
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            int r10 = r10 + 1
            goto L1b
        L4a:
            r0 = r5
            r1 = r9
            r0.set(r1)
            return
    }

    public int size() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.info
            r1 = 0
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    public int name(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.info
            r1 = r5
            r2 = 4
            int r1 = r1 * r2
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public java.lang.String parameterName(int r5) {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r4
            r2 = r5
            int r1 = r1.name(r2)
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public int accessFlags(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.info
            r1 = r5
            r2 = 4
            int r1 = r1 * r2
            r2 = 3
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r6 = this;
            r0 = r6
            int r0 = r0.size()
            r9 = r0
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r10 = r0
            r0 = r9
            java.lang.String[] r0 = new java.lang.String[r0]
            r11 = r0
            r0 = r9
            int[] r0 = new int[r0]
            r12 = r0
            r0 = 0
            r13 = r0
        L19:
            r0 = r13
            r1 = r9
            if (r0 >= r1) goto L40
            r0 = r11
            r1 = r13
            r2 = r10
            r3 = r6
            r4 = r13
            int r3 = r3.name(r4)
            java.lang.String r2 = r2.getUtf8Info(r3)
            r0[r1] = r2
            r0 = r12
            r1 = r13
            r2 = r6
            r3 = r13
            int r2 = r2.accessFlags(r3)
            r0[r1] = r2
            int r13 = r13 + 1
            goto L19
        L40:
            javassist.bytecode.MethodParametersAttribute r0 = new javassist.bytecode.MethodParametersAttribute
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4)
            return r0
    }
}
