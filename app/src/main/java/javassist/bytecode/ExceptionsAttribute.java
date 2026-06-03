package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ExceptionsAttribute.class */
public class ExceptionsAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "Exceptions";

    ExceptionsAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    private ExceptionsAttribute(javassist.bytecode.ConstPool r5, javassist.bytecode.ExceptionsAttribute r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r2 = "Exceptions"
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r2 = r7
            r0.copyFrom(r1, r2)
            return
    }

    public ExceptionsAttribute(javassist.bytecode.ConstPool r8) {
            r7 = this;
            r0 = r7
            r1 = r8
            java.lang.String r2 = "Exceptions"
            r0.<init>(r1, r2)
            r0 = 2
            byte[] r0 = new byte[r0]
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r9
            r3 = 1
            r4 = 0
            r5 = r4; r4 = r3; r3 = r2; r2 = r5; 
            r3[r4] = r5
            r0[r1] = r2
            r0 = r7
            r1 = r9
            r0.info = r1
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r6 = this;
            javassist.bytecode.ExceptionsAttribute r0 = new javassist.bytecode.ExceptionsAttribute
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    private void copyFrom(javassist.bytecode.ExceptionsAttribute r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r5 = this;
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r8 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r9 = r0
            r0 = r6
            byte[] r0 = r0.info
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = r11
            byte[] r0 = new byte[r0]
            r12 = r0
            r0 = r12
            r1 = 0
            r2 = r10
            r3 = 0
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r12
            r1 = 1
            r2 = r10
            r3 = 1
            r2 = r2[r3]
            r0[r1] = r2
            r0 = 2
            r13 = r0
        L2f:
            r0 = r13
            r1 = r11
            if (r0 >= r1) goto L55
            r0 = r10
            r1 = r13
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r14 = r0
            r0 = r8
            r1 = r14
            r2 = r9
            r3 = r7
            int r0 = r0.copy(r1, r2, r3)
            r1 = r12
            r2 = r13
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            int r13 = r13 + 2
            goto L2f
        L55:
            r0 = r5
            r1 = r12
            r0.info = r1
            return
    }

    public int[] getExceptionIndexes() {
            r7 = this;
            r0 = r7
            byte[] r0 = r0.info
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = r9
            r1 = 2
            if (r0 > r1) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r9
            r1 = 2
            int r0 = r0 / r1
            r1 = 1
            int r0 = r0 - r1
            int[] r0 = new int[r0]
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = 2
            r12 = r0
        L1d:
            r0 = r12
            r1 = r9
            if (r0 >= r1) goto L46
            r0 = r10
            r1 = r11
            int r11 = r11 + 1
            r2 = r8
            r3 = r12
            r2 = r2[r3]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r3 = 8
            int r2 = r2 << r3
            r3 = r8
            r4 = r12
            r5 = 1
            int r4 = r4 + r5
            r3 = r3[r4]
            r4 = 255(0xff, float:3.57E-43)
            r3 = r3 & r4
            r2 = r2 | r3
            r0[r1] = r2
            int r12 = r12 + 2
            goto L1d
        L46:
            r0 = r10
            return r0
    }

    public java.lang.String[] getExceptions() {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.info
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = r7
            r1 = 2
            if (r0 > r1) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r7
            r1 = 2
            int r0 = r0 / r1
            r1 = 1
            int r0 = r0 - r1
            java.lang.String[] r0 = new java.lang.String[r0]
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 2
            r10 = r0
        L1e:
            r0 = r10
            r1 = r7
            if (r0 >= r1) goto L52
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 << r1
            r1 = r6
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            r11 = r0
            r0 = r8
            r1 = r9
            int r9 = r9 + 1
            r2 = r5
            javassist.bytecode.ConstPool r2 = r2.constPool
            r3 = r11
            java.lang.String r2 = r2.getClassInfo(r3)
            r0[r1] = r2
            int r10 = r10 + 2
            goto L1e
        L52:
            r0 = r8
            return r0
    }

    public void setExceptionIndexes(int[] r6) {
            r5 = this;
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = r7
            r1 = 2
            int r0 = r0 * r1
            r1 = 2
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            r8 = r0
            r0 = r7
            r1 = r8
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = 0
            r9 = r0
        L14:
            r0 = r9
            r1 = r7
            if (r0 >= r1) goto L2e
            r0 = r6
            r1 = r9
            r0 = r0[r1]
            r1 = r8
            r2 = r9
            r3 = 2
            int r2 = r2 * r3
            r3 = 2
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            int r9 = r9 + 1
            goto L14
        L2e:
            r0 = r5
            r1 = r8
            r0.info = r1
            return
    }

    public void setExceptions(java.lang.String[] r6) {
            r5 = this;
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = r7
            r1 = 2
            int r0 = r0 * r1
            r1 = 2
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            r8 = r0
            r0 = r7
            r1 = r8
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = 0
            r9 = r0
        L14:
            r0 = r9
            r1 = r7
            if (r0 >= r1) goto L35
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r6
            r2 = r9
            r1 = r1[r2]
            int r0 = r0.addClassInfo(r1)
            r1 = r8
            r2 = r9
            r3 = 2
            int r2 = r2 * r3
            r3 = 2
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            int r9 = r9 + 1
            goto L14
        L35:
            r0 = r5
            r1 = r8
            r0.info = r1
            return
    }

    public int tableLength() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.info
            int r0 = r0.length
            r1 = 2
            int r0 = r0 / r1
            r1 = 1
            int r0 = r0 - r1
            return r0
    }

    public int getException(int r6) {
            r5 = this;
            r0 = r6
            r1 = 2
            int r0 = r0 * r1
            r1 = 2
            int r0 = r0 + r1
            r7 = r0
            r0 = r5
            byte[] r0 = r0.info
            r1 = r7
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 << r1
            r1 = r5
            byte[] r1 = r1.info
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }
}
