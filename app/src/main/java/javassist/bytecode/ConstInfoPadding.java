package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ConstInfoPadding.class */
class ConstInfoPadding extends javassist.bytecode.ConstInfo {
    public ConstInfoPadding(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public int getTag() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public int copy(javassist.bytecode.ConstPool r3, javassist.bytecode.ConstPool r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            r2 = this;
            r0 = r4
            int r0 = r0.addConstInfoPadding()
            return r0
    }

    @Override // javassist.bytecode.ConstInfo
    public void write(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            return
    }

    @Override // javassist.bytecode.ConstInfo
    public void print(java.io.PrintWriter r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "padding"
            r0.println(r1)
            return
    }
}
