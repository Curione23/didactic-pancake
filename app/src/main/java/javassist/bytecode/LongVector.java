package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/LongVector.class */
final class LongVector {
    static final int ASIZE = 128;
    static final int ABITS = 7;
    static final int VSIZE = 8;
    private javassist.bytecode.ConstInfo[][] objects;
    private int elements;

    public LongVector() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 8
            javassist.bytecode.ConstInfo[] r1 = new javassist.bytecode.ConstInfo[r1]
            r0.objects = r1
            r0 = r3
            r1 = 0
            r0.elements = r1
            return
    }

    public LongVector(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r4
            r1 = 7
            int r0 = r0 >> r1
            r1 = -8
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 + r1
            r5 = r0
            r0 = r3
            r1 = r5
            javassist.bytecode.ConstInfo[] r1 = new javassist.bytecode.ConstInfo[r1]
            r0.objects = r1
            r0 = r3
            r1 = 0
            r0.elements = r1
            return
    }

    public int size() {
            r2 = this;
            r0 = r2
            int r0 = r0.elements
            return r0
    }

    public int capacity() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstInfo[][] r0 = r0.objects
            int r0 = r0.length
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 * r1
            return r0
    }

    public javassist.bytecode.ConstInfo elementAt(int r5) {
            r4 = this;
            r0 = r5
            if (r0 < 0) goto Lc
            r0 = r4
            int r0 = r0.elements
            r1 = r5
            if (r0 > r1) goto Le
        Lc:
            r0 = 0
            return r0
        Le:
            r0 = r4
            javassist.bytecode.ConstInfo[][] r0 = r0.objects
            r1 = r5
            r2 = 7
            int r1 = r1 >> r2
            r0 = r0[r1]
            r1 = r5
            r2 = 127(0x7f, float:1.78E-43)
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
    }

    public void addElement(javassist.bytecode.ConstInfo r7) {
            r6 = this;
            r0 = r6
            int r0 = r0.elements
            r1 = 7
            int r0 = r0 >> r1
            r8 = r0
            r0 = r6
            int r0 = r0.elements
            r1 = 127(0x7f, float:1.78E-43)
            r0 = r0 & r1
            r9 = r0
            r0 = r6
            javassist.bytecode.ConstInfo[][] r0 = r0.objects
            int r0 = r0.length
            r10 = r0
            r0 = r8
            r1 = r10
            if (r0 < r1) goto L3a
            r0 = r10
            r1 = 8
            int r0 = r0 + r1
            javassist.bytecode.ConstInfo[] r0 = new javassist.bytecode.ConstInfo[r0]
            r11 = r0
            r0 = r6
            javassist.bytecode.ConstInfo[][] r0 = r0.objects
            r1 = 0
            r2 = r11
            r3 = 0
            r4 = r10
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r11
            r0.objects = r1
        L3a:
            r0 = r6
            javassist.bytecode.ConstInfo[][] r0 = r0.objects
            r1 = r8
            r0 = r0[r1]
            if (r0 != 0) goto L4f
            r0 = r6
            javassist.bytecode.ConstInfo[][] r0 = r0.objects
            r1 = r8
            r2 = 128(0x80, float:1.8E-43)
            javassist.bytecode.ConstInfo[] r2 = new javassist.bytecode.ConstInfo[r2]
            r0[r1] = r2
        L4f:
            r0 = r6
            javassist.bytecode.ConstInfo[][] r0 = r0.objects
            r1 = r8
            r0 = r0[r1]
            r1 = r9
            r2 = r7
            r0[r1] = r2
            r0 = r6
            r1 = r0
            int r1 = r1.elements
            r2 = 1
            int r1 = r1 + r2
            r0.elements = r1
            return
    }
}
