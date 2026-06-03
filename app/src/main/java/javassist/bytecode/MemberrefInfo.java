package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/MemberrefInfo.class */
abstract class MemberrefInfo extends javassist.bytecode.ConstInfo {
    int classIndex;
    int nameAndTypeIndex;

    public MemberrefInfo(int r4, int r5, int r6) {
            r3 = this;
            r0 = r3
            r1 = r6
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.classIndex = r1
            r0 = r3
            r1 = r5
            r0.nameAndTypeIndex = r1
            return
    }

    public MemberrefInfo(java.io.DataInputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            int r1 = r1.readUnsignedShort()
            r0.classIndex = r1
            r0 = r3
            r1 = r4
            int r1 = r1.readUnsignedShort()
            r0.nameAndTypeIndex = r1
            return
    }

    public int hashCode() {
            r3 = this;
            r0 = r3
            int r0 = r0.classIndex
            r1 = 16
            int r0 = r0 << r1
            r1 = r3
            int r1 = r1.nameAndTypeIndex
            r0 = r0 ^ r1
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof javassist.bytecode.MemberrefInfo
            if (r0 == 0) goto L33
            r0 = r4
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.classIndex
            r1 = r3
            int r1 = r1.classIndex
            if (r0 != r1) goto L31
            r0 = r5
            int r0 = r0.nameAndTypeIndex
            r1 = r3
            int r1 = r1.nameAndTypeIndex
            if (r0 != r1) goto L31
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r1 = r3
            java.lang.Class r1 = r1.getClass()
            if (r0 != r1) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
        L33:
            r0 = 0
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int copy(javassist.bytecode.ConstPool r6, javassist.bytecode.ConstPool r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r5 = this;
            r0 = r6
            r1 = r5
            int r1 = r1.classIndex
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            r1 = r6
            r2 = r7
            r3 = r8
            int r0 = r0.copy(r1, r2, r3)
            r9 = r0
            r0 = r6
            r1 = r5
            int r1 = r1.nameAndTypeIndex
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            r1 = r6
            r2 = r7
            r3 = r8
            int r0 = r0.copy(r1, r2, r3)
            r10 = r0
            r0 = r5
            r1 = r7
            r2 = r9
            r3 = r10
            int r0 = r0.copy2(r1, r2, r3)
            return r0
    }

    protected abstract int copy2(javassist.bytecode.ConstPool r1, int r2, int r3);

    @Override // javassist.bytecode.ConstInfo
    public void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.getTag()
            r0.writeByte(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.classIndex
            r0.writeShort(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.nameAndTypeIndex
            r0.writeShort(r1)
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public void print(java.io.PrintWriter r5) {
            r4 = this;
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r4
            java.lang.String r2 = r2.getTagName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " #"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.classIndex
            r0.print(r1)
            r0 = r5
            java.lang.String r1 = ", name&type #"
            r0.print(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.nameAndTypeIndex
            r0.println(r1)
            return
    }

    public abstract java.lang.String getTagName();
}
