package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/InvokeDynamicInfo.class */
class InvokeDynamicInfo extends javassist.bytecode.ConstInfo {
    static final int tag = 18;
    int bootstrap;
    int nameAndType;

    public InvokeDynamicInfo(int r4, int r5, int r6) {
            r3 = this;
            r0 = r3
            r1 = r6
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.bootstrap = r1
            r0 = r3
            r1 = r5
            r0.nameAndType = r1
            return
    }

    public InvokeDynamicInfo(java.io.DataInputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            int r1 = r1.readUnsignedShort()
            r0.bootstrap = r1
            r0 = r3
            r1 = r4
            int r1 = r1.readUnsignedShort()
            r0.nameAndType = r1
            return
    }

    public int hashCode() {
            r3 = this;
            r0 = r3
            int r0 = r0.bootstrap
            r1 = 16
            int r0 = r0 << r1
            r1 = r3
            int r1 = r1.nameAndType
            r0 = r0 ^ r1
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof javassist.bytecode.InvokeDynamicInfo
            if (r0 == 0) goto L28
            r0 = r4
            javassist.bytecode.InvokeDynamicInfo r0 = (javassist.bytecode.InvokeDynamicInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.bootstrap
            r1 = r3
            int r1 = r1.bootstrap
            if (r0 != r1) goto L26
            r0 = r5
            int r0 = r0.nameAndType
            r1 = r3
            int r1 = r1.nameAndType
            if (r0 != r1) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        L28:
            r0 = 0
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int getTag() {
            r2 = this;
            r0 = 18
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int copy(javassist.bytecode.ConstPool r8, javassist.bytecode.ConstPool r9, java.util.Map<java.lang.String, java.lang.String> r10) {
            r7 = this;
            r0 = r9
            r1 = r7
            int r1 = r1.bootstrap
            r2 = r8
            r3 = r7
            int r3 = r3.nameAndType
            javassist.bytecode.ConstInfo r2 = r2.getItem(r3)
            r3 = r8
            r4 = r9
            r5 = r10
            int r2 = r2.copy(r3, r4, r5)
            int r0 = r0.addInvokeDynamicInfo(r1, r2)
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = 18
            r0.writeByte(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.bootstrap
            r0.writeShort(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.nameAndType
            r0.writeShort(r1)
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public void print(java.io.PrintWriter r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "InvokeDynamic #"
            r0.print(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.bootstrap
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = ", name&type #"
            r0.print(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.nameAndType
            r0.println(r1)
            return
    }
}
