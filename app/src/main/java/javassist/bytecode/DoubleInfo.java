package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/DoubleInfo.class */
class DoubleInfo extends javassist.bytecode.ConstInfo {
    static final int tag = 6;
    double value;

    public DoubleInfo(double r5, int r7) {
            r4 = this;
            r0 = r4
            r1 = r7
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.value = r1
            return
    }

    public DoubleInfo(java.io.DataInputStream r5, int r6) throws java.io.IOException {
            r4 = this;
            r0 = r4
            r1 = r6
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            double r1 = r1.readDouble()
            r0.value = r1
            return
    }

    public int hashCode() {
            r6 = this;
            r0 = r6
            double r0 = r0.value
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r7 = r0
            r0 = r7
            r1 = r7
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 ^ r1
            int r0 = (int) r0
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof javassist.bytecode.DoubleInfo
            if (r0 == 0) goto L1a
            r0 = r6
            javassist.bytecode.DoubleInfo r0 = (javassist.bytecode.DoubleInfo) r0
            double r0 = r0.value
            r1 = r5
            double r1 = r1.value
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int getTag() {
            r2 = this;
            r0 = 6
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int copy(javassist.bytecode.ConstPool r5, javassist.bytecode.ConstPool r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r4 = this;
            r0 = r6
            r1 = r4
            double r1 = r1.value
            int r0 = r0.addDoubleInfo(r1)
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public void write(java.io.DataOutputStream r5) throws java.io.IOException {
            r4 = this;
            r0 = r5
            r1 = 6
            r0.writeByte(r1)
            r0 = r5
            r1 = r4
            double r1 = r1.value
            r0.writeDouble(r1)
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public void print(java.io.PrintWriter r5) {
            r4 = this;
            r0 = r5
            java.lang.String r1 = "Double "
            r0.print(r1)
            r0 = r5
            r1 = r4
            double r1 = r1.value
            r0.println(r1)
            return
    }
}
