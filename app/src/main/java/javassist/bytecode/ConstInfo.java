package javassist.bytecode;

/* JADX INFO: compiled from: ConstPool.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ConstInfo.class */
abstract class ConstInfo {
    int index;

    public ConstInfo(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.index = r1
            return
    }

    public abstract int getTag();

    public java.lang.String getClassName(javassist.bytecode.ConstPool r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public void renameClass(javassist.bytecode.ConstPool r2, java.lang.String r3, java.lang.String r4, java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> r5) {
            r1 = this;
            return
    }

    public void renameClass(javassist.bytecode.ConstPool r2, java.util.Map<java.lang.String, java.lang.String> r3, java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> r4) {
            r1 = this;
            return
    }

    public abstract int copy(javassist.bytecode.ConstPool r1, javassist.bytecode.ConstPool r2, java.util.Map<java.lang.String, java.lang.String> r3);

    public abstract void write(java.io.DataOutputStream r1) throws java.io.IOException;

    public abstract void print(java.io.PrintWriter r1);

    public java.lang.String toString() {
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = r0
            r1.<init>()
            r5 = r0
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r4
            r1 = r6
            r0.print(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }
}
