package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/FieldrefInfo.class */
class FieldrefInfo extends javassist.bytecode.MemberrefInfo {
    static final int tag = 9;

    public FieldrefInfo(int r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public FieldrefInfo(java.io.DataInputStream r5, int r6) throws java.io.IOException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public int getTag() {
            r2 = this;
            r0 = 9
            return r0
    }

    @Override // javassist.bytecode.MemberrefInfo
    public java.lang.String getTagName() {
            r2 = this;
            java.lang.String r0 = "Field"
            return r0
    }

    @Override // javassist.bytecode.MemberrefInfo
    protected int copy2(javassist.bytecode.ConstPool r5, int r6, int r7) {
            r4 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = r0.addFieldrefInfo(r1, r2)
            return r0
    }
}
