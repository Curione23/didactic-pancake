package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StringInfo.class */
class StringInfo extends javassist.bytecode.ConstInfo {
    static final int tag = 8;
    int string;

    public StringInfo(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.string = r1
            return
    }

    public StringInfo(java.io.DataInputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            int r1 = r1.readUnsignedShort()
            r0.string = r1
            return
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            int r0 = r0.string
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof javassist.bytecode.StringInfo
            if (r0 == 0) goto L19
            r0 = r4
            javassist.bytecode.StringInfo r0 = (javassist.bytecode.StringInfo) r0
            int r0 = r0.string
            r1 = r3
            int r1 = r1.string
            if (r0 != r1) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int getTag() {
            r2 = this;
            r0 = 8
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int copy(javassist.bytecode.ConstPool r5, javassist.bytecode.ConstPool r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r4 = this;
            r0 = r6
            r1 = r5
            r2 = r4
            int r2 = r2.string
            java.lang.String r1 = r1.getUtf8Info(r2)
            int r0 = r0.addStringInfo(r1)
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = 8
            r0.writeByte(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.string
            r0.writeShort(r1)
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public void print(java.io.PrintWriter r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "String #"
            r0.print(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.string
            r0.println(r1)
            return
    }
}
