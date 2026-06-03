package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/NameAndTypeInfo.class */
class NameAndTypeInfo extends javassist.bytecode.ConstInfo {
    static final int tag = 12;
    int memberName;
    int typeDescriptor;

    public NameAndTypeInfo(int r4, int r5, int r6) {
            r3 = this;
            r0 = r3
            r1 = r6
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.memberName = r1
            r0 = r3
            r1 = r5
            r0.typeDescriptor = r1
            return
    }

    public NameAndTypeInfo(java.io.DataInputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            int r1 = r1.readUnsignedShort()
            r0.memberName = r1
            r0 = r3
            r1 = r4
            int r1 = r1.readUnsignedShort()
            r0.typeDescriptor = r1
            return
    }

    public int hashCode() {
            r3 = this;
            r0 = r3
            int r0 = r0.memberName
            r1 = 16
            int r0 = r0 << r1
            r1 = r3
            int r1 = r1.typeDescriptor
            r0 = r0 ^ r1
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof javassist.bytecode.NameAndTypeInfo
            if (r0 == 0) goto L28
            r0 = r4
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.memberName
            r1 = r3
            int r1 = r1.memberName
            if (r0 != r1) goto L26
            r0 = r5
            int r0 = r0.typeDescriptor
            r1 = r3
            int r1 = r1.typeDescriptor
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
            r0 = 12
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public void renameClass(javassist.bytecode.ConstPool r5, java.lang.String r6, java.lang.String r7, java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> r8) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.typeDescriptor
            java.lang.String r0 = r0.getUtf8Info(r1)
            r9 = r0
            r0 = r9
            r1 = r6
            r2 = r7
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1, r2)
            r10 = r0
            r0 = r9
            r1 = r10
            if (r0 == r1) goto L49
            r0 = r8
            if (r0 != 0) goto L2c
            r0 = r4
            r1 = r5
            r2 = r10
            int r1 = r1.addUtf8Info(r2)
            r0.typeDescriptor = r1
            goto L49
        L2c:
            r0 = r8
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)
            r0 = r4
            r1 = r5
            r2 = r10
            int r1 = r1.addUtf8Info(r2)
            r0.typeDescriptor = r1
            r0 = r8
            r1 = r4
            r2 = r4
            java.lang.Object r0 = r0.put(r1, r2)
        L49:
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public void renameClass(javassist.bytecode.ConstPool r5, java.util.Map<java.lang.String, java.lang.String> r6, java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> r7) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.typeDescriptor
            java.lang.String r0 = r0.getUtf8Info(r1)
            r8 = r0
            r0 = r8
            r1 = r6
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
            r9 = r0
            r0 = r8
            r1 = r9
            if (r0 == r1) goto L45
            r0 = r7
            if (r0 != 0) goto L2a
            r0 = r4
            r1 = r5
            r2 = r9
            int r1 = r1.addUtf8Info(r2)
            r0.typeDescriptor = r1
            goto L45
        L2a:
            r0 = r7
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)
            r0 = r4
            r1 = r5
            r2 = r9
            int r1 = r1.addUtf8Info(r2)
            r0.typeDescriptor = r1
            r0 = r7
            r1 = r4
            r2 = r4
            java.lang.Object r0 = r0.put(r1, r2)
        L45:
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public int copy(javassist.bytecode.ConstPool r6, javassist.bytecode.ConstPool r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r5 = this;
            r0 = r6
            r1 = r5
            int r1 = r1.memberName
            java.lang.String r0 = r0.getUtf8Info(r1)
            r9 = r0
            r0 = r6
            r1 = r5
            int r1 = r1.typeDescriptor
            java.lang.String r0 = r0.getUtf8Info(r1)
            r10 = r0
            r0 = r10
            r1 = r8
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
            r10 = r0
            r0 = r7
            r1 = r7
            r2 = r9
            int r1 = r1.addUtf8Info(r2)
            r2 = r7
            r3 = r10
            int r2 = r2.addUtf8Info(r3)
            int r0 = r0.addNameAndTypeInfo(r1, r2)
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = 12
            r0.writeByte(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.memberName
            r0.writeShort(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.typeDescriptor
            r0.writeShort(r1)
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public void print(java.io.PrintWriter r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "NameAndType #"
            r0.print(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.memberName
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = ", type #"
            r0.print(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.typeDescriptor
            r0.println(r1)
            return
    }
}
