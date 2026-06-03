package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/Utf8Info.class */
class Utf8Info extends javassist.bytecode.ConstInfo {
    static final int tag = 1;
    java.lang.String string;

    public Utf8Info(java.lang.String r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.string = r1
            return
    }

    public Utf8Info(java.io.DataInputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.readUTF()
            r0.string = r1
            return
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.string
            int r0 = r0.hashCode()
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof javassist.bytecode.Utf8Info
            if (r0 == 0) goto L1c
            r0 = r4
            javassist.bytecode.Utf8Info r0 = (javassist.bytecode.Utf8Info) r0
            java.lang.String r0 = r0.string
            r1 = r3
            java.lang.String r1 = r1.string
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int getTag() {
            r2 = this;
            r0 = 1
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int copy(javassist.bytecode.ConstPool r4, javassist.bytecode.ConstPool r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            r3 = this;
            r0 = r5
            r1 = r3
            java.lang.String r1 = r1.string
            int r0 = r0.addUtf8Info(r1)
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = 1
            r0.writeByte(r1)
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.string
            r0.writeUTF(r1)
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public void print(java.io.PrintWriter r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "UTF8 \""
            r0.print(r1)
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.string
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = "\""
            r0.println(r1)
            return
    }
}
