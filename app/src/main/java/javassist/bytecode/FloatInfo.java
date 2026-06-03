package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/FloatInfo.class */
class FloatInfo extends javassist.bytecode.ConstInfo {
    static final int tag = 4;
    float value;

    public FloatInfo(float r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.value = r1
            return
    }

    public FloatInfo(java.io.DataInputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            float r1 = r1.readFloat()
            r0.value = r1
            return
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            float r0 = r0.value
            int r0 = java.lang.Float.floatToIntBits(r0)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof javassist.bytecode.FloatInfo
            if (r0 == 0) goto L1a
            r0 = r4
            javassist.bytecode.FloatInfo r0 = (javassist.bytecode.FloatInfo) r0
            float r0 = r0.value
            r1 = r3
            float r1 = r1.value
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
            r0 = 4
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int copy(javassist.bytecode.ConstPool r4, javassist.bytecode.ConstPool r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            r3 = this;
            r0 = r5
            r1 = r3
            float r1 = r1.value
            int r0 = r0.addFloatInfo(r1)
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = 4
            r0.writeByte(r1)
            r0 = r4
            r1 = r3
            float r1 = r1.value
            r0.writeFloat(r1)
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public void print(java.io.PrintWriter r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "Float "
            r0.print(r1)
            r0 = r4
            r1 = r3
            float r1 = r1.value
            r0.println(r1)
            return
    }
}
