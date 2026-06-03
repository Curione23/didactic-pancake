package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/LineNumberAttribute.class */
public class LineNumberAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "LineNumberTable";

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/LineNumberAttribute$Pc.class */
    public static class Pc {
        public int index;
        public int line;

        public Pc() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    LineNumberAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    private LineNumberAttribute(javassist.bytecode.ConstPool r6, byte[] r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "LineNumberTable"
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    public int tableLength() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.info
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public int startPc(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.info
            r1 = r5
            r2 = 4
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public int lineNumber(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.info
            r1 = r5
            r2 = 4
            int r1 = r1 * r2
            r2 = 4
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public int toLineNumber(int r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.tableLength()
            r6 = r0
            r0 = 0
            r7 = r0
        L7:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L25
            r0 = r5
            r1 = r4
            r2 = r7
            int r1 = r1.startPc(r2)
            if (r0 >= r1) goto L1f
            r0 = r7
            if (r0 != 0) goto L25
            r0 = r4
            r1 = 0
            int r0 = r0.lineNumber(r1)
            return r0
        L1f:
            int r7 = r7 + 1
            goto L7
        L25:
            r0 = r4
            r1 = r7
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.lineNumber(r1)
            return r0
    }

    public int toStartPc(int r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.tableLength()
            r6 = r0
            r0 = 0
            r7 = r0
        L7:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L21
            r0 = r5
            r1 = r4
            r2 = r7
            int r1 = r1.lineNumber(r2)
            if (r0 != r1) goto L1b
            r0 = r4
            r1 = r7
            int r0 = r0.startPc(r1)
            return r0
        L1b:
            int r7 = r7 + 1
            goto L7
        L21:
            r0 = -1
            return r0
    }

    public javassist.bytecode.LineNumberAttribute.Pc toNearPc(int r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.tableLength()
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            if (r0 <= 0) goto L1d
            r0 = r4
            r1 = 0
            int r0 = r0.lineNumber(r1)
            r1 = r5
            int r0 = r0 - r1
            r8 = r0
            r0 = r4
            r1 = 0
            int r0 = r0.startPc(r1)
            r7 = r0
        L1d:
            r0 = 1
            r9 = r0
        L20:
            r0 = r9
            r1 = r6
            if (r0 >= r1) goto L5e
            r0 = r4
            r1 = r9
            int r0 = r0.lineNumber(r1)
            r1 = r5
            int r0 = r0 - r1
            r10 = r0
            r0 = r10
            if (r0 >= 0) goto L3c
            r0 = r10
            r1 = r8
            if (r0 > r1) goto L4d
        L3c:
            r0 = r10
            if (r0 < 0) goto L58
            r0 = r10
            r1 = r8
            if (r0 < r1) goto L4d
            r0 = r8
            if (r0 >= 0) goto L58
        L4d:
            r0 = r10
            r8 = r0
            r0 = r4
            r1 = r9
            int r0 = r0.startPc(r1)
            r7 = r0
        L58:
            int r9 = r9 + 1
            goto L20
        L5e:
            javassist.bytecode.LineNumberAttribute$Pc r0 = new javassist.bytecode.LineNumberAttribute$Pc
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = r7
            r0.index = r1
            r0 = r9
            r1 = r5
            r2 = r8
            int r1 = r1 + r2
            r0.line = r1
            r0 = r9
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.info
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = r9
            byte[] r0 = new byte[r0]
            r10 = r0
            r0 = 0
            r11 = r0
        L12:
            r0 = r11
            r1 = r9
            if (r0 >= r1) goto L28
            r0 = r10
            r1 = r11
            r2 = r8
            r3 = r11
            r2 = r2[r3]
            r0[r1] = r2
            int r11 = r11 + 1
            goto L12
        L28:
            javassist.bytecode.LineNumberAttribute r0 = new javassist.bytecode.LineNumberAttribute
            r1 = r0
            r2 = r6
            r3 = r10
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r11
            return r0
    }

    void shiftPc(int r5, int r6, boolean r7) {
            r4 = this;
            r0 = r4
            int r0 = r0.tableLength()
            r8 = r0
            r0 = 0
            r9 = r0
        L9:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L46
            r0 = r9
            r1 = 4
            int r0 = r0 * r1
            r1 = 2
            int r0 = r0 + r1
            r10 = r0
            r0 = r4
            byte[] r0 = r0.info
            r1 = r10
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r11 = r0
            r0 = r11
            r1 = r5
            if (r0 > r1) goto L33
            r0 = r7
            if (r0 == 0) goto L40
            r0 = r11
            r1 = r5
            if (r0 != r1) goto L40
        L33:
            r0 = r11
            r1 = r6
            int r0 = r0 + r1
            r1 = r4
            byte[] r1 = r1.info
            r2 = r10
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
        L40:
            int r9 = r9 + 1
            goto L9
        L46:
            return
    }
}
