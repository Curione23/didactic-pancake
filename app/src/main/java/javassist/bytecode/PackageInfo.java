package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/PackageInfo.class */
class PackageInfo extends javassist.bytecode.ConstInfo {
    static final int tag = 20;
    int name;

    public PackageInfo(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.name = r1
            return
    }

    public PackageInfo(java.io.DataInputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            int r1 = r1.readUnsignedShort()
            r0.name = r1
            return
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            int r0 = r0.name
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof javassist.bytecode.PackageInfo
            if (r0 == 0) goto L19
            r0 = r4
            javassist.bytecode.PackageInfo r0 = (javassist.bytecode.PackageInfo) r0
            int r0 = r0.name
            r1 = r3
            int r1 = r1.name
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
            r0 = 20
            return r0
    }

    public java.lang.String getPackageName(javassist.bytecode.ConstPool r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int copy(javassist.bytecode.ConstPool r4, javassist.bytecode.ConstPool r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = r0.addUtf8Info(r1)
            r8 = r0
            r0 = r5
            r1 = r8
            int r0 = r0.addModuleInfo(r1)
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = 20
            r0.writeByte(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.name
            r0.writeShort(r1)
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public void print(java.io.PrintWriter r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "Package #"
            r0.print(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.name
            r0.println(r1)
            return
    }
}
