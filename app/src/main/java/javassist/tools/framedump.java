package javassist.tools;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/framedump.class */
public class framedump {
    private framedump() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r4) throws java.lang.Exception {
            r0 = r4
            int r0 = r0.length
            r1 = 1
            if (r0 == r1) goto Lf
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Usage: java javassist.tools.framedump <fully-qualified class name>"
            r0.println(r1)
            return
        Lf:
            javassist.ClassPool r0 = javassist.ClassPool.getDefault()
            r5 = r0
            r0 = r5
            r1 = r4
            r2 = 0
            r1 = r1[r2]
            javassist.CtClass r0 = r0.get(r1)
            r6 = r0
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Frame Dump of "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r6
            java.io.PrintStream r1 = java.lang.System.out
            javassist.bytecode.analysis.FramePrinter.print(r0, r1)
            return
    }
}
