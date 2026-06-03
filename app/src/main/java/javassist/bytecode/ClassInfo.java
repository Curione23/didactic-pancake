package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ClassInfo.class */
class ClassInfo extends javassist.bytecode.ConstInfo {
    static final int tag = 7;
    int name;

    public ClassInfo(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.name = r1
            return
    }

    public ClassInfo(java.io.DataInputStream r4, int r5) throws java.io.IOException {
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
            boolean r0 = r0 instanceof javassist.bytecode.ClassInfo
            if (r0 == 0) goto L19
            r0 = r4
            javassist.bytecode.ClassInfo r0 = (javassist.bytecode.ClassInfo) r0
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
            r0 = 7
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public java.lang.String getClassName(javassist.bytecode.ConstPool r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public void renameClass(javassist.bytecode.ConstPool r5, java.lang.String r6, java.lang.String r7, java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> r8) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r9
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            r0 = r7
            r10 = r0
            goto L3b
        L1c:
            r0 = r9
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L3b
            r0 = r9
            r1 = r6
            r2 = r7
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1, r2)
            r11 = r0
            r0 = r9
            r1 = r11
            if (r0 == r1) goto L3b
            r0 = r11
            r10 = r0
        L3b:
            r0 = r10
            if (r0 == 0) goto L6f
            r0 = r8
            if (r0 != 0) goto L52
            r0 = r4
            r1 = r5
            r2 = r10
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            goto L6f
        L52:
            r0 = r8
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)
            r0 = r4
            r1 = r5
            r2 = r10
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            r0 = r8
            r1 = r4
            r2 = r4
            java.lang.Object r0 = r0.put(r1, r2)
        L6f:
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public void renameClass(javassist.bytecode.ConstPool r5, java.util.Map<java.lang.String, java.lang.String> r6, java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> r7) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L2e
            r0 = r8
            r1 = r6
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
            r10 = r0
            r0 = r8
            r1 = r10
            if (r0 == r1) goto L2b
            r0 = r10
            r9 = r0
        L2b:
            goto L4e
        L2e:
            r0 = r6
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L4e
            r0 = r10
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            r0 = r10
            r9 = r0
        L4e:
            r0 = r9
            if (r0 == 0) goto L7f
            r0 = r7
            if (r0 != 0) goto L64
            r0 = r4
            r1 = r5
            r2 = r9
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            goto L7f
        L64:
            r0 = r7
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)
            r0 = r4
            r1 = r5
            r2 = r9
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            r0 = r7
            r1 = r4
            r2 = r4
            java.lang.Object r0 = r0.put(r1, r2)
        L7f:
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public int copy(javassist.bytecode.ConstPool r4, javassist.bytecode.ConstPool r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L24
            r0 = r6
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L24
            r0 = r8
            r7 = r0
        L24:
            r0 = r5
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = 7
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
            java.lang.String r1 = "Class #"
            r0.print(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.name
            r0.println(r1)
            return
    }
}
