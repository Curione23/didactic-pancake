package javassist.tools;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/Dump.class */
public class Dump {
    private Dump() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r7) throws java.lang.Exception {
            r0 = r7
            int r0 = r0.length
            r1 = 1
            if (r0 == r1) goto Lf
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Usage: java Dump <class file name>"
            r0.println(r1)
            return
        Lf:
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r1 = r0
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r3 = r2
            r4 = r7
            r5 = 0
            r4 = r4[r5]
            r3.<init>(r4)
            r1.<init>(r2)
            r8 = r0
            javassist.bytecode.ClassFile r0 = new javassist.bytecode.ClassFile
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r9 = r0
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r1 = r0
            java.io.PrintStream r2 = java.lang.System.out
            r3 = 1
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "*** constant pool ***"
            r0.println(r1)
            r0 = r9
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r10
            r0.print(r1)
            r0 = r10
            r0.println()
            r0 = r10
            java.lang.String r1 = "*** members ***"
            r0.println(r1)
            r0 = r9
            r1 = r10
            javassist.bytecode.ClassFilePrinter.print(r0, r1)
            return
    }
}
